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

import jpl.imce.oml.specification.ecore.AnnotationEntry;
import jpl.imce.oml.specification.ecore.AnnotationProperty;
import jpl.imce.oml.specification.ecore.Bundle;
import jpl.imce.oml.specification.ecore.OMLPackage;
import jpl.imce.oml.specification.ecore.TerminologyBoxStatement;
import jpl.imce.oml.specification.ecore.TerminologyBundleAxiom;
import jpl.imce.oml.specification.ecore.TerminologyBundleStatement;
import jpl.imce.oml.specification.ecore.TerminologyExtent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bundle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.BundleImpl#getBundleExtent <em>Bundle Extent</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.BundleImpl#getBundleStatements <em>Bundle Statements</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.BundleImpl#getTerminologyBundleAxioms <em>Terminology Bundle Axioms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BundleImpl extends TerminologyBoxImpl implements Bundle {
	/**
	 * The cached value of the '{@link #getBundleStatements() <em>Bundle Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundleStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<TerminologyBundleStatement> bundleStatements;

	/**
	 * The cached value of the '{@link #getTerminologyBundleAxioms() <em>Terminology Bundle Axioms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminologyBundleAxioms()
	 * @generated
	 * @ordered
	 */
	protected EList<TerminologyBundleAxiom> terminologyBundleAxioms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BundleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMLPackage.eINSTANCE.getBundle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyExtent getBundleExtent() {
		if (eContainerFeatureID() != OMLPackage.BUNDLE__BUNDLE_EXTENT) return null;
		return (TerminologyExtent)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyExtent basicGetBundleExtent() {
		if (eContainerFeatureID() != OMLPackage.BUNDLE__BUNDLE_EXTENT) return null;
		return (TerminologyExtent)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBundleExtent(TerminologyExtent newBundleExtent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBundleExtent, OMLPackage.BUNDLE__BUNDLE_EXTENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBundleExtent(TerminologyExtent newBundleExtent) {
		if (newBundleExtent != eInternalContainer() || (eContainerFeatureID() != OMLPackage.BUNDLE__BUNDLE_EXTENT && newBundleExtent != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newBundleExtent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBundleExtent != null)
				msgs = ((InternalEObject)newBundleExtent).eInverseAdd(this, OMLPackage.TERMINOLOGY_EXTENT__BUNDLES, TerminologyExtent.class, msgs);
			msgs = basicSetBundleExtent(newBundleExtent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.BUNDLE__BUNDLE_EXTENT, newBundleExtent, newBundleExtent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TerminologyBundleStatement> getBundleStatements() {
		if (bundleStatements == null) {
			bundleStatements = new EObjectContainmentWithInverseEList<TerminologyBundleStatement>(TerminologyBundleStatement.class, this, OMLPackage.BUNDLE__BUNDLE_STATEMENTS, OMLPackage.TERMINOLOGY_BUNDLE_STATEMENT__BUNDLE);
		}
		return bundleStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TerminologyBundleAxiom> getTerminologyBundleAxioms() {
		if (terminologyBundleAxioms == null) {
			terminologyBundleAxioms = new EObjectContainmentWithInverseEList<TerminologyBundleAxiom>(TerminologyBundleAxiom.class, this, OMLPackage.BUNDLE__TERMINOLOGY_BUNDLE_AXIOMS, OMLPackage.TERMINOLOGY_BUNDLE_AXIOM__TERMINOLOGY_BUNDLE);
		}
		return terminologyBundleAxioms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyExtent extent() {
		return this.getBundleExtent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bundle withAnnotations(EMap<AnnotationProperty, EList<AnnotationEntry>> a) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bundle withBundleStatements(EList<TerminologyBundleStatement> s) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bundle withBoxStatements(EList<TerminologyBoxStatement> s) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMLPackage.BUNDLE__BUNDLE_EXTENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBundleExtent((TerminologyExtent)otherEnd, msgs);
			case OMLPackage.BUNDLE__BUNDLE_STATEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBundleStatements()).basicAdd(otherEnd, msgs);
			case OMLPackage.BUNDLE__TERMINOLOGY_BUNDLE_AXIOMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTerminologyBundleAxioms()).basicAdd(otherEnd, msgs);
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
			case OMLPackage.BUNDLE__BUNDLE_EXTENT:
				return basicSetBundleExtent(null, msgs);
			case OMLPackage.BUNDLE__BUNDLE_STATEMENTS:
				return ((InternalEList<?>)getBundleStatements()).basicRemove(otherEnd, msgs);
			case OMLPackage.BUNDLE__TERMINOLOGY_BUNDLE_AXIOMS:
				return ((InternalEList<?>)getTerminologyBundleAxioms()).basicRemove(otherEnd, msgs);
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
			case OMLPackage.BUNDLE__BUNDLE_EXTENT:
				return eInternalContainer().eInverseRemove(this, OMLPackage.TERMINOLOGY_EXTENT__BUNDLES, TerminologyExtent.class, msgs);
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
			case OMLPackage.BUNDLE__BUNDLE_EXTENT:
				if (resolve) return getBundleExtent();
				return basicGetBundleExtent();
			case OMLPackage.BUNDLE__BUNDLE_STATEMENTS:
				return getBundleStatements();
			case OMLPackage.BUNDLE__TERMINOLOGY_BUNDLE_AXIOMS:
				return getTerminologyBundleAxioms();
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
			case OMLPackage.BUNDLE__BUNDLE_EXTENT:
				setBundleExtent((TerminologyExtent)newValue);
				return;
			case OMLPackage.BUNDLE__BUNDLE_STATEMENTS:
				getBundleStatements().clear();
				getBundleStatements().addAll((Collection<? extends TerminologyBundleStatement>)newValue);
				return;
			case OMLPackage.BUNDLE__TERMINOLOGY_BUNDLE_AXIOMS:
				getTerminologyBundleAxioms().clear();
				getTerminologyBundleAxioms().addAll((Collection<? extends TerminologyBundleAxiom>)newValue);
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
			case OMLPackage.BUNDLE__BUNDLE_EXTENT:
				setBundleExtent((TerminologyExtent)null);
				return;
			case OMLPackage.BUNDLE__BUNDLE_STATEMENTS:
				getBundleStatements().clear();
				return;
			case OMLPackage.BUNDLE__TERMINOLOGY_BUNDLE_AXIOMS:
				getTerminologyBundleAxioms().clear();
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
			case OMLPackage.BUNDLE__BUNDLE_EXTENT:
				return basicGetBundleExtent() != null;
			case OMLPackage.BUNDLE__BUNDLE_STATEMENTS:
				return bundleStatements != null && !bundleStatements.isEmpty();
			case OMLPackage.BUNDLE__TERMINOLOGY_BUNDLE_AXIOMS:
				return terminologyBundleAxioms != null && !terminologyBundleAxioms.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OMLPackage.BUNDLE___EXTENT:
				return extent();
			case OMLPackage.BUNDLE___WITH_ANNOTATIONS__EMAP:
				return withAnnotations((EMap<AnnotationProperty, EList<AnnotationEntry>>)arguments.get(0));
			case OMLPackage.BUNDLE___WITH_BUNDLE_STATEMENTS__ELIST:
				return withBundleStatements((EList<TerminologyBundleStatement>)arguments.get(0));
			case OMLPackage.BUNDLE___WITH_BOX_STATEMENTS__ELIST:
				return withBoxStatements((EList<TerminologyBoxStatement>)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BundleImpl
