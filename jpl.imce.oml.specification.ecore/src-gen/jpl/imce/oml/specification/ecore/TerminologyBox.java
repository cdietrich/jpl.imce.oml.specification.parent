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
 * A representation of the model object '<em><b>Terminology Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML TerminologyBox is a logical set of OML TerminologyBoxStatements defining the vocabulary
 * for a domain, possibly by reuse of other vocabularies via OML TerminologyBoxAxioms.
 * The semantics of an OML TerminologyBox domain-specific vocabulary is defined
 * by the mapping to [OWL2-DL] of the other vocabularies it reuses, if any, and
 * that of its OML TerminologyBoxAxioms and OML TerminologyBoxStatements
 * according to its OML TerminologyGraphKind.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.TerminologyBox#getIri <em>Iri</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.TerminologyBox#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.TerminologyBox#getKind <em>Kind</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.TerminologyBox#getTerminologyBoxAxioms <em>Terminology Box Axioms</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.TerminologyBox#getBoxStatements <em>Box Statements</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getTerminologyBox()
 * @model abstract="true"
 * @generated
 */
public interface TerminologyBox extends TerminologyThing, Resource {
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
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getTerminologyBox_Iri()
	 * @model unique="false" id="true" dataType="jpl.imce.oml.specification.ecore.IRI" required="true"
	 * @generated
	 */
	String getIri();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.TerminologyBox#getIri <em>Iri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iri</em>' attribute.
	 * @see #getIri()
	 * @generated
	 */
	void setIri(String value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link jpl.imce.oml.specification.ecore.Annotation}.
	 * It is bidirectional and its opposite is '{@link jpl.imce.oml.specification.ecore.Annotation#getTerminology <em>Terminology</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getTerminologyBox_Annotations()
	 * @see jpl.imce.oml.specification.ecore.Annotation#getTerminology
	 * @model opposite="terminology" containment="true"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<Annotation> getAnnotations();

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
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getTerminologyBox_Kind()
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
	 * It is bidirectional and its opposite is '{@link jpl.imce.oml.specification.ecore.TerminologyBoxAxiom#getTerminology <em>Terminology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TerminologyBoxAxioms asserted in this TerminologyBox
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Terminology Box Axioms</em>' containment reference list.
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getTerminologyBox_TerminologyBoxAxioms()
	 * @see jpl.imce.oml.specification.ecore.TerminologyBoxAxiom#getTerminology
	 * @model opposite="terminology" containment="true"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<TerminologyBoxAxiom> getTerminologyBoxAxioms();

	/**
	 * Returns the value of the '<em><b>Box Statements</b></em>' containment reference list.
	 * The list contents are of type {@link jpl.imce.oml.specification.ecore.TerminologyBoxStatement}.
	 * It is bidirectional and its opposite is '{@link jpl.imce.oml.specification.ecore.TerminologyBoxStatement#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TerminologyBoxStatements asserted in this TerminologyBox
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Box Statements</em>' containment reference list.
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getTerminologyBox_BoxStatements()
	 * @see jpl.imce.oml.specification.ecore.TerminologyBoxStatement#getGraph
	 * @model opposite="graph" containment="true"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<TerminologyBoxStatement> getBoxStatements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true"
	 * @generated
	 */
	TerminologyExtent extent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="jpl.imce.oml.specification.ecore.UUID" unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%com.fasterxml.uuid.impl.NameBasedGenerator%> _nameBasedGenerator = <%com.fasterxml.uuid.Generators%>.nameBasedGenerator(<%com.fasterxml.uuid.impl.NameBasedGenerator%>.NAMESPACE_URL);\n<%java.lang.String%> _iri = this.iri();\n<%java.util.UUID%> _generate = _nameBasedGenerator.generate(_iri);\nreturn _generate.toString();'"
	 * @generated
	 */
	String calculateUUID();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="jpl.imce.oml.specification.ecore.IRI" unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getIri();'"
	 * @generated
	 */
	String iri();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="jpl.imce.oml.specification.ecore.NamespacePrefix" unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.lang.String%> _iri = this.getIri();\n<%java.lang.String%> _iri_1 = this.getIri();\nint _lastIndexOf = _iri_1.lastIndexOf(\"/\");\nint _plus = (1 + _lastIndexOf);\nreturn _iri.substring(_plus);'"
	 * @generated
	 */
	String nsPrefix();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="jpl.imce.oml.specification.ecore.LocalName" unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.nsPrefix();'"
	 * @generated
	 */
	String name();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model mapType="jpl.imce.oml.specification.ecore.AnnotationSubjectTable<jpl.imce.oml.specification.ecore.TerminologyThing, jpl.imce.oml.specification.ecore.AnnotationSubjectPropertyValue>"
	 * @generated
	 */
	EMap<TerminologyThing, EList<AnnotationSubjectPropertyValue>> annotationsBySubject();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model mapType="jpl.imce.oml.specification.ecore.AnnotationPropertyTable<jpl.imce.oml.specification.ecore.AnnotationProperty, jpl.imce.oml.specification.ecore.AnnotationEntry>"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EMap<AnnotationProperty, EList<AnnotationEntry>> annotationsByProperty();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" aMapType="jpl.imce.oml.specification.ecore.AnnotationPropertyTable<jpl.imce.oml.specification.ecore.AnnotationProperty, jpl.imce.oml.specification.ecore.AnnotationEntry>"
	 *        aAnnotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	TerminologyBox withAnnotations(EMap<AnnotationProperty, EList<AnnotationEntry>> a);

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
