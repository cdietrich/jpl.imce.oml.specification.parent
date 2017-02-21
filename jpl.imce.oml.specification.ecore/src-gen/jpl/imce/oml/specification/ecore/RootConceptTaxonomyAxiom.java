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
 * A representation of the model object '<em><b>Root Concept Taxonomy Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML RootConceptTaxonomyAxiom asserts that, in the scope of a Bundle, a particular Entity
 * is the root of a taxonomy of specializations of that Entity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.RootConceptTaxonomyAxiom#getRoot <em>Root</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.EcorePackage#getRootConceptTaxonomyAxiom()
 * @model
 * @generated
 */
public interface RootConceptTaxonomyAxiom extends TerminologyBundleStatement, ConceptTreeDisjunction {
	/**
	 * Returns the value of the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Concept that is at the root of a taxonomy of disjunctions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Root</em>' reference.
	 * @see #setRoot(Concept)
	 * @see jpl.imce.oml.specification.ecore.EcorePackage#getRootConceptTaxonomyAxiom_Root()
	 * @model required="true"
	 * @generated
	 */
	Concept getRoot();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.RootConceptTaxonomyAxiom#getRoot <em>Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Concept value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="jpl.imce.oml.specification.ecore.UUID" unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.lang.String%> _xblockexpression = null;\n{\n\t<%jpl.imce.oml.specification.ecore.Bundle%> _bundle = this.getBundle();\n\t<%java.lang.String%> _uuid = _bundle.getUuid();\n\t<%java.lang.String%> _plus = (\"RootConceptTaxonomyAxiom(bundle=\" + _uuid);\n\t<%java.lang.String%> _plus_1 = (_plus + \",root=\");\n\t<%jpl.imce.oml.specification.ecore.Concept%> _root = this.getRoot();\n\t<%java.lang.String%> _uuid_1 = _root.getUuid();\n\t<%java.lang.String%> _plus_2 = (_plus_1 + _uuid_1);\n\tfinal <%java.lang.String%> namespace = (_plus_2 + \")\");\n\t<%com.fasterxml.uuid.impl.NameBasedGenerator%> _nameBasedGenerator = <%com.fasterxml.uuid.Generators%>.nameBasedGenerator(<%com.fasterxml.uuid.impl.NameBasedGenerator%>.NAMESPACE_URL);\n\t<%java.util.UUID%> _generate = _nameBasedGenerator.generate(namespace);\n\t_xblockexpression = _generate.toString();\n}\nreturn _xblockexpression;'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='\n\tval namespace = \"RootConceptTaxonomyAxiom(bundle=\" + bundle.uuid + \",root=\"+root.uuid+\")\"\n\tcom.fasterxml.uuid.Generators.nameBasedGenerator(com.fasterxml.uuid.impl.NameBasedGenerator.NAMESPACE_URL).generate(namespace)'"
	 * @generated
	 */
	String calculateUUID();

} // RootConceptTaxonomyAxiom
