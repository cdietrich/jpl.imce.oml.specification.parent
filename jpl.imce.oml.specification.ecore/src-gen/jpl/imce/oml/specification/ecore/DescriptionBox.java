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
 * A representation of the model object '<em><b>Description Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML DescriptionBox ...
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.DescriptionBox#getTerminologyExtent <em>Terminology Extent</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.DescriptionBox#getClosedWorldDefinitions <em>Closed World Definitions</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.DescriptionBox#getDescriptionBoxRefinements <em>Description Box Refinements</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.DescriptionBox#getConceptInstances <em>Concept Instances</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.DescriptionBox#getReifiedRelationshipInstances <em>Reified Relationship Instances</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.DescriptionBox#getReifiedRelationshipInstanceDomains <em>Reified Relationship Instance Domains</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.DescriptionBox#getReifiedRelationshipInstanceRanges <em>Reified Relationship Instance Ranges</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.DescriptionBox#getUnreifiedRelationshipInstanceTuples <em>Unreified Relationship Instance Tuples</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.DescriptionBox#getDataStructureTuples <em>Data Structure Tuples</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.DescriptionBox#getScalarDataPropertyValues <em>Scalar Data Property Values</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.DescriptionBox#getStructuredDataPropertyValues <em>Structured Data Property Values</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getDescriptionBox()
 * @model
 * @generated
 */
public interface DescriptionBox extends TerminologyThing, Resource {
	/**
	 * Returns the value of the '<em><b>Terminology Extent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jpl.imce.oml.specification.ecore.TerminologyExtent#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminology Extent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminology Extent</em>' container reference.
	 * @see #setTerminologyExtent(TerminologyExtent)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getDescriptionBox_TerminologyExtent()
	 * @see jpl.imce.oml.specification.ecore.TerminologyExtent#getDescriptions
	 * @model opposite="descriptions" required="true" transient="false"
	 * @generated
	 */
	TerminologyExtent getTerminologyExtent();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.DescriptionBox#getTerminologyExtent <em>Terminology Extent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminology Extent</em>' container reference.
	 * @see #getTerminologyExtent()
	 * @generated
	 */
	void setTerminologyExtent(TerminologyExtent value);

	/**
	 * Returns the value of the '<em><b>Closed World Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link jpl.imce.oml.specification.ecore.DescriptionBoxExtendsClosedWorldDefinitions}.
	 * It is bidirectional and its opposite is '{@link jpl.imce.oml.specification.ecore.DescriptionBoxExtendsClosedWorldDefinitions#getDescriptionBox <em>Description Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closed World Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closed World Definitions</em>' containment reference list.
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getDescriptionBox_ClosedWorldDefinitions()
	 * @see jpl.imce.oml.specification.ecore.DescriptionBoxExtendsClosedWorldDefinitions#getDescriptionBox
	 * @model opposite="descriptionBox" containment="true"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<DescriptionBoxExtendsClosedWorldDefinitions> getClosedWorldDefinitions();

	/**
	 * Returns the value of the '<em><b>Description Box Refinements</b></em>' containment reference list.
	 * The list contents are of type {@link jpl.imce.oml.specification.ecore.DescriptionBoxRefinement}.
	 * It is bidirectional and its opposite is '{@link jpl.imce.oml.specification.ecore.DescriptionBoxRefinement#getRefiningDescriptionBox <em>Refining Description Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Box Refinements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Box Refinements</em>' containment reference list.
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getDescriptionBox_DescriptionBoxRefinements()
	 * @see jpl.imce.oml.specification.ecore.DescriptionBoxRefinement#getRefiningDescriptionBox
	 * @model opposite="refiningDescriptionBox" containment="true"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<DescriptionBoxRefinement> getDescriptionBoxRefinements();

	/**
	 * Returns the value of the '<em><b>Concept Instances</b></em>' reference list.
	 * The list contents are of type {@link jpl.imce.oml.specification.ecore.ConceptInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concept Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept Instances</em>' reference list.
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getDescriptionBox_ConceptInstances()
	 * @model annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<ConceptInstance> getConceptInstances();

	/**
	 * Returns the value of the '<em><b>Reified Relationship Instances</b></em>' reference list.
	 * The list contents are of type {@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reified Relationship Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reified Relationship Instances</em>' reference list.
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getDescriptionBox_ReifiedRelationshipInstances()
	 * @model annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<ReifiedRelationshipInstance> getReifiedRelationshipInstances();

	/**
	 * Returns the value of the '<em><b>Reified Relationship Instance Domains</b></em>' reference list.
	 * The list contents are of type {@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceDomain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reified Relationship Instance Domains</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reified Relationship Instance Domains</em>' reference list.
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getDescriptionBox_ReifiedRelationshipInstanceDomains()
	 * @model annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<ReifiedRelationshipInstanceDomain> getReifiedRelationshipInstanceDomains();

	/**
	 * Returns the value of the '<em><b>Reified Relationship Instance Ranges</b></em>' reference list.
	 * The list contents are of type {@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceRange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reified Relationship Instance Ranges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reified Relationship Instance Ranges</em>' reference list.
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getDescriptionBox_ReifiedRelationshipInstanceRanges()
	 * @model annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<ReifiedRelationshipInstanceRange> getReifiedRelationshipInstanceRanges();

	/**
	 * Returns the value of the '<em><b>Unreified Relationship Instance Tuples</b></em>' reference list.
	 * The list contents are of type {@link jpl.imce.oml.specification.ecore.UnreifiedRelationshipInstanceTuple}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unreified Relationship Instance Tuples</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unreified Relationship Instance Tuples</em>' reference list.
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getDescriptionBox_UnreifiedRelationshipInstanceTuples()
	 * @model annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<UnreifiedRelationshipInstanceTuple> getUnreifiedRelationshipInstanceTuples();

	/**
	 * Returns the value of the '<em><b>Data Structure Tuples</b></em>' reference list.
	 * The list contents are of type {@link jpl.imce.oml.specification.ecore.DataStructureTuple}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Structure Tuples</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Structure Tuples</em>' reference list.
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getDescriptionBox_DataStructureTuples()
	 * @model annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<DataStructureTuple> getDataStructureTuples();

	/**
	 * Returns the value of the '<em><b>Scalar Data Property Values</b></em>' reference list.
	 * The list contents are of type {@link jpl.imce.oml.specification.ecore.ScalarDataPropertyValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scalar Data Property Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scalar Data Property Values</em>' reference list.
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getDescriptionBox_ScalarDataPropertyValues()
	 * @model annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<ScalarDataPropertyValue> getScalarDataPropertyValues();

	/**
	 * Returns the value of the '<em><b>Structured Data Property Values</b></em>' reference list.
	 * The list contents are of type {@link jpl.imce.oml.specification.ecore.StructuredDataPropertyValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structured Data Property Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structured Data Property Values</em>' reference list.
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getDescriptionBox_StructuredDataPropertyValues()
	 * @model annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<StructuredDataPropertyValue> getStructuredDataPropertyValues();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" sUnique="false" sMany="true"
	 *        sAnnotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='copy(conceptInstances = this.conceptInstances ++ s)'"
	 * @generated
	 */
	DescriptionBox withConceptInstances(EList<ConceptInstance> s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" sUnique="false" sMany="true"
	 *        sAnnotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='copy(reifiedRelationshipInstances = this.reifiedRelationshipInstances ++ s)'"
	 * @generated
	 */
	DescriptionBox withReifiedRelationshipInstances(EList<ReifiedRelationshipInstance> s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" sUnique="false" sMany="true"
	 *        sAnnotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='copy(reifiedRelationshipInstanceDomains = this.reifiedRelationshipInstanceDomains ++ s)'"
	 * @generated
	 */
	DescriptionBox withReifiedRelationshipInstanceDomains(EList<ReifiedRelationshipInstanceDomain> s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" sUnique="false" sMany="true"
	 *        sAnnotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='copy(reifiedRelationshipInstanceRanges = this.reifiedRelationshipInstanceRanges ++ s)'"
	 * @generated
	 */
	DescriptionBox withReifiedRelationshipInstanceRanges(EList<ReifiedRelationshipInstanceRange> s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" sUnique="false" sMany="true"
	 *        sAnnotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='copy(unreifiedRelationshipInstanceTuples = this.unreifiedRelationshipInstanceTuples ++ s)'"
	 * @generated
	 */
	DescriptionBox withUnreifiedRelationshipInstanceTuples(EList<UnreifiedRelationshipInstanceTuple> s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" sUnique="false" sMany="true"
	 *        sAnnotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='copy(dataStructureTuples = this.dataStructureTuples ++ s)'"
	 * @generated
	 */
	DescriptionBox withDataStructureTuples(EList<DataStructureTuple> s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" sUnique="false" sMany="true"
	 *        sAnnotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='copy(scalarDataPropertyValues = this.scalarDataPropertyValues ++ s)'"
	 * @generated
	 */
	DescriptionBox withScalarDataPropertyValues(EList<ScalarDataPropertyValue> s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" sUnique="false" sMany="true"
	 *        sAnnotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='copy(structuredDataPropertyValues = this.structuredDataPropertyValues ++ s)'"
	 * @generated
	 */
	DescriptionBox withStructuredDataPropertyValues(EList<StructuredDataPropertyValue> s);

} // DescriptionBox
