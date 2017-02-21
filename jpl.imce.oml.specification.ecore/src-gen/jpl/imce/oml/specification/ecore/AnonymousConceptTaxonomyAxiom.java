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
 * A representation of the model object '<em><b>Anonymous Concept Taxonomy Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML AnonymousConceptTaxonomyAxiom is an anonymous taxonomy tree of DisjointUnionOfEntityAxioms.
 * <!-- end-model-doc -->
 *
 *
 * @see jpl.imce.oml.specification.ecore.EcorePackage#getAnonymousConceptTaxonomyAxiom()
 * @model
 * @generated
 */
public interface AnonymousConceptTaxonomyAxiom extends DisjointUnionOfConceptsAxiom, ConceptTreeDisjunction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="jpl.imce.oml.specification.ecore.UUID" unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.lang.String%> _xblockexpression = null;\n{\n\t<%jpl.imce.oml.specification.ecore.Bundle%> _bundle = this.getBundle();\n\t<%java.lang.String%> _uuid = _bundle.getUuid();\n\t<%java.lang.String%> _plus = (\"AnonymousConceptTaxonomyAxiom(bundle=\" + _uuid);\n\t<%java.lang.String%> _plus_1 = (_plus + \",disjointTaxonomyParent=\");\n\t<%jpl.imce.oml.specification.ecore.ConceptTreeDisjunction%> _disjointTaxonomyParent = this.getDisjointTaxonomyParent();\n\t<%java.lang.String%> _calculateUUID = _disjointTaxonomyParent.calculateUUID();\n\t<%java.lang.String%> _plus_2 = (_plus_1 + _calculateUUID);\n\tfinal <%java.lang.String%> namespace = (_plus_2 + \")\");\n\t<%com.fasterxml.uuid.impl.NameBasedGenerator%> _nameBasedGenerator = <%com.fasterxml.uuid.Generators%>.nameBasedGenerator(<%com.fasterxml.uuid.impl.NameBasedGenerator%>.NAMESPACE_URL);\n\t<%java.util.UUID%> _generate = _nameBasedGenerator.generate(namespace);\n\t_xblockexpression = _generate.toString();\n}\nreturn _xblockexpression;'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='\n\tval namespace = \"AnonymousConceptTaxonomyAxiom(bundle=\" + bundle.uuid + \",disjointTaxonomyParent=\"+disjointTaxonomyParent.calculateUUID()+\")\"\n\tcom.fasterxml.uuid.Generators.nameBasedGenerator(com.fasterxml.uuid.impl.NameBasedGenerator.NAMESPACE_URL).generate(namespace)'"
	 * @generated
	 */
	String calculateUUID();

} // AnonymousConceptTaxonomyAxiom
