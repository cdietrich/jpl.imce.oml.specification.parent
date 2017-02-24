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
package gov.nasa.jpl.imce.oml.terminologies.provider;


import gov.nasa.jpl.imce.oml.common.provider.ModuleItemProvider;

import gov.nasa.jpl.imce.oml.graphs.OMLGFactory;

import gov.nasa.jpl.imce.oml.terminologies.OMLTFactory;
import gov.nasa.jpl.imce.oml.terminologies.OMLTPackage;
import gov.nasa.jpl.imce.oml.terminologies.TerminologyBox;

import java.util.Collection;
import java.util.List;

import jpl.imce.oml.specification.ecore.edit.provider.OMLEditPlugin;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link gov.nasa.jpl.imce.oml.terminologies.TerminologyBox} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TerminologyBoxItemProvider extends ModuleItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyBoxItemProvider(AdapterFactory adapterFactory) {
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

			addKindPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKindPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TerminologyBox_kind_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TerminologyBox_kind_feature", "_UI_TerminologyBox_type"),
				 OMLTPackage.Literals.TERMINOLOGY_BOX__KIND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(OMLTPackage.Literals.TERMINOLOGY_BOX__BOX_AXIOMS);
			childrenFeatures.add(OMLTPackage.Literals.TERMINOLOGY_BOX__BOX_STATEMENTS);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TerminologyBox)object).getUuid();
		return label == null || label.length() == 0 ?
			getString("_UI_TerminologyBox_type") :
			getString("_UI_TerminologyBox_type") + " " + label;
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

		switch (notification.getFeatureID(TerminologyBox.class)) {
			case OMLTPackage.TERMINOLOGY_BOX__KIND:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OMLTPackage.TERMINOLOGY_BOX__BOX_AXIOMS:
			case OMLTPackage.TERMINOLOGY_BOX__BOX_STATEMENTS:
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
				(OMLTPackage.Literals.TERMINOLOGY_BOX__BOX_AXIOMS,
				 OMLTFactory.eINSTANCE.createTerminologyExtensionAxiom()));

		newChildDescriptors.add
			(createChildParameter
				(OMLTPackage.Literals.TERMINOLOGY_BOX__BOX_AXIOMS,
				 OMLGFactory.eINSTANCE.createConceptDesignationTerminologyAxiom()));

		newChildDescriptors.add
			(createChildParameter
				(OMLTPackage.Literals.TERMINOLOGY_BOX__BOX_AXIOMS,
				 OMLGFactory.eINSTANCE.createTerminologyNestingAxiom()));

		newChildDescriptors.add
			(createChildParameter
				(OMLTPackage.Literals.TERMINOLOGY_BOX__BOX_STATEMENTS,
				 OMLTFactory.eINSTANCE.createAspect()));

		newChildDescriptors.add
			(createChildParameter
				(OMLTPackage.Literals.TERMINOLOGY_BOX__BOX_STATEMENTS,
				 OMLTFactory.eINSTANCE.createConcept()));

		newChildDescriptors.add
			(createChildParameter
				(OMLTPackage.Literals.TERMINOLOGY_BOX__BOX_STATEMENTS,
				 OMLTFactory.eINSTANCE.createReifiedRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(OMLTPackage.Literals.TERMINOLOGY_BOX__BOX_STATEMENTS,
				 OMLTFactory.eINSTANCE.createUnreifiedRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(OMLTPackage.Literals.TERMINOLOGY_BOX__BOX_STATEMENTS,
				 OMLTFactory.eINSTANCE.createScalar()));

		newChildDescriptors.add
			(createChildParameter
				(OMLTPackage.Literals.TERMINOLOGY_BOX__BOX_STATEMENTS,
				 OMLTFactory.eINSTANCE.createEntityStructuredDataProperty()));

		newChildDescriptors.add
			(createChildParameter
				(OMLTPackage.Literals.TERMINOLOGY_BOX__BOX_STATEMENTS,
				 OMLTFactory.eINSTANCE.createEntityScalarDataProperty()));

		newChildDescriptors.add
			(createChildParameter
				(OMLTPackage.Literals.TERMINOLOGY_BOX__BOX_STATEMENTS,
				 OMLTFactory.eINSTANCE.createStructuredDataProperty()));

		newChildDescriptors.add
			(createChildParameter
				(OMLTPackage.Literals.TERMINOLOGY_BOX__BOX_STATEMENTS,
				 OMLTFactory.eINSTANCE.createScalarDataProperty()));

		newChildDescriptors.add
			(createChildParameter
				(OMLTPackage.Literals.TERMINOLOGY_BOX__BOX_STATEMENTS,
				 OMLTFactory.eINSTANCE.createStructure()));

		newChildDescriptors.add
			(createChildParameter
				(OMLTPackage.Literals.TERMINOLOGY_BOX__BOX_STATEMENTS,
				 OMLTFactory.eINSTANCE.createEntityExistentialRestrictionAxiom()));

		newChildDescriptors.add
			(createChildParameter
				(OMLTPackage.Literals.TERMINOLOGY_BOX__BOX_STATEMENTS,
				 OMLTFactory.eINSTANCE.createEntityUniversalRestrictionAxiom()));

		newChildDescriptors.add
			(createChildParameter
				(OMLTPackage.Literals.TERMINOLOGY_BOX__BOX_STATEMENTS,
				 OMLTFactory.eINSTANCE.createAspectSpecializationAxiom()));

		newChildDescriptors.add
			(createChildParameter
				(OMLTPackage.Literals.TERMINOLOGY_BOX__BOX_STATEMENTS,
				 OMLTFactory.eINSTANCE.createConceptSpecializationAxiom()));

		newChildDescriptors.add
			(createChildParameter
				(OMLTPackage.Literals.TERMINOLOGY_BOX__BOX_STATEMENTS,
				 OMLTFactory.eINSTANCE.createReifiedRelationshipSpecializationAxiom()));

		newChildDescriptors.add
			(createChildParameter
				(OMLTPackage.Literals.TERMINOLOGY_BOX__BOX_STATEMENTS,
				 OMLTFactory.eINSTANCE.createEntityScalarDataPropertyExistentialRestrictionAxiom()));

		newChildDescriptors.add
			(createChildParameter
				(OMLTPackage.Literals.TERMINOLOGY_BOX__BOX_STATEMENTS,
				 OMLTFactory.eINSTANCE.createEntityScalarDataPropertyUniversalRestrictionAxiom()));

		newChildDescriptors.add
			(createChildParameter
				(OMLTPackage.Literals.TERMINOLOGY_BOX__BOX_STATEMENTS,
				 OMLTFactory.eINSTANCE.createEntityScalarDataPropertyParticularRestrictionAxiom()));

		newChildDescriptors.add
			(createChildParameter
				(OMLTPackage.Literals.TERMINOLOGY_BOX__BOX_STATEMENTS,
				 OMLTFactory.eINSTANCE.createBinaryScalarRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(OMLTPackage.Literals.TERMINOLOGY_BOX__BOX_STATEMENTS,
				 OMLTFactory.eINSTANCE.createIRIScalarRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(OMLTPackage.Literals.TERMINOLOGY_BOX__BOX_STATEMENTS,
				 OMLTFactory.eINSTANCE.createNumericScalarRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(OMLTPackage.Literals.TERMINOLOGY_BOX__BOX_STATEMENTS,
				 OMLTFactory.eINSTANCE.createPlainLiteralScalarRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(OMLTPackage.Literals.TERMINOLOGY_BOX__BOX_STATEMENTS,
				 OMLTFactory.eINSTANCE.createStringScalarRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(OMLTPackage.Literals.TERMINOLOGY_BOX__BOX_STATEMENTS,
				 OMLTFactory.eINSTANCE.createTimeScalarRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(OMLTPackage.Literals.TERMINOLOGY_BOX__BOX_STATEMENTS,
				 OMLTFactory.eINSTANCE.createSynonymScalarRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(OMLTPackage.Literals.TERMINOLOGY_BOX__BOX_STATEMENTS,
				 OMLTFactory.eINSTANCE.createScalarOneOfRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(OMLTPackage.Literals.TERMINOLOGY_BOX__BOX_STATEMENTS,
				 OMLTFactory.eINSTANCE.createScalarOneOfLiteralAxiom()));
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
