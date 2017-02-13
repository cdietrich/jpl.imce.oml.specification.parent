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
package gov.nasa.jpl.imce.oml.specification.scala.generators;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import gov.nasa.jpl.imce.oml.specification.scala.generators.OMLUtilities;
import java.net.URL;
import java.util.Map;
import java.util.function.Consumer;
import jpl.imce.oml.specification.ecore.OMLPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

public class OMLLoadTest extends OMLUtilities {
  public static void main(final String[] args) {
    int _length = args.length;
    boolean _notEquals = (1 != _length);
    if (_notEquals) {
      System.err.println("usage: <dir> where <dir> is the directory of the /gov.nasa.jpl.imce.oml.specification.tables project");
      System.exit(1);
    }
    final String xcoreFile = "/model/OMLSpecification.xcore";
    final Procedure1<Map<URI, URI>> _function = (Map<URI, URI> uriMap) -> {
      try {
        URI _createURI = URI.createURI(("platform:/resource/jpl.imce.oml.specification.ecore" + xcoreFile));
        URL _resource = OMLPackage.class.getResource(xcoreFile);
        java.net.URI _uRI = _resource.toURI();
        String _string = _uRI.toString();
        URI _createURI_1 = URI.createURI(_string);
        uriMap.put(_createURI, _createURI_1);
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    final XtextResourceSet set = OMLUtilities.createXcoreResourceSet(_function);
    final URI sourceURI = URI.createPlatformResourceURI(("/jpl.imce.oml.specification.ecore" + xcoreFile), false);
    final Resource sourceResource = set.getResource(sourceURI, true);
    EcoreUtil.resolveAll(set);
    EList<Resource.Diagnostic> _errors = sourceResource.getErrors();
    boolean _isEmpty = _errors.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      EList<Resource.Diagnostic> _errors_1 = sourceResource.getErrors();
      int _size = _errors_1.size();
      String _plus = (Integer.valueOf(_size) + " errors in resource!");
      System.err.println(_plus);
      EList<Resource.Diagnostic> _errors_2 = sourceResource.getErrors();
      final Consumer<Resource.Diagnostic> _function_1 = (Resource.Diagnostic e) -> {
        Class<? extends Resource.Diagnostic> _class = e.getClass();
        String _name = _class.getName();
        String _plus_1 = (_name + " => ");
        String _message = e.getMessage();
        String _plus_2 = (_plus_1 + _message);
        System.err.println(_plus_2);
      };
      _errors_2.forEach(_function_1);
    }
    EList<EObject> _contents = sourceResource.getContents();
    Iterable<EPackage> _filter = Iterables.<EPackage>filter(_contents, EPackage.class);
    final EPackage ePackage = ((EPackage[])Conversions.unwrapArray(_filter, EPackage.class))[0];
    EList<EClassifier> _eClassifiers = ePackage.getEClassifiers();
    Iterable<EClass> _filter_1 = Iterables.<EClass>filter(_eClassifiers, EClass.class);
    final Function1<EClass, Boolean> _function_2 = (EClass it) -> {
      String _name = it.getName();
      return Boolean.valueOf(Objects.equal(_name, "Concept"));
    };
    EClass _findFirst = IterableExtensions.<EClass>findFirst(_filter_1, _function_2);
    EList<EStructuralFeature> _eStructuralFeatures = _findFirst.getEStructuralFeatures();
    final Function1<EStructuralFeature, Boolean> _function_3 = (EStructuralFeature it) -> {
      String _name = it.getName();
      return Boolean.valueOf(Objects.equal(_name, "isAbstract"));
    };
    EStructuralFeature _findFirst_1 = IterableExtensions.<EStructuralFeature>findFirst(_eStructuralFeatures, _function_3);
    EClassifier _eType = _findFirst_1.getEType();
    final String eboolean_name = _eType.getName();
    boolean _notEquals_1 = (!Objects.equal("EBoolean", eboolean_name));
    if (_notEquals_1) {
      System.err.println("Concept.isAbstract should be typed by EBoolean");
    } else {
      System.out.println("OK");
    }
  }
}
