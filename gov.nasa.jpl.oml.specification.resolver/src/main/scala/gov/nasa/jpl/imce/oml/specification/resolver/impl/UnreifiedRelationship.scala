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

case class UnreifiedRelationship private[impl] 
(
 override val graph: TerminologyBox,
 override val uuid: java.util.UUID,
 override val name: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
 override val isAsymmetric: scala.Boolean,
 override val isEssential: scala.Boolean,
 override val isFunctional: scala.Boolean,
 override val isInverseEssential: scala.Boolean,
 override val isInverseFunctional: scala.Boolean,
 override val isIrreflexive: scala.Boolean,
 override val isReflexive: scala.Boolean,
 override val isSymmetric: scala.Boolean,
 override val isTransitive: scala.Boolean,
 override val source: Entity,
 override val target: Entity
)
extends resolver.api.UnreifiedRelationship
  with EntityRelationship
{

  override def canEqual(that: scala.Any): scala.Boolean = that match {
  	case _: UnreifiedRelationship => true
  	case _ => false
  }

  override val hashCode
  : scala.Int
  = (graph, uuid, name, isAsymmetric, isEssential, isFunctional, isInverseEssential, isInverseFunctional, isIrreflexive, isReflexive, isSymmetric, isTransitive, source, target).##

  override def equals(other: scala.Any): scala.Boolean = other match {
	  case that: UnreifiedRelationship =>
	    (that canEqual this) &&
	    (this.graph == that.graph) &&
	    (this.uuid == that.uuid) &&
	    (this.name == that.name) &&
	    (this.isAsymmetric == that.isAsymmetric) &&
	    (this.isEssential == that.isEssential) &&
	    (this.isFunctional == that.isFunctional) &&
	    (this.isInverseEssential == that.isInverseEssential) &&
	    (this.isInverseFunctional == that.isInverseFunctional) &&
	    (this.isIrreflexive == that.isIrreflexive) &&
	    (this.isReflexive == that.isReflexive) &&
	    (this.isSymmetric == that.isSymmetric) &&
	    (this.isTransitive == that.isTransitive) &&
	    (this.source == that.source) &&
	    (this.target == that.target)

	  case _ =>
	    false
  }
}