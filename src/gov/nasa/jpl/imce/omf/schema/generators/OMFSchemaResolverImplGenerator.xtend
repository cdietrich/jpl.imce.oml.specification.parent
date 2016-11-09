package gov.nasa.jpl.imce.omf.schema.generators

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
//import org.eclipse.xtext.xbase.XMemberFeatureCall

class OMFSchemaResolverImplGenerator {
	
	def generate() {
		val sourceFile = "/gov.nasa.jpl.imce.omf.schema.specification/model/OMFSchema.xcore"
		val targetBundle = "jpl.omf.schema.resolver"
		
		val set = new XtextResourceSet();
		set.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap(true));
		set.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
      	val sourceURI = URI.createPlatformResourceURI(sourceFile, false)
      	val sourceResource = set.getResource(sourceURI, true)
      	val ePackage = sourceResource.getContents().filter(EPackage).get(0)
      	
		val targetFolder = "/src/main/scala/gov/nasa/jpl/imce/omf/schema/resolver/impl"
		val targetURL = Platform.getBundle(targetBundle).getEntry(targetFolder)
		val folder = FileLocator.toFileURL(targetURL)
      	generate(ePackage, folder.path)	      	
	}
	
	def generate(EPackage ePackage, String targetFolder) {
		for(eClass : ePackage.EClassifiers.filter(EClass).filter(ec | ! ec.hasCustomImplementation))  {
			val classFile = new FileOutputStream(new File(targetFolder + File::separator + eClass.name + ".scala"))
			classFile.write(generateClassFile(eClass).bytes)
		}
	}
	
	def String generateClassFile(EClass eClass) '''
		«copyright»
		package gov.nasa.jpl.imce.omf.schema.resolver.impl
		
		import gov.nasa.jpl.imce.omf.schema._
		
		«IF (eClass.abstract)»trait «ELSE»case class «ENDIF»«eClass.classDeclaration»
		{
		«FOR op : eClass.ScalaOperations BEFORE "\n  " SEPARATOR "\n  " AFTER "\n"»«op.doc("  ")»«op.queryName»
		  : «op.queryType»
		  = «op.queryBody»
		  
		«ENDFOR»
		}
	'''
	
	/*
	 * Transform an XText base XExpression to an equivalent Scala expression in concrete syntax (String).
	 */
	static def String toScala(XExpression exp) {
		switch exp {
			XFeatureCall:
				exp.toString
				
				
			//XMemberFeatureCall:
			//	exp.actualReceiver.toScala+"."+exp.feature.simpleName
			// in xcore: "a.b", then: "a.getB"
			// it is difficult to retrieve "a.b"
			 
			default:
				exp.toString + "/* default */"
		}
	}
	
	static def String classDeclaration(EClass eClass) '''
		«eClass.name»«IF (!eClass.abstract)» private[impl] 
		(
		 «FOR attr : eClass.getSortedAttributes SEPARATOR ","»
		 override val «attr.name»: «attr.queryType»
		 «ENDFOR»
		)«ENDIF»
		extends resolver.api.«eClass.name»
		«FOR parent : eClass.ESuperTypes BEFORE "  with " SEPARATOR "\n  with "»«parent.name»«ENDFOR»
	'''
	
	static def Iterable<EStructuralFeature> getSortedAttributes(EClass eClass) {
		eClass
		.selfAndAllSupertypes
		.map[APIStructuralFeatures]
		.flatten
		.filter([EStructuralFeature f | isAPI(f)])
		.sortWith(new OMFFeatureCompare())
	}
	
	static def Iterable<EClass> selfAndAllSupertypes(EClass eClass) {
		val parents = new ArrayList(eClass.EAllSuperTypes)
		parents.add(eClass)
		parents
	}
	
	static def String columnName(EStructuralFeature feature) {
		if (feature instanceof EReference) feature.name+"UUID" else feature.name
	}
	
	static class OMFFeatureCompare implements Comparator<EStructuralFeature> {
		
		val knownAttributes = #["graphUUID", "uuid", "kind", "isAbstract", "asymmetric", "essential", "functional", "inverseEssential", "inverseFunctional", "irreflexive", "reflexive", "symmetric", "transitive", "name", "iri"]
		override compare(EStructuralFeature o1, EStructuralFeature o2) {
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
			case "IRI": "gov.nasa.jpl.imce.omf.schema.tables.IRI"
			case "Language": "gov.nasa.jpl.imce.omf.schema.tables.Language"
			case "LexicalNumber": "gov.nasa.jpl.imce.omf.schema.tables.LexicalNumber"
			case "LexicalTime": "gov.nasa.jpl.imce.omf.schema.tables.LexicalTime"
			case "LexicalValue": "gov.nasa.jpl.imce.omf.schema.tables.LexicalValue"
			case "LocalName": "gov.nasa.jpl.imce.omf.schema.tables.LocalName"
			case "Pattern": "gov.nasa.jpl.imce.omf.schema.tables.Pattern"
			case "UUID": "java.util.UUID"
			case "TerminologyGraphKind": "gov.nasa.jpl.imce.omf.schema.tables.TerminologyGraphKind"
			default: type.name
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
						val ann = feature.getEAnnotation("http://imce.jpl.nasa.gov/omf/Collection")?.details
						switch ann?.get("kind") ?: "" {
						case "Map": {
							val key=ann.get("key")
							"scala.collection.immutable.Map["+key+", resolver.api."+type.name+"]"				
						}
						case "Set": 
							"scala.collection.immutable.Set[_ <: resolver.api."+type.name+"]"		
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
	
	static def String queryName(EOperation op) {
		val kind = if (op.EParameters.empty) "val" else "def"
		val decl = if (null != op.getEAnnotation("http://imce.jpl.nasa.gov/omf/Override")) "override "+kind else kind
		val args = '''«FOR p : op.EParameters BEFORE "\n  (" SEPARATOR ",\n  " AFTER "\n  )"»«p.name»: «p.queryType»«ENDFOR»'''
		decl+" "+op.name+args
	}
	
	static def String queryType(EOperation op) {
		val ann = op.getEAnnotation("http://imce.jpl.nasa.gov/omf/Collection")?.details
		switch ann?.get("kind") ?: "" {
			case "Map": {
				val key=ann.get("key")
				"scala.collection.immutable.Map["+key+", resolver.api."+op.EType.name+"]"				
			}
			case "Set": 
				"scala.collection.immutable.Set[_ <: resolver.api."+op.EType.name+"]"		
			default:
				if (0 == op.lowerBound)
					"scala.Option[resolver.api."+op.EType.name+"]"
				else
					"resolver.api."+op.EType.name
		}
	} 
	
	static def Iterable<EStructuralFeature> APIStructuralFeatures(EClass eClass) {
		eClass.EStructuralFeatures.filter[isAPI]
	}
    
	static def Iterable<EOperation> APIOperations(EClass eClass) {
		eClass.EOperations.filter[isAPI]
	}
    
	static def Iterable<EOperation> ScalaOperations(EClass eClass) {
		eClass.EOperations.filter(op | op.isScala || null != op.xExpressions) 
	}
	
    static def Boolean hasCustomImplementation(ENamedElement e) {
    	null != e.getEAnnotation("http://imce.jpl.nasa.gov/omf/CustomImplementation")
    }
    
    static def Boolean isAPI(ENamedElement e) {
    	null == e.getEAnnotation("http://imce.jpl.nasa.gov/omf/NotAPI")
    }
    
    static def Boolean isSchema(ENamedElement e) {
    	null == e.getEAnnotation("http://imce.jpl.nasa.gov/omf/NotSchema")
    }
    
    static def Boolean isScala(ENamedElement e) {
    	null != e.getEAnnotation("http://imce.jpl.nasa.gov/omf/Scala")
    }
    
    static def String scalaAnnotation(EOperation op) {
    	op.getEAnnotation("http://imce.jpl.nasa.gov/omf/Scala")?.details?.get("code")
    }
    
    static def Iterable<XExpression> xExpressions(EOperation op) {
    	(new XcoreMapper()).getXOperation(op)?.body?.expressions
    }
		
	static def String queryBody(EOperation op) {
		val scalaCode = op.scalaAnnotation
		val xExpressions = op.xExpressions
		if (null != scalaCode)
			'''{
			  «scalaCode»
			}'''
		else if (null != xExpressions)
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