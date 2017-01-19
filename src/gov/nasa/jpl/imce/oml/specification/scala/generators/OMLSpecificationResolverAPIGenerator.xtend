package gov.nasa.jpl.imce.oml.specification.scala.generators

import java.io.File
import java.io.FileOutputStream
import java.util.ArrayList
import java.util.Comparator
import java.util.List
import org.eclipse.core.runtime.FileLocator
import org.eclipse.core.runtime.Platform
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.ETypedElement
import org.eclipse.emf.ecore.plugin.EcorePlugin
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet

class OMLSpecificationResolverAPIGenerator {
	
	def generate() {
		val sourceFile = "/gov.nasa.jpl.imce.oml.specification/model/OMLSpecification.xcore"
		val targetBundle = "gov.nasa.jpl.imce.oml.specification.tables"
		
		val set = new XtextResourceSet();
		set.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap(true));
		set.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
      	val sourceURI = URI.createPlatformResourceURI(sourceFile, false)
      	val sourceResource = set.getResource(sourceURI, true)
      	val ePackage = sourceResource.getContents().filter(EPackage).get(0)
      	
		val targetFolder = "/shared/src/main/scala/gov/nasa/jpl/imce/oml/specification/resolver/api"
		val targetURL = Platform.getBundle(targetBundle).getEntry(targetFolder)
		val folder = FileLocator.toFileURL(targetURL)
      	generate(ePackage, "gov.nasa.jpl.imce.oml.specification.resolver.api", folder.path)
      	      	
	}
	
	def generate(EPackage ePackage, String packageQName, String targetFolder) {
		val packageFile = new FileOutputStream(new File(targetFolder + File::separator + "package.scala"))
		packageFile.write(generatePackageFile(ePackage, packageQName).bytes)
		for(eClass : ePackage.EClassifiers.filter(EClass).filter[isAPI])  {
			val classFile = new FileOutputStream(new File(targetFolder + File::separator + eClass.name + ".scala"))
			classFile.write(generateClassFile(eClass).bytes)
		}
	}
	
	def String generatePackageFile(EPackage ePackage, String packageQName) '''
		«copyright»

		package «packageQName.substring(0, packageQName.lastIndexOf('.'))»
		
		package object «packageQName.substring(packageQName.lastIndexOf('.')+1)» {
			
		  «FOR eClass: ePackage.FunctionalAPIClasses.filter[!orderingKeys.isEmpty].sortBy[name]»
		  implicit def «eClass.name.toFirstLower»Ordering
		  : scala.Ordering[«eClass.name»]
		  = new scala.Ordering[«eClass.name»] {
		  	def compare(x: «eClass.name», y: «eClass.name»)
		  	: scala.Int
		  	= «FOR keyFeature: eClass.orderingKeys»«IF (keyFeature.isClassFeature)»«keyFeature.EType.name.toFirstLower»Ordering.compare(x.«keyFeature.name»,y.«keyFeature.name»)«ELSE»x.«keyFeature.columnName».compareTo(y.«keyFeature.columnName»)«ENDIF» match {
		  	 	case c_«keyFeature.name» if 0 != c_«keyFeature.name» => c_«keyFeature.name»
		  	 	case 0 => «ENDFOR»«FOR keyFeature: eClass.orderingKeys BEFORE "0 }" SEPARATOR " }"»«ENDFOR»
		  }
		  
		  «ENDFOR»
		}
	'''
	
	def String generateClassFile(EClass eClass) '''
		«copyright»
		package gov.nasa.jpl.imce.oml.specification.resolver.api
		
		«eClass.doc("")»«eClass.traitDeclaration»
		{
		«FOR f : eClass.APIStructuralFeatures BEFORE "\n  " SEPARATOR "\n  " AFTER "\n"»«f.doc("  ")»«IF (f.isOverride)»override «ENDIF»val «f.name»: «f.queryType»«ENDFOR»
		«FOR op : eClass.APIOperations BEFORE "\n  " SEPARATOR "\n  " AFTER "\n"»«op.doc("  ")»«op.queryName»: «op.queryType»«ENDFOR»
		«IF (eClass.isRootHierarchyClass)»
		  
		  def canEqual(that: scala.Any): scala.Boolean
		«ENDIF»
		}
	'''
	
	static def Iterable<EStructuralFeature> orderingKeys(EClass eClass) {
		eClass
		.getSortedAttributes
		.filter([EStructuralFeature f | null != f.getEAnnotation("http://imce.jpl.nasa.gov/oml/IsOrderingKey")])
	} 
	
	
	static def List<EStructuralFeature> getSortedAttributes(EClass eClass) {
		eClass
		.selfAndAllSupertypes
		.map[EStructuralFeatures]
		.flatten
		.filter([EStructuralFeature f | isAttributeOrReferenceOrContainer(f) && isSchema(f)])
		.sortWith(new OMLFeatureCompare())
	}
	
	static def List<EClass> selfAndAllSupertypes(EClass eClass) {
		val parents = new ArrayList(eClass.EAllSuperTypes)
		parents.add(eClass)
		parents
	}
	
    static def Boolean isSchema(ENamedElement e) {
    	null == e.getEAnnotation("http://imce.jpl.nasa.gov/oml/NotSchema")
    }
    
	static class OMLFeatureCompare implements Comparator<EStructuralFeature> {
		
		val knownAttributes = #[
		"graphUUID",
		"uuid", 
		"axiomUUID",
		"terminologyUUID",
		"keyUUID",
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
		"value"
		]
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
	
	static def String columnName(EStructuralFeature feature) {
		if (feature instanceof EReference) feature.name+"UUID" else feature.name
	}
	
	static def Boolean isAuxiliaryClass(EClass eClass) {
		eClass.isAbstract && eClass.ESuperTypes.isEmpty && eClass.EStructuralFeatures.isEmpty
	}
	
	static def Boolean isRootHierarchyClass(EClass eClass) {
		eClass.isAbstract && eClass.ESuperTypes.isEmpty && !eClass.orderingKeys.isEmpty
	}
	
	static def Boolean isSpecializationOfRootClass(EClass eClass) {
		!eClass.ESuperTypes.isEmpty && eClass.selfAndAllSupertypes.exists[isRootHierarchyClass]
	}
	
	static def String traitDeclaration(EClass eClass) '''
		trait «eClass.name»
		«FOR parent : eClass.ESuperTypes BEFORE "  extends " SEPARATOR "\n  with "»«parent.name»«ENDFOR»
	'''
	
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
			default: type.name
		}
	}
	
	static def Boolean isClassFeature(ETypedElement feature) {
		val type = feature.EType
		type instanceof EClass
	}
	
	static def Boolean isOverride(ETypedElement feature) {
		null != feature.getEAnnotation("http://imce.jpl.nasa.gov/oml/Override")
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
							"scala.collection.immutable.Map["+key+", scala.collection.immutable.Seq["+type.name+"]]"				
						}
						case "Map": {
							val key=ann.get("key")
							"scala.collection.immutable.Map["+key+", "+type.name+"]"				
						}
						case "Set": 
							"scala.collection.immutable.Set[_ <: "+type.name+"]"		
					
						case "SortedSet": 
							"scala.collection.immutable.SortedSet["+type.name+"]"		
						}
					}
					else
						"scala.Option["+type.name+"]"
				}
				else
					type.name
			default:
				type.name+"//Default"
		}
	}
	
	static def String queryName(EOperation op) {
		val kind = if (op.EParameters.empty) "def" else "def"
		val decl = if (null != op.getEAnnotation("http://imce.jpl.nasa.gov/oml/Override")) "override "+kind else kind
		val args = '''«FOR p : op.EParameters SEPARATOR ",\n  "»«p.name»: «p.queryType»«ENDFOR»'''
		decl+" "+op.name+"\n  ("+args+(if (args.empty) ")" else "\n  )")
	}
	
	static def String queryType(EOperation op) {
		val ann = op.getEAnnotation("http://imce.jpl.nasa.gov/oml/Collection")?.details
		val scalaType = op.scalaTypeName
		switch ann?.get("kind") ?: "" {
			case "Map": {
				val key=ann.get("key")
				"scala.collection.immutable.Map["+key+","+scalaType+"]"				
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
		ePkg.EClassifiers.filter(EClass).filter[isAPI]
	}
    
	static def Iterable<EOperation> APIOperations(EClass eClass) {
		eClass.EOperations.filter[isAPI]
	}
    
    static def Boolean isAPI(ENamedElement e) {
    	null == e.getEAnnotation("http://imce.jpl.nasa.gov/oml/NotFunctionalAPI")
    }
    
	static def String doc(ENamedElement e, String indent) {
		val doc = e.getEAnnotation("http://www.eclipse.org/emf/2002/GenModel")?.details?.get("documentation") ?: ""
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