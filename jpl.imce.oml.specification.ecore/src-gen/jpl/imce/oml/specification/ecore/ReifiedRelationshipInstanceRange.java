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
 * A representation of the model object '<em><b>Reified Relationship Instance Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML ReifiedRelationshipInstanceRange specifies which OML ConceptualEntitySingletonInstance
 * plays the role of the range for an OML ReifiedRelationshipInstance.
 * An OML ReifiedRelationshipInstanceRange has no intrinsic identity; instead,
 * an OML ReifiedRelationshipInstanceRange is semantically equivalent
 * to another OML ReifiedRelationshipInstanceRange referencing the same property and range.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceRange#getDescriptionBox <em>Description Box</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceRange#getReifiedRelationshipInstance <em>Reified Relationship Instance</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceRange#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getReifiedRelationshipInstanceRange()
 * @model
 * @generated
 */
public interface ReifiedRelationshipInstanceRange extends TerminologyInstanceAssertion {
	/**
	 * Returns the value of the '<em><b>Description Box</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jpl.imce.oml.specification.ecore.DescriptionBox#getReifiedRelationshipInstanceRanges <em>Reified Relationship Instance Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Box</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Box</em>' container reference.
	 * @see #setDescriptionBox(DescriptionBox)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getReifiedRelationshipInstanceRange_DescriptionBox()
	 * @see jpl.imce.oml.specification.ecore.DescriptionBox#getReifiedRelationshipInstanceRanges
	 * @model opposite="reifiedRelationshipInstanceRanges" required="true" transient="false"
	 * @generated
	 */
	DescriptionBox getDescriptionBox();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceRange#getDescriptionBox <em>Description Box</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Box</em>' container reference.
	 * @see #getDescriptionBox()
	 * @generated
	 */
	void setDescriptionBox(DescriptionBox value);

	/**
	 * Returns the value of the '<em><b>Reified Relationship Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reified Relationship Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reified Relationship Instance</em>' reference.
	 * @see #setReifiedRelationshipInstance(ReifiedRelationshipInstance)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getReifiedRelationshipInstanceRange_ReifiedRelationshipInstance()
	 * @model required="true"
	 * @generated
	 */
	ReifiedRelationshipInstance getReifiedRelationshipInstance();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceRange#getReifiedRelationshipInstance <em>Reified Relationship Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reified Relationship Instance</em>' reference.
	 * @see #getReifiedRelationshipInstance()
	 * @generated
	 */
	void setReifiedRelationshipInstance(ReifiedRelationshipInstance value);

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
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getReifiedRelationshipInstanceRange_Range()
	 * @model required="true"
	 * @generated
	 */
	ConceptualEntitySingletonInstance getRange();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceRange#getRange <em>Range</em>}' reference.
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.lang.String%> _xblockexpression = null;\n{\n\t<%jpl.imce.oml.specification.ecore.DescriptionBox%> _descriptionBox = this.descriptionBox();\n\t<%java.lang.String%> _uuid = _descriptionBox.getUuid();\n\t<%java.lang.String%> _plus = (\"ReifiedRelationshipInstanceRange(descriptionBox=\" + _uuid);\n\t<%java.lang.String%> _plus_1 = (_plus + \",reifiedRelationshipInstance=\");\n\t<%jpl.imce.oml.specification.ecore.ReifiedRelationshipInstance%> _reifiedRelationshipInstance = this.getReifiedRelationshipInstance();\n\t<%java.lang.String%> _uuid_1 = _reifiedRelationshipInstance.getUuid();\n\t<%java.lang.String%> _plus_2 = (_plus_1 + _uuid_1);\n\t<%java.lang.String%> _plus_3 = (_plus_2 + \",range=\");\n\t<%jpl.imce.oml.specification.ecore.ConceptualEntitySingletonInstance%> _range = this.getRange();\n\t<%java.lang.String%> _uuid_2 = _range.getUuid();\n\t<%java.lang.String%> _plus_4 = (_plus_3 + _uuid_2);\n\tfinal <%java.lang.String%> namespace = (_plus_4 + \")\");\n\t<%com.fasterxml.uuid.impl.NameBasedGenerator%> _nameBasedGenerator = <%com.fasterxml.uuid.Generators%>.nameBasedGenerator(<%com.fasterxml.uuid.impl.NameBasedGenerator%>.NAMESPACE_URL);\n\t<%java.util.UUID%> _generate = _nameBasedGenerator.generate(namespace);\n\t_xblockexpression = _generate.toString();\n}\nreturn _xblockexpression;'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='\n\tval namespace = \"ReifiedRelationshipInstanceRange(descriptionBox=\" + descriptionBox.uuid + \",reifiedRelationshipInstance=\"+reifiedRelationshipInstance.uuid+ \",range=\"+range.uuid+\")\"\n\tcom.fasterxml.uuid.Generators.nameBasedGenerator(com.fasterxml.uuid.impl.NameBasedGenerator.NAMESPACE_URL).generate(namespace)'"
	 * @generated
	 */
	String calculateUUID();

} // ReifiedRelationshipInstanceRange
