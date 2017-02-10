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

import jpl.imce.oml.specification.ecore.OMLPackage;
import jpl.imce.oml.specification.ecore.TerminologyExtent;
import jpl.imce.oml.specification.ecore.TerminologyInstanceAssertion;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminology Instance Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.TerminologyInstanceAssertionImpl#getTerminologyExtent <em>Terminology Extent</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TerminologyInstanceAssertionImpl extends TerminologyThingImpl implements TerminologyInstanceAssertion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminologyInstanceAssertionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMLPackage.Literals.TERMINOLOGY_INSTANCE_ASSERTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyExtent getTerminologyExtent() {
		if (eContainerFeatureID() != OMLPackage.TERMINOLOGY_INSTANCE_ASSERTION__TERMINOLOGY_EXTENT) return null;
		return (TerminologyExtent)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyExtent basicGetTerminologyExtent() {
		if (eContainerFeatureID() != OMLPackage.TERMINOLOGY_INSTANCE_ASSERTION__TERMINOLOGY_EXTENT) return null;
		return (TerminologyExtent)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerminologyExtent(TerminologyExtent newTerminologyExtent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTerminologyExtent, OMLPackage.TERMINOLOGY_INSTANCE_ASSERTION__TERMINOLOGY_EXTENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminologyExtent(TerminologyExtent newTerminologyExtent) {
		if (newTerminologyExtent != eInternalContainer() || (eContainerFeatureID() != OMLPackage.TERMINOLOGY_INSTANCE_ASSERTION__TERMINOLOGY_EXTENT && newTerminologyExtent != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newTerminologyExtent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTerminologyExtent != null)
				msgs = ((InternalEObject)newTerminologyExtent).eInverseAdd(this, OMLPackage.TERMINOLOGY_EXTENT__INSTANCE_ASSERTIONS, TerminologyExtent.class, msgs);
			msgs = basicSetTerminologyExtent(newTerminologyExtent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.TERMINOLOGY_INSTANCE_ASSERTION__TERMINOLOGY_EXTENT, newTerminologyExtent, newTerminologyExtent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMLPackage.TERMINOLOGY_INSTANCE_ASSERTION__TERMINOLOGY_EXTENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTerminologyExtent((TerminologyExtent)otherEnd, msgs);
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
			case OMLPackage.TERMINOLOGY_INSTANCE_ASSERTION__TERMINOLOGY_EXTENT:
				return basicSetTerminologyExtent(null, msgs);
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
			case OMLPackage.TERMINOLOGY_INSTANCE_ASSERTION__TERMINOLOGY_EXTENT:
				return eInternalContainer().eInverseRemove(this, OMLPackage.TERMINOLOGY_EXTENT__INSTANCE_ASSERTIONS, TerminologyExtent.class, msgs);
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
			case OMLPackage.TERMINOLOGY_INSTANCE_ASSERTION__TERMINOLOGY_EXTENT:
				if (resolve) return getTerminologyExtent();
				return basicGetTerminologyExtent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OMLPackage.TERMINOLOGY_INSTANCE_ASSERTION__TERMINOLOGY_EXTENT:
				setTerminologyExtent((TerminologyExtent)newValue);
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
			case OMLPackage.TERMINOLOGY_INSTANCE_ASSERTION__TERMINOLOGY_EXTENT:
				setTerminologyExtent((TerminologyExtent)null);
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
			case OMLPackage.TERMINOLOGY_INSTANCE_ASSERTION__TERMINOLOGY_EXTENT:
				return basicGetTerminologyExtent() != null;
		}
		return super.eIsSet(featureID);
	}

} //TerminologyInstanceAssertionImpl
