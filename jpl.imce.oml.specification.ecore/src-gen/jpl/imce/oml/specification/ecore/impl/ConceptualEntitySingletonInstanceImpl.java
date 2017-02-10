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

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import jpl.imce.oml.specification.ecore.ConceptualEntity;
import jpl.imce.oml.specification.ecore.ConceptualEntitySingletonInstance;
import jpl.imce.oml.specification.ecore.DataStructureTuple;
import jpl.imce.oml.specification.ecore.OMLPackage;
import jpl.imce.oml.specification.ecore.ScalarDataPropertyValue;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conceptual Entity Singleton Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.ConceptualEntitySingletonInstanceImpl#getIdentifyingScalarValues <em>Identifying Scalar Values</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.ConceptualEntitySingletonInstanceImpl#getIdentifyingStructuredTuples <em>Identifying Structured Tuples</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConceptualEntitySingletonInstanceImpl extends SingletonInstanceImpl implements ConceptualEntitySingletonInstance {
	/**
	 * The cached value of the '{@link #getIdentifyingScalarValues() <em>Identifying Scalar Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifyingScalarValues()
	 * @generated
	 * @ordered
	 */
	protected EList<ScalarDataPropertyValue> identifyingScalarValues;

	/**
	 * The cached value of the '{@link #getIdentifyingStructuredTuples() <em>Identifying Structured Tuples</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifyingStructuredTuples()
	 * @generated
	 * @ordered
	 */
	protected EList<DataStructureTuple> identifyingStructuredTuples;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptualEntitySingletonInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMLPackage.Literals.CONCEPTUAL_ENTITY_SINGLETON_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScalarDataPropertyValue> getIdentifyingScalarValues() {
		if (identifyingScalarValues == null) {
			identifyingScalarValues = new EObjectResolvingEList<ScalarDataPropertyValue>(ScalarDataPropertyValue.class, this, OMLPackage.CONCEPTUAL_ENTITY_SINGLETON_INSTANCE__IDENTIFYING_SCALAR_VALUES);
		}
		return identifyingScalarValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataStructureTuple> getIdentifyingStructuredTuples() {
		if (identifyingStructuredTuples == null) {
			identifyingStructuredTuples = new EObjectResolvingEList<DataStructureTuple>(DataStructureTuple.class, this, OMLPackage.CONCEPTUAL_ENTITY_SINGLETON_INSTANCE__IDENTIFYING_STRUCTURED_TUPLES);
		}
		return identifyingStructuredTuples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualEntity conceptualEntitySingletonClassifier() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMLPackage.CONCEPTUAL_ENTITY_SINGLETON_INSTANCE__IDENTIFYING_SCALAR_VALUES:
				return getIdentifyingScalarValues();
			case OMLPackage.CONCEPTUAL_ENTITY_SINGLETON_INSTANCE__IDENTIFYING_STRUCTURED_TUPLES:
				return getIdentifyingStructuredTuples();
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
			case OMLPackage.CONCEPTUAL_ENTITY_SINGLETON_INSTANCE__IDENTIFYING_SCALAR_VALUES:
				getIdentifyingScalarValues().clear();
				getIdentifyingScalarValues().addAll((Collection<? extends ScalarDataPropertyValue>)newValue);
				return;
			case OMLPackage.CONCEPTUAL_ENTITY_SINGLETON_INSTANCE__IDENTIFYING_STRUCTURED_TUPLES:
				getIdentifyingStructuredTuples().clear();
				getIdentifyingStructuredTuples().addAll((Collection<? extends DataStructureTuple>)newValue);
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
			case OMLPackage.CONCEPTUAL_ENTITY_SINGLETON_INSTANCE__IDENTIFYING_SCALAR_VALUES:
				getIdentifyingScalarValues().clear();
				return;
			case OMLPackage.CONCEPTUAL_ENTITY_SINGLETON_INSTANCE__IDENTIFYING_STRUCTURED_TUPLES:
				getIdentifyingStructuredTuples().clear();
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
			case OMLPackage.CONCEPTUAL_ENTITY_SINGLETON_INSTANCE__IDENTIFYING_SCALAR_VALUES:
				return identifyingScalarValues != null && !identifyingScalarValues.isEmpty();
			case OMLPackage.CONCEPTUAL_ENTITY_SINGLETON_INSTANCE__IDENTIFYING_STRUCTURED_TUPLES:
				return identifyingStructuredTuples != null && !identifyingStructuredTuples.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OMLPackage.CONCEPTUAL_ENTITY_SINGLETON_INSTANCE___CONCEPTUAL_ENTITY_SINGLETON_CLASSIFIER:
				return conceptualEntitySingletonClassifier();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConceptualEntitySingletonInstanceImpl
