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
package jpl.imce.oml.specification.scoping

import com.google.inject.Inject
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.scoping.impl.ImportNormalizer
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider

import jpl.imce.oml.specification.ecore.TerminologyBox
import jpl.imce.oml.specification.ecore.TerminologyExtent
import jpl.imce.oml.specification.util.OMLImportNormalizer
import jpl.imce.oml.specification.ecore.OMLPackage
import org.eclipse.xtext.scoping.IScope
import jpl.imce.oml.specification.ecore.Annotation
import jpl.imce.oml.specification.ecore.AspectSpecializationAxiom
import jpl.imce.oml.specification.ecore.BundledTerminologyAxiom
import jpl.imce.oml.specification.ecore.ConceptDesignationTerminologyAxiom
import jpl.imce.oml.specification.ecore.ConceptSpecializationAxiom
import jpl.imce.oml.specification.ecore.DataRelationshipFromEntity
import jpl.imce.oml.specification.ecore.DataRelationshipFromStructure
import jpl.imce.oml.specification.ecore.DataRelationshipToScalar
import jpl.imce.oml.specification.ecore.DataRelationshipToStructure
import jpl.imce.oml.specification.ecore.DisjointUnionOfConceptsAxiom
import jpl.imce.oml.specification.ecore.EntityRelationship
import jpl.imce.oml.specification.ecore.EntityRestrictionAxiom
import jpl.imce.oml.specification.ecore.EntityScalarDataPropertyRestrictionAxiom
import jpl.imce.oml.specification.ecore.EntityScalarDataPropertyExistentialRestrictionAxiom
import jpl.imce.oml.specification.ecore.EntityScalarDataPropertyUniversalRestrictionAxiom
import jpl.imce.oml.specification.ecore.ReifiedRelationshipSpecializationAxiom
import jpl.imce.oml.specification.ecore.RestrictedDataRange
import jpl.imce.oml.specification.ecore.RootConceptTaxonomyAxiom
import jpl.imce.oml.specification.ecore.ScalarOneOfLiteralAxiom
import jpl.imce.oml.specification.ecore.SpecificDisjointConceptAxiom
import jpl.imce.oml.specification.ecore.TerminologyExtensionAxiom
import jpl.imce.oml.specification.ecore.TerminologyNestingAxiom

class OMLImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
	
	@Inject IQualifiedNameConverter qnc
		
	override def List<ImportNormalizer> getImportedNamespaceResolvers(EObject context, boolean ignoreCase) {
		val res = new ArrayList<ImportNormalizer>();
		switch context {
			TerminologyExtent:
				for (ap : context.annotationProperties)
					res.add(new OMLImportNormalizer(qnc.toQualifiedName(ap.iri), ap.abbrevIRI))
			TerminologyBox: {
				for (ap : context.extent.annotationProperties) {
					res.add(new OMLImportNormalizer(qnc.toQualifiedName(ap.iri), ap.abbrevIRI))
				}
				for (e : context.terminologyBoxAxioms) {
					res.add(new OMLImportNormalizer(qnc.toQualifiedName(e.target.iri()), e.target.name))
				}
			}
		}
		res.addAll(super.getImportedNamespaceResolvers(context, ignoreCase));
		
		
		return res;
	}
	
	@Inject extension OMLScopeExtensions
	
	val epackage = OMLPackage.eINSTANCE
	
 	override getScope(EObject context, EReference reference) {
 		var IScope scope = null
		switch context {
 			Annotation:
 				if (reference == epackage.annotation_Property)
					scope = scope_Annotation_property(context, reference)
					
			EntityRelationship:
				if (reference == epackage.entityRelationship_Source ||
					reference == epackage.entityRelationship_Target)
					scope = scope_EntityRelationship(context)
					
			AspectSpecializationAxiom:
				if (reference == epackage.aspectSpecializationAxiom_SubEntity)
					scope = scope_AspectSpecializationAxiom_subEntity(context)
				else if (reference == epackage.aspectSpecializationAxiom_SuperAspect)
					scope = scope_AspectSpecializationAxiom_superAspect(context)
			ConceptSpecializationAxiom:
				{}
			ReifiedRelationshipSpecializationAxiom:
				{}
			RestrictedDataRange:
				{}
				
			DataRelationshipFromEntity:
				{}
			DataRelationshipFromStructure:
				{}
			DataRelationshipToScalar:
				{}
			DataRelationshipToStructure:
				{}
				
			EntityRestrictionAxiom:
				{}
			EntityScalarDataPropertyExistentialRestrictionAxiom:
				{}
			EntityScalarDataPropertyUniversalRestrictionAxiom:
				{}
			EntityScalarDataPropertyRestrictionAxiom:
				{}
				
			ScalarOneOfLiteralAxiom:
				{}
				
			RootConceptTaxonomyAxiom:
				{}
			SpecificDisjointConceptAxiom:
				{}
			DisjointUnionOfConceptsAxiom:
				{}
				
			BundledTerminologyAxiom:
				if (reference == epackage.bundledTerminologyAxiom_BundledTerminology)
					scope = scope_BundledTerminologyAxiom_bundledTerminology(context)
			ConceptDesignationTerminologyAxiom:
				if (reference == epackage.conceptDesignationTerminologyAxiom_DesignatedTerminology)
					scope = scope_ConceptDesignationTerminologyAxiom_designatedTerminology(context)
				else if (reference == epackage.conceptDesignationTerminologyAxiom_DesignatedConcept)
					scope = scope_ConceptDesignationTerminologyAxiom_designatedConcept(context)
			TerminologyExtensionAxiom:
				if (reference == epackage.terminologyExtensionAxiom_ExtendedTerminology)
					scope = scope_TerminologyExtensionAxiom_extendedTerminology(context, reference)
			TerminologyNestingAxiom:
				{}
		} 
		if (null !== scope)
			scope
		else
			super.getScope(context, reference)
	}
	
}