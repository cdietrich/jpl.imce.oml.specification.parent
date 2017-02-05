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
import java.util.ArrayList
import java.util.Comparator
import org.eclipse.emf.common.util.URI
import org.eclipse.core.runtime.FileLocator
import org.eclipse.core.runtime.Platform
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.ETypedElement
import org.eclipse.emf.ecore.plugin.EcorePlugin
import org.eclipse.emf.ecore.xcore.mappings.XcoreMapper
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.XFeatureCall
import org.eclipse.xtext.nodemodel.util.NodeModelUtils

class OMLSpecificationResolverLibraryGenerator {
	
	def generate() {
		val sourceFile = "/jpl.imce.oml.specification.ecore/model/OMLSpecification.xcore"
		val targetBundle = "gov.nasa.jpl.imce.oml.specification.resolver"
		
		val set = new XtextResourceSet();
		set.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap(true));
		set.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
      	val sourceURI = URI.createPlatformResourceURI(sourceFile, false)
      	val sourceResource = set.getResource(sourceURI, true)
      	val ePackage = sourceResource.getContents().filter(EPackage).get(0)
      	
		val targetFolder = "/src/main/scala/gov/nasa/jpl/imce/oml/specification/resolver/impl"
		val targetURL = Platform.getBundle(targetBundle).getEntry(targetFolder)
		val folder = FileLocator.toFileURL(targetURL)
      	generate(ePackage, folder.path)	      	
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
		  «FOR attr : eClass.getSortedAttributeSignature BEFORE "(" SEPARATOR ",\n " AFTER ")"» «attr.name»: «attr.queryType»«ENDFOR»
		  : resolver.api.«eClass.name»
		  = resolver.impl.«eClass.name»«FOR attr : eClass.getSortedAttributeSignature BEFORE "(\n" SEPARATOR ",\n" AFTER " )"»  «attr.name»«ENDFOR»
		  
		  «FOR attr: eClass.lookupCopyConstructorArguments»
		  def copy«eClass.name»_«attr.name»
		  ( that: resolver.api.«eClass.name»,
		    «attr.name»: «attr.queryType» )
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
		«FOR op : eClass.ScalaOperations»  «op.doc("  ")»«op.queryName»
		  : «op.queryType»
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
		 override val «attr.name»: «attr.queryType»
		 «ENDFOR»
		)«ENDIF»
		extends resolver.api.«eClass.name»
		«FOR parent : eClass.ESuperTypes BEFORE "  with " SEPARATOR "\n  with "»«parent.name»«ENDFOR»
	'''
	
	static def Iterable<EStructuralFeature> orderingKeys(EClass eClass) {
		eClass
		.selfAndAllSupertypes
		.map[EStructuralFeatures]
		.flatten
		.filter([EStructuralFeature f | f.isAPI && null !== f.getEAnnotation("http://imce.jpl.nasa.gov/oml/IsOrderingKey")])
		.sortWith(new OMLFeatureCompare())
	} 
	
	static def Iterable<EStructuralFeature> getSortedAttributeSignature(EClass eClass) {
		eClass
		.selfAndAllSupertypes
		.map[APIStructuralFeatures]
		.flatten
		.sortWith(new OMLFeatureCompare())
	}
	
	static def Iterable<EClass> selfAndAllSupertypes(EClass eClass) {
		val parents = new ArrayList(eClass.EAllSuperTypes)
		parents.add(eClass)
		parents
	}
	
	static def String columnName(ETypedElement feature) {
		switch feature {
			case feature instanceof EReference:
				feature.name+"UUID"
			default:
				feature.name
		}
	}
	
	static class OMLFeatureCompare implements Comparator<ETypedElement> {
		
		val knownAttributes = #[
		"graphUUID", 
		"uuid", 
		"axiomUUID",
		"terminologyUUID",
		"subjectUUID",
		"propertyUUID",
		"kind", 
		"isAbstract",
		"asymmetric", 
		"essential", 
		"functional", 
		"inverseEssential", 
		"inverseFunctional", 
		"irreflexive", 
		"reflexive", 
		"symmetric", 
		"transitive", 
		"name", 
		"unreifiedPropertyName",
		"unreifiedInversePropertyName",
		"iri",
		"value"]
		override compare(ETypedElement o1, ETypedElement o2) {
			val name1 = o1.columnName
			val name2 = o2.columnName
			val i1 = knownAttributes.indexOf(name1)
			val i2 = knownAttributes.indexOf(name2)
			if (i1 > -1 && i2 > -1)
			   i1.compareTo(i2)
			else if (i1 > -1 && i2 == -1)
			   -1
			else if (i1 == -1 && i2 > -1)
			   1
			else
			   name1.compareTo(name2)   
		}
		
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
	
	static def String scalaTypeName(ETypedElement feature) {
		val type = feature.EType
		switch (type.name) {
			case "EInt": "scala.Int"
			case "EBoolean": "scala.Boolean"
			case "EString": "scala.Predef.String"
			case "IRI": "gov.nasa.jpl.imce.oml.specification.tables.IRI"
			case "Language": "gov.nasa.jpl.imce.oml.specification.tables.Language"
			case "LexicalNumber": "gov.nasa.jpl.imce.oml.specification.tables.LexicalNumber"
			case "LexicalTime": "gov.nasa.jpl.imce.oml.specification.tables.LexicalTime"
			case "LexicalValue": "gov.nasa.jpl.imce.oml.specification.tables.LexicalValue"
			case "LocalName": "gov.nasa.jpl.imce.oml.specification.tables.LocalName"
			case "Pattern": "gov.nasa.jpl.imce.oml.specification.tables.Pattern"
			case "UUID": "java.util.UUID"
			case "TerminologyGraphKind": "gov.nasa.jpl.imce.oml.specification.tables.TerminologyGraphKind"
			default: "resolver.api."+type.name
		}
	}
	
	static def String queryType(ETypedElement feature) {
		val type = feature.EType
		val scalaType = feature.scalaTypeName
		switch type {
			case type instanceof EDataType: 
				if (feature.lowerBound == 0)
		  			"scala.Option["+scalaType+"]"
	   			else
	      			scalaType
			case type instanceof EClass:
				if (feature.lowerBound == 0) {
					if (feature.upperBound == -1) {
						val ann = feature.getEAnnotation("http://imce.jpl.nasa.gov/oml/Collection")?.details
						switch ann?.get("kind") ?: "" {
						case "Map(Seq)": {
							val key=ann.get("key")
							"scala.collection.immutable.Map[resolver.api."+key+", scala.collection.immutable.Seq[resolver.api."+type.name+"]]"				
						}
						case "Map": {
							val key=ann.get("key")
							"scala.collection.immutable.Map["+key+", resolver.api."+type.name+"]"				
						}
						case "Set": 
							"scala.collection.immutable.Set[_ <: resolver.api."+type.name+"]"	
						case "SortedSet": 
							"scala.collection.immutable.SortedSet[resolver.api."+type.name+"]"		
						}	
					}
					else
						"scala.Option[resolver.api."+type.name+"]"
				}
				else
					"resolver.api."+type.name
			default:
				type.name+"//Default"
		}
	}
	
	static def Iterable<EStructuralFeature> lookupCopyConstructorArguments(EClass eClass) {
		eClass.getSortedAttributeSignature.filter[isCopyConstructorArgument]
	}
	
	static def Boolean isCopyConstructorArgument(EStructuralFeature attribute) {
		null !== attribute.getEAnnotation("http://imce.jpl.nasa.gov/oml/CopyConstructor")
	}
	
	static def String queryName(EOperation op) {
		val kind = if (op.EParameters.empty) "def" else "def"
		val decl = if (null !== op.getEAnnotation("http://imce.jpl.nasa.gov/oml/Override")) "override "+kind else kind
		val args = '''«FOR p : op.EParameters SEPARATOR ",\n  "»«p.name»: «p.queryType»«ENDFOR»'''
		decl+" "+op.name+"\n  ("+args+")"
	}
	
	static def String queryType(EOperation op) {		
		val scalaType = op.scalaTypeName
		val ann = op.getEAnnotation("http://imce.jpl.nasa.gov/oml/Collection")?.details
		switch ann?.get("kind") ?: "" {
			case "Map": {
				val key=ann.get("key")
				"scala.collection.immutable.Map["+key+", "+scalaType+"]"				
			}
			case "SortedSet": 
				"scala.collection.immutable.SortedSet["+scalaType+"]"	
			case "Set": 
				"scala.collection.immutable.Set[_ <: "+scalaType+"]"		
			default:
				if (0 == op.lowerBound)
					"scala.Option["+scalaType+"]"
				else
					scalaType
		}
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
	
    static def Boolean isAPI(ENamedElement e) {
    	null === e.getEAnnotation("http://imce.jpl.nasa.gov/oml/NotAPI")
    }
    
    static def Boolean isSchema(ENamedElement e) {
    	null === e.getEAnnotation("http://imce.jpl.nasa.gov/oml/NotSchema")
    }
    
    static def Boolean isScala(ENamedElement e) {
    	null !== e.getEAnnotation("http://imce.jpl.nasa.gov/oml/Scala")
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
	
	static def String doc(ENamedElement op, String indent) {
		val doc = op.getEAnnotation("http://www.eclipse.org/emf/2002/GenModel")?.details?.get("documentation") ?: ""
		if (doc.empty) 
		doc
		else 
		"/*\n"+indent+" * "+doc.replaceAll("\n","\n"+indent+" * ")+"\n"+indent+" */\n"+indent	
	}
	
	def copyright() '''
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
		
    '''
    
}