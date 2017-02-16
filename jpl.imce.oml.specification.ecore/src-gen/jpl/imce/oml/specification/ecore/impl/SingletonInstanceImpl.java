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

import java.util.Collection;

import jpl.imce.oml.specification.ecore.OMLPackage;
import jpl.imce.oml.specification.ecore.ScalarDataPropertyValue;
import jpl.imce.oml.specification.ecore.SingletonInstance;
import jpl.imce.oml.specification.ecore.StructuredDataPropertyValue;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Singleton Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.SingletonInstanceImpl#getScalarDataPropertyValues <em>Scalar Data Property Values</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.SingletonInstanceImpl#getStructuredDataPropertyValues <em>Structured Data Property Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SingletonInstanceImpl extends TerminologyInstanceAssertionImpl implements SingletonInstance {
	/**
	 * The cached value of the '{@link #getScalarDataPropertyValues() <em>Scalar Data Property Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalarDataPropertyValues()
	 * @generated
	 * @ordered
	 */
	protected EList<ScalarDataPropertyValue> scalarDataPropertyValues;

	/**
	 * The cached value of the '{@link #getStructuredDataPropertyValues() <em>Structured Data Property Values</em>}' containment reference list.
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
	protected SingletonInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMLPackage.eINSTANCE.getSingletonInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScalarDataPropertyValue> getScalarDataPropertyValues() {
		if (scalarDataPropertyValues == null) {
			scalarDataPropertyValues = new EObjectContainmentWithInverseEList<ScalarDataPropertyValue>(ScalarDataPropertyValue.class, this, OMLPackage.SINGLETON_INSTANCE__SCALAR_DATA_PROPERTY_VALUES, OMLPackage.SCALAR_DATA_PROPERTY_VALUE__SINGLETON_INSTANCE);
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
			structuredDataPropertyValues = new EObjectContainmentWithInverseEList<StructuredDataPropertyValue>(StructuredDataPropertyValue.class, this, OMLPackage.SINGLETON_INSTANCE__STRUCTURED_DATA_PROPERTY_VALUES, OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE__SINGLETON_INSTANCE);
		}
		return structuredDataPropertyValues;
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
			case OMLPackage.SINGLETON_INSTANCE__SCALAR_DATA_PROPERTY_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getScalarDataPropertyValues()).basicAdd(otherEnd, msgs);
			case OMLPackage.SINGLETON_INSTANCE__STRUCTURED_DATA_PROPERTY_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStructuredDataPropertyValues()).basicAdd(otherEnd, msgs);
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
			case OMLPackage.SINGLETON_INSTANCE__SCALAR_DATA_PROPERTY_VALUES:
				return ((InternalEList<?>)getScalarDataPropertyValues()).basicRemove(otherEnd, msgs);
			case OMLPackage.SINGLETON_INSTANCE__STRUCTURED_DATA_PROPERTY_VALUES:
				return ((InternalEList<?>)getStructuredDataPropertyValues()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMLPackage.SINGLETON_INSTANCE__SCALAR_DATA_PROPERTY_VALUES:
				return getScalarDataPropertyValues();
			case OMLPackage.SINGLETON_INSTANCE__STRUCTURED_DATA_PROPERTY_VALUES:
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
			case OMLPackage.SINGLETON_INSTANCE__SCALAR_DATA_PROPERTY_VALUES:
				getScalarDataPropertyValues().clear();
				getScalarDataPropertyValues().addAll((Collection<? extends ScalarDataPropertyValue>)newValue);
				return;
			case OMLPackage.SINGLETON_INSTANCE__STRUCTURED_DATA_PROPERTY_VALUES:
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
			case OMLPackage.SINGLETON_INSTANCE__SCALAR_DATA_PROPERTY_VALUES:
				getScalarDataPropertyValues().clear();
				return;
			case OMLPackage.SINGLETON_INSTANCE__STRUCTURED_DATA_PROPERTY_VALUES:
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
			case OMLPackage.SINGLETON_INSTANCE__SCALAR_DATA_PROPERTY_VALUES:
				return scalarDataPropertyValues != null && !scalarDataPropertyValues.isEmpty();
			case OMLPackage.SINGLETON_INSTANCE__STRUCTURED_DATA_PROPERTY_VALUES:
				return structuredDataPropertyValues != null && !structuredDataPropertyValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SingletonInstanceImpl
