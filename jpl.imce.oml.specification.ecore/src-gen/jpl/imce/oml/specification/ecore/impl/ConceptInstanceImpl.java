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

import jpl.imce.oml.specification.ecore.Concept;
import jpl.imce.oml.specification.ecore.ConceptInstance;
import jpl.imce.oml.specification.ecore.ConceptualEntity;
import jpl.imce.oml.specification.ecore.OMLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.ConceptInstanceImpl#getSingletonConceptClassifier <em>Singleton Concept Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConceptInstanceImpl extends ConceptualEntitySingletonInstanceImpl implements ConceptInstance {
	/**
	 * The cached value of the '{@link #getSingletonConceptClassifier() <em>Singleton Concept Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingletonConceptClassifier()
	 * @generated
	 * @ordered
	 */
	protected Concept singletonConceptClassifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMLPackage.Literals.CONCEPT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept getSingletonConceptClassifier() {
		if (singletonConceptClassifier != null && ((EObject)singletonConceptClassifier).eIsProxy()) {
			InternalEObject oldSingletonConceptClassifier = (InternalEObject)singletonConceptClassifier;
			singletonConceptClassifier = (Concept)eResolveProxy(oldSingletonConceptClassifier);
			if (singletonConceptClassifier != oldSingletonConceptClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMLPackage.CONCEPT_INSTANCE__SINGLETON_CONCEPT_CLASSIFIER, oldSingletonConceptClassifier, singletonConceptClassifier));
			}
		}
		return singletonConceptClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept basicGetSingletonConceptClassifier() {
		return singletonConceptClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingletonConceptClassifier(Concept newSingletonConceptClassifier) {
		Concept oldSingletonConceptClassifier = singletonConceptClassifier;
		singletonConceptClassifier = newSingletonConceptClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.CONCEPT_INSTANCE__SINGLETON_CONCEPT_CLASSIFIER, oldSingletonConceptClassifier, singletonConceptClassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualEntity conceptualEntitySingletonClassifier() {
		return this.getSingletonConceptClassifier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMLPackage.CONCEPT_INSTANCE__SINGLETON_CONCEPT_CLASSIFIER:
				if (resolve) return getSingletonConceptClassifier();
				return basicGetSingletonConceptClassifier();
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
			case OMLPackage.CONCEPT_INSTANCE__SINGLETON_CONCEPT_CLASSIFIER:
				setSingletonConceptClassifier((Concept)newValue);
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
			case OMLPackage.CONCEPT_INSTANCE__SINGLETON_CONCEPT_CLASSIFIER:
				setSingletonConceptClassifier((Concept)null);
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
			case OMLPackage.CONCEPT_INSTANCE__SINGLETON_CONCEPT_CLASSIFIER:
				return singletonConceptClassifier != null;
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
			case OMLPackage.CONCEPT_INSTANCE___CONCEPTUAL_ENTITY_SINGLETON_CLASSIFIER:
				return conceptualEntitySingletonClassifier();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConceptInstanceImpl
