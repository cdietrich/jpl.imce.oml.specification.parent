package jpl.imce.oml.specification.scoping;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import jpl.imce.oml.specification.ecore.Annotation;
import jpl.imce.oml.specification.ecore.AnnotationProperty;
import jpl.imce.oml.specification.ecore.AspectSpecializationAxiom;
import jpl.imce.oml.specification.ecore.BundledTerminologyAxiom;
import jpl.imce.oml.specification.ecore.ConceptDesignationTerminologyAxiom;
import jpl.imce.oml.specification.ecore.ConceptSpecializationAxiom;
import jpl.imce.oml.specification.ecore.DataRelationshipFromEntity;
import jpl.imce.oml.specification.ecore.DataRelationshipFromStructure;
import jpl.imce.oml.specification.ecore.DataRelationshipToScalar;
import jpl.imce.oml.specification.ecore.DataRelationshipToStructure;
import jpl.imce.oml.specification.ecore.DisjointUnionOfConceptsAxiom;
import jpl.imce.oml.specification.ecore.EntityRelationship;
import jpl.imce.oml.specification.ecore.EntityRestrictionAxiom;
import jpl.imce.oml.specification.ecore.EntityScalarDataPropertyExistentialRestrictionAxiom;
import jpl.imce.oml.specification.ecore.EntityScalarDataPropertyRestrictionAxiom;
import jpl.imce.oml.specification.ecore.EntityScalarDataPropertyUniversalRestrictionAxiom;
import jpl.imce.oml.specification.ecore.OMLPackage;
import jpl.imce.oml.specification.ecore.ReifiedRelationshipSpecializationAxiom;
import jpl.imce.oml.specification.ecore.RestrictedDataRange;
import jpl.imce.oml.specification.ecore.RootConceptTaxonomyAxiom;
import jpl.imce.oml.specification.ecore.ScalarOneOfLiteralAxiom;
import jpl.imce.oml.specification.ecore.SpecificDisjointConceptAxiom;
import jpl.imce.oml.specification.ecore.TerminologyBox;
import jpl.imce.oml.specification.ecore.TerminologyBoxAxiom;
import jpl.imce.oml.specification.ecore.TerminologyExtensionAxiom;
import jpl.imce.oml.specification.ecore.TerminologyExtent;
import jpl.imce.oml.specification.ecore.TerminologyNestingAxiom;
import jpl.imce.oml.specification.scoping.OMLScopeExtensions;
import jpl.imce.oml.specification.util.OMLImportNormalizer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class OMLImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
  @Inject
  private IQualifiedNameConverter qnc;
  
  public List<ImportNormalizer> getImportedNamespaceResolvers(final EObject context, final boolean ignoreCase) {
    final ArrayList<ImportNormalizer> res = new ArrayList<ImportNormalizer>();
    boolean _matched = false;
    if (context instanceof TerminologyExtent) {
      _matched=true;
      EList<AnnotationProperty> _annotationProperties = ((TerminologyExtent)context).getAnnotationProperties();
      for (final AnnotationProperty ap : _annotationProperties) {
        String _iri = ap.getIri();
        QualifiedName _qualifiedName = this.qnc.toQualifiedName(_iri);
        String _abbrevIRI = ap.getAbbrevIRI();
        OMLImportNormalizer _oMLImportNormalizer = new OMLImportNormalizer(_qualifiedName, _abbrevIRI);
        res.add(_oMLImportNormalizer);
      }
    }
    if (!_matched) {
      if (context instanceof TerminologyBox) {
        _matched=true;
        TerminologyExtent _extent = ((TerminologyBox)context).extent();
        EList<AnnotationProperty> _annotationProperties = _extent.getAnnotationProperties();
        for (final AnnotationProperty ap : _annotationProperties) {
          String _iri = ap.getIri();
          QualifiedName _qualifiedName = this.qnc.toQualifiedName(_iri);
          String _abbrevIRI = ap.getAbbrevIRI();
          OMLImportNormalizer _oMLImportNormalizer = new OMLImportNormalizer(_qualifiedName, _abbrevIRI);
          res.add(_oMLImportNormalizer);
        }
        EList<TerminologyBoxAxiom> _terminologyBoxAxioms = ((TerminologyBox)context).getTerminologyBoxAxioms();
        for (final TerminologyBoxAxiom e : _terminologyBoxAxioms) {
          TerminologyBox _target = e.target();
          String _iri_1 = _target.iri();
          QualifiedName _qualifiedName_1 = this.qnc.toQualifiedName(_iri_1);
          TerminologyBox _target_1 = e.target();
          String _name = _target_1.name();
          OMLImportNormalizer _oMLImportNormalizer_1 = new OMLImportNormalizer(_qualifiedName_1, _name);
          res.add(_oMLImportNormalizer_1);
        }
      }
    }
    List<ImportNormalizer> _importedNamespaceResolvers = super.getImportedNamespaceResolvers(context, ignoreCase);
    res.addAll(_importedNamespaceResolvers);
    return res;
  }
  
  @Inject
  @Extension
  private OMLScopeExtensions _oMLScopeExtensions;
  
  private final OMLPackage epackage = OMLPackage.eINSTANCE;
  
  public IScope getScope(final EObject context, final EReference reference) {
    IScope _xblockexpression = null;
    {
      IScope scope = null;
      boolean _matched = false;
      if (context instanceof Annotation) {
        _matched=true;
        EReference _annotation_Property = this.epackage.getAnnotation_Property();
        boolean _equals = Objects.equal(reference, _annotation_Property);
        if (_equals) {
          IScope _scope_Annotation_property = this._oMLScopeExtensions.scope_Annotation_property(((Annotation)context), reference);
          scope = _scope_Annotation_property;
        }
      }
      if (!_matched) {
        if (context instanceof EntityRelationship) {
          _matched=true;
          if ((Objects.equal(reference, this.epackage.getEntityRelationship_Source()) || 
            Objects.equal(reference, this.epackage.getEntityRelationship_Target()))) {
            IScope _scope_EntityRelationship = this._oMLScopeExtensions.scope_EntityRelationship(((EntityRelationship)context));
            scope = _scope_EntityRelationship;
          }
        }
      }
      if (!_matched) {
        if (context instanceof AspectSpecializationAxiom) {
          _matched=true;
          EReference _aspectSpecializationAxiom_SubEntity = this.epackage.getAspectSpecializationAxiom_SubEntity();
          boolean _equals = Objects.equal(reference, _aspectSpecializationAxiom_SubEntity);
          if (_equals) {
            IScope _scope_AspectSpecializationAxiom_subEntity = this._oMLScopeExtensions.scope_AspectSpecializationAxiom_subEntity(((AspectSpecializationAxiom)context));
            scope = _scope_AspectSpecializationAxiom_subEntity;
          } else {
            EReference _aspectSpecializationAxiom_SuperAspect = this.epackage.getAspectSpecializationAxiom_SuperAspect();
            boolean _equals_1 = Objects.equal(reference, _aspectSpecializationAxiom_SuperAspect);
            if (_equals_1) {
              IScope _scope_AspectSpecializationAxiom_superAspect = this._oMLScopeExtensions.scope_AspectSpecializationAxiom_superAspect(((AspectSpecializationAxiom)context));
              scope = _scope_AspectSpecializationAxiom_superAspect;
            }
          }
        }
      }
      if (!_matched) {
        if (context instanceof ConceptSpecializationAxiom) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (context instanceof ReifiedRelationshipSpecializationAxiom) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (context instanceof RestrictedDataRange) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (context instanceof DataRelationshipFromEntity) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (context instanceof DataRelationshipFromStructure) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (context instanceof DataRelationshipToScalar) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (context instanceof DataRelationshipToStructure) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (context instanceof EntityRestrictionAxiom) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (context instanceof EntityScalarDataPropertyExistentialRestrictionAxiom) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (context instanceof EntityScalarDataPropertyUniversalRestrictionAxiom) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (context instanceof EntityScalarDataPropertyRestrictionAxiom) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (context instanceof ScalarOneOfLiteralAxiom) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (context instanceof RootConceptTaxonomyAxiom) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (context instanceof SpecificDisjointConceptAxiom) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (context instanceof DisjointUnionOfConceptsAxiom) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (context instanceof BundledTerminologyAxiom) {
          _matched=true;
          EReference _bundledTerminologyAxiom_BundledTerminology = this.epackage.getBundledTerminologyAxiom_BundledTerminology();
          boolean _equals = Objects.equal(reference, _bundledTerminologyAxiom_BundledTerminology);
          if (_equals) {
            IScope _scope_BundledTerminologyAxiom_bundledTerminology = this._oMLScopeExtensions.scope_BundledTerminologyAxiom_bundledTerminology(((BundledTerminologyAxiom)context));
            scope = _scope_BundledTerminologyAxiom_bundledTerminology;
          }
        }
      }
      if (!_matched) {
        if (context instanceof ConceptDesignationTerminologyAxiom) {
          _matched=true;
          EReference _conceptDesignationTerminologyAxiom_DesignatedTerminology = this.epackage.getConceptDesignationTerminologyAxiom_DesignatedTerminology();
          boolean _equals = Objects.equal(reference, _conceptDesignationTerminologyAxiom_DesignatedTerminology);
          if (_equals) {
            IScope _scope_ConceptDesignationTerminologyAxiom_designatedTerminology = this._oMLScopeExtensions.scope_ConceptDesignationTerminologyAxiom_designatedTerminology(((ConceptDesignationTerminologyAxiom)context));
            scope = _scope_ConceptDesignationTerminologyAxiom_designatedTerminology;
          } else {
            EReference _conceptDesignationTerminologyAxiom_DesignatedConcept = this.epackage.getConceptDesignationTerminologyAxiom_DesignatedConcept();
            boolean _equals_1 = Objects.equal(reference, _conceptDesignationTerminologyAxiom_DesignatedConcept);
            if (_equals_1) {
              IScope _scope_ConceptDesignationTerminologyAxiom_designatedConcept = this._oMLScopeExtensions.scope_ConceptDesignationTerminologyAxiom_designatedConcept(((ConceptDesignationTerminologyAxiom)context));
              scope = _scope_ConceptDesignationTerminologyAxiom_designatedConcept;
            }
          }
        }
      }
      if (!_matched) {
        if (context instanceof TerminologyExtensionAxiom) {
          _matched=true;
          EReference _terminologyExtensionAxiom_ExtendedTerminology = this.epackage.getTerminologyExtensionAxiom_ExtendedTerminology();
          boolean _equals = Objects.equal(reference, _terminologyExtensionAxiom_ExtendedTerminology);
          if (_equals) {
            IScope _scope_TerminologyExtensionAxiom_extendedTerminology = this._oMLScopeExtensions.scope_TerminologyExtensionAxiom_extendedTerminology(((TerminologyExtensionAxiom)context), reference);
            scope = _scope_TerminologyExtensionAxiom_extendedTerminology;
          }
        }
      }
      if (!_matched) {
        if (context instanceof TerminologyNestingAxiom) {
          _matched=true;
        }
      }
      IScope _xifexpression = null;
      boolean _notEquals = (!Objects.equal(null, scope));
      if (_notEquals) {
        _xifexpression = scope;
      } else {
        _xifexpression = super.getScope(context, reference);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
