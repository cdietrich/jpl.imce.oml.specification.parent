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
 * A representation of the model object '<em><b>Disjoint Union Of Concepts Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML DisjointUnionOfConceptsAxiom(s) represents non-leaf & leaf nodes of a concept taxonomy:
 * - Each non-leaf node is an OML AnonymousConceptTaxonomyAxiom.
 * - Each leaf nodes is an OML SpecificDisjointConceptAxiom.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.DisjointUnionOfConceptsAxiom#getDisjointTaxonomyParent <em>Disjoint Taxonomy Parent</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getDisjointUnionOfConceptsAxiom()
 * @model abstract="true"
 * @generated
 */
public interface DisjointUnionOfConceptsAxiom extends TerminologyBundleStatement {
	/**
	 * Returns the value of the '<em><b>Disjoint Taxonomy Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parent of this node in a disjoint concept taxonomy tree.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disjoint Taxonomy Parent</em>' reference.
	 * @see #setDisjointTaxonomyParent(ConceptTreeDisjunction)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getDisjointUnionOfConceptsAxiom_DisjointTaxonomyParent()
	 * @model required="true"
	 * @generated
	 */
	ConceptTreeDisjunction getDisjointTaxonomyParent();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.DisjointUnionOfConceptsAxiom#getDisjointTaxonomyParent <em>Disjoint Taxonomy Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disjoint Taxonomy Parent</em>' reference.
	 * @see #getDisjointTaxonomyParent()
	 * @generated
	 */
	void setDisjointTaxonomyParent(ConceptTreeDisjunction value);

} // DisjointUnionOfConceptsAxiom
