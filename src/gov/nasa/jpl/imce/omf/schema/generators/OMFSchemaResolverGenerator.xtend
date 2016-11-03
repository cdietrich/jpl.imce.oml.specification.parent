package gov.nasa.jpl.imce.omf.schema.generators

import java.io.File
import java.io.FileOutputStream
import org.eclipse.core.runtime.FileLocator
import org.eclipse.core.runtime.Platform
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.plugin.EcorePlugin
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet

/*
 * I tried to use XCore to specify the OMF Schema Resolver API in terms of read-only queries.
 * This is possible for simple metamodeling constructs like binary associations.
 * Unfortunately, XCore, like EMF, only supports a few collections; too few for an API (e.g. Map)
 * 
 * The skeleton of the OMF Schema Resolver API is generated with this template.
 * Additional API features are added manually.
 * TODO Augment this template to avoid over-writing the manually-added API features. 
 */
class OMFSchemaResolverGenerator {
	
	def generate() {
		val sourceFile = "/gov.nasa.jpl.imce.omf.schema.specification/model/OMFSchema.xcore"
		val targetBundle = "jpl.omf.schema.tables"
		
		val set = new XtextResourceSet();
		set.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap(true));
		set.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
      	val sourceURI = URI.createPlatformResourceURI(sourceFile, false)
      	val sourceResource = set.getResource(sourceURI, true)
      	val ePackage = sourceResource.getContents().filter(EPackage).get(0)
      	
		val targetFolder = "/shared/src/main/scala/gov/nasa/jpl/imce/omf/schema/resolved"
		val targetURL = Platform.getBundle(targetBundle).getEntry(targetFolder)
		val folder = FileLocator.toFileURL(targetURL)
      	generate(ePackage, folder.path)
      	      	
	}
	
	def generate(EPackage ePackage, String targetFolder) {
		for(eClass : ePackage.EClassifiers.filter(EClass))  {
			val classFile = new FileOutputStream(new File(targetFolder + File::separator + eClass.name + ".scala"))
			classFile.write(generateClassFile(eClass).bytes)
		}
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
    
	def String generateClassFile(EClass eClass) '''
		«copyright»
		 
		package gov.nasa.jpl.imce.omf.schema.resolved
		
		«eClass.traitDeclaration»
		«FOR f : eClass.EStructuralFeatures BEFORE "{\n  " SEPARATOR "\n  " AFTER "\n}"»val «f.queryName»: «f.queryType»«ENDFOR»
	'''
	
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
	
	static def String scalaTypeName(EStructuralFeature feature) {
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
	
	static def String queryType(EStructuralFeature feature) {
		val type = feature.EType
		val scalaType = feature.scalaTypeName
		switch type {
			case type instanceof EDataType: 
				if (feature.lowerBound == 0)
		  			"scala.Option["+scalaType+"]"
	   			else
	      			scalaType
			case type instanceof EClass:
				if (feature.lowerBound == 0 && feature.upperBound == -1)
					"scala.collection.immutable.Set["+type.name+"]"
				else
					type.name
			default:
				type.name+"//Default"
		}
	}

}