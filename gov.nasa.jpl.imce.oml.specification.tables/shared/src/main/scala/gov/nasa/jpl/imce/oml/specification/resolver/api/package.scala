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


package gov.nasa.jpl.imce.oml.specification.resolver

package object api {
	
  implicit def annotationOrdering
  : scala.Ordering[Annotation]
  = new scala.Ordering[Annotation] {
  	def compare(x: Annotation, y: Annotation)
  	: scala.Int
  	= moduleOrdering.compare(x.module,y.module) match {
  	 	case c_module if 0 != c_module => c_module
  	 	case 0 => terminologyThingOrdering.compare(x.subject,y.subject) match {
  	 	case c_subject if 0 != c_subject => c_subject
  	 	case 0 => annotationPropertyOrdering.compare(x.property,y.property) match {
  	 	case c_property if 0 != c_property => c_property
  	 	case 0 => x.value.compareTo(y.value) match {
  	 	case c_value if 0 != c_value => c_value
  	 	case 0 => 0 } } } }
  }
  
  implicit def annotationEntryOrdering
  : scala.Ordering[AnnotationEntry]
  = new scala.Ordering[AnnotationEntry] {
  	def compare(x: AnnotationEntry, y: AnnotationEntry)
  	: scala.Int
  	= moduleOrdering.compare(x.module,y.module) match {
  	 	case c_module if 0 != c_module => c_module
  	 	case 0 => terminologyThingOrdering.compare(x.subject,y.subject) match {
  	 	case c_subject if 0 != c_subject => c_subject
  	 	case 0 => x.value.compareTo(y.value) match {
  	 	case c_value if 0 != c_value => c_value
  	 	case 0 => 0 } } }
  }
  
  implicit def annotationPropertyOrdering
  : scala.Ordering[AnnotationProperty]
  = new scala.Ordering[AnnotationProperty] {
  	def compare(x: AnnotationProperty, y: AnnotationProperty)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def annotationPropertyTableOrdering
  : scala.Ordering[AnnotationPropertyTable]
  = new scala.Ordering[AnnotationPropertyTable] {
  	def compare(x: AnnotationPropertyTable, y: AnnotationPropertyTable)
  	: scala.Int
  	= annotationPropertyOrdering.compare(x.key,y.key) match {
  	 	case c_key if 0 != c_key => c_key
  	 	case 0 => 0 }
  }
  
  implicit def anonymousConceptTaxonomyAxiomOrdering
  : scala.Ordering[AnonymousConceptTaxonomyAxiom]
  = new scala.Ordering[AnonymousConceptTaxonomyAxiom] {
  	def compare(x: AnonymousConceptTaxonomyAxiom, y: AnonymousConceptTaxonomyAxiom)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def aspectOrdering
  : scala.Ordering[Aspect]
  = new scala.Ordering[Aspect] {
  	def compare(x: Aspect, y: Aspect)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def aspectSpecializationAxiomOrdering
  : scala.Ordering[AspectSpecializationAxiom]
  = new scala.Ordering[AspectSpecializationAxiom] {
  	def compare(x: AspectSpecializationAxiom, y: AspectSpecializationAxiom)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def axiomOrdering
  : scala.Ordering[Axiom]
  = new scala.Ordering[Axiom] {
  	def compare(x: Axiom, y: Axiom)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def binaryScalarRestrictionOrdering
  : scala.Ordering[BinaryScalarRestriction]
  = new scala.Ordering[BinaryScalarRestriction] {
  	def compare(x: BinaryScalarRestriction, y: BinaryScalarRestriction)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def bundleOrdering
  : scala.Ordering[Bundle]
  = new scala.Ordering[Bundle] {
  	def compare(x: Bundle, y: Bundle)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def bundledTerminologyAxiomOrdering
  : scala.Ordering[BundledTerminologyAxiom]
  = new scala.Ordering[BundledTerminologyAxiom] {
  	def compare(x: BundledTerminologyAxiom, y: BundledTerminologyAxiom)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def conceptOrdering
  : scala.Ordering[Concept]
  = new scala.Ordering[Concept] {
  	def compare(x: Concept, y: Concept)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def conceptDesignationTerminologyAxiomOrdering
  : scala.Ordering[ConceptDesignationTerminologyAxiom]
  = new scala.Ordering[ConceptDesignationTerminologyAxiom] {
  	def compare(x: ConceptDesignationTerminologyAxiom, y: ConceptDesignationTerminologyAxiom)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def conceptInstanceOrdering
  : scala.Ordering[ConceptInstance]
  = new scala.Ordering[ConceptInstance] {
  	def compare(x: ConceptInstance, y: ConceptInstance)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def conceptSpecializationAxiomOrdering
  : scala.Ordering[ConceptSpecializationAxiom]
  = new scala.Ordering[ConceptSpecializationAxiom] {
  	def compare(x: ConceptSpecializationAxiom, y: ConceptSpecializationAxiom)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def conceptualEntitySingletonInstanceOrdering
  : scala.Ordering[ConceptualEntitySingletonInstance]
  = new scala.Ordering[ConceptualEntitySingletonInstance] {
  	def compare(x: ConceptualEntitySingletonInstance, y: ConceptualEntitySingletonInstance)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def dataRangeOrdering
  : scala.Ordering[DataRange]
  = new scala.Ordering[DataRange] {
  	def compare(x: DataRange, y: DataRange)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def dataRelationshipOrdering
  : scala.Ordering[DataRelationship]
  = new scala.Ordering[DataRelationship] {
  	def compare(x: DataRelationship, y: DataRelationship)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def dataStructureTupleOrdering
  : scala.Ordering[DataStructureTuple]
  = new scala.Ordering[DataStructureTuple] {
  	def compare(x: DataStructureTuple, y: DataStructureTuple)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def datatypeOrdering
  : scala.Ordering[Datatype]
  = new scala.Ordering[Datatype] {
  	def compare(x: Datatype, y: Datatype)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def descriptionBoxOrdering
  : scala.Ordering[DescriptionBox]
  = new scala.Ordering[DescriptionBox] {
  	def compare(x: DescriptionBox, y: DescriptionBox)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def descriptionBoxExtendsClosedWorldDefinitionsOrdering
  : scala.Ordering[DescriptionBoxExtendsClosedWorldDefinitions]
  = new scala.Ordering[DescriptionBoxExtendsClosedWorldDefinitions] {
  	def compare(x: DescriptionBoxExtendsClosedWorldDefinitions, y: DescriptionBoxExtendsClosedWorldDefinitions)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def descriptionBoxRefinementOrdering
  : scala.Ordering[DescriptionBoxRefinement]
  = new scala.Ordering[DescriptionBoxRefinement] {
  	def compare(x: DescriptionBoxRefinement, y: DescriptionBoxRefinement)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def descriptionBoxRelationshipOrdering
  : scala.Ordering[DescriptionBoxRelationship]
  = new scala.Ordering[DescriptionBoxRelationship] {
  	def compare(x: DescriptionBoxRelationship, y: DescriptionBoxRelationship)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def disjointUnionOfConceptsAxiomOrdering
  : scala.Ordering[DisjointUnionOfConceptsAxiom]
  = new scala.Ordering[DisjointUnionOfConceptsAxiom] {
  	def compare(x: DisjointUnionOfConceptsAxiom, y: DisjointUnionOfConceptsAxiom)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def entityOrdering
  : scala.Ordering[Entity]
  = new scala.Ordering[Entity] {
  	def compare(x: Entity, y: Entity)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def entityExistentialRestrictionAxiomOrdering
  : scala.Ordering[EntityExistentialRestrictionAxiom]
  = new scala.Ordering[EntityExistentialRestrictionAxiom] {
  	def compare(x: EntityExistentialRestrictionAxiom, y: EntityExistentialRestrictionAxiom)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def entityRelationshipOrdering
  : scala.Ordering[EntityRelationship]
  = new scala.Ordering[EntityRelationship] {
  	def compare(x: EntityRelationship, y: EntityRelationship)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def entityRestrictionAxiomOrdering
  : scala.Ordering[EntityRestrictionAxiom]
  = new scala.Ordering[EntityRestrictionAxiom] {
  	def compare(x: EntityRestrictionAxiom, y: EntityRestrictionAxiom)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def entityScalarDataPropertyOrdering
  : scala.Ordering[EntityScalarDataProperty]
  = new scala.Ordering[EntityScalarDataProperty] {
  	def compare(x: EntityScalarDataProperty, y: EntityScalarDataProperty)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def entityScalarDataPropertyExistentialRestrictionAxiomOrdering
  : scala.Ordering[EntityScalarDataPropertyExistentialRestrictionAxiom]
  = new scala.Ordering[EntityScalarDataPropertyExistentialRestrictionAxiom] {
  	def compare(x: EntityScalarDataPropertyExistentialRestrictionAxiom, y: EntityScalarDataPropertyExistentialRestrictionAxiom)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def entityScalarDataPropertyParticularRestrictionAxiomOrdering
  : scala.Ordering[EntityScalarDataPropertyParticularRestrictionAxiom]
  = new scala.Ordering[EntityScalarDataPropertyParticularRestrictionAxiom] {
  	def compare(x: EntityScalarDataPropertyParticularRestrictionAxiom, y: EntityScalarDataPropertyParticularRestrictionAxiom)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def entityScalarDataPropertyRestrictionAxiomOrdering
  : scala.Ordering[EntityScalarDataPropertyRestrictionAxiom]
  = new scala.Ordering[EntityScalarDataPropertyRestrictionAxiom] {
  	def compare(x: EntityScalarDataPropertyRestrictionAxiom, y: EntityScalarDataPropertyRestrictionAxiom)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def entityScalarDataPropertyUniversalRestrictionAxiomOrdering
  : scala.Ordering[EntityScalarDataPropertyUniversalRestrictionAxiom]
  = new scala.Ordering[EntityScalarDataPropertyUniversalRestrictionAxiom] {
  	def compare(x: EntityScalarDataPropertyUniversalRestrictionAxiom, y: EntityScalarDataPropertyUniversalRestrictionAxiom)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def entityStructuredDataPropertyOrdering
  : scala.Ordering[EntityStructuredDataProperty]
  = new scala.Ordering[EntityStructuredDataProperty] {
  	def compare(x: EntityStructuredDataProperty, y: EntityStructuredDataProperty)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def entityUniversalRestrictionAxiomOrdering
  : scala.Ordering[EntityUniversalRestrictionAxiom]
  = new scala.Ordering[EntityUniversalRestrictionAxiom] {
  	def compare(x: EntityUniversalRestrictionAxiom, y: EntityUniversalRestrictionAxiom)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def iRIScalarRestrictionOrdering
  : scala.Ordering[IRIScalarRestriction]
  = new scala.Ordering[IRIScalarRestriction] {
  	def compare(x: IRIScalarRestriction, y: IRIScalarRestriction)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def moduleOrdering
  : scala.Ordering[Module]
  = new scala.Ordering[Module] {
  	def compare(x: Module, y: Module)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def numericScalarRestrictionOrdering
  : scala.Ordering[NumericScalarRestriction]
  = new scala.Ordering[NumericScalarRestriction] {
  	def compare(x: NumericScalarRestriction, y: NumericScalarRestriction)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def plainLiteralScalarRestrictionOrdering
  : scala.Ordering[PlainLiteralScalarRestriction]
  = new scala.Ordering[PlainLiteralScalarRestriction] {
  	def compare(x: PlainLiteralScalarRestriction, y: PlainLiteralScalarRestriction)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def reifiedRelationshipOrdering
  : scala.Ordering[ReifiedRelationship]
  = new scala.Ordering[ReifiedRelationship] {
  	def compare(x: ReifiedRelationship, y: ReifiedRelationship)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def reifiedRelationshipInstanceOrdering
  : scala.Ordering[ReifiedRelationshipInstance]
  = new scala.Ordering[ReifiedRelationshipInstance] {
  	def compare(x: ReifiedRelationshipInstance, y: ReifiedRelationshipInstance)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def reifiedRelationshipInstanceDomainOrdering
  : scala.Ordering[ReifiedRelationshipInstanceDomain]
  = new scala.Ordering[ReifiedRelationshipInstanceDomain] {
  	def compare(x: ReifiedRelationshipInstanceDomain, y: ReifiedRelationshipInstanceDomain)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def reifiedRelationshipInstanceRangeOrdering
  : scala.Ordering[ReifiedRelationshipInstanceRange]
  = new scala.Ordering[ReifiedRelationshipInstanceRange] {
  	def compare(x: ReifiedRelationshipInstanceRange, y: ReifiedRelationshipInstanceRange)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def reifiedRelationshipSpecializationAxiomOrdering
  : scala.Ordering[ReifiedRelationshipSpecializationAxiom]
  = new scala.Ordering[ReifiedRelationshipSpecializationAxiom] {
  	def compare(x: ReifiedRelationshipSpecializationAxiom, y: ReifiedRelationshipSpecializationAxiom)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def restrictedDataRangeOrdering
  : scala.Ordering[RestrictedDataRange]
  = new scala.Ordering[RestrictedDataRange] {
  	def compare(x: RestrictedDataRange, y: RestrictedDataRange)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def rootConceptTaxonomyAxiomOrdering
  : scala.Ordering[RootConceptTaxonomyAxiom]
  = new scala.Ordering[RootConceptTaxonomyAxiom] {
  	def compare(x: RootConceptTaxonomyAxiom, y: RootConceptTaxonomyAxiom)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def scalarOrdering
  : scala.Ordering[Scalar]
  = new scala.Ordering[Scalar] {
  	def compare(x: Scalar, y: Scalar)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def scalarDataPropertyOrdering
  : scala.Ordering[ScalarDataProperty]
  = new scala.Ordering[ScalarDataProperty] {
  	def compare(x: ScalarDataProperty, y: ScalarDataProperty)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def scalarDataPropertyValueOrdering
  : scala.Ordering[ScalarDataPropertyValue]
  = new scala.Ordering[ScalarDataPropertyValue] {
  	def compare(x: ScalarDataPropertyValue, y: ScalarDataPropertyValue)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def scalarOneOfLiteralAxiomOrdering
  : scala.Ordering[ScalarOneOfLiteralAxiom]
  = new scala.Ordering[ScalarOneOfLiteralAxiom] {
  	def compare(x: ScalarOneOfLiteralAxiom, y: ScalarOneOfLiteralAxiom)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def scalarOneOfRestrictionOrdering
  : scala.Ordering[ScalarOneOfRestriction]
  = new scala.Ordering[ScalarOneOfRestriction] {
  	def compare(x: ScalarOneOfRestriction, y: ScalarOneOfRestriction)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def singletonInstanceOrdering
  : scala.Ordering[SingletonInstance]
  = new scala.Ordering[SingletonInstance] {
  	def compare(x: SingletonInstance, y: SingletonInstance)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def specializationAxiomOrdering
  : scala.Ordering[SpecializationAxiom]
  = new scala.Ordering[SpecializationAxiom] {
  	def compare(x: SpecializationAxiom, y: SpecializationAxiom)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def specificDisjointConceptAxiomOrdering
  : scala.Ordering[SpecificDisjointConceptAxiom]
  = new scala.Ordering[SpecificDisjointConceptAxiom] {
  	def compare(x: SpecificDisjointConceptAxiom, y: SpecificDisjointConceptAxiom)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def stringScalarRestrictionOrdering
  : scala.Ordering[StringScalarRestriction]
  = new scala.Ordering[StringScalarRestriction] {
  	def compare(x: StringScalarRestriction, y: StringScalarRestriction)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def structureOrdering
  : scala.Ordering[Structure]
  = new scala.Ordering[Structure] {
  	def compare(x: Structure, y: Structure)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def structuredDataPropertyOrdering
  : scala.Ordering[StructuredDataProperty]
  = new scala.Ordering[StructuredDataProperty] {
  	def compare(x: StructuredDataProperty, y: StructuredDataProperty)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def structuredDataPropertyValueOrdering
  : scala.Ordering[StructuredDataPropertyValue]
  = new scala.Ordering[StructuredDataPropertyValue] {
  	def compare(x: StructuredDataPropertyValue, y: StructuredDataPropertyValue)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def synonymScalarRestrictionOrdering
  : scala.Ordering[SynonymScalarRestriction]
  = new scala.Ordering[SynonymScalarRestriction] {
  	def compare(x: SynonymScalarRestriction, y: SynonymScalarRestriction)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def termOrdering
  : scala.Ordering[Term]
  = new scala.Ordering[Term] {
  	def compare(x: Term, y: Term)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def termAxiomOrdering
  : scala.Ordering[TermAxiom]
  = new scala.Ordering[TermAxiom] {
  	def compare(x: TermAxiom, y: TermAxiom)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def terminologyAxiomOrdering
  : scala.Ordering[TerminologyAxiom]
  = new scala.Ordering[TerminologyAxiom] {
  	def compare(x: TerminologyAxiom, y: TerminologyAxiom)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def terminologyBoxOrdering
  : scala.Ordering[TerminologyBox]
  = new scala.Ordering[TerminologyBox] {
  	def compare(x: TerminologyBox, y: TerminologyBox)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def terminologyBoxAxiomOrdering
  : scala.Ordering[TerminologyBoxAxiom]
  = new scala.Ordering[TerminologyBoxAxiom] {
  	def compare(x: TerminologyBoxAxiom, y: TerminologyBoxAxiom)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def terminologyBoxStatementOrdering
  : scala.Ordering[TerminologyBoxStatement]
  = new scala.Ordering[TerminologyBoxStatement] {
  	def compare(x: TerminologyBoxStatement, y: TerminologyBoxStatement)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def terminologyBundleAxiomOrdering
  : scala.Ordering[TerminologyBundleAxiom]
  = new scala.Ordering[TerminologyBundleAxiom] {
  	def compare(x: TerminologyBundleAxiom, y: TerminologyBundleAxiom)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def terminologyBundleStatementOrdering
  : scala.Ordering[TerminologyBundleStatement]
  = new scala.Ordering[TerminologyBundleStatement] {
  	def compare(x: TerminologyBundleStatement, y: TerminologyBundleStatement)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def terminologyExtensionAxiomOrdering
  : scala.Ordering[TerminologyExtensionAxiom]
  = new scala.Ordering[TerminologyExtensionAxiom] {
  	def compare(x: TerminologyExtensionAxiom, y: TerminologyExtensionAxiom)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def terminologyGraphOrdering
  : scala.Ordering[TerminologyGraph]
  = new scala.Ordering[TerminologyGraph] {
  	def compare(x: TerminologyGraph, y: TerminologyGraph)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def terminologyInstanceAssertionOrdering
  : scala.Ordering[TerminologyInstanceAssertion]
  = new scala.Ordering[TerminologyInstanceAssertion] {
  	def compare(x: TerminologyInstanceAssertion, y: TerminologyInstanceAssertion)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def terminologyNestingAxiomOrdering
  : scala.Ordering[TerminologyNestingAxiom]
  = new scala.Ordering[TerminologyNestingAxiom] {
  	def compare(x: TerminologyNestingAxiom, y: TerminologyNestingAxiom)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def terminologyThingOrdering
  : scala.Ordering[TerminologyThing]
  = new scala.Ordering[TerminologyThing] {
  	def compare(x: TerminologyThing, y: TerminologyThing)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def timeScalarRestrictionOrdering
  : scala.Ordering[TimeScalarRestriction]
  = new scala.Ordering[TimeScalarRestriction] {
  	def compare(x: TimeScalarRestriction, y: TimeScalarRestriction)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def unreifiedRelationshipOrdering
  : scala.Ordering[UnreifiedRelationship]
  = new scala.Ordering[UnreifiedRelationship] {
  	def compare(x: UnreifiedRelationship, y: UnreifiedRelationship)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
  implicit def unreifiedRelationshipInstanceTupleOrdering
  : scala.Ordering[UnreifiedRelationshipInstanceTuple]
  = new scala.Ordering[UnreifiedRelationshipInstanceTuple] {
  	def compare(x: UnreifiedRelationshipInstanceTuple, y: UnreifiedRelationshipInstanceTuple)
  	: scala.Int
  	= x.uuid.compareTo(y.uuid) match {
  	 	case c_uuid if 0 != c_uuid => c_uuid
  	 	case 0 => 0 }
  }
  
}
