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
package jpl.imce.oml.specification.ecore.util;

import java.util.Map;

import jpl.imce.oml.specification.ecore.*;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see jpl.imce.oml.specification.ecore.OMLPackage
 * @generated
 */
public class OMLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OMLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMLSwitch() {
		if (modelPackage == null) {
			modelPackage = OMLPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OMLPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.TERMINOLOGY_THING: {
				TerminologyThing terminologyThing = (TerminologyThing)theEObject;
				T result = caseTerminologyThing(terminologyThing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.ANNOTATION_PROPERTY: {
				AnnotationProperty annotationProperty = (AnnotationProperty)theEObject;
				T result = caseAnnotationProperty(annotationProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.ANNOTATION_PROPERTY_TABLE: {
				@SuppressWarnings("unchecked") Map.Entry<AnnotationProperty, EList<AnnotationEntry>> annotationPropertyTable = (Map.Entry<AnnotationProperty, EList<AnnotationEntry>>)theEObject;
				T result = caseAnnotationPropertyTable(annotationPropertyTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.ANNOTATION_ENTRY: {
				AnnotationEntry annotationEntry = (AnnotationEntry)theEObject;
				T result = caseAnnotationEntry(annotationEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.ANNOTATION_SUBJECT_TABLE: {
				@SuppressWarnings("unchecked") Map.Entry<TerminologyThing, EList<AnnotationSubjectPropertyValue>> annotationSubjectTable = (Map.Entry<TerminologyThing, EList<AnnotationSubjectPropertyValue>>)theEObject;
				T result = caseAnnotationSubjectTable(annotationSubjectTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.ANNOTATION_SUBJECT_PROPERTY_VALUE: {
				AnnotationSubjectPropertyValue annotationSubjectPropertyValue = (AnnotationSubjectPropertyValue)theEObject;
				T result = caseAnnotationSubjectPropertyValue(annotationSubjectPropertyValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.TERMINOLOGY_EXTENT: {
				TerminologyExtent terminologyExtent = (TerminologyExtent)theEObject;
				T result = caseTerminologyExtent(terminologyExtent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.TERMINOLOGY_BOX: {
				TerminologyBox terminologyBox = (TerminologyBox)theEObject;
				T result = caseTerminologyBox(terminologyBox);
				if (result == null) result = caseTerminologyThing(terminologyBox);
				if (result == null) result = caseResource(terminologyBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.BUNDLE: {
				Bundle bundle = (Bundle)theEObject;
				T result = caseBundle(bundle);
				if (result == null) result = caseTerminologyBox(bundle);
				if (result == null) result = caseTerminologyThing(bundle);
				if (result == null) result = caseResource(bundle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.TERMINOLOGY_GRAPH: {
				TerminologyGraph terminologyGraph = (TerminologyGraph)theEObject;
				T result = caseTerminologyGraph(terminologyGraph);
				if (result == null) result = caseTerminologyBox(terminologyGraph);
				if (result == null) result = caseTerminologyThing(terminologyGraph);
				if (result == null) result = caseResource(terminologyGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.TERMINOLOGY_STATEMENT: {
				TerminologyStatement terminologyStatement = (TerminologyStatement)theEObject;
				T result = caseTerminologyStatement(terminologyStatement);
				if (result == null) result = caseTerminologyThing(terminologyStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.TERMINOLOGY_BOX_STATEMENT: {
				TerminologyBoxStatement terminologyBoxStatement = (TerminologyBoxStatement)theEObject;
				T result = caseTerminologyBoxStatement(terminologyBoxStatement);
				if (result == null) result = caseTerminologyStatement(terminologyBoxStatement);
				if (result == null) result = caseTerminologyThing(terminologyBoxStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.TERMINOLOGY_BUNDLE_STATEMENT: {
				TerminologyBundleStatement terminologyBundleStatement = (TerminologyBundleStatement)theEObject;
				T result = caseTerminologyBundleStatement(terminologyBundleStatement);
				if (result == null) result = caseTerminologyStatement(terminologyBundleStatement);
				if (result == null) result = caseTerminologyThing(terminologyBundleStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.TERM: {
				Term term = (Term)theEObject;
				T result = caseTerm(term);
				if (result == null) result = caseTerminologyBoxStatement(term);
				if (result == null) result = caseResource(term);
				if (result == null) result = caseTerminologyStatement(term);
				if (result == null) result = caseTerminologyThing(term);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.UNARY_TERM_KIND: {
				UnaryTermKind unaryTermKind = (UnaryTermKind)theEObject;
				T result = caseUnaryTermKind(unaryTermKind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.DIRECTED_BINARY_RELATIONSHIP_KIND: {
				DirectedBinaryRelationshipKind directedBinaryRelationshipKind = (DirectedBinaryRelationshipKind)theEObject;
				T result = caseDirectedBinaryRelationshipKind(directedBinaryRelationshipKind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = caseTerm(entity);
				if (result == null) result = caseTerminologyBoxStatement(entity);
				if (result == null) result = caseResource(entity);
				if (result == null) result = caseTerminologyStatement(entity);
				if (result == null) result = caseTerminologyThing(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.ASPECT: {
				Aspect aspect = (Aspect)theEObject;
				T result = caseAspect(aspect);
				if (result == null) result = caseEntity(aspect);
				if (result == null) result = caseUnaryTermKind(aspect);
				if (result == null) result = caseTerm(aspect);
				if (result == null) result = caseTerminologyBoxStatement(aspect);
				if (result == null) result = caseResource(aspect);
				if (result == null) result = caseTerminologyStatement(aspect);
				if (result == null) result = caseTerminologyThing(aspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.CONCEPT: {
				Concept concept = (Concept)theEObject;
				T result = caseConcept(concept);
				if (result == null) result = caseEntity(concept);
				if (result == null) result = caseUnaryTermKind(concept);
				if (result == null) result = caseTerm(concept);
				if (result == null) result = caseTerminologyBoxStatement(concept);
				if (result == null) result = caseResource(concept);
				if (result == null) result = caseTerminologyStatement(concept);
				if (result == null) result = caseTerminologyThing(concept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.ENTITY_RELATIONSHIP: {
				EntityRelationship entityRelationship = (EntityRelationship)theEObject;
				T result = caseEntityRelationship(entityRelationship);
				if (result == null) result = caseTerm(entityRelationship);
				if (result == null) result = caseDirectedBinaryRelationshipKind(entityRelationship);
				if (result == null) result = caseTerminologyBoxStatement(entityRelationship);
				if (result == null) result = caseResource(entityRelationship);
				if (result == null) result = caseTerminologyStatement(entityRelationship);
				if (result == null) result = caseTerminologyThing(entityRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.REIFIED_RELATIONSHIP: {
				ReifiedRelationship reifiedRelationship = (ReifiedRelationship)theEObject;
				T result = caseReifiedRelationship(reifiedRelationship);
				if (result == null) result = caseEntityRelationship(reifiedRelationship);
				if (result == null) result = caseEntity(reifiedRelationship);
				if (result == null) result = caseTerm(reifiedRelationship);
				if (result == null) result = caseDirectedBinaryRelationshipKind(reifiedRelationship);
				if (result == null) result = caseTerminologyBoxStatement(reifiedRelationship);
				if (result == null) result = caseResource(reifiedRelationship);
				if (result == null) result = caseTerminologyStatement(reifiedRelationship);
				if (result == null) result = caseTerminologyThing(reifiedRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.UNREIFIED_RELATIONSHIP: {
				UnreifiedRelationship unreifiedRelationship = (UnreifiedRelationship)theEObject;
				T result = caseUnreifiedRelationship(unreifiedRelationship);
				if (result == null) result = caseEntityRelationship(unreifiedRelationship);
				if (result == null) result = caseTerm(unreifiedRelationship);
				if (result == null) result = caseDirectedBinaryRelationshipKind(unreifiedRelationship);
				if (result == null) result = caseTerminologyBoxStatement(unreifiedRelationship);
				if (result == null) result = caseResource(unreifiedRelationship);
				if (result == null) result = caseTerminologyStatement(unreifiedRelationship);
				if (result == null) result = caseTerminologyThing(unreifiedRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.DATATYPE: {
				Datatype datatype = (Datatype)theEObject;
				T result = caseDatatype(datatype);
				if (result == null) result = caseTerm(datatype);
				if (result == null) result = caseUnaryTermKind(datatype);
				if (result == null) result = caseTerminologyBoxStatement(datatype);
				if (result == null) result = caseResource(datatype);
				if (result == null) result = caseTerminologyStatement(datatype);
				if (result == null) result = caseTerminologyThing(datatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.DATA_RANGE: {
				DataRange dataRange = (DataRange)theEObject;
				T result = caseDataRange(dataRange);
				if (result == null) result = caseDatatype(dataRange);
				if (result == null) result = caseTerm(dataRange);
				if (result == null) result = caseUnaryTermKind(dataRange);
				if (result == null) result = caseTerminologyBoxStatement(dataRange);
				if (result == null) result = caseResource(dataRange);
				if (result == null) result = caseTerminologyStatement(dataRange);
				if (result == null) result = caseTerminologyThing(dataRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.SCALAR: {
				Scalar scalar = (Scalar)theEObject;
				T result = caseScalar(scalar);
				if (result == null) result = caseDataRange(scalar);
				if (result == null) result = caseDatatype(scalar);
				if (result == null) result = caseTerm(scalar);
				if (result == null) result = caseUnaryTermKind(scalar);
				if (result == null) result = caseTerminologyBoxStatement(scalar);
				if (result == null) result = caseResource(scalar);
				if (result == null) result = caseTerminologyStatement(scalar);
				if (result == null) result = caseTerminologyThing(scalar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.DATA_RELATIONSHIP: {
				DataRelationship dataRelationship = (DataRelationship)theEObject;
				T result = caseDataRelationship(dataRelationship);
				if (result == null) result = caseTerm(dataRelationship);
				if (result == null) result = caseDirectedBinaryRelationshipKind(dataRelationship);
				if (result == null) result = caseTerminologyBoxStatement(dataRelationship);
				if (result == null) result = caseResource(dataRelationship);
				if (result == null) result = caseTerminologyStatement(dataRelationship);
				if (result == null) result = caseTerminologyThing(dataRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.DATA_RELATIONSHIP_DOMAIN: {
				DataRelationshipDomain dataRelationshipDomain = (DataRelationshipDomain)theEObject;
				T result = caseDataRelationshipDomain(dataRelationshipDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.DATA_RELATIONSHIP_FROM_ENTITY: {
				DataRelationshipFromEntity dataRelationshipFromEntity = (DataRelationshipFromEntity)theEObject;
				T result = caseDataRelationshipFromEntity(dataRelationshipFromEntity);
				if (result == null) result = caseDataRelationshipDomain(dataRelationshipFromEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.DATA_RELATIONSHIP_FROM_STRUCTURE: {
				DataRelationshipFromStructure dataRelationshipFromStructure = (DataRelationshipFromStructure)theEObject;
				T result = caseDataRelationshipFromStructure(dataRelationshipFromStructure);
				if (result == null) result = caseDataRelationshipDomain(dataRelationshipFromStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.DATA_RELATIONSHIP_RANGE: {
				DataRelationshipRange dataRelationshipRange = (DataRelationshipRange)theEObject;
				T result = caseDataRelationshipRange(dataRelationshipRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.DATA_RELATIONSHIP_TO_SCALAR: {
				DataRelationshipToScalar dataRelationshipToScalar = (DataRelationshipToScalar)theEObject;
				T result = caseDataRelationshipToScalar(dataRelationshipToScalar);
				if (result == null) result = caseDataRelationshipRange(dataRelationshipToScalar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.DATA_RELATIONSHIP_TO_STRUCTURE: {
				DataRelationshipToStructure dataRelationshipToStructure = (DataRelationshipToStructure)theEObject;
				T result = caseDataRelationshipToStructure(dataRelationshipToStructure);
				if (result == null) result = caseDataRelationshipRange(dataRelationshipToStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.ENTITY_STRUCTURED_DATA_PROPERTY: {
				EntityStructuredDataProperty entityStructuredDataProperty = (EntityStructuredDataProperty)theEObject;
				T result = caseEntityStructuredDataProperty(entityStructuredDataProperty);
				if (result == null) result = caseDataRelationship(entityStructuredDataProperty);
				if (result == null) result = caseDataRelationshipFromEntity(entityStructuredDataProperty);
				if (result == null) result = caseDataRelationshipToStructure(entityStructuredDataProperty);
				if (result == null) result = caseTerm(entityStructuredDataProperty);
				if (result == null) result = caseDirectedBinaryRelationshipKind(entityStructuredDataProperty);
				if (result == null) result = caseDataRelationshipDomain(entityStructuredDataProperty);
				if (result == null) result = caseDataRelationshipRange(entityStructuredDataProperty);
				if (result == null) result = caseTerminologyBoxStatement(entityStructuredDataProperty);
				if (result == null) result = caseResource(entityStructuredDataProperty);
				if (result == null) result = caseTerminologyStatement(entityStructuredDataProperty);
				if (result == null) result = caseTerminologyThing(entityStructuredDataProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.ENTITY_SCALAR_DATA_PROPERTY: {
				EntityScalarDataProperty entityScalarDataProperty = (EntityScalarDataProperty)theEObject;
				T result = caseEntityScalarDataProperty(entityScalarDataProperty);
				if (result == null) result = caseDataRelationship(entityScalarDataProperty);
				if (result == null) result = caseDataRelationshipFromEntity(entityScalarDataProperty);
				if (result == null) result = caseDataRelationshipToScalar(entityScalarDataProperty);
				if (result == null) result = caseTerm(entityScalarDataProperty);
				if (result == null) result = caseDirectedBinaryRelationshipKind(entityScalarDataProperty);
				if (result == null) result = caseDataRelationshipDomain(entityScalarDataProperty);
				if (result == null) result = caseDataRelationshipRange(entityScalarDataProperty);
				if (result == null) result = caseTerminologyBoxStatement(entityScalarDataProperty);
				if (result == null) result = caseResource(entityScalarDataProperty);
				if (result == null) result = caseTerminologyStatement(entityScalarDataProperty);
				if (result == null) result = caseTerminologyThing(entityScalarDataProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.STRUCTURED_DATA_PROPERTY: {
				StructuredDataProperty structuredDataProperty = (StructuredDataProperty)theEObject;
				T result = caseStructuredDataProperty(structuredDataProperty);
				if (result == null) result = caseDataRelationship(structuredDataProperty);
				if (result == null) result = caseDataRelationshipFromStructure(structuredDataProperty);
				if (result == null) result = caseDataRelationshipToStructure(structuredDataProperty);
				if (result == null) result = caseTerm(structuredDataProperty);
				if (result == null) result = caseDirectedBinaryRelationshipKind(structuredDataProperty);
				if (result == null) result = caseDataRelationshipDomain(structuredDataProperty);
				if (result == null) result = caseDataRelationshipRange(structuredDataProperty);
				if (result == null) result = caseTerminologyBoxStatement(structuredDataProperty);
				if (result == null) result = caseResource(structuredDataProperty);
				if (result == null) result = caseTerminologyStatement(structuredDataProperty);
				if (result == null) result = caseTerminologyThing(structuredDataProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.SCALAR_DATA_PROPERTY: {
				ScalarDataProperty scalarDataProperty = (ScalarDataProperty)theEObject;
				T result = caseScalarDataProperty(scalarDataProperty);
				if (result == null) result = caseDataRelationship(scalarDataProperty);
				if (result == null) result = caseDataRelationshipFromStructure(scalarDataProperty);
				if (result == null) result = caseDataRelationshipToScalar(scalarDataProperty);
				if (result == null) result = caseTerm(scalarDataProperty);
				if (result == null) result = caseDirectedBinaryRelationshipKind(scalarDataProperty);
				if (result == null) result = caseDataRelationshipDomain(scalarDataProperty);
				if (result == null) result = caseDataRelationshipRange(scalarDataProperty);
				if (result == null) result = caseTerminologyBoxStatement(scalarDataProperty);
				if (result == null) result = caseResource(scalarDataProperty);
				if (result == null) result = caseTerminologyStatement(scalarDataProperty);
				if (result == null) result = caseTerminologyThing(scalarDataProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.STRUCTURE: {
				Structure structure = (Structure)theEObject;
				T result = caseStructure(structure);
				if (result == null) result = caseDatatype(structure);
				if (result == null) result = caseTerm(structure);
				if (result == null) result = caseUnaryTermKind(structure);
				if (result == null) result = caseTerminologyBoxStatement(structure);
				if (result == null) result = caseResource(structure);
				if (result == null) result = caseTerminologyStatement(structure);
				if (result == null) result = caseTerminologyThing(structure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.AXIOM: {
				Axiom axiom = (Axiom)theEObject;
				T result = caseAxiom(axiom);
				if (result == null) result = caseTerminologyBoxStatement(axiom);
				if (result == null) result = caseTerminologyStatement(axiom);
				if (result == null) result = caseTerminologyThing(axiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.TERMINOLOGY_AXIOM: {
				TerminologyAxiom terminologyAxiom = (TerminologyAxiom)theEObject;
				T result = caseTerminologyAxiom(terminologyAxiom);
				if (result == null) result = caseTerminologyThing(terminologyAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.TERMINOLOGY_BOX_AXIOM: {
				TerminologyBoxAxiom terminologyBoxAxiom = (TerminologyBoxAxiom)theEObject;
				T result = caseTerminologyBoxAxiom(terminologyBoxAxiom);
				if (result == null) result = caseTerminologyAxiom(terminologyBoxAxiom);
				if (result == null) result = caseTerminologyThing(terminologyBoxAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.TERMINOLOGY_BUNDLE_AXIOM: {
				TerminologyBundleAxiom terminologyBundleAxiom = (TerminologyBundleAxiom)theEObject;
				T result = caseTerminologyBundleAxiom(terminologyBundleAxiom);
				if (result == null) result = caseTerminologyAxiom(terminologyBundleAxiom);
				if (result == null) result = caseTerminologyThing(terminologyBundleAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.CONCEPT_TREE_DISJUNCTION: {
				ConceptTreeDisjunction conceptTreeDisjunction = (ConceptTreeDisjunction)theEObject;
				T result = caseConceptTreeDisjunction(conceptTreeDisjunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.DISJOINT_UNION_OF_CONCEPTS_AXIOM: {
				DisjointUnionOfConceptsAxiom disjointUnionOfConceptsAxiom = (DisjointUnionOfConceptsAxiom)theEObject;
				T result = caseDisjointUnionOfConceptsAxiom(disjointUnionOfConceptsAxiom);
				if (result == null) result = caseTerminologyBundleStatement(disjointUnionOfConceptsAxiom);
				if (result == null) result = caseTerminologyStatement(disjointUnionOfConceptsAxiom);
				if (result == null) result = caseTerminologyThing(disjointUnionOfConceptsAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.SPECIFIC_DISJOINT_CONCEPT_AXIOM: {
				SpecificDisjointConceptAxiom specificDisjointConceptAxiom = (SpecificDisjointConceptAxiom)theEObject;
				T result = caseSpecificDisjointConceptAxiom(specificDisjointConceptAxiom);
				if (result == null) result = caseDisjointUnionOfConceptsAxiom(specificDisjointConceptAxiom);
				if (result == null) result = caseTerminologyBundleStatement(specificDisjointConceptAxiom);
				if (result == null) result = caseTerminologyStatement(specificDisjointConceptAxiom);
				if (result == null) result = caseTerminologyThing(specificDisjointConceptAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.ANONYMOUS_CONCEPT_TAXONOMY_AXIOM: {
				AnonymousConceptTaxonomyAxiom anonymousConceptTaxonomyAxiom = (AnonymousConceptTaxonomyAxiom)theEObject;
				T result = caseAnonymousConceptTaxonomyAxiom(anonymousConceptTaxonomyAxiom);
				if (result == null) result = caseDisjointUnionOfConceptsAxiom(anonymousConceptTaxonomyAxiom);
				if (result == null) result = caseConceptTreeDisjunction(anonymousConceptTaxonomyAxiom);
				if (result == null) result = caseTerminologyBundleStatement(anonymousConceptTaxonomyAxiom);
				if (result == null) result = caseTerminologyStatement(anonymousConceptTaxonomyAxiom);
				if (result == null) result = caseTerminologyThing(anonymousConceptTaxonomyAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.ROOT_CONCEPT_TAXONOMY_AXIOM: {
				RootConceptTaxonomyAxiom rootConceptTaxonomyAxiom = (RootConceptTaxonomyAxiom)theEObject;
				T result = caseRootConceptTaxonomyAxiom(rootConceptTaxonomyAxiom);
				if (result == null) result = caseTerminologyBundleStatement(rootConceptTaxonomyAxiom);
				if (result == null) result = caseConceptTreeDisjunction(rootConceptTaxonomyAxiom);
				if (result == null) result = caseTerminologyStatement(rootConceptTaxonomyAxiom);
				if (result == null) result = caseTerminologyThing(rootConceptTaxonomyAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.BUNDLED_TERMINOLOGY_AXIOM: {
				BundledTerminologyAxiom bundledTerminologyAxiom = (BundledTerminologyAxiom)theEObject;
				T result = caseBundledTerminologyAxiom(bundledTerminologyAxiom);
				if (result == null) result = caseTerminologyBundleAxiom(bundledTerminologyAxiom);
				if (result == null) result = caseTerminologyAxiom(bundledTerminologyAxiom);
				if (result == null) result = caseTerminologyThing(bundledTerminologyAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM: {
				ConceptDesignationTerminologyAxiom conceptDesignationTerminologyAxiom = (ConceptDesignationTerminologyAxiom)theEObject;
				T result = caseConceptDesignationTerminologyAxiom(conceptDesignationTerminologyAxiom);
				if (result == null) result = caseTerminologyBoxAxiom(conceptDesignationTerminologyAxiom);
				if (result == null) result = caseTerminologyAxiom(conceptDesignationTerminologyAxiom);
				if (result == null) result = caseTerminologyThing(conceptDesignationTerminologyAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.TERMINOLOGY_EXTENSION_AXIOM: {
				TerminologyExtensionAxiom terminologyExtensionAxiom = (TerminologyExtensionAxiom)theEObject;
				T result = caseTerminologyExtensionAxiom(terminologyExtensionAxiom);
				if (result == null) result = caseTerminologyBoxAxiom(terminologyExtensionAxiom);
				if (result == null) result = caseTerminologyAxiom(terminologyExtensionAxiom);
				if (result == null) result = caseTerminologyThing(terminologyExtensionAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.TERMINOLOGY_NESTING_AXIOM: {
				TerminologyNestingAxiom terminologyNestingAxiom = (TerminologyNestingAxiom)theEObject;
				T result = caseTerminologyNestingAxiom(terminologyNestingAxiom);
				if (result == null) result = caseTerminologyBoxAxiom(terminologyNestingAxiom);
				if (result == null) result = caseTerminologyAxiom(terminologyNestingAxiom);
				if (result == null) result = caseTerminologyThing(terminologyNestingAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.TERM_AXIOM: {
				TermAxiom termAxiom = (TermAxiom)theEObject;
				T result = caseTermAxiom(termAxiom);
				if (result == null) result = caseAxiom(termAxiom);
				if (result == null) result = caseTerminologyBoxStatement(termAxiom);
				if (result == null) result = caseTerminologyStatement(termAxiom);
				if (result == null) result = caseTerminologyThing(termAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.ENTITY_RESTRICTION_AXIOM: {
				EntityRestrictionAxiom entityRestrictionAxiom = (EntityRestrictionAxiom)theEObject;
				T result = caseEntityRestrictionAxiom(entityRestrictionAxiom);
				if (result == null) result = caseTermAxiom(entityRestrictionAxiom);
				if (result == null) result = caseAxiom(entityRestrictionAxiom);
				if (result == null) result = caseTerminologyBoxStatement(entityRestrictionAxiom);
				if (result == null) result = caseTerminologyStatement(entityRestrictionAxiom);
				if (result == null) result = caseTerminologyThing(entityRestrictionAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.ENTITY_EXISTENTIAL_RESTRICTION_AXIOM: {
				EntityExistentialRestrictionAxiom entityExistentialRestrictionAxiom = (EntityExistentialRestrictionAxiom)theEObject;
				T result = caseEntityExistentialRestrictionAxiom(entityExistentialRestrictionAxiom);
				if (result == null) result = caseEntityRestrictionAxiom(entityExistentialRestrictionAxiom);
				if (result == null) result = caseTermAxiom(entityExistentialRestrictionAxiom);
				if (result == null) result = caseAxiom(entityExistentialRestrictionAxiom);
				if (result == null) result = caseTerminologyBoxStatement(entityExistentialRestrictionAxiom);
				if (result == null) result = caseTerminologyStatement(entityExistentialRestrictionAxiom);
				if (result == null) result = caseTerminologyThing(entityExistentialRestrictionAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.ENTITY_UNIVERSAL_RESTRICTION_AXIOM: {
				EntityUniversalRestrictionAxiom entityUniversalRestrictionAxiom = (EntityUniversalRestrictionAxiom)theEObject;
				T result = caseEntityUniversalRestrictionAxiom(entityUniversalRestrictionAxiom);
				if (result == null) result = caseEntityRestrictionAxiom(entityUniversalRestrictionAxiom);
				if (result == null) result = caseTermAxiom(entityUniversalRestrictionAxiom);
				if (result == null) result = caseAxiom(entityUniversalRestrictionAxiom);
				if (result == null) result = caseTerminologyBoxStatement(entityUniversalRestrictionAxiom);
				if (result == null) result = caseTerminologyStatement(entityUniversalRestrictionAxiom);
				if (result == null) result = caseTerminologyThing(entityUniversalRestrictionAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.SPECIALIZATION_AXIOM: {
				SpecializationAxiom specializationAxiom = (SpecializationAxiom)theEObject;
				T result = caseSpecializationAxiom(specializationAxiom);
				if (result == null) result = caseTermAxiom(specializationAxiom);
				if (result == null) result = caseAxiom(specializationAxiom);
				if (result == null) result = caseTerminologyBoxStatement(specializationAxiom);
				if (result == null) result = caseTerminologyStatement(specializationAxiom);
				if (result == null) result = caseTerminologyThing(specializationAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.ASPECT_SPECIALIZATION_AXIOM: {
				AspectSpecializationAxiom aspectSpecializationAxiom = (AspectSpecializationAxiom)theEObject;
				T result = caseAspectSpecializationAxiom(aspectSpecializationAxiom);
				if (result == null) result = caseSpecializationAxiom(aspectSpecializationAxiom);
				if (result == null) result = caseTermAxiom(aspectSpecializationAxiom);
				if (result == null) result = caseAxiom(aspectSpecializationAxiom);
				if (result == null) result = caseTerminologyBoxStatement(aspectSpecializationAxiom);
				if (result == null) result = caseTerminologyStatement(aspectSpecializationAxiom);
				if (result == null) result = caseTerminologyThing(aspectSpecializationAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.CONCEPT_SPECIALIZATION_AXIOM: {
				ConceptSpecializationAxiom conceptSpecializationAxiom = (ConceptSpecializationAxiom)theEObject;
				T result = caseConceptSpecializationAxiom(conceptSpecializationAxiom);
				if (result == null) result = caseSpecializationAxiom(conceptSpecializationAxiom);
				if (result == null) result = caseTermAxiom(conceptSpecializationAxiom);
				if (result == null) result = caseAxiom(conceptSpecializationAxiom);
				if (result == null) result = caseTerminologyBoxStatement(conceptSpecializationAxiom);
				if (result == null) result = caseTerminologyStatement(conceptSpecializationAxiom);
				if (result == null) result = caseTerminologyThing(conceptSpecializationAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM: {
				ReifiedRelationshipSpecializationAxiom reifiedRelationshipSpecializationAxiom = (ReifiedRelationshipSpecializationAxiom)theEObject;
				T result = caseReifiedRelationshipSpecializationAxiom(reifiedRelationshipSpecializationAxiom);
				if (result == null) result = caseSpecializationAxiom(reifiedRelationshipSpecializationAxiom);
				if (result == null) result = caseTermAxiom(reifiedRelationshipSpecializationAxiom);
				if (result == null) result = caseAxiom(reifiedRelationshipSpecializationAxiom);
				if (result == null) result = caseTerminologyBoxStatement(reifiedRelationshipSpecializationAxiom);
				if (result == null) result = caseTerminologyStatement(reifiedRelationshipSpecializationAxiom);
				if (result == null) result = caseTerminologyThing(reifiedRelationshipSpecializationAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM: {
				EntityScalarDataPropertyRestrictionAxiom entityScalarDataPropertyRestrictionAxiom = (EntityScalarDataPropertyRestrictionAxiom)theEObject;
				T result = caseEntityScalarDataPropertyRestrictionAxiom(entityScalarDataPropertyRestrictionAxiom);
				if (result == null) result = caseTermAxiom(entityScalarDataPropertyRestrictionAxiom);
				if (result == null) result = caseAxiom(entityScalarDataPropertyRestrictionAxiom);
				if (result == null) result = caseTerminologyBoxStatement(entityScalarDataPropertyRestrictionAxiom);
				if (result == null) result = caseTerminologyStatement(entityScalarDataPropertyRestrictionAxiom);
				if (result == null) result = caseTerminologyThing(entityScalarDataPropertyRestrictionAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM: {
				EntityScalarDataPropertyExistentialRestrictionAxiom entityScalarDataPropertyExistentialRestrictionAxiom = (EntityScalarDataPropertyExistentialRestrictionAxiom)theEObject;
				T result = caseEntityScalarDataPropertyExistentialRestrictionAxiom(entityScalarDataPropertyExistentialRestrictionAxiom);
				if (result == null) result = caseEntityScalarDataPropertyRestrictionAxiom(entityScalarDataPropertyExistentialRestrictionAxiom);
				if (result == null) result = caseTermAxiom(entityScalarDataPropertyExistentialRestrictionAxiom);
				if (result == null) result = caseAxiom(entityScalarDataPropertyExistentialRestrictionAxiom);
				if (result == null) result = caseTerminologyBoxStatement(entityScalarDataPropertyExistentialRestrictionAxiom);
				if (result == null) result = caseTerminologyStatement(entityScalarDataPropertyExistentialRestrictionAxiom);
				if (result == null) result = caseTerminologyThing(entityScalarDataPropertyExistentialRestrictionAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM: {
				EntityScalarDataPropertyUniversalRestrictionAxiom entityScalarDataPropertyUniversalRestrictionAxiom = (EntityScalarDataPropertyUniversalRestrictionAxiom)theEObject;
				T result = caseEntityScalarDataPropertyUniversalRestrictionAxiom(entityScalarDataPropertyUniversalRestrictionAxiom);
				if (result == null) result = caseEntityScalarDataPropertyRestrictionAxiom(entityScalarDataPropertyUniversalRestrictionAxiom);
				if (result == null) result = caseTermAxiom(entityScalarDataPropertyUniversalRestrictionAxiom);
				if (result == null) result = caseAxiom(entityScalarDataPropertyUniversalRestrictionAxiom);
				if (result == null) result = caseTerminologyBoxStatement(entityScalarDataPropertyUniversalRestrictionAxiom);
				if (result == null) result = caseTerminologyStatement(entityScalarDataPropertyUniversalRestrictionAxiom);
				if (result == null) result = caseTerminologyThing(entityScalarDataPropertyUniversalRestrictionAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM: {
				EntityScalarDataPropertyParticularRestrictionAxiom entityScalarDataPropertyParticularRestrictionAxiom = (EntityScalarDataPropertyParticularRestrictionAxiom)theEObject;
				T result = caseEntityScalarDataPropertyParticularRestrictionAxiom(entityScalarDataPropertyParticularRestrictionAxiom);
				if (result == null) result = caseEntityScalarDataPropertyRestrictionAxiom(entityScalarDataPropertyParticularRestrictionAxiom);
				if (result == null) result = caseTermAxiom(entityScalarDataPropertyParticularRestrictionAxiom);
				if (result == null) result = caseAxiom(entityScalarDataPropertyParticularRestrictionAxiom);
				if (result == null) result = caseTerminologyBoxStatement(entityScalarDataPropertyParticularRestrictionAxiom);
				if (result == null) result = caseTerminologyStatement(entityScalarDataPropertyParticularRestrictionAxiom);
				if (result == null) result = caseTerminologyThing(entityScalarDataPropertyParticularRestrictionAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.RESTRICTED_DATA_RANGE: {
				RestrictedDataRange restrictedDataRange = (RestrictedDataRange)theEObject;
				T result = caseRestrictedDataRange(restrictedDataRange);
				if (result == null) result = caseDataRange(restrictedDataRange);
				if (result == null) result = caseDatatype(restrictedDataRange);
				if (result == null) result = caseTerm(restrictedDataRange);
				if (result == null) result = caseUnaryTermKind(restrictedDataRange);
				if (result == null) result = caseTerminologyBoxStatement(restrictedDataRange);
				if (result == null) result = caseResource(restrictedDataRange);
				if (result == null) result = caseTerminologyStatement(restrictedDataRange);
				if (result == null) result = caseTerminologyThing(restrictedDataRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.BINARY_SCALAR_RESTRICTION: {
				BinaryScalarRestriction binaryScalarRestriction = (BinaryScalarRestriction)theEObject;
				T result = caseBinaryScalarRestriction(binaryScalarRestriction);
				if (result == null) result = caseRestrictedDataRange(binaryScalarRestriction);
				if (result == null) result = caseDataRange(binaryScalarRestriction);
				if (result == null) result = caseDatatype(binaryScalarRestriction);
				if (result == null) result = caseTerm(binaryScalarRestriction);
				if (result == null) result = caseUnaryTermKind(binaryScalarRestriction);
				if (result == null) result = caseTerminologyBoxStatement(binaryScalarRestriction);
				if (result == null) result = caseResource(binaryScalarRestriction);
				if (result == null) result = caseTerminologyStatement(binaryScalarRestriction);
				if (result == null) result = caseTerminologyThing(binaryScalarRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.IRI_SCALAR_RESTRICTION: {
				IRIScalarRestriction iriScalarRestriction = (IRIScalarRestriction)theEObject;
				T result = caseIRIScalarRestriction(iriScalarRestriction);
				if (result == null) result = caseRestrictedDataRange(iriScalarRestriction);
				if (result == null) result = caseDataRange(iriScalarRestriction);
				if (result == null) result = caseDatatype(iriScalarRestriction);
				if (result == null) result = caseTerm(iriScalarRestriction);
				if (result == null) result = caseUnaryTermKind(iriScalarRestriction);
				if (result == null) result = caseTerminologyBoxStatement(iriScalarRestriction);
				if (result == null) result = caseResource(iriScalarRestriction);
				if (result == null) result = caseTerminologyStatement(iriScalarRestriction);
				if (result == null) result = caseTerminologyThing(iriScalarRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.NUMERIC_SCALAR_RESTRICTION: {
				NumericScalarRestriction numericScalarRestriction = (NumericScalarRestriction)theEObject;
				T result = caseNumericScalarRestriction(numericScalarRestriction);
				if (result == null) result = caseRestrictedDataRange(numericScalarRestriction);
				if (result == null) result = caseDataRange(numericScalarRestriction);
				if (result == null) result = caseDatatype(numericScalarRestriction);
				if (result == null) result = caseTerm(numericScalarRestriction);
				if (result == null) result = caseUnaryTermKind(numericScalarRestriction);
				if (result == null) result = caseTerminologyBoxStatement(numericScalarRestriction);
				if (result == null) result = caseResource(numericScalarRestriction);
				if (result == null) result = caseTerminologyStatement(numericScalarRestriction);
				if (result == null) result = caseTerminologyThing(numericScalarRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.PLAIN_LITERAL_SCALAR_RESTRICTION: {
				PlainLiteralScalarRestriction plainLiteralScalarRestriction = (PlainLiteralScalarRestriction)theEObject;
				T result = casePlainLiteralScalarRestriction(plainLiteralScalarRestriction);
				if (result == null) result = caseRestrictedDataRange(plainLiteralScalarRestriction);
				if (result == null) result = caseDataRange(plainLiteralScalarRestriction);
				if (result == null) result = caseDatatype(plainLiteralScalarRestriction);
				if (result == null) result = caseTerm(plainLiteralScalarRestriction);
				if (result == null) result = caseUnaryTermKind(plainLiteralScalarRestriction);
				if (result == null) result = caseTerminologyBoxStatement(plainLiteralScalarRestriction);
				if (result == null) result = caseResource(plainLiteralScalarRestriction);
				if (result == null) result = caseTerminologyStatement(plainLiteralScalarRestriction);
				if (result == null) result = caseTerminologyThing(plainLiteralScalarRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.STRING_SCALAR_RESTRICTION: {
				StringScalarRestriction stringScalarRestriction = (StringScalarRestriction)theEObject;
				T result = caseStringScalarRestriction(stringScalarRestriction);
				if (result == null) result = caseRestrictedDataRange(stringScalarRestriction);
				if (result == null) result = caseDataRange(stringScalarRestriction);
				if (result == null) result = caseDatatype(stringScalarRestriction);
				if (result == null) result = caseTerm(stringScalarRestriction);
				if (result == null) result = caseUnaryTermKind(stringScalarRestriction);
				if (result == null) result = caseTerminologyBoxStatement(stringScalarRestriction);
				if (result == null) result = caseResource(stringScalarRestriction);
				if (result == null) result = caseTerminologyStatement(stringScalarRestriction);
				if (result == null) result = caseTerminologyThing(stringScalarRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.TIME_SCALAR_RESTRICTION: {
				TimeScalarRestriction timeScalarRestriction = (TimeScalarRestriction)theEObject;
				T result = caseTimeScalarRestriction(timeScalarRestriction);
				if (result == null) result = caseRestrictedDataRange(timeScalarRestriction);
				if (result == null) result = caseDataRange(timeScalarRestriction);
				if (result == null) result = caseDatatype(timeScalarRestriction);
				if (result == null) result = caseTerm(timeScalarRestriction);
				if (result == null) result = caseUnaryTermKind(timeScalarRestriction);
				if (result == null) result = caseTerminologyBoxStatement(timeScalarRestriction);
				if (result == null) result = caseResource(timeScalarRestriction);
				if (result == null) result = caseTerminologyStatement(timeScalarRestriction);
				if (result == null) result = caseTerminologyThing(timeScalarRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.SYNONYM_SCALAR_RESTRICTION: {
				SynonymScalarRestriction synonymScalarRestriction = (SynonymScalarRestriction)theEObject;
				T result = caseSynonymScalarRestriction(synonymScalarRestriction);
				if (result == null) result = caseRestrictedDataRange(synonymScalarRestriction);
				if (result == null) result = caseDataRange(synonymScalarRestriction);
				if (result == null) result = caseDatatype(synonymScalarRestriction);
				if (result == null) result = caseTerm(synonymScalarRestriction);
				if (result == null) result = caseUnaryTermKind(synonymScalarRestriction);
				if (result == null) result = caseTerminologyBoxStatement(synonymScalarRestriction);
				if (result == null) result = caseResource(synonymScalarRestriction);
				if (result == null) result = caseTerminologyStatement(synonymScalarRestriction);
				if (result == null) result = caseTerminologyThing(synonymScalarRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.SCALAR_ONE_OF_RESTRICTION: {
				ScalarOneOfRestriction scalarOneOfRestriction = (ScalarOneOfRestriction)theEObject;
				T result = caseScalarOneOfRestriction(scalarOneOfRestriction);
				if (result == null) result = caseRestrictedDataRange(scalarOneOfRestriction);
				if (result == null) result = caseDataRange(scalarOneOfRestriction);
				if (result == null) result = caseDatatype(scalarOneOfRestriction);
				if (result == null) result = caseTerm(scalarOneOfRestriction);
				if (result == null) result = caseUnaryTermKind(scalarOneOfRestriction);
				if (result == null) result = caseTerminologyBoxStatement(scalarOneOfRestriction);
				if (result == null) result = caseResource(scalarOneOfRestriction);
				if (result == null) result = caseTerminologyStatement(scalarOneOfRestriction);
				if (result == null) result = caseTerminologyThing(scalarOneOfRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMLPackage.SCALAR_ONE_OF_LITERAL_AXIOM: {
				ScalarOneOfLiteralAxiom scalarOneOfLiteralAxiom = (ScalarOneOfLiteralAxiom)theEObject;
				T result = caseScalarOneOfLiteralAxiom(scalarOneOfLiteralAxiom);
				if (result == null) result = caseAxiom(scalarOneOfLiteralAxiom);
				if (result == null) result = caseTerminologyBoxStatement(scalarOneOfLiteralAxiom);
				if (result == null) result = caseTerminologyStatement(scalarOneOfLiteralAxiom);
				if (result == null) result = caseTerminologyThing(scalarOneOfLiteralAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyThing(TerminologyThing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationProperty(AnnotationProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Property Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Property Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationPropertyTable(Map.Entry<AnnotationProperty, EList<AnnotationEntry>> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationEntry(AnnotationEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Subject Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Subject Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationSubjectTable(Map.Entry<TerminologyThing, EList<AnnotationSubjectPropertyValue>> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Subject Property Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Subject Property Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationSubjectPropertyValue(AnnotationSubjectPropertyValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Extent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Extent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyExtent(TerminologyExtent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyBox(TerminologyBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundle(Bundle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyGraph(TerminologyGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyStatement(TerminologyStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Box Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Box Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyBoxStatement(TerminologyBoxStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Bundle Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Bundle Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyBundleStatement(TerminologyBundleStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerm(Term object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Term Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Term Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryTermKind(UnaryTermKind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directed Binary Relationship Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directed Binary Relationship Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectedBinaryRelationshipKind(DirectedBinaryRelationshipKind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAspect(Aspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcept(Concept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityRelationship(EntityRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reified Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reified Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReifiedRelationship(ReifiedRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unreified Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unreified Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnreifiedRelationship(UnreifiedRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatype(Datatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRange(DataRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scalar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scalar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalar(Scalar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRelationship(DataRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Relationship Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Relationship Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRelationshipDomain(DataRelationshipDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Relationship From Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Relationship From Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRelationshipFromEntity(DataRelationshipFromEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Relationship From Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Relationship From Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRelationshipFromStructure(DataRelationshipFromStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Relationship Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Relationship Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRelationshipRange(DataRelationshipRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Relationship To Scalar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Relationship To Scalar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRelationshipToScalar(DataRelationshipToScalar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Relationship To Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Relationship To Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRelationshipToStructure(DataRelationshipToStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Structured Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Structured Data Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityStructuredDataProperty(EntityStructuredDataProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Scalar Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Scalar Data Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityScalarDataProperty(EntityScalarDataProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Data Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredDataProperty(StructuredDataProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scalar Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scalar Data Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalarDataProperty(ScalarDataProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructure(Structure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAxiom(Axiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyAxiom(TerminologyAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Box Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Box Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyBoxAxiom(TerminologyBoxAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Bundle Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Bundle Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyBundleAxiom(TerminologyBundleAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Tree Disjunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Tree Disjunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptTreeDisjunction(ConceptTreeDisjunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disjoint Union Of Concepts Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disjoint Union Of Concepts Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisjointUnionOfConceptsAxiom(DisjointUnionOfConceptsAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Disjoint Concept Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Disjoint Concept Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificDisjointConceptAxiom(SpecificDisjointConceptAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Concept Taxonomy Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Concept Taxonomy Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousConceptTaxonomyAxiom(AnonymousConceptTaxonomyAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Concept Taxonomy Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Concept Taxonomy Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootConceptTaxonomyAxiom(RootConceptTaxonomyAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundled Terminology Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundled Terminology Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundledTerminologyAxiom(BundledTerminologyAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Designation Terminology Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Designation Terminology Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptDesignationTerminologyAxiom(ConceptDesignationTerminologyAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Extension Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Extension Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyExtensionAxiom(TerminologyExtensionAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Nesting Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Nesting Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyNestingAxiom(TerminologyNestingAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTermAxiom(TermAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Restriction Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Restriction Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityRestrictionAxiom(EntityRestrictionAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Existential Restriction Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Existential Restriction Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityExistentialRestrictionAxiom(EntityExistentialRestrictionAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Universal Restriction Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Universal Restriction Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityUniversalRestrictionAxiom(EntityUniversalRestrictionAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specialization Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specialization Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecializationAxiom(SpecializationAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aspect Specialization Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aspect Specialization Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAspectSpecializationAxiom(AspectSpecializationAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Specialization Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Specialization Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptSpecializationAxiom(ConceptSpecializationAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reified Relationship Specialization Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reified Relationship Specialization Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReifiedRelationshipSpecializationAxiom(ReifiedRelationshipSpecializationAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Scalar Data Property Restriction Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Scalar Data Property Restriction Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityScalarDataPropertyRestrictionAxiom(EntityScalarDataPropertyRestrictionAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Scalar Data Property Existential Restriction Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Scalar Data Property Existential Restriction Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityScalarDataPropertyExistentialRestrictionAxiom(EntityScalarDataPropertyExistentialRestrictionAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Scalar Data Property Universal Restriction Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Scalar Data Property Universal Restriction Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityScalarDataPropertyUniversalRestrictionAxiom(EntityScalarDataPropertyUniversalRestrictionAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Scalar Data Property Particular Restriction Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Scalar Data Property Particular Restriction Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityScalarDataPropertyParticularRestrictionAxiom(EntityScalarDataPropertyParticularRestrictionAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restricted Data Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restricted Data Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestrictedDataRange(RestrictedDataRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Scalar Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Scalar Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryScalarRestriction(BinaryScalarRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IRI Scalar Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IRI Scalar Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIRIScalarRestriction(IRIScalarRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Scalar Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Scalar Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericScalarRestriction(NumericScalarRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plain Literal Scalar Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plain Literal Scalar Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlainLiteralScalarRestriction(PlainLiteralScalarRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Scalar Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Scalar Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringScalarRestriction(StringScalarRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Scalar Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Scalar Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeScalarRestriction(TimeScalarRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synonym Scalar Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synonym Scalar Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynonymScalarRestriction(SynonymScalarRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scalar One Of Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scalar One Of Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalarOneOfRestriction(ScalarOneOfRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scalar One Of Literal Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scalar One Of Literal Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalarOneOfLiteralAxiom(ScalarOneOfLiteralAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OMLSwitch
