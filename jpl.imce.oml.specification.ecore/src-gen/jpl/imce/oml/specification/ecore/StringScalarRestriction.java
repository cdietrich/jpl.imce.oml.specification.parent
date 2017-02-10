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
 * A representation of the model object '<em><b>String Scalar Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML StringScalarRestriction is a data range that specifies how one string scalar adds facet restrictions to another.
 * Applies when the restricted scalar represents strings (OWL2: 4.3)
 * i.e., when it is one of the following scalars (or their transitively restricted ones):
 * xsd:string
 * xsd:normalizedString
 * xsd:token
 * xsd:language
 * xsd:Name
 * xsd:NCName
 * xsd:NMTOKEN
 * xsd:length, xsd:minLength, xsd:maxLength, xsd:pattern
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.StringScalarRestriction#getLength <em>Length</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.StringScalarRestriction#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.StringScalarRestriction#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.StringScalarRestriction#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getStringScalarRestriction()
 * @model
 * @generated
 */
public interface StringScalarRestriction extends RestrictedDataRange {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The length of the string
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getStringScalarRestriction_Length()
	 * @model unique="false"
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.StringScalarRestriction#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

	/**
	 * Returns the value of the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum length of the string
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Length</em>' attribute.
	 * @see #setMinLength(int)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getStringScalarRestriction_MinLength()
	 * @model unique="false"
	 * @generated
	 */
	int getMinLength();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.StringScalarRestriction#getMinLength <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Length</em>' attribute.
	 * @see #getMinLength()
	 * @generated
	 */
	void setMinLength(int value);

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum length of the string
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Length</em>' attribute.
	 * @see #setMaxLength(int)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getStringScalarRestriction_MaxLength()
	 * @model unique="false"
	 * @generated
	 */
	int getMaxLength();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.StringScalarRestriction#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(int value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The pattern of the string (https://www.w3.org/TR/xmlschema-2/#regexs)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(String)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getStringScalarRestriction_Pattern()
	 * @model unique="false" dataType="jpl.imce.oml.specification.ecore.Pattern"
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.StringScalarRestriction#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

} // StringScalarRestriction
