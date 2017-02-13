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
grammar InternalOntologicalModelingLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package jpl.imce.oml.specification.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package jpl.imce.oml.specification.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import jpl.imce.oml.specification.services.OntologicalModelingLanguageGrammarAccess;

}

@parser::members {

 	private OntologicalModelingLanguageGrammarAccess grammarAccess;

    public InternalOntologicalModelingLanguageParser(TokenStream input, OntologicalModelingLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "TerminologyExtent";
   	}

   	@Override
   	protected OntologicalModelingLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleTerminologyExtent
entryRuleTerminologyExtent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTerminologyExtentRule()); }
	iv_ruleTerminologyExtent=ruleTerminologyExtent
	{ $current=$iv_ruleTerminologyExtent.current; }
	EOF;

// Rule TerminologyExtent
ruleTerminologyExtent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getTerminologyExtentAccess().getTerminologyExtentAction_0(),
					$current);
			}
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getTerminologyExtentAccess().getAnnotationPropertiesAnnotationPropertyParserRuleCall_1_0_0());
					}
					lv_annotationProperties_1_0=ruleAnnotationProperty
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTerminologyExtentRule());
						}
						add(
							$current,
							"annotationProperties",
							lv_annotationProperties_1_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.AnnotationProperty");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getTerminologyExtentAccess().getTerminologyGraphsTerminologyGraphParserRuleCall_1_1_0());
					}
					lv_terminologyGraphs_2_0=ruleTerminologyGraph
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTerminologyExtentRule());
						}
						add(
							$current,
							"terminologyGraphs",
							lv_terminologyGraphs_2_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.TerminologyGraph");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getTerminologyExtentAccess().getBundlesBundleParserRuleCall_1_2_0());
					}
					lv_bundles_3_0=ruleBundle
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTerminologyExtentRule());
						}
						add(
							$current,
							"bundles",
							lv_bundles_3_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.Bundle");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getTerminologyExtentAccess().getDescriptionsDescriptionBoxParserRuleCall_1_3_0());
					}
					lv_descriptions_4_0=ruleDescriptionBox
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTerminologyExtentRule());
						}
						add(
							$current,
							"descriptions",
							lv_descriptions_4_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.DescriptionBox");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleAnnotationProperty
entryRuleAnnotationProperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAnnotationPropertyRule()); }
	iv_ruleAnnotationProperty=ruleAnnotationProperty
	{ $current=$iv_ruleAnnotationProperty.current; }
	EOF;

// Rule AnnotationProperty
ruleAnnotationProperty returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ANNOTATION_PROPERTY_TOKEN_0=RULE_ANNOTATION_PROPERTY_TOKEN
		{
			newLeafNode(this_ANNOTATION_PROPERTY_TOKEN_0, grammarAccess.getAnnotationPropertyAccess().getANNOTATION_PROPERTY_TOKENTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAnnotationPropertyAccess().getAbbrevIRIABBREV_IRIParserRuleCall_1_0());
				}
				lv_abbrevIRI_1_0=ruleABBREV_IRI
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAnnotationPropertyRule());
					}
					set(
						$current,
						"abbrevIRI",
						lv_abbrevIRI_1_0,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.ABBREV_IRI");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_EQUAL_2=RULE_EQUAL
		{
			newLeafNode(this_EQUAL_2, grammarAccess.getAnnotationPropertyAccess().getEQUALTerminalRuleCall_2());
		}
		(
			(
				lv_iri_3_0=RULE_IRI
				{
					newLeafNode(lv_iri_3_0, grammarAccess.getAnnotationPropertyAccess().getIriIRITerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAnnotationPropertyRule());
					}
					setWithLastConsumed(
						$current,
						"iri",
						lv_iri_3_0,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.IRI");
				}
			)
		)
	)
;

// Entry rule entryRuleAnnotation
entryRuleAnnotation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAnnotationRule()); }
	iv_ruleAnnotation=ruleAnnotation
	{ $current=$iv_ruleAnnotation.current; }
	EOF;

// Rule Annotation
ruleAnnotation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ANNOTATION_TOKEN_0=RULE_ANNOTATION_TOKEN
		{
			newLeafNode(this_ANNOTATION_TOKEN_0, grammarAccess.getAnnotationAccess().getANNOTATION_TOKENTerminalRuleCall_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAnnotationRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getAnnotationAccess().getPropertyAnnotationPropertyCrossReference_1_0());
				}
				ruleABBREV_IRI
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_EQUAL_2=RULE_EQUAL
		{
			newLeafNode(this_EQUAL_2, grammarAccess.getAnnotationAccess().getEQUALTerminalRuleCall_2());
		}
		(
			(
				lv_value_3_0=RULE_STRING
				{
					newLeafNode(lv_value_3_0, grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAnnotationRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_3_0,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleTerminologyGraph
entryRuleTerminologyGraph returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTerminologyGraphRule()); }
	iv_ruleTerminologyGraph=ruleTerminologyGraph
	{ $current=$iv_ruleTerminologyGraph.current; }
	EOF;

// Rule TerminologyGraph
ruleTerminologyGraph returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getTerminologyGraphAccess().getKindTerminologyGraphKindEnumRuleCall_0_0());
				}
				lv_kind_0_0=ruleTerminologyGraphKind
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTerminologyGraphRule());
					}
					set(
						$current,
						"kind",
						lv_kind_0_0,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.TerminologyGraphKind");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_TERMINOLOGY_GRAPH_TOKEN_1=RULE_TERMINOLOGY_GRAPH_TOKEN
		{
			newLeafNode(this_TERMINOLOGY_GRAPH_TOKEN_1, grammarAccess.getTerminologyGraphAccess().getTERMINOLOGY_GRAPH_TOKENTerminalRuleCall_1());
		}
		(
			(
				lv_iri_2_0=RULE_IRI
				{
					newLeafNode(lv_iri_2_0, grammarAccess.getTerminologyGraphAccess().getIriIRITerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTerminologyGraphRule());
					}
					setWithLastConsumed(
						$current,
						"iri",
						lv_iri_2_0,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.IRI");
				}
			)
		)
		this_LCURLY_3=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_3, grammarAccess.getTerminologyGraphAccess().getLCURLYTerminalRuleCall_3());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getTerminologyGraphAccess().getAnnotationsAnnotationParserRuleCall_4_0_0());
					}
					lv_annotations_4_0=ruleAnnotation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTerminologyGraphRule());
						}
						add(
							$current,
							"annotations",
							lv_annotations_4_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.Annotation");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getTerminologyGraphAccess().getTerminologyBoxAxiomsTerminologyBoxAxiomParserRuleCall_4_1_0());
					}
					lv_terminologyBoxAxioms_5_0=ruleTerminologyBoxAxiom
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTerminologyGraphRule());
						}
						add(
							$current,
							"terminologyBoxAxioms",
							lv_terminologyBoxAxioms_5_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.TerminologyBoxAxiom");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getTerminologyGraphAccess().getBoxStatementsTerminologyBoxStatementParserRuleCall_4_2_0());
					}
					lv_boxStatements_6_0=ruleTerminologyBoxStatement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTerminologyGraphRule());
						}
						add(
							$current,
							"boxStatements",
							lv_boxStatements_6_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.TerminologyBoxStatement");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		this_RCURLY_7=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_7, grammarAccess.getTerminologyGraphAccess().getRCURLYTerminalRuleCall_5());
		}
	)
;

// Entry rule entryRuleBundle
entryRuleBundle returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBundleRule()); }
	iv_ruleBundle=ruleBundle
	{ $current=$iv_ruleBundle.current; }
	EOF;

// Rule Bundle
ruleBundle returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getBundleAccess().getKindTerminologyGraphKindEnumRuleCall_0_0());
				}
				lv_kind_0_0=ruleTerminologyGraphKind
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBundleRule());
					}
					set(
						$current,
						"kind",
						lv_kind_0_0,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.TerminologyGraphKind");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_BUNDLE_TOKEN_1=RULE_BUNDLE_TOKEN
		{
			newLeafNode(this_BUNDLE_TOKEN_1, grammarAccess.getBundleAccess().getBUNDLE_TOKENTerminalRuleCall_1());
		}
		(
			(
				lv_iri_2_0=RULE_IRI
				{
					newLeafNode(lv_iri_2_0, grammarAccess.getBundleAccess().getIriIRITerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBundleRule());
					}
					setWithLastConsumed(
						$current,
						"iri",
						lv_iri_2_0,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.IRI");
				}
			)
		)
		this_LCURLY_3=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_3, grammarAccess.getBundleAccess().getLCURLYTerminalRuleCall_3());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getBundleAccess().getAnnotationsAnnotationParserRuleCall_4_0_0());
					}
					lv_annotations_4_0=ruleAnnotation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBundleRule());
						}
						add(
							$current,
							"annotations",
							lv_annotations_4_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.Annotation");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getBundleAccess().getTerminologyBoxAxiomsTerminologyBoxAxiomParserRuleCall_4_1_0());
					}
					lv_terminologyBoxAxioms_5_0=ruleTerminologyBoxAxiom
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBundleRule());
						}
						add(
							$current,
							"terminologyBoxAxioms",
							lv_terminologyBoxAxioms_5_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.TerminologyBoxAxiom");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getBundleAccess().getBoxStatementsTerminologyBoxStatementParserRuleCall_4_2_0());
					}
					lv_boxStatements_6_0=ruleTerminologyBoxStatement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBundleRule());
						}
						add(
							$current,
							"boxStatements",
							lv_boxStatements_6_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.TerminologyBoxStatement");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getBundleAccess().getBundleStatementsTerminologyBundleStatementParserRuleCall_4_3_0());
					}
					lv_bundleStatements_7_0=ruleTerminologyBundleStatement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBundleRule());
						}
						add(
							$current,
							"bundleStatements",
							lv_bundleStatements_7_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.TerminologyBundleStatement");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getBundleAccess().getTerminologyBundleAxiomsTerminologyBundleAxiomParserRuleCall_4_4_0());
					}
					lv_terminologyBundleAxioms_8_0=ruleTerminologyBundleAxiom
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBundleRule());
						}
						add(
							$current,
							"terminologyBundleAxioms",
							lv_terminologyBundleAxioms_8_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.TerminologyBundleAxiom");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		this_RCURLY_9=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_9, grammarAccess.getBundleAccess().getRCURLYTerminalRuleCall_5());
		}
	)
;

// Entry rule entryRuleTerminologyBoxAxiom
entryRuleTerminologyBoxAxiom returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTerminologyBoxAxiomRule()); }
	iv_ruleTerminologyBoxAxiom=ruleTerminologyBoxAxiom
	{ $current=$iv_ruleTerminologyBoxAxiom.current; }
	EOF;

// Rule TerminologyBoxAxiom
ruleTerminologyBoxAxiom returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTerminologyBoxAxiomAccess().getConceptDesignationTerminologyAxiomParserRuleCall_0());
		}
		this_ConceptDesignationTerminologyAxiom_0=ruleConceptDesignationTerminologyAxiom
		{
			$current = $this_ConceptDesignationTerminologyAxiom_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTerminologyBoxAxiomAccess().getTerminologyExtensionAxiomParserRuleCall_1());
		}
		this_TerminologyExtensionAxiom_1=ruleTerminologyExtensionAxiom
		{
			$current = $this_TerminologyExtensionAxiom_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTerminologyBoxAxiomAccess().getTerminologyNestingAxiomParserRuleCall_2());
		}
		this_TerminologyNestingAxiom_2=ruleTerminologyNestingAxiom
		{
			$current = $this_TerminologyNestingAxiom_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleTerminologyBoxStatement
entryRuleTerminologyBoxStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTerminologyBoxStatementRule()); }
	iv_ruleTerminologyBoxStatement=ruleTerminologyBoxStatement
	{ $current=$iv_ruleTerminologyBoxStatement.current; }
	EOF;

// Rule TerminologyBoxStatement
ruleTerminologyBoxStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTerminologyBoxStatementAccess().getAxiomParserRuleCall_0());
		}
		this_Axiom_0=ruleAxiom
		{
			$current = $this_Axiom_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTerminologyBoxStatementAccess().getTermParserRuleCall_1());
		}
		this_Term_1=ruleTerm
		{
			$current = $this_Term_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleTerm
entryRuleTerm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTermRule()); }
	iv_ruleTerm=ruleTerm
	{ $current=$iv_ruleTerm.current; }
	EOF;

// Rule Term
ruleTerm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTermAccess().getAtomicEntityParserRuleCall_0());
		}
		this_AtomicEntity_0=ruleAtomicEntity
		{
			$current = $this_AtomicEntity_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTermAccess().getEntityRelationshipParserRuleCall_1());
		}
		this_EntityRelationship_1=ruleEntityRelationship
		{
			$current = $this_EntityRelationship_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTermAccess().getDatatypeParserRuleCall_2());
		}
		this_Datatype_2=ruleDatatype
		{
			$current = $this_Datatype_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTermAccess().getDataRelationshipParserRuleCall_3());
		}
		this_DataRelationship_3=ruleDataRelationship
		{
			$current = $this_DataRelationship_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAtomicEntity
entryRuleAtomicEntity returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAtomicEntityRule()); }
	iv_ruleAtomicEntity=ruleAtomicEntity
	{ $current=$iv_ruleAtomicEntity.current; }
	EOF;

// Rule AtomicEntity
ruleAtomicEntity returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAtomicEntityAccess().getAspectParserRuleCall_0());
		}
		this_Aspect_0=ruleAspect
		{
			$current = $this_Aspect_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAtomicEntityAccess().getConceptParserRuleCall_1());
		}
		this_Concept_1=ruleConcept
		{
			$current = $this_Concept_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEntityRelationship
entryRuleEntityRelationship returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityRelationshipRule()); }
	iv_ruleEntityRelationship=ruleEntityRelationship
	{ $current=$iv_ruleEntityRelationship.current; }
	EOF;

// Rule EntityRelationship
ruleEntityRelationship returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getEntityRelationshipAccess().getReifiedRelationshipParserRuleCall_0());
		}
		this_ReifiedRelationship_0=ruleReifiedRelationship
		{
			$current = $this_ReifiedRelationship_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getEntityRelationshipAccess().getUnreifiedRelationshipParserRuleCall_1());
		}
		this_UnreifiedRelationship_1=ruleUnreifiedRelationship
		{
			$current = $this_UnreifiedRelationship_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDatatype
entryRuleDatatype returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDatatypeRule()); }
	iv_ruleDatatype=ruleDatatype
	{ $current=$iv_ruleDatatype.current; }
	EOF;

// Rule Datatype
ruleDatatype returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getDatatypeAccess().getScalarDataRangeParserRuleCall_0());
		}
		this_ScalarDataRange_0=ruleScalarDataRange
		{
			$current = $this_ScalarDataRange_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDatatypeAccess().getStructureParserRuleCall_1());
		}
		this_Structure_1=ruleStructure
		{
			$current = $this_Structure_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleScalarDataRange
entryRuleScalarDataRange returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScalarDataRangeRule()); }
	iv_ruleScalarDataRange=ruleScalarDataRange
	{ $current=$iv_ruleScalarDataRange.current; }
	EOF;

// Rule ScalarDataRange
ruleScalarDataRange returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getScalarDataRangeAccess().getScalarParserRuleCall_0());
		}
		this_Scalar_0=ruleScalar
		{
			$current = $this_Scalar_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getScalarDataRangeAccess().getRestrictedDataRangeParserRuleCall_1());
		}
		this_RestrictedDataRange_1=ruleRestrictedDataRange
		{
			$current = $this_RestrictedDataRange_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleRestrictedDataRange
entryRuleRestrictedDataRange returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRestrictedDataRangeRule()); }
	iv_ruleRestrictedDataRange=ruleRestrictedDataRange
	{ $current=$iv_ruleRestrictedDataRange.current; }
	EOF;

// Rule RestrictedDataRange
ruleRestrictedDataRange returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getRestrictedDataRangeAccess().getBinaryScalarRestrictionParserRuleCall_0());
		}
		this_BinaryScalarRestriction_0=ruleBinaryScalarRestriction
		{
			$current = $this_BinaryScalarRestriction_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRestrictedDataRangeAccess().getIRIScalarRestrictionParserRuleCall_1());
		}
		this_IRIScalarRestriction_1=ruleIRIScalarRestriction
		{
			$current = $this_IRIScalarRestriction_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRestrictedDataRangeAccess().getNumericScalarRestrictionParserRuleCall_2());
		}
		this_NumericScalarRestriction_2=ruleNumericScalarRestriction
		{
			$current = $this_NumericScalarRestriction_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRestrictedDataRangeAccess().getPlainLiteralScalarRestrictionParserRuleCall_3());
		}
		this_PlainLiteralScalarRestriction_3=rulePlainLiteralScalarRestriction
		{
			$current = $this_PlainLiteralScalarRestriction_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRestrictedDataRangeAccess().getScalarOneOfRestrictionParserRuleCall_4());
		}
		this_ScalarOneOfRestriction_4=ruleScalarOneOfRestriction
		{
			$current = $this_ScalarOneOfRestriction_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRestrictedDataRangeAccess().getStringScalarRestrictionParserRuleCall_5());
		}
		this_StringScalarRestriction_5=ruleStringScalarRestriction
		{
			$current = $this_StringScalarRestriction_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRestrictedDataRangeAccess().getSynonymScalarRestrictionParserRuleCall_6());
		}
		this_SynonymScalarRestriction_6=ruleSynonymScalarRestriction
		{
			$current = $this_SynonymScalarRestriction_6.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRestrictedDataRangeAccess().getTimeScalarRestrictionParserRuleCall_7());
		}
		this_TimeScalarRestriction_7=ruleTimeScalarRestriction
		{
			$current = $this_TimeScalarRestriction_7.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDataRelationship
entryRuleDataRelationship returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDataRelationshipRule()); }
	iv_ruleDataRelationship=ruleDataRelationship
	{ $current=$iv_ruleDataRelationship.current; }
	EOF;

// Rule DataRelationship
ruleDataRelationship returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getDataRelationshipAccess().getEntityStructuredDataPropertyParserRuleCall_0());
		}
		this_EntityStructuredDataProperty_0=ruleEntityStructuredDataProperty
		{
			$current = $this_EntityStructuredDataProperty_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDataRelationshipAccess().getEntityScalarDataPropertyParserRuleCall_1());
		}
		this_EntityScalarDataProperty_1=ruleEntityScalarDataProperty
		{
			$current = $this_EntityScalarDataProperty_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDataRelationshipAccess().getStructuredDataPropertyParserRuleCall_2());
		}
		this_StructuredDataProperty_2=ruleStructuredDataProperty
		{
			$current = $this_StructuredDataProperty_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDataRelationshipAccess().getScalarDataPropertyParserRuleCall_3());
		}
		this_ScalarDataProperty_3=ruleScalarDataProperty
		{
			$current = $this_ScalarDataProperty_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAxiom
entryRuleAxiom returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAxiomRule()); }
	iv_ruleAxiom=ruleAxiom
	{ $current=$iv_ruleAxiom.current; }
	EOF;

// Rule Axiom
ruleAxiom returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAxiomAccess().getScalarOneOfLiteralAxiomParserRuleCall_0());
		}
		this_ScalarOneOfLiteralAxiom_0=ruleScalarOneOfLiteralAxiom
		{
			$current = $this_ScalarOneOfLiteralAxiom_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAxiomAccess().getTermAxiomParserRuleCall_1());
		}
		this_TermAxiom_1=ruleTermAxiom
		{
			$current = $this_TermAxiom_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleTermAxiom
entryRuleTermAxiom returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTermAxiomRule()); }
	iv_ruleTermAxiom=ruleTermAxiom
	{ $current=$iv_ruleTermAxiom.current; }
	EOF;

// Rule TermAxiom
ruleTermAxiom returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTermAxiomAccess().getEntityRestrictionAxiomParserRuleCall_0());
		}
		this_EntityRestrictionAxiom_0=ruleEntityRestrictionAxiom
		{
			$current = $this_EntityRestrictionAxiom_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTermAxiomAccess().getEntityScalarDataPropertyRestrictionAxiomParserRuleCall_1());
		}
		this_EntityScalarDataPropertyRestrictionAxiom_1=ruleEntityScalarDataPropertyRestrictionAxiom
		{
			$current = $this_EntityScalarDataPropertyRestrictionAxiom_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTermAxiomAccess().getSpecializationAxiomParserRuleCall_2());
		}
		this_SpecializationAxiom_2=ruleSpecializationAxiom
		{
			$current = $this_SpecializationAxiom_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEntityRestrictionAxiom
entryRuleEntityRestrictionAxiom returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityRestrictionAxiomRule()); }
	iv_ruleEntityRestrictionAxiom=ruleEntityRestrictionAxiom
	{ $current=$iv_ruleEntityRestrictionAxiom.current; }
	EOF;

// Rule EntityRestrictionAxiom
ruleEntityRestrictionAxiom returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getEntityRestrictionAxiomAccess().getEntityExistentialRestrictionAxiomParserRuleCall_0());
		}
		this_EntityExistentialRestrictionAxiom_0=ruleEntityExistentialRestrictionAxiom
		{
			$current = $this_EntityExistentialRestrictionAxiom_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getEntityRestrictionAxiomAccess().getEntityUniversalRestrictionAxiomParserRuleCall_1());
		}
		this_EntityUniversalRestrictionAxiom_1=ruleEntityUniversalRestrictionAxiom
		{
			$current = $this_EntityUniversalRestrictionAxiom_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEntityScalarDataPropertyRestrictionAxiom
entryRuleEntityScalarDataPropertyRestrictionAxiom returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityScalarDataPropertyRestrictionAxiomRule()); }
	iv_ruleEntityScalarDataPropertyRestrictionAxiom=ruleEntityScalarDataPropertyRestrictionAxiom
	{ $current=$iv_ruleEntityScalarDataPropertyRestrictionAxiom.current; }
	EOF;

// Rule EntityScalarDataPropertyRestrictionAxiom
ruleEntityScalarDataPropertyRestrictionAxiom returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getEntityScalarDataPropertyRestrictionAxiomAccess().getEntityScalarDataPropertyExistentialRestrictionAxiomParserRuleCall_0());
		}
		this_EntityScalarDataPropertyExistentialRestrictionAxiom_0=ruleEntityScalarDataPropertyExistentialRestrictionAxiom
		{
			$current = $this_EntityScalarDataPropertyExistentialRestrictionAxiom_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getEntityScalarDataPropertyRestrictionAxiomAccess().getEntityScalarDataPropertyParticularRestrictionAxiomParserRuleCall_1());
		}
		this_EntityScalarDataPropertyParticularRestrictionAxiom_1=ruleEntityScalarDataPropertyParticularRestrictionAxiom
		{
			$current = $this_EntityScalarDataPropertyParticularRestrictionAxiom_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getEntityScalarDataPropertyRestrictionAxiomAccess().getEntityScalarDataPropertyUniversalRestrictionAxiomParserRuleCall_2());
		}
		this_EntityScalarDataPropertyUniversalRestrictionAxiom_2=ruleEntityScalarDataPropertyUniversalRestrictionAxiom
		{
			$current = $this_EntityScalarDataPropertyUniversalRestrictionAxiom_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleSpecializationAxiom
entryRuleSpecializationAxiom returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSpecializationAxiomRule()); }
	iv_ruleSpecializationAxiom=ruleSpecializationAxiom
	{ $current=$iv_ruleSpecializationAxiom.current; }
	EOF;

// Rule SpecializationAxiom
ruleSpecializationAxiom returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getSpecializationAxiomAccess().getConceptSpecializationAxiomParserRuleCall_0());
		}
		this_ConceptSpecializationAxiom_0=ruleConceptSpecializationAxiom
		{
			$current = $this_ConceptSpecializationAxiom_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getSpecializationAxiomAccess().getAspectSpecializationAxiomParserRuleCall_1());
		}
		this_AspectSpecializationAxiom_1=ruleAspectSpecializationAxiom
		{
			$current = $this_AspectSpecializationAxiom_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getSpecializationAxiomAccess().getReifiedRelationshipSpecializationAxiomParserRuleCall_2());
		}
		this_ReifiedRelationshipSpecializationAxiom_2=ruleReifiedRelationshipSpecializationAxiom
		{
			$current = $this_ReifiedRelationshipSpecializationAxiom_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleTerminologyBundleStatement
entryRuleTerminologyBundleStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTerminologyBundleStatementRule()); }
	iv_ruleTerminologyBundleStatement=ruleTerminologyBundleStatement
	{ $current=$iv_ruleTerminologyBundleStatement.current; }
	EOF;

// Rule TerminologyBundleStatement
ruleTerminologyBundleStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTerminologyBundleStatementAccess().getAnonymousConceptTaxonomyAxiomParserRuleCall_0());
		}
		this_AnonymousConceptTaxonomyAxiom_0=ruleAnonymousConceptTaxonomyAxiom
		{
			$current = $this_AnonymousConceptTaxonomyAxiom_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTerminologyBundleStatementAccess().getRootConceptTaxonomyAxiomParserRuleCall_1());
		}
		this_RootConceptTaxonomyAxiom_1=ruleRootConceptTaxonomyAxiom
		{
			$current = $this_RootConceptTaxonomyAxiom_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTerminologyBundleStatementAccess().getSpecificDisjointConceptAxiomParserRuleCall_2());
		}
		this_SpecificDisjointConceptAxiom_2=ruleSpecificDisjointConceptAxiom
		{
			$current = $this_SpecificDisjointConceptAxiom_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleTerminologyBundleAxiom
entryRuleTerminologyBundleAxiom returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTerminologyBundleAxiomRule()); }
	iv_ruleTerminologyBundleAxiom=ruleTerminologyBundleAxiom
	{ $current=$iv_ruleTerminologyBundleAxiom.current; }
	EOF;

// Rule TerminologyBundleAxiom
ruleTerminologyBundleAxiom returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getTerminologyBundleAxiomAccess().getBundledTerminologyAxiomParserRuleCall());
	}
	this_BundledTerminologyAxiom_0=ruleBundledTerminologyAxiom
	{
		$current = $this_BundledTerminologyAxiom_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleAspect
entryRuleAspect returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAspectRule()); }
	iv_ruleAspect=ruleAspect
	{ $current=$iv_ruleAspect.current; }
	EOF;

// Rule Aspect
ruleAspect returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ASPECT_TOKEN_0=RULE_ASPECT_TOKEN
		{
			newLeafNode(this_ASPECT_TOKEN_0, grammarAccess.getAspectAccess().getASPECT_TOKENTerminalRuleCall_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getAspectAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAspectRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleConcept
entryRuleConcept returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConceptRule()); }
	iv_ruleConcept=ruleConcept
	{ $current=$iv_ruleConcept.current; }
	EOF;

// Rule Concept
ruleConcept returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_isAbstract_0_0=RULE_ABSTRACT_TOKEN
				{
					newLeafNode(lv_isAbstract_0_0, grammarAccess.getConceptAccess().getIsAbstractABSTRACT_TOKENTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConceptRule());
					}
					setWithLastConsumed(
						$current,
						"isAbstract",
						true,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.ABSTRACT_TOKEN");
				}
			)
		)?
		this_CONCEPT_TOKEN_1=RULE_CONCEPT_TOKEN
		{
			newLeafNode(this_CONCEPT_TOKEN_1, grammarAccess.getConceptAccess().getCONCEPT_TOKENTerminalRuleCall_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getConceptAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConceptRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleReifiedRelationship
entryRuleReifiedRelationship returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReifiedRelationshipRule()); }
	iv_ruleReifiedRelationship=ruleReifiedRelationship
	{ $current=$iv_ruleReifiedRelationship.current; }
	EOF;

// Rule ReifiedRelationship
ruleReifiedRelationship returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_isAbstract_0_0=RULE_ABSTRACT_TOKEN
				{
					newLeafNode(lv_isAbstract_0_0, grammarAccess.getReifiedRelationshipAccess().getIsAbstractABSTRACT_TOKENTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReifiedRelationshipRule());
					}
					setWithLastConsumed(
						$current,
						"isAbstract",
						true,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.ABSTRACT_TOKEN");
				}
			)
		)?
		this_REIFIED_RELATIONSHIP_TOKEN_1=RULE_REIFIED_RELATIONSHIP_TOKEN
		{
			newLeafNode(this_REIFIED_RELATIONSHIP_TOKEN_1, grammarAccess.getReifiedRelationshipAccess().getREIFIED_RELATIONSHIP_TOKENTerminalRuleCall_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getReifiedRelationshipAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReifiedRelationshipRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
				}
			)
		)
		this_LCURLY_3=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_3, grammarAccess.getReifiedRelationshipAccess().getLCURLYTerminalRuleCall_3());
		}
		(
			(
				lv_isFunctional_4_0=RULE_FUNCTIONAL_TOKEN
				{
					newLeafNode(lv_isFunctional_4_0, grammarAccess.getReifiedRelationshipAccess().getIsFunctionalFUNCTIONAL_TOKENTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReifiedRelationshipRule());
					}
					setWithLastConsumed(
						$current,
						"isFunctional",
						true,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.FUNCTIONAL_TOKEN");
				}
			)
		)?
		(
			(
				lv_isInverseFunctional_5_0=RULE_INVERSE_FUNCTIONAL_TOKEN
				{
					newLeafNode(lv_isInverseFunctional_5_0, grammarAccess.getReifiedRelationshipAccess().getIsInverseFunctionalINVERSE_FUNCTIONAL_TOKENTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReifiedRelationshipRule());
					}
					setWithLastConsumed(
						$current,
						"isInverseFunctional",
						true,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.INVERSE_FUNCTIONAL_TOKEN");
				}
			)
		)?
		(
			(
				lv_isEssential_6_0=RULE_ESSENTIAL_TOKEN
				{
					newLeafNode(lv_isEssential_6_0, grammarAccess.getReifiedRelationshipAccess().getIsEssentialESSENTIAL_TOKENTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReifiedRelationshipRule());
					}
					setWithLastConsumed(
						$current,
						"isEssential",
						true,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.ESSENTIAL_TOKEN");
				}
			)
		)?
		(
			(
				lv_isInverseEssential_7_0=RULE_INVERSE_ESSENTIAL_TOKEN
				{
					newLeafNode(lv_isInverseEssential_7_0, grammarAccess.getReifiedRelationshipAccess().getIsInverseEssentialINVERSE_ESSENTIAL_TOKENTerminalRuleCall_7_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReifiedRelationshipRule());
					}
					setWithLastConsumed(
						$current,
						"isInverseEssential",
						true,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.INVERSE_ESSENTIAL_TOKEN");
				}
			)
		)?
		(
			(
				lv_isSymmetric_8_0=RULE_SYMMETRIC_TOKEN
				{
					newLeafNode(lv_isSymmetric_8_0, grammarAccess.getReifiedRelationshipAccess().getIsSymmetricSYMMETRIC_TOKENTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReifiedRelationshipRule());
					}
					setWithLastConsumed(
						$current,
						"isSymmetric",
						true,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.SYMMETRIC_TOKEN");
				}
			)
		)?
		(
			(
				lv_isAsymmetric_9_0=RULE_ASYMMETRIC_TOKEN
				{
					newLeafNode(lv_isAsymmetric_9_0, grammarAccess.getReifiedRelationshipAccess().getIsAsymmetricASYMMETRIC_TOKENTerminalRuleCall_9_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReifiedRelationshipRule());
					}
					setWithLastConsumed(
						$current,
						"isAsymmetric",
						true,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.ASYMMETRIC_TOKEN");
				}
			)
		)?
		(
			(
				lv_isReflexive_10_0=RULE_REFLEXIVE_TOKEN
				{
					newLeafNode(lv_isReflexive_10_0, grammarAccess.getReifiedRelationshipAccess().getIsReflexiveREFLEXIVE_TOKENTerminalRuleCall_10_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReifiedRelationshipRule());
					}
					setWithLastConsumed(
						$current,
						"isReflexive",
						true,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.REFLEXIVE_TOKEN");
				}
			)
		)?
		(
			(
				lv_isIrreflexive_11_0=RULE_IRREFLEXIVE_TOKEN
				{
					newLeafNode(lv_isIrreflexive_11_0, grammarAccess.getReifiedRelationshipAccess().getIsIrreflexiveIRREFLEXIVE_TOKENTerminalRuleCall_11_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReifiedRelationshipRule());
					}
					setWithLastConsumed(
						$current,
						"isIrreflexive",
						true,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.IRREFLEXIVE_TOKEN");
				}
			)
		)?
		(
			(
				lv_isTransitive_12_0=RULE_TRANSITIVE_TOKEN
				{
					newLeafNode(lv_isTransitive_12_0, grammarAccess.getReifiedRelationshipAccess().getIsTransitiveTRANSITIVE_TOKENTerminalRuleCall_12_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReifiedRelationshipRule());
					}
					setWithLastConsumed(
						$current,
						"isTransitive",
						true,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.TRANSITIVE_TOKEN");
				}
			)
		)?
		this_UNREIFIED_TOKEN_13=RULE_UNREIFIED_TOKEN
		{
			newLeafNode(this_UNREIFIED_TOKEN_13, grammarAccess.getReifiedRelationshipAccess().getUNREIFIED_TOKENTerminalRuleCall_13());
		}
		this_EQUAL_14=RULE_EQUAL
		{
			newLeafNode(this_EQUAL_14, grammarAccess.getReifiedRelationshipAccess().getEQUALTerminalRuleCall_14());
		}
		(
			(
				lv_unreifiedPropertyName_15_0=RULE_ID
				{
					newLeafNode(lv_unreifiedPropertyName_15_0, grammarAccess.getReifiedRelationshipAccess().getUnreifiedPropertyNameIDTerminalRuleCall_15_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReifiedRelationshipRule());
					}
					setWithLastConsumed(
						$current,
						"unreifiedPropertyName",
						lv_unreifiedPropertyName_15_0,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
				}
			)
		)
		(
			this_INVERSE_TOKEN_16=RULE_INVERSE_TOKEN
			{
				newLeafNode(this_INVERSE_TOKEN_16, grammarAccess.getReifiedRelationshipAccess().getINVERSE_TOKENTerminalRuleCall_16_0());
			}
			this_EQUAL_17=RULE_EQUAL
			{
				newLeafNode(this_EQUAL_17, grammarAccess.getReifiedRelationshipAccess().getEQUALTerminalRuleCall_16_1());
			}
			(
				(
					lv_unreifiedInversePropertyName_18_0=RULE_ID
					{
						newLeafNode(lv_unreifiedInversePropertyName_18_0, grammarAccess.getReifiedRelationshipAccess().getUnreifiedInversePropertyNameIDTerminalRuleCall_16_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getReifiedRelationshipRule());
						}
						setWithLastConsumed(
							$current,
							"unreifiedInversePropertyName",
							lv_unreifiedInversePropertyName_18_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
					}
				)
			)
		)?
		this_SOURCE_TOKEN_19=RULE_SOURCE_TOKEN
		{
			newLeafNode(this_SOURCE_TOKEN_19, grammarAccess.getReifiedRelationshipAccess().getSOURCE_TOKENTerminalRuleCall_17());
		}
		this_EQUAL_20=RULE_EQUAL
		{
			newLeafNode(this_EQUAL_20, grammarAccess.getReifiedRelationshipAccess().getEQUALTerminalRuleCall_18());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReifiedRelationshipRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getReifiedRelationshipAccess().getSourceEntityCrossReference_19_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_TARGET_TOKEN_22=RULE_TARGET_TOKEN
		{
			newLeafNode(this_TARGET_TOKEN_22, grammarAccess.getReifiedRelationshipAccess().getTARGET_TOKENTerminalRuleCall_20());
		}
		this_EQUAL_23=RULE_EQUAL
		{
			newLeafNode(this_EQUAL_23, grammarAccess.getReifiedRelationshipAccess().getEQUALTerminalRuleCall_21());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReifiedRelationshipRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getReifiedRelationshipAccess().getTargetEntityCrossReference_22_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RCURLY_25=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_25, grammarAccess.getReifiedRelationshipAccess().getRCURLYTerminalRuleCall_23());
		}
	)
;

// Entry rule entryRuleUnreifiedRelationship
entryRuleUnreifiedRelationship returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnreifiedRelationshipRule()); }
	iv_ruleUnreifiedRelationship=ruleUnreifiedRelationship
	{ $current=$iv_ruleUnreifiedRelationship.current; }
	EOF;

// Rule UnreifiedRelationship
ruleUnreifiedRelationship returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_UNREIFIED_RELATIONSHIP_TOKEN_0=RULE_UNREIFIED_RELATIONSHIP_TOKEN
		{
			newLeafNode(this_UNREIFIED_RELATIONSHIP_TOKEN_0, grammarAccess.getUnreifiedRelationshipAccess().getUNREIFIED_RELATIONSHIP_TOKENTerminalRuleCall_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getUnreifiedRelationshipAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnreifiedRelationshipRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
				}
			)
		)
		this_LCURLY_2=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_2, grammarAccess.getUnreifiedRelationshipAccess().getLCURLYTerminalRuleCall_2());
		}
		(
			(
				lv_isFunctional_3_0=RULE_FUNCTIONAL_TOKEN
				{
					newLeafNode(lv_isFunctional_3_0, grammarAccess.getUnreifiedRelationshipAccess().getIsFunctionalFUNCTIONAL_TOKENTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnreifiedRelationshipRule());
					}
					setWithLastConsumed(
						$current,
						"isFunctional",
						true,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.FUNCTIONAL_TOKEN");
				}
			)
		)?
		(
			(
				lv_isInverseFunctional_4_0=RULE_INVERSE_FUNCTIONAL_TOKEN
				{
					newLeafNode(lv_isInverseFunctional_4_0, grammarAccess.getUnreifiedRelationshipAccess().getIsInverseFunctionalINVERSE_FUNCTIONAL_TOKENTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnreifiedRelationshipRule());
					}
					setWithLastConsumed(
						$current,
						"isInverseFunctional",
						true,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.INVERSE_FUNCTIONAL_TOKEN");
				}
			)
		)?
		(
			(
				lv_isEssential_5_0=RULE_ESSENTIAL_TOKEN
				{
					newLeafNode(lv_isEssential_5_0, grammarAccess.getUnreifiedRelationshipAccess().getIsEssentialESSENTIAL_TOKENTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnreifiedRelationshipRule());
					}
					setWithLastConsumed(
						$current,
						"isEssential",
						true,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.ESSENTIAL_TOKEN");
				}
			)
		)?
		(
			(
				lv_isInverseEssential_6_0=RULE_INVERSE_ESSENTIAL_TOKEN
				{
					newLeafNode(lv_isInverseEssential_6_0, grammarAccess.getUnreifiedRelationshipAccess().getIsInverseEssentialINVERSE_ESSENTIAL_TOKENTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnreifiedRelationshipRule());
					}
					setWithLastConsumed(
						$current,
						"isInverseEssential",
						true,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.INVERSE_ESSENTIAL_TOKEN");
				}
			)
		)?
		(
			(
				lv_isSymmetric_7_0=RULE_SYMMETRIC_TOKEN
				{
					newLeafNode(lv_isSymmetric_7_0, grammarAccess.getUnreifiedRelationshipAccess().getIsSymmetricSYMMETRIC_TOKENTerminalRuleCall_7_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnreifiedRelationshipRule());
					}
					setWithLastConsumed(
						$current,
						"isSymmetric",
						true,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.SYMMETRIC_TOKEN");
				}
			)
		)?
		(
			(
				lv_isAsymmetric_8_0=RULE_ASYMMETRIC_TOKEN
				{
					newLeafNode(lv_isAsymmetric_8_0, grammarAccess.getUnreifiedRelationshipAccess().getIsAsymmetricASYMMETRIC_TOKENTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnreifiedRelationshipRule());
					}
					setWithLastConsumed(
						$current,
						"isAsymmetric",
						true,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.ASYMMETRIC_TOKEN");
				}
			)
		)?
		(
			(
				lv_isReflexive_9_0=RULE_REFLEXIVE_TOKEN
				{
					newLeafNode(lv_isReflexive_9_0, grammarAccess.getUnreifiedRelationshipAccess().getIsReflexiveREFLEXIVE_TOKENTerminalRuleCall_9_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnreifiedRelationshipRule());
					}
					setWithLastConsumed(
						$current,
						"isReflexive",
						true,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.REFLEXIVE_TOKEN");
				}
			)
		)?
		(
			(
				lv_isIrreflexive_10_0=RULE_IRREFLEXIVE_TOKEN
				{
					newLeafNode(lv_isIrreflexive_10_0, grammarAccess.getUnreifiedRelationshipAccess().getIsIrreflexiveIRREFLEXIVE_TOKENTerminalRuleCall_10_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnreifiedRelationshipRule());
					}
					setWithLastConsumed(
						$current,
						"isIrreflexive",
						true,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.IRREFLEXIVE_TOKEN");
				}
			)
		)?
		(
			(
				lv_isTransitive_11_0=RULE_TRANSITIVE_TOKEN
				{
					newLeafNode(lv_isTransitive_11_0, grammarAccess.getUnreifiedRelationshipAccess().getIsTransitiveTRANSITIVE_TOKENTerminalRuleCall_11_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnreifiedRelationshipRule());
					}
					setWithLastConsumed(
						$current,
						"isTransitive",
						true,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.TRANSITIVE_TOKEN");
				}
			)
		)?
		this_SOURCE_TOKEN_12=RULE_SOURCE_TOKEN
		{
			newLeafNode(this_SOURCE_TOKEN_12, grammarAccess.getUnreifiedRelationshipAccess().getSOURCE_TOKENTerminalRuleCall_12());
		}
		this_EQUAL_13=RULE_EQUAL
		{
			newLeafNode(this_EQUAL_13, grammarAccess.getUnreifiedRelationshipAccess().getEQUALTerminalRuleCall_13());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnreifiedRelationshipRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getUnreifiedRelationshipAccess().getSourceEntityCrossReference_14_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_TARGET_TOKEN_15=RULE_TARGET_TOKEN
		{
			newLeafNode(this_TARGET_TOKEN_15, grammarAccess.getUnreifiedRelationshipAccess().getTARGET_TOKENTerminalRuleCall_15());
		}
		this_EQUAL_16=RULE_EQUAL
		{
			newLeafNode(this_EQUAL_16, grammarAccess.getUnreifiedRelationshipAccess().getEQUALTerminalRuleCall_16());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnreifiedRelationshipRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getUnreifiedRelationshipAccess().getTargetEntityCrossReference_17_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RCURLY_18=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_18, grammarAccess.getUnreifiedRelationshipAccess().getRCURLYTerminalRuleCall_18());
		}
	)
;

// Entry rule entryRuleScalar
entryRuleScalar returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScalarRule()); }
	iv_ruleScalar=ruleScalar
	{ $current=$iv_ruleScalar.current; }
	EOF;

// Rule Scalar
ruleScalar returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_SCALAR_TOKEN_0=RULE_SCALAR_TOKEN
		{
			newLeafNode(this_SCALAR_TOKEN_0, grammarAccess.getScalarAccess().getSCALAR_TOKENTerminalRuleCall_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getScalarAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getScalarRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleStructure
entryRuleStructure returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStructureRule()); }
	iv_ruleStructure=ruleStructure
	{ $current=$iv_ruleStructure.current; }
	EOF;

// Rule Structure
ruleStructure returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRUCTURE_TOKEN_0=RULE_STRUCTURE_TOKEN
		{
			newLeafNode(this_STRUCTURE_TOKEN_0, grammarAccess.getStructureAccess().getSTRUCTURE_TOKENTerminalRuleCall_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getStructureAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStructureRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleEntityStructuredDataProperty
entryRuleEntityStructuredDataProperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityStructuredDataPropertyRule()); }
	iv_ruleEntityStructuredDataProperty=ruleEntityStructuredDataProperty
	{ $current=$iv_ruleEntityStructuredDataProperty.current; }
	EOF;

// Rule EntityStructuredDataProperty
ruleEntityStructuredDataProperty returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='entityStructuredDataProperty'
		{
			newLeafNode(otherlv_0, grammarAccess.getEntityStructuredDataPropertyAccess().getEntityStructuredDataPropertyKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEntityStructuredDataPropertyAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityStructuredDataPropertyRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
				}
			)
		)
		this_LCURLY_2=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_2, grammarAccess.getEntityStructuredDataPropertyAccess().getLCURLYTerminalRuleCall_2());
		}
		this_DOMAIN_TOKEN_3=RULE_DOMAIN_TOKEN
		{
			newLeafNode(this_DOMAIN_TOKEN_3, grammarAccess.getEntityStructuredDataPropertyAccess().getDOMAIN_TOKENTerminalRuleCall_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityStructuredDataPropertyRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getEntityStructuredDataPropertyAccess().getDomainEntityCrossReference_4_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RANGE_TOKEN_5=RULE_RANGE_TOKEN
		{
			newLeafNode(this_RANGE_TOKEN_5, grammarAccess.getEntityStructuredDataPropertyAccess().getRANGE_TOKENTerminalRuleCall_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityStructuredDataPropertyRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getEntityStructuredDataPropertyAccess().getRangeStructureCrossReference_6_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RCURLY_7=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_7, grammarAccess.getEntityStructuredDataPropertyAccess().getRCURLYTerminalRuleCall_7());
		}
	)
;

// Entry rule entryRuleEntityScalarDataProperty
entryRuleEntityScalarDataProperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityScalarDataPropertyRule()); }
	iv_ruleEntityScalarDataProperty=ruleEntityScalarDataProperty
	{ $current=$iv_ruleEntityScalarDataProperty.current; }
	EOF;

// Rule EntityScalarDataProperty
ruleEntityScalarDataProperty returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='entityScalarDataProperty'
		{
			newLeafNode(otherlv_0, grammarAccess.getEntityScalarDataPropertyAccess().getEntityScalarDataPropertyKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEntityScalarDataPropertyAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityScalarDataPropertyRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
				}
			)
		)
		this_LCURLY_2=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_2, grammarAccess.getEntityScalarDataPropertyAccess().getLCURLYTerminalRuleCall_2());
		}
		this_DOMAIN_TOKEN_3=RULE_DOMAIN_TOKEN
		{
			newLeafNode(this_DOMAIN_TOKEN_3, grammarAccess.getEntityScalarDataPropertyAccess().getDOMAIN_TOKENTerminalRuleCall_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityScalarDataPropertyRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getEntityScalarDataPropertyAccess().getDomainEntityCrossReference_4_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RANGE_TOKEN_5=RULE_RANGE_TOKEN
		{
			newLeafNode(this_RANGE_TOKEN_5, grammarAccess.getEntityScalarDataPropertyAccess().getRANGE_TOKENTerminalRuleCall_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityScalarDataPropertyRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getEntityScalarDataPropertyAccess().getRangeDataRangeCrossReference_6_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RCURLY_7=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_7, grammarAccess.getEntityScalarDataPropertyAccess().getRCURLYTerminalRuleCall_7());
		}
	)
;

// Entry rule entryRuleStructuredDataProperty
entryRuleStructuredDataProperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStructuredDataPropertyRule()); }
	iv_ruleStructuredDataProperty=ruleStructuredDataProperty
	{ $current=$iv_ruleStructuredDataProperty.current; }
	EOF;

// Rule StructuredDataProperty
ruleStructuredDataProperty returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='structuredDataProperty'
		{
			newLeafNode(otherlv_0, grammarAccess.getStructuredDataPropertyAccess().getStructuredDataPropertyKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getStructuredDataPropertyAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStructuredDataPropertyRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
				}
			)
		)
		this_LCURLY_2=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_2, grammarAccess.getStructuredDataPropertyAccess().getLCURLYTerminalRuleCall_2());
		}
		this_DOMAIN_TOKEN_3=RULE_DOMAIN_TOKEN
		{
			newLeafNode(this_DOMAIN_TOKEN_3, grammarAccess.getStructuredDataPropertyAccess().getDOMAIN_TOKENTerminalRuleCall_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStructuredDataPropertyRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getStructuredDataPropertyAccess().getDomainStructureCrossReference_4_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RANGE_TOKEN_5=RULE_RANGE_TOKEN
		{
			newLeafNode(this_RANGE_TOKEN_5, grammarAccess.getStructuredDataPropertyAccess().getRANGE_TOKENTerminalRuleCall_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStructuredDataPropertyRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getStructuredDataPropertyAccess().getRangeStructureCrossReference_6_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RCURLY_7=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_7, grammarAccess.getStructuredDataPropertyAccess().getRCURLYTerminalRuleCall_7());
		}
	)
;

// Entry rule entryRuleScalarDataProperty
entryRuleScalarDataProperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScalarDataPropertyRule()); }
	iv_ruleScalarDataProperty=ruleScalarDataProperty
	{ $current=$iv_ruleScalarDataProperty.current; }
	EOF;

// Rule ScalarDataProperty
ruleScalarDataProperty returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='scalarDataProperty'
		{
			newLeafNode(otherlv_0, grammarAccess.getScalarDataPropertyAccess().getScalarDataPropertyKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getScalarDataPropertyAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getScalarDataPropertyRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
				}
			)
		)
		this_LCURLY_2=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_2, grammarAccess.getScalarDataPropertyAccess().getLCURLYTerminalRuleCall_2());
		}
		this_DOMAIN_TOKEN_3=RULE_DOMAIN_TOKEN
		{
			newLeafNode(this_DOMAIN_TOKEN_3, grammarAccess.getScalarDataPropertyAccess().getDOMAIN_TOKENTerminalRuleCall_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getScalarDataPropertyRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getScalarDataPropertyAccess().getDomainStructureCrossReference_4_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RANGE_TOKEN_5=RULE_RANGE_TOKEN
		{
			newLeafNode(this_RANGE_TOKEN_5, grammarAccess.getScalarDataPropertyAccess().getRANGE_TOKENTerminalRuleCall_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getScalarDataPropertyRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getScalarDataPropertyAccess().getRangeDataRangeCrossReference_6_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RCURLY_7=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_7, grammarAccess.getScalarDataPropertyAccess().getRCURLYTerminalRuleCall_7());
		}
	)
;

// Entry rule entryRuleAnonymousConceptTaxonomyAxiom
entryRuleAnonymousConceptTaxonomyAxiom returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAnonymousConceptTaxonomyAxiomRule()); }
	iv_ruleAnonymousConceptTaxonomyAxiom=ruleAnonymousConceptTaxonomyAxiom
	{ $current=$iv_ruleAnonymousConceptTaxonomyAxiom.current; }
	EOF;

// Rule AnonymousConceptTaxonomyAxiom
ruleAnonymousConceptTaxonomyAxiom returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN_0=RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN
		{
			newLeafNode(this_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN_0, grammarAccess.getAnonymousConceptTaxonomyAxiomAccess().getANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKENTerminalRuleCall_0());
		}
		this_LCURLY_1=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_1, grammarAccess.getAnonymousConceptTaxonomyAxiomAccess().getLCURLYTerminalRuleCall_1());
		}
		otherlv_2='disjointTaxonomyParent'
		{
			newLeafNode(otherlv_2, grammarAccess.getAnonymousConceptTaxonomyAxiomAccess().getDisjointTaxonomyParentKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAnonymousConceptTaxonomyAxiomRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getAnonymousConceptTaxonomyAxiomAccess().getDisjointTaxonomyParentConceptTreeDisjunctionCrossReference_3_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RCURLY_4=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_4, grammarAccess.getAnonymousConceptTaxonomyAxiomAccess().getRCURLYTerminalRuleCall_4());
		}
	)
;

// Entry rule entryRuleRootConceptTaxonomyAxiom
entryRuleRootConceptTaxonomyAxiom returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRootConceptTaxonomyAxiomRule()); }
	iv_ruleRootConceptTaxonomyAxiom=ruleRootConceptTaxonomyAxiom
	{ $current=$iv_ruleRootConceptTaxonomyAxiom.current; }
	EOF;

// Rule RootConceptTaxonomyAxiom
ruleRootConceptTaxonomyAxiom returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN_0=RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN
		{
			newLeafNode(this_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN_0, grammarAccess.getRootConceptTaxonomyAxiomAccess().getROOT_CONCEPT_TAXONOMY_AXIOM_TOKENTerminalRuleCall_0());
		}
		this_LCURLY_1=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_1, grammarAccess.getRootConceptTaxonomyAxiomAccess().getLCURLYTerminalRuleCall_1());
		}
		otherlv_2='root'
		{
			newLeafNode(otherlv_2, grammarAccess.getRootConceptTaxonomyAxiomAccess().getRootKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRootConceptTaxonomyAxiomRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getRootConceptTaxonomyAxiomAccess().getRootConceptCrossReference_3_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RCURLY_4=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_4, grammarAccess.getRootConceptTaxonomyAxiomAccess().getRCURLYTerminalRuleCall_4());
		}
	)
;

// Entry rule entryRuleSpecificDisjointConceptAxiom
entryRuleSpecificDisjointConceptAxiom returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSpecificDisjointConceptAxiomRule()); }
	iv_ruleSpecificDisjointConceptAxiom=ruleSpecificDisjointConceptAxiom
	{ $current=$iv_ruleSpecificDisjointConceptAxiom.current; }
	EOF;

// Rule SpecificDisjointConceptAxiom
ruleSpecificDisjointConceptAxiom returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN_0=RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN
		{
			newLeafNode(this_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN_0, grammarAccess.getSpecificDisjointConceptAxiomAccess().getSPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKENTerminalRuleCall_0());
		}
		this_LCURLY_1=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_1, grammarAccess.getSpecificDisjointConceptAxiomAccess().getLCURLYTerminalRuleCall_1());
		}
		otherlv_2='disjointTaxonomyParent'
		{
			newLeafNode(otherlv_2, grammarAccess.getSpecificDisjointConceptAxiomAccess().getDisjointTaxonomyParentKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSpecificDisjointConceptAxiomRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getSpecificDisjointConceptAxiomAccess().getDisjointTaxonomyParentConceptTreeDisjunctionCrossReference_3_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='disjointLeaf'
		{
			newLeafNode(otherlv_4, grammarAccess.getSpecificDisjointConceptAxiomAccess().getDisjointLeafKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSpecificDisjointConceptAxiomRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getSpecificDisjointConceptAxiomAccess().getDisjointLeafConceptCrossReference_5_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RCURLY_6=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_6, grammarAccess.getSpecificDisjointConceptAxiomAccess().getRCURLYTerminalRuleCall_6());
		}
	)
;

// Entry rule entryRuleBundledTerminologyAxiom
entryRuleBundledTerminologyAxiom returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBundledTerminologyAxiomRule()); }
	iv_ruleBundledTerminologyAxiom=ruleBundledTerminologyAxiom
	{ $current=$iv_ruleBundledTerminologyAxiom.current; }
	EOF;

// Rule BundledTerminologyAxiom
ruleBundledTerminologyAxiom returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_BUNDLED_TERMINOLOGY_AXIOM_TOKEN_0=RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN
		{
			newLeafNode(this_BUNDLED_TERMINOLOGY_AXIOM_TOKEN_0, grammarAccess.getBundledTerminologyAxiomAccess().getBUNDLED_TERMINOLOGY_AXIOM_TOKENTerminalRuleCall_0());
		}
		this_LCURLY_1=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_1, grammarAccess.getBundledTerminologyAxiomAccess().getLCURLYTerminalRuleCall_1());
		}
		otherlv_2='bundledTerminology'
		{
			newLeafNode(otherlv_2, grammarAccess.getBundledTerminologyAxiomAccess().getBundledTerminologyKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBundledTerminologyAxiomRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getBundledTerminologyAxiomAccess().getBundledTerminologyTerminologyBoxCrossReference_3_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RCURLY_4=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_4, grammarAccess.getBundledTerminologyAxiomAccess().getRCURLYTerminalRuleCall_4());
		}
	)
;

// Entry rule entryRuleConceptDesignationTerminologyAxiom
entryRuleConceptDesignationTerminologyAxiom returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConceptDesignationTerminologyAxiomRule()); }
	iv_ruleConceptDesignationTerminologyAxiom=ruleConceptDesignationTerminologyAxiom
	{ $current=$iv_ruleConceptDesignationTerminologyAxiom.current; }
	EOF;

// Rule ConceptDesignationTerminologyAxiom
ruleConceptDesignationTerminologyAxiom returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN_0=RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN
		{
			newLeafNode(this_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN_0, grammarAccess.getConceptDesignationTerminologyAxiomAccess().getCONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKENTerminalRuleCall_0());
		}
		this_LCURLY_1=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_1, grammarAccess.getConceptDesignationTerminologyAxiomAccess().getLCURLYTerminalRuleCall_1());
		}
		otherlv_2='designatedTerminology'
		{
			newLeafNode(otherlv_2, grammarAccess.getConceptDesignationTerminologyAxiomAccess().getDesignatedTerminologyKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConceptDesignationTerminologyAxiomRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getConceptDesignationTerminologyAxiomAccess().getDesignatedTerminologyTerminologyBoxCrossReference_3_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='designatedConcept'
		{
			newLeafNode(otherlv_4, grammarAccess.getConceptDesignationTerminologyAxiomAccess().getDesignatedConceptKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConceptDesignationTerminologyAxiomRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getConceptDesignationTerminologyAxiomAccess().getDesignatedConceptConceptCrossReference_5_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RCURLY_6=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_6, grammarAccess.getConceptDesignationTerminologyAxiomAccess().getRCURLYTerminalRuleCall_6());
		}
	)
;

// Entry rule entryRuleTerminologyExtensionAxiom
entryRuleTerminologyExtensionAxiom returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTerminologyExtensionAxiomRule()); }
	iv_ruleTerminologyExtensionAxiom=ruleTerminologyExtensionAxiom
	{ $current=$iv_ruleTerminologyExtensionAxiom.current; }
	EOF;

// Rule TerminologyExtensionAxiom
ruleTerminologyExtensionAxiom returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_EXTENDS_TOKEN_0=RULE_EXTENDS_TOKEN
		{
			newLeafNode(this_EXTENDS_TOKEN_0, grammarAccess.getTerminologyExtensionAxiomAccess().getEXTENDS_TOKENTerminalRuleCall_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTerminologyExtensionAxiomRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTerminologyExtensionAxiomAccess().getExtendedTerminologyTerminologyBoxCrossReference_1_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleTerminologyNestingAxiom
entryRuleTerminologyNestingAxiom returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTerminologyNestingAxiomRule()); }
	iv_ruleTerminologyNestingAxiom=ruleTerminologyNestingAxiom
	{ $current=$iv_ruleTerminologyNestingAxiom.current; }
	EOF;

// Rule TerminologyNestingAxiom
ruleTerminologyNestingAxiom returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_TERMINOLOGY_NESTING_AXIOM_TOKEN_0=RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN
		{
			newLeafNode(this_TERMINOLOGY_NESTING_AXIOM_TOKEN_0, grammarAccess.getTerminologyNestingAxiomAccess().getTERMINOLOGY_NESTING_AXIOM_TOKENTerminalRuleCall_0());
		}
		this_LCURLY_1=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_1, grammarAccess.getTerminologyNestingAxiomAccess().getLCURLYTerminalRuleCall_1());
		}
		otherlv_2='nestingTerminology'
		{
			newLeafNode(otherlv_2, grammarAccess.getTerminologyNestingAxiomAccess().getNestingTerminologyKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTerminologyNestingAxiomRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTerminologyNestingAxiomAccess().getNestingTerminologyTerminologyBoxCrossReference_3_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='nestingContext'
		{
			newLeafNode(otherlv_4, grammarAccess.getTerminologyNestingAxiomAccess().getNestingContextKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTerminologyNestingAxiomRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTerminologyNestingAxiomAccess().getNestingContextConceptCrossReference_5_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RCURLY_6=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_6, grammarAccess.getTerminologyNestingAxiomAccess().getRCURLYTerminalRuleCall_6());
		}
	)
;

// Entry rule entryRuleEntityExistentialRestrictionAxiom
entryRuleEntityExistentialRestrictionAxiom returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityExistentialRestrictionAxiomRule()); }
	iv_ruleEntityExistentialRestrictionAxiom=ruleEntityExistentialRestrictionAxiom
	{ $current=$iv_ruleEntityExistentialRestrictionAxiom.current; }
	EOF;

// Rule EntityExistentialRestrictionAxiom
ruleEntityExistentialRestrictionAxiom returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0=RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN
		{
			newLeafNode(this_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0, grammarAccess.getEntityExistentialRestrictionAxiomAccess().getENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0());
		}
		this_LCURLY_1=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_1, grammarAccess.getEntityExistentialRestrictionAxiomAccess().getLCURLYTerminalRuleCall_1());
		}
		otherlv_2='restrictedRelation'
		{
			newLeafNode(otherlv_2, grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedRelationKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityExistentialRestrictionAxiomRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedRelationReifiedRelationshipCrossReference_3_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='restrictedRange'
		{
			newLeafNode(otherlv_4, grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedRangeKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityExistentialRestrictionAxiomRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedRangeEntityCrossReference_5_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='restrictedDomain'
		{
			newLeafNode(otherlv_6, grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedDomainKeyword_6());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityExistentialRestrictionAxiomRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedDomainEntityCrossReference_7_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RCURLY_8=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_8, grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRCURLYTerminalRuleCall_8());
		}
	)
;

// Entry rule entryRuleEntityUniversalRestrictionAxiom
entryRuleEntityUniversalRestrictionAxiom returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityUniversalRestrictionAxiomRule()); }
	iv_ruleEntityUniversalRestrictionAxiom=ruleEntityUniversalRestrictionAxiom
	{ $current=$iv_ruleEntityUniversalRestrictionAxiom.current; }
	EOF;

// Rule EntityUniversalRestrictionAxiom
ruleEntityUniversalRestrictionAxiom returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0=RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN
		{
			newLeafNode(this_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0, grammarAccess.getEntityUniversalRestrictionAxiomAccess().getENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0());
		}
		this_LCURLY_1=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_1, grammarAccess.getEntityUniversalRestrictionAxiomAccess().getLCURLYTerminalRuleCall_1());
		}
		otherlv_2='restrictedRelation'
		{
			newLeafNode(otherlv_2, grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedRelationKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityUniversalRestrictionAxiomRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedRelationReifiedRelationshipCrossReference_3_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='restrictedRange'
		{
			newLeafNode(otherlv_4, grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedRangeKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityUniversalRestrictionAxiomRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedRangeEntityCrossReference_5_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='restrictedDomain'
		{
			newLeafNode(otherlv_6, grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedDomainKeyword_6());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityUniversalRestrictionAxiomRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedDomainEntityCrossReference_7_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RCURLY_8=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_8, grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRCURLYTerminalRuleCall_8());
		}
	)
;

// Entry rule entryRuleAspectSpecializationAxiom
entryRuleAspectSpecializationAxiom returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAspectSpecializationAxiomRule()); }
	iv_ruleAspectSpecializationAxiom=ruleAspectSpecializationAxiom
	{ $current=$iv_ruleAspectSpecializationAxiom.current; }
	EOF;

// Rule AspectSpecializationAxiom
ruleAspectSpecializationAxiom returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAspectSpecializationAxiomRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getAspectSpecializationAxiomAccess().getSubEntityEntityCrossReference_0_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_ASPECT_SPECIALIZATION_AXIOM_TOKEN_1=RULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN
		{
			newLeafNode(this_ASPECT_SPECIALIZATION_AXIOM_TOKEN_1, grammarAccess.getAspectSpecializationAxiomAccess().getASPECT_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAspectSpecializationAxiomRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getAspectSpecializationAxiomAccess().getSuperAspectAspectCrossReference_2_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleConceptSpecializationAxiom
entryRuleConceptSpecializationAxiom returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConceptSpecializationAxiomRule()); }
	iv_ruleConceptSpecializationAxiom=ruleConceptSpecializationAxiom
	{ $current=$iv_ruleConceptSpecializationAxiom.current; }
	EOF;

// Rule ConceptSpecializationAxiom
ruleConceptSpecializationAxiom returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_CONCEPT_SPECIALIZATION_AXIOM_TOKEN_0=RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN
		{
			newLeafNode(this_CONCEPT_SPECIALIZATION_AXIOM_TOKEN_0, grammarAccess.getConceptSpecializationAxiomAccess().getCONCEPT_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_0());
		}
		this_LCURLY_1=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_1, grammarAccess.getConceptSpecializationAxiomAccess().getLCURLYTerminalRuleCall_1());
		}
		otherlv_2='subConcept'
		{
			newLeafNode(otherlv_2, grammarAccess.getConceptSpecializationAxiomAccess().getSubConceptKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConceptSpecializationAxiomRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getConceptSpecializationAxiomAccess().getSubConceptConceptCrossReference_3_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='superConcept'
		{
			newLeafNode(otherlv_4, grammarAccess.getConceptSpecializationAxiomAccess().getSuperConceptKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConceptSpecializationAxiomRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getConceptSpecializationAxiomAccess().getSuperConceptConceptCrossReference_5_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RCURLY_6=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_6, grammarAccess.getConceptSpecializationAxiomAccess().getRCURLYTerminalRuleCall_6());
		}
	)
;

// Entry rule entryRuleReifiedRelationshipSpecializationAxiom
entryRuleReifiedRelationshipSpecializationAxiom returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReifiedRelationshipSpecializationAxiomRule()); }
	iv_ruleReifiedRelationshipSpecializationAxiom=ruleReifiedRelationshipSpecializationAxiom
	{ $current=$iv_ruleReifiedRelationshipSpecializationAxiom.current; }
	EOF;

// Rule ReifiedRelationshipSpecializationAxiom
ruleReifiedRelationshipSpecializationAxiom returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN_0=RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN
		{
			newLeafNode(this_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN_0, grammarAccess.getReifiedRelationshipSpecializationAxiomAccess().getREIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_0());
		}
		this_LCURLY_1=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_1, grammarAccess.getReifiedRelationshipSpecializationAxiomAccess().getLCURLYTerminalRuleCall_1());
		}
		otherlv_2='subRelationship'
		{
			newLeafNode(otherlv_2, grammarAccess.getReifiedRelationshipSpecializationAxiomAccess().getSubRelationshipKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReifiedRelationshipSpecializationAxiomRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getReifiedRelationshipSpecializationAxiomAccess().getSubRelationshipReifiedRelationshipCrossReference_3_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='superRelationship'
		{
			newLeafNode(otherlv_4, grammarAccess.getReifiedRelationshipSpecializationAxiomAccess().getSuperRelationshipKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReifiedRelationshipSpecializationAxiomRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getReifiedRelationshipSpecializationAxiomAccess().getSuperRelationshipReifiedRelationshipCrossReference_5_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RCURLY_6=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_6, grammarAccess.getReifiedRelationshipSpecializationAxiomAccess().getRCURLYTerminalRuleCall_6());
		}
	)
;

// Entry rule entryRuleEntityScalarDataPropertyExistentialRestrictionAxiom
entryRuleEntityScalarDataPropertyExistentialRestrictionAxiom returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomRule()); }
	iv_ruleEntityScalarDataPropertyExistentialRestrictionAxiom=ruleEntityScalarDataPropertyExistentialRestrictionAxiom
	{ $current=$iv_ruleEntityScalarDataPropertyExistentialRestrictionAxiom.current; }
	EOF;

// Rule EntityScalarDataPropertyExistentialRestrictionAxiom
ruleEntityScalarDataPropertyExistentialRestrictionAxiom returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0=RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN
		{
			newLeafNode(this_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN_0, grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0());
		}
		this_LCURLY_1=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_1, grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getLCURLYTerminalRuleCall_1());
		}
		otherlv_2='restrictedEntity'
		{
			newLeafNode(otherlv_2, grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getRestrictedEntityKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getRestrictedEntityEntityCrossReference_3_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='scalarProperty'
		{
			newLeafNode(otherlv_4, grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarPropertyKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarPropertyEntityScalarDataPropertyCrossReference_5_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='scalarRestriction'
		{
			newLeafNode(otherlv_6, grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarRestrictionKeyword_6());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarRestrictionDataRangeCrossReference_7_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RCURLY_8=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_8, grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getRCURLYTerminalRuleCall_8());
		}
	)
;

// Entry rule entryRuleEntityScalarDataPropertyParticularRestrictionAxiom
entryRuleEntityScalarDataPropertyParticularRestrictionAxiom returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomRule()); }
	iv_ruleEntityScalarDataPropertyParticularRestrictionAxiom=ruleEntityScalarDataPropertyParticularRestrictionAxiom
	{ $current=$iv_ruleEntityScalarDataPropertyParticularRestrictionAxiom.current; }
	EOF;

// Rule EntityScalarDataPropertyParticularRestrictionAxiom
ruleEntityScalarDataPropertyParticularRestrictionAxiom returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN_0=RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN
		{
			newLeafNode(this_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN_0, grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0());
		}
		this_LCURLY_1=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_1, grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getLCURLYTerminalRuleCall_1());
		}
		otherlv_2='restrictedEntity'
		{
			newLeafNode(otherlv_2, grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getRestrictedEntityKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getRestrictedEntityEntityCrossReference_3_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='scalarProperty'
		{
			newLeafNode(otherlv_4, grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getScalarPropertyKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getScalarPropertyEntityScalarDataPropertyCrossReference_5_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='literalValue'
		{
			newLeafNode(otherlv_6, grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getLiteralValueKeyword_6());
		}
		(
			(
				lv_literalValue_7_0=RULE_STRING
				{
					newLeafNode(lv_literalValue_7_0, grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getLiteralValueSTRINGTerminalRuleCall_7_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomRule());
					}
					setWithLastConsumed(
						$current,
						"literalValue",
						lv_literalValue_7_0,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.STRING");
				}
			)
		)
		this_RCURLY_8=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_8, grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getRCURLYTerminalRuleCall_8());
		}
	)
;

// Entry rule entryRuleEntityScalarDataPropertyUniversalRestrictionAxiom
entryRuleEntityScalarDataPropertyUniversalRestrictionAxiom returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomRule()); }
	iv_ruleEntityScalarDataPropertyUniversalRestrictionAxiom=ruleEntityScalarDataPropertyUniversalRestrictionAxiom
	{ $current=$iv_ruleEntityScalarDataPropertyUniversalRestrictionAxiom.current; }
	EOF;

// Rule EntityScalarDataPropertyUniversalRestrictionAxiom
ruleEntityScalarDataPropertyUniversalRestrictionAxiom returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0=RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN
		{
			newLeafNode(this_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN_0, grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0());
		}
		this_LCURLY_1=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_1, grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getLCURLYTerminalRuleCall_1());
		}
		otherlv_2='restrictedEntity'
		{
			newLeafNode(otherlv_2, grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getRestrictedEntityKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getRestrictedEntityEntityCrossReference_3_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='scalarProperty'
		{
			newLeafNode(otherlv_4, grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarPropertyKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarPropertyEntityScalarDataPropertyCrossReference_5_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='scalarRestriction'
		{
			newLeafNode(otherlv_6, grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarRestrictionKeyword_6());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarRestrictionDataRangeCrossReference_7_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RCURLY_8=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_8, grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getRCURLYTerminalRuleCall_8());
		}
	)
;

// Entry rule entryRuleBinaryScalarRestriction
entryRuleBinaryScalarRestriction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBinaryScalarRestrictionRule()); }
	iv_ruleBinaryScalarRestriction=ruleBinaryScalarRestriction
	{ $current=$iv_ruleBinaryScalarRestriction.current; }
	EOF;

// Rule BinaryScalarRestriction
ruleBinaryScalarRestriction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_BINARY_SCALAR_RESTRICTION_TOKEN_0=RULE_BINARY_SCALAR_RESTRICTION_TOKEN
		{
			newLeafNode(this_BINARY_SCALAR_RESTRICTION_TOKEN_0, grammarAccess.getBinaryScalarRestrictionAccess().getBINARY_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getBinaryScalarRestrictionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBinaryScalarRestrictionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
				}
			)
		)
		this_LCURLY_2=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_2, grammarAccess.getBinaryScalarRestrictionAccess().getLCURLYTerminalRuleCall_2());
		}
		(
			otherlv_3='length'
			{
				newLeafNode(otherlv_3, grammarAccess.getBinaryScalarRestrictionAccess().getLengthKeyword_3_0());
			}
			(
				(
					lv_length_4_0=RULE_INT
					{
						newLeafNode(lv_length_4_0, grammarAccess.getBinaryScalarRestrictionAccess().getLengthINTTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getBinaryScalarRestrictionRule());
						}
						setWithLastConsumed(
							$current,
							"length",
							lv_length_4_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.INT");
					}
				)
			)
		)?
		(
			otherlv_5='minLength'
			{
				newLeafNode(otherlv_5, grammarAccess.getBinaryScalarRestrictionAccess().getMinLengthKeyword_4_0());
			}
			(
				(
					lv_minLength_6_0=RULE_INT
					{
						newLeafNode(lv_minLength_6_0, grammarAccess.getBinaryScalarRestrictionAccess().getMinLengthINTTerminalRuleCall_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getBinaryScalarRestrictionRule());
						}
						setWithLastConsumed(
							$current,
							"minLength",
							lv_minLength_6_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.INT");
					}
				)
			)
		)?
		(
			otherlv_7='maxLength'
			{
				newLeafNode(otherlv_7, grammarAccess.getBinaryScalarRestrictionAccess().getMaxLengthKeyword_5_0());
			}
			(
				(
					lv_maxLength_8_0=RULE_INT
					{
						newLeafNode(lv_maxLength_8_0, grammarAccess.getBinaryScalarRestrictionAccess().getMaxLengthINTTerminalRuleCall_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getBinaryScalarRestrictionRule());
						}
						setWithLastConsumed(
							$current,
							"maxLength",
							lv_maxLength_8_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.INT");
					}
				)
			)
		)?
		otherlv_9='restrictedRange'
		{
			newLeafNode(otherlv_9, grammarAccess.getBinaryScalarRestrictionAccess().getRestrictedRangeKeyword_6());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBinaryScalarRestrictionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getBinaryScalarRestrictionAccess().getRestrictedRangeDataRangeCrossReference_7_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RCURLY_11=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_11, grammarAccess.getBinaryScalarRestrictionAccess().getRCURLYTerminalRuleCall_8());
		}
	)
;

// Entry rule entryRuleIRIScalarRestriction
entryRuleIRIScalarRestriction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIRIScalarRestrictionRule()); }
	iv_ruleIRIScalarRestriction=ruleIRIScalarRestriction
	{ $current=$iv_ruleIRIScalarRestriction.current; }
	EOF;

// Rule IRIScalarRestriction
ruleIRIScalarRestriction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_IRI_SCALAR_RESTRICTION_TOKEN_0=RULE_IRI_SCALAR_RESTRICTION_TOKEN
		{
			newLeafNode(this_IRI_SCALAR_RESTRICTION_TOKEN_0, grammarAccess.getIRIScalarRestrictionAccess().getIRI_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getIRIScalarRestrictionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIRIScalarRestrictionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
				}
			)
		)
		this_LCURLY_2=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_2, grammarAccess.getIRIScalarRestrictionAccess().getLCURLYTerminalRuleCall_2());
		}
		(
			otherlv_3='length'
			{
				newLeafNode(otherlv_3, grammarAccess.getIRIScalarRestrictionAccess().getLengthKeyword_3_0());
			}
			(
				(
					lv_length_4_0=RULE_INT
					{
						newLeafNode(lv_length_4_0, grammarAccess.getIRIScalarRestrictionAccess().getLengthINTTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getIRIScalarRestrictionRule());
						}
						setWithLastConsumed(
							$current,
							"length",
							lv_length_4_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.INT");
					}
				)
			)
		)?
		(
			otherlv_5='minLength'
			{
				newLeafNode(otherlv_5, grammarAccess.getIRIScalarRestrictionAccess().getMinLengthKeyword_4_0());
			}
			(
				(
					lv_minLength_6_0=RULE_INT
					{
						newLeafNode(lv_minLength_6_0, grammarAccess.getIRIScalarRestrictionAccess().getMinLengthINTTerminalRuleCall_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getIRIScalarRestrictionRule());
						}
						setWithLastConsumed(
							$current,
							"minLength",
							lv_minLength_6_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.INT");
					}
				)
			)
		)?
		(
			otherlv_7='maxLength'
			{
				newLeafNode(otherlv_7, grammarAccess.getIRIScalarRestrictionAccess().getMaxLengthKeyword_5_0());
			}
			(
				(
					lv_maxLength_8_0=RULE_INT
					{
						newLeafNode(lv_maxLength_8_0, grammarAccess.getIRIScalarRestrictionAccess().getMaxLengthINTTerminalRuleCall_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getIRIScalarRestrictionRule());
						}
						setWithLastConsumed(
							$current,
							"maxLength",
							lv_maxLength_8_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.INT");
					}
				)
			)
		)?
		(
			otherlv_9='pattern'
			{
				newLeafNode(otherlv_9, grammarAccess.getIRIScalarRestrictionAccess().getPatternKeyword_6_0());
			}
			(
				(
					lv_pattern_10_0=RULE_STRING
					{
						newLeafNode(lv_pattern_10_0, grammarAccess.getIRIScalarRestrictionAccess().getPatternSTRINGTerminalRuleCall_6_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getIRIScalarRestrictionRule());
						}
						setWithLastConsumed(
							$current,
							"pattern",
							lv_pattern_10_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.STRING");
					}
				)
			)
		)?
		otherlv_11='restrictedRange'
		{
			newLeafNode(otherlv_11, grammarAccess.getIRIScalarRestrictionAccess().getRestrictedRangeKeyword_7());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIRIScalarRestrictionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getIRIScalarRestrictionAccess().getRestrictedRangeDataRangeCrossReference_8_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RCURLY_13=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_13, grammarAccess.getIRIScalarRestrictionAccess().getRCURLYTerminalRuleCall_9());
		}
	)
;

// Entry rule entryRuleNumericScalarRestriction
entryRuleNumericScalarRestriction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNumericScalarRestrictionRule()); }
	iv_ruleNumericScalarRestriction=ruleNumericScalarRestriction
	{ $current=$iv_ruleNumericScalarRestriction.current; }
	EOF;

// Rule NumericScalarRestriction
ruleNumericScalarRestriction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_NUMERIC_SCALAR_RESTRICTION_TOKEN_0=RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN
		{
			newLeafNode(this_NUMERIC_SCALAR_RESTRICTION_TOKEN_0, grammarAccess.getNumericScalarRestrictionAccess().getNUMERIC_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getNumericScalarRestrictionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNumericScalarRestrictionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
				}
			)
		)
		this_LCURLY_2=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_2, grammarAccess.getNumericScalarRestrictionAccess().getLCURLYTerminalRuleCall_2());
		}
		(
			otherlv_3='minInclusive'
			{
				newLeafNode(otherlv_3, grammarAccess.getNumericScalarRestrictionAccess().getMinInclusiveKeyword_3_0());
			}
			(
				(
					lv_minInclusive_4_0=RULE_STRING
					{
						newLeafNode(lv_minInclusive_4_0, grammarAccess.getNumericScalarRestrictionAccess().getMinInclusiveSTRINGTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNumericScalarRestrictionRule());
						}
						setWithLastConsumed(
							$current,
							"minInclusive",
							lv_minInclusive_4_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.STRING");
					}
				)
			)
		)?
		(
			otherlv_5='maxInclusive'
			{
				newLeafNode(otherlv_5, grammarAccess.getNumericScalarRestrictionAccess().getMaxInclusiveKeyword_4_0());
			}
			(
				(
					lv_maxInclusive_6_0=RULE_STRING
					{
						newLeafNode(lv_maxInclusive_6_0, grammarAccess.getNumericScalarRestrictionAccess().getMaxInclusiveSTRINGTerminalRuleCall_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNumericScalarRestrictionRule());
						}
						setWithLastConsumed(
							$current,
							"maxInclusive",
							lv_maxInclusive_6_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.STRING");
					}
				)
			)
		)?
		(
			otherlv_7='minExclusive'
			{
				newLeafNode(otherlv_7, grammarAccess.getNumericScalarRestrictionAccess().getMinExclusiveKeyword_5_0());
			}
			(
				(
					lv_minExclusive_8_0=RULE_STRING
					{
						newLeafNode(lv_minExclusive_8_0, grammarAccess.getNumericScalarRestrictionAccess().getMinExclusiveSTRINGTerminalRuleCall_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNumericScalarRestrictionRule());
						}
						setWithLastConsumed(
							$current,
							"minExclusive",
							lv_minExclusive_8_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.STRING");
					}
				)
			)
		)?
		(
			otherlv_9='maxExclusive'
			{
				newLeafNode(otherlv_9, grammarAccess.getNumericScalarRestrictionAccess().getMaxExclusiveKeyword_6_0());
			}
			(
				(
					lv_maxExclusive_10_0=RULE_STRING
					{
						newLeafNode(lv_maxExclusive_10_0, grammarAccess.getNumericScalarRestrictionAccess().getMaxExclusiveSTRINGTerminalRuleCall_6_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNumericScalarRestrictionRule());
						}
						setWithLastConsumed(
							$current,
							"maxExclusive",
							lv_maxExclusive_10_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.STRING");
					}
				)
			)
		)?
		otherlv_11='restrictedRange'
		{
			newLeafNode(otherlv_11, grammarAccess.getNumericScalarRestrictionAccess().getRestrictedRangeKeyword_7());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNumericScalarRestrictionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getNumericScalarRestrictionAccess().getRestrictedRangeDataRangeCrossReference_8_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RCURLY_13=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_13, grammarAccess.getNumericScalarRestrictionAccess().getRCURLYTerminalRuleCall_9());
		}
	)
;

// Entry rule entryRulePlainLiteralScalarRestriction
entryRulePlainLiteralScalarRestriction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPlainLiteralScalarRestrictionRule()); }
	iv_rulePlainLiteralScalarRestriction=rulePlainLiteralScalarRestriction
	{ $current=$iv_rulePlainLiteralScalarRestriction.current; }
	EOF;

// Rule PlainLiteralScalarRestriction
rulePlainLiteralScalarRestriction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN_0=RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN
		{
			newLeafNode(this_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN_0, grammarAccess.getPlainLiteralScalarRestrictionAccess().getPLAIN_LITERAL_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPlainLiteralScalarRestrictionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPlainLiteralScalarRestrictionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
				}
			)
		)
		this_LCURLY_2=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_2, grammarAccess.getPlainLiteralScalarRestrictionAccess().getLCURLYTerminalRuleCall_2());
		}
		(
			otherlv_3='length'
			{
				newLeafNode(otherlv_3, grammarAccess.getPlainLiteralScalarRestrictionAccess().getLengthKeyword_3_0());
			}
			(
				(
					lv_length_4_0=RULE_INT
					{
						newLeafNode(lv_length_4_0, grammarAccess.getPlainLiteralScalarRestrictionAccess().getLengthINTTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPlainLiteralScalarRestrictionRule());
						}
						setWithLastConsumed(
							$current,
							"length",
							lv_length_4_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.INT");
					}
				)
			)
		)?
		(
			otherlv_5='minLength'
			{
				newLeafNode(otherlv_5, grammarAccess.getPlainLiteralScalarRestrictionAccess().getMinLengthKeyword_4_0());
			}
			(
				(
					lv_minLength_6_0=RULE_INT
					{
						newLeafNode(lv_minLength_6_0, grammarAccess.getPlainLiteralScalarRestrictionAccess().getMinLengthINTTerminalRuleCall_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPlainLiteralScalarRestrictionRule());
						}
						setWithLastConsumed(
							$current,
							"minLength",
							lv_minLength_6_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.INT");
					}
				)
			)
		)?
		(
			otherlv_7='maxLength'
			{
				newLeafNode(otherlv_7, grammarAccess.getPlainLiteralScalarRestrictionAccess().getMaxLengthKeyword_5_0());
			}
			(
				(
					lv_maxLength_8_0=RULE_INT
					{
						newLeafNode(lv_maxLength_8_0, grammarAccess.getPlainLiteralScalarRestrictionAccess().getMaxLengthINTTerminalRuleCall_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPlainLiteralScalarRestrictionRule());
						}
						setWithLastConsumed(
							$current,
							"maxLength",
							lv_maxLength_8_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.INT");
					}
				)
			)
		)?
		(
			otherlv_9='pattern'
			{
				newLeafNode(otherlv_9, grammarAccess.getPlainLiteralScalarRestrictionAccess().getPatternKeyword_6_0());
			}
			(
				(
					lv_pattern_10_0=RULE_STRING
					{
						newLeafNode(lv_pattern_10_0, grammarAccess.getPlainLiteralScalarRestrictionAccess().getPatternSTRINGTerminalRuleCall_6_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPlainLiteralScalarRestrictionRule());
						}
						setWithLastConsumed(
							$current,
							"pattern",
							lv_pattern_10_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.STRING");
					}
				)
			)
		)?
		(
			otherlv_11='langRange'
			{
				newLeafNode(otherlv_11, grammarAccess.getPlainLiteralScalarRestrictionAccess().getLangRangeKeyword_7_0());
			}
			(
				(
					lv_langRange_12_0=RULE_STRING
					{
						newLeafNode(lv_langRange_12_0, grammarAccess.getPlainLiteralScalarRestrictionAccess().getLangRangeSTRINGTerminalRuleCall_7_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPlainLiteralScalarRestrictionRule());
						}
						setWithLastConsumed(
							$current,
							"langRange",
							lv_langRange_12_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.STRING");
					}
				)
			)
		)?
		otherlv_13='restrictedRange'
		{
			newLeafNode(otherlv_13, grammarAccess.getPlainLiteralScalarRestrictionAccess().getRestrictedRangeKeyword_8());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPlainLiteralScalarRestrictionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getPlainLiteralScalarRestrictionAccess().getRestrictedRangeDataRangeCrossReference_9_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RCURLY_15=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_15, grammarAccess.getPlainLiteralScalarRestrictionAccess().getRCURLYTerminalRuleCall_10());
		}
	)
;

// Entry rule entryRuleScalarOneOfRestriction
entryRuleScalarOneOfRestriction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScalarOneOfRestrictionRule()); }
	iv_ruleScalarOneOfRestriction=ruleScalarOneOfRestriction
	{ $current=$iv_ruleScalarOneOfRestriction.current; }
	EOF;

// Rule ScalarOneOfRestriction
ruleScalarOneOfRestriction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_SCALAR_ONE_OF_RESTRICTION_TOKEN_0=RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN
		{
			newLeafNode(this_SCALAR_ONE_OF_RESTRICTION_TOKEN_0, grammarAccess.getScalarOneOfRestrictionAccess().getSCALAR_ONE_OF_RESTRICTION_TOKENTerminalRuleCall_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getScalarOneOfRestrictionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getScalarOneOfRestrictionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
				}
			)
		)
		this_LCURLY_2=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_2, grammarAccess.getScalarOneOfRestrictionAccess().getLCURLYTerminalRuleCall_2());
		}
		otherlv_3='restrictedRange'
		{
			newLeafNode(otherlv_3, grammarAccess.getScalarOneOfRestrictionAccess().getRestrictedRangeKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getScalarOneOfRestrictionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getScalarOneOfRestrictionAccess().getRestrictedRangeDataRangeCrossReference_4_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RCURLY_5=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_5, grammarAccess.getScalarOneOfRestrictionAccess().getRCURLYTerminalRuleCall_5());
		}
	)
;

// Entry rule entryRuleScalarOneOfLiteralAxiom
entryRuleScalarOneOfLiteralAxiom returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScalarOneOfLiteralAxiomRule()); }
	iv_ruleScalarOneOfLiteralAxiom=ruleScalarOneOfLiteralAxiom
	{ $current=$iv_ruleScalarOneOfLiteralAxiom.current; }
	EOF;

// Rule ScalarOneOfLiteralAxiom
ruleScalarOneOfLiteralAxiom returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN_0=RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN
		{
			newLeafNode(this_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN_0, grammarAccess.getScalarOneOfLiteralAxiomAccess().getSCALAR_ONE_OF_LITERAL_AXIOM_TOKENTerminalRuleCall_0());
		}
		this_LCURLY_1=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_1, grammarAccess.getScalarOneOfLiteralAxiomAccess().getLCURLYTerminalRuleCall_1());
		}
		otherlv_2='value'
		{
			newLeafNode(otherlv_2, grammarAccess.getScalarOneOfLiteralAxiomAccess().getValueKeyword_2());
		}
		(
			(
				lv_value_3_0=RULE_STRING
				{
					newLeafNode(lv_value_3_0, grammarAccess.getScalarOneOfLiteralAxiomAccess().getValueSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getScalarOneOfLiteralAxiomRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_3_0,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.STRING");
				}
			)
		)
		otherlv_4='axiom'
		{
			newLeafNode(otherlv_4, grammarAccess.getScalarOneOfLiteralAxiomAccess().getAxiomKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getScalarOneOfLiteralAxiomRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getScalarOneOfLiteralAxiomAccess().getAxiomScalarOneOfRestrictionCrossReference_5_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RCURLY_6=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_6, grammarAccess.getScalarOneOfLiteralAxiomAccess().getRCURLYTerminalRuleCall_6());
		}
	)
;

// Entry rule entryRuleStringScalarRestriction
entryRuleStringScalarRestriction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStringScalarRestrictionRule()); }
	iv_ruleStringScalarRestriction=ruleStringScalarRestriction
	{ $current=$iv_ruleStringScalarRestriction.current; }
	EOF;

// Rule StringScalarRestriction
ruleStringScalarRestriction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_SCALAR_RESTRICTION_TOKEN_0=RULE_STRING_SCALAR_RESTRICTION_TOKEN
		{
			newLeafNode(this_STRING_SCALAR_RESTRICTION_TOKEN_0, grammarAccess.getStringScalarRestrictionAccess().getSTRING_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getStringScalarRestrictionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStringScalarRestrictionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
				}
			)
		)
		this_LCURLY_2=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_2, grammarAccess.getStringScalarRestrictionAccess().getLCURLYTerminalRuleCall_2());
		}
		(
			otherlv_3='length'
			{
				newLeafNode(otherlv_3, grammarAccess.getStringScalarRestrictionAccess().getLengthKeyword_3_0());
			}
			(
				(
					lv_length_4_0=RULE_INT
					{
						newLeafNode(lv_length_4_0, grammarAccess.getStringScalarRestrictionAccess().getLengthINTTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStringScalarRestrictionRule());
						}
						setWithLastConsumed(
							$current,
							"length",
							lv_length_4_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.INT");
					}
				)
			)
		)?
		(
			otherlv_5='minLength'
			{
				newLeafNode(otherlv_5, grammarAccess.getStringScalarRestrictionAccess().getMinLengthKeyword_4_0());
			}
			(
				(
					lv_minLength_6_0=RULE_INT
					{
						newLeafNode(lv_minLength_6_0, grammarAccess.getStringScalarRestrictionAccess().getMinLengthINTTerminalRuleCall_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStringScalarRestrictionRule());
						}
						setWithLastConsumed(
							$current,
							"minLength",
							lv_minLength_6_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.INT");
					}
				)
			)
		)?
		(
			otherlv_7='maxLength'
			{
				newLeafNode(otherlv_7, grammarAccess.getStringScalarRestrictionAccess().getMaxLengthKeyword_5_0());
			}
			(
				(
					lv_maxLength_8_0=RULE_INT
					{
						newLeafNode(lv_maxLength_8_0, grammarAccess.getStringScalarRestrictionAccess().getMaxLengthINTTerminalRuleCall_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStringScalarRestrictionRule());
						}
						setWithLastConsumed(
							$current,
							"maxLength",
							lv_maxLength_8_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.INT");
					}
				)
			)
		)?
		(
			otherlv_9='pattern'
			{
				newLeafNode(otherlv_9, grammarAccess.getStringScalarRestrictionAccess().getPatternKeyword_6_0());
			}
			(
				(
					lv_pattern_10_0=RULE_STRING
					{
						newLeafNode(lv_pattern_10_0, grammarAccess.getStringScalarRestrictionAccess().getPatternSTRINGTerminalRuleCall_6_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStringScalarRestrictionRule());
						}
						setWithLastConsumed(
							$current,
							"pattern",
							lv_pattern_10_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.STRING");
					}
				)
			)
		)?
		otherlv_11='restrictedRange'
		{
			newLeafNode(otherlv_11, grammarAccess.getStringScalarRestrictionAccess().getRestrictedRangeKeyword_7());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStringScalarRestrictionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getStringScalarRestrictionAccess().getRestrictedRangeDataRangeCrossReference_8_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RCURLY_13=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_13, grammarAccess.getStringScalarRestrictionAccess().getRCURLYTerminalRuleCall_9());
		}
	)
;

// Entry rule entryRuleSynonymScalarRestriction
entryRuleSynonymScalarRestriction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSynonymScalarRestrictionRule()); }
	iv_ruleSynonymScalarRestriction=ruleSynonymScalarRestriction
	{ $current=$iv_ruleSynonymScalarRestriction.current; }
	EOF;

// Rule SynonymScalarRestriction
ruleSynonymScalarRestriction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_SYNONYM_SCALAR_RESTRICTION_TOKEN_0=RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN
		{
			newLeafNode(this_SYNONYM_SCALAR_RESTRICTION_TOKEN_0, grammarAccess.getSynonymScalarRestrictionAccess().getSYNONYM_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSynonymScalarRestrictionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSynonymScalarRestrictionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
				}
			)
		)
		this_LCURLY_2=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_2, grammarAccess.getSynonymScalarRestrictionAccess().getLCURLYTerminalRuleCall_2());
		}
		otherlv_3='restrictedRange'
		{
			newLeafNode(otherlv_3, grammarAccess.getSynonymScalarRestrictionAccess().getRestrictedRangeKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSynonymScalarRestrictionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getSynonymScalarRestrictionAccess().getRestrictedRangeDataRangeCrossReference_4_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RCURLY_5=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_5, grammarAccess.getSynonymScalarRestrictionAccess().getRCURLYTerminalRuleCall_5());
		}
	)
;

// Entry rule entryRuleTimeScalarRestriction
entryRuleTimeScalarRestriction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTimeScalarRestrictionRule()); }
	iv_ruleTimeScalarRestriction=ruleTimeScalarRestriction
	{ $current=$iv_ruleTimeScalarRestriction.current; }
	EOF;

// Rule TimeScalarRestriction
ruleTimeScalarRestriction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_TIME_SCALAR_RESTRICTION_TOKEN_0=RULE_TIME_SCALAR_RESTRICTION_TOKEN
		{
			newLeafNode(this_TIME_SCALAR_RESTRICTION_TOKEN_0, grammarAccess.getTimeScalarRestrictionAccess().getTIME_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTimeScalarRestrictionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTimeScalarRestrictionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.ID");
				}
			)
		)
		this_LCURLY_2=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_2, grammarAccess.getTimeScalarRestrictionAccess().getLCURLYTerminalRuleCall_2());
		}
		(
			otherlv_3='minInclusive'
			{
				newLeafNode(otherlv_3, grammarAccess.getTimeScalarRestrictionAccess().getMinInclusiveKeyword_3_0());
			}
			(
				(
					lv_minInclusive_4_0=RULE_STRING
					{
						newLeafNode(lv_minInclusive_4_0, grammarAccess.getTimeScalarRestrictionAccess().getMinInclusiveSTRINGTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTimeScalarRestrictionRule());
						}
						setWithLastConsumed(
							$current,
							"minInclusive",
							lv_minInclusive_4_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.STRING");
					}
				)
			)
		)?
		(
			otherlv_5='maxInclusive'
			{
				newLeafNode(otherlv_5, grammarAccess.getTimeScalarRestrictionAccess().getMaxInclusiveKeyword_4_0());
			}
			(
				(
					lv_maxInclusive_6_0=RULE_STRING
					{
						newLeafNode(lv_maxInclusive_6_0, grammarAccess.getTimeScalarRestrictionAccess().getMaxInclusiveSTRINGTerminalRuleCall_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTimeScalarRestrictionRule());
						}
						setWithLastConsumed(
							$current,
							"maxInclusive",
							lv_maxInclusive_6_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.STRING");
					}
				)
			)
		)?
		(
			otherlv_7='minExclusive'
			{
				newLeafNode(otherlv_7, grammarAccess.getTimeScalarRestrictionAccess().getMinExclusiveKeyword_5_0());
			}
			(
				(
					lv_minExclusive_8_0=RULE_STRING
					{
						newLeafNode(lv_minExclusive_8_0, grammarAccess.getTimeScalarRestrictionAccess().getMinExclusiveSTRINGTerminalRuleCall_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTimeScalarRestrictionRule());
						}
						setWithLastConsumed(
							$current,
							"minExclusive",
							lv_minExclusive_8_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.STRING");
					}
				)
			)
		)?
		(
			otherlv_9='maxExclusive'
			{
				newLeafNode(otherlv_9, grammarAccess.getTimeScalarRestrictionAccess().getMaxExclusiveKeyword_6_0());
			}
			(
				(
					lv_maxExclusive_10_0=RULE_STRING
					{
						newLeafNode(lv_maxExclusive_10_0, grammarAccess.getTimeScalarRestrictionAccess().getMaxExclusiveSTRINGTerminalRuleCall_6_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTimeScalarRestrictionRule());
						}
						setWithLastConsumed(
							$current,
							"maxExclusive",
							lv_maxExclusive_10_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.STRING");
					}
				)
			)
		)?
		otherlv_11='restrictedRange'
		{
			newLeafNode(otherlv_11, grammarAccess.getTimeScalarRestrictionAccess().getRestrictedRangeKeyword_7());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTimeScalarRestrictionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTimeScalarRestrictionAccess().getRestrictedRangeDataRangeCrossReference_8_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RCURLY_13=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_13, grammarAccess.getTimeScalarRestrictionAccess().getRCURLYTerminalRuleCall_9());
		}
	)
;

// Entry rule entryRuleDescriptionBox
entryRuleDescriptionBox returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDescriptionBoxRule()); }
	iv_ruleDescriptionBox=ruleDescriptionBox
	{ $current=$iv_ruleDescriptionBox.current; }
	EOF;

// Rule DescriptionBox
ruleDescriptionBox returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getDescriptionBoxAccess().getKindDescriptionKindEnumRuleCall_0_0());
				}
				lv_kind_0_0=ruleDescriptionKind
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDescriptionBoxRule());
					}
					set(
						$current,
						"kind",
						lv_kind_0_0,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.DescriptionKind");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_DESCRIPTION_BOX_TOKEN_1=RULE_DESCRIPTION_BOX_TOKEN
		{
			newLeafNode(this_DESCRIPTION_BOX_TOKEN_1, grammarAccess.getDescriptionBoxAccess().getDESCRIPTION_BOX_TOKENTerminalRuleCall_1());
		}
		(
			(
				lv_iri_2_0=RULE_IRI
				{
					newLeafNode(lv_iri_2_0, grammarAccess.getDescriptionBoxAccess().getIriIRITerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDescriptionBoxRule());
					}
					setWithLastConsumed(
						$current,
						"iri",
						lv_iri_2_0,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.IRI");
				}
			)
		)
		this_LCURLY_3=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_3, grammarAccess.getDescriptionBoxAccess().getLCURLYTerminalRuleCall_3());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getDescriptionBoxAccess().getAnnotationsAnnotationParserRuleCall_4_0_0());
					}
					lv_annotations_4_0=ruleAnnotation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDescriptionBoxRule());
						}
						add(
							$current,
							"annotations",
							lv_annotations_4_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.Annotation");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getDescriptionBoxAccess().getClosedWorldDefinitionsDescriptionBoxExtendsClosedWorldDefinitionsParserRuleCall_4_1_0());
					}
					lv_closedWorldDefinitions_5_0=ruleDescriptionBoxExtendsClosedWorldDefinitions
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDescriptionBoxRule());
						}
						add(
							$current,
							"closedWorldDefinitions",
							lv_closedWorldDefinitions_5_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.DescriptionBoxExtendsClosedWorldDefinitions");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getDescriptionBoxAccess().getDescriptionBoxRefinementsDescriptionBoxRefinementParserRuleCall_4_2_0());
					}
					lv_descriptionBoxRefinements_6_0=ruleDescriptionBoxRefinement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDescriptionBoxRule());
						}
						add(
							$current,
							"descriptionBoxRefinements",
							lv_descriptionBoxRefinements_6_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.DescriptionBoxRefinement");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getDescriptionBoxAccess().getConceptInstancesConceptInstanceParserRuleCall_4_3_0());
					}
					lv_conceptInstances_7_0=ruleConceptInstance
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDescriptionBoxRule());
						}
						add(
							$current,
							"conceptInstances",
							lv_conceptInstances_7_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.ConceptInstance");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getDescriptionBoxAccess().getReifiedRelationshipInstancesReifiedRelationshipInstanceParserRuleCall_4_4_0());
					}
					lv_reifiedRelationshipInstances_8_0=ruleReifiedRelationshipInstance
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDescriptionBoxRule());
						}
						add(
							$current,
							"reifiedRelationshipInstances",
							lv_reifiedRelationshipInstances_8_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.ReifiedRelationshipInstance");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getDescriptionBoxAccess().getReifiedRelationshipInstanceDomainsReifiedRelationshipInstanceDomainParserRuleCall_4_5_0());
					}
					lv_reifiedRelationshipInstanceDomains_9_0=ruleReifiedRelationshipInstanceDomain
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDescriptionBoxRule());
						}
						add(
							$current,
							"reifiedRelationshipInstanceDomains",
							lv_reifiedRelationshipInstanceDomains_9_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.ReifiedRelationshipInstanceDomain");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getDescriptionBoxAccess().getReifiedRelationshipInstanceRangesReifiedRelationshipInstanceRangeParserRuleCall_4_6_0());
					}
					lv_reifiedRelationshipInstanceRanges_10_0=ruleReifiedRelationshipInstanceRange
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDescriptionBoxRule());
						}
						add(
							$current,
							"reifiedRelationshipInstanceRanges",
							lv_reifiedRelationshipInstanceRanges_10_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.ReifiedRelationshipInstanceRange");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getDescriptionBoxAccess().getUnreifiedRelationshipInstanceTuplesUnreifiedRelationshipInstanceTupleParserRuleCall_4_7_0());
					}
					lv_unreifiedRelationshipInstanceTuples_11_0=ruleUnreifiedRelationshipInstanceTuple
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDescriptionBoxRule());
						}
						add(
							$current,
							"unreifiedRelationshipInstanceTuples",
							lv_unreifiedRelationshipInstanceTuples_11_0,
							"jpl.imce.oml.specification.OntologicalModelingLanguage.UnreifiedRelationshipInstanceTuple");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		this_RCURLY_12=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_12, grammarAccess.getDescriptionBoxAccess().getRCURLYTerminalRuleCall_5());
		}
	)
;

// Entry rule entryRuleDescriptionBoxExtendsClosedWorldDefinitions
entryRuleDescriptionBoxExtendsClosedWorldDefinitions returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDescriptionBoxExtendsClosedWorldDefinitionsRule()); }
	iv_ruleDescriptionBoxExtendsClosedWorldDefinitions=ruleDescriptionBoxExtendsClosedWorldDefinitions
	{ $current=$iv_ruleDescriptionBoxExtendsClosedWorldDefinitions.current; }
	EOF;

// Rule DescriptionBoxExtendsClosedWorldDefinitions
ruleDescriptionBoxExtendsClosedWorldDefinitions returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_EXTENDS_TOKEN_0=RULE_EXTENDS_TOKEN
		{
			newLeafNode(this_EXTENDS_TOKEN_0, grammarAccess.getDescriptionBoxExtendsClosedWorldDefinitionsAccess().getEXTENDS_TOKENTerminalRuleCall_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDescriptionBoxExtendsClosedWorldDefinitionsRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getDescriptionBoxExtendsClosedWorldDefinitionsAccess().getClosedWorldDefinitionsTerminologyBoxCrossReference_1_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleDescriptionBoxRefinement
entryRuleDescriptionBoxRefinement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDescriptionBoxRefinementRule()); }
	iv_ruleDescriptionBoxRefinement=ruleDescriptionBoxRefinement
	{ $current=$iv_ruleDescriptionBoxRefinement.current; }
	EOF;

// Rule DescriptionBoxRefinement
ruleDescriptionBoxRefinement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_REFINES_TOKEN_0=RULE_REFINES_TOKEN
		{
			newLeafNode(this_REFINES_TOKEN_0, grammarAccess.getDescriptionBoxRefinementAccess().getREFINES_TOKENTerminalRuleCall_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDescriptionBoxRefinementRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getDescriptionBoxRefinementAccess().getRefinedDescriptionBoxDescriptionBoxCrossReference_1_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleScalarDataPropertyValue
entryRuleScalarDataPropertyValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScalarDataPropertyValueRule()); }
	iv_ruleScalarDataPropertyValue=ruleScalarDataPropertyValue
	{ $current=$iv_ruleScalarDataPropertyValue.current; }
	EOF;

// Rule ScalarDataPropertyValue
ruleScalarDataPropertyValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ScalarDataPropertyValue'
		{
			newLeafNode(otherlv_0, grammarAccess.getScalarDataPropertyValueAccess().getScalarDataPropertyValueKeyword_0());
		}
		this_LCURLY_1=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_1, grammarAccess.getScalarDataPropertyValueAccess().getLCURLYTerminalRuleCall_1());
		}
		otherlv_2='scalarPropertyValue'
		{
			newLeafNode(otherlv_2, grammarAccess.getScalarDataPropertyValueAccess().getScalarPropertyValueKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getScalarDataPropertyValueAccess().getScalarPropertyValueReferenceParserRuleCall_3_0());
				}
				lv_scalarPropertyValue_3_0=ruleReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScalarDataPropertyValueRule());
					}
					set(
						$current,
						"scalarPropertyValue",
						lv_scalarPropertyValue_3_0,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.Reference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='scalarDataProperty'
		{
			newLeafNode(otherlv_4, grammarAccess.getScalarDataPropertyValueAccess().getScalarDataPropertyKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getScalarDataPropertyValueRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getScalarDataPropertyValueAccess().getScalarDataPropertyDataRelationshipToScalarCrossReference_5_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RCURLY_6=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_6, grammarAccess.getScalarDataPropertyValueAccess().getRCURLYTerminalRuleCall_6());
		}
	)
;

// Entry rule entryRuleStructuredDataPropertyValue
entryRuleStructuredDataPropertyValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStructuredDataPropertyValueRule()); }
	iv_ruleStructuredDataPropertyValue=ruleStructuredDataPropertyValue
	{ $current=$iv_ruleStructuredDataPropertyValue.current; }
	EOF;

// Rule StructuredDataPropertyValue
ruleStructuredDataPropertyValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='StructuredDataPropertyValue'
		{
			newLeafNode(otherlv_0, grammarAccess.getStructuredDataPropertyValueAccess().getStructuredDataPropertyValueKeyword_0());
		}
		this_LCURLY_1=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_1, grammarAccess.getStructuredDataPropertyValueAccess().getLCURLYTerminalRuleCall_1());
		}
		otherlv_2='structuredDataProperty'
		{
			newLeafNode(otherlv_2, grammarAccess.getStructuredDataPropertyValueAccess().getStructuredDataPropertyKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStructuredDataPropertyValueRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getStructuredDataPropertyValueAccess().getStructuredDataPropertyDataRelationshipToStructureCrossReference_3_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='structuredPropertyTuple'
		{
			newLeafNode(otherlv_4, grammarAccess.getStructuredDataPropertyValueAccess().getStructuredPropertyTupleKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStructuredDataPropertyValueAccess().getStructuredPropertyTupleDataStructureTupleParserRuleCall_5_0());
				}
				lv_structuredPropertyTuple_5_0=ruleDataStructureTuple
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStructuredDataPropertyValueRule());
					}
					set(
						$current,
						"structuredPropertyTuple",
						lv_structuredPropertyTuple_5_0,
						"jpl.imce.oml.specification.OntologicalModelingLanguage.DataStructureTuple");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RCURLY_6=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_6, grammarAccess.getStructuredDataPropertyValueAccess().getRCURLYTerminalRuleCall_6());
		}
	)
;

// Entry rule entryRuleDataStructureTuple
entryRuleDataStructureTuple returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDataStructureTupleRule()); }
	iv_ruleDataStructureTuple=ruleDataStructureTuple
	{ $current=$iv_ruleDataStructureTuple.current; }
	EOF;

// Rule DataStructureTuple
ruleDataStructureTuple returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='DataStructureTuple'
		{
			newLeafNode(otherlv_0, grammarAccess.getDataStructureTupleAccess().getDataStructureTupleKeyword_0());
		}
		this_LCURLY_1=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_1, grammarAccess.getDataStructureTupleAccess().getLCURLYTerminalRuleCall_1());
		}
		otherlv_2='dataStructureType'
		{
			newLeafNode(otherlv_2, grammarAccess.getDataStructureTupleAccess().getDataStructureTypeKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDataStructureTupleRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getDataStructureTupleAccess().getDataStructureTypeStructureCrossReference_3_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RCURLY_4=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_4, grammarAccess.getDataStructureTupleAccess().getRCURLYTerminalRuleCall_4());
		}
	)
;

// Entry rule entryRuleConceptInstance
entryRuleConceptInstance returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConceptInstanceRule()); }
	iv_ruleConceptInstance=ruleConceptInstance
	{ $current=$iv_ruleConceptInstance.current; }
	EOF;

// Rule ConceptInstance
ruleConceptInstance returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ConceptInstance'
		{
			newLeafNode(otherlv_0, grammarAccess.getConceptInstanceAccess().getConceptInstanceKeyword_0());
		}
		this_LCURLY_1=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_1, grammarAccess.getConceptInstanceAccess().getLCURLYTerminalRuleCall_1());
		}
		otherlv_2='singletonConceptClassifier'
		{
			newLeafNode(otherlv_2, grammarAccess.getConceptInstanceAccess().getSingletonConceptClassifierKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConceptInstanceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getConceptInstanceAccess().getSingletonConceptClassifierConceptCrossReference_3_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RCURLY_4=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_4, grammarAccess.getConceptInstanceAccess().getRCURLYTerminalRuleCall_4());
		}
	)
;

// Entry rule entryRuleReifiedRelationshipInstance
entryRuleReifiedRelationshipInstance returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReifiedRelationshipInstanceRule()); }
	iv_ruleReifiedRelationshipInstance=ruleReifiedRelationshipInstance
	{ $current=$iv_ruleReifiedRelationshipInstance.current; }
	EOF;

// Rule ReifiedRelationshipInstance
ruleReifiedRelationshipInstance returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ReifiedRelationshipInstance'
		{
			newLeafNode(otherlv_0, grammarAccess.getReifiedRelationshipInstanceAccess().getReifiedRelationshipInstanceKeyword_0());
		}
		this_LCURLY_1=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_1, grammarAccess.getReifiedRelationshipInstanceAccess().getLCURLYTerminalRuleCall_1());
		}
		otherlv_2='singletonReifiedRelationshipClassifier'
		{
			newLeafNode(otherlv_2, grammarAccess.getReifiedRelationshipInstanceAccess().getSingletonReifiedRelationshipClassifierKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReifiedRelationshipInstanceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getReifiedRelationshipInstanceAccess().getSingletonReifiedRelationshipClassifierReifiedRelationshipCrossReference_3_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RCURLY_4=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_4, grammarAccess.getReifiedRelationshipInstanceAccess().getRCURLYTerminalRuleCall_4());
		}
	)
;

// Entry rule entryRuleReifiedRelationshipInstanceDomain
entryRuleReifiedRelationshipInstanceDomain returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReifiedRelationshipInstanceDomainRule()); }
	iv_ruleReifiedRelationshipInstanceDomain=ruleReifiedRelationshipInstanceDomain
	{ $current=$iv_ruleReifiedRelationshipInstanceDomain.current; }
	EOF;

// Rule ReifiedRelationshipInstanceDomain
ruleReifiedRelationshipInstanceDomain returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ReifiedRelationshipInstanceDomain'
		{
			newLeafNode(otherlv_0, grammarAccess.getReifiedRelationshipInstanceDomainAccess().getReifiedRelationshipInstanceDomainKeyword_0());
		}
		this_LCURLY_1=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_1, grammarAccess.getReifiedRelationshipInstanceDomainAccess().getLCURLYTerminalRuleCall_1());
		}
		otherlv_2='reifiedRelationshipInstance'
		{
			newLeafNode(otherlv_2, grammarAccess.getReifiedRelationshipInstanceDomainAccess().getReifiedRelationshipInstanceKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReifiedRelationshipInstanceDomainRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getReifiedRelationshipInstanceDomainAccess().getReifiedRelationshipInstanceReifiedRelationshipInstanceCrossReference_3_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_DOMAIN_TOKEN_4=RULE_DOMAIN_TOKEN
		{
			newLeafNode(this_DOMAIN_TOKEN_4, grammarAccess.getReifiedRelationshipInstanceDomainAccess().getDOMAIN_TOKENTerminalRuleCall_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReifiedRelationshipInstanceDomainRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getReifiedRelationshipInstanceDomainAccess().getDomainConceptualEntitySingletonInstanceCrossReference_5_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RCURLY_6=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_6, grammarAccess.getReifiedRelationshipInstanceDomainAccess().getRCURLYTerminalRuleCall_6());
		}
	)
;

// Entry rule entryRuleReifiedRelationshipInstanceRange
entryRuleReifiedRelationshipInstanceRange returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReifiedRelationshipInstanceRangeRule()); }
	iv_ruleReifiedRelationshipInstanceRange=ruleReifiedRelationshipInstanceRange
	{ $current=$iv_ruleReifiedRelationshipInstanceRange.current; }
	EOF;

// Rule ReifiedRelationshipInstanceRange
ruleReifiedRelationshipInstanceRange returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ReifiedRelationshipInstanceRange'
		{
			newLeafNode(otherlv_0, grammarAccess.getReifiedRelationshipInstanceRangeAccess().getReifiedRelationshipInstanceRangeKeyword_0());
		}
		this_LCURLY_1=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_1, grammarAccess.getReifiedRelationshipInstanceRangeAccess().getLCURLYTerminalRuleCall_1());
		}
		otherlv_2='reifiedRelationshipInstance'
		{
			newLeafNode(otherlv_2, grammarAccess.getReifiedRelationshipInstanceRangeAccess().getReifiedRelationshipInstanceKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReifiedRelationshipInstanceRangeRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getReifiedRelationshipInstanceRangeAccess().getReifiedRelationshipInstanceReifiedRelationshipInstanceCrossReference_3_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RANGE_TOKEN_4=RULE_RANGE_TOKEN
		{
			newLeafNode(this_RANGE_TOKEN_4, grammarAccess.getReifiedRelationshipInstanceRangeAccess().getRANGE_TOKENTerminalRuleCall_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReifiedRelationshipInstanceRangeRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getReifiedRelationshipInstanceRangeAccess().getRangeConceptualEntitySingletonInstanceCrossReference_5_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RCURLY_6=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_6, grammarAccess.getReifiedRelationshipInstanceRangeAccess().getRCURLYTerminalRuleCall_6());
		}
	)
;

// Entry rule entryRuleUnreifiedRelationshipInstanceTuple
entryRuleUnreifiedRelationshipInstanceTuple returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnreifiedRelationshipInstanceTupleRule()); }
	iv_ruleUnreifiedRelationshipInstanceTuple=ruleUnreifiedRelationshipInstanceTuple
	{ $current=$iv_ruleUnreifiedRelationshipInstanceTuple.current; }
	EOF;

// Rule UnreifiedRelationshipInstanceTuple
ruleUnreifiedRelationshipInstanceTuple returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='UnreifiedRelationshipInstanceTuple'
		{
			newLeafNode(otherlv_0, grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getUnreifiedRelationshipInstanceTupleKeyword_0());
		}
		this_LCURLY_1=RULE_LCURLY
		{
			newLeafNode(this_LCURLY_1, grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getLCURLYTerminalRuleCall_1());
		}
		this_UNREIFIED_RELATIONSHIP_TOKEN_2=RULE_UNREIFIED_RELATIONSHIP_TOKEN
		{
			newLeafNode(this_UNREIFIED_RELATIONSHIP_TOKEN_2, grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getUNREIFIED_RELATIONSHIP_TOKENTerminalRuleCall_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnreifiedRelationshipInstanceTupleRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getUnreifiedRelationshipUnreifiedRelationshipCrossReference_3_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_DOMAIN_TOKEN_4=RULE_DOMAIN_TOKEN
		{
			newLeafNode(this_DOMAIN_TOKEN_4, grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getDOMAIN_TOKENTerminalRuleCall_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnreifiedRelationshipInstanceTupleRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getDomainConceptualEntitySingletonInstanceCrossReference_5_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RANGE_TOKEN_6=RULE_RANGE_TOKEN
		{
			newLeafNode(this_RANGE_TOKEN_6, grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getRANGE_TOKENTerminalRuleCall_6());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnreifiedRelationshipInstanceTupleRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getRangeConceptualEntitySingletonInstanceCrossReference_7_0());
				}
				ruleReference
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_RCURLY_8=RULE_RCURLY
		{
			newLeafNode(this_RCURLY_8, grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getRCURLYTerminalRuleCall_8());
		}
	)
;

// Entry rule entryRuleReference
entryRuleReference returns [String current=null]:
	{ newCompositeNode(grammarAccess.getReferenceRule()); }
	iv_ruleReference=ruleReference
	{ $current=$iv_ruleReference.current.getText(); }
	EOF;

// Rule Reference
ruleReference returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_IRI_0=RULE_IRI
		{
			$current.merge(this_IRI_0);
		}
		{
			newLeafNode(this_IRI_0, grammarAccess.getReferenceAccess().getIRITerminalRuleCall_0());
		}
		    |
		{
			newCompositeNode(grammarAccess.getReferenceAccess().getQNAMEParserRuleCall_1());
		}
		this_QNAME_1=ruleQNAME
		{
			$current.merge(this_QNAME_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleQNAME
entryRuleQNAME returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQNAMERule()); }
	iv_ruleQNAME=ruleQNAME
	{ $current=$iv_ruleQNAME.current.getText(); }
	EOF;

// Rule QNAME
ruleQNAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getQNAMEAccess().getABBREV_IRIParserRuleCall_0());
		}
		this_ABBREV_IRI_0=ruleABBREV_IRI
		{
			$current.merge(this_ABBREV_IRI_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getQNAMEAccess().getValidIDParserRuleCall_1());
		}
		this_ValidID_1=ruleValidID
		{
			$current.merge(this_ValidID_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleABBREV_IRI
entryRuleABBREV_IRI returns [String current=null]:
	{ newCompositeNode(grammarAccess.getABBREV_IRIRule()); }
	iv_ruleABBREV_IRI=ruleABBREV_IRI
	{ $current=$iv_ruleABBREV_IRI.current.getText(); }
	EOF;

// Rule ABBREV_IRI
ruleABBREV_IRI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getABBREV_IRIAccess().getValidIDParserRuleCall_0());
		}
		this_ValidID_0=ruleValidID
		{
			$current.merge(this_ValidID_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		kw=':'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getABBREV_IRIAccess().getColonKeyword_1());
		}
		{
			newCompositeNode(grammarAccess.getABBREV_IRIAccess().getValidIDParserRuleCall_2());
		}
		this_ValidID_2=ruleValidID
		{
			$current.merge(this_ValidID_2);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleValidID
entryRuleValidID returns [String current=null]:
	{ newCompositeNode(grammarAccess.getValidIDRule()); }
	iv_ruleValidID=ruleValidID
	{ $current=$iv_ruleValidID.current.getText(); }
	EOF;

// Rule ValidID
ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_ID_0=RULE_ID
	{
		$current.merge(this_ID_0);
	}
	{
		newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall());
	}
;

// Rule TerminologyGraphKind
ruleTerminologyGraphKind returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='open'
			{
				$current = grammarAccess.getTerminologyGraphKindAccess().getOpenWorldDefinitionsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTerminologyGraphKindAccess().getOpenWorldDefinitionsEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='closed'
			{
				$current = grammarAccess.getTerminologyGraphKindAccess().getClosedWorldDesignationsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTerminologyGraphKindAccess().getClosedWorldDesignationsEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule DescriptionKind
ruleDescriptionKind returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='final'
			{
				$current = grammarAccess.getDescriptionKindAccess().getFinalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getDescriptionKindAccess().getFinalEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='partial'
			{
				$current = grammarAccess.getDescriptionKindAccess().getPartialEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getDescriptionKindAccess().getPartialEnumLiteralDeclaration_1());
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

RULE_EXTENDS_TOKEN : 'extends';

RULE_REFINES_TOKEN : 'refines';

RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN : 'rootConceptTaxonomyAxiom';

RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN : 'specificDisjointConceptAxiom';

RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN : 'anonymousConceptTaxonomyAxiom';

RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN : 'bundledTerminologyAxiom';

RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN : 'conceptDesignationTerminologyAxiom';

RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN : 'terminologyNestingAxiom';

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

RULE_DESCRIPTION_BOX_TOKEN : 'DescriptionBox';

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
