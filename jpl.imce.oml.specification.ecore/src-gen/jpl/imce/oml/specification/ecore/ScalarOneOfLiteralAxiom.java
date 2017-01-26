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
 * A representation of the model object '<em><b>Scalar One Of Literal Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An axiom specifying a literal in a ScalarOneOfRestriction data range.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.ScalarOneOfLiteralAxiom#getAxiom <em>Axiom</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.ScalarOneOfLiteralAxiom#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getScalarOneOfLiteralAxiom()
 * @model
 * @generated
 */
public interface ScalarOneOfLiteralAxiom extends Axiom {
	/**
	 * Returns the value of the '<em><b>Axiom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axiom</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axiom</em>' reference.
	 * @see #setAxiom(ScalarOneOfRestriction)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getScalarOneOfLiteralAxiom_Axiom()
	 * @model required="true"
	 * @generated
	 */
	ScalarOneOfRestriction getAxiom();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.ScalarOneOfLiteralAxiom#getAxiom <em>Axiom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axiom</em>' reference.
	 * @see #getAxiom()
	 * @generated
	 */
	void setAxiom(ScalarOneOfRestriction value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the literal from the restrictedScalar datatype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getScalarOneOfLiteralAxiom_Value()
	 * @model unique="false" dataType="jpl.imce.oml.specification.ecore.LexicalValue" required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.ScalarOneOfLiteralAxiom#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // ScalarOneOfLiteralAxiom
