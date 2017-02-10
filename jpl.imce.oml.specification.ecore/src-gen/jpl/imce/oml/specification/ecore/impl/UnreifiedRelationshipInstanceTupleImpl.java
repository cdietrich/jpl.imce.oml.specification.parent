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
import jpl.imce.oml.specification.ecore.UnreifiedRelationship;
import jpl.imce.oml.specification.ecore.UnreifiedRelationshipInstanceTuple;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unreified Relationship Instance Tuple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.UnreifiedRelationshipInstanceTupleImpl#getUnreifiedRelationship <em>Unreified Relationship</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.UnreifiedRelationshipInstanceTupleImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.UnreifiedRelationshipInstanceTupleImpl#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnreifiedRelationshipInstanceTupleImpl extends TerminologyInstanceAssertionImpl implements UnreifiedRelationshipInstanceTuple {
	/**
	 * The cached value of the '{@link #getUnreifiedRelationship() <em>Unreified Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnreifiedRelationship()
	 * @generated
	 * @ordered
	 */
	protected UnreifiedRelationship unreifiedRelationship;

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
	 * The cached value of the '{@link #getRange() <em>Range</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected ConceptualEntitySingletonInstance range;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnreifiedRelationshipInstanceTupleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMLPackage.Literals.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnreifiedRelationship getUnreifiedRelationship() {
		if (unreifiedRelationship != null && ((EObject)unreifiedRelationship).eIsProxy()) {
			InternalEObject oldUnreifiedRelationship = (InternalEObject)unreifiedRelationship;
			unreifiedRelationship = (UnreifiedRelationship)eResolveProxy(oldUnreifiedRelationship);
			if (unreifiedRelationship != oldUnreifiedRelationship) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMLPackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__UNREIFIED_RELATIONSHIP, oldUnreifiedRelationship, unreifiedRelationship));
			}
		}
		return unreifiedRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnreifiedRelationship basicGetUnreifiedRelationship() {
		return unreifiedRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnreifiedRelationship(UnreifiedRelationship newUnreifiedRelationship) {
		UnreifiedRelationship oldUnreifiedRelationship = unreifiedRelationship;
		unreifiedRelationship = newUnreifiedRelationship;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__UNREIFIED_RELATIONSHIP, oldUnreifiedRelationship, unreifiedRelationship));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMLPackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__DOMAIN, oldDomain, domain));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__DOMAIN, oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualEntitySingletonInstance getRange() {
		if (range != null && ((EObject)range).eIsProxy()) {
			InternalEObject oldRange = (InternalEObject)range;
			range = (ConceptualEntitySingletonInstance)eResolveProxy(oldRange);
			if (range != oldRange) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMLPackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__RANGE, oldRange, range));
			}
		}
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualEntitySingletonInstance basicGetRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(ConceptualEntitySingletonInstance newRange) {
		ConceptualEntitySingletonInstance oldRange = range;
		range = newRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__RANGE, oldRange, range));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMLPackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__UNREIFIED_RELATIONSHIP:
				if (resolve) return getUnreifiedRelationship();
				return basicGetUnreifiedRelationship();
			case OMLPackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__DOMAIN:
				if (resolve) return getDomain();
				return basicGetDomain();
			case OMLPackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__RANGE:
				if (resolve) return getRange();
				return basicGetRange();
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
			case OMLPackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__UNREIFIED_RELATIONSHIP:
				setUnreifiedRelationship((UnreifiedRelationship)newValue);
				return;
			case OMLPackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__DOMAIN:
				setDomain((ConceptualEntitySingletonInstance)newValue);
				return;
			case OMLPackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__RANGE:
				setRange((ConceptualEntitySingletonInstance)newValue);
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
			case OMLPackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__UNREIFIED_RELATIONSHIP:
				setUnreifiedRelationship((UnreifiedRelationship)null);
				return;
			case OMLPackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__DOMAIN:
				setDomain((ConceptualEntitySingletonInstance)null);
				return;
			case OMLPackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__RANGE:
				setRange((ConceptualEntitySingletonInstance)null);
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
			case OMLPackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__UNREIFIED_RELATIONSHIP:
				return unreifiedRelationship != null;
			case OMLPackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__DOMAIN:
				return domain != null;
			case OMLPackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__RANGE:
				return range != null;
		}
		return super.eIsSet(featureID);
	}

} //UnreifiedRelationshipInstanceTupleImpl
