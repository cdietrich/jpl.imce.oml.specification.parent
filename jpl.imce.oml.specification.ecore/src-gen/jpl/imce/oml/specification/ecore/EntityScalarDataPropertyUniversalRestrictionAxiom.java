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
 * A representation of the model object '<em><b>Entity Scalar Data Property Universal Restriction Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Semantics: OWL2 DataAllValuesFrom (the range must be explicitly defined as a Scalar datatype)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.EntityScalarDataPropertyUniversalRestrictionAxiom#getScalarRestriction <em>Scalar Restriction</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getEntityScalarDataPropertyUniversalRestrictionAxiom()
 * @model
 * @generated
 */
public interface EntityScalarDataPropertyUniversalRestrictionAxiom extends EntityScalarDataPropertyRestrictionAxiom {
	/**
	 * Returns the value of the '<em><b>Scalar Restriction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scalar Restriction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scalar Restriction</em>' reference.
	 * @see #setScalarRestriction(DataRange)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarRestriction()
	 * @model required="true"
	 * @generated
	 */
	DataRange getScalarRestriction();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.EntityScalarDataPropertyUniversalRestrictionAxiom#getScalarRestriction <em>Scalar Restriction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scalar Restriction</em>' reference.
	 * @see #getScalarRestriction()
	 * @generated
	 */
	void setScalarRestriction(DataRange value);

} // EntityScalarDataPropertyUniversalRestrictionAxiom
