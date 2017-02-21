/**
 * 
 * Copyright 2016 California Institute of Technology ("Caltech").
 * U.S. Government sponsorship acknowledged.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package jpl.imce.oml.specification.ecore;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see jpl.imce.oml.specification.ecore.EcorePackage
 * @generated
 */
public interface EcoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcoreFactory eINSTANCE = jpl.imce.oml.specification.ecore.impl.EcoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Annotation Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Property</em>'.
	 * @generated
	 */
	AnnotationProperty createAnnotationProperty();

	/**
	 * Returns a new object of class '<em>Annotation Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Entry</em>'.
	 * @generated
	 */
	AnnotationEntry createAnnotationEntry();

	/**
	 * Returns a new object of class '<em>Annotation Subject Property Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Subject Property Value</em>'.
	 * @generated
	 */
	AnnotationSubjectPropertyValue createAnnotationSubjectPropertyValue();

	/**
	 * Returns a new object of class '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation</em>'.
	 * @generated
	 */
	Annotation createAnnotation();

	/**
	 * Returns a new object of class '<em>Terminology Extent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminology Extent</em>'.
	 * @generated
	 */
	TerminologyExtent createTerminologyExtent();

	/**
	 * Returns a new object of class '<em>Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle</em>'.
	 * @generated
	 */
	Bundle createBundle();

	/**
	 * Returns a new object of class '<em>Terminology Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminology Graph</em>'.
	 * @generated
	 */
	TerminologyGraph createTerminologyGraph();

	/**
	 * Returns a new object of class '<em>Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aspect</em>'.
	 * @generated
	 */
	Aspect createAspect();

	/**
	 * Returns a new object of class '<em>Concept</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept</em>'.
	 * @generated
	 */
	Concept createConcept();

	/**
	 * Returns a new object of class '<em>Reified Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reified Relationship</em>'.
	 * @generated
	 */
	ReifiedRelationship createReifiedRelationship();

	/**
	 * Returns a new object of class '<em>Unreified Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unreified Relationship</em>'.
	 * @generated
	 */
	UnreifiedRelationship createUnreifiedRelationship();

	/**
	 * Returns a new object of class '<em>Scalar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scalar</em>'.
	 * @generated
	 */
	Scalar createScalar();

	/**
	 * Returns a new object of class '<em>Entity Structured Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Structured Data Property</em>'.
	 * @generated
	 */
	EntityStructuredDataProperty createEntityStructuredDataProperty();

	/**
	 * Returns a new object of class '<em>Entity Scalar Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Scalar Data Property</em>'.
	 * @generated
	 */
	EntityScalarDataProperty createEntityScalarDataProperty();

	/**
	 * Returns a new object of class '<em>Structured Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structured Data Property</em>'.
	 * @generated
	 */
	StructuredDataProperty createStructuredDataProperty();

	/**
	 * Returns a new object of class '<em>Scalar Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scalar Data Property</em>'.
	 * @generated
	 */
	ScalarDataProperty createScalarDataProperty();

	/**
	 * Returns a new object of class '<em>Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure</em>'.
	 * @generated
	 */
	Structure createStructure();

	/**
	 * Returns a new object of class '<em>Specific Disjoint Concept Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specific Disjoint Concept Axiom</em>'.
	 * @generated
	 */
	SpecificDisjointConceptAxiom createSpecificDisjointConceptAxiom();

	/**
	 * Returns a new object of class '<em>Anonymous Concept Taxonomy Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anonymous Concept Taxonomy Axiom</em>'.
	 * @generated
	 */
	AnonymousConceptTaxonomyAxiom createAnonymousConceptTaxonomyAxiom();

	/**
	 * Returns a new object of class '<em>Root Concept Taxonomy Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Concept Taxonomy Axiom</em>'.
	 * @generated
	 */
	RootConceptTaxonomyAxiom createRootConceptTaxonomyAxiom();

	/**
	 * Returns a new object of class '<em>Bundled Terminology Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundled Terminology Axiom</em>'.
	 * @generated
	 */
	BundledTerminologyAxiom createBundledTerminologyAxiom();

	/**
	 * Returns a new object of class '<em>Concept Designation Terminology Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept Designation Terminology Axiom</em>'.
	 * @generated
	 */
	ConceptDesignationTerminologyAxiom createConceptDesignationTerminologyAxiom();

	/**
	 * Returns a new object of class '<em>Terminology Extension Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminology Extension Axiom</em>'.
	 * @generated
	 */
	TerminologyExtensionAxiom createTerminologyExtensionAxiom();

	/**
	 * Returns a new object of class '<em>Terminology Nesting Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminology Nesting Axiom</em>'.
	 * @generated
	 */
	TerminologyNestingAxiom createTerminologyNestingAxiom();

	/**
	 * Returns a new object of class '<em>Entity Existential Restriction Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Existential Restriction Axiom</em>'.
	 * @generated
	 */
	EntityExistentialRestrictionAxiom createEntityExistentialRestrictionAxiom();

	/**
	 * Returns a new object of class '<em>Entity Universal Restriction Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Universal Restriction Axiom</em>'.
	 * @generated
	 */
	EntityUniversalRestrictionAxiom createEntityUniversalRestrictionAxiom();

	/**
	 * Returns a new object of class '<em>Aspect Specialization Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aspect Specialization Axiom</em>'.
	 * @generated
	 */
	AspectSpecializationAxiom createAspectSpecializationAxiom();

	/**
	 * Returns a new object of class '<em>Concept Specialization Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept Specialization Axiom</em>'.
	 * @generated
	 */
	ConceptSpecializationAxiom createConceptSpecializationAxiom();

	/**
	 * Returns a new object of class '<em>Reified Relationship Specialization Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reified Relationship Specialization Axiom</em>'.
	 * @generated
	 */
	ReifiedRelationshipSpecializationAxiom createReifiedRelationshipSpecializationAxiom();

	/**
	 * Returns a new object of class '<em>Entity Scalar Data Property Existential Restriction Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Scalar Data Property Existential Restriction Axiom</em>'.
	 * @generated
	 */
	EntityScalarDataPropertyExistentialRestrictionAxiom createEntityScalarDataPropertyExistentialRestrictionAxiom();

	/**
	 * Returns a new object of class '<em>Entity Scalar Data Property Universal Restriction Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Scalar Data Property Universal Restriction Axiom</em>'.
	 * @generated
	 */
	EntityScalarDataPropertyUniversalRestrictionAxiom createEntityScalarDataPropertyUniversalRestrictionAxiom();

	/**
	 * Returns a new object of class '<em>Entity Scalar Data Property Particular Restriction Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Scalar Data Property Particular Restriction Axiom</em>'.
	 * @generated
	 */
	EntityScalarDataPropertyParticularRestrictionAxiom createEntityScalarDataPropertyParticularRestrictionAxiom();

	/**
	 * Returns a new object of class '<em>Binary Scalar Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Scalar Restriction</em>'.
	 * @generated
	 */
	BinaryScalarRestriction createBinaryScalarRestriction();

	/**
	 * Returns a new object of class '<em>IRI Scalar Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IRI Scalar Restriction</em>'.
	 * @generated
	 */
	IRIScalarRestriction createIRIScalarRestriction();

	/**
	 * Returns a new object of class '<em>Numeric Scalar Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric Scalar Restriction</em>'.
	 * @generated
	 */
	NumericScalarRestriction createNumericScalarRestriction();

	/**
	 * Returns a new object of class '<em>Plain Literal Scalar Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plain Literal Scalar Restriction</em>'.
	 * @generated
	 */
	PlainLiteralScalarRestriction createPlainLiteralScalarRestriction();

	/**
	 * Returns a new object of class '<em>String Scalar Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Scalar Restriction</em>'.
	 * @generated
	 */
	StringScalarRestriction createStringScalarRestriction();

	/**
	 * Returns a new object of class '<em>Time Scalar Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Scalar Restriction</em>'.
	 * @generated
	 */
	TimeScalarRestriction createTimeScalarRestriction();

	/**
	 * Returns a new object of class '<em>Synonym Scalar Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synonym Scalar Restriction</em>'.
	 * @generated
	 */
	SynonymScalarRestriction createSynonymScalarRestriction();

	/**
	 * Returns a new object of class '<em>Scalar One Of Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scalar One Of Restriction</em>'.
	 * @generated
	 */
	ScalarOneOfRestriction createScalarOneOfRestriction();

	/**
	 * Returns a new object of class '<em>Scalar One Of Literal Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scalar One Of Literal Axiom</em>'.
	 * @generated
	 */
	ScalarOneOfLiteralAxiom createScalarOneOfLiteralAxiom();

	/**
	 * Returns a new object of class '<em>Description Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Description Box</em>'.
	 * @generated
	 */
	DescriptionBox createDescriptionBox();

	/**
	 * Returns a new object of class '<em>Description Box Extends Closed World Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Description Box Extends Closed World Definitions</em>'.
	 * @generated
	 */
	DescriptionBoxExtendsClosedWorldDefinitions createDescriptionBoxExtendsClosedWorldDefinitions();

	/**
	 * Returns a new object of class '<em>Description Box Refinement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Description Box Refinement</em>'.
	 * @generated
	 */
	DescriptionBoxRefinement createDescriptionBoxRefinement();

	/**
	 * Returns a new object of class '<em>Scalar Data Property Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scalar Data Property Value</em>'.
	 * @generated
	 */
	ScalarDataPropertyValue createScalarDataPropertyValue();

	/**
	 * Returns a new object of class '<em>Structured Data Property Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structured Data Property Value</em>'.
	 * @generated
	 */
	StructuredDataPropertyValue createStructuredDataPropertyValue();

	/**
	 * Returns a new object of class '<em>Data Structure Tuple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Structure Tuple</em>'.
	 * @generated
	 */
	DataStructureTuple createDataStructureTuple();

	/**
	 * Returns a new object of class '<em>Concept Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept Instance</em>'.
	 * @generated
	 */
	ConceptInstance createConceptInstance();

	/**
	 * Returns a new object of class '<em>Reified Relationship Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reified Relationship Instance</em>'.
	 * @generated
	 */
	ReifiedRelationshipInstance createReifiedRelationshipInstance();

	/**
	 * Returns a new object of class '<em>Reified Relationship Instance Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reified Relationship Instance Domain</em>'.
	 * @generated
	 */
	ReifiedRelationshipInstanceDomain createReifiedRelationshipInstanceDomain();

	/**
	 * Returns a new object of class '<em>Reified Relationship Instance Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reified Relationship Instance Range</em>'.
	 * @generated
	 */
	ReifiedRelationshipInstanceRange createReifiedRelationshipInstanceRange();

	/**
	 * Returns a new object of class '<em>Unreified Relationship Instance Tuple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unreified Relationship Instance Tuple</em>'.
	 * @generated
	 */
	UnreifiedRelationshipInstanceTuple createUnreifiedRelationshipInstanceTuple();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EcorePackage getEcorePackage();

} //EcoreFactory
