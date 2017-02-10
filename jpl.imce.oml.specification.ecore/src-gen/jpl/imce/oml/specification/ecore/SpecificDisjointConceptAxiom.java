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
 * A representation of the model object '<em><b>Specific Disjoint Concept Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML SpecificDisjointConceptAxiom specifies a leaf in a taxonomy tree.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.SpecificDisjointConceptAxiom#getDisjointLeaf <em>Disjoint Leaf</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getSpecificDisjointConceptAxiom()
 * @model
 * @generated
 */
public interface SpecificDisjointConceptAxiom extends DisjointUnionOfConceptsAxiom {
	/**
	 * Returns the value of the '<em><b>Disjoint Leaf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Concept that is a disjoint leaf in a taxonomy tree.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disjoint Leaf</em>' reference.
	 * @see #setDisjointLeaf(Concept)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getSpecificDisjointConceptAxiom_DisjointLeaf()
	 * @model required="true"
	 * @generated
	 */
	Concept getDisjointLeaf();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.SpecificDisjointConceptAxiom#getDisjointLeaf <em>Disjoint Leaf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disjoint Leaf</em>' reference.
	 * @see #getDisjointLeaf()
	 * @generated
	 */
	void setDisjointLeaf(Concept value);

} // SpecificDisjointConceptAxiom
