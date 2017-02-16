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

import jpl.imce.oml.specification.ecore.OMLPackage;
import jpl.imce.oml.specification.ecore.TerminologyBox;
import jpl.imce.oml.specification.ecore.TerminologyBoxAxiom;
import jpl.imce.oml.specification.ecore.TerminologyBoxStatement;
import jpl.imce.oml.specification.ecore.TerminologyGraphKind;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminology Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.TerminologyBoxImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.TerminologyBoxImpl#getTerminologyBoxAxioms <em>Terminology Box Axioms</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.TerminologyBoxImpl#getBoxStatements <em>Box Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TerminologyBoxImpl extends ModuleImpl implements TerminologyBox {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final TerminologyGraphKind KIND_EDEFAULT = TerminologyGraphKind.OPEN_WORLD_DEFINITIONS;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected TerminologyGraphKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTerminologyBoxAxioms() <em>Terminology Box Axioms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminologyBoxAxioms()
	 * @generated
	 * @ordered
	 */
	protected EList<TerminologyBoxAxiom> terminologyBoxAxioms;

	/**
	 * The cached value of the '{@link #getBoxStatements() <em>Box Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<TerminologyBoxStatement> boxStatements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminologyBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMLPackage.eINSTANCE.getTerminologyBox();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyGraphKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(TerminologyGraphKind newKind) {
		TerminologyGraphKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.TERMINOLOGY_BOX__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TerminologyBoxAxiom> getTerminologyBoxAxioms() {
		if (terminologyBoxAxioms == null) {
			terminologyBoxAxioms = new EObjectContainmentWithInverseEList<TerminologyBoxAxiom>(TerminologyBoxAxiom.class, this, OMLPackage.TERMINOLOGY_BOX__TERMINOLOGY_BOX_AXIOMS, OMLPackage.TERMINOLOGY_BOX_AXIOM__TBOX);
		}
		return terminologyBoxAxioms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TerminologyBoxStatement> getBoxStatements() {
		if (boxStatements == null) {
			boxStatements = new EObjectContainmentWithInverseEList<TerminologyBoxStatement>(TerminologyBoxStatement.class, this, OMLPackage.TERMINOLOGY_BOX__BOX_STATEMENTS, OMLPackage.TERMINOLOGY_BOX_STATEMENT__TBOX);
		}
		return boxStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyBox withBoxStatements(EList<TerminologyBoxStatement> s) {
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
			case OMLPackage.TERMINOLOGY_BOX__TERMINOLOGY_BOX_AXIOMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTerminologyBoxAxioms()).basicAdd(otherEnd, msgs);
			case OMLPackage.TERMINOLOGY_BOX__BOX_STATEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBoxStatements()).basicAdd(otherEnd, msgs);
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
			case OMLPackage.TERMINOLOGY_BOX__TERMINOLOGY_BOX_AXIOMS:
				return ((InternalEList<?>)getTerminologyBoxAxioms()).basicRemove(otherEnd, msgs);
			case OMLPackage.TERMINOLOGY_BOX__BOX_STATEMENTS:
				return ((InternalEList<?>)getBoxStatements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMLPackage.TERMINOLOGY_BOX__KIND:
				return getKind();
			case OMLPackage.TERMINOLOGY_BOX__TERMINOLOGY_BOX_AXIOMS:
				return getTerminologyBoxAxioms();
			case OMLPackage.TERMINOLOGY_BOX__BOX_STATEMENTS:
				return getBoxStatements();
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
			case OMLPackage.TERMINOLOGY_BOX__KIND:
				setKind((TerminologyGraphKind)newValue);
				return;
			case OMLPackage.TERMINOLOGY_BOX__TERMINOLOGY_BOX_AXIOMS:
				getTerminologyBoxAxioms().clear();
				getTerminologyBoxAxioms().addAll((Collection<? extends TerminologyBoxAxiom>)newValue);
				return;
			case OMLPackage.TERMINOLOGY_BOX__BOX_STATEMENTS:
				getBoxStatements().clear();
				getBoxStatements().addAll((Collection<? extends TerminologyBoxStatement>)newValue);
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
			case OMLPackage.TERMINOLOGY_BOX__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case OMLPackage.TERMINOLOGY_BOX__TERMINOLOGY_BOX_AXIOMS:
				getTerminologyBoxAxioms().clear();
				return;
			case OMLPackage.TERMINOLOGY_BOX__BOX_STATEMENTS:
				getBoxStatements().clear();
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
			case OMLPackage.TERMINOLOGY_BOX__KIND:
				return kind != KIND_EDEFAULT;
			case OMLPackage.TERMINOLOGY_BOX__TERMINOLOGY_BOX_AXIOMS:
				return terminologyBoxAxioms != null && !terminologyBoxAxioms.isEmpty();
			case OMLPackage.TERMINOLOGY_BOX__BOX_STATEMENTS:
				return boxStatements != null && !boxStatements.isEmpty();
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
			case OMLPackage.TERMINOLOGY_BOX___WITH_BOX_STATEMENTS__ELIST:
				return withBoxStatements((EList<TerminologyBoxStatement>)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //TerminologyBoxImpl
