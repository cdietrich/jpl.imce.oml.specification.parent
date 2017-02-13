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
 * An OML Context maps to an [OWL2-DL Ontology];
 * it is a kind of OML Resource that is a logical container of OML TerminologyThing(s)
 * and a non-logical container of OML Annotation(s).
 */
trait Context
  extends TerminologyThing
  with Resource
{

  override val iri: gov.nasa.jpl.imce.oml.specification.tables.IRI
  val annotations: scala.collection.immutable.SortedSet[Annotation]

  def extent
  (): TerminologyExtent
  def calculateUUID
  (): java.util.UUID
  def nsPrefix
  (): resolver.api.NamespacePrefix
  def name
  (): gov.nasa.jpl.imce.oml.specification.tables.LocalName
  def annotationsByProperty
  (): scala.collection.immutable.SortedSet[AnnotationPropertyTable]
  def withAnnotations
  (a: scala.collection.immutable.SortedSet[AnnotationPropertyTable]): Context
}
