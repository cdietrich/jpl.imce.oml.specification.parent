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
 * An OML TerminologyExtent defines an in-memory tuple
 * about each OML Module involved in modeling and reasoning about domain-specific
 * vocabularies and systems descriptions using such vocabularies:
 * - An OML TerminologyGraph for defining a vocabulary about a domain or a description of a system in a domain;
 * - An OML Bundle for aggregating OML TerminologyBox(es) for as modular [OWL2-DL Ontologies] for monotonic refinement and reasoning;
 * - An OML DescriptionBox for describing actual systems according to one or more domain-specific OML TerminologyBox vocabularies.
 */
trait TerminologyExtent
{

  val annotationProperties: scala.collection.immutable.SortedSet[AnnotationProperty]
  val terminologyGraphs: scala.collection.immutable.SortedSet[TerminologyGraph]
  val bundles: scala.collection.immutable.SortedSet[Bundle]
  val descriptions: scala.collection.immutable.SortedSet[DescriptionBox]
}
