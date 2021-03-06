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
 * A representation of the model object '<em><b>Reified Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML ReifiedRelationship is an OML ConceptualEntity and a kind of OML EntityRelationship
 * where an instance has an intrinsic identity. This means that
 * an OML ReifiedRelationship can be involved as the domain or the
 * range of another OML EntityRelationship as well as the
 * domain of an OML DataRelationshipFromEntity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.ReifiedRelationship#getUnreifiedPropertyName <em>Unreified Property Name</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.ReifiedRelationship#getUnreifiedInversePropertyName <em>Unreified Inverse Property Name</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getReifiedRelationship()
 * @model
 * @generated
 */
public interface ReifiedRelationship extends EntityRelationship, Entity, ConceptualEntity {
	/**
	 * Returns the value of the '<em><b>Unreified Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unreified Property Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unreified Property Name</em>' attribute.
	 * @see #setUnreifiedPropertyName(String)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getReifiedRelationship_UnreifiedPropertyName()
	 * @model unique="false" dataType="jpl.imce.oml.specification.ecore.LocalName" required="true"
	 * @generated
	 */
	String getUnreifiedPropertyName();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.ReifiedRelationship#getUnreifiedPropertyName <em>Unreified Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unreified Property Name</em>' attribute.
	 * @see #getUnreifiedPropertyName()
	 * @generated
	 */
	void setUnreifiedPropertyName(String value);

	/**
	 * Returns the value of the '<em><b>Unreified Inverse Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unreified Inverse Property Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unreified Inverse Property Name</em>' attribute.
	 * @see #setUnreifiedInversePropertyName(String)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getReifiedRelationship_UnreifiedInversePropertyName()
	 * @model unique="false" dataType="jpl.imce.oml.specification.ecore.LocalName"
	 * @generated
	 */
	String getUnreifiedInversePropertyName();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.ReifiedRelationship#getUnreifiedInversePropertyName <em>Unreified Inverse Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unreified Inverse Property Name</em>' attribute.
	 * @see #getUnreifiedInversePropertyName()
	 * @generated
	 */
	void setUnreifiedInversePropertyName(String value);

} // ReifiedRelationship
