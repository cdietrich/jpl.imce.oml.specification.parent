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
 * A representation of the model object '<em><b>Reified Relationship Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML ReifiedRelationshipInstance is an OML ConceptualEntitySingletonInstance  classified by an OML ReifiedRelationship.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstance#getDescriptionBox <em>Description Box</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstance#getSingletonReifiedRelationshipClassifier <em>Singleton Reified Relationship Classifier</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getReifiedRelationshipInstance()
 * @model
 * @generated
 */
public interface ReifiedRelationshipInstance extends ConceptualEntitySingletonInstance {
	/**
	 * Returns the value of the '<em><b>Description Box</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jpl.imce.oml.specification.ecore.DescriptionBox#getReifiedRelationshipInstances <em>Reified Relationship Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Box</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Box</em>' container reference.
	 * @see #setDescriptionBox(DescriptionBox)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getReifiedRelationshipInstance_DescriptionBox()
	 * @see jpl.imce.oml.specification.ecore.DescriptionBox#getReifiedRelationshipInstances
	 * @model opposite="reifiedRelationshipInstances" required="true" transient="false"
	 * @generated
	 */
	DescriptionBox getDescriptionBox();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstance#getDescriptionBox <em>Description Box</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Box</em>' container reference.
	 * @see #getDescriptionBox()
	 * @generated
	 */
	void setDescriptionBox(DescriptionBox value);

	/**
	 * Returns the value of the '<em><b>Singleton Reified Relationship Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Singleton Reified Relationship Classifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Singleton Reified Relationship Classifier</em>' reference.
	 * @see #setSingletonReifiedRelationshipClassifier(ReifiedRelationship)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getReifiedRelationshipInstance_SingletonReifiedRelationshipClassifier()
	 * @model required="true"
	 * @generated
	 */
	ReifiedRelationship getSingletonReifiedRelationshipClassifier();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstance#getSingletonReifiedRelationshipClassifier <em>Singleton Reified Relationship Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Singleton Reified Relationship Classifier</em>' reference.
	 * @see #getSingletonReifiedRelationshipClassifier()
	 * @generated
	 */
	void setSingletonReifiedRelationshipClassifier(ReifiedRelationship value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="jpl.imce.oml.specification.ecore.UUID" unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.lang.String%> _xblockexpression = null;\n{\n\t<%jpl.imce.oml.specification.ecore.DescriptionBox%> _descriptionBox = this.descriptionBox();\n\t<%java.lang.String%> _uuid = _descriptionBox.getUuid();\n\t<%java.lang.String%> _plus = (\"ReifiedRelationshipInstance(descriptionBox=\" + _uuid);\n\t<%java.lang.String%> _plus_1 = (_plus + \",singletonReifiedRelationshipClassifier=\");\n\t<%jpl.imce.oml.specification.ecore.ReifiedRelationship%> _singletonReifiedRelationshipClassifier = this.getSingletonReifiedRelationshipClassifier();\n\t<%java.lang.String%> _uuid_1 = _singletonReifiedRelationshipClassifier.getUuid();\n\t<%java.lang.String%> _plus_2 = (_plus_1 + _uuid_1);\n\tfinal <%java.lang.String%> namespace = (_plus_2 + \")\");\n\t<%com.fasterxml.uuid.impl.NameBasedGenerator%> _nameBasedGenerator = <%com.fasterxml.uuid.Generators%>.nameBasedGenerator(<%com.fasterxml.uuid.impl.NameBasedGenerator%>.NAMESPACE_URL);\n\t<%java.util.UUID%> _generate = _nameBasedGenerator.generate(namespace);\n\t_xblockexpression = _generate.toString();\n}\nreturn _xblockexpression;'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='\n\tval namespace = \"ReifiedRelationshipInstance(descriptionBox=\" + descriptionBox.uuid + \",singletonReifiedRelationshipClassifier=\"+singletonReifiedRelationshipClassifier.uuid+\")\"\n\tcom.fasterxml.uuid.Generators.nameBasedGenerator(com.fasterxml.uuid.impl.NameBasedGenerator.NAMESPACE_URL).generate(namespace)'"
	 * @generated
	 */
	String calculateUUID();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getSingletonReifiedRelationshipClassifier();'"
	 * @generated
	 */
	ConceptualEntity conceptualEntitySingletonClassifier();

} // ReifiedRelationshipInstance
