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

case class StructuredDataPropertyValue private[impl] 
(
 override val singletonInstance: resolver.api.SingletonInstance,
 override val structuredDataProperty: resolver.api.DataRelationshipToStructure,
 override val structuredPropertyTuple: resolver.api.DataStructureTuple,
 override val name: gov.nasa.jpl.imce.oml.specification.tables.LocalName
)
extends resolver.api.StructuredDataPropertyValue
  with TerminologyInstanceAssertion
{
  override def calculateUUID
  ()
  : java.util.UUID
  = {
    
    	val namespace = "StructuredDataPropertyValue(singletonInstance=" + singletonInstance.uuid + ",structuredDataProperty="+structuredDataProperty.calculateUUID()+ ",structuredPropertyTuple="+structuredPropertyTuple.uuid+")"
    	com.fasterxml.uuid.Generators.nameBasedGenerator(com.fasterxml.uuid.impl.NameBasedGenerator.NAMESPACE_URL).generate(namespace)
  }
  
  def descriptionBox
  ()
  : resolver.api.DescriptionBox
  = {
    singletonInstance.descriptionBox()
  }
  

  override val uuid
  : java.util.UUID
  = {
    calculateUUID()
  }
  


  override def canEqual(that: scala.Any): scala.Boolean = that match {
  	case _: StructuredDataPropertyValue => true
  	case _ => false
  }

  override val hashCode
  : scala.Int
  = (uuid, singletonInstance, structuredDataProperty, structuredPropertyTuple, name).##

  override def equals(other: scala.Any): scala.Boolean = other match {
	  case that: StructuredDataPropertyValue =>
	    (that canEqual this) &&
	    (this.uuid == that.uuid) &&
	    (this.singletonInstance == that.singletonInstance) &&
	    (this.structuredDataProperty == that.structuredDataProperty) &&
	    (this.structuredPropertyTuple == that.structuredPropertyTuple) &&
	    (this.name == that.name)

	  case _ =>
	    false
  }
}
