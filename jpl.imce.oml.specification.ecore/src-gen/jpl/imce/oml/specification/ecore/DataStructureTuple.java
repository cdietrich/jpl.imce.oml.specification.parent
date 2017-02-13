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
 * A representation of the model object '<em><b>Data Structure Tuple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML DataStructureTuple defines an structured tuple instance of an OML Structure.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.DataStructureTuple#getStructuredDataPropertyValue <em>Structured Data Property Value</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.DataStructureTuple#getDataStructureType <em>Data Structure Type</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getDataStructureTuple()
 * @model
 * @generated
 */
public interface DataStructureTuple extends SingletonInstance {
	/**
	 * Returns the value of the '<em><b>Structured Data Property Value</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jpl.imce.oml.specification.ecore.StructuredDataPropertyValue#getStructuredPropertyTuple <em>Structured Property Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structured Data Property Value</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structured Data Property Value</em>' container reference.
	 * @see #setStructuredDataPropertyValue(StructuredDataPropertyValue)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getDataStructureTuple_StructuredDataPropertyValue()
	 * @see jpl.imce.oml.specification.ecore.StructuredDataPropertyValue#getStructuredPropertyTuple
	 * @model opposite="structuredPropertyTuple" required="true" transient="false"
	 * @generated
	 */
	StructuredDataPropertyValue getStructuredDataPropertyValue();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.DataStructureTuple#getStructuredDataPropertyValue <em>Structured Data Property Value</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structured Data Property Value</em>' container reference.
	 * @see #getStructuredDataPropertyValue()
	 * @generated
	 */
	void setStructuredDataPropertyValue(StructuredDataPropertyValue value);

	/**
	 * Returns the value of the '<em><b>Data Structure Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Structure Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Structure Type</em>' reference.
	 * @see #setDataStructureType(Structure)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getDataStructureTuple_DataStructureType()
	 * @model required="true"
	 * @generated
	 */
	Structure getDataStructureType();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.DataStructureTuple#getDataStructureType <em>Data Structure Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Structure Type</em>' reference.
	 * @see #getDataStructureType()
	 * @generated
	 */
	void setDataStructureType(Structure value);

} // DataStructureTuple
