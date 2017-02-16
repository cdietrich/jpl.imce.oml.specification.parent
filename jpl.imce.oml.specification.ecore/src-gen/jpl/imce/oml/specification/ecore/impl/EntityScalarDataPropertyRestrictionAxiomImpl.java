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

import jpl.imce.oml.specification.ecore.Entity;
import jpl.imce.oml.specification.ecore.EntityScalarDataProperty;
import jpl.imce.oml.specification.ecore.EntityScalarDataPropertyRestrictionAxiom;
import jpl.imce.oml.specification.ecore.OMLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Scalar Data Property Restriction Axiom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.EntityScalarDataPropertyRestrictionAxiomImpl#getRestrictedEntity <em>Restricted Entity</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.EntityScalarDataPropertyRestrictionAxiomImpl#getScalarProperty <em>Scalar Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntityScalarDataPropertyRestrictionAxiomImpl extends TermAxiomImpl implements EntityScalarDataPropertyRestrictionAxiom {
	/**
	 * The cached value of the '{@link #getRestrictedEntity() <em>Restricted Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictedEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity restrictedEntity;

	/**
	 * The cached value of the '{@link #getScalarProperty() <em>Scalar Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalarProperty()
	 * @generated
	 * @ordered
	 */
	protected EntityScalarDataProperty scalarProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityScalarDataPropertyRestrictionAxiomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMLPackage.eINSTANCE.getEntityScalarDataPropertyRestrictionAxiom();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getRestrictedEntity() {
		if (restrictedEntity != null && ((EObject)restrictedEntity).eIsProxy()) {
			InternalEObject oldRestrictedEntity = (InternalEObject)restrictedEntity;
			restrictedEntity = (Entity)eResolveProxy(oldRestrictedEntity);
			if (restrictedEntity != oldRestrictedEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMLPackage.ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__RESTRICTED_ENTITY, oldRestrictedEntity, restrictedEntity));
			}
		}
		return restrictedEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetRestrictedEntity() {
		return restrictedEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestrictedEntity(Entity newRestrictedEntity) {
		Entity oldRestrictedEntity = restrictedEntity;
		restrictedEntity = newRestrictedEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__RESTRICTED_ENTITY, oldRestrictedEntity, restrictedEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityScalarDataProperty getScalarProperty() {
		if (scalarProperty != null && ((EObject)scalarProperty).eIsProxy()) {
			InternalEObject oldScalarProperty = (InternalEObject)scalarProperty;
			scalarProperty = (EntityScalarDataProperty)eResolveProxy(oldScalarProperty);
			if (scalarProperty != oldScalarProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMLPackage.ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__SCALAR_PROPERTY, oldScalarProperty, scalarProperty));
			}
		}
		return scalarProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityScalarDataProperty basicGetScalarProperty() {
		return scalarProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScalarProperty(EntityScalarDataProperty newScalarProperty) {
		EntityScalarDataProperty oldScalarProperty = scalarProperty;
		scalarProperty = newScalarProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__SCALAR_PROPERTY, oldScalarProperty, scalarProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMLPackage.ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__RESTRICTED_ENTITY:
				if (resolve) return getRestrictedEntity();
				return basicGetRestrictedEntity();
			case OMLPackage.ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__SCALAR_PROPERTY:
				if (resolve) return getScalarProperty();
				return basicGetScalarProperty();
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
			case OMLPackage.ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__RESTRICTED_ENTITY:
				setRestrictedEntity((Entity)newValue);
				return;
			case OMLPackage.ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__SCALAR_PROPERTY:
				setScalarProperty((EntityScalarDataProperty)newValue);
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
			case OMLPackage.ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__RESTRICTED_ENTITY:
				setRestrictedEntity((Entity)null);
				return;
			case OMLPackage.ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__SCALAR_PROPERTY:
				setScalarProperty((EntityScalarDataProperty)null);
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
			case OMLPackage.ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__RESTRICTED_ENTITY:
				return restrictedEntity != null;
			case OMLPackage.ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__SCALAR_PROPERTY:
				return scalarProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //EntityScalarDataPropertyRestrictionAxiomImpl
