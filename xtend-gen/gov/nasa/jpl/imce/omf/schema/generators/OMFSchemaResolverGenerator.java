package gov.nasa.jpl.imce.omf.schema.generators;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.Map;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.osgi.framework.Bundle;

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
      final String targetFolder = "/shared/src/main/scala/gov/nasa/jpl/imce/omf/schema/resolver/api";
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
  
  public String generateClassFile(final EClass eClass) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _copyright = this.copyright();
    _builder.append(_copyright, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package gov.nasa.jpl.imce.omf.schema.resolver.api");
    _builder.newLine();
    _builder.newLine();
    String _doc = OMFSchemaResolverGenerator.doc(eClass, "");
    _builder.append(_doc, "");
    String _traitDeclaration = OMFSchemaResolverGenerator.traitDeclaration(eClass);
    _builder.append(_traitDeclaration, "");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    {
      Iterable<EStructuralFeature> _APIStructuralFeatures = OMFSchemaResolverGenerator.APIStructuralFeatures(eClass);
      boolean _hasElements = false;
      for(final EStructuralFeature f : _APIStructuralFeatures) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("\n  ", "");
        } else {
          _builder.appendImmediate("\n  ", "");
        }
        String _doc_1 = OMFSchemaResolverGenerator.doc(f, "  ");
        _builder.append(_doc_1, "");
        _builder.append("val ");
        String _queryName = OMFSchemaResolverGenerator.queryName(f);
        _builder.append(_queryName, "");
        _builder.append(": ");
        String _queryType = OMFSchemaResolverGenerator.queryType(f);
        _builder.append(_queryType, "");
      }
      if (_hasElements) {
        _builder.append("\n", "");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      Iterable<EOperation> _APIOperations = OMFSchemaResolverGenerator.APIOperations(eClass);
      boolean _hasElements_1 = false;
      for(final EOperation op : _APIOperations) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
          _builder.append("\n  ", "");
        } else {
          _builder.appendImmediate("\n  ", "");
        }
        String _doc_2 = OMFSchemaResolverGenerator.doc(op, "  ");
        _builder.append(_doc_2, "");
        String _queryName_1 = OMFSchemaResolverGenerator.queryName(op);
        _builder.append(_queryName_1, "");
        _builder.append(": ");
        String _queryType_1 = OMFSchemaResolverGenerator.queryType(op);
        _builder.append(_queryType_1, "");
      }
      if (_hasElements_1) {
        _builder.append("\n", "");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
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
  
  public static String scalaTypeName(final ETypedElement feature) {
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
  
  public static String queryType(final ETypedElement feature) {
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
          int _lowerBound_1 = feature.getLowerBound();
          boolean _equals_1 = (_lowerBound_1 == 0);
          if (_equals_1) {
            String _xifexpression_2 = null;
            int _upperBound = feature.getUpperBound();
            boolean _equals_2 = (_upperBound == (-1));
            if (_equals_2) {
              String _xblockexpression_1 = null;
              {
                EAnnotation _eAnnotation = feature.getEAnnotation("http://imce.jpl.nasa.gov/omf/Collection");
                EMap<String, String> _details = null;
                if (_eAnnotation!=null) {
                  _details=_eAnnotation.getDetails();
                }
                final EMap<String, String> ann = _details;
                String _switchResult_1 = null;
                String _elvis = null;
                String _get = null;
                if (ann!=null) {
                  _get=ann.get("kind");
                }
                if (_get != null) {
                  _elvis = _get;
                } else {
                  _elvis = "";
                }
                switch (_elvis) {
                  case "Map":
                    String _xblockexpression_2 = null;
                    {
                      final String key = ann.get("key");
                      String _name = type.getName();
                      String _plus = ((("scala.collection.immutable.Map[" + key) + ", ") + _name);
                      _xblockexpression_2 = (_plus + "]");
                    }
                    _switchResult_1 = _xblockexpression_2;
                    break;
                  case "Set":
                    String _name = type.getName();
                    String _plus = ("scala.collection.immutable.Set[_ <: " + _name);
                    _switchResult_1 = (_plus + "]");
                    break;
                }
                _xblockexpression_1 = _switchResult_1;
              }
              _xifexpression_2 = _xblockexpression_1;
            } else {
              String _name = type.getName();
              String _plus = ("scala.Option[" + _name);
              _xifexpression_2 = (_plus + "]");
            }
            _xifexpression_1 = _xifexpression_2;
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
  
  public static String queryName(final EOperation op) {
    String _xblockexpression = null;
    {
      String _xifexpression = null;
      EList<EParameter> _eParameters = op.getEParameters();
      boolean _isEmpty = _eParameters.isEmpty();
      if (_isEmpty) {
        _xifexpression = "val";
      } else {
        _xifexpression = "def";
      }
      final String kind = _xifexpression;
      String _xifexpression_1 = null;
      EAnnotation _eAnnotation = op.getEAnnotation("http://imce.jpl.nasa.gov/omf/Override");
      boolean _notEquals = (!Objects.equal(null, _eAnnotation));
      if (_notEquals) {
        _xifexpression_1 = ("override " + kind);
      } else {
        _xifexpression_1 = kind;
      }
      final String decl = _xifexpression_1;
      StringConcatenation _builder = new StringConcatenation();
      {
        EList<EParameter> _eParameters_1 = op.getEParameters();
        boolean _hasElements = false;
        for(final EParameter p : _eParameters_1) {
          if (!_hasElements) {
            _hasElements = true;
            _builder.append("\n  (", "");
          } else {
            _builder.appendImmediate(",\n  ", "");
          }
          String _name = p.getName();
          _builder.append(_name, "");
          _builder.append(": ");
          String _queryType = OMFSchemaResolverGenerator.queryType(p);
          _builder.append(_queryType, "");
        }
        if (_hasElements) {
          _builder.append("\n  )", "");
        }
      }
      final String args = _builder.toString();
      String _name_1 = op.getName();
      String _plus = ((decl + " ") + _name_1);
      _xblockexpression = (_plus + args);
    }
    return _xblockexpression;
  }
  
  public static String queryType(final EOperation op) {
    String _xblockexpression = null;
    {
      EAnnotation _eAnnotation = op.getEAnnotation("http://imce.jpl.nasa.gov/omf/Collection");
      EMap<String, String> _details = null;
      if (_eAnnotation!=null) {
        _details=_eAnnotation.getDetails();
      }
      final EMap<String, String> ann = _details;
      String _switchResult = null;
      String _elvis = null;
      String _get = null;
      if (ann!=null) {
        _get=ann.get("kind");
      }
      if (_get != null) {
        _elvis = _get;
      } else {
        _elvis = "";
      }
      switch (_elvis) {
        case "Map":
          String _xblockexpression_1 = null;
          {
            final String key = ann.get("key");
            EClassifier _eType = op.getEType();
            String _name = _eType.getName();
            String _plus = ((("scala.collection.immutable.Map[" + key) + ",") + _name);
            _xblockexpression_1 = (_plus + "]");
          }
          _switchResult = _xblockexpression_1;
          break;
        case "Set":
          EClassifier _eType = op.getEType();
          String _name = _eType.getName();
          String _plus = ("scala.collection.immutable.Set[_ <: " + _name);
          _switchResult = (_plus + "]");
          break;
        default:
          String _xifexpression = null;
          int _lowerBound = op.getLowerBound();
          boolean _equals = (0 == _lowerBound);
          if (_equals) {
            EClassifier _eType_1 = op.getEType();
            String _name_1 = _eType_1.getName();
            String _plus_1 = ("scala.Option[" + _name_1);
            _xifexpression = (_plus_1 + "]");
          } else {
            EClassifier _eType_2 = op.getEType();
            _xifexpression = _eType_2.getName();
          }
          _switchResult = _xifexpression;
          break;
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  public static Iterable<EStructuralFeature> APIStructuralFeatures(final EClass eClass) {
    EList<EStructuralFeature> _eStructuralFeatures = eClass.getEStructuralFeatures();
    final Function1<EStructuralFeature, Boolean> _function = (EStructuralFeature it) -> {
      return OMFSchemaResolverGenerator.isAPI(it);
    };
    return IterableExtensions.<EStructuralFeature>filter(_eStructuralFeatures, _function);
  }
  
  public static Iterable<EOperation> APIOperations(final EClass eClass) {
    EList<EOperation> _eOperations = eClass.getEOperations();
    final Function1<EOperation, Boolean> _function = (EOperation it) -> {
      return OMFSchemaResolverGenerator.isAPI(it);
    };
    return IterableExtensions.<EOperation>filter(_eOperations, _function);
  }
  
  public static Boolean isAPI(final ENamedElement e) {
    EAnnotation _eAnnotation = e.getEAnnotation("http://imce.jpl.nasa.gov/omf/NotAPI");
    return Boolean.valueOf(Objects.equal(null, _eAnnotation));
  }
  
  public static String doc(final ENamedElement e, final String indent) {
    String _xblockexpression = null;
    {
      String _elvis = null;
      EAnnotation _eAnnotation = e.getEAnnotation("http://www.eclipse.org/emf/2002/GenModel");
      EMap<String, String> _details = null;
      if (_eAnnotation!=null) {
        _details=_eAnnotation.getDetails();
      }
      String _get = null;
      if (_details!=null) {
        _get=_details.get("documentation");
      }
      if (_get != null) {
        _elvis = _get;
      } else {
        _elvis = "";
      }
      final String doc = _elvis;
      String _xifexpression = null;
      boolean _isEmpty = doc.isEmpty();
      if (_isEmpty) {
        _xifexpression = doc;
      } else {
        String _replaceAll = doc.replaceAll("\n", (("\n" + indent) + " * "));
        String _plus = ((("/*\n" + indent) + " * ") + _replaceAll);
        String _plus_1 = (_plus + "\n");
        String _plus_2 = (_plus_1 + indent);
        String _plus_3 = (_plus_2 + " */\n");
        _xifexpression = (_plus_3 + indent);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
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
    _builder.newLine();
    return _builder;
  }
}
