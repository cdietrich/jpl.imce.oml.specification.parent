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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see jpl.imce.oml.specification.ecore.OMLPackage
 * @generated
 */
public class OMLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OMLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OMLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OMLSwitch<Adapter> modelSwitch =
		new OMLSwitch<Adapter>() {
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseTerminologyThing(TerminologyThing object) {
				return createTerminologyThingAdapter();
			}
			@Override
			public Adapter caseAnnotationProperty(AnnotationProperty object) {
				return createAnnotationPropertyAdapter();
			}
			@Override
			public Adapter caseAnnotationPropertyTable(Map.Entry<AnnotationProperty, EList<AnnotationEntry>> object) {
				return createAnnotationPropertyTableAdapter();
			}
			@Override
			public Adapter caseAnnotationEntry(AnnotationEntry object) {
				return createAnnotationEntryAdapter();
			}
			@Override
			public Adapter caseAnnotationSubjectTable(Map.Entry<TerminologyThing, EList<AnnotationSubjectPropertyValue>> object) {
				return createAnnotationSubjectTableAdapter();
			}
			@Override
			public Adapter caseAnnotationSubjectPropertyValue(AnnotationSubjectPropertyValue object) {
				return createAnnotationSubjectPropertyValueAdapter();
			}
			@Override
			public Adapter caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
			}
			@Override
			public Adapter caseTerminologyExtent(TerminologyExtent object) {
				return createTerminologyExtentAdapter();
			}
			@Override
			public Adapter caseTerminologyBox(TerminologyBox object) {
				return createTerminologyBoxAdapter();
			}
			@Override
			public Adapter caseBundle(Bundle object) {
				return createBundleAdapter();
			}
			@Override
			public Adapter caseTerminologyGraph(TerminologyGraph object) {
				return createTerminologyGraphAdapter();
			}
			@Override
			public Adapter caseTerminologyStatement(TerminologyStatement object) {
				return createTerminologyStatementAdapter();
			}
			@Override
			public Adapter caseTerminologyBoxStatement(TerminologyBoxStatement object) {
				return createTerminologyBoxStatementAdapter();
			}
			@Override
			public Adapter caseTerminologyBundleStatement(TerminologyBundleStatement object) {
				return createTerminologyBundleStatementAdapter();
			}
			@Override
			public Adapter caseTerm(Term object) {
				return createTermAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseAspect(Aspect object) {
				return createAspectAdapter();
			}
			@Override
			public Adapter caseConcept(Concept object) {
				return createConceptAdapter();
			}
			@Override
			public Adapter caseEntityRelationship(EntityRelationship object) {
				return createEntityRelationshipAdapter();
			}
			@Override
			public Adapter caseReifiedRelationship(ReifiedRelationship object) {
				return createReifiedRelationshipAdapter();
			}
			@Override
			public Adapter caseUnreifiedRelationship(UnreifiedRelationship object) {
				return createUnreifiedRelationshipAdapter();
			}
			@Override
			public Adapter caseDatatype(Datatype object) {
				return createDatatypeAdapter();
			}
			@Override
			public Adapter caseDataRange(DataRange object) {
				return createDataRangeAdapter();
			}
			@Override
			public Adapter caseScalar(Scalar object) {
				return createScalarAdapter();
			}
			@Override
			public Adapter caseDataRelationship(DataRelationship object) {
				return createDataRelationshipAdapter();
			}
			@Override
			public Adapter caseDataRelationshipDomain(DataRelationshipDomain object) {
				return createDataRelationshipDomainAdapter();
			}
			@Override
			public Adapter caseDataRelationshipFromEntity(DataRelationshipFromEntity object) {
				return createDataRelationshipFromEntityAdapter();
			}
			@Override
			public Adapter caseDataRelationshipFromStructure(DataRelationshipFromStructure object) {
				return createDataRelationshipFromStructureAdapter();
			}
			@Override
			public Adapter caseDataRelationshipRange(DataRelationshipRange object) {
				return createDataRelationshipRangeAdapter();
			}
			@Override
			public Adapter caseDataRelationshipToScalar(DataRelationshipToScalar object) {
				return createDataRelationshipToScalarAdapter();
			}
			@Override
			public Adapter caseDataRelationshipToStructure(DataRelationshipToStructure object) {
				return createDataRelationshipToStructureAdapter();
			}
			@Override
			public Adapter caseEntityStructuredDataProperty(EntityStructuredDataProperty object) {
				return createEntityStructuredDataPropertyAdapter();
			}
			@Override
			public Adapter caseEntityScalarDataProperty(EntityScalarDataProperty object) {
				return createEntityScalarDataPropertyAdapter();
			}
			@Override
			public Adapter caseStructuredDataProperty(StructuredDataProperty object) {
				return createStructuredDataPropertyAdapter();
			}
			@Override
			public Adapter caseScalarDataProperty(ScalarDataProperty object) {
				return createScalarDataPropertyAdapter();
			}
			@Override
			public Adapter caseStructure(Structure object) {
				return createStructureAdapter();
			}
			@Override
			public Adapter caseAxiom(Axiom object) {
				return createAxiomAdapter();
			}
			@Override
			public Adapter caseTerminologyAxiom(TerminologyAxiom object) {
				return createTerminologyAxiomAdapter();
			}
			@Override
			public Adapter caseTerminologyBoxAxiom(TerminologyBoxAxiom object) {
				return createTerminologyBoxAxiomAdapter();
			}
			@Override
			public Adapter caseTerminologyBundleAxiom(TerminologyBundleAxiom object) {
				return createTerminologyBundleAxiomAdapter();
			}
			@Override
			public Adapter caseConceptTreeDisjunction(ConceptTreeDisjunction object) {
				return createConceptTreeDisjunctionAdapter();
			}
			@Override
			public Adapter caseDisjointUnionOfConceptsAxiom(DisjointUnionOfConceptsAxiom object) {
				return createDisjointUnionOfConceptsAxiomAdapter();
			}
			@Override
			public Adapter caseSpecificDisjointConceptAxiom(SpecificDisjointConceptAxiom object) {
				return createSpecificDisjointConceptAxiomAdapter();
			}
			@Override
			public Adapter caseAnonymousConceptTaxonomyAxiom(AnonymousConceptTaxonomyAxiom object) {
				return createAnonymousConceptTaxonomyAxiomAdapter();
			}
			@Override
			public Adapter caseRootConceptTaxonomyAxiom(RootConceptTaxonomyAxiom object) {
				return createRootConceptTaxonomyAxiomAdapter();
			}
			@Override
			public Adapter caseBundledTerminologyAxiom(BundledTerminologyAxiom object) {
				return createBundledTerminologyAxiomAdapter();
			}
			@Override
			public Adapter caseConceptDesignationTerminologyAxiom(ConceptDesignationTerminologyAxiom object) {
				return createConceptDesignationTerminologyAxiomAdapter();
			}
			@Override
			public Adapter caseTerminologyExtensionAxiom(TerminologyExtensionAxiom object) {
				return createTerminologyExtensionAxiomAdapter();
			}
			@Override
			public Adapter caseTerminologyNestingAxiom(TerminologyNestingAxiom object) {
				return createTerminologyNestingAxiomAdapter();
			}
			@Override
			public Adapter caseTermAxiom(TermAxiom object) {
				return createTermAxiomAdapter();
			}
			@Override
			public Adapter caseEntityRestrictionAxiom(EntityRestrictionAxiom object) {
				return createEntityRestrictionAxiomAdapter();
			}
			@Override
			public Adapter caseEntityExistentialRestrictionAxiom(EntityExistentialRestrictionAxiom object) {
				return createEntityExistentialRestrictionAxiomAdapter();
			}
			@Override
			public Adapter caseEntityUniversalRestrictionAxiom(EntityUniversalRestrictionAxiom object) {
				return createEntityUniversalRestrictionAxiomAdapter();
			}
			@Override
			public Adapter caseSpecializationAxiom(SpecializationAxiom object) {
				return createSpecializationAxiomAdapter();
			}
			@Override
			public Adapter caseAspectSpecializationAxiom(AspectSpecializationAxiom object) {
				return createAspectSpecializationAxiomAdapter();
			}
			@Override
			public Adapter caseConceptSpecializationAxiom(ConceptSpecializationAxiom object) {
				return createConceptSpecializationAxiomAdapter();
			}
			@Override
			public Adapter caseReifiedRelationshipSpecializationAxiom(ReifiedRelationshipSpecializationAxiom object) {
				return createReifiedRelationshipSpecializationAxiomAdapter();
			}
			@Override
			public Adapter caseEntityScalarDataPropertyRestrictionAxiom(EntityScalarDataPropertyRestrictionAxiom object) {
				return createEntityScalarDataPropertyRestrictionAxiomAdapter();
			}
			@Override
			public Adapter caseEntityScalarDataPropertyExistentialRestrictionAxiom(EntityScalarDataPropertyExistentialRestrictionAxiom object) {
				return createEntityScalarDataPropertyExistentialRestrictionAxiomAdapter();
			}
			@Override
			public Adapter caseEntityScalarDataPropertyUniversalRestrictionAxiom(EntityScalarDataPropertyUniversalRestrictionAxiom object) {
				return createEntityScalarDataPropertyUniversalRestrictionAxiomAdapter();
			}
			@Override
			public Adapter caseEntityScalarDataPropertyParticularRestrictionAxiom(EntityScalarDataPropertyParticularRestrictionAxiom object) {
				return createEntityScalarDataPropertyParticularRestrictionAxiomAdapter();
			}
			@Override
			public Adapter caseRestrictedDataRange(RestrictedDataRange object) {
				return createRestrictedDataRangeAdapter();
			}
			@Override
			public Adapter caseSynonymScalarRestriction(SynonymScalarRestriction object) {
				return createSynonymScalarRestrictionAdapter();
			}
			@Override
			public Adapter caseNumericScalarRestriction(NumericScalarRestriction object) {
				return createNumericScalarRestrictionAdapter();
			}
			@Override
			public Adapter caseStringScalarRestriction(StringScalarRestriction object) {
				return createStringScalarRestrictionAdapter();
			}
			@Override
			public Adapter casePlainLiteralScalarRestriction(PlainLiteralScalarRestriction object) {
				return createPlainLiteralScalarRestrictionAdapter();
			}
			@Override
			public Adapter caseBinaryScalarRestriction(BinaryScalarRestriction object) {
				return createBinaryScalarRestrictionAdapter();
			}
			@Override
			public Adapter caseIRIScalarRestriction(IRIScalarRestriction object) {
				return createIRIScalarRestrictionAdapter();
			}
			@Override
			public Adapter caseTimeScalarRestriction(TimeScalarRestriction object) {
				return createTimeScalarRestrictionAdapter();
			}
			@Override
			public Adapter caseScalarOneOfRestriction(ScalarOneOfRestriction object) {
				return createScalarOneOfRestrictionAdapter();
			}
			@Override
			public Adapter caseScalarOneOfLiteralAxiom(ScalarOneOfLiteralAxiom object) {
				return createScalarOneOfLiteralAxiomAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.TerminologyThing <em>Terminology Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.TerminologyThing
	 * @generated
	 */
	public Adapter createTerminologyThingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.AnnotationProperty <em>Annotation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.AnnotationProperty
	 * @generated
	 */
	public Adapter createAnnotationPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Annotation Property Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createAnnotationPropertyTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.AnnotationEntry <em>Annotation Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.AnnotationEntry
	 * @generated
	 */
	public Adapter createAnnotationEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Annotation Subject Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createAnnotationSubjectTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.AnnotationSubjectPropertyValue <em>Annotation Subject Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.AnnotationSubjectPropertyValue
	 * @generated
	 */
	public Adapter createAnnotationSubjectPropertyValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.TerminologyExtent <em>Terminology Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.TerminologyExtent
	 * @generated
	 */
	public Adapter createTerminologyExtentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.TerminologyBox <em>Terminology Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.TerminologyBox
	 * @generated
	 */
	public Adapter createTerminologyBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.Bundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.Bundle
	 * @generated
	 */
	public Adapter createBundleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.TerminologyGraph <em>Terminology Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.TerminologyGraph
	 * @generated
	 */
	public Adapter createTerminologyGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.TerminologyStatement <em>Terminology Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.TerminologyStatement
	 * @generated
	 */
	public Adapter createTerminologyStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.TerminologyBoxStatement <em>Terminology Box Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.TerminologyBoxStatement
	 * @generated
	 */
	public Adapter createTerminologyBoxStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.TerminologyBundleStatement <em>Terminology Bundle Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.TerminologyBundleStatement
	 * @generated
	 */
	public Adapter createTerminologyBundleStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.Term
	 * @generated
	 */
	public Adapter createTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.Aspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.Aspect
	 * @generated
	 */
	public Adapter createAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.Concept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.Concept
	 * @generated
	 */
	public Adapter createConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.EntityRelationship <em>Entity Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.EntityRelationship
	 * @generated
	 */
	public Adapter createEntityRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.ReifiedRelationship <em>Reified Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.ReifiedRelationship
	 * @generated
	 */
	public Adapter createReifiedRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.UnreifiedRelationship <em>Unreified Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.UnreifiedRelationship
	 * @generated
	 */
	public Adapter createUnreifiedRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.Datatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.Datatype
	 * @generated
	 */
	public Adapter createDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.DataRange <em>Data Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.DataRange
	 * @generated
	 */
	public Adapter createDataRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.Scalar <em>Scalar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.Scalar
	 * @generated
	 */
	public Adapter createScalarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.DataRelationship <em>Data Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.DataRelationship
	 * @generated
	 */
	public Adapter createDataRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.DataRelationshipDomain <em>Data Relationship Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.DataRelationshipDomain
	 * @generated
	 */
	public Adapter createDataRelationshipDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.DataRelationshipFromEntity <em>Data Relationship From Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.DataRelationshipFromEntity
	 * @generated
	 */
	public Adapter createDataRelationshipFromEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.DataRelationshipFromStructure <em>Data Relationship From Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.DataRelationshipFromStructure
	 * @generated
	 */
	public Adapter createDataRelationshipFromStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.DataRelationshipRange <em>Data Relationship Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.DataRelationshipRange
	 * @generated
	 */
	public Adapter createDataRelationshipRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.DataRelationshipToScalar <em>Data Relationship To Scalar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.DataRelationshipToScalar
	 * @generated
	 */
	public Adapter createDataRelationshipToScalarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.DataRelationshipToStructure <em>Data Relationship To Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.DataRelationshipToStructure
	 * @generated
	 */
	public Adapter createDataRelationshipToStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.EntityStructuredDataProperty <em>Entity Structured Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.EntityStructuredDataProperty
	 * @generated
	 */
	public Adapter createEntityStructuredDataPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.EntityScalarDataProperty <em>Entity Scalar Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.EntityScalarDataProperty
	 * @generated
	 */
	public Adapter createEntityScalarDataPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.StructuredDataProperty <em>Structured Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.StructuredDataProperty
	 * @generated
	 */
	public Adapter createStructuredDataPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.ScalarDataProperty <em>Scalar Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.ScalarDataProperty
	 * @generated
	 */
	public Adapter createScalarDataPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.Structure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.Structure
	 * @generated
	 */
	public Adapter createStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.Axiom <em>Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.Axiom
	 * @generated
	 */
	public Adapter createAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.TerminologyAxiom <em>Terminology Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.TerminologyAxiom
	 * @generated
	 */
	public Adapter createTerminologyAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.TerminologyBoxAxiom <em>Terminology Box Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.TerminologyBoxAxiom
	 * @generated
	 */
	public Adapter createTerminologyBoxAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.TerminologyBundleAxiom <em>Terminology Bundle Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.TerminologyBundleAxiom
	 * @generated
	 */
	public Adapter createTerminologyBundleAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.ConceptTreeDisjunction <em>Concept Tree Disjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.ConceptTreeDisjunction
	 * @generated
	 */
	public Adapter createConceptTreeDisjunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.DisjointUnionOfConceptsAxiom <em>Disjoint Union Of Concepts Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.DisjointUnionOfConceptsAxiom
	 * @generated
	 */
	public Adapter createDisjointUnionOfConceptsAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.SpecificDisjointConceptAxiom <em>Specific Disjoint Concept Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.SpecificDisjointConceptAxiom
	 * @generated
	 */
	public Adapter createSpecificDisjointConceptAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.AnonymousConceptTaxonomyAxiom <em>Anonymous Concept Taxonomy Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.AnonymousConceptTaxonomyAxiom
	 * @generated
	 */
	public Adapter createAnonymousConceptTaxonomyAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.RootConceptTaxonomyAxiom <em>Root Concept Taxonomy Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.RootConceptTaxonomyAxiom
	 * @generated
	 */
	public Adapter createRootConceptTaxonomyAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.BundledTerminologyAxiom <em>Bundled Terminology Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.BundledTerminologyAxiom
	 * @generated
	 */
	public Adapter createBundledTerminologyAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.ConceptDesignationTerminologyAxiom <em>Concept Designation Terminology Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.ConceptDesignationTerminologyAxiom
	 * @generated
	 */
	public Adapter createConceptDesignationTerminologyAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.TerminologyExtensionAxiom <em>Terminology Extension Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.TerminologyExtensionAxiom
	 * @generated
	 */
	public Adapter createTerminologyExtensionAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.TerminologyNestingAxiom <em>Terminology Nesting Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.TerminologyNestingAxiom
	 * @generated
	 */
	public Adapter createTerminologyNestingAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.TermAxiom <em>Term Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.TermAxiom
	 * @generated
	 */
	public Adapter createTermAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.EntityRestrictionAxiom <em>Entity Restriction Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.EntityRestrictionAxiom
	 * @generated
	 */
	public Adapter createEntityRestrictionAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.EntityExistentialRestrictionAxiom <em>Entity Existential Restriction Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.EntityExistentialRestrictionAxiom
	 * @generated
	 */
	public Adapter createEntityExistentialRestrictionAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.EntityUniversalRestrictionAxiom <em>Entity Universal Restriction Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.EntityUniversalRestrictionAxiom
	 * @generated
	 */
	public Adapter createEntityUniversalRestrictionAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.SpecializationAxiom <em>Specialization Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.SpecializationAxiom
	 * @generated
	 */
	public Adapter createSpecializationAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.AspectSpecializationAxiom <em>Aspect Specialization Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.AspectSpecializationAxiom
	 * @generated
	 */
	public Adapter createAspectSpecializationAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.ConceptSpecializationAxiom <em>Concept Specialization Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.ConceptSpecializationAxiom
	 * @generated
	 */
	public Adapter createConceptSpecializationAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipSpecializationAxiom <em>Reified Relationship Specialization Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.ReifiedRelationshipSpecializationAxiom
	 * @generated
	 */
	public Adapter createReifiedRelationshipSpecializationAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.EntityScalarDataPropertyRestrictionAxiom <em>Entity Scalar Data Property Restriction Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.EntityScalarDataPropertyRestrictionAxiom
	 * @generated
	 */
	public Adapter createEntityScalarDataPropertyRestrictionAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.EntityScalarDataPropertyExistentialRestrictionAxiom <em>Entity Scalar Data Property Existential Restriction Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.EntityScalarDataPropertyExistentialRestrictionAxiom
	 * @generated
	 */
	public Adapter createEntityScalarDataPropertyExistentialRestrictionAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.EntityScalarDataPropertyUniversalRestrictionAxiom <em>Entity Scalar Data Property Universal Restriction Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.EntityScalarDataPropertyUniversalRestrictionAxiom
	 * @generated
	 */
	public Adapter createEntityScalarDataPropertyUniversalRestrictionAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.EntityScalarDataPropertyParticularRestrictionAxiom <em>Entity Scalar Data Property Particular Restriction Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.EntityScalarDataPropertyParticularRestrictionAxiom
	 * @generated
	 */
	public Adapter createEntityScalarDataPropertyParticularRestrictionAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.RestrictedDataRange <em>Restricted Data Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.RestrictedDataRange
	 * @generated
	 */
	public Adapter createRestrictedDataRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.SynonymScalarRestriction <em>Synonym Scalar Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.SynonymScalarRestriction
	 * @generated
	 */
	public Adapter createSynonymScalarRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.NumericScalarRestriction <em>Numeric Scalar Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.NumericScalarRestriction
	 * @generated
	 */
	public Adapter createNumericScalarRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.StringScalarRestriction <em>String Scalar Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.StringScalarRestriction
	 * @generated
	 */
	public Adapter createStringScalarRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.PlainLiteralScalarRestriction <em>Plain Literal Scalar Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.PlainLiteralScalarRestriction
	 * @generated
	 */
	public Adapter createPlainLiteralScalarRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.BinaryScalarRestriction <em>Binary Scalar Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.BinaryScalarRestriction
	 * @generated
	 */
	public Adapter createBinaryScalarRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.IRIScalarRestriction <em>IRI Scalar Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.IRIScalarRestriction
	 * @generated
	 */
	public Adapter createIRIScalarRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.TimeScalarRestriction <em>Time Scalar Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.TimeScalarRestriction
	 * @generated
	 */
	public Adapter createTimeScalarRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.ScalarOneOfRestriction <em>Scalar One Of Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.ScalarOneOfRestriction
	 * @generated
	 */
	public Adapter createScalarOneOfRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jpl.imce.oml.specification.ecore.ScalarOneOfLiteralAxiom <em>Scalar One Of Literal Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jpl.imce.oml.specification.ecore.ScalarOneOfLiteralAxiom
	 * @generated
	 */
	public Adapter createScalarOneOfLiteralAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OMLAdapterFactory
