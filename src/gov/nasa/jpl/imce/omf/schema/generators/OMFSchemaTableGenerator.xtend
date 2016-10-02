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
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.plugin.EcorePlugin
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EEnum

class OMFSchemaTableGenerator {
	
	def generate() {
		val sourceFile = "/gov.nasa.jpl.imce.omf.schema.specification/model/OMFSchema.xcore"
		val targetBundle = "jpl.omf.schema.tables"
		val targetFolder = "/shared/src/main/scala/gov/nasa/jpl/imce/omf/schema/tables"
		val set = new XtextResourceSet();
		set.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap(true));
		set.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
      	val sourceURI = URI.createPlatformResourceURI(sourceFile, false)
      	val sourceResource = set.getResource(sourceURI, true)
      	val ePackage = sourceResource.getContents().filter(EPackage).get(0)
		val folder = FileLocator.toFileURL(Platform.getBundle(targetBundle).getEntry(targetFolder))
      	generate(ePackage, folder.path)
	}
	
	def generate(EPackage ePackage, String targetFolder) {
		val packageFile = new FileOutputStream(new File(targetFolder + File::separator + "package.scala"))
		packageFile.write(generatePackageFile(ePackage).bytes)
		for(eClass : ePackage.EClassifiers.filter(EClass).filter[!isAbstract])  {
			val classFile = new FileOutputStream(new File(targetFolder + File::separator + eClass.name + ".scala"))
			classFile.write(generateClassFile(eClass).bytes)
		}
	}
	
	def String generatePackageFile(EPackage ePackage) '''
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

		package gov.nasa.jpl.imce.omf.schema
		
		package object tables {
			«FOR type : ePackage.EClassifiers.filter(EDataType).filter[t|!(t instanceof EEnum)].sortBy[name]»
				type «type.name» = scala.Predef.String
		  	«ENDFOR» 
		}
	'''
	
	def String generateClassFile(EClass eClass) '''
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
		 
		package gov.nasa.jpl.imce.omf.schema.tables
		
		import scala.annotation.meta.field
		import scala.scalajs.js.annotation.JSExport
		import scala._
		import scala.Predef._
		
		/**
		  «FOR attr : eClass.getSortedAttributes»
		  * @param «attr.columnName»
		  «ENDFOR» 
		  */
		@JSExport
		case class «eClass.name»
		(
		 «FOR attr : eClass.getSortedAttributes SEPARATOR ","»
		 @(JSExport @field) «attr.columnName»: «attr.typeName»
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
	
	def List<EStructuralFeature> getSortedAttributes(EClass eClass) {
		eClass.selfAndAllSupertypes.map[EStructuralFeatures].flatten.sortWith(new OMFFeatureCompare())
	}
	
	def List<EClass> selfAndAllSupertypes(EClass eClass) {
		val parents = new ArrayList(eClass.EAllSuperTypes)
		parents.add(eClass)
		parents
	}
	
	static def String columnName(EStructuralFeature feature) {
		if (feature instanceof EReference) feature.name+"UUID" else feature.name
	}
	
	static def String typeName(EStructuralFeature feature) {
		val type = feature.EType
		switch (type.name) {
			case "EInt": "scala.Int"
			case "EBoolean": "scala.Boolean"
			case "EString": "scala.Predef.String"
			case type instanceof EClass: "UUID"
			default: type.name
		}
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
}