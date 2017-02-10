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
 * A representation of the model object '<em><b>Reified Relationship Instance Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML ReifiedRelationshipInstanceDomain ...
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceDomain#getReifiedRelationshipInstance <em>Reified Relationship Instance</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceDomain#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getReifiedRelationshipInstanceDomain()
 * @model
 * @generated
 */
public interface ReifiedRelationshipInstanceDomain extends TerminologyInstanceAssertion {
	/**
	 * Returns the value of the '<em><b>Reified Relationship Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reified Relationship Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reified Relationship Instance</em>' reference.
	 * @see #setReifiedRelationshipInstance(ReifiedRelationshipInstance)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getReifiedRelationshipInstanceDomain_ReifiedRelationshipInstance()
	 * @model required="true"
	 * @generated
	 */
	ReifiedRelationshipInstance getReifiedRelationshipInstance();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceDomain#getReifiedRelationshipInstance <em>Reified Relationship Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reified Relationship Instance</em>' reference.
	 * @see #getReifiedRelationshipInstance()
	 * @generated
	 */
	void setReifiedRelationshipInstance(ReifiedRelationshipInstance value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see #setDomain(ConceptualEntitySingletonInstance)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getReifiedRelationshipInstanceDomain_Domain()
	 * @model required="true"
	 * @generated
	 */
	ConceptualEntitySingletonInstance getDomain();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceDomain#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(ConceptualEntitySingletonInstance value);

} // ReifiedRelationshipInstanceDomain
