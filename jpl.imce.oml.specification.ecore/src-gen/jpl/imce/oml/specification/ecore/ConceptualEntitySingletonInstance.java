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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conceptual Entity Singleton Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML ConceptualEntitySingletonInstance defines an instance of an OML ConceptualEntity.
 * An OML ConceptualEntitySingletonInstance maps to an [OWL2 NamedIndividual].
 * The semantics depends on the kind of OML ConceptualEntity classifier:
 * - If the OML ConceptualEntity is the domain for at least at least
 *   one OML DataRelationshipFromEntity with `isIdentityCriteria=true`,
 *   then the [OWL2-DL] mapping includes an [OWL2 Key Axiom]
 *   forcing that all distinctly named OML ConceptualEntitySingletonInstance
 *   must have different values for each OML DataRelationshipFromEntity with `isIdentityCriteria=true`.
 * - otherwise, distinctly named OML ConceptualEntitySingletonInstance
 *   represent semantically different instances.
 * <!-- end-model-doc -->
 *
 *
 * @see jpl.imce.oml.specification.ecore.EcorePackage#getConceptualEntitySingletonInstance()
 * @model abstract="true"
 * @generated
 */
public interface ConceptualEntitySingletonInstance extends SingletonInstance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true"
	 * @generated
	 */
	ConceptualEntity conceptualEntitySingletonClassifier();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%jpl.imce.oml.specification.ecore.ScalarDataPropertyValue%>> _scalarDataPropertyValues = this.getScalarDataPropertyValues();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%jpl.imce.oml.specification.ecore.ScalarDataPropertyValue%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%jpl.imce.oml.specification.ecore.ScalarDataPropertyValue%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%jpl.imce.oml.specification.ecore.ScalarDataPropertyValue%> v)\n\t{\n\t\tboolean _xblockexpression = false;\n\t\t{\n\t\t\tfinal <%jpl.imce.oml.specification.ecore.DataRelationshipToScalar%> p = v.getScalarDataProperty();\n\t\t\tboolean _switchResult = false;\n\t\t\tboolean _matched = false;\n\t\t\tif (p instanceof <%jpl.imce.oml.specification.ecore.EntityScalarDataProperty%>)\n\t\t\t{\n\t\t\t\t_matched=true;\n\t\t\t\t_switchResult = ((<%jpl.imce.oml.specification.ecore.EntityScalarDataProperty%>)p).isIsIdentityCriteria();\n\t\t\t}\n\t\t\tif (!_matched)\n\t\t\t{\n\t\t\t\t_switchResult = false;\n\t\t\t}\n\t\t\t_xblockexpression = _switchResult;\n\t\t}\n\t\treturn <%java.lang.Boolean%>.valueOf(_xblockexpression);\n\t}\n};\n<%java.lang.Iterable%><<%jpl.imce.oml.specification.ecore.ScalarDataPropertyValue%>> _filter = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%jpl.imce.oml.specification.ecore.ScalarDataPropertyValue%>>filter(_scalarDataPropertyValues, _function);\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%jpl.imce.oml.specification.ecore.ScalarDataPropertyValue%>>asEList(((<%jpl.imce.oml.specification.ecore.ScalarDataPropertyValue%>[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(_filter, <%jpl.imce.oml.specification.ecore.ScalarDataPropertyValue%>.class)));'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='scalarDataPropertyValues.filter{ v =>\n\t  v.scalarDataProperty match {\n\t    case ep: EntityScalarDataProperty =>\n\t\t  ep.isIdentityCriteria\n\t    case _ =>\n\t      false\n\t  }}'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<ScalarDataPropertyValue> identifyingScalarValues();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%jpl.imce.oml.specification.ecore.StructuredDataPropertyValue%>> _structuredDataPropertyValues = this.getStructuredDataPropertyValues();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%jpl.imce.oml.specification.ecore.StructuredDataPropertyValue%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%jpl.imce.oml.specification.ecore.StructuredDataPropertyValue%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%jpl.imce.oml.specification.ecore.StructuredDataPropertyValue%> v)\n\t{\n\t\tboolean _xblockexpression = false;\n\t\t{\n\t\t\tfinal <%jpl.imce.oml.specification.ecore.DataRelationshipToStructure%> p = v.getStructuredDataProperty();\n\t\t\tboolean _switchResult = false;\n\t\t\tboolean _matched = false;\n\t\t\tif (p instanceof <%jpl.imce.oml.specification.ecore.EntityStructuredDataProperty%>)\n\t\t\t{\n\t\t\t\t_matched=true;\n\t\t\t\t_switchResult = ((<%jpl.imce.oml.specification.ecore.EntityStructuredDataProperty%>)p).isIsIdentityCriteria();\n\t\t\t}\n\t\t\tif (!_matched)\n\t\t\t{\n\t\t\t\t_switchResult = false;\n\t\t\t}\n\t\t\t_xblockexpression = _switchResult;\n\t\t}\n\t\treturn <%java.lang.Boolean%>.valueOf(_xblockexpression);\n\t}\n};\n<%java.lang.Iterable%><<%jpl.imce.oml.specification.ecore.StructuredDataPropertyValue%>> _filter = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%jpl.imce.oml.specification.ecore.StructuredDataPropertyValue%>>filter(_structuredDataPropertyValues, _function);\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%jpl.imce.oml.specification.ecore.StructuredDataPropertyValue%>>asEList(((<%jpl.imce.oml.specification.ecore.StructuredDataPropertyValue%>[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(_filter, <%jpl.imce.oml.specification.ecore.StructuredDataPropertyValue%>.class)));'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='structuredDataPropertyValues.filter{ v =>\n\t  v.structuredDataProperty match {\n\t    case ep: EntityStructuredDataProperty =>\n\t\t  ep.isIdentityCriteria\n\t    case _ =>\n\t      false\n\t  }}'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<StructuredDataPropertyValue> identifyingStructuredTuples();

} // ConceptualEntitySingletonInstance
