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

trait OMLResolvedFactory {
	
  // Annotation
  
  def createAnnotation
  ( subject: TerminologyThing,
    property: AnnotationProperty,
    value: scala.Predef.String,
    module: Module )
  : Annotation
  
  // AnnotationEntry
  
  def createAnnotationEntry
  ( subject: TerminologyThing,
    value: scala.Predef.String,
    module: Module )
  : AnnotationEntry
  
  // AnnotationProperty
  
  def createAnnotationProperty
  ( iri: gov.nasa.jpl.imce.oml.specification.tables.IRI,
    abbrevIRI: gov.nasa.jpl.imce.oml.specification.tables.AbbrevIRI )
  : AnnotationProperty
  
  // AnnotationPropertyTable
  
  def createAnnotationPropertyTable
  ( key: AnnotationProperty,
    value: scala.collection.immutable.SortedSet[AnnotationEntry] )
  : AnnotationPropertyTable
  
  // AnonymousConceptTaxonomyAxiom
  
  def createAnonymousConceptTaxonomyAxiom
  ( uuid: java.util.UUID,
    bundle: Bundle,
    disjointTaxonomyParent: ConceptTreeDisjunction )
  : AnonymousConceptTaxonomyAxiom
  
  // Aspect
  
  def createAspect
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName )
  : Aspect
  
  // AspectSpecializationAxiom
  
  def createAspectSpecializationAxiom
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    superAspect: Aspect,
    subEntity: Entity )
  : AspectSpecializationAxiom
  
  // BinaryScalarRestriction
  
  def createBinaryScalarRestriction
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    restrictedRange: DataRange,
    length: scala.Option[scala.Int],
    minLength: scala.Option[scala.Int],
    maxLength: scala.Option[scala.Int],
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName )
  : BinaryScalarRestriction
  
  // Bundle
  
  def createBundle
  ( uuid: java.util.UUID,
    kind: gov.nasa.jpl.imce.oml.specification.tables.TerminologyGraphKind,
    iri: gov.nasa.jpl.imce.oml.specification.tables.IRI,
    annotations: scala.collection.immutable.SortedSet[Annotation],
    boxStatements: scala.collection.immutable.SortedSet[TerminologyBoxStatement],
    bundleStatements: scala.collection.immutable.SortedSet[TerminologyBundleStatement],
    terminologyBoxAxioms: scala.collection.immutable.SortedSet[TerminologyBoxAxiom],
    terminologyBundleAxioms: scala.collection.immutable.SortedSet[TerminologyBundleAxiom] )
  : Bundle
  
  // BundledTerminologyAxiom
  
  def createBundledTerminologyAxiom
  ( uuid: java.util.UUID,
    terminologyBundle: Bundle,
    bundledTerminology: TerminologyBox )
  : BundledTerminologyAxiom
  
  def copyBundledTerminologyAxiom_terminologyBundle
  ( that: BundledTerminologyAxiom,
    terminologyBundle: Bundle )
  : BundledTerminologyAxiom
  
  def copyBundledTerminologyAxiom_bundledTerminology
  ( that: BundledTerminologyAxiom,
    bundledTerminology: TerminologyBox )
  : BundledTerminologyAxiom
  
  // Concept
  
  def createConcept
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    isAbstract: scala.Boolean,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName )
  : Concept
  
  // ConceptDesignationTerminologyAxiom
  
  def createConceptDesignationTerminologyAxiom
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    designatedConcept: Concept,
    designatedTerminology: TerminologyBox )
  : ConceptDesignationTerminologyAxiom
  
  def copyConceptDesignationTerminologyAxiom_tbox
  ( that: ConceptDesignationTerminologyAxiom,
    tbox: TerminologyBox )
  : ConceptDesignationTerminologyAxiom
  
  def copyConceptDesignationTerminologyAxiom_designatedTerminology
  ( that: ConceptDesignationTerminologyAxiom,
    designatedTerminology: TerminologyBox )
  : ConceptDesignationTerminologyAxiom
  
  // ConceptInstance
  
  def createConceptInstance
  ( uuid: java.util.UUID,
    descriptionBox: DescriptionBox,
    singletonConceptClassifier: Concept,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
    scalarDataPropertyValues: scala.collection.immutable.SortedSet[ScalarDataPropertyValue],
    structuredDataPropertyValues: scala.collection.immutable.SortedSet[StructuredDataPropertyValue] )
  : ConceptInstance
  
  def copyConceptInstance_scalarDataPropertyValues
  ( that: ConceptInstance,
    scalarDataPropertyValues: scala.collection.immutable.SortedSet[ScalarDataPropertyValue] )
  : ConceptInstance
  
  def copyConceptInstance_structuredDataPropertyValues
  ( that: ConceptInstance,
    structuredDataPropertyValues: scala.collection.immutable.SortedSet[StructuredDataPropertyValue] )
  : ConceptInstance
  
  // ConceptSpecializationAxiom
  
  def createConceptSpecializationAxiom
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    superConcept: Concept,
    subConcept: Concept )
  : ConceptSpecializationAxiom
  
  // DataStructureTuple
  
  def createDataStructureTuple
  ( uuid: java.util.UUID,
    dataStructureType: Structure,
    structuredDataPropertyValue: StructuredDataPropertyValue,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
    scalarDataPropertyValues: scala.collection.immutable.SortedSet[ScalarDataPropertyValue],
    structuredDataPropertyValues: scala.collection.immutable.SortedSet[StructuredDataPropertyValue] )
  : DataStructureTuple
  
  def copyDataStructureTuple_scalarDataPropertyValues
  ( that: DataStructureTuple,
    scalarDataPropertyValues: scala.collection.immutable.SortedSet[ScalarDataPropertyValue] )
  : DataStructureTuple
  
  def copyDataStructureTuple_structuredDataPropertyValues
  ( that: DataStructureTuple,
    structuredDataPropertyValues: scala.collection.immutable.SortedSet[StructuredDataPropertyValue] )
  : DataStructureTuple
  
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
    unreifiedRelationshipInstanceTuples: scala.collection.immutable.SortedSet[UnreifiedRelationshipInstanceTuple] )
  : DescriptionBox
  
  def copyDescriptionBox_closedWorldDefinitions
  ( that: DescriptionBox,
    closedWorldDefinitions: scala.collection.immutable.SortedSet[DescriptionBoxExtendsClosedWorldDefinitions] )
  : DescriptionBox
  
  def copyDescriptionBox_conceptInstances
  ( that: DescriptionBox,
    conceptInstances: scala.collection.immutable.SortedSet[ConceptInstance] )
  : DescriptionBox
  
  def copyDescriptionBox_descriptionBoxRefinements
  ( that: DescriptionBox,
    descriptionBoxRefinements: scala.collection.immutable.SortedSet[DescriptionBoxRefinement] )
  : DescriptionBox
  
  def copyDescriptionBox_reifiedRelationshipInstanceDomains
  ( that: DescriptionBox,
    reifiedRelationshipInstanceDomains: scala.collection.immutable.SortedSet[ReifiedRelationshipInstanceDomain] )
  : DescriptionBox
  
  def copyDescriptionBox_reifiedRelationshipInstanceRanges
  ( that: DescriptionBox,
    reifiedRelationshipInstanceRanges: scala.collection.immutable.SortedSet[ReifiedRelationshipInstanceRange] )
  : DescriptionBox
  
  def copyDescriptionBox_reifiedRelationshipInstances
  ( that: DescriptionBox,
    reifiedRelationshipInstances: scala.collection.immutable.SortedSet[ReifiedRelationshipInstance] )
  : DescriptionBox
  
  def copyDescriptionBox_unreifiedRelationshipInstanceTuples
  ( that: DescriptionBox,
    unreifiedRelationshipInstanceTuples: scala.collection.immutable.SortedSet[UnreifiedRelationshipInstanceTuple] )
  : DescriptionBox
  
  // DescriptionBoxExtendsClosedWorldDefinitions
  
  def createDescriptionBoxExtendsClosedWorldDefinitions
  ( uuid: java.util.UUID,
    descriptionBox: DescriptionBox,
    closedWorldDefinitions: TerminologyBox )
  : DescriptionBoxExtendsClosedWorldDefinitions
  
  // DescriptionBoxRefinement
  
  def createDescriptionBoxRefinement
  ( uuid: java.util.UUID,
    refiningDescriptionBox: DescriptionBox,
    refinedDescriptionBox: DescriptionBox )
  : DescriptionBoxRefinement
  
  // EntityExistentialRestrictionAxiom
  
  def createEntityExistentialRestrictionAxiom
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    restrictedRelation: EntityRelationship,
    restrictedDomain: Entity,
    restrictedRange: Entity )
  : EntityExistentialRestrictionAxiom
  
  // EntityScalarDataProperty
  
  def createEntityScalarDataProperty
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    domain: Entity,
    range: DataRange,
    isIdentityCriteria: scala.Boolean,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName )
  : EntityScalarDataProperty
  
  // EntityScalarDataPropertyExistentialRestrictionAxiom
  
  def createEntityScalarDataPropertyExistentialRestrictionAxiom
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    restrictedEntity: Entity,
    scalarProperty: EntityScalarDataProperty,
    scalarRestriction: DataRange )
  : EntityScalarDataPropertyExistentialRestrictionAxiom
  
  // EntityScalarDataPropertyParticularRestrictionAxiom
  
  def createEntityScalarDataPropertyParticularRestrictionAxiom
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    restrictedEntity: Entity,
    scalarProperty: EntityScalarDataProperty,
    literalValue: gov.nasa.jpl.imce.oml.specification.tables.LexicalValue )
  : EntityScalarDataPropertyParticularRestrictionAxiom
  
  // EntityScalarDataPropertyUniversalRestrictionAxiom
  
  def createEntityScalarDataPropertyUniversalRestrictionAxiom
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    restrictedEntity: Entity,
    scalarProperty: EntityScalarDataProperty,
    scalarRestriction: DataRange )
  : EntityScalarDataPropertyUniversalRestrictionAxiom
  
  // EntityStructuredDataProperty
  
  def createEntityStructuredDataProperty
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    domain: Entity,
    range: Structure,
    isIdentityCriteria: scala.Boolean,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName )
  : EntityStructuredDataProperty
  
  // EntityUniversalRestrictionAxiom
  
  def createEntityUniversalRestrictionAxiom
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    restrictedRelation: EntityRelationship,
    restrictedDomain: Entity,
    restrictedRange: Entity )
  : EntityUniversalRestrictionAxiom
  
  // IRIScalarRestriction
  
  def createIRIScalarRestriction
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    restrictedRange: DataRange,
    length: scala.Option[scala.Int],
    minLength: scala.Option[scala.Int],
    maxLength: scala.Option[scala.Int],
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
    pattern: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.Pattern] )
  : IRIScalarRestriction
  
  // NumericScalarRestriction
  
  def createNumericScalarRestriction
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    restrictedRange: DataRange,
    minExclusive: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.LexicalNumber],
    minInclusive: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.LexicalNumber],
    maxExclusive: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.LexicalNumber],
    maxInclusive: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.LexicalNumber],
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName )
  : NumericScalarRestriction
  
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
    pattern: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.Pattern] )
  : PlainLiteralScalarRestriction
  
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
    unreifiedInversePropertyName: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.LocalName] )
  : ReifiedRelationship
  
  // ReifiedRelationshipInstance
  
  def createReifiedRelationshipInstance
  ( uuid: java.util.UUID,
    descriptionBox: DescriptionBox,
    singletonReifiedRelationshipClassifier: ReifiedRelationship,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
    scalarDataPropertyValues: scala.collection.immutable.SortedSet[ScalarDataPropertyValue],
    structuredDataPropertyValues: scala.collection.immutable.SortedSet[StructuredDataPropertyValue] )
  : ReifiedRelationshipInstance
  
  def copyReifiedRelationshipInstance_scalarDataPropertyValues
  ( that: ReifiedRelationshipInstance,
    scalarDataPropertyValues: scala.collection.immutable.SortedSet[ScalarDataPropertyValue] )
  : ReifiedRelationshipInstance
  
  def copyReifiedRelationshipInstance_structuredDataPropertyValues
  ( that: ReifiedRelationshipInstance,
    structuredDataPropertyValues: scala.collection.immutable.SortedSet[StructuredDataPropertyValue] )
  : ReifiedRelationshipInstance
  
  // ReifiedRelationshipInstanceDomain
  
  def createReifiedRelationshipInstanceDomain
  ( uuid: java.util.UUID,
    descriptionBox: DescriptionBox,
    reifiedRelationshipInstance: ReifiedRelationshipInstance,
    domain: ConceptualEntitySingletonInstance,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName )
  : ReifiedRelationshipInstanceDomain
  
  // ReifiedRelationshipInstanceRange
  
  def createReifiedRelationshipInstanceRange
  ( uuid: java.util.UUID,
    descriptionBox: DescriptionBox,
    reifiedRelationshipInstance: ReifiedRelationshipInstance,
    range: ConceptualEntitySingletonInstance,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName )
  : ReifiedRelationshipInstanceRange
  
  // ReifiedRelationshipSpecializationAxiom
  
  def createReifiedRelationshipSpecializationAxiom
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    superRelationship: ReifiedRelationship,
    subRelationship: ReifiedRelationship )
  : ReifiedRelationshipSpecializationAxiom
  
  // RootConceptTaxonomyAxiom
  
  def createRootConceptTaxonomyAxiom
  ( uuid: java.util.UUID,
    bundle: Bundle,
    root: Concept )
  : RootConceptTaxonomyAxiom
  
  // Scalar
  
  def createScalar
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName )
  : Scalar
  
  // ScalarDataProperty
  
  def createScalarDataProperty
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    domain: Structure,
    range: DataRange,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName )
  : ScalarDataProperty
  
  // ScalarDataPropertyValue
  
  def createScalarDataPropertyValue
  ( uuid: java.util.UUID,
    singletonInstance: SingletonInstance,
    scalarDataProperty: DataRelationshipToScalar,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
    scalarPropertyValue: scala.Predef.String )
  : ScalarDataPropertyValue
  
  // ScalarOneOfLiteralAxiom
  
  def createScalarOneOfLiteralAxiom
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    axiom: ScalarOneOfRestriction,
    value: gov.nasa.jpl.imce.oml.specification.tables.LexicalValue )
  : ScalarOneOfLiteralAxiom
  
  // ScalarOneOfRestriction
  
  def createScalarOneOfRestriction
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    restrictedRange: DataRange,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName )
  : ScalarOneOfRestriction
  
  // SpecificDisjointConceptAxiom
  
  def createSpecificDisjointConceptAxiom
  ( uuid: java.util.UUID,
    bundle: Bundle,
    disjointTaxonomyParent: ConceptTreeDisjunction,
    disjointLeaf: Concept )
  : SpecificDisjointConceptAxiom
  
  // StringScalarRestriction
  
  def createStringScalarRestriction
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    restrictedRange: DataRange,
    length: scala.Option[scala.Int],
    minLength: scala.Option[scala.Int],
    maxLength: scala.Option[scala.Int],
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName,
    pattern: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.Pattern] )
  : StringScalarRestriction
  
  // Structure
  
  def createStructure
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName )
  : Structure
  
  // StructuredDataProperty
  
  def createStructuredDataProperty
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    domain: Structure,
    range: Structure,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName )
  : StructuredDataProperty
  
  // StructuredDataPropertyValue
  
  def createStructuredDataPropertyValue
  ( uuid: java.util.UUID,
    singletonInstance: SingletonInstance,
    structuredDataProperty: DataRelationshipToStructure,
    structuredPropertyTuple: DataStructureTuple,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName )
  : StructuredDataPropertyValue
  
  // SynonymScalarRestriction
  
  def createSynonymScalarRestriction
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    restrictedRange: DataRange,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName )
  : SynonymScalarRestriction
  
  // TerminologyExtensionAxiom
  
  def createTerminologyExtensionAxiom
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    extendedTerminology: TerminologyBox )
  : TerminologyExtensionAxiom
  
  def copyTerminologyExtensionAxiom_tbox
  ( that: TerminologyExtensionAxiom,
    tbox: TerminologyBox )
  : TerminologyExtensionAxiom
  
  def copyTerminologyExtensionAxiom_extendedTerminology
  ( that: TerminologyExtensionAxiom,
    extendedTerminology: TerminologyBox )
  : TerminologyExtensionAxiom
  
  // TerminologyExtent
  
  def createTerminologyExtent
  ( annotationProperties: scala.collection.immutable.SortedSet[AnnotationProperty],
    bundles: scala.collection.immutable.SortedSet[Bundle],
    descriptions: scala.collection.immutable.SortedSet[DescriptionBox],
    terminologyGraphs: scala.collection.immutable.SortedSet[TerminologyGraph] )
  : TerminologyExtent
  
  def copyTerminologyExtent_annotationProperties
  ( that: TerminologyExtent,
    annotationProperties: scala.collection.immutable.SortedSet[AnnotationProperty] )
  : TerminologyExtent
  
  def copyTerminologyExtent_bundles
  ( that: TerminologyExtent,
    bundles: scala.collection.immutable.SortedSet[Bundle] )
  : TerminologyExtent
  
  def copyTerminologyExtent_descriptions
  ( that: TerminologyExtent,
    descriptions: scala.collection.immutable.SortedSet[DescriptionBox] )
  : TerminologyExtent
  
  def copyTerminologyExtent_terminologyGraphs
  ( that: TerminologyExtent,
    terminologyGraphs: scala.collection.immutable.SortedSet[TerminologyGraph] )
  : TerminologyExtent
  
  // TerminologyGraph
  
  def createTerminologyGraph
  ( uuid: java.util.UUID,
    kind: gov.nasa.jpl.imce.oml.specification.tables.TerminologyGraphKind,
    iri: gov.nasa.jpl.imce.oml.specification.tables.IRI,
    annotations: scala.collection.immutable.SortedSet[Annotation],
    boxStatements: scala.collection.immutable.SortedSet[TerminologyBoxStatement],
    terminologyBoxAxioms: scala.collection.immutable.SortedSet[TerminologyBoxAxiom] )
  : TerminologyGraph
  
  // TerminologyNestingAxiom
  
  def createTerminologyNestingAxiom
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    nestingTerminology: TerminologyBox,
    nestingContext: Concept )
  : TerminologyNestingAxiom
  
  def copyTerminologyNestingAxiom_tbox
  ( that: TerminologyNestingAxiom,
    tbox: TerminologyBox )
  : TerminologyNestingAxiom
  
  def copyTerminologyNestingAxiom_nestingTerminology
  ( that: TerminologyNestingAxiom,
    nestingTerminology: TerminologyBox )
  : TerminologyNestingAxiom
  
  // TimeScalarRestriction
  
  def createTimeScalarRestriction
  ( uuid: java.util.UUID,
    tbox: TerminologyBox,
    restrictedRange: DataRange,
    minExclusive: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.LexicalTime],
    minInclusive: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.LexicalTime],
    maxExclusive: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.LexicalTime],
    maxInclusive: scala.Option[gov.nasa.jpl.imce.oml.specification.tables.LexicalTime],
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName )
  : TimeScalarRestriction
  
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
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName )
  : UnreifiedRelationship
  
  // UnreifiedRelationshipInstanceTuple
  
  def createUnreifiedRelationshipInstanceTuple
  ( uuid: java.util.UUID,
    descriptionBox: DescriptionBox,
    unreifiedRelationship: UnreifiedRelationship,
    domain: ConceptualEntitySingletonInstance,
    range: ConceptualEntitySingletonInstance,
    name: gov.nasa.jpl.imce.oml.specification.tables.LocalName )
  : UnreifiedRelationshipInstanceTuple
  
}
