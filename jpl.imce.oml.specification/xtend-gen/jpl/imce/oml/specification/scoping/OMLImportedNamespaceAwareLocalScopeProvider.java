/**
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
package jpl.imce.oml.specification.scoping;

import com.google.inject.Inject;
import java.util.List;
import jpl.imce.oml.specification.scoping.OMLScopeExtensions;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class OMLImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
  @Inject
  private IQualifiedNameConverter qnc;
  
  public List<ImportNormalizer> getImportedNamespaceResolvers(final EObject context, final boolean ignoreCase) {
    throw new Error("Unresolved compilation problems:"
      + "\nTerminologyExtent cannot be resolved to a type."
      + "\nTerminologyBox cannot be resolved to a type."
      + "\nThe method or field annotationProperties is undefined for the type EObject"
      + "\nThe method or field extent is undefined for the type EObject"
      + "\nThe method or field terminologyBoxAxioms is undefined for the type EObject"
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\niri cannot be resolved"
      + "\nabbrevIRI cannot be resolved"
      + "\nannotationProperties cannot be resolved"
      + "\niri cannot be resolved"
      + "\nabbrevIRI cannot be resolved"
      + "\ntarget cannot be resolved"
      + "\niri cannot be resolved"
      + "\ntarget cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  @Inject
  @Extension
  private OMLScopeExtensions _oMLScopeExtensions;
  
  private final Object epackage /* Skipped initializer because of errors */;
  
  public IScope getScope(final EObject context, final EReference reference) {
    throw new Error("Unresolved compilation problems:"
      + "\nAnnotation cannot be resolved to a type."
      + "\nEntityRelationship cannot be resolved to a type."
      + "\nAspectSpecializationAxiom cannot be resolved to a type."
      + "\nConceptSpecializationAxiom cannot be resolved to a type."
      + "\nReifiedRelationshipSpecializationAxiom cannot be resolved to a type."
      + "\nRestrictedDataRange cannot be resolved to a type."
      + "\nDataRelationshipFromEntity cannot be resolved to a type."
      + "\nDataRelationshipFromStructure cannot be resolved to a type."
      + "\nDataRelationshipToScalar cannot be resolved to a type."
      + "\nDataRelationshipToStructure cannot be resolved to a type."
      + "\nEntityRestrictionAxiom cannot be resolved to a type."
      + "\nEntityScalarDataPropertyExistentialRestrictionAxiom cannot be resolved to a type."
      + "\nEntityScalarDataPropertyUniversalRestrictionAxiom cannot be resolved to a type."
      + "\nEntityScalarDataPropertyRestrictionAxiom cannot be resolved to a type."
      + "\nScalarOneOfLiteralAxiom cannot be resolved to a type."
      + "\nRootConceptTaxonomyAxiom cannot be resolved to a type."
      + "\nSpecificDisjointConceptAxiom cannot be resolved to a type."
      + "\nDisjointUnionOfConceptsAxiom cannot be resolved to a type."
      + "\nBundledTerminologyAxiom cannot be resolved to a type."
      + "\nConceptDesignationTerminologyAxiom cannot be resolved to a type."
      + "\nTerminologyExtensionAxiom cannot be resolved to a type."
      + "\nTerminologyNestingAxiom cannot be resolved to a type."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nThe field OMLImportedNamespaceAwareLocalScopeProvider.epackage refers to the missing type Object"
      + "\nThe method scope_Annotation_property(Annotation, EReference) from the type OMLScopeExtensions refers to the missing type Annotation"
      + "\nThe field OMLImportedNamespaceAwareLocalScopeProvider.epackage refers to the missing type Object"
      + "\nThe field OMLImportedNamespaceAwareLocalScopeProvider.epackage refers to the missing type Object"
      + "\nThe method scope_EntityRelationship(EntityRelationship) from the type OMLScopeExtensions refers to the missing type Object"
      + "\nThe field OMLImportedNamespaceAwareLocalScopeProvider.epackage refers to the missing type Object"
      + "\nThe method scope_AspectSpecializationAxiom_subEntity(AspectSpecializationAxiom) from the type OMLScopeExtensions refers to the missing type Object"
      + "\nThe field OMLImportedNamespaceAwareLocalScopeProvider.epackage refers to the missing type Object"
      + "\nThe method scope_AspectSpecializationAxiom_superAspect(AspectSpecializationAxiom) from the type OMLScopeExtensions refers to the missing type Object"
      + "\nThe field OMLImportedNamespaceAwareLocalScopeProvider.epackage refers to the missing type Object"
      + "\nThe method scope_BundledTerminologyAxiom_bundledTerminology(BundledTerminologyAxiom) from the type OMLScopeExtensions refers to the missing type BundledTerminologyAxiom"
      + "\nThe field OMLImportedNamespaceAwareLocalScopeProvider.epackage refers to the missing type Object"
      + "\nThe method scope_ConceptDesignationTerminologyAxiom_designatedTerminology(ConceptDesignationTerminologyAxiom) from the type OMLScopeExtensions refers to the missing type ConceptDesignationTerminologyAxiom"
      + "\nThe field OMLImportedNamespaceAwareLocalScopeProvider.epackage refers to the missing type Object"
      + "\nThe method scope_ConceptDesignationTerminologyAxiom_designatedConcept(ConceptDesignationTerminologyAxiom) from the type OMLScopeExtensions refers to the missing type Object"
      + "\nThe field OMLImportedNamespaceAwareLocalScopeProvider.epackage refers to the missing type Object"
      + "\nThe method scope_TerminologyExtensionAxiom_extendedTerminology(TerminologyExtensionAxiom, EReference) from the type OMLScopeExtensions refers to the missing type TerminologyExtensionAxiom"
      + "\nannotation_Property cannot be resolved"
      + "\nentityRelationship_Source cannot be resolved"
      + "\nentityRelationship_Target cannot be resolved"
      + "\naspectSpecializationAxiom_SubEntity cannot be resolved"
      + "\naspectSpecializationAxiom_SuperAspect cannot be resolved"
      + "\nbundledTerminologyAxiom_BundledTerminology cannot be resolved"
      + "\nconceptDesignationTerminologyAxiom_DesignatedTerminology cannot be resolved"
      + "\nconceptDesignationTerminologyAxiom_DesignatedConcept cannot be resolved"
      + "\nterminologyExtensionAxiom_ExtendedTerminology cannot be resolved");
  }
}
