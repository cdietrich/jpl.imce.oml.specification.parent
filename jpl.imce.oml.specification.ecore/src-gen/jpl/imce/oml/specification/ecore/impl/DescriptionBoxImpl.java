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

import jpl.imce.oml.specification.ecore.AnnotationEntry;
import jpl.imce.oml.specification.ecore.AnnotationProperty;
import jpl.imce.oml.specification.ecore.ConceptInstance;
import jpl.imce.oml.specification.ecore.DescriptionBox;
import jpl.imce.oml.specification.ecore.DescriptionBoxExtendsClosedWorldDefinitions;
import jpl.imce.oml.specification.ecore.DescriptionBoxRefinement;
import jpl.imce.oml.specification.ecore.DescriptionKind;
import jpl.imce.oml.specification.ecore.EcorePackage;
import jpl.imce.oml.specification.ecore.ReifiedRelationshipInstance;
import jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceDomain;
import jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceRange;
import jpl.imce.oml.specification.ecore.TerminologyExtent;
import jpl.imce.oml.specification.ecore.UnreifiedRelationshipInstanceTuple;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
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
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.DescriptionBoxImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.DescriptionBoxImpl#getDescriptionExtent <em>Description Extent</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.DescriptionBoxImpl#getClosedWorldDefinitions <em>Closed World Definitions</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.DescriptionBoxImpl#getDescriptionBoxRefinements <em>Description Box Refinements</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.DescriptionBoxImpl#getConceptInstances <em>Concept Instances</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.DescriptionBoxImpl#getReifiedRelationshipInstances <em>Reified Relationship Instances</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.DescriptionBoxImpl#getReifiedRelationshipInstanceDomains <em>Reified Relationship Instance Domains</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.DescriptionBoxImpl#getReifiedRelationshipInstanceRanges <em>Reified Relationship Instance Ranges</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.DescriptionBoxImpl#getUnreifiedRelationshipInstanceTuples <em>Unreified Relationship Instance Tuples</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DescriptionBoxImpl extends ModuleImpl implements DescriptionBox {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final DescriptionKind KIND_EDEFAULT = DescriptionKind.FINAL;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected DescriptionKind kind = KIND_EDEFAULT;

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
	 * The cached value of the '{@link #getConceptInstances() <em>Concept Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptInstance> conceptInstances;

	/**
	 * The cached value of the '{@link #getReifiedRelationshipInstances() <em>Reified Relationship Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReifiedRelationshipInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ReifiedRelationshipInstance> reifiedRelationshipInstances;

	/**
	 * The cached value of the '{@link #getReifiedRelationshipInstanceDomains() <em>Reified Relationship Instance Domains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReifiedRelationshipInstanceDomains()
	 * @generated
	 * @ordered
	 */
	protected EList<ReifiedRelationshipInstanceDomain> reifiedRelationshipInstanceDomains;

	/**
	 * The cached value of the '{@link #getReifiedRelationshipInstanceRanges() <em>Reified Relationship Instance Ranges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReifiedRelationshipInstanceRanges()
	 * @generated
	 * @ordered
	 */
	protected EList<ReifiedRelationshipInstanceRange> reifiedRelationshipInstanceRanges;

	/**
	 * The cached value of the '{@link #getUnreifiedRelationshipInstanceTuples() <em>Unreified Relationship Instance Tuples</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnreifiedRelationshipInstanceTuples()
	 * @generated
	 * @ordered
	 */
	protected EList<UnreifiedRelationshipInstanceTuple> unreifiedRelationshipInstanceTuples;

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
		return EcorePackage.eINSTANCE.getDescriptionBox();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(DescriptionKind newKind) {
		DescriptionKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.DESCRIPTION_BOX__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyExtent getDescriptionExtent() {
		if (eContainerFeatureID() != EcorePackage.DESCRIPTION_BOX__DESCRIPTION_EXTENT) return null;
		return (TerminologyExtent)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyExtent basicGetDescriptionExtent() {
		if (eContainerFeatureID() != EcorePackage.DESCRIPTION_BOX__DESCRIPTION_EXTENT) return null;
		return (TerminologyExtent)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescriptionExtent(TerminologyExtent newDescriptionExtent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDescriptionExtent, EcorePackage.DESCRIPTION_BOX__DESCRIPTION_EXTENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionExtent(TerminologyExtent newDescriptionExtent) {
		if (newDescriptionExtent != eInternalContainer() || (eContainerFeatureID() != EcorePackage.DESCRIPTION_BOX__DESCRIPTION_EXTENT && newDescriptionExtent != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newDescriptionExtent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDescriptionExtent != null)
				msgs = ((InternalEObject)newDescriptionExtent).eInverseAdd(this, EcorePackage.TERMINOLOGY_EXTENT__DESCRIPTIONS, TerminologyExtent.class, msgs);
			msgs = basicSetDescriptionExtent(newDescriptionExtent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.DESCRIPTION_BOX__DESCRIPTION_EXTENT, newDescriptionExtent, newDescriptionExtent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionBoxExtendsClosedWorldDefinitions> getClosedWorldDefinitions() {
		if (closedWorldDefinitions == null) {
			closedWorldDefinitions = new EObjectContainmentWithInverseEList<DescriptionBoxExtendsClosedWorldDefinitions>(DescriptionBoxExtendsClosedWorldDefinitions.class, this, EcorePackage.DESCRIPTION_BOX__CLOSED_WORLD_DEFINITIONS, EcorePackage.DESCRIPTION_BOX_EXTENDS_CLOSED_WORLD_DEFINITIONS__DESCRIPTION_BOX);
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
			descriptionBoxRefinements = new EObjectContainmentWithInverseEList<DescriptionBoxRefinement>(DescriptionBoxRefinement.class, this, EcorePackage.DESCRIPTION_BOX__DESCRIPTION_BOX_REFINEMENTS, EcorePackage.DESCRIPTION_BOX_REFINEMENT__REFINING_DESCRIPTION_BOX);
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
			conceptInstances = new EObjectContainmentWithInverseEList<ConceptInstance>(ConceptInstance.class, this, EcorePackage.DESCRIPTION_BOX__CONCEPT_INSTANCES, EcorePackage.CONCEPT_INSTANCE__DESCRIPTION_BOX);
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
			reifiedRelationshipInstances = new EObjectContainmentWithInverseEList<ReifiedRelationshipInstance>(ReifiedRelationshipInstance.class, this, EcorePackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCES, EcorePackage.REIFIED_RELATIONSHIP_INSTANCE__DESCRIPTION_BOX);
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
			reifiedRelationshipInstanceDomains = new EObjectContainmentWithInverseEList<ReifiedRelationshipInstanceDomain>(ReifiedRelationshipInstanceDomain.class, this, EcorePackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCE_DOMAINS, EcorePackage.REIFIED_RELATIONSHIP_INSTANCE_DOMAIN__DESCRIPTION_BOX);
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
			reifiedRelationshipInstanceRanges = new EObjectContainmentWithInverseEList<ReifiedRelationshipInstanceRange>(ReifiedRelationshipInstanceRange.class, this, EcorePackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCE_RANGES, EcorePackage.REIFIED_RELATIONSHIP_INSTANCE_RANGE__DESCRIPTION_BOX);
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
			unreifiedRelationshipInstanceTuples = new EObjectContainmentWithInverseEList<UnreifiedRelationshipInstanceTuple>(UnreifiedRelationshipInstanceTuple.class, this, EcorePackage.DESCRIPTION_BOX__UNREIFIED_RELATIONSHIP_INSTANCE_TUPLES, EcorePackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__DESCRIPTION_BOX);
		}
		return unreifiedRelationshipInstanceTuples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionBox withAnnotations(EMap<AnnotationProperty, EList<AnnotationEntry>> a) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyExtent extent() {
		return this.getDescriptionExtent();
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
			case EcorePackage.DESCRIPTION_BOX__DESCRIPTION_EXTENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDescriptionExtent((TerminologyExtent)otherEnd, msgs);
			case EcorePackage.DESCRIPTION_BOX__CLOSED_WORLD_DEFINITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClosedWorldDefinitions()).basicAdd(otherEnd, msgs);
			case EcorePackage.DESCRIPTION_BOX__DESCRIPTION_BOX_REFINEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDescriptionBoxRefinements()).basicAdd(otherEnd, msgs);
			case EcorePackage.DESCRIPTION_BOX__CONCEPT_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConceptInstances()).basicAdd(otherEnd, msgs);
			case EcorePackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReifiedRelationshipInstances()).basicAdd(otherEnd, msgs);
			case EcorePackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCE_DOMAINS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReifiedRelationshipInstanceDomains()).basicAdd(otherEnd, msgs);
			case EcorePackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCE_RANGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReifiedRelationshipInstanceRanges()).basicAdd(otherEnd, msgs);
			case EcorePackage.DESCRIPTION_BOX__UNREIFIED_RELATIONSHIP_INSTANCE_TUPLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUnreifiedRelationshipInstanceTuples()).basicAdd(otherEnd, msgs);
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
			case EcorePackage.DESCRIPTION_BOX__DESCRIPTION_EXTENT:
				return basicSetDescriptionExtent(null, msgs);
			case EcorePackage.DESCRIPTION_BOX__CLOSED_WORLD_DEFINITIONS:
				return ((InternalEList<?>)getClosedWorldDefinitions()).basicRemove(otherEnd, msgs);
			case EcorePackage.DESCRIPTION_BOX__DESCRIPTION_BOX_REFINEMENTS:
				return ((InternalEList<?>)getDescriptionBoxRefinements()).basicRemove(otherEnd, msgs);
			case EcorePackage.DESCRIPTION_BOX__CONCEPT_INSTANCES:
				return ((InternalEList<?>)getConceptInstances()).basicRemove(otherEnd, msgs);
			case EcorePackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCES:
				return ((InternalEList<?>)getReifiedRelationshipInstances()).basicRemove(otherEnd, msgs);
			case EcorePackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCE_DOMAINS:
				return ((InternalEList<?>)getReifiedRelationshipInstanceDomains()).basicRemove(otherEnd, msgs);
			case EcorePackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCE_RANGES:
				return ((InternalEList<?>)getReifiedRelationshipInstanceRanges()).basicRemove(otherEnd, msgs);
			case EcorePackage.DESCRIPTION_BOX__UNREIFIED_RELATIONSHIP_INSTANCE_TUPLES:
				return ((InternalEList<?>)getUnreifiedRelationshipInstanceTuples()).basicRemove(otherEnd, msgs);
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
			case EcorePackage.DESCRIPTION_BOX__DESCRIPTION_EXTENT:
				return eInternalContainer().eInverseRemove(this, EcorePackage.TERMINOLOGY_EXTENT__DESCRIPTIONS, TerminologyExtent.class, msgs);
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
			case EcorePackage.DESCRIPTION_BOX__KIND:
				return getKind();
			case EcorePackage.DESCRIPTION_BOX__DESCRIPTION_EXTENT:
				if (resolve) return getDescriptionExtent();
				return basicGetDescriptionExtent();
			case EcorePackage.DESCRIPTION_BOX__CLOSED_WORLD_DEFINITIONS:
				return getClosedWorldDefinitions();
			case EcorePackage.DESCRIPTION_BOX__DESCRIPTION_BOX_REFINEMENTS:
				return getDescriptionBoxRefinements();
			case EcorePackage.DESCRIPTION_BOX__CONCEPT_INSTANCES:
				return getConceptInstances();
			case EcorePackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCES:
				return getReifiedRelationshipInstances();
			case EcorePackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCE_DOMAINS:
				return getReifiedRelationshipInstanceDomains();
			case EcorePackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCE_RANGES:
				return getReifiedRelationshipInstanceRanges();
			case EcorePackage.DESCRIPTION_BOX__UNREIFIED_RELATIONSHIP_INSTANCE_TUPLES:
				return getUnreifiedRelationshipInstanceTuples();
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
			case EcorePackage.DESCRIPTION_BOX__KIND:
				setKind((DescriptionKind)newValue);
				return;
			case EcorePackage.DESCRIPTION_BOX__DESCRIPTION_EXTENT:
				setDescriptionExtent((TerminologyExtent)newValue);
				return;
			case EcorePackage.DESCRIPTION_BOX__CLOSED_WORLD_DEFINITIONS:
				getClosedWorldDefinitions().clear();
				getClosedWorldDefinitions().addAll((Collection<? extends DescriptionBoxExtendsClosedWorldDefinitions>)newValue);
				return;
			case EcorePackage.DESCRIPTION_BOX__DESCRIPTION_BOX_REFINEMENTS:
				getDescriptionBoxRefinements().clear();
				getDescriptionBoxRefinements().addAll((Collection<? extends DescriptionBoxRefinement>)newValue);
				return;
			case EcorePackage.DESCRIPTION_BOX__CONCEPT_INSTANCES:
				getConceptInstances().clear();
				getConceptInstances().addAll((Collection<? extends ConceptInstance>)newValue);
				return;
			case EcorePackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCES:
				getReifiedRelationshipInstances().clear();
				getReifiedRelationshipInstances().addAll((Collection<? extends ReifiedRelationshipInstance>)newValue);
				return;
			case EcorePackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCE_DOMAINS:
				getReifiedRelationshipInstanceDomains().clear();
				getReifiedRelationshipInstanceDomains().addAll((Collection<? extends ReifiedRelationshipInstanceDomain>)newValue);
				return;
			case EcorePackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCE_RANGES:
				getReifiedRelationshipInstanceRanges().clear();
				getReifiedRelationshipInstanceRanges().addAll((Collection<? extends ReifiedRelationshipInstanceRange>)newValue);
				return;
			case EcorePackage.DESCRIPTION_BOX__UNREIFIED_RELATIONSHIP_INSTANCE_TUPLES:
				getUnreifiedRelationshipInstanceTuples().clear();
				getUnreifiedRelationshipInstanceTuples().addAll((Collection<? extends UnreifiedRelationshipInstanceTuple>)newValue);
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
			case EcorePackage.DESCRIPTION_BOX__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case EcorePackage.DESCRIPTION_BOX__DESCRIPTION_EXTENT:
				setDescriptionExtent((TerminologyExtent)null);
				return;
			case EcorePackage.DESCRIPTION_BOX__CLOSED_WORLD_DEFINITIONS:
				getClosedWorldDefinitions().clear();
				return;
			case EcorePackage.DESCRIPTION_BOX__DESCRIPTION_BOX_REFINEMENTS:
				getDescriptionBoxRefinements().clear();
				return;
			case EcorePackage.DESCRIPTION_BOX__CONCEPT_INSTANCES:
				getConceptInstances().clear();
				return;
			case EcorePackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCES:
				getReifiedRelationshipInstances().clear();
				return;
			case EcorePackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCE_DOMAINS:
				getReifiedRelationshipInstanceDomains().clear();
				return;
			case EcorePackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCE_RANGES:
				getReifiedRelationshipInstanceRanges().clear();
				return;
			case EcorePackage.DESCRIPTION_BOX__UNREIFIED_RELATIONSHIP_INSTANCE_TUPLES:
				getUnreifiedRelationshipInstanceTuples().clear();
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
			case EcorePackage.DESCRIPTION_BOX__KIND:
				return kind != KIND_EDEFAULT;
			case EcorePackage.DESCRIPTION_BOX__DESCRIPTION_EXTENT:
				return basicGetDescriptionExtent() != null;
			case EcorePackage.DESCRIPTION_BOX__CLOSED_WORLD_DEFINITIONS:
				return closedWorldDefinitions != null && !closedWorldDefinitions.isEmpty();
			case EcorePackage.DESCRIPTION_BOX__DESCRIPTION_BOX_REFINEMENTS:
				return descriptionBoxRefinements != null && !descriptionBoxRefinements.isEmpty();
			case EcorePackage.DESCRIPTION_BOX__CONCEPT_INSTANCES:
				return conceptInstances != null && !conceptInstances.isEmpty();
			case EcorePackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCES:
				return reifiedRelationshipInstances != null && !reifiedRelationshipInstances.isEmpty();
			case EcorePackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCE_DOMAINS:
				return reifiedRelationshipInstanceDomains != null && !reifiedRelationshipInstanceDomains.isEmpty();
			case EcorePackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCE_RANGES:
				return reifiedRelationshipInstanceRanges != null && !reifiedRelationshipInstanceRanges.isEmpty();
			case EcorePackage.DESCRIPTION_BOX__UNREIFIED_RELATIONSHIP_INSTANCE_TUPLES:
				return unreifiedRelationshipInstanceTuples != null && !unreifiedRelationshipInstanceTuples.isEmpty();
		}
		return super.eIsSet(featureID);
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
			case EcorePackage.DESCRIPTION_BOX___WITH_ANNOTATIONS__EMAP:
				return withAnnotations((EMap<AnnotationProperty, EList<AnnotationEntry>>)arguments.get(0));
			case EcorePackage.DESCRIPTION_BOX___EXTENT:
				return extent();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //DescriptionBoxImpl
