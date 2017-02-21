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

import jpl.imce.oml.specification.ecore.ConceptualEntitySingletonInstance;
import jpl.imce.oml.specification.ecore.DescriptionBox;
import jpl.imce.oml.specification.ecore.EcorePackage;
import jpl.imce.oml.specification.ecore.TerminologyInstanceAssertion;
import jpl.imce.oml.specification.ecore.TerminologyThing;
import jpl.imce.oml.specification.ecore.UnreifiedRelationship;
import jpl.imce.oml.specification.ecore.UnreifiedRelationshipInstanceTuple;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unreified Relationship Instance Tuple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.UnreifiedRelationshipInstanceTupleImpl#getDescriptionBox <em>Description Box</em>}</li>
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
		return EcorePackage.eINSTANCE.getUnreifiedRelationshipInstanceTuple();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionBox getDescriptionBox() {
		if (eContainerFeatureID() != EcorePackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__DESCRIPTION_BOX) return null;
		return (DescriptionBox)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionBox basicGetDescriptionBox() {
		if (eContainerFeatureID() != EcorePackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__DESCRIPTION_BOX) return null;
		return (DescriptionBox)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescriptionBox(DescriptionBox newDescriptionBox, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDescriptionBox, EcorePackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__DESCRIPTION_BOX, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionBox(DescriptionBox newDescriptionBox) {
		if (newDescriptionBox != eInternalContainer() || (eContainerFeatureID() != EcorePackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__DESCRIPTION_BOX && newDescriptionBox != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newDescriptionBox))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDescriptionBox != null)
				msgs = ((InternalEObject)newDescriptionBox).eInverseAdd(this, EcorePackage.DESCRIPTION_BOX__UNREIFIED_RELATIONSHIP_INSTANCE_TUPLES, DescriptionBox.class, msgs);
			msgs = basicSetDescriptionBox(newDescriptionBox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__DESCRIPTION_BOX, newDescriptionBox, newDescriptionBox));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcorePackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__UNREIFIED_RELATIONSHIP, oldUnreifiedRelationship, unreifiedRelationship));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__UNREIFIED_RELATIONSHIP, oldUnreifiedRelationship, unreifiedRelationship));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcorePackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__DOMAIN, oldDomain, domain));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__DOMAIN, oldDomain, domain));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcorePackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__RANGE, oldRange, range));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__RANGE, oldRange, range));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String calculateUUID() {
		String _xblockexpression = null;
		{
			DescriptionBox _descriptionBox = this.descriptionBox();
			String _uuid = _descriptionBox.getUuid();
			String _plus = ("UnreifiedRelationshipInstanceTuple(descriptionBox=" + _uuid);
			String _plus_1 = (_plus + ",unreifiedRelationship=");
			UnreifiedRelationship _unreifiedRelationship = this.getUnreifiedRelationship();
			String _uuid_1 = _unreifiedRelationship.getUuid();
			String _plus_2 = (_plus_1 + _uuid_1);
			String _plus_3 = (_plus_2 + ",domain=");
			ConceptualEntitySingletonInstance _domain = this.getDomain();
			String _uuid_2 = _domain.getUuid();
			String _plus_4 = (_plus_3 + _uuid_2);
			String _plus_5 = (_plus_4 + ",range=");
			ConceptualEntitySingletonInstance _range = this.getRange();
			String _uuid_3 = _range.getUuid();
			String _plus_6 = (_plus_5 + _uuid_3);
			final String namespace = (_plus_6 + ")");
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__DESCRIPTION_BOX:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDescriptionBox((DescriptionBox)otherEnd, msgs);
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
			case EcorePackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__DESCRIPTION_BOX:
				return basicSetDescriptionBox(null, msgs);
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
			case EcorePackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__DESCRIPTION_BOX:
				return eInternalContainer().eInverseRemove(this, EcorePackage.DESCRIPTION_BOX__UNREIFIED_RELATIONSHIP_INSTANCE_TUPLES, DescriptionBox.class, msgs);
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
			case EcorePackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__DESCRIPTION_BOX:
				if (resolve) return getDescriptionBox();
				return basicGetDescriptionBox();
			case EcorePackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__UNREIFIED_RELATIONSHIP:
				if (resolve) return getUnreifiedRelationship();
				return basicGetUnreifiedRelationship();
			case EcorePackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__DOMAIN:
				if (resolve) return getDomain();
				return basicGetDomain();
			case EcorePackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__RANGE:
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
			case EcorePackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__DESCRIPTION_BOX:
				setDescriptionBox((DescriptionBox)newValue);
				return;
			case EcorePackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__UNREIFIED_RELATIONSHIP:
				setUnreifiedRelationship((UnreifiedRelationship)newValue);
				return;
			case EcorePackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__DOMAIN:
				setDomain((ConceptualEntitySingletonInstance)newValue);
				return;
			case EcorePackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__RANGE:
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
			case EcorePackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__DESCRIPTION_BOX:
				setDescriptionBox((DescriptionBox)null);
				return;
			case EcorePackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__UNREIFIED_RELATIONSHIP:
				setUnreifiedRelationship((UnreifiedRelationship)null);
				return;
			case EcorePackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__DOMAIN:
				setDomain((ConceptualEntitySingletonInstance)null);
				return;
			case EcorePackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__RANGE:
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
			case EcorePackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__DESCRIPTION_BOX:
				return basicGetDescriptionBox() != null;
			case EcorePackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__UNREIFIED_RELATIONSHIP:
				return unreifiedRelationship != null;
			case EcorePackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__DOMAIN:
				return domain != null;
			case EcorePackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__RANGE:
				return range != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == TerminologyThing.class) {
			switch (baseOperationID) {
				case EcorePackage.TERMINOLOGY_THING___CALCULATE_UUID: return EcorePackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE___CALCULATE_UUID;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == TerminologyInstanceAssertion.class) {
			switch (baseOperationID) {
				case EcorePackage.TERMINOLOGY_INSTANCE_ASSERTION___CALCULATE_UUID: return EcorePackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE___CALCULATE_UUID;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EcorePackage.UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE___CALCULATE_UUID:
				return calculateUUID();
		}
		return super.eInvoke(operationID, arguments);
	}

} //UnreifiedRelationshipInstanceTupleImpl
