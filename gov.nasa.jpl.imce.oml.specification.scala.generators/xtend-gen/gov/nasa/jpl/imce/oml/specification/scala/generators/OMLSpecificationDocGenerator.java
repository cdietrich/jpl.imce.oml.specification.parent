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
import org.eclipse.emf.ecore.EClass;
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
      Iterable<EClass> _filter = Iterables.<EClass>filter(_eClassifiers, EClass.class);
      final Function1<EClass, String> _function = new Function1<EClass, String>() {
        @Override
        public String apply(final EClass it) {
          return it.getName();
        }
      };
      List<EClass> _sortBy = IterableExtensions.<EClass, String>sortBy(_filter, _function);
      final Function2<StringBuffer, EClass, StringBuffer> _function_1 = new Function2<StringBuffer, EClass, StringBuffer>() {
        @Override
        public StringBuffer apply(final StringBuffer buffer, final EClass eClass) {
          StringBuffer _xifexpression = null;
          Boolean _isGlossary = OMLUtilities.isGlossary(eClass);
          boolean _not = (!(_isGlossary).booleanValue());
          if (_not) {
            _xifexpression = buffer;
          } else {
            _xifexpression = OMLSpecificationDocGenerator.this.generateClassGlossaryContents(buffer, eClass);
          }
          return _xifexpression;
        }
      };
      final StringBuffer glossary = IterableExtensions.<EClass, StringBuffer>fold(_sortBy, preamble, _function_1);
      _xblockexpression = glossary.toString();
    }
    return _xblockexpression;
  }
  
  public StringBuffer generateClassGlossaryContents(final StringBuffer buffer, final EClass eClass) {
    StringBuffer _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("## OML ");
      String _name = eClass.getName();
      _builder.append(_name, "");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      buffer.append(_builder);
      String _xifexpression = null;
      boolean _isAbstract = eClass.isAbstract();
      if (_isAbstract) {
        _xifexpression = "Abstract,";
      } else {
        _xifexpression = "Concrete,";
      }
      final String gprefix = _xifexpression;
      final Iterable<EClass> general = OMLUtilities.ESuperClasses(eClass);
      String _xifexpression_1 = null;
      boolean _isEmpty = IterableExtensions.isEmpty(general);
      if (_isEmpty) {
        _xifexpression_1 = gprefix;
      } else {
        _xifexpression_1 = "and";
      }
      final String sprefix = _xifexpression_1;
      final Iterable<EClass> specific = OMLUtilities.ESpecificClasses(eClass);
      boolean _isEmpty_1 = IterableExtensions.isEmpty(general);
      boolean _not = (!_isEmpty_1);
      if (_not) {
        StringConcatenation _builder_1 = new StringConcatenation();
        {
          boolean _hasElements = false;
          for(final EClass g : general) {
            if (!_hasElements) {
              _hasElements = true;
              StringConcatenation _builder_2 = new StringConcatenation();
              _builder_2.append(gprefix, "");
              _builder_2.append(" with ");
              int _size = IterableExtensions.size(general);
              _builder_2.append(_size, "");
              _builder_2.append(" ");
              int _size_1 = IterableExtensions.size(general);
              String _pluralizeIfMany = OMLUtilities.pluralizeIfMany("generalization", _size_1);
              _builder_2.append(_pluralizeIfMany, "");
              _builder_2.append(":");
              String _plus = (_builder_2.toString() + "\n");
              _builder_1.append(_plus, "");
            } else {
              _builder_1.appendImmediate("\n", "");
            }
            _builder_1.append(" - OML ");
            String _name_1 = g.getName();
            _builder_1.append(_name_1, "");
          }
          if (_hasElements) {
            _builder_1.append("\n", "");
          }
        }
        buffer.append(_builder_1);
      }
      boolean _isAbstract_1 = eClass.isAbstract();
      if (_isAbstract_1) {
        StringConcatenation _builder_3 = new StringConcatenation();
        {
          boolean _hasElements_1 = false;
          for(final EClass s : specific) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
              StringConcatenation _builder_4 = new StringConcatenation();
              _builder_4.append(sprefix, "");
              _builder_4.append(" with ");
              int _size_2 = IterableExtensions.size(specific);
              _builder_4.append(_size_2, "");
              _builder_4.append(" ");
              int _size_3 = IterableExtensions.size(specific);
              String _pluralizeIfMany_1 = OMLUtilities.pluralizeIfMany("specialization", _size_3);
              _builder_4.append(_pluralizeIfMany_1, "");
              _builder_4.append(":");
              String _plus_1 = (_builder_4.toString() + "\n");
              _builder_3.append(_plus_1, "");
            } else {
              _builder_3.appendImmediate("\n", "");
            }
            _builder_3.append(" - OML ");
            String _name_2 = s.getName();
            _builder_3.append(_name_2, "");
          }
          if (_hasElements_1) {
            _builder_3.append("\n", "");
          }
        }
        buffer.append(_builder_3);
      }
      StringConcatenation _builder_5 = new StringConcatenation();
      String _markDown = OMLUtilities.markDown(eClass);
      _builder_5.append(_markDown, "");
      _builder_5.newLineIfNotEmpty();
      buffer.append(_builder_5);
      _xblockexpression = buffer;
    }
    return _xblockexpression;
  }
}
