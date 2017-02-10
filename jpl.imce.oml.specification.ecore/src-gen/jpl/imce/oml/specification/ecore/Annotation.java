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
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML Annotation maps to an [OWL2 Annotation] and is similarly
 * a non-logical statement in the context of an OML Terminology
 * associating some information as the value of an
 * OML AnnotationProperty for describing a subject (an OML TerminologyThing).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.Annotation#getTerminology <em>Terminology</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.Annotation#getProperty <em>Property</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.Annotation#getSubject <em>Subject</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.Annotation#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getAnnotation()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Annotation extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Terminology</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jpl.imce.oml.specification.ecore.TerminologyBox#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminology</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminology</em>' container reference.
	 * @see #setTerminology(TerminologyBox)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getAnnotation_Terminology()
	 * @see jpl.imce.oml.specification.ecore.TerminologyBox#getAnnotations
	 * @model opposite="annotations" required="true" transient="false"
	 * @generated
	 */
	TerminologyBox getTerminology();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.Annotation#getTerminology <em>Terminology</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminology</em>' container reference.
	 * @see #getTerminology()
	 * @generated
	 */
	void setTerminology(TerminologyBox value);

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
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getAnnotation_Property()
	 * @model required="true"
	 * @generated
	 */
	AnnotationProperty getProperty();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.Annotation#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(AnnotationProperty value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' reference.
	 * @see #setSubject(TerminologyThing)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getAnnotation_Subject()
	 * @model required="true"
	 * @generated
	 */
	TerminologyThing getSubject();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.Annotation#getSubject <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(TerminologyThing value);

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
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getAnnotation_Value()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.Annotation#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Annotation
