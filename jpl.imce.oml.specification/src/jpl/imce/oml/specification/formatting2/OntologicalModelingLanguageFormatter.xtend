/*
 * Copyright 2016 California Institute of Technology (\"Caltech\").
 * U.S. Government sponsorship acknowledged.
 *
 * Licensed under the Apache License, Version 2.0 (the \"License\");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an \"AS IS\" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jpl.imce.oml.specification.formatting2

import jpl.imce.oml.specification.ecore.Annotation
import jpl.imce.oml.specification.ecore.AnnotationProperty
import jpl.imce.oml.specification.ecore.Bundle
import jpl.imce.oml.specification.ecore.DescriptionBox
import jpl.imce.oml.specification.ecore.TerminologyBoxAxiom
import jpl.imce.oml.specification.ecore.TerminologyBoxStatement
import jpl.imce.oml.specification.ecore.TerminologyExtent
import jpl.imce.oml.specification.ecore.TerminologyGraph
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import jpl.imce.oml.specification.ecore.OMLPackage
import jpl.imce.oml.specification.ecore.Aspect

// Cannot use the GrammarAccess for the formatter because it fails to build cleanly with the xtext-gradle-plugin.
// See: https://www.eclipse.org/forums/index.php?t=msg&th=1084511&goto=1754437&#msg_1754437

import com.google.inject.Inject
import jpl.imce.oml.specification.services.OntologicalModelingLanguageGrammarAccess

@SuppressWarnings("all")
class OntologicalModelingLanguageFormatter extends AbstractFormatter2 {
	
	// Refactored to do formatting without a dependency injection for the GrammarAccess.
	@Inject extension OntologicalModelingLanguageGrammarAccess

	def dispatch void format(TerminologyExtent terminologyExtent, extension IFormattableDocument document) {
		terminologyExtent.prepend[newLine]
		
		for (AnnotationProperty annotationProperty : terminologyExtent.getAnnotationProperties()) {
			annotationProperty.format;
		}
		
		for (TerminologyGraph terminologyGraph : terminologyExtent.getTerminologyGraphs()) {
			terminologyGraph.format;
		}
		
		for (Bundle bundle : terminologyExtent.getBundles()) {
			bundle.format;
		}
		
		for (DescriptionBox description : terminologyExtent.getDescriptions()) {
			description.format;
		}
	}

	def dispatch void format(AnnotationProperty annotationProperty, extension IFormattableDocument document) {
		annotationProperty.prepend[newLine]
		
		annotationProperty.regionFor.ruleCall(annotationPropertyAccess.ANNOTATION_PROPERTY_TOKENTerminalRuleCall_0).append[oneSpace]
		//annotationProperty.regionFor.ruleCall(annotationPropertyAccess.EQUALTerminalRuleCall_2).surround[noSpace]
		
		//annotationProperty.regionFor.keyword("annotationProperty").append[oneSpace]
		
		annotationProperty.regionFor.feature(OMLPackage.eINSTANCE.annotationProperty_AbbrevIRI).prepend[oneSpace]
		annotationProperty.regionFor.keyword("=").surround[noSpace]
		
		annotationProperty.regionFor.feature(OMLPackage.eINSTANCE.annotationProperty_Iri).append[newLine]
	}
	
	def dispatch void format(Annotation annotation, extension IFormattableDocument document) {
		annotation.prepend[newLine]
		//annotation.regionFor.ruleCall(annotationAccess.ANNOTATION_TOKENTerminalRuleCall_0).append[oneSpace]
		annotation.regionFor.keyword("annotation").append[oneSpace]
		//annotation.regionFor.ruleCall(annotationAccess.EQUALTerminalRuleCall_2).surround[noSpace]
		annotation.regionFor.keyword("=").surround[noSpace]
	}
	
	def dispatch void format(TerminologyGraph terminologyGraph, extension IFormattableDocument document) {
		terminologyGraph.prepend[newLine]
			
		terminologyGraph.regionFor.feature(OMLPackage.eINSTANCE.terminologyBox_Kind).append[oneSpace]
		
		//terminologyGraph.regionFor.ruleCall(terminologyGraphAccess.TERMINOLOGY_GRAPH_TOKENTerminalRuleCall_1).surround[oneSpace]
		terminologyGraph.regionFor.keyword("terminology").surround[oneSpace]
		
		//terminologyGraph.regionFor.ruleCall(terminologyGraphAccess.iriIRITerminalRuleCall_2_0).surround[oneSpace]
		terminologyGraph.regionFor.feature(OMLPackage.eINSTANCE.module_Iri).surround[oneSpace]
		
		val lcurly = terminologyGraph.regionFor.ruleCall(terminologyGraphAccess.LCURLYTerminalRuleCall_3)
		//val lcurly = terminologyGraph.regionFor.keyword("{")
		val rcurly = terminologyGraph.regionFor.ruleCall(terminologyGraphAccess.RCURLYTerminalRuleCall_5)
		//val rcurly = terminologyGraph.regionFor.keyword("}")
		lcurly.prepend[oneSpace]
		lcurly.append[newLine]
		interior(lcurly, rcurly)[indent]
		rcurly.append[newLine]
		
		for (Annotation annotations : terminologyGraph.getAnnotations()) {
			annotations.format
		}
		
		for (TerminologyBoxAxiom terminologyBoxAxioms : terminologyGraph.getTerminologyBoxAxioms()) {
			terminologyBoxAxioms.format
		}
		
		for (TerminologyBoxStatement boxStatements : terminologyGraph.getBoxStatements()) {
			boxStatements.format
		}
	}
	
	def dispatch void format(Bundle bundle, extension IFormattableDocument document) {
		bundle.prepend[newLine]
			
		//val lcurly = bundle.regionFor.ruleCall(terminologyGraphAccess.LCURLYTerminalRuleCall_3)
		val lcurly = bundle.regionFor.keyword("{")
		//val rcurly = bundle.regionFor.ruleCall(terminologyGraphAccess.RCURLYTerminalRuleCall_5)
		val rcurly = bundle.regionFor.keyword("}")
		lcurly.append[newLine]
		interior(lcurly, rcurly)[indent]
		
		for (Annotation annotations : bundle.getAnnotations()) {
			annotations.format
		}
		
		for (TerminologyBoxAxiom terminologyBoxAxioms : bundle.getTerminologyBoxAxioms()) {
			terminologyBoxAxioms.format
		}
		
		for (TerminologyBoxStatement boxStatements : bundle.getBoxStatements()) {
			boxStatements.format
		}
	}
	
	def dispatch void format(DescriptionBox descriptionBox, extension IFormattableDocument document) {
		descriptionBox.prepend[newLine]
			
		//val lcurly = descriptionBox.regionFor.ruleCall(terminologyGraphAccess.LCURLYTerminalRuleCall_3)
		val lcurly = descriptionBox.regionFor.keyword("{")
		//val rcurly = descriptionBox.regionFor.ruleCall(terminologyGraphAccess.RCURLYTerminalRuleCall_5)
		val rcurly = descriptionBox.regionFor.keyword("}")
		lcurly.append[newLine]
		interior(lcurly, rcurly)[indent]
		
		for (Annotation annotations : descriptionBox.getAnnotations()) {
			annotations.format
		}
	}

	def dispatch void format(Aspect aspect, extension IFormattableDocument document) {
		//aspect.regionFor.ruleCall(aspectAccess.ASPECT_TOKENTerminalRuleCall_0).append[oneSpace]
		
		//aspect.prepend[newLine]
		aspect.regionFor.keyword("aspect").append[oneSpace]
		
		//aspect.regionFor.ruleCall(aspectAccess.nameIDTerminalRuleCall_1_0).append[newLine]
		aspect.regionFor.feature(OMLPackage.eINSTANCE.term_Name).prepend[oneSpace]
		aspect.regionFor.feature(OMLPackage.eINSTANCE.term_Name).append[newLine]
	}
}
