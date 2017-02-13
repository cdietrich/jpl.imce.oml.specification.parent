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
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import java.util.ArrayList;
import jpl.imce.oml.specification.ecore.Annotation;
import jpl.imce.oml.specification.ecore.AnnotationProperty;
import jpl.imce.oml.specification.ecore.Aspect;
import jpl.imce.oml.specification.ecore.AspectSpecializationAxiom;
import jpl.imce.oml.specification.ecore.Bundle;
import jpl.imce.oml.specification.ecore.BundledTerminologyAxiom;
import jpl.imce.oml.specification.ecore.Concept;
import jpl.imce.oml.specification.ecore.ConceptDesignationTerminologyAxiom;
import jpl.imce.oml.specification.ecore.Context;
import jpl.imce.oml.specification.ecore.Entity;
import jpl.imce.oml.specification.ecore.EntityRelationship;
import jpl.imce.oml.specification.ecore.ReifiedRelationship;
import jpl.imce.oml.specification.ecore.Resource;
import jpl.imce.oml.specification.ecore.TerminologyBox;
import jpl.imce.oml.specification.ecore.TerminologyExtensionAxiom;
import jpl.imce.oml.specification.ecore.TerminologyExtent;
import jpl.imce.oml.specification.ecore.TerminologyGraph;
import jpl.imce.oml.specification.ecore.TerminologyThing;
import jpl.imce.oml.specification.ecore.extensions.OMLExtensions;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
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
  public IScope scope_Annotation_property(final Annotation annotation, final EReference eRef) {
    Context _context = annotation.getContext();
    TerminologyExtent _extent = _context.extent();
    EList<AnnotationProperty> _annotationProperties = _extent.getAnnotationProperties();
    final Function<AnnotationProperty, QualifiedName> _function = (AnnotationProperty it) -> {
      String _abbrevIRI = it.getAbbrevIRI();
      return this.qnc.toQualifiedName(_abbrevIRI);
    };
    return Scopes.<AnnotationProperty>scopeFor(_annotationProperties, _function, 
      IScope.NULLSCOPE);
  }
  
  public IScope scope_AspectSpecializationAxiom_subEntity(final AspectSpecializationAxiom context) {
    TerminologyBox _tbox = context.getTbox();
    return this.allEntitiesScope(_tbox);
  }
  
  public IScope scope_AspectSpecializationAxiom_superAspect(final AspectSpecializationAxiom context) {
    TerminologyBox _tbox = context.getTbox();
    return this.allAspectsScope(_tbox);
  }
  
  public IScope scope_BundledTerminologyAxiom_bundledTerminology(final BundledTerminologyAxiom context) {
    Bundle _terminologyBundle = context.getTerminologyBundle();
    TerminologyExtent _extent = _terminologyBundle.extent();
    Iterable<TerminologyBox> _terminologies = this._oMLExtensions.terminologies(_extent);
    final Function<TerminologyBox, QualifiedName> _function = (TerminologyBox it) -> {
      String _nsPrefix = it.nsPrefix();
      return this.qnc.toQualifiedName(_nsPrefix);
    };
    return Scopes.<TerminologyBox>scopeFor(_terminologies, _function, 
      IScope.NULLSCOPE);
  }
  
  public IScope scope_ConceptDesignationTerminologyAxiom_designatedTerminology(final ConceptDesignationTerminologyAxiom context) {
    TerminologyBox _tbox = context.getTbox();
    TerminologyExtent _extent = _tbox.extent();
    Iterable<TerminologyBox> _terminologies = this._oMLExtensions.terminologies(_extent);
    final Function<TerminologyBox, QualifiedName> _function = (TerminologyBox it) -> {
      String _nsPrefix = it.nsPrefix();
      return this.qnc.toQualifiedName(_nsPrefix);
    };
    return Scopes.<TerminologyBox>scopeFor(_terminologies, _function, 
      IScope.NULLSCOPE);
  }
  
  public IScope scope_ConceptDesignationTerminologyAxiom_designatedConcept(final ConceptDesignationTerminologyAxiom context) {
    TerminologyBox _designatedTerminology = context.getDesignatedTerminology();
    return this.allConceptsScope(_designatedTerminology);
  }
  
  public IScope scope_EntityRelationship(final EntityRelationship context) {
    TerminologyBox _tbox = context.getTbox();
    return this.allEntitiesScope(_tbox);
  }
  
  /**
   * The syntax of TerminologyExtensionAxioms involves "extends <extended terminology prefix>".
   * Therefore, construct the resolvable scope of TerminologyBoxes
   * in terms of the nsPrefix of each TerminologyBox in the TerminologyExtent.
   */
  public IScope scope_TerminologyExtensionAxiom_extendedTerminology(final TerminologyExtensionAxiom context, final EReference eRef) {
    IScope _xblockexpression = null;
    {
      TerminologyBox _tbox = context.getTbox();
      final TerminologyExtent ext = _tbox.extent();
      EList<TerminologyGraph> _terminologyGraphs = ext.getTerminologyGraphs();
      EList<Bundle> _bundles = ext.getBundles();
      final Iterable<TerminologyBox> tboxes = Iterables.<TerminologyBox>concat(_terminologyGraphs, _bundles);
      final Function<TerminologyBox, QualifiedName> _function = (TerminologyBox it) -> {
        String _nsPrefix = it.nsPrefix();
        return this.qnc.toQualifiedName(_nsPrefix);
      };
      _xblockexpression = Scopes.<TerminologyBox>scopeFor(tboxes, _function, 
        IScope.NULLSCOPE);
    }
    return _xblockexpression;
  }
  
  /**
   * Computes an IScope for
   */
  public <T extends TerminologyThing> IScope terminologyScope(final TerminologyBox tbox, final Function<TerminologyBox, Iterable<T>> localScopeFunction, final Function<Pair<TerminologyBox, T>, QualifiedName> nameFunction) {
    SimpleScope _xblockexpression = null;
    {
      final ArrayList<IEObjectDescription> result = Lists.<IEObjectDescription>newArrayList();
      Iterable<T> _apply = localScopeFunction.apply(tbox);
      Iterable<IEObjectDescription> _scopedElementsFor = Scopes.scopedElementsFor(_apply);
      Iterables.<IEObjectDescription>addAll(result, _scopedElementsFor);
      Iterable<TerminologyBox> _allImportedTerminologies = this._oMLExtensions.allImportedTerminologies(tbox);
      final Function1<TerminologyBox, Iterable<IEObjectDescription>> _function = (TerminologyBox importedTbox) -> {
        Iterable<T> _apply_1 = localScopeFunction.apply(importedTbox);
        final Function<T, QualifiedName> _function_1 = (T importedThing) -> {
          Pair<TerminologyBox, T> _of = Pair.<TerminologyBox, T>of(importedTbox, importedThing);
          return nameFunction.apply(_of);
        };
        return Scopes.<T>scopedElementsFor(_apply_1, _function_1);
      };
      Iterable<Iterable<IEObjectDescription>> _map = IterableExtensions.<TerminologyBox, Iterable<IEObjectDescription>>map(_allImportedTerminologies, _function);
      Iterable<IEObjectDescription> _flatten = Iterables.<IEObjectDescription>concat(_map);
      Iterables.<IEObjectDescription>addAll(result, _flatten);
      _xblockexpression = new SimpleScope(result);
    }
    return _xblockexpression;
  }
  
  public <T extends Resource> QualifiedName importedResourceNameFunction(final Pair<TerminologyBox, T> p) {
    TerminologyBox _key = p.getKey();
    String _nsPrefix = _key.nsPrefix();
    String _plus = (_nsPrefix + ":");
    T _value = p.getValue();
    String _name = _value.name();
    String _plus_1 = (_plus + _name);
    return this.qnc.toQualifiedName(_plus_1);
  }
  
  public IScope allEntitiesScope(final TerminologyBox tbox) {
    final Function<TerminologyBox, Iterable<Entity>> _function = (TerminologyBox it) -> {
      return this._oMLExtensions.localEntities(it);
    };
    final Function<Pair<TerminologyBox, Entity>, QualifiedName> _function_1 = (Pair<TerminologyBox, Entity> it) -> {
      return this.<Entity>importedResourceNameFunction(it);
    };
    return this.<Entity>terminologyScope(tbox, _function, _function_1);
  }
  
  public IScope allAspectsScope(final TerminologyBox tbox) {
    final Function<TerminologyBox, Iterable<Aspect>> _function = (TerminologyBox it) -> {
      return this._oMLExtensions.localAspects(it);
    };
    final Function<Pair<TerminologyBox, Aspect>, QualifiedName> _function_1 = (Pair<TerminologyBox, Aspect> it) -> {
      return this.<Aspect>importedResourceNameFunction(it);
    };
    return this.<Aspect>terminologyScope(tbox, _function, _function_1);
  }
  
  public IScope allConceptsScope(final TerminologyBox tbox) {
    final Function<TerminologyBox, Iterable<Concept>> _function = (TerminologyBox it) -> {
      return this._oMLExtensions.localConcepts(it);
    };
    final Function<Pair<TerminologyBox, Concept>, QualifiedName> _function_1 = (Pair<TerminologyBox, Concept> it) -> {
      return this.<Concept>importedResourceNameFunction(it);
    };
    return this.<Concept>terminologyScope(tbox, _function, _function_1);
  }
  
  public IScope allReifiedRelationshipsScope(final TerminologyBox tbox) {
    final Function<TerminologyBox, Iterable<ReifiedRelationship>> _function = (TerminologyBox it) -> {
      return this._oMLExtensions.localReifiedRelationships(it);
    };
    final Function<Pair<TerminologyBox, ReifiedRelationship>, QualifiedName> _function_1 = (Pair<TerminologyBox, ReifiedRelationship> it) -> {
      return this.<ReifiedRelationship>importedResourceNameFunction(it);
    };
    return this.<ReifiedRelationship>terminologyScope(tbox, _function, _function_1);
  }
}
