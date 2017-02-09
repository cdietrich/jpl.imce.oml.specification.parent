/*
 * Copyright 2016 California Institute of Technology ("Caltech").
 * U.S. Government sponsorship acknowledged.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * License Terms
 */
package gov.nasa.jpl.imce.oml.specification.scala.generators

import java.io.File
import java.io.FileOutputStream
import java.nio.file.Paths
import java.util.Map
import jpl.imce.oml.specification.ecore.OMLPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.xcore.mappings.XcoreMapper
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.XFeatureCall

class OMLSpecificationResolverLibraryGenerator extends OMLUtilities {
	
	static def main(String[] args) {
		if (1 != args.length) {
			System.err.println("usage: <dir> where <dir> is the directory of the /gov.nasa.jpl.imce.oml.specification.tables project")
			System.exit(1)
		}
		
		new OMLSpecificationResolverLibraryGenerator().generate(args.get(0))	
	}
	
	def generate(String targetDir) {
		val omlXcore = "/model/OMLSpecification.xcore"
		val set = createXcoreResourceSet(
			[Map<URI,URI> uriMap | 
			uriMap.put(
				URI.createURI("platform:/resource/jpl.imce.oml.specification.ecore"+omlXcore),
				URI.createURI(OMLPackage.getResource(omlXcore).toURI.toString))
				])
		
		val sourceURI = URI.createPlatformResourceURI("/jpl.imce.oml.specification.ecore"+omlXcore, false)
      	val sourceResource = set.getResource(sourceURI, true)
      	EcoreUtil.resolveAll(set)
      	val ePackage = sourceResource.getContents().filter(EPackage).get(0)
      	
		val bundlePath = Paths.get(targetDir)
		val targetFolder = "src/main/scala/gov/nasa/jpl/imce/oml/specification/resolver/impl"
		val targetPath = bundlePath.resolve(targetFolder)
		targetPath.toFile.mkdirs	
		
      	generate(ePackage, targetPath.toAbsolutePath.toString)	      	
	}
	
	def generate(EPackage ePackage, String targetFolder) {
		val factoryFile = new FileOutputStream(new File(targetFolder + File::separator + "OMLResolvedFactoryImpl.scala"))
		factoryFile.write(generateFactoryFile(ePackage, "gov.nasa.jpl.imce.oml.specification.resolver.impl").bytes)
		for(eClass : ePackage.EClassifiers.filter(EClass).filter[isFunctionalAPIClass])  {
			val classFile = new FileOutputStream(new File(targetFolder + File::separator + eClass.name + ".scala"))
			classFile.write(generateClassFile(eClass).bytes)
		}
	}
	
	def String generateFactoryFile(EPackage ePackage, String packageQName) '''
		«copyright»
		package «packageQName»
		
		import gov.nasa.jpl.imce.oml.specification._
		
		case class OMLResolvedFactoryImpl() extends resolver.api.OMLResolvedFactory {
			
		  «FOR eClass: ePackage.FunctionalAPIClasses.filter[!isAbstract].sortBy[name]»
		  // «eClass.name»
		  
		  def create«eClass.name»
		  «FOR attr : eClass.getSortedAttributeSignature BEFORE "(" SEPARATOR ",\n " AFTER ")"» «attr.name»: «attr.queryResolverType»«ENDFOR»
		  : resolver.api.«eClass.name»
		  = resolver.impl.«eClass.name»«FOR attr : eClass.getSortedAttributeSignature BEFORE "(\n" SEPARATOR ",\n" AFTER " )"»  «attr.name»«ENDFOR»
		  
		  «FOR attr: eClass.lookupCopyConstructorArguments»
		  def copy«eClass.name»_«attr.name»
		  ( that: resolver.api.«eClass.name»,
		    «attr.name»: «attr.queryResolverType» )
		  : resolver.api.«eClass.name»
		  = that match {
		  	case x: resolver.impl.«eClass.name» =>
		  	  x.copy(«attr.name» = «attr.name»)
		  }
		  
		  «ENDFOR»
		  «ENDFOR»
		}
	'''
	
	def String generateClassFile(EClass eClass) '''
		«copyright»
		package gov.nasa.jpl.imce.oml.specification.resolver.impl
		
		import gov.nasa.jpl.imce.oml.specification._
		
		«IF (eClass.abstract)»trait «ELSE»case class «ENDIF»«eClass.classDeclaration»
		{
		«FOR op : eClass.ScalaOperations»  «op.doc("  ")»«op.queryResolverName»
		  : «op.queryResolverType»
		  = «op.queryBody»
		  
		«ENDFOR»		  
		«IF (eClass.isSpecializationOfRootClass)»
		
		  override def canEqual(that: scala.Any): scala.Boolean = that match {
		  	case _: «eClass.name» => true
		  	case _ => false
		  }
		«ENDIF»
		«IF (!eClass.abstract)»
		
		  override val hashCode
		  : scala.Int
		  = «FOR keyFeature: eClass.getSortedAttributeSignature BEFORE "(" SEPARATOR ", " AFTER ").##"»«keyFeature.name»«ENDFOR»
		
		  override def equals(other: scala.Any): scala.Boolean = other match {
			  case that: «eClass.name» =>
			    (that canEqual this) &&
			    «FOR keyFeature: eClass.getSortedAttributeSignature SEPARATOR " &&\n"»(this.«keyFeature.name» == that.«keyFeature.name»)«ENDFOR»
		
			  case _ =>
			    false
		  }
		«ENDIF»
		}
	'''
	
	/*
	 * Transform an XText base XExpression to an equivalent Scala expression in concrete syntax (String).
	 */
	static def String toScala(XExpression exp) {
		val result = switch exp {
			XFeatureCall: {
			    val n = NodeModelUtils.findActualNodeFor(exp)
			    val s = NodeModelUtils.getTokenText(n)
				s
			}
				
			//XMemberFeatureCall:
			//	exp.actualReceiver.toScala+"."+exp.feature.simpleName
			// in xcore: "a.b", then: "a.getB"
			// it is difficult to retrieve "a.b"
			 
			default:
				exp.toString + "/* default */"
		}
		result
	}
	
	static def String classDeclaration(EClass eClass) '''
		«eClass.name»«IF (!eClass.abstract)» private[impl] 
		(
		 «FOR attr : eClass.getSortedAttributeSignature SEPARATOR ","»
		 override val «attr.name»: «attr.queryResolverType»
		 «ENDFOR»
		)«ENDIF»
		extends resolver.api.«eClass.name»
		«FOR parent : eClass.ESuperTypes BEFORE "  with " SEPARATOR "\n  with "»«parent.name»«ENDFOR»
	'''
	
	static def Iterable<EStructuralFeature> getSortedAttributeSignature(EClass eClass) {
		eClass
		.selfAndAllSupertypes
		.map[APIStructuralFeatures]
		.flatten
		.sortWith(new OMLFeatureCompare())
	}
	
	static def Boolean isAttributeOrReferenceOrContainer(EStructuralFeature f) {
		switch f {
			EReference: 
				! f.containment
			default: true
		}
	}
	
	static def String queryName(EStructuralFeature feature) {
		feature.name
	}
	
	static def Iterable<EStructuralFeature> lookupCopyConstructorArguments(EClass eClass) {
		eClass.getSortedAttributeSignature.filter[isCopyConstructorArgument]
	}
	
	static def Boolean isCopyConstructorArgument(EStructuralFeature attribute) {
		null !== attribute.getEAnnotation("http://imce.jpl.nasa.gov/oml/CopyConstructor")
	}
	
	static def Iterable<EStructuralFeature> APIStructuralFeatures(EClass eClass) {
		eClass.EStructuralFeatures.filter[isAPI]
	}
     
	static def Iterable<EClass> FunctionalAPIClasses(EPackage ePkg) {
		ePkg.EClassifiers.filter(EClass).filter[isFunctionalAPIClass]
	}
	
    static def Boolean isFunctionalAPIClass(EClass c) {
    	null === c.getEAnnotation("http://imce.jpl.nasa.gov/oml/NotFunctionalAPI")
    }
    
	static def Boolean isRootHierarchyClass(EClass eClass) {
		eClass.isAbstract && eClass.ESuperTypes.isEmpty && !eClass.orderingKeys.isEmpty
	}
	
	static def Boolean isSpecializationOfRootClass(EClass eClass) {
		!eClass.ESuperTypes.isEmpty && eClass.selfAndAllSupertypes.exists[isRootHierarchyClass]
	}
	
	static def Iterable<EOperation> APIOperations(EClass eClass) {
		eClass.EOperations.filter[isAPI]
	}
    
	static def Iterable<EOperation> ScalaOperations(EClass eClass) {
		eClass.EOperations.filter(op | op.isScala || null !== op.xExpressions) 
	}
    
    static def String scalaAnnotation(EOperation op) {
    	op.getEAnnotation("http://imce.jpl.nasa.gov/oml/Scala")?.details?.get("code")
    }
    
    static def Iterable<XExpression> xExpressions(EOperation op) {
    	(new XcoreMapper()).getXOperation(op)?.body?.expressions
    }
		
	static def String queryBody(EOperation op) {
		val scalaCode = op.scalaAnnotation
		val xExpressions = op.xExpressions
		if (null !== scalaCode)
'''{
  «scalaCode»
}'''
		else if (null !== xExpressions)
			'''«FOR exp: xExpressions BEFORE "{\n  " SEPARATOR "\n  " AFTER "\n}"»«exp.toScala»«ENDFOR»'''
	}
    
}