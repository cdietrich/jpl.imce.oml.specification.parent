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
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.util.EcoreUtil

class OMLSpecificationDocGenerator extends OMLUtilities {

	static def main(String[] args) {
		if (1 != args.length) {
			System.err.println(
				"usage: <dir> where <dir> is the directory of the /gov.nasa.jpl.imce.oml.specification.doc project")
			System.exit(1)
		}

		new OMLSpecificationDocGenerator().generate(args.get(0))
	}

	def generate(String targetDir) {
		val omlXcore = "/model/OMLSpecification.xcore"
		val set = createXcoreResourceSet(
			[ Map<URI, URI> uriMap |
			uriMap.put(URI.createURI("platform:/resource/jpl.imce.oml.specification.ecore" + omlXcore),
				URI.createURI(OMLPackage.getResource(omlXcore).toURI.toString))
		])

		val sourceURI = URI.createPlatformResourceURI("/jpl.imce.oml.specification.ecore" + omlXcore, false)
		val sourceResource = set.getResource(sourceURI, true)
		EcoreUtil.resolveAll(set)
		val ePackage = sourceResource.getContents().filter(EPackage).get(0)

		val targetPath = Paths.get(targetDir)
		targetPath.toFile.mkdirs

		generateGlossaryFile(
			ePackage,
			targetPath.toAbsolutePath.toString
		)
	}

	def generateGlossaryFile(EPackage ePackage, String targetFolder) {
		val glossaryFile = new FileOutputStream(new File(targetFolder + File::separator + "GLOSSARY.md"))
		
		try {
			val glossaryEntries = ePackage.EClassifiers.filter(EClass).filter[isGlossary].sortBy[name]

			val entriesByAbstraction = glossaryEntries.groupBy[isAbstract]
			val schemaEntries = entriesByAbstraction.get(false).filter[isSchema]
			val apiEntries = entriesByAbstraction.get(false).filter[isAPI]
			val ooEntries = entriesByAbstraction.get(false).filter[isOO]

			val preamble = new StringBuffer('''
				{% include "./external-links.md" %}
				# OML Glossary Summary
				
				The vocabulary of the Ontological Modeling Language, OML, consists of «glossaryEntries.size» definitions
				(«entriesByAbstraction.get(true).size» abstract and «entriesByAbstraction.get(false).size» concrete).
				This OML vocabulary is the basis of the Ontological Modeling Framework (OMF), which is 
				a collection of multiple technology-based Application Programming Interfaces (APIs) & libraries.
				
				- **EMF/CDO** OMF APIs and libraries based on the [Eclipse Modeling Framework] and [Connected Data Objects]
				
				  All «glossaryEntries.size» definitions induce corresponding EMF-based APIs and libraries.
				  For the «entriesByAbstraction.get(false).size» concrete definitions, the *EMF/CDO* APIs
				  include all the «schemaEntries.size» *Normalized* APIs, all the «apiEntries.size» *Functional* APIs,
				  and «ooEntries.size» definitions uniquely intended for *EMF/CDO*.
				  
				- **Normalized** OMF APIs and libraries based on polyglot functional programming in Java, JavaScript and Scala
				
				  A subset of «schemaEntries.size» definitions from the «entriesByAbstraction.get(false).size» concrete definitions
				  constitute the set of normalized relational database schema tables for the technology-agnostic OML tabular interchange representation.
				  These definitions generate language-friendly functional programming APIs for Java, JavaScript and Scala.
				  Note that Scala is the only language that can provide strong compile-time guarantees of the referential transparency of the OML functional APIs.
				  For Java and JavaScript, the OML functional APIs are intended to be referentially transparent; 
				  however, these languages do not provide any guarantees at compile time or runtime for preserving these properties.
				  
				- **Functional** OMF APIs and libraries in Scala for in-memory processing of OML tabular interchange representations
				
				  A subset of «apiEntries.size» definitions from the «entriesByAbstraction.get(false).size» concrete definitions
				  augment the polyglot functional programming OMF APIs for the in-memory processing of OMF information
				  extracted from parsing the OML tabular interchange representation.
				
				# OML Glossary of «entriesByAbstraction.get(true).size» Abstract Definitions {#oml-abstract-glossary}
				''')
			
			val abstractGlossary = entriesByAbstraction.get(true).fold(
				preamble,
				[buffer, eClass|generateClassGlossaryContents(buffer, eClass)]
			)
			
			abstractGlossary.append("\n"+'''# OML Glossary of «entriesByAbstraction.get(false).size» Concrete Definitions {#oml-concrete-glossary}''' +"\n")
			
			val concreteGlossary = entriesByAbstraction.get(false).fold(
				abstractGlossary,
				[buffer, eClass|generateClassGlossaryContents(buffer, eClass)])

			glossaryFile.write(concreteGlossary.toString.bytes)
			
		} finally {
			glossaryFile.close
		}
	}

	def StringBuffer generateClassGlossaryContents(StringBuffer buffer, EClass eClass) {

		buffer.append('''
			
			## OML «eClass.name»
			
			«eClass.markDown»
			
		''')

		var prefix = "{APIs: "
		if (eClass.isSchema) {
			buffer.append(prefix + "**Normalized**");
			prefix = ", "
		}
		if (eClass.isAPI) {
			buffer.append(prefix + "**Functional**");
			prefix = ", "
		}
		if (eClass.isSchema) {
			buffer.append(prefix + "**EMF/CDO**");
			prefix = ", "
		}
		buffer.append("}\n")

		val gprefix = if(eClass.isAbstract) "Abstract" else "Concrete"
		val general = eClass.ESuperClasses
		val sprefix = if(general.empty) gprefix else "and"
		val specific = eClass.ESpecificClasses

		if (!general.empty)
			buffer.append(
				"\n" +
					'''«FOR g : general BEFORE '''«gprefix» definition with «general.size» «pluralizeIfMany("generalization", general.size)»:'''+"\n" SEPARATOR "\n" AFTER "\n"» - OML «g.name»«ENDFOR»''')

		if (eClass.isAbstract)
			buffer.append(
				"\n" +
					'''«FOR s : specific BEFORE '''«sprefix» with «specific.size» «pluralizeIfMany("specialization", specific.size)»:'''+"\n" SEPARATOR "\n" AFTER "\n"» - OML «s.name»«ENDFOR»''')

		buffer
	}

}
