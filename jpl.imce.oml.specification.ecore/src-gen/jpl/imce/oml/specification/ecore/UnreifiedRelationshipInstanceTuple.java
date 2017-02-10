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
 * A representation of the model object '<em><b>Unreified Relationship Instance Tuple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML UnreifiedRelationshipInstanceTuple ...
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.UnreifiedRelationshipInstanceTuple#getUnreifiedRelationship <em>Unreified Relationship</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.UnreifiedRelationshipInstanceTuple#getDomain <em>Domain</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.UnreifiedRelationshipInstanceTuple#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getUnreifiedRelationshipInstanceTuple()
 * @model
 * @generated
 */
public interface UnreifiedRelationshipInstanceTuple extends TerminologyInstanceAssertion {
	/**
	 * Returns the value of the '<em><b>Unreified Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unreified Relationship</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unreified Relationship</em>' reference.
	 * @see #setUnreifiedRelationship(UnreifiedRelationship)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getUnreifiedRelationshipInstanceTuple_UnreifiedRelationship()
	 * @model required="true"
	 * @generated
	 */
	UnreifiedRelationship getUnreifiedRelationship();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.UnreifiedRelationshipInstanceTuple#getUnreifiedRelationship <em>Unreified Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unreified Relationship</em>' reference.
	 * @see #getUnreifiedRelationship()
	 * @generated
	 */
	void setUnreifiedRelationship(UnreifiedRelationship value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see #setDomain(ConceptualEntitySingletonInstance)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getUnreifiedRelationshipInstanceTuple_Domain()
	 * @model required="true"
	 * @generated
	 */
	ConceptualEntitySingletonInstance getDomain();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.UnreifiedRelationshipInstanceTuple#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(ConceptualEntitySingletonInstance value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' reference.
	 * @see #setRange(ConceptualEntitySingletonInstance)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getUnreifiedRelationshipInstanceTuple_Range()
	 * @model required="true"
	 * @generated
	 */
	ConceptualEntitySingletonInstance getRange();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.UnreifiedRelationshipInstanceTuple#getRange <em>Range</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(ConceptualEntitySingletonInstance value);

} // UnreifiedRelationshipInstanceTuple
