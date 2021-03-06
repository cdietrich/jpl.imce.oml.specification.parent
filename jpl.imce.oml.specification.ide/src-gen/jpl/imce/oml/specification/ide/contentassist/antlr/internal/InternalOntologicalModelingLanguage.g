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
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package jpl.imce.oml.specification.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package jpl.imce.oml.specification.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import jpl.imce.oml.specification.services.OntologicalModelingLanguageGrammarAccess;

}
@parser::members {
	private OntologicalModelingLanguageGrammarAccess grammarAccess;

	public void setGrammarAccess(OntologicalModelingLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleTerminologyExtent
entryRuleTerminologyExtent
:
{ before(grammarAccess.getTerminologyExtentRule()); }
	 ruleTerminologyExtent
{ after(grammarAccess.getTerminologyExtentRule()); } 
	 EOF 
;

// Rule TerminologyExtent
ruleTerminologyExtent 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTerminologyExtentAccess().getGroup()); }
		(rule__TerminologyExtent__Group__0)
		{ after(grammarAccess.getTerminologyExtentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAnnotationProperty
entryRuleAnnotationProperty
:
{ before(grammarAccess.getAnnotationPropertyRule()); }
	 ruleAnnotationProperty
{ after(grammarAccess.getAnnotationPropertyRule()); } 
	 EOF 
;

// Rule AnnotationProperty
ruleAnnotationProperty 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAnnotationPropertyAccess().getGroup()); }
		(rule__AnnotationProperty__Group__0)
		{ after(grammarAccess.getAnnotationPropertyAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAnnotation
entryRuleAnnotation
:
{ before(grammarAccess.getAnnotationRule()); }
	 ruleAnnotation
{ after(grammarAccess.getAnnotationRule()); } 
	 EOF 
;

// Rule Annotation
ruleAnnotation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAnnotationAccess().getGroup()); }
		(rule__Annotation__Group__0)
		{ after(grammarAccess.getAnnotationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTerminologyGraph
entryRuleTerminologyGraph
:
{ before(grammarAccess.getTerminologyGraphRule()); }
	 ruleTerminologyGraph
{ after(grammarAccess.getTerminologyGraphRule()); } 
	 EOF 
;

// Rule TerminologyGraph
ruleTerminologyGraph 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTerminologyGraphAccess().getGroup()); }
		(rule__TerminologyGraph__Group__0)
		{ after(grammarAccess.getTerminologyGraphAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBundle
entryRuleBundle
:
{ before(grammarAccess.getBundleRule()); }
	 ruleBundle
{ after(grammarAccess.getBundleRule()); } 
	 EOF 
;

// Rule Bundle
ruleBundle 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBundleAccess().getGroup()); }
		(rule__Bundle__Group__0)
		{ after(grammarAccess.getBundleAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTerminologyBoxAxiom
entryRuleTerminologyBoxAxiom
:
{ before(grammarAccess.getTerminologyBoxAxiomRule()); }
	 ruleTerminologyBoxAxiom
{ after(grammarAccess.getTerminologyBoxAxiomRule()); } 
	 EOF 
;

// Rule TerminologyBoxAxiom
ruleTerminologyBoxAxiom 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTerminologyBoxAxiomAccess().getAlternatives()); }
		(rule__TerminologyBoxAxiom__Alternatives)
		{ after(grammarAccess.getTerminologyBoxAxiomAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTerminologyBoxStatement
entryRuleTerminologyBoxStatement
:
{ before(grammarAccess.getTerminologyBoxStatementRule()); }
	 ruleTerminologyBoxStatement
{ after(grammarAccess.getTerminologyBoxStatementRule()); } 
	 EOF 
;

// Rule TerminologyBoxStatement
ruleTerminologyBoxStatement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTerminologyBoxStatementAccess().getAlternatives()); }
		(rule__TerminologyBoxStatement__Alternatives)
		{ after(grammarAccess.getTerminologyBoxStatementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTerm
entryRuleTerm
:
{ before(grammarAccess.getTermRule()); }
	 ruleTerm
{ after(grammarAccess.getTermRule()); } 
	 EOF 
;

// Rule Term
ruleTerm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTermAccess().getAlternatives()); }
		(rule__Term__Alternatives)
		{ after(grammarAccess.getTermAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAtomicEntity
entryRuleAtomicEntity
:
{ before(grammarAccess.getAtomicEntityRule()); }
	 ruleAtomicEntity
{ after(grammarAccess.getAtomicEntityRule()); } 
	 EOF 
;

// Rule AtomicEntity
ruleAtomicEntity 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAtomicEntityAccess().getAlternatives()); }
		(rule__AtomicEntity__Alternatives)
		{ after(grammarAccess.getAtomicEntityAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEntityRelationship
entryRuleEntityRelationship
:
{ before(grammarAccess.getEntityRelationshipRule()); }
	 ruleEntityRelationship
{ after(grammarAccess.getEntityRelationshipRule()); } 
	 EOF 
;

// Rule EntityRelationship
ruleEntityRelationship 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEntityRelationshipAccess().getAlternatives()); }
		(rule__EntityRelationship__Alternatives)
		{ after(grammarAccess.getEntityRelationshipAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDatatype
entryRuleDatatype
:
{ before(grammarAccess.getDatatypeRule()); }
	 ruleDatatype
{ after(grammarAccess.getDatatypeRule()); } 
	 EOF 
;

// Rule Datatype
ruleDatatype 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDatatypeAccess().getAlternatives()); }
		(rule__Datatype__Alternatives)
		{ after(grammarAccess.getDatatypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleScalarDataRange
entryRuleScalarDataRange
:
{ before(grammarAccess.getScalarDataRangeRule()); }
	 ruleScalarDataRange
{ after(grammarAccess.getScalarDataRangeRule()); } 
	 EOF 
;

// Rule ScalarDataRange
ruleScalarDataRange 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getScalarDataRangeAccess().getAlternatives()); }
		(rule__ScalarDataRange__Alternatives)
		{ after(grammarAccess.getScalarDataRangeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRestrictedDataRange
entryRuleRestrictedDataRange
:
{ before(grammarAccess.getRestrictedDataRangeRule()); }
	 ruleRestrictedDataRange
{ after(grammarAccess.getRestrictedDataRangeRule()); } 
	 EOF 
;

// Rule RestrictedDataRange
ruleRestrictedDataRange 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRestrictedDataRangeAccess().getAlternatives()); }
		(rule__RestrictedDataRange__Alternatives)
		{ after(grammarAccess.getRestrictedDataRangeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDataRelationship
entryRuleDataRelationship
:
{ before(grammarAccess.getDataRelationshipRule()); }
	 ruleDataRelationship
{ after(grammarAccess.getDataRelationshipRule()); } 
	 EOF 
;

// Rule DataRelationship
ruleDataRelationship 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDataRelationshipAccess().getAlternatives()); }
		(rule__DataRelationship__Alternatives)
		{ after(grammarAccess.getDataRelationshipAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAxiom
entryRuleAxiom
:
{ before(grammarAccess.getAxiomRule()); }
	 ruleAxiom
{ after(grammarAccess.getAxiomRule()); } 
	 EOF 
;

// Rule Axiom
ruleAxiom 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAxiomAccess().getAlternatives()); }
		(rule__Axiom__Alternatives)
		{ after(grammarAccess.getAxiomAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTermAxiom
entryRuleTermAxiom
:
{ before(grammarAccess.getTermAxiomRule()); }
	 ruleTermAxiom
{ after(grammarAccess.getTermAxiomRule()); } 
	 EOF 
;

// Rule TermAxiom
ruleTermAxiom 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTermAxiomAccess().getAlternatives()); }
		(rule__TermAxiom__Alternatives)
		{ after(grammarAccess.getTermAxiomAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEntityRestrictionAxiom
entryRuleEntityRestrictionAxiom
:
{ before(grammarAccess.getEntityRestrictionAxiomRule()); }
	 ruleEntityRestrictionAxiom
{ after(grammarAccess.getEntityRestrictionAxiomRule()); } 
	 EOF 
;

// Rule EntityRestrictionAxiom
ruleEntityRestrictionAxiom 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEntityRestrictionAxiomAccess().getAlternatives()); }
		(rule__EntityRestrictionAxiom__Alternatives)
		{ after(grammarAccess.getEntityRestrictionAxiomAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEntityScalarDataPropertyRestrictionAxiom
entryRuleEntityScalarDataPropertyRestrictionAxiom
:
{ before(grammarAccess.getEntityScalarDataPropertyRestrictionAxiomRule()); }
	 ruleEntityScalarDataPropertyRestrictionAxiom
{ after(grammarAccess.getEntityScalarDataPropertyRestrictionAxiomRule()); } 
	 EOF 
;

// Rule EntityScalarDataPropertyRestrictionAxiom
ruleEntityScalarDataPropertyRestrictionAxiom 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEntityScalarDataPropertyRestrictionAxiomAccess().getAlternatives()); }
		(rule__EntityScalarDataPropertyRestrictionAxiom__Alternatives)
		{ after(grammarAccess.getEntityScalarDataPropertyRestrictionAxiomAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSpecializationAxiom
entryRuleSpecializationAxiom
:
{ before(grammarAccess.getSpecializationAxiomRule()); }
	 ruleSpecializationAxiom
{ after(grammarAccess.getSpecializationAxiomRule()); } 
	 EOF 
;

// Rule SpecializationAxiom
ruleSpecializationAxiom 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSpecializationAxiomAccess().getAlternatives()); }
		(rule__SpecializationAxiom__Alternatives)
		{ after(grammarAccess.getSpecializationAxiomAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTerminologyBundleStatement
entryRuleTerminologyBundleStatement
:
{ before(grammarAccess.getTerminologyBundleStatementRule()); }
	 ruleTerminologyBundleStatement
{ after(grammarAccess.getTerminologyBundleStatementRule()); } 
	 EOF 
;

// Rule TerminologyBundleStatement
ruleTerminologyBundleStatement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTerminologyBundleStatementAccess().getAlternatives()); }
		(rule__TerminologyBundleStatement__Alternatives)
		{ after(grammarAccess.getTerminologyBundleStatementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTerminologyBundleAxiom
entryRuleTerminologyBundleAxiom
:
{ before(grammarAccess.getTerminologyBundleAxiomRule()); }
	 ruleTerminologyBundleAxiom
{ after(grammarAccess.getTerminologyBundleAxiomRule()); } 
	 EOF 
;

// Rule TerminologyBundleAxiom
ruleTerminologyBundleAxiom 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTerminologyBundleAxiomAccess().getBundledTerminologyAxiomParserRuleCall()); }
		ruleBundledTerminologyAxiom
		{ after(grammarAccess.getTerminologyBundleAxiomAccess().getBundledTerminologyAxiomParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAspect
entryRuleAspect
:
{ before(grammarAccess.getAspectRule()); }
	 ruleAspect
{ after(grammarAccess.getAspectRule()); } 
	 EOF 
;

// Rule Aspect
ruleAspect 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAspectAccess().getGroup()); }
		(rule__Aspect__Group__0)
		{ after(grammarAccess.getAspectAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConcept
entryRuleConcept
:
{ before(grammarAccess.getConceptRule()); }
	 ruleConcept
{ after(grammarAccess.getConceptRule()); } 
	 EOF 
;

// Rule Concept
ruleConcept 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConceptAccess().getGroup()); }
		(rule__Concept__Group__0)
		{ after(grammarAccess.getConceptAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleReifiedRelationship
entryRuleReifiedRelationship
:
{ before(grammarAccess.getReifiedRelationshipRule()); }
	 ruleReifiedRelationship
{ after(grammarAccess.getReifiedRelationshipRule()); } 
	 EOF 
;

// Rule ReifiedRelationship
ruleReifiedRelationship 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getReifiedRelationshipAccess().getGroup()); }
		(rule__ReifiedRelationship__Group__0)
		{ after(grammarAccess.getReifiedRelationshipAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleUnreifiedRelationship
entryRuleUnreifiedRelationship
:
{ before(grammarAccess.getUnreifiedRelationshipRule()); }
	 ruleUnreifiedRelationship
{ after(grammarAccess.getUnreifiedRelationshipRule()); } 
	 EOF 
;

// Rule UnreifiedRelationship
ruleUnreifiedRelationship 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getUnreifiedRelationshipAccess().getGroup()); }
		(rule__UnreifiedRelationship__Group__0)
		{ after(grammarAccess.getUnreifiedRelationshipAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleScalar
entryRuleScalar
:
{ before(grammarAccess.getScalarRule()); }
	 ruleScalar
{ after(grammarAccess.getScalarRule()); } 
	 EOF 
;

// Rule Scalar
ruleScalar 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getScalarAccess().getGroup()); }
		(rule__Scalar__Group__0)
		{ after(grammarAccess.getScalarAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStructure
entryRuleStructure
:
{ before(grammarAccess.getStructureRule()); }
	 ruleStructure
{ after(grammarAccess.getStructureRule()); } 
	 EOF 
;

// Rule Structure
ruleStructure 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStructureAccess().getGroup()); }
		(rule__Structure__Group__0)
		{ after(grammarAccess.getStructureAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEntityStructuredDataProperty
entryRuleEntityStructuredDataProperty
:
{ before(grammarAccess.getEntityStructuredDataPropertyRule()); }
	 ruleEntityStructuredDataProperty
{ after(grammarAccess.getEntityStructuredDataPropertyRule()); } 
	 EOF 
;

// Rule EntityStructuredDataProperty
ruleEntityStructuredDataProperty 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEntityStructuredDataPropertyAccess().getGroup()); }
		(rule__EntityStructuredDataProperty__Group__0)
		{ after(grammarAccess.getEntityStructuredDataPropertyAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEntityScalarDataProperty
entryRuleEntityScalarDataProperty
:
{ before(grammarAccess.getEntityScalarDataPropertyRule()); }
	 ruleEntityScalarDataProperty
{ after(grammarAccess.getEntityScalarDataPropertyRule()); } 
	 EOF 
;

// Rule EntityScalarDataProperty
ruleEntityScalarDataProperty 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEntityScalarDataPropertyAccess().getGroup()); }
		(rule__EntityScalarDataProperty__Group__0)
		{ after(grammarAccess.getEntityScalarDataPropertyAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStructuredDataProperty
entryRuleStructuredDataProperty
:
{ before(grammarAccess.getStructuredDataPropertyRule()); }
	 ruleStructuredDataProperty
{ after(grammarAccess.getStructuredDataPropertyRule()); } 
	 EOF 
;

// Rule StructuredDataProperty
ruleStructuredDataProperty 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStructuredDataPropertyAccess().getGroup()); }
		(rule__StructuredDataProperty__Group__0)
		{ after(grammarAccess.getStructuredDataPropertyAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleScalarDataProperty
entryRuleScalarDataProperty
:
{ before(grammarAccess.getScalarDataPropertyRule()); }
	 ruleScalarDataProperty
{ after(grammarAccess.getScalarDataPropertyRule()); } 
	 EOF 
;

// Rule ScalarDataProperty
ruleScalarDataProperty 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getScalarDataPropertyAccess().getGroup()); }
		(rule__ScalarDataProperty__Group__0)
		{ after(grammarAccess.getScalarDataPropertyAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAnonymousConceptTaxonomyAxiom
entryRuleAnonymousConceptTaxonomyAxiom
:
{ before(grammarAccess.getAnonymousConceptTaxonomyAxiomRule()); }
	 ruleAnonymousConceptTaxonomyAxiom
{ after(grammarAccess.getAnonymousConceptTaxonomyAxiomRule()); } 
	 EOF 
;

// Rule AnonymousConceptTaxonomyAxiom
ruleAnonymousConceptTaxonomyAxiom 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAnonymousConceptTaxonomyAxiomAccess().getGroup()); }
		(rule__AnonymousConceptTaxonomyAxiom__Group__0)
		{ after(grammarAccess.getAnonymousConceptTaxonomyAxiomAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRootConceptTaxonomyAxiom
entryRuleRootConceptTaxonomyAxiom
:
{ before(grammarAccess.getRootConceptTaxonomyAxiomRule()); }
	 ruleRootConceptTaxonomyAxiom
{ after(grammarAccess.getRootConceptTaxonomyAxiomRule()); } 
	 EOF 
;

// Rule RootConceptTaxonomyAxiom
ruleRootConceptTaxonomyAxiom 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRootConceptTaxonomyAxiomAccess().getGroup()); }
		(rule__RootConceptTaxonomyAxiom__Group__0)
		{ after(grammarAccess.getRootConceptTaxonomyAxiomAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSpecificDisjointConceptAxiom
entryRuleSpecificDisjointConceptAxiom
:
{ before(grammarAccess.getSpecificDisjointConceptAxiomRule()); }
	 ruleSpecificDisjointConceptAxiom
{ after(grammarAccess.getSpecificDisjointConceptAxiomRule()); } 
	 EOF 
;

// Rule SpecificDisjointConceptAxiom
ruleSpecificDisjointConceptAxiom 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSpecificDisjointConceptAxiomAccess().getGroup()); }
		(rule__SpecificDisjointConceptAxiom__Group__0)
		{ after(grammarAccess.getSpecificDisjointConceptAxiomAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBundledTerminologyAxiom
entryRuleBundledTerminologyAxiom
:
{ before(grammarAccess.getBundledTerminologyAxiomRule()); }
	 ruleBundledTerminologyAxiom
{ after(grammarAccess.getBundledTerminologyAxiomRule()); } 
	 EOF 
;

// Rule BundledTerminologyAxiom
ruleBundledTerminologyAxiom 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBundledTerminologyAxiomAccess().getGroup()); }
		(rule__BundledTerminologyAxiom__Group__0)
		{ after(grammarAccess.getBundledTerminologyAxiomAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConceptDesignationTerminologyAxiom
entryRuleConceptDesignationTerminologyAxiom
:
{ before(grammarAccess.getConceptDesignationTerminologyAxiomRule()); }
	 ruleConceptDesignationTerminologyAxiom
{ after(grammarAccess.getConceptDesignationTerminologyAxiomRule()); } 
	 EOF 
;

// Rule ConceptDesignationTerminologyAxiom
ruleConceptDesignationTerminologyAxiom 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConceptDesignationTerminologyAxiomAccess().getGroup()); }
		(rule__ConceptDesignationTerminologyAxiom__Group__0)
		{ after(grammarAccess.getConceptDesignationTerminologyAxiomAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTerminologyExtensionAxiom
entryRuleTerminologyExtensionAxiom
:
{ before(grammarAccess.getTerminologyExtensionAxiomRule()); }
	 ruleTerminologyExtensionAxiom
{ after(grammarAccess.getTerminologyExtensionAxiomRule()); } 
	 EOF 
;

// Rule TerminologyExtensionAxiom
ruleTerminologyExtensionAxiom 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTerminologyExtensionAxiomAccess().getGroup()); }
		(rule__TerminologyExtensionAxiom__Group__0)
		{ after(grammarAccess.getTerminologyExtensionAxiomAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTerminologyNestingAxiom
entryRuleTerminologyNestingAxiom
:
{ before(grammarAccess.getTerminologyNestingAxiomRule()); }
	 ruleTerminologyNestingAxiom
{ after(grammarAccess.getTerminologyNestingAxiomRule()); } 
	 EOF 
;

// Rule TerminologyNestingAxiom
ruleTerminologyNestingAxiom 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTerminologyNestingAxiomAccess().getGroup()); }
		(rule__TerminologyNestingAxiom__Group__0)
		{ after(grammarAccess.getTerminologyNestingAxiomAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEntityExistentialRestrictionAxiom
entryRuleEntityExistentialRestrictionAxiom
:
{ before(grammarAccess.getEntityExistentialRestrictionAxiomRule()); }
	 ruleEntityExistentialRestrictionAxiom
{ after(grammarAccess.getEntityExistentialRestrictionAxiomRule()); } 
	 EOF 
;

// Rule EntityExistentialRestrictionAxiom
ruleEntityExistentialRestrictionAxiom 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getGroup()); }
		(rule__EntityExistentialRestrictionAxiom__Group__0)
		{ after(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEntityUniversalRestrictionAxiom
entryRuleEntityUniversalRestrictionAxiom
:
{ before(grammarAccess.getEntityUniversalRestrictionAxiomRule()); }
	 ruleEntityUniversalRestrictionAxiom
{ after(grammarAccess.getEntityUniversalRestrictionAxiomRule()); } 
	 EOF 
;

// Rule EntityUniversalRestrictionAxiom
ruleEntityUniversalRestrictionAxiom 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getGroup()); }
		(rule__EntityUniversalRestrictionAxiom__Group__0)
		{ after(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAspectSpecializationAxiom
entryRuleAspectSpecializationAxiom
:
{ before(grammarAccess.getAspectSpecializationAxiomRule()); }
	 ruleAspectSpecializationAxiom
{ after(grammarAccess.getAspectSpecializationAxiomRule()); } 
	 EOF 
;

// Rule AspectSpecializationAxiom
ruleAspectSpecializationAxiom 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAspectSpecializationAxiomAccess().getGroup()); }
		(rule__AspectSpecializationAxiom__Group__0)
		{ after(grammarAccess.getAspectSpecializationAxiomAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConceptSpecializationAxiom
entryRuleConceptSpecializationAxiom
:
{ before(grammarAccess.getConceptSpecializationAxiomRule()); }
	 ruleConceptSpecializationAxiom
{ after(grammarAccess.getConceptSpecializationAxiomRule()); } 
	 EOF 
;

// Rule ConceptSpecializationAxiom
ruleConceptSpecializationAxiom 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConceptSpecializationAxiomAccess().getGroup()); }
		(rule__ConceptSpecializationAxiom__Group__0)
		{ after(grammarAccess.getConceptSpecializationAxiomAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleReifiedRelationshipSpecializationAxiom
entryRuleReifiedRelationshipSpecializationAxiom
:
{ before(grammarAccess.getReifiedRelationshipSpecializationAxiomRule()); }
	 ruleReifiedRelationshipSpecializationAxiom
{ after(grammarAccess.getReifiedRelationshipSpecializationAxiomRule()); } 
	 EOF 
;

// Rule ReifiedRelationshipSpecializationAxiom
ruleReifiedRelationshipSpecializationAxiom 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getReifiedRelationshipSpecializationAxiomAccess().getGroup()); }
		(rule__ReifiedRelationshipSpecializationAxiom__Group__0)
		{ after(grammarAccess.getReifiedRelationshipSpecializationAxiomAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEntityScalarDataPropertyExistentialRestrictionAxiom
entryRuleEntityScalarDataPropertyExistentialRestrictionAxiom
:
{ before(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomRule()); }
	 ruleEntityScalarDataPropertyExistentialRestrictionAxiom
{ after(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomRule()); } 
	 EOF 
;

// Rule EntityScalarDataPropertyExistentialRestrictionAxiom
ruleEntityScalarDataPropertyExistentialRestrictionAxiom 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getGroup()); }
		(rule__EntityScalarDataPropertyExistentialRestrictionAxiom__Group__0)
		{ after(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEntityScalarDataPropertyParticularRestrictionAxiom
entryRuleEntityScalarDataPropertyParticularRestrictionAxiom
:
{ before(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomRule()); }
	 ruleEntityScalarDataPropertyParticularRestrictionAxiom
{ after(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomRule()); } 
	 EOF 
;

// Rule EntityScalarDataPropertyParticularRestrictionAxiom
ruleEntityScalarDataPropertyParticularRestrictionAxiom 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getGroup()); }
		(rule__EntityScalarDataPropertyParticularRestrictionAxiom__Group__0)
		{ after(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEntityScalarDataPropertyUniversalRestrictionAxiom
entryRuleEntityScalarDataPropertyUniversalRestrictionAxiom
:
{ before(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomRule()); }
	 ruleEntityScalarDataPropertyUniversalRestrictionAxiom
{ after(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomRule()); } 
	 EOF 
;

// Rule EntityScalarDataPropertyUniversalRestrictionAxiom
ruleEntityScalarDataPropertyUniversalRestrictionAxiom 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getGroup()); }
		(rule__EntityScalarDataPropertyUniversalRestrictionAxiom__Group__0)
		{ after(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBinaryScalarRestriction
entryRuleBinaryScalarRestriction
:
{ before(grammarAccess.getBinaryScalarRestrictionRule()); }
	 ruleBinaryScalarRestriction
{ after(grammarAccess.getBinaryScalarRestrictionRule()); } 
	 EOF 
;

// Rule BinaryScalarRestriction
ruleBinaryScalarRestriction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBinaryScalarRestrictionAccess().getGroup()); }
		(rule__BinaryScalarRestriction__Group__0)
		{ after(grammarAccess.getBinaryScalarRestrictionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIRIScalarRestriction
entryRuleIRIScalarRestriction
:
{ before(grammarAccess.getIRIScalarRestrictionRule()); }
	 ruleIRIScalarRestriction
{ after(grammarAccess.getIRIScalarRestrictionRule()); } 
	 EOF 
;

// Rule IRIScalarRestriction
ruleIRIScalarRestriction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIRIScalarRestrictionAccess().getGroup()); }
		(rule__IRIScalarRestriction__Group__0)
		{ after(grammarAccess.getIRIScalarRestrictionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNumericScalarRestriction
entryRuleNumericScalarRestriction
:
{ before(grammarAccess.getNumericScalarRestrictionRule()); }
	 ruleNumericScalarRestriction
{ after(grammarAccess.getNumericScalarRestrictionRule()); } 
	 EOF 
;

// Rule NumericScalarRestriction
ruleNumericScalarRestriction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNumericScalarRestrictionAccess().getGroup()); }
		(rule__NumericScalarRestriction__Group__0)
		{ after(grammarAccess.getNumericScalarRestrictionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePlainLiteralScalarRestriction
entryRulePlainLiteralScalarRestriction
:
{ before(grammarAccess.getPlainLiteralScalarRestrictionRule()); }
	 rulePlainLiteralScalarRestriction
{ after(grammarAccess.getPlainLiteralScalarRestrictionRule()); } 
	 EOF 
;

// Rule PlainLiteralScalarRestriction
rulePlainLiteralScalarRestriction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPlainLiteralScalarRestrictionAccess().getGroup()); }
		(rule__PlainLiteralScalarRestriction__Group__0)
		{ after(grammarAccess.getPlainLiteralScalarRestrictionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleScalarOneOfRestriction
entryRuleScalarOneOfRestriction
:
{ before(grammarAccess.getScalarOneOfRestrictionRule()); }
	 ruleScalarOneOfRestriction
{ after(grammarAccess.getScalarOneOfRestrictionRule()); } 
	 EOF 
;

// Rule ScalarOneOfRestriction
ruleScalarOneOfRestriction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getScalarOneOfRestrictionAccess().getGroup()); }
		(rule__ScalarOneOfRestriction__Group__0)
		{ after(grammarAccess.getScalarOneOfRestrictionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleScalarOneOfLiteralAxiom
entryRuleScalarOneOfLiteralAxiom
:
{ before(grammarAccess.getScalarOneOfLiteralAxiomRule()); }
	 ruleScalarOneOfLiteralAxiom
{ after(grammarAccess.getScalarOneOfLiteralAxiomRule()); } 
	 EOF 
;

// Rule ScalarOneOfLiteralAxiom
ruleScalarOneOfLiteralAxiom 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getScalarOneOfLiteralAxiomAccess().getGroup()); }
		(rule__ScalarOneOfLiteralAxiom__Group__0)
		{ after(grammarAccess.getScalarOneOfLiteralAxiomAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStringScalarRestriction
entryRuleStringScalarRestriction
:
{ before(grammarAccess.getStringScalarRestrictionRule()); }
	 ruleStringScalarRestriction
{ after(grammarAccess.getStringScalarRestrictionRule()); } 
	 EOF 
;

// Rule StringScalarRestriction
ruleStringScalarRestriction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStringScalarRestrictionAccess().getGroup()); }
		(rule__StringScalarRestriction__Group__0)
		{ after(grammarAccess.getStringScalarRestrictionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSynonymScalarRestriction
entryRuleSynonymScalarRestriction
:
{ before(grammarAccess.getSynonymScalarRestrictionRule()); }
	 ruleSynonymScalarRestriction
{ after(grammarAccess.getSynonymScalarRestrictionRule()); } 
	 EOF 
;

// Rule SynonymScalarRestriction
ruleSynonymScalarRestriction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSynonymScalarRestrictionAccess().getGroup()); }
		(rule__SynonymScalarRestriction__Group__0)
		{ after(grammarAccess.getSynonymScalarRestrictionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTimeScalarRestriction
entryRuleTimeScalarRestriction
:
{ before(grammarAccess.getTimeScalarRestrictionRule()); }
	 ruleTimeScalarRestriction
{ after(grammarAccess.getTimeScalarRestrictionRule()); } 
	 EOF 
;

// Rule TimeScalarRestriction
ruleTimeScalarRestriction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTimeScalarRestrictionAccess().getGroup()); }
		(rule__TimeScalarRestriction__Group__0)
		{ after(grammarAccess.getTimeScalarRestrictionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDescriptionBox
entryRuleDescriptionBox
:
{ before(grammarAccess.getDescriptionBoxRule()); }
	 ruleDescriptionBox
{ after(grammarAccess.getDescriptionBoxRule()); } 
	 EOF 
;

// Rule DescriptionBox
ruleDescriptionBox 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDescriptionBoxAccess().getGroup()); }
		(rule__DescriptionBox__Group__0)
		{ after(grammarAccess.getDescriptionBoxAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDescriptionBoxExtendsClosedWorldDefinitions
entryRuleDescriptionBoxExtendsClosedWorldDefinitions
:
{ before(grammarAccess.getDescriptionBoxExtendsClosedWorldDefinitionsRule()); }
	 ruleDescriptionBoxExtendsClosedWorldDefinitions
{ after(grammarAccess.getDescriptionBoxExtendsClosedWorldDefinitionsRule()); } 
	 EOF 
;

// Rule DescriptionBoxExtendsClosedWorldDefinitions
ruleDescriptionBoxExtendsClosedWorldDefinitions 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDescriptionBoxExtendsClosedWorldDefinitionsAccess().getGroup()); }
		(rule__DescriptionBoxExtendsClosedWorldDefinitions__Group__0)
		{ after(grammarAccess.getDescriptionBoxExtendsClosedWorldDefinitionsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDescriptionBoxRefinement
entryRuleDescriptionBoxRefinement
:
{ before(grammarAccess.getDescriptionBoxRefinementRule()); }
	 ruleDescriptionBoxRefinement
{ after(grammarAccess.getDescriptionBoxRefinementRule()); } 
	 EOF 
;

// Rule DescriptionBoxRefinement
ruleDescriptionBoxRefinement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDescriptionBoxRefinementAccess().getGroup()); }
		(rule__DescriptionBoxRefinement__Group__0)
		{ after(grammarAccess.getDescriptionBoxRefinementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleScalarDataPropertyValue
entryRuleScalarDataPropertyValue
:
{ before(grammarAccess.getScalarDataPropertyValueRule()); }
	 ruleScalarDataPropertyValue
{ after(grammarAccess.getScalarDataPropertyValueRule()); } 
	 EOF 
;

// Rule ScalarDataPropertyValue
ruleScalarDataPropertyValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getScalarDataPropertyValueAccess().getGroup()); }
		(rule__ScalarDataPropertyValue__Group__0)
		{ after(grammarAccess.getScalarDataPropertyValueAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStructuredDataPropertyValue
entryRuleStructuredDataPropertyValue
:
{ before(grammarAccess.getStructuredDataPropertyValueRule()); }
	 ruleStructuredDataPropertyValue
{ after(grammarAccess.getStructuredDataPropertyValueRule()); } 
	 EOF 
;

// Rule StructuredDataPropertyValue
ruleStructuredDataPropertyValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStructuredDataPropertyValueAccess().getGroup()); }
		(rule__StructuredDataPropertyValue__Group__0)
		{ after(grammarAccess.getStructuredDataPropertyValueAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDataStructureTuple
entryRuleDataStructureTuple
:
{ before(grammarAccess.getDataStructureTupleRule()); }
	 ruleDataStructureTuple
{ after(grammarAccess.getDataStructureTupleRule()); } 
	 EOF 
;

// Rule DataStructureTuple
ruleDataStructureTuple 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDataStructureTupleAccess().getGroup()); }
		(rule__DataStructureTuple__Group__0)
		{ after(grammarAccess.getDataStructureTupleAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConceptInstance
entryRuleConceptInstance
:
{ before(grammarAccess.getConceptInstanceRule()); }
	 ruleConceptInstance
{ after(grammarAccess.getConceptInstanceRule()); } 
	 EOF 
;

// Rule ConceptInstance
ruleConceptInstance 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConceptInstanceAccess().getGroup()); }
		(rule__ConceptInstance__Group__0)
		{ after(grammarAccess.getConceptInstanceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleReifiedRelationshipInstance
entryRuleReifiedRelationshipInstance
:
{ before(grammarAccess.getReifiedRelationshipInstanceRule()); }
	 ruleReifiedRelationshipInstance
{ after(grammarAccess.getReifiedRelationshipInstanceRule()); } 
	 EOF 
;

// Rule ReifiedRelationshipInstance
ruleReifiedRelationshipInstance 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getReifiedRelationshipInstanceAccess().getGroup()); }
		(rule__ReifiedRelationshipInstance__Group__0)
		{ after(grammarAccess.getReifiedRelationshipInstanceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleReifiedRelationshipInstanceDomain
entryRuleReifiedRelationshipInstanceDomain
:
{ before(grammarAccess.getReifiedRelationshipInstanceDomainRule()); }
	 ruleReifiedRelationshipInstanceDomain
{ after(grammarAccess.getReifiedRelationshipInstanceDomainRule()); } 
	 EOF 
;

// Rule ReifiedRelationshipInstanceDomain
ruleReifiedRelationshipInstanceDomain 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getReifiedRelationshipInstanceDomainAccess().getGroup()); }
		(rule__ReifiedRelationshipInstanceDomain__Group__0)
		{ after(grammarAccess.getReifiedRelationshipInstanceDomainAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleReifiedRelationshipInstanceRange
entryRuleReifiedRelationshipInstanceRange
:
{ before(grammarAccess.getReifiedRelationshipInstanceRangeRule()); }
	 ruleReifiedRelationshipInstanceRange
{ after(grammarAccess.getReifiedRelationshipInstanceRangeRule()); } 
	 EOF 
;

// Rule ReifiedRelationshipInstanceRange
ruleReifiedRelationshipInstanceRange 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getReifiedRelationshipInstanceRangeAccess().getGroup()); }
		(rule__ReifiedRelationshipInstanceRange__Group__0)
		{ after(grammarAccess.getReifiedRelationshipInstanceRangeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleUnreifiedRelationshipInstanceTuple
entryRuleUnreifiedRelationshipInstanceTuple
:
{ before(grammarAccess.getUnreifiedRelationshipInstanceTupleRule()); }
	 ruleUnreifiedRelationshipInstanceTuple
{ after(grammarAccess.getUnreifiedRelationshipInstanceTupleRule()); } 
	 EOF 
;

// Rule UnreifiedRelationshipInstanceTuple
ruleUnreifiedRelationshipInstanceTuple 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getGroup()); }
		(rule__UnreifiedRelationshipInstanceTuple__Group__0)
		{ after(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleReference
entryRuleReference
:
{ before(grammarAccess.getReferenceRule()); }
	 ruleReference
{ after(grammarAccess.getReferenceRule()); } 
	 EOF 
;

// Rule Reference
ruleReference 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getReferenceAccess().getAlternatives()); }
		(rule__Reference__Alternatives)
		{ after(grammarAccess.getReferenceAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQNAME
entryRuleQNAME
:
{ before(grammarAccess.getQNAMERule()); }
	 ruleQNAME
{ after(grammarAccess.getQNAMERule()); } 
	 EOF 
;

// Rule QNAME
ruleQNAME 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQNAMEAccess().getAlternatives()); }
		(rule__QNAME__Alternatives)
		{ after(grammarAccess.getQNAMEAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleABBREV_IRI
entryRuleABBREV_IRI
:
{ before(grammarAccess.getABBREV_IRIRule()); }
	 ruleABBREV_IRI
{ after(grammarAccess.getABBREV_IRIRule()); } 
	 EOF 
;

// Rule ABBREV_IRI
ruleABBREV_IRI 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getABBREV_IRIAccess().getGroup()); }
		(rule__ABBREV_IRI__Group__0)
		{ after(grammarAccess.getABBREV_IRIAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleValidID
entryRuleValidID
:
{ before(grammarAccess.getValidIDRule()); }
	 ruleValidID
{ after(grammarAccess.getValidIDRule()); } 
	 EOF 
;

// Rule ValidID
ruleValidID 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); }
		RULE_ID
		{ after(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule TerminologyGraphKind
ruleTerminologyGraphKind
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTerminologyGraphKindAccess().getAlternatives()); }
		(rule__TerminologyGraphKind__Alternatives)
		{ after(grammarAccess.getTerminologyGraphKindAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule DescriptionKind
ruleDescriptionKind
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDescriptionKindAccess().getAlternatives()); }
		(rule__DescriptionKind__Alternatives)
		{ after(grammarAccess.getDescriptionKindAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyExtent__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTerminologyExtentAccess().getAnnotationPropertiesAssignment_1_0()); }
		(rule__TerminologyExtent__AnnotationPropertiesAssignment_1_0)
		{ after(grammarAccess.getTerminologyExtentAccess().getAnnotationPropertiesAssignment_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getTerminologyExtentAccess().getTerminologyGraphsAssignment_1_1()); }
		(rule__TerminologyExtent__TerminologyGraphsAssignment_1_1)
		{ after(grammarAccess.getTerminologyExtentAccess().getTerminologyGraphsAssignment_1_1()); }
	)
	|
	(
		{ before(grammarAccess.getTerminologyExtentAccess().getBundlesAssignment_1_2()); }
		(rule__TerminologyExtent__BundlesAssignment_1_2)
		{ after(grammarAccess.getTerminologyExtentAccess().getBundlesAssignment_1_2()); }
	)
	|
	(
		{ before(grammarAccess.getTerminologyExtentAccess().getDescriptionsAssignment_1_3()); }
		(rule__TerminologyExtent__DescriptionsAssignment_1_3)
		{ after(grammarAccess.getTerminologyExtentAccess().getDescriptionsAssignment_1_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyGraph__Alternatives_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTerminologyGraphAccess().getAnnotationsAssignment_4_0()); }
		(rule__TerminologyGraph__AnnotationsAssignment_4_0)
		{ after(grammarAccess.getTerminologyGraphAccess().getAnnotationsAssignment_4_0()); }
	)
	|
	(
		{ before(grammarAccess.getTerminologyGraphAccess().getTerminologyBoxAxiomsAssignment_4_1()); }
		(rule__TerminologyGraph__TerminologyBoxAxiomsAssignment_4_1)
		{ after(grammarAccess.getTerminologyGraphAccess().getTerminologyBoxAxiomsAssignment_4_1()); }
	)
	|
	(
		{ before(grammarAccess.getTerminologyGraphAccess().getBoxStatementsAssignment_4_2()); }
		(rule__TerminologyGraph__BoxStatementsAssignment_4_2)
		{ after(grammarAccess.getTerminologyGraphAccess().getBoxStatementsAssignment_4_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__Alternatives_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBundleAccess().getAnnotationsAssignment_4_0()); }
		(rule__Bundle__AnnotationsAssignment_4_0)
		{ after(grammarAccess.getBundleAccess().getAnnotationsAssignment_4_0()); }
	)
	|
	(
		{ before(grammarAccess.getBundleAccess().getTerminologyBoxAxiomsAssignment_4_1()); }
		(rule__Bundle__TerminologyBoxAxiomsAssignment_4_1)
		{ after(grammarAccess.getBundleAccess().getTerminologyBoxAxiomsAssignment_4_1()); }
	)
	|
	(
		{ before(grammarAccess.getBundleAccess().getBoxStatementsAssignment_4_2()); }
		(rule__Bundle__BoxStatementsAssignment_4_2)
		{ after(grammarAccess.getBundleAccess().getBoxStatementsAssignment_4_2()); }
	)
	|
	(
		{ before(grammarAccess.getBundleAccess().getBundleStatementsAssignment_4_3()); }
		(rule__Bundle__BundleStatementsAssignment_4_3)
		{ after(grammarAccess.getBundleAccess().getBundleStatementsAssignment_4_3()); }
	)
	|
	(
		{ before(grammarAccess.getBundleAccess().getTerminologyBundleAxiomsAssignment_4_4()); }
		(rule__Bundle__TerminologyBundleAxiomsAssignment_4_4)
		{ after(grammarAccess.getBundleAccess().getTerminologyBundleAxiomsAssignment_4_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyBoxAxiom__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTerminologyBoxAxiomAccess().getConceptDesignationTerminologyAxiomParserRuleCall_0()); }
		ruleConceptDesignationTerminologyAxiom
		{ after(grammarAccess.getTerminologyBoxAxiomAccess().getConceptDesignationTerminologyAxiomParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getTerminologyBoxAxiomAccess().getTerminologyExtensionAxiomParserRuleCall_1()); }
		ruleTerminologyExtensionAxiom
		{ after(grammarAccess.getTerminologyBoxAxiomAccess().getTerminologyExtensionAxiomParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getTerminologyBoxAxiomAccess().getTerminologyNestingAxiomParserRuleCall_2()); }
		ruleTerminologyNestingAxiom
		{ after(grammarAccess.getTerminologyBoxAxiomAccess().getTerminologyNestingAxiomParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyBoxStatement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTerminologyBoxStatementAccess().getAxiomParserRuleCall_0()); }
		ruleAxiom
		{ after(grammarAccess.getTerminologyBoxStatementAccess().getAxiomParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getTerminologyBoxStatementAccess().getTermParserRuleCall_1()); }
		ruleTerm
		{ after(grammarAccess.getTerminologyBoxStatementAccess().getTermParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Term__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTermAccess().getAtomicEntityParserRuleCall_0()); }
		ruleAtomicEntity
		{ after(grammarAccess.getTermAccess().getAtomicEntityParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getTermAccess().getEntityRelationshipParserRuleCall_1()); }
		ruleEntityRelationship
		{ after(grammarAccess.getTermAccess().getEntityRelationshipParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getTermAccess().getDatatypeParserRuleCall_2()); }
		ruleDatatype
		{ after(grammarAccess.getTermAccess().getDatatypeParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getTermAccess().getDataRelationshipParserRuleCall_3()); }
		ruleDataRelationship
		{ after(grammarAccess.getTermAccess().getDataRelationshipParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicEntity__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicEntityAccess().getAspectParserRuleCall_0()); }
		ruleAspect
		{ after(grammarAccess.getAtomicEntityAccess().getAspectParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAtomicEntityAccess().getConceptParserRuleCall_1()); }
		ruleConcept
		{ after(grammarAccess.getAtomicEntityAccess().getConceptParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityRelationship__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityRelationshipAccess().getReifiedRelationshipParserRuleCall_0()); }
		ruleReifiedRelationship
		{ after(grammarAccess.getEntityRelationshipAccess().getReifiedRelationshipParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEntityRelationshipAccess().getUnreifiedRelationshipParserRuleCall_1()); }
		ruleUnreifiedRelationship
		{ after(grammarAccess.getEntityRelationshipAccess().getUnreifiedRelationshipParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Datatype__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDatatypeAccess().getScalarDataRangeParserRuleCall_0()); }
		ruleScalarDataRange
		{ after(grammarAccess.getDatatypeAccess().getScalarDataRangeParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getDatatypeAccess().getStructureParserRuleCall_1()); }
		ruleStructure
		{ after(grammarAccess.getDatatypeAccess().getStructureParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarDataRange__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScalarDataRangeAccess().getScalarParserRuleCall_0()); }
		ruleScalar
		{ after(grammarAccess.getScalarDataRangeAccess().getScalarParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getScalarDataRangeAccess().getRestrictedDataRangeParserRuleCall_1()); }
		ruleRestrictedDataRange
		{ after(grammarAccess.getScalarDataRangeAccess().getRestrictedDataRangeParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RestrictedDataRange__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRestrictedDataRangeAccess().getBinaryScalarRestrictionParserRuleCall_0()); }
		ruleBinaryScalarRestriction
		{ after(grammarAccess.getRestrictedDataRangeAccess().getBinaryScalarRestrictionParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getRestrictedDataRangeAccess().getIRIScalarRestrictionParserRuleCall_1()); }
		ruleIRIScalarRestriction
		{ after(grammarAccess.getRestrictedDataRangeAccess().getIRIScalarRestrictionParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getRestrictedDataRangeAccess().getNumericScalarRestrictionParserRuleCall_2()); }
		ruleNumericScalarRestriction
		{ after(grammarAccess.getRestrictedDataRangeAccess().getNumericScalarRestrictionParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getRestrictedDataRangeAccess().getPlainLiteralScalarRestrictionParserRuleCall_3()); }
		rulePlainLiteralScalarRestriction
		{ after(grammarAccess.getRestrictedDataRangeAccess().getPlainLiteralScalarRestrictionParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getRestrictedDataRangeAccess().getScalarOneOfRestrictionParserRuleCall_4()); }
		ruleScalarOneOfRestriction
		{ after(grammarAccess.getRestrictedDataRangeAccess().getScalarOneOfRestrictionParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getRestrictedDataRangeAccess().getStringScalarRestrictionParserRuleCall_5()); }
		ruleStringScalarRestriction
		{ after(grammarAccess.getRestrictedDataRangeAccess().getStringScalarRestrictionParserRuleCall_5()); }
	)
	|
	(
		{ before(grammarAccess.getRestrictedDataRangeAccess().getSynonymScalarRestrictionParserRuleCall_6()); }
		ruleSynonymScalarRestriction
		{ after(grammarAccess.getRestrictedDataRangeAccess().getSynonymScalarRestrictionParserRuleCall_6()); }
	)
	|
	(
		{ before(grammarAccess.getRestrictedDataRangeAccess().getTimeScalarRestrictionParserRuleCall_7()); }
		ruleTimeScalarRestriction
		{ after(grammarAccess.getRestrictedDataRangeAccess().getTimeScalarRestrictionParserRuleCall_7()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataRelationship__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataRelationshipAccess().getEntityStructuredDataPropertyParserRuleCall_0()); }
		ruleEntityStructuredDataProperty
		{ after(grammarAccess.getDataRelationshipAccess().getEntityStructuredDataPropertyParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getDataRelationshipAccess().getEntityScalarDataPropertyParserRuleCall_1()); }
		ruleEntityScalarDataProperty
		{ after(grammarAccess.getDataRelationshipAccess().getEntityScalarDataPropertyParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getDataRelationshipAccess().getStructuredDataPropertyParserRuleCall_2()); }
		ruleStructuredDataProperty
		{ after(grammarAccess.getDataRelationshipAccess().getStructuredDataPropertyParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getDataRelationshipAccess().getScalarDataPropertyParserRuleCall_3()); }
		ruleScalarDataProperty
		{ after(grammarAccess.getDataRelationshipAccess().getScalarDataPropertyParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Axiom__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAxiomAccess().getScalarOneOfLiteralAxiomParserRuleCall_0()); }
		ruleScalarOneOfLiteralAxiom
		{ after(grammarAccess.getAxiomAccess().getScalarOneOfLiteralAxiomParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAxiomAccess().getTermAxiomParserRuleCall_1()); }
		ruleTermAxiom
		{ after(grammarAccess.getAxiomAccess().getTermAxiomParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TermAxiom__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTermAxiomAccess().getEntityRestrictionAxiomParserRuleCall_0()); }
		ruleEntityRestrictionAxiom
		{ after(grammarAccess.getTermAxiomAccess().getEntityRestrictionAxiomParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getTermAxiomAccess().getEntityScalarDataPropertyRestrictionAxiomParserRuleCall_1()); }
		ruleEntityScalarDataPropertyRestrictionAxiom
		{ after(grammarAccess.getTermAxiomAccess().getEntityScalarDataPropertyRestrictionAxiomParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getTermAxiomAccess().getSpecializationAxiomParserRuleCall_2()); }
		ruleSpecializationAxiom
		{ after(grammarAccess.getTermAxiomAccess().getSpecializationAxiomParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityRestrictionAxiom__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityRestrictionAxiomAccess().getEntityExistentialRestrictionAxiomParserRuleCall_0()); }
		ruleEntityExistentialRestrictionAxiom
		{ after(grammarAccess.getEntityRestrictionAxiomAccess().getEntityExistentialRestrictionAxiomParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEntityRestrictionAxiomAccess().getEntityUniversalRestrictionAxiomParserRuleCall_1()); }
		ruleEntityUniversalRestrictionAxiom
		{ after(grammarAccess.getEntityRestrictionAxiomAccess().getEntityUniversalRestrictionAxiomParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyRestrictionAxiom__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityScalarDataPropertyRestrictionAxiomAccess().getEntityScalarDataPropertyExistentialRestrictionAxiomParserRuleCall_0()); }
		ruleEntityScalarDataPropertyExistentialRestrictionAxiom
		{ after(grammarAccess.getEntityScalarDataPropertyRestrictionAxiomAccess().getEntityScalarDataPropertyExistentialRestrictionAxiomParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEntityScalarDataPropertyRestrictionAxiomAccess().getEntityScalarDataPropertyParticularRestrictionAxiomParserRuleCall_1()); }
		ruleEntityScalarDataPropertyParticularRestrictionAxiom
		{ after(grammarAccess.getEntityScalarDataPropertyRestrictionAxiomAccess().getEntityScalarDataPropertyParticularRestrictionAxiomParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getEntityScalarDataPropertyRestrictionAxiomAccess().getEntityScalarDataPropertyUniversalRestrictionAxiomParserRuleCall_2()); }
		ruleEntityScalarDataPropertyUniversalRestrictionAxiom
		{ after(grammarAccess.getEntityScalarDataPropertyRestrictionAxiomAccess().getEntityScalarDataPropertyUniversalRestrictionAxiomParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecializationAxiom__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpecializationAxiomAccess().getConceptSpecializationAxiomParserRuleCall_0()); }
		ruleConceptSpecializationAxiom
		{ after(grammarAccess.getSpecializationAxiomAccess().getConceptSpecializationAxiomParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getSpecializationAxiomAccess().getAspectSpecializationAxiomParserRuleCall_1()); }
		ruleAspectSpecializationAxiom
		{ after(grammarAccess.getSpecializationAxiomAccess().getAspectSpecializationAxiomParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getSpecializationAxiomAccess().getReifiedRelationshipSpecializationAxiomParserRuleCall_2()); }
		ruleReifiedRelationshipSpecializationAxiom
		{ after(grammarAccess.getSpecializationAxiomAccess().getReifiedRelationshipSpecializationAxiomParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyBundleStatement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTerminologyBundleStatementAccess().getAnonymousConceptTaxonomyAxiomParserRuleCall_0()); }
		ruleAnonymousConceptTaxonomyAxiom
		{ after(grammarAccess.getTerminologyBundleStatementAccess().getAnonymousConceptTaxonomyAxiomParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getTerminologyBundleStatementAccess().getRootConceptTaxonomyAxiomParserRuleCall_1()); }
		ruleRootConceptTaxonomyAxiom
		{ after(grammarAccess.getTerminologyBundleStatementAccess().getRootConceptTaxonomyAxiomParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getTerminologyBundleStatementAccess().getSpecificDisjointConceptAxiomParserRuleCall_2()); }
		ruleSpecificDisjointConceptAxiom
		{ after(grammarAccess.getTerminologyBundleStatementAccess().getSpecificDisjointConceptAxiomParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DescriptionBox__Alternatives_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDescriptionBoxAccess().getAnnotationsAssignment_4_0()); }
		(rule__DescriptionBox__AnnotationsAssignment_4_0)
		{ after(grammarAccess.getDescriptionBoxAccess().getAnnotationsAssignment_4_0()); }
	)
	|
	(
		{ before(grammarAccess.getDescriptionBoxAccess().getClosedWorldDefinitionsAssignment_4_1()); }
		(rule__DescriptionBox__ClosedWorldDefinitionsAssignment_4_1)
		{ after(grammarAccess.getDescriptionBoxAccess().getClosedWorldDefinitionsAssignment_4_1()); }
	)
	|
	(
		{ before(grammarAccess.getDescriptionBoxAccess().getDescriptionBoxRefinementsAssignment_4_2()); }
		(rule__DescriptionBox__DescriptionBoxRefinementsAssignment_4_2)
		{ after(grammarAccess.getDescriptionBoxAccess().getDescriptionBoxRefinementsAssignment_4_2()); }
	)
	|
	(
		{ before(grammarAccess.getDescriptionBoxAccess().getConceptInstancesAssignment_4_3()); }
		(rule__DescriptionBox__ConceptInstancesAssignment_4_3)
		{ after(grammarAccess.getDescriptionBoxAccess().getConceptInstancesAssignment_4_3()); }
	)
	|
	(
		{ before(grammarAccess.getDescriptionBoxAccess().getReifiedRelationshipInstancesAssignment_4_4()); }
		(rule__DescriptionBox__ReifiedRelationshipInstancesAssignment_4_4)
		{ after(grammarAccess.getDescriptionBoxAccess().getReifiedRelationshipInstancesAssignment_4_4()); }
	)
	|
	(
		{ before(grammarAccess.getDescriptionBoxAccess().getReifiedRelationshipInstanceDomainsAssignment_4_5()); }
		(rule__DescriptionBox__ReifiedRelationshipInstanceDomainsAssignment_4_5)
		{ after(grammarAccess.getDescriptionBoxAccess().getReifiedRelationshipInstanceDomainsAssignment_4_5()); }
	)
	|
	(
		{ before(grammarAccess.getDescriptionBoxAccess().getReifiedRelationshipInstanceRangesAssignment_4_6()); }
		(rule__DescriptionBox__ReifiedRelationshipInstanceRangesAssignment_4_6)
		{ after(grammarAccess.getDescriptionBoxAccess().getReifiedRelationshipInstanceRangesAssignment_4_6()); }
	)
	|
	(
		{ before(grammarAccess.getDescriptionBoxAccess().getUnreifiedRelationshipInstanceTuplesAssignment_4_7()); }
		(rule__DescriptionBox__UnreifiedRelationshipInstanceTuplesAssignment_4_7)
		{ after(grammarAccess.getDescriptionBoxAccess().getUnreifiedRelationshipInstanceTuplesAssignment_4_7()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Reference__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReferenceAccess().getIRITerminalRuleCall_0()); }
		RULE_IRI
		{ after(grammarAccess.getReferenceAccess().getIRITerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getReferenceAccess().getQNAMEParserRuleCall_1()); }
		ruleQNAME
		{ after(grammarAccess.getReferenceAccess().getQNAMEParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__QNAME__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQNAMEAccess().getABBREV_IRIParserRuleCall_0()); }
		ruleABBREV_IRI
		{ after(grammarAccess.getQNAMEAccess().getABBREV_IRIParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getQNAMEAccess().getValidIDParserRuleCall_1()); }
		ruleValidID
		{ after(grammarAccess.getQNAMEAccess().getValidIDParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyGraphKind__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTerminologyGraphKindAccess().getOpenWorldDefinitionsEnumLiteralDeclaration_0()); }
		('open')
		{ after(grammarAccess.getTerminologyGraphKindAccess().getOpenWorldDefinitionsEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getTerminologyGraphKindAccess().getClosedWorldDesignationsEnumLiteralDeclaration_1()); }
		('closed')
		{ after(grammarAccess.getTerminologyGraphKindAccess().getClosedWorldDesignationsEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DescriptionKind__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDescriptionKindAccess().getFinalEnumLiteralDeclaration_0()); }
		('final')
		{ after(grammarAccess.getDescriptionKindAccess().getFinalEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getDescriptionKindAccess().getPartialEnumLiteralDeclaration_1()); }
		('partial')
		{ after(grammarAccess.getDescriptionKindAccess().getPartialEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyExtent__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TerminologyExtent__Group__0__Impl
	rule__TerminologyExtent__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyExtent__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminologyExtentAccess().getTerminologyExtentAction_0()); }
	()
	{ after(grammarAccess.getTerminologyExtentAccess().getTerminologyExtentAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyExtent__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TerminologyExtent__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyExtent__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminologyExtentAccess().getAlternatives_1()); }
	(rule__TerminologyExtent__Alternatives_1)*
	{ after(grammarAccess.getTerminologyExtentAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AnnotationProperty__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnnotationProperty__Group__0__Impl
	rule__AnnotationProperty__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationProperty__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationPropertyAccess().getANNOTATION_PROPERTY_TOKENTerminalRuleCall_0()); }
	RULE_ANNOTATION_PROPERTY_TOKEN
	{ after(grammarAccess.getAnnotationPropertyAccess().getANNOTATION_PROPERTY_TOKENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationProperty__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnnotationProperty__Group__1__Impl
	rule__AnnotationProperty__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationProperty__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationPropertyAccess().getAbbrevIRIAssignment_1()); }
	(rule__AnnotationProperty__AbbrevIRIAssignment_1)
	{ after(grammarAccess.getAnnotationPropertyAccess().getAbbrevIRIAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationProperty__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnnotationProperty__Group__2__Impl
	rule__AnnotationProperty__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationProperty__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationPropertyAccess().getEQUALTerminalRuleCall_2()); }
	RULE_EQUAL
	{ after(grammarAccess.getAnnotationPropertyAccess().getEQUALTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationProperty__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnnotationProperty__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationProperty__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationPropertyAccess().getIriAssignment_3()); }
	(rule__AnnotationProperty__IriAssignment_3)
	{ after(grammarAccess.getAnnotationPropertyAccess().getIriAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Annotation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group__0__Impl
	rule__Annotation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getANNOTATION_TOKENTerminalRuleCall_0()); }
	RULE_ANNOTATION_TOKEN
	{ after(grammarAccess.getAnnotationAccess().getANNOTATION_TOKENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group__1__Impl
	rule__Annotation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getPropertyAssignment_1()); }
	(rule__Annotation__PropertyAssignment_1)
	{ after(grammarAccess.getAnnotationAccess().getPropertyAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group__2__Impl
	rule__Annotation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getEQUALTerminalRuleCall_2()); }
	RULE_EQUAL
	{ after(grammarAccess.getAnnotationAccess().getEQUALTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getValueAssignment_3()); }
	(rule__Annotation__ValueAssignment_3)
	{ after(grammarAccess.getAnnotationAccess().getValueAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TerminologyGraph__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TerminologyGraph__Group__0__Impl
	rule__TerminologyGraph__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyGraph__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminologyGraphAccess().getKindAssignment_0()); }
	(rule__TerminologyGraph__KindAssignment_0)
	{ after(grammarAccess.getTerminologyGraphAccess().getKindAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyGraph__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TerminologyGraph__Group__1__Impl
	rule__TerminologyGraph__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyGraph__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminologyGraphAccess().getTERMINOLOGY_GRAPH_TOKENTerminalRuleCall_1()); }
	RULE_TERMINOLOGY_GRAPH_TOKEN
	{ after(grammarAccess.getTerminologyGraphAccess().getTERMINOLOGY_GRAPH_TOKENTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyGraph__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TerminologyGraph__Group__2__Impl
	rule__TerminologyGraph__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyGraph__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminologyGraphAccess().getIriAssignment_2()); }
	(rule__TerminologyGraph__IriAssignment_2)
	{ after(grammarAccess.getTerminologyGraphAccess().getIriAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyGraph__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TerminologyGraph__Group__3__Impl
	rule__TerminologyGraph__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyGraph__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminologyGraphAccess().getLCURLYTerminalRuleCall_3()); }
	RULE_LCURLY
	{ after(grammarAccess.getTerminologyGraphAccess().getLCURLYTerminalRuleCall_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyGraph__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TerminologyGraph__Group__4__Impl
	rule__TerminologyGraph__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyGraph__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminologyGraphAccess().getAlternatives_4()); }
	(rule__TerminologyGraph__Alternatives_4)*
	{ after(grammarAccess.getTerminologyGraphAccess().getAlternatives_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyGraph__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TerminologyGraph__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyGraph__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminologyGraphAccess().getRCURLYTerminalRuleCall_5()); }
	RULE_RCURLY
	{ after(grammarAccess.getTerminologyGraphAccess().getRCURLYTerminalRuleCall_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Bundle__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Bundle__Group__0__Impl
	rule__Bundle__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBundleAccess().getKindAssignment_0()); }
	(rule__Bundle__KindAssignment_0)
	{ after(grammarAccess.getBundleAccess().getKindAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Bundle__Group__1__Impl
	rule__Bundle__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBundleAccess().getBUNDLE_TOKENTerminalRuleCall_1()); }
	RULE_BUNDLE_TOKEN
	{ after(grammarAccess.getBundleAccess().getBUNDLE_TOKENTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Bundle__Group__2__Impl
	rule__Bundle__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBundleAccess().getIriAssignment_2()); }
	(rule__Bundle__IriAssignment_2)
	{ after(grammarAccess.getBundleAccess().getIriAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Bundle__Group__3__Impl
	rule__Bundle__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBundleAccess().getLCURLYTerminalRuleCall_3()); }
	RULE_LCURLY
	{ after(grammarAccess.getBundleAccess().getLCURLYTerminalRuleCall_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Bundle__Group__4__Impl
	rule__Bundle__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBundleAccess().getAlternatives_4()); }
	(rule__Bundle__Alternatives_4)*
	{ after(grammarAccess.getBundleAccess().getAlternatives_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Bundle__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBundleAccess().getRCURLYTerminalRuleCall_5()); }
	RULE_RCURLY
	{ after(grammarAccess.getBundleAccess().getRCURLYTerminalRuleCall_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Aspect__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Aspect__Group__0__Impl
	rule__Aspect__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Aspect__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAspectAccess().getASPECT_TOKENTerminalRuleCall_0()); }
	RULE_ASPECT_TOKEN
	{ after(grammarAccess.getAspectAccess().getASPECT_TOKENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Aspect__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Aspect__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Aspect__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAspectAccess().getNameAssignment_1()); }
	(rule__Aspect__NameAssignment_1)
	{ after(grammarAccess.getAspectAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Concept__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Concept__Group__0__Impl
	rule__Concept__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Concept__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptAccess().getIsAbstractAssignment_0()); }
	(rule__Concept__IsAbstractAssignment_0)?
	{ after(grammarAccess.getConceptAccess().getIsAbstractAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Concept__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Concept__Group__1__Impl
	rule__Concept__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Concept__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptAccess().getCONCEPT_TOKENTerminalRuleCall_1()); }
	RULE_CONCEPT_TOKEN
	{ after(grammarAccess.getConceptAccess().getCONCEPT_TOKENTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Concept__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Concept__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Concept__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptAccess().getNameAssignment_2()); }
	(rule__Concept__NameAssignment_2)
	{ after(grammarAccess.getConceptAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ReifiedRelationship__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationship__Group__0__Impl
	rule__ReifiedRelationship__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipAccess().getIsAbstractAssignment_0()); }
	(rule__ReifiedRelationship__IsAbstractAssignment_0)?
	{ after(grammarAccess.getReifiedRelationshipAccess().getIsAbstractAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationship__Group__1__Impl
	rule__ReifiedRelationship__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipAccess().getREIFIED_RELATIONSHIP_TOKENTerminalRuleCall_1()); }
	RULE_REIFIED_RELATIONSHIP_TOKEN
	{ after(grammarAccess.getReifiedRelationshipAccess().getREIFIED_RELATIONSHIP_TOKENTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationship__Group__2__Impl
	rule__ReifiedRelationship__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipAccess().getNameAssignment_2()); }
	(rule__ReifiedRelationship__NameAssignment_2)
	{ after(grammarAccess.getReifiedRelationshipAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationship__Group__3__Impl
	rule__ReifiedRelationship__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipAccess().getLCURLYTerminalRuleCall_3()); }
	RULE_LCURLY
	{ after(grammarAccess.getReifiedRelationshipAccess().getLCURLYTerminalRuleCall_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationship__Group__4__Impl
	rule__ReifiedRelationship__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipAccess().getIsFunctionalAssignment_4()); }
	(rule__ReifiedRelationship__IsFunctionalAssignment_4)?
	{ after(grammarAccess.getReifiedRelationshipAccess().getIsFunctionalAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationship__Group__5__Impl
	rule__ReifiedRelationship__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipAccess().getIsInverseFunctionalAssignment_5()); }
	(rule__ReifiedRelationship__IsInverseFunctionalAssignment_5)?
	{ after(grammarAccess.getReifiedRelationshipAccess().getIsInverseFunctionalAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationship__Group__6__Impl
	rule__ReifiedRelationship__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipAccess().getIsEssentialAssignment_6()); }
	(rule__ReifiedRelationship__IsEssentialAssignment_6)?
	{ after(grammarAccess.getReifiedRelationshipAccess().getIsEssentialAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationship__Group__7__Impl
	rule__ReifiedRelationship__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipAccess().getIsInverseEssentialAssignment_7()); }
	(rule__ReifiedRelationship__IsInverseEssentialAssignment_7)?
	{ after(grammarAccess.getReifiedRelationshipAccess().getIsInverseEssentialAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationship__Group__8__Impl
	rule__ReifiedRelationship__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipAccess().getIsSymmetricAssignment_8()); }
	(rule__ReifiedRelationship__IsSymmetricAssignment_8)?
	{ after(grammarAccess.getReifiedRelationshipAccess().getIsSymmetricAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationship__Group__9__Impl
	rule__ReifiedRelationship__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipAccess().getIsAsymmetricAssignment_9()); }
	(rule__ReifiedRelationship__IsAsymmetricAssignment_9)?
	{ after(grammarAccess.getReifiedRelationshipAccess().getIsAsymmetricAssignment_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationship__Group__10__Impl
	rule__ReifiedRelationship__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipAccess().getIsReflexiveAssignment_10()); }
	(rule__ReifiedRelationship__IsReflexiveAssignment_10)?
	{ after(grammarAccess.getReifiedRelationshipAccess().getIsReflexiveAssignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationship__Group__11__Impl
	rule__ReifiedRelationship__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipAccess().getIsIrreflexiveAssignment_11()); }
	(rule__ReifiedRelationship__IsIrreflexiveAssignment_11)?
	{ after(grammarAccess.getReifiedRelationshipAccess().getIsIrreflexiveAssignment_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationship__Group__12__Impl
	rule__ReifiedRelationship__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipAccess().getIsTransitiveAssignment_12()); }
	(rule__ReifiedRelationship__IsTransitiveAssignment_12)?
	{ after(grammarAccess.getReifiedRelationshipAccess().getIsTransitiveAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationship__Group__13__Impl
	rule__ReifiedRelationship__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipAccess().getUNREIFIED_TOKENTerminalRuleCall_13()); }
	RULE_UNREIFIED_TOKEN
	{ after(grammarAccess.getReifiedRelationshipAccess().getUNREIFIED_TOKENTerminalRuleCall_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationship__Group__14__Impl
	rule__ReifiedRelationship__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipAccess().getEQUALTerminalRuleCall_14()); }
	RULE_EQUAL
	{ after(grammarAccess.getReifiedRelationshipAccess().getEQUALTerminalRuleCall_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationship__Group__15__Impl
	rule__ReifiedRelationship__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipAccess().getUnreifiedPropertyNameAssignment_15()); }
	(rule__ReifiedRelationship__UnreifiedPropertyNameAssignment_15)
	{ after(grammarAccess.getReifiedRelationshipAccess().getUnreifiedPropertyNameAssignment_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationship__Group__16__Impl
	rule__ReifiedRelationship__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipAccess().getGroup_16()); }
	(rule__ReifiedRelationship__Group_16__0)?
	{ after(grammarAccess.getReifiedRelationshipAccess().getGroup_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationship__Group__17__Impl
	rule__ReifiedRelationship__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipAccess().getSOURCE_TOKENTerminalRuleCall_17()); }
	RULE_SOURCE_TOKEN
	{ after(grammarAccess.getReifiedRelationshipAccess().getSOURCE_TOKENTerminalRuleCall_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationship__Group__18__Impl
	rule__ReifiedRelationship__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipAccess().getEQUALTerminalRuleCall_18()); }
	RULE_EQUAL
	{ after(grammarAccess.getReifiedRelationshipAccess().getEQUALTerminalRuleCall_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationship__Group__19__Impl
	rule__ReifiedRelationship__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipAccess().getSourceAssignment_19()); }
	(rule__ReifiedRelationship__SourceAssignment_19)
	{ after(grammarAccess.getReifiedRelationshipAccess().getSourceAssignment_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationship__Group__20__Impl
	rule__ReifiedRelationship__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipAccess().getTARGET_TOKENTerminalRuleCall_20()); }
	RULE_TARGET_TOKEN
	{ after(grammarAccess.getReifiedRelationshipAccess().getTARGET_TOKENTerminalRuleCall_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationship__Group__21__Impl
	rule__ReifiedRelationship__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipAccess().getEQUALTerminalRuleCall_21()); }
	RULE_EQUAL
	{ after(grammarAccess.getReifiedRelationshipAccess().getEQUALTerminalRuleCall_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationship__Group__22__Impl
	rule__ReifiedRelationship__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipAccess().getTargetAssignment_22()); }
	(rule__ReifiedRelationship__TargetAssignment_22)
	{ after(grammarAccess.getReifiedRelationshipAccess().getTargetAssignment_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationship__Group__23__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipAccess().getRCURLYTerminalRuleCall_23()); }
	RULE_RCURLY
	{ after(grammarAccess.getReifiedRelationshipAccess().getRCURLYTerminalRuleCall_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ReifiedRelationship__Group_16__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationship__Group_16__0__Impl
	rule__ReifiedRelationship__Group_16__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group_16__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipAccess().getINVERSE_TOKENTerminalRuleCall_16_0()); }
	RULE_INVERSE_TOKEN
	{ after(grammarAccess.getReifiedRelationshipAccess().getINVERSE_TOKENTerminalRuleCall_16_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group_16__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationship__Group_16__1__Impl
	rule__ReifiedRelationship__Group_16__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group_16__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipAccess().getEQUALTerminalRuleCall_16_1()); }
	RULE_EQUAL
	{ after(grammarAccess.getReifiedRelationshipAccess().getEQUALTerminalRuleCall_16_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group_16__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationship__Group_16__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__Group_16__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipAccess().getUnreifiedInversePropertyNameAssignment_16_2()); }
	(rule__ReifiedRelationship__UnreifiedInversePropertyNameAssignment_16_2)
	{ after(grammarAccess.getReifiedRelationshipAccess().getUnreifiedInversePropertyNameAssignment_16_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__UnreifiedRelationship__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnreifiedRelationship__Group__0__Impl
	rule__UnreifiedRelationship__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnreifiedRelationshipAccess().getUNREIFIED_RELATIONSHIP_TOKENTerminalRuleCall_0()); }
	RULE_UNREIFIED_RELATIONSHIP_TOKEN
	{ after(grammarAccess.getUnreifiedRelationshipAccess().getUNREIFIED_RELATIONSHIP_TOKENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnreifiedRelationship__Group__1__Impl
	rule__UnreifiedRelationship__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnreifiedRelationshipAccess().getNameAssignment_1()); }
	(rule__UnreifiedRelationship__NameAssignment_1)
	{ after(grammarAccess.getUnreifiedRelationshipAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnreifiedRelationship__Group__2__Impl
	rule__UnreifiedRelationship__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnreifiedRelationshipAccess().getLCURLYTerminalRuleCall_2()); }
	RULE_LCURLY
	{ after(grammarAccess.getUnreifiedRelationshipAccess().getLCURLYTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnreifiedRelationship__Group__3__Impl
	rule__UnreifiedRelationship__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnreifiedRelationshipAccess().getIsFunctionalAssignment_3()); }
	(rule__UnreifiedRelationship__IsFunctionalAssignment_3)?
	{ after(grammarAccess.getUnreifiedRelationshipAccess().getIsFunctionalAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnreifiedRelationship__Group__4__Impl
	rule__UnreifiedRelationship__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnreifiedRelationshipAccess().getIsInverseFunctionalAssignment_4()); }
	(rule__UnreifiedRelationship__IsInverseFunctionalAssignment_4)?
	{ after(grammarAccess.getUnreifiedRelationshipAccess().getIsInverseFunctionalAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnreifiedRelationship__Group__5__Impl
	rule__UnreifiedRelationship__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnreifiedRelationshipAccess().getIsEssentialAssignment_5()); }
	(rule__UnreifiedRelationship__IsEssentialAssignment_5)?
	{ after(grammarAccess.getUnreifiedRelationshipAccess().getIsEssentialAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnreifiedRelationship__Group__6__Impl
	rule__UnreifiedRelationship__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnreifiedRelationshipAccess().getIsInverseEssentialAssignment_6()); }
	(rule__UnreifiedRelationship__IsInverseEssentialAssignment_6)?
	{ after(grammarAccess.getUnreifiedRelationshipAccess().getIsInverseEssentialAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnreifiedRelationship__Group__7__Impl
	rule__UnreifiedRelationship__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnreifiedRelationshipAccess().getIsSymmetricAssignment_7()); }
	(rule__UnreifiedRelationship__IsSymmetricAssignment_7)?
	{ after(grammarAccess.getUnreifiedRelationshipAccess().getIsSymmetricAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnreifiedRelationship__Group__8__Impl
	rule__UnreifiedRelationship__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnreifiedRelationshipAccess().getIsAsymmetricAssignment_8()); }
	(rule__UnreifiedRelationship__IsAsymmetricAssignment_8)?
	{ after(grammarAccess.getUnreifiedRelationshipAccess().getIsAsymmetricAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnreifiedRelationship__Group__9__Impl
	rule__UnreifiedRelationship__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnreifiedRelationshipAccess().getIsReflexiveAssignment_9()); }
	(rule__UnreifiedRelationship__IsReflexiveAssignment_9)?
	{ after(grammarAccess.getUnreifiedRelationshipAccess().getIsReflexiveAssignment_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnreifiedRelationship__Group__10__Impl
	rule__UnreifiedRelationship__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnreifiedRelationshipAccess().getIsIrreflexiveAssignment_10()); }
	(rule__UnreifiedRelationship__IsIrreflexiveAssignment_10)?
	{ after(grammarAccess.getUnreifiedRelationshipAccess().getIsIrreflexiveAssignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnreifiedRelationship__Group__11__Impl
	rule__UnreifiedRelationship__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnreifiedRelationshipAccess().getIsTransitiveAssignment_11()); }
	(rule__UnreifiedRelationship__IsTransitiveAssignment_11)?
	{ after(grammarAccess.getUnreifiedRelationshipAccess().getIsTransitiveAssignment_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnreifiedRelationship__Group__12__Impl
	rule__UnreifiedRelationship__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnreifiedRelationshipAccess().getSOURCE_TOKENTerminalRuleCall_12()); }
	RULE_SOURCE_TOKEN
	{ after(grammarAccess.getUnreifiedRelationshipAccess().getSOURCE_TOKENTerminalRuleCall_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnreifiedRelationship__Group__13__Impl
	rule__UnreifiedRelationship__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnreifiedRelationshipAccess().getEQUALTerminalRuleCall_13()); }
	RULE_EQUAL
	{ after(grammarAccess.getUnreifiedRelationshipAccess().getEQUALTerminalRuleCall_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnreifiedRelationship__Group__14__Impl
	rule__UnreifiedRelationship__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnreifiedRelationshipAccess().getSourceAssignment_14()); }
	(rule__UnreifiedRelationship__SourceAssignment_14)
	{ after(grammarAccess.getUnreifiedRelationshipAccess().getSourceAssignment_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnreifiedRelationship__Group__15__Impl
	rule__UnreifiedRelationship__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnreifiedRelationshipAccess().getTARGET_TOKENTerminalRuleCall_15()); }
	RULE_TARGET_TOKEN
	{ after(grammarAccess.getUnreifiedRelationshipAccess().getTARGET_TOKENTerminalRuleCall_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnreifiedRelationship__Group__16__Impl
	rule__UnreifiedRelationship__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnreifiedRelationshipAccess().getEQUALTerminalRuleCall_16()); }
	RULE_EQUAL
	{ after(grammarAccess.getUnreifiedRelationshipAccess().getEQUALTerminalRuleCall_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnreifiedRelationship__Group__17__Impl
	rule__UnreifiedRelationship__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnreifiedRelationshipAccess().getTargetAssignment_17()); }
	(rule__UnreifiedRelationship__TargetAssignment_17)
	{ after(grammarAccess.getUnreifiedRelationshipAccess().getTargetAssignment_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnreifiedRelationship__Group__18__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnreifiedRelationshipAccess().getRCURLYTerminalRuleCall_18()); }
	RULE_RCURLY
	{ after(grammarAccess.getUnreifiedRelationshipAccess().getRCURLYTerminalRuleCall_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Scalar__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scalar__Group__0__Impl
	rule__Scalar__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Scalar__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScalarAccess().getSCALAR_TOKENTerminalRuleCall_0()); }
	RULE_SCALAR_TOKEN
	{ after(grammarAccess.getScalarAccess().getSCALAR_TOKENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scalar__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scalar__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Scalar__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScalarAccess().getNameAssignment_1()); }
	(rule__Scalar__NameAssignment_1)
	{ after(grammarAccess.getScalarAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Structure__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Structure__Group__0__Impl
	rule__Structure__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Structure__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStructureAccess().getSTRUCTURE_TOKENTerminalRuleCall_0()); }
	RULE_STRUCTURE_TOKEN
	{ after(grammarAccess.getStructureAccess().getSTRUCTURE_TOKENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Structure__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Structure__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Structure__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStructureAccess().getNameAssignment_1()); }
	(rule__Structure__NameAssignment_1)
	{ after(grammarAccess.getStructureAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EntityStructuredDataProperty__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityStructuredDataProperty__Group__0__Impl
	rule__EntityStructuredDataProperty__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityStructuredDataProperty__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityStructuredDataPropertyAccess().getEntityStructuredDataPropertyKeyword_0()); }
	'entityStructuredDataProperty'
	{ after(grammarAccess.getEntityStructuredDataPropertyAccess().getEntityStructuredDataPropertyKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityStructuredDataProperty__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityStructuredDataProperty__Group__1__Impl
	rule__EntityStructuredDataProperty__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityStructuredDataProperty__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityStructuredDataPropertyAccess().getNameAssignment_1()); }
	(rule__EntityStructuredDataProperty__NameAssignment_1)
	{ after(grammarAccess.getEntityStructuredDataPropertyAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityStructuredDataProperty__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityStructuredDataProperty__Group__2__Impl
	rule__EntityStructuredDataProperty__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityStructuredDataProperty__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityStructuredDataPropertyAccess().getLCURLYTerminalRuleCall_2()); }
	RULE_LCURLY
	{ after(grammarAccess.getEntityStructuredDataPropertyAccess().getLCURLYTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityStructuredDataProperty__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityStructuredDataProperty__Group__3__Impl
	rule__EntityStructuredDataProperty__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityStructuredDataProperty__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityStructuredDataPropertyAccess().getDOMAIN_TOKENTerminalRuleCall_3()); }
	RULE_DOMAIN_TOKEN
	{ after(grammarAccess.getEntityStructuredDataPropertyAccess().getDOMAIN_TOKENTerminalRuleCall_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityStructuredDataProperty__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityStructuredDataProperty__Group__4__Impl
	rule__EntityStructuredDataProperty__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityStructuredDataProperty__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityStructuredDataPropertyAccess().getDomainAssignment_4()); }
	(rule__EntityStructuredDataProperty__DomainAssignment_4)
	{ after(grammarAccess.getEntityStructuredDataPropertyAccess().getDomainAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityStructuredDataProperty__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityStructuredDataProperty__Group__5__Impl
	rule__EntityStructuredDataProperty__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityStructuredDataProperty__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityStructuredDataPropertyAccess().getRANGE_TOKENTerminalRuleCall_5()); }
	RULE_RANGE_TOKEN
	{ after(grammarAccess.getEntityStructuredDataPropertyAccess().getRANGE_TOKENTerminalRuleCall_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityStructuredDataProperty__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityStructuredDataProperty__Group__6__Impl
	rule__EntityStructuredDataProperty__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityStructuredDataProperty__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityStructuredDataPropertyAccess().getRangeAssignment_6()); }
	(rule__EntityStructuredDataProperty__RangeAssignment_6)
	{ after(grammarAccess.getEntityStructuredDataPropertyAccess().getRangeAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityStructuredDataProperty__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityStructuredDataProperty__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityStructuredDataProperty__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityStructuredDataPropertyAccess().getRCURLYTerminalRuleCall_7()); }
	RULE_RCURLY
	{ after(grammarAccess.getEntityStructuredDataPropertyAccess().getRCURLYTerminalRuleCall_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EntityScalarDataProperty__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityScalarDataProperty__Group__0__Impl
	rule__EntityScalarDataProperty__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataProperty__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityScalarDataPropertyAccess().getEntityScalarDataPropertyKeyword_0()); }
	'entityScalarDataProperty'
	{ after(grammarAccess.getEntityScalarDataPropertyAccess().getEntityScalarDataPropertyKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataProperty__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityScalarDataProperty__Group__1__Impl
	rule__EntityScalarDataProperty__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataProperty__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityScalarDataPropertyAccess().getNameAssignment_1()); }
	(rule__EntityScalarDataProperty__NameAssignment_1)
	{ after(grammarAccess.getEntityScalarDataPropertyAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataProperty__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityScalarDataProperty__Group__2__Impl
	rule__EntityScalarDataProperty__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataProperty__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityScalarDataPropertyAccess().getLCURLYTerminalRuleCall_2()); }
	RULE_LCURLY
	{ after(grammarAccess.getEntityScalarDataPropertyAccess().getLCURLYTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataProperty__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityScalarDataProperty__Group__3__Impl
	rule__EntityScalarDataProperty__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataProperty__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityScalarDataPropertyAccess().getDOMAIN_TOKENTerminalRuleCall_3()); }
	RULE_DOMAIN_TOKEN
	{ after(grammarAccess.getEntityScalarDataPropertyAccess().getDOMAIN_TOKENTerminalRuleCall_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataProperty__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityScalarDataProperty__Group__4__Impl
	rule__EntityScalarDataProperty__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataProperty__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityScalarDataPropertyAccess().getDomainAssignment_4()); }
	(rule__EntityScalarDataProperty__DomainAssignment_4)
	{ after(grammarAccess.getEntityScalarDataPropertyAccess().getDomainAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataProperty__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityScalarDataProperty__Group__5__Impl
	rule__EntityScalarDataProperty__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataProperty__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityScalarDataPropertyAccess().getRANGE_TOKENTerminalRuleCall_5()); }
	RULE_RANGE_TOKEN
	{ after(grammarAccess.getEntityScalarDataPropertyAccess().getRANGE_TOKENTerminalRuleCall_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataProperty__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityScalarDataProperty__Group__6__Impl
	rule__EntityScalarDataProperty__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataProperty__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityScalarDataPropertyAccess().getRangeAssignment_6()); }
	(rule__EntityScalarDataProperty__RangeAssignment_6)
	{ after(grammarAccess.getEntityScalarDataPropertyAccess().getRangeAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataProperty__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityScalarDataProperty__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataProperty__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityScalarDataPropertyAccess().getRCURLYTerminalRuleCall_7()); }
	RULE_RCURLY
	{ after(grammarAccess.getEntityScalarDataPropertyAccess().getRCURLYTerminalRuleCall_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StructuredDataProperty__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StructuredDataProperty__Group__0__Impl
	rule__StructuredDataProperty__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuredDataProperty__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStructuredDataPropertyAccess().getStructuredDataPropertyKeyword_0()); }
	'structuredDataProperty'
	{ after(grammarAccess.getStructuredDataPropertyAccess().getStructuredDataPropertyKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuredDataProperty__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StructuredDataProperty__Group__1__Impl
	rule__StructuredDataProperty__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuredDataProperty__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStructuredDataPropertyAccess().getNameAssignment_1()); }
	(rule__StructuredDataProperty__NameAssignment_1)
	{ after(grammarAccess.getStructuredDataPropertyAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuredDataProperty__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StructuredDataProperty__Group__2__Impl
	rule__StructuredDataProperty__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuredDataProperty__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStructuredDataPropertyAccess().getLCURLYTerminalRuleCall_2()); }
	RULE_LCURLY
	{ after(grammarAccess.getStructuredDataPropertyAccess().getLCURLYTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuredDataProperty__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StructuredDataProperty__Group__3__Impl
	rule__StructuredDataProperty__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuredDataProperty__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStructuredDataPropertyAccess().getDOMAIN_TOKENTerminalRuleCall_3()); }
	RULE_DOMAIN_TOKEN
	{ after(grammarAccess.getStructuredDataPropertyAccess().getDOMAIN_TOKENTerminalRuleCall_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuredDataProperty__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StructuredDataProperty__Group__4__Impl
	rule__StructuredDataProperty__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuredDataProperty__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStructuredDataPropertyAccess().getDomainAssignment_4()); }
	(rule__StructuredDataProperty__DomainAssignment_4)
	{ after(grammarAccess.getStructuredDataPropertyAccess().getDomainAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuredDataProperty__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StructuredDataProperty__Group__5__Impl
	rule__StructuredDataProperty__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuredDataProperty__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStructuredDataPropertyAccess().getRANGE_TOKENTerminalRuleCall_5()); }
	RULE_RANGE_TOKEN
	{ after(grammarAccess.getStructuredDataPropertyAccess().getRANGE_TOKENTerminalRuleCall_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuredDataProperty__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StructuredDataProperty__Group__6__Impl
	rule__StructuredDataProperty__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuredDataProperty__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStructuredDataPropertyAccess().getRangeAssignment_6()); }
	(rule__StructuredDataProperty__RangeAssignment_6)
	{ after(grammarAccess.getStructuredDataPropertyAccess().getRangeAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuredDataProperty__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StructuredDataProperty__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuredDataProperty__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStructuredDataPropertyAccess().getRCURLYTerminalRuleCall_7()); }
	RULE_RCURLY
	{ after(grammarAccess.getStructuredDataPropertyAccess().getRCURLYTerminalRuleCall_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ScalarDataProperty__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScalarDataProperty__Group__0__Impl
	rule__ScalarDataProperty__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarDataProperty__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScalarDataPropertyAccess().getScalarDataPropertyKeyword_0()); }
	'scalarDataProperty'
	{ after(grammarAccess.getScalarDataPropertyAccess().getScalarDataPropertyKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarDataProperty__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScalarDataProperty__Group__1__Impl
	rule__ScalarDataProperty__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarDataProperty__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScalarDataPropertyAccess().getNameAssignment_1()); }
	(rule__ScalarDataProperty__NameAssignment_1)
	{ after(grammarAccess.getScalarDataPropertyAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarDataProperty__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScalarDataProperty__Group__2__Impl
	rule__ScalarDataProperty__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarDataProperty__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScalarDataPropertyAccess().getLCURLYTerminalRuleCall_2()); }
	RULE_LCURLY
	{ after(grammarAccess.getScalarDataPropertyAccess().getLCURLYTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarDataProperty__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScalarDataProperty__Group__3__Impl
	rule__ScalarDataProperty__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarDataProperty__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScalarDataPropertyAccess().getDOMAIN_TOKENTerminalRuleCall_3()); }
	RULE_DOMAIN_TOKEN
	{ after(grammarAccess.getScalarDataPropertyAccess().getDOMAIN_TOKENTerminalRuleCall_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarDataProperty__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScalarDataProperty__Group__4__Impl
	rule__ScalarDataProperty__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarDataProperty__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScalarDataPropertyAccess().getDomainAssignment_4()); }
	(rule__ScalarDataProperty__DomainAssignment_4)
	{ after(grammarAccess.getScalarDataPropertyAccess().getDomainAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarDataProperty__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScalarDataProperty__Group__5__Impl
	rule__ScalarDataProperty__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarDataProperty__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScalarDataPropertyAccess().getRANGE_TOKENTerminalRuleCall_5()); }
	RULE_RANGE_TOKEN
	{ after(grammarAccess.getScalarDataPropertyAccess().getRANGE_TOKENTerminalRuleCall_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarDataProperty__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScalarDataProperty__Group__6__Impl
	rule__ScalarDataProperty__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarDataProperty__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScalarDataPropertyAccess().getRangeAssignment_6()); }
	(rule__ScalarDataProperty__RangeAssignment_6)
	{ after(grammarAccess.getScalarDataPropertyAccess().getRangeAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarDataProperty__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScalarDataProperty__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarDataProperty__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScalarDataPropertyAccess().getRCURLYTerminalRuleCall_7()); }
	RULE_RCURLY
	{ after(grammarAccess.getScalarDataPropertyAccess().getRCURLYTerminalRuleCall_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AnonymousConceptTaxonomyAxiom__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnonymousConceptTaxonomyAxiom__Group__0__Impl
	rule__AnonymousConceptTaxonomyAxiom__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AnonymousConceptTaxonomyAxiom__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnonymousConceptTaxonomyAxiomAccess().getANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKENTerminalRuleCall_0()); }
	RULE_ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKEN
	{ after(grammarAccess.getAnonymousConceptTaxonomyAxiomAccess().getANONYMOUS_CONCEPT_TAXONOMY_AXIOM_TOKENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnonymousConceptTaxonomyAxiom__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnonymousConceptTaxonomyAxiom__Group__1__Impl
	rule__AnonymousConceptTaxonomyAxiom__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AnonymousConceptTaxonomyAxiom__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnonymousConceptTaxonomyAxiomAccess().getLCURLYTerminalRuleCall_1()); }
	RULE_LCURLY
	{ after(grammarAccess.getAnonymousConceptTaxonomyAxiomAccess().getLCURLYTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnonymousConceptTaxonomyAxiom__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnonymousConceptTaxonomyAxiom__Group__2__Impl
	rule__AnonymousConceptTaxonomyAxiom__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AnonymousConceptTaxonomyAxiom__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnonymousConceptTaxonomyAxiomAccess().getDisjointTaxonomyParentKeyword_2()); }
	'disjointTaxonomyParent'
	{ after(grammarAccess.getAnonymousConceptTaxonomyAxiomAccess().getDisjointTaxonomyParentKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnonymousConceptTaxonomyAxiom__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnonymousConceptTaxonomyAxiom__Group__3__Impl
	rule__AnonymousConceptTaxonomyAxiom__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__AnonymousConceptTaxonomyAxiom__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnonymousConceptTaxonomyAxiomAccess().getDisjointTaxonomyParentAssignment_3()); }
	(rule__AnonymousConceptTaxonomyAxiom__DisjointTaxonomyParentAssignment_3)
	{ after(grammarAccess.getAnonymousConceptTaxonomyAxiomAccess().getDisjointTaxonomyParentAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnonymousConceptTaxonomyAxiom__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnonymousConceptTaxonomyAxiom__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AnonymousConceptTaxonomyAxiom__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnonymousConceptTaxonomyAxiomAccess().getRCURLYTerminalRuleCall_4()); }
	RULE_RCURLY
	{ after(grammarAccess.getAnonymousConceptTaxonomyAxiomAccess().getRCURLYTerminalRuleCall_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RootConceptTaxonomyAxiom__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RootConceptTaxonomyAxiom__Group__0__Impl
	rule__RootConceptTaxonomyAxiom__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RootConceptTaxonomyAxiom__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRootConceptTaxonomyAxiomAccess().getROOT_CONCEPT_TAXONOMY_AXIOM_TOKENTerminalRuleCall_0()); }
	RULE_ROOT_CONCEPT_TAXONOMY_AXIOM_TOKEN
	{ after(grammarAccess.getRootConceptTaxonomyAxiomAccess().getROOT_CONCEPT_TAXONOMY_AXIOM_TOKENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RootConceptTaxonomyAxiom__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RootConceptTaxonomyAxiom__Group__1__Impl
	rule__RootConceptTaxonomyAxiom__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RootConceptTaxonomyAxiom__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRootConceptTaxonomyAxiomAccess().getLCURLYTerminalRuleCall_1()); }
	RULE_LCURLY
	{ after(grammarAccess.getRootConceptTaxonomyAxiomAccess().getLCURLYTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RootConceptTaxonomyAxiom__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RootConceptTaxonomyAxiom__Group__2__Impl
	rule__RootConceptTaxonomyAxiom__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RootConceptTaxonomyAxiom__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRootConceptTaxonomyAxiomAccess().getRootKeyword_2()); }
	'root'
	{ after(grammarAccess.getRootConceptTaxonomyAxiomAccess().getRootKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RootConceptTaxonomyAxiom__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RootConceptTaxonomyAxiom__Group__3__Impl
	rule__RootConceptTaxonomyAxiom__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__RootConceptTaxonomyAxiom__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRootConceptTaxonomyAxiomAccess().getRootAssignment_3()); }
	(rule__RootConceptTaxonomyAxiom__RootAssignment_3)
	{ after(grammarAccess.getRootConceptTaxonomyAxiomAccess().getRootAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RootConceptTaxonomyAxiom__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RootConceptTaxonomyAxiom__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RootConceptTaxonomyAxiom__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRootConceptTaxonomyAxiomAccess().getRCURLYTerminalRuleCall_4()); }
	RULE_RCURLY
	{ after(grammarAccess.getRootConceptTaxonomyAxiomAccess().getRCURLYTerminalRuleCall_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SpecificDisjointConceptAxiom__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SpecificDisjointConceptAxiom__Group__0__Impl
	rule__SpecificDisjointConceptAxiom__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecificDisjointConceptAxiom__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpecificDisjointConceptAxiomAccess().getSPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKENTerminalRuleCall_0()); }
	RULE_SPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKEN
	{ after(grammarAccess.getSpecificDisjointConceptAxiomAccess().getSPECIFIC_DISJOINT_CONCEPT_AXIOM_TOKENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecificDisjointConceptAxiom__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SpecificDisjointConceptAxiom__Group__1__Impl
	rule__SpecificDisjointConceptAxiom__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecificDisjointConceptAxiom__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpecificDisjointConceptAxiomAccess().getLCURLYTerminalRuleCall_1()); }
	RULE_LCURLY
	{ after(grammarAccess.getSpecificDisjointConceptAxiomAccess().getLCURLYTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecificDisjointConceptAxiom__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SpecificDisjointConceptAxiom__Group__2__Impl
	rule__SpecificDisjointConceptAxiom__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecificDisjointConceptAxiom__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpecificDisjointConceptAxiomAccess().getDisjointTaxonomyParentKeyword_2()); }
	'disjointTaxonomyParent'
	{ after(grammarAccess.getSpecificDisjointConceptAxiomAccess().getDisjointTaxonomyParentKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecificDisjointConceptAxiom__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SpecificDisjointConceptAxiom__Group__3__Impl
	rule__SpecificDisjointConceptAxiom__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecificDisjointConceptAxiom__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpecificDisjointConceptAxiomAccess().getDisjointTaxonomyParentAssignment_3()); }
	(rule__SpecificDisjointConceptAxiom__DisjointTaxonomyParentAssignment_3)
	{ after(grammarAccess.getSpecificDisjointConceptAxiomAccess().getDisjointTaxonomyParentAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecificDisjointConceptAxiom__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SpecificDisjointConceptAxiom__Group__4__Impl
	rule__SpecificDisjointConceptAxiom__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecificDisjointConceptAxiom__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpecificDisjointConceptAxiomAccess().getDisjointLeafKeyword_4()); }
	'disjointLeaf'
	{ after(grammarAccess.getSpecificDisjointConceptAxiomAccess().getDisjointLeafKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecificDisjointConceptAxiom__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SpecificDisjointConceptAxiom__Group__5__Impl
	rule__SpecificDisjointConceptAxiom__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecificDisjointConceptAxiom__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpecificDisjointConceptAxiomAccess().getDisjointLeafAssignment_5()); }
	(rule__SpecificDisjointConceptAxiom__DisjointLeafAssignment_5)
	{ after(grammarAccess.getSpecificDisjointConceptAxiomAccess().getDisjointLeafAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecificDisjointConceptAxiom__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SpecificDisjointConceptAxiom__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecificDisjointConceptAxiom__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSpecificDisjointConceptAxiomAccess().getRCURLYTerminalRuleCall_6()); }
	RULE_RCURLY
	{ after(grammarAccess.getSpecificDisjointConceptAxiomAccess().getRCURLYTerminalRuleCall_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BundledTerminologyAxiom__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BundledTerminologyAxiom__Group__0__Impl
	rule__BundledTerminologyAxiom__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BundledTerminologyAxiom__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBundledTerminologyAxiomAccess().getBUNDLED_TERMINOLOGY_AXIOM_TOKENTerminalRuleCall_0()); }
	RULE_BUNDLED_TERMINOLOGY_AXIOM_TOKEN
	{ after(grammarAccess.getBundledTerminologyAxiomAccess().getBUNDLED_TERMINOLOGY_AXIOM_TOKENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BundledTerminologyAxiom__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BundledTerminologyAxiom__Group__1__Impl
	rule__BundledTerminologyAxiom__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__BundledTerminologyAxiom__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBundledTerminologyAxiomAccess().getLCURLYTerminalRuleCall_1()); }
	RULE_LCURLY
	{ after(grammarAccess.getBundledTerminologyAxiomAccess().getLCURLYTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BundledTerminologyAxiom__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BundledTerminologyAxiom__Group__2__Impl
	rule__BundledTerminologyAxiom__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__BundledTerminologyAxiom__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBundledTerminologyAxiomAccess().getBundledTerminologyKeyword_2()); }
	'bundledTerminology'
	{ after(grammarAccess.getBundledTerminologyAxiomAccess().getBundledTerminologyKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BundledTerminologyAxiom__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BundledTerminologyAxiom__Group__3__Impl
	rule__BundledTerminologyAxiom__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__BundledTerminologyAxiom__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBundledTerminologyAxiomAccess().getBundledTerminologyAssignment_3()); }
	(rule__BundledTerminologyAxiom__BundledTerminologyAssignment_3)
	{ after(grammarAccess.getBundledTerminologyAxiomAccess().getBundledTerminologyAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BundledTerminologyAxiom__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BundledTerminologyAxiom__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BundledTerminologyAxiom__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBundledTerminologyAxiomAccess().getRCURLYTerminalRuleCall_4()); }
	RULE_RCURLY
	{ after(grammarAccess.getBundledTerminologyAxiomAccess().getRCURLYTerminalRuleCall_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ConceptDesignationTerminologyAxiom__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConceptDesignationTerminologyAxiom__Group__0__Impl
	rule__ConceptDesignationTerminologyAxiom__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptDesignationTerminologyAxiom__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptDesignationTerminologyAxiomAccess().getCONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKENTerminalRuleCall_0()); }
	RULE_CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKEN
	{ after(grammarAccess.getConceptDesignationTerminologyAxiomAccess().getCONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_TOKENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptDesignationTerminologyAxiom__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConceptDesignationTerminologyAxiom__Group__1__Impl
	rule__ConceptDesignationTerminologyAxiom__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptDesignationTerminologyAxiom__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptDesignationTerminologyAxiomAccess().getLCURLYTerminalRuleCall_1()); }
	RULE_LCURLY
	{ after(grammarAccess.getConceptDesignationTerminologyAxiomAccess().getLCURLYTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptDesignationTerminologyAxiom__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConceptDesignationTerminologyAxiom__Group__2__Impl
	rule__ConceptDesignationTerminologyAxiom__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptDesignationTerminologyAxiom__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptDesignationTerminologyAxiomAccess().getDesignatedTerminologyKeyword_2()); }
	'designatedTerminology'
	{ after(grammarAccess.getConceptDesignationTerminologyAxiomAccess().getDesignatedTerminologyKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptDesignationTerminologyAxiom__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConceptDesignationTerminologyAxiom__Group__3__Impl
	rule__ConceptDesignationTerminologyAxiom__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptDesignationTerminologyAxiom__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptDesignationTerminologyAxiomAccess().getDesignatedTerminologyAssignment_3()); }
	(rule__ConceptDesignationTerminologyAxiom__DesignatedTerminologyAssignment_3)
	{ after(grammarAccess.getConceptDesignationTerminologyAxiomAccess().getDesignatedTerminologyAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptDesignationTerminologyAxiom__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConceptDesignationTerminologyAxiom__Group__4__Impl
	rule__ConceptDesignationTerminologyAxiom__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptDesignationTerminologyAxiom__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptDesignationTerminologyAxiomAccess().getDesignatedConceptKeyword_4()); }
	'designatedConcept'
	{ after(grammarAccess.getConceptDesignationTerminologyAxiomAccess().getDesignatedConceptKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptDesignationTerminologyAxiom__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConceptDesignationTerminologyAxiom__Group__5__Impl
	rule__ConceptDesignationTerminologyAxiom__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptDesignationTerminologyAxiom__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptDesignationTerminologyAxiomAccess().getDesignatedConceptAssignment_5()); }
	(rule__ConceptDesignationTerminologyAxiom__DesignatedConceptAssignment_5)
	{ after(grammarAccess.getConceptDesignationTerminologyAxiomAccess().getDesignatedConceptAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptDesignationTerminologyAxiom__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConceptDesignationTerminologyAxiom__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptDesignationTerminologyAxiom__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptDesignationTerminologyAxiomAccess().getRCURLYTerminalRuleCall_6()); }
	RULE_RCURLY
	{ after(grammarAccess.getConceptDesignationTerminologyAxiomAccess().getRCURLYTerminalRuleCall_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TerminologyExtensionAxiom__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TerminologyExtensionAxiom__Group__0__Impl
	rule__TerminologyExtensionAxiom__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyExtensionAxiom__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminologyExtensionAxiomAccess().getEXTENDS_TOKENTerminalRuleCall_0()); }
	RULE_EXTENDS_TOKEN
	{ after(grammarAccess.getTerminologyExtensionAxiomAccess().getEXTENDS_TOKENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyExtensionAxiom__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TerminologyExtensionAxiom__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyExtensionAxiom__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminologyExtensionAxiomAccess().getExtendedTerminologyAssignment_1()); }
	(rule__TerminologyExtensionAxiom__ExtendedTerminologyAssignment_1)
	{ after(grammarAccess.getTerminologyExtensionAxiomAccess().getExtendedTerminologyAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TerminologyNestingAxiom__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TerminologyNestingAxiom__Group__0__Impl
	rule__TerminologyNestingAxiom__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyNestingAxiom__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminologyNestingAxiomAccess().getTERMINOLOGY_NESTING_AXIOM_TOKENTerminalRuleCall_0()); }
	RULE_TERMINOLOGY_NESTING_AXIOM_TOKEN
	{ after(grammarAccess.getTerminologyNestingAxiomAccess().getTERMINOLOGY_NESTING_AXIOM_TOKENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyNestingAxiom__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TerminologyNestingAxiom__Group__1__Impl
	rule__TerminologyNestingAxiom__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyNestingAxiom__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminologyNestingAxiomAccess().getLCURLYTerminalRuleCall_1()); }
	RULE_LCURLY
	{ after(grammarAccess.getTerminologyNestingAxiomAccess().getLCURLYTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyNestingAxiom__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TerminologyNestingAxiom__Group__2__Impl
	rule__TerminologyNestingAxiom__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyNestingAxiom__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminologyNestingAxiomAccess().getNestingTerminologyKeyword_2()); }
	'nestingTerminology'
	{ after(grammarAccess.getTerminologyNestingAxiomAccess().getNestingTerminologyKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyNestingAxiom__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TerminologyNestingAxiom__Group__3__Impl
	rule__TerminologyNestingAxiom__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyNestingAxiom__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminologyNestingAxiomAccess().getNestingTerminologyAssignment_3()); }
	(rule__TerminologyNestingAxiom__NestingTerminologyAssignment_3)
	{ after(grammarAccess.getTerminologyNestingAxiomAccess().getNestingTerminologyAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyNestingAxiom__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TerminologyNestingAxiom__Group__4__Impl
	rule__TerminologyNestingAxiom__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyNestingAxiom__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminologyNestingAxiomAccess().getNestingContextKeyword_4()); }
	'nestingContext'
	{ after(grammarAccess.getTerminologyNestingAxiomAccess().getNestingContextKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyNestingAxiom__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TerminologyNestingAxiom__Group__5__Impl
	rule__TerminologyNestingAxiom__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyNestingAxiom__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminologyNestingAxiomAccess().getNestingContextAssignment_5()); }
	(rule__TerminologyNestingAxiom__NestingContextAssignment_5)
	{ after(grammarAccess.getTerminologyNestingAxiomAccess().getNestingContextAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyNestingAxiom__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TerminologyNestingAxiom__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyNestingAxiom__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminologyNestingAxiomAccess().getRCURLYTerminalRuleCall_6()); }
	RULE_RCURLY
	{ after(grammarAccess.getTerminologyNestingAxiomAccess().getRCURLYTerminalRuleCall_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EntityExistentialRestrictionAxiom__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityExistentialRestrictionAxiom__Group__0__Impl
	rule__EntityExistentialRestrictionAxiom__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityExistentialRestrictionAxiom__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0()); }
	RULE_ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN
	{ after(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getENTITY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityExistentialRestrictionAxiom__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityExistentialRestrictionAxiom__Group__1__Impl
	rule__EntityExistentialRestrictionAxiom__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityExistentialRestrictionAxiom__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getLCURLYTerminalRuleCall_1()); }
	RULE_LCURLY
	{ after(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getLCURLYTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityExistentialRestrictionAxiom__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityExistentialRestrictionAxiom__Group__2__Impl
	rule__EntityExistentialRestrictionAxiom__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityExistentialRestrictionAxiom__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedRelationKeyword_2()); }
	'restrictedRelation'
	{ after(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedRelationKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityExistentialRestrictionAxiom__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityExistentialRestrictionAxiom__Group__3__Impl
	rule__EntityExistentialRestrictionAxiom__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityExistentialRestrictionAxiom__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedRelationAssignment_3()); }
	(rule__EntityExistentialRestrictionAxiom__RestrictedRelationAssignment_3)
	{ after(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedRelationAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityExistentialRestrictionAxiom__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityExistentialRestrictionAxiom__Group__4__Impl
	rule__EntityExistentialRestrictionAxiom__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityExistentialRestrictionAxiom__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedRangeKeyword_4()); }
	'restrictedRange'
	{ after(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedRangeKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityExistentialRestrictionAxiom__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityExistentialRestrictionAxiom__Group__5__Impl
	rule__EntityExistentialRestrictionAxiom__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityExistentialRestrictionAxiom__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedRangeAssignment_5()); }
	(rule__EntityExistentialRestrictionAxiom__RestrictedRangeAssignment_5)
	{ after(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedRangeAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityExistentialRestrictionAxiom__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityExistentialRestrictionAxiom__Group__6__Impl
	rule__EntityExistentialRestrictionAxiom__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityExistentialRestrictionAxiom__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedDomainKeyword_6()); }
	'restrictedDomain'
	{ after(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedDomainKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityExistentialRestrictionAxiom__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityExistentialRestrictionAxiom__Group__7__Impl
	rule__EntityExistentialRestrictionAxiom__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityExistentialRestrictionAxiom__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedDomainAssignment_7()); }
	(rule__EntityExistentialRestrictionAxiom__RestrictedDomainAssignment_7)
	{ after(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedDomainAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityExistentialRestrictionAxiom__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityExistentialRestrictionAxiom__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityExistentialRestrictionAxiom__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRCURLYTerminalRuleCall_8()); }
	RULE_RCURLY
	{ after(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRCURLYTerminalRuleCall_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EntityUniversalRestrictionAxiom__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityUniversalRestrictionAxiom__Group__0__Impl
	rule__EntityUniversalRestrictionAxiom__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityUniversalRestrictionAxiom__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0()); }
	RULE_ENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN
	{ after(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getENTITY_UNIVERSAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityUniversalRestrictionAxiom__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityUniversalRestrictionAxiom__Group__1__Impl
	rule__EntityUniversalRestrictionAxiom__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityUniversalRestrictionAxiom__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getLCURLYTerminalRuleCall_1()); }
	RULE_LCURLY
	{ after(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getLCURLYTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityUniversalRestrictionAxiom__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityUniversalRestrictionAxiom__Group__2__Impl
	rule__EntityUniversalRestrictionAxiom__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityUniversalRestrictionAxiom__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedRelationKeyword_2()); }
	'restrictedRelation'
	{ after(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedRelationKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityUniversalRestrictionAxiom__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityUniversalRestrictionAxiom__Group__3__Impl
	rule__EntityUniversalRestrictionAxiom__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityUniversalRestrictionAxiom__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedRelationAssignment_3()); }
	(rule__EntityUniversalRestrictionAxiom__RestrictedRelationAssignment_3)
	{ after(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedRelationAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityUniversalRestrictionAxiom__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityUniversalRestrictionAxiom__Group__4__Impl
	rule__EntityUniversalRestrictionAxiom__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityUniversalRestrictionAxiom__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedRangeKeyword_4()); }
	'restrictedRange'
	{ after(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedRangeKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityUniversalRestrictionAxiom__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityUniversalRestrictionAxiom__Group__5__Impl
	rule__EntityUniversalRestrictionAxiom__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityUniversalRestrictionAxiom__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedRangeAssignment_5()); }
	(rule__EntityUniversalRestrictionAxiom__RestrictedRangeAssignment_5)
	{ after(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedRangeAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityUniversalRestrictionAxiom__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityUniversalRestrictionAxiom__Group__6__Impl
	rule__EntityUniversalRestrictionAxiom__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityUniversalRestrictionAxiom__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedDomainKeyword_6()); }
	'restrictedDomain'
	{ after(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedDomainKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityUniversalRestrictionAxiom__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityUniversalRestrictionAxiom__Group__7__Impl
	rule__EntityUniversalRestrictionAxiom__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityUniversalRestrictionAxiom__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedDomainAssignment_7()); }
	(rule__EntityUniversalRestrictionAxiom__RestrictedDomainAssignment_7)
	{ after(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedDomainAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityUniversalRestrictionAxiom__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityUniversalRestrictionAxiom__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityUniversalRestrictionAxiom__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRCURLYTerminalRuleCall_8()); }
	RULE_RCURLY
	{ after(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRCURLYTerminalRuleCall_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AspectSpecializationAxiom__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AspectSpecializationAxiom__Group__0__Impl
	rule__AspectSpecializationAxiom__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AspectSpecializationAxiom__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAspectSpecializationAxiomAccess().getSubEntityAssignment_0()); }
	(rule__AspectSpecializationAxiom__SubEntityAssignment_0)
	{ after(grammarAccess.getAspectSpecializationAxiomAccess().getSubEntityAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AspectSpecializationAxiom__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AspectSpecializationAxiom__Group__1__Impl
	rule__AspectSpecializationAxiom__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AspectSpecializationAxiom__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAspectSpecializationAxiomAccess().getASPECT_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_1()); }
	RULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN
	{ after(grammarAccess.getAspectSpecializationAxiomAccess().getASPECT_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AspectSpecializationAxiom__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AspectSpecializationAxiom__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AspectSpecializationAxiom__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAspectSpecializationAxiomAccess().getSuperAspectAssignment_2()); }
	(rule__AspectSpecializationAxiom__SuperAspectAssignment_2)
	{ after(grammarAccess.getAspectSpecializationAxiomAccess().getSuperAspectAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ConceptSpecializationAxiom__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConceptSpecializationAxiom__Group__0__Impl
	rule__ConceptSpecializationAxiom__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptSpecializationAxiom__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptSpecializationAxiomAccess().getSubConceptAssignment_0()); }
	(rule__ConceptSpecializationAxiom__SubConceptAssignment_0)
	{ after(grammarAccess.getConceptSpecializationAxiomAccess().getSubConceptAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptSpecializationAxiom__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConceptSpecializationAxiom__Group__1__Impl
	rule__ConceptSpecializationAxiom__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptSpecializationAxiom__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptSpecializationAxiomAccess().getCONCEPT_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_1()); }
	RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN
	{ after(grammarAccess.getConceptSpecializationAxiomAccess().getCONCEPT_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptSpecializationAxiom__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConceptSpecializationAxiom__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptSpecializationAxiom__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptSpecializationAxiomAccess().getSuperConceptAssignment_2()); }
	(rule__ConceptSpecializationAxiom__SuperConceptAssignment_2)
	{ after(grammarAccess.getConceptSpecializationAxiomAccess().getSuperConceptAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ReifiedRelationshipSpecializationAxiom__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationshipSpecializationAxiom__Group__0__Impl
	rule__ReifiedRelationshipSpecializationAxiom__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipSpecializationAxiom__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipSpecializationAxiomAccess().getSubRelationshipAssignment_0()); }
	(rule__ReifiedRelationshipSpecializationAxiom__SubRelationshipAssignment_0)
	{ after(grammarAccess.getReifiedRelationshipSpecializationAxiomAccess().getSubRelationshipAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipSpecializationAxiom__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationshipSpecializationAxiom__Group__1__Impl
	rule__ReifiedRelationshipSpecializationAxiom__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipSpecializationAxiom__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipSpecializationAxiomAccess().getREIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_1()); }
	RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN
	{ after(grammarAccess.getReifiedRelationshipSpecializationAxiomAccess().getREIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKENTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipSpecializationAxiom__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationshipSpecializationAxiom__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipSpecializationAxiom__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipSpecializationAxiomAccess().getSuperRelationshipAssignment_2()); }
	(rule__ReifiedRelationshipSpecializationAxiom__SuperRelationshipAssignment_2)
	{ after(grammarAccess.getReifiedRelationshipSpecializationAxiomAccess().getSuperRelationshipAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EntityScalarDataPropertyExistentialRestrictionAxiom__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityScalarDataPropertyExistentialRestrictionAxiom__Group__0__Impl
	rule__EntityScalarDataPropertyExistentialRestrictionAxiom__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyExistentialRestrictionAxiom__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0()); }
	RULE_ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKEN
	{ after(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyExistentialRestrictionAxiom__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityScalarDataPropertyExistentialRestrictionAxiom__Group__1__Impl
	rule__EntityScalarDataPropertyExistentialRestrictionAxiom__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyExistentialRestrictionAxiom__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getLCURLYTerminalRuleCall_1()); }
	RULE_LCURLY
	{ after(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getLCURLYTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyExistentialRestrictionAxiom__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityScalarDataPropertyExistentialRestrictionAxiom__Group__2__Impl
	rule__EntityScalarDataPropertyExistentialRestrictionAxiom__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyExistentialRestrictionAxiom__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getRestrictedEntityKeyword_2()); }
	'restrictedEntity'
	{ after(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getRestrictedEntityKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyExistentialRestrictionAxiom__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityScalarDataPropertyExistentialRestrictionAxiom__Group__3__Impl
	rule__EntityScalarDataPropertyExistentialRestrictionAxiom__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyExistentialRestrictionAxiom__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getRestrictedEntityAssignment_3()); }
	(rule__EntityScalarDataPropertyExistentialRestrictionAxiom__RestrictedEntityAssignment_3)
	{ after(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getRestrictedEntityAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyExistentialRestrictionAxiom__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityScalarDataPropertyExistentialRestrictionAxiom__Group__4__Impl
	rule__EntityScalarDataPropertyExistentialRestrictionAxiom__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyExistentialRestrictionAxiom__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarPropertyKeyword_4()); }
	'scalarProperty'
	{ after(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarPropertyKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyExistentialRestrictionAxiom__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityScalarDataPropertyExistentialRestrictionAxiom__Group__5__Impl
	rule__EntityScalarDataPropertyExistentialRestrictionAxiom__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyExistentialRestrictionAxiom__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarPropertyAssignment_5()); }
	(rule__EntityScalarDataPropertyExistentialRestrictionAxiom__ScalarPropertyAssignment_5)
	{ after(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarPropertyAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyExistentialRestrictionAxiom__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityScalarDataPropertyExistentialRestrictionAxiom__Group__6__Impl
	rule__EntityScalarDataPropertyExistentialRestrictionAxiom__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyExistentialRestrictionAxiom__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarRestrictionKeyword_6()); }
	'scalarRestriction'
	{ after(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarRestrictionKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyExistentialRestrictionAxiom__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityScalarDataPropertyExistentialRestrictionAxiom__Group__7__Impl
	rule__EntityScalarDataPropertyExistentialRestrictionAxiom__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyExistentialRestrictionAxiom__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarRestrictionAssignment_7()); }
	(rule__EntityScalarDataPropertyExistentialRestrictionAxiom__ScalarRestrictionAssignment_7)
	{ after(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarRestrictionAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyExistentialRestrictionAxiom__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityScalarDataPropertyExistentialRestrictionAxiom__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyExistentialRestrictionAxiom__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getRCURLYTerminalRuleCall_8()); }
	RULE_RCURLY
	{ after(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getRCURLYTerminalRuleCall_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EntityScalarDataPropertyParticularRestrictionAxiom__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityScalarDataPropertyParticularRestrictionAxiom__Group__0__Impl
	rule__EntityScalarDataPropertyParticularRestrictionAxiom__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyParticularRestrictionAxiom__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0()); }
	RULE_ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKEN
	{ after(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyParticularRestrictionAxiom__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityScalarDataPropertyParticularRestrictionAxiom__Group__1__Impl
	rule__EntityScalarDataPropertyParticularRestrictionAxiom__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyParticularRestrictionAxiom__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getLCURLYTerminalRuleCall_1()); }
	RULE_LCURLY
	{ after(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getLCURLYTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyParticularRestrictionAxiom__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityScalarDataPropertyParticularRestrictionAxiom__Group__2__Impl
	rule__EntityScalarDataPropertyParticularRestrictionAxiom__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyParticularRestrictionAxiom__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getRestrictedEntityKeyword_2()); }
	'restrictedEntity'
	{ after(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getRestrictedEntityKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyParticularRestrictionAxiom__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityScalarDataPropertyParticularRestrictionAxiom__Group__3__Impl
	rule__EntityScalarDataPropertyParticularRestrictionAxiom__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyParticularRestrictionAxiom__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getRestrictedEntityAssignment_3()); }
	(rule__EntityScalarDataPropertyParticularRestrictionAxiom__RestrictedEntityAssignment_3)
	{ after(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getRestrictedEntityAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyParticularRestrictionAxiom__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityScalarDataPropertyParticularRestrictionAxiom__Group__4__Impl
	rule__EntityScalarDataPropertyParticularRestrictionAxiom__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyParticularRestrictionAxiom__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getScalarPropertyKeyword_4()); }
	'scalarProperty'
	{ after(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getScalarPropertyKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyParticularRestrictionAxiom__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityScalarDataPropertyParticularRestrictionAxiom__Group__5__Impl
	rule__EntityScalarDataPropertyParticularRestrictionAxiom__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyParticularRestrictionAxiom__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getScalarPropertyAssignment_5()); }
	(rule__EntityScalarDataPropertyParticularRestrictionAxiom__ScalarPropertyAssignment_5)
	{ after(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getScalarPropertyAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyParticularRestrictionAxiom__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityScalarDataPropertyParticularRestrictionAxiom__Group__6__Impl
	rule__EntityScalarDataPropertyParticularRestrictionAxiom__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyParticularRestrictionAxiom__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getLiteralValueKeyword_6()); }
	'literalValue'
	{ after(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getLiteralValueKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyParticularRestrictionAxiom__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityScalarDataPropertyParticularRestrictionAxiom__Group__7__Impl
	rule__EntityScalarDataPropertyParticularRestrictionAxiom__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyParticularRestrictionAxiom__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getLiteralValueAssignment_7()); }
	(rule__EntityScalarDataPropertyParticularRestrictionAxiom__LiteralValueAssignment_7)
	{ after(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getLiteralValueAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyParticularRestrictionAxiom__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityScalarDataPropertyParticularRestrictionAxiom__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyParticularRestrictionAxiom__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getRCURLYTerminalRuleCall_8()); }
	RULE_RCURLY
	{ after(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getRCURLYTerminalRuleCall_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EntityScalarDataPropertyUniversalRestrictionAxiom__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityScalarDataPropertyUniversalRestrictionAxiom__Group__0__Impl
	rule__EntityScalarDataPropertyUniversalRestrictionAxiom__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyUniversalRestrictionAxiom__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0()); }
	RULE_ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKEN
	{ after(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_TOKENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyUniversalRestrictionAxiom__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityScalarDataPropertyUniversalRestrictionAxiom__Group__1__Impl
	rule__EntityScalarDataPropertyUniversalRestrictionAxiom__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyUniversalRestrictionAxiom__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getLCURLYTerminalRuleCall_1()); }
	RULE_LCURLY
	{ after(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getLCURLYTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyUniversalRestrictionAxiom__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityScalarDataPropertyUniversalRestrictionAxiom__Group__2__Impl
	rule__EntityScalarDataPropertyUniversalRestrictionAxiom__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyUniversalRestrictionAxiom__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getRestrictedEntityKeyword_2()); }
	'restrictedEntity'
	{ after(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getRestrictedEntityKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyUniversalRestrictionAxiom__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityScalarDataPropertyUniversalRestrictionAxiom__Group__3__Impl
	rule__EntityScalarDataPropertyUniversalRestrictionAxiom__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyUniversalRestrictionAxiom__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getRestrictedEntityAssignment_3()); }
	(rule__EntityScalarDataPropertyUniversalRestrictionAxiom__RestrictedEntityAssignment_3)
	{ after(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getRestrictedEntityAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyUniversalRestrictionAxiom__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityScalarDataPropertyUniversalRestrictionAxiom__Group__4__Impl
	rule__EntityScalarDataPropertyUniversalRestrictionAxiom__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyUniversalRestrictionAxiom__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarPropertyKeyword_4()); }
	'scalarProperty'
	{ after(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarPropertyKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyUniversalRestrictionAxiom__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityScalarDataPropertyUniversalRestrictionAxiom__Group__5__Impl
	rule__EntityScalarDataPropertyUniversalRestrictionAxiom__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyUniversalRestrictionAxiom__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarPropertyAssignment_5()); }
	(rule__EntityScalarDataPropertyUniversalRestrictionAxiom__ScalarPropertyAssignment_5)
	{ after(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarPropertyAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyUniversalRestrictionAxiom__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityScalarDataPropertyUniversalRestrictionAxiom__Group__6__Impl
	rule__EntityScalarDataPropertyUniversalRestrictionAxiom__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyUniversalRestrictionAxiom__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarRestrictionKeyword_6()); }
	'scalarRestriction'
	{ after(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarRestrictionKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyUniversalRestrictionAxiom__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityScalarDataPropertyUniversalRestrictionAxiom__Group__7__Impl
	rule__EntityScalarDataPropertyUniversalRestrictionAxiom__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyUniversalRestrictionAxiom__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarRestrictionAssignment_7()); }
	(rule__EntityScalarDataPropertyUniversalRestrictionAxiom__ScalarRestrictionAssignment_7)
	{ after(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarRestrictionAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyUniversalRestrictionAxiom__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityScalarDataPropertyUniversalRestrictionAxiom__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyUniversalRestrictionAxiom__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getRCURLYTerminalRuleCall_8()); }
	RULE_RCURLY
	{ after(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getRCURLYTerminalRuleCall_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BinaryScalarRestriction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BinaryScalarRestriction__Group__0__Impl
	rule__BinaryScalarRestriction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryScalarRestriction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBinaryScalarRestrictionAccess().getBINARY_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0()); }
	RULE_BINARY_SCALAR_RESTRICTION_TOKEN
	{ after(grammarAccess.getBinaryScalarRestrictionAccess().getBINARY_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryScalarRestriction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BinaryScalarRestriction__Group__1__Impl
	rule__BinaryScalarRestriction__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryScalarRestriction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBinaryScalarRestrictionAccess().getNameAssignment_1()); }
	(rule__BinaryScalarRestriction__NameAssignment_1)
	{ after(grammarAccess.getBinaryScalarRestrictionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryScalarRestriction__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BinaryScalarRestriction__Group__2__Impl
	rule__BinaryScalarRestriction__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryScalarRestriction__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBinaryScalarRestrictionAccess().getLCURLYTerminalRuleCall_2()); }
	RULE_LCURLY
	{ after(grammarAccess.getBinaryScalarRestrictionAccess().getLCURLYTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryScalarRestriction__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BinaryScalarRestriction__Group__3__Impl
	rule__BinaryScalarRestriction__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryScalarRestriction__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBinaryScalarRestrictionAccess().getGroup_3()); }
	(rule__BinaryScalarRestriction__Group_3__0)?
	{ after(grammarAccess.getBinaryScalarRestrictionAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryScalarRestriction__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BinaryScalarRestriction__Group__4__Impl
	rule__BinaryScalarRestriction__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryScalarRestriction__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBinaryScalarRestrictionAccess().getGroup_4()); }
	(rule__BinaryScalarRestriction__Group_4__0)?
	{ after(grammarAccess.getBinaryScalarRestrictionAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryScalarRestriction__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BinaryScalarRestriction__Group__5__Impl
	rule__BinaryScalarRestriction__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryScalarRestriction__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBinaryScalarRestrictionAccess().getGroup_5()); }
	(rule__BinaryScalarRestriction__Group_5__0)?
	{ after(grammarAccess.getBinaryScalarRestrictionAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryScalarRestriction__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BinaryScalarRestriction__Group__6__Impl
	rule__BinaryScalarRestriction__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryScalarRestriction__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBinaryScalarRestrictionAccess().getRestrictedRangeKeyword_6()); }
	'restrictedRange'
	{ after(grammarAccess.getBinaryScalarRestrictionAccess().getRestrictedRangeKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryScalarRestriction__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BinaryScalarRestriction__Group__7__Impl
	rule__BinaryScalarRestriction__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryScalarRestriction__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBinaryScalarRestrictionAccess().getRestrictedRangeAssignment_7()); }
	(rule__BinaryScalarRestriction__RestrictedRangeAssignment_7)
	{ after(grammarAccess.getBinaryScalarRestrictionAccess().getRestrictedRangeAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryScalarRestriction__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BinaryScalarRestriction__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryScalarRestriction__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBinaryScalarRestrictionAccess().getRCURLYTerminalRuleCall_8()); }
	RULE_RCURLY
	{ after(grammarAccess.getBinaryScalarRestrictionAccess().getRCURLYTerminalRuleCall_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BinaryScalarRestriction__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BinaryScalarRestriction__Group_3__0__Impl
	rule__BinaryScalarRestriction__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryScalarRestriction__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBinaryScalarRestrictionAccess().getLengthKeyword_3_0()); }
	'length'
	{ after(grammarAccess.getBinaryScalarRestrictionAccess().getLengthKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryScalarRestriction__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BinaryScalarRestriction__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryScalarRestriction__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBinaryScalarRestrictionAccess().getLengthAssignment_3_1()); }
	(rule__BinaryScalarRestriction__LengthAssignment_3_1)
	{ after(grammarAccess.getBinaryScalarRestrictionAccess().getLengthAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BinaryScalarRestriction__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BinaryScalarRestriction__Group_4__0__Impl
	rule__BinaryScalarRestriction__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryScalarRestriction__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBinaryScalarRestrictionAccess().getMinLengthKeyword_4_0()); }
	'minLength'
	{ after(grammarAccess.getBinaryScalarRestrictionAccess().getMinLengthKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryScalarRestriction__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BinaryScalarRestriction__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryScalarRestriction__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBinaryScalarRestrictionAccess().getMinLengthAssignment_4_1()); }
	(rule__BinaryScalarRestriction__MinLengthAssignment_4_1)
	{ after(grammarAccess.getBinaryScalarRestrictionAccess().getMinLengthAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BinaryScalarRestriction__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BinaryScalarRestriction__Group_5__0__Impl
	rule__BinaryScalarRestriction__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryScalarRestriction__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBinaryScalarRestrictionAccess().getMaxLengthKeyword_5_0()); }
	'maxLength'
	{ after(grammarAccess.getBinaryScalarRestrictionAccess().getMaxLengthKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryScalarRestriction__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BinaryScalarRestriction__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryScalarRestriction__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBinaryScalarRestrictionAccess().getMaxLengthAssignment_5_1()); }
	(rule__BinaryScalarRestriction__MaxLengthAssignment_5_1)
	{ after(grammarAccess.getBinaryScalarRestrictionAccess().getMaxLengthAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IRIScalarRestriction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IRIScalarRestriction__Group__0__Impl
	rule__IRIScalarRestriction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IRIScalarRestriction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIRIScalarRestrictionAccess().getIRI_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0()); }
	RULE_IRI_SCALAR_RESTRICTION_TOKEN
	{ after(grammarAccess.getIRIScalarRestrictionAccess().getIRI_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IRIScalarRestriction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IRIScalarRestriction__Group__1__Impl
	rule__IRIScalarRestriction__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__IRIScalarRestriction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIRIScalarRestrictionAccess().getNameAssignment_1()); }
	(rule__IRIScalarRestriction__NameAssignment_1)
	{ after(grammarAccess.getIRIScalarRestrictionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IRIScalarRestriction__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IRIScalarRestriction__Group__2__Impl
	rule__IRIScalarRestriction__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__IRIScalarRestriction__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIRIScalarRestrictionAccess().getLCURLYTerminalRuleCall_2()); }
	RULE_LCURLY
	{ after(grammarAccess.getIRIScalarRestrictionAccess().getLCURLYTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IRIScalarRestriction__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IRIScalarRestriction__Group__3__Impl
	rule__IRIScalarRestriction__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__IRIScalarRestriction__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIRIScalarRestrictionAccess().getGroup_3()); }
	(rule__IRIScalarRestriction__Group_3__0)?
	{ after(grammarAccess.getIRIScalarRestrictionAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IRIScalarRestriction__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IRIScalarRestriction__Group__4__Impl
	rule__IRIScalarRestriction__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__IRIScalarRestriction__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIRIScalarRestrictionAccess().getGroup_4()); }
	(rule__IRIScalarRestriction__Group_4__0)?
	{ after(grammarAccess.getIRIScalarRestrictionAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IRIScalarRestriction__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IRIScalarRestriction__Group__5__Impl
	rule__IRIScalarRestriction__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__IRIScalarRestriction__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIRIScalarRestrictionAccess().getGroup_5()); }
	(rule__IRIScalarRestriction__Group_5__0)?
	{ after(grammarAccess.getIRIScalarRestrictionAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IRIScalarRestriction__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IRIScalarRestriction__Group__6__Impl
	rule__IRIScalarRestriction__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__IRIScalarRestriction__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIRIScalarRestrictionAccess().getGroup_6()); }
	(rule__IRIScalarRestriction__Group_6__0)?
	{ after(grammarAccess.getIRIScalarRestrictionAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IRIScalarRestriction__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IRIScalarRestriction__Group__7__Impl
	rule__IRIScalarRestriction__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__IRIScalarRestriction__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIRIScalarRestrictionAccess().getRestrictedRangeKeyword_7()); }
	'restrictedRange'
	{ after(grammarAccess.getIRIScalarRestrictionAccess().getRestrictedRangeKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IRIScalarRestriction__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IRIScalarRestriction__Group__8__Impl
	rule__IRIScalarRestriction__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__IRIScalarRestriction__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIRIScalarRestrictionAccess().getRestrictedRangeAssignment_8()); }
	(rule__IRIScalarRestriction__RestrictedRangeAssignment_8)
	{ after(grammarAccess.getIRIScalarRestrictionAccess().getRestrictedRangeAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IRIScalarRestriction__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IRIScalarRestriction__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IRIScalarRestriction__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIRIScalarRestrictionAccess().getRCURLYTerminalRuleCall_9()); }
	RULE_RCURLY
	{ after(grammarAccess.getIRIScalarRestrictionAccess().getRCURLYTerminalRuleCall_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IRIScalarRestriction__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IRIScalarRestriction__Group_3__0__Impl
	rule__IRIScalarRestriction__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IRIScalarRestriction__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIRIScalarRestrictionAccess().getLengthKeyword_3_0()); }
	'length'
	{ after(grammarAccess.getIRIScalarRestrictionAccess().getLengthKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IRIScalarRestriction__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IRIScalarRestriction__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IRIScalarRestriction__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIRIScalarRestrictionAccess().getLengthAssignment_3_1()); }
	(rule__IRIScalarRestriction__LengthAssignment_3_1)
	{ after(grammarAccess.getIRIScalarRestrictionAccess().getLengthAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IRIScalarRestriction__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IRIScalarRestriction__Group_4__0__Impl
	rule__IRIScalarRestriction__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IRIScalarRestriction__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIRIScalarRestrictionAccess().getMinLengthKeyword_4_0()); }
	'minLength'
	{ after(grammarAccess.getIRIScalarRestrictionAccess().getMinLengthKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IRIScalarRestriction__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IRIScalarRestriction__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IRIScalarRestriction__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIRIScalarRestrictionAccess().getMinLengthAssignment_4_1()); }
	(rule__IRIScalarRestriction__MinLengthAssignment_4_1)
	{ after(grammarAccess.getIRIScalarRestrictionAccess().getMinLengthAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IRIScalarRestriction__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IRIScalarRestriction__Group_5__0__Impl
	rule__IRIScalarRestriction__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IRIScalarRestriction__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIRIScalarRestrictionAccess().getMaxLengthKeyword_5_0()); }
	'maxLength'
	{ after(grammarAccess.getIRIScalarRestrictionAccess().getMaxLengthKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IRIScalarRestriction__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IRIScalarRestriction__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IRIScalarRestriction__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIRIScalarRestrictionAccess().getMaxLengthAssignment_5_1()); }
	(rule__IRIScalarRestriction__MaxLengthAssignment_5_1)
	{ after(grammarAccess.getIRIScalarRestrictionAccess().getMaxLengthAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IRIScalarRestriction__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IRIScalarRestriction__Group_6__0__Impl
	rule__IRIScalarRestriction__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IRIScalarRestriction__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIRIScalarRestrictionAccess().getPatternKeyword_6_0()); }
	'pattern'
	{ after(grammarAccess.getIRIScalarRestrictionAccess().getPatternKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IRIScalarRestriction__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IRIScalarRestriction__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IRIScalarRestriction__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIRIScalarRestrictionAccess().getPatternAssignment_6_1()); }
	(rule__IRIScalarRestriction__PatternAssignment_6_1)
	{ after(grammarAccess.getIRIScalarRestrictionAccess().getPatternAssignment_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NumericScalarRestriction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NumericScalarRestriction__Group__0__Impl
	rule__NumericScalarRestriction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericScalarRestriction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNumericScalarRestrictionAccess().getNUMERIC_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0()); }
	RULE_NUMERIC_SCALAR_RESTRICTION_TOKEN
	{ after(grammarAccess.getNumericScalarRestrictionAccess().getNUMERIC_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericScalarRestriction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NumericScalarRestriction__Group__1__Impl
	rule__NumericScalarRestriction__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericScalarRestriction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNumericScalarRestrictionAccess().getNameAssignment_1()); }
	(rule__NumericScalarRestriction__NameAssignment_1)
	{ after(grammarAccess.getNumericScalarRestrictionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericScalarRestriction__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NumericScalarRestriction__Group__2__Impl
	rule__NumericScalarRestriction__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericScalarRestriction__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNumericScalarRestrictionAccess().getLCURLYTerminalRuleCall_2()); }
	RULE_LCURLY
	{ after(grammarAccess.getNumericScalarRestrictionAccess().getLCURLYTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericScalarRestriction__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NumericScalarRestriction__Group__3__Impl
	rule__NumericScalarRestriction__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericScalarRestriction__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNumericScalarRestrictionAccess().getGroup_3()); }
	(rule__NumericScalarRestriction__Group_3__0)?
	{ after(grammarAccess.getNumericScalarRestrictionAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericScalarRestriction__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NumericScalarRestriction__Group__4__Impl
	rule__NumericScalarRestriction__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericScalarRestriction__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNumericScalarRestrictionAccess().getGroup_4()); }
	(rule__NumericScalarRestriction__Group_4__0)?
	{ after(grammarAccess.getNumericScalarRestrictionAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericScalarRestriction__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NumericScalarRestriction__Group__5__Impl
	rule__NumericScalarRestriction__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericScalarRestriction__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNumericScalarRestrictionAccess().getGroup_5()); }
	(rule__NumericScalarRestriction__Group_5__0)?
	{ after(grammarAccess.getNumericScalarRestrictionAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericScalarRestriction__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NumericScalarRestriction__Group__6__Impl
	rule__NumericScalarRestriction__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericScalarRestriction__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNumericScalarRestrictionAccess().getGroup_6()); }
	(rule__NumericScalarRestriction__Group_6__0)?
	{ after(grammarAccess.getNumericScalarRestrictionAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericScalarRestriction__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NumericScalarRestriction__Group__7__Impl
	rule__NumericScalarRestriction__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericScalarRestriction__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNumericScalarRestrictionAccess().getRestrictedRangeKeyword_7()); }
	'restrictedRange'
	{ after(grammarAccess.getNumericScalarRestrictionAccess().getRestrictedRangeKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericScalarRestriction__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NumericScalarRestriction__Group__8__Impl
	rule__NumericScalarRestriction__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericScalarRestriction__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNumericScalarRestrictionAccess().getRestrictedRangeAssignment_8()); }
	(rule__NumericScalarRestriction__RestrictedRangeAssignment_8)
	{ after(grammarAccess.getNumericScalarRestrictionAccess().getRestrictedRangeAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericScalarRestriction__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NumericScalarRestriction__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericScalarRestriction__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNumericScalarRestrictionAccess().getRCURLYTerminalRuleCall_9()); }
	RULE_RCURLY
	{ after(grammarAccess.getNumericScalarRestrictionAccess().getRCURLYTerminalRuleCall_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NumericScalarRestriction__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NumericScalarRestriction__Group_3__0__Impl
	rule__NumericScalarRestriction__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericScalarRestriction__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNumericScalarRestrictionAccess().getMinInclusiveKeyword_3_0()); }
	'minInclusive'
	{ after(grammarAccess.getNumericScalarRestrictionAccess().getMinInclusiveKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericScalarRestriction__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NumericScalarRestriction__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericScalarRestriction__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNumericScalarRestrictionAccess().getMinInclusiveAssignment_3_1()); }
	(rule__NumericScalarRestriction__MinInclusiveAssignment_3_1)
	{ after(grammarAccess.getNumericScalarRestrictionAccess().getMinInclusiveAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NumericScalarRestriction__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NumericScalarRestriction__Group_4__0__Impl
	rule__NumericScalarRestriction__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericScalarRestriction__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNumericScalarRestrictionAccess().getMaxInclusiveKeyword_4_0()); }
	'maxInclusive'
	{ after(grammarAccess.getNumericScalarRestrictionAccess().getMaxInclusiveKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericScalarRestriction__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NumericScalarRestriction__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericScalarRestriction__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNumericScalarRestrictionAccess().getMaxInclusiveAssignment_4_1()); }
	(rule__NumericScalarRestriction__MaxInclusiveAssignment_4_1)
	{ after(grammarAccess.getNumericScalarRestrictionAccess().getMaxInclusiveAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NumericScalarRestriction__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NumericScalarRestriction__Group_5__0__Impl
	rule__NumericScalarRestriction__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericScalarRestriction__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNumericScalarRestrictionAccess().getMinExclusiveKeyword_5_0()); }
	'minExclusive'
	{ after(grammarAccess.getNumericScalarRestrictionAccess().getMinExclusiveKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericScalarRestriction__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NumericScalarRestriction__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericScalarRestriction__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNumericScalarRestrictionAccess().getMinExclusiveAssignment_5_1()); }
	(rule__NumericScalarRestriction__MinExclusiveAssignment_5_1)
	{ after(grammarAccess.getNumericScalarRestrictionAccess().getMinExclusiveAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NumericScalarRestriction__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NumericScalarRestriction__Group_6__0__Impl
	rule__NumericScalarRestriction__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericScalarRestriction__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNumericScalarRestrictionAccess().getMaxExclusiveKeyword_6_0()); }
	'maxExclusive'
	{ after(grammarAccess.getNumericScalarRestrictionAccess().getMaxExclusiveKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericScalarRestriction__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NumericScalarRestriction__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericScalarRestriction__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNumericScalarRestrictionAccess().getMaxExclusiveAssignment_6_1()); }
	(rule__NumericScalarRestriction__MaxExclusiveAssignment_6_1)
	{ after(grammarAccess.getNumericScalarRestrictionAccess().getMaxExclusiveAssignment_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PlainLiteralScalarRestriction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlainLiteralScalarRestriction__Group__0__Impl
	rule__PlainLiteralScalarRestriction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlainLiteralScalarRestrictionAccess().getPLAIN_LITERAL_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0()); }
	RULE_PLAIN_LITERAL_SCALAR_RESTRICTION_TOKEN
	{ after(grammarAccess.getPlainLiteralScalarRestrictionAccess().getPLAIN_LITERAL_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlainLiteralScalarRestriction__Group__1__Impl
	rule__PlainLiteralScalarRestriction__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlainLiteralScalarRestrictionAccess().getNameAssignment_1()); }
	(rule__PlainLiteralScalarRestriction__NameAssignment_1)
	{ after(grammarAccess.getPlainLiteralScalarRestrictionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlainLiteralScalarRestriction__Group__2__Impl
	rule__PlainLiteralScalarRestriction__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlainLiteralScalarRestrictionAccess().getLCURLYTerminalRuleCall_2()); }
	RULE_LCURLY
	{ after(grammarAccess.getPlainLiteralScalarRestrictionAccess().getLCURLYTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlainLiteralScalarRestriction__Group__3__Impl
	rule__PlainLiteralScalarRestriction__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlainLiteralScalarRestrictionAccess().getGroup_3()); }
	(rule__PlainLiteralScalarRestriction__Group_3__0)?
	{ after(grammarAccess.getPlainLiteralScalarRestrictionAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlainLiteralScalarRestriction__Group__4__Impl
	rule__PlainLiteralScalarRestriction__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlainLiteralScalarRestrictionAccess().getGroup_4()); }
	(rule__PlainLiteralScalarRestriction__Group_4__0)?
	{ after(grammarAccess.getPlainLiteralScalarRestrictionAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlainLiteralScalarRestriction__Group__5__Impl
	rule__PlainLiteralScalarRestriction__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlainLiteralScalarRestrictionAccess().getGroup_5()); }
	(rule__PlainLiteralScalarRestriction__Group_5__0)?
	{ after(grammarAccess.getPlainLiteralScalarRestrictionAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlainLiteralScalarRestriction__Group__6__Impl
	rule__PlainLiteralScalarRestriction__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlainLiteralScalarRestrictionAccess().getGroup_6()); }
	(rule__PlainLiteralScalarRestriction__Group_6__0)?
	{ after(grammarAccess.getPlainLiteralScalarRestrictionAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlainLiteralScalarRestriction__Group__7__Impl
	rule__PlainLiteralScalarRestriction__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlainLiteralScalarRestrictionAccess().getGroup_7()); }
	(rule__PlainLiteralScalarRestriction__Group_7__0)?
	{ after(grammarAccess.getPlainLiteralScalarRestrictionAccess().getGroup_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlainLiteralScalarRestriction__Group__8__Impl
	rule__PlainLiteralScalarRestriction__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlainLiteralScalarRestrictionAccess().getRestrictedRangeKeyword_8()); }
	'restrictedRange'
	{ after(grammarAccess.getPlainLiteralScalarRestrictionAccess().getRestrictedRangeKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlainLiteralScalarRestriction__Group__9__Impl
	rule__PlainLiteralScalarRestriction__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlainLiteralScalarRestrictionAccess().getRestrictedRangeAssignment_9()); }
	(rule__PlainLiteralScalarRestriction__RestrictedRangeAssignment_9)
	{ after(grammarAccess.getPlainLiteralScalarRestrictionAccess().getRestrictedRangeAssignment_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlainLiteralScalarRestriction__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlainLiteralScalarRestrictionAccess().getRCURLYTerminalRuleCall_10()); }
	RULE_RCURLY
	{ after(grammarAccess.getPlainLiteralScalarRestrictionAccess().getRCURLYTerminalRuleCall_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PlainLiteralScalarRestriction__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlainLiteralScalarRestriction__Group_3__0__Impl
	rule__PlainLiteralScalarRestriction__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlainLiteralScalarRestrictionAccess().getLengthKeyword_3_0()); }
	'length'
	{ after(grammarAccess.getPlainLiteralScalarRestrictionAccess().getLengthKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlainLiteralScalarRestriction__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlainLiteralScalarRestrictionAccess().getLengthAssignment_3_1()); }
	(rule__PlainLiteralScalarRestriction__LengthAssignment_3_1)
	{ after(grammarAccess.getPlainLiteralScalarRestrictionAccess().getLengthAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PlainLiteralScalarRestriction__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlainLiteralScalarRestriction__Group_4__0__Impl
	rule__PlainLiteralScalarRestriction__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlainLiteralScalarRestrictionAccess().getMinLengthKeyword_4_0()); }
	'minLength'
	{ after(grammarAccess.getPlainLiteralScalarRestrictionAccess().getMinLengthKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlainLiteralScalarRestriction__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlainLiteralScalarRestrictionAccess().getMinLengthAssignment_4_1()); }
	(rule__PlainLiteralScalarRestriction__MinLengthAssignment_4_1)
	{ after(grammarAccess.getPlainLiteralScalarRestrictionAccess().getMinLengthAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PlainLiteralScalarRestriction__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlainLiteralScalarRestriction__Group_5__0__Impl
	rule__PlainLiteralScalarRestriction__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlainLiteralScalarRestrictionAccess().getMaxLengthKeyword_5_0()); }
	'maxLength'
	{ after(grammarAccess.getPlainLiteralScalarRestrictionAccess().getMaxLengthKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlainLiteralScalarRestriction__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlainLiteralScalarRestrictionAccess().getMaxLengthAssignment_5_1()); }
	(rule__PlainLiteralScalarRestriction__MaxLengthAssignment_5_1)
	{ after(grammarAccess.getPlainLiteralScalarRestrictionAccess().getMaxLengthAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PlainLiteralScalarRestriction__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlainLiteralScalarRestriction__Group_6__0__Impl
	rule__PlainLiteralScalarRestriction__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlainLiteralScalarRestrictionAccess().getPatternKeyword_6_0()); }
	'pattern'
	{ after(grammarAccess.getPlainLiteralScalarRestrictionAccess().getPatternKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlainLiteralScalarRestriction__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlainLiteralScalarRestrictionAccess().getPatternAssignment_6_1()); }
	(rule__PlainLiteralScalarRestriction__PatternAssignment_6_1)
	{ after(grammarAccess.getPlainLiteralScalarRestrictionAccess().getPatternAssignment_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PlainLiteralScalarRestriction__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlainLiteralScalarRestriction__Group_7__0__Impl
	rule__PlainLiteralScalarRestriction__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlainLiteralScalarRestrictionAccess().getLangRangeKeyword_7_0()); }
	'langRange'
	{ after(grammarAccess.getPlainLiteralScalarRestrictionAccess().getLangRangeKeyword_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlainLiteralScalarRestriction__Group_7__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlainLiteralScalarRestrictionAccess().getLangRangeAssignment_7_1()); }
	(rule__PlainLiteralScalarRestriction__LangRangeAssignment_7_1)
	{ after(grammarAccess.getPlainLiteralScalarRestrictionAccess().getLangRangeAssignment_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ScalarOneOfRestriction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScalarOneOfRestriction__Group__0__Impl
	rule__ScalarOneOfRestriction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarOneOfRestriction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScalarOneOfRestrictionAccess().getSCALAR_ONE_OF_RESTRICTION_TOKENTerminalRuleCall_0()); }
	RULE_SCALAR_ONE_OF_RESTRICTION_TOKEN
	{ after(grammarAccess.getScalarOneOfRestrictionAccess().getSCALAR_ONE_OF_RESTRICTION_TOKENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarOneOfRestriction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScalarOneOfRestriction__Group__1__Impl
	rule__ScalarOneOfRestriction__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarOneOfRestriction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScalarOneOfRestrictionAccess().getNameAssignment_1()); }
	(rule__ScalarOneOfRestriction__NameAssignment_1)
	{ after(grammarAccess.getScalarOneOfRestrictionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarOneOfRestriction__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScalarOneOfRestriction__Group__2__Impl
	rule__ScalarOneOfRestriction__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarOneOfRestriction__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScalarOneOfRestrictionAccess().getLCURLYTerminalRuleCall_2()); }
	RULE_LCURLY
	{ after(grammarAccess.getScalarOneOfRestrictionAccess().getLCURLYTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarOneOfRestriction__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScalarOneOfRestriction__Group__3__Impl
	rule__ScalarOneOfRestriction__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarOneOfRestriction__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScalarOneOfRestrictionAccess().getRestrictedRangeKeyword_3()); }
	'restrictedRange'
	{ after(grammarAccess.getScalarOneOfRestrictionAccess().getRestrictedRangeKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarOneOfRestriction__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScalarOneOfRestriction__Group__4__Impl
	rule__ScalarOneOfRestriction__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarOneOfRestriction__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScalarOneOfRestrictionAccess().getRestrictedRangeAssignment_4()); }
	(rule__ScalarOneOfRestriction__RestrictedRangeAssignment_4)
	{ after(grammarAccess.getScalarOneOfRestrictionAccess().getRestrictedRangeAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarOneOfRestriction__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScalarOneOfRestriction__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarOneOfRestriction__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScalarOneOfRestrictionAccess().getRCURLYTerminalRuleCall_5()); }
	RULE_RCURLY
	{ after(grammarAccess.getScalarOneOfRestrictionAccess().getRCURLYTerminalRuleCall_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ScalarOneOfLiteralAxiom__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScalarOneOfLiteralAxiom__Group__0__Impl
	rule__ScalarOneOfLiteralAxiom__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarOneOfLiteralAxiom__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScalarOneOfLiteralAxiomAccess().getSCALAR_ONE_OF_LITERAL_AXIOM_TOKENTerminalRuleCall_0()); }
	RULE_SCALAR_ONE_OF_LITERAL_AXIOM_TOKEN
	{ after(grammarAccess.getScalarOneOfLiteralAxiomAccess().getSCALAR_ONE_OF_LITERAL_AXIOM_TOKENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarOneOfLiteralAxiom__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScalarOneOfLiteralAxiom__Group__1__Impl
	rule__ScalarOneOfLiteralAxiom__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarOneOfLiteralAxiom__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScalarOneOfLiteralAxiomAccess().getLCURLYTerminalRuleCall_1()); }
	RULE_LCURLY
	{ after(grammarAccess.getScalarOneOfLiteralAxiomAccess().getLCURLYTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarOneOfLiteralAxiom__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScalarOneOfLiteralAxiom__Group__2__Impl
	rule__ScalarOneOfLiteralAxiom__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarOneOfLiteralAxiom__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScalarOneOfLiteralAxiomAccess().getValueKeyword_2()); }
	'value'
	{ after(grammarAccess.getScalarOneOfLiteralAxiomAccess().getValueKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarOneOfLiteralAxiom__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScalarOneOfLiteralAxiom__Group__3__Impl
	rule__ScalarOneOfLiteralAxiom__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarOneOfLiteralAxiom__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScalarOneOfLiteralAxiomAccess().getValueAssignment_3()); }
	(rule__ScalarOneOfLiteralAxiom__ValueAssignment_3)
	{ after(grammarAccess.getScalarOneOfLiteralAxiomAccess().getValueAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarOneOfLiteralAxiom__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScalarOneOfLiteralAxiom__Group__4__Impl
	rule__ScalarOneOfLiteralAxiom__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarOneOfLiteralAxiom__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScalarOneOfLiteralAxiomAccess().getAxiomKeyword_4()); }
	'axiom'
	{ after(grammarAccess.getScalarOneOfLiteralAxiomAccess().getAxiomKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarOneOfLiteralAxiom__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScalarOneOfLiteralAxiom__Group__5__Impl
	rule__ScalarOneOfLiteralAxiom__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarOneOfLiteralAxiom__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScalarOneOfLiteralAxiomAccess().getAxiomAssignment_5()); }
	(rule__ScalarOneOfLiteralAxiom__AxiomAssignment_5)
	{ after(grammarAccess.getScalarOneOfLiteralAxiomAccess().getAxiomAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarOneOfLiteralAxiom__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScalarOneOfLiteralAxiom__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarOneOfLiteralAxiom__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScalarOneOfLiteralAxiomAccess().getRCURLYTerminalRuleCall_6()); }
	RULE_RCURLY
	{ after(grammarAccess.getScalarOneOfLiteralAxiomAccess().getRCURLYTerminalRuleCall_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StringScalarRestriction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringScalarRestriction__Group__0__Impl
	rule__StringScalarRestriction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StringScalarRestriction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringScalarRestrictionAccess().getSTRING_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0()); }
	RULE_STRING_SCALAR_RESTRICTION_TOKEN
	{ after(grammarAccess.getStringScalarRestrictionAccess().getSTRING_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringScalarRestriction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringScalarRestriction__Group__1__Impl
	rule__StringScalarRestriction__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StringScalarRestriction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringScalarRestrictionAccess().getNameAssignment_1()); }
	(rule__StringScalarRestriction__NameAssignment_1)
	{ after(grammarAccess.getStringScalarRestrictionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringScalarRestriction__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringScalarRestriction__Group__2__Impl
	rule__StringScalarRestriction__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__StringScalarRestriction__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringScalarRestrictionAccess().getLCURLYTerminalRuleCall_2()); }
	RULE_LCURLY
	{ after(grammarAccess.getStringScalarRestrictionAccess().getLCURLYTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringScalarRestriction__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringScalarRestriction__Group__3__Impl
	rule__StringScalarRestriction__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__StringScalarRestriction__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringScalarRestrictionAccess().getGroup_3()); }
	(rule__StringScalarRestriction__Group_3__0)?
	{ after(grammarAccess.getStringScalarRestrictionAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringScalarRestriction__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringScalarRestriction__Group__4__Impl
	rule__StringScalarRestriction__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__StringScalarRestriction__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringScalarRestrictionAccess().getGroup_4()); }
	(rule__StringScalarRestriction__Group_4__0)?
	{ after(grammarAccess.getStringScalarRestrictionAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringScalarRestriction__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringScalarRestriction__Group__5__Impl
	rule__StringScalarRestriction__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__StringScalarRestriction__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringScalarRestrictionAccess().getGroup_5()); }
	(rule__StringScalarRestriction__Group_5__0)?
	{ after(grammarAccess.getStringScalarRestrictionAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringScalarRestriction__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringScalarRestriction__Group__6__Impl
	rule__StringScalarRestriction__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__StringScalarRestriction__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringScalarRestrictionAccess().getGroup_6()); }
	(rule__StringScalarRestriction__Group_6__0)?
	{ after(grammarAccess.getStringScalarRestrictionAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringScalarRestriction__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringScalarRestriction__Group__7__Impl
	rule__StringScalarRestriction__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__StringScalarRestriction__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringScalarRestrictionAccess().getRestrictedRangeKeyword_7()); }
	'restrictedRange'
	{ after(grammarAccess.getStringScalarRestrictionAccess().getRestrictedRangeKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringScalarRestriction__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringScalarRestriction__Group__8__Impl
	rule__StringScalarRestriction__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__StringScalarRestriction__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringScalarRestrictionAccess().getRestrictedRangeAssignment_8()); }
	(rule__StringScalarRestriction__RestrictedRangeAssignment_8)
	{ after(grammarAccess.getStringScalarRestrictionAccess().getRestrictedRangeAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringScalarRestriction__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringScalarRestriction__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StringScalarRestriction__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringScalarRestrictionAccess().getRCURLYTerminalRuleCall_9()); }
	RULE_RCURLY
	{ after(grammarAccess.getStringScalarRestrictionAccess().getRCURLYTerminalRuleCall_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StringScalarRestriction__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringScalarRestriction__Group_3__0__Impl
	rule__StringScalarRestriction__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StringScalarRestriction__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringScalarRestrictionAccess().getLengthKeyword_3_0()); }
	'length'
	{ after(grammarAccess.getStringScalarRestrictionAccess().getLengthKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringScalarRestriction__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringScalarRestriction__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StringScalarRestriction__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringScalarRestrictionAccess().getLengthAssignment_3_1()); }
	(rule__StringScalarRestriction__LengthAssignment_3_1)
	{ after(grammarAccess.getStringScalarRestrictionAccess().getLengthAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StringScalarRestriction__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringScalarRestriction__Group_4__0__Impl
	rule__StringScalarRestriction__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StringScalarRestriction__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringScalarRestrictionAccess().getMinLengthKeyword_4_0()); }
	'minLength'
	{ after(grammarAccess.getStringScalarRestrictionAccess().getMinLengthKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringScalarRestriction__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringScalarRestriction__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StringScalarRestriction__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringScalarRestrictionAccess().getMinLengthAssignment_4_1()); }
	(rule__StringScalarRestriction__MinLengthAssignment_4_1)
	{ after(grammarAccess.getStringScalarRestrictionAccess().getMinLengthAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StringScalarRestriction__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringScalarRestriction__Group_5__0__Impl
	rule__StringScalarRestriction__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StringScalarRestriction__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringScalarRestrictionAccess().getMaxLengthKeyword_5_0()); }
	'maxLength'
	{ after(grammarAccess.getStringScalarRestrictionAccess().getMaxLengthKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringScalarRestriction__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringScalarRestriction__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StringScalarRestriction__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringScalarRestrictionAccess().getMaxLengthAssignment_5_1()); }
	(rule__StringScalarRestriction__MaxLengthAssignment_5_1)
	{ after(grammarAccess.getStringScalarRestrictionAccess().getMaxLengthAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StringScalarRestriction__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringScalarRestriction__Group_6__0__Impl
	rule__StringScalarRestriction__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StringScalarRestriction__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringScalarRestrictionAccess().getPatternKeyword_6_0()); }
	'pattern'
	{ after(grammarAccess.getStringScalarRestrictionAccess().getPatternKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringScalarRestriction__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringScalarRestriction__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StringScalarRestriction__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringScalarRestrictionAccess().getPatternAssignment_6_1()); }
	(rule__StringScalarRestriction__PatternAssignment_6_1)
	{ after(grammarAccess.getStringScalarRestrictionAccess().getPatternAssignment_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SynonymScalarRestriction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SynonymScalarRestriction__Group__0__Impl
	rule__SynonymScalarRestriction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SynonymScalarRestriction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSynonymScalarRestrictionAccess().getSYNONYM_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0()); }
	RULE_SYNONYM_SCALAR_RESTRICTION_TOKEN
	{ after(grammarAccess.getSynonymScalarRestrictionAccess().getSYNONYM_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SynonymScalarRestriction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SynonymScalarRestriction__Group__1__Impl
	rule__SynonymScalarRestriction__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SynonymScalarRestriction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSynonymScalarRestrictionAccess().getNameAssignment_1()); }
	(rule__SynonymScalarRestriction__NameAssignment_1)
	{ after(grammarAccess.getSynonymScalarRestrictionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SynonymScalarRestriction__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SynonymScalarRestriction__Group__2__Impl
	rule__SynonymScalarRestriction__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SynonymScalarRestriction__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSynonymScalarRestrictionAccess().getLCURLYTerminalRuleCall_2()); }
	RULE_LCURLY
	{ after(grammarAccess.getSynonymScalarRestrictionAccess().getLCURLYTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SynonymScalarRestriction__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SynonymScalarRestriction__Group__3__Impl
	rule__SynonymScalarRestriction__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SynonymScalarRestriction__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSynonymScalarRestrictionAccess().getRestrictedRangeKeyword_3()); }
	'restrictedRange'
	{ after(grammarAccess.getSynonymScalarRestrictionAccess().getRestrictedRangeKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SynonymScalarRestriction__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SynonymScalarRestriction__Group__4__Impl
	rule__SynonymScalarRestriction__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__SynonymScalarRestriction__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSynonymScalarRestrictionAccess().getRestrictedRangeAssignment_4()); }
	(rule__SynonymScalarRestriction__RestrictedRangeAssignment_4)
	{ after(grammarAccess.getSynonymScalarRestrictionAccess().getRestrictedRangeAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SynonymScalarRestriction__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SynonymScalarRestriction__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SynonymScalarRestriction__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSynonymScalarRestrictionAccess().getRCURLYTerminalRuleCall_5()); }
	RULE_RCURLY
	{ after(grammarAccess.getSynonymScalarRestrictionAccess().getRCURLYTerminalRuleCall_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TimeScalarRestriction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimeScalarRestriction__Group__0__Impl
	rule__TimeScalarRestriction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeScalarRestriction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeScalarRestrictionAccess().getTIME_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0()); }
	RULE_TIME_SCALAR_RESTRICTION_TOKEN
	{ after(grammarAccess.getTimeScalarRestrictionAccess().getTIME_SCALAR_RESTRICTION_TOKENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeScalarRestriction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimeScalarRestriction__Group__1__Impl
	rule__TimeScalarRestriction__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeScalarRestriction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeScalarRestrictionAccess().getNameAssignment_1()); }
	(rule__TimeScalarRestriction__NameAssignment_1)
	{ after(grammarAccess.getTimeScalarRestrictionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeScalarRestriction__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimeScalarRestriction__Group__2__Impl
	rule__TimeScalarRestriction__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeScalarRestriction__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeScalarRestrictionAccess().getLCURLYTerminalRuleCall_2()); }
	RULE_LCURLY
	{ after(grammarAccess.getTimeScalarRestrictionAccess().getLCURLYTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeScalarRestriction__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimeScalarRestriction__Group__3__Impl
	rule__TimeScalarRestriction__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeScalarRestriction__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeScalarRestrictionAccess().getGroup_3()); }
	(rule__TimeScalarRestriction__Group_3__0)?
	{ after(grammarAccess.getTimeScalarRestrictionAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeScalarRestriction__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimeScalarRestriction__Group__4__Impl
	rule__TimeScalarRestriction__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeScalarRestriction__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeScalarRestrictionAccess().getGroup_4()); }
	(rule__TimeScalarRestriction__Group_4__0)?
	{ after(grammarAccess.getTimeScalarRestrictionAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeScalarRestriction__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimeScalarRestriction__Group__5__Impl
	rule__TimeScalarRestriction__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeScalarRestriction__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeScalarRestrictionAccess().getGroup_5()); }
	(rule__TimeScalarRestriction__Group_5__0)?
	{ after(grammarAccess.getTimeScalarRestrictionAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeScalarRestriction__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimeScalarRestriction__Group__6__Impl
	rule__TimeScalarRestriction__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeScalarRestriction__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeScalarRestrictionAccess().getGroup_6()); }
	(rule__TimeScalarRestriction__Group_6__0)?
	{ after(grammarAccess.getTimeScalarRestrictionAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeScalarRestriction__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimeScalarRestriction__Group__7__Impl
	rule__TimeScalarRestriction__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeScalarRestriction__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeScalarRestrictionAccess().getRestrictedRangeKeyword_7()); }
	'restrictedRange'
	{ after(grammarAccess.getTimeScalarRestrictionAccess().getRestrictedRangeKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeScalarRestriction__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimeScalarRestriction__Group__8__Impl
	rule__TimeScalarRestriction__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeScalarRestriction__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeScalarRestrictionAccess().getRestrictedRangeAssignment_8()); }
	(rule__TimeScalarRestriction__RestrictedRangeAssignment_8)
	{ after(grammarAccess.getTimeScalarRestrictionAccess().getRestrictedRangeAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeScalarRestriction__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimeScalarRestriction__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeScalarRestriction__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeScalarRestrictionAccess().getRCURLYTerminalRuleCall_9()); }
	RULE_RCURLY
	{ after(grammarAccess.getTimeScalarRestrictionAccess().getRCURLYTerminalRuleCall_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TimeScalarRestriction__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimeScalarRestriction__Group_3__0__Impl
	rule__TimeScalarRestriction__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeScalarRestriction__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeScalarRestrictionAccess().getMinInclusiveKeyword_3_0()); }
	'minInclusive'
	{ after(grammarAccess.getTimeScalarRestrictionAccess().getMinInclusiveKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeScalarRestriction__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimeScalarRestriction__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeScalarRestriction__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeScalarRestrictionAccess().getMinInclusiveAssignment_3_1()); }
	(rule__TimeScalarRestriction__MinInclusiveAssignment_3_1)
	{ after(grammarAccess.getTimeScalarRestrictionAccess().getMinInclusiveAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TimeScalarRestriction__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimeScalarRestriction__Group_4__0__Impl
	rule__TimeScalarRestriction__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeScalarRestriction__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeScalarRestrictionAccess().getMaxInclusiveKeyword_4_0()); }
	'maxInclusive'
	{ after(grammarAccess.getTimeScalarRestrictionAccess().getMaxInclusiveKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeScalarRestriction__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimeScalarRestriction__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeScalarRestriction__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeScalarRestrictionAccess().getMaxInclusiveAssignment_4_1()); }
	(rule__TimeScalarRestriction__MaxInclusiveAssignment_4_1)
	{ after(grammarAccess.getTimeScalarRestrictionAccess().getMaxInclusiveAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TimeScalarRestriction__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimeScalarRestriction__Group_5__0__Impl
	rule__TimeScalarRestriction__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeScalarRestriction__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeScalarRestrictionAccess().getMinExclusiveKeyword_5_0()); }
	'minExclusive'
	{ after(grammarAccess.getTimeScalarRestrictionAccess().getMinExclusiveKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeScalarRestriction__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimeScalarRestriction__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeScalarRestriction__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeScalarRestrictionAccess().getMinExclusiveAssignment_5_1()); }
	(rule__TimeScalarRestriction__MinExclusiveAssignment_5_1)
	{ after(grammarAccess.getTimeScalarRestrictionAccess().getMinExclusiveAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TimeScalarRestriction__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimeScalarRestriction__Group_6__0__Impl
	rule__TimeScalarRestriction__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeScalarRestriction__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeScalarRestrictionAccess().getMaxExclusiveKeyword_6_0()); }
	'maxExclusive'
	{ after(grammarAccess.getTimeScalarRestrictionAccess().getMaxExclusiveKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeScalarRestriction__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TimeScalarRestriction__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeScalarRestriction__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeScalarRestrictionAccess().getMaxExclusiveAssignment_6_1()); }
	(rule__TimeScalarRestriction__MaxExclusiveAssignment_6_1)
	{ after(grammarAccess.getTimeScalarRestrictionAccess().getMaxExclusiveAssignment_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DescriptionBox__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DescriptionBox__Group__0__Impl
	rule__DescriptionBox__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DescriptionBox__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDescriptionBoxAccess().getKindAssignment_0()); }
	(rule__DescriptionBox__KindAssignment_0)
	{ after(grammarAccess.getDescriptionBoxAccess().getKindAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DescriptionBox__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DescriptionBox__Group__1__Impl
	rule__DescriptionBox__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DescriptionBox__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDescriptionBoxAccess().getDESCRIPTION_BOX_TOKENTerminalRuleCall_1()); }
	RULE_DESCRIPTION_BOX_TOKEN
	{ after(grammarAccess.getDescriptionBoxAccess().getDESCRIPTION_BOX_TOKENTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DescriptionBox__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DescriptionBox__Group__2__Impl
	rule__DescriptionBox__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DescriptionBox__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDescriptionBoxAccess().getIriAssignment_2()); }
	(rule__DescriptionBox__IriAssignment_2)
	{ after(grammarAccess.getDescriptionBoxAccess().getIriAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DescriptionBox__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DescriptionBox__Group__3__Impl
	rule__DescriptionBox__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DescriptionBox__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDescriptionBoxAccess().getLCURLYTerminalRuleCall_3()); }
	RULE_LCURLY
	{ after(grammarAccess.getDescriptionBoxAccess().getLCURLYTerminalRuleCall_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DescriptionBox__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DescriptionBox__Group__4__Impl
	rule__DescriptionBox__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__DescriptionBox__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDescriptionBoxAccess().getAlternatives_4()); }
	(rule__DescriptionBox__Alternatives_4)*
	{ after(grammarAccess.getDescriptionBoxAccess().getAlternatives_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DescriptionBox__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DescriptionBox__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DescriptionBox__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDescriptionBoxAccess().getRCURLYTerminalRuleCall_5()); }
	RULE_RCURLY
	{ after(grammarAccess.getDescriptionBoxAccess().getRCURLYTerminalRuleCall_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DescriptionBoxExtendsClosedWorldDefinitions__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DescriptionBoxExtendsClosedWorldDefinitions__Group__0__Impl
	rule__DescriptionBoxExtendsClosedWorldDefinitions__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DescriptionBoxExtendsClosedWorldDefinitions__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDescriptionBoxExtendsClosedWorldDefinitionsAccess().getEXTENDS_TOKENTerminalRuleCall_0()); }
	RULE_EXTENDS_TOKEN
	{ after(grammarAccess.getDescriptionBoxExtendsClosedWorldDefinitionsAccess().getEXTENDS_TOKENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DescriptionBoxExtendsClosedWorldDefinitions__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DescriptionBoxExtendsClosedWorldDefinitions__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DescriptionBoxExtendsClosedWorldDefinitions__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDescriptionBoxExtendsClosedWorldDefinitionsAccess().getClosedWorldDefinitionsAssignment_1()); }
	(rule__DescriptionBoxExtendsClosedWorldDefinitions__ClosedWorldDefinitionsAssignment_1)
	{ after(grammarAccess.getDescriptionBoxExtendsClosedWorldDefinitionsAccess().getClosedWorldDefinitionsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DescriptionBoxRefinement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DescriptionBoxRefinement__Group__0__Impl
	rule__DescriptionBoxRefinement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DescriptionBoxRefinement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDescriptionBoxRefinementAccess().getREFINES_TOKENTerminalRuleCall_0()); }
	RULE_REFINES_TOKEN
	{ after(grammarAccess.getDescriptionBoxRefinementAccess().getREFINES_TOKENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DescriptionBoxRefinement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DescriptionBoxRefinement__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DescriptionBoxRefinement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDescriptionBoxRefinementAccess().getRefinedDescriptionBoxAssignment_1()); }
	(rule__DescriptionBoxRefinement__RefinedDescriptionBoxAssignment_1)
	{ after(grammarAccess.getDescriptionBoxRefinementAccess().getRefinedDescriptionBoxAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ScalarDataPropertyValue__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScalarDataPropertyValue__Group__0__Impl
	rule__ScalarDataPropertyValue__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarDataPropertyValue__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScalarDataPropertyValueAccess().getScalarDataPropertyValueKeyword_0()); }
	'ScalarDataPropertyValue'
	{ after(grammarAccess.getScalarDataPropertyValueAccess().getScalarDataPropertyValueKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarDataPropertyValue__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScalarDataPropertyValue__Group__1__Impl
	rule__ScalarDataPropertyValue__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarDataPropertyValue__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScalarDataPropertyValueAccess().getLCURLYTerminalRuleCall_1()); }
	RULE_LCURLY
	{ after(grammarAccess.getScalarDataPropertyValueAccess().getLCURLYTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarDataPropertyValue__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScalarDataPropertyValue__Group__2__Impl
	rule__ScalarDataPropertyValue__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarDataPropertyValue__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScalarDataPropertyValueAccess().getScalarPropertyValueKeyword_2()); }
	'scalarPropertyValue'
	{ after(grammarAccess.getScalarDataPropertyValueAccess().getScalarPropertyValueKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarDataPropertyValue__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScalarDataPropertyValue__Group__3__Impl
	rule__ScalarDataPropertyValue__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarDataPropertyValue__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScalarDataPropertyValueAccess().getScalarPropertyValueAssignment_3()); }
	(rule__ScalarDataPropertyValue__ScalarPropertyValueAssignment_3)
	{ after(grammarAccess.getScalarDataPropertyValueAccess().getScalarPropertyValueAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarDataPropertyValue__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScalarDataPropertyValue__Group__4__Impl
	rule__ScalarDataPropertyValue__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarDataPropertyValue__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScalarDataPropertyValueAccess().getScalarDataPropertyKeyword_4()); }
	'scalarDataProperty'
	{ after(grammarAccess.getScalarDataPropertyValueAccess().getScalarDataPropertyKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarDataPropertyValue__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScalarDataPropertyValue__Group__5__Impl
	rule__ScalarDataPropertyValue__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarDataPropertyValue__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScalarDataPropertyValueAccess().getScalarDataPropertyAssignment_5()); }
	(rule__ScalarDataPropertyValue__ScalarDataPropertyAssignment_5)
	{ after(grammarAccess.getScalarDataPropertyValueAccess().getScalarDataPropertyAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarDataPropertyValue__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ScalarDataPropertyValue__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarDataPropertyValue__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScalarDataPropertyValueAccess().getRCURLYTerminalRuleCall_6()); }
	RULE_RCURLY
	{ after(grammarAccess.getScalarDataPropertyValueAccess().getRCURLYTerminalRuleCall_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StructuredDataPropertyValue__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StructuredDataPropertyValue__Group__0__Impl
	rule__StructuredDataPropertyValue__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuredDataPropertyValue__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStructuredDataPropertyValueAccess().getStructuredDataPropertyValueKeyword_0()); }
	'StructuredDataPropertyValue'
	{ after(grammarAccess.getStructuredDataPropertyValueAccess().getStructuredDataPropertyValueKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuredDataPropertyValue__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StructuredDataPropertyValue__Group__1__Impl
	rule__StructuredDataPropertyValue__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuredDataPropertyValue__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStructuredDataPropertyValueAccess().getLCURLYTerminalRuleCall_1()); }
	RULE_LCURLY
	{ after(grammarAccess.getStructuredDataPropertyValueAccess().getLCURLYTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuredDataPropertyValue__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StructuredDataPropertyValue__Group__2__Impl
	rule__StructuredDataPropertyValue__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuredDataPropertyValue__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStructuredDataPropertyValueAccess().getStructuredDataPropertyKeyword_2()); }
	'structuredDataProperty'
	{ after(grammarAccess.getStructuredDataPropertyValueAccess().getStructuredDataPropertyKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuredDataPropertyValue__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StructuredDataPropertyValue__Group__3__Impl
	rule__StructuredDataPropertyValue__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuredDataPropertyValue__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStructuredDataPropertyValueAccess().getStructuredDataPropertyAssignment_3()); }
	(rule__StructuredDataPropertyValue__StructuredDataPropertyAssignment_3)
	{ after(grammarAccess.getStructuredDataPropertyValueAccess().getStructuredDataPropertyAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuredDataPropertyValue__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StructuredDataPropertyValue__Group__4__Impl
	rule__StructuredDataPropertyValue__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuredDataPropertyValue__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStructuredDataPropertyValueAccess().getStructuredPropertyTupleKeyword_4()); }
	'structuredPropertyTuple'
	{ after(grammarAccess.getStructuredDataPropertyValueAccess().getStructuredPropertyTupleKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuredDataPropertyValue__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StructuredDataPropertyValue__Group__5__Impl
	rule__StructuredDataPropertyValue__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuredDataPropertyValue__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStructuredDataPropertyValueAccess().getStructuredPropertyTupleAssignment_5()); }
	(rule__StructuredDataPropertyValue__StructuredPropertyTupleAssignment_5)
	{ after(grammarAccess.getStructuredDataPropertyValueAccess().getStructuredPropertyTupleAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuredDataPropertyValue__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StructuredDataPropertyValue__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuredDataPropertyValue__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStructuredDataPropertyValueAccess().getRCURLYTerminalRuleCall_6()); }
	RULE_RCURLY
	{ after(grammarAccess.getStructuredDataPropertyValueAccess().getRCURLYTerminalRuleCall_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DataStructureTuple__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataStructureTuple__Group__0__Impl
	rule__DataStructureTuple__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataStructureTuple__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataStructureTupleAccess().getDataStructureTupleKeyword_0()); }
	'DataStructureTuple'
	{ after(grammarAccess.getDataStructureTupleAccess().getDataStructureTupleKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataStructureTuple__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataStructureTuple__Group__1__Impl
	rule__DataStructureTuple__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DataStructureTuple__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataStructureTupleAccess().getLCURLYTerminalRuleCall_1()); }
	RULE_LCURLY
	{ after(grammarAccess.getDataStructureTupleAccess().getLCURLYTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataStructureTuple__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataStructureTuple__Group__2__Impl
	rule__DataStructureTuple__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DataStructureTuple__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataStructureTupleAccess().getDataStructureTypeKeyword_2()); }
	'dataStructureType'
	{ after(grammarAccess.getDataStructureTupleAccess().getDataStructureTypeKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataStructureTuple__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataStructureTuple__Group__3__Impl
	rule__DataStructureTuple__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DataStructureTuple__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataStructureTupleAccess().getDataStructureTypeAssignment_3()); }
	(rule__DataStructureTuple__DataStructureTypeAssignment_3)
	{ after(grammarAccess.getDataStructureTupleAccess().getDataStructureTypeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataStructureTuple__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataStructureTuple__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataStructureTuple__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataStructureTupleAccess().getRCURLYTerminalRuleCall_4()); }
	RULE_RCURLY
	{ after(grammarAccess.getDataStructureTupleAccess().getRCURLYTerminalRuleCall_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ConceptInstance__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConceptInstance__Group__0__Impl
	rule__ConceptInstance__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptInstance__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptInstanceAccess().getConceptInstanceKeyword_0()); }
	'ConceptInstance'
	{ after(grammarAccess.getConceptInstanceAccess().getConceptInstanceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptInstance__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConceptInstance__Group__1__Impl
	rule__ConceptInstance__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptInstance__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptInstanceAccess().getLCURLYTerminalRuleCall_1()); }
	RULE_LCURLY
	{ after(grammarAccess.getConceptInstanceAccess().getLCURLYTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptInstance__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConceptInstance__Group__2__Impl
	rule__ConceptInstance__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptInstance__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptInstanceAccess().getSingletonConceptClassifierKeyword_2()); }
	'singletonConceptClassifier'
	{ after(grammarAccess.getConceptInstanceAccess().getSingletonConceptClassifierKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptInstance__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConceptInstance__Group__3__Impl
	rule__ConceptInstance__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptInstance__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptInstanceAccess().getSingletonConceptClassifierAssignment_3()); }
	(rule__ConceptInstance__SingletonConceptClassifierAssignment_3)
	{ after(grammarAccess.getConceptInstanceAccess().getSingletonConceptClassifierAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptInstance__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConceptInstance__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptInstance__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptInstanceAccess().getRCURLYTerminalRuleCall_4()); }
	RULE_RCURLY
	{ after(grammarAccess.getConceptInstanceAccess().getRCURLYTerminalRuleCall_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ReifiedRelationshipInstance__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationshipInstance__Group__0__Impl
	rule__ReifiedRelationshipInstance__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstance__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipInstanceAccess().getReifiedRelationshipInstanceKeyword_0()); }
	'ReifiedRelationshipInstance'
	{ after(grammarAccess.getReifiedRelationshipInstanceAccess().getReifiedRelationshipInstanceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstance__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationshipInstance__Group__1__Impl
	rule__ReifiedRelationshipInstance__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstance__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipInstanceAccess().getLCURLYTerminalRuleCall_1()); }
	RULE_LCURLY
	{ after(grammarAccess.getReifiedRelationshipInstanceAccess().getLCURLYTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstance__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationshipInstance__Group__2__Impl
	rule__ReifiedRelationshipInstance__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstance__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipInstanceAccess().getSingletonReifiedRelationshipClassifierKeyword_2()); }
	'singletonReifiedRelationshipClassifier'
	{ after(grammarAccess.getReifiedRelationshipInstanceAccess().getSingletonReifiedRelationshipClassifierKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstance__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationshipInstance__Group__3__Impl
	rule__ReifiedRelationshipInstance__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstance__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipInstanceAccess().getSingletonReifiedRelationshipClassifierAssignment_3()); }
	(rule__ReifiedRelationshipInstance__SingletonReifiedRelationshipClassifierAssignment_3)
	{ after(grammarAccess.getReifiedRelationshipInstanceAccess().getSingletonReifiedRelationshipClassifierAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstance__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationshipInstance__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstance__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipInstanceAccess().getRCURLYTerminalRuleCall_4()); }
	RULE_RCURLY
	{ after(grammarAccess.getReifiedRelationshipInstanceAccess().getRCURLYTerminalRuleCall_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ReifiedRelationshipInstanceDomain__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationshipInstanceDomain__Group__0__Impl
	rule__ReifiedRelationshipInstanceDomain__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstanceDomain__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipInstanceDomainAccess().getReifiedRelationshipInstanceDomainKeyword_0()); }
	'ReifiedRelationshipInstanceDomain'
	{ after(grammarAccess.getReifiedRelationshipInstanceDomainAccess().getReifiedRelationshipInstanceDomainKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstanceDomain__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationshipInstanceDomain__Group__1__Impl
	rule__ReifiedRelationshipInstanceDomain__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstanceDomain__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipInstanceDomainAccess().getLCURLYTerminalRuleCall_1()); }
	RULE_LCURLY
	{ after(grammarAccess.getReifiedRelationshipInstanceDomainAccess().getLCURLYTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstanceDomain__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationshipInstanceDomain__Group__2__Impl
	rule__ReifiedRelationshipInstanceDomain__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstanceDomain__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipInstanceDomainAccess().getReifiedRelationshipInstanceKeyword_2()); }
	'reifiedRelationshipInstance'
	{ after(grammarAccess.getReifiedRelationshipInstanceDomainAccess().getReifiedRelationshipInstanceKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstanceDomain__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationshipInstanceDomain__Group__3__Impl
	rule__ReifiedRelationshipInstanceDomain__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstanceDomain__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipInstanceDomainAccess().getReifiedRelationshipInstanceAssignment_3()); }
	(rule__ReifiedRelationshipInstanceDomain__ReifiedRelationshipInstanceAssignment_3)
	{ after(grammarAccess.getReifiedRelationshipInstanceDomainAccess().getReifiedRelationshipInstanceAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstanceDomain__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationshipInstanceDomain__Group__4__Impl
	rule__ReifiedRelationshipInstanceDomain__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstanceDomain__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipInstanceDomainAccess().getDOMAIN_TOKENTerminalRuleCall_4()); }
	RULE_DOMAIN_TOKEN
	{ after(grammarAccess.getReifiedRelationshipInstanceDomainAccess().getDOMAIN_TOKENTerminalRuleCall_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstanceDomain__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationshipInstanceDomain__Group__5__Impl
	rule__ReifiedRelationshipInstanceDomain__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstanceDomain__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipInstanceDomainAccess().getDomainAssignment_5()); }
	(rule__ReifiedRelationshipInstanceDomain__DomainAssignment_5)
	{ after(grammarAccess.getReifiedRelationshipInstanceDomainAccess().getDomainAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstanceDomain__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationshipInstanceDomain__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstanceDomain__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipInstanceDomainAccess().getRCURLYTerminalRuleCall_6()); }
	RULE_RCURLY
	{ after(grammarAccess.getReifiedRelationshipInstanceDomainAccess().getRCURLYTerminalRuleCall_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ReifiedRelationshipInstanceRange__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationshipInstanceRange__Group__0__Impl
	rule__ReifiedRelationshipInstanceRange__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstanceRange__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipInstanceRangeAccess().getReifiedRelationshipInstanceRangeKeyword_0()); }
	'ReifiedRelationshipInstanceRange'
	{ after(grammarAccess.getReifiedRelationshipInstanceRangeAccess().getReifiedRelationshipInstanceRangeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstanceRange__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationshipInstanceRange__Group__1__Impl
	rule__ReifiedRelationshipInstanceRange__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstanceRange__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipInstanceRangeAccess().getLCURLYTerminalRuleCall_1()); }
	RULE_LCURLY
	{ after(grammarAccess.getReifiedRelationshipInstanceRangeAccess().getLCURLYTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstanceRange__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationshipInstanceRange__Group__2__Impl
	rule__ReifiedRelationshipInstanceRange__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstanceRange__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipInstanceRangeAccess().getReifiedRelationshipInstanceKeyword_2()); }
	'reifiedRelationshipInstance'
	{ after(grammarAccess.getReifiedRelationshipInstanceRangeAccess().getReifiedRelationshipInstanceKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstanceRange__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationshipInstanceRange__Group__3__Impl
	rule__ReifiedRelationshipInstanceRange__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstanceRange__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipInstanceRangeAccess().getReifiedRelationshipInstanceAssignment_3()); }
	(rule__ReifiedRelationshipInstanceRange__ReifiedRelationshipInstanceAssignment_3)
	{ after(grammarAccess.getReifiedRelationshipInstanceRangeAccess().getReifiedRelationshipInstanceAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstanceRange__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationshipInstanceRange__Group__4__Impl
	rule__ReifiedRelationshipInstanceRange__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstanceRange__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipInstanceRangeAccess().getRANGE_TOKENTerminalRuleCall_4()); }
	RULE_RANGE_TOKEN
	{ after(grammarAccess.getReifiedRelationshipInstanceRangeAccess().getRANGE_TOKENTerminalRuleCall_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstanceRange__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationshipInstanceRange__Group__5__Impl
	rule__ReifiedRelationshipInstanceRange__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstanceRange__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipInstanceRangeAccess().getRangeAssignment_5()); }
	(rule__ReifiedRelationshipInstanceRange__RangeAssignment_5)
	{ after(grammarAccess.getReifiedRelationshipInstanceRangeAccess().getRangeAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstanceRange__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReifiedRelationshipInstanceRange__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstanceRange__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReifiedRelationshipInstanceRangeAccess().getRCURLYTerminalRuleCall_6()); }
	RULE_RCURLY
	{ after(grammarAccess.getReifiedRelationshipInstanceRangeAccess().getRCURLYTerminalRuleCall_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__UnreifiedRelationshipInstanceTuple__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnreifiedRelationshipInstanceTuple__Group__0__Impl
	rule__UnreifiedRelationshipInstanceTuple__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationshipInstanceTuple__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getUnreifiedRelationshipInstanceTupleKeyword_0()); }
	'UnreifiedRelationshipInstanceTuple'
	{ after(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getUnreifiedRelationshipInstanceTupleKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationshipInstanceTuple__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnreifiedRelationshipInstanceTuple__Group__1__Impl
	rule__UnreifiedRelationshipInstanceTuple__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationshipInstanceTuple__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getLCURLYTerminalRuleCall_1()); }
	RULE_LCURLY
	{ after(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getLCURLYTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationshipInstanceTuple__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnreifiedRelationshipInstanceTuple__Group__2__Impl
	rule__UnreifiedRelationshipInstanceTuple__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationshipInstanceTuple__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getUNREIFIED_RELATIONSHIP_TOKENTerminalRuleCall_2()); }
	RULE_UNREIFIED_RELATIONSHIP_TOKEN
	{ after(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getUNREIFIED_RELATIONSHIP_TOKENTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationshipInstanceTuple__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnreifiedRelationshipInstanceTuple__Group__3__Impl
	rule__UnreifiedRelationshipInstanceTuple__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationshipInstanceTuple__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getUnreifiedRelationshipAssignment_3()); }
	(rule__UnreifiedRelationshipInstanceTuple__UnreifiedRelationshipAssignment_3)
	{ after(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getUnreifiedRelationshipAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationshipInstanceTuple__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnreifiedRelationshipInstanceTuple__Group__4__Impl
	rule__UnreifiedRelationshipInstanceTuple__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationshipInstanceTuple__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getDOMAIN_TOKENTerminalRuleCall_4()); }
	RULE_DOMAIN_TOKEN
	{ after(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getDOMAIN_TOKENTerminalRuleCall_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationshipInstanceTuple__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnreifiedRelationshipInstanceTuple__Group__5__Impl
	rule__UnreifiedRelationshipInstanceTuple__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationshipInstanceTuple__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getDomainAssignment_5()); }
	(rule__UnreifiedRelationshipInstanceTuple__DomainAssignment_5)
	{ after(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getDomainAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationshipInstanceTuple__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnreifiedRelationshipInstanceTuple__Group__6__Impl
	rule__UnreifiedRelationshipInstanceTuple__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationshipInstanceTuple__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getRANGE_TOKENTerminalRuleCall_6()); }
	RULE_RANGE_TOKEN
	{ after(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getRANGE_TOKENTerminalRuleCall_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationshipInstanceTuple__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnreifiedRelationshipInstanceTuple__Group__7__Impl
	rule__UnreifiedRelationshipInstanceTuple__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationshipInstanceTuple__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getRangeAssignment_7()); }
	(rule__UnreifiedRelationshipInstanceTuple__RangeAssignment_7)
	{ after(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getRangeAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationshipInstanceTuple__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnreifiedRelationshipInstanceTuple__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationshipInstanceTuple__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getRCURLYTerminalRuleCall_8()); }
	RULE_RCURLY
	{ after(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getRCURLYTerminalRuleCall_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ABBREV_IRI__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ABBREV_IRI__Group__0__Impl
	rule__ABBREV_IRI__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ABBREV_IRI__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getABBREV_IRIAccess().getValidIDParserRuleCall_0()); }
	ruleValidID
	{ after(grammarAccess.getABBREV_IRIAccess().getValidIDParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ABBREV_IRI__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ABBREV_IRI__Group__1__Impl
	rule__ABBREV_IRI__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ABBREV_IRI__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getABBREV_IRIAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getABBREV_IRIAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ABBREV_IRI__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ABBREV_IRI__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ABBREV_IRI__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getABBREV_IRIAccess().getValidIDParserRuleCall_2()); }
	ruleValidID
	{ after(grammarAccess.getABBREV_IRIAccess().getValidIDParserRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TerminologyExtent__AnnotationPropertiesAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTerminologyExtentAccess().getAnnotationPropertiesAnnotationPropertyParserRuleCall_1_0_0()); }
		ruleAnnotationProperty
		{ after(grammarAccess.getTerminologyExtentAccess().getAnnotationPropertiesAnnotationPropertyParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyExtent__TerminologyGraphsAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTerminologyExtentAccess().getTerminologyGraphsTerminologyGraphParserRuleCall_1_1_0()); }
		ruleTerminologyGraph
		{ after(grammarAccess.getTerminologyExtentAccess().getTerminologyGraphsTerminologyGraphParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyExtent__BundlesAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTerminologyExtentAccess().getBundlesBundleParserRuleCall_1_2_0()); }
		ruleBundle
		{ after(grammarAccess.getTerminologyExtentAccess().getBundlesBundleParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyExtent__DescriptionsAssignment_1_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTerminologyExtentAccess().getDescriptionsDescriptionBoxParserRuleCall_1_3_0()); }
		ruleDescriptionBox
		{ after(grammarAccess.getTerminologyExtentAccess().getDescriptionsDescriptionBoxParserRuleCall_1_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationProperty__AbbrevIRIAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnnotationPropertyAccess().getAbbrevIRIABBREV_IRIParserRuleCall_1_0()); }
		ruleABBREV_IRI
		{ after(grammarAccess.getAnnotationPropertyAccess().getAbbrevIRIABBREV_IRIParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnnotationProperty__IriAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnnotationPropertyAccess().getIriIRITerminalRuleCall_3_0()); }
		RULE_IRI
		{ after(grammarAccess.getAnnotationPropertyAccess().getIriIRITerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__PropertyAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnnotationAccess().getPropertyAnnotationPropertyCrossReference_1_0()); }
		(
			{ before(grammarAccess.getAnnotationAccess().getPropertyAnnotationPropertyABBREV_IRIParserRuleCall_1_0_1()); }
			ruleABBREV_IRI
			{ after(grammarAccess.getAnnotationAccess().getPropertyAnnotationPropertyABBREV_IRIParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getAnnotationAccess().getPropertyAnnotationPropertyCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__ValueAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_3_0()); }
		RULE_STRING
		{ after(grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyGraph__KindAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTerminologyGraphAccess().getKindTerminologyGraphKindEnumRuleCall_0_0()); }
		ruleTerminologyGraphKind
		{ after(grammarAccess.getTerminologyGraphAccess().getKindTerminologyGraphKindEnumRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyGraph__IriAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTerminologyGraphAccess().getIriIRITerminalRuleCall_2_0()); }
		RULE_IRI
		{ after(grammarAccess.getTerminologyGraphAccess().getIriIRITerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyGraph__AnnotationsAssignment_4_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTerminologyGraphAccess().getAnnotationsAnnotationParserRuleCall_4_0_0()); }
		ruleAnnotation
		{ after(grammarAccess.getTerminologyGraphAccess().getAnnotationsAnnotationParserRuleCall_4_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyGraph__TerminologyBoxAxiomsAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTerminologyGraphAccess().getTerminologyBoxAxiomsTerminologyBoxAxiomParserRuleCall_4_1_0()); }
		ruleTerminologyBoxAxiom
		{ after(grammarAccess.getTerminologyGraphAccess().getTerminologyBoxAxiomsTerminologyBoxAxiomParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyGraph__BoxStatementsAssignment_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTerminologyGraphAccess().getBoxStatementsTerminologyBoxStatementParserRuleCall_4_2_0()); }
		ruleTerminologyBoxStatement
		{ after(grammarAccess.getTerminologyGraphAccess().getBoxStatementsTerminologyBoxStatementParserRuleCall_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__KindAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBundleAccess().getKindTerminologyGraphKindEnumRuleCall_0_0()); }
		ruleTerminologyGraphKind
		{ after(grammarAccess.getBundleAccess().getKindTerminologyGraphKindEnumRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__IriAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBundleAccess().getIriIRITerminalRuleCall_2_0()); }
		RULE_IRI
		{ after(grammarAccess.getBundleAccess().getIriIRITerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__AnnotationsAssignment_4_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBundleAccess().getAnnotationsAnnotationParserRuleCall_4_0_0()); }
		ruleAnnotation
		{ after(grammarAccess.getBundleAccess().getAnnotationsAnnotationParserRuleCall_4_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__TerminologyBoxAxiomsAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBundleAccess().getTerminologyBoxAxiomsTerminologyBoxAxiomParserRuleCall_4_1_0()); }
		ruleTerminologyBoxAxiom
		{ after(grammarAccess.getBundleAccess().getTerminologyBoxAxiomsTerminologyBoxAxiomParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__BoxStatementsAssignment_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBundleAccess().getBoxStatementsTerminologyBoxStatementParserRuleCall_4_2_0()); }
		ruleTerminologyBoxStatement
		{ after(grammarAccess.getBundleAccess().getBoxStatementsTerminologyBoxStatementParserRuleCall_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__BundleStatementsAssignment_4_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBundleAccess().getBundleStatementsTerminologyBundleStatementParserRuleCall_4_3_0()); }
		ruleTerminologyBundleStatement
		{ after(grammarAccess.getBundleAccess().getBundleStatementsTerminologyBundleStatementParserRuleCall_4_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__TerminologyBundleAxiomsAssignment_4_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBundleAccess().getTerminologyBundleAxiomsTerminologyBundleAxiomParserRuleCall_4_4_0()); }
		ruleTerminologyBundleAxiom
		{ after(grammarAccess.getBundleAccess().getTerminologyBundleAxiomsTerminologyBundleAxiomParserRuleCall_4_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Aspect__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAspectAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getAspectAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Concept__IsAbstractAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConceptAccess().getIsAbstractABSTRACT_TOKENTerminalRuleCall_0_0()); }
		RULE_ABSTRACT_TOKEN
		{ after(grammarAccess.getConceptAccess().getIsAbstractABSTRACT_TOKENTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Concept__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConceptAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getConceptAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__IsAbstractAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReifiedRelationshipAccess().getIsAbstractABSTRACT_TOKENTerminalRuleCall_0_0()); }
		RULE_ABSTRACT_TOKEN
		{ after(grammarAccess.getReifiedRelationshipAccess().getIsAbstractABSTRACT_TOKENTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReifiedRelationshipAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getReifiedRelationshipAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__IsFunctionalAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReifiedRelationshipAccess().getIsFunctionalFUNCTIONAL_TOKENTerminalRuleCall_4_0()); }
		RULE_FUNCTIONAL_TOKEN
		{ after(grammarAccess.getReifiedRelationshipAccess().getIsFunctionalFUNCTIONAL_TOKENTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__IsInverseFunctionalAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReifiedRelationshipAccess().getIsInverseFunctionalINVERSE_FUNCTIONAL_TOKENTerminalRuleCall_5_0()); }
		RULE_INVERSE_FUNCTIONAL_TOKEN
		{ after(grammarAccess.getReifiedRelationshipAccess().getIsInverseFunctionalINVERSE_FUNCTIONAL_TOKENTerminalRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__IsEssentialAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReifiedRelationshipAccess().getIsEssentialESSENTIAL_TOKENTerminalRuleCall_6_0()); }
		RULE_ESSENTIAL_TOKEN
		{ after(grammarAccess.getReifiedRelationshipAccess().getIsEssentialESSENTIAL_TOKENTerminalRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__IsInverseEssentialAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReifiedRelationshipAccess().getIsInverseEssentialINVERSE_ESSENTIAL_TOKENTerminalRuleCall_7_0()); }
		RULE_INVERSE_ESSENTIAL_TOKEN
		{ after(grammarAccess.getReifiedRelationshipAccess().getIsInverseEssentialINVERSE_ESSENTIAL_TOKENTerminalRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__IsSymmetricAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReifiedRelationshipAccess().getIsSymmetricSYMMETRIC_TOKENTerminalRuleCall_8_0()); }
		RULE_SYMMETRIC_TOKEN
		{ after(grammarAccess.getReifiedRelationshipAccess().getIsSymmetricSYMMETRIC_TOKENTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__IsAsymmetricAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReifiedRelationshipAccess().getIsAsymmetricASYMMETRIC_TOKENTerminalRuleCall_9_0()); }
		RULE_ASYMMETRIC_TOKEN
		{ after(grammarAccess.getReifiedRelationshipAccess().getIsAsymmetricASYMMETRIC_TOKENTerminalRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__IsReflexiveAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReifiedRelationshipAccess().getIsReflexiveREFLEXIVE_TOKENTerminalRuleCall_10_0()); }
		RULE_REFLEXIVE_TOKEN
		{ after(grammarAccess.getReifiedRelationshipAccess().getIsReflexiveREFLEXIVE_TOKENTerminalRuleCall_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__IsIrreflexiveAssignment_11
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReifiedRelationshipAccess().getIsIrreflexiveIRREFLEXIVE_TOKENTerminalRuleCall_11_0()); }
		RULE_IRREFLEXIVE_TOKEN
		{ after(grammarAccess.getReifiedRelationshipAccess().getIsIrreflexiveIRREFLEXIVE_TOKENTerminalRuleCall_11_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__IsTransitiveAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReifiedRelationshipAccess().getIsTransitiveTRANSITIVE_TOKENTerminalRuleCall_12_0()); }
		RULE_TRANSITIVE_TOKEN
		{ after(grammarAccess.getReifiedRelationshipAccess().getIsTransitiveTRANSITIVE_TOKENTerminalRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__UnreifiedPropertyNameAssignment_15
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReifiedRelationshipAccess().getUnreifiedPropertyNameIDTerminalRuleCall_15_0()); }
		RULE_ID
		{ after(grammarAccess.getReifiedRelationshipAccess().getUnreifiedPropertyNameIDTerminalRuleCall_15_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__UnreifiedInversePropertyNameAssignment_16_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReifiedRelationshipAccess().getUnreifiedInversePropertyNameIDTerminalRuleCall_16_2_0()); }
		RULE_ID
		{ after(grammarAccess.getReifiedRelationshipAccess().getUnreifiedInversePropertyNameIDTerminalRuleCall_16_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__SourceAssignment_19
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReifiedRelationshipAccess().getSourceEntityCrossReference_19_0()); }
		(
			{ before(grammarAccess.getReifiedRelationshipAccess().getSourceEntityReferenceParserRuleCall_19_0_1()); }
			ruleReference
			{ after(grammarAccess.getReifiedRelationshipAccess().getSourceEntityReferenceParserRuleCall_19_0_1()); }
		)
		{ after(grammarAccess.getReifiedRelationshipAccess().getSourceEntityCrossReference_19_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationship__TargetAssignment_22
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReifiedRelationshipAccess().getTargetEntityCrossReference_22_0()); }
		(
			{ before(grammarAccess.getReifiedRelationshipAccess().getTargetEntityReferenceParserRuleCall_22_0_1()); }
			ruleReference
			{ after(grammarAccess.getReifiedRelationshipAccess().getTargetEntityReferenceParserRuleCall_22_0_1()); }
		)
		{ after(grammarAccess.getReifiedRelationshipAccess().getTargetEntityCrossReference_22_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnreifiedRelationshipAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getUnreifiedRelationshipAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__IsFunctionalAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnreifiedRelationshipAccess().getIsFunctionalFUNCTIONAL_TOKENTerminalRuleCall_3_0()); }
		RULE_FUNCTIONAL_TOKEN
		{ after(grammarAccess.getUnreifiedRelationshipAccess().getIsFunctionalFUNCTIONAL_TOKENTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__IsInverseFunctionalAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnreifiedRelationshipAccess().getIsInverseFunctionalINVERSE_FUNCTIONAL_TOKENTerminalRuleCall_4_0()); }
		RULE_INVERSE_FUNCTIONAL_TOKEN
		{ after(grammarAccess.getUnreifiedRelationshipAccess().getIsInverseFunctionalINVERSE_FUNCTIONAL_TOKENTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__IsEssentialAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnreifiedRelationshipAccess().getIsEssentialESSENTIAL_TOKENTerminalRuleCall_5_0()); }
		RULE_ESSENTIAL_TOKEN
		{ after(grammarAccess.getUnreifiedRelationshipAccess().getIsEssentialESSENTIAL_TOKENTerminalRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__IsInverseEssentialAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnreifiedRelationshipAccess().getIsInverseEssentialINVERSE_ESSENTIAL_TOKENTerminalRuleCall_6_0()); }
		RULE_INVERSE_ESSENTIAL_TOKEN
		{ after(grammarAccess.getUnreifiedRelationshipAccess().getIsInverseEssentialINVERSE_ESSENTIAL_TOKENTerminalRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__IsSymmetricAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnreifiedRelationshipAccess().getIsSymmetricSYMMETRIC_TOKENTerminalRuleCall_7_0()); }
		RULE_SYMMETRIC_TOKEN
		{ after(grammarAccess.getUnreifiedRelationshipAccess().getIsSymmetricSYMMETRIC_TOKENTerminalRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__IsAsymmetricAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnreifiedRelationshipAccess().getIsAsymmetricASYMMETRIC_TOKENTerminalRuleCall_8_0()); }
		RULE_ASYMMETRIC_TOKEN
		{ after(grammarAccess.getUnreifiedRelationshipAccess().getIsAsymmetricASYMMETRIC_TOKENTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__IsReflexiveAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnreifiedRelationshipAccess().getIsReflexiveREFLEXIVE_TOKENTerminalRuleCall_9_0()); }
		RULE_REFLEXIVE_TOKEN
		{ after(grammarAccess.getUnreifiedRelationshipAccess().getIsReflexiveREFLEXIVE_TOKENTerminalRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__IsIrreflexiveAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnreifiedRelationshipAccess().getIsIrreflexiveIRREFLEXIVE_TOKENTerminalRuleCall_10_0()); }
		RULE_IRREFLEXIVE_TOKEN
		{ after(grammarAccess.getUnreifiedRelationshipAccess().getIsIrreflexiveIRREFLEXIVE_TOKENTerminalRuleCall_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__IsTransitiveAssignment_11
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnreifiedRelationshipAccess().getIsTransitiveTRANSITIVE_TOKENTerminalRuleCall_11_0()); }
		RULE_TRANSITIVE_TOKEN
		{ after(grammarAccess.getUnreifiedRelationshipAccess().getIsTransitiveTRANSITIVE_TOKENTerminalRuleCall_11_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__SourceAssignment_14
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnreifiedRelationshipAccess().getSourceEntityCrossReference_14_0()); }
		(
			{ before(grammarAccess.getUnreifiedRelationshipAccess().getSourceEntityReferenceParserRuleCall_14_0_1()); }
			ruleReference
			{ after(grammarAccess.getUnreifiedRelationshipAccess().getSourceEntityReferenceParserRuleCall_14_0_1()); }
		)
		{ after(grammarAccess.getUnreifiedRelationshipAccess().getSourceEntityCrossReference_14_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationship__TargetAssignment_17
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnreifiedRelationshipAccess().getTargetEntityCrossReference_17_0()); }
		(
			{ before(grammarAccess.getUnreifiedRelationshipAccess().getTargetEntityReferenceParserRuleCall_17_0_1()); }
			ruleReference
			{ after(grammarAccess.getUnreifiedRelationshipAccess().getTargetEntityReferenceParserRuleCall_17_0_1()); }
		)
		{ after(grammarAccess.getUnreifiedRelationshipAccess().getTargetEntityCrossReference_17_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scalar__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScalarAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getScalarAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Structure__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStructureAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getStructureAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityStructuredDataProperty__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityStructuredDataPropertyAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getEntityStructuredDataPropertyAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityStructuredDataProperty__DomainAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityStructuredDataPropertyAccess().getDomainEntityCrossReference_4_0()); }
		(
			{ before(grammarAccess.getEntityStructuredDataPropertyAccess().getDomainEntityReferenceParserRuleCall_4_0_1()); }
			ruleReference
			{ after(grammarAccess.getEntityStructuredDataPropertyAccess().getDomainEntityReferenceParserRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getEntityStructuredDataPropertyAccess().getDomainEntityCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityStructuredDataProperty__RangeAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityStructuredDataPropertyAccess().getRangeStructureCrossReference_6_0()); }
		(
			{ before(grammarAccess.getEntityStructuredDataPropertyAccess().getRangeStructureReferenceParserRuleCall_6_0_1()); }
			ruleReference
			{ after(grammarAccess.getEntityStructuredDataPropertyAccess().getRangeStructureReferenceParserRuleCall_6_0_1()); }
		)
		{ after(grammarAccess.getEntityStructuredDataPropertyAccess().getRangeStructureCrossReference_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataProperty__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityScalarDataPropertyAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getEntityScalarDataPropertyAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataProperty__DomainAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityScalarDataPropertyAccess().getDomainEntityCrossReference_4_0()); }
		(
			{ before(grammarAccess.getEntityScalarDataPropertyAccess().getDomainEntityReferenceParserRuleCall_4_0_1()); }
			ruleReference
			{ after(grammarAccess.getEntityScalarDataPropertyAccess().getDomainEntityReferenceParserRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getEntityScalarDataPropertyAccess().getDomainEntityCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataProperty__RangeAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityScalarDataPropertyAccess().getRangeDataRangeCrossReference_6_0()); }
		(
			{ before(grammarAccess.getEntityScalarDataPropertyAccess().getRangeDataRangeReferenceParserRuleCall_6_0_1()); }
			ruleReference
			{ after(grammarAccess.getEntityScalarDataPropertyAccess().getRangeDataRangeReferenceParserRuleCall_6_0_1()); }
		)
		{ after(grammarAccess.getEntityScalarDataPropertyAccess().getRangeDataRangeCrossReference_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuredDataProperty__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStructuredDataPropertyAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getStructuredDataPropertyAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuredDataProperty__DomainAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStructuredDataPropertyAccess().getDomainStructureCrossReference_4_0()); }
		(
			{ before(grammarAccess.getStructuredDataPropertyAccess().getDomainStructureReferenceParserRuleCall_4_0_1()); }
			ruleReference
			{ after(grammarAccess.getStructuredDataPropertyAccess().getDomainStructureReferenceParserRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getStructuredDataPropertyAccess().getDomainStructureCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuredDataProperty__RangeAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStructuredDataPropertyAccess().getRangeStructureCrossReference_6_0()); }
		(
			{ before(grammarAccess.getStructuredDataPropertyAccess().getRangeStructureReferenceParserRuleCall_6_0_1()); }
			ruleReference
			{ after(grammarAccess.getStructuredDataPropertyAccess().getRangeStructureReferenceParserRuleCall_6_0_1()); }
		)
		{ after(grammarAccess.getStructuredDataPropertyAccess().getRangeStructureCrossReference_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarDataProperty__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScalarDataPropertyAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getScalarDataPropertyAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarDataProperty__DomainAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScalarDataPropertyAccess().getDomainStructureCrossReference_4_0()); }
		(
			{ before(grammarAccess.getScalarDataPropertyAccess().getDomainStructureReferenceParserRuleCall_4_0_1()); }
			ruleReference
			{ after(grammarAccess.getScalarDataPropertyAccess().getDomainStructureReferenceParserRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getScalarDataPropertyAccess().getDomainStructureCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarDataProperty__RangeAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScalarDataPropertyAccess().getRangeDataRangeCrossReference_6_0()); }
		(
			{ before(grammarAccess.getScalarDataPropertyAccess().getRangeDataRangeReferenceParserRuleCall_6_0_1()); }
			ruleReference
			{ after(grammarAccess.getScalarDataPropertyAccess().getRangeDataRangeReferenceParserRuleCall_6_0_1()); }
		)
		{ after(grammarAccess.getScalarDataPropertyAccess().getRangeDataRangeCrossReference_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnonymousConceptTaxonomyAxiom__DisjointTaxonomyParentAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnonymousConceptTaxonomyAxiomAccess().getDisjointTaxonomyParentConceptTreeDisjunctionCrossReference_3_0()); }
		(
			{ before(grammarAccess.getAnonymousConceptTaxonomyAxiomAccess().getDisjointTaxonomyParentConceptTreeDisjunctionReferenceParserRuleCall_3_0_1()); }
			ruleReference
			{ after(grammarAccess.getAnonymousConceptTaxonomyAxiomAccess().getDisjointTaxonomyParentConceptTreeDisjunctionReferenceParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getAnonymousConceptTaxonomyAxiomAccess().getDisjointTaxonomyParentConceptTreeDisjunctionCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RootConceptTaxonomyAxiom__RootAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRootConceptTaxonomyAxiomAccess().getRootConceptCrossReference_3_0()); }
		(
			{ before(grammarAccess.getRootConceptTaxonomyAxiomAccess().getRootConceptReferenceParserRuleCall_3_0_1()); }
			ruleReference
			{ after(grammarAccess.getRootConceptTaxonomyAxiomAccess().getRootConceptReferenceParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getRootConceptTaxonomyAxiomAccess().getRootConceptCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecificDisjointConceptAxiom__DisjointTaxonomyParentAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpecificDisjointConceptAxiomAccess().getDisjointTaxonomyParentConceptTreeDisjunctionCrossReference_3_0()); }
		(
			{ before(grammarAccess.getSpecificDisjointConceptAxiomAccess().getDisjointTaxonomyParentConceptTreeDisjunctionReferenceParserRuleCall_3_0_1()); }
			ruleReference
			{ after(grammarAccess.getSpecificDisjointConceptAxiomAccess().getDisjointTaxonomyParentConceptTreeDisjunctionReferenceParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getSpecificDisjointConceptAxiomAccess().getDisjointTaxonomyParentConceptTreeDisjunctionCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SpecificDisjointConceptAxiom__DisjointLeafAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSpecificDisjointConceptAxiomAccess().getDisjointLeafConceptCrossReference_5_0()); }
		(
			{ before(grammarAccess.getSpecificDisjointConceptAxiomAccess().getDisjointLeafConceptReferenceParserRuleCall_5_0_1()); }
			ruleReference
			{ after(grammarAccess.getSpecificDisjointConceptAxiomAccess().getDisjointLeafConceptReferenceParserRuleCall_5_0_1()); }
		)
		{ after(grammarAccess.getSpecificDisjointConceptAxiomAccess().getDisjointLeafConceptCrossReference_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BundledTerminologyAxiom__BundledTerminologyAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBundledTerminologyAxiomAccess().getBundledTerminologyTerminologyBoxCrossReference_3_0()); }
		(
			{ before(grammarAccess.getBundledTerminologyAxiomAccess().getBundledTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1()); }
			ruleReference
			{ after(grammarAccess.getBundledTerminologyAxiomAccess().getBundledTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getBundledTerminologyAxiomAccess().getBundledTerminologyTerminologyBoxCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptDesignationTerminologyAxiom__DesignatedTerminologyAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConceptDesignationTerminologyAxiomAccess().getDesignatedTerminologyTerminologyBoxCrossReference_3_0()); }
		(
			{ before(grammarAccess.getConceptDesignationTerminologyAxiomAccess().getDesignatedTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1()); }
			ruleReference
			{ after(grammarAccess.getConceptDesignationTerminologyAxiomAccess().getDesignatedTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getConceptDesignationTerminologyAxiomAccess().getDesignatedTerminologyTerminologyBoxCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptDesignationTerminologyAxiom__DesignatedConceptAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConceptDesignationTerminologyAxiomAccess().getDesignatedConceptConceptCrossReference_5_0()); }
		(
			{ before(grammarAccess.getConceptDesignationTerminologyAxiomAccess().getDesignatedConceptConceptReferenceParserRuleCall_5_0_1()); }
			ruleReference
			{ after(grammarAccess.getConceptDesignationTerminologyAxiomAccess().getDesignatedConceptConceptReferenceParserRuleCall_5_0_1()); }
		)
		{ after(grammarAccess.getConceptDesignationTerminologyAxiomAccess().getDesignatedConceptConceptCrossReference_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyExtensionAxiom__ExtendedTerminologyAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTerminologyExtensionAxiomAccess().getExtendedTerminologyTerminologyBoxCrossReference_1_0()); }
		(
			{ before(grammarAccess.getTerminologyExtensionAxiomAccess().getExtendedTerminologyTerminologyBoxReferenceParserRuleCall_1_0_1()); }
			ruleReference
			{ after(grammarAccess.getTerminologyExtensionAxiomAccess().getExtendedTerminologyTerminologyBoxReferenceParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getTerminologyExtensionAxiomAccess().getExtendedTerminologyTerminologyBoxCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyNestingAxiom__NestingTerminologyAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTerminologyNestingAxiomAccess().getNestingTerminologyTerminologyBoxCrossReference_3_0()); }
		(
			{ before(grammarAccess.getTerminologyNestingAxiomAccess().getNestingTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1()); }
			ruleReference
			{ after(grammarAccess.getTerminologyNestingAxiomAccess().getNestingTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getTerminologyNestingAxiomAccess().getNestingTerminologyTerminologyBoxCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminologyNestingAxiom__NestingContextAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTerminologyNestingAxiomAccess().getNestingContextConceptCrossReference_5_0()); }
		(
			{ before(grammarAccess.getTerminologyNestingAxiomAccess().getNestingContextConceptReferenceParserRuleCall_5_0_1()); }
			ruleReference
			{ after(grammarAccess.getTerminologyNestingAxiomAccess().getNestingContextConceptReferenceParserRuleCall_5_0_1()); }
		)
		{ after(grammarAccess.getTerminologyNestingAxiomAccess().getNestingContextConceptCrossReference_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityExistentialRestrictionAxiom__RestrictedRelationAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedRelationReifiedRelationshipCrossReference_3_0()); }
		(
			{ before(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedRelationReifiedRelationshipReferenceParserRuleCall_3_0_1()); }
			ruleReference
			{ after(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedRelationReifiedRelationshipReferenceParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedRelationReifiedRelationshipCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityExistentialRestrictionAxiom__RestrictedRangeAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedRangeEntityCrossReference_5_0()); }
		(
			{ before(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedRangeEntityReferenceParserRuleCall_5_0_1()); }
			ruleReference
			{ after(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedRangeEntityReferenceParserRuleCall_5_0_1()); }
		)
		{ after(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedRangeEntityCrossReference_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityExistentialRestrictionAxiom__RestrictedDomainAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedDomainEntityCrossReference_7_0()); }
		(
			{ before(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedDomainEntityReferenceParserRuleCall_7_0_1()); }
			ruleReference
			{ after(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedDomainEntityReferenceParserRuleCall_7_0_1()); }
		)
		{ after(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedDomainEntityCrossReference_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityUniversalRestrictionAxiom__RestrictedRelationAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedRelationReifiedRelationshipCrossReference_3_0()); }
		(
			{ before(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedRelationReifiedRelationshipReferenceParserRuleCall_3_0_1()); }
			ruleReference
			{ after(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedRelationReifiedRelationshipReferenceParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedRelationReifiedRelationshipCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityUniversalRestrictionAxiom__RestrictedRangeAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedRangeEntityCrossReference_5_0()); }
		(
			{ before(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedRangeEntityReferenceParserRuleCall_5_0_1()); }
			ruleReference
			{ after(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedRangeEntityReferenceParserRuleCall_5_0_1()); }
		)
		{ after(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedRangeEntityCrossReference_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityUniversalRestrictionAxiom__RestrictedDomainAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedDomainEntityCrossReference_7_0()); }
		(
			{ before(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedDomainEntityReferenceParserRuleCall_7_0_1()); }
			ruleReference
			{ after(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedDomainEntityReferenceParserRuleCall_7_0_1()); }
		)
		{ after(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedDomainEntityCrossReference_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AspectSpecializationAxiom__SubEntityAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAspectSpecializationAxiomAccess().getSubEntityEntityCrossReference_0_0()); }
		(
			{ before(grammarAccess.getAspectSpecializationAxiomAccess().getSubEntityEntityReferenceParserRuleCall_0_0_1()); }
			ruleReference
			{ after(grammarAccess.getAspectSpecializationAxiomAccess().getSubEntityEntityReferenceParserRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getAspectSpecializationAxiomAccess().getSubEntityEntityCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AspectSpecializationAxiom__SuperAspectAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAspectSpecializationAxiomAccess().getSuperAspectAspectCrossReference_2_0()); }
		(
			{ before(grammarAccess.getAspectSpecializationAxiomAccess().getSuperAspectAspectReferenceParserRuleCall_2_0_1()); }
			ruleReference
			{ after(grammarAccess.getAspectSpecializationAxiomAccess().getSuperAspectAspectReferenceParserRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getAspectSpecializationAxiomAccess().getSuperAspectAspectCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptSpecializationAxiom__SubConceptAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConceptSpecializationAxiomAccess().getSubConceptConceptCrossReference_0_0()); }
		(
			{ before(grammarAccess.getConceptSpecializationAxiomAccess().getSubConceptConceptReferenceParserRuleCall_0_0_1()); }
			ruleReference
			{ after(grammarAccess.getConceptSpecializationAxiomAccess().getSubConceptConceptReferenceParserRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getConceptSpecializationAxiomAccess().getSubConceptConceptCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptSpecializationAxiom__SuperConceptAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConceptSpecializationAxiomAccess().getSuperConceptConceptCrossReference_2_0()); }
		(
			{ before(grammarAccess.getConceptSpecializationAxiomAccess().getSuperConceptConceptReferenceParserRuleCall_2_0_1()); }
			ruleReference
			{ after(grammarAccess.getConceptSpecializationAxiomAccess().getSuperConceptConceptReferenceParserRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getConceptSpecializationAxiomAccess().getSuperConceptConceptCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipSpecializationAxiom__SubRelationshipAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReifiedRelationshipSpecializationAxiomAccess().getSubRelationshipReifiedRelationshipCrossReference_0_0()); }
		(
			{ before(grammarAccess.getReifiedRelationshipSpecializationAxiomAccess().getSubRelationshipReifiedRelationshipReferenceParserRuleCall_0_0_1()); }
			ruleReference
			{ after(grammarAccess.getReifiedRelationshipSpecializationAxiomAccess().getSubRelationshipReifiedRelationshipReferenceParserRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getReifiedRelationshipSpecializationAxiomAccess().getSubRelationshipReifiedRelationshipCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipSpecializationAxiom__SuperRelationshipAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReifiedRelationshipSpecializationAxiomAccess().getSuperRelationshipReifiedRelationshipCrossReference_2_0()); }
		(
			{ before(grammarAccess.getReifiedRelationshipSpecializationAxiomAccess().getSuperRelationshipReifiedRelationshipReferenceParserRuleCall_2_0_1()); }
			ruleReference
			{ after(grammarAccess.getReifiedRelationshipSpecializationAxiomAccess().getSuperRelationshipReifiedRelationshipReferenceParserRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getReifiedRelationshipSpecializationAxiomAccess().getSuperRelationshipReifiedRelationshipCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyExistentialRestrictionAxiom__RestrictedEntityAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getRestrictedEntityEntityCrossReference_3_0()); }
		(
			{ before(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getRestrictedEntityEntityReferenceParserRuleCall_3_0_1()); }
			ruleReference
			{ after(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getRestrictedEntityEntityReferenceParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getRestrictedEntityEntityCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyExistentialRestrictionAxiom__ScalarPropertyAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarPropertyEntityScalarDataPropertyCrossReference_5_0()); }
		(
			{ before(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1()); }
			ruleReference
			{ after(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1()); }
		)
		{ after(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarPropertyEntityScalarDataPropertyCrossReference_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyExistentialRestrictionAxiom__ScalarRestrictionAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarRestrictionDataRangeCrossReference_7_0()); }
		(
			{ before(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarRestrictionDataRangeReferenceParserRuleCall_7_0_1()); }
			ruleReference
			{ after(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarRestrictionDataRangeReferenceParserRuleCall_7_0_1()); }
		)
		{ after(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarRestrictionDataRangeCrossReference_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyParticularRestrictionAxiom__RestrictedEntityAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getRestrictedEntityEntityCrossReference_3_0()); }
		(
			{ before(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getRestrictedEntityEntityReferenceParserRuleCall_3_0_1()); }
			ruleReference
			{ after(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getRestrictedEntityEntityReferenceParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getRestrictedEntityEntityCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyParticularRestrictionAxiom__ScalarPropertyAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getScalarPropertyEntityScalarDataPropertyCrossReference_5_0()); }
		(
			{ before(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1()); }
			ruleReference
			{ after(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1()); }
		)
		{ after(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getScalarPropertyEntityScalarDataPropertyCrossReference_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyParticularRestrictionAxiom__LiteralValueAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getLiteralValueSTRINGTerminalRuleCall_7_0()); }
		RULE_STRING
		{ after(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getLiteralValueSTRINGTerminalRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyUniversalRestrictionAxiom__RestrictedEntityAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getRestrictedEntityEntityCrossReference_3_0()); }
		(
			{ before(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getRestrictedEntityEntityReferenceParserRuleCall_3_0_1()); }
			ruleReference
			{ after(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getRestrictedEntityEntityReferenceParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getRestrictedEntityEntityCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyUniversalRestrictionAxiom__ScalarPropertyAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarPropertyEntityScalarDataPropertyCrossReference_5_0()); }
		(
			{ before(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1()); }
			ruleReference
			{ after(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1()); }
		)
		{ after(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarPropertyEntityScalarDataPropertyCrossReference_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityScalarDataPropertyUniversalRestrictionAxiom__ScalarRestrictionAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarRestrictionDataRangeCrossReference_7_0()); }
		(
			{ before(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarRestrictionDataRangeReferenceParserRuleCall_7_0_1()); }
			ruleReference
			{ after(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarRestrictionDataRangeReferenceParserRuleCall_7_0_1()); }
		)
		{ after(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarRestrictionDataRangeCrossReference_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryScalarRestriction__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBinaryScalarRestrictionAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getBinaryScalarRestrictionAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryScalarRestriction__LengthAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBinaryScalarRestrictionAccess().getLengthINTTerminalRuleCall_3_1_0()); }
		RULE_INT
		{ after(grammarAccess.getBinaryScalarRestrictionAccess().getLengthINTTerminalRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryScalarRestriction__MinLengthAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBinaryScalarRestrictionAccess().getMinLengthINTTerminalRuleCall_4_1_0()); }
		RULE_INT
		{ after(grammarAccess.getBinaryScalarRestrictionAccess().getMinLengthINTTerminalRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryScalarRestriction__MaxLengthAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBinaryScalarRestrictionAccess().getMaxLengthINTTerminalRuleCall_5_1_0()); }
		RULE_INT
		{ after(grammarAccess.getBinaryScalarRestrictionAccess().getMaxLengthINTTerminalRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryScalarRestriction__RestrictedRangeAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBinaryScalarRestrictionAccess().getRestrictedRangeDataRangeCrossReference_7_0()); }
		(
			{ before(grammarAccess.getBinaryScalarRestrictionAccess().getRestrictedRangeDataRangeReferenceParserRuleCall_7_0_1()); }
			ruleReference
			{ after(grammarAccess.getBinaryScalarRestrictionAccess().getRestrictedRangeDataRangeReferenceParserRuleCall_7_0_1()); }
		)
		{ after(grammarAccess.getBinaryScalarRestrictionAccess().getRestrictedRangeDataRangeCrossReference_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IRIScalarRestriction__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIRIScalarRestrictionAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getIRIScalarRestrictionAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IRIScalarRestriction__LengthAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIRIScalarRestrictionAccess().getLengthINTTerminalRuleCall_3_1_0()); }
		RULE_INT
		{ after(grammarAccess.getIRIScalarRestrictionAccess().getLengthINTTerminalRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IRIScalarRestriction__MinLengthAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIRIScalarRestrictionAccess().getMinLengthINTTerminalRuleCall_4_1_0()); }
		RULE_INT
		{ after(grammarAccess.getIRIScalarRestrictionAccess().getMinLengthINTTerminalRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IRIScalarRestriction__MaxLengthAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIRIScalarRestrictionAccess().getMaxLengthINTTerminalRuleCall_5_1_0()); }
		RULE_INT
		{ after(grammarAccess.getIRIScalarRestrictionAccess().getMaxLengthINTTerminalRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IRIScalarRestriction__PatternAssignment_6_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIRIScalarRestrictionAccess().getPatternSTRINGTerminalRuleCall_6_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getIRIScalarRestrictionAccess().getPatternSTRINGTerminalRuleCall_6_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IRIScalarRestriction__RestrictedRangeAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIRIScalarRestrictionAccess().getRestrictedRangeDataRangeCrossReference_8_0()); }
		(
			{ before(grammarAccess.getIRIScalarRestrictionAccess().getRestrictedRangeDataRangeReferenceParserRuleCall_8_0_1()); }
			ruleReference
			{ after(grammarAccess.getIRIScalarRestrictionAccess().getRestrictedRangeDataRangeReferenceParserRuleCall_8_0_1()); }
		)
		{ after(grammarAccess.getIRIScalarRestrictionAccess().getRestrictedRangeDataRangeCrossReference_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericScalarRestriction__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNumericScalarRestrictionAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getNumericScalarRestrictionAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericScalarRestriction__MinInclusiveAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNumericScalarRestrictionAccess().getMinInclusiveSTRINGTerminalRuleCall_3_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getNumericScalarRestrictionAccess().getMinInclusiveSTRINGTerminalRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericScalarRestriction__MaxInclusiveAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNumericScalarRestrictionAccess().getMaxInclusiveSTRINGTerminalRuleCall_4_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getNumericScalarRestrictionAccess().getMaxInclusiveSTRINGTerminalRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericScalarRestriction__MinExclusiveAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNumericScalarRestrictionAccess().getMinExclusiveSTRINGTerminalRuleCall_5_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getNumericScalarRestrictionAccess().getMinExclusiveSTRINGTerminalRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericScalarRestriction__MaxExclusiveAssignment_6_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNumericScalarRestrictionAccess().getMaxExclusiveSTRINGTerminalRuleCall_6_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getNumericScalarRestrictionAccess().getMaxExclusiveSTRINGTerminalRuleCall_6_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumericScalarRestriction__RestrictedRangeAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNumericScalarRestrictionAccess().getRestrictedRangeDataRangeCrossReference_8_0()); }
		(
			{ before(grammarAccess.getNumericScalarRestrictionAccess().getRestrictedRangeDataRangeReferenceParserRuleCall_8_0_1()); }
			ruleReference
			{ after(grammarAccess.getNumericScalarRestrictionAccess().getRestrictedRangeDataRangeReferenceParserRuleCall_8_0_1()); }
		)
		{ after(grammarAccess.getNumericScalarRestrictionAccess().getRestrictedRangeDataRangeCrossReference_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlainLiteralScalarRestrictionAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getPlainLiteralScalarRestrictionAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__LengthAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlainLiteralScalarRestrictionAccess().getLengthINTTerminalRuleCall_3_1_0()); }
		RULE_INT
		{ after(grammarAccess.getPlainLiteralScalarRestrictionAccess().getLengthINTTerminalRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__MinLengthAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlainLiteralScalarRestrictionAccess().getMinLengthINTTerminalRuleCall_4_1_0()); }
		RULE_INT
		{ after(grammarAccess.getPlainLiteralScalarRestrictionAccess().getMinLengthINTTerminalRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__MaxLengthAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlainLiteralScalarRestrictionAccess().getMaxLengthINTTerminalRuleCall_5_1_0()); }
		RULE_INT
		{ after(grammarAccess.getPlainLiteralScalarRestrictionAccess().getMaxLengthINTTerminalRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__PatternAssignment_6_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlainLiteralScalarRestrictionAccess().getPatternSTRINGTerminalRuleCall_6_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getPlainLiteralScalarRestrictionAccess().getPatternSTRINGTerminalRuleCall_6_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__LangRangeAssignment_7_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlainLiteralScalarRestrictionAccess().getLangRangeSTRINGTerminalRuleCall_7_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getPlainLiteralScalarRestrictionAccess().getLangRangeSTRINGTerminalRuleCall_7_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlainLiteralScalarRestriction__RestrictedRangeAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlainLiteralScalarRestrictionAccess().getRestrictedRangeDataRangeCrossReference_9_0()); }
		(
			{ before(grammarAccess.getPlainLiteralScalarRestrictionAccess().getRestrictedRangeDataRangeReferenceParserRuleCall_9_0_1()); }
			ruleReference
			{ after(grammarAccess.getPlainLiteralScalarRestrictionAccess().getRestrictedRangeDataRangeReferenceParserRuleCall_9_0_1()); }
		)
		{ after(grammarAccess.getPlainLiteralScalarRestrictionAccess().getRestrictedRangeDataRangeCrossReference_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarOneOfRestriction__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScalarOneOfRestrictionAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getScalarOneOfRestrictionAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarOneOfRestriction__RestrictedRangeAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScalarOneOfRestrictionAccess().getRestrictedRangeDataRangeCrossReference_4_0()); }
		(
			{ before(grammarAccess.getScalarOneOfRestrictionAccess().getRestrictedRangeDataRangeReferenceParserRuleCall_4_0_1()); }
			ruleReference
			{ after(grammarAccess.getScalarOneOfRestrictionAccess().getRestrictedRangeDataRangeReferenceParserRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getScalarOneOfRestrictionAccess().getRestrictedRangeDataRangeCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarOneOfLiteralAxiom__ValueAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScalarOneOfLiteralAxiomAccess().getValueSTRINGTerminalRuleCall_3_0()); }
		RULE_STRING
		{ after(grammarAccess.getScalarOneOfLiteralAxiomAccess().getValueSTRINGTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarOneOfLiteralAxiom__AxiomAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScalarOneOfLiteralAxiomAccess().getAxiomScalarOneOfRestrictionCrossReference_5_0()); }
		(
			{ before(grammarAccess.getScalarOneOfLiteralAxiomAccess().getAxiomScalarOneOfRestrictionReferenceParserRuleCall_5_0_1()); }
			ruleReference
			{ after(grammarAccess.getScalarOneOfLiteralAxiomAccess().getAxiomScalarOneOfRestrictionReferenceParserRuleCall_5_0_1()); }
		)
		{ after(grammarAccess.getScalarOneOfLiteralAxiomAccess().getAxiomScalarOneOfRestrictionCrossReference_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringScalarRestriction__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringScalarRestrictionAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getStringScalarRestrictionAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringScalarRestriction__LengthAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringScalarRestrictionAccess().getLengthINTTerminalRuleCall_3_1_0()); }
		RULE_INT
		{ after(grammarAccess.getStringScalarRestrictionAccess().getLengthINTTerminalRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringScalarRestriction__MinLengthAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringScalarRestrictionAccess().getMinLengthINTTerminalRuleCall_4_1_0()); }
		RULE_INT
		{ after(grammarAccess.getStringScalarRestrictionAccess().getMinLengthINTTerminalRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringScalarRestriction__MaxLengthAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringScalarRestrictionAccess().getMaxLengthINTTerminalRuleCall_5_1_0()); }
		RULE_INT
		{ after(grammarAccess.getStringScalarRestrictionAccess().getMaxLengthINTTerminalRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringScalarRestriction__PatternAssignment_6_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringScalarRestrictionAccess().getPatternSTRINGTerminalRuleCall_6_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getStringScalarRestrictionAccess().getPatternSTRINGTerminalRuleCall_6_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringScalarRestriction__RestrictedRangeAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringScalarRestrictionAccess().getRestrictedRangeDataRangeCrossReference_8_0()); }
		(
			{ before(grammarAccess.getStringScalarRestrictionAccess().getRestrictedRangeDataRangeReferenceParserRuleCall_8_0_1()); }
			ruleReference
			{ after(grammarAccess.getStringScalarRestrictionAccess().getRestrictedRangeDataRangeReferenceParserRuleCall_8_0_1()); }
		)
		{ after(grammarAccess.getStringScalarRestrictionAccess().getRestrictedRangeDataRangeCrossReference_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SynonymScalarRestriction__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSynonymScalarRestrictionAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getSynonymScalarRestrictionAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SynonymScalarRestriction__RestrictedRangeAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSynonymScalarRestrictionAccess().getRestrictedRangeDataRangeCrossReference_4_0()); }
		(
			{ before(grammarAccess.getSynonymScalarRestrictionAccess().getRestrictedRangeDataRangeReferenceParserRuleCall_4_0_1()); }
			ruleReference
			{ after(grammarAccess.getSynonymScalarRestrictionAccess().getRestrictedRangeDataRangeReferenceParserRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getSynonymScalarRestrictionAccess().getRestrictedRangeDataRangeCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeScalarRestriction__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeScalarRestrictionAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTimeScalarRestrictionAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeScalarRestriction__MinInclusiveAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeScalarRestrictionAccess().getMinInclusiveSTRINGTerminalRuleCall_3_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getTimeScalarRestrictionAccess().getMinInclusiveSTRINGTerminalRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeScalarRestriction__MaxInclusiveAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeScalarRestrictionAccess().getMaxInclusiveSTRINGTerminalRuleCall_4_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getTimeScalarRestrictionAccess().getMaxInclusiveSTRINGTerminalRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeScalarRestriction__MinExclusiveAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeScalarRestrictionAccess().getMinExclusiveSTRINGTerminalRuleCall_5_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getTimeScalarRestrictionAccess().getMinExclusiveSTRINGTerminalRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeScalarRestriction__MaxExclusiveAssignment_6_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeScalarRestrictionAccess().getMaxExclusiveSTRINGTerminalRuleCall_6_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getTimeScalarRestrictionAccess().getMaxExclusiveSTRINGTerminalRuleCall_6_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimeScalarRestriction__RestrictedRangeAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeScalarRestrictionAccess().getRestrictedRangeDataRangeCrossReference_8_0()); }
		(
			{ before(grammarAccess.getTimeScalarRestrictionAccess().getRestrictedRangeDataRangeReferenceParserRuleCall_8_0_1()); }
			ruleReference
			{ after(grammarAccess.getTimeScalarRestrictionAccess().getRestrictedRangeDataRangeReferenceParserRuleCall_8_0_1()); }
		)
		{ after(grammarAccess.getTimeScalarRestrictionAccess().getRestrictedRangeDataRangeCrossReference_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DescriptionBox__KindAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDescriptionBoxAccess().getKindDescriptionKindEnumRuleCall_0_0()); }
		ruleDescriptionKind
		{ after(grammarAccess.getDescriptionBoxAccess().getKindDescriptionKindEnumRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DescriptionBox__IriAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDescriptionBoxAccess().getIriIRITerminalRuleCall_2_0()); }
		RULE_IRI
		{ after(grammarAccess.getDescriptionBoxAccess().getIriIRITerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DescriptionBox__AnnotationsAssignment_4_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDescriptionBoxAccess().getAnnotationsAnnotationParserRuleCall_4_0_0()); }
		ruleAnnotation
		{ after(grammarAccess.getDescriptionBoxAccess().getAnnotationsAnnotationParserRuleCall_4_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DescriptionBox__ClosedWorldDefinitionsAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDescriptionBoxAccess().getClosedWorldDefinitionsDescriptionBoxExtendsClosedWorldDefinitionsParserRuleCall_4_1_0()); }
		ruleDescriptionBoxExtendsClosedWorldDefinitions
		{ after(grammarAccess.getDescriptionBoxAccess().getClosedWorldDefinitionsDescriptionBoxExtendsClosedWorldDefinitionsParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DescriptionBox__DescriptionBoxRefinementsAssignment_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDescriptionBoxAccess().getDescriptionBoxRefinementsDescriptionBoxRefinementParserRuleCall_4_2_0()); }
		ruleDescriptionBoxRefinement
		{ after(grammarAccess.getDescriptionBoxAccess().getDescriptionBoxRefinementsDescriptionBoxRefinementParserRuleCall_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DescriptionBox__ConceptInstancesAssignment_4_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDescriptionBoxAccess().getConceptInstancesConceptInstanceParserRuleCall_4_3_0()); }
		ruleConceptInstance
		{ after(grammarAccess.getDescriptionBoxAccess().getConceptInstancesConceptInstanceParserRuleCall_4_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DescriptionBox__ReifiedRelationshipInstancesAssignment_4_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDescriptionBoxAccess().getReifiedRelationshipInstancesReifiedRelationshipInstanceParserRuleCall_4_4_0()); }
		ruleReifiedRelationshipInstance
		{ after(grammarAccess.getDescriptionBoxAccess().getReifiedRelationshipInstancesReifiedRelationshipInstanceParserRuleCall_4_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DescriptionBox__ReifiedRelationshipInstanceDomainsAssignment_4_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDescriptionBoxAccess().getReifiedRelationshipInstanceDomainsReifiedRelationshipInstanceDomainParserRuleCall_4_5_0()); }
		ruleReifiedRelationshipInstanceDomain
		{ after(grammarAccess.getDescriptionBoxAccess().getReifiedRelationshipInstanceDomainsReifiedRelationshipInstanceDomainParserRuleCall_4_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DescriptionBox__ReifiedRelationshipInstanceRangesAssignment_4_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDescriptionBoxAccess().getReifiedRelationshipInstanceRangesReifiedRelationshipInstanceRangeParserRuleCall_4_6_0()); }
		ruleReifiedRelationshipInstanceRange
		{ after(grammarAccess.getDescriptionBoxAccess().getReifiedRelationshipInstanceRangesReifiedRelationshipInstanceRangeParserRuleCall_4_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DescriptionBox__UnreifiedRelationshipInstanceTuplesAssignment_4_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDescriptionBoxAccess().getUnreifiedRelationshipInstanceTuplesUnreifiedRelationshipInstanceTupleParserRuleCall_4_7_0()); }
		ruleUnreifiedRelationshipInstanceTuple
		{ after(grammarAccess.getDescriptionBoxAccess().getUnreifiedRelationshipInstanceTuplesUnreifiedRelationshipInstanceTupleParserRuleCall_4_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DescriptionBoxExtendsClosedWorldDefinitions__ClosedWorldDefinitionsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDescriptionBoxExtendsClosedWorldDefinitionsAccess().getClosedWorldDefinitionsTerminologyBoxCrossReference_1_0()); }
		(
			{ before(grammarAccess.getDescriptionBoxExtendsClosedWorldDefinitionsAccess().getClosedWorldDefinitionsTerminologyBoxReferenceParserRuleCall_1_0_1()); }
			ruleReference
			{ after(grammarAccess.getDescriptionBoxExtendsClosedWorldDefinitionsAccess().getClosedWorldDefinitionsTerminologyBoxReferenceParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getDescriptionBoxExtendsClosedWorldDefinitionsAccess().getClosedWorldDefinitionsTerminologyBoxCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DescriptionBoxRefinement__RefinedDescriptionBoxAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDescriptionBoxRefinementAccess().getRefinedDescriptionBoxDescriptionBoxCrossReference_1_0()); }
		(
			{ before(grammarAccess.getDescriptionBoxRefinementAccess().getRefinedDescriptionBoxDescriptionBoxReferenceParserRuleCall_1_0_1()); }
			ruleReference
			{ after(grammarAccess.getDescriptionBoxRefinementAccess().getRefinedDescriptionBoxDescriptionBoxReferenceParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getDescriptionBoxRefinementAccess().getRefinedDescriptionBoxDescriptionBoxCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarDataPropertyValue__ScalarPropertyValueAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScalarDataPropertyValueAccess().getScalarPropertyValueReferenceParserRuleCall_3_0()); }
		ruleReference
		{ after(grammarAccess.getScalarDataPropertyValueAccess().getScalarPropertyValueReferenceParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ScalarDataPropertyValue__ScalarDataPropertyAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScalarDataPropertyValueAccess().getScalarDataPropertyDataRelationshipToScalarCrossReference_5_0()); }
		(
			{ before(grammarAccess.getScalarDataPropertyValueAccess().getScalarDataPropertyDataRelationshipToScalarReferenceParserRuleCall_5_0_1()); }
			ruleReference
			{ after(grammarAccess.getScalarDataPropertyValueAccess().getScalarDataPropertyDataRelationshipToScalarReferenceParserRuleCall_5_0_1()); }
		)
		{ after(grammarAccess.getScalarDataPropertyValueAccess().getScalarDataPropertyDataRelationshipToScalarCrossReference_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuredDataPropertyValue__StructuredDataPropertyAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStructuredDataPropertyValueAccess().getStructuredDataPropertyDataRelationshipToStructureCrossReference_3_0()); }
		(
			{ before(grammarAccess.getStructuredDataPropertyValueAccess().getStructuredDataPropertyDataRelationshipToStructureReferenceParserRuleCall_3_0_1()); }
			ruleReference
			{ after(grammarAccess.getStructuredDataPropertyValueAccess().getStructuredDataPropertyDataRelationshipToStructureReferenceParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getStructuredDataPropertyValueAccess().getStructuredDataPropertyDataRelationshipToStructureCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuredDataPropertyValue__StructuredPropertyTupleAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStructuredDataPropertyValueAccess().getStructuredPropertyTupleDataStructureTupleParserRuleCall_5_0()); }
		ruleDataStructureTuple
		{ after(grammarAccess.getStructuredDataPropertyValueAccess().getStructuredPropertyTupleDataStructureTupleParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataStructureTuple__DataStructureTypeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataStructureTupleAccess().getDataStructureTypeStructureCrossReference_3_0()); }
		(
			{ before(grammarAccess.getDataStructureTupleAccess().getDataStructureTypeStructureReferenceParserRuleCall_3_0_1()); }
			ruleReference
			{ after(grammarAccess.getDataStructureTupleAccess().getDataStructureTypeStructureReferenceParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getDataStructureTupleAccess().getDataStructureTypeStructureCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptInstance__SingletonConceptClassifierAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConceptInstanceAccess().getSingletonConceptClassifierConceptCrossReference_3_0()); }
		(
			{ before(grammarAccess.getConceptInstanceAccess().getSingletonConceptClassifierConceptReferenceParserRuleCall_3_0_1()); }
			ruleReference
			{ after(grammarAccess.getConceptInstanceAccess().getSingletonConceptClassifierConceptReferenceParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getConceptInstanceAccess().getSingletonConceptClassifierConceptCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstance__SingletonReifiedRelationshipClassifierAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReifiedRelationshipInstanceAccess().getSingletonReifiedRelationshipClassifierReifiedRelationshipCrossReference_3_0()); }
		(
			{ before(grammarAccess.getReifiedRelationshipInstanceAccess().getSingletonReifiedRelationshipClassifierReifiedRelationshipReferenceParserRuleCall_3_0_1()); }
			ruleReference
			{ after(grammarAccess.getReifiedRelationshipInstanceAccess().getSingletonReifiedRelationshipClassifierReifiedRelationshipReferenceParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getReifiedRelationshipInstanceAccess().getSingletonReifiedRelationshipClassifierReifiedRelationshipCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstanceDomain__ReifiedRelationshipInstanceAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReifiedRelationshipInstanceDomainAccess().getReifiedRelationshipInstanceReifiedRelationshipInstanceCrossReference_3_0()); }
		(
			{ before(grammarAccess.getReifiedRelationshipInstanceDomainAccess().getReifiedRelationshipInstanceReifiedRelationshipInstanceReferenceParserRuleCall_3_0_1()); }
			ruleReference
			{ after(grammarAccess.getReifiedRelationshipInstanceDomainAccess().getReifiedRelationshipInstanceReifiedRelationshipInstanceReferenceParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getReifiedRelationshipInstanceDomainAccess().getReifiedRelationshipInstanceReifiedRelationshipInstanceCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstanceDomain__DomainAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReifiedRelationshipInstanceDomainAccess().getDomainConceptualEntitySingletonInstanceCrossReference_5_0()); }
		(
			{ before(grammarAccess.getReifiedRelationshipInstanceDomainAccess().getDomainConceptualEntitySingletonInstanceReferenceParserRuleCall_5_0_1()); }
			ruleReference
			{ after(grammarAccess.getReifiedRelationshipInstanceDomainAccess().getDomainConceptualEntitySingletonInstanceReferenceParserRuleCall_5_0_1()); }
		)
		{ after(grammarAccess.getReifiedRelationshipInstanceDomainAccess().getDomainConceptualEntitySingletonInstanceCrossReference_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstanceRange__ReifiedRelationshipInstanceAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReifiedRelationshipInstanceRangeAccess().getReifiedRelationshipInstanceReifiedRelationshipInstanceCrossReference_3_0()); }
		(
			{ before(grammarAccess.getReifiedRelationshipInstanceRangeAccess().getReifiedRelationshipInstanceReifiedRelationshipInstanceReferenceParserRuleCall_3_0_1()); }
			ruleReference
			{ after(grammarAccess.getReifiedRelationshipInstanceRangeAccess().getReifiedRelationshipInstanceReifiedRelationshipInstanceReferenceParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getReifiedRelationshipInstanceRangeAccess().getReifiedRelationshipInstanceReifiedRelationshipInstanceCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReifiedRelationshipInstanceRange__RangeAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReifiedRelationshipInstanceRangeAccess().getRangeConceptualEntitySingletonInstanceCrossReference_5_0()); }
		(
			{ before(grammarAccess.getReifiedRelationshipInstanceRangeAccess().getRangeConceptualEntitySingletonInstanceReferenceParserRuleCall_5_0_1()); }
			ruleReference
			{ after(grammarAccess.getReifiedRelationshipInstanceRangeAccess().getRangeConceptualEntitySingletonInstanceReferenceParserRuleCall_5_0_1()); }
		)
		{ after(grammarAccess.getReifiedRelationshipInstanceRangeAccess().getRangeConceptualEntitySingletonInstanceCrossReference_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationshipInstanceTuple__UnreifiedRelationshipAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getUnreifiedRelationshipUnreifiedRelationshipCrossReference_3_0()); }
		(
			{ before(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getUnreifiedRelationshipUnreifiedRelationshipReferenceParserRuleCall_3_0_1()); }
			ruleReference
			{ after(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getUnreifiedRelationshipUnreifiedRelationshipReferenceParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getUnreifiedRelationshipUnreifiedRelationshipCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationshipInstanceTuple__DomainAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getDomainConceptualEntitySingletonInstanceCrossReference_5_0()); }
		(
			{ before(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getDomainConceptualEntitySingletonInstanceReferenceParserRuleCall_5_0_1()); }
			ruleReference
			{ after(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getDomainConceptualEntitySingletonInstanceReferenceParserRuleCall_5_0_1()); }
		)
		{ after(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getDomainConceptualEntitySingletonInstanceCrossReference_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnreifiedRelationshipInstanceTuple__RangeAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getRangeConceptualEntitySingletonInstanceCrossReference_7_0()); }
		(
			{ before(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getRangeConceptualEntitySingletonInstanceReferenceParserRuleCall_7_0_1()); }
			ruleReference
			{ after(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getRangeConceptualEntitySingletonInstanceReferenceParserRuleCall_7_0_1()); }
		)
		{ after(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getRangeConceptualEntitySingletonInstanceCrossReference_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

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

RULE_CONCEPT_SPECIALIZATION_AXIOM_TOKEN : 'extendsConcept';

RULE_ASPECT_SPECIALIZATION_AXIOM_TOKEN : 'extendsAspect';

RULE_REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_TOKEN : 'extendsRelationship';

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
