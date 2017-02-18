/**
 * Copyright 2016 California Institute of Technology (\"Caltech\").
 * U.S. Government sponsorship acknowledged.
 * 
 * Licensed under the Apache License, Version 2.0 (the \"License\");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an \"AS IS\" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jpl.imce.oml.specification.formatting2;

import java.util.Arrays;
import jpl.imce.oml.specification.ecore.Annotation;
import jpl.imce.oml.specification.ecore.AnnotationProperty;
import jpl.imce.oml.specification.ecore.Aspect;
import jpl.imce.oml.specification.ecore.Bundle;
import jpl.imce.oml.specification.ecore.DescriptionBox;
import jpl.imce.oml.specification.ecore.OMLPackage;
import jpl.imce.oml.specification.ecore.TerminologyBoxAxiom;
import jpl.imce.oml.specification.ecore.TerminologyBoxStatement;
import jpl.imce.oml.specification.ecore.TerminologyExtent;
import jpl.imce.oml.specification.ecore.TerminologyGraph;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegionsFinder;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class OntologicalModelingLanguageFormatter extends AbstractFormatter2 {
  protected void _format(final TerminologyExtent terminologyExtent, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.<TerminologyExtent>prepend(terminologyExtent, _function);
    EList<AnnotationProperty> _annotationProperties = terminologyExtent.getAnnotationProperties();
    for (final AnnotationProperty annotationProperty : _annotationProperties) {
      document.<AnnotationProperty>format(annotationProperty);
    }
    EList<TerminologyGraph> _terminologyGraphs = terminologyExtent.getTerminologyGraphs();
    for (final TerminologyGraph terminologyGraph : _terminologyGraphs) {
      document.<TerminologyGraph>format(terminologyGraph);
    }
    EList<Bundle> _bundles = terminologyExtent.getBundles();
    for (final Bundle bundle : _bundles) {
      document.<Bundle>format(bundle);
    }
    EList<DescriptionBox> _descriptions = terminologyExtent.getDescriptions();
    for (final DescriptionBox description : _descriptions) {
      document.<DescriptionBox>format(description);
    }
  }
  
  protected void _format(final AnnotationProperty annotationProperty, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.<AnnotationProperty>prepend(annotationProperty, _function);
    ISemanticRegionsFinder _regionFor = this.textRegionExtensions.regionFor(annotationProperty);
    ISemanticRegion _keyword = _regionFor.keyword("annotationProperty");
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.append(_keyword, _function_1);
    ISemanticRegionsFinder _regionFor_1 = this.textRegionExtensions.regionFor(annotationProperty);
    EAttribute _annotationProperty_AbbrevIRI = OMLPackage.eINSTANCE.getAnnotationProperty_AbbrevIRI();
    ISemanticRegion _feature = _regionFor_1.feature(_annotationProperty_AbbrevIRI);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.prepend(_feature, _function_2);
    ISemanticRegionsFinder _regionFor_2 = this.textRegionExtensions.regionFor(annotationProperty);
    ISemanticRegion _keyword_1 = _regionFor_2.keyword("=");
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.surround(_keyword_1, _function_3);
    ISemanticRegionsFinder _regionFor_3 = this.textRegionExtensions.regionFor(annotationProperty);
    EAttribute _annotationProperty_Iri = OMLPackage.eINSTANCE.getAnnotationProperty_Iri();
    ISemanticRegion _feature_1 = _regionFor_3.feature(_annotationProperty_Iri);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(_feature_1, _function_4);
  }
  
  protected void _format(final Annotation annotation, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.<Annotation>prepend(annotation, _function);
    ISemanticRegionsFinder _regionFor = this.textRegionExtensions.regionFor(annotation);
    ISemanticRegion _keyword = _regionFor.keyword("annotation");
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.append(_keyword, _function_1);
    ISemanticRegionsFinder _regionFor_1 = this.textRegionExtensions.regionFor(annotation);
    ISemanticRegion _keyword_1 = _regionFor_1.keyword("=");
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.surround(_keyword_1, _function_2);
  }
  
  protected void _format(final TerminologyGraph terminologyGraph, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.<TerminologyGraph>prepend(terminologyGraph, _function);
    ISemanticRegionsFinder _regionFor = this.textRegionExtensions.regionFor(terminologyGraph);
    EAttribute _terminologyBox_Kind = OMLPackage.eINSTANCE.getTerminologyBox_Kind();
    ISemanticRegion _feature = _regionFor.feature(_terminologyBox_Kind);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.append(_feature, _function_1);
    ISemanticRegionsFinder _regionFor_1 = this.textRegionExtensions.regionFor(terminologyGraph);
    ISemanticRegion _keyword = _regionFor_1.keyword("terminology");
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.surround(_keyword, _function_2);
    ISemanticRegionsFinder _regionFor_2 = this.textRegionExtensions.regionFor(terminologyGraph);
    EAttribute _module_Iri = OMLPackage.eINSTANCE.getModule_Iri();
    ISemanticRegion _feature_1 = _regionFor_2.feature(_module_Iri);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.surround(_feature_1, _function_3);
    ISemanticRegionsFinder _regionFor_3 = this.textRegionExtensions.regionFor(terminologyGraph);
    final ISemanticRegion lcurly = _regionFor_3.keyword("{");
    ISemanticRegionsFinder _regionFor_4 = this.textRegionExtensions.regionFor(terminologyGraph);
    final ISemanticRegion rcurly = _regionFor_4.keyword("}");
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.prepend(lcurly, _function_4);
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(lcurly, _function_5);
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(lcurly, rcurly, _function_6);
    final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(rcurly, _function_7);
    EList<Annotation> _annotations = terminologyGraph.getAnnotations();
    for (final Annotation annotations : _annotations) {
      document.<Annotation>format(annotations);
    }
    EList<TerminologyBoxAxiom> _terminologyBoxAxioms = terminologyGraph.getTerminologyBoxAxioms();
    for (final TerminologyBoxAxiom terminologyBoxAxioms : _terminologyBoxAxioms) {
      document.<TerminologyBoxAxiom>format(terminologyBoxAxioms);
    }
    EList<TerminologyBoxStatement> _boxStatements = terminologyGraph.getBoxStatements();
    for (final TerminologyBoxStatement boxStatements : _boxStatements) {
      document.<TerminologyBoxStatement>format(boxStatements);
    }
  }
  
  protected void _format(final Bundle bundle, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.<Bundle>prepend(bundle, _function);
    ISemanticRegionsFinder _regionFor = this.textRegionExtensions.regionFor(bundle);
    final ISemanticRegion lcurly = _regionFor.keyword("{");
    ISemanticRegionsFinder _regionFor_1 = this.textRegionExtensions.regionFor(bundle);
    final ISemanticRegion rcurly = _regionFor_1.keyword("}");
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(lcurly, _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(lcurly, rcurly, _function_2);
    EList<Annotation> _annotations = bundle.getAnnotations();
    for (final Annotation annotations : _annotations) {
      document.<Annotation>format(annotations);
    }
    EList<TerminologyBoxAxiom> _terminologyBoxAxioms = bundle.getTerminologyBoxAxioms();
    for (final TerminologyBoxAxiom terminologyBoxAxioms : _terminologyBoxAxioms) {
      document.<TerminologyBoxAxiom>format(terminologyBoxAxioms);
    }
    EList<TerminologyBoxStatement> _boxStatements = bundle.getBoxStatements();
    for (final TerminologyBoxStatement boxStatements : _boxStatements) {
      document.<TerminologyBoxStatement>format(boxStatements);
    }
  }
  
  protected void _format(final DescriptionBox descriptionBox, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.<DescriptionBox>prepend(descriptionBox, _function);
    ISemanticRegionsFinder _regionFor = this.textRegionExtensions.regionFor(descriptionBox);
    final ISemanticRegion lcurly = _regionFor.keyword("{");
    ISemanticRegionsFinder _regionFor_1 = this.textRegionExtensions.regionFor(descriptionBox);
    final ISemanticRegion rcurly = _regionFor_1.keyword("}");
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(lcurly, _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(lcurly, rcurly, _function_2);
    EList<Annotation> _annotations = descriptionBox.getAnnotations();
    for (final Annotation annotations : _annotations) {
      document.<Annotation>format(annotations);
    }
  }
  
  protected void _format(final Aspect aspect, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.<Aspect>prepend(aspect, _function);
    ISemanticRegionsFinder _regionFor = this.textRegionExtensions.regionFor(aspect);
    ISemanticRegion _keyword = _regionFor.keyword("aspect");
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.append(_keyword, _function_1);
    ISemanticRegionsFinder _regionFor_1 = this.textRegionExtensions.regionFor(aspect);
    EAttribute _term_Name = OMLPackage.eINSTANCE.getTerm_Name();
    ISemanticRegion _feature = _regionFor_1.feature(_term_Name);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.prepend(_feature, _function_2);
    ISemanticRegionsFinder _regionFor_2 = this.textRegionExtensions.regionFor(aspect);
    EAttribute _term_Name_1 = OMLPackage.eINSTANCE.getTerm_Name();
    ISemanticRegion _feature_1 = _regionFor_2.feature(_term_Name_1);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(_feature_1, _function_3);
  }
  
  public void format(final Object aspect, final IFormattableDocument document) {
    if (aspect instanceof Aspect) {
      _format((Aspect)aspect, document);
      return;
    } else if (aspect instanceof Bundle) {
      _format((Bundle)aspect, document);
      return;
    } else if (aspect instanceof TerminologyGraph) {
      _format((TerminologyGraph)aspect, document);
      return;
    } else if (aspect instanceof DescriptionBox) {
      _format((DescriptionBox)aspect, document);
      return;
    } else if (aspect instanceof XtextResource) {
      _format((XtextResource)aspect, document);
      return;
    } else if (aspect instanceof Annotation) {
      _format((Annotation)aspect, document);
      return;
    } else if (aspect instanceof AnnotationProperty) {
      _format((AnnotationProperty)aspect, document);
      return;
    } else if (aspect instanceof TerminologyExtent) {
      _format((TerminologyExtent)aspect, document);
      return;
    } else if (aspect instanceof EObject) {
      _format((EObject)aspect, document);
      return;
    } else if (aspect == null) {
      _format((Void)null, document);
      return;
    } else if (aspect != null) {
      _format(aspect, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(aspect, document).toString());
    }
  }
}
