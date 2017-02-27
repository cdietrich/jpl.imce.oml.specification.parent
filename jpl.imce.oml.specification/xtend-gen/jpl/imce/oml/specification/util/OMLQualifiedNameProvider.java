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
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;

@SuppressWarnings("all")
public class OMLQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
  @Inject
  private IQualifiedNameConverter qnc;
  
  public QualifiedName qualifiedName(final /* AnnotationProperty */Object ap) {
    throw new Error("Unresolved compilation problems:"
      + "\niri cannot be resolved");
  }
  
  public QualifiedName qualifiedName(final /* Resource */Object resource) {
    throw new Error("Unresolved compilation problems:"
      + "\niri cannot be resolved");
  }
}
