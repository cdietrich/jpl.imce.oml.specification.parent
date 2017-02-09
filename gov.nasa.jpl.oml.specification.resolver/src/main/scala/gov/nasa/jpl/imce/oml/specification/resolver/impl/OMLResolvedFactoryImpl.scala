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

case class OMLResolvedFactoryImpl() extends resolver.api.OMLResolvedFactory {
	
  // Annotation
  
  def createAnnotation
  ( terminology: TerminologyBox,
    subject: TerminologyThing,
    property: AnnotationProperty,
    value: scala.Predef.String)
  : resolver.api.Annotation
  = resolver.impl.Annotation(
    terminology,
    subject,
    property,
    value )
  
  // AnnotationEntry
  
  def createAnnotationEntry
  ( terminology: TerminologyBox,
    subject: TerminologyThing,
    value: scala.Predef.String)
  : resolver.api.AnnotationEntry
  = resolver.impl.AnnotationEntry(
    terminology,
    subject,
    value )
  
  // AnnotationProperty
  
  def createAnnotationProperty
  ( iri: gov.nasa.jpl.imce.oml.specification.tables.IRI,
    abbrevIRI: gov.nasa.jpl.imce.oml.specification.tables.AbbrevIRI)
  : resolver.api.AnnotationProperty
  = resolver.impl.AnnotationProperty(
    iri,
    abbrevIRI )
  
  // AnnotationPropertyTable
  
  def createAnnotationPropertyTable
  ( key: AnnotationProperty,
    value: scala.collection.immutable.SortedSet[AnnotationEntry])
  : resolver.api.AnnotationPropertyTable
  = resolver.impl.AnnotationPropertyTable(
    key,
    value )
  
  // AnonymousConceptTaxonomyAxiom
  
  def createAnonymousConceptTaxonomyAxiom
  ( uuid: java.util.UUID,
    bundle: Bundle,
    disjointTaxonomyParent: ConceptTreeDisjunction)
  : resolver.api.AnonymousConceptTaxonomyAxiom
  = resolver.impl.AnonymousConceptTaxonomyAxiom(
    uuid,
    bundle,
    disjointTaxonomyParent )
  
  // Aspect
  
  def createAspect
  ( graph: TerminologyBox,
    uuid: java.util.UUID,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.Aspect
  = resolver.impl.Aspect(
    graph,
    uuid,
    name )
  
  // AspectSpecializationAxiom
  
  def createAspectSpecializationAxiom
  ( graph: TerminologyBox,
    uuid: java.util.UUID,
    subEntity: Entity,
    superAspect: Aspect)
  : resolver.api.AspectSpecializationAxiom
  = resolver.impl.AspectSpecializationAxiom(
    graph,
    uuid,
    subEntity,
    superAspect )
  
  // BinaryScalarRestriction
  
  def createBinaryScalarRestriction
  ( graph: TerminologyBox,
    uuid: java.util.UUID,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
    length: scala.Option[scala.Int],
    maxLength: scala.Option[scala.Int],
    minLength: scala.Option[scala.Int],
    restrictedRange: DataRange)
  : resolver.api.BinaryScalarRestriction
  = resolver.impl.BinaryScalarRestriction(
    graph,
    uuid,
    name,
    length,
    maxLength,
    minLength,
    restrictedRange )
  
  // Bundle
  
  def createBundle
  ( uuid: java.util.UUID,
    kind: gov.nasa.jpl.imce.oml.specification.tables.TerminologyGraphKind,
    iri: gov.nasa.jpl.imce.oml.specification.tables.IRI,
    annotations: scala.collection.immutable.SortedSet[Annotation],
    boxStatements: scala.collection.immutable.SortedSet[TerminologyBoxStatement],
    bundleExtent: TerminologyExtent,
    bundleStatements: scala.collection.immutable.SortedSet[TerminologyBundleStatement],
    terminologyBoxAxioms: scala.collection.immutable.SortedSet[TerminologyBoxAxiom],
    terminologyBundleAxioms: scala.collection.immutable.SortedSet[TerminologyBundleAxiom])
  : resolver.api.Bundle
  = resolver.impl.Bundle(
    uuid,
    kind,
    iri,
    annotations,
    boxStatements,
    bundleExtent,
    bundleStatements,
    terminologyBoxAxioms,
    terminologyBundleAxioms )
  
  // BundledTerminologyAxiom
  
  def createBundledTerminologyAxiom
  ( uuid: java.util.UUID,
    bundledTerminology: TerminologyBox,
    terminologyBundle: Bundle)
  : resolver.api.BundledTerminologyAxiom
  = resolver.impl.BundledTerminologyAxiom(
    uuid,
    bundledTerminology,
    terminologyBundle )
  
  def copyBundledTerminologyAxiom_bundledTerminology
  ( that: resolver.api.BundledTerminologyAxiom,
    bundledTerminology: TerminologyBox )
  : resolver.api.BundledTerminologyAxiom
  = that match {
  	case x: resolver.impl.BundledTerminologyAxiom =>
  	  x.copy(bundledTerminology = bundledTerminology)
  }
  
  def copyBundledTerminologyAxiom_terminologyBundle
  ( that: resolver.api.BundledTerminologyAxiom,
    terminologyBundle: Bundle )
  : resolver.api.BundledTerminologyAxiom
  = that match {
  	case x: resolver.impl.BundledTerminologyAxiom =>
  	  x.copy(terminologyBundle = terminologyBundle)
  }
  
  // Concept
  
  def createConcept
  ( graph: TerminologyBox,
    uuid: java.util.UUID,
    isAbstract: scala.Boolean,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.Concept
  = resolver.impl.Concept(
    graph,
    uuid,
    isAbstract,
    name )
  
  // ConceptDesignationTerminologyAxiom
  
  def createConceptDesignationTerminologyAxiom
  ( uuid: java.util.UUID,
    terminology: TerminologyBox,
    designatedConcept: Concept,
    designatedTerminology: TerminologyBox)
  : resolver.api.ConceptDesignationTerminologyAxiom
  = resolver.impl.ConceptDesignationTerminologyAxiom(
    uuid,
    terminology,
    designatedConcept,
    designatedTerminology )
  
  def copyConceptDesignationTerminologyAxiom_terminology
  ( that: resolver.api.ConceptDesignationTerminologyAxiom,
    terminology: TerminologyBox )
  : resolver.api.ConceptDesignationTerminologyAxiom
  = that match {
  	case x: resolver.impl.ConceptDesignationTerminologyAxiom =>
  	  x.copy(terminology = terminology)
  }
  
  def copyConceptDesignationTerminologyAxiom_designatedTerminology
  ( that: resolver.api.ConceptDesignationTerminologyAxiom,
    designatedTerminology: TerminologyBox )
  : resolver.api.ConceptDesignationTerminologyAxiom
  = that match {
  	case x: resolver.impl.ConceptDesignationTerminologyAxiom =>
  	  x.copy(designatedTerminology = designatedTerminology)
  }
  
  // ConceptSpecializationAxiom
  
  def createConceptSpecializationAxiom
  ( graph: TerminologyBox,
    uuid: java.util.UUID,
    subConcept: Concept,
    superConcept: Concept)
  : resolver.api.ConceptSpecializationAxiom
  = resolver.impl.ConceptSpecializationAxiom(
    graph,
    uuid,
    subConcept,
    superConcept )
  
  // EntityExistentialRestrictionAxiom
  
  def createEntityExistentialRestrictionAxiom
  ( graph: TerminologyBox,
    uuid: java.util.UUID,
    restrictedDomain: Entity,
    restrictedRange: Entity,
    restrictedRelation: ReifiedRelationship)
  : resolver.api.EntityExistentialRestrictionAxiom
  = resolver.impl.EntityExistentialRestrictionAxiom(
    graph,
    uuid,
    restrictedDomain,
    restrictedRange,
    restrictedRelation )
  
  // EntityScalarDataProperty
  
  def createEntityScalarDataProperty
  ( graph: TerminologyBox,
    uuid: java.util.UUID,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
    domain: Entity,
    range: DataRange)
  : resolver.api.EntityScalarDataProperty
  = resolver.impl.EntityScalarDataProperty(
    graph,
    uuid,
    name,
    domain,
    range )
  
  // EntityScalarDataPropertyExistentialRestrictionAxiom
  
  def createEntityScalarDataPropertyExistentialRestrictionAxiom
  ( graph: TerminologyBox,
    uuid: java.util.UUID,
    restrictedEntity: Entity,
    scalarProperty: EntityScalarDataProperty,
    scalarRestriction: DataRange)
  : resolver.api.EntityScalarDataPropertyExistentialRestrictionAxiom
  = resolver.impl.EntityScalarDataPropertyExistentialRestrictionAxiom(
    graph,
    uuid,
    restrictedEntity,
    scalarProperty,
    scalarRestriction )
  
  // EntityScalarDataPropertyParticularRestrictionAxiom
  
  def createEntityScalarDataPropertyParticularRestrictionAxiom
  ( graph: TerminologyBox,
    uuid: java.util.UUID,
    literalValue: gov.nasa.jpl.imce.oml.specification.tables.LexicalValue,
    restrictedEntity: Entity,
    scalarProperty: EntityScalarDataProperty)
  : resolver.api.EntityScalarDataPropertyParticularRestrictionAxiom
  = resolver.impl.EntityScalarDataPropertyParticularRestrictionAxiom(
    graph,
    uuid,
    literalValue,
    restrictedEntity,
    scalarProperty )
  
  // EntityScalarDataPropertyUniversalRestrictionAxiom
  
  def createEntityScalarDataPropertyUniversalRestrictionAxiom
  ( graph: TerminologyBox,
    uuid: java.util.UUID,
    restrictedEntity: Entity,
    scalarProperty: EntityScalarDataProperty,
    scalarRestriction: DataRange)
  : resolver.api.EntityScalarDataPropertyUniversalRestrictionAxiom
  = resolver.impl.EntityScalarDataPropertyUniversalRestrictionAxiom(
    graph,
    uuid,
    restrictedEntity,
    scalarProperty,
    scalarRestriction )
  
  // EntityStructuredDataProperty
  
  def createEntityStructuredDataProperty
  ( graph: TerminologyBox,
    uuid: java.util.UUID,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
    domain: Entity,
    range: Structure)
  : resolver.api.EntityStructuredDataProperty
  = resolver.impl.EntityStructuredDataProperty(
    graph,
    uuid,
    name,
    domain,
    range )
  
  // EntityUniversalRestrictionAxiom
  
  def createEntityUniversalRestrictionAxiom
  ( graph: TerminologyBox,
    uuid: java.util.UUID,
    restrictedDomain: Entity,
    restrictedRange: Entity,
    restrictedRelation: ReifiedRelationship)
  : resolver.api.EntityUniversalRestrictionAxiom
  = resolver.impl.EntityUniversalRestrictionAxiom(
    graph,
    uuid,
    restrictedDomain,
    restrictedRange,
    restrictedRelation )
  
  // IRIScalarRestriction
  
  def createIRIScalarRestriction
  ( graph: TerminologyBox,
    uuid: java.util.UUID,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
    length: scala.Option[scala.Int],
    maxLength: scala.Option[scala.Int],
    minLength: scala.Option[scala.Int],
    pattern: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.Pattern],
    restrictedRange: DataRange)
  : resolver.api.IRIScalarRestriction
  = resolver.impl.IRIScalarRestriction(
    graph,
    uuid,
    name,
    length,
    maxLength,
    minLength,
    pattern,
    restrictedRange )
  
  // NumericScalarRestriction
  
  def createNumericScalarRestriction
  ( graph: TerminologyBox,
    uuid: java.util.UUID,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
    maxExclusive: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.LexicalNumber],
    maxInclusive: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.LexicalNumber],
    minExclusive: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.LexicalNumber],
    minInclusive: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.LexicalNumber],
    restrictedRange: DataRange)
  : resolver.api.NumericScalarRestriction
  = resolver.impl.NumericScalarRestriction(
    graph,
    uuid,
    name,
    maxExclusive,
    maxInclusive,
    minExclusive,
    minInclusive,
    restrictedRange )
  
  // PlainLiteralScalarRestriction
  
  def createPlainLiteralScalarRestriction
  ( graph: TerminologyBox,
    uuid: java.util.UUID,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
    language: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.Language],
    length: scala.Option[scala.Int],
    maxLength: scala.Option[scala.Int],
    minLength: scala.Option[scala.Int],
    pattern: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.Pattern],
    restrictedRange: DataRange)
  : resolver.api.PlainLiteralScalarRestriction
  = resolver.impl.PlainLiteralScalarRestriction(
    graph,
    uuid,
    name,
    language,
    length,
    maxLength,
    minLength,
    pattern,
    restrictedRange )
  
  // ReifiedRelationship
  
  def createReifiedRelationship
  ( graph: TerminologyBox,
    uuid: java.util.UUID,
    isAbstract: scala.Boolean,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
    unreifiedPropertyName: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
    unreifiedInversePropertyName: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.LocalName],
    isAsymmetric: scala.Boolean,
    isEssential: scala.Boolean,
    isFunctional: scala.Boolean,
    isInverseEssential: scala.Boolean,
    isInverseFunctional: scala.Boolean,
    isIrreflexive: scala.Boolean,
    isReflexive: scala.Boolean,
    isSymmetric: scala.Boolean,
    isTransitive: scala.Boolean,
    source: Entity,
    target: Entity)
  : resolver.api.ReifiedRelationship
  = resolver.impl.ReifiedRelationship(
    graph,
    uuid,
    isAbstract,
    name,
    unreifiedPropertyName,
    unreifiedInversePropertyName,
    isAsymmetric,
    isEssential,
    isFunctional,
    isInverseEssential,
    isInverseFunctional,
    isIrreflexive,
    isReflexive,
    isSymmetric,
    isTransitive,
    source,
    target )
  
  // ReifiedRelationshipSpecializationAxiom
  
  def createReifiedRelationshipSpecializationAxiom
  ( graph: TerminologyBox,
    uuid: java.util.UUID,
    subRelationship: ReifiedRelationship,
    superRelationship: ReifiedRelationship)
  : resolver.api.ReifiedRelationshipSpecializationAxiom
  = resolver.impl.ReifiedRelationshipSpecializationAxiom(
    graph,
    uuid,
    subRelationship,
    superRelationship )
  
  // RootConceptTaxonomyAxiom
  
  def createRootConceptTaxonomyAxiom
  ( uuid: java.util.UUID,
    bundle: Bundle,
    root: Concept)
  : resolver.api.RootConceptTaxonomyAxiom
  = resolver.impl.RootConceptTaxonomyAxiom(
    uuid,
    bundle,
    root )
  
  // Scalar
  
  def createScalar
  ( graph: TerminologyBox,
    uuid: java.util.UUID,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.Scalar
  = resolver.impl.Scalar(
    graph,
    uuid,
    name )
  
  // ScalarDataProperty
  
  def createScalarDataProperty
  ( graph: TerminologyBox,
    uuid: java.util.UUID,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
    domain: Structure,
    range: DataRange)
  : resolver.api.ScalarDataProperty
  = resolver.impl.ScalarDataProperty(
    graph,
    uuid,
    name,
    domain,
    range )
  
  // ScalarOneOfLiteralAxiom
  
  def createScalarOneOfLiteralAxiom
  ( graph: TerminologyBox,
    uuid: java.util.UUID,
    axiom: ScalarOneOfRestriction,
    value: gov.nasa.jpl.imce.oml.specification.tables.LexicalValue)
  : resolver.api.ScalarOneOfLiteralAxiom
  = resolver.impl.ScalarOneOfLiteralAxiom(
    graph,
    uuid,
    axiom,
    value )
  
  // ScalarOneOfRestriction
  
  def createScalarOneOfRestriction
  ( graph: TerminologyBox,
    uuid: java.util.UUID,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
    restrictedRange: DataRange)
  : resolver.api.ScalarOneOfRestriction
  = resolver.impl.ScalarOneOfRestriction(
    graph,
    uuid,
    name,
    restrictedRange )
  
  // SpecificDisjointConceptAxiom
  
  def createSpecificDisjointConceptAxiom
  ( uuid: java.util.UUID,
    bundle: Bundle,
    disjointLeaf: Concept,
    disjointTaxonomyParent: ConceptTreeDisjunction)
  : resolver.api.SpecificDisjointConceptAxiom
  = resolver.impl.SpecificDisjointConceptAxiom(
    uuid,
    bundle,
    disjointLeaf,
    disjointTaxonomyParent )
  
  // StringScalarRestriction
  
  def createStringScalarRestriction
  ( graph: TerminologyBox,
    uuid: java.util.UUID,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
    length: scala.Option[scala.Int],
    maxLength: scala.Option[scala.Int],
    minLength: scala.Option[scala.Int],
    pattern: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.Pattern],
    restrictedRange: DataRange)
  : resolver.api.StringScalarRestriction
  = resolver.impl.StringScalarRestriction(
    graph,
    uuid,
    name,
    length,
    maxLength,
    minLength,
    pattern,
    restrictedRange )
  
  // Structure
  
  def createStructure
  ( graph: TerminologyBox,
    uuid: java.util.UUID,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.Structure
  = resolver.impl.Structure(
    graph,
    uuid,
    name )
  
  // StructuredDataProperty
  
  def createStructuredDataProperty
  ( graph: TerminologyBox,
    uuid: java.util.UUID,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
    domain: Structure,
    range: Structure)
  : resolver.api.StructuredDataProperty
  = resolver.impl.StructuredDataProperty(
    graph,
    uuid,
    name,
    domain,
    range )
  
  // SynonymScalarRestriction
  
  def createSynonymScalarRestriction
  ( graph: TerminologyBox,
    uuid: java.util.UUID,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
    restrictedRange: DataRange)
  : resolver.api.SynonymScalarRestriction
  = resolver.impl.SynonymScalarRestriction(
    graph,
    uuid,
    name,
    restrictedRange )
  
  // TerminologyExtensionAxiom
  
  def createTerminologyExtensionAxiom
  ( uuid: java.util.UUID,
    terminology: TerminologyBox,
    extendedTerminology: TerminologyBox)
  : resolver.api.TerminologyExtensionAxiom
  = resolver.impl.TerminologyExtensionAxiom(
    uuid,
    terminology,
    extendedTerminology )
  
  def copyTerminologyExtensionAxiom_terminology
  ( that: resolver.api.TerminologyExtensionAxiom,
    terminology: TerminologyBox )
  : resolver.api.TerminologyExtensionAxiom
  = that match {
  	case x: resolver.impl.TerminologyExtensionAxiom =>
  	  x.copy(terminology = terminology)
  }
  
  def copyTerminologyExtensionAxiom_extendedTerminology
  ( that: resolver.api.TerminologyExtensionAxiom,
    extendedTerminology: TerminologyBox )
  : resolver.api.TerminologyExtensionAxiom
  = that match {
  	case x: resolver.impl.TerminologyExtensionAxiom =>
  	  x.copy(extendedTerminology = extendedTerminology)
  }
  
  // TerminologyExtent
  
  def createTerminologyExtent
  ( annotationProperties: scala.collection.immutable.SortedSet[AnnotationProperty],
    bundles: scala.collection.immutable.SortedSet[Bundle],
    terminologyGraphs: scala.collection.immutable.SortedSet[TerminologyGraph])
  : resolver.api.TerminologyExtent
  = resolver.impl.TerminologyExtent(
    annotationProperties,
    bundles,
    terminologyGraphs )
  
  def copyTerminologyExtent_annotationProperties
  ( that: resolver.api.TerminologyExtent,
    annotationProperties: scala.collection.immutable.SortedSet[AnnotationProperty] )
  : resolver.api.TerminologyExtent
  = that match {
  	case x: resolver.impl.TerminologyExtent =>
  	  x.copy(annotationProperties = annotationProperties)
  }
  
  def copyTerminologyExtent_bundles
  ( that: resolver.api.TerminologyExtent,
    bundles: scala.collection.immutable.SortedSet[Bundle] )
  : resolver.api.TerminologyExtent
  = that match {
  	case x: resolver.impl.TerminologyExtent =>
  	  x.copy(bundles = bundles)
  }
  
  def copyTerminologyExtent_terminologyGraphs
  ( that: resolver.api.TerminologyExtent,
    terminologyGraphs: scala.collection.immutable.SortedSet[TerminologyGraph] )
  : resolver.api.TerminologyExtent
  = that match {
  	case x: resolver.impl.TerminologyExtent =>
  	  x.copy(terminologyGraphs = terminologyGraphs)
  }
  
  // TerminologyGraph
  
  def createTerminologyGraph
  ( uuid: java.util.UUID,
    kind: gov.nasa.jpl.imce.oml.specification.tables.TerminologyGraphKind,
    iri: gov.nasa.jpl.imce.oml.specification.tables.IRI,
    annotations: scala.collection.immutable.SortedSet[Annotation],
    boxStatements: scala.collection.immutable.SortedSet[TerminologyBoxStatement],
    graphExtent: TerminologyExtent,
    terminologyBoxAxioms: scala.collection.immutable.SortedSet[TerminologyBoxAxiom])
  : resolver.api.TerminologyGraph
  = resolver.impl.TerminologyGraph(
    uuid,
    kind,
    iri,
    annotations,
    boxStatements,
    graphExtent,
    terminologyBoxAxioms )
  
  // TerminologyNestingAxiom
  
  def createTerminologyNestingAxiom
  ( uuid: java.util.UUID,
    terminology: TerminologyBox,
    nestingContext: Concept,
    nestingTerminology: TerminologyBox)
  : resolver.api.TerminologyNestingAxiom
  = resolver.impl.TerminologyNestingAxiom(
    uuid,
    terminology,
    nestingContext,
    nestingTerminology )
  
  def copyTerminologyNestingAxiom_terminology
  ( that: resolver.api.TerminologyNestingAxiom,
    terminology: TerminologyBox )
  : resolver.api.TerminologyNestingAxiom
  = that match {
  	case x: resolver.impl.TerminologyNestingAxiom =>
  	  x.copy(terminology = terminology)
  }
  
  def copyTerminologyNestingAxiom_nestingTerminology
  ( that: resolver.api.TerminologyNestingAxiom,
    nestingTerminology: TerminologyBox )
  : resolver.api.TerminologyNestingAxiom
  = that match {
  	case x: resolver.impl.TerminologyNestingAxiom =>
  	  x.copy(nestingTerminology = nestingTerminology)
  }
  
  // TimeScalarRestriction
  
  def createTimeScalarRestriction
  ( graph: TerminologyBox,
    uuid: java.util.UUID,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
    maxExclusive: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.LexicalTime],
    maxInclusive: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.LexicalTime],
    minExclusive: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.LexicalTime],
    minInclusive: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.LexicalTime],
    restrictedRange: DataRange)
  : resolver.api.TimeScalarRestriction
  = resolver.impl.TimeScalarRestriction(
    graph,
    uuid,
    name,
    maxExclusive,
    maxInclusive,
    minExclusive,
    minInclusive,
    restrictedRange )
  
  // UnreifiedRelationship
  
  def createUnreifiedRelationship
  ( graph: TerminologyBox,
    uuid: java.util.UUID,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
    isAsymmetric: scala.Boolean,
    isEssential: scala.Boolean,
    isFunctional: scala.Boolean,
    isInverseEssential: scala.Boolean,
    isInverseFunctional: scala.Boolean,
    isIrreflexive: scala.Boolean,
    isReflexive: scala.Boolean,
    isSymmetric: scala.Boolean,
    isTransitive: scala.Boolean,
    source: Entity,
    target: Entity)
  : resolver.api.UnreifiedRelationship
  = resolver.impl.UnreifiedRelationship(
    graph,
    uuid,
    name,
    isAsymmetric,
    isEssential,
    isFunctional,
    isInverseEssential,
    isInverseFunctional,
    isIrreflexive,
    isReflexive,
    isSymmetric,
    isTransitive,
    source,
    target )
  
}
