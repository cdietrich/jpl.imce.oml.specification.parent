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
 * A representation of the model object '<em><b>Terminology Instance Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML TerminologyInstanceAssertion ...
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.TerminologyInstanceAssertion#getTerminologyExtent <em>Terminology Extent</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getTerminologyInstanceAssertion()
 * @model abstract="true"
 * @generated
 */
public interface TerminologyInstanceAssertion extends TerminologyThing {
	/**
	 * Returns the value of the '<em><b>Terminology Extent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jpl.imce.oml.specification.ecore.TerminologyExtent#getInstanceAssertions <em>Instance Assertions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminology Extent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminology Extent</em>' container reference.
	 * @see #setTerminologyExtent(TerminologyExtent)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getTerminologyInstanceAssertion_TerminologyExtent()
	 * @see jpl.imce.oml.specification.ecore.TerminologyExtent#getInstanceAssertions
	 * @model opposite="instanceAssertions" required="true" transient="false"
	 * @generated
	 */
	TerminologyExtent getTerminologyExtent();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.TerminologyInstanceAssertion#getTerminologyExtent <em>Terminology Extent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminology Extent</em>' container reference.
	 * @see #getTerminologyExtent()
	 * @generated
	 */
	void setTerminologyExtent(TerminologyExtent value);

} // TerminologyInstanceAssertion
