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
package jpl.imce.oml.specification.util;

import com.google.inject.Inject;
import jpl.imce.oml.specification.ecore.AnnotationProperty;
import jpl.imce.oml.specification.ecore.Resource;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;

@SuppressWarnings("all")
public class OMLQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
  @Inject
  private IQualifiedNameConverter qnc;
  
  public QualifiedName qualifiedName(final AnnotationProperty ap) {
    String _iri = ap.getIri();
    String _plus = ("<" + _iri);
    String _plus_1 = (_plus + ">");
    return this.qnc.toQualifiedName(_plus_1);
  }
  
  public QualifiedName qualifiedName(final Resource resource) {
    String _iri = resource.iri();
    String _plus = ("<" + _iri);
    String _plus_1 = (_plus + ">");
    return this.qnc.toQualifiedName(_plus_1);
  }
}
