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
 * A representation of the model object '<em><b>Terminology Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML TerminologyBox is an OML Module for defining a domain-specific vocabulary
 * as a logical set of OML TerminologyBoxStatement(s),
 * possibly by reuse of other vocabularies via OML TerminologyBoxAxiom(s).
 * The semantics of an OML TerminologyBox domain-specific vocabulary is defined
 * by the mapping to [OWL2-DL] of the other vocabularies it reuses, if any, and
 * that of its OML TerminologyBoxAxiom(s) and OML TerminologyBoxStatement(s)
 * according to its OML TerminologyGraphKind.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.TerminologyBox#getKind <em>Kind</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.TerminologyBox#getTerminologyBoxAxioms <em>Terminology Box Axioms</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.TerminologyBox#getBoxStatements <em>Box Statements</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.EcorePackage#getTerminologyBox()
 * @model abstract="true"
 * @generated
 */
public interface TerminologyBox extends Module {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link jpl.imce.oml.specification.ecore.TerminologyGraphKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see jpl.imce.oml.specification.ecore.TerminologyGraphKind
	 * @see #setKind(TerminologyGraphKind)
	 * @see jpl.imce.oml.specification.ecore.EcorePackage#getTerminologyBox_Kind()
	 * @model unique="false" required="true"
	 * @generated
	 */
	TerminologyGraphKind getKind();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.TerminologyBox#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see jpl.imce.oml.specification.ecore.TerminologyGraphKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(TerminologyGraphKind value);

	/**
	 * Returns the value of the '<em><b>Terminology Box Axioms</b></em>' containment reference list.
	 * The list contents are of type {@link jpl.imce.oml.specification.ecore.TerminologyBoxAxiom}.
	 * It is bidirectional and its opposite is '{@link jpl.imce.oml.specification.ecore.TerminologyBoxAxiom#getTbox <em>Tbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TerminologyBoxAxioms asserted in this TerminologyBox
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Terminology Box Axioms</em>' containment reference list.
	 * @see jpl.imce.oml.specification.ecore.EcorePackage#getTerminologyBox_TerminologyBoxAxioms()
	 * @see jpl.imce.oml.specification.ecore.TerminologyBoxAxiom#getTbox
	 * @model opposite="tbox" containment="true"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<TerminologyBoxAxiom> getTerminologyBoxAxioms();

	/**
	 * Returns the value of the '<em><b>Box Statements</b></em>' containment reference list.
	 * The list contents are of type {@link jpl.imce.oml.specification.ecore.TerminologyBoxStatement}.
	 * It is bidirectional and its opposite is '{@link jpl.imce.oml.specification.ecore.TerminologyBoxStatement#getTbox <em>Tbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TerminologyBoxStatements asserted in this TerminologyBox
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Box Statements</em>' containment reference list.
	 * @see jpl.imce.oml.specification.ecore.EcorePackage#getTerminologyBox_BoxStatements()
	 * @see jpl.imce.oml.specification.ecore.TerminologyBoxStatement#getTbox
	 * @model opposite="tbox" containment="true"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<TerminologyBoxStatement> getBoxStatements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" sUnique="false" sMany="true"
	 *        sAnnotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	TerminologyBox withBoxStatements(EList<TerminologyBoxStatement> s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The subset of statements that are entities.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='boxStatements.selectByKindOf { case e: Entity => e }'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<Entity> entities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The subset of statements that are aspects.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='boxStatements.selectByKindOf { case a: Aspect => a }'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<Aspect> aspects();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The subset of statements that are concepts.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='boxStatements.selectByKindOf { case c: Concept => c }'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<Concept> concepts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The subset of statements that are reified relationships.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='boxStatements.selectByKindOf { case rr: ReifiedRelationship => rr }'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<ReifiedRelationship> reifiedRelationships();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The subset of statements that are unreified relationships.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='boxStatements.selectByKindOf { case ur: UnreifiedRelationship => ur }'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<UnreifiedRelationship> unreifiedRelationships();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The subset of statements that are data relationships.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='boxStatements.selectByKindOf { case dr: DataRelationship => dr }'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<DataRelationship> dataRelationships();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A map for the subset of statements that are
	 * entity scalar data property terms indexed by their uuid.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='boxStatements.selectByKindOf { case dp: EntityScalarDataProperty => dp }'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<EntityScalarDataProperty> entityScalarDataProperties();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A map for the subset of statements that are
	 * data range terms indexed by their uuid.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='boxStatements.selectByKindOf { case dr: DataRange => dr }'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<DataRange> dataranges();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A map for the subset of statements that are
	 * scalar datatype terms indexed by their uuid.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='boxStatements.selectByKindOf { case s: Scalar => s }'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<Scalar> scalars();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A map for the subset of statements that are
	 * structured datatype terms indexed by their uuid.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='boxStatements.selectByKindOf { case s: Structure => s }'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<Structure> structures();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The subset of axioms about terms.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='boxStatements.selectByKindOf { case tx: TermAxiom => tx }'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<TermAxiom> termAxioms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='scala.collection.immutable.SortedSet.empty[resolver.api.TerminologyThing] ++ boxStatements + this'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<TerminologyThing> everything();

} // TerminologyBox
