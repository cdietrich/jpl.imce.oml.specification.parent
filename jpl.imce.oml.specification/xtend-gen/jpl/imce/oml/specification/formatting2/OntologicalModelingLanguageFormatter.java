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
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.RuleCall;
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
  @Inject
  @Extension
  private OntologicalModelingLanguageGrammarAccess _ontologicalModelingLanguageGrammarAccess;
  
  protected void _format(final TerminologyExtent terminologyExtent, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = new Procedure1<IHiddenRegionFormatter>() {
      public void apply(final IHiddenRegionFormatter it) {
        it.noSpace();
      }
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
    final Procedure1<IHiddenRegionFormatter> _function = new Procedure1<IHiddenRegionFormatter>() {
      public void apply(final IHiddenRegionFormatter it) {
        it.noSpace();
      }
    };
    document.<AnnotationProperty>prepend(annotationProperty, _function);
    ISemanticRegionsFinder _regionFor = this.textRegionExtensions.regionFor(annotationProperty);
    OntologicalModelingLanguageGrammarAccess.AnnotationPropertyElements _annotationPropertyAccess = this._ontologicalModelingLanguageGrammarAccess.getAnnotationPropertyAccess();
    RuleCall _aNNOTATION_PROPERTY_TOKENTerminalRuleCall_0 = _annotationPropertyAccess.getANNOTATION_PROPERTY_TOKENTerminalRuleCall_0();
    ISemanticRegion _ruleCall = _regionFor.ruleCall(_aNNOTATION_PROPERTY_TOKENTerminalRuleCall_0);
    final Procedure1<IHiddenRegionFormatter> _function_1 = new Procedure1<IHiddenRegionFormatter>() {
      public void apply(final IHiddenRegionFormatter it) {
        it.oneSpace();
      }
    };
    document.append(_ruleCall, _function_1);
    ISemanticRegionsFinder _regionFor_1 = this.textRegionExtensions.regionFor(annotationProperty);
    OntologicalModelingLanguageGrammarAccess.AnnotationPropertyElements _annotationPropertyAccess_1 = this._ontologicalModelingLanguageGrammarAccess.getAnnotationPropertyAccess();
    RuleCall _eQUALTerminalRuleCall_2 = _annotationPropertyAccess_1.getEQUALTerminalRuleCall_2();
    ISemanticRegion _ruleCall_1 = _regionFor_1.ruleCall(_eQUALTerminalRuleCall_2);
    final Procedure1<IHiddenRegionFormatter> _function_2 = new Procedure1<IHiddenRegionFormatter>() {
      public void apply(final IHiddenRegionFormatter it) {
        it.noSpace();
      }
    };
    document.surround(_ruleCall_1, _function_2);
    ISemanticRegionsFinder _regionFor_2 = this.textRegionExtensions.regionFor(annotationProperty);
    EAttribute _annotationProperty_Iri = OMLPackage.eINSTANCE.getAnnotationProperty_Iri();
    ISemanticRegion _feature = _regionFor_2.feature(_annotationProperty_Iri);
    final Procedure1<IHiddenRegionFormatter> _function_3 = new Procedure1<IHiddenRegionFormatter>() {
      public void apply(final IHiddenRegionFormatter it) {
        it.newLine();
      }
    };
    document.append(_feature, _function_3);
  }
  
  protected void _format(final Annotation annotation, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = new Procedure1<IHiddenRegionFormatter>() {
      public void apply(final IHiddenRegionFormatter it) {
        it.noSpace();
      }
    };
    document.<Annotation>prepend(annotation, _function);
    ISemanticRegionsFinder _regionFor = this.textRegionExtensions.regionFor(annotation);
    OntologicalModelingLanguageGrammarAccess.AnnotationElements _annotationAccess = this._ontologicalModelingLanguageGrammarAccess.getAnnotationAccess();
    RuleCall _aNNOTATION_TOKENTerminalRuleCall_0 = _annotationAccess.getANNOTATION_TOKENTerminalRuleCall_0();
    ISemanticRegion _ruleCall = _regionFor.ruleCall(_aNNOTATION_TOKENTerminalRuleCall_0);
    final Procedure1<IHiddenRegionFormatter> _function_1 = new Procedure1<IHiddenRegionFormatter>() {
      public void apply(final IHiddenRegionFormatter it) {
        it.oneSpace();
      }
    };
    document.append(_ruleCall, _function_1);
    ISemanticRegionsFinder _regionFor_1 = this.textRegionExtensions.regionFor(annotation);
    OntologicalModelingLanguageGrammarAccess.AnnotationElements _annotationAccess_1 = this._ontologicalModelingLanguageGrammarAccess.getAnnotationAccess();
    RuleCall _eQUALTerminalRuleCall_2 = _annotationAccess_1.getEQUALTerminalRuleCall_2();
    ISemanticRegion _ruleCall_1 = _regionFor_1.ruleCall(_eQUALTerminalRuleCall_2);
    final Procedure1<IHiddenRegionFormatter> _function_2 = new Procedure1<IHiddenRegionFormatter>() {
      public void apply(final IHiddenRegionFormatter it) {
        it.noSpace();
      }
    };
    document.surround(_ruleCall_1, _function_2);
  }
  
  protected void _format(final TerminologyGraph terminologyGraph, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = new Procedure1<IHiddenRegionFormatter>() {
      public void apply(final IHiddenRegionFormatter it) {
        it.noSpace();
      }
    };
    document.<TerminologyGraph>prepend(terminologyGraph, _function);
    ISemanticRegionsFinder _regionFor = this.textRegionExtensions.regionFor(terminologyGraph);
    EAttribute _terminologyBox_Kind = OMLPackage.eINSTANCE.getTerminologyBox_Kind();
    ISemanticRegion _feature = _regionFor.feature(_terminologyBox_Kind);
    final Procedure1<IHiddenRegionFormatter> _function_1 = new Procedure1<IHiddenRegionFormatter>() {
      public void apply(final IHiddenRegionFormatter it) {
        it.oneSpace();
      }
    };
    document.append(_feature, _function_1);
    ISemanticRegionsFinder _regionFor_1 = this.textRegionExtensions.regionFor(terminologyGraph);
    OntologicalModelingLanguageGrammarAccess.TerminologyGraphElements _terminologyGraphAccess = this._ontologicalModelingLanguageGrammarAccess.getTerminologyGraphAccess();
    RuleCall _tERMINOLOGY_GRAPH_TOKENTerminalRuleCall_1 = _terminologyGraphAccess.getTERMINOLOGY_GRAPH_TOKENTerminalRuleCall_1();
    ISemanticRegion _ruleCall = _regionFor_1.ruleCall(_tERMINOLOGY_GRAPH_TOKENTerminalRuleCall_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = new Procedure1<IHiddenRegionFormatter>() {
      public void apply(final IHiddenRegionFormatter it) {
        it.oneSpace();
      }
    };
    document.surround(_ruleCall, _function_2);
    ISemanticRegionsFinder _regionFor_2 = this.textRegionExtensions.regionFor(terminologyGraph);
    OntologicalModelingLanguageGrammarAccess.TerminologyGraphElements _terminologyGraphAccess_1 = this._ontologicalModelingLanguageGrammarAccess.getTerminologyGraphAccess();
    RuleCall _iriIRITerminalRuleCall_2_0 = _terminologyGraphAccess_1.getIriIRITerminalRuleCall_2_0();
    ISemanticRegion _ruleCall_1 = _regionFor_2.ruleCall(_iriIRITerminalRuleCall_2_0);
    final Procedure1<IHiddenRegionFormatter> _function_3 = new Procedure1<IHiddenRegionFormatter>() {
      public void apply(final IHiddenRegionFormatter it) {
        it.oneSpace();
      }
    };
    document.surround(_ruleCall_1, _function_3);
    ISemanticRegionsFinder _regionFor_3 = this.textRegionExtensions.regionFor(terminologyGraph);
    OntologicalModelingLanguageGrammarAccess.TerminologyGraphElements _terminologyGraphAccess_2 = this._ontologicalModelingLanguageGrammarAccess.getTerminologyGraphAccess();
    RuleCall _lCURLYTerminalRuleCall_3 = _terminologyGraphAccess_2.getLCURLYTerminalRuleCall_3();
    final ISemanticRegion lcurly = _regionFor_3.ruleCall(_lCURLYTerminalRuleCall_3);
    ISemanticRegionsFinder _regionFor_4 = this.textRegionExtensions.regionFor(terminologyGraph);
    OntologicalModelingLanguageGrammarAccess.TerminologyGraphElements _terminologyGraphAccess_3 = this._ontologicalModelingLanguageGrammarAccess.getTerminologyGraphAccess();
    RuleCall _rCURLYTerminalRuleCall_5 = _terminologyGraphAccess_3.getRCURLYTerminalRuleCall_5();
    final ISemanticRegion rcurly = _regionFor_4.ruleCall(_rCURLYTerminalRuleCall_5);
    final Procedure1<IHiddenRegionFormatter> _function_4 = new Procedure1<IHiddenRegionFormatter>() {
      public void apply(final IHiddenRegionFormatter it) {
        it.oneSpace();
      }
    };
    document.prepend(lcurly, _function_4);
    final Procedure1<IHiddenRegionFormatter> _function_5 = new Procedure1<IHiddenRegionFormatter>() {
      public void apply(final IHiddenRegionFormatter it) {
        it.newLine();
      }
    };
    document.append(lcurly, _function_5);
    final Procedure1<IHiddenRegionFormatter> _function_6 = new Procedure1<IHiddenRegionFormatter>() {
      public void apply(final IHiddenRegionFormatter it) {
        it.indent();
      }
    };
    document.<ISemanticRegion, ISemanticRegion>interior(lcurly, rcurly, _function_6);
    final Procedure1<IHiddenRegionFormatter> _function_7 = new Procedure1<IHiddenRegionFormatter>() {
      public void apply(final IHiddenRegionFormatter it) {
        it.newLine();
      }
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
    final Procedure1<IHiddenRegionFormatter> _function = new Procedure1<IHiddenRegionFormatter>() {
      public void apply(final IHiddenRegionFormatter it) {
        it.noSpace();
      }
    };
    document.<Bundle>prepend(bundle, _function);
    ISemanticRegionsFinder _regionFor = this.textRegionExtensions.regionFor(bundle);
    OntologicalModelingLanguageGrammarAccess.TerminologyGraphElements _terminologyGraphAccess = this._ontologicalModelingLanguageGrammarAccess.getTerminologyGraphAccess();
    RuleCall _lCURLYTerminalRuleCall_3 = _terminologyGraphAccess.getLCURLYTerminalRuleCall_3();
    final ISemanticRegion lcurly = _regionFor.ruleCall(_lCURLYTerminalRuleCall_3);
    ISemanticRegionsFinder _regionFor_1 = this.textRegionExtensions.regionFor(bundle);
    OntologicalModelingLanguageGrammarAccess.TerminologyGraphElements _terminologyGraphAccess_1 = this._ontologicalModelingLanguageGrammarAccess.getTerminologyGraphAccess();
    RuleCall _rCURLYTerminalRuleCall_5 = _terminologyGraphAccess_1.getRCURLYTerminalRuleCall_5();
    final ISemanticRegion rcurly = _regionFor_1.ruleCall(_rCURLYTerminalRuleCall_5);
    final Procedure1<IHiddenRegionFormatter> _function_1 = new Procedure1<IHiddenRegionFormatter>() {
      public void apply(final IHiddenRegionFormatter it) {
        it.newLine();
      }
    };
    document.append(lcurly, _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = new Procedure1<IHiddenRegionFormatter>() {
      public void apply(final IHiddenRegionFormatter it) {
        it.indent();
      }
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
    final Procedure1<IHiddenRegionFormatter> _function = new Procedure1<IHiddenRegionFormatter>() {
      public void apply(final IHiddenRegionFormatter it) {
        it.noSpace();
      }
    };
    document.<DescriptionBox>prepend(descriptionBox, _function);
    ISemanticRegionsFinder _regionFor = this.textRegionExtensions.regionFor(descriptionBox);
    OntologicalModelingLanguageGrammarAccess.TerminologyGraphElements _terminologyGraphAccess = this._ontologicalModelingLanguageGrammarAccess.getTerminologyGraphAccess();
    RuleCall _lCURLYTerminalRuleCall_3 = _terminologyGraphAccess.getLCURLYTerminalRuleCall_3();
    final ISemanticRegion lcurly = _regionFor.ruleCall(_lCURLYTerminalRuleCall_3);
    ISemanticRegionsFinder _regionFor_1 = this.textRegionExtensions.regionFor(descriptionBox);
    OntologicalModelingLanguageGrammarAccess.TerminologyGraphElements _terminologyGraphAccess_1 = this._ontologicalModelingLanguageGrammarAccess.getTerminologyGraphAccess();
    RuleCall _rCURLYTerminalRuleCall_5 = _terminologyGraphAccess_1.getRCURLYTerminalRuleCall_5();
    final ISemanticRegion rcurly = _regionFor_1.ruleCall(_rCURLYTerminalRuleCall_5);
    final Procedure1<IHiddenRegionFormatter> _function_1 = new Procedure1<IHiddenRegionFormatter>() {
      public void apply(final IHiddenRegionFormatter it) {
        it.newLine();
      }
    };
    document.append(lcurly, _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = new Procedure1<IHiddenRegionFormatter>() {
      public void apply(final IHiddenRegionFormatter it) {
        it.indent();
      }
    };
    document.<ISemanticRegion, ISemanticRegion>interior(lcurly, rcurly, _function_2);
    EList<Annotation> _annotations = descriptionBox.getAnnotations();
    for (final Annotation annotations : _annotations) {
      document.<Annotation>format(annotations);
    }
  }
  
  protected void _format(final Aspect aspect, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = new Procedure1<IHiddenRegionFormatter>() {
      public void apply(final IHiddenRegionFormatter it) {
        it.noSpace();
      }
    };
    document.<Aspect>prepend(aspect, _function);
    ISemanticRegionsFinder _regionFor = this.textRegionExtensions.regionFor(aspect);
    OntologicalModelingLanguageGrammarAccess.AspectElements _aspectAccess = this._ontologicalModelingLanguageGrammarAccess.getAspectAccess();
    RuleCall _aSPECT_TOKENTerminalRuleCall_0 = _aspectAccess.getASPECT_TOKENTerminalRuleCall_0();
    ISemanticRegion _ruleCall = _regionFor.ruleCall(_aSPECT_TOKENTerminalRuleCall_0);
    final Procedure1<IHiddenRegionFormatter> _function_1 = new Procedure1<IHiddenRegionFormatter>() {
      public void apply(final IHiddenRegionFormatter it) {
        it.oneSpace();
      }
    };
    document.append(_ruleCall, _function_1);
    ISemanticRegionsFinder _regionFor_1 = this.textRegionExtensions.regionFor(aspect);
    OntologicalModelingLanguageGrammarAccess.AspectElements _aspectAccess_1 = this._ontologicalModelingLanguageGrammarAccess.getAspectAccess();
    RuleCall _nameIDTerminalRuleCall_1_0 = _aspectAccess_1.getNameIDTerminalRuleCall_1_0();
    ISemanticRegion _ruleCall_1 = _regionFor_1.ruleCall(_nameIDTerminalRuleCall_1_0);
    final Procedure1<IHiddenRegionFormatter> _function_2 = new Procedure1<IHiddenRegionFormatter>() {
      public void apply(final IHiddenRegionFormatter it) {
        it.newLine();
      }
    };
    document.append(_ruleCall_1, _function_2);
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
