package jpl.imce.oml.specification.ecore.extensions;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import jpl.imce.oml.specification.ecore.Aspect;
import jpl.imce.oml.specification.ecore.Concept;
import jpl.imce.oml.specification.ecore.Entity;
import jpl.imce.oml.specification.ecore.ReifiedRelationship;
import jpl.imce.oml.specification.ecore.SpecializationAxiom;
import jpl.imce.oml.specification.ecore.TerminologyBox;
import jpl.imce.oml.specification.ecore.TerminologyBoxAxiom;
import jpl.imce.oml.specification.ecore.TerminologyExtensionAxiom;
import jpl.imce.oml.specification.ecore.TerminologyExtent;
import jpl.imce.oml.specification.ecore.TerminologyGraph;
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
      result.addAll(it.getTerminologyGraphs());
      result.addAll(it.getBundles());
      _xblockexpression = ImmutableList.<TerminologyBox>copyOf(result);
    }
    return _xblockexpression;
  }
  
  public void phasedResolveAll(final TerminologyExtent it) {
    final Consumer<TerminologyGraph> _function = (TerminologyGraph it_1) -> {
      final Consumer<TerminologyBoxAxiom> _function_1 = (TerminologyBoxAxiom it_2) -> {
        boolean _matched = false;
        if (it_2 instanceof TerminologyExtensionAxiom) {
          _matched=true;
          EcoreUtil.resolveAll(it_2);
        }
      };
      it_1.getTerminologyBoxAxioms().forEach(_function_1);
    };
    it.getTerminologyGraphs().forEach(_function);
    final Consumer<TerminologyGraph> _function_1 = (TerminologyGraph it_1) -> {
      final Consumer<TerminologyBoxAxiom> _function_2 = (TerminologyBoxAxiom it_2) -> {
        boolean _matched = false;
        if (it_2 instanceof SpecializationAxiom) {
          _matched=true;
          EcoreUtil.resolveAll(it_2);
        }
      };
      it_1.getTerminologyBoxAxioms().forEach(_function_2);
    };
    it.getTerminologyGraphs().forEach(_function_1);
  }
  
  public Iterable<TerminologyBox> allImportedTerminologies(final TerminologyBox it) {
    return this.collectAllImportedTerminologies(Lists.<TerminologyBox>newArrayList(it), Lists.<TerminologyBox>newArrayList());
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
      final Function1<TerminologyBoxAxiom, TerminologyBox> _function = (TerminologyBoxAxiom it) -> {
        return it.target();
      };
      final List<TerminologyBox> inc = ListExtensions.<TerminologyBoxAxiom, TerminologyBox>map(tbox.getTerminologyBoxAxioms(), _function);
      queue.addAll(inc);
      acc.addAll(inc);
      _xblockexpression = this.collectAllImportedTerminologies(queue, acc);
    }
    return _xblockexpression;
  }
  
  public Iterable<Entity> localEntities(final TerminologyBox it) {
    return Iterables.<Entity>filter(it.getBoxStatements(), Entity.class);
  }
  
  public Iterable<Entity> allEntities(final TerminologyBox it) {
    Iterable<Entity> _localEntities = this.localEntities(it);
    final Function1<TerminologyBox, Iterable<Entity>> _function = (TerminologyBox it_1) -> {
      return this.localEntities(it_1);
    };
    Iterable<Entity> _flatten = Iterables.<Entity>concat(IterableExtensions.<TerminologyBox, Iterable<Entity>>map(this.allImportedTerminologies(it), _function));
    return Iterables.<Entity>concat(_localEntities, _flatten);
  }
  
  public Iterable<Aspect> localAspects(final TerminologyBox it) {
    return Iterables.<Aspect>filter(it.getBoxStatements(), Aspect.class);
  }
  
  public Iterable<Aspect> allAspects(final TerminologyBox it) {
    Iterable<Aspect> _localAspects = this.localAspects(it);
    final Function1<TerminologyBox, Iterable<Aspect>> _function = (TerminologyBox it_1) -> {
      return this.localAspects(it_1);
    };
    Iterable<Aspect> _flatten = Iterables.<Aspect>concat(IterableExtensions.<TerminologyBox, Iterable<Aspect>>map(this.allImportedTerminologies(it), _function));
    return Iterables.<Aspect>concat(_localAspects, _flatten);
  }
  
  public Iterable<Concept> localConcepts(final TerminologyBox it) {
    return Iterables.<Concept>filter(it.getBoxStatements(), Concept.class);
  }
  
  public Iterable<Concept> allConcepts(final TerminologyBox it) {
    Iterable<Concept> _localConcepts = this.localConcepts(it);
    final Function1<TerminologyBox, Iterable<Concept>> _function = (TerminologyBox it_1) -> {
      return this.localConcepts(it_1);
    };
    Iterable<Concept> _flatten = Iterables.<Concept>concat(IterableExtensions.<TerminologyBox, Iterable<Concept>>map(this.allImportedTerminologies(it), _function));
    return Iterables.<Concept>concat(_localConcepts, _flatten);
  }
  
  public Iterable<ReifiedRelationship> localReifiedRelationships(final TerminologyBox it) {
    return Iterables.<ReifiedRelationship>filter(it.getBoxStatements(), ReifiedRelationship.class);
  }
  
  public Iterable<ReifiedRelationship> allReifiedRelationships(final TerminologyBox it) {
    Iterable<ReifiedRelationship> _localReifiedRelationships = this.localReifiedRelationships(it);
    final Function1<TerminologyBox, Iterable<ReifiedRelationship>> _function = (TerminologyBox it_1) -> {
      return this.localReifiedRelationships(it_1);
    };
    Iterable<ReifiedRelationship> _flatten = Iterables.<ReifiedRelationship>concat(IterableExtensions.<TerminologyBox, Iterable<ReifiedRelationship>>map(this.allImportedTerminologies(it), _function));
    return Iterables.<ReifiedRelationship>concat(_localReifiedRelationships, _flatten);
  }
}
