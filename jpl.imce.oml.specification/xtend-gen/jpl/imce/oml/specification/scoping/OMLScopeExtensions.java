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

import com.google.common.base.Function;
import com.google.inject.Inject;
import jpl.imce.oml.specification.ecore.extensions.OMLExtensions;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Pair;

@SuppressWarnings("all")
public class OMLScopeExtensions {
  @Inject
  @Extension
  private OMLExtensions _oMLExtensions;
  
  @Inject
  private IQualifiedNameConverter qnc;
  
  /**
   * The syntax of Annotation involves "@<annotation property abbrev IRI> = <annotation value>".
   * Therefore, construct the resolvable scope of AnnotationProperties
   * in terms of the abbrevIRI of each AnnotationProperty in the TerminologyExtent.
   */
  public IScope scope_Annotation_property(final /* Annotation */Object annotation, final EReference eRef) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field abbrevIRI is undefined for the type EObject"
      + "\nmodule cannot be resolved"
      + "\nextent cannot be resolved"
      + "\nannotationProperties cannot be resolved");
  }
  
  public Object scope_AspectSpecializationAxiom_subEntity(final /* AspectSpecializationAxiom */Object context) {
    throw new Error("Unresolved compilation problems:"
      + "\ngetTbox cannot be resolved"
      + "\nallEntitiesScope cannot be resolved");
  }
  
  public Object scope_AspectSpecializationAxiom_superAspect(final /* AspectSpecializationAxiom */Object context) {
    throw new Error("Unresolved compilation problems:"
      + "\ngetTbox cannot be resolved"
      + "\nallAspectsScope cannot be resolved");
  }
  
  public IScope scope_BundledTerminologyAxiom_bundledTerminology(final /* BundledTerminologyAxiom */Object context) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field nsPrefix is undefined for the type EObject"
      + "\nterminologyBundle cannot be resolved"
      + "\nextent cannot be resolved"
      + "\nterminologies cannot be resolved");
  }
  
  public IScope scope_ConceptDesignationTerminologyAxiom_designatedTerminology(final /* ConceptDesignationTerminologyAxiom */Object context) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field nsPrefix is undefined for the type EObject"
      + "\ngetTbox cannot be resolved"
      + "\nextent cannot be resolved"
      + "\nterminologies cannot be resolved");
  }
  
  public Object scope_ConceptDesignationTerminologyAxiom_designatedConcept(final /* ConceptDesignationTerminologyAxiom */Object context) {
    throw new Error("Unresolved compilation problems:"
      + "\ndesignatedTerminology cannot be resolved"
      + "\nallConceptsScope cannot be resolved");
  }
  
  public Object scope_EntityRelationship(final /* EntityRelationship */Object context) {
    throw new Error("Unresolved compilation problems:"
      + "\ngetTbox cannot be resolved"
      + "\nallEntitiesScope cannot be resolved");
  }
  
  /**
   * The syntax of TerminologyExtensionAxioms involves "extends <extended terminology prefix>".
   * Therefore, construct the resolvable scope of TerminologyBoxes
   * in terms of the nsPrefix of each TerminologyBox in the TerminologyExtent.
   */
  public IScope scope_TerminologyExtensionAxiom_extendedTerminology(final /* TerminologyExtensionAxiom */Object context, final EReference eRef) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field nsPrefix is undefined for the type EObject"
      + "\ngetTbox cannot be resolved"
      + "\nextent cannot be resolved"
      + "\nterminologyGraphs cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nbundles cannot be resolved");
  }
  
  /**
   * Computes an IScope for
   */
  public <T/*  extends TerminologyThing */> IScope terminologyScope(final /* TerminologyBox */Object tbox, final /* Function<TerminologyBox, Iterable<T>> */Object localScopeFunction, final /* Function<Pair<TerminologyBox, T>, QualifiedName> */Object nameFunction) {
    throw new Error("Unresolved compilation problems:"
      + "\nBounds mismatch: The type argument <T> is not a valid substitute for the bounded type parameter <T extends EObject> of the method scopedElementsFor(Iterable<? extends T>, Function<T, QualifiedName>)"
      + "\nType mismatch: cannot convert from Iterable<T> to Iterable<? extends EObject>"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nallImportedTerminologies cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nflatten cannot be resolved");
  }
  
  public <T/*  extends Resource */> QualifiedName importedResourceNameFunction(final /* Pair<TerminologyBox, T> */Object p) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method name() is undefined for the type T"
      + "\nnsPrefix cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved");
  }
  
  public IScope allEntitiesScope(final /* TerminologyBox */Object tbox) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method terminologyScope(TerminologyBox, Function<TerminologyBox, Iterable<T>>, Function<Pair<TerminologyBox, T>, QualifiedName>) from the type OMLScopeExtensions refers to the missing type TerminologyThing"
      + "\nThe method importedResourceNameFunction(Pair<TerminologyBox, T>) from the type OMLScopeExtensions refers to the missing type Resource");
  }
  
  public IScope allAspectsScope(final /* TerminologyBox */Object tbox) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method terminologyScope(TerminologyBox, Function<TerminologyBox, Iterable<T>>, Function<Pair<TerminologyBox, T>, QualifiedName>) from the type OMLScopeExtensions refers to the missing type TerminologyThing"
      + "\nThe method importedResourceNameFunction(Pair<TerminologyBox, T>) from the type OMLScopeExtensions refers to the missing type Resource");
  }
  
  public IScope allConceptsScope(final /* TerminologyBox */Object tbox) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method terminologyScope(TerminologyBox, Function<TerminologyBox, Iterable<T>>, Function<Pair<TerminologyBox, T>, QualifiedName>) from the type OMLScopeExtensions refers to the missing type TerminologyThing"
      + "\nThe method importedResourceNameFunction(Pair<TerminologyBox, T>) from the type OMLScopeExtensions refers to the missing type Resource");
  }
  
  public IScope allReifiedRelationshipsScope(final /* TerminologyBox */Object tbox) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method terminologyScope(TerminologyBox, Function<TerminologyBox, Iterable<T>>, Function<Pair<TerminologyBox, T>, QualifiedName>) from the type OMLScopeExtensions refers to the missing type TerminologyThing"
      + "\nThe method importedResourceNameFunction(Pair<TerminologyBox, T>) from the type OMLScopeExtensions refers to the missing type Resource");
  }
}
