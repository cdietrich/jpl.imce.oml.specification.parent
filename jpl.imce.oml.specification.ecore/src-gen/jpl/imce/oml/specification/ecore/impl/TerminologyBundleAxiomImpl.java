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

import jpl.imce.oml.specification.ecore.Bundle;
import jpl.imce.oml.specification.ecore.OMLPackage;
import jpl.imce.oml.specification.ecore.TerminologyBundleAxiom;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminology Bundle Axiom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.TerminologyBundleAxiomImpl#getTerminologyBundle <em>Terminology Bundle</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TerminologyBundleAxiomImpl extends TerminologyAxiomImpl implements TerminologyBundleAxiom {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminologyBundleAxiomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMLPackage.Literals.TERMINOLOGY_BUNDLE_AXIOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bundle getTerminologyBundle() {
		if (eContainerFeatureID() != OMLPackage.TERMINOLOGY_BUNDLE_AXIOM__TERMINOLOGY_BUNDLE) return null;
		return (Bundle)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bundle basicGetTerminologyBundle() {
		if (eContainerFeatureID() != OMLPackage.TERMINOLOGY_BUNDLE_AXIOM__TERMINOLOGY_BUNDLE) return null;
		return (Bundle)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerminologyBundle(Bundle newTerminologyBundle, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTerminologyBundle, OMLPackage.TERMINOLOGY_BUNDLE_AXIOM__TERMINOLOGY_BUNDLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminologyBundle(Bundle newTerminologyBundle) {
		if (newTerminologyBundle != eInternalContainer() || (eContainerFeatureID() != OMLPackage.TERMINOLOGY_BUNDLE_AXIOM__TERMINOLOGY_BUNDLE && newTerminologyBundle != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newTerminologyBundle))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTerminologyBundle != null)
				msgs = ((InternalEObject)newTerminologyBundle).eInverseAdd(this, OMLPackage.BUNDLE__TERMINOLOGY_BUNDLE_AXIOMS, Bundle.class, msgs);
			msgs = basicSetTerminologyBundle(newTerminologyBundle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.TERMINOLOGY_BUNDLE_AXIOM__TERMINOLOGY_BUNDLE, newTerminologyBundle, newTerminologyBundle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMLPackage.TERMINOLOGY_BUNDLE_AXIOM__TERMINOLOGY_BUNDLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTerminologyBundle((Bundle)otherEnd, msgs);
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
			case OMLPackage.TERMINOLOGY_BUNDLE_AXIOM__TERMINOLOGY_BUNDLE:
				return basicSetTerminologyBundle(null, msgs);
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
			case OMLPackage.TERMINOLOGY_BUNDLE_AXIOM__TERMINOLOGY_BUNDLE:
				return eInternalContainer().eInverseRemove(this, OMLPackage.BUNDLE__TERMINOLOGY_BUNDLE_AXIOMS, Bundle.class, msgs);
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
			case OMLPackage.TERMINOLOGY_BUNDLE_AXIOM__TERMINOLOGY_BUNDLE:
				if (resolve) return getTerminologyBundle();
				return basicGetTerminologyBundle();
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
			case OMLPackage.TERMINOLOGY_BUNDLE_AXIOM__TERMINOLOGY_BUNDLE:
				setTerminologyBundle((Bundle)newValue);
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
			case OMLPackage.TERMINOLOGY_BUNDLE_AXIOM__TERMINOLOGY_BUNDLE:
				setTerminologyBundle((Bundle)null);
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
			case OMLPackage.TERMINOLOGY_BUNDLE_AXIOM__TERMINOLOGY_BUNDLE:
				return basicGetTerminologyBundle() != null;
		}
		return super.eIsSet(featureID);
	}

} //TerminologyBundleAxiomImpl
