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

case class BinaryScalarRestriction private[impl] 
(
 override val tbox: resolver.api.TerminologyBox,
 override val restrictedRange: resolver.api.DataRange,
 override val length: scala.Option[scala.Int],
 override val minLength: scala.Option[scala.Int],
 override val maxLength: scala.Option[scala.Int],
 override val name: gov.nasa.jpl.imce.oml.specification.tables.LocalName
)
extends resolver.api.BinaryScalarRestriction
  with RestrictedDataRange
{
  override def calculateUUID
  ()
  : java.util.UUID
  = {
    
    	val namespace = "BinaryScalarRestriction(restrictedRange="+restrictedRange.uuid+")"
    	com.fasterxml.uuid.Generators.nameBasedGenerator(com.fasterxml.uuid.impl.NameBasedGenerator.NAMESPACE_URL).generate(namespace)
  }
  

  override val uuid
  : java.util.UUID
  = {
    calculateUUID()
  }
  


  override def canEqual(that: scala.Any): scala.Boolean = that match {
  	case _: BinaryScalarRestriction => true
  	case _ => false
  }

  override val hashCode
  : scala.Int
  = (uuid, tbox, restrictedRange, length, minLength, maxLength, name).##

  override def equals(other: scala.Any): scala.Boolean = other match {
	  case that: BinaryScalarRestriction =>
	    (that canEqual this) &&
	    (this.uuid == that.uuid) &&
	    (this.tbox == that.tbox) &&
	    (this.restrictedRange == that.restrictedRange) &&
	    (this.length == that.length) &&
	    (this.minLength == that.minLength) &&
	    (this.maxLength == that.maxLength) &&
	    (this.name == that.name)

	  case _ =>
	    false
  }
}
