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
 * A representation of the model object '<em><b>Reified Relationship Specialization Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipSpecializationAxiom#getSubRelationship <em>Sub Relationship</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipSpecializationAxiom#getSuperRelationship <em>Super Relationship</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getReifiedRelationshipSpecializationAxiom()
 * @model
 * @generated
 */
public interface ReifiedRelationshipSpecializationAxiom extends SpecializationAxiom {
	/**
	 * Returns the value of the '<em><b>Sub Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sub (child) relationship
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Relationship</em>' reference.
	 * @see #setSubRelationship(ReifiedRelationship)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getReifiedRelationshipSpecializationAxiom_SubRelationship()
	 * @model required="true"
	 * @generated
	 */
	ReifiedRelationship getSubRelationship();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipSpecializationAxiom#getSubRelationship <em>Sub Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Relationship</em>' reference.
	 * @see #getSubRelationship()
	 * @generated
	 */
	void setSubRelationship(ReifiedRelationship value);

	/**
	 * Returns the value of the '<em><b>Super Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The super (parent) relationship
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Super Relationship</em>' reference.
	 * @see #setSuperRelationship(ReifiedRelationship)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getReifiedRelationshipSpecializationAxiom_SuperRelationship()
	 * @model required="true"
	 * @generated
	 */
	ReifiedRelationship getSuperRelationship();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipSpecializationAxiom#getSuperRelationship <em>Super Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Relationship</em>' reference.
	 * @see #getSuperRelationship()
	 * @generated
	 */
	void setSuperRelationship(ReifiedRelationship value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get the sub (child) entity
	 * <!-- end-model-doc -->
	 * @model unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getSubRelationship();'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getSuperRelationship();'"
	 * @generated
	 */
	Term parent();

} // ReifiedRelationshipSpecializationAxiom
