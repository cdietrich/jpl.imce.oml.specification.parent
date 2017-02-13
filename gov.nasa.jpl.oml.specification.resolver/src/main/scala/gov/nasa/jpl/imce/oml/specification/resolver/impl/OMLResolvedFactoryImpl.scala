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
  ( context: Context,
    subject: TerminologyThing,
    property: AnnotationProperty,
    value: scala.Predef.String)
  : resolver.api.Annotation
  = resolver.impl.Annotation(
    context,
    subject,
    property,
    value )
  
  // AnnotationEntry
  
  def createAnnotationEntry
  ( context: Context,
    subject: TerminologyThing,
    value: scala.Predef.String)
  : resolver.api.AnnotationEntry
  = resolver.impl.AnnotationEntry(
    context,
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
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.Aspect
  = resolver.impl.Aspect(
    uuid,
    tbox,
    name )
  
  // AspectSpecializationAxiom
  
  def createAspectSpecializationAxiom
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    superAspect: Aspect,
    subEntity: Entity)
  : resolver.api.AspectSpecializationAxiom
  = resolver.impl.AspectSpecializationAxiom(
    uuid,
    tbox,
    superAspect,
    subEntity )
  
  // BinaryScalarRestriction
  
  def createBinaryScalarRestriction
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    restrictedRange: DataRange,
    length: scala.Option[scala.Int],
    minLength: scala.Option[scala.Int],
    maxLength: scala.Option[scala.Int],
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.BinaryScalarRestriction
  = resolver.impl.BinaryScalarRestriction(
    uuid,
    tbox,
    restrictedRange,
    length,
    minLength,
    maxLength,
    name )
  
  // Bundle
  
  def createBundle
  ( uuid: java.util.UUID,
    kind: gov.nasa.jpl.imce.oml.specification.tables.TerminologyGraphKind,
    iri: gov.nasa.jpl.imce.oml.specification.tables.IRI,
    annotations: scala.collection.immutable.SortedSet[Annotation],
    boxStatements: scala.collection.immutable.SortedSet[TerminologyBoxStatement],
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
    bundleStatements,
    terminologyBoxAxioms,
    terminologyBundleAxioms )
  
  // BundledTerminologyAxiom
  
  def createBundledTerminologyAxiom
  ( uuid: java.util.UUID,
    terminologyBundle: Bundle,
    bundledTerminology: TerminologyBox)
  : resolver.api.BundledTerminologyAxiom
  = resolver.impl.BundledTerminologyAxiom(
    uuid,
    terminologyBundle,
    bundledTerminology )
  
  def copyBundledTerminologyAxiom_terminologyBundle
  ( that: resolver.api.BundledTerminologyAxiom,
    terminologyBundle: Bundle )
  : resolver.api.BundledTerminologyAxiom
  = that match {
  	case x: resolver.impl.BundledTerminologyAxiom =>
  	  x.copy(terminologyBundle = terminologyBundle)
  }
  
  def copyBundledTerminologyAxiom_bundledTerminology
  ( that: resolver.api.BundledTerminologyAxiom,
    bundledTerminology: TerminologyBox )
  : resolver.api.BundledTerminologyAxiom
  = that match {
  	case x: resolver.impl.BundledTerminologyAxiom =>
  	  x.copy(bundledTerminology = bundledTerminology)
  }
  
  // Concept
  
  def createConcept
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    isAbstract: scala.Boolean,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.Concept
  = resolver.impl.Concept(
    uuid,
    tbox,
    isAbstract,
    name )
  
  // ConceptDesignationTerminologyAxiom
  
  def createConceptDesignationTerminologyAxiom
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    designatedConcept: Concept,
    designatedTerminology: TerminologyBox)
  : resolver.api.ConceptDesignationTerminologyAxiom
  = resolver.impl.ConceptDesignationTerminologyAxiom(
    uuid,
    tbox,
    designatedConcept,
    designatedTerminology )
  
  def copyConceptDesignationTerminologyAxiom_tbox
  ( that: resolver.api.ConceptDesignationTerminologyAxiom,
    tbox: TerminologyBox )
  : resolver.api.ConceptDesignationTerminologyAxiom
  = that match {
  	case x: resolver.impl.ConceptDesignationTerminologyAxiom =>
  	  x.copy(tbox = tbox)
  }
  
  def copyConceptDesignationTerminologyAxiom_designatedTerminology
  ( that: resolver.api.ConceptDesignationTerminologyAxiom,
    designatedTerminology: TerminologyBox )
  : resolver.api.ConceptDesignationTerminologyAxiom
  = that match {
  	case x: resolver.impl.ConceptDesignationTerminologyAxiom =>
  	  x.copy(designatedTerminology = designatedTerminology)
  }
  
  // ConceptInstance
  
  def createConceptInstance
  ( uuid: java.util.UUID,
    descriptionBox: DescriptionBox,
    singletonConceptClassifier: Concept,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
    scalarDataPropertyValues: scala.collection.immutable.SortedSet[ScalarDataPropertyValue],
    structuredDataPropertyValues: scala.collection.immutable.SortedSet[StructuredDataPropertyValue])
  : resolver.api.ConceptInstance
  = resolver.impl.ConceptInstance(
    uuid,
    descriptionBox,
    singletonConceptClassifier,
    name,
    scalarDataPropertyValues,
    structuredDataPropertyValues )
  
  def copyConceptInstance_scalarDataPropertyValues
  ( that: resolver.api.ConceptInstance,
    scalarDataPropertyValues: scala.collection.immutable.SortedSet[ScalarDataPropertyValue] )
  : resolver.api.ConceptInstance
  = that match {
  	case x: resolver.impl.ConceptInstance =>
  	  x.copy(scalarDataPropertyValues = scalarDataPropertyValues)
  }
  
  def copyConceptInstance_structuredDataPropertyValues
  ( that: resolver.api.ConceptInstance,
    structuredDataPropertyValues: scala.collection.immutable.SortedSet[StructuredDataPropertyValue] )
  : resolver.api.ConceptInstance
  = that match {
  	case x: resolver.impl.ConceptInstance =>
  	  x.copy(structuredDataPropertyValues = structuredDataPropertyValues)
  }
  
  // ConceptSpecializationAxiom
  
  def createConceptSpecializationAxiom
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    superConcept: Concept,
    subConcept: Concept)
  : resolver.api.ConceptSpecializationAxiom
  = resolver.impl.ConceptSpecializationAxiom(
    uuid,
    tbox,
    superConcept,
    subConcept )
  
  // DataStructureTuple
  
  def createDataStructureTuple
  ( uuid: java.util.UUID,
    dataStructureType: Structure,
    structuredDataPropertyValue: StructuredDataPropertyValue,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
    scalarDataPropertyValues: scala.collection.immutable.SortedSet[ScalarDataPropertyValue],
    structuredDataPropertyValues: scala.collection.immutable.SortedSet[StructuredDataPropertyValue])
  : resolver.api.DataStructureTuple
  = resolver.impl.DataStructureTuple(
    uuid,
    dataStructureType,
    structuredDataPropertyValue,
    name,
    scalarDataPropertyValues,
    structuredDataPropertyValues )
  
  def copyDataStructureTuple_scalarDataPropertyValues
  ( that: resolver.api.DataStructureTuple,
    scalarDataPropertyValues: scala.collection.immutable.SortedSet[ScalarDataPropertyValue] )
  : resolver.api.DataStructureTuple
  = that match {
  	case x: resolver.impl.DataStructureTuple =>
  	  x.copy(scalarDataPropertyValues = scalarDataPropertyValues)
  }
  
  def copyDataStructureTuple_structuredDataPropertyValues
  ( that: resolver.api.DataStructureTuple,
    structuredDataPropertyValues: scala.collection.immutable.SortedSet[StructuredDataPropertyValue] )
  : resolver.api.DataStructureTuple
  = that match {
  	case x: resolver.impl.DataStructureTuple =>
  	  x.copy(structuredDataPropertyValues = structuredDataPropertyValues)
  }
  
  // DescriptionBox
  
  def createDescriptionBox
  ( uuid: java.util.UUID,
    closedWorldDefinitions: scala.collection.immutable.SortedSet[DescriptionBoxExtendsClosedWorldDefinitions],
    kind: gov.nasa.jpl.imce.oml.specification.tables.DescriptionKind,
    iri: gov.nasa.jpl.imce.oml.specification.tables.IRI,
    annotations: scala.collection.immutable.SortedSet[Annotation],
    conceptInstances: scala.collection.immutable.SortedSet[ConceptInstance],
    descriptionBoxRefinements: scala.collection.immutable.SortedSet[DescriptionBoxRefinement],
    reifiedRelationshipInstanceDomains: scala.collection.immutable.SortedSet[ReifiedRelationshipInstanceDomain],
    reifiedRelationshipInstanceRanges: scala.collection.immutable.SortedSet[ReifiedRelationshipInstanceRange],
    reifiedRelationshipInstances: scala.collection.immutable.SortedSet[ReifiedRelationshipInstance],
    unreifiedRelationshipInstanceTuples: scala.collection.immutable.SortedSet[UnreifiedRelationshipInstanceTuple])
  : resolver.api.DescriptionBox
  = resolver.impl.DescriptionBox(
    uuid,
    closedWorldDefinitions,
    kind,
    iri,
    annotations,
    conceptInstances,
    descriptionBoxRefinements,
    reifiedRelationshipInstanceDomains,
    reifiedRelationshipInstanceRanges,
    reifiedRelationshipInstances,
    unreifiedRelationshipInstanceTuples )
  
  def copyDescriptionBox_closedWorldDefinitions
  ( that: resolver.api.DescriptionBox,
    closedWorldDefinitions: scala.collection.immutable.SortedSet[DescriptionBoxExtendsClosedWorldDefinitions] )
  : resolver.api.DescriptionBox
  = that match {
  	case x: resolver.impl.DescriptionBox =>
  	  x.copy(closedWorldDefinitions = closedWorldDefinitions)
  }
  
  def copyDescriptionBox_conceptInstances
  ( that: resolver.api.DescriptionBox,
    conceptInstances: scala.collection.immutable.SortedSet[ConceptInstance] )
  : resolver.api.DescriptionBox
  = that match {
  	case x: resolver.impl.DescriptionBox =>
  	  x.copy(conceptInstances = conceptInstances)
  }
  
  def copyDescriptionBox_descriptionBoxRefinements
  ( that: resolver.api.DescriptionBox,
    descriptionBoxRefinements: scala.collection.immutable.SortedSet[DescriptionBoxRefinement] )
  : resolver.api.DescriptionBox
  = that match {
  	case x: resolver.impl.DescriptionBox =>
  	  x.copy(descriptionBoxRefinements = descriptionBoxRefinements)
  }
  
  def copyDescriptionBox_reifiedRelationshipInstanceDomains
  ( that: resolver.api.DescriptionBox,
    reifiedRelationshipInstanceDomains: scala.collection.immutable.SortedSet[ReifiedRelationshipInstanceDomain] )
  : resolver.api.DescriptionBox
  = that match {
  	case x: resolver.impl.DescriptionBox =>
  	  x.copy(reifiedRelationshipInstanceDomains = reifiedRelationshipInstanceDomains)
  }
  
  def copyDescriptionBox_reifiedRelationshipInstanceRanges
  ( that: resolver.api.DescriptionBox,
    reifiedRelationshipInstanceRanges: scala.collection.immutable.SortedSet[ReifiedRelationshipInstanceRange] )
  : resolver.api.DescriptionBox
  = that match {
  	case x: resolver.impl.DescriptionBox =>
  	  x.copy(reifiedRelationshipInstanceRanges = reifiedRelationshipInstanceRanges)
  }
  
  def copyDescriptionBox_reifiedRelationshipInstances
  ( that: resolver.api.DescriptionBox,
    reifiedRelationshipInstances: scala.collection.immutable.SortedSet[ReifiedRelationshipInstance] )
  : resolver.api.DescriptionBox
  = that match {
  	case x: resolver.impl.DescriptionBox =>
  	  x.copy(reifiedRelationshipInstances = reifiedRelationshipInstances)
  }
  
  def copyDescriptionBox_unreifiedRelationshipInstanceTuples
  ( that: resolver.api.DescriptionBox,
    unreifiedRelationshipInstanceTuples: scala.collection.immutable.SortedSet[UnreifiedRelationshipInstanceTuple] )
  : resolver.api.DescriptionBox
  = that match {
  	case x: resolver.impl.DescriptionBox =>
  	  x.copy(unreifiedRelationshipInstanceTuples = unreifiedRelationshipInstanceTuples)
  }
  
  // DescriptionBoxExtendsClosedWorldDefinitions
  
  def createDescriptionBoxExtendsClosedWorldDefinitions
  ( uuid: java.util.UUID,
    descriptionBox: DescriptionBox,
    closedWorldDefinitions: TerminologyBox)
  : resolver.api.DescriptionBoxExtendsClosedWorldDefinitions
  = resolver.impl.DescriptionBoxExtendsClosedWorldDefinitions(
    uuid,
    descriptionBox,
    closedWorldDefinitions )
  
  // DescriptionBoxRefinement
  
  def createDescriptionBoxRefinement
  ( uuid: java.util.UUID,
    refiningDescriptionBox: DescriptionBox,
    refinedDescriptionBox: DescriptionBox)
  : resolver.api.DescriptionBoxRefinement
  = resolver.impl.DescriptionBoxRefinement(
    uuid,
    refiningDescriptionBox,
    refinedDescriptionBox )
  
  // EntityExistentialRestrictionAxiom
  
  def createEntityExistentialRestrictionAxiom
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    restrictedRelation: EntityRelationship,
    restrictedDomain: Entity,
    restrictedRange: Entity)
  : resolver.api.EntityExistentialRestrictionAxiom
  = resolver.impl.EntityExistentialRestrictionAxiom(
    uuid,
    tbox,
    restrictedRelation,
    restrictedDomain,
    restrictedRange )
  
  // EntityScalarDataProperty
  
  def createEntityScalarDataProperty
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    domain: Entity,
    range: DataRange,
    isIdentityCriteria: scala.Boolean,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.EntityScalarDataProperty
  = resolver.impl.EntityScalarDataProperty(
    uuid,
    tbox,
    domain,
    range,
    isIdentityCriteria,
    name )
  
  // EntityScalarDataPropertyExistentialRestrictionAxiom
  
  def createEntityScalarDataPropertyExistentialRestrictionAxiom
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    restrictedEntity: Entity,
    scalarProperty: EntityScalarDataProperty,
    scalarRestriction: DataRange)
  : resolver.api.EntityScalarDataPropertyExistentialRestrictionAxiom
  = resolver.impl.EntityScalarDataPropertyExistentialRestrictionAxiom(
    uuid,
    tbox,
    restrictedEntity,
    scalarProperty,
    scalarRestriction )
  
  // EntityScalarDataPropertyParticularRestrictionAxiom
  
  def createEntityScalarDataPropertyParticularRestrictionAxiom
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    restrictedEntity: Entity,
    scalarProperty: EntityScalarDataProperty,
    literalValue: gov.nasa.jpl.imce.oml.specification.tables.LexicalValue)
  : resolver.api.EntityScalarDataPropertyParticularRestrictionAxiom
  = resolver.impl.EntityScalarDataPropertyParticularRestrictionAxiom(
    uuid,
    tbox,
    restrictedEntity,
    scalarProperty,
    literalValue )
  
  // EntityScalarDataPropertyUniversalRestrictionAxiom
  
  def createEntityScalarDataPropertyUniversalRestrictionAxiom
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    restrictedEntity: Entity,
    scalarProperty: EntityScalarDataProperty,
    scalarRestriction: DataRange)
  : resolver.api.EntityScalarDataPropertyUniversalRestrictionAxiom
  = resolver.impl.EntityScalarDataPropertyUniversalRestrictionAxiom(
    uuid,
    tbox,
    restrictedEntity,
    scalarProperty,
    scalarRestriction )
  
  // EntityStructuredDataProperty
  
  def createEntityStructuredDataProperty
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    domain: Entity,
    range: Structure,
    isIdentityCriteria: scala.Boolean,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.EntityStructuredDataProperty
  = resolver.impl.EntityStructuredDataProperty(
    uuid,
    tbox,
    domain,
    range,
    isIdentityCriteria,
    name )
  
  // EntityUniversalRestrictionAxiom
  
  def createEntityUniversalRestrictionAxiom
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    restrictedRelation: EntityRelationship,
    restrictedDomain: Entity,
    restrictedRange: Entity)
  : resolver.api.EntityUniversalRestrictionAxiom
  = resolver.impl.EntityUniversalRestrictionAxiom(
    uuid,
    tbox,
    restrictedRelation,
    restrictedDomain,
    restrictedRange )
  
  // IRIScalarRestriction
  
  def createIRIScalarRestriction
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    restrictedRange: DataRange,
    length: scala.Option[scala.Int],
    minLength: scala.Option[scala.Int],
    maxLength: scala.Option[scala.Int],
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
    pattern: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.Pattern])
  : resolver.api.IRIScalarRestriction
  = resolver.impl.IRIScalarRestriction(
    uuid,
    tbox,
    restrictedRange,
    length,
    minLength,
    maxLength,
    name,
    pattern )
  
  // NumericScalarRestriction
  
  def createNumericScalarRestriction
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    restrictedRange: DataRange,
    minExclusive: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.LexicalNumber],
    minInclusive: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.LexicalNumber],
    maxExclusive: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.LexicalNumber],
    maxInclusive: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.LexicalNumber],
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.NumericScalarRestriction
  = resolver.impl.NumericScalarRestriction(
    uuid,
    tbox,
    restrictedRange,
    minExclusive,
    minInclusive,
    maxExclusive,
    maxInclusive,
    name )
  
  // PlainLiteralScalarRestriction
  
  def createPlainLiteralScalarRestriction
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    restrictedRange: DataRange,
    length: scala.Option[scala.Int],
    minLength: scala.Option[scala.Int],
    maxLength: scala.Option[scala.Int],
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
    langRange: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.LangRange],
    pattern: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.Pattern])
  : resolver.api.PlainLiteralScalarRestriction
  = resolver.impl.PlainLiteralScalarRestriction(
    uuid,
    tbox,
    restrictedRange,
    length,
    minLength,
    maxLength,
    name,
    langRange,
    pattern )
  
  // ReifiedRelationship
  
  def createReifiedRelationship
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    source: Entity,
    target: Entity,
    isAbstract: scala.Boolean,
    isAsymmetric: scala.Boolean,
    isEssential: scala.Boolean,
    isFunctional: scala.Boolean,
    isInverseEssential: scala.Boolean,
    isInverseFunctional: scala.Boolean,
    isIrreflexive: scala.Boolean,
    isReflexive: scala.Boolean,
    isSymmetric: scala.Boolean,
    isTransitive: scala.Boolean,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
    unreifiedPropertyName: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
    unreifiedInversePropertyName: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.LocalName])
  : resolver.api.ReifiedRelationship
  = resolver.impl.ReifiedRelationship(
    uuid,
    tbox,
    source,
    target,
    isAbstract,
    isAsymmetric,
    isEssential,
    isFunctional,
    isInverseEssential,
    isInverseFunctional,
    isIrreflexive,
    isReflexive,
    isSymmetric,
    isTransitive,
    name,
    unreifiedPropertyName,
    unreifiedInversePropertyName )
  
  // ReifiedRelationshipInstance
  
  def createReifiedRelationshipInstance
  ( uuid: java.util.UUID,
    descriptionBox: DescriptionBox,
    singletonReifiedRelationshipClassifier: ReifiedRelationship,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
    scalarDataPropertyValues: scala.collection.immutable.SortedSet[ScalarDataPropertyValue],
    structuredDataPropertyValues: scala.collection.immutable.SortedSet[StructuredDataPropertyValue])
  : resolver.api.ReifiedRelationshipInstance
  = resolver.impl.ReifiedRelationshipInstance(
    uuid,
    descriptionBox,
    singletonReifiedRelationshipClassifier,
    name,
    scalarDataPropertyValues,
    structuredDataPropertyValues )
  
  def copyReifiedRelationshipInstance_scalarDataPropertyValues
  ( that: resolver.api.ReifiedRelationshipInstance,
    scalarDataPropertyValues: scala.collection.immutable.SortedSet[ScalarDataPropertyValue] )
  : resolver.api.ReifiedRelationshipInstance
  = that match {
  	case x: resolver.impl.ReifiedRelationshipInstance =>
  	  x.copy(scalarDataPropertyValues = scalarDataPropertyValues)
  }
  
  def copyReifiedRelationshipInstance_structuredDataPropertyValues
  ( that: resolver.api.ReifiedRelationshipInstance,
    structuredDataPropertyValues: scala.collection.immutable.SortedSet[StructuredDataPropertyValue] )
  : resolver.api.ReifiedRelationshipInstance
  = that match {
  	case x: resolver.impl.ReifiedRelationshipInstance =>
  	  x.copy(structuredDataPropertyValues = structuredDataPropertyValues)
  }
  
  // ReifiedRelationshipInstanceDomain
  
  def createReifiedRelationshipInstanceDomain
  ( uuid: java.util.UUID,
    descriptionBox: DescriptionBox,
    reifiedRelationshipInstance: ReifiedRelationshipInstance,
    domain: ConceptualEntitySingletonInstance,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.ReifiedRelationshipInstanceDomain
  = resolver.impl.ReifiedRelationshipInstanceDomain(
    uuid,
    descriptionBox,
    reifiedRelationshipInstance,
    domain,
    name )
  
  // ReifiedRelationshipInstanceRange
  
  def createReifiedRelationshipInstanceRange
  ( uuid: java.util.UUID,
    descriptionBox: DescriptionBox,
    reifiedRelationshipInstance: ReifiedRelationshipInstance,
    range: ConceptualEntitySingletonInstance,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.ReifiedRelationshipInstanceRange
  = resolver.impl.ReifiedRelationshipInstanceRange(
    uuid,
    descriptionBox,
    reifiedRelationshipInstance,
    range,
    name )
  
  // ReifiedRelationshipSpecializationAxiom
  
  def createReifiedRelationshipSpecializationAxiom
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    superRelationship: ReifiedRelationship,
    subRelationship: ReifiedRelationship)
  : resolver.api.ReifiedRelationshipSpecializationAxiom
  = resolver.impl.ReifiedRelationshipSpecializationAxiom(
    uuid,
    tbox,
    superRelationship,
    subRelationship )
  
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
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.Scalar
  = resolver.impl.Scalar(
    uuid,
    tbox,
    name )
  
  // ScalarDataProperty
  
  def createScalarDataProperty
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    domain: Structure,
    range: DataRange,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.ScalarDataProperty
  = resolver.impl.ScalarDataProperty(
    uuid,
    tbox,
    domain,
    range,
    name )
  
  // ScalarDataPropertyValue
  
  def createScalarDataPropertyValue
  ( uuid: java.util.UUID,
    singletonInstance: SingletonInstance,
    scalarDataProperty: DataRelationshipToScalar,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
    scalarPropertyValue: scala.Predef.String)
  : resolver.api.ScalarDataPropertyValue
  = resolver.impl.ScalarDataPropertyValue(
    uuid,
    singletonInstance,
    scalarDataProperty,
    name,
    scalarPropertyValue )
  
  // ScalarOneOfLiteralAxiom
  
  def createScalarOneOfLiteralAxiom
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    axiom: ScalarOneOfRestriction,
    value: gov.nasa.jpl.imce.oml.specification.tables.LexicalValue)
  : resolver.api.ScalarOneOfLiteralAxiom
  = resolver.impl.ScalarOneOfLiteralAxiom(
    uuid,
    tbox,
    axiom,
    value )
  
  // ScalarOneOfRestriction
  
  def createScalarOneOfRestriction
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    restrictedRange: DataRange,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.ScalarOneOfRestriction
  = resolver.impl.ScalarOneOfRestriction(
    uuid,
    tbox,
    restrictedRange,
    name )
  
  // SpecificDisjointConceptAxiom
  
  def createSpecificDisjointConceptAxiom
  ( uuid: java.util.UUID,
    bundle: Bundle,
    disjointTaxonomyParent: ConceptTreeDisjunction,
    disjointLeaf: Concept)
  : resolver.api.SpecificDisjointConceptAxiom
  = resolver.impl.SpecificDisjointConceptAxiom(
    uuid,
    bundle,
    disjointTaxonomyParent,
    disjointLeaf )
  
  // StringScalarRestriction
  
  def createStringScalarRestriction
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    restrictedRange: DataRange,
    length: scala.Option[scala.Int],
    minLength: scala.Option[scala.Int],
    maxLength: scala.Option[scala.Int],
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
    pattern: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.Pattern])
  : resolver.api.StringScalarRestriction
  = resolver.impl.StringScalarRestriction(
    uuid,
    tbox,
    restrictedRange,
    length,
    minLength,
    maxLength,
    name,
    pattern )
  
  // Structure
  
  def createStructure
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.Structure
  = resolver.impl.Structure(
    uuid,
    tbox,
    name )
  
  // StructuredDataProperty
  
  def createStructuredDataProperty
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    domain: Structure,
    range: Structure,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.StructuredDataProperty
  = resolver.impl.StructuredDataProperty(
    uuid,
    tbox,
    domain,
    range,
    name )
  
  // StructuredDataPropertyValue
  
  def createStructuredDataPropertyValue
  ( uuid: java.util.UUID,
    singletonInstance: SingletonInstance,
    structuredDataProperty: DataRelationshipToStructure,
    structuredPropertyTuple: DataStructureTuple,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.StructuredDataPropertyValue
  = resolver.impl.StructuredDataPropertyValue(
    uuid,
    singletonInstance,
    structuredDataProperty,
    structuredPropertyTuple,
    name )
  
  // SynonymScalarRestriction
  
  def createSynonymScalarRestriction
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    restrictedRange: DataRange,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.SynonymScalarRestriction
  = resolver.impl.SynonymScalarRestriction(
    uuid,
    tbox,
    restrictedRange,
    name )
  
  // TerminologyExtensionAxiom
  
  def createTerminologyExtensionAxiom
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    extendedTerminology: TerminologyBox)
  : resolver.api.TerminologyExtensionAxiom
  = resolver.impl.TerminologyExtensionAxiom(
    uuid,
    tbox,
    extendedTerminology )
  
  def copyTerminologyExtensionAxiom_tbox
  ( that: resolver.api.TerminologyExtensionAxiom,
    tbox: TerminologyBox )
  : resolver.api.TerminologyExtensionAxiom
  = that match {
  	case x: resolver.impl.TerminologyExtensionAxiom =>
  	  x.copy(tbox = tbox)
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
    descriptions: scala.collection.immutable.SortedSet[DescriptionBox],
    terminologyGraphs: scala.collection.immutable.SortedSet[TerminologyGraph])
  : resolver.api.TerminologyExtent
  = resolver.impl.TerminologyExtent(
    annotationProperties,
    bundles,
    descriptions,
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
  
  def copyTerminologyExtent_descriptions
  ( that: resolver.api.TerminologyExtent,
    descriptions: scala.collection.immutable.SortedSet[DescriptionBox] )
  : resolver.api.TerminologyExtent
  = that match {
  	case x: resolver.impl.TerminologyExtent =>
  	  x.copy(descriptions = descriptions)
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
    terminologyBoxAxioms: scala.collection.immutable.SortedSet[TerminologyBoxAxiom])
  : resolver.api.TerminologyGraph
  = resolver.impl.TerminologyGraph(
    uuid,
    kind,
    iri,
    annotations,
    boxStatements,
    terminologyBoxAxioms )
  
  // TerminologyNestingAxiom
  
  def createTerminologyNestingAxiom
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    nestingTerminology: TerminologyBox,
    nestingContext: Concept)
  : resolver.api.TerminologyNestingAxiom
  = resolver.impl.TerminologyNestingAxiom(
    uuid,
    tbox,
    nestingTerminology,
    nestingContext )
  
  def copyTerminologyNestingAxiom_tbox
  ( that: resolver.api.TerminologyNestingAxiom,
    tbox: TerminologyBox )
  : resolver.api.TerminologyNestingAxiom
  = that match {
  	case x: resolver.impl.TerminologyNestingAxiom =>
  	  x.copy(tbox = tbox)
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
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    restrictedRange: DataRange,
    minExclusive: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.LexicalTime],
    minInclusive: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.LexicalTime],
    maxExclusive: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.LexicalTime],
    maxInclusive: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.LexicalTime],
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.TimeScalarRestriction
  = resolver.impl.TimeScalarRestriction(
    uuid,
    tbox,
    restrictedRange,
    minExclusive,
    minInclusive,
    maxExclusive,
    maxInclusive,
    name )
  
  // UnreifiedRelationship
  
  def createUnreifiedRelationship
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    source: Entity,
    target: Entity,
    isAsymmetric: scala.Boolean,
    isEssential: scala.Boolean,
    isFunctional: scala.Boolean,
    isInverseEssential: scala.Boolean,
    isInverseFunctional: scala.Boolean,
    isIrreflexive: scala.Boolean,
    isReflexive: scala.Boolean,
    isSymmetric: scala.Boolean,
    isTransitive: scala.Boolean,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.UnreifiedRelationship
  = resolver.impl.UnreifiedRelationship(
    uuid,
    tbox,
    source,
    target,
    isAsymmetric,
    isEssential,
    isFunctional,
    isInverseEssential,
    isInverseFunctional,
    isIrreflexive,
    isReflexive,
    isSymmetric,
    isTransitive,
    name )
  
  // UnreifiedRelationshipInstanceTuple
  
  def createUnreifiedRelationshipInstanceTuple
  ( uuid: java.util.UUID,
    descriptionBox: DescriptionBox,
    unreifiedRelationship: UnreifiedRelationship,
    domain: ConceptualEntitySingletonInstance,
    range: ConceptualEntitySingletonInstance,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.UnreifiedRelationshipInstanceTuple
  = resolver.impl.UnreifiedRelationshipInstanceTuple(
    uuid,
    descriptionBox,
    unreifiedRelationship,
    domain,
    range,
    name )
  
}
