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
 * A representation of the model object '<em><b>Entity Scalar Data Property Particular Restriction Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * An OML EntityScalarDataPropertyParticularRestrictionAxiom maps to an OWL2 DataHasValue restriction.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.EntityScalarDataPropertyParticularRestrictionAxiom#getLiteralValue <em>Literal Value</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.EcorePackage#getEntityScalarDataPropertyParticularRestrictionAxiom()
 * @model
 * @generated
 */
public interface EntityScalarDataPropertyParticularRestrictionAxiom extends EntityScalarDataPropertyRestrictionAxiom {
	/**
	 * Returns the value of the '<em><b>Literal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal Value</em>' attribute.
	 * @see #setLiteralValue(String)
	 * @see jpl.imce.oml.specification.ecore.EcorePackage#getEntityScalarDataPropertyParticularRestrictionAxiom_LiteralValue()
	 * @model unique="false" dataType="jpl.imce.oml.specification.ecore.LexicalValue" required="true"
	 * @generated
	 */
	String getLiteralValue();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.EntityScalarDataPropertyParticularRestrictionAxiom#getLiteralValue <em>Literal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal Value</em>' attribute.
	 * @see #getLiteralValue()
	 * @generated
	 */
	void setLiteralValue(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="jpl.imce.oml.specification.ecore.UUID" unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.lang.String%> _xblockexpression = null;\n{\n\t<%jpl.imce.oml.specification.ecore.Entity%> _restrictedEntity = this.getRestrictedEntity();\n\t<%java.lang.String%> _uuid = _restrictedEntity.getUuid();\n\t<%java.lang.String%> _plus = (\"EntityScalarDataPropertyParticularRestrictionAxiom(restrictedEntity=\" + _uuid);\n\t<%java.lang.String%> _plus_1 = (_plus + \",scalarProperty=\");\n\t<%jpl.imce.oml.specification.ecore.EntityScalarDataProperty%> _scalarProperty = this.getScalarProperty();\n\t<%java.lang.String%> _calculateUUID = _scalarProperty.calculateUUID();\n\t<%java.lang.String%> _plus_2 = (_plus_1 + _calculateUUID);\n\tfinal <%java.lang.String%> namespace = (_plus_2 + \")\");\n\t<%com.fasterxml.uuid.impl.NameBasedGenerator%> _nameBasedGenerator = <%com.fasterxml.uuid.Generators%>.nameBasedGenerator(<%com.fasterxml.uuid.impl.NameBasedGenerator%>.NAMESPACE_URL);\n\t<%java.util.UUID%> _generate = _nameBasedGenerator.generate(namespace);\n\t_xblockexpression = _generate.toString();\n}\nreturn _xblockexpression;'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='\n\tval namespace = \"EntityScalarDataPropertyParticularRestrictionAxiom(restrictedEntity=\"+restrictedEntity.uuid+\",scalarProperty=\"+scalarProperty.calculateUUID()+\")\"\n\tcom.fasterxml.uuid.Generators.nameBasedGenerator(com.fasterxml.uuid.impl.NameBasedGenerator.NAMESPACE_URL).generate(namespace)'"
	 * @generated
	 */
	String calculateUUID();

} // EntityScalarDataPropertyParticularRestrictionAxiom
