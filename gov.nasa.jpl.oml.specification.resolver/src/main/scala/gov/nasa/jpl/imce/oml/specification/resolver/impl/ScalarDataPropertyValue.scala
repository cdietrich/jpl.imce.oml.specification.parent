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

case class ScalarDataPropertyValue private[impl] 
(
 override val singletonInstance: resolver.api.SingletonInstance,
 override val scalarDataProperty: resolver.api.DataRelationshipToScalar,
 override val name: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
 override val scalarPropertyValue: scala.Predef.String
)
extends resolver.api.ScalarDataPropertyValue
  with TerminologyInstanceAssertion
{
  override def calculateUUID
  ()
  : java.util.UUID
  = {
    
    	val namespace = "ScalarDataPropertyValue(singletonInstance=" + singletonInstance.uuid + ",scalarDataProperty="+scalarDataProperty.calculateUUID()+")"
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
  	case _: ScalarDataPropertyValue => true
  	case _ => false
  }

  override val hashCode
  : scala.Int
  = (uuid, singletonInstance, scalarDataProperty, name, scalarPropertyValue).##

  override def equals(other: scala.Any): scala.Boolean = other match {
	  case that: ScalarDataPropertyValue =>
	    (that canEqual this) &&
	    (this.uuid == that.uuid) &&
	    (this.singletonInstance == that.singletonInstance) &&
	    (this.scalarDataProperty == that.scalarDataProperty) &&
	    (this.name == that.name) &&
	    (this.scalarPropertyValue == that.scalarPropertyValue)

	  case _ =>
	    false
  }
}
