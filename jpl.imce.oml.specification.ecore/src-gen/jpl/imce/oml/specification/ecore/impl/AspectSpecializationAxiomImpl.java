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

import jpl.imce.oml.specification.ecore.Aspect;
import jpl.imce.oml.specification.ecore.AspectSpecializationAxiom;
import jpl.imce.oml.specification.ecore.Entity;
import jpl.imce.oml.specification.ecore.OMLPackage;
import jpl.imce.oml.specification.ecore.Term;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aspect Specialization Axiom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.AspectSpecializationAxiomImpl#getSubEntity <em>Sub Entity</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.AspectSpecializationAxiomImpl#getSuperAspect <em>Super Aspect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AspectSpecializationAxiomImpl extends SpecializationAxiomImpl implements AspectSpecializationAxiom {
	/**
	 * The cached value of the '{@link #getSubEntity() <em>Sub Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity subEntity;

	/**
	 * The cached value of the '{@link #getSuperAspect() <em>Super Aspect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperAspect()
	 * @generated
	 * @ordered
	 */
	protected Aspect superAspect;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AspectSpecializationAxiomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMLPackage.Literals.ASPECT_SPECIALIZATION_AXIOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getSubEntity() {
		if (subEntity != null && ((EObject)subEntity).eIsProxy()) {
			InternalEObject oldSubEntity = (InternalEObject)subEntity;
			subEntity = (Entity)eResolveProxy(oldSubEntity);
			if (subEntity != oldSubEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMLPackage.ASPECT_SPECIALIZATION_AXIOM__SUB_ENTITY, oldSubEntity, subEntity));
			}
		}
		return subEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetSubEntity() {
		return subEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubEntity(Entity newSubEntity) {
		Entity oldSubEntity = subEntity;
		subEntity = newSubEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.ASPECT_SPECIALIZATION_AXIOM__SUB_ENTITY, oldSubEntity, subEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aspect getSuperAspect() {
		if (superAspect != null && ((EObject)superAspect).eIsProxy()) {
			InternalEObject oldSuperAspect = (InternalEObject)superAspect;
			superAspect = (Aspect)eResolveProxy(oldSuperAspect);
			if (superAspect != oldSuperAspect) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMLPackage.ASPECT_SPECIALIZATION_AXIOM__SUPER_ASPECT, oldSuperAspect, superAspect));
			}
		}
		return superAspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aspect basicGetSuperAspect() {
		return superAspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperAspect(Aspect newSuperAspect) {
		Aspect oldSuperAspect = superAspect;
		superAspect = newSuperAspect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.ASPECT_SPECIALIZATION_AXIOM__SUPER_ASPECT, oldSuperAspect, superAspect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String calculateUUID() {
		String _xblockexpression = null;
		{
			Entity _subEntity = this.getSubEntity();
			String _uuid = _subEntity.getUuid();
			String _plus = ("AspectSpecializationAxiom(subEntity=" + _uuid);
			String _plus_1 = (_plus + ",superAspect=");
			Aspect _superAspect = this.getSuperAspect();
			String _uuid_1 = _superAspect.getUuid();
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
	public Term child() {
		return this.getSubEntity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term parent() {
		return this.getSuperAspect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMLPackage.ASPECT_SPECIALIZATION_AXIOM__SUB_ENTITY:
				if (resolve) return getSubEntity();
				return basicGetSubEntity();
			case OMLPackage.ASPECT_SPECIALIZATION_AXIOM__SUPER_ASPECT:
				if (resolve) return getSuperAspect();
				return basicGetSuperAspect();
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
			case OMLPackage.ASPECT_SPECIALIZATION_AXIOM__SUB_ENTITY:
				setSubEntity((Entity)newValue);
				return;
			case OMLPackage.ASPECT_SPECIALIZATION_AXIOM__SUPER_ASPECT:
				setSuperAspect((Aspect)newValue);
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
			case OMLPackage.ASPECT_SPECIALIZATION_AXIOM__SUB_ENTITY:
				setSubEntity((Entity)null);
				return;
			case OMLPackage.ASPECT_SPECIALIZATION_AXIOM__SUPER_ASPECT:
				setSuperAspect((Aspect)null);
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
			case OMLPackage.ASPECT_SPECIALIZATION_AXIOM__SUB_ENTITY:
				return subEntity != null;
			case OMLPackage.ASPECT_SPECIALIZATION_AXIOM__SUPER_ASPECT:
				return superAspect != null;
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
			case OMLPackage.ASPECT_SPECIALIZATION_AXIOM___CALCULATE_UUID:
				return calculateUUID();
			case OMLPackage.ASPECT_SPECIALIZATION_AXIOM___CHILD:
				return child();
			case OMLPackage.ASPECT_SPECIALIZATION_AXIOM___PARENT:
				return parent();
		}
		return super.eInvoke(operationID, arguments);
	}

} //AspectSpecializationAxiomImpl
