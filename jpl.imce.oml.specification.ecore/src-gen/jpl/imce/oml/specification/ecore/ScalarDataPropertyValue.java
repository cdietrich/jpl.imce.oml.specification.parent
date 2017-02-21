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
 * An OML ScalarDataPropertyValue defines a tuple for representing the atomic String value
 * of an OML DataRelationshipToScalar for a particular OML SingletonInstance.
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
 * @see jpl.imce.oml.specification.ecore.EcorePackage#getScalarDataPropertyValue()
 * @model
 * @generated
 */
public interface ScalarDataPropertyValue extends TerminologyInstanceAssertion {
	/**
	 * Returns the value of the '<em><b>Singleton Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jpl.imce.oml.specification.ecore.SingletonInstance#getScalarDataPropertyValues <em>Scalar Data Property Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Singleton Instance</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Singleton Instance</em>' container reference.
	 * @see #setSingletonInstance(SingletonInstance)
	 * @see jpl.imce.oml.specification.ecore.EcorePackage#getScalarDataPropertyValue_SingletonInstance()
	 * @see jpl.imce.oml.specification.ecore.SingletonInstance#getScalarDataPropertyValues
	 * @model opposite="scalarDataPropertyValues" required="true" transient="false"
	 * @generated
	 */
	SingletonInstance getSingletonInstance();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.ScalarDataPropertyValue#getSingletonInstance <em>Singleton Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Singleton Instance</em>' container reference.
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
	 * @see jpl.imce.oml.specification.ecore.EcorePackage#getScalarDataPropertyValue_ScalarDataProperty()
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
	 * @see jpl.imce.oml.specification.ecore.EcorePackage#getScalarDataPropertyValue_ScalarPropertyValue()
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="jpl.imce.oml.specification.ecore.UUID" unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.lang.String%> _xblockexpression = null;\n{\n\t<%jpl.imce.oml.specification.ecore.SingletonInstance%> _singletonInstance = this.getSingletonInstance();\n\t<%java.lang.String%> _uuid = _singletonInstance.getUuid();\n\t<%java.lang.String%> _plus = (\"ScalarDataPropertyValue(singletonInstance=\" + _uuid);\n\t<%java.lang.String%> _plus_1 = (_plus + \",scalarDataProperty=\");\n\t<%jpl.imce.oml.specification.ecore.DataRelationshipToScalar%> _scalarDataProperty = this.getScalarDataProperty();\n\t<%java.lang.String%> _calculateUUID = _scalarDataProperty.calculateUUID();\n\t<%java.lang.String%> _plus_2 = (_plus_1 + _calculateUUID);\n\tfinal <%java.lang.String%> namespace = (_plus_2 + \")\");\n\t<%com.fasterxml.uuid.impl.NameBasedGenerator%> _nameBasedGenerator = <%com.fasterxml.uuid.Generators%>.nameBasedGenerator(<%com.fasterxml.uuid.impl.NameBasedGenerator%>.NAMESPACE_URL);\n\t<%java.util.UUID%> _generate = _nameBasedGenerator.generate(namespace);\n\t_xblockexpression = _generate.toString();\n}\nreturn _xblockexpression;'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='\n\tval namespace = \"ScalarDataPropertyValue(singletonInstance=\" + singletonInstance.uuid + \",scalarDataProperty=\"+scalarDataProperty.calculateUUID()+\")\"\n\tcom.fasterxml.uuid.Generators.nameBasedGenerator(com.fasterxml.uuid.impl.NameBasedGenerator.NAMESPACE_URL).generate(namespace)'"
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

} // ScalarDataPropertyValue
