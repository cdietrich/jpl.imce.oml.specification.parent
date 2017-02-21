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
 * A representation of the model object '<em><b>Concept Specialization Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML ConceptSpecializationAxiom is a logical axiom
 * about a taxonomic relationship between a specific and general
 * OML Concept.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.ConceptSpecializationAxiom#getSubConcept <em>Sub Concept</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.ConceptSpecializationAxiom#getSuperConcept <em>Super Concept</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.EcorePackage#getConceptSpecializationAxiom()
 * @model
 * @generated
 */
public interface ConceptSpecializationAxiom extends SpecializationAxiom {
	/**
	 * Returns the value of the '<em><b>Sub Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Concept</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Concept</em>' reference.
	 * @see #setSubConcept(Concept)
	 * @see jpl.imce.oml.specification.ecore.EcorePackage#getConceptSpecializationAxiom_SubConcept()
	 * @model required="true"
	 * @generated
	 */
	Concept getSubConcept();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.ConceptSpecializationAxiom#getSubConcept <em>Sub Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Concept</em>' reference.
	 * @see #getSubConcept()
	 * @generated
	 */
	void setSubConcept(Concept value);

	/**
	 * Returns the value of the '<em><b>Super Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Concept</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Concept</em>' reference.
	 * @see #setSuperConcept(Concept)
	 * @see jpl.imce.oml.specification.ecore.EcorePackage#getConceptSpecializationAxiom_SuperConcept()
	 * @model required="true"
	 * @generated
	 */
	Concept getSuperConcept();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.ConceptSpecializationAxiom#getSuperConcept <em>Super Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Concept</em>' reference.
	 * @see #getSuperConcept()
	 * @generated
	 */
	void setSuperConcept(Concept value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="jpl.imce.oml.specification.ecore.UUID" unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.lang.String%> _xblockexpression = null;\n{\n\t<%jpl.imce.oml.specification.ecore.Concept%> _subConcept = this.getSubConcept();\n\t<%java.lang.String%> _uuid = _subConcept.getUuid();\n\t<%java.lang.String%> _plus = (\"ConceptSpecializationAxiom(subConcept=\" + _uuid);\n\t<%java.lang.String%> _plus_1 = (_plus + \",superConcept=\");\n\t<%jpl.imce.oml.specification.ecore.Concept%> _superConcept = this.getSuperConcept();\n\t<%java.lang.String%> _uuid_1 = _superConcept.getUuid();\n\t<%java.lang.String%> _plus_2 = (_plus_1 + _uuid_1);\n\tfinal <%java.lang.String%> namespace = (_plus_2 + \")\");\n\t<%com.fasterxml.uuid.impl.NameBasedGenerator%> _nameBasedGenerator = <%com.fasterxml.uuid.Generators%>.nameBasedGenerator(<%com.fasterxml.uuid.impl.NameBasedGenerator%>.NAMESPACE_URL);\n\t<%java.util.UUID%> _generate = _nameBasedGenerator.generate(namespace);\n\t_xblockexpression = _generate.toString();\n}\nreturn _xblockexpression;'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='\n\tval namespace = \"ConceptSpecializationAxiom(subConcept=\" + subConcept.uuid + \",superConcept=\"+superConcept.uuid+\")\"\n\tcom.fasterxml.uuid.Generators.nameBasedGenerator(com.fasterxml.uuid.impl.NameBasedGenerator.NAMESPACE_URL).generate(namespace)'"
	 * @generated
	 */
	String calculateUUID();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get the sub (child) entity
	 * <!-- end-model-doc -->
	 * @model unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getSubConcept();'"
	 * @generated
	 */
	Entity child();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get the super (parent) entity
	 * <!-- end-model-doc -->
	 * @model unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getSuperConcept();'"
	 * @generated
	 */
	Entity parent();

} // ConceptSpecializationAxiom
