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
 * A representation of the model object '<em><b>Aspect Specialization Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML AspectSpecializationAxiom is a logical axiom
 * about a taxonomic relationship between a specific OML Aspect
 * and a general OML Entity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.AspectSpecializationAxiom#getSubEntity <em>Sub Entity</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.AspectSpecializationAxiom#getSuperAspect <em>Super Aspect</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.EcorePackage#getAspectSpecializationAxiom()
 * @model
 * @generated
 */
public interface AspectSpecializationAxiom extends SpecializationAxiom {
	/**
	 * Returns the value of the '<em><b>Sub Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sub (child) entity
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Entity</em>' reference.
	 * @see #setSubEntity(Entity)
	 * @see jpl.imce.oml.specification.ecore.EcorePackage#getAspectSpecializationAxiom_SubEntity()
	 * @model required="true"
	 * @generated
	 */
	Entity getSubEntity();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.AspectSpecializationAxiom#getSubEntity <em>Sub Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Entity</em>' reference.
	 * @see #getSubEntity()
	 * @generated
	 */
	void setSubEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Super Aspect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The super (parent) aspect
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Super Aspect</em>' reference.
	 * @see #setSuperAspect(Aspect)
	 * @see jpl.imce.oml.specification.ecore.EcorePackage#getAspectSpecializationAxiom_SuperAspect()
	 * @model required="true"
	 * @generated
	 */
	Aspect getSuperAspect();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.AspectSpecializationAxiom#getSuperAspect <em>Super Aspect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Aspect</em>' reference.
	 * @see #getSuperAspect()
	 * @generated
	 */
	void setSuperAspect(Aspect value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="jpl.imce.oml.specification.ecore.UUID" unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.lang.String%> _xblockexpression = null;\n{\n\t<%jpl.imce.oml.specification.ecore.Entity%> _subEntity = this.getSubEntity();\n\t<%java.lang.String%> _uuid = _subEntity.getUuid();\n\t<%java.lang.String%> _plus = (\"AspectSpecializationAxiom(subEntity=\" + _uuid);\n\t<%java.lang.String%> _plus_1 = (_plus + \",superAspect=\");\n\t<%jpl.imce.oml.specification.ecore.Aspect%> _superAspect = this.getSuperAspect();\n\t<%java.lang.String%> _uuid_1 = _superAspect.getUuid();\n\t<%java.lang.String%> _plus_2 = (_plus_1 + _uuid_1);\n\tfinal <%java.lang.String%> namespace = (_plus_2 + \")\");\n\t<%com.fasterxml.uuid.impl.NameBasedGenerator%> _nameBasedGenerator = <%com.fasterxml.uuid.Generators%>.nameBasedGenerator(<%com.fasterxml.uuid.impl.NameBasedGenerator%>.NAMESPACE_URL);\n\t<%java.util.UUID%> _generate = _nameBasedGenerator.generate(namespace);\n\t_xblockexpression = _generate.toString();\n}\nreturn _xblockexpression;'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='\n\tval namespace = \"AspectSpecializationAxiom(subEntity=\" + subEntity.uuid + \",superAspect=\"+superAspect.uuid+\")\"\n\tcom.fasterxml.uuid.Generators.nameBasedGenerator(com.fasterxml.uuid.impl.NameBasedGenerator.NAMESPACE_URL).generate(namespace)'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getSubEntity();'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getSuperAspect();'"
	 * @generated
	 */
	Entity parent();

} // AspectSpecializationAxiom
