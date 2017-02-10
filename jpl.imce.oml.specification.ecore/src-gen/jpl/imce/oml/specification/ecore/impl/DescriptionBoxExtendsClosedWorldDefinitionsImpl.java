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

import jpl.imce.oml.specification.ecore.DescriptionBox;
import jpl.imce.oml.specification.ecore.DescriptionBoxExtendsClosedWorldDefinitions;
import jpl.imce.oml.specification.ecore.OMLPackage;
import jpl.imce.oml.specification.ecore.TerminologyBox;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Description Box Extends Closed World Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.DescriptionBoxExtendsClosedWorldDefinitionsImpl#getDescriptionBox <em>Description Box</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.DescriptionBoxExtendsClosedWorldDefinitionsImpl#getClosedWorldDefinitions <em>Closed World Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DescriptionBoxExtendsClosedWorldDefinitionsImpl extends TerminologyThingImpl implements DescriptionBoxExtendsClosedWorldDefinitions {
	/**
	 * The cached value of the '{@link #getClosedWorldDefinitions() <em>Closed World Definitions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosedWorldDefinitions()
	 * @generated
	 * @ordered
	 */
	protected TerminologyBox closedWorldDefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescriptionBoxExtendsClosedWorldDefinitionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMLPackage.Literals.DESCRIPTION_BOX_EXTENDS_CLOSED_WORLD_DEFINITIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionBox getDescriptionBox() {
		if (eContainerFeatureID() != OMLPackage.DESCRIPTION_BOX_EXTENDS_CLOSED_WORLD_DEFINITIONS__DESCRIPTION_BOX) return null;
		return (DescriptionBox)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionBox basicGetDescriptionBox() {
		if (eContainerFeatureID() != OMLPackage.DESCRIPTION_BOX_EXTENDS_CLOSED_WORLD_DEFINITIONS__DESCRIPTION_BOX) return null;
		return (DescriptionBox)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescriptionBox(DescriptionBox newDescriptionBox, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDescriptionBox, OMLPackage.DESCRIPTION_BOX_EXTENDS_CLOSED_WORLD_DEFINITIONS__DESCRIPTION_BOX, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionBox(DescriptionBox newDescriptionBox) {
		if (newDescriptionBox != eInternalContainer() || (eContainerFeatureID() != OMLPackage.DESCRIPTION_BOX_EXTENDS_CLOSED_WORLD_DEFINITIONS__DESCRIPTION_BOX && newDescriptionBox != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newDescriptionBox))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDescriptionBox != null)
				msgs = ((InternalEObject)newDescriptionBox).eInverseAdd(this, OMLPackage.DESCRIPTION_BOX__CLOSED_WORLD_DEFINITIONS, DescriptionBox.class, msgs);
			msgs = basicSetDescriptionBox(newDescriptionBox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.DESCRIPTION_BOX_EXTENDS_CLOSED_WORLD_DEFINITIONS__DESCRIPTION_BOX, newDescriptionBox, newDescriptionBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyBox getClosedWorldDefinitions() {
		if (closedWorldDefinitions != null && ((EObject)closedWorldDefinitions).eIsProxy()) {
			InternalEObject oldClosedWorldDefinitions = (InternalEObject)closedWorldDefinitions;
			closedWorldDefinitions = (TerminologyBox)eResolveProxy(oldClosedWorldDefinitions);
			if (closedWorldDefinitions != oldClosedWorldDefinitions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMLPackage.DESCRIPTION_BOX_EXTENDS_CLOSED_WORLD_DEFINITIONS__CLOSED_WORLD_DEFINITIONS, oldClosedWorldDefinitions, closedWorldDefinitions));
			}
		}
		return closedWorldDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyBox basicGetClosedWorldDefinitions() {
		return closedWorldDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClosedWorldDefinitions(TerminologyBox newClosedWorldDefinitions) {
		TerminologyBox oldClosedWorldDefinitions = closedWorldDefinitions;
		closedWorldDefinitions = newClosedWorldDefinitions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.DESCRIPTION_BOX_EXTENDS_CLOSED_WORLD_DEFINITIONS__CLOSED_WORLD_DEFINITIONS, oldClosedWorldDefinitions, closedWorldDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMLPackage.DESCRIPTION_BOX_EXTENDS_CLOSED_WORLD_DEFINITIONS__DESCRIPTION_BOX:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDescriptionBox((DescriptionBox)otherEnd, msgs);
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
			case OMLPackage.DESCRIPTION_BOX_EXTENDS_CLOSED_WORLD_DEFINITIONS__DESCRIPTION_BOX:
				return basicSetDescriptionBox(null, msgs);
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
			case OMLPackage.DESCRIPTION_BOX_EXTENDS_CLOSED_WORLD_DEFINITIONS__DESCRIPTION_BOX:
				return eInternalContainer().eInverseRemove(this, OMLPackage.DESCRIPTION_BOX__CLOSED_WORLD_DEFINITIONS, DescriptionBox.class, msgs);
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
			case OMLPackage.DESCRIPTION_BOX_EXTENDS_CLOSED_WORLD_DEFINITIONS__DESCRIPTION_BOX:
				if (resolve) return getDescriptionBox();
				return basicGetDescriptionBox();
			case OMLPackage.DESCRIPTION_BOX_EXTENDS_CLOSED_WORLD_DEFINITIONS__CLOSED_WORLD_DEFINITIONS:
				if (resolve) return getClosedWorldDefinitions();
				return basicGetClosedWorldDefinitions();
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
			case OMLPackage.DESCRIPTION_BOX_EXTENDS_CLOSED_WORLD_DEFINITIONS__DESCRIPTION_BOX:
				setDescriptionBox((DescriptionBox)newValue);
				return;
			case OMLPackage.DESCRIPTION_BOX_EXTENDS_CLOSED_WORLD_DEFINITIONS__CLOSED_WORLD_DEFINITIONS:
				setClosedWorldDefinitions((TerminologyBox)newValue);
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
			case OMLPackage.DESCRIPTION_BOX_EXTENDS_CLOSED_WORLD_DEFINITIONS__DESCRIPTION_BOX:
				setDescriptionBox((DescriptionBox)null);
				return;
			case OMLPackage.DESCRIPTION_BOX_EXTENDS_CLOSED_WORLD_DEFINITIONS__CLOSED_WORLD_DEFINITIONS:
				setClosedWorldDefinitions((TerminologyBox)null);
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
			case OMLPackage.DESCRIPTION_BOX_EXTENDS_CLOSED_WORLD_DEFINITIONS__DESCRIPTION_BOX:
				return basicGetDescriptionBox() != null;
			case OMLPackage.DESCRIPTION_BOX_EXTENDS_CLOSED_WORLD_DEFINITIONS__CLOSED_WORLD_DEFINITIONS:
				return closedWorldDefinitions != null;
		}
		return super.eIsSet(featureID);
	}

} //DescriptionBoxExtendsClosedWorldDefinitionsImpl
