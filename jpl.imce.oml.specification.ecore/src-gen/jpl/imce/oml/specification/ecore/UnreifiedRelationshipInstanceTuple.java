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
 * A representation of the model object '<em><b>Unreified Relationship Instance Tuple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML UnreifiedRelationshipInstanceTuple specifies a triple involving
 * a reference to an OML ConceptualEntitySingletonInstance playing the role of the domain
 * of an OML UnreifiedRelationship whose range is played by a reference to an OML ConceptualEntitySingletonInstance.
 * An OML UnreifiedRelationshipInstanceTuple has no intrinsic identity; instead,
 * an OML UnreifiedRelationshipInstanceTuple is semantically equivalent
 * to another OML UnreifiedRelationshipInstanceTuple referencing the same domain, property and range.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.UnreifiedRelationshipInstanceTuple#getDescriptionBox <em>Description Box</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.UnreifiedRelationshipInstanceTuple#getUnreifiedRelationship <em>Unreified Relationship</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.UnreifiedRelationshipInstanceTuple#getDomain <em>Domain</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.UnreifiedRelationshipInstanceTuple#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getUnreifiedRelationshipInstanceTuple()
 * @model
 * @generated
 */
public interface UnreifiedRelationshipInstanceTuple extends TerminologyInstanceAssertion {
	/**
	 * Returns the value of the '<em><b>Description Box</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jpl.imce.oml.specification.ecore.DescriptionBox#getUnreifiedRelationshipInstanceTuples <em>Unreified Relationship Instance Tuples</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Box</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Box</em>' container reference.
	 * @see #setDescriptionBox(DescriptionBox)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getUnreifiedRelationshipInstanceTuple_DescriptionBox()
	 * @see jpl.imce.oml.specification.ecore.DescriptionBox#getUnreifiedRelationshipInstanceTuples
	 * @model opposite="unreifiedRelationshipInstanceTuples" required="true" transient="false"
	 * @generated
	 */
	DescriptionBox getDescriptionBox();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.UnreifiedRelationshipInstanceTuple#getDescriptionBox <em>Description Box</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Box</em>' container reference.
	 * @see #getDescriptionBox()
	 * @generated
	 */
	void setDescriptionBox(DescriptionBox value);

	/**
	 * Returns the value of the '<em><b>Unreified Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unreified Relationship</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unreified Relationship</em>' reference.
	 * @see #setUnreifiedRelationship(UnreifiedRelationship)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getUnreifiedRelationshipInstanceTuple_UnreifiedRelationship()
	 * @model required="true"
	 * @generated
	 */
	UnreifiedRelationship getUnreifiedRelationship();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.UnreifiedRelationshipInstanceTuple#getUnreifiedRelationship <em>Unreified Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unreified Relationship</em>' reference.
	 * @see #getUnreifiedRelationship()
	 * @generated
	 */
	void setUnreifiedRelationship(UnreifiedRelationship value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see #setDomain(ConceptualEntitySingletonInstance)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getUnreifiedRelationshipInstanceTuple_Domain()
	 * @model required="true"
	 * @generated
	 */
	ConceptualEntitySingletonInstance getDomain();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.UnreifiedRelationshipInstanceTuple#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(ConceptualEntitySingletonInstance value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' reference.
	 * @see #setRange(ConceptualEntitySingletonInstance)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getUnreifiedRelationshipInstanceTuple_Range()
	 * @model required="true"
	 * @generated
	 */
	ConceptualEntitySingletonInstance getRange();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.UnreifiedRelationshipInstanceTuple#getRange <em>Range</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(ConceptualEntitySingletonInstance value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="jpl.imce.oml.specification.ecore.UUID" unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.lang.String%> _xblockexpression = null;\n{\n\t<%jpl.imce.oml.specification.ecore.DescriptionBox%> _descriptionBox = this.descriptionBox();\n\t<%java.lang.String%> _uuid = _descriptionBox.getUuid();\n\t<%java.lang.String%> _plus = (\"UnreifiedRelationshipInstanceTuple(descriptionBox=\" + _uuid);\n\t<%java.lang.String%> _plus_1 = (_plus + \",unreifiedRelationship=\");\n\t<%jpl.imce.oml.specification.ecore.UnreifiedRelationship%> _unreifiedRelationship = this.getUnreifiedRelationship();\n\t<%java.lang.String%> _uuid_1 = _unreifiedRelationship.getUuid();\n\t<%java.lang.String%> _plus_2 = (_plus_1 + _uuid_1);\n\t<%java.lang.String%> _plus_3 = (_plus_2 + \",domain=\");\n\t<%jpl.imce.oml.specification.ecore.ConceptualEntitySingletonInstance%> _domain = this.getDomain();\n\t<%java.lang.String%> _uuid_2 = _domain.getUuid();\n\t<%java.lang.String%> _plus_4 = (_plus_3 + _uuid_2);\n\t<%java.lang.String%> _plus_5 = (_plus_4 + \",range=\");\n\t<%jpl.imce.oml.specification.ecore.ConceptualEntitySingletonInstance%> _range = this.getRange();\n\t<%java.lang.String%> _uuid_3 = _range.getUuid();\n\t<%java.lang.String%> _plus_6 = (_plus_5 + _uuid_3);\n\tfinal <%java.lang.String%> namespace = (_plus_6 + \")\");\n\t<%com.fasterxml.uuid.impl.NameBasedGenerator%> _nameBasedGenerator = <%com.fasterxml.uuid.Generators%>.nameBasedGenerator(<%com.fasterxml.uuid.impl.NameBasedGenerator%>.NAMESPACE_URL);\n\t<%java.util.UUID%> _generate = _nameBasedGenerator.generate(namespace);\n\t_xblockexpression = _generate.toString();\n}\nreturn _xblockexpression;'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='\n\tval namespace = \"UnreifiedRelationshipInstanceTuple(descriptionBox=\" + descriptionBox.uuid + \",unreifiedRelationship=\"+unreifiedRelationship.uuid+ \",domain=\"+domain.uuid+ \",range=\"+range.uuid+\")\"\n\tcom.fasterxml.uuid.Generators.nameBasedGenerator(com.fasterxml.uuid.impl.NameBasedGenerator.NAMESPACE_URL).generate(namespace)'"
	 * @generated
	 */
	String calculateUUID();

} // UnreifiedRelationshipInstanceTuple
