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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Singleton Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML SingletonInstance defines an instance of either an OML ConceptualEntity or of an OML Structure.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.SingletonInstance#getScalarDataPropertyValues <em>Scalar Data Property Values</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.SingletonInstance#getStructuredDataPropertyValues <em>Structured Data Property Values</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getSingletonInstance()
 * @model abstract="true"
 * @generated
 */
public interface SingletonInstance extends TerminologyInstanceAssertion {
	/**
	 * Returns the value of the '<em><b>Scalar Data Property Values</b></em>' containment reference list.
	 * The list contents are of type {@link jpl.imce.oml.specification.ecore.ScalarDataPropertyValue}.
	 * It is bidirectional and its opposite is '{@link jpl.imce.oml.specification.ecore.ScalarDataPropertyValue#getSingletonInstance <em>Singleton Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scalar Data Property Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scalar Data Property Values</em>' containment reference list.
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getSingletonInstance_ScalarDataPropertyValues()
	 * @see jpl.imce.oml.specification.ecore.ScalarDataPropertyValue#getSingletonInstance
	 * @model opposite="singletonInstance" containment="true"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<ScalarDataPropertyValue> getScalarDataPropertyValues();

	/**
	 * Returns the value of the '<em><b>Structured Data Property Values</b></em>' containment reference list.
	 * The list contents are of type {@link jpl.imce.oml.specification.ecore.StructuredDataPropertyValue}.
	 * It is bidirectional and its opposite is '{@link jpl.imce.oml.specification.ecore.StructuredDataPropertyValue#getSingletonInstance <em>Singleton Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structured Data Property Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structured Data Property Values</em>' containment reference list.
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getSingletonInstance_StructuredDataPropertyValues()
	 * @see jpl.imce.oml.specification.ecore.StructuredDataPropertyValue#getSingletonInstance
	 * @model opposite="singletonInstance" containment="true"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<StructuredDataPropertyValue> getStructuredDataPropertyValues();

} // SingletonInstance
