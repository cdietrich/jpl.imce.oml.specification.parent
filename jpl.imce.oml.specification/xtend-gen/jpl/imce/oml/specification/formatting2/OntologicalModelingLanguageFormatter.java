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

import com.google.inject.Inject;
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
import jpl.imce.oml.specification.services.OntologicalModelingLanguageGrammarAccess;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class OntologicalModelingLanguageFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private OntologicalModelingLanguageGrammarAccess _ontologicalModelingLanguageGrammarAccess;
  
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
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.append(this.textRegionExtensions.regionFor(annotationProperty).ruleCall(this._ontologicalModelingLanguageGrammarAccess.getAnnotationPropertyAccess().getANNOTATION_PROPERTY_TOKENTerminalRuleCall_0()), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.prepend(this.textRegionExtensions.regionFor(annotationProperty).feature(OMLPackage.eINSTANCE.getAnnotationProperty_AbbrevIRI()), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(annotationProperty).keyword("="), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(this.textRegionExtensions.regionFor(annotationProperty).feature(OMLPackage.eINSTANCE.getAnnotationProperty_Iri()), _function_4);
  }
  
  protected void _format(final Annotation annotation, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.<Annotation>prepend(annotation, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.append(this.textRegionExtensions.regionFor(annotation).keyword("annotation"), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(annotation).keyword("="), _function_2);
  }
  
  protected void _format(final TerminologyGraph terminologyGraph, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.<TerminologyGraph>prepend(terminologyGraph, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.append(this.textRegionExtensions.regionFor(terminologyGraph).feature(OMLPackage.eINSTANCE.getTerminologyBox_Kind()), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(terminologyGraph).keyword("terminology"), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(terminologyGraph).feature(OMLPackage.eINSTANCE.getModule_Iri()), _function_3);
    final ISemanticRegion lcurly = this.textRegionExtensions.regionFor(terminologyGraph).ruleCall(this._ontologicalModelingLanguageGrammarAccess.getTerminologyGraphAccess().getLCURLYTerminalRuleCall_3());
    final ISemanticRegion rcurly = this.textRegionExtensions.regionFor(terminologyGraph).ruleCall(this._ontologicalModelingLanguageGrammarAccess.getTerminologyGraphAccess().getRCURLYTerminalRuleCall_5());
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
    final ISemanticRegion lcurly = this.textRegionExtensions.regionFor(bundle).keyword("{");
    final ISemanticRegion rcurly = this.textRegionExtensions.regionFor(bundle).keyword("}");
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
    final ISemanticRegion lcurly = this.textRegionExtensions.regionFor(descriptionBox).keyword("{");
    final ISemanticRegion rcurly = this.textRegionExtensions.regionFor(descriptionBox).keyword("}");
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
      it.oneSpace();
    };
    document.append(this.textRegionExtensions.regionFor(aspect).keyword("aspect"), _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.prepend(this.textRegionExtensions.regionFor(aspect).feature(OMLPackage.eINSTANCE.getTerm_Name()), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(this.textRegionExtensions.regionFor(aspect).feature(OMLPackage.eINSTANCE.getTerm_Name()), _function_2);
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
