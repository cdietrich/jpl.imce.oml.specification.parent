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

package gov.nasa.jpl.imce.oml.specification.resolver.impl

import gov.nasa.jpl.imce.oml.specification._

trait TerminologyBox
extends resolver.api.TerminologyBox
  with Module
{
  /*
   * The subset of statements that are entities.
   */
  override def entities
  ()
  : scala.collection.immutable.SortedSet[Entity]
  = {
    boxStatements.selectByKindOf { case e: Entity => e }
  }
  
  /*
   * The subset of statements that are aspects.
   */
  override def aspects
  ()
  : scala.collection.immutable.SortedSet[Aspect]
  = {
    boxStatements.selectByKindOf { case a: Aspect => a }
  }
  
  /*
   * The subset of statements that are concepts.
   */
  override def concepts
  ()
  : scala.collection.immutable.SortedSet[Concept]
  = {
    boxStatements.selectByKindOf { case c: Concept => c }
  }
  
  /*
   * The subset of statements that are reified relationships.
   */
  override def reifiedRelationships
  ()
  : scala.collection.immutable.SortedSet[ReifiedRelationship]
  = {
    boxStatements.selectByKindOf { case rr: ReifiedRelationship => rr }
  }
  
  /*
   * The subset of statements that are unreified relationships.
   */
  override def unreifiedRelationships
  ()
  : scala.collection.immutable.SortedSet[UnreifiedRelationship]
  = {
    boxStatements.selectByKindOf { case ur: UnreifiedRelationship => ur }
  }
  
  /*
   * The subset of statements that are data relationships.
   */
  override def dataRelationships
  ()
  : scala.collection.immutable.SortedSet[DataRelationship]
  = {
    boxStatements.selectByKindOf { case dr: DataRelationship => dr }
  }
  
  /*
   * A map for the subset of statements that are
   * entity scalar data property terms indexed by their uuid.
   */
  override def entityScalarDataProperties
  ()
  : scala.collection.immutable.SortedSet[EntityScalarDataProperty]
  = {
    boxStatements.selectByKindOf { case dp: EntityScalarDataProperty => dp }
  }
  
  /*
   * A map for the subset of statements that are
   * data range terms indexed by their uuid.
   */
  override def dataranges
  ()
  : scala.collection.immutable.SortedSet[DataRange]
  = {
    boxStatements.selectByKindOf { case dr: DataRange => dr }
  }
  
  /*
   * A map for the subset of statements that are
   * scalar datatype terms indexed by their uuid.
   */
  override def scalars
  ()
  : scala.collection.immutable.SortedSet[Scalar]
  = {
    boxStatements.selectByKindOf { case s: Scalar => s }
  }
  
  /*
   * A map for the subset of statements that are
   * structured datatype terms indexed by their uuid.
   */
  override def structures
  ()
  : scala.collection.immutable.SortedSet[Structure]
  = {
    boxStatements.selectByKindOf { case s: Structure => s }
  }
  
  /*
   * The subset of axioms about terms.
   */
  override def termAxioms
  ()
  : scala.collection.immutable.SortedSet[TermAxiom]
  = {
    boxStatements.selectByKindOf { case tx: TermAxiom => tx }
  }
  
  override def everything
  ()
  : scala.collection.immutable.SortedSet[TerminologyThing]
  = {
    scala.collection.immutable.SortedSet.empty[resolver.api.TerminologyThing] ++ boxStatements + this
  }
  

  override def canEqual(that: scala.Any): scala.Boolean = that match {
  	case _: TerminologyBox => true
  	case _ => false
  }
}
