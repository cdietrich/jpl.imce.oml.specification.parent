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

import com.fasterxml.uuid.Generators;

import com.fasterxml.uuid.impl.NameBasedGenerator;

import java.lang.reflect.InvocationTargetException;

import java.util.UUID;

import jpl.imce.oml.specification.ecore.DataStructureTuple;
import jpl.imce.oml.specification.ecore.DescriptionBox;
import jpl.imce.oml.specification.ecore.EcorePackage;
import jpl.imce.oml.specification.ecore.Structure;
import jpl.imce.oml.specification.ecore.StructuredDataPropertyValue;
import jpl.imce.oml.specification.ecore.TerminologyInstanceAssertion;
import jpl.imce.oml.specification.ecore.TerminologyThing;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Structure Tuple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.DataStructureTupleImpl#getStructuredDataPropertyValue <em>Structured Data Property Value</em>}</li>
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
		return EcorePackage.eINSTANCE.getDataStructureTuple();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredDataPropertyValue getStructuredDataPropertyValue() {
		if (eContainerFeatureID() != EcorePackage.DATA_STRUCTURE_TUPLE__STRUCTURED_DATA_PROPERTY_VALUE) return null;
		return (StructuredDataPropertyValue)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredDataPropertyValue basicGetStructuredDataPropertyValue() {
		if (eContainerFeatureID() != EcorePackage.DATA_STRUCTURE_TUPLE__STRUCTURED_DATA_PROPERTY_VALUE) return null;
		return (StructuredDataPropertyValue)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuredDataPropertyValue(StructuredDataPropertyValue newStructuredDataPropertyValue, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStructuredDataPropertyValue, EcorePackage.DATA_STRUCTURE_TUPLE__STRUCTURED_DATA_PROPERTY_VALUE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructuredDataPropertyValue(StructuredDataPropertyValue newStructuredDataPropertyValue) {
		if (newStructuredDataPropertyValue != eInternalContainer() || (eContainerFeatureID() != EcorePackage.DATA_STRUCTURE_TUPLE__STRUCTURED_DATA_PROPERTY_VALUE && newStructuredDataPropertyValue != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newStructuredDataPropertyValue))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStructuredDataPropertyValue != null)
				msgs = ((InternalEObject)newStructuredDataPropertyValue).eInverseAdd(this, EcorePackage.STRUCTURED_DATA_PROPERTY_VALUE__STRUCTURED_PROPERTY_TUPLE, StructuredDataPropertyValue.class, msgs);
			msgs = basicSetStructuredDataPropertyValue(newStructuredDataPropertyValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.DATA_STRUCTURE_TUPLE__STRUCTURED_DATA_PROPERTY_VALUE, newStructuredDataPropertyValue, newStructuredDataPropertyValue));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcorePackage.DATA_STRUCTURE_TUPLE__DATA_STRUCTURE_TYPE, oldDataStructureType, dataStructureType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.DATA_STRUCTURE_TUPLE__DATA_STRUCTURE_TYPE, oldDataStructureType, dataStructureType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String calculateUUID() {
		String _xblockexpression = null;
		{
			StructuredDataPropertyValue _structuredDataPropertyValue = this.getStructuredDataPropertyValue();
			String _uuid = _structuredDataPropertyValue.getUuid();
			String _plus = ("DataStructureTuple(structuredDataPropertyValue=" + _uuid);
			String _plus_1 = (_plus + ",dataStructureType=");
			Structure _dataStructureType = this.getDataStructureType();
			String _uuid_1 = _dataStructureType.getUuid();
			String _plus_2 = (_plus_1 + _uuid_1);
			final String namespace = (_plus_2 + ")");
			NameBasedGenerator _nameBasedGenerator = Generators.nameBasedGenerator(NameBasedGenerator.NAMESPACE_URL);
			UUID _generate = _nameBasedGenerator.generate(namespace);
			_xblockexpression = _generate.toString();
		}
		return _xblockexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionBox descriptionBox() {
		StructuredDataPropertyValue _structuredDataPropertyValue = this.getStructuredDataPropertyValue();
		return _structuredDataPropertyValue.descriptionBox();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackage.DATA_STRUCTURE_TUPLE__STRUCTURED_DATA_PROPERTY_VALUE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStructuredDataPropertyValue((StructuredDataPropertyValue)otherEnd, msgs);
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
			case EcorePackage.DATA_STRUCTURE_TUPLE__STRUCTURED_DATA_PROPERTY_VALUE:
				return basicSetStructuredDataPropertyValue(null, msgs);
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
			case EcorePackage.DATA_STRUCTURE_TUPLE__STRUCTURED_DATA_PROPERTY_VALUE:
				return eInternalContainer().eInverseRemove(this, EcorePackage.STRUCTURED_DATA_PROPERTY_VALUE__STRUCTURED_PROPERTY_TUPLE, StructuredDataPropertyValue.class, msgs);
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
			case EcorePackage.DATA_STRUCTURE_TUPLE__STRUCTURED_DATA_PROPERTY_VALUE:
				if (resolve) return getStructuredDataPropertyValue();
				return basicGetStructuredDataPropertyValue();
			case EcorePackage.DATA_STRUCTURE_TUPLE__DATA_STRUCTURE_TYPE:
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
			case EcorePackage.DATA_STRUCTURE_TUPLE__STRUCTURED_DATA_PROPERTY_VALUE:
				setStructuredDataPropertyValue((StructuredDataPropertyValue)newValue);
				return;
			case EcorePackage.DATA_STRUCTURE_TUPLE__DATA_STRUCTURE_TYPE:
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
			case EcorePackage.DATA_STRUCTURE_TUPLE__STRUCTURED_DATA_PROPERTY_VALUE:
				setStructuredDataPropertyValue((StructuredDataPropertyValue)null);
				return;
			case EcorePackage.DATA_STRUCTURE_TUPLE__DATA_STRUCTURE_TYPE:
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
			case EcorePackage.DATA_STRUCTURE_TUPLE__STRUCTURED_DATA_PROPERTY_VALUE:
				return basicGetStructuredDataPropertyValue() != null;
			case EcorePackage.DATA_STRUCTURE_TUPLE__DATA_STRUCTURE_TYPE:
				return dataStructureType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == TerminologyThing.class) {
			switch (baseOperationID) {
				case EcorePackage.TERMINOLOGY_THING___CALCULATE_UUID: return EcorePackage.DATA_STRUCTURE_TUPLE___CALCULATE_UUID;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == TerminologyInstanceAssertion.class) {
			switch (baseOperationID) {
				case EcorePackage.TERMINOLOGY_INSTANCE_ASSERTION___DESCRIPTION_BOX: return EcorePackage.DATA_STRUCTURE_TUPLE___DESCRIPTION_BOX;
				case EcorePackage.TERMINOLOGY_INSTANCE_ASSERTION___CALCULATE_UUID: return EcorePackage.DATA_STRUCTURE_TUPLE___CALCULATE_UUID;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EcorePackage.DATA_STRUCTURE_TUPLE___CALCULATE_UUID:
				return calculateUUID();
			case EcorePackage.DATA_STRUCTURE_TUPLE___DESCRIPTION_BOX:
				return descriptionBox();
		}
		return super.eInvoke(operationID, arguments);
	}

} //DataStructureTupleImpl
