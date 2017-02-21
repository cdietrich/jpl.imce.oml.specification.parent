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
 * A representation of the model object '<em><b>Concept Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML ConceptInstance is an OML ConceptualEntitySingletonInstance classified by an OML Concept.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.ConceptInstance#getDescriptionBox <em>Description Box</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.ConceptInstance#getSingletonConceptClassifier <em>Singleton Concept Classifier</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getConceptInstance()
 * @model
 * @generated
 */
public interface ConceptInstance extends ConceptualEntitySingletonInstance {
	/**
	 * Returns the value of the '<em><b>Description Box</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jpl.imce.oml.specification.ecore.DescriptionBox#getConceptInstances <em>Concept Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Box</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Box</em>' container reference.
	 * @see #setDescriptionBox(DescriptionBox)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getConceptInstance_DescriptionBox()
	 * @see jpl.imce.oml.specification.ecore.DescriptionBox#getConceptInstances
	 * @model opposite="conceptInstances" required="true" transient="false"
	 * @generated
	 */
	DescriptionBox getDescriptionBox();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.ConceptInstance#getDescriptionBox <em>Description Box</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Box</em>' container reference.
	 * @see #getDescriptionBox()
	 * @generated
	 */
	void setDescriptionBox(DescriptionBox value);

	/**
	 * Returns the value of the '<em><b>Singleton Concept Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Singleton Concept Classifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Singleton Concept Classifier</em>' reference.
	 * @see #setSingletonConceptClassifier(Concept)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getConceptInstance_SingletonConceptClassifier()
	 * @model required="true"
	 * @generated
	 */
	Concept getSingletonConceptClassifier();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.ConceptInstance#getSingletonConceptClassifier <em>Singleton Concept Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Singleton Concept Classifier</em>' reference.
	 * @see #getSingletonConceptClassifier()
	 * @generated
	 */
	void setSingletonConceptClassifier(Concept value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="jpl.imce.oml.specification.ecore.UUID" unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.lang.String%> _xblockexpression = null;\n{\n\t<%jpl.imce.oml.specification.ecore.DescriptionBox%> _descriptionBox = this.descriptionBox();\n\t<%java.lang.String%> _uuid = _descriptionBox.getUuid();\n\t<%java.lang.String%> _plus = (\"ConceptInstance(descriptionBox=\" + _uuid);\n\t<%java.lang.String%> _plus_1 = (_plus + \",singletonConceptClassifier=\");\n\t<%jpl.imce.oml.specification.ecore.Concept%> _singletonConceptClassifier = this.getSingletonConceptClassifier();\n\t<%java.lang.String%> _uuid_1 = _singletonConceptClassifier.getUuid();\n\t<%java.lang.String%> _plus_2 = (_plus_1 + _uuid_1);\n\tfinal <%java.lang.String%> namespace = (_plus_2 + \")\");\n\t<%com.fasterxml.uuid.impl.NameBasedGenerator%> _nameBasedGenerator = <%com.fasterxml.uuid.Generators%>.nameBasedGenerator(<%com.fasterxml.uuid.impl.NameBasedGenerator%>.NAMESPACE_URL);\n\t<%java.util.UUID%> _generate = _nameBasedGenerator.generate(namespace);\n\t_xblockexpression = _generate.toString();\n}\nreturn _xblockexpression;'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='\n\tval namespace = \"ConceptInstance(descriptionBox=\" + descriptionBox.uuid + \",singletonConceptClassifier=\"+singletonConceptClassifier.uuid+\")\"\n\tcom.fasterxml.uuid.Generators.nameBasedGenerator(com.fasterxml.uuid.impl.NameBasedGenerator.NAMESPACE_URL).generate(namespace)'"
	 * @generated
	 */
	String calculateUUID();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getSingletonConceptClassifier();'"
	 * @generated
	 */
	ConceptualEntity conceptualEntitySingletonClassifier();

} // ConceptInstance
