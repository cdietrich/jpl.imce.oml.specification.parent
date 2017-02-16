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
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML DescriptionBox maps to an [OWL2-DL Ontology]
 * about [OWL2-DL NamedIndividuals] mapped from OML TerminologyInstanceAssertion(s).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.DescriptionBox#getKind <em>Kind</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.DescriptionBox#getDescriptionExtent <em>Description Extent</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.DescriptionBox#getClosedWorldDefinitions <em>Closed World Definitions</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.DescriptionBox#getDescriptionBoxRefinements <em>Description Box Refinements</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.DescriptionBox#getConceptInstances <em>Concept Instances</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.DescriptionBox#getReifiedRelationshipInstances <em>Reified Relationship Instances</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.DescriptionBox#getReifiedRelationshipInstanceDomains <em>Reified Relationship Instance Domains</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.DescriptionBox#getReifiedRelationshipInstanceRanges <em>Reified Relationship Instance Ranges</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.DescriptionBox#getUnreifiedRelationshipInstanceTuples <em>Unreified Relationship Instance Tuples</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getDescriptionBox()
 * @model
 * @generated
 */
public interface DescriptionBox extends Module {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link jpl.imce.oml.specification.ecore.DescriptionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see jpl.imce.oml.specification.ecore.DescriptionKind
	 * @see #setKind(DescriptionKind)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getDescriptionBox_Kind()
	 * @model unique="false" required="true"
	 * @generated
	 */
	DescriptionKind getKind();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.DescriptionBox#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see jpl.imce.oml.specification.ecore.DescriptionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(DescriptionKind value);

	/**
	 * Returns the value of the '<em><b>Description Extent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jpl.imce.oml.specification.ecore.TerminologyExtent#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Extent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Extent</em>' container reference.
	 * @see #setDescriptionExtent(TerminologyExtent)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getDescriptionBox_DescriptionExtent()
	 * @see jpl.imce.oml.specification.ecore.TerminologyExtent#getDescriptions
	 * @model opposite="descriptions" required="true" transient="false"
	 * @generated
	 */
	TerminologyExtent getDescriptionExtent();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.DescriptionBox#getDescriptionExtent <em>Description Extent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Extent</em>' container reference.
	 * @see #getDescriptionExtent()
	 * @generated
	 */
	void setDescriptionExtent(TerminologyExtent value);

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
	 * Returns the value of the '<em><b>Concept Instances</b></em>' containment reference list.
	 * The list contents are of type {@link jpl.imce.oml.specification.ecore.ConceptInstance}.
	 * It is bidirectional and its opposite is '{@link jpl.imce.oml.specification.ecore.ConceptInstance#getDescriptionBox <em>Description Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concept Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept Instances</em>' containment reference list.
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getDescriptionBox_ConceptInstances()
	 * @see jpl.imce.oml.specification.ecore.ConceptInstance#getDescriptionBox
	 * @model opposite="descriptionBox" containment="true"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<ConceptInstance> getConceptInstances();

	/**
	 * Returns the value of the '<em><b>Reified Relationship Instances</b></em>' containment reference list.
	 * The list contents are of type {@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstance}.
	 * It is bidirectional and its opposite is '{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstance#getDescriptionBox <em>Description Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reified Relationship Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reified Relationship Instances</em>' containment reference list.
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getDescriptionBox_ReifiedRelationshipInstances()
	 * @see jpl.imce.oml.specification.ecore.ReifiedRelationshipInstance#getDescriptionBox
	 * @model opposite="descriptionBox" containment="true"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<ReifiedRelationshipInstance> getReifiedRelationshipInstances();

	/**
	 * Returns the value of the '<em><b>Reified Relationship Instance Domains</b></em>' containment reference list.
	 * The list contents are of type {@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceDomain}.
	 * It is bidirectional and its opposite is '{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceDomain#getDescriptionBox <em>Description Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reified Relationship Instance Domains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reified Relationship Instance Domains</em>' containment reference list.
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getDescriptionBox_ReifiedRelationshipInstanceDomains()
	 * @see jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceDomain#getDescriptionBox
	 * @model opposite="descriptionBox" containment="true"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<ReifiedRelationshipInstanceDomain> getReifiedRelationshipInstanceDomains();

	/**
	 * Returns the value of the '<em><b>Reified Relationship Instance Ranges</b></em>' containment reference list.
	 * The list contents are of type {@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceRange}.
	 * It is bidirectional and its opposite is '{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceRange#getDescriptionBox <em>Description Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reified Relationship Instance Ranges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reified Relationship Instance Ranges</em>' containment reference list.
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getDescriptionBox_ReifiedRelationshipInstanceRanges()
	 * @see jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceRange#getDescriptionBox
	 * @model opposite="descriptionBox" containment="true"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<ReifiedRelationshipInstanceRange> getReifiedRelationshipInstanceRanges();

	/**
	 * Returns the value of the '<em><b>Unreified Relationship Instance Tuples</b></em>' containment reference list.
	 * The list contents are of type {@link jpl.imce.oml.specification.ecore.UnreifiedRelationshipInstanceTuple}.
	 * It is bidirectional and its opposite is '{@link jpl.imce.oml.specification.ecore.UnreifiedRelationshipInstanceTuple#getDescriptionBox <em>Description Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unreified Relationship Instance Tuples</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unreified Relationship Instance Tuples</em>' containment reference list.
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getDescriptionBox_UnreifiedRelationshipInstanceTuples()
	 * @see jpl.imce.oml.specification.ecore.UnreifiedRelationshipInstanceTuple#getDescriptionBox
	 * @model opposite="descriptionBox" containment="true"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<UnreifiedRelationshipInstanceTuple> getUnreifiedRelationshipInstanceTuples();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" aMapType="jpl.imce.oml.specification.ecore.AnnotationPropertyTable<jpl.imce.oml.specification.ecore.AnnotationProperty, jpl.imce.oml.specification.ecore.AnnotationEntry>"
	 *        aAnnotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='copy(annotations = this.annotations ++ resolver.convertToAnnotations(a))'"
	 * @generated
	 */
	DescriptionBox withAnnotations(EMap<AnnotationProperty, EList<AnnotationEntry>> a);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model mapType="jpl.imce.oml.specification.ecore.AnnotationPropertyTable<jpl.imce.oml.specification.ecore.AnnotationProperty, jpl.imce.oml.specification.ecore.AnnotationEntry>"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='resolver.groupAnnotationsByProperty(annotations)'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EMap<AnnotationProperty, EList<AnnotationEntry>> annotationsByProperty();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getDescriptionExtent();'"
	 * @generated
	 */
	TerminologyExtent extent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='scala.collection.immutable.SortedSet.empty[resolver.api.Entity]'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<Entity> entities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='scala.collection.immutable.SortedSet.empty[resolver.api.Aspect]'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<Aspect> aspects();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='scala.collection.immutable.SortedSet.empty[resolver.api.Concept]'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<Concept> concepts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='scala.collection.immutable.SortedSet.empty[resolver.api.ReifiedRelationship]'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<ReifiedRelationship> reifiedRelationships();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='scala.collection.immutable.SortedSet.empty[resolver.api.UnreifiedRelationship]'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<UnreifiedRelationship> unreifiedRelationships();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='scala.collection.immutable.SortedSet.empty[resolver.api.DataRelationship]'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<DataRelationship> dataRelationships();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='scala.collection.immutable.SortedSet.empty[resolver.api.EntityScalarDataProperty]'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<EntityScalarDataProperty> entityScalarDataProperties();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='scala.collection.immutable.SortedSet.empty[resolver.api.DataRange]'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<DataRange> dataranges();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='scala.collection.immutable.SortedSet.empty[resolver.api.Scalar]'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<Scalar> scalars();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='scala.collection.immutable.SortedSet.empty[resolver.api.Structure]'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<Structure> structures();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='scala.collection.immutable.SortedSet.empty[resolver.api.TermAxiom]'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<TermAxiom> termAxioms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='scala.collection.immutable.SortedSet.empty[resolver.api.TerminologyThing] ++ \n\tconceptInstances ++\n\treifiedRelationshipInstances ++ \n\treifiedRelationshipInstanceDomains ++ \n\treifiedRelationshipInstanceRanges ++ \n\tunreifiedRelationshipInstanceTuples'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<TerminologyThing> everything();

} // DescriptionBox
