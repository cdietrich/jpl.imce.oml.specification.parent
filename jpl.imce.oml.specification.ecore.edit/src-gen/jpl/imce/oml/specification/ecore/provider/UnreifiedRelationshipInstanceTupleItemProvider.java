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

import jpl.imce.oml.specification.ecore.OMLPackage;
import jpl.imce.oml.specification.ecore.UnreifiedRelationshipInstanceTuple;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link jpl.imce.oml.specification.ecore.UnreifiedRelationshipInstanceTuple} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UnreifiedRelationshipInstanceTupleItemProvider extends TerminologyInstanceAssertionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnreifiedRelationshipInstanceTupleItemProvider(AdapterFactory adapterFactory) {
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

			addDescriptionBoxPropertyDescriptor(object);
			addUnreifiedRelationshipPropertyDescriptor(object);
			addDomainPropertyDescriptor(object);
			addRangePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Description Box feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionBoxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnreifiedRelationshipInstanceTuple_descriptionBox_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnreifiedRelationshipInstanceTuple_descriptionBox_feature", "_UI_UnreifiedRelationshipInstanceTuple_type"),
				 OMLPackage.eINSTANCE.getUnreifiedRelationshipInstanceTuple_DescriptionBox(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Unreified Relationship feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnreifiedRelationshipPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnreifiedRelationshipInstanceTuple_unreifiedRelationship_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnreifiedRelationshipInstanceTuple_unreifiedRelationship_feature", "_UI_UnreifiedRelationshipInstanceTuple_type"),
				 OMLPackage.eINSTANCE.getUnreifiedRelationshipInstanceTuple_UnreifiedRelationship(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnreifiedRelationshipInstanceTuple_domain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnreifiedRelationshipInstanceTuple_domain_feature", "_UI_UnreifiedRelationshipInstanceTuple_type"),
				 OMLPackage.eINSTANCE.getUnreifiedRelationshipInstanceTuple_Domain(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Range feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRangePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnreifiedRelationshipInstanceTuple_range_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnreifiedRelationshipInstanceTuple_range_feature", "_UI_UnreifiedRelationshipInstanceTuple_type"),
				 OMLPackage.eINSTANCE.getUnreifiedRelationshipInstanceTuple_Range(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns UnreifiedRelationshipInstanceTuple.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UnreifiedRelationshipInstanceTuple"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UnreifiedRelationshipInstanceTuple)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_UnreifiedRelationshipInstanceTuple_type") :
			getString("_UI_UnreifiedRelationshipInstanceTuple_type") + " " + label;
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
