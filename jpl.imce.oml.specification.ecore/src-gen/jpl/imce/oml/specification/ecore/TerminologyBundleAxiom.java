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
 * A representation of the model object '<em><b>Terminology Bundle Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A TerminologyBundleAxiom is a TerminologyAxiom that asserts a logical statement in the context of a Bundle.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.TerminologyBundleAxiom#getTerminologyBundle <em>Terminology Bundle</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getTerminologyBundleAxiom()
 * @model abstract="true"
 * @generated
 */
public interface TerminologyBundleAxiom extends TerminologyAxiom {
	/**
	 * Returns the value of the '<em><b>Terminology Bundle</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jpl.imce.oml.specification.ecore.Bundle#getTerminologyBundleAxioms <em>Terminology Bundle Axioms</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminology Bundle</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminology Bundle</em>' container reference.
	 * @see #setTerminologyBundle(Bundle)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getTerminologyBundleAxiom_TerminologyBundle()
	 * @see jpl.imce.oml.specification.ecore.Bundle#getTerminologyBundleAxioms
	 * @model opposite="terminologyBundleAxioms" required="true" transient="false"
	 * @generated
	 */
	Bundle getTerminologyBundle();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.TerminologyBundleAxiom#getTerminologyBundle <em>Terminology Bundle</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminology Bundle</em>' container reference.
	 * @see #getTerminologyBundle()
	 * @generated
	 */
	void setTerminologyBundle(Bundle value);

} // TerminologyBundleAxiom
