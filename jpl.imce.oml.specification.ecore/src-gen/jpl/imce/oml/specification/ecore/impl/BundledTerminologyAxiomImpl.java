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
import jpl.imce.oml.specification.ecore.BundledTerminologyAxiom;
import jpl.imce.oml.specification.ecore.OMLPackage;
import jpl.imce.oml.specification.ecore.TerminologyBox;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bundled Terminology Axiom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.BundledTerminologyAxiomImpl#getBundledTerminology <em>Bundled Terminology</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BundledTerminologyAxiomImpl extends TerminologyBundleAxiomImpl implements BundledTerminologyAxiom {
	/**
	 * The cached value of the '{@link #getBundledTerminology() <em>Bundled Terminology</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundledTerminology()
	 * @generated
	 * @ordered
	 */
	protected TerminologyBox bundledTerminology;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BundledTerminologyAxiomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMLPackage.eINSTANCE.getBundledTerminologyAxiom();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyBox getBundledTerminology() {
		if (bundledTerminology != null && ((EObject)bundledTerminology).eIsProxy()) {
			InternalEObject oldBundledTerminology = (InternalEObject)bundledTerminology;
			bundledTerminology = (TerminologyBox)eResolveProxy(oldBundledTerminology);
			if (bundledTerminology != oldBundledTerminology) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMLPackage.BUNDLED_TERMINOLOGY_AXIOM__BUNDLED_TERMINOLOGY, oldBundledTerminology, bundledTerminology));
			}
		}
		return bundledTerminology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyBox basicGetBundledTerminology() {
		return bundledTerminology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBundledTerminology(TerminologyBox newBundledTerminology) {
		TerminologyBox oldBundledTerminology = bundledTerminology;
		bundledTerminology = newBundledTerminology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.BUNDLED_TERMINOLOGY_AXIOM__BUNDLED_TERMINOLOGY, oldBundledTerminology, bundledTerminology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String calculateUUID() {
		String _xblockexpression = null;
		{
			Bundle _terminologyBundle = this.getTerminologyBundle();
			String _uuid = _terminologyBundle.getUuid();
			String _plus = ("BundledTerminologyAxiom(terminologyBundle=" + _uuid);
			String _plus_1 = (_plus + ",bundledTerminology=");
			TerminologyBox _bundledTerminology = this.getBundledTerminology();
			String _uuid_1 = _bundledTerminology.getUuid();
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
	public TerminologyBox source() {
		return this.getTerminologyBundle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyBox target() {
		return this.getBundledTerminology();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMLPackage.BUNDLED_TERMINOLOGY_AXIOM__BUNDLED_TERMINOLOGY:
				if (resolve) return getBundledTerminology();
				return basicGetBundledTerminology();
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
			case OMLPackage.BUNDLED_TERMINOLOGY_AXIOM__BUNDLED_TERMINOLOGY:
				setBundledTerminology((TerminologyBox)newValue);
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
			case OMLPackage.BUNDLED_TERMINOLOGY_AXIOM__BUNDLED_TERMINOLOGY:
				setBundledTerminology((TerminologyBox)null);
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
			case OMLPackage.BUNDLED_TERMINOLOGY_AXIOM__BUNDLED_TERMINOLOGY:
				return bundledTerminology != null;
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
			case OMLPackage.BUNDLED_TERMINOLOGY_AXIOM___CALCULATE_UUID:
				return calculateUUID();
			case OMLPackage.BUNDLED_TERMINOLOGY_AXIOM___SOURCE:
				return source();
			case OMLPackage.BUNDLED_TERMINOLOGY_AXIOM___TARGET:
				return target();
		}
		return super.eInvoke(operationID, arguments);
	}

} //BundledTerminologyAxiomImpl
