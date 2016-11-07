package gov.nasa.jpl.imce.omf.schema.generators

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
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.plugin.EcorePlugin
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet

class OMFSchemaTableGenerator {
	
	def generate() {
		val sourceFile = "/gov.nasa.jpl.imce.omf.schema.specification/model/OMFSchema.xcore"
		val targetBundle = "jpl.omf.schema.tables"
		
		val set = new XtextResourceSet();
		set.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap(true));
		set.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
      	val sourceURI = URI.createPlatformResourceURI(sourceFile, false)
      	val sourceResource = set.getResource(sourceURI, true)
      	val ePackage = sourceResource.getContents().filter(EPackage).get(0)
      	
		val targetFolder = "/shared/src/main/scala/gov/nasa/jpl/imce/omf/schema/tables"
		val folder = FileLocator.toFileURL(Platform.getBundle(targetBundle).getEntry(targetFolder))
      	generate(ePackage, folder.path)
      	      	
		val targetJSFolder = "/js/src/main/scala/gov/nasa/jpl/imce/omf/schema/tables"
		val folderJS = FileLocator.toFileURL(Platform.getBundle(targetBundle).getEntry(targetJSFolder))
      	generateJS(ePackage, folderJS.path)
      	
		val targetJVMFolder = "/jvm/src/main/scala/gov/nasa/jpl/imce/omf/schema/tables"
		val folderJVM = FileLocator.toFileURL(Platform.getBundle(targetBundle).getEntry(targetJVMFolder))
      	generateJVM(ePackage, folderJVM.path)
	}
	
	def generate(EPackage ePackage, String targetFolder) {
		val packageFile = new FileOutputStream(new File(targetFolder + File::separator + "package.scala"))
		packageFile.write(generatePackageFile(ePackage).bytes)
		for(eClass : ePackage.EClassifiers.filter(EClass).filter[!isAbstract])  {
			val classFile = new FileOutputStream(new File(targetFolder + File::separator + eClass.name + ".scala"))
			classFile.write(generateClassFile(eClass).bytes)
		}
	}
	
	def generateJS(EPackage ePackage, String targetJSFolder) {
		for(eClass : ePackage.EClassifiers.filter(EClass).filter[!isAbstract && hasOptionalAttributes])  {
			val classFile = new FileOutputStream(new File(targetJSFolder + File::separator + eClass.name + "JS.scala"))
			classFile.write(generateJSClassFile(eClass).bytes)
		}
	}
	
	def generateJVM(EPackage ePackage, String targetJVMFolder) {
		for(eClass : ePackage.EClassifiers.filter(EClass).filter[!isAbstract && hasOptionalAttributes])  {
			val classFile = new FileOutputStream(new File(targetJVMFolder + File::separator + eClass.name + "Java.scala"))
			classFile.write(generateJVMClassFile(eClass).bytes)
		}
	}
	
	def String generatePackageFile(EPackage ePackage) '''
		«copyright»

		package gov.nasa.jpl.imce.omf.schema
		
		package object tables {
			«FOR type : ePackage.EClassifiers.filter(EDataType).filter[t|!(t instanceof EEnum)].sortBy[name]»
				type «type.name» = scala.Predef.String
		  	«ENDFOR» 
		}
	'''
	
	def String generateClassFile(EClass eClass) '''
		«copyright»
		 
		package gov.nasa.jpl.imce.omf.schema.tables
		
		import scala.annotation.meta.field
		import scala.scalajs.js.annotation.JSExport
		import scala._
		import scala.Predef._
		
		/**
		  «FOR attr : eClass.getSortedAttributes»
		  * @param «attr.columnName»[«attr.lowerBound»,«attr.upperBound»]
		  «ENDFOR» 
		  */
		«IF ! eClass.hasOptionalAttributes»
		@JSExport
		«ENDIF»
		case class «eClass.name»
		(
		 «FOR attr : eClass.getSortedAttributes SEPARATOR ","»
		 @(JSExport @field) «attr.columnName»: «attr.constructorTypeName»
		 «ENDFOR»
		)
		
		@JSExport
		object «eClass.name»Helper {
		
		  implicit val w
		  : upickle.default.Writer[«eClass.name»]
		  = upickle.default.macroW[«eClass.name»]
		
		  @JSExport
		  def toJSON(c: «eClass.name»)
		  : String
		  = upickle.default.write(expr=c, indent=0)
		
		  implicit val r
		  : upickle.default.Reader[«eClass.name»]
		  = upickle.default.macroR[«eClass.name»]
		
		  @JSExport
		  def fromJSON(c: String)
		  : «eClass.name»
		  = upickle.default.read[«eClass.name»](c)
		
		}	
	'''
	
	def String generateJSClassFile(EClass eClass) '''
		«copyright»
		 
		package gov.nasa.jpl.imce.omf.schema.tables
		
		import scala.scalajs.js.annotation.JSExport
		
		@JSExport
		object «eClass.name»JS {
		  «IF eClass.hasOptionalAttributes»
		  
		  @JSExport
		  def js«eClass.name»(
		    «FOR attr : eClass.getSortedAttributes SEPARATOR ","»
		    «attr.columnName»: «attr.jsTypeName»
		    «ENDFOR»
		  )
		  : «eClass.name»
		  = «eClass.name»(
		    «FOR attr : eClass.getSortedAttributes SEPARATOR ","»
		    «attr.jsArgName»
		    «ENDFOR»
		  )
		  «ENDIF»
		  
		}	
	'''
	
	def String generateJVMClassFile(EClass eClass) '''
		«copyright»
		 
		package gov.nasa.jpl.imce.omf.schema.tables
		
		import java.util.Optional
		import scala.compat.java8.OptionConverters._
		
		object «eClass.name»Java {
		  «IF eClass.hasOptionalAttributes»
		  
		  def java«eClass.name»(
		    «FOR attr : eClass.getSortedAttributes SEPARATOR ","»
		    «attr.columnName»: «attr.javaTypeName»
		    «ENDFOR»
		  )
		  : «eClass.name»
		  = «eClass.name»(
		    «FOR attr : eClass.getSortedAttributes SEPARATOR ","»
		    «attr.javaArgName»
		    «ENDFOR»
		  )
		  «ENDIF»
		  
		}	
	'''
	
	static def Boolean hasOptionalAttributes(EClass eClass) {
		eClass.getSortedAttributes.exists(a | a.lowerBound == 0)
	}
	
	static def List<EStructuralFeature> getSortedAttributes(EClass eClass) {
		eClass
		.selfAndAllSupertypes
		.map[EStructuralFeatures]
		.flatten
		.filter([EStructuralFeature f | isAttributeOrReferenceOrContainer(f) && isSchema(f)])
		.sortWith(new OMFFeatureCompare())
	}
	
	static def Boolean isAttributeOrReferenceOrContainer(EStructuralFeature f) {
		switch f {
			EReference: 
				! f.containment
			default: true
		}
	}
	
	static def List<EClass> selfAndAllSupertypes(EClass eClass) {
		val parents = new ArrayList(eClass.EAllSuperTypes)
		parents.add(eClass)
		parents
	}
	
	static def String columnName(EStructuralFeature feature) {
		if (feature instanceof EReference) feature.name+"UUID" else feature.name
	}
	
	static def String scalaTypeName(EStructuralFeature feature) {
		val type = feature.EType
		switch (type.name) {
			case "EInt": "scala.Int"
			case "EBoolean": "scala.Boolean"
			case "EString": "scala.Predef.String"
			case type instanceof EClass: "UUID"
			default: type.name
		}
	}
	static def String constructorTypeName(EStructuralFeature feature) {
		val scalaType = feature.scalaTypeName
		if (feature.lowerBound == 0)
		  "scala.Option["+scalaType+"]"
	    else
	      scalaType
	}

	static def String jsTypeName(EStructuralFeature feature) {
		val scalaType = feature.scalaTypeName
		if (feature.lowerBound == 0)
		  "scala.scalajs.js.UndefOr["+scalaType+"]"
		else
		  scalaType
	}

	static def String jsArgName(EStructuralFeature feature) {
		if (feature.lowerBound == 0)
		  feature.columnName+".toOption"
		else
		  feature.columnName
	}


	static def String javaTypeName(EStructuralFeature feature) {
		val scalaType = feature.scalaTypeName
		if (feature.lowerBound == 0)
		  "Optional["+scalaType+"]"
		else
		  scalaType
	}

	static def String javaArgName(EStructuralFeature feature) {
		if (feature.lowerBound == 0)
		  feature.columnName+".asScala"
		else
		  feature.columnName
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
	
    
    static def Boolean isSchema(ENamedElement e) {
    	null == e.getEAnnotation("http://imce.jpl.nasa.gov/omf/NotSchema")
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