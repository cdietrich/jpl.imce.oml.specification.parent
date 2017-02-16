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

import jpl.imce.oml.specification.ecore.DataRelationshipToStructure;
import jpl.imce.oml.specification.ecore.DataStructureTuple;
import jpl.imce.oml.specification.ecore.DescriptionBox;
import jpl.imce.oml.specification.ecore.OMLPackage;
import jpl.imce.oml.specification.ecore.SingletonInstance;
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
	 * The cached value of the '{@link #getStructuredDataProperty() <em>Structured Data Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuredDataProperty()
	 * @generated
	 * @ordered
	 */
	protected DataRelationshipToStructure structuredDataProperty;

	/**
	 * The cached value of the '{@link #getStructuredPropertyTuple() <em>Structured Property Tuple</em>}' containment reference.
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
		return OMLPackage.eINSTANCE.getStructuredDataPropertyValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingletonInstance getSingletonInstance() {
		if (eContainerFeatureID() != OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE__SINGLETON_INSTANCE) return null;
		return (SingletonInstance)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingletonInstance basicGetSingletonInstance() {
		if (eContainerFeatureID() != OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE__SINGLETON_INSTANCE) return null;
		return (SingletonInstance)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSingletonInstance(SingletonInstance newSingletonInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSingletonInstance, OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE__SINGLETON_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingletonInstance(SingletonInstance newSingletonInstance) {
		if (newSingletonInstance != eInternalContainer() || (eContainerFeatureID() != OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE__SINGLETON_INSTANCE && newSingletonInstance != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newSingletonInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSingletonInstance != null)
				msgs = ((InternalEObject)newSingletonInstance).eInverseAdd(this, OMLPackage.SINGLETON_INSTANCE__STRUCTURED_DATA_PROPERTY_VALUES, SingletonInstance.class, msgs);
			msgs = basicSetSingletonInstance(newSingletonInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE__SINGLETON_INSTANCE, newSingletonInstance, newSingletonInstance));
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
		return structuredPropertyTuple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuredPropertyTuple(DataStructureTuple newStructuredPropertyTuple, NotificationChain msgs) {
		DataStructureTuple oldStructuredPropertyTuple = structuredPropertyTuple;
		structuredPropertyTuple = newStructuredPropertyTuple;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE__STRUCTURED_PROPERTY_TUPLE, oldStructuredPropertyTuple, newStructuredPropertyTuple);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructuredPropertyTuple(DataStructureTuple newStructuredPropertyTuple) {
		if (newStructuredPropertyTuple != structuredPropertyTuple) {
			NotificationChain msgs = null;
			if (structuredPropertyTuple != null)
				msgs = ((InternalEObject)structuredPropertyTuple).eInverseRemove(this, OMLPackage.DATA_STRUCTURE_TUPLE__STRUCTURED_DATA_PROPERTY_VALUE, DataStructureTuple.class, msgs);
			if (newStructuredPropertyTuple != null)
				msgs = ((InternalEObject)newStructuredPropertyTuple).eInverseAdd(this, OMLPackage.DATA_STRUCTURE_TUPLE__STRUCTURED_DATA_PROPERTY_VALUE, DataStructureTuple.class, msgs);
			msgs = basicSetStructuredPropertyTuple(newStructuredPropertyTuple, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE__STRUCTURED_PROPERTY_TUPLE, newStructuredPropertyTuple, newStructuredPropertyTuple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String calculateUUID() {
		String _xblockexpression = null;
		{
			SingletonInstance _singletonInstance = this.getSingletonInstance();
			String _uuid = _singletonInstance.getUuid();
			String _plus = ("StructuredDataPropertyValue(singletonInstance=" + _uuid);
			String _plus_1 = (_plus + ",structuredDataProperty=");
			DataRelationshipToStructure _structuredDataProperty = this.getStructuredDataProperty();
			String _calculateUUID = _structuredDataProperty.calculateUUID();
			String _plus_2 = (_plus_1 + _calculateUUID);
			String _plus_3 = (_plus_2 + ",structuredPropertyTuple=");
			DataStructureTuple _structuredPropertyTuple = this.getStructuredPropertyTuple();
			String _uuid_1 = _structuredPropertyTuple.getUuid();
			String _plus_4 = (_plus_3 + _uuid_1);
			final String namespace = (_plus_4 + ")");
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
		SingletonInstance _singletonInstance = this.getSingletonInstance();
		return _singletonInstance.descriptionBox();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE__SINGLETON_INSTANCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSingletonInstance((SingletonInstance)otherEnd, msgs);
			case OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE__STRUCTURED_PROPERTY_TUPLE:
				if (structuredPropertyTuple != null)
					msgs = ((InternalEObject)structuredPropertyTuple).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE__STRUCTURED_PROPERTY_TUPLE, null, msgs);
				return basicSetStructuredPropertyTuple((DataStructureTuple)otherEnd, msgs);
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
			case OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE__SINGLETON_INSTANCE:
				return basicSetSingletonInstance(null, msgs);
			case OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE__STRUCTURED_PROPERTY_TUPLE:
				return basicSetStructuredPropertyTuple(null, msgs);
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
			case OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE__SINGLETON_INSTANCE:
				return eInternalContainer().eInverseRemove(this, OMLPackage.SINGLETON_INSTANCE__STRUCTURED_DATA_PROPERTY_VALUES, SingletonInstance.class, msgs);
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
			case OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE__SINGLETON_INSTANCE:
				if (resolve) return getSingletonInstance();
				return basicGetSingletonInstance();
			case OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE__STRUCTURED_DATA_PROPERTY:
				if (resolve) return getStructuredDataProperty();
				return basicGetStructuredDataProperty();
			case OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE__STRUCTURED_PROPERTY_TUPLE:
				return getStructuredPropertyTuple();
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
				return basicGetSingletonInstance() != null;
			case OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE__STRUCTURED_DATA_PROPERTY:
				return structuredDataProperty != null;
			case OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE__STRUCTURED_PROPERTY_TUPLE:
				return structuredPropertyTuple != null;
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
				case OMLPackage.TERMINOLOGY_THING___CALCULATE_UUID: return OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE___CALCULATE_UUID;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == TerminologyInstanceAssertion.class) {
			switch (baseOperationID) {
				case OMLPackage.TERMINOLOGY_INSTANCE_ASSERTION___DESCRIPTION_BOX: return OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE___DESCRIPTION_BOX;
				case OMLPackage.TERMINOLOGY_INSTANCE_ASSERTION___CALCULATE_UUID: return OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE___CALCULATE_UUID;
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
			case OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE___CALCULATE_UUID:
				return calculateUUID();
			case OMLPackage.STRUCTURED_DATA_PROPERTY_VALUE___DESCRIPTION_BOX:
				return descriptionBox();
		}
		return super.eInvoke(operationID, arguments);
	}

} //StructuredDataPropertyValueImpl
