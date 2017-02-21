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

import jpl.imce.oml.specification.ecore.Concept;
import jpl.imce.oml.specification.ecore.ConceptSpecializationAxiom;
import jpl.imce.oml.specification.ecore.Entity;
import jpl.imce.oml.specification.ecore.OMLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Specialization Axiom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.ConceptSpecializationAxiomImpl#getSubConcept <em>Sub Concept</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.ConceptSpecializationAxiomImpl#getSuperConcept <em>Super Concept</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConceptSpecializationAxiomImpl extends SpecializationAxiomImpl implements ConceptSpecializationAxiom {
	/**
	 * The cached value of the '{@link #getSubConcept() <em>Sub Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubConcept()
	 * @generated
	 * @ordered
	 */
	protected Concept subConcept;

	/**
	 * The cached value of the '{@link #getSuperConcept() <em>Super Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperConcept()
	 * @generated
	 * @ordered
	 */
	protected Concept superConcept;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptSpecializationAxiomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMLPackage.eINSTANCE.getConceptSpecializationAxiom();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept getSubConcept() {
		if (subConcept != null && ((EObject)subConcept).eIsProxy()) {
			InternalEObject oldSubConcept = (InternalEObject)subConcept;
			subConcept = (Concept)eResolveProxy(oldSubConcept);
			if (subConcept != oldSubConcept) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMLPackage.CONCEPT_SPECIALIZATION_AXIOM__SUB_CONCEPT, oldSubConcept, subConcept));
			}
		}
		return subConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept basicGetSubConcept() {
		return subConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubConcept(Concept newSubConcept) {
		Concept oldSubConcept = subConcept;
		subConcept = newSubConcept;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.CONCEPT_SPECIALIZATION_AXIOM__SUB_CONCEPT, oldSubConcept, subConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept getSuperConcept() {
		if (superConcept != null && ((EObject)superConcept).eIsProxy()) {
			InternalEObject oldSuperConcept = (InternalEObject)superConcept;
			superConcept = (Concept)eResolveProxy(oldSuperConcept);
			if (superConcept != oldSuperConcept) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMLPackage.CONCEPT_SPECIALIZATION_AXIOM__SUPER_CONCEPT, oldSuperConcept, superConcept));
			}
		}
		return superConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept basicGetSuperConcept() {
		return superConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperConcept(Concept newSuperConcept) {
		Concept oldSuperConcept = superConcept;
		superConcept = newSuperConcept;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.CONCEPT_SPECIALIZATION_AXIOM__SUPER_CONCEPT, oldSuperConcept, superConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String calculateUUID() {
		String _xblockexpression = null;
		{
			Concept _subConcept = this.getSubConcept();
			String _uuid = _subConcept.getUuid();
			String _plus = ("ConceptSpecializationAxiom(subConcept=" + _uuid);
			String _plus_1 = (_plus + ",superConcept=");
			Concept _superConcept = this.getSuperConcept();
			String _uuid_1 = _superConcept.getUuid();
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
	public Entity child() {
		return this.getSubConcept();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity parent() {
		return this.getSuperConcept();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMLPackage.CONCEPT_SPECIALIZATION_AXIOM__SUB_CONCEPT:
				if (resolve) return getSubConcept();
				return basicGetSubConcept();
			case OMLPackage.CONCEPT_SPECIALIZATION_AXIOM__SUPER_CONCEPT:
				if (resolve) return getSuperConcept();
				return basicGetSuperConcept();
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
			case OMLPackage.CONCEPT_SPECIALIZATION_AXIOM__SUB_CONCEPT:
				setSubConcept((Concept)newValue);
				return;
			case OMLPackage.CONCEPT_SPECIALIZATION_AXIOM__SUPER_CONCEPT:
				setSuperConcept((Concept)newValue);
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
			case OMLPackage.CONCEPT_SPECIALIZATION_AXIOM__SUB_CONCEPT:
				setSubConcept((Concept)null);
				return;
			case OMLPackage.CONCEPT_SPECIALIZATION_AXIOM__SUPER_CONCEPT:
				setSuperConcept((Concept)null);
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
			case OMLPackage.CONCEPT_SPECIALIZATION_AXIOM__SUB_CONCEPT:
				return subConcept != null;
			case OMLPackage.CONCEPT_SPECIALIZATION_AXIOM__SUPER_CONCEPT:
				return superConcept != null;
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
			case OMLPackage.CONCEPT_SPECIALIZATION_AXIOM___CALCULATE_UUID:
				return calculateUUID();
			case OMLPackage.CONCEPT_SPECIALIZATION_AXIOM___CHILD:
				return child();
			case OMLPackage.CONCEPT_SPECIALIZATION_AXIOM___PARENT:
				return parent();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConceptSpecializationAxiomImpl
