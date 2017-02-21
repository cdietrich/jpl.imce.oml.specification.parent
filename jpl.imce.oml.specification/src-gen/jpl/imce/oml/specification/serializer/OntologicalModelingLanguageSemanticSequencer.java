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
package jpl.imce.oml.specification.serializer;

import com.google.inject.Inject;
import java.util.Set;
import jpl.imce.oml.specification.ecore.Annotation;
import jpl.imce.oml.specification.ecore.AnnotationProperty;
import jpl.imce.oml.specification.ecore.AnonymousConceptTaxonomyAxiom;
import jpl.imce.oml.specification.ecore.Aspect;
import jpl.imce.oml.specification.ecore.AspectSpecializationAxiom;
import jpl.imce.oml.specification.ecore.BinaryScalarRestriction;
import jpl.imce.oml.specification.ecore.Bundle;
import jpl.imce.oml.specification.ecore.BundledTerminologyAxiom;
import jpl.imce.oml.specification.ecore.Concept;
import jpl.imce.oml.specification.ecore.ConceptDesignationTerminologyAxiom;
import jpl.imce.oml.specification.ecore.ConceptInstance;
import jpl.imce.oml.specification.ecore.ConceptSpecializationAxiom;
import jpl.imce.oml.specification.ecore.DataStructureTuple;
import jpl.imce.oml.specification.ecore.DescriptionBox;
import jpl.imce.oml.specification.ecore.DescriptionBoxExtendsClosedWorldDefinitions;
import jpl.imce.oml.specification.ecore.DescriptionBoxRefinement;
import jpl.imce.oml.specification.ecore.EcorePackage;
import jpl.imce.oml.specification.ecore.EntityExistentialRestrictionAxiom;
import jpl.imce.oml.specification.ecore.EntityScalarDataProperty;
import jpl.imce.oml.specification.ecore.EntityScalarDataPropertyExistentialRestrictionAxiom;
import jpl.imce.oml.specification.ecore.EntityScalarDataPropertyParticularRestrictionAxiom;
import jpl.imce.oml.specification.ecore.EntityScalarDataPropertyUniversalRestrictionAxiom;
import jpl.imce.oml.specification.ecore.EntityStructuredDataProperty;
import jpl.imce.oml.specification.ecore.EntityUniversalRestrictionAxiom;
import jpl.imce.oml.specification.ecore.IRIScalarRestriction;
import jpl.imce.oml.specification.ecore.NumericScalarRestriction;
import jpl.imce.oml.specification.ecore.PlainLiteralScalarRestriction;
import jpl.imce.oml.specification.ecore.ReifiedRelationship;
import jpl.imce.oml.specification.ecore.ReifiedRelationshipInstance;
import jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceDomain;
import jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceRange;
import jpl.imce.oml.specification.ecore.ReifiedRelationshipSpecializationAxiom;
import jpl.imce.oml.specification.ecore.RootConceptTaxonomyAxiom;
import jpl.imce.oml.specification.ecore.Scalar;
import jpl.imce.oml.specification.ecore.ScalarDataProperty;
import jpl.imce.oml.specification.ecore.ScalarDataPropertyValue;
import jpl.imce.oml.specification.ecore.ScalarOneOfLiteralAxiom;
import jpl.imce.oml.specification.ecore.ScalarOneOfRestriction;
import jpl.imce.oml.specification.ecore.SpecificDisjointConceptAxiom;
import jpl.imce.oml.specification.ecore.StringScalarRestriction;
import jpl.imce.oml.specification.ecore.Structure;
import jpl.imce.oml.specification.ecore.StructuredDataProperty;
import jpl.imce.oml.specification.ecore.StructuredDataPropertyValue;
import jpl.imce.oml.specification.ecore.SynonymScalarRestriction;
import jpl.imce.oml.specification.ecore.TerminologyExtensionAxiom;
import jpl.imce.oml.specification.ecore.TerminologyExtent;
import jpl.imce.oml.specification.ecore.TerminologyGraph;
import jpl.imce.oml.specification.ecore.TerminologyNestingAxiom;
import jpl.imce.oml.specification.ecore.TimeScalarRestriction;
import jpl.imce.oml.specification.ecore.UnreifiedRelationship;
import jpl.imce.oml.specification.ecore.UnreifiedRelationshipInstanceTuple;
import jpl.imce.oml.specification.services.OntologicalModelingLanguageGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class OntologicalModelingLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private OntologicalModelingLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == EcorePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EcorePackage.ANNOTATION:
				sequence_Annotation(context, (Annotation) semanticObject); 
				return; 
			case EcorePackage.ANNOTATION_PROPERTY:
				sequence_AnnotationProperty(context, (AnnotationProperty) semanticObject); 
				return; 
			case EcorePackage.ANONYMOUS_CONCEPT_TAXONOMY_AXIOM:
				sequence_AnonymousConceptTaxonomyAxiom(context, (AnonymousConceptTaxonomyAxiom) semanticObject); 
				return; 
			case EcorePackage.ASPECT:
				sequence_Aspect(context, (Aspect) semanticObject); 
				return; 
			case EcorePackage.ASPECT_SPECIALIZATION_AXIOM:
				sequence_AspectSpecializationAxiom(context, (AspectSpecializationAxiom) semanticObject); 
				return; 
			case EcorePackage.BINARY_SCALAR_RESTRICTION:
				sequence_BinaryScalarRestriction(context, (BinaryScalarRestriction) semanticObject); 
				return; 
			case EcorePackage.BUNDLE:
				sequence_Bundle(context, (Bundle) semanticObject); 
				return; 
			case EcorePackage.BUNDLED_TERMINOLOGY_AXIOM:
				sequence_BundledTerminologyAxiom(context, (BundledTerminologyAxiom) semanticObject); 
				return; 
			case EcorePackage.CONCEPT:
				sequence_Concept(context, (Concept) semanticObject); 
				return; 
			case EcorePackage.CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM:
				sequence_ConceptDesignationTerminologyAxiom(context, (ConceptDesignationTerminologyAxiom) semanticObject); 
				return; 
			case EcorePackage.CONCEPT_INSTANCE:
				sequence_ConceptInstance(context, (ConceptInstance) semanticObject); 
				return; 
			case EcorePackage.CONCEPT_SPECIALIZATION_AXIOM:
				sequence_ConceptSpecializationAxiom(context, (ConceptSpecializationAxiom) semanticObject); 
				return; 
			case EcorePackage.DATA_STRUCTURE_TUPLE:
				sequence_DataStructureTuple(context, (DataStructureTuple) semanticObject); 
				return; 
			case EcorePackage.DESCRIPTION_BOX:
				sequence_DescriptionBox(context, (DescriptionBox) semanticObject); 
				return; 
			case EcorePackage.DESCRIPTION_BOX_EXTENDS_CLOSED_WORLD_DEFINITIONS:
				sequence_DescriptionBoxExtendsClosedWorldDefinitions(context, (DescriptionBoxExtendsClosedWorldDefinitions) semanticObject); 
				return; 
			case EcorePackage.DESCRIPTION_BOX_REFINEMENT:
				sequence_DescriptionBoxRefinement(context, (DescriptionBoxRefinement) semanticObject); 
				return; 
			case EcorePackage.ENTITY_EXISTENTIAL_RESTRICTION_AXIOM:
				sequence_EntityExistentialRestrictionAxiom(context, (EntityExistentialRestrictionAxiom) semanticObject); 
				return; 
			case EcorePackage.ENTITY_SCALAR_DATA_PROPERTY:
				sequence_EntityScalarDataProperty(context, (EntityScalarDataProperty) semanticObject); 
				return; 
			case EcorePackage.ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM:
				sequence_EntityScalarDataPropertyExistentialRestrictionAxiom(context, (EntityScalarDataPropertyExistentialRestrictionAxiom) semanticObject); 
				return; 
			case EcorePackage.ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM:
				sequence_EntityScalarDataPropertyParticularRestrictionAxiom(context, (EntityScalarDataPropertyParticularRestrictionAxiom) semanticObject); 
				return; 
			case EcorePackage.ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM:
				sequence_EntityScalarDataPropertyUniversalRestrictionAxiom(context, (EntityScalarDataPropertyUniversalRestrictionAxiom) semanticObject); 
				return; 
			case EcorePackage.ENTITY_STRUCTURED_DATA_PROPERTY:
				sequence_EntityStructuredDataProperty(context, (EntityStructuredDataProperty) semanticObject); 
				return; 
			case EcorePackage.ENTITY_UNIVERSAL_RESTRICTION_AXIOM:
				sequence_EntityUniversalRestrictionAxiom(context, (EntityUniversalRestrictionAxiom) semanticObject); 
				return; 
			case EcorePackage.IRI_SCALAR_RESTRICTION:
				sequence_IRIScalarRestriction(context, (IRIScalarRestriction) semanticObject); 
				return; 
			case EcorePackage.NUMERIC_SCALAR_RESTRICTION:
				sequence_NumericScalarRestriction(context, (NumericScalarRestriction) semanticObject); 
				return; 
			case EcorePackage.PLAIN_LITERAL_SCALAR_RESTRICTION:
				sequence_PlainLiteralScalarRestriction(context, (PlainLiteralScalarRestriction) semanticObject); 
				return; 
			case EcorePackage.REIFIED_RELATIONSHIP:
				sequence_ReifiedRelationship(context, (ReifiedRelationship) semanticObject); 
				return; 
			case EcorePackage.REIFIED_RELATIONSHIP_INSTANCE:
				sequence_ReifiedRelationshipInstance(context, (ReifiedRelationshipInstance) semanticObject); 
				return; 
			case EcorePackage.REIFIED_RELATIONSHIP_INSTANCE_DOMAIN:
				sequence_ReifiedRelationshipInstanceDomain(context, (ReifiedRelationshipInstanceDomain) semanticObject); 
				return; 
			case EcorePackage.REIFIED_RELATIONSHIP_INSTANCE_RANGE:
				sequence_ReifiedRelationshipInstanceRange(context, (ReifiedRelationshipInstanceRange) semanticObject); 
				return; 
			case EcorePackage.REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM:
				sequence_ReifiedRelationshipSpecializationAxiom(context, (ReifiedRelationshipSpecializationAxiom) semanticObject); 
				return; 
			case EcorePackage.ROOT_CONCEPT_TAXONOMY_AXIOM:
				sequence_RootConceptTaxonomyAxiom(context, (RootConceptTaxonomyAxiom) semanticObject); 
				return; 
			case EcorePackage.SCALAR:
				sequence_Scalar(context, (Scalar) semanticObject); 
				return; 
			case EcorePackage.SCALAR_DATA_PROPERTY:
				sequence_ScalarDataProperty(context, (ScalarDataProperty) semanticObject); 
				return; 
			case EcorePackage.SCALAR_DATA_PROPERTY_VALUE:
				sequence_ScalarDataPropertyValue(context, (ScalarDataPropertyValue) semanticObject); 
				return; 
			case EcorePackage.SCALAR_ONE_OF_LITERAL_AXIOM:
				sequence_ScalarOneOfLiteralAxiom(context, (ScalarOneOfLiteralAxiom) semanticObject); 
				return; 
			case EcorePackage.SCALAR_ONE_OF_RESTRICTION:
				sequence_ScalarOneOfRestriction(context, (ScalarOneOfRestriction) semanticObject); 
				return; 
			case EcorePackage.SPECIFIC_DISJOINT_CONCEPT_AXIOM:
				sequence_SpecificDisjointConceptAxiom(context, (SpecificDisjointConceptAxiom) semanticObject); 
				return; 
			case EcorePackage.STRING_SCALAR_RESTRICTION:
				sequence_StringScalarRestriction(context, (StringScalarRestriction) semanticObject); 
				return; 
			case EcorePackage.STRUCTURE:
				sequence_Structure(context, (Structure) semanticObject); 
				return; 
			case EcorePackage.STRUCTURED_DATA_PROPERTY:
				sequence_StructuredDataProperty(context, (StructuredDataProperty) semanticObject); 
				return; 
			case EcorePackage.STRUCTURED_DATA_PROPERTY_VALUE:
				sequence_StructuredDataPropertyValue(context, (StructuredDataPropertyValue) semanticObject); 
				return; 
			case EcorePackage.SYNONYM_SCALAR_RESTRICTION:
				sequence_SynonymScalarRestriction(context, (SynonymScalarRestriction) semanticObject); 
				return; 
			case EcorePackage.TERMINOLOGY_EXTENSION_AXIOM:
				sequence_TerminologyExtensionAxiom(context, (TerminologyExtensionAxiom) semanticObject); 
				return; 
			case EcorePackage.TERMINOLOGY_EXTENT:
				sequence_TerminologyExtent(context, (TerminologyExtent) semanticObject); 
				return; 
			case EcorePackage.TERMINOLOGY_GRAPH:
				sequence_TerminologyGraph(context, (TerminologyGraph) semanticObject); 
				return; 
			case EcorePackage.TERMINOLOGY_NESTING_AXIOM:
				sequence_TerminologyNestingAxiom(context, (TerminologyNestingAxiom) semanticObject); 
				return; 
			case EcorePackage.TIME_SCALAR_RESTRICTION:
				sequence_TimeScalarRestriction(context, (TimeScalarRestriction) semanticObject); 
				return; 
			case EcorePackage.UNREIFIED_RELATIONSHIP:
				sequence_UnreifiedRelationship(context, (UnreifiedRelationship) semanticObject); 
				return; 
			case EcorePackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE:
				sequence_UnreifiedRelationshipInstanceTuple(context, (UnreifiedRelationshipInstanceTuple) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AnnotationProperty returns AnnotationProperty
	 *
	 * Constraint:
	 *     (abbrevIRI=ABBREV_IRI iri=IRI)
	 */
	protected void sequence_AnnotationProperty(ISerializationContext context, AnnotationProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getAnnotationProperty_AbbrevIRI()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getAnnotationProperty_AbbrevIRI()));
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getAnnotationProperty_Iri()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getAnnotationProperty_Iri()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getAnnotationPropertyAccess().getAbbrevIRIABBREV_IRIParserRuleCall_1_0(), semanticObject.getAbbrevIRI());
		feeder.accept(grammarAccess.getAnnotationPropertyAccess().getIriIRITerminalRuleCall_3_0(), semanticObject.getIri());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Annotation returns Annotation
	 *
	 * Constraint:
	 *     (property=[AnnotationProperty|ABBREV_IRI] value=STRING)
	 */
	protected void sequence_Annotation(ISerializationContext context, Annotation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getAnnotation_Property()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getAnnotation_Property()));
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getAnnotation_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getAnnotation_Value()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getAnnotationAccess().getPropertyAnnotationPropertyABBREV_IRIParserRuleCall_1_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getAnnotation_Property(), false));
		feeder.accept(grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyBundleStatement returns AnonymousConceptTaxonomyAxiom
	 *     ConceptTreeDisjunction returns AnonymousConceptTaxonomyAxiom
	 *     AnonymousConceptTaxonomyAxiom returns AnonymousConceptTaxonomyAxiom
	 *
	 * Constraint:
	 *     disjointTaxonomyParent=[ConceptTreeDisjunction|Reference]
	 */
	protected void sequence_AnonymousConceptTaxonomyAxiom(ISerializationContext context, AnonymousConceptTaxonomyAxiom semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getDisjointUnionOfConceptsAxiom_DisjointTaxonomyParent()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getDisjointUnionOfConceptsAxiom_DisjointTaxonomyParent()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getAnonymousConceptTaxonomyAxiomAccess().getDisjointTaxonomyParentConceptTreeDisjunctionReferenceParserRuleCall_3_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getDisjointUnionOfConceptsAxiom_DisjointTaxonomyParent(), false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyBoxStatement returns AspectSpecializationAxiom
	 *     Axiom returns AspectSpecializationAxiom
	 *     TermAxiom returns AspectSpecializationAxiom
	 *     SpecializationAxiom returns AspectSpecializationAxiom
	 *     AspectSpecializationAxiom returns AspectSpecializationAxiom
	 *
	 * Constraint:
	 *     (subEntity=[Entity|Reference] superAspect=[Aspect|Reference])
	 */
	protected void sequence_AspectSpecializationAxiom(ISerializationContext context, AspectSpecializationAxiom semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getAspectSpecializationAxiom_SubEntity()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getAspectSpecializationAxiom_SubEntity()));
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getAspectSpecializationAxiom_SuperAspect()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getAspectSpecializationAxiom_SuperAspect()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getAspectSpecializationAxiomAccess().getSubEntityEntityReferenceParserRuleCall_0_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getAspectSpecializationAxiom_SubEntity(), false));
		feeder.accept(grammarAccess.getAspectSpecializationAxiomAccess().getSuperAspectAspectReferenceParserRuleCall_2_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getAspectSpecializationAxiom_SuperAspect(), false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyBoxStatement returns Aspect
	 *     Term returns Aspect
	 *     AtomicEntity returns Aspect
	 *     Aspect returns Aspect
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Aspect(ISerializationContext context, Aspect semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getTerm_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getTerm_Name()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getAspectAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyBoxStatement returns BinaryScalarRestriction
	 *     Term returns BinaryScalarRestriction
	 *     Datatype returns BinaryScalarRestriction
	 *     ScalarDataRange returns BinaryScalarRestriction
	 *     RestrictedDataRange returns BinaryScalarRestriction
	 *     BinaryScalarRestriction returns BinaryScalarRestriction
	 *
	 * Constraint:
	 *     (name=ID length=INT? minLength=INT? maxLength=INT? restrictedRange=[DataRange|Reference])
	 */
	protected void sequence_BinaryScalarRestriction(ISerializationContext context, BinaryScalarRestriction semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyBox returns Bundle
	 *     Bundle returns Bundle
	 *
	 * Constraint:
	 *     (
	 *         kind=TerminologyGraphKind 
	 *         iri=IRI 
	 *         (
	 *             annotations+=Annotation | 
	 *             terminologyBoxAxioms+=TerminologyBoxAxiom | 
	 *             boxStatements+=TerminologyBoxStatement | 
	 *             bundleStatements+=TerminologyBundleStatement | 
	 *             terminologyBundleAxioms+=TerminologyBundleAxiom
	 *         )*
	 *     )
	 */
	protected void sequence_Bundle(ISerializationContext context, Bundle semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyBundleAxiom returns BundledTerminologyAxiom
	 *     BundledTerminologyAxiom returns BundledTerminologyAxiom
	 *
	 * Constraint:
	 *     bundledTerminology=[TerminologyBox|Reference]
	 */
	protected void sequence_BundledTerminologyAxiom(ISerializationContext context, BundledTerminologyAxiom semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getBundledTerminologyAxiom_BundledTerminology()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getBundledTerminologyAxiom_BundledTerminology()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getBundledTerminologyAxiomAccess().getBundledTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getBundledTerminologyAxiom_BundledTerminology(), false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyBoxAxiom returns ConceptDesignationTerminologyAxiom
	 *     ConceptDesignationTerminologyAxiom returns ConceptDesignationTerminologyAxiom
	 *
	 * Constraint:
	 *     (designatedTerminology=[TerminologyBox|Reference] designatedConcept=[Concept|Reference])
	 */
	protected void sequence_ConceptDesignationTerminologyAxiom(ISerializationContext context, ConceptDesignationTerminologyAxiom semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getConceptDesignationTerminologyAxiom_DesignatedTerminology()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getConceptDesignationTerminologyAxiom_DesignatedTerminology()));
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getConceptDesignationTerminologyAxiom_DesignatedConcept()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getConceptDesignationTerminologyAxiom_DesignatedConcept()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getConceptDesignationTerminologyAxiomAccess().getDesignatedTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getConceptDesignationTerminologyAxiom_DesignatedTerminology(), false));
		feeder.accept(grammarAccess.getConceptDesignationTerminologyAxiomAccess().getDesignatedConceptConceptReferenceParserRuleCall_5_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getConceptDesignationTerminologyAxiom_DesignatedConcept(), false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyInstanceAssertion returns ConceptInstance
	 *     ConceptInstance returns ConceptInstance
	 *
	 * Constraint:
	 *     singletonConceptClassifier=[Concept|Reference]
	 */
	protected void sequence_ConceptInstance(ISerializationContext context, ConceptInstance semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getConceptInstance_SingletonConceptClassifier()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getConceptInstance_SingletonConceptClassifier()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getConceptInstanceAccess().getSingletonConceptClassifierConceptReferenceParserRuleCall_3_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getConceptInstance_SingletonConceptClassifier(), false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyBoxStatement returns ConceptSpecializationAxiom
	 *     Axiom returns ConceptSpecializationAxiom
	 *     TermAxiom returns ConceptSpecializationAxiom
	 *     SpecializationAxiom returns ConceptSpecializationAxiom
	 *     ConceptSpecializationAxiom returns ConceptSpecializationAxiom
	 *
	 * Constraint:
	 *     (subConcept=[Concept|Reference] superConcept=[Concept|Reference])
	 */
	protected void sequence_ConceptSpecializationAxiom(ISerializationContext context, ConceptSpecializationAxiom semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getConceptSpecializationAxiom_SubConcept()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getConceptSpecializationAxiom_SubConcept()));
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getConceptSpecializationAxiom_SuperConcept()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getConceptSpecializationAxiom_SuperConcept()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getConceptSpecializationAxiomAccess().getSubConceptConceptReferenceParserRuleCall_0_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getConceptSpecializationAxiom_SubConcept(), false));
		feeder.accept(grammarAccess.getConceptSpecializationAxiomAccess().getSuperConceptConceptReferenceParserRuleCall_2_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getConceptSpecializationAxiom_SuperConcept(), false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyBoxStatement returns Concept
	 *     Term returns Concept
	 *     AtomicEntity returns Concept
	 *     Concept returns Concept
	 *
	 * Constraint:
	 *     (isAbstract?=ABSTRACT_TOKEN? name=ID)
	 */
	protected void sequence_Concept(ISerializationContext context, Concept semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyInstanceAssertion returns DataStructureTuple
	 *     DataStructureTuple returns DataStructureTuple
	 *
	 * Constraint:
	 *     dataStructureType=[Structure|Reference]
	 */
	protected void sequence_DataStructureTuple(ISerializationContext context, DataStructureTuple semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getDataStructureTuple_DataStructureType()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getDataStructureTuple_DataStructureType()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getDataStructureTupleAccess().getDataStructureTypeStructureReferenceParserRuleCall_3_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getDataStructureTuple_DataStructureType(), false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DescriptionBoxExtendsClosedWorldDefinitions returns DescriptionBoxExtendsClosedWorldDefinitions
	 *
	 * Constraint:
	 *     closedWorldDefinitions=[TerminologyBox|Reference]
	 */
	protected void sequence_DescriptionBoxExtendsClosedWorldDefinitions(ISerializationContext context, DescriptionBoxExtendsClosedWorldDefinitions semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getDescriptionBoxExtendsClosedWorldDefinitions_ClosedWorldDefinitions()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getDescriptionBoxExtendsClosedWorldDefinitions_ClosedWorldDefinitions()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getDescriptionBoxExtendsClosedWorldDefinitionsAccess().getClosedWorldDefinitionsTerminologyBoxReferenceParserRuleCall_1_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getDescriptionBoxExtendsClosedWorldDefinitions_ClosedWorldDefinitions(), false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DescriptionBoxRefinement returns DescriptionBoxRefinement
	 *
	 * Constraint:
	 *     refinedDescriptionBox=[DescriptionBox|Reference]
	 */
	protected void sequence_DescriptionBoxRefinement(ISerializationContext context, DescriptionBoxRefinement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getDescriptionBoxRefinement_RefinedDescriptionBox()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getDescriptionBoxRefinement_RefinedDescriptionBox()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getDescriptionBoxRefinementAccess().getRefinedDescriptionBoxDescriptionBoxReferenceParserRuleCall_1_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getDescriptionBoxRefinement_RefinedDescriptionBox(), false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DescriptionBox returns DescriptionBox
	 *
	 * Constraint:
	 *     (
	 *         kind=DescriptionKind 
	 *         iri=IRI 
	 *         (
	 *             annotations+=Annotation | 
	 *             closedWorldDefinitions+=DescriptionBoxExtendsClosedWorldDefinitions | 
	 *             descriptionBoxRefinements+=DescriptionBoxRefinement | 
	 *             conceptInstances+=ConceptInstance | 
	 *             reifiedRelationshipInstances+=ReifiedRelationshipInstance | 
	 *             reifiedRelationshipInstanceDomains+=ReifiedRelationshipInstanceDomain | 
	 *             reifiedRelationshipInstanceRanges+=ReifiedRelationshipInstanceRange | 
	 *             unreifiedRelationshipInstanceTuples+=UnreifiedRelationshipInstanceTuple
	 *         )*
	 *     )
	 */
	protected void sequence_DescriptionBox(ISerializationContext context, DescriptionBox semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyBoxStatement returns EntityExistentialRestrictionAxiom
	 *     Axiom returns EntityExistentialRestrictionAxiom
	 *     TermAxiom returns EntityExistentialRestrictionAxiom
	 *     EntityRestrictionAxiom returns EntityExistentialRestrictionAxiom
	 *     EntityExistentialRestrictionAxiom returns EntityExistentialRestrictionAxiom
	 *
	 * Constraint:
	 *     (restrictedRelation=[ReifiedRelationship|Reference] restrictedRange=[Entity|Reference] restrictedDomain=[Entity|Reference])
	 */
	protected void sequence_EntityExistentialRestrictionAxiom(ISerializationContext context, EntityExistentialRestrictionAxiom semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getEntityRestrictionAxiom_RestrictedRelation()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getEntityRestrictionAxiom_RestrictedRelation()));
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getEntityRestrictionAxiom_RestrictedRange()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getEntityRestrictionAxiom_RestrictedRange()));
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getEntityRestrictionAxiom_RestrictedDomain()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getEntityRestrictionAxiom_RestrictedDomain()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedRelationReifiedRelationshipReferenceParserRuleCall_3_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getEntityRestrictionAxiom_RestrictedRelation(), false));
		feeder.accept(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedRangeEntityReferenceParserRuleCall_5_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getEntityRestrictionAxiom_RestrictedRange(), false));
		feeder.accept(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedDomainEntityReferenceParserRuleCall_7_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getEntityRestrictionAxiom_RestrictedDomain(), false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyBoxStatement returns EntityScalarDataPropertyExistentialRestrictionAxiom
	 *     Axiom returns EntityScalarDataPropertyExistentialRestrictionAxiom
	 *     TermAxiom returns EntityScalarDataPropertyExistentialRestrictionAxiom
	 *     EntityScalarDataPropertyRestrictionAxiom returns EntityScalarDataPropertyExistentialRestrictionAxiom
	 *     EntityScalarDataPropertyExistentialRestrictionAxiom returns EntityScalarDataPropertyExistentialRestrictionAxiom
	 *
	 * Constraint:
	 *     (restrictedEntity=[Entity|Reference] scalarProperty=[EntityScalarDataProperty|Reference] scalarRestriction=[DataRange|Reference])
	 */
	protected void sequence_EntityScalarDataPropertyExistentialRestrictionAxiom(ISerializationContext context, EntityScalarDataPropertyExistentialRestrictionAxiom semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getEntityScalarDataPropertyRestrictionAxiom_RestrictedEntity()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getEntityScalarDataPropertyRestrictionAxiom_RestrictedEntity()));
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getEntityScalarDataPropertyRestrictionAxiom_ScalarProperty()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getEntityScalarDataPropertyRestrictionAxiom_ScalarProperty()));
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarRestriction()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarRestriction()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getRestrictedEntityEntityReferenceParserRuleCall_3_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getEntityScalarDataPropertyRestrictionAxiom_RestrictedEntity(), false));
		feeder.accept(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getEntityScalarDataPropertyRestrictionAxiom_ScalarProperty(), false));
		feeder.accept(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarRestrictionDataRangeReferenceParserRuleCall_7_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarRestriction(), false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyBoxStatement returns EntityScalarDataPropertyParticularRestrictionAxiom
	 *     Axiom returns EntityScalarDataPropertyParticularRestrictionAxiom
	 *     TermAxiom returns EntityScalarDataPropertyParticularRestrictionAxiom
	 *     EntityScalarDataPropertyRestrictionAxiom returns EntityScalarDataPropertyParticularRestrictionAxiom
	 *     EntityScalarDataPropertyParticularRestrictionAxiom returns EntityScalarDataPropertyParticularRestrictionAxiom
	 *
	 * Constraint:
	 *     (restrictedEntity=[Entity|Reference] scalarProperty=[EntityScalarDataProperty|Reference] literalValue=STRING)
	 */
	protected void sequence_EntityScalarDataPropertyParticularRestrictionAxiom(ISerializationContext context, EntityScalarDataPropertyParticularRestrictionAxiom semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getEntityScalarDataPropertyRestrictionAxiom_RestrictedEntity()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getEntityScalarDataPropertyRestrictionAxiom_RestrictedEntity()));
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getEntityScalarDataPropertyRestrictionAxiom_ScalarProperty()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getEntityScalarDataPropertyRestrictionAxiom_ScalarProperty()));
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getEntityScalarDataPropertyParticularRestrictionAxiom_LiteralValue()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getEntityScalarDataPropertyParticularRestrictionAxiom_LiteralValue()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getRestrictedEntityEntityReferenceParserRuleCall_3_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getEntityScalarDataPropertyRestrictionAxiom_RestrictedEntity(), false));
		feeder.accept(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getEntityScalarDataPropertyRestrictionAxiom_ScalarProperty(), false));
		feeder.accept(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getLiteralValueSTRINGTerminalRuleCall_7_0(), semanticObject.getLiteralValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyBoxStatement returns EntityScalarDataPropertyUniversalRestrictionAxiom
	 *     Axiom returns EntityScalarDataPropertyUniversalRestrictionAxiom
	 *     TermAxiom returns EntityScalarDataPropertyUniversalRestrictionAxiom
	 *     EntityScalarDataPropertyRestrictionAxiom returns EntityScalarDataPropertyUniversalRestrictionAxiom
	 *     EntityScalarDataPropertyUniversalRestrictionAxiom returns EntityScalarDataPropertyUniversalRestrictionAxiom
	 *
	 * Constraint:
	 *     (restrictedEntity=[Entity|Reference] scalarProperty=[EntityScalarDataProperty|Reference] scalarRestriction=[DataRange|Reference])
	 */
	protected void sequence_EntityScalarDataPropertyUniversalRestrictionAxiom(ISerializationContext context, EntityScalarDataPropertyUniversalRestrictionAxiom semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getEntityScalarDataPropertyRestrictionAxiom_RestrictedEntity()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getEntityScalarDataPropertyRestrictionAxiom_RestrictedEntity()));
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getEntityScalarDataPropertyRestrictionAxiom_ScalarProperty()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getEntityScalarDataPropertyRestrictionAxiom_ScalarProperty()));
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarRestriction()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarRestriction()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getRestrictedEntityEntityReferenceParserRuleCall_3_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getEntityScalarDataPropertyRestrictionAxiom_RestrictedEntity(), false));
		feeder.accept(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getEntityScalarDataPropertyRestrictionAxiom_ScalarProperty(), false));
		feeder.accept(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarRestrictionDataRangeReferenceParserRuleCall_7_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarRestriction(), false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyBoxStatement returns EntityScalarDataProperty
	 *     Term returns EntityScalarDataProperty
	 *     DataRelationship returns EntityScalarDataProperty
	 *     EntityScalarDataProperty returns EntityScalarDataProperty
	 *
	 * Constraint:
	 *     (name=ID domain=[Entity|Reference] range=[DataRange|Reference])
	 */
	protected void sequence_EntityScalarDataProperty(ISerializationContext context, EntityScalarDataProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getTerm_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getTerm_Name()));
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getDataRelationshipFromEntity_Domain()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getDataRelationshipFromEntity_Domain()));
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getDataRelationshipToScalar_Range()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getDataRelationshipToScalar_Range()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getEntityScalarDataPropertyAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEntityScalarDataPropertyAccess().getDomainEntityReferenceParserRuleCall_4_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getDataRelationshipFromEntity_Domain(), false));
		feeder.accept(grammarAccess.getEntityScalarDataPropertyAccess().getRangeDataRangeReferenceParserRuleCall_6_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getDataRelationshipToScalar_Range(), false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyBoxStatement returns EntityStructuredDataProperty
	 *     Term returns EntityStructuredDataProperty
	 *     DataRelationship returns EntityStructuredDataProperty
	 *     EntityStructuredDataProperty returns EntityStructuredDataProperty
	 *
	 * Constraint:
	 *     (name=ID domain=[Entity|Reference] range=[Structure|Reference])
	 */
	protected void sequence_EntityStructuredDataProperty(ISerializationContext context, EntityStructuredDataProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getTerm_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getTerm_Name()));
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getDataRelationshipFromEntity_Domain()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getDataRelationshipFromEntity_Domain()));
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getDataRelationshipToStructure_Range()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getDataRelationshipToStructure_Range()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getEntityStructuredDataPropertyAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEntityStructuredDataPropertyAccess().getDomainEntityReferenceParserRuleCall_4_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getDataRelationshipFromEntity_Domain(), false));
		feeder.accept(grammarAccess.getEntityStructuredDataPropertyAccess().getRangeStructureReferenceParserRuleCall_6_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getDataRelationshipToStructure_Range(), false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyBoxStatement returns EntityUniversalRestrictionAxiom
	 *     Axiom returns EntityUniversalRestrictionAxiom
	 *     TermAxiom returns EntityUniversalRestrictionAxiom
	 *     EntityRestrictionAxiom returns EntityUniversalRestrictionAxiom
	 *     EntityUniversalRestrictionAxiom returns EntityUniversalRestrictionAxiom
	 *
	 * Constraint:
	 *     (restrictedRelation=[ReifiedRelationship|Reference] restrictedRange=[Entity|Reference] restrictedDomain=[Entity|Reference])
	 */
	protected void sequence_EntityUniversalRestrictionAxiom(ISerializationContext context, EntityUniversalRestrictionAxiom semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getEntityRestrictionAxiom_RestrictedRelation()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getEntityRestrictionAxiom_RestrictedRelation()));
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getEntityRestrictionAxiom_RestrictedRange()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getEntityRestrictionAxiom_RestrictedRange()));
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getEntityRestrictionAxiom_RestrictedDomain()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getEntityRestrictionAxiom_RestrictedDomain()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedRelationReifiedRelationshipReferenceParserRuleCall_3_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getEntityRestrictionAxiom_RestrictedRelation(), false));
		feeder.accept(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedRangeEntityReferenceParserRuleCall_5_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getEntityRestrictionAxiom_RestrictedRange(), false));
		feeder.accept(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedDomainEntityReferenceParserRuleCall_7_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getEntityRestrictionAxiom_RestrictedDomain(), false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyBoxStatement returns IRIScalarRestriction
	 *     Term returns IRIScalarRestriction
	 *     Datatype returns IRIScalarRestriction
	 *     ScalarDataRange returns IRIScalarRestriction
	 *     RestrictedDataRange returns IRIScalarRestriction
	 *     IRIScalarRestriction returns IRIScalarRestriction
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         length=INT? 
	 *         minLength=INT? 
	 *         maxLength=INT? 
	 *         pattern=STRING? 
	 *         restrictedRange=[DataRange|Reference]
	 *     )
	 */
	protected void sequence_IRIScalarRestriction(ISerializationContext context, IRIScalarRestriction semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyBoxStatement returns NumericScalarRestriction
	 *     Term returns NumericScalarRestriction
	 *     Datatype returns NumericScalarRestriction
	 *     ScalarDataRange returns NumericScalarRestriction
	 *     RestrictedDataRange returns NumericScalarRestriction
	 *     NumericScalarRestriction returns NumericScalarRestriction
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         minInclusive=STRING? 
	 *         maxInclusive=STRING? 
	 *         minExclusive=STRING? 
	 *         maxExclusive=STRING? 
	 *         restrictedRange=[DataRange|Reference]
	 *     )
	 */
	protected void sequence_NumericScalarRestriction(ISerializationContext context, NumericScalarRestriction semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyBoxStatement returns PlainLiteralScalarRestriction
	 *     Term returns PlainLiteralScalarRestriction
	 *     Datatype returns PlainLiteralScalarRestriction
	 *     ScalarDataRange returns PlainLiteralScalarRestriction
	 *     RestrictedDataRange returns PlainLiteralScalarRestriction
	 *     PlainLiteralScalarRestriction returns PlainLiteralScalarRestriction
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         length=INT? 
	 *         minLength=INT? 
	 *         maxLength=INT? 
	 *         pattern=STRING? 
	 *         langRange=STRING? 
	 *         restrictedRange=[DataRange|Reference]
	 *     )
	 */
	protected void sequence_PlainLiteralScalarRestriction(ISerializationContext context, PlainLiteralScalarRestriction semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyInstanceAssertion returns ReifiedRelationshipInstanceDomain
	 *     ReifiedRelationshipInstanceDomain returns ReifiedRelationshipInstanceDomain
	 *
	 * Constraint:
	 *     (reifiedRelationshipInstance=[ReifiedRelationshipInstance|Reference] domain=[ConceptualEntitySingletonInstance|Reference])
	 */
	protected void sequence_ReifiedRelationshipInstanceDomain(ISerializationContext context, ReifiedRelationshipInstanceDomain semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getReifiedRelationshipInstanceDomain_ReifiedRelationshipInstance()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getReifiedRelationshipInstanceDomain_ReifiedRelationshipInstance()));
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getReifiedRelationshipInstanceDomain_Domain()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getReifiedRelationshipInstanceDomain_Domain()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getReifiedRelationshipInstanceDomainAccess().getReifiedRelationshipInstanceReifiedRelationshipInstanceReferenceParserRuleCall_3_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getReifiedRelationshipInstanceDomain_ReifiedRelationshipInstance(), false));
		feeder.accept(grammarAccess.getReifiedRelationshipInstanceDomainAccess().getDomainConceptualEntitySingletonInstanceReferenceParserRuleCall_5_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getReifiedRelationshipInstanceDomain_Domain(), false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyInstanceAssertion returns ReifiedRelationshipInstanceRange
	 *     ReifiedRelationshipInstanceRange returns ReifiedRelationshipInstanceRange
	 *
	 * Constraint:
	 *     (reifiedRelationshipInstance=[ReifiedRelationshipInstance|Reference] range=[ConceptualEntitySingletonInstance|Reference])
	 */
	protected void sequence_ReifiedRelationshipInstanceRange(ISerializationContext context, ReifiedRelationshipInstanceRange semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getReifiedRelationshipInstanceRange_ReifiedRelationshipInstance()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getReifiedRelationshipInstanceRange_ReifiedRelationshipInstance()));
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getReifiedRelationshipInstanceRange_Range()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getReifiedRelationshipInstanceRange_Range()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getReifiedRelationshipInstanceRangeAccess().getReifiedRelationshipInstanceReifiedRelationshipInstanceReferenceParserRuleCall_3_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getReifiedRelationshipInstanceRange_ReifiedRelationshipInstance(), false));
		feeder.accept(grammarAccess.getReifiedRelationshipInstanceRangeAccess().getRangeConceptualEntitySingletonInstanceReferenceParserRuleCall_5_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getReifiedRelationshipInstanceRange_Range(), false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyInstanceAssertion returns ReifiedRelationshipInstance
	 *     ReifiedRelationshipInstance returns ReifiedRelationshipInstance
	 *
	 * Constraint:
	 *     singletonReifiedRelationshipClassifier=[ReifiedRelationship|Reference]
	 */
	protected void sequence_ReifiedRelationshipInstance(ISerializationContext context, ReifiedRelationshipInstance semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getReifiedRelationshipInstance_SingletonReifiedRelationshipClassifier()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getReifiedRelationshipInstance_SingletonReifiedRelationshipClassifier()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getReifiedRelationshipInstanceAccess().getSingletonReifiedRelationshipClassifierReifiedRelationshipReferenceParserRuleCall_3_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getReifiedRelationshipInstance_SingletonReifiedRelationshipClassifier(), false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyBoxStatement returns ReifiedRelationshipSpecializationAxiom
	 *     Axiom returns ReifiedRelationshipSpecializationAxiom
	 *     TermAxiom returns ReifiedRelationshipSpecializationAxiom
	 *     SpecializationAxiom returns ReifiedRelationshipSpecializationAxiom
	 *     ReifiedRelationshipSpecializationAxiom returns ReifiedRelationshipSpecializationAxiom
	 *
	 * Constraint:
	 *     (subRelationship=[ReifiedRelationship|Reference] superRelationship=[ReifiedRelationship|Reference])
	 */
	protected void sequence_ReifiedRelationshipSpecializationAxiom(ISerializationContext context, ReifiedRelationshipSpecializationAxiom semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getReifiedRelationshipSpecializationAxiom_SubRelationship()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getReifiedRelationshipSpecializationAxiom_SubRelationship()));
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getReifiedRelationshipSpecializationAxiom_SuperRelationship()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getReifiedRelationshipSpecializationAxiom_SuperRelationship()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getReifiedRelationshipSpecializationAxiomAccess().getSubRelationshipReifiedRelationshipReferenceParserRuleCall_0_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getReifiedRelationshipSpecializationAxiom_SubRelationship(), false));
		feeder.accept(grammarAccess.getReifiedRelationshipSpecializationAxiomAccess().getSuperRelationshipReifiedRelationshipReferenceParserRuleCall_2_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getReifiedRelationshipSpecializationAxiom_SuperRelationship(), false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyBoxStatement returns ReifiedRelationship
	 *     Term returns ReifiedRelationship
	 *     EntityRelationship returns ReifiedRelationship
	 *     ReifiedRelationship returns ReifiedRelationship
	 *
	 * Constraint:
	 *     (
	 *         isAbstract?=ABSTRACT_TOKEN? 
	 *         name=ID 
	 *         isFunctional?=FUNCTIONAL_TOKEN? 
	 *         isInverseFunctional?=INVERSE_FUNCTIONAL_TOKEN? 
	 *         isEssential?=ESSENTIAL_TOKEN? 
	 *         isInverseEssential?=INVERSE_ESSENTIAL_TOKEN? 
	 *         isSymmetric?=SYMMETRIC_TOKEN? 
	 *         isAsymmetric?=ASYMMETRIC_TOKEN? 
	 *         isReflexive?=REFLEXIVE_TOKEN? 
	 *         isIrreflexive?=IRREFLEXIVE_TOKEN? 
	 *         isTransitive?=TRANSITIVE_TOKEN? 
	 *         unreifiedPropertyName=ID 
	 *         unreifiedInversePropertyName=ID? 
	 *         source=[Entity|Reference] 
	 *         target=[Entity|Reference]
	 *     )
	 */
	protected void sequence_ReifiedRelationship(ISerializationContext context, ReifiedRelationship semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyBundleStatement returns RootConceptTaxonomyAxiom
	 *     ConceptTreeDisjunction returns RootConceptTaxonomyAxiom
	 *     RootConceptTaxonomyAxiom returns RootConceptTaxonomyAxiom
	 *
	 * Constraint:
	 *     root=[Concept|Reference]
	 */
	protected void sequence_RootConceptTaxonomyAxiom(ISerializationContext context, RootConceptTaxonomyAxiom semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getRootConceptTaxonomyAxiom_Root()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getRootConceptTaxonomyAxiom_Root()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getRootConceptTaxonomyAxiomAccess().getRootConceptReferenceParserRuleCall_3_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getRootConceptTaxonomyAxiom_Root(), false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyInstanceAssertion returns ScalarDataPropertyValue
	 *     ScalarDataPropertyValue returns ScalarDataPropertyValue
	 *
	 * Constraint:
	 *     (scalarPropertyValue=Reference scalarDataProperty=[DataRelationshipToScalar|Reference])
	 */
	protected void sequence_ScalarDataPropertyValue(ISerializationContext context, ScalarDataPropertyValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getScalarDataPropertyValue_ScalarPropertyValue()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getScalarDataPropertyValue_ScalarPropertyValue()));
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getScalarDataPropertyValue_ScalarDataProperty()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getScalarDataPropertyValue_ScalarDataProperty()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getScalarDataPropertyValueAccess().getScalarPropertyValueReferenceParserRuleCall_3_0(), semanticObject.getScalarPropertyValue());
		feeder.accept(grammarAccess.getScalarDataPropertyValueAccess().getScalarDataPropertyDataRelationshipToScalarReferenceParserRuleCall_5_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getScalarDataPropertyValue_ScalarDataProperty(), false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyBoxStatement returns ScalarDataProperty
	 *     Term returns ScalarDataProperty
	 *     DataRelationship returns ScalarDataProperty
	 *     ScalarDataProperty returns ScalarDataProperty
	 *
	 * Constraint:
	 *     (name=ID domain=[Structure|Reference] range=[DataRange|Reference])
	 */
	protected void sequence_ScalarDataProperty(ISerializationContext context, ScalarDataProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getTerm_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getTerm_Name()));
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getDataRelationshipFromStructure_Domain()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getDataRelationshipFromStructure_Domain()));
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getDataRelationshipToScalar_Range()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getDataRelationshipToScalar_Range()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getScalarDataPropertyAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getScalarDataPropertyAccess().getDomainStructureReferenceParserRuleCall_4_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getDataRelationshipFromStructure_Domain(), false));
		feeder.accept(grammarAccess.getScalarDataPropertyAccess().getRangeDataRangeReferenceParserRuleCall_6_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getDataRelationshipToScalar_Range(), false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyBoxStatement returns ScalarOneOfLiteralAxiom
	 *     Axiom returns ScalarOneOfLiteralAxiom
	 *     ScalarOneOfLiteralAxiom returns ScalarOneOfLiteralAxiom
	 *
	 * Constraint:
	 *     (value=STRING axiom=[ScalarOneOfRestriction|Reference])
	 */
	protected void sequence_ScalarOneOfLiteralAxiom(ISerializationContext context, ScalarOneOfLiteralAxiom semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getScalarOneOfLiteralAxiom_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getScalarOneOfLiteralAxiom_Value()));
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getScalarOneOfLiteralAxiom_Axiom()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getScalarOneOfLiteralAxiom_Axiom()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getScalarOneOfLiteralAxiomAccess().getValueSTRINGTerminalRuleCall_3_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getScalarOneOfLiteralAxiomAccess().getAxiomScalarOneOfRestrictionReferenceParserRuleCall_5_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getScalarOneOfLiteralAxiom_Axiom(), false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyBoxStatement returns ScalarOneOfRestriction
	 *     Term returns ScalarOneOfRestriction
	 *     Datatype returns ScalarOneOfRestriction
	 *     ScalarDataRange returns ScalarOneOfRestriction
	 *     RestrictedDataRange returns ScalarOneOfRestriction
	 *     ScalarOneOfRestriction returns ScalarOneOfRestriction
	 *
	 * Constraint:
	 *     (name=ID restrictedRange=[DataRange|Reference])
	 */
	protected void sequence_ScalarOneOfRestriction(ISerializationContext context, ScalarOneOfRestriction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getTerm_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getTerm_Name()));
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getRestrictedDataRange_RestrictedRange()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getRestrictedDataRange_RestrictedRange()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getScalarOneOfRestrictionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getScalarOneOfRestrictionAccess().getRestrictedRangeDataRangeReferenceParserRuleCall_4_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getRestrictedDataRange_RestrictedRange(), false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyBoxStatement returns Scalar
	 *     Term returns Scalar
	 *     Datatype returns Scalar
	 *     ScalarDataRange returns Scalar
	 *     Scalar returns Scalar
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Scalar(ISerializationContext context, Scalar semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getTerm_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getTerm_Name()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getScalarAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyBundleStatement returns SpecificDisjointConceptAxiom
	 *     SpecificDisjointConceptAxiom returns SpecificDisjointConceptAxiom
	 *
	 * Constraint:
	 *     (disjointTaxonomyParent=[ConceptTreeDisjunction|Reference] disjointLeaf=[Concept|Reference])
	 */
	protected void sequence_SpecificDisjointConceptAxiom(ISerializationContext context, SpecificDisjointConceptAxiom semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getDisjointUnionOfConceptsAxiom_DisjointTaxonomyParent()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getDisjointUnionOfConceptsAxiom_DisjointTaxonomyParent()));
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getSpecificDisjointConceptAxiom_DisjointLeaf()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getSpecificDisjointConceptAxiom_DisjointLeaf()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getSpecificDisjointConceptAxiomAccess().getDisjointTaxonomyParentConceptTreeDisjunctionReferenceParserRuleCall_3_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getDisjointUnionOfConceptsAxiom_DisjointTaxonomyParent(), false));
		feeder.accept(grammarAccess.getSpecificDisjointConceptAxiomAccess().getDisjointLeafConceptReferenceParserRuleCall_5_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getSpecificDisjointConceptAxiom_DisjointLeaf(), false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyBoxStatement returns StringScalarRestriction
	 *     Term returns StringScalarRestriction
	 *     Datatype returns StringScalarRestriction
	 *     ScalarDataRange returns StringScalarRestriction
	 *     RestrictedDataRange returns StringScalarRestriction
	 *     StringScalarRestriction returns StringScalarRestriction
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         length=INT? 
	 *         minLength=INT? 
	 *         maxLength=INT? 
	 *         pattern=STRING? 
	 *         restrictedRange=[DataRange|Reference]
	 *     )
	 */
	protected void sequence_StringScalarRestriction(ISerializationContext context, StringScalarRestriction semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyBoxStatement returns Structure
	 *     Term returns Structure
	 *     Datatype returns Structure
	 *     Structure returns Structure
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Structure(ISerializationContext context, Structure semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getTerm_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getTerm_Name()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getStructureAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyInstanceAssertion returns StructuredDataPropertyValue
	 *     StructuredDataPropertyValue returns StructuredDataPropertyValue
	 *
	 * Constraint:
	 *     (structuredDataProperty=[DataRelationshipToStructure|Reference] structuredPropertyTuple=DataStructureTuple)
	 */
	protected void sequence_StructuredDataPropertyValue(ISerializationContext context, StructuredDataPropertyValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getStructuredDataPropertyValue_StructuredDataProperty()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getStructuredDataPropertyValue_StructuredDataProperty()));
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getStructuredDataPropertyValue_StructuredPropertyTuple()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getStructuredDataPropertyValue_StructuredPropertyTuple()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getStructuredDataPropertyValueAccess().getStructuredDataPropertyDataRelationshipToStructureReferenceParserRuleCall_3_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getStructuredDataPropertyValue_StructuredDataProperty(), false));
		feeder.accept(grammarAccess.getStructuredDataPropertyValueAccess().getStructuredPropertyTupleDataStructureTupleParserRuleCall_5_0(), semanticObject.getStructuredPropertyTuple());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyBoxStatement returns StructuredDataProperty
	 *     Term returns StructuredDataProperty
	 *     DataRelationship returns StructuredDataProperty
	 *     StructuredDataProperty returns StructuredDataProperty
	 *
	 * Constraint:
	 *     (name=ID domain=[Structure|Reference] range=[Structure|Reference])
	 */
	protected void sequence_StructuredDataProperty(ISerializationContext context, StructuredDataProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getTerm_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getTerm_Name()));
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getDataRelationshipFromStructure_Domain()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getDataRelationshipFromStructure_Domain()));
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getDataRelationshipToStructure_Range()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getDataRelationshipToStructure_Range()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getStructuredDataPropertyAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getStructuredDataPropertyAccess().getDomainStructureReferenceParserRuleCall_4_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getDataRelationshipFromStructure_Domain(), false));
		feeder.accept(grammarAccess.getStructuredDataPropertyAccess().getRangeStructureReferenceParserRuleCall_6_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getDataRelationshipToStructure_Range(), false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyBoxStatement returns SynonymScalarRestriction
	 *     Term returns SynonymScalarRestriction
	 *     Datatype returns SynonymScalarRestriction
	 *     ScalarDataRange returns SynonymScalarRestriction
	 *     RestrictedDataRange returns SynonymScalarRestriction
	 *     SynonymScalarRestriction returns SynonymScalarRestriction
	 *
	 * Constraint:
	 *     (name=ID restrictedRange=[DataRange|Reference])
	 */
	protected void sequence_SynonymScalarRestriction(ISerializationContext context, SynonymScalarRestriction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getTerm_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getTerm_Name()));
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getRestrictedDataRange_RestrictedRange()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getRestrictedDataRange_RestrictedRange()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getSynonymScalarRestrictionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSynonymScalarRestrictionAccess().getRestrictedRangeDataRangeReferenceParserRuleCall_4_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getRestrictedDataRange_RestrictedRange(), false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyBoxAxiom returns TerminologyExtensionAxiom
	 *     TerminologyExtensionAxiom returns TerminologyExtensionAxiom
	 *
	 * Constraint:
	 *     extendedTerminology=[TerminologyBox|Reference]
	 */
	protected void sequence_TerminologyExtensionAxiom(ISerializationContext context, TerminologyExtensionAxiom semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getTerminologyExtensionAxiom_ExtendedTerminology()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getTerminologyExtensionAxiom_ExtendedTerminology()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getTerminologyExtensionAxiomAccess().getExtendedTerminologyTerminologyBoxReferenceParserRuleCall_1_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getTerminologyExtensionAxiom_ExtendedTerminology(), false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyExtent returns TerminologyExtent
	 *
	 * Constraint:
	 *     (annotationProperties+=AnnotationProperty | terminologyGraphs+=TerminologyGraph | bundles+=Bundle | descriptions+=DescriptionBox)*
	 */
	protected void sequence_TerminologyExtent(ISerializationContext context, TerminologyExtent semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyBox returns TerminologyGraph
	 *     TerminologyGraph returns TerminologyGraph
	 *
	 * Constraint:
	 *     (
	 *         kind=TerminologyGraphKind 
	 *         iri=IRI 
	 *         (annotations+=Annotation | terminologyBoxAxioms+=TerminologyBoxAxiom | boxStatements+=TerminologyBoxStatement)*
	 *     )
	 */
	protected void sequence_TerminologyGraph(ISerializationContext context, TerminologyGraph semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyBoxAxiom returns TerminologyNestingAxiom
	 *     TerminologyNestingAxiom returns TerminologyNestingAxiom
	 *
	 * Constraint:
	 *     (nestingTerminology=[TerminologyBox|Reference] nestingContext=[Concept|Reference])
	 */
	protected void sequence_TerminologyNestingAxiom(ISerializationContext context, TerminologyNestingAxiom semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getTerminologyNestingAxiom_NestingTerminology()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getTerminologyNestingAxiom_NestingTerminology()));
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getTerminologyNestingAxiom_NestingContext()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getTerminologyNestingAxiom_NestingContext()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getTerminologyNestingAxiomAccess().getNestingTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getTerminologyNestingAxiom_NestingTerminology(), false));
		feeder.accept(grammarAccess.getTerminologyNestingAxiomAccess().getNestingContextConceptReferenceParserRuleCall_5_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getTerminologyNestingAxiom_NestingContext(), false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyBoxStatement returns TimeScalarRestriction
	 *     Term returns TimeScalarRestriction
	 *     Datatype returns TimeScalarRestriction
	 *     ScalarDataRange returns TimeScalarRestriction
	 *     RestrictedDataRange returns TimeScalarRestriction
	 *     TimeScalarRestriction returns TimeScalarRestriction
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         minInclusive=STRING? 
	 *         maxInclusive=STRING? 
	 *         minExclusive=STRING? 
	 *         maxExclusive=STRING? 
	 *         restrictedRange=[DataRange|Reference]
	 *     )
	 */
	protected void sequence_TimeScalarRestriction(ISerializationContext context, TimeScalarRestriction semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyInstanceAssertion returns UnreifiedRelationshipInstanceTuple
	 *     UnreifiedRelationshipInstanceTuple returns UnreifiedRelationshipInstanceTuple
	 *
	 * Constraint:
	 *     (
	 *         unreifiedRelationship=[UnreifiedRelationship|Reference] 
	 *         domain=[ConceptualEntitySingletonInstance|Reference] 
	 *         range=[ConceptualEntitySingletonInstance|Reference]
	 *     )
	 */
	protected void sequence_UnreifiedRelationshipInstanceTuple(ISerializationContext context, UnreifiedRelationshipInstanceTuple semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getUnreifiedRelationshipInstanceTuple_UnreifiedRelationship()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getUnreifiedRelationshipInstanceTuple_UnreifiedRelationship()));
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getUnreifiedRelationshipInstanceTuple_Domain()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getUnreifiedRelationshipInstanceTuple_Domain()));
			if (transientValues.isValueTransient((EObject) semanticObject, EcorePackage.eINSTANCE.getUnreifiedRelationshipInstanceTuple_Range()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcorePackage.eINSTANCE.getUnreifiedRelationshipInstanceTuple_Range()));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getUnreifiedRelationshipUnreifiedRelationshipReferenceParserRuleCall_3_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getUnreifiedRelationshipInstanceTuple_UnreifiedRelationship(), false));
		feeder.accept(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getDomainConceptualEntitySingletonInstanceReferenceParserRuleCall_5_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getUnreifiedRelationshipInstanceTuple_Domain(), false));
		feeder.accept(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getRangeConceptualEntitySingletonInstanceReferenceParserRuleCall_7_0_1(), semanticObject.eGet(EcorePackage.eINSTANCE.getUnreifiedRelationshipInstanceTuple_Range(), false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TerminologyBoxStatement returns UnreifiedRelationship
	 *     Term returns UnreifiedRelationship
	 *     EntityRelationship returns UnreifiedRelationship
	 *     UnreifiedRelationship returns UnreifiedRelationship
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         isFunctional?=FUNCTIONAL_TOKEN? 
	 *         isInverseFunctional?=INVERSE_FUNCTIONAL_TOKEN? 
	 *         isEssential?=ESSENTIAL_TOKEN? 
	 *         isInverseEssential?=INVERSE_ESSENTIAL_TOKEN? 
	 *         isSymmetric?=SYMMETRIC_TOKEN? 
	 *         isAsymmetric?=ASYMMETRIC_TOKEN? 
	 *         isReflexive?=REFLEXIVE_TOKEN? 
	 *         isIrreflexive?=IRREFLEXIVE_TOKEN? 
	 *         isTransitive?=TRANSITIVE_TOKEN? 
	 *         source=[Entity|Reference] 
	 *         target=[Entity|Reference]
	 *     )
	 */
	protected void sequence_UnreifiedRelationship(ISerializationContext context, UnreifiedRelationship semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
}
