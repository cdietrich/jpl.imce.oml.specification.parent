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

import jpl.imce.oml.specification.ecore.DataRelationshipToStructure;
import jpl.imce.oml.specification.ecore.DataStructureTuple;
import jpl.imce.oml.specification.ecore.OMLPackage;
import jpl.imce.oml.specification.ecore.SingletonInstance;
import jpl.imce.oml.specification.ecore.StructuredDataPropertyValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Data Property Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.StructuredDataPropertyValueImpl#getSingletonInstance <em>Singleton Instance</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.StructuredDataPropertyValueImpl#getStructuredDataProperty <em>Structured Data Property</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.StructuredDataPropertyValueImpl#getStructuredPropertyTuple <em>Structured Property Tuple</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructuredDataPropertyValueImpl extends TerminologyInstanceAssertionImpl implements StructuredDataPropertyValue {
	/**
	 * The cached value of the '{@link #getSingletonInstance() <em>Singleton Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingletonInstance()
	 * @generated
	 * @ordered
	 */
	protected SingletonInstance singletonInstance;

	/**
	 * The cached value of the '{@link #getStructuredDataProperty() <em>Structured Data Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuredDataProperty()
	 * @generated
	 * @ordered
	 */
	protected DataRelationshipToStructure structuredDataProperty;

	/**
	 * The cached value of the '{@link #getStructuredPropertyTuple() <em>Structured Property Tuple</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuredPropertyTuple()
	 * @generated
	 * @ordered
	 */
	protected DataStructureTuple structuredPropertyTuple;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredDataPropertyValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMLPackage.Literals.STRUCTURED_DATA_PROPERTY_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingletonInstance getSingletonInstance() {
		if (singletonInstance != null && ((EObject)singletonInstance).eIsProxy()) {
			InternalEObject oldSingletonInstance = (InternalEObject)singletonInstance;
			singletonInstance = (SingletonInstance)eResolveProxy(oldSingletonInstance);
			if (singletonInstance != oldSingletonInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE__SINGLETON_INSTANCE, oldSingletonInstance, singletonInstance));
			}
		}
		return singletonInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingletonInstance basicGetSingletonInstance() {
		return singletonInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingletonInstance(SingletonInstance newSingletonInstance) {
		SingletonInstance oldSingletonInstance = singletonInstance;
		singletonInstance = newSingletonInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE__SINGLETON_INSTANCE, oldSingletonInstance, singletonInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRelationshipToStructure getStructuredDataProperty() {
		if (structuredDataProperty != null && ((EObject)structuredDataProperty).eIsProxy()) {
			InternalEObject oldStructuredDataProperty = (InternalEObject)structuredDataProperty;
			structuredDataProperty = (DataRelationshipToStructure)eResolveProxy(oldStructuredDataProperty);
			if (structuredDataProperty != oldStructuredDataProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE__STRUCTURED_DATA_PROPERTY, oldStructuredDataProperty, structuredDataProperty));
			}
		}
		return structuredDataProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRelationshipToStructure basicGetStructuredDataProperty() {
		return structuredDataProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructuredDataProperty(DataRelationshipToStructure newStructuredDataProperty) {
		DataRelationshipToStructure oldStructuredDataProperty = structuredDataProperty;
		structuredDataProperty = newStructuredDataProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE__STRUCTURED_DATA_PROPERTY, oldStructuredDataProperty, structuredDataProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStructureTuple getStructuredPropertyTuple() {
		if (structuredPropertyTuple != null && ((EObject)structuredPropertyTuple).eIsProxy()) {
			InternalEObject oldStructuredPropertyTuple = (InternalEObject)structuredPropertyTuple;
			structuredPropertyTuple = (DataStructureTuple)eResolveProxy(oldStructuredPropertyTuple);
			if (structuredPropertyTuple != oldStructuredPropertyTuple) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE__STRUCTURED_PROPERTY_TUPLE, oldStructuredPropertyTuple, structuredPropertyTuple));
			}
		}
		return structuredPropertyTuple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStructureTuple basicGetStructuredPropertyTuple() {
		return structuredPropertyTuple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructuredPropertyTuple(DataStructureTuple newStructuredPropertyTuple) {
		DataStructureTuple oldStructuredPropertyTuple = structuredPropertyTuple;
		structuredPropertyTuple = newStructuredPropertyTuple;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE__STRUCTURED_PROPERTY_TUPLE, oldStructuredPropertyTuple, structuredPropertyTuple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE__SINGLETON_INSTANCE:
				if (resolve) return getSingletonInstance();
				return basicGetSingletonInstance();
			case OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE__STRUCTURED_DATA_PROPERTY:
				if (resolve) return getStructuredDataProperty();
				return basicGetStructuredDataProperty();
			case OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE__STRUCTURED_PROPERTY_TUPLE:
				if (resolve) return getStructuredPropertyTuple();
				return basicGetStructuredPropertyTuple();
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
			case OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE__SINGLETON_INSTANCE:
				setSingletonInstance((SingletonInstance)newValue);
				return;
			case OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE__STRUCTURED_DATA_PROPERTY:
				setStructuredDataProperty((DataRelationshipToStructure)newValue);
				return;
			case OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE__STRUCTURED_PROPERTY_TUPLE:
				setStructuredPropertyTuple((DataStructureTuple)newValue);
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
			case OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE__SINGLETON_INSTANCE:
				setSingletonInstance((SingletonInstance)null);
				return;
			case OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE__STRUCTURED_DATA_PROPERTY:
				setStructuredDataProperty((DataRelationshipToStructure)null);
				return;
			case OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE__STRUCTURED_PROPERTY_TUPLE:
				setStructuredPropertyTuple((DataStructureTuple)null);
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
			case OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE__SINGLETON_INSTANCE:
				return singletonInstance != null;
			case OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE__STRUCTURED_DATA_PROPERTY:
				return structuredDataProperty != null;
			case OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE__STRUCTURED_PROPERTY_TUPLE:
				return structuredPropertyTuple != null;
		}
		return super.eIsSet(featureID);
	}

} //StructuredDataPropertyValueImpl
