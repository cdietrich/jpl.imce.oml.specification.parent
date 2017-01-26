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

import jpl.imce.oml.specification.ecore.ConceptTreeDisjunction;
import jpl.imce.oml.specification.ecore.DisjointUnionOfConceptsAxiom;
import jpl.imce.oml.specification.ecore.OMLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disjoint Union Of Concepts Axiom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.DisjointUnionOfConceptsAxiomImpl#getDisjointTaxonomyParent <em>Disjoint Taxonomy Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DisjointUnionOfConceptsAxiomImpl extends TerminologyBundleStatementImpl implements DisjointUnionOfConceptsAxiom {
	/**
	 * The cached value of the '{@link #getDisjointTaxonomyParent() <em>Disjoint Taxonomy Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisjointTaxonomyParent()
	 * @generated
	 * @ordered
	 */
	protected ConceptTreeDisjunction disjointTaxonomyParent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisjointUnionOfConceptsAxiomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMLPackage.Literals.DISJOINT_UNION_OF_CONCEPTS_AXIOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptTreeDisjunction getDisjointTaxonomyParent() {
		if (disjointTaxonomyParent != null && ((EObject)disjointTaxonomyParent).eIsProxy()) {
			InternalEObject oldDisjointTaxonomyParent = (InternalEObject)disjointTaxonomyParent;
			disjointTaxonomyParent = (ConceptTreeDisjunction)eResolveProxy(oldDisjointTaxonomyParent);
			if (disjointTaxonomyParent != oldDisjointTaxonomyParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMLPackage.DISJOINT_UNION_OF_CONCEPTS_AXIOM__DISJOINT_TAXONOMY_PARENT, oldDisjointTaxonomyParent, disjointTaxonomyParent));
			}
		}
		return disjointTaxonomyParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptTreeDisjunction basicGetDisjointTaxonomyParent() {
		return disjointTaxonomyParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisjointTaxonomyParent(ConceptTreeDisjunction newDisjointTaxonomyParent) {
		ConceptTreeDisjunction oldDisjointTaxonomyParent = disjointTaxonomyParent;
		disjointTaxonomyParent = newDisjointTaxonomyParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.DISJOINT_UNION_OF_CONCEPTS_AXIOM__DISJOINT_TAXONOMY_PARENT, oldDisjointTaxonomyParent, disjointTaxonomyParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMLPackage.DISJOINT_UNION_OF_CONCEPTS_AXIOM__DISJOINT_TAXONOMY_PARENT:
				if (resolve) return getDisjointTaxonomyParent();
				return basicGetDisjointTaxonomyParent();
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
			case OMLPackage.DISJOINT_UNION_OF_CONCEPTS_AXIOM__DISJOINT_TAXONOMY_PARENT:
				setDisjointTaxonomyParent((ConceptTreeDisjunction)newValue);
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
			case OMLPackage.DISJOINT_UNION_OF_CONCEPTS_AXIOM__DISJOINT_TAXONOMY_PARENT:
				setDisjointTaxonomyParent((ConceptTreeDisjunction)null);
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
			case OMLPackage.DISJOINT_UNION_OF_CONCEPTS_AXIOM__DISJOINT_TAXONOMY_PARENT:
				return disjointTaxonomyParent != null;
		}
		return super.eIsSet(featureID);
	}

} //DisjointUnionOfConceptsAxiomImpl
