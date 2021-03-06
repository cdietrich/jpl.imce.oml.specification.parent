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
package jpl.imce.oml.specification.ecore.provider;


import java.util.Collection;
import java.util.List;

import jpl.imce.oml.specification.ecore.EntityRelationship;
import jpl.imce.oml.specification.ecore.OMLPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jpl.imce.oml.specification.ecore.EntityRelationship} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EntityRelationshipItemProvider extends TermItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityRelationshipItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addSourcePropertyDescriptor(object);
			addTargetPropertyDescriptor(object);
			addIsFunctionalPropertyDescriptor(object);
			addIsInverseFunctionalPropertyDescriptor(object);
			addIsEssentialPropertyDescriptor(object);
			addIsInverseEssentialPropertyDescriptor(object);
			addIsSymmetricPropertyDescriptor(object);
			addIsAsymmetricPropertyDescriptor(object);
			addIsReflexivePropertyDescriptor(object);
			addIsIrreflexivePropertyDescriptor(object);
			addIsTransitivePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityRelationship_source_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityRelationship_source_feature", "_UI_EntityRelationship_type"),
				 OMLPackage.eINSTANCE.getEntityRelationship_Source(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityRelationship_target_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityRelationship_target_feature", "_UI_EntityRelationship_type"),
				 OMLPackage.eINSTANCE.getEntityRelationship_Target(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Functional feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsFunctionalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityRelationship_isFunctional_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityRelationship_isFunctional_feature", "_UI_EntityRelationship_type"),
				 OMLPackage.eINSTANCE.getEntityRelationship_IsFunctional(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Inverse Functional feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsInverseFunctionalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityRelationship_isInverseFunctional_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityRelationship_isInverseFunctional_feature", "_UI_EntityRelationship_type"),
				 OMLPackage.eINSTANCE.getEntityRelationship_IsInverseFunctional(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Essential feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsEssentialPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityRelationship_isEssential_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityRelationship_isEssential_feature", "_UI_EntityRelationship_type"),
				 OMLPackage.eINSTANCE.getEntityRelationship_IsEssential(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Inverse Essential feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsInverseEssentialPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityRelationship_isInverseEssential_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityRelationship_isInverseEssential_feature", "_UI_EntityRelationship_type"),
				 OMLPackage.eINSTANCE.getEntityRelationship_IsInverseEssential(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Symmetric feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsSymmetricPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityRelationship_isSymmetric_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityRelationship_isSymmetric_feature", "_UI_EntityRelationship_type"),
				 OMLPackage.eINSTANCE.getEntityRelationship_IsSymmetric(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Asymmetric feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsAsymmetricPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityRelationship_isAsymmetric_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityRelationship_isAsymmetric_feature", "_UI_EntityRelationship_type"),
				 OMLPackage.eINSTANCE.getEntityRelationship_IsAsymmetric(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Reflexive feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsReflexivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityRelationship_isReflexive_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityRelationship_isReflexive_feature", "_UI_EntityRelationship_type"),
				 OMLPackage.eINSTANCE.getEntityRelationship_IsReflexive(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Irreflexive feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsIrreflexivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityRelationship_isIrreflexive_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityRelationship_isIrreflexive_feature", "_UI_EntityRelationship_type"),
				 OMLPackage.eINSTANCE.getEntityRelationship_IsIrreflexive(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Transitive feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsTransitivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityRelationship_isTransitive_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityRelationship_isTransitive_feature", "_UI_EntityRelationship_type"),
				 OMLPackage.eINSTANCE.getEntityRelationship_IsTransitive(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EntityRelationship)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EntityRelationship_type") :
			getString("_UI_EntityRelationship_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(EntityRelationship.class)) {
			case OMLPackage.ENTITY_RELATIONSHIP__IS_FUNCTIONAL:
			case OMLPackage.ENTITY_RELATIONSHIP__IS_INVERSE_FUNCTIONAL:
			case OMLPackage.ENTITY_RELATIONSHIP__IS_ESSENTIAL:
			case OMLPackage.ENTITY_RELATIONSHIP__IS_INVERSE_ESSENTIAL:
			case OMLPackage.ENTITY_RELATIONSHIP__IS_SYMMETRIC:
			case OMLPackage.ENTITY_RELATIONSHIP__IS_ASYMMETRIC:
			case OMLPackage.ENTITY_RELATIONSHIP__IS_REFLEXIVE:
			case OMLPackage.ENTITY_RELATIONSHIP__IS_IRREFLEXIVE:
			case OMLPackage.ENTITY_RELATIONSHIP__IS_TRANSITIVE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
