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
 * A representation of the model object '<em><b>Entity Restriction Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.EntityRestrictionAxiom#getRestrictedRelation <em>Restricted Relation</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.EntityRestrictionAxiom#getRestrictedRange <em>Restricted Range</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.EntityRestrictionAxiom#getRestrictedDomain <em>Restricted Domain</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getEntityRestrictionAxiom()
 * @model abstract="true"
 * @generated
 */
public interface EntityRestrictionAxiom extends TermAxiom {
	/**
	 * Returns the value of the '<em><b>Restricted Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restricted Relation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restricted Relation</em>' reference.
	 * @see #setRestrictedRelation(ReifiedRelationship)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getEntityRestrictionAxiom_RestrictedRelation()
	 * @model required="true"
	 * @generated
	 */
	ReifiedRelationship getRestrictedRelation();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.EntityRestrictionAxiom#getRestrictedRelation <em>Restricted Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restricted Relation</em>' reference.
	 * @see #getRestrictedRelation()
	 * @generated
	 */
	void setRestrictedRelation(ReifiedRelationship value);

	/**
	 * Returns the value of the '<em><b>Restricted Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restricted Range</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restricted Range</em>' reference.
	 * @see #setRestrictedRange(Entity)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getEntityRestrictionAxiom_RestrictedRange()
	 * @model required="true"
	 * @generated
	 */
	Entity getRestrictedRange();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.EntityRestrictionAxiom#getRestrictedRange <em>Restricted Range</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restricted Range</em>' reference.
	 * @see #getRestrictedRange()
	 * @generated
	 */
	void setRestrictedRange(Entity value);

	/**
	 * Returns the value of the '<em><b>Restricted Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restricted Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restricted Domain</em>' reference.
	 * @see #setRestrictedDomain(Entity)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getEntityRestrictionAxiom_RestrictedDomain()
	 * @model required="true"
	 * @generated
	 */
	Entity getRestrictedDomain();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.EntityRestrictionAxiom#getRestrictedDomain <em>Restricted Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restricted Domain</em>' reference.
	 * @see #getRestrictedDomain()
	 * @generated
	 */
	void setRestrictedDomain(Entity value);

} // EntityRestrictionAxiom
