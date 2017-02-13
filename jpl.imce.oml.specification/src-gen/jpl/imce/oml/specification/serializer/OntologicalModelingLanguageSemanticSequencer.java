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
import jpl.imce.oml.specification.ecore.EntityExistentialRestrictionAxiom;
import jpl.imce.oml.specification.ecore.EntityScalarDataProperty;
import jpl.imce.oml.specification.ecore.EntityScalarDataPropertyExistentialRestrictionAxiom;
import jpl.imce.oml.specification.ecore.EntityScalarDataPropertyParticularRestrictionAxiom;
import jpl.imce.oml.specification.ecore.EntityScalarDataPropertyUniversalRestrictionAxiom;
import jpl.imce.oml.specification.ecore.EntityStructuredDataProperty;
import jpl.imce.oml.specification.ecore.EntityUniversalRestrictionAxiom;
import jpl.imce.oml.specification.ecore.IRIScalarRestriction;
import jpl.imce.oml.specification.ecore.NumericScalarRestriction;
import jpl.imce.oml.specification.ecore.OMLPackage;
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
		if (epackage == OMLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case OMLPackage.ANNOTATION:
				sequence_Annotation(context, (Annotation) semanticObject); 
				return; 
			case OMLPackage.ANNOTATION_PROPERTY:
				sequence_AnnotationProperty(context, (AnnotationProperty) semanticObject); 
				return; 
			case OMLPackage.ANONYMOUS_CONCEPT_TAXONOMY_AXIOM:
				sequence_AnonymousConceptTaxonomyAxiom(context, (AnonymousConceptTaxonomyAxiom) semanticObject); 
				return; 
			case OMLPackage.ASPECT:
				sequence_Aspect(context, (Aspect) semanticObject); 
				return; 
			case OMLPackage.ASPECT_SPECIALIZATION_AXIOM:
				sequence_AspectSpecializationAxiom(context, (AspectSpecializationAxiom) semanticObject); 
				return; 
			case OMLPackage.BINARY_SCALAR_RESTRICTION:
				sequence_BinaryScalarRestriction(context, (BinaryScalarRestriction) semanticObject); 
				return; 
			case OMLPackage.BUNDLE:
				sequence_Bundle(context, (Bundle) semanticObject); 
				return; 
			case OMLPackage.BUNDLED_TERMINOLOGY_AXIOM:
				sequence_BundledTerminologyAxiom(context, (BundledTerminologyAxiom) semanticObject); 
				return; 
			case OMLPackage.CONCEPT:
				sequence_Concept(context, (Concept) semanticObject); 
				return; 
			case OMLPackage.CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM:
				sequence_ConceptDesignationTerminologyAxiom(context, (ConceptDesignationTerminologyAxiom) semanticObject); 
				return; 
			case OMLPackage.CONCEPT_INSTANCE:
				sequence_ConceptInstance(context, (ConceptInstance) semanticObject); 
				return; 
			case OMLPackage.CONCEPT_SPECIALIZATION_AXIOM:
				sequence_ConceptSpecializationAxiom(context, (ConceptSpecializationAxiom) semanticObject); 
				return; 
			case OMLPackage.DATA_STRUCTURE_TUPLE:
				sequence_DataStructureTuple(context, (DataStructureTuple) semanticObject); 
				return; 
			case OMLPackage.DESCRIPTION_BOX:
				sequence_DescriptionBox(context, (DescriptionBox) semanticObject); 
				return; 
			case OMLPackage.DESCRIPTION_BOX_EXTENDS_CLOSED_WORLD_DEFINITIONS:
				sequence_DescriptionBoxExtendsClosedWorldDefinitions(context, (DescriptionBoxExtendsClosedWorldDefinitions) semanticObject); 
				return; 
			case OMLPackage.DESCRIPTION_BOX_REFINEMENT:
				sequence_DescriptionBoxRefinement(context, (DescriptionBoxRefinement) semanticObject); 
				return; 
			case OMLPackage.ENTITY_EXISTENTIAL_RESTRICTION_AXIOM:
				sequence_EntityExistentialRestrictionAxiom(context, (EntityExistentialRestrictionAxiom) semanticObject); 
				return; 
			case OMLPackage.ENTITY_SCALAR_DATA_PROPERTY:
				sequence_EntityScalarDataProperty(context, (EntityScalarDataProperty) semanticObject); 
				return; 
			case OMLPackage.ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM:
				sequence_EntityScalarDataPropertyExistentialRestrictionAxiom(context, (EntityScalarDataPropertyExistentialRestrictionAxiom) semanticObject); 
				return; 
			case OMLPackage.ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM:
				sequence_EntityScalarDataPropertyParticularRestrictionAxiom(context, (EntityScalarDataPropertyParticularRestrictionAxiom) semanticObject); 
				return; 
			case OMLPackage.ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM:
				sequence_EntityScalarDataPropertyUniversalRestrictionAxiom(context, (EntityScalarDataPropertyUniversalRestrictionAxiom) semanticObject); 
				return; 
			case OMLPackage.ENTITY_STRUCTURED_DATA_PROPERTY:
				sequence_EntityStructuredDataProperty(context, (EntityStructuredDataProperty) semanticObject); 
				return; 
			case OMLPackage.ENTITY_UNIVERSAL_RESTRICTION_AXIOM:
				sequence_EntityUniversalRestrictionAxiom(context, (EntityUniversalRestrictionAxiom) semanticObject); 
				return; 
			case OMLPackage.IRI_SCALAR_RESTRICTION:
				sequence_IRIScalarRestriction(context, (IRIScalarRestriction) semanticObject); 
				return; 
			case OMLPackage.NUMERIC_SCALAR_RESTRICTION:
				sequence_NumericScalarRestriction(context, (NumericScalarRestriction) semanticObject); 
				return; 
			case OMLPackage.PLAIN_LITERAL_SCALAR_RESTRICTION:
				sequence_PlainLiteralScalarRestriction(context, (PlainLiteralScalarRestriction) semanticObject); 
				return; 
			case OMLPackage.REIFIED_RELATIONSHIP:
				sequence_ReifiedRelationship(context, (ReifiedRelationship) semanticObject); 
				return; 
			case OMLPackage.REIFIED_RELATIONSHIP_INSTANCE:
				sequence_ReifiedRelationshipInstance(context, (ReifiedRelationshipInstance) semanticObject); 
				return; 
			case OMLPackage.REIFIED_RELATIONSHIP_INSTANCE_DOMAIN:
				sequence_ReifiedRelationshipInstanceDomain(context, (ReifiedRelationshipInstanceDomain) semanticObject); 
				return; 
			case OMLPackage.REIFIED_RELATIONSHIP_INSTANCE_RANGE:
				sequence_ReifiedRelationshipInstanceRange(context, (ReifiedRelationshipInstanceRange) semanticObject); 
				return; 
			case OMLPackage.REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM:
				sequence_ReifiedRelationshipSpecializationAxiom(context, (ReifiedRelationshipSpecializationAxiom) semanticObject); 
				return; 
			case OMLPackage.ROOT_CONCEPT_TAXONOMY_AXIOM:
				sequence_RootConceptTaxonomyAxiom(context, (RootConceptTaxonomyAxiom) semanticObject); 
				return; 
			case OMLPackage.SCALAR:
				sequence_Scalar(context, (Scalar) semanticObject); 
				return; 
			case OMLPackage.SCALAR_DATA_PROPERTY:
				sequence_ScalarDataProperty(context, (ScalarDataProperty) semanticObject); 
				return; 
			case OMLPackage.SCALAR_DATA_PROPERTY_VALUE:
				sequence_ScalarDataPropertyValue(context, (ScalarDataPropertyValue) semanticObject); 
				return; 
			case OMLPackage.SCALAR_ONE_OF_LITERAL_AXIOM:
				sequence_ScalarOneOfLiteralAxiom(context, (ScalarOneOfLiteralAxiom) semanticObject); 
				return; 
			case OMLPackage.SCALAR_ONE_OF_RESTRICTION:
				sequence_ScalarOneOfRestriction(context, (ScalarOneOfRestriction) semanticObject); 
				return; 
			case OMLPackage.SPECIFIC_DISJOINT_CONCEPT_AXIOM:
				sequence_SpecificDisjointConceptAxiom(context, (SpecificDisjointConceptAxiom) semanticObject); 
				return; 
			case OMLPackage.STRING_SCALAR_RESTRICTION:
				sequence_StringScalarRestriction(context, (StringScalarRestriction) semanticObject); 
				return; 
			case OMLPackage.STRUCTURE:
				sequence_Structure(context, (Structure) semanticObject); 
				return; 
			case OMLPackage.STRUCTURED_DATA_PROPERTY:
				sequence_StructuredDataProperty(context, (StructuredDataProperty) semanticObject); 
				return; 
			case OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE:
				sequence_StructuredDataPropertyValue(context, (StructuredDataPropertyValue) semanticObject); 
				return; 
			case OMLPackage.SYNONYM_SCALAR_RESTRICTION:
				sequence_SynonymScalarRestriction(context, (SynonymScalarRestriction) semanticObject); 
				return; 
			case OMLPackage.TERMINOLOGY_EXTENSION_AXIOM:
				sequence_TerminologyExtensionAxiom(context, (TerminologyExtensionAxiom) semanticObject); 
				return; 
			case OMLPackage.TERMINOLOGY_EXTENT:
				sequence_TerminologyExtent(context, (TerminologyExtent) semanticObject); 
				return; 
			case OMLPackage.TERMINOLOGY_GRAPH:
				sequence_TerminologyGraph(context, (TerminologyGraph) semanticObject); 
				return; 
			case OMLPackage.TERMINOLOGY_NESTING_AXIOM:
				sequence_TerminologyNestingAxiom(context, (TerminologyNestingAxiom) semanticObject); 
				return; 
			case OMLPackage.TIME_SCALAR_RESTRICTION:
				sequence_TimeScalarRestriction(context, (TimeScalarRestriction) semanticObject); 
				return; 
			case OMLPackage.UNREIFIED_RELATIONSHIP:
				sequence_UnreifiedRelationship(context, (UnreifiedRelationship) semanticObject); 
				return; 
			case OMLPackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE:
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
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.ANNOTATION_PROPERTY__ABBREV_IRI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.ANNOTATION_PROPERTY__ABBREV_IRI));
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.ANNOTATION_PROPERTY__IRI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.ANNOTATION_PROPERTY__IRI));
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
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.ANNOTATION__PROPERTY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.ANNOTATION__PROPERTY));
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.ANNOTATION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.ANNOTATION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getAnnotationAccess().getPropertyAnnotationPropertyABBREV_IRIParserRuleCall_1_0_1(), semanticObject.getProperty());
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
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.DISJOINT_UNION_OF_CONCEPTS_AXIOM__DISJOINT_TAXONOMY_PARENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.DISJOINT_UNION_OF_CONCEPTS_AXIOM__DISJOINT_TAXONOMY_PARENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getAnonymousConceptTaxonomyAxiomAccess().getDisjointTaxonomyParentConceptTreeDisjunctionReferenceParserRuleCall_3_0_1(), semanticObject.getDisjointTaxonomyParent());
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
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.ASPECT_SPECIALIZATION_AXIOM__SUB_ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.ASPECT_SPECIALIZATION_AXIOM__SUB_ENTITY));
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.ASPECT_SPECIALIZATION_AXIOM__SUPER_ASPECT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.ASPECT_SPECIALIZATION_AXIOM__SUPER_ASPECT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getAspectSpecializationAxiomAccess().getSubEntityEntityReferenceParserRuleCall_0_0_1(), semanticObject.getSubEntity());
		feeder.accept(grammarAccess.getAspectSpecializationAxiomAccess().getSuperAspectAspectReferenceParserRuleCall_2_0_1(), semanticObject.getSuperAspect());
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
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.TERM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.TERM__NAME));
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
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.BUNDLED_TERMINOLOGY_AXIOM__BUNDLED_TERMINOLOGY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.BUNDLED_TERMINOLOGY_AXIOM__BUNDLED_TERMINOLOGY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getBundledTerminologyAxiomAccess().getBundledTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1(), semanticObject.getBundledTerminology());
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
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM__DESIGNATED_TERMINOLOGY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM__DESIGNATED_TERMINOLOGY));
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM__DESIGNATED_CONCEPT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM__DESIGNATED_CONCEPT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getConceptDesignationTerminologyAxiomAccess().getDesignatedTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1(), semanticObject.getDesignatedTerminology());
		feeder.accept(grammarAccess.getConceptDesignationTerminologyAxiomAccess().getDesignatedConceptConceptReferenceParserRuleCall_5_0_1(), semanticObject.getDesignatedConcept());
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
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.CONCEPT_INSTANCE__SINGLETON_CONCEPT_CLASSIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.CONCEPT_INSTANCE__SINGLETON_CONCEPT_CLASSIFIER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getConceptInstanceAccess().getSingletonConceptClassifierConceptReferenceParserRuleCall_3_0_1(), semanticObject.getSingletonConceptClassifier());
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
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.CONCEPT_SPECIALIZATION_AXIOM__SUB_CONCEPT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.CONCEPT_SPECIALIZATION_AXIOM__SUB_CONCEPT));
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.CONCEPT_SPECIALIZATION_AXIOM__SUPER_CONCEPT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.CONCEPT_SPECIALIZATION_AXIOM__SUPER_CONCEPT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getConceptSpecializationAxiomAccess().getSubConceptConceptReferenceParserRuleCall_3_0_1(), semanticObject.getSubConcept());
		feeder.accept(grammarAccess.getConceptSpecializationAxiomAccess().getSuperConceptConceptReferenceParserRuleCall_5_0_1(), semanticObject.getSuperConcept());
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
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.DATA_STRUCTURE_TUPLE__DATA_STRUCTURE_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.DATA_STRUCTURE_TUPLE__DATA_STRUCTURE_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getDataStructureTupleAccess().getDataStructureTypeStructureReferenceParserRuleCall_3_0_1(), semanticObject.getDataStructureType());
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
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.DESCRIPTION_BOX_EXTENDS_CLOSED_WORLD_DEFINITIONS__CLOSED_WORLD_DEFINITIONS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.DESCRIPTION_BOX_EXTENDS_CLOSED_WORLD_DEFINITIONS__CLOSED_WORLD_DEFINITIONS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getDescriptionBoxExtendsClosedWorldDefinitionsAccess().getClosedWorldDefinitionsTerminologyBoxReferenceParserRuleCall_1_0_1(), semanticObject.getClosedWorldDefinitions());
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
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.DESCRIPTION_BOX_REFINEMENT__REFINED_DESCRIPTION_BOX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.DESCRIPTION_BOX_REFINEMENT__REFINED_DESCRIPTION_BOX));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getDescriptionBoxRefinementAccess().getRefinedDescriptionBoxDescriptionBoxReferenceParserRuleCall_1_0_1(), semanticObject.getRefinedDescriptionBox());
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
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.ENTITY_RESTRICTION_AXIOM__RESTRICTED_RELATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.ENTITY_RESTRICTION_AXIOM__RESTRICTED_RELATION));
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.ENTITY_RESTRICTION_AXIOM__RESTRICTED_RANGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.ENTITY_RESTRICTION_AXIOM__RESTRICTED_RANGE));
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.ENTITY_RESTRICTION_AXIOM__RESTRICTED_DOMAIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.ENTITY_RESTRICTION_AXIOM__RESTRICTED_DOMAIN));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedRelationReifiedRelationshipReferenceParserRuleCall_3_0_1(), semanticObject.getRestrictedRelation());
		feeder.accept(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedRangeEntityReferenceParserRuleCall_5_0_1(), semanticObject.getRestrictedRange());
		feeder.accept(grammarAccess.getEntityExistentialRestrictionAxiomAccess().getRestrictedDomainEntityReferenceParserRuleCall_7_0_1(), semanticObject.getRestrictedDomain());
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
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__RESTRICTED_ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__RESTRICTED_ENTITY));
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__SCALAR_PROPERTY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__SCALAR_PROPERTY));
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM__SCALAR_RESTRICTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM__SCALAR_RESTRICTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getRestrictedEntityEntityReferenceParserRuleCall_3_0_1(), semanticObject.getRestrictedEntity());
		feeder.accept(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1(), semanticObject.getScalarProperty());
		feeder.accept(grammarAccess.getEntityScalarDataPropertyExistentialRestrictionAxiomAccess().getScalarRestrictionDataRangeReferenceParserRuleCall_7_0_1(), semanticObject.getScalarRestriction());
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
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__RESTRICTED_ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__RESTRICTED_ENTITY));
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__SCALAR_PROPERTY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__SCALAR_PROPERTY));
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM__LITERAL_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM__LITERAL_VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getRestrictedEntityEntityReferenceParserRuleCall_3_0_1(), semanticObject.getRestrictedEntity());
		feeder.accept(grammarAccess.getEntityScalarDataPropertyParticularRestrictionAxiomAccess().getScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1(), semanticObject.getScalarProperty());
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
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__RESTRICTED_ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__RESTRICTED_ENTITY));
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__SCALAR_PROPERTY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__SCALAR_PROPERTY));
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM__SCALAR_RESTRICTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM__SCALAR_RESTRICTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getRestrictedEntityEntityReferenceParserRuleCall_3_0_1(), semanticObject.getRestrictedEntity());
		feeder.accept(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarPropertyEntityScalarDataPropertyReferenceParserRuleCall_5_0_1(), semanticObject.getScalarProperty());
		feeder.accept(grammarAccess.getEntityScalarDataPropertyUniversalRestrictionAxiomAccess().getScalarRestrictionDataRangeReferenceParserRuleCall_7_0_1(), semanticObject.getScalarRestriction());
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
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.TERM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.TERM__NAME));
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.DATA_RELATIONSHIP_FROM_ENTITY__DOMAIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.DATA_RELATIONSHIP_FROM_ENTITY__DOMAIN));
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.DATA_RELATIONSHIP_TO_SCALAR__RANGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.DATA_RELATIONSHIP_TO_SCALAR__RANGE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getEntityScalarDataPropertyAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEntityScalarDataPropertyAccess().getDomainEntityReferenceParserRuleCall_4_0_1(), semanticObject.getDomain());
		feeder.accept(grammarAccess.getEntityScalarDataPropertyAccess().getRangeDataRangeReferenceParserRuleCall_6_0_1(), semanticObject.getRange());
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
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.TERM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.TERM__NAME));
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.DATA_RELATIONSHIP_FROM_ENTITY__DOMAIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.DATA_RELATIONSHIP_FROM_ENTITY__DOMAIN));
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.DATA_RELATIONSHIP_TO_STRUCTURE__RANGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.DATA_RELATIONSHIP_TO_STRUCTURE__RANGE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getEntityStructuredDataPropertyAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEntityStructuredDataPropertyAccess().getDomainEntityReferenceParserRuleCall_4_0_1(), semanticObject.getDomain());
		feeder.accept(grammarAccess.getEntityStructuredDataPropertyAccess().getRangeStructureReferenceParserRuleCall_6_0_1(), semanticObject.getRange());
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
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.ENTITY_RESTRICTION_AXIOM__RESTRICTED_RELATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.ENTITY_RESTRICTION_AXIOM__RESTRICTED_RELATION));
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.ENTITY_RESTRICTION_AXIOM__RESTRICTED_RANGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.ENTITY_RESTRICTION_AXIOM__RESTRICTED_RANGE));
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.ENTITY_RESTRICTION_AXIOM__RESTRICTED_DOMAIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.ENTITY_RESTRICTION_AXIOM__RESTRICTED_DOMAIN));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedRelationReifiedRelationshipReferenceParserRuleCall_3_0_1(), semanticObject.getRestrictedRelation());
		feeder.accept(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedRangeEntityReferenceParserRuleCall_5_0_1(), semanticObject.getRestrictedRange());
		feeder.accept(grammarAccess.getEntityUniversalRestrictionAxiomAccess().getRestrictedDomainEntityReferenceParserRuleCall_7_0_1(), semanticObject.getRestrictedDomain());
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
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.REIFIED_RELATIONSHIP_INSTANCE_DOMAIN__REIFIED_RELATIONSHIP_INSTANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.REIFIED_RELATIONSHIP_INSTANCE_DOMAIN__REIFIED_RELATIONSHIP_INSTANCE));
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.REIFIED_RELATIONSHIP_INSTANCE_DOMAIN__DOMAIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.REIFIED_RELATIONSHIP_INSTANCE_DOMAIN__DOMAIN));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getReifiedRelationshipInstanceDomainAccess().getReifiedRelationshipInstanceReifiedRelationshipInstanceReferenceParserRuleCall_3_0_1(), semanticObject.getReifiedRelationshipInstance());
		feeder.accept(grammarAccess.getReifiedRelationshipInstanceDomainAccess().getDomainConceptualEntitySingletonInstanceReferenceParserRuleCall_5_0_1(), semanticObject.getDomain());
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
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.REIFIED_RELATIONSHIP_INSTANCE_RANGE__REIFIED_RELATIONSHIP_INSTANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.REIFIED_RELATIONSHIP_INSTANCE_RANGE__REIFIED_RELATIONSHIP_INSTANCE));
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.REIFIED_RELATIONSHIP_INSTANCE_RANGE__RANGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.REIFIED_RELATIONSHIP_INSTANCE_RANGE__RANGE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getReifiedRelationshipInstanceRangeAccess().getReifiedRelationshipInstanceReifiedRelationshipInstanceReferenceParserRuleCall_3_0_1(), semanticObject.getReifiedRelationshipInstance());
		feeder.accept(grammarAccess.getReifiedRelationshipInstanceRangeAccess().getRangeConceptualEntitySingletonInstanceReferenceParserRuleCall_5_0_1(), semanticObject.getRange());
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
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.REIFIED_RELATIONSHIP_INSTANCE__SINGLETON_REIFIED_RELATIONSHIP_CLASSIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.REIFIED_RELATIONSHIP_INSTANCE__SINGLETON_REIFIED_RELATIONSHIP_CLASSIFIER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getReifiedRelationshipInstanceAccess().getSingletonReifiedRelationshipClassifierReifiedRelationshipReferenceParserRuleCall_3_0_1(), semanticObject.getSingletonReifiedRelationshipClassifier());
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
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM__SUB_RELATIONSHIP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM__SUB_RELATIONSHIP));
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM__SUPER_RELATIONSHIP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM__SUPER_RELATIONSHIP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getReifiedRelationshipSpecializationAxiomAccess().getSubRelationshipReifiedRelationshipReferenceParserRuleCall_3_0_1(), semanticObject.getSubRelationship());
		feeder.accept(grammarAccess.getReifiedRelationshipSpecializationAxiomAccess().getSuperRelationshipReifiedRelationshipReferenceParserRuleCall_5_0_1(), semanticObject.getSuperRelationship());
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
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.ROOT_CONCEPT_TAXONOMY_AXIOM__ROOT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.ROOT_CONCEPT_TAXONOMY_AXIOM__ROOT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getRootConceptTaxonomyAxiomAccess().getRootConceptReferenceParserRuleCall_3_0_1(), semanticObject.getRoot());
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
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.SCALAR_DATA_PROPERTY_VALUE__SCALAR_PROPERTY_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.SCALAR_DATA_PROPERTY_VALUE__SCALAR_PROPERTY_VALUE));
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.SCALAR_DATA_PROPERTY_VALUE__SCALAR_DATA_PROPERTY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.SCALAR_DATA_PROPERTY_VALUE__SCALAR_DATA_PROPERTY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getScalarDataPropertyValueAccess().getScalarPropertyValueReferenceParserRuleCall_3_0(), semanticObject.getScalarPropertyValue());
		feeder.accept(grammarAccess.getScalarDataPropertyValueAccess().getScalarDataPropertyDataRelationshipToScalarReferenceParserRuleCall_5_0_1(), semanticObject.getScalarDataProperty());
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
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.TERM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.TERM__NAME));
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.DATA_RELATIONSHIP_FROM_STRUCTURE__DOMAIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.DATA_RELATIONSHIP_FROM_STRUCTURE__DOMAIN));
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.DATA_RELATIONSHIP_TO_SCALAR__RANGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.DATA_RELATIONSHIP_TO_SCALAR__RANGE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getScalarDataPropertyAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getScalarDataPropertyAccess().getDomainStructureReferenceParserRuleCall_4_0_1(), semanticObject.getDomain());
		feeder.accept(grammarAccess.getScalarDataPropertyAccess().getRangeDataRangeReferenceParserRuleCall_6_0_1(), semanticObject.getRange());
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
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.SCALAR_ONE_OF_LITERAL_AXIOM__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.SCALAR_ONE_OF_LITERAL_AXIOM__VALUE));
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.SCALAR_ONE_OF_LITERAL_AXIOM__AXIOM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.SCALAR_ONE_OF_LITERAL_AXIOM__AXIOM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getScalarOneOfLiteralAxiomAccess().getValueSTRINGTerminalRuleCall_3_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getScalarOneOfLiteralAxiomAccess().getAxiomScalarOneOfRestrictionReferenceParserRuleCall_5_0_1(), semanticObject.getAxiom());
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
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.TERM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.TERM__NAME));
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.RESTRICTED_DATA_RANGE__RESTRICTED_RANGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.RESTRICTED_DATA_RANGE__RESTRICTED_RANGE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getScalarOneOfRestrictionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getScalarOneOfRestrictionAccess().getRestrictedRangeDataRangeReferenceParserRuleCall_4_0_1(), semanticObject.getRestrictedRange());
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
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.TERM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.TERM__NAME));
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
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.DISJOINT_UNION_OF_CONCEPTS_AXIOM__DISJOINT_TAXONOMY_PARENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.DISJOINT_UNION_OF_CONCEPTS_AXIOM__DISJOINT_TAXONOMY_PARENT));
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.SPECIFIC_DISJOINT_CONCEPT_AXIOM__DISJOINT_LEAF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.SPECIFIC_DISJOINT_CONCEPT_AXIOM__DISJOINT_LEAF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getSpecificDisjointConceptAxiomAccess().getDisjointTaxonomyParentConceptTreeDisjunctionReferenceParserRuleCall_3_0_1(), semanticObject.getDisjointTaxonomyParent());
		feeder.accept(grammarAccess.getSpecificDisjointConceptAxiomAccess().getDisjointLeafConceptReferenceParserRuleCall_5_0_1(), semanticObject.getDisjointLeaf());
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
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.TERM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.TERM__NAME));
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
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.STRUCTURED_DATA_PROPERTY_VALUE__STRUCTURED_DATA_PROPERTY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.STRUCTURED_DATA_PROPERTY_VALUE__STRUCTURED_DATA_PROPERTY));
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.STRUCTURED_DATA_PROPERTY_VALUE__STRUCTURED_PROPERTY_TUPLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.STRUCTURED_DATA_PROPERTY_VALUE__STRUCTURED_PROPERTY_TUPLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getStructuredDataPropertyValueAccess().getStructuredDataPropertyDataRelationshipToStructureReferenceParserRuleCall_3_0_1(), semanticObject.getStructuredDataProperty());
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
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.TERM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.TERM__NAME));
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.DATA_RELATIONSHIP_FROM_STRUCTURE__DOMAIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.DATA_RELATIONSHIP_FROM_STRUCTURE__DOMAIN));
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.DATA_RELATIONSHIP_TO_STRUCTURE__RANGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.DATA_RELATIONSHIP_TO_STRUCTURE__RANGE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getStructuredDataPropertyAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getStructuredDataPropertyAccess().getDomainStructureReferenceParserRuleCall_4_0_1(), semanticObject.getDomain());
		feeder.accept(grammarAccess.getStructuredDataPropertyAccess().getRangeStructureReferenceParserRuleCall_6_0_1(), semanticObject.getRange());
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
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.TERM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.TERM__NAME));
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.RESTRICTED_DATA_RANGE__RESTRICTED_RANGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.RESTRICTED_DATA_RANGE__RESTRICTED_RANGE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getSynonymScalarRestrictionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSynonymScalarRestrictionAccess().getRestrictedRangeDataRangeReferenceParserRuleCall_4_0_1(), semanticObject.getRestrictedRange());
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
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.TERMINOLOGY_EXTENSION_AXIOM__EXTENDED_TERMINOLOGY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.TERMINOLOGY_EXTENSION_AXIOM__EXTENDED_TERMINOLOGY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getTerminologyExtensionAxiomAccess().getExtendedTerminologyTerminologyBoxReferenceParserRuleCall_1_0_1(), semanticObject.getExtendedTerminology());
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
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.TERMINOLOGY_NESTING_AXIOM__NESTING_TERMINOLOGY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.TERMINOLOGY_NESTING_AXIOM__NESTING_TERMINOLOGY));
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.TERMINOLOGY_NESTING_AXIOM__NESTING_CONTEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.TERMINOLOGY_NESTING_AXIOM__NESTING_CONTEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getTerminologyNestingAxiomAccess().getNestingTerminologyTerminologyBoxReferenceParserRuleCall_3_0_1(), semanticObject.getNestingTerminology());
		feeder.accept(grammarAccess.getTerminologyNestingAxiomAccess().getNestingContextConceptReferenceParserRuleCall_5_0_1(), semanticObject.getNestingContext());
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
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__UNREIFIED_RELATIONSHIP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__UNREIFIED_RELATIONSHIP));
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__DOMAIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__DOMAIN));
			if (transientValues.isValueTransient((EObject) semanticObject, OMLPackage.Literals.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__RANGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, OMLPackage.Literals.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__RANGE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getUnreifiedRelationshipUnreifiedRelationshipReferenceParserRuleCall_3_0_1(), semanticObject.getUnreifiedRelationship());
		feeder.accept(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getDomainConceptualEntitySingletonInstanceReferenceParserRuleCall_5_0_1(), semanticObject.getDomain());
		feeder.accept(grammarAccess.getUnreifiedRelationshipInstanceTupleAccess().getRangeConceptualEntitySingletonInstanceReferenceParserRuleCall_7_0_1(), semanticObject.getRange());
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
