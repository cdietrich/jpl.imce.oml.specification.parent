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
 * A representation of the model object '<em><b>Concept Designation Terminology Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML ConceptDesignationTerminologyAxiom establishes
 * a relationship from a source OML TerminologyBox
 * where a designated OML Concept is defined to
 * a target OML TerminologyGraph in which the internal
 * structure of the designated OML Concept can be defined.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.ConceptDesignationTerminologyAxiom#getDesignatedTerminology <em>Designated Terminology</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.ConceptDesignationTerminologyAxiom#getDesignatedConcept <em>Designated Concept</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getConceptDesignationTerminologyAxiom()
 * @model
 * @generated
 */
public interface ConceptDesignationTerminologyAxiom extends TerminologyBoxAxiom {
	/**
	 * Returns the value of the '<em><b>Designated Terminology</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Designated Terminology</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Designated Terminology</em>' reference.
	 * @see #setDesignatedTerminology(TerminologyBox)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getConceptDesignationTerminologyAxiom_DesignatedTerminology()
	 * @model required="true"
	 * @generated
	 */
	TerminologyBox getDesignatedTerminology();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.ConceptDesignationTerminologyAxiom#getDesignatedTerminology <em>Designated Terminology</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Designated Terminology</em>' reference.
	 * @see #getDesignatedTerminology()
	 * @generated
	 */
	void setDesignatedTerminology(TerminologyBox value);

	/**
	 * Returns the value of the '<em><b>Designated Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Designated Concept</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Designated Concept</em>' reference.
	 * @see #setDesignatedConcept(Concept)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getConceptDesignationTerminologyAxiom_DesignatedConcept()
	 * @model required="true"
	 * @generated
	 */
	Concept getDesignatedConcept();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.ConceptDesignationTerminologyAxiom#getDesignatedConcept <em>Designated Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Designated Concept</em>' reference.
	 * @see #getDesignatedConcept()
	 * @generated
	 */
	void setDesignatedConcept(Concept value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="jpl.imce.oml.specification.ecore.UUID" unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.lang.String%> _xblockexpression = null;\n{\n\t<%jpl.imce.oml.specification.ecore.TerminologyBox%> _tbox = this.getTbox();\n\t<%java.lang.String%> _uuid = _tbox.getUuid();\n\t<%java.lang.String%> _plus = (\"ConceptDesignationTerminologyAxiom(designationTerminologyGraph=\" + _uuid);\n\t<%java.lang.String%> _plus_1 = (_plus + \",designatedConcept=\");\n\t<%jpl.imce.oml.specification.ecore.Concept%> _designatedConcept = this.getDesignatedConcept();\n\t<%java.lang.String%> _uuid_1 = _designatedConcept.getUuid();\n\t<%java.lang.String%> _plus_2 = (_plus_1 + _uuid_1);\n\tfinal <%java.lang.String%> namespace = (_plus_2 + \")\");\n\t<%com.fasterxml.uuid.impl.NameBasedGenerator%> _nameBasedGenerator = <%com.fasterxml.uuid.Generators%>.nameBasedGenerator(<%com.fasterxml.uuid.impl.NameBasedGenerator%>.NAMESPACE_URL);\n\t<%java.util.UUID%> _generate = _nameBasedGenerator.generate(namespace);\n\t_xblockexpression = _generate.toString();\n}\nreturn _xblockexpression;'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='\n\tval namespace = \"ConceptDesignationTerminologyAxiom(designationTerminologyGraph=\" + tbox.uuid + \",designatedConcept=\"+designatedConcept.uuid+\")\"\n\tcom.fasterxml.uuid.Generators.nameBasedGenerator(com.fasterxml.uuid.impl.NameBasedGenerator.NAMESPACE_URL).generate(namespace)'"
	 * @generated
	 */
	String calculateUUID();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%jpl.imce.oml.specification.ecore.TerminologyGraph%> _switchResult = null;\n<%jpl.imce.oml.specification.ecore.TerminologyBox%> _tbox = this.getTbox();\nboolean _matched = false;\nif (_tbox instanceof <%jpl.imce.oml.specification.ecore.TerminologyGraph%>)\n{\n\t_matched=true;\n\t<%jpl.imce.oml.specification.ecore.TerminologyBox%> _tbox_1 = this.getTbox();\n\t_switchResult = ((<%jpl.imce.oml.specification.ecore.TerminologyGraph%>) _tbox_1);\n}\nreturn _switchResult;'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='tbox match { case g: TerminologyGraph => g }'"
	 * @generated
	 */
	TerminologyGraph designationTerminologyGraph();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The designationTerminologyGraph is the source
	 * <!-- end-model-doc -->
	 * @model unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getTbox();'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='tbox'"
	 * @generated
	 */
	TerminologyBox source();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TerminologyBox that asserts the designatedConcept is the target
	 * <!-- end-model-doc -->
	 * @model unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getDesignatedTerminology();'"
	 * @generated
	 */
	TerminologyBox target();

} // ConceptDesignationTerminologyAxiom
