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
 * A representation of the model object '<em><b>Annotation Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML AnnotationProperty maps to an [OWL2 AnnotationProperty]
 * and is similarly a non-logical property for associating some information
 * to any OML TerminologyThing in an OML Module.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.AnnotationProperty#getIri <em>Iri</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.AnnotationProperty#getAbbrevIRI <em>Abbrev IRI</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.EcorePackage#getAnnotationProperty()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface AnnotationProperty extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iri</em>' attribute.
	 * @see #setIri(String)
	 * @see jpl.imce.oml.specification.ecore.EcorePackage#getAnnotationProperty_Iri()
	 * @model unique="false" dataType="jpl.imce.oml.specification.ecore.IRI" required="true"
	 * @generated
	 */
	String getIri();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.AnnotationProperty#getIri <em>Iri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iri</em>' attribute.
	 * @see #getIri()
	 * @generated
	 */
	void setIri(String value);

	/**
	 * Returns the value of the '<em><b>Abbrev IRI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abbrev IRI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abbrev IRI</em>' attribute.
	 * @see #setAbbrevIRI(String)
	 * @see jpl.imce.oml.specification.ecore.EcorePackage#getAnnotationProperty_AbbrevIRI()
	 * @model unique="false" id="true" dataType="jpl.imce.oml.specification.ecore.AbbrevIRI" required="true"
	 * @generated
	 */
	String getAbbrevIRI();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.AnnotationProperty#getAbbrevIRI <em>Abbrev IRI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abbrev IRI</em>' attribute.
	 * @see #getAbbrevIRI()
	 * @generated
	 */
	void setAbbrevIRI(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="jpl.imce.oml.specification.ecore.UUID" unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.lang.String%> _iri = this.getIri();\n<%java.util.UUID%> _fromString = <%java.util.UUID%>.fromString(_iri);\nreturn _fromString.toString();'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='java.util.UUID.fromString(iri)'"
	 * @generated
	 */
	String uuid();

} // AnnotationProperty
