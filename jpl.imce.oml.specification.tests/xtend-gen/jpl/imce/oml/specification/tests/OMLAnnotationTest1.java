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
package jpl.imce.oml.specification.tests;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import jpl.imce.oml.specification.ecore.Annotation;
import jpl.imce.oml.specification.ecore.AnnotationProperty;
import jpl.imce.oml.specification.ecore.Concept;
import jpl.imce.oml.specification.ecore.TerminologyBoxStatement;
import jpl.imce.oml.specification.ecore.TerminologyExtent;
import jpl.imce.oml.specification.ecore.TerminologyGraph;
import jpl.imce.oml.specification.ecore.TerminologyThing;
import jpl.imce.oml.specification.tests.OntologicalModelingLanguageInjectorProvider;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(OntologicalModelingLanguageInjectorProvider.class)
@SuppressWarnings("all")
public class OMLAnnotationTest1 {
  @Inject
  private ParseHelper<TerminologyExtent> parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void test() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("annotationProperty rdfs:label=<http://www.w3.org/2000/01/rdf-schema#label>");
      _builder.newLine();
      _builder.newLine();
      _builder.append("open terminology <http://imce.jpl.nasa.gov/foundation/mission/mission>");
      _builder.newLine();
      _builder.append("{\t");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("abstract concept PerformingElement");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("@rdfs:label = \"Performing Element\"");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final TerminologyExtent result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      this._validationTestHelper.assertNoErrors(result);
      final Resource r = result.eResource();
      EcoreUtil.resolveAll(r);
      EList<AnnotationProperty> _annotationProperties = result.getAnnotationProperties();
      final AnnotationProperty ap = IterableExtensions.<AnnotationProperty>head(_annotationProperties);
      EList<TerminologyGraph> _terminologyGraphs = result.getTerminologyGraphs();
      final TerminologyGraph tbox = IterableExtensions.<TerminologyGraph>head(_terminologyGraphs);
      String _nsPrefix = tbox.nsPrefix();
      Assert.assertEquals(_nsPrefix, "mission");
      EList<TerminologyBoxStatement> _boxStatements = tbox.getBoxStatements();
      Iterable<Concept> _filter = Iterables.<Concept>filter(_boxStatements, Concept.class);
      final Concept c = IterableExtensions.<Concept>head(_filter);
      String _name = c.name();
      Assert.assertEquals(_name, "PerformingElement");
      EList<Annotation> _annotations = tbox.getAnnotations();
      final Annotation a = IterableExtensions.<Annotation>head(_annotations);
      final AnnotationProperty a_prop = a.getProperty();
      final TerminologyThing a_subj = a.getSubject();
      final String a_value = a.getValue();
      Assert.assertEquals("Performing Element", a_value);
      Assert.assertSame(ap, a_prop);
      Assert.assertSame(c, a_subj);
      Class<? extends OMLAnnotationTest1> _class = this.getClass();
      String _name_1 = _class.getName();
      String _plus = (_name_1 + " OK!");
      System.out.println(_plus);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
