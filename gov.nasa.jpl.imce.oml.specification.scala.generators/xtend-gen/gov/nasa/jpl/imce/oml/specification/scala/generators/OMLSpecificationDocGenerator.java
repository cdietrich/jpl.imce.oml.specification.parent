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

import com.google.common.collect.Iterables;
import gov.nasa.jpl.imce.oml.specification.scala.generators.OMLUtilities;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import jpl.imce.oml.specification.ecore.OMLPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

public class OMLSpecificationDocGenerator extends OMLUtilities {
  public static void main(final String[] args) {
    int _length = args.length;
    boolean _notEquals = (1 != _length);
    if (_notEquals) {
      System.err.println("usage: <dir> where <dir> is the directory of the /gov.nasa.jpl.imce.oml.specification.doc project");
      System.exit(1);
    }
    OMLSpecificationDocGenerator _oMLSpecificationDocGenerator = new OMLSpecificationDocGenerator();
    String _get = args[0];
    _oMLSpecificationDocGenerator.generate(_get);
  }
  
  public void generate(final String targetDir) {
    final String omlXcore = "/model/OMLSpecification.xcore";
    final Procedure1<Map<URI, URI>> _function = new Procedure1<Map<URI, URI>>() {
      @Override
      public void apply(final Map<URI, URI> uriMap) {
        try {
          URI _createURI = URI.createURI(("platform:/resource/jpl.imce.oml.specification.ecore" + omlXcore));
          URL _resource = OMLPackage.class.getResource(omlXcore);
          java.net.URI _uRI = _resource.toURI();
          String _string = _uRI.toString();
          URI _createURI_1 = URI.createURI(_string);
          uriMap.put(_createURI, _createURI_1);
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      }
    };
    final XtextResourceSet set = OMLUtilities.createXcoreResourceSet(_function);
    final URI sourceURI = URI.createPlatformResourceURI(("/jpl.imce.oml.specification.ecore" + omlXcore), false);
    final Resource sourceResource = set.getResource(sourceURI, true);
    EcoreUtil.resolveAll(set);
    EList<EObject> _contents = sourceResource.getContents();
    Iterable<EPackage> _filter = Iterables.<EPackage>filter(_contents, EPackage.class);
    final EPackage ePackage = ((EPackage[])Conversions.unwrapArray(_filter, EPackage.class))[0];
    final Path targetPath = Paths.get(targetDir);
    File _file = targetPath.toFile();
    _file.mkdirs();
    Path _absolutePath = targetPath.toAbsolutePath();
    String _string = _absolutePath.toString();
    this.generateGlossaryFile(ePackage, _string);
  }
  
  public void generateGlossaryFile(final EPackage ePackage, final String targetFolder) {
    try {
      File _file = new File(((targetFolder + File.separator) + "GLOSSARY.md"));
      final FileOutputStream glossaryFile = new FileOutputStream(_file);
      try {
        String _generateGlossaryContents = this.generateGlossaryContents(ePackage);
        byte[] _bytes = _generateGlossaryContents.getBytes();
        glossaryFile.write(_bytes);
      } finally {
        glossaryFile.close();
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String generateGlossaryContents(final EPackage ePackage) {
    String _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("# Glossary");
      _builder.newLine();
      final StringBuffer preamble = new StringBuffer(_builder);
      EList<EClassifier> _eClassifiers = ePackage.getEClassifiers();
      final Function1<EClassifier, String> _function = new Function1<EClassifier, String>() {
        @Override
        public String apply(final EClassifier it) {
          return it.getName();
        }
      };
      List<EClassifier> _sortBy = IterableExtensions.<EClassifier, String>sortBy(_eClassifiers, _function);
      final Function2<StringBuffer, EClassifier, StringBuffer> _function_1 = new Function2<StringBuffer, EClassifier, StringBuffer>() {
        @Override
        public StringBuffer apply(final StringBuffer buffer, final EClassifier eClassifier) {
          StringBuffer _xifexpression = null;
          Boolean _isGlossary = OMLUtilities.isGlossary(eClassifier);
          boolean _not = (!(_isGlossary).booleanValue());
          if (_not) {
            _xifexpression = buffer;
          } else {
            _xifexpression = OMLSpecificationDocGenerator.this.generateClassifierGlossaryContents(buffer, eClassifier);
          }
          return _xifexpression;
        }
      };
      final StringBuffer glossary = IterableExtensions.<EClassifier, StringBuffer>fold(_sortBy, preamble, _function_1);
      _xblockexpression = glossary.toString();
    }
    return _xblockexpression;
  }
  
  public StringBuffer generateClassifierGlossaryContents(final StringBuffer buffer, final EClassifier eClassifier) {
    StringBuffer _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("## OML ");
      String _name = eClassifier.getName();
      _builder.append(_name, "");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      String _markDown = OMLUtilities.markDown(eClassifier);
      _builder.append(_markDown, "");
      _builder.newLineIfNotEmpty();
      buffer.append(_builder);
      _xblockexpression = buffer;
    }
    return _xblockexpression;
  }
}
