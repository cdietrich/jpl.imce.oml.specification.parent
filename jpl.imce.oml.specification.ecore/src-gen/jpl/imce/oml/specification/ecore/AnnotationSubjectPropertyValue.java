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

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Subject Property Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML AnnotationSubjectPropertyValue is an in-memory construct
 * pairing an OML AnnotationProperty with a String value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.AnnotationSubjectPropertyValue#getProperty <em>Property</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.AnnotationSubjectPropertyValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getAnnotationSubjectPropertyValue()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface AnnotationSubjectPropertyValue extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(AnnotationProperty)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getAnnotationSubjectPropertyValue_Property()
	 * @model required="true"
	 * @generated
	 */
	AnnotationProperty getProperty();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.AnnotationSubjectPropertyValue#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(AnnotationProperty value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getAnnotationSubjectPropertyValue_Value()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.AnnotationSubjectPropertyValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // AnnotationSubjectPropertyValue
