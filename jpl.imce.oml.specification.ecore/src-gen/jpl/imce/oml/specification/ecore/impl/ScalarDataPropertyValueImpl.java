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

import jpl.imce.oml.specification.ecore.DataRelationshipToScalar;
import jpl.imce.oml.specification.ecore.OMLPackage;
import jpl.imce.oml.specification.ecore.ScalarDataPropertyValue;
import jpl.imce.oml.specification.ecore.SingletonInstance;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scalar Data Property Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.ScalarDataPropertyValueImpl#getSingletonInstance <em>Singleton Instance</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.ScalarDataPropertyValueImpl#getScalarDataProperty <em>Scalar Data Property</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.ScalarDataPropertyValueImpl#getScalarPropertyValue <em>Scalar Property Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScalarDataPropertyValueImpl extends TerminologyInstanceAssertionImpl implements ScalarDataPropertyValue {
	/**
	 * The cached value of the '{@link #getScalarDataProperty() <em>Scalar Data Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalarDataProperty()
	 * @generated
	 * @ordered
	 */
	protected DataRelationshipToScalar scalarDataProperty;

	/**
	 * The default value of the '{@link #getScalarPropertyValue() <em>Scalar Property Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalarPropertyValue()
	 * @generated
	 * @ordered
	 */
	protected static final String SCALAR_PROPERTY_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScalarPropertyValue() <em>Scalar Property Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalarPropertyValue()
	 * @generated
	 * @ordered
	 */
	protected String scalarPropertyValue = SCALAR_PROPERTY_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScalarDataPropertyValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMLPackage.Literals.SCALAR_DATA_PROPERTY_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingletonInstance getSingletonInstance() {
		if (eContainerFeatureID() != OMLPackage.SCALAR_DATA_PROPERTY_VALUE__SINGLETON_INSTANCE) return null;
		return (SingletonInstance)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingletonInstance basicGetSingletonInstance() {
		if (eContainerFeatureID() != OMLPackage.SCALAR_DATA_PROPERTY_VALUE__SINGLETON_INSTANCE) return null;
		return (SingletonInstance)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSingletonInstance(SingletonInstance newSingletonInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSingletonInstance, OMLPackage.SCALAR_DATA_PROPERTY_VALUE__SINGLETON_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingletonInstance(SingletonInstance newSingletonInstance) {
		if (newSingletonInstance != eInternalContainer() || (eContainerFeatureID() != OMLPackage.SCALAR_DATA_PROPERTY_VALUE__SINGLETON_INSTANCE && newSingletonInstance != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newSingletonInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSingletonInstance != null)
				msgs = ((InternalEObject)newSingletonInstance).eInverseAdd(this, OMLPackage.SINGLETON_INSTANCE__SCALAR_DATA_PROPERTY_VALUES, SingletonInstance.class, msgs);
			msgs = basicSetSingletonInstance(newSingletonInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.SCALAR_DATA_PROPERTY_VALUE__SINGLETON_INSTANCE, newSingletonInstance, newSingletonInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRelationshipToScalar getScalarDataProperty() {
		if (scalarDataProperty != null && ((EObject)scalarDataProperty).eIsProxy()) {
			InternalEObject oldScalarDataProperty = (InternalEObject)scalarDataProperty;
			scalarDataProperty = (DataRelationshipToScalar)eResolveProxy(oldScalarDataProperty);
			if (scalarDataProperty != oldScalarDataProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMLPackage.SCALAR_DATA_PROPERTY_VALUE__SCALAR_DATA_PROPERTY, oldScalarDataProperty, scalarDataProperty));
			}
		}
		return scalarDataProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRelationshipToScalar basicGetScalarDataProperty() {
		return scalarDataProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScalarDataProperty(DataRelationshipToScalar newScalarDataProperty) {
		DataRelationshipToScalar oldScalarDataProperty = scalarDataProperty;
		scalarDataProperty = newScalarDataProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.SCALAR_DATA_PROPERTY_VALUE__SCALAR_DATA_PROPERTY, oldScalarDataProperty, scalarDataProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScalarPropertyValue() {
		return scalarPropertyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScalarPropertyValue(String newScalarPropertyValue) {
		String oldScalarPropertyValue = scalarPropertyValue;
		scalarPropertyValue = newScalarPropertyValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.SCALAR_DATA_PROPERTY_VALUE__SCALAR_PROPERTY_VALUE, oldScalarPropertyValue, scalarPropertyValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMLPackage.SCALAR_DATA_PROPERTY_VALUE__SINGLETON_INSTANCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSingletonInstance((SingletonInstance)otherEnd, msgs);
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
			case OMLPackage.SCALAR_DATA_PROPERTY_VALUE__SINGLETON_INSTANCE:
				return basicSetSingletonInstance(null, msgs);
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
			case OMLPackage.SCALAR_DATA_PROPERTY_VALUE__SINGLETON_INSTANCE:
				return eInternalContainer().eInverseRemove(this, OMLPackage.SINGLETON_INSTANCE__SCALAR_DATA_PROPERTY_VALUES, SingletonInstance.class, msgs);
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
			case OMLPackage.SCALAR_DATA_PROPERTY_VALUE__SINGLETON_INSTANCE:
				if (resolve) return getSingletonInstance();
				return basicGetSingletonInstance();
			case OMLPackage.SCALAR_DATA_PROPERTY_VALUE__SCALAR_DATA_PROPERTY:
				if (resolve) return getScalarDataProperty();
				return basicGetScalarDataProperty();
			case OMLPackage.SCALAR_DATA_PROPERTY_VALUE__SCALAR_PROPERTY_VALUE:
				return getScalarPropertyValue();
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
			case OMLPackage.SCALAR_DATA_PROPERTY_VALUE__SINGLETON_INSTANCE:
				setSingletonInstance((SingletonInstance)newValue);
				return;
			case OMLPackage.SCALAR_DATA_PROPERTY_VALUE__SCALAR_DATA_PROPERTY:
				setScalarDataProperty((DataRelationshipToScalar)newValue);
				return;
			case OMLPackage.SCALAR_DATA_PROPERTY_VALUE__SCALAR_PROPERTY_VALUE:
				setScalarPropertyValue((String)newValue);
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
			case OMLPackage.SCALAR_DATA_PROPERTY_VALUE__SINGLETON_INSTANCE:
				setSingletonInstance((SingletonInstance)null);
				return;
			case OMLPackage.SCALAR_DATA_PROPERTY_VALUE__SCALAR_DATA_PROPERTY:
				setScalarDataProperty((DataRelationshipToScalar)null);
				return;
			case OMLPackage.SCALAR_DATA_PROPERTY_VALUE__SCALAR_PROPERTY_VALUE:
				setScalarPropertyValue(SCALAR_PROPERTY_VALUE_EDEFAULT);
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
			case OMLPackage.SCALAR_DATA_PROPERTY_VALUE__SINGLETON_INSTANCE:
				return basicGetSingletonInstance() != null;
			case OMLPackage.SCALAR_DATA_PROPERTY_VALUE__SCALAR_DATA_PROPERTY:
				return scalarDataProperty != null;
			case OMLPackage.SCALAR_DATA_PROPERTY_VALUE__SCALAR_PROPERTY_VALUE:
				return SCALAR_PROPERTY_VALUE_EDEFAULT == null ? scalarPropertyValue != null : !SCALAR_PROPERTY_VALUE_EDEFAULT.equals(scalarPropertyValue);
		}
		return super.eIsSet(featureID);
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
		result.append(" (scalarPropertyValue: ");
		result.append(scalarPropertyValue);
		result.append(')');
		return result.toString();
	}

} //ScalarDataPropertyValueImpl
