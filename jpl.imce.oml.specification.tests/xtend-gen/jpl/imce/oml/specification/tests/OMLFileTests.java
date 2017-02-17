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
package jpl.imce.oml.specification.tests;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.itemis.xtext.testing.XtextRunner2;
import com.itemis.xtext.testing.XtextTest;
import java.net.URL;
import jpl.imce.oml.specification.ecore.TerminologyExtent;
import jpl.imce.oml.specification.tests.OntologicalModelingLanguageInjectorProvider;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.formatter.FormatterTester;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner2.class)
@InjectWith(OntologicalModelingLanguageInjectorProvider.class)
@SuppressWarnings("all")
public class OMLFileTests extends XtextTest {
  @Inject
  private ParseHelper<TerminologyExtent> parseHelper;
  
  @Inject
  @Extension
  private FormatterTester _formatterTester;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  private Provider<XtextResourceSet> resourceSetProvider;
  
  /**
   * Tell the `testFile` method to verify
   * that the result of parsing an OML test file
   * is precisely an OML TerminologyExtent
   */
  protected Class<? extends EObject> getRootObjectType(final URI uri) {
    return TerminologyExtent.class;
  }
  
  @Test
  public void testBase() {
    final URL topURL = OMLFileTests.class.getResource("/");
    System.out.println(("topURL=" + topURL));
    final URL baseURL = OMLFileTests.class.getResource("/ModuleTests/base.oml");
    System.out.println(("baseURL=" + baseURL));
    this.testFile("ModuleTests/base.oml");
  }
}
