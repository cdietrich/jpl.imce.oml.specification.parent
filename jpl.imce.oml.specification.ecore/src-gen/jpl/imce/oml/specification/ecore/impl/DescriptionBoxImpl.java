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

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import jpl.imce.oml.specification.ecore.ConceptInstance;
import jpl.imce.oml.specification.ecore.DataStructureTuple;
import jpl.imce.oml.specification.ecore.DescriptionBox;
import jpl.imce.oml.specification.ecore.DescriptionBoxExtendsClosedWorldDefinitions;
import jpl.imce.oml.specification.ecore.DescriptionBoxRefinement;
import jpl.imce.oml.specification.ecore.OMLPackage;
import jpl.imce.oml.specification.ecore.ReifiedRelationshipInstance;
import jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceDomain;
import jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceRange;
import jpl.imce.oml.specification.ecore.Resource;
import jpl.imce.oml.specification.ecore.ScalarDataPropertyValue;
import jpl.imce.oml.specification.ecore.StructuredDataPropertyValue;
import jpl.imce.oml.specification.ecore.TerminologyExtent;
import jpl.imce.oml.specification.ecore.UnreifiedRelationshipInstanceTuple;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Description Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.DescriptionBoxImpl#getTerminologyExtent <em>Terminology Extent</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.DescriptionBoxImpl#getClosedWorldDefinitions <em>Closed World Definitions</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.DescriptionBoxImpl#getDescriptionBoxRefinements <em>Description Box Refinements</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.DescriptionBoxImpl#getConceptInstances <em>Concept Instances</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.DescriptionBoxImpl#getReifiedRelationshipInstances <em>Reified Relationship Instances</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.DescriptionBoxImpl#getReifiedRelationshipInstanceDomains <em>Reified Relationship Instance Domains</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.DescriptionBoxImpl#getReifiedRelationshipInstanceRanges <em>Reified Relationship Instance Ranges</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.DescriptionBoxImpl#getUnreifiedRelationshipInstanceTuples <em>Unreified Relationship Instance Tuples</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.DescriptionBoxImpl#getDataStructureTuples <em>Data Structure Tuples</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.DescriptionBoxImpl#getScalarDataPropertyValues <em>Scalar Data Property Values</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.DescriptionBoxImpl#getStructuredDataPropertyValues <em>Structured Data Property Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DescriptionBoxImpl extends TerminologyThingImpl implements DescriptionBox {
	/**
	 * The cached value of the '{@link #getClosedWorldDefinitions() <em>Closed World Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosedWorldDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<DescriptionBoxExtendsClosedWorldDefinitions> closedWorldDefinitions;

	/**
	 * The cached value of the '{@link #getDescriptionBoxRefinements() <em>Description Box Refinements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionBoxRefinements()
	 * @generated
	 * @ordered
	 */
	protected EList<DescriptionBoxRefinement> descriptionBoxRefinements;

	/**
	 * The cached value of the '{@link #getConceptInstances() <em>Concept Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptInstance> conceptInstances;

	/**
	 * The cached value of the '{@link #getReifiedRelationshipInstances() <em>Reified Relationship Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReifiedRelationshipInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ReifiedRelationshipInstance> reifiedRelationshipInstances;

	/**
	 * The cached value of the '{@link #getReifiedRelationshipInstanceDomains() <em>Reified Relationship Instance Domains</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReifiedRelationshipInstanceDomains()
	 * @generated
	 * @ordered
	 */
	protected EList<ReifiedRelationshipInstanceDomain> reifiedRelationshipInstanceDomains;

	/**
	 * The cached value of the '{@link #getReifiedRelationshipInstanceRanges() <em>Reified Relationship Instance Ranges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReifiedRelationshipInstanceRanges()
	 * @generated
	 * @ordered
	 */
	protected EList<ReifiedRelationshipInstanceRange> reifiedRelationshipInstanceRanges;

	/**
	 * The cached value of the '{@link #getUnreifiedRelationshipInstanceTuples() <em>Unreified Relationship Instance Tuples</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnreifiedRelationshipInstanceTuples()
	 * @generated
	 * @ordered
	 */
	protected EList<UnreifiedRelationshipInstanceTuple> unreifiedRelationshipInstanceTuples;

	/**
	 * The cached value of the '{@link #getDataStructureTuples() <em>Data Structure Tuples</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataStructureTuples()
	 * @generated
	 * @ordered
	 */
	protected EList<DataStructureTuple> dataStructureTuples;

	/**
	 * The cached value of the '{@link #getScalarDataPropertyValues() <em>Scalar Data Property Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalarDataPropertyValues()
	 * @generated
	 * @ordered
	 */
	protected EList<ScalarDataPropertyValue> scalarDataPropertyValues;

	/**
	 * The cached value of the '{@link #getStructuredDataPropertyValues() <em>Structured Data Property Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuredDataPropertyValues()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredDataPropertyValue> structuredDataPropertyValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescriptionBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMLPackage.Literals.DESCRIPTION_BOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyExtent getTerminologyExtent() {
		if (eContainerFeatureID() != OMLPackage.DESCRIPTION_BOX__TERMINOLOGY_EXTENT) return null;
		return (TerminologyExtent)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyExtent basicGetTerminologyExtent() {
		if (eContainerFeatureID() != OMLPackage.DESCRIPTION_BOX__TERMINOLOGY_EXTENT) return null;
		return (TerminologyExtent)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerminologyExtent(TerminologyExtent newTerminologyExtent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTerminologyExtent, OMLPackage.DESCRIPTION_BOX__TERMINOLOGY_EXTENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminologyExtent(TerminologyExtent newTerminologyExtent) {
		if (newTerminologyExtent != eInternalContainer() || (eContainerFeatureID() != OMLPackage.DESCRIPTION_BOX__TERMINOLOGY_EXTENT && newTerminologyExtent != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newTerminologyExtent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTerminologyExtent != null)
				msgs = ((InternalEObject)newTerminologyExtent).eInverseAdd(this, OMLPackage.TERMINOLOGY_EXTENT__DESCRIPTIONS, TerminologyExtent.class, msgs);
			msgs = basicSetTerminologyExtent(newTerminologyExtent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.DESCRIPTION_BOX__TERMINOLOGY_EXTENT, newTerminologyExtent, newTerminologyExtent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionBoxExtendsClosedWorldDefinitions> getClosedWorldDefinitions() {
		if (closedWorldDefinitions == null) {
			closedWorldDefinitions = new EObjectContainmentWithInverseEList<DescriptionBoxExtendsClosedWorldDefinitions>(DescriptionBoxExtendsClosedWorldDefinitions.class, this, OMLPackage.DESCRIPTION_BOX__CLOSED_WORLD_DEFINITIONS, OMLPackage.DESCRIPTION_BOX_EXTENDS_CLOSED_WORLD_DEFINITIONS__DESCRIPTION_BOX);
		}
		return closedWorldDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionBoxRefinement> getDescriptionBoxRefinements() {
		if (descriptionBoxRefinements == null) {
			descriptionBoxRefinements = new EObjectContainmentWithInverseEList<DescriptionBoxRefinement>(DescriptionBoxRefinement.class, this, OMLPackage.DESCRIPTION_BOX__DESCRIPTION_BOX_REFINEMENTS, OMLPackage.DESCRIPTION_BOX_REFINEMENT__REFINING_DESCRIPTION_BOX);
		}
		return descriptionBoxRefinements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptInstance> getConceptInstances() {
		if (conceptInstances == null) {
			conceptInstances = new EObjectResolvingEList<ConceptInstance>(ConceptInstance.class, this, OMLPackage.DESCRIPTION_BOX__CONCEPT_INSTANCES);
		}
		return conceptInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReifiedRelationshipInstance> getReifiedRelationshipInstances() {
		if (reifiedRelationshipInstances == null) {
			reifiedRelationshipInstances = new EObjectResolvingEList<ReifiedRelationshipInstance>(ReifiedRelationshipInstance.class, this, OMLPackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCES);
		}
		return reifiedRelationshipInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReifiedRelationshipInstanceDomain> getReifiedRelationshipInstanceDomains() {
		if (reifiedRelationshipInstanceDomains == null) {
			reifiedRelationshipInstanceDomains = new EObjectResolvingEList<ReifiedRelationshipInstanceDomain>(ReifiedRelationshipInstanceDomain.class, this, OMLPackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCE_DOMAINS);
		}
		return reifiedRelationshipInstanceDomains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReifiedRelationshipInstanceRange> getReifiedRelationshipInstanceRanges() {
		if (reifiedRelationshipInstanceRanges == null) {
			reifiedRelationshipInstanceRanges = new EObjectResolvingEList<ReifiedRelationshipInstanceRange>(ReifiedRelationshipInstanceRange.class, this, OMLPackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCE_RANGES);
		}
		return reifiedRelationshipInstanceRanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnreifiedRelationshipInstanceTuple> getUnreifiedRelationshipInstanceTuples() {
		if (unreifiedRelationshipInstanceTuples == null) {
			unreifiedRelationshipInstanceTuples = new EObjectResolvingEList<UnreifiedRelationshipInstanceTuple>(UnreifiedRelationshipInstanceTuple.class, this, OMLPackage.DESCRIPTION_BOX__UNREIFIED_RELATIONSHIP_INSTANCE_TUPLES);
		}
		return unreifiedRelationshipInstanceTuples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataStructureTuple> getDataStructureTuples() {
		if (dataStructureTuples == null) {
			dataStructureTuples = new EObjectResolvingEList<DataStructureTuple>(DataStructureTuple.class, this, OMLPackage.DESCRIPTION_BOX__DATA_STRUCTURE_TUPLES);
		}
		return dataStructureTuples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScalarDataPropertyValue> getScalarDataPropertyValues() {
		if (scalarDataPropertyValues == null) {
			scalarDataPropertyValues = new EObjectResolvingEList<ScalarDataPropertyValue>(ScalarDataPropertyValue.class, this, OMLPackage.DESCRIPTION_BOX__SCALAR_DATA_PROPERTY_VALUES);
		}
		return scalarDataPropertyValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredDataPropertyValue> getStructuredDataPropertyValues() {
		if (structuredDataPropertyValues == null) {
			structuredDataPropertyValues = new EObjectResolvingEList<StructuredDataPropertyValue>(StructuredDataPropertyValue.class, this, OMLPackage.DESCRIPTION_BOX__STRUCTURED_DATA_PROPERTY_VALUES);
		}
		return structuredDataPropertyValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionBox withConceptInstances(EList<ConceptInstance> s) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionBox withReifiedRelationshipInstances(EList<ReifiedRelationshipInstance> s) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionBox withReifiedRelationshipInstanceDomains(EList<ReifiedRelationshipInstanceDomain> s) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionBox withReifiedRelationshipInstanceRanges(EList<ReifiedRelationshipInstanceRange> s) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionBox withUnreifiedRelationshipInstanceTuples(EList<UnreifiedRelationshipInstanceTuple> s) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionBox withDataStructureTuples(EList<DataStructureTuple> s) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionBox withScalarDataPropertyValues(EList<ScalarDataPropertyValue> s) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionBox withStructuredDataPropertyValues(EList<StructuredDataPropertyValue> s) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String iri() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String name() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMLPackage.DESCRIPTION_BOX__TERMINOLOGY_EXTENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTerminologyExtent((TerminologyExtent)otherEnd, msgs);
			case OMLPackage.DESCRIPTION_BOX__CLOSED_WORLD_DEFINITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClosedWorldDefinitions()).basicAdd(otherEnd, msgs);
			case OMLPackage.DESCRIPTION_BOX__DESCRIPTION_BOX_REFINEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDescriptionBoxRefinements()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMLPackage.DESCRIPTION_BOX__TERMINOLOGY_EXTENT:
				return basicSetTerminologyExtent(null, msgs);
			case OMLPackage.DESCRIPTION_BOX__CLOSED_WORLD_DEFINITIONS:
				return ((InternalEList<?>)getClosedWorldDefinitions()).basicRemove(otherEnd, msgs);
			case OMLPackage.DESCRIPTION_BOX__DESCRIPTION_BOX_REFINEMENTS:
				return ((InternalEList<?>)getDescriptionBoxRefinements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case OMLPackage.DESCRIPTION_BOX__TERMINOLOGY_EXTENT:
				return eInternalContainer().eInverseRemove(this, OMLPackage.TERMINOLOGY_EXTENT__DESCRIPTIONS, TerminologyExtent.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMLPackage.DESCRIPTION_BOX__TERMINOLOGY_EXTENT:
				if (resolve) return getTerminologyExtent();
				return basicGetTerminologyExtent();
			case OMLPackage.DESCRIPTION_BOX__CLOSED_WORLD_DEFINITIONS:
				return getClosedWorldDefinitions();
			case OMLPackage.DESCRIPTION_BOX__DESCRIPTION_BOX_REFINEMENTS:
				return getDescriptionBoxRefinements();
			case OMLPackage.DESCRIPTION_BOX__CONCEPT_INSTANCES:
				return getConceptInstances();
			case OMLPackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCES:
				return getReifiedRelationshipInstances();
			case OMLPackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCE_DOMAINS:
				return getReifiedRelationshipInstanceDomains();
			case OMLPackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCE_RANGES:
				return getReifiedRelationshipInstanceRanges();
			case OMLPackage.DESCRIPTION_BOX__UNREIFIED_RELATIONSHIP_INSTANCE_TUPLES:
				return getUnreifiedRelationshipInstanceTuples();
			case OMLPackage.DESCRIPTION_BOX__DATA_STRUCTURE_TUPLES:
				return getDataStructureTuples();
			case OMLPackage.DESCRIPTION_BOX__SCALAR_DATA_PROPERTY_VALUES:
				return getScalarDataPropertyValues();
			case OMLPackage.DESCRIPTION_BOX__STRUCTURED_DATA_PROPERTY_VALUES:
				return getStructuredDataPropertyValues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OMLPackage.DESCRIPTION_BOX__TERMINOLOGY_EXTENT:
				setTerminologyExtent((TerminologyExtent)newValue);
				return;
			case OMLPackage.DESCRIPTION_BOX__CLOSED_WORLD_DEFINITIONS:
				getClosedWorldDefinitions().clear();
				getClosedWorldDefinitions().addAll((Collection<? extends DescriptionBoxExtendsClosedWorldDefinitions>)newValue);
				return;
			case OMLPackage.DESCRIPTION_BOX__DESCRIPTION_BOX_REFINEMENTS:
				getDescriptionBoxRefinements().clear();
				getDescriptionBoxRefinements().addAll((Collection<? extends DescriptionBoxRefinement>)newValue);
				return;
			case OMLPackage.DESCRIPTION_BOX__CONCEPT_INSTANCES:
				getConceptInstances().clear();
				getConceptInstances().addAll((Collection<? extends ConceptInstance>)newValue);
				return;
			case OMLPackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCES:
				getReifiedRelationshipInstances().clear();
				getReifiedRelationshipInstances().addAll((Collection<? extends ReifiedRelationshipInstance>)newValue);
				return;
			case OMLPackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCE_DOMAINS:
				getReifiedRelationshipInstanceDomains().clear();
				getReifiedRelationshipInstanceDomains().addAll((Collection<? extends ReifiedRelationshipInstanceDomain>)newValue);
				return;
			case OMLPackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCE_RANGES:
				getReifiedRelationshipInstanceRanges().clear();
				getReifiedRelationshipInstanceRanges().addAll((Collection<? extends ReifiedRelationshipInstanceRange>)newValue);
				return;
			case OMLPackage.DESCRIPTION_BOX__UNREIFIED_RELATIONSHIP_INSTANCE_TUPLES:
				getUnreifiedRelationshipInstanceTuples().clear();
				getUnreifiedRelationshipInstanceTuples().addAll((Collection<? extends UnreifiedRelationshipInstanceTuple>)newValue);
				return;
			case OMLPackage.DESCRIPTION_BOX__DATA_STRUCTURE_TUPLES:
				getDataStructureTuples().clear();
				getDataStructureTuples().addAll((Collection<? extends DataStructureTuple>)newValue);
				return;
			case OMLPackage.DESCRIPTION_BOX__SCALAR_DATA_PROPERTY_VALUES:
				getScalarDataPropertyValues().clear();
				getScalarDataPropertyValues().addAll((Collection<? extends ScalarDataPropertyValue>)newValue);
				return;
			case OMLPackage.DESCRIPTION_BOX__STRUCTURED_DATA_PROPERTY_VALUES:
				getStructuredDataPropertyValues().clear();
				getStructuredDataPropertyValues().addAll((Collection<? extends StructuredDataPropertyValue>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OMLPackage.DESCRIPTION_BOX__TERMINOLOGY_EXTENT:
				setTerminologyExtent((TerminologyExtent)null);
				return;
			case OMLPackage.DESCRIPTION_BOX__CLOSED_WORLD_DEFINITIONS:
				getClosedWorldDefinitions().clear();
				return;
			case OMLPackage.DESCRIPTION_BOX__DESCRIPTION_BOX_REFINEMENTS:
				getDescriptionBoxRefinements().clear();
				return;
			case OMLPackage.DESCRIPTION_BOX__CONCEPT_INSTANCES:
				getConceptInstances().clear();
				return;
			case OMLPackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCES:
				getReifiedRelationshipInstances().clear();
				return;
			case OMLPackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCE_DOMAINS:
				getReifiedRelationshipInstanceDomains().clear();
				return;
			case OMLPackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCE_RANGES:
				getReifiedRelationshipInstanceRanges().clear();
				return;
			case OMLPackage.DESCRIPTION_BOX__UNREIFIED_RELATIONSHIP_INSTANCE_TUPLES:
				getUnreifiedRelationshipInstanceTuples().clear();
				return;
			case OMLPackage.DESCRIPTION_BOX__DATA_STRUCTURE_TUPLES:
				getDataStructureTuples().clear();
				return;
			case OMLPackage.DESCRIPTION_BOX__SCALAR_DATA_PROPERTY_VALUES:
				getScalarDataPropertyValues().clear();
				return;
			case OMLPackage.DESCRIPTION_BOX__STRUCTURED_DATA_PROPERTY_VALUES:
				getStructuredDataPropertyValues().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OMLPackage.DESCRIPTION_BOX__TERMINOLOGY_EXTENT:
				return basicGetTerminologyExtent() != null;
			case OMLPackage.DESCRIPTION_BOX__CLOSED_WORLD_DEFINITIONS:
				return closedWorldDefinitions != null && !closedWorldDefinitions.isEmpty();
			case OMLPackage.DESCRIPTION_BOX__DESCRIPTION_BOX_REFINEMENTS:
				return descriptionBoxRefinements != null && !descriptionBoxRefinements.isEmpty();
			case OMLPackage.DESCRIPTION_BOX__CONCEPT_INSTANCES:
				return conceptInstances != null && !conceptInstances.isEmpty();
			case OMLPackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCES:
				return reifiedRelationshipInstances != null && !reifiedRelationshipInstances.isEmpty();
			case OMLPackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCE_DOMAINS:
				return reifiedRelationshipInstanceDomains != null && !reifiedRelationshipInstanceDomains.isEmpty();
			case OMLPackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCE_RANGES:
				return reifiedRelationshipInstanceRanges != null && !reifiedRelationshipInstanceRanges.isEmpty();
			case OMLPackage.DESCRIPTION_BOX__UNREIFIED_RELATIONSHIP_INSTANCE_TUPLES:
				return unreifiedRelationshipInstanceTuples != null && !unreifiedRelationshipInstanceTuples.isEmpty();
			case OMLPackage.DESCRIPTION_BOX__DATA_STRUCTURE_TUPLES:
				return dataStructureTuples != null && !dataStructureTuples.isEmpty();
			case OMLPackage.DESCRIPTION_BOX__SCALAR_DATA_PROPERTY_VALUES:
				return scalarDataPropertyValues != null && !scalarDataPropertyValues.isEmpty();
			case OMLPackage.DESCRIPTION_BOX__STRUCTURED_DATA_PROPERTY_VALUES:
				return structuredDataPropertyValues != null && !structuredDataPropertyValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Resource.class) {
			switch (baseOperationID) {
				case OMLPackage.RESOURCE___IRI: return OMLPackage.DESCRIPTION_BOX___IRI;
				case OMLPackage.RESOURCE___NAME: return OMLPackage.DESCRIPTION_BOX___NAME;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OMLPackage.DESCRIPTION_BOX___WITH_CONCEPT_INSTANCES__ELIST:
				return withConceptInstances((EList<ConceptInstance>)arguments.get(0));
			case OMLPackage.DESCRIPTION_BOX___WITH_REIFIED_RELATIONSHIP_INSTANCES__ELIST:
				return withReifiedRelationshipInstances((EList<ReifiedRelationshipInstance>)arguments.get(0));
			case OMLPackage.DESCRIPTION_BOX___WITH_REIFIED_RELATIONSHIP_INSTANCE_DOMAINS__ELIST:
				return withReifiedRelationshipInstanceDomains((EList<ReifiedRelationshipInstanceDomain>)arguments.get(0));
			case OMLPackage.DESCRIPTION_BOX___WITH_REIFIED_RELATIONSHIP_INSTANCE_RANGES__ELIST:
				return withReifiedRelationshipInstanceRanges((EList<ReifiedRelationshipInstanceRange>)arguments.get(0));
			case OMLPackage.DESCRIPTION_BOX___WITH_UNREIFIED_RELATIONSHIP_INSTANCE_TUPLES__ELIST:
				return withUnreifiedRelationshipInstanceTuples((EList<UnreifiedRelationshipInstanceTuple>)arguments.get(0));
			case OMLPackage.DESCRIPTION_BOX___WITH_DATA_STRUCTURE_TUPLES__ELIST:
				return withDataStructureTuples((EList<DataStructureTuple>)arguments.get(0));
			case OMLPackage.DESCRIPTION_BOX___WITH_SCALAR_DATA_PROPERTY_VALUES__ELIST:
				return withScalarDataPropertyValues((EList<ScalarDataPropertyValue>)arguments.get(0));
			case OMLPackage.DESCRIPTION_BOX___WITH_STRUCTURED_DATA_PROPERTY_VALUES__ELIST:
				return withStructuredDataPropertyValues((EList<StructuredDataPropertyValue>)arguments.get(0));
			case OMLPackage.DESCRIPTION_BOX___IRI:
				return iri();
			case OMLPackage.DESCRIPTION_BOX___NAME:
				return name();
		}
		return super.eInvoke(operationID, arguments);
	}

} //DescriptionBoxImpl
