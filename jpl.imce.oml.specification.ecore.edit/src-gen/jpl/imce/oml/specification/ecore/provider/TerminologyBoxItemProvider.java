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

import jpl.imce.oml.specification.ecore.EcoreFactory;
import jpl.imce.oml.specification.ecore.EcorePackage;
import jpl.imce.oml.specification.ecore.TerminologyBox;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link jpl.imce.oml.specification.ecore.TerminologyBox} object.
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
				 EcorePackage.eINSTANCE.getTerminologyBox_Kind(),
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
			childrenFeatures.add(EcorePackage.eINSTANCE.getTerminologyBox_TerminologyBoxAxioms());
			childrenFeatures.add(EcorePackage.eINSTANCE.getTerminologyBox_BoxStatements());
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
			case EcorePackage.TERMINOLOGY_BOX__KIND:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EcorePackage.TERMINOLOGY_BOX__TERMINOLOGY_BOX_AXIOMS:
			case EcorePackage.TERMINOLOGY_BOX__BOX_STATEMENTS:
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
				(EcorePackage.eINSTANCE.getTerminologyBox_TerminologyBoxAxioms(),
				 EcoreFactory.eINSTANCE.createConceptDesignationTerminologyAxiom()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.eINSTANCE.getTerminologyBox_TerminologyBoxAxioms(),
				 EcoreFactory.eINSTANCE.createTerminologyExtensionAxiom()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.eINSTANCE.getTerminologyBox_TerminologyBoxAxioms(),
				 EcoreFactory.eINSTANCE.createTerminologyNestingAxiom()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.eINSTANCE.getTerminologyBox_BoxStatements(),
				 EcoreFactory.eINSTANCE.createAspect()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.eINSTANCE.getTerminologyBox_BoxStatements(),
				 EcoreFactory.eINSTANCE.createConcept()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.eINSTANCE.getTerminologyBox_BoxStatements(),
				 EcoreFactory.eINSTANCE.createReifiedRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.eINSTANCE.getTerminologyBox_BoxStatements(),
				 EcoreFactory.eINSTANCE.createUnreifiedRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.eINSTANCE.getTerminologyBox_BoxStatements(),
				 EcoreFactory.eINSTANCE.createScalar()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.eINSTANCE.getTerminologyBox_BoxStatements(),
				 EcoreFactory.eINSTANCE.createEntityStructuredDataProperty()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.eINSTANCE.getTerminologyBox_BoxStatements(),
				 EcoreFactory.eINSTANCE.createEntityScalarDataProperty()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.eINSTANCE.getTerminologyBox_BoxStatements(),
				 EcoreFactory.eINSTANCE.createStructuredDataProperty()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.eINSTANCE.getTerminologyBox_BoxStatements(),
				 EcoreFactory.eINSTANCE.createScalarDataProperty()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.eINSTANCE.getTerminologyBox_BoxStatements(),
				 EcoreFactory.eINSTANCE.createStructure()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.eINSTANCE.getTerminologyBox_BoxStatements(),
				 EcoreFactory.eINSTANCE.createEntityExistentialRestrictionAxiom()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.eINSTANCE.getTerminologyBox_BoxStatements(),
				 EcoreFactory.eINSTANCE.createEntityUniversalRestrictionAxiom()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.eINSTANCE.getTerminologyBox_BoxStatements(),
				 EcoreFactory.eINSTANCE.createAspectSpecializationAxiom()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.eINSTANCE.getTerminologyBox_BoxStatements(),
				 EcoreFactory.eINSTANCE.createConceptSpecializationAxiom()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.eINSTANCE.getTerminologyBox_BoxStatements(),
				 EcoreFactory.eINSTANCE.createReifiedRelationshipSpecializationAxiom()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.eINSTANCE.getTerminologyBox_BoxStatements(),
				 EcoreFactory.eINSTANCE.createEntityScalarDataPropertyExistentialRestrictionAxiom()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.eINSTANCE.getTerminologyBox_BoxStatements(),
				 EcoreFactory.eINSTANCE.createEntityScalarDataPropertyUniversalRestrictionAxiom()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.eINSTANCE.getTerminologyBox_BoxStatements(),
				 EcoreFactory.eINSTANCE.createEntityScalarDataPropertyParticularRestrictionAxiom()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.eINSTANCE.getTerminologyBox_BoxStatements(),
				 EcoreFactory.eINSTANCE.createBinaryScalarRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.eINSTANCE.getTerminologyBox_BoxStatements(),
				 EcoreFactory.eINSTANCE.createIRIScalarRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.eINSTANCE.getTerminologyBox_BoxStatements(),
				 EcoreFactory.eINSTANCE.createNumericScalarRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.eINSTANCE.getTerminologyBox_BoxStatements(),
				 EcoreFactory.eINSTANCE.createPlainLiteralScalarRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.eINSTANCE.getTerminologyBox_BoxStatements(),
				 EcoreFactory.eINSTANCE.createStringScalarRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.eINSTANCE.getTerminologyBox_BoxStatements(),
				 EcoreFactory.eINSTANCE.createTimeScalarRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.eINSTANCE.getTerminologyBox_BoxStatements(),
				 EcoreFactory.eINSTANCE.createSynonymScalarRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.eINSTANCE.getTerminologyBox_BoxStatements(),
				 EcoreFactory.eINSTANCE.createScalarOneOfRestriction()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.eINSTANCE.getTerminologyBox_BoxStatements(),
				 EcoreFactory.eINSTANCE.createScalarOneOfLiteralAxiom()));
	}

}
