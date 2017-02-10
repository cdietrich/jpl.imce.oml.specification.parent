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
package jpl.imce.oml.specification.ecore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description Box Refinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML DescriptionBoxRefinement ...
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.DescriptionBoxRefinement#getRefiningDescriptionBox <em>Refining Description Box</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.DescriptionBoxRefinement#getRefinedDescriptionBox <em>Refined Description Box</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getDescriptionBoxRefinement()
 * @model
 * @generated
 */
public interface DescriptionBoxRefinement extends TerminologyThing {
	/**
	 * Returns the value of the '<em><b>Refining Description Box</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jpl.imce.oml.specification.ecore.DescriptionBox#getDescriptionBoxRefinements <em>Description Box Refinements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refining Description Box</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refining Description Box</em>' container reference.
	 * @see #setRefiningDescriptionBox(DescriptionBox)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getDescriptionBoxRefinement_RefiningDescriptionBox()
	 * @see jpl.imce.oml.specification.ecore.DescriptionBox#getDescriptionBoxRefinements
	 * @model opposite="descriptionBoxRefinements" required="true" transient="false"
	 * @generated
	 */
	DescriptionBox getRefiningDescriptionBox();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.DescriptionBoxRefinement#getRefiningDescriptionBox <em>Refining Description Box</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refining Description Box</em>' container reference.
	 * @see #getRefiningDescriptionBox()
	 * @generated
	 */
	void setRefiningDescriptionBox(DescriptionBox value);

	/**
	 * Returns the value of the '<em><b>Refined Description Box</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refined Description Box</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refined Description Box</em>' reference.
	 * @see #setRefinedDescriptionBox(DescriptionBox)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getDescriptionBoxRefinement_RefinedDescriptionBox()
	 * @model required="true"
	 * @generated
	 */
	DescriptionBox getRefinedDescriptionBox();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.DescriptionBoxRefinement#getRefinedDescriptionBox <em>Refined Description Box</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refined Description Box</em>' reference.
	 * @see #getRefinedDescriptionBox()
	 * @generated
	 */
	void setRefinedDescriptionBox(DescriptionBox value);

} // DescriptionBoxRefinement
