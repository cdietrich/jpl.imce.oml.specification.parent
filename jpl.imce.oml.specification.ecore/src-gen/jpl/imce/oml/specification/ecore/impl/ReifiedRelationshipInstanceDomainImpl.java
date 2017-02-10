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

import jpl.imce.oml.specification.ecore.ConceptualEntitySingletonInstance;
import jpl.imce.oml.specification.ecore.OMLPackage;
import jpl.imce.oml.specification.ecore.ReifiedRelationshipInstance;
import jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceDomain;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reified Relationship Instance Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.ReifiedRelationshipInstanceDomainImpl#getReifiedRelationshipInstance <em>Reified Relationship Instance</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.ReifiedRelationshipInstanceDomainImpl#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReifiedRelationshipInstanceDomainImpl extends TerminologyInstanceAssertionImpl implements ReifiedRelationshipInstanceDomain {
	/**
	 * The cached value of the '{@link #getReifiedRelationshipInstance() <em>Reified Relationship Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReifiedRelationshipInstance()
	 * @generated
	 * @ordered
	 */
	protected ReifiedRelationshipInstance reifiedRelationshipInstance;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected ConceptualEntitySingletonInstance domain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReifiedRelationshipInstanceDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMLPackage.Literals.REIFIED_RELATIONSHIP_INSTANCE_DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReifiedRelationshipInstance getReifiedRelationshipInstance() {
		if (reifiedRelationshipInstance != null && ((EObject)reifiedRelationshipInstance).eIsProxy()) {
			InternalEObject oldReifiedRelationshipInstance = (InternalEObject)reifiedRelationshipInstance;
			reifiedRelationshipInstance = (ReifiedRelationshipInstance)eResolveProxy(oldReifiedRelationshipInstance);
			if (reifiedRelationshipInstance != oldReifiedRelationshipInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMLPackage.REIFIED_RELATIONSHIP_INSTANCE_DOMAIN__REIFIED_RELATIONSHIP_INSTANCE, oldReifiedRelationshipInstance, reifiedRelationshipInstance));
			}
		}
		return reifiedRelationshipInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReifiedRelationshipInstance basicGetReifiedRelationshipInstance() {
		return reifiedRelationshipInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReifiedRelationshipInstance(ReifiedRelationshipInstance newReifiedRelationshipInstance) {
		ReifiedRelationshipInstance oldReifiedRelationshipInstance = reifiedRelationshipInstance;
		reifiedRelationshipInstance = newReifiedRelationshipInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.REIFIED_RELATIONSHIP_INSTANCE_DOMAIN__REIFIED_RELATIONSHIP_INSTANCE, oldReifiedRelationshipInstance, reifiedRelationshipInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualEntitySingletonInstance getDomain() {
		if (domain != null && ((EObject)domain).eIsProxy()) {
			InternalEObject oldDomain = (InternalEObject)domain;
			domain = (ConceptualEntitySingletonInstance)eResolveProxy(oldDomain);
			if (domain != oldDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMLPackage.REIFIED_RELATIONSHIP_INSTANCE_DOMAIN__DOMAIN, oldDomain, domain));
			}
		}
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualEntitySingletonInstance basicGetDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(ConceptualEntitySingletonInstance newDomain) {
		ConceptualEntitySingletonInstance oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.REIFIED_RELATIONSHIP_INSTANCE_DOMAIN__DOMAIN, oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMLPackage.REIFIED_RELATIONSHIP_INSTANCE_DOMAIN__REIFIED_RELATIONSHIP_INSTANCE:
				if (resolve) return getReifiedRelationshipInstance();
				return basicGetReifiedRelationshipInstance();
			case OMLPackage.REIFIED_RELATIONSHIP_INSTANCE_DOMAIN__DOMAIN:
				if (resolve) return getDomain();
				return basicGetDomain();
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
			case OMLPackage.REIFIED_RELATIONSHIP_INSTANCE_DOMAIN__REIFIED_RELATIONSHIP_INSTANCE:
				setReifiedRelationshipInstance((ReifiedRelationshipInstance)newValue);
				return;
			case OMLPackage.REIFIED_RELATIONSHIP_INSTANCE_DOMAIN__DOMAIN:
				setDomain((ConceptualEntitySingletonInstance)newValue);
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
			case OMLPackage.REIFIED_RELATIONSHIP_INSTANCE_DOMAIN__REIFIED_RELATIONSHIP_INSTANCE:
				setReifiedRelationshipInstance((ReifiedRelationshipInstance)null);
				return;
			case OMLPackage.REIFIED_RELATIONSHIP_INSTANCE_DOMAIN__DOMAIN:
				setDomain((ConceptualEntitySingletonInstance)null);
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
			case OMLPackage.REIFIED_RELATIONSHIP_INSTANCE_DOMAIN__REIFIED_RELATIONSHIP_INSTANCE:
				return reifiedRelationshipInstance != null;
			case OMLPackage.REIFIED_RELATIONSHIP_INSTANCE_DOMAIN__DOMAIN:
				return domain != null;
		}
		return super.eIsSet(featureID);
	}

} //ReifiedRelationshipInstanceDomainImpl
