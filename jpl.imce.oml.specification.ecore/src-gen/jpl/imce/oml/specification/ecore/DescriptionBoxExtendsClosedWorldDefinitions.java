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
 * A representation of the model object '<em><b>Description Box Extends Closed World Definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML DescriptionBoxExtendsClosedWorldDefinitions ...
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.DescriptionBoxExtendsClosedWorldDefinitions#getDescriptionBox <em>Description Box</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.DescriptionBoxExtendsClosedWorldDefinitions#getClosedWorldDefinitions <em>Closed World Definitions</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getDescriptionBoxExtendsClosedWorldDefinitions()
 * @model
 * @generated
 */
public interface DescriptionBoxExtendsClosedWorldDefinitions extends TerminologyThing {
	/**
	 * Returns the value of the '<em><b>Description Box</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jpl.imce.oml.specification.ecore.DescriptionBox#getClosedWorldDefinitions <em>Closed World Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Box</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Box</em>' container reference.
	 * @see #setDescriptionBox(DescriptionBox)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getDescriptionBoxExtendsClosedWorldDefinitions_DescriptionBox()
	 * @see jpl.imce.oml.specification.ecore.DescriptionBox#getClosedWorldDefinitions
	 * @model opposite="closedWorldDefinitions" required="true" transient="false"
	 * @generated
	 */
	DescriptionBox getDescriptionBox();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.DescriptionBoxExtendsClosedWorldDefinitions#getDescriptionBox <em>Description Box</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Box</em>' container reference.
	 * @see #getDescriptionBox()
	 * @generated
	 */
	void setDescriptionBox(DescriptionBox value);

	/**
	 * Returns the value of the '<em><b>Closed World Definitions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closed World Definitions</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closed World Definitions</em>' reference.
	 * @see #setClosedWorldDefinitions(TerminologyBox)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getDescriptionBoxExtendsClosedWorldDefinitions_ClosedWorldDefinitions()
	 * @model required="true"
	 * @generated
	 */
	TerminologyBox getClosedWorldDefinitions();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.DescriptionBoxExtendsClosedWorldDefinitions#getClosedWorldDefinitions <em>Closed World Definitions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closed World Definitions</em>' reference.
	 * @see #getClosedWorldDefinitions()
	 * @generated
	 */
	void setClosedWorldDefinitions(TerminologyBox value);

} // DescriptionBoxExtendsClosedWorldDefinitions
