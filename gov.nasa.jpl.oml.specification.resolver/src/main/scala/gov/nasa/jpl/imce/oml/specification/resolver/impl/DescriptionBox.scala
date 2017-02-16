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

case class DescriptionBox private[impl] 
(
 override val descriptionExtent: resolver.api.TerminologyExtent,
 override val closedWorldDefinitions: scala.collection.immutable.SortedSet[resolver.api.DescriptionBoxExtendsClosedWorldDefinitions],
 override val kind: gov.nasa.jpl.imce.oml.specification.tables.DescriptionKind,
 override val iri: gov.nasa.jpl.imce.oml.specification.tables.IRI,
 override val annotations: scala.collection.immutable.SortedSet[resolver.api.Annotation],
 override val conceptInstances: scala.collection.immutable.SortedSet[resolver.api.ConceptInstance],
 override val descriptionBoxRefinements: scala.collection.immutable.SortedSet[resolver.api.DescriptionBoxRefinement],
 override val reifiedRelationshipInstanceDomains: scala.collection.immutable.SortedSet[resolver.api.ReifiedRelationshipInstanceDomain],
 override val reifiedRelationshipInstanceRanges: scala.collection.immutable.SortedSet[resolver.api.ReifiedRelationshipInstanceRange],
 override val reifiedRelationshipInstances: scala.collection.immutable.SortedSet[resolver.api.ReifiedRelationshipInstance],
 override val unreifiedRelationshipInstanceTuples: scala.collection.immutable.SortedSet[resolver.api.UnreifiedRelationshipInstanceTuple]
)
extends resolver.api.DescriptionBox
  with Module
{
  override def withAnnotations
  (a: scala.collection.immutable.SortedSet[resolver.api.AnnotationPropertyTable])
  : resolver.api.DescriptionBox
  = {
    copy(annotations = this.annotations ++ resolver.convertToAnnotations(a))
  }
  
  override def annotationsByProperty
  ()
  : scala.collection.immutable.SortedSet[resolver.api.AnnotationPropertyTable]
  = {
    resolver.groupAnnotationsByProperty(annotations)
  }
  
  def extent
  ()
  : resolver.api.TerminologyExtent
  = {
    descriptionExtent
  }
  
  override def entities
  ()
  : scala.collection.immutable.SortedSet[resolver.api.Entity]
  = {
    scala.collection.immutable.SortedSet.empty[resolver.api.Entity]
  }
  
  override def aspects
  ()
  : scala.collection.immutable.SortedSet[resolver.api.Aspect]
  = {
    scala.collection.immutable.SortedSet.empty[resolver.api.Aspect]
  }
  
  override def concepts
  ()
  : scala.collection.immutable.SortedSet[resolver.api.Concept]
  = {
    scala.collection.immutable.SortedSet.empty[resolver.api.Concept]
  }
  
  override def reifiedRelationships
  ()
  : scala.collection.immutable.SortedSet[resolver.api.ReifiedRelationship]
  = {
    scala.collection.immutable.SortedSet.empty[resolver.api.ReifiedRelationship]
  }
  
  override def unreifiedRelationships
  ()
  : scala.collection.immutable.SortedSet[resolver.api.UnreifiedRelationship]
  = {
    scala.collection.immutable.SortedSet.empty[resolver.api.UnreifiedRelationship]
  }
  
  override def dataRelationships
  ()
  : scala.collection.immutable.SortedSet[resolver.api.DataRelationship]
  = {
    scala.collection.immutable.SortedSet.empty[resolver.api.DataRelationship]
  }
  
  override def entityScalarDataProperties
  ()
  : scala.collection.immutable.SortedSet[resolver.api.EntityScalarDataProperty]
  = {
    scala.collection.immutable.SortedSet.empty[resolver.api.EntityScalarDataProperty]
  }
  
  override def dataranges
  ()
  : scala.collection.immutable.SortedSet[resolver.api.DataRange]
  = {
    scala.collection.immutable.SortedSet.empty[resolver.api.DataRange]
  }
  
  override def scalars
  ()
  : scala.collection.immutable.SortedSet[resolver.api.Scalar]
  = {
    scala.collection.immutable.SortedSet.empty[resolver.api.Scalar]
  }
  
  override def structures
  ()
  : scala.collection.immutable.SortedSet[resolver.api.Structure]
  = {
    scala.collection.immutable.SortedSet.empty[resolver.api.Structure]
  }
  
  override def termAxioms
  ()
  : scala.collection.immutable.SortedSet[resolver.api.TermAxiom]
  = {
    scala.collection.immutable.SortedSet.empty[resolver.api.TermAxiom]
  }
  
  override def everything
  ()
  : scala.collection.immutable.SortedSet[resolver.api.TerminologyThing]
  = {
    scala.collection.immutable.SortedSet.empty[resolver.api.TerminologyThing] ++ 
    	conceptInstances ++
    	reifiedRelationshipInstances ++ 
    	reifiedRelationshipInstanceDomains ++ 
    	reifiedRelationshipInstanceRanges ++ 
    	unreifiedRelationshipInstanceTuples
  }
  

  override val uuid
  : java.util.UUID
  = {
    calculateUUID()
  }
  


  override def canEqual(that: scala.Any): scala.Boolean = that match {
  	case _: DescriptionBox => true
  	case _ => false
  }

  override val hashCode
  : scala.Int
  = (uuid, descriptionExtent, closedWorldDefinitions, kind, iri, annotations, conceptInstances, descriptionBoxRefinements, reifiedRelationshipInstanceDomains, reifiedRelationshipInstanceRanges, reifiedRelationshipInstances, unreifiedRelationshipInstanceTuples).##

  override def equals(other: scala.Any): scala.Boolean = other match {
	  case that: DescriptionBox =>
	    (that canEqual this) &&
	    (this.uuid == that.uuid) &&
	    (this.descriptionExtent == that.descriptionExtent) &&
	    (this.closedWorldDefinitions == that.closedWorldDefinitions) &&
	    (this.kind == that.kind) &&
	    (this.iri == that.iri) &&
	    (this.annotations == that.annotations) &&
	    (this.conceptInstances == that.conceptInstances) &&
	    (this.descriptionBoxRefinements == that.descriptionBoxRefinements) &&
	    (this.reifiedRelationshipInstanceDomains == that.reifiedRelationshipInstanceDomains) &&
	    (this.reifiedRelationshipInstanceRanges == that.reifiedRelationshipInstanceRanges) &&
	    (this.reifiedRelationshipInstances == that.reifiedRelationshipInstances) &&
	    (this.unreifiedRelationshipInstanceTuples == that.unreifiedRelationshipInstanceTuples)

	  case _ =>
	    false
  }
}
