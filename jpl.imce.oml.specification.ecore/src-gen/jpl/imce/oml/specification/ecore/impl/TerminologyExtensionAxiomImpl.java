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

import jpl.imce.oml.specification.ecore.EcorePackage;
import jpl.imce.oml.specification.ecore.TerminologyBox;
import jpl.imce.oml.specification.ecore.TerminologyExtensionAxiom;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminology Extension Axiom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.TerminologyExtensionAxiomImpl#getExtendedTerminology <em>Extended Terminology</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminologyExtensionAxiomImpl extends TerminologyBoxAxiomImpl implements TerminologyExtensionAxiom {
	/**
	 * The cached value of the '{@link #getExtendedTerminology() <em>Extended Terminology</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedTerminology()
	 * @generated
	 * @ordered
	 */
	protected TerminologyBox extendedTerminology;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminologyExtensionAxiomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.eINSTANCE.getTerminologyExtensionAxiom();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyBox getExtendedTerminology() {
		if (extendedTerminology != null && ((EObject)extendedTerminology).eIsProxy()) {
			InternalEObject oldExtendedTerminology = (InternalEObject)extendedTerminology;
			extendedTerminology = (TerminologyBox)eResolveProxy(oldExtendedTerminology);
			if (extendedTerminology != oldExtendedTerminology) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcorePackage.TERMINOLOGY_EXTENSION_AXIOM__EXTENDED_TERMINOLOGY, oldExtendedTerminology, extendedTerminology));
			}
		}
		return extendedTerminology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyBox basicGetExtendedTerminology() {
		return extendedTerminology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedTerminology(TerminologyBox newExtendedTerminology) {
		TerminologyBox oldExtendedTerminology = extendedTerminology;
		extendedTerminology = newExtendedTerminology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.TERMINOLOGY_EXTENSION_AXIOM__EXTENDED_TERMINOLOGY, oldExtendedTerminology, extendedTerminology));
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
			String _plus = ("TerminologyExtensionAxiom(source=" + _uuid);
			String _plus_1 = (_plus + ",target=");
			TerminologyBox _target = this.target();
			String _uuid_1 = _target.getUuid();
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
	public TerminologyBox extendingTerminology() {
		return this.getTbox();
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
		return this.getExtendedTerminology();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcorePackage.TERMINOLOGY_EXTENSION_AXIOM__EXTENDED_TERMINOLOGY:
				if (resolve) return getExtendedTerminology();
				return basicGetExtendedTerminology();
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
			case EcorePackage.TERMINOLOGY_EXTENSION_AXIOM__EXTENDED_TERMINOLOGY:
				setExtendedTerminology((TerminologyBox)newValue);
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
			case EcorePackage.TERMINOLOGY_EXTENSION_AXIOM__EXTENDED_TERMINOLOGY:
				setExtendedTerminology((TerminologyBox)null);
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
			case EcorePackage.TERMINOLOGY_EXTENSION_AXIOM__EXTENDED_TERMINOLOGY:
				return extendedTerminology != null;
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
			case EcorePackage.TERMINOLOGY_EXTENSION_AXIOM___CALCULATE_UUID:
				return calculateUUID();
			case EcorePackage.TERMINOLOGY_EXTENSION_AXIOM___EXTENDING_TERMINOLOGY:
				return extendingTerminology();
			case EcorePackage.TERMINOLOGY_EXTENSION_AXIOM___SOURCE:
				return source();
			case EcorePackage.TERMINOLOGY_EXTENSION_AXIOM___TARGET:
				return target();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TerminologyExtensionAxiomImpl
