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
 * A representation of the model object '<em><b>Concept Designation Terminology Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.ConceptDesignationTerminologyAxiom#getDesignatedTerminology <em>Designated Terminology</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.ConceptDesignationTerminologyAxiom#getDesignatedConcept <em>Designated Concept</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getConceptDesignationTerminologyAxiom()
 * @model
 * @generated
 */
public interface ConceptDesignationTerminologyAxiom extends TerminologyBoxAxiom {
	/**
	 * Returns the value of the '<em><b>Designated Terminology</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Designated Terminology</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Designated Terminology</em>' reference.
	 * @see #setDesignatedTerminology(TerminologyBox)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getConceptDesignationTerminologyAxiom_DesignatedTerminology()
	 * @model required="true"
	 * @generated
	 */
	TerminologyBox getDesignatedTerminology();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.ConceptDesignationTerminologyAxiom#getDesignatedTerminology <em>Designated Terminology</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Designated Terminology</em>' reference.
	 * @see #getDesignatedTerminology()
	 * @generated
	 */
	void setDesignatedTerminology(TerminologyBox value);

	/**
	 * Returns the value of the '<em><b>Designated Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Designated Concept</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Designated Concept</em>' reference.
	 * @see #setDesignatedConcept(Concept)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getConceptDesignationTerminologyAxiom_DesignatedConcept()
	 * @model required="true"
	 * @generated
	 */
	Concept getDesignatedConcept();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.ConceptDesignationTerminologyAxiom#getDesignatedConcept <em>Designated Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Designated Concept</em>' reference.
	 * @see #getDesignatedConcept()
	 * @generated
	 */
	void setDesignatedConcept(Concept value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='terminology match { case g: TerminologyGraph => g }'"
	 * @generated
	 */
	TerminologyGraph designationTerminologyGraph();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The designationTerminologyGraph is the source
	 * <!-- end-model-doc -->
	 * @model unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getTerminology();'"
	 * @generated
	 */
	TerminologyBox source();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TerminologyBox that asserts the designatedConcept is the target
	 * <!-- end-model-doc -->
	 * @model unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getDesignatedTerminology();'"
	 * @generated
	 */
	TerminologyBox target();

} // ConceptDesignationTerminologyAxiom
