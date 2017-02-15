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
 * A representation of the model object '<em><b>Root Concept Taxonomy Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML RootConceptTaxonomyAxiom asserts that, in the scope of a Bundle, a particular Entity
 * is the root of a taxonomy of specializations of that Entity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.RootConceptTaxonomyAxiom#getRoot <em>Root</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getRootConceptTaxonomyAxiom()
 * @model
 * @generated
 */
public interface RootConceptTaxonomyAxiom extends TerminologyBundleStatement, ConceptTreeDisjunction {
	/**
	 * Returns the value of the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Concept that is at the root of a taxonomy of disjunctions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Root</em>' reference.
	 * @see #setRoot(Concept)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getRootConceptTaxonomyAxiom_Root()
	 * @model required="true"
	 * @generated
	 */
	Concept getRoot();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.RootConceptTaxonomyAxiom#getRoot <em>Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Concept value);

} // RootConceptTaxonomyAxiom
