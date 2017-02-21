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
 * A representation of the model object '<em><b>Entity Scalar Data Property Universal Restriction Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML EntityScalarDataPropertyUniversalRestrictionAxiom maps to an
 * OWL2 DataAllValuesFrom (the range must be explicitly defined as a Scalar datatype)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.EntityScalarDataPropertyUniversalRestrictionAxiom#getScalarRestriction <em>Scalar Restriction</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.EcorePackage#getEntityScalarDataPropertyUniversalRestrictionAxiom()
 * @model
 * @generated
 */
public interface EntityScalarDataPropertyUniversalRestrictionAxiom extends EntityScalarDataPropertyRestrictionAxiom {
	/**
	 * Returns the value of the '<em><b>Scalar Restriction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scalar Restriction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scalar Restriction</em>' reference.
	 * @see #setScalarRestriction(DataRange)
	 * @see jpl.imce.oml.specification.ecore.EcorePackage#getEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarRestriction()
	 * @model required="true"
	 * @generated
	 */
	DataRange getScalarRestriction();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.EntityScalarDataPropertyUniversalRestrictionAxiom#getScalarRestriction <em>Scalar Restriction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scalar Restriction</em>' reference.
	 * @see #getScalarRestriction()
	 * @generated
	 */
	void setScalarRestriction(DataRange value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="jpl.imce.oml.specification.ecore.UUID" unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.lang.String%> _xblockexpression = null;\n{\n\t<%jpl.imce.oml.specification.ecore.Entity%> _restrictedEntity = this.getRestrictedEntity();\n\t<%java.lang.String%> _uuid = _restrictedEntity.getUuid();\n\t<%java.lang.String%> _plus = (\"EntityScalarDataPropertyUniversalRestrictionAxiom(restrictedEntity=\" + _uuid);\n\t<%java.lang.String%> _plus_1 = (_plus + \",scalarProperty=\");\n\t<%jpl.imce.oml.specification.ecore.EntityScalarDataProperty%> _scalarProperty = this.getScalarProperty();\n\t<%java.lang.String%> _calculateUUID = _scalarProperty.calculateUUID();\n\t<%java.lang.String%> _plus_2 = (_plus_1 + _calculateUUID);\n\t<%java.lang.String%> _plus_3 = (_plus_2 + \",scalarRestriction=\");\n\t<%jpl.imce.oml.specification.ecore.DataRange%> _scalarRestriction = this.getScalarRestriction();\n\t<%java.lang.String%> _uuid_1 = _scalarRestriction.getUuid();\n\t<%java.lang.String%> _plus_4 = (_plus_3 + _uuid_1);\n\tfinal <%java.lang.String%> namespace = (_plus_4 + \")\");\n\t<%com.fasterxml.uuid.impl.NameBasedGenerator%> _nameBasedGenerator = <%com.fasterxml.uuid.Generators%>.nameBasedGenerator(<%com.fasterxml.uuid.impl.NameBasedGenerator%>.NAMESPACE_URL);\n\t<%java.util.UUID%> _generate = _nameBasedGenerator.generate(namespace);\n\t_xblockexpression = _generate.toString();\n}\nreturn _xblockexpression;'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='\n\tval namespace = \"EntityScalarDataPropertyUniversalRestrictionAxiom(restrictedEntity=\"+restrictedEntity.uuid+\",scalarProperty=\"+scalarProperty.calculateUUID()+\",scalarRestriction=\"+scalarRestriction.uuid+\")\"\n\tcom.fasterxml.uuid.Generators.nameBasedGenerator(com.fasterxml.uuid.impl.NameBasedGenerator.NAMESPACE_URL).generate(namespace)'"
	 * @generated
	 */
	String calculateUUID();

} // EntityScalarDataPropertyUniversalRestrictionAxiom
