package jpl.imce.oml.specification.ecore.extensions;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import jpl.imce.oml.specification.ecore.Aspect;
import jpl.imce.oml.specification.ecore.Bundle;
import jpl.imce.oml.specification.ecore.Concept;
import jpl.imce.oml.specification.ecore.Entity;
import jpl.imce.oml.specification.ecore.ReifiedRelationship;
import jpl.imce.oml.specification.ecore.SpecializationAxiom;
import jpl.imce.oml.specification.ecore.TerminologyBox;
import jpl.imce.oml.specification.ecore.TerminologyBoxAxiom;
import jpl.imce.oml.specification.ecore.TerminologyBoxStatement;
import jpl.imce.oml.specification.ecore.TerminologyExtensionAxiom;
import jpl.imce.oml.specification.ecore.TerminologyExtent;
import jpl.imce.oml.specification.ecore.TerminologyGraph;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class OMLExtensions {
  public Iterable<TerminologyBox> terminologies(final TerminologyExtent it) {
    List<TerminologyBox> _xblockexpression = null;
    {
      final ArrayList<TerminologyBox> result = Lists.<TerminologyBox>newArrayList();
      EList<TerminologyGraph> _terminologyGraphs = it.getTerminologyGraphs();
      result.addAll(_terminologyGraphs);
      EList<Bundle> _bundles = it.getBundles();
      result.addAll(_bundles);
      _xblockexpression = ImmutableList.<TerminologyBox>copyOf(result);
    }
    return _xblockexpression;
  }
  
  public void phasedResolveAll(final TerminologyExtent it) {
    EList<TerminologyGraph> _terminologyGraphs = it.getTerminologyGraphs();
    final Consumer<TerminologyGraph> _function = new Consumer<TerminologyGraph>() {
      public void accept(final TerminologyGraph it) {
        EList<TerminologyBoxAxiom> _terminologyBoxAxioms = it.getTerminologyBoxAxioms();
        final Consumer<TerminologyBoxAxiom> _function = new Consumer<TerminologyBoxAxiom>() {
          public void accept(final TerminologyBoxAxiom it) {
            boolean _matched = false;
            if (it instanceof TerminologyExtensionAxiom) {
              _matched=true;
              EcoreUtil.resolveAll(it);
            }
          }
        };
        _terminologyBoxAxioms.forEach(_function);
      }
    };
    _terminologyGraphs.forEach(_function);
    EList<TerminologyGraph> _terminologyGraphs_1 = it.getTerminologyGraphs();
    final Consumer<TerminologyGraph> _function_1 = new Consumer<TerminologyGraph>() {
      public void accept(final TerminologyGraph it) {
        EList<TerminologyBoxAxiom> _terminologyBoxAxioms = it.getTerminologyBoxAxioms();
        final Consumer<TerminologyBoxAxiom> _function = new Consumer<TerminologyBoxAxiom>() {
          public void accept(final TerminologyBoxAxiom it) {
            boolean _matched = false;
            if (it instanceof SpecializationAxiom) {
              _matched=true;
              EcoreUtil.resolveAll(it);
            }
          }
        };
        _terminologyBoxAxioms.forEach(_function);
      }
    };
    _terminologyGraphs_1.forEach(_function_1);
  }
  
  public Iterable<TerminologyBox> allImportedTerminologies(final TerminologyBox it) {
    ArrayList<TerminologyBox> _newArrayList = Lists.<TerminologyBox>newArrayList(it);
    ArrayList<TerminologyBox> _newArrayList_1 = Lists.<TerminologyBox>newArrayList();
    return this.collectAllImportedTerminologies(_newArrayList, _newArrayList_1);
  }
  
  public final Iterable<TerminologyBox> collectAllImportedTerminologies(final ArrayList<TerminologyBox> queue, final ArrayList<TerminologyBox> acc) {
    Iterable<TerminologyBox> _xblockexpression = null;
    {
      boolean _isEmpty = queue.isEmpty();
      if (_isEmpty) {
        return acc;
      }
      final TerminologyBox tbox = IterableExtensions.<TerminologyBox>head(queue);
      queue.remove(tbox);
      EList<TerminologyBoxAxiom> _terminologyBoxAxioms = tbox.getTerminologyBoxAxioms();
      final Function1<TerminologyBoxAxiom, TerminologyBox> _function = new Function1<TerminologyBoxAxiom, TerminologyBox>() {
        public TerminologyBox apply(final TerminologyBoxAxiom it) {
          return it.target();
        }
      };
      final List<TerminologyBox> inc = ListExtensions.<TerminologyBoxAxiom, TerminologyBox>map(_terminologyBoxAxioms, _function);
      queue.addAll(inc);
      acc.addAll(inc);
      _xblockexpression = this.collectAllImportedTerminologies(queue, acc);
    }
    return _xblockexpression;
  }
  
  public Iterable<Entity> localEntities(final TerminologyBox it) {
    EList<TerminologyBoxStatement> _boxStatements = it.getBoxStatements();
    return Iterables.<Entity>filter(_boxStatements, Entity.class);
  }
  
  public Iterable<Entity> allEntities(final TerminologyBox it) {
    Iterable<Entity> _localEntities = this.localEntities(it);
    Iterable<TerminologyBox> _allImportedTerminologies = this.allImportedTerminologies(it);
    final Function1<TerminologyBox, Iterable<Entity>> _function = new Function1<TerminologyBox, Iterable<Entity>>() {
      public Iterable<Entity> apply(final TerminologyBox it) {
        return OMLExtensions.this.localEntities(it);
      }
    };
    Iterable<Iterable<Entity>> _map = IterableExtensions.<TerminologyBox, Iterable<Entity>>map(_allImportedTerminologies, _function);
    Iterable<Entity> _flatten = Iterables.<Entity>concat(_map);
    return Iterables.<Entity>concat(_localEntities, _flatten);
  }
  
  public Iterable<Aspect> localAspects(final TerminologyBox it) {
    EList<TerminologyBoxStatement> _boxStatements = it.getBoxStatements();
    return Iterables.<Aspect>filter(_boxStatements, Aspect.class);
  }
  
  public Iterable<Aspect> allAspects(final TerminologyBox it) {
    Iterable<Aspect> _localAspects = this.localAspects(it);
    Iterable<TerminologyBox> _allImportedTerminologies = this.allImportedTerminologies(it);
    final Function1<TerminologyBox, Iterable<Aspect>> _function = new Function1<TerminologyBox, Iterable<Aspect>>() {
      public Iterable<Aspect> apply(final TerminologyBox it) {
        return OMLExtensions.this.localAspects(it);
      }
    };
    Iterable<Iterable<Aspect>> _map = IterableExtensions.<TerminologyBox, Iterable<Aspect>>map(_allImportedTerminologies, _function);
    Iterable<Aspect> _flatten = Iterables.<Aspect>concat(_map);
    return Iterables.<Aspect>concat(_localAspects, _flatten);
  }
  
  public Iterable<Concept> localConcepts(final TerminologyBox it) {
    EList<TerminologyBoxStatement> _boxStatements = it.getBoxStatements();
    return Iterables.<Concept>filter(_boxStatements, Concept.class);
  }
  
  public Iterable<Concept> allConcepts(final TerminologyBox it) {
    Iterable<Concept> _localConcepts = this.localConcepts(it);
    Iterable<TerminologyBox> _allImportedTerminologies = this.allImportedTerminologies(it);
    final Function1<TerminologyBox, Iterable<Concept>> _function = new Function1<TerminologyBox, Iterable<Concept>>() {
      public Iterable<Concept> apply(final TerminologyBox it) {
        return OMLExtensions.this.localConcepts(it);
      }
    };
    Iterable<Iterable<Concept>> _map = IterableExtensions.<TerminologyBox, Iterable<Concept>>map(_allImportedTerminologies, _function);
    Iterable<Concept> _flatten = Iterables.<Concept>concat(_map);
    return Iterables.<Concept>concat(_localConcepts, _flatten);
  }
  
  public Iterable<ReifiedRelationship> localReifiedRelationships(final TerminologyBox it) {
    EList<TerminologyBoxStatement> _boxStatements = it.getBoxStatements();
    return Iterables.<ReifiedRelationship>filter(_boxStatements, ReifiedRelationship.class);
  }
  
  public Iterable<ReifiedRelationship> allReifiedRelationships(final TerminologyBox it) {
    Iterable<ReifiedRelationship> _localReifiedRelationships = this.localReifiedRelationships(it);
    Iterable<TerminologyBox> _allImportedTerminologies = this.allImportedTerminologies(it);
    final Function1<TerminologyBox, Iterable<ReifiedRelationship>> _function = new Function1<TerminologyBox, Iterable<ReifiedRelationship>>() {
      public Iterable<ReifiedRelationship> apply(final TerminologyBox it) {
        return OMLExtensions.this.localReifiedRelationships(it);
      }
    };
    Iterable<Iterable<ReifiedRelationship>> _map = IterableExtensions.<TerminologyBox, Iterable<ReifiedRelationship>>map(_allImportedTerminologies, _function);
    Iterable<ReifiedRelationship> _flatten = Iterables.<ReifiedRelationship>concat(_map);
    return Iterables.<ReifiedRelationship>concat(_localReifiedRelationships, _flatten);
  }
}
