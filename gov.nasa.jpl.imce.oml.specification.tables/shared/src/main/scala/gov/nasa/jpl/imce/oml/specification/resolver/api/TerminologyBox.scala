/*
 * Copyright 2016 California Institute of Technology ("Caltech").
 * U.S. Government sponsorship acknowledged.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * License Terms
 */

package gov.nasa.jpl.imce.oml.specification.resolver.api

/*
 * An OML TerminologyBox is an OML Context for defining a domain-specific vocabulary
 * as a logical set of OML TerminologyBoxStatement(s),
 * possibly by reuse of other vocabularies via OML TerminologyBoxAxiom(s).
 * The semantics of an OML TerminologyBox domain-specific vocabulary is defined
 * by the mapping to [OWL2-DL] of the other vocabularies it reuses, if any, and
 * that of its OML TerminologyBoxAxiom(s) and OML TerminologyBoxStatement(s)
 * according to its OML TerminologyGraphKind.
 */
trait TerminologyBox
  extends Context
{

  val kind: gov.nasa.jpl.imce.oml.specification.tables.TerminologyGraphKind
  /*
   * The TerminologyBoxAxioms asserted in this TerminologyBox
   */
  val terminologyBoxAxioms: scala.collection.immutable.SortedSet[TerminologyBoxAxiom]
  /*
   * The TerminologyBoxStatements asserted in this TerminologyBox
   */
  val boxStatements: scala.collection.immutable.SortedSet[TerminologyBoxStatement]

  def withBoxStatements
  (s: scala.collection.immutable.SortedSet[TerminologyBoxStatement]): TerminologyBox
  /*
   * The subset of statements that are entities.
   */
  override def entities
  (): scala.collection.immutable.SortedSet[Entity]
  /*
   * The subset of statements that are aspects.
   */
  override def aspects
  (): scala.collection.immutable.SortedSet[Aspect]
  /*
   * The subset of statements that are concepts.
   */
  override def concepts
  (): scala.collection.immutable.SortedSet[Concept]
  /*
   * The subset of statements that are reified relationships.
   */
  override def reifiedRelationships
  (): scala.collection.immutable.SortedSet[ReifiedRelationship]
  /*
   * The subset of statements that are unreified relationships.
   */
  override def unreifiedRelationships
  (): scala.collection.immutable.SortedSet[UnreifiedRelationship]
  /*
   * The subset of statements that are data relationships.
   */
  override def dataRelationships
  (): scala.collection.immutable.SortedSet[DataRelationship]
  /*
   * A map for the subset of statements that are
   * entity scalar data property terms indexed by their uuid.
   */
  override def entityScalarDataProperties
  (): scala.collection.immutable.SortedSet[EntityScalarDataProperty]
  /*
   * A map for the subset of statements that are
   * data range terms indexed by their uuid.
   */
  override def dataranges
  (): scala.collection.immutable.SortedSet[DataRange]
  /*
   * A map for the subset of statements that are
   * scalar datatype terms indexed by their uuid.
   */
  override def scalars
  (): scala.collection.immutable.SortedSet[Scalar]
  /*
   * A map for the subset of statements that are
   * structured datatype terms indexed by their uuid.
   */
  override def structures
  (): scala.collection.immutable.SortedSet[Structure]
  /*
   * The subset of axioms about terms.
   */
  override def termAxioms
  (): scala.collection.immutable.SortedSet[TermAxiom]
  override def everything
  (): scala.collection.immutable.SortedSet[TerminologyThing]
}
