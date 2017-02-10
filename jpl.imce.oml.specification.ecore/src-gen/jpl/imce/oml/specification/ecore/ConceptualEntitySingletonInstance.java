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
 * A representation of the model object '<em><b>Conceptual Entity Singleton Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML ConceptualEntitySingletonInstance ...
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.ConceptualEntitySingletonInstance#getIdentifyingScalarValues <em>Identifying Scalar Values</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.ConceptualEntitySingletonInstance#getIdentifyingStructuredTuples <em>Identifying Structured Tuples</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getConceptualEntitySingletonInstance()
 * @model abstract="true"
 * @generated
 */
public interface ConceptualEntitySingletonInstance extends SingletonInstance {
	/**
	 * Returns the value of the '<em><b>Identifying Scalar Values</b></em>' reference list.
	 * The list contents are of type {@link jpl.imce.oml.specification.ecore.ScalarDataPropertyValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifying Scalar Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifying Scalar Values</em>' reference list.
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getConceptualEntitySingletonInstance_IdentifyingScalarValues()
	 * @model annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<ScalarDataPropertyValue> getIdentifyingScalarValues();

	/**
	 * Returns the value of the '<em><b>Identifying Structured Tuples</b></em>' reference list.
	 * The list contents are of type {@link jpl.imce.oml.specification.ecore.DataStructureTuple}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifying Structured Tuples</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifying Structured Tuples</em>' reference list.
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getConceptualEntitySingletonInstance_IdentifyingStructuredTuples()
	 * @model annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<DataStructureTuple> getIdentifyingStructuredTuples();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true"
	 * @generated
	 */
	ConceptualEntity conceptualEntitySingletonClassifier();

} // ConceptualEntitySingletonInstance
