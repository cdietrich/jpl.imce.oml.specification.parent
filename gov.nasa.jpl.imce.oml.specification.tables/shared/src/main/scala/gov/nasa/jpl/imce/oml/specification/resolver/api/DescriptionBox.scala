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
 * An OML DescriptionBox maps to an [OWL2-DL Ontology]
 * about [OWL2-DL NamedIndividuals] mapped from OML TerminologyInstanceAssertion(s).
 */
trait DescriptionBox
  extends Context
{

  val kind: gov.nasa.jpl.imce.oml.specification.tables.DescriptionKind
  val closedWorldDefinitions: scala.collection.immutable.SortedSet[DescriptionBoxExtendsClosedWorldDefinitions]
  val descriptionBoxRefinements: scala.collection.immutable.SortedSet[DescriptionBoxRefinement]
  val conceptInstances: scala.collection.immutable.SortedSet[ConceptInstance]
  val reifiedRelationshipInstances: scala.collection.immutable.SortedSet[ReifiedRelationshipInstance]
  val reifiedRelationshipInstanceDomains: scala.collection.immutable.SortedSet[ReifiedRelationshipInstanceDomain]
  val reifiedRelationshipInstanceRanges: scala.collection.immutable.SortedSet[ReifiedRelationshipInstanceRange]
  val unreifiedRelationshipInstanceTuples: scala.collection.immutable.SortedSet[UnreifiedRelationshipInstanceTuple]

  override def entities
  (): scala.collection.immutable.SortedSet[Entity]
  override def aspects
  (): scala.collection.immutable.SortedSet[Aspect]
  override def concepts
  (): scala.collection.immutable.SortedSet[Concept]
  override def reifiedRelationships
  (): scala.collection.immutable.SortedSet[ReifiedRelationship]
  override def unreifiedRelationships
  (): scala.collection.immutable.SortedSet[UnreifiedRelationship]
  override def dataRelationships
  (): scala.collection.immutable.SortedSet[DataRelationship]
  override def entityScalarDataProperties
  (): scala.collection.immutable.SortedSet[EntityScalarDataProperty]
  override def dataranges
  (): scala.collection.immutable.SortedSet[DataRange]
  override def scalars
  (): scala.collection.immutable.SortedSet[Scalar]
  override def structures
  (): scala.collection.immutable.SortedSet[Structure]
  override def termAxioms
  (): scala.collection.immutable.SortedSet[TermAxiom]
  override def everything
  (): scala.collection.immutable.SortedSet[TerminologyThing]
}
