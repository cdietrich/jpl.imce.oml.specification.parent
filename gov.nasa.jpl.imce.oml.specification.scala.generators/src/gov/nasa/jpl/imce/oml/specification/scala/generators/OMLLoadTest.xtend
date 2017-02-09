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

import java.util.Map
import jpl.imce.oml.specification.ecore.OMLPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.util.EcoreUtil

class OMLLoadTest extends OMLUtilities {
	
	static def main(String[] args) {
		if (1 != args.length) {
			System.err.println("usage: <dir> where <dir> is the directory of the /gov.nasa.jpl.imce.oml.specification.tables project")
			System.exit(1)
		}
		
		val xcoreFile = "/model/OMLSpecification.xcore"
		
		val set = createXcoreResourceSet(
			[Map<URI,URI> uriMap | 
			uriMap.put(
				URI.createURI("platform:/resource/jpl.imce.oml.specification.ecore"+xcoreFile),
				URI.createURI(OMLPackage.getResource(xcoreFile).toURI.toString))
				])

      	val sourceURI = URI.createPlatformResourceURI("/jpl.imce.oml.specification.ecore"+xcoreFile, false)
      	val sourceResource = set.getResource(sourceURI, true)
    
      	EcoreUtil.resolveAll(set)
      	if (!sourceResource.errors.empty) {
      		System.err.println(sourceResource.errors.size + " errors in resource!")
      		sourceResource.errors.forEach[e |
      			System.err.println(e.class.name + " => " + e.message)
      		]
      	}
      	val ePackage = sourceResource.getContents().filter(EPackage).get(0)
      	      	
      	val eboolean_name = 
      	ePackage
      	.EClassifiers
      	.filter(EClass)
      	.findFirst[name == 'Concept']
      	.EStructuralFeatures
      	.findFirst[name == 'isAbstract']
      	.EType
      	.name
      	
      	if ("EBoolean" != eboolean_name) {
      		System.err.println("Concept.isAbstract should be typed by EBoolean")
      	} else { 		
     		System.out.println("OK")
      	}
      	
	}
	
}