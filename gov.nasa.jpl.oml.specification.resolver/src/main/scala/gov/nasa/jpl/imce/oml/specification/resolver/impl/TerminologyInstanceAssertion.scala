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

trait TerminologyInstanceAssertion
extends resolver.api.TerminologyInstanceAssertion
  with TerminologyThing
  with Resource
{
  /*
   * The UUID of a Term is a Version5 namespace UUID based on the term's IRI.
   */
  def calculateUUID
  ()
  : java.util.UUID
  = {
    <XMemberFeatureCallImplCustom>.toString/* default */
  }
  
  override def iri
  ()
  : gov.nasa.jpl.imce.oml.specification.tables.IRI
  = {
    descriptionBox.iri + "#" + name
  }
  
  def name
  ()
  : gov.nasa.jpl.imce.oml.specification.tables.LocalName
  = {
    getName()
  }
  

  override def canEqual(that: scala.Any): scala.Boolean = that match {
  	case _: TerminologyInstanceAssertion => true
  	case _ => false
  }
}
