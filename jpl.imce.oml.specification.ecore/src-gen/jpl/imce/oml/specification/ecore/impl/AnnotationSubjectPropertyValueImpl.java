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

import jpl.imce.oml.specification.ecore.AnnotationProperty;
import jpl.imce.oml.specification.ecore.AnnotationSubjectPropertyValue;
import jpl.imce.oml.specification.ecore.OMLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Subject Property Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.AnnotationSubjectPropertyValueImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.AnnotationSubjectPropertyValueImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationSubjectPropertyValueImpl extends CDOObjectImpl implements AnnotationSubjectPropertyValue {
	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected AnnotationProperty property;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationSubjectPropertyValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMLPackage.eINSTANCE.getAnnotationSubjectPropertyValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationProperty getProperty() {
		if (property != null && ((EObject)property).eIsProxy()) {
			InternalEObject oldProperty = (InternalEObject)property;
			property = (AnnotationProperty)eResolveProxy(oldProperty);
			if (property != oldProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMLPackage.ANNOTATION_SUBJECT_PROPERTY_VALUE__PROPERTY, oldProperty, property));
			}
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationProperty basicGetProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(AnnotationProperty newProperty) {
		AnnotationProperty oldProperty = property;
		property = newProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.ANNOTATION_SUBJECT_PROPERTY_VALUE__PROPERTY, oldProperty, property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.ANNOTATION_SUBJECT_PROPERTY_VALUE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMLPackage.ANNOTATION_SUBJECT_PROPERTY_VALUE__PROPERTY:
				if (resolve) return getProperty();
				return basicGetProperty();
			case OMLPackage.ANNOTATION_SUBJECT_PROPERTY_VALUE__VALUE:
				return getValue();
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
			case OMLPackage.ANNOTATION_SUBJECT_PROPERTY_VALUE__PROPERTY:
				setProperty((AnnotationProperty)newValue);
				return;
			case OMLPackage.ANNOTATION_SUBJECT_PROPERTY_VALUE__VALUE:
				setValue((String)newValue);
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
			case OMLPackage.ANNOTATION_SUBJECT_PROPERTY_VALUE__PROPERTY:
				setProperty((AnnotationProperty)null);
				return;
			case OMLPackage.ANNOTATION_SUBJECT_PROPERTY_VALUE__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case OMLPackage.ANNOTATION_SUBJECT_PROPERTY_VALUE__PROPERTY:
				return property != null;
			case OMLPackage.ANNOTATION_SUBJECT_PROPERTY_VALUE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //AnnotationSubjectPropertyValueImpl
