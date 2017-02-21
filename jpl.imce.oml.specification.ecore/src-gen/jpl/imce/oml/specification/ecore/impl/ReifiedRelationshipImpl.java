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

import jpl.imce.oml.specification.ecore.ConceptualEntity;
import jpl.imce.oml.specification.ecore.Entity;
import jpl.imce.oml.specification.ecore.OMLPackage;
import jpl.imce.oml.specification.ecore.ReifiedRelationship;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reified Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.ReifiedRelationshipImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.ReifiedRelationshipImpl#getUnreifiedPropertyName <em>Unreified Property Name</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.ReifiedRelationshipImpl#getUnreifiedInversePropertyName <em>Unreified Inverse Property Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReifiedRelationshipImpl extends EntityRelationshipImpl implements ReifiedRelationship {
	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnreifiedPropertyName() <em>Unreified Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnreifiedPropertyName()
	 * @generated
	 * @ordered
	 */
	protected static final String UNREIFIED_PROPERTY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnreifiedPropertyName() <em>Unreified Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnreifiedPropertyName()
	 * @generated
	 * @ordered
	 */
	protected String unreifiedPropertyName = UNREIFIED_PROPERTY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnreifiedInversePropertyName() <em>Unreified Inverse Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnreifiedInversePropertyName()
	 * @generated
	 * @ordered
	 */
	protected static final String UNREIFIED_INVERSE_PROPERTY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnreifiedInversePropertyName() <em>Unreified Inverse Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnreifiedInversePropertyName()
	 * @generated
	 * @ordered
	 */
	protected String unreifiedInversePropertyName = UNREIFIED_INVERSE_PROPERTY_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReifiedRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMLPackage.eINSTANCE.getReifiedRelationship();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.REIFIED_RELATIONSHIP__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnreifiedPropertyName() {
		return unreifiedPropertyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnreifiedPropertyName(String newUnreifiedPropertyName) {
		String oldUnreifiedPropertyName = unreifiedPropertyName;
		unreifiedPropertyName = newUnreifiedPropertyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.REIFIED_RELATIONSHIP__UNREIFIED_PROPERTY_NAME, oldUnreifiedPropertyName, unreifiedPropertyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnreifiedInversePropertyName() {
		return unreifiedInversePropertyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnreifiedInversePropertyName(String newUnreifiedInversePropertyName) {
		String oldUnreifiedInversePropertyName = unreifiedInversePropertyName;
		unreifiedInversePropertyName = newUnreifiedInversePropertyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.REIFIED_RELATIONSHIP__UNREIFIED_INVERSE_PROPERTY_NAME, oldUnreifiedInversePropertyName, unreifiedInversePropertyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMLPackage.REIFIED_RELATIONSHIP__IS_ABSTRACT:
				return isIsAbstract();
			case OMLPackage.REIFIED_RELATIONSHIP__UNREIFIED_PROPERTY_NAME:
				return getUnreifiedPropertyName();
			case OMLPackage.REIFIED_RELATIONSHIP__UNREIFIED_INVERSE_PROPERTY_NAME:
				return getUnreifiedInversePropertyName();
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
			case OMLPackage.REIFIED_RELATIONSHIP__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case OMLPackage.REIFIED_RELATIONSHIP__UNREIFIED_PROPERTY_NAME:
				setUnreifiedPropertyName((String)newValue);
				return;
			case OMLPackage.REIFIED_RELATIONSHIP__UNREIFIED_INVERSE_PROPERTY_NAME:
				setUnreifiedInversePropertyName((String)newValue);
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
			case OMLPackage.REIFIED_RELATIONSHIP__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case OMLPackage.REIFIED_RELATIONSHIP__UNREIFIED_PROPERTY_NAME:
				setUnreifiedPropertyName(UNREIFIED_PROPERTY_NAME_EDEFAULT);
				return;
			case OMLPackage.REIFIED_RELATIONSHIP__UNREIFIED_INVERSE_PROPERTY_NAME:
				setUnreifiedInversePropertyName(UNREIFIED_INVERSE_PROPERTY_NAME_EDEFAULT);
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
			case OMLPackage.REIFIED_RELATIONSHIP__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case OMLPackage.REIFIED_RELATIONSHIP__UNREIFIED_PROPERTY_NAME:
				return UNREIFIED_PROPERTY_NAME_EDEFAULT == null ? unreifiedPropertyName != null : !UNREIFIED_PROPERTY_NAME_EDEFAULT.equals(unreifiedPropertyName);
			case OMLPackage.REIFIED_RELATIONSHIP__UNREIFIED_INVERSE_PROPERTY_NAME:
				return UNREIFIED_INVERSE_PROPERTY_NAME_EDEFAULT == null ? unreifiedInversePropertyName != null : !UNREIFIED_INVERSE_PROPERTY_NAME_EDEFAULT.equals(unreifiedInversePropertyName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Entity.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ConceptualEntity.class) {
			switch (derivedFeatureID) {
				case OMLPackage.REIFIED_RELATIONSHIP__IS_ABSTRACT: return OMLPackage.CONCEPTUAL_ENTITY__IS_ABSTRACT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Entity.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ConceptualEntity.class) {
			switch (baseFeatureID) {
				case OMLPackage.CONCEPTUAL_ENTITY__IS_ABSTRACT: return OMLPackage.REIFIED_RELATIONSHIP__IS_ABSTRACT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (isAbstract: ");
		result.append(isAbstract);
		result.append(", unreifiedPropertyName: ");
		result.append(unreifiedPropertyName);
		result.append(", unreifiedInversePropertyName: ");
		result.append(unreifiedInversePropertyName);
		result.append(')');
		return result.toString();
	}

} //ReifiedRelationshipImpl
