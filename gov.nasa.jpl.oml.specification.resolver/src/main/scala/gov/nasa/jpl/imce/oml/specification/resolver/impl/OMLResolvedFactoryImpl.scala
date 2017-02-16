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
  ( module: resolver.api.Module,
    subject: resolver.api.TerminologyThing,
    property: resolver.api.AnnotationProperty,
    value: scala.Predef.String)
  : resolver.api.Annotation
  = resolver.impl.Annotation(
    module,
    subject,
    property,
    value )
  
  // AnnotationEntry
  
  def createAnnotationEntry
  ( module: resolver.api.Module,
    subject: resolver.api.TerminologyThing,
    value: scala.Predef.String)
  : resolver.api.AnnotationEntry
  = resolver.impl.AnnotationEntry(
    module,
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
  ( key: resolver.api.AnnotationProperty,
    value: scala.collection.immutable.SortedSet[resolver.api.AnnotationEntry])
  : resolver.api.AnnotationPropertyTable
  = resolver.impl.AnnotationPropertyTable(
    key,
    value )
  
  // AnonymousConceptTaxonomyAxiom
  
  def createAnonymousConceptTaxonomyAxiom
  ( bundle: resolver.api.Bundle,
    disjointTaxonomyParent: resolver.api.ConceptTreeDisjunction)
  : resolver.api.AnonymousConceptTaxonomyAxiom
  = resolver.impl.AnonymousConceptTaxonomyAxiom(
    bundle,
    disjointTaxonomyParent )
  
  // Aspect
  
  def createAspect
  ( tbox: resolver.api.TerminologyBox,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.Aspect
  = resolver.impl.Aspect(
    tbox,
    name )
  
  // AspectSpecializationAxiom
  
  def createAspectSpecializationAxiom
  ( tbox: resolver.api.TerminologyBox,
    superAspect: resolver.api.Aspect,
    subEntity: resolver.api.Entity)
  : resolver.api.AspectSpecializationAxiom
  = resolver.impl.AspectSpecializationAxiom(
    tbox,
    superAspect,
    subEntity )
  
  // BinaryScalarRestriction
  
  def createBinaryScalarRestriction
  ( tbox: resolver.api.TerminologyBox,
    restrictedRange: resolver.api.DataRange,
    length: scala.Option[scala.Int],
    minLength: scala.Option[scala.Int],
    maxLength: scala.Option[scala.Int],
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.BinaryScalarRestriction
  = resolver.impl.BinaryScalarRestriction(
    tbox,
    restrictedRange,
    length,
    minLength,
    maxLength,
    name )
  
  // Bundle
  
  def createBundle
  ( bundleExtent: resolver.api.TerminologyExtent,
    kind: gov.nasa.jpl.imce.oml.specification.tables.TerminologyGraphKind,
    iri: gov.nasa.jpl.imce.oml.specification.tables.IRI,
    annotations: scala.collection.immutable.SortedSet[resolver.api.Annotation],
    boxStatements: scala.collection.immutable.SortedSet[resolver.api.TerminologyBoxStatement],
    bundleStatements: scala.collection.immutable.SortedSet[resolver.api.TerminologyBundleStatement],
    terminologyBoxAxioms: scala.collection.immutable.SortedSet[resolver.api.TerminologyBoxAxiom],
    terminologyBundleAxioms: scala.collection.immutable.SortedSet[resolver.api.TerminologyBundleAxiom])
  : resolver.api.Bundle
  = resolver.impl.Bundle(
    bundleExtent,
    kind,
    iri,
    annotations,
    boxStatements,
    bundleStatements,
    terminologyBoxAxioms,
    terminologyBundleAxioms )
  
  // BundledTerminologyAxiom
  
  def createBundledTerminologyAxiom
  ( terminologyBundle: resolver.api.Bundle,
    bundledTerminology: resolver.api.TerminologyBox)
  : resolver.api.BundledTerminologyAxiom
  = resolver.impl.BundledTerminologyAxiom(
    terminologyBundle,
    bundledTerminology )
  
  def copyBundledTerminologyAxiom_terminologyBundle
  ( that: resolver.api.BundledTerminologyAxiom,
    terminologyBundle: resolver.api.Bundle )
  : resolver.api.BundledTerminologyAxiom
  = that match {
  	case x: resolver.impl.BundledTerminologyAxiom =>
  	  x.copy(terminologyBundle = terminologyBundle)
  }
  
  def copyBundledTerminologyAxiom_bundledTerminology
  ( that: resolver.api.BundledTerminologyAxiom,
    bundledTerminology: resolver.api.TerminologyBox )
  : resolver.api.BundledTerminologyAxiom
  = that match {
  	case x: resolver.impl.BundledTerminologyAxiom =>
  	  x.copy(bundledTerminology = bundledTerminology)
  }
  
  // Concept
  
  def createConcept
  ( tbox: resolver.api.TerminologyBox,
    isAbstract: scala.Boolean,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.Concept
  = resolver.impl.Concept(
    tbox,
    isAbstract,
    name )
  
  // ConceptDesignationTerminologyAxiom
  
  def createConceptDesignationTerminologyAxiom
  ( tbox: resolver.api.TerminologyBox,
    designatedConcept: resolver.api.Concept,
    designatedTerminology: resolver.api.TerminologyBox)
  : resolver.api.ConceptDesignationTerminologyAxiom
  = resolver.impl.ConceptDesignationTerminologyAxiom(
    tbox,
    designatedConcept,
    designatedTerminology )
  
  def copyConceptDesignationTerminologyAxiom_tbox
  ( that: resolver.api.ConceptDesignationTerminologyAxiom,
    tbox: resolver.api.TerminologyBox )
  : resolver.api.ConceptDesignationTerminologyAxiom
  = that match {
  	case x: resolver.impl.ConceptDesignationTerminologyAxiom =>
  	  x.copy(tbox = tbox)
  }
  
  def copyConceptDesignationTerminologyAxiom_designatedTerminology
  ( that: resolver.api.ConceptDesignationTerminologyAxiom,
    designatedTerminology: resolver.api.TerminologyBox )
  : resolver.api.ConceptDesignationTerminologyAxiom
  = that match {
  	case x: resolver.impl.ConceptDesignationTerminologyAxiom =>
  	  x.copy(designatedTerminology = designatedTerminology)
  }
  
  // ConceptInstance
  
  def createConceptInstance
  ( descriptionBox: resolver.api.DescriptionBox,
    singletonConceptClassifier: resolver.api.Concept,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
    scalarDataPropertyValues: scala.collection.immutable.SortedSet[resolver.api.ScalarDataPropertyValue],
    structuredDataPropertyValues: scala.collection.immutable.SortedSet[resolver.api.StructuredDataPropertyValue])
  : resolver.api.ConceptInstance
  = resolver.impl.ConceptInstance(
    descriptionBox,
    singletonConceptClassifier,
    name,
    scalarDataPropertyValues,
    structuredDataPropertyValues )
  
  def copyConceptInstance_scalarDataPropertyValues
  ( that: resolver.api.ConceptInstance,
    scalarDataPropertyValues: scala.collection.immutable.SortedSet[resolver.api.ScalarDataPropertyValue] )
  : resolver.api.ConceptInstance
  = that match {
  	case x: resolver.impl.ConceptInstance =>
  	  x.copy(scalarDataPropertyValues = scalarDataPropertyValues)
  }
  
  def copyConceptInstance_structuredDataPropertyValues
  ( that: resolver.api.ConceptInstance,
    structuredDataPropertyValues: scala.collection.immutable.SortedSet[resolver.api.StructuredDataPropertyValue] )
  : resolver.api.ConceptInstance
  = that match {
  	case x: resolver.impl.ConceptInstance =>
  	  x.copy(structuredDataPropertyValues = structuredDataPropertyValues)
  }
  
  // ConceptSpecializationAxiom
  
  def createConceptSpecializationAxiom
  ( tbox: resolver.api.TerminologyBox,
    superConcept: resolver.api.Concept,
    subConcept: resolver.api.Concept)
  : resolver.api.ConceptSpecializationAxiom
  = resolver.impl.ConceptSpecializationAxiom(
    tbox,
    superConcept,
    subConcept )
  
  // DataStructureTuple
  
  def createDataStructureTuple
  ( dataStructureType: resolver.api.Structure,
    structuredDataPropertyValue: resolver.api.StructuredDataPropertyValue,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
    scalarDataPropertyValues: scala.collection.immutable.SortedSet[resolver.api.ScalarDataPropertyValue],
    structuredDataPropertyValues: scala.collection.immutable.SortedSet[resolver.api.StructuredDataPropertyValue])
  : resolver.api.DataStructureTuple
  = resolver.impl.DataStructureTuple(
    dataStructureType,
    structuredDataPropertyValue,
    name,
    scalarDataPropertyValues,
    structuredDataPropertyValues )
  
  def copyDataStructureTuple_scalarDataPropertyValues
  ( that: resolver.api.DataStructureTuple,
    scalarDataPropertyValues: scala.collection.immutable.SortedSet[resolver.api.ScalarDataPropertyValue] )
  : resolver.api.DataStructureTuple
  = that match {
  	case x: resolver.impl.DataStructureTuple =>
  	  x.copy(scalarDataPropertyValues = scalarDataPropertyValues)
  }
  
  def copyDataStructureTuple_structuredDataPropertyValues
  ( that: resolver.api.DataStructureTuple,
    structuredDataPropertyValues: scala.collection.immutable.SortedSet[resolver.api.StructuredDataPropertyValue] )
  : resolver.api.DataStructureTuple
  = that match {
  	case x: resolver.impl.DataStructureTuple =>
  	  x.copy(structuredDataPropertyValues = structuredDataPropertyValues)
  }
  
  // DescriptionBox
  
  def createDescriptionBox
  ( descriptionExtent: resolver.api.TerminologyExtent,
    closedWorldDefinitions: scala.collection.immutable.SortedSet[resolver.api.DescriptionBoxExtendsClosedWorldDefinitions],
    kind: gov.nasa.jpl.imce.oml.specification.tables.DescriptionKind,
    iri: gov.nasa.jpl.imce.oml.specification.tables.IRI,
    annotations: scala.collection.immutable.SortedSet[resolver.api.Annotation],
    conceptInstances: scala.collection.immutable.SortedSet[resolver.api.ConceptInstance],
    descriptionBoxRefinements: scala.collection.immutable.SortedSet[resolver.api.DescriptionBoxRefinement],
    reifiedRelationshipInstanceDomains: scala.collection.immutable.SortedSet[resolver.api.ReifiedRelationshipInstanceDomain],
    reifiedRelationshipInstanceRanges: scala.collection.immutable.SortedSet[resolver.api.ReifiedRelationshipInstanceRange],
    reifiedRelationshipInstances: scala.collection.immutable.SortedSet[resolver.api.ReifiedRelationshipInstance],
    unreifiedRelationshipInstanceTuples: scala.collection.immutable.SortedSet[resolver.api.UnreifiedRelationshipInstanceTuple])
  : resolver.api.DescriptionBox
  = resolver.impl.DescriptionBox(
    descriptionExtent,
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
    closedWorldDefinitions: scala.collection.immutable.SortedSet[resolver.api.DescriptionBoxExtendsClosedWorldDefinitions] )
  : resolver.api.DescriptionBox
  = that match {
  	case x: resolver.impl.DescriptionBox =>
  	  x.copy(closedWorldDefinitions = closedWorldDefinitions)
  }
  
  def copyDescriptionBox_conceptInstances
  ( that: resolver.api.DescriptionBox,
    conceptInstances: scala.collection.immutable.SortedSet[resolver.api.ConceptInstance] )
  : resolver.api.DescriptionBox
  = that match {
  	case x: resolver.impl.DescriptionBox =>
  	  x.copy(conceptInstances = conceptInstances)
  }
  
  def copyDescriptionBox_descriptionBoxRefinements
  ( that: resolver.api.DescriptionBox,
    descriptionBoxRefinements: scala.collection.immutable.SortedSet[resolver.api.DescriptionBoxRefinement] )
  : resolver.api.DescriptionBox
  = that match {
  	case x: resolver.impl.DescriptionBox =>
  	  x.copy(descriptionBoxRefinements = descriptionBoxRefinements)
  }
  
  def copyDescriptionBox_reifiedRelationshipInstanceDomains
  ( that: resolver.api.DescriptionBox,
    reifiedRelationshipInstanceDomains: scala.collection.immutable.SortedSet[resolver.api.ReifiedRelationshipInstanceDomain] )
  : resolver.api.DescriptionBox
  = that match {
  	case x: resolver.impl.DescriptionBox =>
  	  x.copy(reifiedRelationshipInstanceDomains = reifiedRelationshipInstanceDomains)
  }
  
  def copyDescriptionBox_reifiedRelationshipInstanceRanges
  ( that: resolver.api.DescriptionBox,
    reifiedRelationshipInstanceRanges: scala.collection.immutable.SortedSet[resolver.api.ReifiedRelationshipInstanceRange] )
  : resolver.api.DescriptionBox
  = that match {
  	case x: resolver.impl.DescriptionBox =>
  	  x.copy(reifiedRelationshipInstanceRanges = reifiedRelationshipInstanceRanges)
  }
  
  def copyDescriptionBox_reifiedRelationshipInstances
  ( that: resolver.api.DescriptionBox,
    reifiedRelationshipInstances: scala.collection.immutable.SortedSet[resolver.api.ReifiedRelationshipInstance] )
  : resolver.api.DescriptionBox
  = that match {
  	case x: resolver.impl.DescriptionBox =>
  	  x.copy(reifiedRelationshipInstances = reifiedRelationshipInstances)
  }
  
  def copyDescriptionBox_unreifiedRelationshipInstanceTuples
  ( that: resolver.api.DescriptionBox,
    unreifiedRelationshipInstanceTuples: scala.collection.immutable.SortedSet[resolver.api.UnreifiedRelationshipInstanceTuple] )
  : resolver.api.DescriptionBox
  = that match {
  	case x: resolver.impl.DescriptionBox =>
  	  x.copy(unreifiedRelationshipInstanceTuples = unreifiedRelationshipInstanceTuples)
  }
  
  // DescriptionBoxExtendsClosedWorldDefinitions
  
  def createDescriptionBoxExtendsClosedWorldDefinitions
  ( descriptionBox: resolver.api.DescriptionBox,
    closedWorldDefinitions: resolver.api.TerminologyBox)
  : resolver.api.DescriptionBoxExtendsClosedWorldDefinitions
  = resolver.impl.DescriptionBoxExtendsClosedWorldDefinitions(
    descriptionBox,
    closedWorldDefinitions )
  
  // DescriptionBoxRefinement
  
  def createDescriptionBoxRefinement
  ( refiningDescriptionBox: resolver.api.DescriptionBox,
    refinedDescriptionBox: resolver.api.DescriptionBox)
  : resolver.api.DescriptionBoxRefinement
  = resolver.impl.DescriptionBoxRefinement(
    refiningDescriptionBox,
    refinedDescriptionBox )
  
  // EntityExistentialRestrictionAxiom
  
  def createEntityExistentialRestrictionAxiom
  ( tbox: resolver.api.TerminologyBox,
    restrictedRelation: resolver.api.EntityRelationship,
    restrictedDomain: resolver.api.Entity,
    restrictedRange: resolver.api.Entity)
  : resolver.api.EntityExistentialRestrictionAxiom
  = resolver.impl.EntityExistentialRestrictionAxiom(
    tbox,
    restrictedRelation,
    restrictedDomain,
    restrictedRange )
  
  // EntityScalarDataProperty
  
  def createEntityScalarDataProperty
  ( tbox: resolver.api.TerminologyBox,
    domain: resolver.api.Entity,
    range: resolver.api.DataRange,
    isIdentityCriteria: scala.Boolean,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.EntityScalarDataProperty
  = resolver.impl.EntityScalarDataProperty(
    tbox,
    domain,
    range,
    isIdentityCriteria,
    name )
  
  // EntityScalarDataPropertyExistentialRestrictionAxiom
  
  def createEntityScalarDataPropertyExistentialRestrictionAxiom
  ( tbox: resolver.api.TerminologyBox,
    restrictedEntity: resolver.api.Entity,
    scalarProperty: resolver.api.EntityScalarDataProperty,
    scalarRestriction: resolver.api.DataRange)
  : resolver.api.EntityScalarDataPropertyExistentialRestrictionAxiom
  = resolver.impl.EntityScalarDataPropertyExistentialRestrictionAxiom(
    tbox,
    restrictedEntity,
    scalarProperty,
    scalarRestriction )
  
  // EntityScalarDataPropertyParticularRestrictionAxiom
  
  def createEntityScalarDataPropertyParticularRestrictionAxiom
  ( tbox: resolver.api.TerminologyBox,
    restrictedEntity: resolver.api.Entity,
    scalarProperty: resolver.api.EntityScalarDataProperty,
    literalValue: gov.nasa.jpl.imce.oml.specification.tables.LexicalValue)
  : resolver.api.EntityScalarDataPropertyParticularRestrictionAxiom
  = resolver.impl.EntityScalarDataPropertyParticularRestrictionAxiom(
    tbox,
    restrictedEntity,
    scalarProperty,
    literalValue )
  
  // EntityScalarDataPropertyUniversalRestrictionAxiom
  
  def createEntityScalarDataPropertyUniversalRestrictionAxiom
  ( tbox: resolver.api.TerminologyBox,
    restrictedEntity: resolver.api.Entity,
    scalarProperty: resolver.api.EntityScalarDataProperty,
    scalarRestriction: resolver.api.DataRange)
  : resolver.api.EntityScalarDataPropertyUniversalRestrictionAxiom
  = resolver.impl.EntityScalarDataPropertyUniversalRestrictionAxiom(
    tbox,
    restrictedEntity,
    scalarProperty,
    scalarRestriction )
  
  // EntityStructuredDataProperty
  
  def createEntityStructuredDataProperty
  ( tbox: resolver.api.TerminologyBox,
    domain: resolver.api.Entity,
    range: resolver.api.Structure,
    isIdentityCriteria: scala.Boolean,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.EntityStructuredDataProperty
  = resolver.impl.EntityStructuredDataProperty(
    tbox,
    domain,
    range,
    isIdentityCriteria,
    name )
  
  // EntityUniversalRestrictionAxiom
  
  def createEntityUniversalRestrictionAxiom
  ( tbox: resolver.api.TerminologyBox,
    restrictedRelation: resolver.api.EntityRelationship,
    restrictedDomain: resolver.api.Entity,
    restrictedRange: resolver.api.Entity)
  : resolver.api.EntityUniversalRestrictionAxiom
  = resolver.impl.EntityUniversalRestrictionAxiom(
    tbox,
    restrictedRelation,
    restrictedDomain,
    restrictedRange )
  
  // IRIScalarRestriction
  
  def createIRIScalarRestriction
  ( tbox: resolver.api.TerminologyBox,
    restrictedRange: resolver.api.DataRange,
    length: scala.Option[scala.Int],
    minLength: scala.Option[scala.Int],
    maxLength: scala.Option[scala.Int],
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
    pattern: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.Pattern])
  : resolver.api.IRIScalarRestriction
  = resolver.impl.IRIScalarRestriction(
    tbox,
    restrictedRange,
    length,
    minLength,
    maxLength,
    name,
    pattern )
  
  // NumericScalarRestriction
  
  def createNumericScalarRestriction
  ( tbox: resolver.api.TerminologyBox,
    restrictedRange: resolver.api.DataRange,
    minExclusive: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.LexicalNumber],
    minInclusive: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.LexicalNumber],
    maxExclusive: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.LexicalNumber],
    maxInclusive: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.LexicalNumber],
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.NumericScalarRestriction
  = resolver.impl.NumericScalarRestriction(
    tbox,
    restrictedRange,
    minExclusive,
    minInclusive,
    maxExclusive,
    maxInclusive,
    name )
  
  // PlainLiteralScalarRestriction
  
  def createPlainLiteralScalarRestriction
  ( tbox: resolver.api.TerminologyBox,
    restrictedRange: resolver.api.DataRange,
    length: scala.Option[scala.Int],
    minLength: scala.Option[scala.Int],
    maxLength: scala.Option[scala.Int],
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
    langRange: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.LangRange],
    pattern: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.Pattern])
  : resolver.api.PlainLiteralScalarRestriction
  = resolver.impl.PlainLiteralScalarRestriction(
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
  ( tbox: resolver.api.TerminologyBox,
    source: resolver.api.Entity,
    target: resolver.api.Entity,
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
  ( descriptionBox: resolver.api.DescriptionBox,
    singletonReifiedRelationshipClassifier: resolver.api.ReifiedRelationship,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
    scalarDataPropertyValues: scala.collection.immutable.SortedSet[resolver.api.ScalarDataPropertyValue],
    structuredDataPropertyValues: scala.collection.immutable.SortedSet[resolver.api.StructuredDataPropertyValue])
  : resolver.api.ReifiedRelationshipInstance
  = resolver.impl.ReifiedRelationshipInstance(
    descriptionBox,
    singletonReifiedRelationshipClassifier,
    name,
    scalarDataPropertyValues,
    structuredDataPropertyValues )
  
  def copyReifiedRelationshipInstance_scalarDataPropertyValues
  ( that: resolver.api.ReifiedRelationshipInstance,
    scalarDataPropertyValues: scala.collection.immutable.SortedSet[resolver.api.ScalarDataPropertyValue] )
  : resolver.api.ReifiedRelationshipInstance
  = that match {
  	case x: resolver.impl.ReifiedRelationshipInstance =>
  	  x.copy(scalarDataPropertyValues = scalarDataPropertyValues)
  }
  
  def copyReifiedRelationshipInstance_structuredDataPropertyValues
  ( that: resolver.api.ReifiedRelationshipInstance,
    structuredDataPropertyValues: scala.collection.immutable.SortedSet[resolver.api.StructuredDataPropertyValue] )
  : resolver.api.ReifiedRelationshipInstance
  = that match {
  	case x: resolver.impl.ReifiedRelationshipInstance =>
  	  x.copy(structuredDataPropertyValues = structuredDataPropertyValues)
  }
  
  // ReifiedRelationshipInstanceDomain
  
  def createReifiedRelationshipInstanceDomain
  ( descriptionBox: resolver.api.DescriptionBox,
    reifiedRelationshipInstance: resolver.api.ReifiedRelationshipInstance,
    domain: resolver.api.ConceptualEntitySingletonInstance,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.ReifiedRelationshipInstanceDomain
  = resolver.impl.ReifiedRelationshipInstanceDomain(
    descriptionBox,
    reifiedRelationshipInstance,
    domain,
    name )
  
  // ReifiedRelationshipInstanceRange
  
  def createReifiedRelationshipInstanceRange
  ( descriptionBox: resolver.api.DescriptionBox,
    reifiedRelationshipInstance: resolver.api.ReifiedRelationshipInstance,
    range: resolver.api.ConceptualEntitySingletonInstance,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.ReifiedRelationshipInstanceRange
  = resolver.impl.ReifiedRelationshipInstanceRange(
    descriptionBox,
    reifiedRelationshipInstance,
    range,
    name )
  
  // ReifiedRelationshipSpecializationAxiom
  
  def createReifiedRelationshipSpecializationAxiom
  ( tbox: resolver.api.TerminologyBox,
    superRelationship: resolver.api.ReifiedRelationship,
    subRelationship: resolver.api.ReifiedRelationship)
  : resolver.api.ReifiedRelationshipSpecializationAxiom
  = resolver.impl.ReifiedRelationshipSpecializationAxiom(
    tbox,
    superRelationship,
    subRelationship )
  
  // RootConceptTaxonomyAxiom
  
  def createRootConceptTaxonomyAxiom
  ( bundle: resolver.api.Bundle,
    root: resolver.api.Concept)
  : resolver.api.RootConceptTaxonomyAxiom
  = resolver.impl.RootConceptTaxonomyAxiom(
    bundle,
    root )
  
  // Scalar
  
  def createScalar
  ( tbox: resolver.api.TerminologyBox,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.Scalar
  = resolver.impl.Scalar(
    tbox,
    name )
  
  // ScalarDataProperty
  
  def createScalarDataProperty
  ( tbox: resolver.api.TerminologyBox,
    domain: resolver.api.Structure,
    range: resolver.api.DataRange,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.ScalarDataProperty
  = resolver.impl.ScalarDataProperty(
    tbox,
    domain,
    range,
    name )
  
  // ScalarDataPropertyValue
  
  def createScalarDataPropertyValue
  ( singletonInstance: resolver.api.SingletonInstance,
    scalarDataProperty: resolver.api.DataRelationshipToScalar,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
    scalarPropertyValue: scala.Predef.String)
  : resolver.api.ScalarDataPropertyValue
  = resolver.impl.ScalarDataPropertyValue(
    singletonInstance,
    scalarDataProperty,
    name,
    scalarPropertyValue )
  
  // ScalarOneOfLiteralAxiom
  
  def createScalarOneOfLiteralAxiom
  ( tbox: resolver.api.TerminologyBox,
    axiom: resolver.api.ScalarOneOfRestriction,
    value: gov.nasa.jpl.imce.oml.specification.tables.LexicalValue)
  : resolver.api.ScalarOneOfLiteralAxiom
  = resolver.impl.ScalarOneOfLiteralAxiom(
    tbox,
    axiom,
    value )
  
  // ScalarOneOfRestriction
  
  def createScalarOneOfRestriction
  ( tbox: resolver.api.TerminologyBox,
    restrictedRange: resolver.api.DataRange,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.ScalarOneOfRestriction
  = resolver.impl.ScalarOneOfRestriction(
    tbox,
    restrictedRange,
    name )
  
  // SpecificDisjointConceptAxiom
  
  def createSpecificDisjointConceptAxiom
  ( bundle: resolver.api.Bundle,
    disjointTaxonomyParent: resolver.api.ConceptTreeDisjunction,
    disjointLeaf: resolver.api.Concept)
  : resolver.api.SpecificDisjointConceptAxiom
  = resolver.impl.SpecificDisjointConceptAxiom(
    bundle,
    disjointTaxonomyParent,
    disjointLeaf )
  
  // StringScalarRestriction
  
  def createStringScalarRestriction
  ( tbox: resolver.api.TerminologyBox,
    restrictedRange: resolver.api.DataRange,
    length: scala.Option[scala.Int],
    minLength: scala.Option[scala.Int],
    maxLength: scala.Option[scala.Int],
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
    pattern: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.Pattern])
  : resolver.api.StringScalarRestriction
  = resolver.impl.StringScalarRestriction(
    tbox,
    restrictedRange,
    length,
    minLength,
    maxLength,
    name,
    pattern )
  
  // Structure
  
  def createStructure
  ( tbox: resolver.api.TerminologyBox,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.Structure
  = resolver.impl.Structure(
    tbox,
    name )
  
  // StructuredDataProperty
  
  def createStructuredDataProperty
  ( tbox: resolver.api.TerminologyBox,
    domain: resolver.api.Structure,
    range: resolver.api.Structure,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.StructuredDataProperty
  = resolver.impl.StructuredDataProperty(
    tbox,
    domain,
    range,
    name )
  
  // StructuredDataPropertyValue
  
  def createStructuredDataPropertyValue
  ( singletonInstance: resolver.api.SingletonInstance,
    structuredDataProperty: resolver.api.DataRelationshipToStructure,
    structuredPropertyTuple: resolver.api.DataStructureTuple,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.StructuredDataPropertyValue
  = resolver.impl.StructuredDataPropertyValue(
    singletonInstance,
    structuredDataProperty,
    structuredPropertyTuple,
    name )
  
  // SynonymScalarRestriction
  
  def createSynonymScalarRestriction
  ( tbox: resolver.api.TerminologyBox,
    restrictedRange: resolver.api.DataRange,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.SynonymScalarRestriction
  = resolver.impl.SynonymScalarRestriction(
    tbox,
    restrictedRange,
    name )
  
  // TerminologyExtensionAxiom
  
  def createTerminologyExtensionAxiom
  ( tbox: resolver.api.TerminologyBox,
    extendedTerminology: resolver.api.TerminologyBox)
  : resolver.api.TerminologyExtensionAxiom
  = resolver.impl.TerminologyExtensionAxiom(
    tbox,
    extendedTerminology )
  
  def copyTerminologyExtensionAxiom_tbox
  ( that: resolver.api.TerminologyExtensionAxiom,
    tbox: resolver.api.TerminologyBox )
  : resolver.api.TerminologyExtensionAxiom
  = that match {
  	case x: resolver.impl.TerminologyExtensionAxiom =>
  	  x.copy(tbox = tbox)
  }
  
  def copyTerminologyExtensionAxiom_extendedTerminology
  ( that: resolver.api.TerminologyExtensionAxiom,
    extendedTerminology: resolver.api.TerminologyBox )
  : resolver.api.TerminologyExtensionAxiom
  = that match {
  	case x: resolver.impl.TerminologyExtensionAxiom =>
  	  x.copy(extendedTerminology = extendedTerminology)
  }
  
  // TerminologyExtent
  
  def createTerminologyExtent
  ( annotationProperties: scala.collection.immutable.SortedSet[resolver.api.AnnotationProperty],
    bundles: scala.collection.immutable.SortedSet[resolver.api.Bundle],
    descriptions: scala.collection.immutable.SortedSet[resolver.api.DescriptionBox],
    terminologyGraphs: scala.collection.immutable.SortedSet[resolver.api.TerminologyGraph])
  : resolver.api.TerminologyExtent
  = resolver.impl.TerminologyExtent(
    annotationProperties,
    bundles,
    descriptions,
    terminologyGraphs )
  
  def copyTerminologyExtent_annotationProperties
  ( that: resolver.api.TerminologyExtent,
    annotationProperties: scala.collection.immutable.SortedSet[resolver.api.AnnotationProperty] )
  : resolver.api.TerminologyExtent
  = that match {
  	case x: resolver.impl.TerminologyExtent =>
  	  x.copy(annotationProperties = annotationProperties)
  }
  
  def copyTerminologyExtent_bundles
  ( that: resolver.api.TerminologyExtent,
    bundles: scala.collection.immutable.SortedSet[resolver.api.Bundle] )
  : resolver.api.TerminologyExtent
  = that match {
  	case x: resolver.impl.TerminologyExtent =>
  	  x.copy(bundles = bundles)
  }
  
  def copyTerminologyExtent_descriptions
  ( that: resolver.api.TerminologyExtent,
    descriptions: scala.collection.immutable.SortedSet[resolver.api.DescriptionBox] )
  : resolver.api.TerminologyExtent
  = that match {
  	case x: resolver.impl.TerminologyExtent =>
  	  x.copy(descriptions = descriptions)
  }
  
  def copyTerminologyExtent_terminologyGraphs
  ( that: resolver.api.TerminologyExtent,
    terminologyGraphs: scala.collection.immutable.SortedSet[resolver.api.TerminologyGraph] )
  : resolver.api.TerminologyExtent
  = that match {
  	case x: resolver.impl.TerminologyExtent =>
  	  x.copy(terminologyGraphs = terminologyGraphs)
  }
  
  // TerminologyGraph
  
  def createTerminologyGraph
  ( graphExtent: resolver.api.TerminologyExtent,
    kind: gov.nasa.jpl.imce.oml.specification.tables.TerminologyGraphKind,
    iri: gov.nasa.jpl.imce.oml.specification.tables.IRI,
    annotations: scala.collection.immutable.SortedSet[resolver.api.Annotation],
    boxStatements: scala.collection.immutable.SortedSet[resolver.api.TerminologyBoxStatement],
    terminologyBoxAxioms: scala.collection.immutable.SortedSet[resolver.api.TerminologyBoxAxiom])
  : resolver.api.TerminologyGraph
  = resolver.impl.TerminologyGraph(
    graphExtent,
    kind,
    iri,
    annotations,
    boxStatements,
    terminologyBoxAxioms )
  
  // TerminologyNestingAxiom
  
  def createTerminologyNestingAxiom
  ( tbox: resolver.api.TerminologyBox,
    nestingTerminology: resolver.api.TerminologyBox,
    nestingContext: resolver.api.Concept)
  : resolver.api.TerminologyNestingAxiom
  = resolver.impl.TerminologyNestingAxiom(
    tbox,
    nestingTerminology,
    nestingContext )
  
  def copyTerminologyNestingAxiom_tbox
  ( that: resolver.api.TerminologyNestingAxiom,
    tbox: resolver.api.TerminologyBox )
  : resolver.api.TerminologyNestingAxiom
  = that match {
  	case x: resolver.impl.TerminologyNestingAxiom =>
  	  x.copy(tbox = tbox)
  }
  
  def copyTerminologyNestingAxiom_nestingTerminology
  ( that: resolver.api.TerminologyNestingAxiom,
    nestingTerminology: resolver.api.TerminologyBox )
  : resolver.api.TerminologyNestingAxiom
  = that match {
  	case x: resolver.impl.TerminologyNestingAxiom =>
  	  x.copy(nestingTerminology = nestingTerminology)
  }
  
  // TimeScalarRestriction
  
  def createTimeScalarRestriction
  ( tbox: resolver.api.TerminologyBox,
    restrictedRange: resolver.api.DataRange,
    minExclusive: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.LexicalTime],
    minInclusive: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.LexicalTime],
    maxExclusive: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.LexicalTime],
    maxInclusive: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.LexicalTime],
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.TimeScalarRestriction
  = resolver.impl.TimeScalarRestriction(
    tbox,
    restrictedRange,
    minExclusive,
    minInclusive,
    maxExclusive,
    maxInclusive,
    name )
  
  // UnreifiedRelationship
  
  def createUnreifiedRelationship
  ( tbox: resolver.api.TerminologyBox,
    source: resolver.api.Entity,
    target: resolver.api.Entity,
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
  ( descriptionBox: resolver.api.DescriptionBox,
    unreifiedRelationship: resolver.api.UnreifiedRelationship,
    domain: resolver.api.ConceptualEntitySingletonInstance,
    range: resolver.api.ConceptualEntitySingletonInstance,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName)
  : resolver.api.UnreifiedRelationshipInstanceTuple
  = resolver.impl.UnreifiedRelationshipInstanceTuple(
    descriptionBox,
    unreifiedRelationship,
    domain,
    range,
    name )
  
}
