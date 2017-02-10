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

import jpl.imce.oml.specification.ecore.DescriptionBox;
import jpl.imce.oml.specification.ecore.OMLFactory;
import jpl.imce.oml.specification.ecore.OMLPackage;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jpl.imce.oml.specification.ecore.DescriptionBox} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DescriptionBoxItemProvider 
	extends TerminologyThingItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionBoxItemProvider(AdapterFactory adapterFactory) {
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

			addTerminologyExtentPropertyDescriptor(object);
			addConceptInstancesPropertyDescriptor(object);
			addReifiedRelationshipInstancesPropertyDescriptor(object);
			addReifiedRelationshipInstanceDomainsPropertyDescriptor(object);
			addReifiedRelationshipInstanceRangesPropertyDescriptor(object);
			addUnreifiedRelationshipInstanceTuplesPropertyDescriptor(object);
			addDataStructureTuplesPropertyDescriptor(object);
			addScalarDataPropertyValuesPropertyDescriptor(object);
			addStructuredDataPropertyValuesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Terminology Extent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTerminologyExtentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DescriptionBox_terminologyExtent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DescriptionBox_terminologyExtent_feature", "_UI_DescriptionBox_type"),
				 OMLPackage.Literals.DESCRIPTION_BOX__TERMINOLOGY_EXTENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Concept Instances feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConceptInstancesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DescriptionBox_conceptInstances_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DescriptionBox_conceptInstances_feature", "_UI_DescriptionBox_type"),
				 OMLPackage.Literals.DESCRIPTION_BOX__CONCEPT_INSTANCES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reified Relationship Instances feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReifiedRelationshipInstancesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DescriptionBox_reifiedRelationshipInstances_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DescriptionBox_reifiedRelationshipInstances_feature", "_UI_DescriptionBox_type"),
				 OMLPackage.Literals.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reified Relationship Instance Domains feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReifiedRelationshipInstanceDomainsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DescriptionBox_reifiedRelationshipInstanceDomains_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DescriptionBox_reifiedRelationshipInstanceDomains_feature", "_UI_DescriptionBox_type"),
				 OMLPackage.Literals.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCE_DOMAINS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reified Relationship Instance Ranges feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReifiedRelationshipInstanceRangesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DescriptionBox_reifiedRelationshipInstanceRanges_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DescriptionBox_reifiedRelationshipInstanceRanges_feature", "_UI_DescriptionBox_type"),
				 OMLPackage.Literals.DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCE_RANGES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Unreified Relationship Instance Tuples feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnreifiedRelationshipInstanceTuplesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DescriptionBox_unreifiedRelationshipInstanceTuples_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DescriptionBox_unreifiedRelationshipInstanceTuples_feature", "_UI_DescriptionBox_type"),
				 OMLPackage.Literals.DESCRIPTION_BOX__UNREIFIED_RELATIONSHIP_INSTANCE_TUPLES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Structure Tuples feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataStructureTuplesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DescriptionBox_dataStructureTuples_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DescriptionBox_dataStructureTuples_feature", "_UI_DescriptionBox_type"),
				 OMLPackage.Literals.DESCRIPTION_BOX__DATA_STRUCTURE_TUPLES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scalar Data Property Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScalarDataPropertyValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DescriptionBox_scalarDataPropertyValues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DescriptionBox_scalarDataPropertyValues_feature", "_UI_DescriptionBox_type"),
				 OMLPackage.Literals.DESCRIPTION_BOX__SCALAR_DATA_PROPERTY_VALUES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Structured Data Property Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStructuredDataPropertyValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DescriptionBox_structuredDataPropertyValues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DescriptionBox_structuredDataPropertyValues_feature", "_UI_DescriptionBox_type"),
				 OMLPackage.Literals.DESCRIPTION_BOX__STRUCTURED_DATA_PROPERTY_VALUES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(OMLPackage.Literals.DESCRIPTION_BOX__CLOSED_WORLD_DEFINITIONS);
			childrenFeatures.add(OMLPackage.Literals.DESCRIPTION_BOX__DESCRIPTION_BOX_REFINEMENTS);
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
	 * This returns DescriptionBox.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DescriptionBox"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DescriptionBox)object).getUuid();
		return label == null || label.length() == 0 ?
			getString("_UI_DescriptionBox_type") :
			getString("_UI_DescriptionBox_type") + " " + label;
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

		switch (notification.getFeatureID(DescriptionBox.class)) {
			case OMLPackage.DESCRIPTION_BOX__CLOSED_WORLD_DEFINITIONS:
			case OMLPackage.DESCRIPTION_BOX__DESCRIPTION_BOX_REFINEMENTS:
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
				(OMLPackage.Literals.DESCRIPTION_BOX__CLOSED_WORLD_DEFINITIONS,
				 OMLFactory.eINSTANCE.createDescriptionBoxExtendsClosedWorldDefinitions()));

		newChildDescriptors.add
			(createChildParameter
				(OMLPackage.Literals.DESCRIPTION_BOX__DESCRIPTION_BOX_REFINEMENTS,
				 OMLFactory.eINSTANCE.createDescriptionBoxRefinement()));
	}

}
