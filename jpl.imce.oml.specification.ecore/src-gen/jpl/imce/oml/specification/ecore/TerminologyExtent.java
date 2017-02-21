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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminology Extent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML TerminologyExtent defines an in-memory tuple
 * about each OML Module involved in modeling and reasoning about domain-specific
 * vocabularies and systems descriptions using such vocabularies:
 * - An OML TerminologyGraph for defining a vocabulary about a domain or a description of a system in a domain;
 * - An OML Bundle for aggregating OML TerminologyBox(es) for as modular [OWL2-DL Ontologies] for monotonic refinement and reasoning;
 * - An OML DescriptionBox for describing actual systems according to one or more domain-specific OML TerminologyBox vocabularies.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.TerminologyExtent#getAnnotationProperties <em>Annotation Properties</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.TerminologyExtent#getTerminologyGraphs <em>Terminology Graphs</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.TerminologyExtent#getBundles <em>Bundles</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.TerminologyExtent#getDescriptions <em>Descriptions</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.EcorePackage#getTerminologyExtent()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface TerminologyExtent extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Annotation Properties</b></em>' containment reference list.
	 * The list contents are of type {@link jpl.imce.oml.specification.ecore.AnnotationProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation Properties</em>' containment reference list.
	 * @see jpl.imce.oml.specification.ecore.EcorePackage#getTerminologyExtent_AnnotationProperties()
	 * @model containment="true"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<AnnotationProperty> getAnnotationProperties();

	/**
	 * Returns the value of the '<em><b>Terminology Graphs</b></em>' containment reference list.
	 * The list contents are of type {@link jpl.imce.oml.specification.ecore.TerminologyGraph}.
	 * It is bidirectional and its opposite is '{@link jpl.imce.oml.specification.ecore.TerminologyGraph#getGraphExtent <em>Graph Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminology Graphs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminology Graphs</em>' containment reference list.
	 * @see jpl.imce.oml.specification.ecore.EcorePackage#getTerminologyExtent_TerminologyGraphs()
	 * @see jpl.imce.oml.specification.ecore.TerminologyGraph#getGraphExtent
	 * @model opposite="graphExtent" containment="true"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<TerminologyGraph> getTerminologyGraphs();

	/**
	 * Returns the value of the '<em><b>Bundles</b></em>' containment reference list.
	 * The list contents are of type {@link jpl.imce.oml.specification.ecore.Bundle}.
	 * It is bidirectional and its opposite is '{@link jpl.imce.oml.specification.ecore.Bundle#getBundleExtent <em>Bundle Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundles</em>' containment reference list.
	 * @see jpl.imce.oml.specification.ecore.EcorePackage#getTerminologyExtent_Bundles()
	 * @see jpl.imce.oml.specification.ecore.Bundle#getBundleExtent
	 * @model opposite="bundleExtent" containment="true"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<Bundle> getBundles();

	/**
	 * Returns the value of the '<em><b>Descriptions</b></em>' containment reference list.
	 * The list contents are of type {@link jpl.imce.oml.specification.ecore.DescriptionBox}.
	 * It is bidirectional and its opposite is '{@link jpl.imce.oml.specification.ecore.DescriptionBox#getDescriptionExtent <em>Description Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptions</em>' containment reference list.
	 * @see jpl.imce.oml.specification.ecore.EcorePackage#getTerminologyExtent_Descriptions()
	 * @see jpl.imce.oml.specification.ecore.DescriptionBox#getDescriptionExtent
	 * @model opposite="descriptionExtent" containment="true"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<DescriptionBox> getDescriptions();

} // TerminologyExtent
