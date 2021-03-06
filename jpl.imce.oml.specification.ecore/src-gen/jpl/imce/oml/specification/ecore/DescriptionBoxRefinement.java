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
 * A representation of the model object '<em><b>Description Box Refinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML DescriptionBoxRefinement is an OML DescriptionBoxRelationship
 * from an OML DescriptionBox to another OML DescriptionBox where
 * the former refines the descriptions of the latter.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.DescriptionBoxRefinement#getRefiningDescriptionBox <em>Refining Description Box</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.DescriptionBoxRefinement#getRefinedDescriptionBox <em>Refined Description Box</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getDescriptionBoxRefinement()
 * @model
 * @generated
 */
public interface DescriptionBoxRefinement extends DescriptionBoxRelationship {
	/**
	 * Returns the value of the '<em><b>Refining Description Box</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jpl.imce.oml.specification.ecore.DescriptionBox#getDescriptionBoxRefinements <em>Description Box Refinements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refining Description Box</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refining Description Box</em>' container reference.
	 * @see #setRefiningDescriptionBox(DescriptionBox)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getDescriptionBoxRefinement_RefiningDescriptionBox()
	 * @see jpl.imce.oml.specification.ecore.DescriptionBox#getDescriptionBoxRefinements
	 * @model opposite="descriptionBoxRefinements" required="true" transient="false"
	 * @generated
	 */
	DescriptionBox getRefiningDescriptionBox();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.DescriptionBoxRefinement#getRefiningDescriptionBox <em>Refining Description Box</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refining Description Box</em>' container reference.
	 * @see #getRefiningDescriptionBox()
	 * @generated
	 */
	void setRefiningDescriptionBox(DescriptionBox value);

	/**
	 * Returns the value of the '<em><b>Refined Description Box</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refined Description Box</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refined Description Box</em>' reference.
	 * @see #setRefinedDescriptionBox(DescriptionBox)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getDescriptionBoxRefinement_RefinedDescriptionBox()
	 * @model required="true"
	 * @generated
	 */
	DescriptionBox getRefinedDescriptionBox();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.DescriptionBoxRefinement#getRefinedDescriptionBox <em>Refined Description Box</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refined Description Box</em>' reference.
	 * @see #getRefinedDescriptionBox()
	 * @generated
	 */
	void setRefinedDescriptionBox(DescriptionBox value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="jpl.imce.oml.specification.ecore.UUID" unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.lang.String%> _xblockexpression = null;\n{\n\t<%jpl.imce.oml.specification.ecore.DescriptionBox%> _refiningDescriptionBox = this.getRefiningDescriptionBox();\n\t<%java.lang.String%> _uuid = _refiningDescriptionBox.getUuid();\n\t<%java.lang.String%> _plus = (\"DescriptionBoxRefinement(refiningDescriptionBox=\" + _uuid);\n\t<%java.lang.String%> _plus_1 = (_plus + \",refinedDescriptionBox=\");\n\t<%jpl.imce.oml.specification.ecore.DescriptionBox%> _refinedDescriptionBox = this.getRefinedDescriptionBox();\n\t<%java.lang.String%> _uuid_1 = _refinedDescriptionBox.getUuid();\n\t<%java.lang.String%> _plus_2 = (_plus_1 + _uuid_1);\n\tfinal <%java.lang.String%> namespace = (_plus_2 + \")\");\n\t<%com.fasterxml.uuid.impl.NameBasedGenerator%> _nameBasedGenerator = <%com.fasterxml.uuid.Generators%>.nameBasedGenerator(<%com.fasterxml.uuid.impl.NameBasedGenerator%>.NAMESPACE_URL);\n\t<%java.util.UUID%> _generate = _nameBasedGenerator.generate(namespace);\n\t_xblockexpression = _generate.toString();\n}\nreturn _xblockexpression;'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='\n\tval namespace = \"DescriptionBoxRefinement(refiningDescriptionBox=\" + refiningDescriptionBox.uuid + \",refinedDescriptionBox=\"+refinedDescriptionBox.uuid+\")\"\n\tcom.fasterxml.uuid.Generators.nameBasedGenerator(com.fasterxml.uuid.impl.NameBasedGenerator.NAMESPACE_URL).generate(namespace)'"
	 * @generated
	 */
	String calculateUUID();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getRefiningDescriptionBox();'"
	 * @generated
	 */
	DescriptionBox descriptionDomain();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getRefinedDescriptionBox();'"
	 * @generated
	 */
	Module targetModule();

} // DescriptionBoxRefinement
