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
 * A representation of the model object '<em><b>Structured Data Property Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML StructuredDataPropertyValue defines a tuple for representing the structured tuple value
 * of an OML DataRelationshipToStructure for a particular OML SingletonInstance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.StructuredDataPropertyValue#getSingletonInstance <em>Singleton Instance</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.StructuredDataPropertyValue#getStructuredDataProperty <em>Structured Data Property</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.StructuredDataPropertyValue#getStructuredPropertyTuple <em>Structured Property Tuple</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getStructuredDataPropertyValue()
 * @model
 * @generated
 */
public interface StructuredDataPropertyValue extends TerminologyInstanceAssertion {
	/**
	 * Returns the value of the '<em><b>Singleton Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jpl.imce.oml.specification.ecore.SingletonInstance#getStructuredDataPropertyValues <em>Structured Data Property Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Singleton Instance</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Singleton Instance</em>' container reference.
	 * @see #setSingletonInstance(SingletonInstance)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getStructuredDataPropertyValue_SingletonInstance()
	 * @see jpl.imce.oml.specification.ecore.SingletonInstance#getStructuredDataPropertyValues
	 * @model opposite="structuredDataPropertyValues" required="true" transient="false"
	 * @generated
	 */
	SingletonInstance getSingletonInstance();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.StructuredDataPropertyValue#getSingletonInstance <em>Singleton Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Singleton Instance</em>' container reference.
	 * @see #getSingletonInstance()
	 * @generated
	 */
	void setSingletonInstance(SingletonInstance value);

	/**
	 * Returns the value of the '<em><b>Structured Data Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structured Data Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structured Data Property</em>' reference.
	 * @see #setStructuredDataProperty(DataRelationshipToStructure)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getStructuredDataPropertyValue_StructuredDataProperty()
	 * @model required="true"
	 * @generated
	 */
	DataRelationshipToStructure getStructuredDataProperty();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.StructuredDataPropertyValue#getStructuredDataProperty <em>Structured Data Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structured Data Property</em>' reference.
	 * @see #getStructuredDataProperty()
	 * @generated
	 */
	void setStructuredDataProperty(DataRelationshipToStructure value);

	/**
	 * Returns the value of the '<em><b>Structured Property Tuple</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link jpl.imce.oml.specification.ecore.DataStructureTuple#getStructuredDataPropertyValue <em>Structured Data Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structured Property Tuple</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structured Property Tuple</em>' containment reference.
	 * @see #setStructuredPropertyTuple(DataStructureTuple)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getStructuredDataPropertyValue_StructuredPropertyTuple()
	 * @see jpl.imce.oml.specification.ecore.DataStructureTuple#getStructuredDataPropertyValue
	 * @model opposite="structuredDataPropertyValue" containment="true" required="true"
	 * @generated
	 */
	DataStructureTuple getStructuredPropertyTuple();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.StructuredDataPropertyValue#getStructuredPropertyTuple <em>Structured Property Tuple</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structured Property Tuple</em>' containment reference.
	 * @see #getStructuredPropertyTuple()
	 * @generated
	 */
	void setStructuredPropertyTuple(DataStructureTuple value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="jpl.imce.oml.specification.ecore.UUID" unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.lang.String%> _xblockexpression = null;\n{\n\t<%jpl.imce.oml.specification.ecore.SingletonInstance%> _singletonInstance = this.getSingletonInstance();\n\t<%java.lang.String%> _uuid = _singletonInstance.getUuid();\n\t<%java.lang.String%> _plus = (\"StructuredDataPropertyValue(singletonInstance=\" + _uuid);\n\t<%java.lang.String%> _plus_1 = (_plus + \",structuredDataProperty=\");\n\t<%jpl.imce.oml.specification.ecore.DataRelationshipToStructure%> _structuredDataProperty = this.getStructuredDataProperty();\n\t<%java.lang.String%> _calculateUUID = _structuredDataProperty.calculateUUID();\n\t<%java.lang.String%> _plus_2 = (_plus_1 + _calculateUUID);\n\t<%java.lang.String%> _plus_3 = (_plus_2 + \",structuredPropertyTuple=\");\n\t<%jpl.imce.oml.specification.ecore.DataStructureTuple%> _structuredPropertyTuple = this.getStructuredPropertyTuple();\n\t<%java.lang.String%> _uuid_1 = _structuredPropertyTuple.getUuid();\n\t<%java.lang.String%> _plus_4 = (_plus_3 + _uuid_1);\n\tfinal <%java.lang.String%> namespace = (_plus_4 + \")\");\n\t<%com.fasterxml.uuid.impl.NameBasedGenerator%> _nameBasedGenerator = <%com.fasterxml.uuid.Generators%>.nameBasedGenerator(<%com.fasterxml.uuid.impl.NameBasedGenerator%>.NAMESPACE_URL);\n\t<%java.util.UUID%> _generate = _nameBasedGenerator.generate(namespace);\n\t_xblockexpression = _generate.toString();\n}\nreturn _xblockexpression;'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='\n\tval namespace = \"StructuredDataPropertyValue(singletonInstance=\" + singletonInstance.uuid + \",structuredDataProperty=\"+structuredDataProperty.calculateUUID()+ \",structuredPropertyTuple=\"+structuredPropertyTuple.uuid+\")\"\n\tcom.fasterxml.uuid.Generators.nameBasedGenerator(com.fasterxml.uuid.impl.NameBasedGenerator.NAMESPACE_URL).generate(namespace)'"
	 * @generated
	 */
	String calculateUUID();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%jpl.imce.oml.specification.ecore.SingletonInstance%> _singletonInstance = this.getSingletonInstance();\nreturn _singletonInstance.descriptionBox();'"
	 * @generated
	 */
	DescriptionBox descriptionBox();

} // StructuredDataPropertyValue
