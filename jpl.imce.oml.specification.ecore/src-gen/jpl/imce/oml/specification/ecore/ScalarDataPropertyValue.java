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
 * A representation of the model object '<em><b>Scalar Data Property Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML ...
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.ScalarDataPropertyValue#getSingletonInstance <em>Singleton Instance</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.ScalarDataPropertyValue#getScalarDataProperty <em>Scalar Data Property</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.ScalarDataPropertyValue#getScalarPropertyValue <em>Scalar Property Value</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getScalarDataPropertyValue()
 * @model
 * @generated
 */
public interface ScalarDataPropertyValue extends TerminologyInstanceAssertion {
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
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getScalarDataPropertyValue_SingletonInstance()
	 * @model required="true"
	 * @generated
	 */
	SingletonInstance getSingletonInstance();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.ScalarDataPropertyValue#getSingletonInstance <em>Singleton Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Singleton Instance</em>' reference.
	 * @see #getSingletonInstance()
	 * @generated
	 */
	void setSingletonInstance(SingletonInstance value);

	/**
	 * Returns the value of the '<em><b>Scalar Data Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scalar Data Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scalar Data Property</em>' reference.
	 * @see #setScalarDataProperty(DataRelationshipToScalar)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getScalarDataPropertyValue_ScalarDataProperty()
	 * @model required="true"
	 * @generated
	 */
	DataRelationshipToScalar getScalarDataProperty();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.ScalarDataPropertyValue#getScalarDataProperty <em>Scalar Data Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scalar Data Property</em>' reference.
	 * @see #getScalarDataProperty()
	 * @generated
	 */
	void setScalarDataProperty(DataRelationshipToScalar value);

	/**
	 * Returns the value of the '<em><b>Scalar Property Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scalar Property Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scalar Property Value</em>' attribute.
	 * @see #setScalarPropertyValue(String)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getScalarDataPropertyValue_ScalarPropertyValue()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getScalarPropertyValue();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.ScalarDataPropertyValue#getScalarPropertyValue <em>Scalar Property Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scalar Property Value</em>' attribute.
	 * @see #getScalarPropertyValue()
	 * @generated
	 */
	void setScalarPropertyValue(String value);

} // ScalarDataPropertyValue
