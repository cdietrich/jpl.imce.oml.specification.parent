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

import com.google.inject.Inject;
import jpl.imce.oml.specification.tests.OntologicalModelingLanguageInjectorProvider;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(OntologicalModelingLanguageInjectorProvider.class)
@SuppressWarnings("all")
public class OMLAnnotationTest1 {
  @Inject
  private /* ParseHelper<TerminologyExtent> */Object parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void test() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Concept is undefined"
      + "\nThe field OMLAnnotationTest1.parseHelper refers to the missing type TerminologyExtent"
      + "\nassertNoErrors cannot be resolved"
      + "\neResource cannot be resolved"
      + "\nannotationProperties cannot be resolved"
      + "\nhead cannot be resolved"
      + "\nterminologyGraphs cannot be resolved"
      + "\nhead cannot be resolved"
      + "\nnsPrefix cannot be resolved"
      + "\nassertEquals cannot be resolved"
      + "\nboxStatements cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\nhead cannot be resolved"
      + "\nname cannot be resolved"
      + "\nassertEquals cannot be resolved"
      + "\nannotations cannot be resolved"
      + "\nhead cannot be resolved"
      + "\nproperty cannot be resolved"
      + "\nsubject cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nassertSame cannot be resolved"
      + "\nassertSame cannot be resolved");
  }
}
