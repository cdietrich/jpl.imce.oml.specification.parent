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
 * A representation of the model object '<em><b>Plain Literal Scalar Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML PlainLiteralScalarRestriction is a data range that specifies how one plain literal scalar adds facet restrictions to another.
 * Applicable when the restricted scalar represents [rdf:PlainLiteral].
 * 
 * The restricted scalar must be directly or indirectly a restriction of:
 * - [rdf:PlainLiteral]
 * 
 * Facets:
 * - [xsd:langRange]
 * - [xsd:length]
 * - [xsd:minLength]
 * - [xsd:maxLength]
 * - [xsd:pattern]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.PlainLiteralScalarRestriction#getLength <em>Length</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.PlainLiteralScalarRestriction#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.PlainLiteralScalarRestriction#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.PlainLiteralScalarRestriction#getPattern <em>Pattern</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.PlainLiteralScalarRestriction#getLangRange <em>Lang Range</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getPlainLiteralScalarRestriction()
 * @model
 * @generated
 */
public interface PlainLiteralScalarRestriction extends RestrictedDataRange {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The length of the plain literal
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getPlainLiteralScalarRestriction_Length()
	 * @model unique="false"
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.PlainLiteralScalarRestriction#getLength <em>Length</em>}' attribute.
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
	 * The minimum length of the plain literal
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Length</em>' attribute.
	 * @see #setMinLength(int)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getPlainLiteralScalarRestriction_MinLength()
	 * @model unique="false"
	 * @generated
	 */
	int getMinLength();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.PlainLiteralScalarRestriction#getMinLength <em>Min Length</em>}' attribute.
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
	 * The maximum length of the plain literal
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Length</em>' attribute.
	 * @see #setMaxLength(int)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getPlainLiteralScalarRestriction_MaxLength()
	 * @model unique="false"
	 * @generated
	 */
	int getMaxLength();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.PlainLiteralScalarRestriction#getMaxLength <em>Max Length</em>}' attribute.
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
	 * The pattern of the plain literal (https://www.w3.org/TR/xmlschema-2/#regexs)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(String)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getPlainLiteralScalarRestriction_Pattern()
	 * @model unique="false" dataType="jpl.imce.oml.specification.ecore.Pattern"
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.PlainLiteralScalarRestriction#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

	/**
	 * Returns the value of the '<em><b>Lang Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The language of the plain literal (http://www.rfc-editor.org/rfc/bcp/bcp47.txt)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lang Range</em>' attribute.
	 * @see #setLangRange(String)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getPlainLiteralScalarRestriction_LangRange()
	 * @model unique="false" dataType="jpl.imce.oml.specification.ecore.LangRange"
	 * @generated
	 */
	String getLangRange();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.PlainLiteralScalarRestriction#getLangRange <em>Lang Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang Range</em>' attribute.
	 * @see #getLangRange()
	 * @generated
	 */
	void setLangRange(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="jpl.imce.oml.specification.ecore.UUID" unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.lang.String%> _xblockexpression = null;\n{\n\t<%jpl.imce.oml.specification.ecore.DataRange%> _restrictedRange = this.getRestrictedRange();\n\t<%java.lang.String%> _uuid = _restrictedRange.getUuid();\n\t<%java.lang.String%> _plus = (\"PlainLiteralScalarRestriction(restrictedRange=\" + _uuid);\n\tfinal <%java.lang.String%> namespace = (_plus + \")\");\n\t<%com.fasterxml.uuid.impl.NameBasedGenerator%> _nameBasedGenerator = <%com.fasterxml.uuid.Generators%>.nameBasedGenerator(<%com.fasterxml.uuid.impl.NameBasedGenerator%>.NAMESPACE_URL);\n\t<%java.util.UUID%> _generate = _nameBasedGenerator.generate(namespace);\n\t_xblockexpression = _generate.toString();\n}\nreturn _xblockexpression;'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='\n\tval namespace = \"PlainLiteralScalarRestriction(restrictedRange=\"+restrictedRange.uuid+\")\"\n\tcom.fasterxml.uuid.Generators.nameBasedGenerator(com.fasterxml.uuid.impl.NameBasedGenerator.NAMESPACE_URL).generate(namespace)'"
	 * @generated
	 */
	String calculateUUID();

} // PlainLiteralScalarRestriction
