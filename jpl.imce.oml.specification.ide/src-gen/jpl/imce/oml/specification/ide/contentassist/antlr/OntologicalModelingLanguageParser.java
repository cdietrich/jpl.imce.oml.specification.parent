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
package jpl.imce.oml.specification.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import jpl.imce.oml.specification.ide.contentassist.antlr.internal.InternalOntologicalModelingLanguageParser;
import jpl.imce.oml.specification.services.OntologicalModelingLanguageGrammarAccess;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class OntologicalModelingLanguageParser extends AbstractContentAssistParser {

	@Inject
	private OntologicalModelingLanguageGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalOntologicalModelingLanguageParser createParser() {
		InternalOntologicalModelingLanguageParser result = new InternalOntologicalModelingLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTerminologyExtentAccess().getAlternatives_1(), "rule__TerminologyExtent__Alternatives_1");
					put(grammarAccess.getTerminologyBoxAccess().getAlternatives(), "rule__TerminologyBox__Alternatives");
					put(grammarAccess.getTerminologyGraphAccess().getAlternatives_4(), "rule__TerminologyGraph__Alternatives_4");
					put(grammarAccess.getBundleAccess().getAlternatives_4(), "rule__Bundle__Alternatives_4");
					put(grammarAccess.getTerminologyBoxAxiomAccess().getAlternatives(), "rule__TerminologyBoxAxiom__Alternatives");
					put(grammarAccess.getTerminologyBoxStatementAccess().getAlternatives(), "rule__TerminologyBoxStatement__Alternatives");
					put(grammarAccess.getTermAccess().getAlternatives(), "rule__Term__Alternatives");
					put(grammarAccess.getAtomicEntityAccess().getAlternatives(), "rule__AtomicEntity__Alternatives");
					put(grammarAccess.getEntityRelationshipAccess().getAlternatives(), "rule__EntityRelationship__Alternatives");
					put(grammarAccess.getDatatypeAccess().getAlternatives(), "rule__Datatype__Alternatives");
					put(grammarAccess.getScalarDataRangeAccess().getAlternatives(), "rule__ScalarDataRange__Alternatives");
					put(grammarAccess.getRestrictedDataRangeAccess().getAlternatives(), "rule__RestrictedDataRange__Alternatives");
					put(grammarAccess.getDataRelationshipAccess().getAlternatives(), "rule__DataRelationship__Alternatives");
					put(grammarAccess.getAxiomAccess().getAlternatives(), "rule__Axiom__Alternatives");
					put(grammarAccess.getTermAxiomAccess().getAlternatives(), "rule__TermAxiom__Alternatives");
					put(grammarAccess.getEntityRestrictionAxiomAccess().getAlternatives(), "rule__EntityRestrictionAxiom__Alternatives");
					put(grammarAccess.getEntityScalarDataPropertyRestrictionAxiomAccess().getAlternatives(), "rule__EntityScalarDataPropertyRestrictionAxiom__Alternatives");
					put(grammarAccess.getSpecializationAxiomAccess().getAlternatives(), "rule__SpecializationAxiom__Alternatives");
					put(grammarAccess.getTerminologyBundleStatementAccess().getAlternatives(), "rule__TerminologyBundleStatement__Alternatives");
					put(grammarAccess.getConceptTreeDisjunctionAccess().getAlternatives(), "rule__ConceptTreeDisjunction__Alternatives");
					put(grammarAccess.getDescriptionBoxAccess().getAlternatives_4(), "rule__DescriptionBox__Alternatives_4");
					put(grammarAccess.getTerminologyInstanceAssertionAccess().getAlternatives(), "rule__TerminologyInstanceAssertion__Alternatives");
					put(grammarAccess.getReferenceAccess().getAlternatives(), "rule__Reference__Alternatives");
					put(grammarAccess.getQNAMEAccess().getAlternatives(), "rule__QNAME__Alternatives");
					put(grammarAccess.getTerminologyGraphKindAccess().getAlternatives(), "rule__TerminologyGraphKind__Alternatives");
					put(grammarAccess.getDescriptionKindAccess().getAlternatives(), "rule__DescriptionKind__Alternatives");
					put(grammarAccess.getTerminologyExtentAccess().getGroup(), "rule__TerminologyExtent__Group__0");
					put(grammarAccess.getAnnotationPropertyAccess().getGroup(), "rule__AnnotationProperty__Group__0");
					put(grammarAccess.getAnnotationAccess().getGroup(), "rule__Annotation__Group__0");
					put(grammarAccess.getTerminologyGraphAccess().getGroup(), "rule__TerminologyGraph__Group__0");
					put(grammarAccess.getBundleAccess().getGroup(), "rule__Bundle__Group__0");
					put(grammarAccess.getAspectAccess().getGroup(), "rule__Aspect__Group__0");
					put(grammarAccess.getConceptAccess().getGroup(), "rule__Concept__Group__0");
					put(grammarAccess.getReifiedRelationshipAccess().getGroup(), "rule__ReifiedRelationship__Group__0");
					put(grammarAccess.getReifiedRelationshipAccess().getGroup_16(), "rule__ReifiedRelationship__Group_16__0");
					put(grammarAccess.getUnreifiedRelationshipAccess().getGroup(), "rule__UnreifiedRelationship__Group__0");
					put(grammarAccess.getScalarAccess().getGroup(), "rule__Scalar__Group__0");
					put(grammarAccess.getStructureAccess().getGroup(), "rule__Structure__Group__0");
					put(grammarAccess.getEntityStructuredDataPropertyAccess().getGroup(), "rule__EntityStructuredDataProperty__Group__0");
					put(grammarAccess.getEntityScalarDataPropertyAccess().getGroup(), "rule__EntityScalarDataProperty__Group__0");
					put(grammarAccess.getStructuredDataPropertyAccess().getGroup(), "rule__StructuredDataProperty__Group__0");
					put(grammarAccess.getScalarDataPropertyAccess().getGroup(), "rule__ScalarDataProperty__Group__0");
					put(grammarAccess.getAnonymousConceptTaxonomyAxiomAccess().getGroup(), "rule__AnonymousConceptTaxonomyAxiom__Group__0");
					put(grammarAccess.getRootConceptTaxonomyAxiomAccess().getGroup(), "rule__RootConceptTaxonomyAxiom__Group__0");
					put(grammarAccess.getSpecificDisjointConceptAxiomAccess().getGroup(), "rule__SpecificDisjointConceptAxiom__Group__0");
					put(grammarAccess.getBundledTerminologyAxiomAccess().getGroup(), "rule__BundledTerminologyAxiom__Group__0");
					put(grammarAccess.getConceptDesignationTerminologyAxiomAccess().getGroup(), "rule__ConceptDesignationTerminologyAxiom__Group__0");
					put(grammarAccess.getTerminologyExtensionAxiomAccess().getGroup(), "rule__TerminologyExtensionAxiom__Group__0");
					put(grammarAccess.getTerminologyNestingAxiomAccess().getGroup(), "rule__TerminologyNestingAxiom__Group__0");
					put(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getGroup(), "rule__EntityExistentialRestrictionAxiom__Group__0");
					put(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getGroup(), "rule__EntityUniversalRestrictionAxiom__Group__0");
					put(grammarAccess.getAspectSpecializationAxiomAccess().getGroup(), "rule__AspectSpecializationAxiom__Group__0");
					put(grammarAccess.getConceptSpecializationAxiomAccess().getGroup(), "rule__ConceptSpecializationAxiom__Group__0");
					put(grammarAccess.getReifiedRelationshipSpecializationAxiomAccess().getGroup(), "rule__ReifiedRelationshipSpecializationAxiom__Group__0");
					put(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getGroup(), "rule__EntityScalarDataPropertyExistentialRestrictionAxiom__Group__0");
					put(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getGroup(), "rule__EntityScalarDataPropertyParticularRestrictionAxiom__Group__0");
					put(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getGroup(), "rule__EntityScalarDataPropertyUniversalRestrictionAxiom__Group__0");
					put(grammarAccess.getBinaryScalarRestrictionAccess().getGroup(), "rule__BinaryScalarRestriction__Group__0");
					put(grammarAccess.getBinaryScalarRestrictionAccess().getGroup_3(), "rule__BinaryScalarRestriction__Group_3__0");
					put(grammarAccess.getBinaryScalarRestrictionAccess().getGroup_4(), "rule__BinaryScalarRestriction__Group_4__0");
					put(grammarAccess.getBinaryScalarRestrictionAccess().getGroup_5(), "rule__BinaryScalarRestriction__Group_5__0");
					put(grammarAccess.getIRIScalarRestrictionAccess().getGroup(), "rule__IRIScalarRestriction__Group__0");
					put(grammarAccess.getIRIScalarRestrictionAccess().getGroup_3(), "rule__IRIScalarRestriction__Group_3__0");
					put(grammarAccess.getIRIScalarRestrictionAccess().getGroup_4(), "rule__IRIScalarRestriction__Group_4__0");
					put(grammarAccess.getIRIScalarRestrictionAccess().getGroup_5(), "rule__IRIScalarRestriction__Group_5__0");
					put(grammarAccess.getIRIScalarRestrictionAccess().getGroup_6(), "rule__IRIScalarRestriction__Group_6__0");
					put(grammarAccess.getNumericScalarRestrictionAccess().getGroup(), "rule__NumericScalarRestriction__Group__0");
					put(grammarAccess.getNumericScalarRestrictionAccess().getGroup_3(), "rule__NumericScalarRestriction__Group_3__0");
					put(grammarAccess.getNumericScalarRestrictionAccess().getGroup_4(), "rule__NumericScalarRestriction__Group_4__0");
					put(grammarAccess.getNumericScalarRestrictionAccess().getGroup_5(), "rule__NumericScalarRestriction__Group_5__0");
					put(grammarAccess.getNumericScalarRestrictionAccess().getGroup_6(), "rule__NumericScalarRestriction__Group_6__0");
					put(grammarAccess.getPlainLiteralScalarRestrictionAccess().getGroup(), "rule__PlainLiteralScalarRestriction__Group__0");
					put(grammarAccess.getPlainLiteralScalarRestrictionAccess().getGroup_3(), "rule__PlainLiteralScalarRestriction__Group_3__0");
					put(grammarAccess.getPlainLiteralScalarRestrictionAccess().getGroup_4(), "rule__PlainLiteralScalarRestriction__Group_4__0");
					put(grammarAccess.getPlainLiteralScalarRestrictionAccess().getGroup_5(), "rule__PlainLiteralScalarRestriction__Group_5__0");
					put(grammarAccess.getPlainLiteralScalarRestrictionAccess().getGroup_6(), "rule__PlainLiteralScalarRestriction__Group_6__0");
					put(grammarAccess.getPlainLiteralScalarRestrictionAccess().getGroup_7(), "rule__PlainLiteralScalarRestriction__Group_7__0");
					put(grammarAccess.getScalarOneOfRestrictionAccess().getGroup(), "rule__ScalarOneOfRestriction__Group__0");
					put(grammarAccess.getScalarOneOfLiteralAxiomAccess().getGroup(), "rule__ScalarOneOfLiteralAxiom__Group__0");
					put(grammarAccess.getStringScalarRestrictionAccess().getGroup(), "rule__StringScalarRestriction__Group__0");
					put(grammarAccess.getStringScalarRestrictionAccess().getGroup_3(), "rule__StringScalarRestriction__Group_3__0");
					put(grammarAccess.getStringScalarRestrictionAccess().getGroup_4(), "rule__StringScalarRestriction__Group_4__0");
					put(grammarAccess.getStringScalarRestrictionAccess().getGroup_5(), "rule__StringScalarRestriction__Group_5__0");
					put(grammarAccess.getStringScalarRestrictionAccess().getGroup_6(), "rule__StringScalarRestriction__Group_6__0");
					put(grammarAccess.getSynonymScalarRestrictionAccess().getGroup(), "rule__SynonymScalarRestriction__Group__0");
					put(grammarAccess.getTimeScalarRestrictionAccess().getGroup(), "rule__TimeScalarRestriction__Group__0");
					put(grammarAccess.getTimeScalarRestrictionAccess().getGroup_3(), "rule__TimeScalarRestriction__Group_3__0");
					put(grammarAccess.getTimeScalarRestrictionAccess().getGroup_4(), "rule__TimeScalarRestriction__Group_4__0");
					put(grammarAccess.getTimeScalarRestrictionAccess().getGroup_5(), "rule__TimeScalarRestriction__Group_5__0");
					put(grammarAccess.getTimeScalarRestrictionAccess().getGroup_6(), "rule__TimeScalarRestriction__Group_6__0");
					put(grammarAccess.getDescriptionBoxAccess().getGroup(), "rule__DescriptionBox__Group__0");
					put(grammarAccess.getDescriptionBoxExtendsClosedWorldDefinitionsAccess().getGroup(), "rule__DescriptionBoxExtendsClosedWorldDefinitions__Group__0");
					put(grammarAccess.getDescriptionBoxRefinementAccess().getGroup(), "rule__DescriptionBoxRefinement__Group__0");
					put(grammarAccess.getScalarDataPropertyValueAccess().getGroup(), "rule__ScalarDataPropertyValue__Group__0");
					put(grammarAccess.getStructuredDataPropertyValueAccess().getGroup(), "rule__StructuredDataPropertyValue__Group__0");
					put(grammarAccess.getDataStructureTupleAccess().getGroup(), "rule__DataStructureTuple__Group__0");
					put(grammarAccess.getConceptInstanceAccess().getGroup(), "rule__ConceptInstance__Group__0");
					put(grammarAccess.getReifiedRelationshipInstanceAccess().getGroup(), "rule__ReifiedRelationshipInstance__Group__0");
					put(grammarAccess.getReifiedRelationshipInstanceDomainAccess().getGroup(), "rule__ReifiedRelationshipInstanceDomain__Group__0");
					put(grammarAccess.getReifiedRelationshipInstanceRangeAccess().getGroup(), "rule__ReifiedRelationshipInstanceRange__Group__0");
					put(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getGroup(), "rule__UnreifiedRelationshipInstanceTuple__Group__0");
					put(grammarAccess.getABBREV_IRIAccess().getGroup(), "rule__ABBREV_IRI__Group__0");
					put(grammarAccess.getTerminologyExtentAccess().getAnnotationPropertiesAssignment_1_0(), "rule__TerminologyExtent__AnnotationPropertiesAssignment_1_0");
					put(grammarAccess.getTerminologyExtentAccess().getTerminologyGraphsAssignment_1_1(), "rule__TerminologyExtent__TerminologyGraphsAssignment_1_1");
					put(grammarAccess.getTerminologyExtentAccess().getBundlesAssignment_1_2(), "rule__TerminologyExtent__BundlesAssignment_1_2");
					put(grammarAccess.getTerminologyExtentAccess().getDescriptionsAssignment_1_3(), "rule__TerminologyExtent__DescriptionsAssignment_1_3");
					put(grammarAccess.getAnnotationPropertyAccess().getAbbrevIRIAssignment_1(), "rule__AnnotationProperty__AbbrevIRIAssignment_1");
					put(grammarAccess.getAnnotationPropertyAccess().getIriAssignment_3(), "rule__AnnotationProperty__IriAssignment_3");
					put(grammarAccess.getAnnotationAccess().getPropertyAssignment_1(), "rule__Annotation__PropertyAssignment_1");
					put(grammarAccess.getAnnotationAccess().getValueAssignment_3(), "rule__Annotation__ValueAssignment_3");
					put(grammarAccess.getTerminologyGraphAccess().getKindAssignment_0(), "rule__TerminologyGraph__KindAssignment_0");
					put(grammarAccess.getTerminologyGraphAccess().getIriAssignment_2(), "rule__TerminologyGraph__IriAssignment_2");
					put(grammarAccess.getTerminologyGraphAccess().getAnnotationsAssignment_4_0(), "rule__TerminologyGraph__AnnotationsAssignment_4_0");
					put(grammarAccess.getTerminologyGraphAccess().getTerminologyBoxAxiomsAssignment_4_1(), "rule__TerminologyGraph__TerminologyBoxAxiomsAssignment_4_1");
					put(grammarAccess.getTerminologyGraphAccess().getBoxStatementsAssignment_4_2(), "rule__TerminologyGraph__BoxStatementsAssignment_4_2");
					put(grammarAccess.getBundleAccess().getKindAssignment_0(), "rule__Bundle__KindAssignment_0");
					put(grammarAccess.getBundleAccess().getIriAssignment_2(), "rule__Bundle__IriAssignment_2");
					put(grammarAccess.getBundleAccess().getAnnotationsAssignment_4_0(), "rule__Bundle__AnnotationsAssignment_4_0");
					put(grammarAccess.getBundleAccess().getTerminologyBoxAxiomsAssignment_4_1(), "rule__Bundle__TerminologyBoxAxiomsAssignment_4_1");
					put(grammarAccess.getBundleAccess().getBoxStatementsAssignment_4_2(), "rule__Bundle__BoxStatementsAssignment_4_2");
					put(grammarAccess.getBundleAccess().getBundleStatementsAssignment_4_3(), "rule__Bundle__BundleStatementsAssignment_4_3");
					put(grammarAccess.getBundleAccess().getTerminologyBundleAxiomsAssignment_4_4(), "rule__Bundle__TerminologyBundleAxiomsAssignment_4_4");
					put(grammarAccess.getAspectAccess().getNameAssignment_1(), "rule__Aspect__NameAssignment_1");
					put(grammarAccess.getConceptAccess().getIsAbstractAssignment_0(), "rule__Concept__IsAbstractAssignment_0");
					put(grammarAccess.getConceptAccess().getNameAssignment_2(), "rule__Concept__NameAssignment_2");
					put(grammarAccess.getReifiedRelationshipAccess().getIsAbstractAssignment_0(), "rule__ReifiedRelationship__IsAbstractAssignment_0");
					put(grammarAccess.getReifiedRelationshipAccess().getNameAssignment_2(), "rule__ReifiedRelationship__NameAssignment_2");
					put(grammarAccess.getReifiedRelationshipAccess().getIsFunctionalAssignment_4(), "rule__ReifiedRelationship__IsFunctionalAssignment_4");
					put(grammarAccess.getReifiedRelationshipAccess().getIsInverseFunctionalAssignment_5(), "rule__ReifiedRelationship__IsInverseFunctionalAssignment_5");
					put(grammarAccess.getReifiedRelationshipAccess().getIsEssentialAssignment_6(), "rule__ReifiedRelationship__IsEssentialAssignment_6");
					put(grammarAccess.getReifiedRelationshipAccess().getIsInverseEssentialAssignment_7(), "rule__ReifiedRelationship__IsInverseEssentialAssignment_7");
					put(grammarAccess.getReifiedRelationshipAccess().getIsSymmetricAssignment_8(), "rule__ReifiedRelationship__IsSymmetricAssignment_8");
					put(grammarAccess.getReifiedRelationshipAccess().getIsAsymmetricAssignment_9(), "rule__ReifiedRelationship__IsAsymmetricAssignment_9");
					put(grammarAccess.getReifiedRelationshipAccess().getIsReflexiveAssignment_10(), "rule__ReifiedRelationship__IsReflexiveAssignment_10");
					put(grammarAccess.getReifiedRelationshipAccess().getIsIrreflexiveAssignment_11(), "rule__ReifiedRelationship__IsIrreflexiveAssignment_11");
					put(grammarAccess.getReifiedRelationshipAccess().getIsTransitiveAssignment_12(), "rule__ReifiedRelationship__IsTransitiveAssignment_12");
					put(grammarAccess.getReifiedRelationshipAccess().getUnreifiedPropertyNameAssignment_15(), "rule__ReifiedRelationship__UnreifiedPropertyNameAssignment_15");
					put(grammarAccess.getReifiedRelationshipAccess().getUnreifiedInversePropertyNameAssignment_16_2(), "rule__ReifiedRelationship__UnreifiedInversePropertyNameAssignment_16_2");
					put(grammarAccess.getReifiedRelationshipAccess().getSourceAssignment_19(), "rule__ReifiedRelationship__SourceAssignment_19");
					put(grammarAccess.getReifiedRelationshipAccess().getTargetAssignment_22(), "rule__ReifiedRelationship__TargetAssignment_22");
					put(grammarAccess.getUnreifiedRelationshipAccess().getNameAssignment_1(), "rule__UnreifiedRelationship__NameAssignment_1");
					put(grammarAccess.getUnreifiedRelationshipAccess().getIsFunctionalAssignment_3(), "rule__UnreifiedRelationship__IsFunctionalAssignment_3");
					put(grammarAccess.getUnreifiedRelationshipAccess().getIsInverseFunctionalAssignment_4(), "rule__UnreifiedRelationship__IsInverseFunctionalAssignment_4");
					put(grammarAccess.getUnreifiedRelationshipAccess().getIsEssentialAssignment_5(), "rule__UnreifiedRelationship__IsEssentialAssignment_5");
					put(grammarAccess.getUnreifiedRelationshipAccess().getIsInverseEssentialAssignment_6(), "rule__UnreifiedRelationship__IsInverseEssentialAssignment_6");
					put(grammarAccess.getUnreifiedRelationshipAccess().getIsSymmetricAssignment_7(), "rule__UnreifiedRelationship__IsSymmetricAssignment_7");
					put(grammarAccess.getUnreifiedRelationshipAccess().getIsAsymmetricAssignment_8(), "rule__UnreifiedRelationship__IsAsymmetricAssignment_8");
					put(grammarAccess.getUnreifiedRelationshipAccess().getIsReflexiveAssignment_9(), "rule__UnreifiedRelationship__IsReflexiveAssignment_9");
					put(grammarAccess.getUnreifiedRelationshipAccess().getIsIrreflexiveAssignment_10(), "rule__UnreifiedRelationship__IsIrreflexiveAssignment_10");
					put(grammarAccess.getUnreifiedRelationshipAccess().getIsTransitiveAssignment_11(), "rule__UnreifiedRelationship__IsTransitiveAssignment_11");
					put(grammarAccess.getUnreifiedRelationshipAccess().getSourceAssignment_14(), "rule__UnreifiedRelationship__SourceAssignment_14");
					put(grammarAccess.getUnreifiedRelationshipAccess().getTargetAssignment_17(), "rule__UnreifiedRelationship__TargetAssignment_17");
					put(grammarAccess.getScalarAccess().getNameAssignment_1(), "rule__Scalar__NameAssignment_1");
					put(grammarAccess.getStructureAccess().getNameAssignment_1(), "rule__Structure__NameAssignment_1");
					put(grammarAccess.getEntityStructuredDataPropertyAccess().getNameAssignment_1(), "rule__EntityStructuredDataProperty__NameAssignment_1");
					put(grammarAccess.getEntityStructuredDataPropertyAccess().getDomainAssignment_4(), "rule__EntityStructuredDataProperty__DomainAssignment_4");
					put(grammarAccess.getEntityStructuredDataPropertyAccess().getRangeAssignment_6(), "rule__EntityStructuredDataProperty__RangeAssignment_6");
					put(grammarAccess.getEntityScalarDataPropertyAccess().getNameAssignment_1(), "rule__EntityScalarDataProperty__NameAssignment_1");
					put(grammarAccess.getEntityScalarDataPropertyAccess().getDomainAssignment_4(), "rule__EntityScalarDataProperty__DomainAssignment_4");
					put(grammarAccess.getEntityScalarDataPropertyAccess().getRangeAssignment_6(), "rule__EntityScalarDataProperty__RangeAssignment_6");
					put(grammarAccess.getStructuredDataPropertyAccess().getNameAssignment_1(), "rule__StructuredDataProperty__NameAssignment_1");
					put(grammarAccess.getStructuredDataPropertyAccess().getDomainAssignment_4(), "rule__StructuredDataProperty__DomainAssignment_4");
					put(grammarAccess.getStructuredDataPropertyAccess().getRangeAssignment_6(), "rule__StructuredDataProperty__RangeAssignment_6");
					put(grammarAccess.getScalarDataPropertyAccess().getNameAssignment_1(), "rule__ScalarDataProperty__NameAssignment_1");
					put(grammarAccess.getScalarDataPropertyAccess().getDomainAssignment_4(), "rule__ScalarDataProperty__DomainAssignment_4");
					put(grammarAccess.getScalarDataPropertyAccess().getRangeAssignment_6(), "rule__ScalarDataProperty__RangeAssignment_6");
					put(grammarAccess.getAnonymousConceptTaxonomyAxiomAccess().getDisjointTaxonomyParentAssignment_3(), "rule__AnonymousConceptTaxonomyAxiom__DisjointTaxonomyParentAssignment_3");
					put(grammarAccess.getRootConceptTaxonomyAxiomAccess().getRootAssignment_3(), "rule__RootConceptTaxonomyAxiom__RootAssignment_3");
					put(grammarAccess.getSpecificDisjointConceptAxiomAccess().getDisjointTaxonomyParentAssignment_3(), "rule__SpecificDisjointConceptAxiom__DisjointTaxonomyParentAssignment_3");
					put(grammarAccess.getSpecificDisjointConceptAxiomAccess().getDisjointLeafAssignment_5(), "rule__SpecificDisjointConceptAxiom__DisjointLeafAssignment_5");
					put(grammarAccess.getBundledTerminologyAxiomAccess().getBundledTerminologyAssignment_3(), "rule__BundledTerminologyAxiom__BundledTerminologyAssignment_3");
					put(grammarAccess.getConceptDesignationTerminologyAxiomAccess().getDesignatedTerminologyAssignment_3(), "rule__ConceptDesignationTerminologyAxiom__DesignatedTerminologyAssignment_3");
					put(grammarAccess.getConceptDesignationTerminologyAxiomAccess().getDesignatedConceptAssignment_5(), "rule__ConceptDesignationTerminologyAxiom__DesignatedConceptAssignment_5");
					put(grammarAccess.getTerminologyExtensionAxiomAccess().getExtendedTerminologyAssignment_1(), "rule__TerminologyExtensionAxiom__ExtendedTerminologyAssignment_1");
					put(grammarAccess.getTerminologyNestingAxiomAccess().getNestingTerminologyAssignment_3(), "rule__TerminologyNestingAxiom__NestingTerminologyAssignment_3");
					put(grammarAccess.getTerminologyNestingAxiomAccess().getNestingContextAssignment_5(), "rule__TerminologyNestingAxiom__NestingContextAssignment_5");
					put(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedRelationAssignment_3(), "rule__EntityExistentialRestrictionAxiom__RestrictedRelationAssignment_3");
					put(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedRangeAssignment_5(), "rule__EntityExistentialRestrictionAxiom__RestrictedRangeAssignment_5");
					put(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedDomainAssignment_7(), "rule__EntityExistentialRestrictionAxiom__RestrictedDomainAssignment_7");
					put(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedRelationAssignment_3(), "rule__EntityUniversalRestrictionAxiom__RestrictedRelationAssignment_3");
					put(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedRangeAssignment_5(), "rule__EntityUniversalRestrictionAxiom__RestrictedRangeAssignment_5");
					put(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedDomainAssignment_7(), "rule__EntityUniversalRestrictionAxiom__RestrictedDomainAssignment_7");
					put(grammarAccess.getAspectSpecializationAxiomAccess().getSubEntityAssignment_0(), "rule__AspectSpecializationAxiom__SubEntityAssignment_0");
					put(grammarAccess.getAspectSpecializationAxiomAccess().getSuperAspectAssignment_2(), "rule__AspectSpecializationAxiom__SuperAspectAssignment_2");
					put(grammarAccess.getConceptSpecializationAxiomAccess().getSubConceptAssignment_3(), "rule__ConceptSpecializationAxiom__SubConceptAssignment_3");
					put(grammarAccess.getConceptSpecializationAxiomAccess().getSuperConceptAssignment_5(), "rule__ConceptSpecializationAxiom__SuperConceptAssignment_5");
					put(grammarAccess.getReifiedRelationshipSpecializationAxiomAccess().getSubRelationshipAssignment_3(), "rule__ReifiedRelationshipSpecializationAxiom__SubRelationshipAssignment_3");
					put(grammarAccess.getReifiedRelationshipSpecializationAxiomAccess().getSuperRelationshipAssignment_5(), "rule__ReifiedRelationshipSpecializationAxiom__SuperRelationshipAssignment_5");
					put(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getRestrictedEntityAssignment_3(), "rule__EntityScalarDataPropertyExistentialRestrictionAxiom__RestrictedEntityAssignment_3");
					put(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarPropertyAssignment_5(), "rule__EntityScalarDataPropertyExistentialRestrictionAxiom__ScalarPropertyAssignment_5");
					put(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarRestrictionAssignment_7(), "rule__EntityScalarDataPropertyExistentialRestrictionAxiom__ScalarRestrictionAssignment_7");
					put(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getRestrictedEntityAssignment_3(), "rule__EntityScalarDataPropertyParticularRestrictionAxiom__RestrictedEntityAssignment_3");
					put(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getScalarPropertyAssignment_5(), "rule__EntityScalarDataPropertyParticularRestrictionAxiom__ScalarPropertyAssignment_5");
					put(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getLiteralValueAssignment_7(), "rule__EntityScalarDataPropertyParticularRestrictionAxiom__LiteralValueAssignment_7");
					put(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getRestrictedEntityAssignment_3(), "rule__EntityScalarDataPropertyUniversalRestrictionAxiom__RestrictedEntityAssignment_3");
					put(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarPropertyAssignment_5(), "rule__EntityScalarDataPropertyUniversalRestrictionAxiom__ScalarPropertyAssignment_5");
					put(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarRestrictionAssignment_7(), "rule__EntityScalarDataPropertyUniversalRestrictionAxiom__ScalarRestrictionAssignment_7");
					put(grammarAccess.getBinaryScalarRestrictionAccess().getNameAssignment_1(), "rule__BinaryScalarRestriction__NameAssignment_1");
					put(grammarAccess.getBinaryScalarRestrictionAccess().getLengthAssignment_3_1(), "rule__BinaryScalarRestriction__LengthAssignment_3_1");
					put(grammarAccess.getBinaryScalarRestrictionAccess().getMinLengthAssignment_4_1(), "rule__BinaryScalarRestriction__MinLengthAssignment_4_1");
					put(grammarAccess.getBinaryScalarRestrictionAccess().getMaxLengthAssignment_5_1(), "rule__BinaryScalarRestriction__MaxLengthAssignment_5_1");
					put(grammarAccess.getBinaryScalarRestrictionAccess().getRestrictedRangeAssignment_7(), "rule__BinaryScalarRestriction__RestrictedRangeAssignment_7");
					put(grammarAccess.getIRIScalarRestrictionAccess().getNameAssignment_1(), "rule__IRIScalarRestriction__NameAssignment_1");
					put(grammarAccess.getIRIScalarRestrictionAccess().getLengthAssignment_3_1(), "rule__IRIScalarRestriction__LengthAssignment_3_1");
					put(grammarAccess.getIRIScalarRestrictionAccess().getMinLengthAssignment_4_1(), "rule__IRIScalarRestriction__MinLengthAssignment_4_1");
					put(grammarAccess.getIRIScalarRestrictionAccess().getMaxLengthAssignment_5_1(), "rule__IRIScalarRestriction__MaxLengthAssignment_5_1");
					put(grammarAccess.getIRIScalarRestrictionAccess().getPatternAssignment_6_1(), "rule__IRIScalarRestriction__PatternAssignment_6_1");
					put(grammarAccess.getIRIScalarRestrictionAccess().getRestrictedRangeAssignment_8(), "rule__IRIScalarRestriction__RestrictedRangeAssignment_8");
					put(grammarAccess.getNumericScalarRestrictionAccess().getNameAssignment_1(), "rule__NumericScalarRestriction__NameAssignment_1");
					put(grammarAccess.getNumericScalarRestrictionAccess().getMinInclusiveAssignment_3_1(), "rule__NumericScalarRestriction__MinInclusiveAssignment_3_1");
					put(grammarAccess.getNumericScalarRestrictionAccess().getMaxInclusiveAssignment_4_1(), "rule__NumericScalarRestriction__MaxInclusiveAssignment_4_1");
					put(grammarAccess.getNumericScalarRestrictionAccess().getMinExclusiveAssignment_5_1(), "rule__NumericScalarRestriction__MinExclusiveAssignment_5_1");
					put(grammarAccess.getNumericScalarRestrictionAccess().getMaxExclusiveAssignment_6_1(), "rule__NumericScalarRestriction__MaxExclusiveAssignment_6_1");
					put(grammarAccess.getNumericScalarRestrictionAccess().getRestrictedRangeAssignment_8(), "rule__NumericScalarRestriction__RestrictedRangeAssignment_8");
					put(grammarAccess.getPlainLiteralScalarRestrictionAccess().getNameAssignment_1(), "rule__PlainLiteralScalarRestriction__NameAssignment_1");
					put(grammarAccess.getPlainLiteralScalarRestrictionAccess().getLengthAssignment_3_1(), "rule__PlainLiteralScalarRestriction__LengthAssignment_3_1");
					put(grammarAccess.getPlainLiteralScalarRestrictionAccess().getMinLengthAssignment_4_1(), "rule__PlainLiteralScalarRestriction__MinLengthAssignment_4_1");
					put(grammarAccess.getPlainLiteralScalarRestrictionAccess().getMaxLengthAssignment_5_1(), "rule__PlainLiteralScalarRestriction__MaxLengthAssignment_5_1");
					put(grammarAccess.getPlainLiteralScalarRestrictionAccess().getPatternAssignment_6_1(), "rule__PlainLiteralScalarRestriction__PatternAssignment_6_1");
					put(grammarAccess.getPlainLiteralScalarRestrictionAccess().getLangRangeAssignment_7_1(), "rule__PlainLiteralScalarRestriction__LangRangeAssignment_7_1");
					put(grammarAccess.getPlainLiteralScalarRestrictionAccess().getRestrictedRangeAssignment_9(), "rule__PlainLiteralScalarRestriction__RestrictedRangeAssignment_9");
					put(grammarAccess.getScalarOneOfRestrictionAccess().getNameAssignment_1(), "rule__ScalarOneOfRestriction__NameAssignment_1");
					put(grammarAccess.getScalarOneOfRestrictionAccess().getRestrictedRangeAssignment_4(), "rule__ScalarOneOfRestriction__RestrictedRangeAssignment_4");
					put(grammarAccess.getScalarOneOfLiteralAxiomAccess().getValueAssignment_3(), "rule__ScalarOneOfLiteralAxiom__ValueAssignment_3");
					put(grammarAccess.getScalarOneOfLiteralAxiomAccess().getAxiomAssignment_5(), "rule__ScalarOneOfLiteralAxiom__AxiomAssignment_5");
					put(grammarAccess.getStringScalarRestrictionAccess().getNameAssignment_1(), "rule__StringScalarRestriction__NameAssignment_1");
					put(grammarAccess.getStringScalarRestrictionAccess().getLengthAssignment_3_1(), "rule__StringScalarRestriction__LengthAssignment_3_1");
					put(grammarAccess.getStringScalarRestrictionAccess().getMinLengthAssignment_4_1(), "rule__StringScalarRestriction__MinLengthAssignment_4_1");
					put(grammarAccess.getStringScalarRestrictionAccess().getMaxLengthAssignment_5_1(), "rule__StringScalarRestriction__MaxLengthAssignment_5_1");
					put(grammarAccess.getStringScalarRestrictionAccess().getPatternAssignment_6_1(), "rule__StringScalarRestriction__PatternAssignment_6_1");
					put(grammarAccess.getStringScalarRestrictionAccess().getRestrictedRangeAssignment_8(), "rule__StringScalarRestriction__RestrictedRangeAssignment_8");
					put(grammarAccess.getSynonymScalarRestrictionAccess().getNameAssignment_1(), "rule__SynonymScalarRestriction__NameAssignment_1");
					put(grammarAccess.getSynonymScalarRestrictionAccess().getRestrictedRangeAssignment_4(), "rule__SynonymScalarRestriction__RestrictedRangeAssignment_4");
					put(grammarAccess.getTimeScalarRestrictionAccess().getNameAssignment_1(), "rule__TimeScalarRestriction__NameAssignment_1");
					put(grammarAccess.getTimeScalarRestrictionAccess().getMinInclusiveAssignment_3_1(), "rule__TimeScalarRestriction__MinInclusiveAssignment_3_1");
					put(grammarAccess.getTimeScalarRestrictionAccess().getMaxInclusiveAssignment_4_1(), "rule__TimeScalarRestriction__MaxInclusiveAssignment_4_1");
					put(grammarAccess.getTimeScalarRestrictionAccess().getMinExclusiveAssignment_5_1(), "rule__TimeScalarRestriction__MinExclusiveAssignment_5_1");
					put(grammarAccess.getTimeScalarRestrictionAccess().getMaxExclusiveAssignment_6_1(), "rule__TimeScalarRestriction__MaxExclusiveAssignment_6_1");
					put(grammarAccess.getTimeScalarRestrictionAccess().getRestrictedRangeAssignment_8(), "rule__TimeScalarRestriction__RestrictedRangeAssignment_8");
					put(grammarAccess.getDescriptionBoxAccess().getKindAssignment_0(), "rule__DescriptionBox__KindAssignment_0");
					put(grammarAccess.getDescriptionBoxAccess().getIriAssignment_2(), "rule__DescriptionBox__IriAssignment_2");
					put(grammarAccess.getDescriptionBoxAccess().getAnnotationsAssignment_4_0(), "rule__DescriptionBox__AnnotationsAssignment_4_0");
					put(grammarAccess.getDescriptionBoxAccess().getClosedWorldDefinitionsAssignment_4_1(), "rule__DescriptionBox__ClosedWorldDefinitionsAssignment_4_1");
					put(grammarAccess.getDescriptionBoxAccess().getDescriptionBoxRefinementsAssignment_4_2(), "rule__DescriptionBox__DescriptionBoxRefinementsAssignment_4_2");
					put(grammarAccess.getDescriptionBoxAccess().getConceptInstancesAssignment_4_3(), "rule__DescriptionBox__ConceptInstancesAssignment_4_3");
					put(grammarAccess.getDescriptionBoxAccess().getReifiedRelationshipInstancesAssignment_4_4(), "rule__DescriptionBox__ReifiedRelationshipInstancesAssignment_4_4");
					put(grammarAccess.getDescriptionBoxAccess().getReifiedRelationshipInstanceDomainsAssignment_4_5(), "rule__DescriptionBox__ReifiedRelationshipInstanceDomainsAssignment_4_5");
					put(grammarAccess.getDescriptionBoxAccess().getReifiedRelationshipInstanceRangesAssignment_4_6(), "rule__DescriptionBox__ReifiedRelationshipInstanceRangesAssignment_4_6");
					put(grammarAccess.getDescriptionBoxAccess().getUnreifiedRelationshipInstanceTuplesAssignment_4_7(), "rule__DescriptionBox__UnreifiedRelationshipInstanceTuplesAssignment_4_7");
					put(grammarAccess.getDescriptionBoxExtendsClosedWorldDefinitionsAccess().getClosedWorldDefinitionsAssignment_1(), "rule__DescriptionBoxExtendsClosedWorldDefinitions__ClosedWorldDefinitionsAssignment_1");
					put(grammarAccess.getDescriptionBoxRefinementAccess().getRefinedDescriptionBoxAssignment_1(), "rule__DescriptionBoxRefinement__RefinedDescriptionBoxAssignment_1");
					put(grammarAccess.getScalarDataPropertyValueAccess().getScalarPropertyValueAssignment_3(), "rule__ScalarDataPropertyValue__ScalarPropertyValueAssignment_3");
					put(grammarAccess.getScalarDataPropertyValueAccess().getScalarDataPropertyAssignment_5(), "rule__ScalarDataPropertyValue__ScalarDataPropertyAssignment_5");
					put(grammarAccess.getStructuredDataPropertyValueAccess().getStructuredDataPropertyAssignment_3(), "rule__StructuredDataPropertyValue__StructuredDataPropertyAssignment_3");
					put(grammarAccess.getStructuredDataPropertyValueAccess().getStructuredPropertyTupleAssignment_5(), "rule__StructuredDataPropertyValue__StructuredPropertyTupleAssignment_5");
					put(grammarAccess.getDataStructureTupleAccess().getDataStructureTypeAssignment_3(), "rule__DataStructureTuple__DataStructureTypeAssignment_3");
					put(grammarAccess.getConceptInstanceAccess().getSingletonConceptClassifierAssignment_3(), "rule__ConceptInstance__SingletonConceptClassifierAssignment_3");
					put(grammarAccess.getReifiedRelationshipInstanceAccess().getSingletonReifiedRelationshipClassifierAssignment_3(), "rule__ReifiedRelationshipInstance__SingletonReifiedRelationshipClassifierAssignment_3");
					put(grammarAccess.getReifiedRelationshipInstanceDomainAccess().getReifiedRelationshipInstanceAssignment_3(), "rule__ReifiedRelationshipInstanceDomain__ReifiedRelationshipInstanceAssignment_3");
					put(grammarAccess.getReifiedRelationshipInstanceDomainAccess().getDomainAssignment_5(), "rule__ReifiedRelationshipInstanceDomain__DomainAssignment_5");
					put(grammarAccess.getReifiedRelationshipInstanceRangeAccess().getReifiedRelationshipInstanceAssignment_3(), "rule__ReifiedRelationshipInstanceRange__ReifiedRelationshipInstanceAssignment_3");
					put(grammarAccess.getReifiedRelationshipInstanceRangeAccess().getRangeAssignment_5(), "rule__ReifiedRelationshipInstanceRange__RangeAssignment_5");
					put(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getUnreifiedRelationshipAssignment_3(), "rule__UnreifiedRelationshipInstanceTuple__UnreifiedRelationshipAssignment_3");
					put(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getDomainAssignment_5(), "rule__UnreifiedRelationshipInstanceTuple__DomainAssignment_5");
					put(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getRangeAssignment_7(), "rule__UnreifiedRelationshipInstanceTuple__RangeAssignment_7");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalOntologicalModelingLanguageParser typedParser = (InternalOntologicalModelingLanguageParser) parser;
			typedParser.entryRuleTerminologyExtent();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public OntologicalModelingLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(OntologicalModelingLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
