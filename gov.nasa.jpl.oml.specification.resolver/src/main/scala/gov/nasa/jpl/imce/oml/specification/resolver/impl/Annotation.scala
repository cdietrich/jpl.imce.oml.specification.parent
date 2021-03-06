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

case class Annotation private[impl] 
(
 override val module: resolver.api.Module,
 override val subject: resolver.api.TerminologyThing,
 override val property: resolver.api.AnnotationProperty,
 override val value: scala.Predef.String
)
extends resolver.api.Annotation
{



  override val hashCode
  : scala.Int
  = (module, subject, property, value).##

  override def equals(other: scala.Any): scala.Boolean = other match {
	  case that: Annotation =>
	    (that canEqual this) &&
	    (this.module == that.module) &&
	    (this.subject == that.subject) &&
	    (this.property == that.property) &&
	    (this.value == that.value)

	  case _ =>
	    false
  }
}
