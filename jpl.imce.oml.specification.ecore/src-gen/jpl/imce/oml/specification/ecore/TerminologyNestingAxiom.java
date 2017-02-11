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
 * A representation of the model object '<em><b>Terminology Nesting Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML TerminologyNestingAxiom provides support for relating
 * a white-box OML TerminologyGraph as a nested terminology
 * providing details about a black-box OML Concept defined
 * in a nesting OML TerminologyBox.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.TerminologyNestingAxiom#getNestingTerminology <em>Nesting Terminology</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.TerminologyNestingAxiom#getNestingContext <em>Nesting Context</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getTerminologyNestingAxiom()
 * @model
 * @generated
 */
public interface TerminologyNestingAxiom extends TerminologyBoxAxiom {
	/**
	 * Returns the value of the '<em><b>Nesting Terminology</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nesting Terminology</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nesting Terminology</em>' reference.
	 * @see #setNestingTerminology(TerminologyBox)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getTerminologyNestingAxiom_NestingTerminology()
	 * @model required="true"
	 * @generated
	 */
	TerminologyBox getNestingTerminology();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.TerminologyNestingAxiom#getNestingTerminology <em>Nesting Terminology</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nesting Terminology</em>' reference.
	 * @see #getNestingTerminology()
	 * @generated
	 */
	void setNestingTerminology(TerminologyBox value);

	/**
	 * Returns the value of the '<em><b>Nesting Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nesting Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nesting Context</em>' reference.
	 * @see #setNestingContext(Concept)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getTerminologyNestingAxiom_NestingContext()
	 * @model required="true"
	 * @generated
	 */
	Concept getNestingContext();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.TerminologyNestingAxiom#getNestingContext <em>Nesting Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nesting Context</em>' reference.
	 * @see #getNestingContext()
	 * @generated
	 */
	void setNestingContext(Concept value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='terminology match { case g: TerminologyGraph => g }'"
	 * @generated
	 */
	TerminologyGraph nestedTerminology();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The nestedTerminology is the source
	 * <!-- end-model-doc -->
	 * @model unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getTbox();'"
	 * @generated
	 */
	TerminologyBox source();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The nestingTerminology is the target
	 * <!-- end-model-doc -->
	 * @model unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getNestingTerminology();'"
	 * @generated
	 */
	TerminologyBox target();

} // TerminologyNestingAxiom
