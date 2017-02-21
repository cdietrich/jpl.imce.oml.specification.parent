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
import jpl.imce.oml.specification.ecore.OMLPackage;
import jpl.imce.oml.specification.ecore.ReifiedRelationshipInstance;
import jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceDomain;
import jpl.imce.oml.specification.ecore.TerminologyInstanceAssertion;
import jpl.imce.oml.specification.ecore.TerminologyThing;

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
 * An implementation of the model object '<em><b>Reified Relationship Instance Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.ReifiedRelationshipInstanceDomainImpl#getDescriptionBox <em>Description Box</em>}</li>
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
		return OMLPackage.eINSTANCE.getReifiedRelationshipInstanceDomain();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionBox getDescriptionBox() {
		if (eContainerFeatureID() != OMLPackage.REIFIED_RELATIONSHIP_INSTANCE_DOMAIN__DESCRIPTION_BOX) return null;
		return (DescriptionBox)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionBox basicGetDescriptionBox() {
		if (eContainerFeatureID() != OMLPackage.REIFIED_RELATIONSHIP_INSTANCE_DOMAIN__DESCRIPTION_BOX) return null;
		return (DescriptionBox)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescriptionBox(DescriptionBox newDescriptionBox, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDescriptionBox, OMLPackage.REIFIED_RELATIONSHIP_INSTANCE_DOMAIN__DESCRIPTION_BOX, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionBox(DescriptionBox newDescriptionBox) {
		if (newDescriptionBox != eInternalContainer() || (eContainerFeatureID() != OMLPackage.REIFIED_RELATIONSHIP_INSTANCE_DOMAIN__DESCRIPTION_BOX && newDescriptionBox != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newDescriptionBox))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDescriptionBox != null)
				msgs = ((InternalEObject)newDescriptionBox).eInverseAdd(this, OMLPackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCE_DOMAINS, DescriptionBox.class, msgs);
			msgs = basicSetDescriptionBox(newDescriptionBox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.REIFIED_RELATIONSHIP_INSTANCE_DOMAIN__DESCRIPTION_BOX, newDescriptionBox, newDescriptionBox));
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
	public String calculateUUID() {
		String _xblockexpression = null;
		{
			DescriptionBox _descriptionBox = this.descriptionBox();
			String _uuid = _descriptionBox.getUuid();
			String _plus = ("ReifiedRelationshipInstanceDomain(descriptionBox=" + _uuid);
			String _plus_1 = (_plus + ",reifiedRelationshipInstance=");
			ReifiedRelationshipInstance _reifiedRelationshipInstance = this.getReifiedRelationshipInstance();
			String _uuid_1 = _reifiedRelationshipInstance.getUuid();
			String _plus_2 = (_plus_1 + _uuid_1);
			String _plus_3 = (_plus_2 + ",domain=");
			ConceptualEntitySingletonInstance _domain = this.getDomain();
			String _uuid_2 = _domain.getUuid();
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMLPackage.REIFIED_RELATIONSHIP_INSTANCE_DOMAIN__DESCRIPTION_BOX:
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
			case OMLPackage.REIFIED_RELATIONSHIP_INSTANCE_DOMAIN__DESCRIPTION_BOX:
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
			case OMLPackage.REIFIED_RELATIONSHIP_INSTANCE_DOMAIN__DESCRIPTION_BOX:
				return eInternalContainer().eInverseRemove(this, OMLPackage.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCE_DOMAINS, DescriptionBox.class, msgs);
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
			case OMLPackage.REIFIED_RELATIONSHIP_INSTANCE_DOMAIN__DESCRIPTION_BOX:
				if (resolve) return getDescriptionBox();
				return basicGetDescriptionBox();
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
			case OMLPackage.REIFIED_RELATIONSHIP_INSTANCE_DOMAIN__DESCRIPTION_BOX:
				setDescriptionBox((DescriptionBox)newValue);
				return;
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
			case OMLPackage.REIFIED_RELATIONSHIP_INSTANCE_DOMAIN__DESCRIPTION_BOX:
				setDescriptionBox((DescriptionBox)null);
				return;
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
			case OMLPackage.REIFIED_RELATIONSHIP_INSTANCE_DOMAIN__DESCRIPTION_BOX:
				return basicGetDescriptionBox() != null;
			case OMLPackage.REIFIED_RELATIONSHIP_INSTANCE_DOMAIN__REIFIED_RELATIONSHIP_INSTANCE:
				return reifiedRelationshipInstance != null;
			case OMLPackage.REIFIED_RELATIONSHIP_INSTANCE_DOMAIN__DOMAIN:
				return domain != null;
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
				case OMLPackage.TERMINOLOGY_THING___CALCULATE_UUID: return OMLPackage.REIFIED_RELATIONSHIP_INSTANCE_DOMAIN___CALCULATE_UUID;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == TerminologyInstanceAssertion.class) {
			switch (baseOperationID) {
				case OMLPackage.TERMINOLOGY_INSTANCE_ASSERTION___CALCULATE_UUID: return OMLPackage.REIFIED_RELATIONSHIP_INSTANCE_DOMAIN___CALCULATE_UUID;
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
			case OMLPackage.REIFIED_RELATIONSHIP_INSTANCE_DOMAIN___CALCULATE_UUID:
				return calculateUUID();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ReifiedRelationshipInstanceDomainImpl
