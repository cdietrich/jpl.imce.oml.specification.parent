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
package jpl.imce.oml.specification.ecore.impl;

import java.util.Map;

import jpl.imce.oml.specification.ecore.*;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OMLFactoryImpl extends EFactoryImpl implements OMLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OMLFactory init() {
		try {
			OMLFactory theOMLFactory = (OMLFactory)EPackage.Registry.INSTANCE.getEFactory(OMLPackage.eNS_URI);
			if (theOMLFactory != null) {
				return theOMLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OMLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OMLPackage.ANNOTATION_PROPERTY: return (EObject)createAnnotationProperty();
			case OMLPackage.ANNOTATION_PROPERTY_TABLE: return (EObject)createAnnotationPropertyTable();
			case OMLPackage.ANNOTATION_ENTRY: return (EObject)createAnnotationEntry();
			case OMLPackage.ANNOTATION_SUBJECT_TABLE: return (EObject)createAnnotationSubjectTable();
			case OMLPackage.ANNOTATION_SUBJECT_PROPERTY_VALUE: return (EObject)createAnnotationSubjectPropertyValue();
			case OMLPackage.ANNOTATION: return (EObject)createAnnotation();
			case OMLPackage.TERMINOLOGY_EXTENT: return (EObject)createTerminologyExtent();
			case OMLPackage.BUNDLE: return (EObject)createBundle();
			case OMLPackage.TERMINOLOGY_GRAPH: return (EObject)createTerminologyGraph();
			case OMLPackage.ASPECT: return (EObject)createAspect();
			case OMLPackage.CONCEPT: return (EObject)createConcept();
			case OMLPackage.REIFIED_RELATIONSHIP: return (EObject)createReifiedRelationship();
			case OMLPackage.UNREIFIED_RELATIONSHIP: return (EObject)createUnreifiedRelationship();
			case OMLPackage.SCALAR: return (EObject)createScalar();
			case OMLPackage.ENTITY_STRUCTURED_DATA_PROPERTY: return (EObject)createEntityStructuredDataProperty();
			case OMLPackage.ENTITY_SCALAR_DATA_PROPERTY: return (EObject)createEntityScalarDataProperty();
			case OMLPackage.STRUCTURED_DATA_PROPERTY: return (EObject)createStructuredDataProperty();
			case OMLPackage.SCALAR_DATA_PROPERTY: return (EObject)createScalarDataProperty();
			case OMLPackage.STRUCTURE: return (EObject)createStructure();
			case OMLPackage.SPECIFIC_DISJOINT_CONCEPT_AXIOM: return (EObject)createSpecificDisjointConceptAxiom();
			case OMLPackage.ANONYMOUS_CONCEPT_TAXONOMY_AXIOM: return (EObject)createAnonymousConceptTaxonomyAxiom();
			case OMLPackage.ROOT_CONCEPT_TAXONOMY_AXIOM: return (EObject)createRootConceptTaxonomyAxiom();
			case OMLPackage.BUNDLED_TERMINOLOGY_AXIOM: return (EObject)createBundledTerminologyAxiom();
			case OMLPackage.CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM: return (EObject)createConceptDesignationTerminologyAxiom();
			case OMLPackage.TERMINOLOGY_EXTENSION_AXIOM: return (EObject)createTerminologyExtensionAxiom();
			case OMLPackage.TERMINOLOGY_NESTING_AXIOM: return (EObject)createTerminologyNestingAxiom();
			case OMLPackage.ENTITY_EXISTENTIAL_RESTRICTION_AXIOM: return (EObject)createEntityExistentialRestrictionAxiom();
			case OMLPackage.ENTITY_UNIVERSAL_RESTRICTION_AXIOM: return (EObject)createEntityUniversalRestrictionAxiom();
			case OMLPackage.ASPECT_SPECIALIZATION_AXIOM: return (EObject)createAspectSpecializationAxiom();
			case OMLPackage.CONCEPT_SPECIALIZATION_AXIOM: return (EObject)createConceptSpecializationAxiom();
			case OMLPackage.REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM: return (EObject)createReifiedRelationshipSpecializationAxiom();
			case OMLPackage.ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM: return (EObject)createEntityScalarDataPropertyExistentialRestrictionAxiom();
			case OMLPackage.ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM: return (EObject)createEntityScalarDataPropertyUniversalRestrictionAxiom();
			case OMLPackage.ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM: return (EObject)createEntityScalarDataPropertyParticularRestrictionAxiom();
			case OMLPackage.BINARY_SCALAR_RESTRICTION: return (EObject)createBinaryScalarRestriction();
			case OMLPackage.IRI_SCALAR_RESTRICTION: return (EObject)createIRIScalarRestriction();
			case OMLPackage.NUMERIC_SCALAR_RESTRICTION: return (EObject)createNumericScalarRestriction();
			case OMLPackage.PLAIN_LITERAL_SCALAR_RESTRICTION: return (EObject)createPlainLiteralScalarRestriction();
			case OMLPackage.STRING_SCALAR_RESTRICTION: return (EObject)createStringScalarRestriction();
			case OMLPackage.TIME_SCALAR_RESTRICTION: return (EObject)createTimeScalarRestriction();
			case OMLPackage.SYNONYM_SCALAR_RESTRICTION: return (EObject)createSynonymScalarRestriction();
			case OMLPackage.SCALAR_ONE_OF_RESTRICTION: return (EObject)createScalarOneOfRestriction();
			case OMLPackage.SCALAR_ONE_OF_LITERAL_AXIOM: return (EObject)createScalarOneOfLiteralAxiom();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OMLPackage.TERMINOLOGY_GRAPH_KIND:
				return createTerminologyGraphKindFromString(eDataType, initialValue);
			case OMLPackage.IRI:
				return createIRIFromString(eDataType, initialValue);
			case OMLPackage.LOCAL_NAME:
				return createLocalNameFromString(eDataType, initialValue);
			case OMLPackage.LEXICAL_VALUE:
				return createLexicalValueFromString(eDataType, initialValue);
			case OMLPackage.LEXICAL_NUMBER:
				return createLexicalNumberFromString(eDataType, initialValue);
			case OMLPackage.LEXICAL_TIME:
				return createLexicalTimeFromString(eDataType, initialValue);
			case OMLPackage.PATTERN:
				return createPatternFromString(eDataType, initialValue);
			case OMLPackage.UUID:
				return createUUIDFromString(eDataType, initialValue);
			case OMLPackage.LANGUAGE:
				return createLanguageFromString(eDataType, initialValue);
			case OMLPackage.ABBREV_IRI:
				return createAbbrevIRIFromString(eDataType, initialValue);
			case OMLPackage.NAMESPACE_PREFIX:
				return createNamespacePrefixFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OMLPackage.TERMINOLOGY_GRAPH_KIND:
				return convertTerminologyGraphKindToString(eDataType, instanceValue);
			case OMLPackage.IRI:
				return convertIRIToString(eDataType, instanceValue);
			case OMLPackage.LOCAL_NAME:
				return convertLocalNameToString(eDataType, instanceValue);
			case OMLPackage.LEXICAL_VALUE:
				return convertLexicalValueToString(eDataType, instanceValue);
			case OMLPackage.LEXICAL_NUMBER:
				return convertLexicalNumberToString(eDataType, instanceValue);
			case OMLPackage.LEXICAL_TIME:
				return convertLexicalTimeToString(eDataType, instanceValue);
			case OMLPackage.PATTERN:
				return convertPatternToString(eDataType, instanceValue);
			case OMLPackage.UUID:
				return convertUUIDToString(eDataType, instanceValue);
			case OMLPackage.LANGUAGE:
				return convertLanguageToString(eDataType, instanceValue);
			case OMLPackage.ABBREV_IRI:
				return convertAbbrevIRIToString(eDataType, instanceValue);
			case OMLPackage.NAMESPACE_PREFIX:
				return convertNamespacePrefixToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationProperty createAnnotationProperty() {
		AnnotationPropertyImpl annotationProperty = new AnnotationPropertyImpl();
		return annotationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<AnnotationProperty, EList<AnnotationEntry>> createAnnotationPropertyTable() {
		AnnotationPropertyTableImpl annotationPropertyTable = new AnnotationPropertyTableImpl();
		return annotationPropertyTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationEntry createAnnotationEntry() {
		AnnotationEntryImpl annotationEntry = new AnnotationEntryImpl();
		return annotationEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<TerminologyThing, EList<AnnotationSubjectPropertyValue>> createAnnotationSubjectTable() {
		AnnotationSubjectTableImpl annotationSubjectTable = new AnnotationSubjectTableImpl();
		return annotationSubjectTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationSubjectPropertyValue createAnnotationSubjectPropertyValue() {
		AnnotationSubjectPropertyValueImpl annotationSubjectPropertyValue = new AnnotationSubjectPropertyValueImpl();
		return annotationSubjectPropertyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyExtent createTerminologyExtent() {
		TerminologyExtentImpl terminologyExtent = new TerminologyExtentImpl();
		return terminologyExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bundle createBundle() {
		BundleImpl bundle = new BundleImpl();
		return bundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyGraph createTerminologyGraph() {
		TerminologyGraphImpl terminologyGraph = new TerminologyGraphImpl();
		return terminologyGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aspect createAspect() {
		AspectImpl aspect = new AspectImpl();
		return aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept createConcept() {
		ConceptImpl concept = new ConceptImpl();
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReifiedRelationship createReifiedRelationship() {
		ReifiedRelationshipImpl reifiedRelationship = new ReifiedRelationshipImpl();
		return reifiedRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnreifiedRelationship createUnreifiedRelationship() {
		UnreifiedRelationshipImpl unreifiedRelationship = new UnreifiedRelationshipImpl();
		return unreifiedRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scalar createScalar() {
		ScalarImpl scalar = new ScalarImpl();
		return scalar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityStructuredDataProperty createEntityStructuredDataProperty() {
		EntityStructuredDataPropertyImpl entityStructuredDataProperty = new EntityStructuredDataPropertyImpl();
		return entityStructuredDataProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityScalarDataProperty createEntityScalarDataProperty() {
		EntityScalarDataPropertyImpl entityScalarDataProperty = new EntityScalarDataPropertyImpl();
		return entityScalarDataProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredDataProperty createStructuredDataProperty() {
		StructuredDataPropertyImpl structuredDataProperty = new StructuredDataPropertyImpl();
		return structuredDataProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalarDataProperty createScalarDataProperty() {
		ScalarDataPropertyImpl scalarDataProperty = new ScalarDataPropertyImpl();
		return scalarDataProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure createStructure() {
		StructureImpl structure = new StructureImpl();
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificDisjointConceptAxiom createSpecificDisjointConceptAxiom() {
		SpecificDisjointConceptAxiomImpl specificDisjointConceptAxiom = new SpecificDisjointConceptAxiomImpl();
		return specificDisjointConceptAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymousConceptTaxonomyAxiom createAnonymousConceptTaxonomyAxiom() {
		AnonymousConceptTaxonomyAxiomImpl anonymousConceptTaxonomyAxiom = new AnonymousConceptTaxonomyAxiomImpl();
		return anonymousConceptTaxonomyAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootConceptTaxonomyAxiom createRootConceptTaxonomyAxiom() {
		RootConceptTaxonomyAxiomImpl rootConceptTaxonomyAxiom = new RootConceptTaxonomyAxiomImpl();
		return rootConceptTaxonomyAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundledTerminologyAxiom createBundledTerminologyAxiom() {
		BundledTerminologyAxiomImpl bundledTerminologyAxiom = new BundledTerminologyAxiomImpl();
		return bundledTerminologyAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptDesignationTerminologyAxiom createConceptDesignationTerminologyAxiom() {
		ConceptDesignationTerminologyAxiomImpl conceptDesignationTerminologyAxiom = new ConceptDesignationTerminologyAxiomImpl();
		return conceptDesignationTerminologyAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyExtensionAxiom createTerminologyExtensionAxiom() {
		TerminologyExtensionAxiomImpl terminologyExtensionAxiom = new TerminologyExtensionAxiomImpl();
		return terminologyExtensionAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyNestingAxiom createTerminologyNestingAxiom() {
		TerminologyNestingAxiomImpl terminologyNestingAxiom = new TerminologyNestingAxiomImpl();
		return terminologyNestingAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityExistentialRestrictionAxiom createEntityExistentialRestrictionAxiom() {
		EntityExistentialRestrictionAxiomImpl entityExistentialRestrictionAxiom = new EntityExistentialRestrictionAxiomImpl();
		return entityExistentialRestrictionAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityUniversalRestrictionAxiom createEntityUniversalRestrictionAxiom() {
		EntityUniversalRestrictionAxiomImpl entityUniversalRestrictionAxiom = new EntityUniversalRestrictionAxiomImpl();
		return entityUniversalRestrictionAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectSpecializationAxiom createAspectSpecializationAxiom() {
		AspectSpecializationAxiomImpl aspectSpecializationAxiom = new AspectSpecializationAxiomImpl();
		return aspectSpecializationAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptSpecializationAxiom createConceptSpecializationAxiom() {
		ConceptSpecializationAxiomImpl conceptSpecializationAxiom = new ConceptSpecializationAxiomImpl();
		return conceptSpecializationAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReifiedRelationshipSpecializationAxiom createReifiedRelationshipSpecializationAxiom() {
		ReifiedRelationshipSpecializationAxiomImpl reifiedRelationshipSpecializationAxiom = new ReifiedRelationshipSpecializationAxiomImpl();
		return reifiedRelationshipSpecializationAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityScalarDataPropertyExistentialRestrictionAxiom createEntityScalarDataPropertyExistentialRestrictionAxiom() {
		EntityScalarDataPropertyExistentialRestrictionAxiomImpl entityScalarDataPropertyExistentialRestrictionAxiom = new EntityScalarDataPropertyExistentialRestrictionAxiomImpl();
		return entityScalarDataPropertyExistentialRestrictionAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityScalarDataPropertyUniversalRestrictionAxiom createEntityScalarDataPropertyUniversalRestrictionAxiom() {
		EntityScalarDataPropertyUniversalRestrictionAxiomImpl entityScalarDataPropertyUniversalRestrictionAxiom = new EntityScalarDataPropertyUniversalRestrictionAxiomImpl();
		return entityScalarDataPropertyUniversalRestrictionAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityScalarDataPropertyParticularRestrictionAxiom createEntityScalarDataPropertyParticularRestrictionAxiom() {
		EntityScalarDataPropertyParticularRestrictionAxiomImpl entityScalarDataPropertyParticularRestrictionAxiom = new EntityScalarDataPropertyParticularRestrictionAxiomImpl();
		return entityScalarDataPropertyParticularRestrictionAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryScalarRestriction createBinaryScalarRestriction() {
		BinaryScalarRestrictionImpl binaryScalarRestriction = new BinaryScalarRestrictionImpl();
		return binaryScalarRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IRIScalarRestriction createIRIScalarRestriction() {
		IRIScalarRestrictionImpl iriScalarRestriction = new IRIScalarRestrictionImpl();
		return iriScalarRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericScalarRestriction createNumericScalarRestriction() {
		NumericScalarRestrictionImpl numericScalarRestriction = new NumericScalarRestrictionImpl();
		return numericScalarRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainLiteralScalarRestriction createPlainLiteralScalarRestriction() {
		PlainLiteralScalarRestrictionImpl plainLiteralScalarRestriction = new PlainLiteralScalarRestrictionImpl();
		return plainLiteralScalarRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringScalarRestriction createStringScalarRestriction() {
		StringScalarRestrictionImpl stringScalarRestriction = new StringScalarRestrictionImpl();
		return stringScalarRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeScalarRestriction createTimeScalarRestriction() {
		TimeScalarRestrictionImpl timeScalarRestriction = new TimeScalarRestrictionImpl();
		return timeScalarRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynonymScalarRestriction createSynonymScalarRestriction() {
		SynonymScalarRestrictionImpl synonymScalarRestriction = new SynonymScalarRestrictionImpl();
		return synonymScalarRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalarOneOfRestriction createScalarOneOfRestriction() {
		ScalarOneOfRestrictionImpl scalarOneOfRestriction = new ScalarOneOfRestrictionImpl();
		return scalarOneOfRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalarOneOfLiteralAxiom createScalarOneOfLiteralAxiom() {
		ScalarOneOfLiteralAxiomImpl scalarOneOfLiteralAxiom = new ScalarOneOfLiteralAxiomImpl();
		return scalarOneOfLiteralAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyGraphKind createTerminologyGraphKindFromString(EDataType eDataType, String initialValue) {
		TerminologyGraphKind result = TerminologyGraphKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTerminologyGraphKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIRIFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIRIToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLocalNameFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocalNameToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLexicalValueFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLexicalValueToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLexicalNumberFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLexicalNumberToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLexicalTimeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLexicalTimeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPatternFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPatternToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUUIDFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUUIDToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLanguageFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLanguageToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createAbbrevIRIFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAbbrevIRIToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNamespacePrefixFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNamespacePrefixToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMLPackage getOMLPackage() {
		return (OMLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OMLPackage getPackage() {
		return OMLPackage.eINSTANCE;
	}

} //OMLFactoryImpl
