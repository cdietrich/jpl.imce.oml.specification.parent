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

import java.util.Comparator
import java.util.HashSet
import java.util.Set
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.ETypedElement
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.emf.ecore.plugin.EcorePlugin
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage
import org.eclipse.emf.ecore.xml.type.XMLTypePackage
import org.eclipse.xtext.resource.XtextResource
import java.util.Map
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1
import org.eclipse.emf.ecore.xcore.XcoreStandaloneSetup

class OMLUtilities {
		
	static def XtextResourceSet createXcoreResourceSet(Procedure1<Map<URI,URI>> standaloneURIMapInitializer) {
		val set = new XtextResourceSet();
		val Map<URI, URI> uriMap = set.getURIConverter().getURIMap()
		if (null === EcorePlugin.workspaceRoot) {
			XcoreStandaloneSetup.doSetup()
			uriMap.putAll(EcorePlugin.computePlatformURIMap(false))
			uriMap.put(
				URI.createURI("platform:/resource/org.eclipse.emf.ecore/model/Ecore.ecore"),
				URI.createURI(EcorePackage.getResource("/model/Ecore.ecore").toURI.toString))
			uriMap.put(
				URI.createURI("platform:/resource/org.eclipse.emf.ecore/model/Ecore.genmodel"),
				URI.createURI(EcorePackage.getResource("/model/Ecore.genmodel").toURI.toString))
			uriMap.put(
				URI.createURI("platform:/resource/org.eclipse.emf.ecore/model/XMLNamespace.ecore"),
				URI.createURI(XMLNamespacePackage.getResource("/model/XMLNamespace.ecore").toURI.toString))
			uriMap.put(
				URI.createURI("platform:/resource/org.eclipse.emf.ecore/model/XMLNamespace.genmodel"),
				URI.createURI(XMLNamespacePackage.getResource("/model/XMLNamespace.genmodel").toURI.toString))
			uriMap.put(
				URI.createURI("platform:/resource/org.eclipse.emf.ecore/model/XMLType.ecore"),
				URI.createURI(XMLTypePackage.getResource("/model/XMLType.ecore").toURI.toString))
			uriMap.put(
				URI.createURI("platform:/resource/org.eclipse.emf.ecore/model/XMLType.genmodel"),
				URI.createURI(XMLTypePackage.getResource("/model/XMLType.genmodel").toURI.toString))
			standaloneURIMapInitializer.apply(uriMap)
		} else {
			uriMap.putAll(EcorePlugin.computePlatformURIMap(true))
		}
		set.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE)
		set
	}
	
	static def String queryResolverName(EOperation op) {
		val kind = "def"
		val decl = if (null !== op.getEAnnotation("http://imce.jpl.nasa.gov/oml/Override")) "override "+kind else kind
		val args = '''«FOR p : op.EParameters SEPARATOR ",\n  "»«p.name»: «p.queryResolverType»«ENDFOR»'''
		decl+" "+op.name+"\n  ("+args+")"
	}
	
	static def String queryResolverType(ETypedElement feature) {
		val type = feature.EType
		val scalaType = feature.scalaResolverTypeName
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
	
	static def String scalaResolverTypeName(ETypedElement feature) {
		val type = feature.EType
		switch (type.name) {
			case "EInt": "scala.Int"
			case "EBoolean": "scala.Boolean"
			case "EString": "scala.Predef.String"
			case "AbbrevIRI": "gov.nasa.jpl.imce.oml.specification.tables.AbbrevIRI"
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
	
	static def String constructorTypeName(ETypedElement feature) {
		val scalaType = feature.scalaTableTypeName
		if (feature.lowerBound == 0)
		  "scala.Option["+scalaType+"]"
	    else
	      scalaType
	}
	
	static def String javaArgName(ETypedElement feature) {
		if (feature.lowerBound == 0)
		  feature.columnName+".asScala"
		else
		  feature.columnName
	}
	
	static def String javaTypeName(ETypedElement feature) {
		val scalaType = feature.scalaTableTypeName
		if (feature.lowerBound == 0)
		  "Optional["+scalaType+"]"
		else
		  scalaType
	}
	
	static def String jsArgName(ETypedElement feature) {
		if (feature.lowerBound == 0)
		  feature.columnName+".toOption"
		else
		  feature.columnName
	}
	
	static def String jsTypeName(ETypedElement feature) {
		val scalaType = feature.scalaTableTypeName
		if (feature.lowerBound == 0)
		  "scala.scalajs.js.UndefOr["+scalaType+"]"
		else
		  scalaType
	}
	
	static def String scalaTableTypeName(ETypedElement feature) {
		val type = feature.EType
		switch (type.name) {
			case "EInt": "scala.Int"
			case "EBoolean": "scala.Boolean"
			case "EString": "scala.Predef.String"
			case type instanceof EClass: "UUID"
			default: type.name
		}
	}
	
	static def Boolean isFunctionalAPIWithOrderingKeys(EClass eClass) {
		if (!eClass.isFunctionalAPI)
			return false
		else {
			val keys = eClass.orderingKeys
			if (keys.empty)
				return false
			else
				return true
		}
	}
	
	static def Iterable<ETypedElement> orderingKeys(EClass eClass) {
		eClass
		.functionalAPIOrOrderingKeyAttributes
		.filter[isOrderingKey]
	} 
	
	static def Boolean hasOptionalAttributes(EClass eClass) {
		eClass.functionalAPIOrOrderingKeyAttributes.exists(a | a.lowerBound == 0)
	}
	
	static def Iterable<ETypedElement> functionalAPIOrOrderingKeyAttributes(EClass eClass) {
		eClass
		.functionalAPIOrOrderingKeyFeatures
		.filter[isAttributeOrReferenceOrContainer || isOrderingKey]
	}
	
	static def Iterable<ETypedElement> functionalAPIOrOrderingKeyFeatures(EClass eClass) {
		val Set<ETypedElement> features = eClass
		.selfAndAllSupertypes
		.map[ETypedElements]
		.flatten
		.toSet
		
		val sorted = features
		.sortWith(new OMLFeatureCompare())
		
		sorted
	}
	
	static def Iterable<ETypedElement> ETypedElements(EClass eClass) {
		val features = new HashSet<ETypedElement>()
		features.addAll(eClass.EStructuralFeatures.filter[isFunctionalAPIOrOrderingKey])
		features.addAll(eClass.EOperations.filter[isFunctionalAPIOrOrderingKey])
		features
	}
	
	static def Iterable<EClass> selfAndAllSupertypes(EClass eClass) {
		val parents = new HashSet(eClass.EAllSuperTypes)
		parents.add(eClass)
		parents
	}
	
	static def Boolean isFunctionalAPIOrOrderingKey(ENamedElement e) {
	 	(e.isFunctionalAPI || e.isOrderingKey)
	}
	
    static def Boolean isFunctionalAPI(ENamedElement e) {
    	if (e.isSchema && e.isAPI) {
    		switch e {
    			EClass:
    			  !e.isAbstract
    	 		default:
    			  true
    	  }
 		} else
    	  false
    }
     
	static def Boolean isAttributeOrReferenceOrContainer(ETypedElement f) {
		switch f {
			EReference: 
				f.isSchema && ! f.containment
			default: 
				f.isSchema
		}
	}
	
	static def EClass EClassContainer(ETypedElement f) {
		val c = f.eContainer
		switch c {
			EClass:
				c
		}
	}
	
    static def Boolean isOrderingKey(ENamedElement e) {
    	null !== e.getEAnnotation("http://imce.jpl.nasa.gov/oml/IsOrderingKey")
    }
    
    static def Boolean isAPI(ENamedElement e) {
    	null === e.getEAnnotation("http://imce.jpl.nasa.gov/oml/NotFunctionalAPI")
    }
    
    static def Boolean isGlossary(ENamedElement e) {
    	null !== e.getEAnnotation("http://imce.jpl.nasa.gov/oml/Glossary")
    }
    
    static def Boolean isScala(ENamedElement e) {
    	null !== e.getEAnnotation("http://imce.jpl.nasa.gov/oml/Scala")
    }
    
    static def Boolean isSchema(ENamedElement e) {
    	null === e.getEAnnotation("http://imce.jpl.nasa.gov/oml/NotSchema")
    }
    
    static def Boolean isValueTable(ENamedElement e) {
    	null !== e.getEAnnotation("http://imce.jpl.nasa.gov/oml/ValueTable")
    }
   
	static def String pluralize(String s) {
	  if (s.endsWith("y")) { 
	  	s.substring(0, s.length-1)+"ies"
	  } else {
	  	s+"s"
	  }	 
	}
	
	static class OMLTableCompare implements Comparator<EClass> {
		
		val knownTables = #[
		"Annotation",
		"AnnotationEntry",
		"AnnotationProperty",
		"AnnotationPropertyTable",
		"AnnotationSubjectPropertyValue",
		"AnnotationSubjectTable",
		"TerminologyGraph", 
		"Bundle", 
		"ConceptDesignationTerminologyAxiom",
		"TerminologyExtensionAxiom", 
		"TerminologyNestingAxiom",
		"Aspect",
		"Concept",
		"ReifiedRelationship", 
		"UnreifiedRelationship",
		"Scalar",
		"Structure", 
		"BinaryScalarRestriction", 
		"IRIScalarRestriction", 
		"NumericScalarRestriction",
		"PlainLiteralScalarRestriction",
		"ScalarOneOfRestriction",
		"StringScalarRestriction",
		"SynonymScalarRestriction",
		"TimeScalarRestriction",
		"EntityScalarDataProperty",
		"EntityStructuredDataProperty",
		"ScalarDataProperty",
		"StructuredDataProperty",
		"AspectSpecializationAxiom",
		"ConceptSpecializationAxiom",
		"ReifiedRelationshipSpecializationAxiom",
		"EntityExistentialRestrictionAxiom",
		"EntityUniversalRestrictionAxiom",
		"EntityScalarDataPropertyExistentialRestrictionAxiom",
		"EntityScalarDataPropertyParticularRestrictionAxiom",
		"EntityScalarDataPropertyUniversalRestrictionAxiom",
		"ScalarOneOfLiteralAxiom",
		"BundledTerminologyAxiom",
		"AnonymousConceptTaxonomyAxiom",
		"RootConceptTaxonomyAxiom",
		"SpecificDisjointConceptAxiom",
		"Annotation"
		]
		
		override compare(EClass c1, EClass c2) {
			val name1 = c1.name
			val name2 = c2.name
			val i1 = knownTables.indexOf(name1)
			val i2 = knownTables.indexOf(name2)
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
	
	static class OMLFeatureCompare implements Comparator<ETypedElement> {
		
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
	
	static def String columnName(ETypedElement feature) {
		if (feature instanceof EReference) feature.name+"UUID" else feature.name
	}
	
	static def String markDown(ENamedElement e) {
		val doc = e.getEAnnotation("http://www.eclipse.org/emf/2002/GenModel")?.details?.get("documentation") ?: ""
		doc
	}
	
	static def String doc(ENamedElement e, String indent) {
		val doc = e.getEAnnotation("http://www.eclipse.org/emf/2002/GenModel")?.details?.get("documentation") ?: ""
		if (doc.empty) 
		doc
		else 
		"/*\n"+indent+" * "+doc.replaceAll("\n","\n"+indent+" * ")+"\n"+indent+" */\n"+indent	
	}
	
	static def String copyright() '''
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