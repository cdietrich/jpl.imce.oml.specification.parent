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
			System.err.println("usage: <dir> where <dir> is the directory of the /gov.nasa.jpl.imce.oml.specification.doc project")
			System.exit(1)
		}
		
		new OMLSpecificationDocGenerator().generate(args.get(0))	
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
			glossaryFile.write(generateGlossaryContents(ePackage).bytes)
		} finally {
			glossaryFile.close
		}
	}
	
	def String generateGlossaryContents(EPackage ePackage) {
		val preamble = new StringBuffer('''
		# Glossary
		''')
		
		val glossary = 
		ePackage
		.EClassifiers
		.filter(EClass)
		.sortBy[name]
		.fold(
			preamble, 
			[buffer, eClass | 
				if (!eClass.isGlossary) buffer
				else generateClassGlossaryContents(buffer, eClass)
			])
		
		glossary.toString
	}
	
	def StringBuffer generateClassGlossaryContents(StringBuffer buffer, EClass eClass ) {
		buffer.append('''
		
		## OML «eClass.name»
		
		''')
		
		val gprefix = if (eClass.isAbstract) "Abstract," else "Concrete,"
		val general = eClass.ESuperClasses
		val sprefix = if (general.empty) gprefix else "and"
		val specific = eClass.ESpecificClasses
		
		if (!general.empty)
			buffer
			.append('''«FOR g : general BEFORE '''«gprefix» with «general.size» «pluralizeIfMany("generalization", general.size)»:'''+"\n" SEPARATOR "\n" AFTER "\n"» - OML «g.name»«ENDFOR»''')
		
		
		if (eClass.isAbstract)
			buffer
			.append('''«FOR s : specific BEFORE '''«sprefix» with «specific.size» «pluralizeIfMany("specialization", specific.size)»:'''+"\n" SEPARATOR "\n" AFTER "\n"» - OML «s.name»«ENDFOR»''')
			
		buffer
		.append('''
		«eClass.markDown»
		''')
		
		buffer	
	}
	
}