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
import jpl.imce.oml.specification.ecore.OMLPackage;
import jpl.imce.oml.specification.ecore.TerminologyBox;
import jpl.imce.oml.specification.ecore.TerminologyGraph;
import jpl.imce.oml.specification.ecore.TerminologyNestingAxiom;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminology Nesting Axiom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.TerminologyNestingAxiomImpl#getNestingTerminology <em>Nesting Terminology</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.TerminologyNestingAxiomImpl#getNestingContext <em>Nesting Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminologyNestingAxiomImpl extends TerminologyBoxAxiomImpl implements TerminologyNestingAxiom {
	/**
	 * The cached value of the '{@link #getNestingTerminology() <em>Nesting Terminology</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestingTerminology()
	 * @generated
	 * @ordered
	 */
	protected TerminologyBox nestingTerminology;

	/**
	 * The cached value of the '{@link #getNestingContext() <em>Nesting Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestingContext()
	 * @generated
	 * @ordered
	 */
	protected Concept nestingContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminologyNestingAxiomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMLPackage.eINSTANCE.getTerminologyNestingAxiom();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyBox getNestingTerminology() {
		if (nestingTerminology != null && ((EObject)nestingTerminology).eIsProxy()) {
			InternalEObject oldNestingTerminology = (InternalEObject)nestingTerminology;
			nestingTerminology = (TerminologyBox)eResolveProxy(oldNestingTerminology);
			if (nestingTerminology != oldNestingTerminology) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMLPackage.TERMINOLOGY_NESTING_AXIOM__NESTING_TERMINOLOGY, oldNestingTerminology, nestingTerminology));
			}
		}
		return nestingTerminology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyBox basicGetNestingTerminology() {
		return nestingTerminology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNestingTerminology(TerminologyBox newNestingTerminology) {
		TerminologyBox oldNestingTerminology = nestingTerminology;
		nestingTerminology = newNestingTerminology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.TERMINOLOGY_NESTING_AXIOM__NESTING_TERMINOLOGY, oldNestingTerminology, nestingTerminology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept getNestingContext() {
		if (nestingContext != null && ((EObject)nestingContext).eIsProxy()) {
			InternalEObject oldNestingContext = (InternalEObject)nestingContext;
			nestingContext = (Concept)eResolveProxy(oldNestingContext);
			if (nestingContext != oldNestingContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMLPackage.TERMINOLOGY_NESTING_AXIOM__NESTING_CONTEXT, oldNestingContext, nestingContext));
			}
		}
		return nestingContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept basicGetNestingContext() {
		return nestingContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNestingContext(Concept newNestingContext) {
		Concept oldNestingContext = nestingContext;
		nestingContext = newNestingContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.TERMINOLOGY_NESTING_AXIOM__NESTING_CONTEXT, oldNestingContext, nestingContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String calculateUUID() {
		String _xblockexpression = null;
		{
			TerminologyBox _source = this.source();
			String _uuid = _source.getUuid();
			String _plus = ("TerminologyNestingAxiom(source=" + _uuid);
			String _plus_1 = (_plus + ",target=");
			TerminologyBox _target = this.target();
			String _uuid_1 = _target.getUuid();
			String _plus_2 = (_plus_1 + _uuid_1);
			String _plus_3 = (_plus_2 + ",nestingContext=");
			Concept _nestingContext = this.getNestingContext();
			String _uuid_2 = _nestingContext.getUuid();
			String _plus_4 = (_plus_3 + _uuid_2);
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
	public TerminologyGraph nestedTerminology() {
		TerminologyGraph _switchResult = null;
		TerminologyBox _tbox = this.getTbox();
		boolean _matched = false;
		if (_tbox instanceof TerminologyGraph) {
			_matched=true;
			TerminologyBox _tbox_1 = this.getTbox();
			_switchResult = ((TerminologyGraph) _tbox_1);
		}
		return _switchResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyBox source() {
		return this.getTbox();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyBox target() {
		return this.getNestingTerminology();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMLPackage.TERMINOLOGY_NESTING_AXIOM__NESTING_TERMINOLOGY:
				if (resolve) return getNestingTerminology();
				return basicGetNestingTerminology();
			case OMLPackage.TERMINOLOGY_NESTING_AXIOM__NESTING_CONTEXT:
				if (resolve) return getNestingContext();
				return basicGetNestingContext();
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
			case OMLPackage.TERMINOLOGY_NESTING_AXIOM__NESTING_TERMINOLOGY:
				setNestingTerminology((TerminologyBox)newValue);
				return;
			case OMLPackage.TERMINOLOGY_NESTING_AXIOM__NESTING_CONTEXT:
				setNestingContext((Concept)newValue);
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
			case OMLPackage.TERMINOLOGY_NESTING_AXIOM__NESTING_TERMINOLOGY:
				setNestingTerminology((TerminologyBox)null);
				return;
			case OMLPackage.TERMINOLOGY_NESTING_AXIOM__NESTING_CONTEXT:
				setNestingContext((Concept)null);
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
			case OMLPackage.TERMINOLOGY_NESTING_AXIOM__NESTING_TERMINOLOGY:
				return nestingTerminology != null;
			case OMLPackage.TERMINOLOGY_NESTING_AXIOM__NESTING_CONTEXT:
				return nestingContext != null;
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
			case OMLPackage.TERMINOLOGY_NESTING_AXIOM___CALCULATE_UUID:
				return calculateUUID();
			case OMLPackage.TERMINOLOGY_NESTING_AXIOM___NESTED_TERMINOLOGY:
				return nestedTerminology();
			case OMLPackage.TERMINOLOGY_NESTING_AXIOM___SOURCE:
				return source();
			case OMLPackage.TERMINOLOGY_NESTING_AXIOM___TARGET:
				return target();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TerminologyNestingAxiomImpl
