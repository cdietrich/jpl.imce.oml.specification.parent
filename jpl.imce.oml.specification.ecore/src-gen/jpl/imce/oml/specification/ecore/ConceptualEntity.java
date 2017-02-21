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

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conceptual Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML ConceptualEntity is an OML Entity
 * that can be either abstract or concrete.
 * An abstract OML ConceptualEntity cannot have any instance
 * in a final OML DescriptionBox.
 * A concrete OML ConceptualEntity can be partially instantiated
 * as an OML ConceptualEntitySingletonInstance in any OML DescriptionBox.
 * If is partially instantiated if some essential OML EntityRelationship
 * or OML DataRelationshipFromEntity with `isIdentityCriteria=true` lacks
 * an OML TerminologyInstanceAssertion specifying its reference or value respectively.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.ConceptualEntity#isIsAbstract <em>Is Abstract</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.EcorePackage#getConceptualEntity()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface ConceptualEntity extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see jpl.imce.oml.specification.ecore.EcorePackage#getConceptualEntity_IsAbstract()
	 * @model unique="false" required="true"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.ConceptualEntity#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

} // ConceptualEntity
