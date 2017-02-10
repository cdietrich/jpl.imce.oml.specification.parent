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
 * A representation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML Term ...
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.Term#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getTerm()
 * @model abstract="true"
 * @generated
 */
public interface Term extends TerminologyBoxStatement, Resource {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getTerm_Name()
	 * @model unique="false" id="true" dataType="jpl.imce.oml.specification.ecore.LocalName" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.Term#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The UUID of a Term is a Version5 namespace UUID based on the term's IRI.
	 * <!-- end-model-doc -->
	 * @model dataType="jpl.imce.oml.specification.ecore.UUID" unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%com.fasterxml.uuid.impl.NameBasedGenerator%> _nameBasedGenerator = <%com.fasterxml.uuid.Generators%>.nameBasedGenerator(<%com.fasterxml.uuid.impl.NameBasedGenerator%>.NAMESPACE_URL);\n<%java.lang.String%> _iri = this.iri();\n<%java.util.UUID%> _generate = _nameBasedGenerator.generate(_iri);\nreturn _generate.toString();'"
	 * @generated
	 */
	String calculateUUID();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="jpl.imce.oml.specification.ecore.IRI" unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%jpl.imce.oml.specification.ecore.TerminologyBox%> _graph = this.getGraph();\n<%java.lang.String%> _iri = _graph.iri();\n<%java.lang.String%> _plus = (_iri + \"#\");\n<%java.lang.String%> _name = this.name();\nreturn (_plus + _name);'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='graph.iri + \"#\" + name'"
	 * @generated
	 */
	String iri();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="jpl.imce.oml.specification.ecore.LocalName" unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getName();'"
	 * @generated
	 */
	String name();

} // Term
