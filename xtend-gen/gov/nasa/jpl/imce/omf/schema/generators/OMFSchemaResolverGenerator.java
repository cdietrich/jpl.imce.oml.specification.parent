package gov.nasa.jpl.imce.omf.schema.generators;

import com.google.common.collect.Iterables;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.Map;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.osgi.framework.Bundle;

/**
 * I tried to use XCore to specify the OMF Schema Resolver API in terms of read-only queries.
 * This is possible for simple metamodeling constructs like binary associations.
 * Unfortunately, XCore, like EMF, only supports a few collections; too few for an API (e.g. Map)
 * 
 * The skeleton of the OMF Schema Resolver API is generated with this template.
 * Additional API features are added manually.
 * TODO Augment this template to avoid over-writing the manually-added API features.
 */
@SuppressWarnings("all")
public class OMFSchemaResolverGenerator {
  public void generate() {
    try {
      final String sourceFile = "/gov.nasa.jpl.imce.omf.schema.specification/model/OMFSchema.xcore";
      final String targetBundle = "jpl.omf.schema.tables";
      final XtextResourceSet set = new XtextResourceSet();
      URIConverter _uRIConverter = set.getURIConverter();
      Map<URI, URI> _uRIMap = _uRIConverter.getURIMap();
      Map<URI, URI> _computePlatformURIMap = EcorePlugin.computePlatformURIMap(true);
      _uRIMap.putAll(_computePlatformURIMap);
      set.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
      final URI sourceURI = URI.createPlatformResourceURI(sourceFile, false);
      final Resource sourceResource = set.getResource(sourceURI, true);
      EList<EObject> _contents = sourceResource.getContents();
      Iterable<EPackage> _filter = Iterables.<EPackage>filter(_contents, EPackage.class);
      final EPackage ePackage = ((EPackage[])Conversions.unwrapArray(_filter, EPackage.class))[0];
      final String targetFolder = "/shared/src/main/scala/gov/nasa/jpl/imce/omf/schema/resolved";
      Bundle _bundle = Platform.getBundle(targetBundle);
      final URL targetURL = _bundle.getEntry(targetFolder);
      final URL folder = FileLocator.toFileURL(targetURL);
      String _path = folder.getPath();
      this.generate(ePackage, _path);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void generate(final EPackage ePackage, final String targetFolder) {
    try {
      EList<EClassifier> _eClassifiers = ePackage.getEClassifiers();
      Iterable<EClass> _filter = Iterables.<EClass>filter(_eClassifiers, EClass.class);
      for (final EClass eClass : _filter) {
        {
          String _name = eClass.getName();
          String _plus = ((targetFolder + File.separator) + _name);
          String _plus_1 = (_plus + ".scala");
          File _file = new File(_plus_1);
          final FileOutputStream classFile = new FileOutputStream(_file);
          String _generateClassFile = this.generateClassFile(eClass);
          byte[] _bytes = _generateClassFile.getBytes();
          classFile.write(_bytes);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public CharSequence copyright() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Copyright 2016 California Institute of Technology (\"Caltech\").");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* U.S. Government sponsorship acknowledged.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Licensed under the Apache License, Version 2.0 (the \"License\");");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* you may not use this file except in compliance with the License.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* You may obtain a copy of the License at");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*     http://www.apache.org/licenses/LICENSE-2.0");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Unless required by applicable law or agreed to in writing, software");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* distributed under the License is distributed on an \"AS IS\" BASIS,");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* See the License for the specific language governing permissions and");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* limitations under the License.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* License Terms");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    return _builder;
  }
  
  public String generateClassFile(final EClass eClass) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _copyright = this.copyright();
    _builder.append(_copyright, "");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("package gov.nasa.jpl.imce.omf.schema.resolved");
    _builder.newLine();
    _builder.newLine();
    String _traitDeclaration = OMFSchemaResolverGenerator.traitDeclaration(eClass);
    _builder.append(_traitDeclaration, "");
    _builder.newLineIfNotEmpty();
    {
      EList<EStructuralFeature> _eStructuralFeatures = eClass.getEStructuralFeatures();
      boolean _hasElements = false;
      for(final EStructuralFeature f : _eStructuralFeatures) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("{\n  ", "");
        } else {
          _builder.appendImmediate("\n  ", "");
        }
        _builder.append("val ");
        String _queryName = OMFSchemaResolverGenerator.queryName(f);
        _builder.append(_queryName, "");
        _builder.append(": ");
        String _queryType = OMFSchemaResolverGenerator.queryType(f);
        _builder.append(_queryType, "");
      }
      if (_hasElements) {
        _builder.append("\n}", "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public static String traitDeclaration(final EClass eClass) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("trait ");
    String _name = eClass.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    {
      EList<EClass> _eSuperTypes = eClass.getESuperTypes();
      boolean _hasElements = false;
      for(final EClass parent : _eSuperTypes) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("  extends ", "");
        } else {
          _builder.appendImmediate("\n  with ", "");
        }
        String _name_1 = parent.getName();
        _builder.append(_name_1, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public static Boolean isAttributeOrReferenceOrContainer(final EStructuralFeature f) {
    boolean _switchResult = false;
    boolean _matched = false;
    if (f instanceof EReference) {
      _matched=true;
      boolean _isContainment = ((EReference)f).isContainment();
      _switchResult = (!_isContainment);
    }
    if (!_matched) {
      _switchResult = true;
    }
    return Boolean.valueOf(_switchResult);
  }
  
  public static String queryName(final EStructuralFeature feature) {
    return feature.getName();
  }
  
  public static String scalaTypeName(final EStructuralFeature feature) {
    String _xblockexpression = null;
    {
      final EClassifier type = feature.getEType();
      String _switchResult = null;
      String _name = type.getName();
      switch (_name) {
        case "EInt":
          _switchResult = "scala.Int";
          break;
        case "EBoolean":
          _switchResult = "scala.Boolean";
          break;
        case "EString":
          _switchResult = "scala.Predef.String";
          break;
        case "IRI":
          _switchResult = "gov.nasa.jpl.imce.omf.schema.tables.IRI";
          break;
        case "Language":
          _switchResult = "gov.nasa.jpl.imce.omf.schema.tables.Language";
          break;
        case "LexicalNumber":
          _switchResult = "gov.nasa.jpl.imce.omf.schema.tables.LexicalNumber";
          break;
        case "LexicalTime":
          _switchResult = "gov.nasa.jpl.imce.omf.schema.tables.LexicalTime";
          break;
        case "LexicalValue":
          _switchResult = "gov.nasa.jpl.imce.omf.schema.tables.LexicalValue";
          break;
        case "LocalName":
          _switchResult = "gov.nasa.jpl.imce.omf.schema.tables.LocalName";
          break;
        case "Pattern":
          _switchResult = "gov.nasa.jpl.imce.omf.schema.tables.Pattern";
          break;
        case "UUID":
          _switchResult = "java.util.UUID";
          break;
        case "TerminologyGraphKind":
          _switchResult = "gov.nasa.jpl.imce.omf.schema.tables.TerminologyGraphKind";
          break;
        default:
          _switchResult = type.getName();
          break;
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  public static String queryType(final EStructuralFeature feature) {
    String _xblockexpression = null;
    {
      final EClassifier type = feature.getEType();
      final String scalaType = OMFSchemaResolverGenerator.scalaTypeName(feature);
      String _switchResult = null;
      boolean _matched = false;
      if ((type instanceof EDataType)) {
        _matched=true;
        String _xifexpression = null;
        int _lowerBound = feature.getLowerBound();
        boolean _equals = (_lowerBound == 0);
        if (_equals) {
          _xifexpression = (("scala.Option[" + scalaType) + "]");
        } else {
          _xifexpression = scalaType;
        }
        _switchResult = _xifexpression;
      }
      if (!_matched) {
        if ((type instanceof EClass)) {
          _matched=true;
          String _xifexpression_1 = null;
          if (((feature.getLowerBound() == 0) && (feature.getUpperBound() == (-1)))) {
            String _name = type.getName();
            String _plus = ("scala.collection.immutable.Set[" + _name);
            _xifexpression_1 = (_plus + "]");
          } else {
            _xifexpression_1 = type.getName();
          }
          _switchResult = _xifexpression_1;
        }
      }
      if (!_matched) {
        String _name_1 = type.getName();
        _switchResult = (_name_1 + "//Default");
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
}
