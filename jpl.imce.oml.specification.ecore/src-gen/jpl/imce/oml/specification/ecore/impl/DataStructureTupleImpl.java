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

import jpl.imce.oml.specification.ecore.DataStructureTuple;
import jpl.imce.oml.specification.ecore.OMLPackage;
import jpl.imce.oml.specification.ecore.Structure;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Structure Tuple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.DataStructureTupleImpl#getDataStructureType <em>Data Structure Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataStructureTupleImpl extends SingletonInstanceImpl implements DataStructureTuple {
	/**
	 * The cached value of the '{@link #getDataStructureType() <em>Data Structure Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataStructureType()
	 * @generated
	 * @ordered
	 */
	protected Structure dataStructureType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataStructureTupleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMLPackage.Literals.DATA_STRUCTURE_TUPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure getDataStructureType() {
		if (dataStructureType != null && ((EObject)dataStructureType).eIsProxy()) {
			InternalEObject oldDataStructureType = (InternalEObject)dataStructureType;
			dataStructureType = (Structure)eResolveProxy(oldDataStructureType);
			if (dataStructureType != oldDataStructureType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMLPackage.DATA_STRUCTURE_TUPLE__DATA_STRUCTURE_TYPE, oldDataStructureType, dataStructureType));
			}
		}
		return dataStructureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure basicGetDataStructureType() {
		return dataStructureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataStructureType(Structure newDataStructureType) {
		Structure oldDataStructureType = dataStructureType;
		dataStructureType = newDataStructureType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.DATA_STRUCTURE_TUPLE__DATA_STRUCTURE_TYPE, oldDataStructureType, dataStructureType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMLPackage.DATA_STRUCTURE_TUPLE__DATA_STRUCTURE_TYPE:
				if (resolve) return getDataStructureType();
				return basicGetDataStructureType();
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
			case OMLPackage.DATA_STRUCTURE_TUPLE__DATA_STRUCTURE_TYPE:
				setDataStructureType((Structure)newValue);
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
			case OMLPackage.DATA_STRUCTURE_TUPLE__DATA_STRUCTURE_TYPE:
				setDataStructureType((Structure)null);
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
			case OMLPackage.DATA_STRUCTURE_TUPLE__DATA_STRUCTURE_TYPE:
				return dataStructureType != null;
		}
		return super.eIsSet(featureID);
	}

} //DataStructureTupleImpl
