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

import jpl.imce.oml.specification.ecore.OMLFactory;
import jpl.imce.oml.specification.ecore.OMLPackage;
import jpl.imce.oml.specification.ecore.TerminologyExtent;

import jpl.imce.oml.specification.ecore.edit.provider.OMLEditPlugin;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jpl.imce.oml.specification.ecore.TerminologyExtent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TerminologyExtentItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyExtentItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(OMLPackage.Literals.TERMINOLOGY_EXTENT__ANNOTATION_PROPERTIES);
			childrenFeatures.add(OMLPackage.Literals.TERMINOLOGY_EXTENT__TERMINOLOGY_GRAPHS);
			childrenFeatures.add(OMLPackage.Literals.TERMINOLOGY_EXTENT__BUNDLES);
			childrenFeatures.add(OMLPackage.Literals.TERMINOLOGY_EXTENT__DESCRIPTIONS);
			childrenFeatures.add(OMLPackage.Literals.TERMINOLOGY_EXTENT__INSTANCE_ASSERTIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns TerminologyExtent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TerminologyExtent"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_TerminologyExtent_type");
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

		switch (notification.getFeatureID(TerminologyExtent.class)) {
			case OMLPackage.TERMINOLOGY_EXTENT__ANNOTATION_PROPERTIES:
			case OMLPackage.TERMINOLOGY_EXTENT__TERMINOLOGY_GRAPHS:
			case OMLPackage.TERMINOLOGY_EXTENT__BUNDLES:
			case OMLPackage.TERMINOLOGY_EXTENT__DESCRIPTIONS:
			case OMLPackage.TERMINOLOGY_EXTENT__INSTANCE_ASSERTIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(OMLPackage.Literals.TERMINOLOGY_EXTENT__ANNOTATION_PROPERTIES,
				 OMLFactory.eINSTANCE.createAnnotationProperty()));

		newChildDescriptors.add
			(createChildParameter
				(OMLPackage.Literals.TERMINOLOGY_EXTENT__TERMINOLOGY_GRAPHS,
				 OMLFactory.eINSTANCE.createTerminologyGraph()));

		newChildDescriptors.add
			(createChildParameter
				(OMLPackage.Literals.TERMINOLOGY_EXTENT__BUNDLES,
				 OMLFactory.eINSTANCE.createBundle()));

		newChildDescriptors.add
			(createChildParameter
				(OMLPackage.Literals.TERMINOLOGY_EXTENT__DESCRIPTIONS,
				 OMLFactory.eINSTANCE.createDescriptionBox()));

		newChildDescriptors.add
			(createChildParameter
				(OMLPackage.Literals.TERMINOLOGY_EXTENT__INSTANCE_ASSERTIONS,
				 OMLFactory.eINSTANCE.createScalarDataPropertyValue()));

		newChildDescriptors.add
			(createChildParameter
				(OMLPackage.Literals.TERMINOLOGY_EXTENT__INSTANCE_ASSERTIONS,
				 OMLFactory.eINSTANCE.createStructuredDataPropertyValue()));

		newChildDescriptors.add
			(createChildParameter
				(OMLPackage.Literals.TERMINOLOGY_EXTENT__INSTANCE_ASSERTIONS,
				 OMLFactory.eINSTANCE.createDataStructureTuple()));

		newChildDescriptors.add
			(createChildParameter
				(OMLPackage.Literals.TERMINOLOGY_EXTENT__INSTANCE_ASSERTIONS,
				 OMLFactory.eINSTANCE.createConceptInstance()));

		newChildDescriptors.add
			(createChildParameter
				(OMLPackage.Literals.TERMINOLOGY_EXTENT__INSTANCE_ASSERTIONS,
				 OMLFactory.eINSTANCE.createReifiedRelationshipInstance()));

		newChildDescriptors.add
			(createChildParameter
				(OMLPackage.Literals.TERMINOLOGY_EXTENT__INSTANCE_ASSERTIONS,
				 OMLFactory.eINSTANCE.createReifiedRelationshipInstanceDomain()));

		newChildDescriptors.add
			(createChildParameter
				(OMLPackage.Literals.TERMINOLOGY_EXTENT__INSTANCE_ASSERTIONS,
				 OMLFactory.eINSTANCE.createReifiedRelationshipInstanceRange()));

		newChildDescriptors.add
			(createChildParameter
				(OMLPackage.Literals.TERMINOLOGY_EXTENT__INSTANCE_ASSERTIONS,
				 OMLFactory.eINSTANCE.createUnreifiedRelationshipInstanceTuple()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return OMLEditPlugin.INSTANCE;
	}

}
