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
 * A representation of the model object '<em><b>Bundled Terminology Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML BundledTerminologyAxiom identifies an OML TerminologyBox that an OML Bundle aggregates.
 * An OML BundledTerminologyAxiom allows an OML Bundle to
 * make references (via OML TerminologyStatement(s)) to OML TerminologyThing(s)
 * within the transitive closure of a bundledTerminology.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.BundledTerminologyAxiom#getBundledTerminology <em>Bundled Terminology</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getBundledTerminologyAxiom()
 * @model
 * @generated
 */
public interface BundledTerminologyAxiom extends TerminologyBundleAxiom {
	/**
	 * Returns the value of the '<em><b>Bundled Terminology</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundled Terminology</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundled Terminology</em>' reference.
	 * @see #setBundledTerminology(TerminologyBox)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getBundledTerminologyAxiom_BundledTerminology()
	 * @model required="true"
	 * @generated
	 */
	TerminologyBox getBundledTerminology();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.BundledTerminologyAxiom#getBundledTerminology <em>Bundled Terminology</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundled Terminology</em>' reference.
	 * @see #getBundledTerminology()
	 * @generated
	 */
	void setBundledTerminology(TerminologyBox value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="jpl.imce.oml.specification.ecore.UUID" unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.lang.String%> _xblockexpression = null;\n{\n\t<%jpl.imce.oml.specification.ecore.Bundle%> _terminologyBundle = this.getTerminologyBundle();\n\t<%java.lang.String%> _uuid = _terminologyBundle.getUuid();\n\t<%java.lang.String%> _plus = (\"BundledTerminologyAxiom(terminologyBundle=\" + _uuid);\n\t<%java.lang.String%> _plus_1 = (_plus + \",bundledTerminology=\");\n\t<%jpl.imce.oml.specification.ecore.TerminologyBox%> _bundledTerminology = this.getBundledTerminology();\n\t<%java.lang.String%> _uuid_1 = _bundledTerminology.getUuid();\n\t<%java.lang.String%> _plus_2 = (_plus_1 + _uuid_1);\n\tfinal <%java.lang.String%> namespace = (_plus_2 + \")\");\n\t<%com.fasterxml.uuid.impl.NameBasedGenerator%> _nameBasedGenerator = <%com.fasterxml.uuid.Generators%>.nameBasedGenerator(<%com.fasterxml.uuid.impl.NameBasedGenerator%>.NAMESPACE_URL);\n\t<%java.util.UUID%> _generate = _nameBasedGenerator.generate(namespace);\n\t_xblockexpression = _generate.toString();\n}\nreturn _xblockexpression;'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='\n\tval namespace = \"BundledTerminologyAxiom(terminologyBundle=\" + terminologyBundle.uuid + \",bundledTerminology=\"+bundledTerminology.uuid+\")\"\n\tcom.fasterxml.uuid.Generators.nameBasedGenerator(com.fasterxml.uuid.impl.NameBasedGenerator.NAMESPACE_URL).generate(namespace)'"
	 * @generated
	 */
	String calculateUUID();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bundle is the source
	 * <!-- end-model-doc -->
	 * @model unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getTerminologyBundle();'"
	 * @generated
	 */
	TerminologyBox source();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bundledTerminology is the target
	 * <!-- end-model-doc -->
	 * @model unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getBundledTerminology();'"
	 * @generated
	 */
	TerminologyBox target();

} // BundledTerminologyAxiom
