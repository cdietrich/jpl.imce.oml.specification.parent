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

import jpl.imce.oml.specification.ecore.Bundle;
import jpl.imce.oml.specification.ecore.Concept;
import jpl.imce.oml.specification.ecore.OMLPackage;
import jpl.imce.oml.specification.ecore.SpecificDisjointConceptAxiom;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Disjoint Concept Axiom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.SpecificDisjointConceptAxiomImpl#getDisjointLeaf <em>Disjoint Leaf</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificDisjointConceptAxiomImpl extends DisjointUnionOfConceptsAxiomImpl implements SpecificDisjointConceptAxiom {
	/**
	 * The cached value of the '{@link #getDisjointLeaf() <em>Disjoint Leaf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisjointLeaf()
	 * @generated
	 * @ordered
	 */
	protected Concept disjointLeaf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificDisjointConceptAxiomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMLPackage.eINSTANCE.getSpecificDisjointConceptAxiom();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept getDisjointLeaf() {
		if (disjointLeaf != null && ((EObject)disjointLeaf).eIsProxy()) {
			InternalEObject oldDisjointLeaf = (InternalEObject)disjointLeaf;
			disjointLeaf = (Concept)eResolveProxy(oldDisjointLeaf);
			if (disjointLeaf != oldDisjointLeaf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMLPackage.SPECIFIC_DISJOINT_CONCEPT_AXIOM__DISJOINT_LEAF, oldDisjointLeaf, disjointLeaf));
			}
		}
		return disjointLeaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept basicGetDisjointLeaf() {
		return disjointLeaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisjointLeaf(Concept newDisjointLeaf) {
		Concept oldDisjointLeaf = disjointLeaf;
		disjointLeaf = newDisjointLeaf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.SPECIFIC_DISJOINT_CONCEPT_AXIOM__DISJOINT_LEAF, oldDisjointLeaf, disjointLeaf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String calculateUUID() {
		String _xblockexpression = null;
		{
			Bundle _bundle = this.getBundle();
			String _uuid = _bundle.getUuid();
			String _plus = ("SpecificDisjointConceptAxiom(bundle=" + _uuid);
			String _plus_1 = (_plus + ",disjointLeaf=");
			Concept _disjointLeaf = this.getDisjointLeaf();
			String _uuid_1 = _disjointLeaf.getUuid();
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMLPackage.SPECIFIC_DISJOINT_CONCEPT_AXIOM__DISJOINT_LEAF:
				if (resolve) return getDisjointLeaf();
				return basicGetDisjointLeaf();
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
			case OMLPackage.SPECIFIC_DISJOINT_CONCEPT_AXIOM__DISJOINT_LEAF:
				setDisjointLeaf((Concept)newValue);
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
			case OMLPackage.SPECIFIC_DISJOINT_CONCEPT_AXIOM__DISJOINT_LEAF:
				setDisjointLeaf((Concept)null);
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
			case OMLPackage.SPECIFIC_DISJOINT_CONCEPT_AXIOM__DISJOINT_LEAF:
				return disjointLeaf != null;
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
			case OMLPackage.SPECIFIC_DISJOINT_CONCEPT_AXIOM___CALCULATE_UUID:
				return calculateUUID();
		}
		return super.eInvoke(operationID, arguments);
	}

} //SpecificDisjointConceptAxiomImpl
