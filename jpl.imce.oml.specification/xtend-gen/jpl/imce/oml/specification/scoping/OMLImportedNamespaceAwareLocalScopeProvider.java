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
import java.util.ArrayList;
import java.util.List;
import jpl.imce.oml.specification.ecore.AnnotationProperty;
import jpl.imce.oml.specification.ecore.OMLPackage;
import jpl.imce.oml.specification.ecore.TerminologyBox;
import jpl.imce.oml.specification.ecore.TerminologyBoxAxiom;
import jpl.imce.oml.specification.ecore.TerminologyExtent;
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
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Annotation to Annotation"
      + "\nType mismatch: cannot convert from EntityRelationship to EntityRelationship"
      + "\nType mismatch: cannot convert from AspectSpecializationAxiom to AspectSpecializationAxiom"
      + "\nType mismatch: cannot convert from AspectSpecializationAxiom to AspectSpecializationAxiom"
      + "\nType mismatch: cannot convert from BundledTerminologyAxiom to BundledTerminologyAxiom"
      + "\nType mismatch: cannot convert from ConceptDesignationTerminologyAxiom to ConceptDesignationTerminologyAxiom"
      + "\nType mismatch: cannot convert from ConceptDesignationTerminologyAxiom to ConceptDesignationTerminologyAxiom"
      + "\nType mismatch: cannot convert from TerminologyExtensionAxiom to TerminologyExtensionAxiom");
  }
}
