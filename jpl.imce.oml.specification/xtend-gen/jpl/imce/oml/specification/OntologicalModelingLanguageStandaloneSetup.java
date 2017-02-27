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
package jpl.imce.oml.specification;

import com.google.inject.Injector;
import jpl.imce.oml.specification.OntologicalModelingLanguageStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class OntologicalModelingLanguageStandaloneSetup extends OntologicalModelingLanguageStandaloneSetupGenerated {
  public static void doSetup() {
    OntologicalModelingLanguageStandaloneSetup _ontologicalModelingLanguageStandaloneSetup = new OntologicalModelingLanguageStandaloneSetup();
    _ontologicalModelingLanguageStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
  
  public void register(final Injector injector) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field OMLPackage is undefined"
      + "\nThe method or field OMLPackage is undefined"
      + "\nThe method or field OMLPackage is undefined"
      + "\neNS_URI cannot be resolved"
      + "\neNS_URI cannot be resolved"
      + "\neINSTANCE cannot be resolved");
  }
}
