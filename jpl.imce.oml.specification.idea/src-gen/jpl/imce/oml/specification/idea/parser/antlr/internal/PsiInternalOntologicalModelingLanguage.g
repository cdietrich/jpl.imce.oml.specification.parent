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
grammar PsiInternalOntologicalModelingLanguage;

options {
	superClass=AbstractPsiAntlrParser;
}

@lexer::header {
package jpl.imce.oml.specification.idea.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package jpl.imce.oml.specification.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import jpl.imce.oml.specification.idea.lang.OntologicalModelingLanguageElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import jpl.imce.oml.specification.services.OntologicalModelingLanguageGrammarAccess;

import com.intellij.lang.PsiBuilder;
}

@parser::members {

	protected OntologicalModelingLanguageGrammarAccess grammarAccess;

	protected OntologicalModelingLanguageElementTypeProvider elementTypeProvider;

	public PsiInternalOntologicalModelingLanguageParser(PsiBuilder builder, TokenStream input, OntologicalModelingLanguageElementTypeProvider elementTypeProvider, OntologicalModelingLanguageGrammarAccess grammarAccess) {
		this(input);
		setPsiBuilder(builder);
		this.grammarAccess = grammarAccess;
		this.elementTypeProvider = elementTypeProvider;
	}

	@Override
	protected String getFirstRuleName() {
		return "TerminologyExtent";
	}

}

//Entry rule entryRuleTerminologyExtent
entryRuleTerminologyExtent returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getTerminologyExtentElementType()); }
	iv_ruleTerminologyExtent=ruleTerminologyExtent
	{ $current=$iv_ruleTerminologyExtent.current; }
	EOF;

// Rule TerminologyExtent
ruleTerminologyExtent returns [Boolean current=false]
:
	(
		(
			{
				precedeComposite(elementTypeProvider.getTerminologyExtent_TerminologyExtentAction_0ElementType());
				doneComposite();
				associateWithSemanticElement();
			}
		)
		(
			(
				{
					markComposite(elementTypeProvider.getTerminologyExtent_AnnotationPropertiesAnnotationPropertyParserRuleCall_1_0ElementType());
				}
				lv_annotationProperties_1_0=ruleAnnotationProperty
				{
					doneComposite();
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
			)
		)*
		(
			(
				{
					markComposite(elementTypeProvider.getTerminologyExtent_TerminologyGraphsTerminologyGraphParserRuleCall_2_0ElementType());
				}
				lv_terminologyGraphs_2_0=ruleTerminologyGraph
				{
					doneComposite();
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
			)
		)*
		(
			(
				{
					markComposite(elementTypeProvider.getTerminologyExtent_BundlesBundleParserRuleCall_3_0ElementType());
				}
				lv_bundles_3_0=ruleBundle
				{
					doneComposite();
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
			)
		)*
	)
;

//Entry rule entryRuleAnnotationProperty
entryRuleAnnotationProperty returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getAnnotationPropertyElementType()); }
	iv_ruleAnnotationProperty=ruleAnnotationProperty
	{ $current=$iv_ruleAnnotationProperty.current; }
	EOF;

// Rule AnnotationProperty
ruleAnnotationProperty returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getAnnotationProperty_ANNOTATION_PROPERTY_TOKENTerminalRuleCall_0ElementType());
		}
		this_ANNOTATION_PROPERTY_TOKEN_0=RULE_ANNOTATION_PROPERTY_TOKEN
		{
			doneLeaf(this_ANNOTATION_PROPERTY_TOKEN_0);
		}
		(
			(
				{
					markComposite(elementTypeProvider.getAnnotationProperty_AbbrevIRIABBREV_IRIParserRuleCall_1_0ElementType());
				}
				lv_abbrevIRI_1_0=ruleABBREV_IRI
				{
					doneComposite();
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getAnnotationProperty_EQUALTerminalRuleCall_2ElementType());
		}
		this_EQUAL_2=RULE_EQUAL
		{
			doneLeaf(this_EQUAL_2);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getAnnotationProperty_IriIRITerminalRuleCall_3_0ElementType());
				}
				lv_iri_3_0=RULE_IRI
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_iri_3_0);
				}
			)
		)
	)
;

//Entry rule entryRuleAnnotation
entryRuleAnnotation returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getAnnotationElementType()); }
	iv_ruleAnnotation=ruleAnnotation
	{ $current=$iv_ruleAnnotation.current; }
	EOF;

// Rule Annotation
ruleAnnotation returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getAnnotation_ANNOTATION_TOKENTerminalRuleCall_0ElementType());
		}
		this_ANNOTATION_TOKEN_0=RULE_ANNOTATION_TOKEN
		{
			doneLeaf(this_ANNOTATION_TOKEN_0);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getAnnotation_PropertyAnnotationPropertyCrossReference_1_0ElementType());
				}
				ruleABBREV_IRI
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getAnnotation_EQUALTerminalRuleCall_2ElementType());
		}
		this_EQUAL_2=RULE_EQUAL
		{
			doneLeaf(this_EQUAL_2);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getAnnotation_ValueSTRINGTerminalRuleCall_3_0ElementType());
				}
				lv_value_3_0=RULE_STRING
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_value_3_0);
				}
			)
		)
	)
;

//Entry rule entryRuleTerminologyGraph
entryRuleTerminologyGraph returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getTerminologyGraphElementType()); }
	iv_ruleTerminologyGraph=ruleTerminologyGraph
	{ $current=$iv_ruleTerminologyGraph.current; }
	EOF;

// Rule TerminologyGraph
ruleTerminologyGraph returns [Boolean current=false]
:
	(
		(
			(
				{
					markComposite(elementTypeProvider.getTerminologyGraph_KindTerminologyGraphKindEnumRuleCall_0_0ElementType());
				}
				lv_kind_0_0=ruleTerminologyGraphKind
				{
					doneComposite();
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getTerminologyGraph_TERMINOLOGY_GRAPH_TOKENTerminalRuleCall_1ElementType());
		}
		this_TERMINOLOGY_GRAPH_TOKEN_1=RULE_TERMINOLOGY_GRAPH_TOKEN
		{
			doneLeaf(this_TERMINOLOGY_GRAPH_TOKEN_1);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getTerminologyGraph_IriIRITerminalRuleCall_2_0ElementType());
				}
				lv_iri_2_0=RULE_IRI
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_iri_2_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getTerminologyGraph_LCURLYTerminalRuleCall_3ElementType());
		}
		this_LCURLY_3=RULE_LCURLY
		{
			doneLeaf(this_LCURLY_3);
		}
		(
			(
				(
					{
						markComposite(elementTypeProvider.getTerminologyGraph_AnnotationsAnnotationParserRuleCall_4_0_0ElementType());
					}
					lv_annotations_4_0=ruleAnnotation
					{
						doneComposite();
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
				)
			)
			    |
			(
				(
					{
						markComposite(elementTypeProvider.getTerminologyGraph_TerminologyBoxAxiomsTerminologyBoxAxiomParserRuleCall_4_1_0ElementType());
					}
					lv_terminologyBoxAxioms_5_0=ruleTerminologyBoxAxiom
					{
						doneComposite();
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
				)
			)
			    |
			(
				(
					{
						markComposite(elementTypeProvider.getTerminologyGraph_BoxStatementsTerminologyBoxStatementParserRuleCall_4_2_0ElementType());
					}
					lv_boxStatements_6_0=ruleTerminologyBoxStatement
					{
						doneComposite();
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
				)
			)
		)*
		{
			markLeaf(elementTypeProvider.getTerminologyGraph_RCURLYTerminalRuleCall_5ElementType());
		}
		this_RCURLY_7=RULE_RCURLY
		{
			doneLeaf(this_RCURLY_7);
		}
	)
;

//Entry rule entryRuleBundle
entryRuleBundle returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getBundleElementType()); }
	iv_ruleBundle=ruleBundle
	{ $current=$iv_ruleBundle.current; }
	EOF;

// Rule Bundle
ruleBundle returns [Boolean current=false]
:
	(
		(
			(
				{
					markComposite(elementTypeProvider.getBundle_KindTerminologyGraphKindEnumRuleCall_0_0ElementType());
				}
				lv_kind_0_0=ruleTerminologyGraphKind
				{
					doneComposite();
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getBundle_BUNDLE_TOKENTerminalRuleCall_1ElementType());
		}
		this_BUNDLE_TOKEN_1=RULE_BUNDLE_TOKEN
		{
			doneLeaf(this_BUNDLE_TOKEN_1);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getBundle_IriIRITerminalRuleCall_2_0ElementType());
				}
				lv_iri_2_0=RULE_IRI
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_iri_2_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getBundle_LCURLYTerminalRuleCall_3ElementType());
		}
		this_LCURLY_3=RULE_LCURLY
		{
			doneLeaf(this_LCURLY_3);
		}
		(
			(
				(
					{
						markComposite(elementTypeProvider.getBundle_AnnotationsAnnotationParserRuleCall_4_0_0ElementType());
					}
					lv_annotations_4_0=ruleAnnotation
					{
						doneComposite();
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
				)
			)
			    |
			(
				(
					{
						markComposite(elementTypeProvider.getBundle_TerminologyBoxAxiomsTerminologyBoxAxiomParserRuleCall_4_1_0ElementType());
					}
					lv_terminologyBoxAxioms_5_0=ruleTerminologyBoxAxiom
					{
						doneComposite();
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
				)
			)
			    |
			(
				(
					{
						markComposite(elementTypeProvider.getBundle_BoxStatementsTerminologyBoxStatementParserRuleCall_4_2_0ElementType());
					}
					lv_boxStatements_6_0=ruleTerminologyBoxStatement
					{
						doneComposite();
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
				)
			)
			    |
			(
				(
					{
						markComposite(elementTypeProvider.getBundle_BundleStatementsTerminologyBundleStatementParserRuleCall_4_3_0ElementType());
					}
					lv_bundleStatements_7_0=ruleTerminologyBundleStatement
					{
						doneComposite();
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
				)
			)
			    |
			(
				(
					{
						markComposite(elementTypeProvider.getBundle_TerminologyBundleAxiomsTerminologyBundleAxiomParserRuleCall_4_4_0ElementType());
					}
					lv_terminologyBundleAxioms_8_0=ruleTerminologyBundleAxiom
					{
						doneComposite();
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
				)
			)
		)*
		{
			markLeaf(elementTypeProvider.getBundle_RCURLYTerminalRuleCall_5ElementType());
		}
		this_RCURLY_9=RULE_RCURLY
		{
			doneLeaf(this_RCURLY_9);
		}
	)
;

//Entry rule entryRuleTerminologyBoxAxiom
entryRuleTerminologyBoxAxiom returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getTerminologyBoxAxiomElementType()); }
	iv_ruleTerminologyBoxAxiom=ruleTerminologyBoxAxiom
	{ $current=$iv_ruleTerminologyBoxAxiom.current; }
	EOF;

// Rule TerminologyBoxAxiom
ruleTerminologyBoxAxiom returns [Boolean current=false]
:
	(
		{
			markComposite(elementTypeProvider.getTerminologyBoxAxiom_ConceptDesignationTerminologyAxiomParserRuleCall_0ElementType());
		}
		this_ConceptDesignationTerminologyAxiom_0=ruleConceptDesignationTerminologyAxiom
		{
			$current = $this_ConceptDesignationTerminologyAxiom_0.current;
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getTerminologyBoxAxiom_TerminologyExtensionAxiomParserRuleCall_1ElementType());
		}
		this_TerminologyExtensionAxiom_1=ruleTerminologyExtensionAxiom
		{
			$current = $this_TerminologyExtensionAxiom_1.current;
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getTerminologyBoxAxiom_TerminologyNestingAxiomParserRuleCall_2ElementType());
		}
		this_TerminologyNestingAxiom_2=ruleTerminologyNestingAxiom
		{
			$current = $this_TerminologyNestingAxiom_2.current;
			doneComposite();
		}
	)
;

//Entry rule entryRuleTerminologyBoxStatement
entryRuleTerminologyBoxStatement returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getTerminologyBoxStatementElementType()); }
	iv_ruleTerminologyBoxStatement=ruleTerminologyBoxStatement
	{ $current=$iv_ruleTerminologyBoxStatement.current; }
	EOF;

// Rule TerminologyBoxStatement
ruleTerminologyBoxStatement returns [Boolean current=false]
:
	(
		{
			markComposite(elementTypeProvider.getTerminologyBoxStatement_AxiomParserRuleCall_0ElementType());
		}
		this_Axiom_0=ruleAxiom
		{
			$current = $this_Axiom_0.current;
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getTerminologyBoxStatement_TermParserRuleCall_1ElementType());
		}
		this_Term_1=ruleTerm
		{
			$current = $this_Term_1.current;
			doneComposite();
		}
	)
;

//Entry rule entryRuleTerm
entryRuleTerm returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getTermElementType()); }
	iv_ruleTerm=ruleTerm
	{ $current=$iv_ruleTerm.current; }
	EOF;

// Rule Term
ruleTerm returns [Boolean current=false]
:
	(
		{
			markComposite(elementTypeProvider.getTerm_AtomicEntityParserRuleCall_0ElementType());
		}
		this_AtomicEntity_0=ruleAtomicEntity
		{
			$current = $this_AtomicEntity_0.current;
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getTerm_EntityRelationshipParserRuleCall_1ElementType());
		}
		this_EntityRelationship_1=ruleEntityRelationship
		{
			$current = $this_EntityRelationship_1.current;
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getTerm_DatatypeParserRuleCall_2ElementType());
		}
		this_Datatype_2=ruleDatatype
		{
			$current = $this_Datatype_2.current;
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getTerm_DataRelationshipParserRuleCall_3ElementType());
		}
		this_DataRelationship_3=ruleDataRelationship
		{
			$current = $this_DataRelationship_3.current;
			doneComposite();
		}
	)
;

//Entry rule entryRuleAtomicEntity
entryRuleAtomicEntity returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getAtomicEntityElementType()); }
	iv_ruleAtomicEntity=ruleAtomicEntity
	{ $current=$iv_ruleAtomicEntity.current; }
	EOF;

// Rule AtomicEntity
ruleAtomicEntity returns [Boolean current=false]
:
	(
		{
			markComposite(elementTypeProvider.getAtomicEntity_AspectParserRuleCall_0ElementType());
		}
		this_Aspect_0=ruleAspect
		{
			$current = $this_Aspect_0.current;
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getAtomicEntity_ConceptParserRuleCall_1ElementType());
		}
		this_Concept_1=ruleConcept
		{
			$current = $this_Concept_1.current;
			doneComposite();
		}
	)
;

//Entry rule entryRuleEntityRelationship
entryRuleEntityRelationship returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getEntityRelationshipElementType()); }
	iv_ruleEntityRelationship=ruleEntityRelationship
	{ $current=$iv_ruleEntityRelationship.current; }
	EOF;

// Rule EntityRelationship
ruleEntityRelationship returns [Boolean current=false]
:
	(
		{
			markComposite(elementTypeProvider.getEntityRelationship_ReifiedRelationshipParserRuleCall_0ElementType());
		}
		this_ReifiedRelationship_0=ruleReifiedRelationship
		{
			$current = $this_ReifiedRelationship_0.current;
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getEntityRelationship_UnreifiedRelationshipParserRuleCall_1ElementType());
		}
		this_UnreifiedRelationship_1=ruleUnreifiedRelationship
		{
			$current = $this_UnreifiedRelationship_1.current;
			doneComposite();
		}
	)
;

//Entry rule entryRuleDatatype
entryRuleDatatype returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getDatatypeElementType()); }
	iv_ruleDatatype=ruleDatatype
	{ $current=$iv_ruleDatatype.current; }
	EOF;

// Rule Datatype
ruleDatatype returns [Boolean current=false]
:
	(
		{
			markComposite(elementTypeProvider.getDatatype_ScalarDataRangeParserRuleCall_0ElementType());
		}
		this_ScalarDataRange_0=ruleScalarDataRange
		{
			$current = $this_ScalarDataRange_0.current;
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getDatatype_StructureParserRuleCall_1ElementType());
		}
		this_Structure_1=ruleStructure
		{
			$current = $this_Structure_1.current;
			doneComposite();
		}
	)
;

//Entry rule entryRuleScalarDataRange
entryRuleScalarDataRange returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getScalarDataRangeElementType()); }
	iv_ruleScalarDataRange=ruleScalarDataRange
	{ $current=$iv_ruleScalarDataRange.current; }
	EOF;

// Rule ScalarDataRange
ruleScalarDataRange returns [Boolean current=false]
:
	(
		{
			markComposite(elementTypeProvider.getScalarDataRange_ScalarParserRuleCall_0ElementType());
		}
		this_Scalar_0=ruleScalar
		{
			$current = $this_Scalar_0.current;
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getScalarDataRange_RestrictedDataRangeParserRuleCall_1ElementType());
		}
		this_RestrictedDataRange_1=ruleRestrictedDataRange
		{
			$current = $this_RestrictedDataRange_1.current;
			doneComposite();
		}
	)
;

//Entry rule entryRuleRestrictedDataRange
entryRuleRestrictedDataRange returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getRestrictedDataRangeElementType()); }
	iv_ruleRestrictedDataRange=ruleRestrictedDataRange
	{ $current=$iv_ruleRestrictedDataRange.current; }
	EOF;

// Rule RestrictedDataRange
ruleRestrictedDataRange returns [Boolean current=false]
:
	(
		{
			markComposite(elementTypeProvider.getRestrictedDataRange_BinaryScalarRestrictionParserRuleCall_0ElementType());
		}
		this_BinaryScalarRestriction_0=ruleBinaryScalarRestriction
		{
			$current = $this_BinaryScalarRestriction_0.current;
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getRestrictedDataRange_IRIScalarRestrictionParserRuleCall_1ElementType());
		}
		this_IRIScalarRestriction_1=ruleIRIScalarRestriction
		{
			$current = $this_IRIScalarRestriction_1.current;
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getRestrictedDataRange_NumericScalarRestrictionParserRuleCall_2ElementType());
		}
		this_NumericScalarRestriction_2=ruleNumericScalarRestriction
		{
			$current = $this_NumericScalarRestriction_2.current;
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getRestrictedDataRange_PlainLiteralScalarRestrictionParserRuleCall_3ElementType());
		}
		this_PlainLiteralScalarRestriction_3=rulePlainLiteralScalarRestriction
		{
			$current = $this_PlainLiteralScalarRestriction_3.current;
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getRestrictedDataRange_ScalarOneOfRestrictionParserRuleCall_4ElementType());
		}
		this_ScalarOneOfRestriction_4=ruleScalarOneOfRestriction
		{
			$current = $this_ScalarOneOfRestriction_4.current;
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getRestrictedDataRange_StringScalarRestrictionParserRuleCall_5ElementType());
		}
		this_StringScalarRestriction_5=ruleStringScalarRestriction
		{
			$current = $this_StringScalarRestriction_5.current;
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getRestrictedDataRange_SynonymScalarRestrictionParserRuleCall_6ElementType());
		}
		this_SynonymScalarRestriction_6=ruleSynonymScalarRestriction
		{
			$current = $this_SynonymScalarRestriction_6.current;
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getRestrictedDataRange_TimeScalarRestrictionParserRuleCall_7ElementType());
		}
		this_TimeScalarRestriction_7=ruleTimeScalarRestriction
		{
			$current = $this_TimeScalarRestriction_7.current;
			doneComposite();
		}
	)
;

//Entry rule entryRuleDataRelationship
entryRuleDataRelationship returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getDataRelationshipElementType()); }
	iv_ruleDataRelationship=ruleDataRelationship
	{ $current=$iv_ruleDataRelationship.current; }
	EOF;

// Rule DataRelationship
ruleDataRelationship returns [Boolean current=false]
:
	(
		{
			markComposite(elementTypeProvider.getDataRelationship_EntityStructuredDataPropertyParserRuleCall_0ElementType());
		}
		this_EntityStructuredDataProperty_0=ruleEntityStructuredDataProperty
		{
			$current = $this_EntityStructuredDataProperty_0.current;
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getDataRelationship_EntityScalarDataPropertyParserRuleCall_1ElementType());
		}
		this_EntityScalarDataProperty_1=ruleEntityScalarDataProperty
		{
			$current = $this_EntityScalarDataProperty_1.current;
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getDataRelationship_StructuredDataPropertyParserRuleCall_2ElementType());
		}
		this_StructuredDataProperty_2=ruleStructuredDataProperty
		{
			$current = $this_StructuredDataProperty_2.current;
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getDataRelationship_ScalarDataPropertyParserRuleCall_3ElementType());
		}
		this_ScalarDataProperty_3=ruleScalarDataProperty
		{
			$current = $this_ScalarDataProperty_3.current;
			doneComposite();
		}
	)
;

//Entry rule entryRuleAxiom
entryRuleAxiom returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getAxiomElementType()); }
	iv_ruleAxiom=ruleAxiom
	{ $current=$iv_ruleAxiom.current; }
	EOF;

// Rule Axiom
ruleAxiom returns [Boolean current=false]
:
	(
		{
			markComposite(elementTypeProvider.getAxiom_ScalarOneOfLiteralAxiomParserRuleCall_0ElementType());
		}
		this_ScalarOneOfLiteralAxiom_0=ruleScalarOneOfLiteralAxiom
		{
			$current = $this_ScalarOneOfLiteralAxiom_0.current;
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getAxiom_TermAxiomParserRuleCall_1ElementType());
		}
		this_TermAxiom_1=ruleTermAxiom
		{
			$current = $this_TermAxiom_1.current;
			doneComposite();
		}
	)
;

//Entry rule entryRuleTermAxiom
entryRuleTermAxiom returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getTermAxiomElementType()); }
	iv_ruleTermAxiom=ruleTermAxiom
	{ $current=$iv_ruleTermAxiom.current; }
	EOF;

// Rule TermAxiom
ruleTermAxiom returns [Boolean current=false]
:
	(
		{
			markComposite(elementTypeProvider.getTermAxiom_EntityRestrictionAxiomParserRuleCall_0ElementType());
		}
		this_EntityRestrictionAxiom_0=ruleEntityRestrictionAxiom
		{
			$current = $this_EntityRestrictionAxiom_0.current;
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getTermAxiom_EntityScalarDataPropertyRestrictionAxiomParserRuleCall_1ElementType());
		}
		this_EntityScalarDataPropertyRestrictionAxiom_1=ruleEntityScalarDataPropertyRestrictionAxiom
		{
			$current = $this_EntityScalarDataPropertyRestrictionAxiom_1.current;
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getTermAxiom_SpecializationAxiomParserRuleCall_2ElementType());
		}
		this_SpecializationAxiom_2=ruleSpecializationAxiom
		{
			$current = $this_SpecializationAxiom_2.current;
			doneComposite();
		}
	)
;

//Entry rule entryRuleEntityRestrictionAxiom
entryRuleEntityRestrictionAxiom returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getEntityRestrictionAxiomElementType()); }
	iv_ruleEntityRestrictionAxiom=ruleEntityRestrictionAxiom
	{ $current=$iv_ruleEntityRestrictionAxiom.current; }
	EOF;

// Rule EntityRestrictionAxiom
ruleEntityRestrictionAxiom returns [Boolean current=false]
:
	(
		{
			markComposite(elementTypeProvider.getEntityRestrictionAxiom_EntityExistentialRestrictionAxiomParserRuleCall_0ElementType());
		}
		this_EntityExistentialRestrictionAxiom_0=ruleEntityExistentialRestrictionAxiom
		{
			$current = $this_EntityExistentialRestrictionAxiom_0.current;
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getEntityRestrictionAxiom_EntityUniversalRestrictionAxiomParserRuleCall_1ElementType());
		}
		this_EntityUniversalRestrictionAxiom_1=ruleEntityUniversalRestrictionAxiom
		{
			$current = $this_EntityUniversalRestrictionAxiom_1.current;
			doneComposite();
		}
	)
;

//Entry rule entryRuleEntityScalarDataPropertyRestrictionAxiom
entryRuleEntityScalarDataPropertyRestrictionAxiom returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getEntityScalarDataPropertyRestrictionAxiomElementType()); }
	iv_ruleEntityScalarDataPropertyRestrictionAxiom=ruleEntityScalarDataPropertyRestrictionAxiom
	{ $current=$iv_ruleEntityScalarDataPropertyRestrictionAxiom.current; }
	EOF;

// Rule EntityScalarDataPropertyRestrictionAxiom
ruleEntityScalarDataPropertyRestrictionAxiom returns [Boolean current=false]
:
	(
		{
			markComposite(elementTypeProvider.getEntityScalarDataPropertyRestrictionAxiom_EntityScalarDataPropertyExistentialRestrictionAxiomParserRuleCall_0ElementType());
		}
		this_EntityScalarDataPropertyExistentialRestrictionAxiom_0=ruleEntityScalarDataPropertyExistentialRestrictionAxiom
		{
			$current = $this_EntityScalarDataPropertyExistentialRestrictionAxiom_0.current;
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getEntityScalarDataPropertyRestrictionAxiom_EntityScalarDataPropertyParticularRestrictionAxiomParserRuleCall_1ElementType());
		}
		this_EntityScalarDataPropertyParticularRestrictionAxiom_1=ruleEntityScalarDataPropertyParticularRestrictionAxiom
		{
			$current = $this_EntityScalarDataPropertyParticularRestrictionAxiom_1.current;
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getEntityScalarDataPropertyRestrictionAxiom_EntityScalarDataPropertyUniversalRestrictionAxiomParserRuleCall_2ElementType());
		}
		this_EntityScalarDataPropertyUniversalRestrictionAxiom_2=ruleEntityScalarDataPropertyUniversalRestrictionAxiom
		{
			$current = $this_EntityScalarDataPropertyUniversalRestrictionAxiom_2.current;
			doneComposite();
		}
	)
;

//Entry rule entryRuleSpecializationAxiom
entryRuleSpecializationAxiom returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getSpecializationAxiomElementType()); }
	iv_ruleSpecializationAxiom=ruleSpecializationAxiom
	{ $current=$iv_ruleSpecializationAxiom.current; }
	EOF;

// Rule SpecializationAxiom
ruleSpecializationAxiom returns [Boolean current=false]
:
	(
		{
			markComposite(elementTypeProvider.getSpecializationAxiom_ConceptSpecializationAxiomParserRuleCall_0ElementType());
		}
		this_ConceptSpecializationAxiom_0=ruleConceptSpecializationAxiom
		{
			$current = $this_ConceptSpecializationAxiom_0.current;
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getSpecializationAxiom_AspectSpecializationAxiomParserRuleCall_1ElementType());
		}
		this_AspectSpecializationAxiom_1=ruleAspectSpecializationAxiom
		{
			$current = $this_AspectSpecializationAxiom_1.current;
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getSpecializationAxiom_ReifiedRelationshipSpecializationAxiomParserRuleCall_2ElementType());
		}
		this_ReifiedRelationshipSpecializationAxiom_2=ruleReifiedRelationshipSpecializationAxiom
		{
			$current = $this_ReifiedRelationshipSpecializationAxiom_2.current;
			doneComposite();
		}
	)
;

//Entry rule entryRuleTerminologyBundleStatement
entryRuleTerminologyBundleStatement returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getTerminologyBundleStatementElementType()); }
	iv_ruleTerminologyBundleStatement=ruleTerminologyBundleStatement
	{ $current=$iv_ruleTerminologyBundleStatement.current; }
	EOF;

// Rule TerminologyBundleStatement
ruleTerminologyBundleStatement returns [Boolean current=false]
:
	(
		{
			markComposite(elementTypeProvider.getTerminologyBundleStatement_AnonymousConceptTaxonomyAxiomParserRuleCall_0ElementType());
		}
		this_AnonymousConceptTaxonomyAxiom_0=ruleAnonymousConceptTaxonomyAxiom
		{
			$current = $this_AnonymousConceptTaxonomyAxiom_0.current;
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getTerminologyBundleStatement_RootConceptTaxonomyAxiomParserRuleCall_1ElementType());
		}
		this_RootConceptTaxonomyAxiom_1=ruleRootConceptTaxonomyAxiom
		{
			$current = $this_RootConceptTaxonomyAxiom_1.current;
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getTerminologyBundleStatement_SpecificDisjointConceptAxiomParserRuleCall_2ElementType());
		}
		this_SpecificDisjointConceptAxiom_2=ruleSpecificDisjointConceptAxiom
		{
			$current = $this_SpecificDisjointConceptAxiom_2.current;
			doneComposite();
		}
	)
;

//Entry rule entryRuleTerminologyBundleAxiom
entryRuleTerminologyBundleAxiom returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getTerminologyBundleAxiomElementType()); }
	iv_ruleTerminologyBundleAxiom=ruleTerminologyBundleAxiom
	{ $current=$iv_ruleTerminologyBundleAxiom.current; }
	EOF;

// Rule TerminologyBundleAxiom
ruleTerminologyBundleAxiom returns [Boolean current=false]
:
	{
		markComposite(elementTypeProvider.getTerminologyBundleAxiom_BundledTerminologyAxiomParserRuleCallElementType());
	}
	this_BundledTerminologyAxiom_0=ruleBundledTerminologyAxiom
	{
		$current = $this_BundledTerminologyAxiom_0.current;
		doneComposite();
	}
;

//Entry rule entryRuleAspect
entryRuleAspect returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getAspectElementType()); }
	iv_ruleAspect=ruleAspect
	{ $current=$iv_ruleAspect.current; }
	EOF;

// Rule Aspect
ruleAspect returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getAspect_ASPECT_TOKENTerminalRuleCall_0ElementType());
		}
		this_ASPECT_TOKEN_0=RULE_ASPECT_TOKEN
		{
			doneLeaf(this_ASPECT_TOKEN_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getAspect_NameIDTerminalRuleCall_1_0ElementType());
				}
				lv_name_1_0=RULE_ID
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_name_1_0);
				}
			)
		)
	)
;

//Entry rule entryRuleConcept
entryRuleConcept returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getConceptElementType()); }
	iv_ruleConcept=ruleConcept
	{ $current=$iv_ruleConcept.current; }
	EOF;

// Rule Concept
ruleConcept returns [Boolean current=false]
:
	(
		(
			(
				{
					markLeaf(elementTypeProvider.getConcept_IsAbstractABSTRACT_TOKENTerminalRuleCall_0_0ElementType());
				}
				lv_isAbstract_0_0=RULE_ABSTRACT_TOKEN
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_isAbstract_0_0);
				}
			)
		)?
		{
			markLeaf(elementTypeProvider.getConcept_CONCEPT_TOKENTerminalRuleCall_1ElementType());
		}
		this_CONCEPT_TOKEN_1=RULE_CONCEPT_TOKEN
		{
			doneLeaf(this_CONCEPT_TOKEN_1);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getConcept_NameIDTerminalRuleCall_2_0ElementType());
				}
				lv_name_2_0=RULE_ID
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_name_2_0);
				}
			)
		)
	)
;

//Entry rule entryRuleReifiedRelationship
entryRuleReifiedRelationship returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getReifiedRelationshipElementType()); }
	iv_ruleReifiedRelationship=ruleReifiedRelationship
	{ $current=$iv_ruleReifiedRelationship.current; }
	EOF;

// Rule ReifiedRelationship
ruleReifiedRelationship returns [Boolean current=false]
:
	(
		(
			(
				{
					markLeaf(elementTypeProvider.getReifiedRelationship_IsAbstractABSTRACT_TOKENTerminalRuleCall_0_0ElementType());
				}
				lv_isAbstract_0_0=RULE_ABSTRACT_TOKEN
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_isAbstract_0_0);
				}
			)
		)?
		{
			markLeaf(elementTypeProvider.getReifiedRelationship_REIFIED_RELATIONSHIP_TOKENTerminalRuleCall_1ElementType());
		}
		this_REIFIED_RELATIONSHIP_TOKEN_1=RULE_REIFIED_RELATIONSHIP_TOKEN
		{
			doneLeaf(this_REIFIED_RELATIONSHIP_TOKEN_1);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getReifiedRelationship_NameIDTerminalRuleCall_2_0ElementType());
				}
				lv_name_2_0=RULE_ID
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_name_2_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getReifiedRelationship_LCURLYTerminalRuleCall_3ElementType());
		}
		this_LCURLY_3=RULE_LCURLY
		{
			doneLeaf(this_LCURLY_3);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getReifiedRelationship_IsFunctionalFUNCTIONAL_TOKENTerminalRuleCall_4_0ElementType());
				}
				lv_isFunctional_4_0=RULE_FUNCTIONAL_TOKEN
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_isFunctional_4_0);
				}
			)
		)?
		(
			(
				{
					markLeaf(elementTypeProvider.getReifiedRelationship_IsInverseFunctionalINVERSE_FUNCTIONAL_TOKENTerminalRuleCall_5_0ElementType());
				}
				lv_isInverseFunctional_5_0=RULE_INVERSE_FUNCTIONAL_TOKEN
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_isInverseFunctional_5_0);
				}
			)
		)?
		(
			(
				{
					markLeaf(elementTypeProvider.getReifiedRelationship_IsEssentialESSENTIAL_TOKENTerminalRuleCall_6_0ElementType());
				}
				lv_isEssential_6_0=RULE_ESSENTIAL_TOKEN
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_isEssential_6_0);
				}
			)
		)?
		(
			(
				{
					markLeaf(elementTypeProvider.getReifiedRelationship_IsInverseEssentialINVERSE_ESSENTIAL_TOKENTerminalRuleCall_7_0ElementType());
				}
				lv_isInverseEssential_7_0=RULE_INVERSE_ESSENTIAL_TOKEN
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_isInverseEssential_7_0);
				}
			)
		)?
		(
			(
				{
					markLeaf(elementTypeProvider.getReifiedRelationship_IsSymmetricSYMMETRIC_TOKENTerminalRuleCall_8_0ElementType());
				}
				lv_isSymmetric_8_0=RULE_SYMMETRIC_TOKEN
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_isSymmetric_8_0);
				}
			)
		)?
		(
			(
				{
					markLeaf(elementTypeProvider.getReifiedRelationship_IsAsymmetricASYMMETRIC_TOKENTerminalRuleCall_9_0ElementType());
				}
				lv_isAsymmetric_9_0=RULE_ASYMMETRIC_TOKEN
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_isAsymmetric_9_0);
				}
			)
		)?
		(
			(
				{
					markLeaf(elementTypeProvider.getReifiedRelationship_IsReflexiveREFLEXIVE_TOKENTerminalRuleCall_10_0ElementType());
				}
				lv_isReflexive_10_0=RULE_REFLEXIVE_TOKEN
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_isReflexive_10_0);
				}
			)
		)?
		(
			(
				{
					markLeaf(elementTypeProvider.getReifiedRelationship_IsIrreflexiveIRREFLEXIVE_TOKENTerminalRuleCall_11_0ElementType());
				}
				lv_isIrreflexive_11_0=RULE_IRREFLEXIVE_TOKEN
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_isIrreflexive_11_0);
				}
			)
		)?
		(
			(
				{
					markLeaf(elementTypeProvider.getReifiedRelationship_IsTransitiveTRANSITIVE_TOKENTerminalRuleCall_12_0ElementType());
				}
				lv_isTransitive_12_0=RULE_TRANSITIVE_TOKEN
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_isTransitive_12_0);
				}
			)
		)?
		{
			markLeaf(elementTypeProvider.getReifiedRelationship_UNREIFIED_TOKENTerminalRuleCall_13ElementType());
		}
		this_UNREIFIED_TOKEN_13=RULE_UNREIFIED_TOKEN
		{
			doneLeaf(this_UNREIFIED_TOKEN_13);
		}
		{
			markLeaf(elementTypeProvider.getReifiedRelationship_EQUALTerminalRuleCall_14ElementType());
		}
		this_EQUAL_14=RULE_EQUAL
		{
			doneLeaf(this_EQUAL_14);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getReifiedRelationship_UnreifiedPropertyNameIDTerminalRuleCall_15_0ElementType());
				}
				lv_unreifiedPropertyName_15_0=RULE_ID
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_unreifiedPropertyName_15_0);
				}
			)
		)
		(
			{
				markLeaf(elementTypeProvider.getReifiedRelationship_INVERSE_TOKENTerminalRuleCall_16_0ElementType());
			}
			this_INVERSE_TOKEN_16=RULE_INVERSE_TOKEN
			{
				doneLeaf(this_INVERSE_TOKEN_16);
			}
			{
				markLeaf(elementTypeProvider.getReifiedRelationship_EQUALTerminalRuleCall_16_1ElementType());
			}
			this_EQUAL_17=RULE_EQUAL
			{
				doneLeaf(this_EQUAL_17);
			}
			(
				(
					{
						markLeaf(elementTypeProvider.getReifiedRelationship_UnreifiedInversePropertyNameIDTerminalRuleCall_16_2_0ElementType());
					}
					lv_unreifiedInversePropertyName_18_0=RULE_ID
					{
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
					{
						doneLeaf(lv_unreifiedInversePropertyName_18_0);
					}
				)
			)
		)?
		{
			markLeaf(elementTypeProvider.getReifiedRelationship_SOURCE_TOKENTerminalRuleCall_17ElementType());
		}
		this_SOURCE_TOKEN_19=RULE_SOURCE_TOKEN
		{
			doneLeaf(this_SOURCE_TOKEN_19);
		}
		{
			markLeaf(elementTypeProvider.getReifiedRelationship_EQUALTerminalRuleCall_18ElementType());
		}
		this_EQUAL_20=RULE_EQUAL
		{
			doneLeaf(this_EQUAL_20);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getReifiedRelationship_SourceEntityCrossReference_19_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getReifiedRelationship_TARGET_TOKENTerminalRuleCall_20ElementType());
		}
		this_TARGET_TOKEN_22=RULE_TARGET_TOKEN
		{
			doneLeaf(this_TARGET_TOKEN_22);
		}
		{
			markLeaf(elementTypeProvider.getReifiedRelationship_EQUALTerminalRuleCall_21ElementType());
		}
		this_EQUAL_23=RULE_EQUAL
		{
			doneLeaf(this_EQUAL_23);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getReifiedRelationship_TargetEntityCrossReference_22_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getReifiedRelationship_RCURLYTerminalRuleCall_23ElementType());
		}
		this_RCURLY_25=RULE_RCURLY
		{
			doneLeaf(this_RCURLY_25);
		}
	)
;

//Entry rule entryRuleUnreifiedRelationship
entryRuleUnreifiedRelationship returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getUnreifiedRelationshipElementType()); }
	iv_ruleUnreifiedRelationship=ruleUnreifiedRelationship
	{ $current=$iv_ruleUnreifiedRelationship.current; }
	EOF;

// Rule UnreifiedRelationship
ruleUnreifiedRelationship returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getUnreifiedRelationship_UNREIFIED_RELATIONSHIP_TOKENTerminalRuleCall_0ElementType());
		}
		this_UNREIFIED_RELATIONSHIP_TOKEN_0=RULE_UNREIFIED_RELATIONSHIP_TOKEN
		{
			doneLeaf(this_UNREIFIED_RELATIONSHIP_TOKEN_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getUnreifiedRelationship_NameIDTerminalRuleCall_1_0ElementType());
				}
				lv_name_1_0=RULE_ID
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_name_1_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getUnreifiedRelationship_LCURLYTerminalRuleCall_2ElementType());
		}
		this_LCURLY_2=RULE_LCURLY
		{
			doneLeaf(this_LCURLY_2);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getUnreifiedRelationship_IsFunctionalFUNCTIONAL_TOKENTerminalRuleCall_3_0ElementType());
				}
				lv_isFunctional_3_0=RULE_FUNCTIONAL_TOKEN
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_isFunctional_3_0);
				}
			)
		)?
		(
			(
				{
					markLeaf(elementTypeProvider.getUnreifiedRelationship_IsInverseFunctionalINVERSE_FUNCTIONAL_TOKENTerminalRuleCall_4_0ElementType());
				}
				lv_isInverseFunctional_4_0=RULE_INVERSE_FUNCTIONAL_TOKEN
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_isInverseFunctional_4_0);
				}
			)
		)?
		(
			(
				{
					markLeaf(elementTypeProvider.getUnreifiedRelationship_IsEssentialESSENTIAL_TOKENTerminalRuleCall_5_0ElementType());
				}
				lv_isEssential_5_0=RULE_ESSENTIAL_TOKEN
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_isEssential_5_0);
				}
			)
		)?
		(
			(
				{
					markLeaf(elementTypeProvider.getUnreifiedRelationship_IsInverseEssentialINVERSE_ESSENTIAL_TOKENTerminalRuleCall_6_0ElementType());
				}
				lv_isInverseEssential_6_0=RULE_INVERSE_ESSENTIAL_TOKEN
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_isInverseEssential_6_0);
				}
			)
		)?
		(
			(
				{
					markLeaf(elementTypeProvider.getUnreifiedRelationship_IsSymmetricSYMMETRIC_TOKENTerminalRuleCall_7_0ElementType());
				}
				lv_isSymmetric_7_0=RULE_SYMMETRIC_TOKEN
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_isSymmetric_7_0);
				}
			)
		)?
		(
			(
				{
					markLeaf(elementTypeProvider.getUnreifiedRelationship_IsAsymmetricASYMMETRIC_TOKENTerminalRuleCall_8_0ElementType());
				}
				lv_isAsymmetric_8_0=RULE_ASYMMETRIC_TOKEN
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_isAsymmetric_8_0);
				}
			)
		)?
		(
			(
				{
					markLeaf(elementTypeProvider.getUnreifiedRelationship_IsReflexiveREFLEXIVE_TOKENTerminalRuleCall_9_0ElementType());
				}
				lv_isReflexive_9_0=RULE_REFLEXIVE_TOKEN
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_isReflexive_9_0);
				}
			)
		)?
		(
			(
				{
					markLeaf(elementTypeProvider.getUnreifiedRelationship_IsIrreflexiveIRREFLEXIVE_TOKENTerminalRuleCall_10_0ElementType());
				}
				lv_isIrreflexive_10_0=RULE_IRREFLEXIVE_TOKEN
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_isIrreflexive_10_0);
				}
			)
		)?
		(
			(
				{
					markLeaf(elementTypeProvider.getUnreifiedRelationship_IsTransitiveTRANSITIVE_TOKENTerminalRuleCall_11_0ElementType());
				}
				lv_isTransitive_11_0=RULE_TRANSITIVE_TOKEN
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_isTransitive_11_0);
				}
			)
		)?
		{
			markLeaf(elementTypeProvider.getUnreifiedRelationship_SOURCE_TOKENTerminalRuleCall_12ElementType());
		}
		this_SOURCE_TOKEN_12=RULE_SOURCE_TOKEN
		{
			doneLeaf(this_SOURCE_TOKEN_12);
		}
		{
			markLeaf(elementTypeProvider.getUnreifiedRelationship_EQUALTerminalRuleCall_13ElementType());
		}
		this_EQUAL_13=RULE_EQUAL
		{
			doneLeaf(this_EQUAL_13);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getUnreifiedRelationship_SourceEntityCrossReference_14_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getUnreifiedRelationship_TARGET_TOKENTerminalRuleCall_15ElementType());
		}
		this_TARGET_TOKEN_15=RULE_TARGET_TOKEN
		{
			doneLeaf(this_TARGET_TOKEN_15);
		}
		{
			markLeaf(elementTypeProvider.getUnreifiedRelationship_EQUALTerminalRuleCall_16ElementType());
		}
		this_EQUAL_16=RULE_EQUAL
		{
			doneLeaf(this_EQUAL_16);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getUnreifiedRelationship_TargetEntityCrossReference_17_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getUnreifiedRelationship_RCURLYTerminalRuleCall_18ElementType());
		}
		this_RCURLY_18=RULE_RCURLY
		{
			doneLeaf(this_RCURLY_18);
		}
	)
;

//Entry rule entryRuleScalar
entryRuleScalar returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getScalarElementType()); }
	iv_ruleScalar=ruleScalar
	{ $current=$iv_ruleScalar.current; }
	EOF;

// Rule Scalar
ruleScalar returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getScalar_SCALAR_TOKENTerminalRuleCall_0ElementType());
		}
		this_SCALAR_TOKEN_0=RULE_SCALAR_TOKEN
		{
			doneLeaf(this_SCALAR_TOKEN_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getScalar_NameIDTerminalRuleCall_1_0ElementType());
				}
				lv_name_1_0=RULE_ID
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_name_1_0);
				}
			)
		)
	)
;

//Entry rule entryRuleStructure
entryRuleStructure returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getStructureElementType()); }
	iv_ruleStructure=ruleStructure
	{ $current=$iv_ruleStructure.current; }
	EOF;

// Rule Structure
ruleStructure returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getStructure_STRUCTURE_TOKENTerminalRuleCall_0ElementType());
		}
		this_STRUCTURE_TOKEN_0=RULE_STRUCTURE_TOKEN
		{
			doneLeaf(this_STRUCTURE_TOKEN_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getStructure_NameIDTerminalRuleCall_1_0ElementType());
				}
				lv_name_1_0=RULE_ID
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_name_1_0);
				}
			)
		)
	)
;

//Entry rule entryRuleEntityStructuredDataProperty
entryRuleEntityStructuredDataProperty returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getEntityStructuredDataPropertyElementType()); }
	iv_ruleEntityStructuredDataProperty=ruleEntityStructuredDataProperty
	{ $current=$iv_ruleEntityStructuredDataProperty.current; }
	EOF;

// Rule EntityStructuredDataProperty
ruleEntityStructuredDataProperty returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getEntityStructuredDataProperty_EntityStructuredDataPropertyKeyword_0ElementType());
		}
		otherlv_0='entityStructuredDataProperty'
		{
			doneLeaf(otherlv_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getEntityStructuredDataProperty_NameIDTerminalRuleCall_1_0ElementType());
				}
				lv_name_1_0=RULE_ID
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_name_1_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getEntityStructuredDataProperty_LCURLYTerminalRuleCall_2ElementType());
		}
		this_LCURLY_2=RULE_LCURLY
		{
			doneLeaf(this_LCURLY_2);
		}
		{
			markLeaf(elementTypeProvider.getEntityStructuredDataProperty_DOMAIN_TOKENTerminalRuleCall_3ElementType());
		}
		this_DOMAIN_TOKEN_3=RULE_DOMAIN_TOKEN
		{
			doneLeaf(this_DOMAIN_TOKEN_3);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getEntityStructuredDataProperty_DomainEntityCrossReference_4_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getEntityStructuredDataProperty_RANGE_TOKENTerminalRuleCall_5ElementType());
		}
		this_RANGE_TOKEN_5=RULE_RANGE_TOKEN
		{
			doneLeaf(this_RANGE_TOKEN_5);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getEntityStructuredDataProperty_RangeStructureCrossReference_6_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getEntityStructuredDataProperty_RCURLYTerminalRuleCall_7ElementType());
		}
		this_RCURLY_7=RULE_RCURLY
		{
			doneLeaf(this_RCURLY_7);
		}
	)
;

//Entry rule entryRuleEntityScalarDataProperty
entryRuleEntityScalarDataProperty returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getEntityScalarDataPropertyElementType()); }
	iv_ruleEntityScalarDataProperty=ruleEntityScalarDataProperty
	{ $current=$iv_ruleEntityScalarDataProperty.current; }
	EOF;

// Rule EntityScalarDataProperty
ruleEntityScalarDataProperty returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getEntityScalarDataProperty_EntityScalarDataPropertyKeyword_0ElementType());
		}
		otherlv_0='entityScalarDataProperty'
		{
			doneLeaf(otherlv_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getEntityScalarDataProperty_NameIDTerminalRuleCall_1_0ElementType());
				}
				lv_name_1_0=RULE_ID
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_name_1_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getEntityScalarDataProperty_LCURLYTerminalRuleCall_2ElementType());
		}
		this_LCURLY_2=RULE_LCURLY
		{
			doneLeaf(this_LCURLY_2);
		}
		{
			markLeaf(elementTypeProvider.getEntityScalarDataProperty_DOMAIN_TOKENTerminalRuleCall_3ElementType());
		}
		this_DOMAIN_TOKEN_3=RULE_DOMAIN_TOKEN
		{
			doneLeaf(this_DOMAIN_TOKEN_3);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getEntityScalarDataProperty_DomainEntityCrossReference_4_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getEntityScalarDataProperty_RANGE_TOKENTerminalRuleCall_5ElementType());
		}
		this_RANGE_TOKEN_5=RULE_RANGE_TOKEN
		{
			doneLeaf(this_RANGE_TOKEN_5);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getEntityScalarDataProperty_RangeDataRangeCrossReference_6_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getEntityScalarDataProperty_RCURLYTerminalRuleCall_7ElementType());
		}
		this_RCURLY_7=RULE_RCURLY
		{
			doneLeaf(this_RCURLY_7);
		}
	)
;

//Entry rule entryRuleStructuredDataProperty
entryRuleStructuredDataProperty returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getStructuredDataPropertyElementType()); }
	iv_ruleStructuredDataProperty=ruleStructuredDataProperty
	{ $current=$iv_ruleStructuredDataProperty.current; }
	EOF;

// Rule StructuredDataProperty
ruleStructuredDataProperty returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getStructuredDataProperty_StructuredDataPropertyKeyword_0ElementType());
		}
		otherlv_0='structuredDataProperty'
		{
			doneLeaf(otherlv_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getStructuredDataProperty_NameIDTerminalRuleCall_1_0ElementType());
				}
				lv_name_1_0=RULE_ID
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_name_1_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getStructuredDataProperty_LCURLYTerminalRuleCall_2ElementType());
		}
		this_LCURLY_2=RULE_LCURLY
		{
			doneLeaf(this_LCURLY_2);
		}
		{
			markLeaf(elementTypeProvider.getStructuredDataProperty_DOMAIN_TOKENTerminalRuleCall_3ElementType());
		}
		this_DOMAIN_TOKEN_3=RULE_DOMAIN_TOKEN
		{
			doneLeaf(this_DOMAIN_TOKEN_3);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getStructuredDataProperty_DomainStructureCrossReference_4_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getStructuredDataProperty_RANGE_TOKENTerminalRuleCall_5ElementType());
		}
		this_RANGE_TOKEN_5=RULE_RANGE_TOKEN
		{
			doneLeaf(this_RANGE_TOKEN_5);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getStructuredDataProperty_RangeStructureCrossReference_6_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getStructuredDataProperty_RCURLYTerminalRuleCall_7ElementType());
		}
		this_RCURLY_7=RULE_RCURLY
		{
			doneLeaf(this_RCURLY_7);
		}
	)
;

//Entry rule entryRuleScalarDataProperty
entryRuleScalarDataProperty returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getScalarDataPropertyElementType()); }
	iv_ruleScalarDataProperty=ruleScalarDataProperty
	{ $current=$iv_ruleScalarDataProperty.current; }
	EOF;

// Rule ScalarDataProperty
ruleScalarDataProperty returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getScalarDataProperty_ScalarDataPropertyKeyword_0ElementType());
		}
		otherlv_0='scalarDataProperty'
		{
			doneLeaf(otherlv_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getScalarDataProperty_NameIDTerminalRuleCall_1_0ElementType());
				}
				lv_name_1_0=RULE_ID
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_name_1_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getScalarDataProperty_LCURLYTerminalRuleCall_2ElementType());
		}
		this_LCURLY_2=RULE_LCURLY
		{
			doneLeaf(this_LCURLY_2);
		}
		{
			markLeaf(elementTypeProvider.getScalarDataProperty_DOMAIN_TOKENTerminalRuleCall_3ElementType());
		}
		this_DOMAIN_TOKEN_3=RULE_DOMAIN_TOKEN
		{
			doneLeaf(this_DOMAIN_TOKEN_3);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getScalarDataProperty_DomainStructureCrossReference_4_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getScalarDataProperty_RANGE_TOKENTerminalRuleCall_5ElementType());
		}
		this_RANGE_TOKEN_5=RULE_RANGE_TOKEN
		{
			doneLeaf(this_RANGE_TOKEN_5);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getScalarDataProperty_RangeDataRangeCrossReference_6_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getScalarDataProperty_RCURLYTerminalRuleCall_7ElementType());
		}
		this_RCURLY_7=RULE_RCURLY
		{
			doneLeaf(this_RCURLY_7);
		}
	)
;

//Entry rule entryRuleAnonymousConceptTaxonomyAxiom
entryRuleAnonymousConceptTaxonomyAxiom returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getAnonymousConceptTaxonomyAxiomElementType()); }
	iv_ruleAnonymousConceptTaxonomyAxiom=ruleAnonymousConceptTaxonomyAxiom
	{ $current=$iv_ruleAnonymousConceptTaxonomyAxiom.current; }
	EOF;

// Rule AnonymousConceptTaxonomyAxiom
ruleAnonymousConceptTaxonomyAxiom returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getAnonymousConceptTaxonomyAxiom_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKENTerminalRuleCall_0ElementType());
		}
		this_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN_0=RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN
		{
			doneLeaf(this_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN_0);
		}
		{
			markLeaf(elementTypeProvider.getAnonymousConceptTaxonomyAxiom_LCURLYTerminalRuleCall_1ElementType());
		}
		this_LCURLY_1=RULE_LCURLY
		{
			doneLeaf(this_LCURLY_1);
		}
		{
			markLeaf(elementTypeProvider.getAnonymousConceptTaxonomyAxiom_DisjointTaxonomyParentKeyword_2ElementType());
		}
		otherlv_2='disjointTaxonomyParent'
		{
			doneLeaf(otherlv_2);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getAnonymousConceptTaxonomyAxiom_DisjointTaxonomyParentConceptTreeDisjunctionCrossReference_3_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getAnonymousConceptTaxonomyAxiom_RCURLYTerminalRuleCall_4ElementType());
		}
		this_RCURLY_4=RULE_RCURLY
		{
			doneLeaf(this_RCURLY_4);
		}
	)
;

//Entry rule entryRuleRootConceptTaxonomyAxiom
entryRuleRootConceptTaxonomyAxiom returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getRootConceptTaxonomyAxiomElementType()); }
	iv_ruleRootConceptTaxonomyAxiom=ruleRootConceptTaxonomyAxiom
	{ $current=$iv_ruleRootConceptTaxonomyAxiom.current; }
	EOF;

// Rule RootConceptTaxonomyAxiom
ruleRootConceptTaxonomyAxiom returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getRootConceptTaxonomyAxiom_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKENTerminalRuleCall_0ElementType());
		}
		this_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN_0=RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN
		{
			doneLeaf(this_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN_0);
		}
		{
			markLeaf(elementTypeProvider.getRootConceptTaxonomyAxiom_LCURLYTerminalRuleCall_1ElementType());
		}
		this_LCURLY_1=RULE_LCURLY
		{
			doneLeaf(this_LCURLY_1);
		}
		{
			markLeaf(elementTypeProvider.getRootConceptTaxonomyAxiom_RootKeyword_2ElementType());
		}
		otherlv_2='root'
		{
			doneLeaf(otherlv_2);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getRootConceptTaxonomyAxiom_RootConceptCrossReference_3_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getRootConceptTaxonomyAxiom_RCURLYTerminalRuleCall_4ElementType());
		}
		this_RCURLY_4=RULE_RCURLY
		{
			doneLeaf(this_RCURLY_4);
		}
	)
;

//Entry rule entryRuleSpecificDisjointConceptAxiom
entryRuleSpecificDisjointConceptAxiom returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getSpecificDisjointConceptAxiomElementType()); }
	iv_ruleSpecificDisjointConceptAxiom=ruleSpecificDisjointConceptAxiom
	{ $current=$iv_ruleSpecificDisjointConceptAxiom.current; }
	EOF;

// Rule SpecificDisjointConceptAxiom
ruleSpecificDisjointConceptAxiom returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getSpecificDisjointConceptAxiom_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKENTerminalRuleCall_0ElementType());
		}
		this_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN_0=RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN
		{
			doneLeaf(this_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN_0);
		}
		{
			markLeaf(elementTypeProvider.getSpecificDisjointConceptAxiom_LCURLYTerminalRuleCall_1ElementType());
		}
		this_LCURLY_1=RULE_LCURLY
		{
			doneLeaf(this_LCURLY_1);
		}
		{
			markLeaf(elementTypeProvider.getSpecificDisjointConceptAxiom_DisjointTaxonomyParentKeyword_2ElementType());
		}
		otherlv_2='disjointTaxonomyParent'
		{
			doneLeaf(otherlv_2);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getSpecificDisjointConceptAxiom_DisjointTaxonomyParentConceptTreeDisjunctionCrossReference_3_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getSpecificDisjointConceptAxiom_DisjointLeafKeyword_4ElementType());
		}
		otherlv_4='disjointLeaf'
		{
			doneLeaf(otherlv_4);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getSpecificDisjointConceptAxiom_DisjointLeafConceptCrossReference_5_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getSpecificDisjointConceptAxiom_RCURLYTerminalRuleCall_6ElementType());
		}
		this_RCURLY_6=RULE_RCURLY
		{
			doneLeaf(this_RCURLY_6);
		}
	)
;

//Entry rule entryRuleBundledTerminologyAxiom
entryRuleBundledTerminologyAxiom returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getBundledTerminologyAxiomElementType()); }
	iv_ruleBundledTerminologyAxiom=ruleBundledTerminologyAxiom
	{ $current=$iv_ruleBundledTerminologyAxiom.current; }
	EOF;

// Rule BundledTerminologyAxiom
ruleBundledTerminologyAxiom returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getBundledTerminologyAxiom_BUNDLED_TERMINOLOGY_AXIOM_TOKENTerminalRuleCall_0ElementType());
		}
		this_BUNDLED_TERMINOLOGY_AXIOM_TOKEN_0=RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN
		{
			doneLeaf(this_BUNDLED_TERMINOLOGY_AXIOM_TOKEN_0);
		}
		{
			markLeaf(elementTypeProvider.getBundledTerminologyAxiom_LCURLYTerminalRuleCall_1ElementType());
		}
		this_LCURLY_1=RULE_LCURLY
		{
			doneLeaf(this_LCURLY_1);
		}
		{
			markLeaf(elementTypeProvider.getBundledTerminologyAxiom_BundledTerminologyKeyword_2ElementType());
		}
		otherlv_2='bundledTerminology'
		{
			doneLeaf(otherlv_2);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getBundledTerminologyAxiom_BundledTerminologyTerminologyBoxCrossReference_3_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getBundledTerminologyAxiom_RCURLYTerminalRuleCall_4ElementType());
		}
		this_RCURLY_4=RULE_RCURLY
		{
			doneLeaf(this_RCURLY_4);
		}
	)
;

//Entry rule entryRuleConceptDesignationTerminologyAxiom
entryRuleConceptDesignationTerminologyAxiom returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getConceptDesignationTerminologyAxiomElementType()); }
	iv_ruleConceptDesignationTerminologyAxiom=ruleConceptDesignationTerminologyAxiom
	{ $current=$iv_ruleConceptDesignationTerminologyAxiom.current; }
	EOF;

// Rule ConceptDesignationTerminologyAxiom
ruleConceptDesignationTerminologyAxiom returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getConceptDesignationTerminologyAxiom_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKENTerminalRuleCall_0ElementType());
		}
		this_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN_0=RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN
		{
			doneLeaf(this_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN_0);
		}
		{
			markLeaf(elementTypeProvider.getConceptDesignationTerminologyAxiom_LCURLYTerminalRuleCall_1ElementType());
		}
		this_LCURLY_1=RULE_LCURLY
		{
			doneLeaf(this_LCURLY_1);
		}
		{
			markLeaf(elementTypeProvider.getConceptDesignationTerminologyAxiom_DesignatedTerminologyKeyword_2ElementType());
		}
		otherlv_2='designatedTerminology'
		{
			doneLeaf(otherlv_2);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getConceptDesignationTerminologyAxiom_DesignatedTerminologyTerminologyBoxCrossReference_3_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getConceptDesignationTerminologyAxiom_DesignatedConceptKeyword_4ElementType());
		}
		otherlv_4='designatedConcept'
		{
			doneLeaf(otherlv_4);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getConceptDesignationTerminologyAxiom_DesignatedConceptConceptCrossReference_5_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getConceptDesignationTerminologyAxiom_RCURLYTerminalRuleCall_6ElementType());
		}
		this_RCURLY_6=RULE_RCURLY
		{
			doneLeaf(this_RCURLY_6);
		}
	)
;

//Entry rule entryRuleTerminologyExtensionAxiom
entryRuleTerminologyExtensionAxiom returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getTerminologyExtensionAxiomElementType()); }
	iv_ruleTerminologyExtensionAxiom=ruleTerminologyExtensionAxiom
	{ $current=$iv_ruleTerminologyExtensionAxiom.current; }
	EOF;

// Rule TerminologyExtensionAxiom
ruleTerminologyExtensionAxiom returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getTerminologyExtensionAxiom_TERMINOLOGY_EXTENSION_AXIOM_TOKENTerminalRuleCall_0ElementType());
		}
		this_TERMINOLOGY_EXTENSION_AXIOM_TOKEN_0=RULE_TERMINOLOGY_EXTENSION_AXIOM_TOKEN
		{
			doneLeaf(this_TERMINOLOGY_EXTENSION_AXIOM_TOKEN_0);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getTerminologyExtensionAxiom_ExtendedTerminologyTerminologyBoxCrossReference_1_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
	)
;

//Entry rule entryRuleTerminologyNestingAxiom
entryRuleTerminologyNestingAxiom returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getTerminologyNestingAxiomElementType()); }
	iv_ruleTerminologyNestingAxiom=ruleTerminologyNestingAxiom
	{ $current=$iv_ruleTerminologyNestingAxiom.current; }
	EOF;

// Rule TerminologyNestingAxiom
ruleTerminologyNestingAxiom returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getTerminologyNestingAxiom_TERMINOLOGY_NESTING_AXIOM_TOKENTerminalRuleCall_0ElementType());
		}
		this_TERMINOLOGY_NESTING_AXIOM_TOKEN_0=RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN
		{
			doneLeaf(this_TERMINOLOGY_NESTING_AXIOM_TOKEN_0);
		}
		{
			markLeaf(elementTypeProvider.getTerminologyNestingAxiom_LCURLYTerminalRuleCall_1ElementType());
		}
		this_LCURLY_1=RULE_LCURLY
		{
			doneLeaf(this_LCURLY_1);
		}
		{
			markLeaf(elementTypeProvider.getTerminologyNestingAxiom_NestingTerminologyKeyword_2ElementType());
		}
		otherlv_2='nestingTerminology'
		{
			doneLeaf(otherlv_2);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getTerminologyNestingAxiom_NestingTerminologyTerminologyBoxCrossReference_3_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getTerminologyNestingAxiom_NestingContextKeyword_4ElementType());
		}
		otherlv_4='nestingContext'
		{
			doneLeaf(otherlv_4);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getTerminologyNestingAxiom_NestingContextConceptCrossReference_5_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getTerminologyNestingAxiom_RCURLYTerminalRuleCall_6ElementType());
		}
		this_RCURLY_6=RULE_RCURLY
		{
			doneLeaf(this_RCURLY_6);
		}
	)
;

//Entry rule entryRuleEntityExistentialRestrictionAxiom
entryRuleEntityExistentialRestrictionAxiom returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getEntityExistentialRestrictionAxiomElementType()); }
	iv_ruleEntityExistentialRestrictionAxiom=ruleEntityExistentialRestrictionAxiom
	{ $current=$iv_ruleEntityExistentialRestrictionAxiom.current; }
	EOF;

// Rule EntityExistentialRestrictionAxiom
ruleEntityExistentialRestrictionAxiom returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getEntityExistentialRestrictionAxiom_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0ElementType());
		}
		this_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0=RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN
		{
			doneLeaf(this_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0);
		}
		{
			markLeaf(elementTypeProvider.getEntityExistentialRestrictionAxiom_LCURLYTerminalRuleCall_1ElementType());
		}
		this_LCURLY_1=RULE_LCURLY
		{
			doneLeaf(this_LCURLY_1);
		}
		{
			markLeaf(elementTypeProvider.getEntityExistentialRestrictionAxiom_RestrictedRelationKeyword_2ElementType());
		}
		otherlv_2='restrictedRelation'
		{
			doneLeaf(otherlv_2);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getEntityExistentialRestrictionAxiom_RestrictedRelationReifiedRelationshipCrossReference_3_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getEntityExistentialRestrictionAxiom_RestrictedRangeKeyword_4ElementType());
		}
		otherlv_4='restrictedRange'
		{
			doneLeaf(otherlv_4);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getEntityExistentialRestrictionAxiom_RestrictedRangeEntityCrossReference_5_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getEntityExistentialRestrictionAxiom_RestrictedDomainKeyword_6ElementType());
		}
		otherlv_6='restrictedDomain'
		{
			doneLeaf(otherlv_6);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getEntityExistentialRestrictionAxiom_RestrictedDomainEntityCrossReference_7_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getEntityExistentialRestrictionAxiom_RCURLYTerminalRuleCall_8ElementType());
		}
		this_RCURLY_8=RULE_RCURLY
		{
			doneLeaf(this_RCURLY_8);
		}
	)
;

//Entry rule entryRuleEntityUniversalRestrictionAxiom
entryRuleEntityUniversalRestrictionAxiom returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getEntityUniversalRestrictionAxiomElementType()); }
	iv_ruleEntityUniversalRestrictionAxiom=ruleEntityUniversalRestrictionAxiom
	{ $current=$iv_ruleEntityUniversalRestrictionAxiom.current; }
	EOF;

// Rule EntityUniversalRestrictionAxiom
ruleEntityUniversalRestrictionAxiom returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getEntityUniversalRestrictionAxiom_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0ElementType());
		}
		this_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0=RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN
		{
			doneLeaf(this_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0);
		}
		{
			markLeaf(elementTypeProvider.getEntityUniversalRestrictionAxiom_LCURLYTerminalRuleCall_1ElementType());
		}
		this_LCURLY_1=RULE_LCURLY
		{
			doneLeaf(this_LCURLY_1);
		}
		{
			markLeaf(elementTypeProvider.getEntityUniversalRestrictionAxiom_RestrictedRelationKeyword_2ElementType());
		}
		otherlv_2='restrictedRelation'
		{
			doneLeaf(otherlv_2);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getEntityUniversalRestrictionAxiom_RestrictedRelationReifiedRelationshipCrossReference_3_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getEntityUniversalRestrictionAxiom_RestrictedRangeKeyword_4ElementType());
		}
		otherlv_4='restrictedRange'
		{
			doneLeaf(otherlv_4);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getEntityUniversalRestrictionAxiom_RestrictedRangeEntityCrossReference_5_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getEntityUniversalRestrictionAxiom_RestrictedDomainKeyword_6ElementType());
		}
		otherlv_6='restrictedDomain'
		{
			doneLeaf(otherlv_6);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getEntityUniversalRestrictionAxiom_RestrictedDomainEntityCrossReference_7_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getEntityUniversalRestrictionAxiom_RCURLYTerminalRuleCall_8ElementType());
		}
		this_RCURLY_8=RULE_RCURLY
		{
			doneLeaf(this_RCURLY_8);
		}
	)
;

//Entry rule entryRuleAspectSpecializationAxiom
entryRuleAspectSpecializationAxiom returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getAspectSpecializationAxiomElementType()); }
	iv_ruleAspectSpecializationAxiom=ruleAspectSpecializationAxiom
	{ $current=$iv_ruleAspectSpecializationAxiom.current; }
	EOF;

// Rule AspectSpecializationAxiom
ruleAspectSpecializationAxiom returns [Boolean current=false]
:
	(
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getAspectSpecializationAxiom_SubEntityEntityCrossReference_0_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getAspectSpecializationAxiom_ASPECT_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_1ElementType());
		}
		this_ASPECT_SPECIALIZATION_AXIOM_TOKEN_1=RULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN
		{
			doneLeaf(this_ASPECT_SPECIALIZATION_AXIOM_TOKEN_1);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getAspectSpecializationAxiom_SuperAspectAspectCrossReference_2_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
	)
;

//Entry rule entryRuleConceptSpecializationAxiom
entryRuleConceptSpecializationAxiom returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getConceptSpecializationAxiomElementType()); }
	iv_ruleConceptSpecializationAxiom=ruleConceptSpecializationAxiom
	{ $current=$iv_ruleConceptSpecializationAxiom.current; }
	EOF;

// Rule ConceptSpecializationAxiom
ruleConceptSpecializationAxiom returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getConceptSpecializationAxiom_CONCEPT_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_0ElementType());
		}
		this_CONCEPT_SPECIALIZATION_AXIOM_TOKEN_0=RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN
		{
			doneLeaf(this_CONCEPT_SPECIALIZATION_AXIOM_TOKEN_0);
		}
		{
			markLeaf(elementTypeProvider.getConceptSpecializationAxiom_LCURLYTerminalRuleCall_1ElementType());
		}
		this_LCURLY_1=RULE_LCURLY
		{
			doneLeaf(this_LCURLY_1);
		}
		{
			markLeaf(elementTypeProvider.getConceptSpecializationAxiom_SubConceptKeyword_2ElementType());
		}
		otherlv_2='subConcept'
		{
			doneLeaf(otherlv_2);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getConceptSpecializationAxiom_SubConceptConceptCrossReference_3_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getConceptSpecializationAxiom_SuperConceptKeyword_4ElementType());
		}
		otherlv_4='superConcept'
		{
			doneLeaf(otherlv_4);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getConceptSpecializationAxiom_SuperConceptConceptCrossReference_5_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getConceptSpecializationAxiom_RCURLYTerminalRuleCall_6ElementType());
		}
		this_RCURLY_6=RULE_RCURLY
		{
			doneLeaf(this_RCURLY_6);
		}
	)
;

//Entry rule entryRuleReifiedRelationshipSpecializationAxiom
entryRuleReifiedRelationshipSpecializationAxiom returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getReifiedRelationshipSpecializationAxiomElementType()); }
	iv_ruleReifiedRelationshipSpecializationAxiom=ruleReifiedRelationshipSpecializationAxiom
	{ $current=$iv_ruleReifiedRelationshipSpecializationAxiom.current; }
	EOF;

// Rule ReifiedRelationshipSpecializationAxiom
ruleReifiedRelationshipSpecializationAxiom returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getReifiedRelationshipSpecializationAxiom_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_0ElementType());
		}
		this_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN_0=RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN
		{
			doneLeaf(this_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN_0);
		}
		{
			markLeaf(elementTypeProvider.getReifiedRelationshipSpecializationAxiom_LCURLYTerminalRuleCall_1ElementType());
		}
		this_LCURLY_1=RULE_LCURLY
		{
			doneLeaf(this_LCURLY_1);
		}
		{
			markLeaf(elementTypeProvider.getReifiedRelationshipSpecializationAxiom_SubRelationshipKeyword_2ElementType());
		}
		otherlv_2='subRelationship'
		{
			doneLeaf(otherlv_2);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getReifiedRelationshipSpecializationAxiom_SubRelationshipReifiedRelationshipCrossReference_3_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getReifiedRelationshipSpecializationAxiom_SuperRelationshipKeyword_4ElementType());
		}
		otherlv_4='superRelationship'
		{
			doneLeaf(otherlv_4);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getReifiedRelationshipSpecializationAxiom_SuperRelationshipReifiedRelationshipCrossReference_5_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getReifiedRelationshipSpecializationAxiom_RCURLYTerminalRuleCall_6ElementType());
		}
		this_RCURLY_6=RULE_RCURLY
		{
			doneLeaf(this_RCURLY_6);
		}
	)
;

//Entry rule entryRuleEntityScalarDataPropertyExistentialRestrictionAxiom
entryRuleEntityScalarDataPropertyExistentialRestrictionAxiom returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getEntityScalarDataPropertyExistentialRestrictionAxiomElementType()); }
	iv_ruleEntityScalarDataPropertyExistentialRestrictionAxiom=ruleEntityScalarDataPropertyExistentialRestrictionAxiom
	{ $current=$iv_ruleEntityScalarDataPropertyExistentialRestrictionAxiom.current; }
	EOF;

// Rule EntityScalarDataPropertyExistentialRestrictionAxiom
ruleEntityScalarDataPropertyExistentialRestrictionAxiom returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getEntityScalarDataPropertyExistentialRestrictionAxiom_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0ElementType());
		}
		this_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0=RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN
		{
			doneLeaf(this_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0);
		}
		{
			markLeaf(elementTypeProvider.getEntityScalarDataPropertyExistentialRestrictionAxiom_LCURLYTerminalRuleCall_1ElementType());
		}
		this_LCURLY_1=RULE_LCURLY
		{
			doneLeaf(this_LCURLY_1);
		}
		{
			markLeaf(elementTypeProvider.getEntityScalarDataPropertyExistentialRestrictionAxiom_RestrictedEntityKeyword_2ElementType());
		}
		otherlv_2='restrictedEntity'
		{
			doneLeaf(otherlv_2);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getEntityScalarDataPropertyExistentialRestrictionAxiom_RestrictedEntityEntityCrossReference_3_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarPropertyKeyword_4ElementType());
		}
		otherlv_4='scalarProperty'
		{
			doneLeaf(otherlv_4);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyCrossReference_5_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarRestrictionKeyword_6ElementType());
		}
		otherlv_6='scalarRestriction'
		{
			doneLeaf(otherlv_6);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarRestrictionDataRangeCrossReference_7_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getEntityScalarDataPropertyExistentialRestrictionAxiom_RCURLYTerminalRuleCall_8ElementType());
		}
		this_RCURLY_8=RULE_RCURLY
		{
			doneLeaf(this_RCURLY_8);
		}
	)
;

//Entry rule entryRuleEntityScalarDataPropertyParticularRestrictionAxiom
entryRuleEntityScalarDataPropertyParticularRestrictionAxiom returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getEntityScalarDataPropertyParticularRestrictionAxiomElementType()); }
	iv_ruleEntityScalarDataPropertyParticularRestrictionAxiom=ruleEntityScalarDataPropertyParticularRestrictionAxiom
	{ $current=$iv_ruleEntityScalarDataPropertyParticularRestrictionAxiom.current; }
	EOF;

// Rule EntityScalarDataPropertyParticularRestrictionAxiom
ruleEntityScalarDataPropertyParticularRestrictionAxiom returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getEntityScalarDataPropertyParticularRestrictionAxiom_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0ElementType());
		}
		this_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN_0=RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN
		{
			doneLeaf(this_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN_0);
		}
		{
			markLeaf(elementTypeProvider.getEntityScalarDataPropertyParticularRestrictionAxiom_LCURLYTerminalRuleCall_1ElementType());
		}
		this_LCURLY_1=RULE_LCURLY
		{
			doneLeaf(this_LCURLY_1);
		}
		{
			markLeaf(elementTypeProvider.getEntityScalarDataPropertyParticularRestrictionAxiom_RestrictedEntityKeyword_2ElementType());
		}
		otherlv_2='restrictedEntity'
		{
			doneLeaf(otherlv_2);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getEntityScalarDataPropertyParticularRestrictionAxiom_RestrictedEntityEntityCrossReference_3_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getEntityScalarDataPropertyParticularRestrictionAxiom_ScalarPropertyKeyword_4ElementType());
		}
		otherlv_4='scalarProperty'
		{
			doneLeaf(otherlv_4);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getEntityScalarDataPropertyParticularRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyCrossReference_5_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getEntityScalarDataPropertyParticularRestrictionAxiom_LiteralValueKeyword_6ElementType());
		}
		otherlv_6='literalValue'
		{
			doneLeaf(otherlv_6);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getEntityScalarDataPropertyParticularRestrictionAxiom_LiteralValueSTRINGTerminalRuleCall_7_0ElementType());
				}
				lv_literalValue_7_0=RULE_STRING
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_literalValue_7_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getEntityScalarDataPropertyParticularRestrictionAxiom_RCURLYTerminalRuleCall_8ElementType());
		}
		this_RCURLY_8=RULE_RCURLY
		{
			doneLeaf(this_RCURLY_8);
		}
	)
;

//Entry rule entryRuleEntityScalarDataPropertyUniversalRestrictionAxiom
entryRuleEntityScalarDataPropertyUniversalRestrictionAxiom returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getEntityScalarDataPropertyUniversalRestrictionAxiomElementType()); }
	iv_ruleEntityScalarDataPropertyUniversalRestrictionAxiom=ruleEntityScalarDataPropertyUniversalRestrictionAxiom
	{ $current=$iv_ruleEntityScalarDataPropertyUniversalRestrictionAxiom.current; }
	EOF;

// Rule EntityScalarDataPropertyUniversalRestrictionAxiom
ruleEntityScalarDataPropertyUniversalRestrictionAxiom returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getEntityScalarDataPropertyUniversalRestrictionAxiom_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0ElementType());
		}
		this_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0=RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN
		{
			doneLeaf(this_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0);
		}
		{
			markLeaf(elementTypeProvider.getEntityScalarDataPropertyUniversalRestrictionAxiom_LCURLYTerminalRuleCall_1ElementType());
		}
		this_LCURLY_1=RULE_LCURLY
		{
			doneLeaf(this_LCURLY_1);
		}
		{
			markLeaf(elementTypeProvider.getEntityScalarDataPropertyUniversalRestrictionAxiom_RestrictedEntityKeyword_2ElementType());
		}
		otherlv_2='restrictedEntity'
		{
			doneLeaf(otherlv_2);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getEntityScalarDataPropertyUniversalRestrictionAxiom_RestrictedEntityEntityCrossReference_3_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarPropertyKeyword_4ElementType());
		}
		otherlv_4='scalarProperty'
		{
			doneLeaf(otherlv_4);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarPropertyEntityScalarDataPropertyCrossReference_5_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarRestrictionKeyword_6ElementType());
		}
		otherlv_6='scalarRestriction'
		{
			doneLeaf(otherlv_6);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarRestrictionDataRangeCrossReference_7_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getEntityScalarDataPropertyUniversalRestrictionAxiom_RCURLYTerminalRuleCall_8ElementType());
		}
		this_RCURLY_8=RULE_RCURLY
		{
			doneLeaf(this_RCURLY_8);
		}
	)
;

//Entry rule entryRuleBinaryScalarRestriction
entryRuleBinaryScalarRestriction returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getBinaryScalarRestrictionElementType()); }
	iv_ruleBinaryScalarRestriction=ruleBinaryScalarRestriction
	{ $current=$iv_ruleBinaryScalarRestriction.current; }
	EOF;

// Rule BinaryScalarRestriction
ruleBinaryScalarRestriction returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getBinaryScalarRestriction_BINARY_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType());
		}
		this_BINARY_SCALAR_RESTRICTION_TOKEN_0=RULE_BINARY_SCALAR_RESTRICTION_TOKEN
		{
			doneLeaf(this_BINARY_SCALAR_RESTRICTION_TOKEN_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getBinaryScalarRestriction_NameIDTerminalRuleCall_1_0ElementType());
				}
				lv_name_1_0=RULE_ID
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_name_1_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getBinaryScalarRestriction_LCURLYTerminalRuleCall_2ElementType());
		}
		this_LCURLY_2=RULE_LCURLY
		{
			doneLeaf(this_LCURLY_2);
		}
		(
			{
				markLeaf(elementTypeProvider.getBinaryScalarRestriction_LengthKeyword_3_0ElementType());
			}
			otherlv_3='length'
			{
				doneLeaf(otherlv_3);
			}
			(
				(
					{
						markLeaf(elementTypeProvider.getBinaryScalarRestriction_LengthINTTerminalRuleCall_3_1_0ElementType());
					}
					lv_length_4_0=RULE_INT
					{
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
					{
						doneLeaf(lv_length_4_0);
					}
				)
			)
		)?
		(
			{
				markLeaf(elementTypeProvider.getBinaryScalarRestriction_MinLengthKeyword_4_0ElementType());
			}
			otherlv_5='minLength'
			{
				doneLeaf(otherlv_5);
			}
			(
				(
					{
						markLeaf(elementTypeProvider.getBinaryScalarRestriction_MinLengthINTTerminalRuleCall_4_1_0ElementType());
					}
					lv_minLength_6_0=RULE_INT
					{
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
					{
						doneLeaf(lv_minLength_6_0);
					}
				)
			)
		)?
		(
			{
				markLeaf(elementTypeProvider.getBinaryScalarRestriction_MaxLengthKeyword_5_0ElementType());
			}
			otherlv_7='maxLength'
			{
				doneLeaf(otherlv_7);
			}
			(
				(
					{
						markLeaf(elementTypeProvider.getBinaryScalarRestriction_MaxLengthINTTerminalRuleCall_5_1_0ElementType());
					}
					lv_maxLength_8_0=RULE_INT
					{
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
					{
						doneLeaf(lv_maxLength_8_0);
					}
				)
			)
		)?
		{
			markLeaf(elementTypeProvider.getBinaryScalarRestriction_RestrictedRangeKeyword_6ElementType());
		}
		otherlv_9='restrictedRange'
		{
			doneLeaf(otherlv_9);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getBinaryScalarRestriction_RestrictedRangeDataRangeCrossReference_7_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getBinaryScalarRestriction_RCURLYTerminalRuleCall_8ElementType());
		}
		this_RCURLY_11=RULE_RCURLY
		{
			doneLeaf(this_RCURLY_11);
		}
	)
;

//Entry rule entryRuleIRIScalarRestriction
entryRuleIRIScalarRestriction returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getIRIScalarRestrictionElementType()); }
	iv_ruleIRIScalarRestriction=ruleIRIScalarRestriction
	{ $current=$iv_ruleIRIScalarRestriction.current; }
	EOF;

// Rule IRIScalarRestriction
ruleIRIScalarRestriction returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getIRIScalarRestriction_IRI_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType());
		}
		this_IRI_SCALAR_RESTRICTION_TOKEN_0=RULE_IRI_SCALAR_RESTRICTION_TOKEN
		{
			doneLeaf(this_IRI_SCALAR_RESTRICTION_TOKEN_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getIRIScalarRestriction_NameIDTerminalRuleCall_1_0ElementType());
				}
				lv_name_1_0=RULE_ID
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_name_1_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getIRIScalarRestriction_LCURLYTerminalRuleCall_2ElementType());
		}
		this_LCURLY_2=RULE_LCURLY
		{
			doneLeaf(this_LCURLY_2);
		}
		(
			{
				markLeaf(elementTypeProvider.getIRIScalarRestriction_LengthKeyword_3_0ElementType());
			}
			otherlv_3='length'
			{
				doneLeaf(otherlv_3);
			}
			(
				(
					{
						markLeaf(elementTypeProvider.getIRIScalarRestriction_LengthINTTerminalRuleCall_3_1_0ElementType());
					}
					lv_length_4_0=RULE_INT
					{
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
					{
						doneLeaf(lv_length_4_0);
					}
				)
			)
		)?
		(
			{
				markLeaf(elementTypeProvider.getIRIScalarRestriction_MinLengthKeyword_4_0ElementType());
			}
			otherlv_5='minLength'
			{
				doneLeaf(otherlv_5);
			}
			(
				(
					{
						markLeaf(elementTypeProvider.getIRIScalarRestriction_MinLengthINTTerminalRuleCall_4_1_0ElementType());
					}
					lv_minLength_6_0=RULE_INT
					{
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
					{
						doneLeaf(lv_minLength_6_0);
					}
				)
			)
		)?
		(
			{
				markLeaf(elementTypeProvider.getIRIScalarRestriction_MaxLengthKeyword_5_0ElementType());
			}
			otherlv_7='maxLength'
			{
				doneLeaf(otherlv_7);
			}
			(
				(
					{
						markLeaf(elementTypeProvider.getIRIScalarRestriction_MaxLengthINTTerminalRuleCall_5_1_0ElementType());
					}
					lv_maxLength_8_0=RULE_INT
					{
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
					{
						doneLeaf(lv_maxLength_8_0);
					}
				)
			)
		)?
		(
			{
				markLeaf(elementTypeProvider.getIRIScalarRestriction_PatternKeyword_6_0ElementType());
			}
			otherlv_9='pattern'
			{
				doneLeaf(otherlv_9);
			}
			(
				(
					{
						markLeaf(elementTypeProvider.getIRIScalarRestriction_PatternSTRINGTerminalRuleCall_6_1_0ElementType());
					}
					lv_pattern_10_0=RULE_STRING
					{
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
					{
						doneLeaf(lv_pattern_10_0);
					}
				)
			)
		)?
		{
			markLeaf(elementTypeProvider.getIRIScalarRestriction_RestrictedRangeKeyword_7ElementType());
		}
		otherlv_11='restrictedRange'
		{
			doneLeaf(otherlv_11);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getIRIScalarRestriction_RestrictedRangeDataRangeCrossReference_8_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getIRIScalarRestriction_RCURLYTerminalRuleCall_9ElementType());
		}
		this_RCURLY_13=RULE_RCURLY
		{
			doneLeaf(this_RCURLY_13);
		}
	)
;

//Entry rule entryRuleNumericScalarRestriction
entryRuleNumericScalarRestriction returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getNumericScalarRestrictionElementType()); }
	iv_ruleNumericScalarRestriction=ruleNumericScalarRestriction
	{ $current=$iv_ruleNumericScalarRestriction.current; }
	EOF;

// Rule NumericScalarRestriction
ruleNumericScalarRestriction returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getNumericScalarRestriction_NUMERIC_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType());
		}
		this_NUMERIC_SCALAR_RESTRICTION_TOKEN_0=RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN
		{
			doneLeaf(this_NUMERIC_SCALAR_RESTRICTION_TOKEN_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getNumericScalarRestriction_NameIDTerminalRuleCall_1_0ElementType());
				}
				lv_name_1_0=RULE_ID
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_name_1_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getNumericScalarRestriction_LCURLYTerminalRuleCall_2ElementType());
		}
		this_LCURLY_2=RULE_LCURLY
		{
			doneLeaf(this_LCURLY_2);
		}
		(
			{
				markLeaf(elementTypeProvider.getNumericScalarRestriction_MinInclusiveKeyword_3_0ElementType());
			}
			otherlv_3='minInclusive'
			{
				doneLeaf(otherlv_3);
			}
			(
				(
					{
						markLeaf(elementTypeProvider.getNumericScalarRestriction_MinInclusiveSTRINGTerminalRuleCall_3_1_0ElementType());
					}
					lv_minInclusive_4_0=RULE_STRING
					{
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
					{
						doneLeaf(lv_minInclusive_4_0);
					}
				)
			)
		)?
		(
			{
				markLeaf(elementTypeProvider.getNumericScalarRestriction_MaxInclusiveKeyword_4_0ElementType());
			}
			otherlv_5='maxInclusive'
			{
				doneLeaf(otherlv_5);
			}
			(
				(
					{
						markLeaf(elementTypeProvider.getNumericScalarRestriction_MaxInclusiveSTRINGTerminalRuleCall_4_1_0ElementType());
					}
					lv_maxInclusive_6_0=RULE_STRING
					{
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
					{
						doneLeaf(lv_maxInclusive_6_0);
					}
				)
			)
		)?
		(
			{
				markLeaf(elementTypeProvider.getNumericScalarRestriction_MinExclusiveKeyword_5_0ElementType());
			}
			otherlv_7='minExclusive'
			{
				doneLeaf(otherlv_7);
			}
			(
				(
					{
						markLeaf(elementTypeProvider.getNumericScalarRestriction_MinExclusiveSTRINGTerminalRuleCall_5_1_0ElementType());
					}
					lv_minExclusive_8_0=RULE_STRING
					{
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
					{
						doneLeaf(lv_minExclusive_8_0);
					}
				)
			)
		)?
		(
			{
				markLeaf(elementTypeProvider.getNumericScalarRestriction_MaxExclusiveKeyword_6_0ElementType());
			}
			otherlv_9='maxExclusive'
			{
				doneLeaf(otherlv_9);
			}
			(
				(
					{
						markLeaf(elementTypeProvider.getNumericScalarRestriction_MaxExclusiveSTRINGTerminalRuleCall_6_1_0ElementType());
					}
					lv_maxExclusive_10_0=RULE_STRING
					{
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
					{
						doneLeaf(lv_maxExclusive_10_0);
					}
				)
			)
		)?
		{
			markLeaf(elementTypeProvider.getNumericScalarRestriction_RestrictedRangeKeyword_7ElementType());
		}
		otherlv_11='restrictedRange'
		{
			doneLeaf(otherlv_11);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getNumericScalarRestriction_RestrictedRangeDataRangeCrossReference_8_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getNumericScalarRestriction_RCURLYTerminalRuleCall_9ElementType());
		}
		this_RCURLY_13=RULE_RCURLY
		{
			doneLeaf(this_RCURLY_13);
		}
	)
;

//Entry rule entryRulePlainLiteralScalarRestriction
entryRulePlainLiteralScalarRestriction returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getPlainLiteralScalarRestrictionElementType()); }
	iv_rulePlainLiteralScalarRestriction=rulePlainLiteralScalarRestriction
	{ $current=$iv_rulePlainLiteralScalarRestriction.current; }
	EOF;

// Rule PlainLiteralScalarRestriction
rulePlainLiteralScalarRestriction returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType());
		}
		this_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN_0=RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN
		{
			doneLeaf(this_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_NameIDTerminalRuleCall_1_0ElementType());
				}
				lv_name_1_0=RULE_ID
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_name_1_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_LCURLYTerminalRuleCall_2ElementType());
		}
		this_LCURLY_2=RULE_LCURLY
		{
			doneLeaf(this_LCURLY_2);
		}
		(
			{
				markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_LengthKeyword_3_0ElementType());
			}
			otherlv_3='length'
			{
				doneLeaf(otherlv_3);
			}
			(
				(
					{
						markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_LengthINTTerminalRuleCall_3_1_0ElementType());
					}
					lv_length_4_0=RULE_INT
					{
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
					{
						doneLeaf(lv_length_4_0);
					}
				)
			)
		)?
		(
			{
				markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_MinLengthKeyword_4_0ElementType());
			}
			otherlv_5='minLength'
			{
				doneLeaf(otherlv_5);
			}
			(
				(
					{
						markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_MinLengthINTTerminalRuleCall_4_1_0ElementType());
					}
					lv_minLength_6_0=RULE_INT
					{
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
					{
						doneLeaf(lv_minLength_6_0);
					}
				)
			)
		)?
		(
			{
				markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_MaxLengthKeyword_5_0ElementType());
			}
			otherlv_7='maxLength'
			{
				doneLeaf(otherlv_7);
			}
			(
				(
					{
						markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_MaxLengthINTTerminalRuleCall_5_1_0ElementType());
					}
					lv_maxLength_8_0=RULE_INT
					{
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
					{
						doneLeaf(lv_maxLength_8_0);
					}
				)
			)
		)?
		(
			{
				markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_PatternKeyword_6_0ElementType());
			}
			otherlv_9='pattern'
			{
				doneLeaf(otherlv_9);
			}
			(
				(
					{
						markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_PatternSTRINGTerminalRuleCall_6_1_0ElementType());
					}
					lv_pattern_10_0=RULE_STRING
					{
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
					{
						doneLeaf(lv_pattern_10_0);
					}
				)
			)
		)?
		(
			{
				markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_LanguageKeyword_7_0ElementType());
			}
			otherlv_11='language'
			{
				doneLeaf(otherlv_11);
			}
			(
				(
					{
						markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_LanguageSTRINGTerminalRuleCall_7_1_0ElementType());
					}
					lv_language_12_0=RULE_STRING
					{
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
					{
						doneLeaf(lv_language_12_0);
					}
				)
			)
		)?
		{
			markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_RestrictedRangeKeyword_8ElementType());
		}
		otherlv_13='restrictedRange'
		{
			doneLeaf(otherlv_13);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getPlainLiteralScalarRestriction_RestrictedRangeDataRangeCrossReference_9_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getPlainLiteralScalarRestriction_RCURLYTerminalRuleCall_10ElementType());
		}
		this_RCURLY_15=RULE_RCURLY
		{
			doneLeaf(this_RCURLY_15);
		}
	)
;

//Entry rule entryRuleScalarOneOfRestriction
entryRuleScalarOneOfRestriction returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getScalarOneOfRestrictionElementType()); }
	iv_ruleScalarOneOfRestriction=ruleScalarOneOfRestriction
	{ $current=$iv_ruleScalarOneOfRestriction.current; }
	EOF;

// Rule ScalarOneOfRestriction
ruleScalarOneOfRestriction returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getScalarOneOfRestriction_SCALAR_ONE_OF_RESTRICTION_TOKENTerminalRuleCall_0ElementType());
		}
		this_SCALAR_ONE_OF_RESTRICTION_TOKEN_0=RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN
		{
			doneLeaf(this_SCALAR_ONE_OF_RESTRICTION_TOKEN_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getScalarOneOfRestriction_NameIDTerminalRuleCall_1_0ElementType());
				}
				lv_name_1_0=RULE_ID
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_name_1_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getScalarOneOfRestriction_LCURLYTerminalRuleCall_2ElementType());
		}
		this_LCURLY_2=RULE_LCURLY
		{
			doneLeaf(this_LCURLY_2);
		}
		{
			markLeaf(elementTypeProvider.getScalarOneOfRestriction_RestrictedRangeKeyword_3ElementType());
		}
		otherlv_3='restrictedRange'
		{
			doneLeaf(otherlv_3);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getScalarOneOfRestriction_RestrictedRangeDataRangeCrossReference_4_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getScalarOneOfRestriction_RCURLYTerminalRuleCall_5ElementType());
		}
		this_RCURLY_5=RULE_RCURLY
		{
			doneLeaf(this_RCURLY_5);
		}
	)
;

//Entry rule entryRuleScalarOneOfLiteralAxiom
entryRuleScalarOneOfLiteralAxiom returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getScalarOneOfLiteralAxiomElementType()); }
	iv_ruleScalarOneOfLiteralAxiom=ruleScalarOneOfLiteralAxiom
	{ $current=$iv_ruleScalarOneOfLiteralAxiom.current; }
	EOF;

// Rule ScalarOneOfLiteralAxiom
ruleScalarOneOfLiteralAxiom returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getScalarOneOfLiteralAxiom_SCALAR_ONE_OF_LITERAL_AXIOM_TOKENTerminalRuleCall_0ElementType());
		}
		this_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN_0=RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN
		{
			doneLeaf(this_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN_0);
		}
		{
			markLeaf(elementTypeProvider.getScalarOneOfLiteralAxiom_LCURLYTerminalRuleCall_1ElementType());
		}
		this_LCURLY_1=RULE_LCURLY
		{
			doneLeaf(this_LCURLY_1);
		}
		{
			markLeaf(elementTypeProvider.getScalarOneOfLiteralAxiom_ValueKeyword_2ElementType());
		}
		otherlv_2='value'
		{
			doneLeaf(otherlv_2);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getScalarOneOfLiteralAxiom_ValueSTRINGTerminalRuleCall_3_0ElementType());
				}
				lv_value_3_0=RULE_STRING
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_value_3_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getScalarOneOfLiteralAxiom_AxiomKeyword_4ElementType());
		}
		otherlv_4='axiom'
		{
			doneLeaf(otherlv_4);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getScalarOneOfLiteralAxiom_AxiomScalarOneOfRestrictionCrossReference_5_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getScalarOneOfLiteralAxiom_RCURLYTerminalRuleCall_6ElementType());
		}
		this_RCURLY_6=RULE_RCURLY
		{
			doneLeaf(this_RCURLY_6);
		}
	)
;

//Entry rule entryRuleStringScalarRestriction
entryRuleStringScalarRestriction returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getStringScalarRestrictionElementType()); }
	iv_ruleStringScalarRestriction=ruleStringScalarRestriction
	{ $current=$iv_ruleStringScalarRestriction.current; }
	EOF;

// Rule StringScalarRestriction
ruleStringScalarRestriction returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getStringScalarRestriction_STRING_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType());
		}
		this_STRING_SCALAR_RESTRICTION_TOKEN_0=RULE_STRING_SCALAR_RESTRICTION_TOKEN
		{
			doneLeaf(this_STRING_SCALAR_RESTRICTION_TOKEN_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getStringScalarRestriction_NameIDTerminalRuleCall_1_0ElementType());
				}
				lv_name_1_0=RULE_ID
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_name_1_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getStringScalarRestriction_LCURLYTerminalRuleCall_2ElementType());
		}
		this_LCURLY_2=RULE_LCURLY
		{
			doneLeaf(this_LCURLY_2);
		}
		(
			{
				markLeaf(elementTypeProvider.getStringScalarRestriction_LengthKeyword_3_0ElementType());
			}
			otherlv_3='length'
			{
				doneLeaf(otherlv_3);
			}
			(
				(
					{
						markLeaf(elementTypeProvider.getStringScalarRestriction_LengthINTTerminalRuleCall_3_1_0ElementType());
					}
					lv_length_4_0=RULE_INT
					{
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
					{
						doneLeaf(lv_length_4_0);
					}
				)
			)
		)?
		(
			{
				markLeaf(elementTypeProvider.getStringScalarRestriction_MinLengthKeyword_4_0ElementType());
			}
			otherlv_5='minLength'
			{
				doneLeaf(otherlv_5);
			}
			(
				(
					{
						markLeaf(elementTypeProvider.getStringScalarRestriction_MinLengthINTTerminalRuleCall_4_1_0ElementType());
					}
					lv_minLength_6_0=RULE_INT
					{
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
					{
						doneLeaf(lv_minLength_6_0);
					}
				)
			)
		)?
		(
			{
				markLeaf(elementTypeProvider.getStringScalarRestriction_MaxLengthKeyword_5_0ElementType());
			}
			otherlv_7='maxLength'
			{
				doneLeaf(otherlv_7);
			}
			(
				(
					{
						markLeaf(elementTypeProvider.getStringScalarRestriction_MaxLengthINTTerminalRuleCall_5_1_0ElementType());
					}
					lv_maxLength_8_0=RULE_INT
					{
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
					{
						doneLeaf(lv_maxLength_8_0);
					}
				)
			)
		)?
		(
			{
				markLeaf(elementTypeProvider.getStringScalarRestriction_PatternKeyword_6_0ElementType());
			}
			otherlv_9='pattern'
			{
				doneLeaf(otherlv_9);
			}
			(
				(
					{
						markLeaf(elementTypeProvider.getStringScalarRestriction_PatternSTRINGTerminalRuleCall_6_1_0ElementType());
					}
					lv_pattern_10_0=RULE_STRING
					{
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
					{
						doneLeaf(lv_pattern_10_0);
					}
				)
			)
		)?
		{
			markLeaf(elementTypeProvider.getStringScalarRestriction_RestrictedRangeKeyword_7ElementType());
		}
		otherlv_11='restrictedRange'
		{
			doneLeaf(otherlv_11);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getStringScalarRestriction_RestrictedRangeDataRangeCrossReference_8_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getStringScalarRestriction_RCURLYTerminalRuleCall_9ElementType());
		}
		this_RCURLY_13=RULE_RCURLY
		{
			doneLeaf(this_RCURLY_13);
		}
	)
;

//Entry rule entryRuleSynonymScalarRestriction
entryRuleSynonymScalarRestriction returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getSynonymScalarRestrictionElementType()); }
	iv_ruleSynonymScalarRestriction=ruleSynonymScalarRestriction
	{ $current=$iv_ruleSynonymScalarRestriction.current; }
	EOF;

// Rule SynonymScalarRestriction
ruleSynonymScalarRestriction returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getSynonymScalarRestriction_SYNONYM_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType());
		}
		this_SYNONYM_SCALAR_RESTRICTION_TOKEN_0=RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN
		{
			doneLeaf(this_SYNONYM_SCALAR_RESTRICTION_TOKEN_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getSynonymScalarRestriction_NameIDTerminalRuleCall_1_0ElementType());
				}
				lv_name_1_0=RULE_ID
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_name_1_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getSynonymScalarRestriction_LCURLYTerminalRuleCall_2ElementType());
		}
		this_LCURLY_2=RULE_LCURLY
		{
			doneLeaf(this_LCURLY_2);
		}
		{
			markLeaf(elementTypeProvider.getSynonymScalarRestriction_RestrictedRangeKeyword_3ElementType());
		}
		otherlv_3='restrictedRange'
		{
			doneLeaf(otherlv_3);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getSynonymScalarRestriction_RestrictedRangeDataRangeCrossReference_4_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getSynonymScalarRestriction_RCURLYTerminalRuleCall_5ElementType());
		}
		this_RCURLY_5=RULE_RCURLY
		{
			doneLeaf(this_RCURLY_5);
		}
	)
;

//Entry rule entryRuleTimeScalarRestriction
entryRuleTimeScalarRestriction returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getTimeScalarRestrictionElementType()); }
	iv_ruleTimeScalarRestriction=ruleTimeScalarRestriction
	{ $current=$iv_ruleTimeScalarRestriction.current; }
	EOF;

// Rule TimeScalarRestriction
ruleTimeScalarRestriction returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getTimeScalarRestriction_TIME_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0ElementType());
		}
		this_TIME_SCALAR_RESTRICTION_TOKEN_0=RULE_TIME_SCALAR_RESTRICTION_TOKEN
		{
			doneLeaf(this_TIME_SCALAR_RESTRICTION_TOKEN_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getTimeScalarRestriction_NameIDTerminalRuleCall_1_0ElementType());
				}
				lv_name_1_0=RULE_ID
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_name_1_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getTimeScalarRestriction_LCURLYTerminalRuleCall_2ElementType());
		}
		this_LCURLY_2=RULE_LCURLY
		{
			doneLeaf(this_LCURLY_2);
		}
		(
			{
				markLeaf(elementTypeProvider.getTimeScalarRestriction_MinInclusiveKeyword_3_0ElementType());
			}
			otherlv_3='minInclusive'
			{
				doneLeaf(otherlv_3);
			}
			(
				(
					{
						markLeaf(elementTypeProvider.getTimeScalarRestriction_MinInclusiveSTRINGTerminalRuleCall_3_1_0ElementType());
					}
					lv_minInclusive_4_0=RULE_STRING
					{
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
					{
						doneLeaf(lv_minInclusive_4_0);
					}
				)
			)
		)?
		(
			{
				markLeaf(elementTypeProvider.getTimeScalarRestriction_MaxInclusiveKeyword_4_0ElementType());
			}
			otherlv_5='maxInclusive'
			{
				doneLeaf(otherlv_5);
			}
			(
				(
					{
						markLeaf(elementTypeProvider.getTimeScalarRestriction_MaxInclusiveSTRINGTerminalRuleCall_4_1_0ElementType());
					}
					lv_maxInclusive_6_0=RULE_STRING
					{
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
					{
						doneLeaf(lv_maxInclusive_6_0);
					}
				)
			)
		)?
		(
			{
				markLeaf(elementTypeProvider.getTimeScalarRestriction_MinExclusiveKeyword_5_0ElementType());
			}
			otherlv_7='minExclusive'
			{
				doneLeaf(otherlv_7);
			}
			(
				(
					{
						markLeaf(elementTypeProvider.getTimeScalarRestriction_MinExclusiveSTRINGTerminalRuleCall_5_1_0ElementType());
					}
					lv_minExclusive_8_0=RULE_STRING
					{
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
					{
						doneLeaf(lv_minExclusive_8_0);
					}
				)
			)
		)?
		(
			{
				markLeaf(elementTypeProvider.getTimeScalarRestriction_MaxExclusiveKeyword_6_0ElementType());
			}
			otherlv_9='maxExclusive'
			{
				doneLeaf(otherlv_9);
			}
			(
				(
					{
						markLeaf(elementTypeProvider.getTimeScalarRestriction_MaxExclusiveSTRINGTerminalRuleCall_6_1_0ElementType());
					}
					lv_maxExclusive_10_0=RULE_STRING
					{
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
					{
						doneLeaf(lv_maxExclusive_10_0);
					}
				)
			)
		)?
		{
			markLeaf(elementTypeProvider.getTimeScalarRestriction_RestrictedRangeKeyword_7ElementType());
		}
		otherlv_11='restrictedRange'
		{
			doneLeaf(otherlv_11);
		}
		(
			(
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					markComposite(elementTypeProvider.getTimeScalarRestriction_RestrictedRangeDataRangeCrossReference_8_0ElementType());
				}
				ruleReference
				{
					doneComposite();
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getTimeScalarRestriction_RCURLYTerminalRuleCall_9ElementType());
		}
		this_RCURLY_13=RULE_RCURLY
		{
			doneLeaf(this_RCURLY_13);
		}
	)
;

//Entry rule entryRuleReference
entryRuleReference returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getReferenceElementType()); }
	iv_ruleReference=ruleReference
	{ $current=$iv_ruleReference.current; }
	EOF;

// Rule Reference
ruleReference returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getReference_IRITerminalRuleCall_0ElementType());
		}
		this_IRI_0=RULE_IRI
		{
			doneLeaf(this_IRI_0);
		}
		    |
		{
			markComposite(elementTypeProvider.getReference_QNAMEParserRuleCall_1ElementType());
		}
		ruleQNAME
		{
			doneComposite();
		}
	)
;

//Entry rule entryRuleQNAME
entryRuleQNAME returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getQNAMEElementType()); }
	iv_ruleQNAME=ruleQNAME
	{ $current=$iv_ruleQNAME.current; }
	EOF;

// Rule QNAME
ruleQNAME returns [Boolean current=false]
:
	(
		{
			markComposite(elementTypeProvider.getQNAME_ABBREV_IRIParserRuleCall_0ElementType());
		}
		ruleABBREV_IRI
		{
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getQNAME_ValidIDParserRuleCall_1ElementType());
		}
		ruleValidID
		{
			doneComposite();
		}
	)
;

//Entry rule entryRuleABBREV_IRI
entryRuleABBREV_IRI returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getABBREV_IRIElementType()); }
	iv_ruleABBREV_IRI=ruleABBREV_IRI
	{ $current=$iv_ruleABBREV_IRI.current; }
	EOF;

// Rule ABBREV_IRI
ruleABBREV_IRI returns [Boolean current=false]
:
	(
		{
			markComposite(elementTypeProvider.getABBREV_IRI_ValidIDParserRuleCall_0ElementType());
		}
		ruleValidID
		{
			doneComposite();
		}
		{
			markLeaf(elementTypeProvider.getABBREV_IRI_ColonKeyword_1ElementType());
		}
		kw=':'
		{
			doneLeaf(kw);
		}
		{
			markComposite(elementTypeProvider.getABBREV_IRI_ValidIDParserRuleCall_2ElementType());
		}
		ruleValidID
		{
			doneComposite();
		}
	)
;

//Entry rule entryRuleValidID
entryRuleValidID returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getValidIDElementType()); }
	iv_ruleValidID=ruleValidID
	{ $current=$iv_ruleValidID.current; }
	EOF;

// Rule ValidID
ruleValidID returns [Boolean current=false]
:
	{
		markLeaf(elementTypeProvider.getValidID_IDTerminalRuleCallElementType());
	}
	this_ID_0=RULE_ID
	{
		doneLeaf(this_ID_0);
	}
;

// Rule TerminologyGraphKind
ruleTerminologyGraphKind returns [Boolean current=false]
:
	(
		(
			{
				markLeaf(elementTypeProvider.getTerminologyGraphKind_OpenWorldDefinitionsEnumLiteralDeclaration_0ElementType());
			}
			enumLiteral_0='open'
			{
				doneLeaf(enumLiteral_0);
			}
		)
		    |
		(
			{
				markLeaf(elementTypeProvider.getTerminologyGraphKind_ClosedWorldDesignationsEnumLiteralDeclaration_1ElementType());
			}
			enumLiteral_1='closed'
			{
				doneLeaf(enumLiteral_1);
			}
		)
	)
;

RULE_ANNOTATION_PROPERTY_TOKEN : 'annotationProperty';

RULE_ANNOTATION_TOKEN : '@';

RULE_TERMINOLOGY_GRAPH_TOKEN : 'terminology';

RULE_BUNDLE_TOKEN : 'bundle';

RULE_KIND_TOKEN : 'kind';

RULE_ASPECT_TOKEN : 'aspect';

RULE_ABSTRACT_TOKEN : 'abstract';

RULE_CONCEPT_TOKEN : 'concept';

RULE_REIFIED_RELATIONSHIP_TOKEN : 'reifiedRelationship';

RULE_UNREIFIED_RELATIONSHIP_TOKEN : 'unreifiedRelationship';

RULE_FUNCTIONAL_TOKEN : 'functional';

RULE_INVERSE_FUNCTIONAL_TOKEN : 'inverseFunctional';

RULE_ESSENTIAL_TOKEN : 'essential';

RULE_INVERSE_ESSENTIAL_TOKEN : 'inverseEssential';

RULE_SYMMETRIC_TOKEN : 'symmetric';

RULE_ASYMMETRIC_TOKEN : 'asymmetric';

RULE_REFLEXIVE_TOKEN : 'reflexive';

RULE_IRREFLEXIVE_TOKEN : 'irreflexive';

RULE_TRANSITIVE_TOKEN : 'transitive';

RULE_UNREIFIED_TOKEN : 'unreified';

RULE_INVERSE_TOKEN : 'inverse';

RULE_SOURCE_TOKEN : 'source';

RULE_TARGET_TOKEN : 'target';

RULE_SCALAR_TOKEN : 'scalar';

RULE_STRUCTURE_TOKEN : 'structure';

RULE_DOMAIN_TOKEN : 'domain';

RULE_RANGE_TOKEN : 'range';

RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN : 'rootConceptTaxonomyAxiom';

RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN : 'specificDisjointConceptAxiom';

RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN : 'anonymousConceptTaxonomyAxiom';

RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN : 'bundledTerminologyAxiom';

RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN : 'conceptDesignationTerminologyAxiom';

RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN : 'terminologyNestingAxiom';

RULE_TERMINOLOGY_EXTENSION_AXIOM_TOKEN : 'extends';

RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN : 'entityExistentialRestrictionAxiom';

RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN : 'entityUniversalRestrictionAxiom';

RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN : 'conceptSpecializationAxiom';

RULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN : 'extendsAspect';

RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN : 'reifiedRelationshipSpecializationAxiom';

RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN : 'entityScalarDataPropertyExistentialRestrictionAxiom';

RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN : 'entityScalarDataPropertyUniversalRestrictionAxiom';

RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN : 'entityScalarDataPropertyParticularRestrictionAxiom';

RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN : 'synonymScalarRestriction';

RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN : 'numericScalarRestriction';

RULE_STRING_SCALAR_RESTRICTION_TOKEN : 'stringScalarRestriction';

RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN : 'plainLiteralScalarRestriction';

RULE_BINARY_SCALAR_RESTRICTION_TOKEN : 'binaryScalarRestriction';

RULE_IRI_SCALAR_RESTRICTION_TOKEN : 'iriScalarRestriction';

RULE_TIME_SCALAR_RESTRICTION_TOKEN : 'timeScalarRestriction';

RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN : 'scalarOneOfRestriction';

RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN : 'scalarOneOfLiteralAxiom';

RULE_LCURLY : '{';

RULE_RCURLY : '}';

RULE_EQUAL : '=';

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'?|'\'' ('\\' .|~(('\\'|'\'')))* '\''?);

RULE_IRI : '<' ~('>')* '>';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'$'|'_') ('a'..'z'|'A'..'Z'|'$'|'_'|'0'..'9')*;

RULE_UUID : RULE_HEX_8DIGITS '-' RULE_HEX_4DIGITS '-' RULE_HEX_4DIGITS '-' RULE_HEX_4DIGITS '-' RULE_HEX_12DIGITS;

fragment RULE_HEX_12DIGITS : RULE_HEX_8DIGITS RULE_HEX_4DIGITS;

fragment RULE_HEX_8DIGITS : RULE_HEX_4DIGITS RULE_HEX_4DIGITS;

fragment RULE_HEX_4DIGITS : RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT;

fragment RULE_HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F');

RULE_HEX : ('0x'|'0X') ('0'..'9'|'a'..'f'|'A'..'F'|'_')+ ('#' (('b'|'B') ('i'|'I')|('l'|'L')))?;

RULE_INT : '0'..'9' ('0'..'9'|'_')*;

RULE_DECIMAL : RULE_INT (('e'|'E') ('+'|'-')? RULE_INT)? (('b'|'B') ('i'|'I'|'d'|'D')|('l'|'L'|'d'|'D'|'f'|'F'))?;

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
