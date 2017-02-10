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
 * A representation of the model object '<em><b>Structured Data Property Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML StructuredDataPropertyValue ...
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.StructuredDataPropertyValue#getSingletonInstance <em>Singleton Instance</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.StructuredDataPropertyValue#getStructuredDataProperty <em>Structured Data Property</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.StructuredDataPropertyValue#getStructuredPropertyTuple <em>Structured Property Tuple</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getStructuredDataPropertyValue()
 * @model
 * @generated
 */
public interface StructuredDataPropertyValue extends TerminologyInstanceAssertion {
	/**
	 * Returns the value of the '<em><b>Singleton Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Singleton Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Singleton Instance</em>' reference.
	 * @see #setSingletonInstance(SingletonInstance)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getStructuredDataPropertyValue_SingletonInstance()
	 * @model required="true"
	 * @generated
	 */
	SingletonInstance getSingletonInstance();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.StructuredDataPropertyValue#getSingletonInstance <em>Singleton Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Singleton Instance</em>' reference.
	 * @see #getSingletonInstance()
	 * @generated
	 */
	void setSingletonInstance(SingletonInstance value);

	/**
	 * Returns the value of the '<em><b>Structured Data Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structured Data Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structured Data Property</em>' reference.
	 * @see #setStructuredDataProperty(DataRelationshipToStructure)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getStructuredDataPropertyValue_StructuredDataProperty()
	 * @model required="true"
	 * @generated
	 */
	DataRelationshipToStructure getStructuredDataProperty();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.StructuredDataPropertyValue#getStructuredDataProperty <em>Structured Data Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structured Data Property</em>' reference.
	 * @see #getStructuredDataProperty()
	 * @generated
	 */
	void setStructuredDataProperty(DataRelationshipToStructure value);

	/**
	 * Returns the value of the '<em><b>Structured Property Tuple</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structured Property Tuple</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structured Property Tuple</em>' reference.
	 * @see #setStructuredPropertyTuple(DataStructureTuple)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getStructuredDataPropertyValue_StructuredPropertyTuple()
	 * @model required="true"
	 * @generated
	 */
	DataStructureTuple getStructuredPropertyTuple();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.StructuredDataPropertyValue#getStructuredPropertyTuple <em>Structured Property Tuple</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structured Property Tuple</em>' reference.
	 * @see #getStructuredPropertyTuple()
	 * @generated
	 */
	void setStructuredPropertyTuple(DataStructureTuple value);

} // StructuredDataPropertyValue
