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
 * A representation of the model object '<em><b>Concept Specialization Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML ConceptSpecializationAxiom ...
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.ConceptSpecializationAxiom#getSubConcept <em>Sub Concept</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.ConceptSpecializationAxiom#getSuperConcept <em>Super Concept</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getConceptSpecializationAxiom()
 * @model
 * @generated
 */
public interface ConceptSpecializationAxiom extends SpecializationAxiom {
	/**
	 * Returns the value of the '<em><b>Sub Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Concept</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Concept</em>' reference.
	 * @see #setSubConcept(Concept)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getConceptSpecializationAxiom_SubConcept()
	 * @model required="true"
	 * @generated
	 */
	Concept getSubConcept();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.ConceptSpecializationAxiom#getSubConcept <em>Sub Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Concept</em>' reference.
	 * @see #getSubConcept()
	 * @generated
	 */
	void setSubConcept(Concept value);

	/**
	 * Returns the value of the '<em><b>Super Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Concept</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Concept</em>' reference.
	 * @see #setSuperConcept(Concept)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getConceptSpecializationAxiom_SuperConcept()
	 * @model required="true"
	 * @generated
	 */
	Concept getSuperConcept();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.ConceptSpecializationAxiom#getSuperConcept <em>Super Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Concept</em>' reference.
	 * @see #getSuperConcept()
	 * @generated
	 */
	void setSuperConcept(Concept value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get the sub (child) entity
	 * <!-- end-model-doc -->
	 * @model unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getSubConcept();'"
	 * @generated
	 */
	Term child();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get the super (parent) entity
	 * <!-- end-model-doc -->
	 * @model unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getSuperConcept();'"
	 * @generated
	 */
	Term parent();

} // ConceptSpecializationAxiom
