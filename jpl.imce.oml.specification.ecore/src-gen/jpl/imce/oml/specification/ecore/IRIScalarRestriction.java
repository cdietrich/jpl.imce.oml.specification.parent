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
 * A representation of the model object '<em><b>IRI Scalar Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML IRIScalarRestriction is a data range that specifies how one IRI scalar adds facet restrictions to another.
 * Applicable when the restricted scalar represents an [OWL2 IRI].
 * 
 * The restricted scalar must be directly or indirectly a restriction of:
 * - [xsd:anyURI]
 * 
 * Facets:
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
 *   <li>{@link jpl.imce.oml.specification.ecore.IRIScalarRestriction#getLength <em>Length</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.IRIScalarRestriction#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.IRIScalarRestriction#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.IRIScalarRestriction#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getIRIScalarRestriction()
 * @model
 * @generated
 */
public interface IRIScalarRestriction extends RestrictedDataRange {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The length of the IRI
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getIRIScalarRestriction_Length()
	 * @model unique="false"
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.IRIScalarRestriction#getLength <em>Length</em>}' attribute.
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
	 * The minimum length of the IRI
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Length</em>' attribute.
	 * @see #setMinLength(int)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getIRIScalarRestriction_MinLength()
	 * @model unique="false"
	 * @generated
	 */
	int getMinLength();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.IRIScalarRestriction#getMinLength <em>Min Length</em>}' attribute.
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
	 * The maximum length of the IRI
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Length</em>' attribute.
	 * @see #setMaxLength(int)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getIRIScalarRestriction_MaxLength()
	 * @model unique="false"
	 * @generated
	 */
	int getMaxLength();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.IRIScalarRestriction#getMaxLength <em>Max Length</em>}' attribute.
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
	 * The pattern of the IRI (https://www.w3.org/TR/xmlschema-2/#regexs)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(String)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getIRIScalarRestriction_Pattern()
	 * @model unique="false" dataType="jpl.imce.oml.specification.ecore.Pattern"
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.IRIScalarRestriction#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="jpl.imce.oml.specification.ecore.UUID" unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.lang.String%> _xblockexpression = null;\n{\n\t<%jpl.imce.oml.specification.ecore.DataRange%> _restrictedRange = this.getRestrictedRange();\n\t<%java.lang.String%> _uuid = _restrictedRange.getUuid();\n\t<%java.lang.String%> _plus = (\"IRIScalarRestriction(restrictedRange=\" + _uuid);\n\tfinal <%java.lang.String%> namespace = (_plus + \")\");\n\t<%com.fasterxml.uuid.impl.NameBasedGenerator%> _nameBasedGenerator = <%com.fasterxml.uuid.Generators%>.nameBasedGenerator(<%com.fasterxml.uuid.impl.NameBasedGenerator%>.NAMESPACE_URL);\n\t<%java.util.UUID%> _generate = _nameBasedGenerator.generate(namespace);\n\t_xblockexpression = _generate.toString();\n}\nreturn _xblockexpression;'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='\n\tval namespace = \"IRIScalarRestriction(restrictedRange=\"+restrictedRange.uuid+\")\"\n\tcom.fasterxml.uuid.Generators.nameBasedGenerator(com.fasterxml.uuid.impl.NameBasedGenerator.NAMESPACE_URL).generate(namespace)'"
	 * @generated
	 */
	String calculateUUID();

} // IRIScalarRestriction
