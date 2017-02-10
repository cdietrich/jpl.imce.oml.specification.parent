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
 * A representation of the model object '<em><b>Reified Relationship Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML ReifiedRelationshipInstance ...
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstance#getSingletonReifiedRelationshipClassifier <em>Singleton Reified Relationship Classifier</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getReifiedRelationshipInstance()
 * @model
 * @generated
 */
public interface ReifiedRelationshipInstance extends ConceptualEntitySingletonInstance {
	/**
	 * Returns the value of the '<em><b>Singleton Reified Relationship Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Singleton Reified Relationship Classifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Singleton Reified Relationship Classifier</em>' reference.
	 * @see #setSingletonReifiedRelationshipClassifier(ReifiedRelationship)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getReifiedRelationshipInstance_SingletonReifiedRelationshipClassifier()
	 * @model required="true"
	 * @generated
	 */
	ReifiedRelationship getSingletonReifiedRelationshipClassifier();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstance#getSingletonReifiedRelationshipClassifier <em>Singleton Reified Relationship Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Singleton Reified Relationship Classifier</em>' reference.
	 * @see #getSingletonReifiedRelationshipClassifier()
	 * @generated
	 */
	void setSingletonReifiedRelationshipClassifier(ReifiedRelationship value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getSingletonReifiedRelationshipClassifier();'"
	 * @generated
	 */
	ConceptualEntity conceptualEntitySingletonClassifier();

} // ReifiedRelationshipInstance
