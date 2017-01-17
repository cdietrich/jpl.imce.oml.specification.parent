package gov.nasa.jpl.imce.oml.specification.scala.generators;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
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
import org.eclipse.emf.ecore.xcore.XOperation;
import org.eclipse.emf.ecore.xcore.mappings.XcoreMapper;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.osgi.framework.Bundle;

@SuppressWarnings("all")
public class OMLSpecificationResolverLibraryGenerator {
  public static class OMFFeatureCompare implements Comparator<EStructuralFeature> {
    private final List<String> knownAttributes = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("graphUUID", "uuid", "axiomUUID", "terminologyUUID", "subjectUUID", "propertyUUID", "kind", "isAbstract", "asymmetric", "essential", "functional", "inverseEssential", "inverseFunctional", "irreflexive", "reflexive", "symmetric", "transitive", "name", "unreifiedPropertyName", "unreifiedInversePropertyName", "iri", "value"));
    
    @Override
    public int compare(final EStructuralFeature o1, final EStructuralFeature o2) {
      int _xblockexpression = (int) 0;
      {
        final String name1 = OMLSpecificationResolverLibraryGenerator.columnName(o1);
        final String name2 = OMLSpecificationResolverLibraryGenerator.columnName(o2);
        final int i1 = this.knownAttributes.indexOf(name1);
        final int i2 = this.knownAttributes.indexOf(name2);
        int _xifexpression = (int) 0;
        if (((i1 > (-1)) && (i2 > (-1)))) {
          _xifexpression = Integer.valueOf(i1).compareTo(Integer.valueOf(i2));
        } else {
          int _xifexpression_1 = (int) 0;
          if (((i1 > (-1)) && (i2 == (-1)))) {
            _xifexpression_1 = (-1);
          } else {
            int _xifexpression_2 = (int) 0;
            if (((i1 == (-1)) && (i2 > (-1)))) {
              _xifexpression_2 = 1;
            } else {
              _xifexpression_2 = name1.compareTo(name2);
            }
            _xifexpression_1 = _xifexpression_2;
          }
          _xifexpression = _xifexpression_1;
        }
        _xblockexpression = _xifexpression;
      }
      return _xblockexpression;
    }
  }
  
  public void generate() {
    try {
      final String sourceFile = "/gov.nasa.jpl.imce.omf.schema.specification/model/OMFSchema.xcore";
      final String targetBundle = "jpl.omf.schema.resolver";
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
      final String targetFolder = "/src/main/scala/gov/nasa/jpl/imce/omf/schema/resolver/impl";
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
      final Function1<EClass, Boolean> _function = (EClass ec) -> {
        Boolean _hasCustomImplementation = OMLSpecificationResolverLibraryGenerator.hasCustomImplementation(ec);
        return Boolean.valueOf((!(_hasCustomImplementation).booleanValue()));
      };
      Iterable<EClass> _filter_1 = IterableExtensions.<EClass>filter(_filter, _function);
      for (final EClass eClass : _filter_1) {
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
    _builder.append("package gov.nasa.jpl.imce.omf.schema.resolver.impl");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import gov.nasa.jpl.imce.omf.schema._");
    _builder.newLine();
    _builder.newLine();
    {
      boolean _isAbstract = eClass.isAbstract();
      if (_isAbstract) {
        _builder.append("trait ");
      } else {
        _builder.append("case class ");
      }
    }
    String _classDeclaration = OMLSpecificationResolverLibraryGenerator.classDeclaration(eClass);
    _builder.append(_classDeclaration, "");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    {
      Iterable<EOperation> _ScalaOperations = OMLSpecificationResolverLibraryGenerator.ScalaOperations(eClass);
      boolean _hasElements = false;
      for(final EOperation op : _ScalaOperations) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("\n  ", "");
        } else {
          _builder.appendImmediate("\n  ", "");
        }
        String _doc = OMLSpecificationResolverLibraryGenerator.doc(op, "  ");
        _builder.append(_doc, "");
        String _queryName = OMLSpecificationResolverLibraryGenerator.queryName(op);
        _builder.append(_queryName, "");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append(": ");
        String _queryType = OMLSpecificationResolverLibraryGenerator.queryType(op);
        _builder.append(_queryType, "  ");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("= ");
        String _queryBody = OMLSpecificationResolverLibraryGenerator.queryBody(op);
        _builder.append(_queryBody, "  ");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.newLine();
      }
      if (_hasElements) {
        _builder.append("\n", "");
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  /**
   * Transform an XText base XExpression to an equivalent Scala expression in concrete syntax (String).
   */
  public static String toScala(final XExpression exp) {
    String _xblockexpression = null;
    {
      String _switchResult = null;
      boolean _matched = false;
      if (exp instanceof XFeatureCall) {
        _matched=true;
        String _xblockexpression_1 = null;
        {
          final ICompositeNode n = NodeModelUtils.findActualNodeFor(exp);
          final String s = NodeModelUtils.getTokenText(n);
          _xblockexpression_1 = s;
        }
        _switchResult = _xblockexpression_1;
      }
      if (!_matched) {
        String _string = exp.toString();
        _switchResult = (_string + "/* default */");
      }
      final String result = _switchResult;
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public static String classDeclaration(final EClass eClass) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = eClass.getName();
    _builder.append(_name, "");
    {
      boolean _isAbstract = eClass.isAbstract();
      boolean _not = (!_isAbstract);
      if (_not) {
        _builder.append(" private[impl] ");
        _builder.newLineIfNotEmpty();
        _builder.append("(");
        _builder.newLine();
        {
          Iterable<EStructuralFeature> _sortedAttributes = OMLSpecificationResolverLibraryGenerator.getSortedAttributes(eClass);
          boolean _hasElements = false;
          for(final EStructuralFeature attr : _sortedAttributes) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", " ");
            }
            _builder.append(" ");
            _builder.append("override val ");
            String _name_1 = attr.getName();
            _builder.append(_name_1, " ");
            _builder.append(": ");
            String _queryType = OMLSpecificationResolverLibraryGenerator.queryType(attr);
            _builder.append(_queryType, " ");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append(")");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("extends resolver.api.");
    String _name_2 = eClass.getName();
    _builder.append(_name_2, "");
    _builder.newLineIfNotEmpty();
    {
      EList<EClass> _eSuperTypes = eClass.getESuperTypes();
      boolean _hasElements_1 = false;
      for(final EClass parent : _eSuperTypes) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
          _builder.append("  with ", "");
        } else {
          _builder.appendImmediate("\n  with ", "");
        }
        String _name_3 = parent.getName();
        _builder.append(_name_3, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public static Iterable<EStructuralFeature> getSortedAttributes(final EClass eClass) {
    Iterable<EClass> _selfAndAllSupertypes = OMLSpecificationResolverLibraryGenerator.selfAndAllSupertypes(eClass);
    final Function1<EClass, Iterable<EStructuralFeature>> _function = (EClass it) -> {
      return OMLSpecificationResolverLibraryGenerator.APIStructuralFeatures(it);
    };
    Iterable<Iterable<EStructuralFeature>> _map = IterableExtensions.<EClass, Iterable<EStructuralFeature>>map(_selfAndAllSupertypes, _function);
    Iterable<EStructuralFeature> _flatten = Iterables.<EStructuralFeature>concat(_map);
    final Function1<EStructuralFeature, Boolean> _function_1 = (EStructuralFeature f) -> {
      return OMLSpecificationResolverLibraryGenerator.isAPI(f);
    };
    Iterable<EStructuralFeature> _filter = IterableExtensions.<EStructuralFeature>filter(_flatten, _function_1);
    OMLSpecificationResolverLibraryGenerator.OMFFeatureCompare _oMFFeatureCompare = new OMLSpecificationResolverLibraryGenerator.OMFFeatureCompare();
    return IterableExtensions.<EStructuralFeature>sortWith(_filter, _oMFFeatureCompare);
  }
  
  public static Iterable<EClass> selfAndAllSupertypes(final EClass eClass) {
    ArrayList<EClass> _xblockexpression = null;
    {
      EList<EClass> _eAllSuperTypes = eClass.getEAllSuperTypes();
      final ArrayList<EClass> parents = new ArrayList<EClass>(_eAllSuperTypes);
      parents.add(eClass);
      _xblockexpression = parents;
    }
    return _xblockexpression;
  }
  
  public static String columnName(final EStructuralFeature feature) {
    String _xifexpression = null;
    if ((feature instanceof EReference)) {
      String _name = ((EReference)feature).getName();
      _xifexpression = (_name + "UUID");
    } else {
      _xifexpression = feature.getName();
    }
    return _xifexpression;
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
      final String scalaType = OMLSpecificationResolverLibraryGenerator.scalaTypeName(feature);
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
                  case "Map(Seq)":
                    String _xblockexpression_2 = null;
                    {
                      final String key = ann.get("key");
                      String _name = type.getName();
                      String _plus = ((("scala.collection.immutable.Map[resolver.api." + key) + ", scala.collection.immutable.Seq[resolver.api.") + _name);
                      _xblockexpression_2 = (_plus + "]]");
                    }
                    _switchResult_1 = _xblockexpression_2;
                    break;
                  case "Map":
                    String _xblockexpression_3 = null;
                    {
                      final String key = ann.get("key");
                      String _name = type.getName();
                      String _plus = ((("scala.collection.immutable.Map[" + key) + ", resolver.api.") + _name);
                      _xblockexpression_3 = (_plus + "]");
                    }
                    _switchResult_1 = _xblockexpression_3;
                    break;
                  case "Set":
                    String _name = type.getName();
                    String _plus = ("scala.collection.immutable.Set[_ <: resolver.api." + _name);
                    _switchResult_1 = (_plus + "]");
                    break;
                }
                _xblockexpression_1 = _switchResult_1;
              }
              _xifexpression_2 = _xblockexpression_1;
            } else {
              String _name = type.getName();
              String _plus = ("scala.Option[resolver.api." + _name);
              _xifexpression_2 = (_plus + "]");
            }
            _xifexpression_1 = _xifexpression_2;
          } else {
            String _name_1 = type.getName();
            _xifexpression_1 = ("resolver.api." + _name_1);
          }
          _switchResult = _xifexpression_1;
        }
      }
      if (!_matched) {
        String _name_2 = type.getName();
        _switchResult = (_name_2 + "//Default");
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
        _xifexpression = "def";
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
          } else {
            _builder.appendImmediate(",\n  ", "");
          }
          String _name = p.getName();
          _builder.append(_name, "");
          _builder.append(": ");
          String _queryType = OMLSpecificationResolverLibraryGenerator.queryType(p);
          _builder.append(_queryType, "");
        }
      }
      final String args = _builder.toString();
      String _name_1 = op.getName();
      String _plus = ((decl + " ") + _name_1);
      String _plus_1 = (_plus + "\n  (");
      String _plus_2 = (_plus_1 + args);
      String _xifexpression_2 = null;
      boolean _isEmpty_1 = args.isEmpty();
      if (_isEmpty_1) {
        _xifexpression_2 = ")";
      } else {
        _xifexpression_2 = "\n  )";
      }
      _xblockexpression = (_plus_2 + _xifexpression_2);
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
            String _plus = ((("scala.collection.immutable.Map[" + key) + ", resolver.api.") + _name);
            _xblockexpression_1 = (_plus + "]");
          }
          _switchResult = _xblockexpression_1;
          break;
        case "Set":
          EClassifier _eType = op.getEType();
          String _name = _eType.getName();
          String _plus = ("scala.collection.immutable.Set[_ <: resolver.api." + _name);
          _switchResult = (_plus + "]");
          break;
        default:
          String _xifexpression = null;
          int _lowerBound = op.getLowerBound();
          boolean _equals = (0 == _lowerBound);
          if (_equals) {
            EClassifier _eType_1 = op.getEType();
            String _name_1 = _eType_1.getName();
            String _plus_1 = ("scala.Option[resolver.api." + _name_1);
            _xifexpression = (_plus_1 + "]");
          } else {
            EClassifier _eType_2 = op.getEType();
            String _name_2 = _eType_2.getName();
            _xifexpression = ("resolver.api." + _name_2);
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
      return OMLSpecificationResolverLibraryGenerator.isAPI(it);
    };
    return IterableExtensions.<EStructuralFeature>filter(_eStructuralFeatures, _function);
  }
  
  public static Iterable<EOperation> APIOperations(final EClass eClass) {
    EList<EOperation> _eOperations = eClass.getEOperations();
    final Function1<EOperation, Boolean> _function = (EOperation it) -> {
      return OMLSpecificationResolverLibraryGenerator.isAPI(it);
    };
    return IterableExtensions.<EOperation>filter(_eOperations, _function);
  }
  
  public static Iterable<EOperation> ScalaOperations(final EClass eClass) {
    EList<EOperation> _eOperations = eClass.getEOperations();
    final Function1<EOperation, Boolean> _function = (EOperation op) -> {
      return Boolean.valueOf(((OMLSpecificationResolverLibraryGenerator.isScala(op)).booleanValue() || (!Objects.equal(null, OMLSpecificationResolverLibraryGenerator.xExpressions(op)))));
    };
    return IterableExtensions.<EOperation>filter(_eOperations, _function);
  }
  
  public static Boolean hasCustomImplementation(final ENamedElement e) {
    EAnnotation _eAnnotation = e.getEAnnotation("http://imce.jpl.nasa.gov/omf/CustomImplementation");
    return Boolean.valueOf((!Objects.equal(null, _eAnnotation)));
  }
  
  public static Boolean isAPI(final ENamedElement e) {
    EAnnotation _eAnnotation = e.getEAnnotation("http://imce.jpl.nasa.gov/omf/NotAPI");
    return Boolean.valueOf(Objects.equal(null, _eAnnotation));
  }
  
  public static Boolean isSchema(final ENamedElement e) {
    EAnnotation _eAnnotation = e.getEAnnotation("http://imce.jpl.nasa.gov/omf/NotSchema");
    return Boolean.valueOf(Objects.equal(null, _eAnnotation));
  }
  
  public static Boolean isScala(final ENamedElement e) {
    EAnnotation _eAnnotation = e.getEAnnotation("http://imce.jpl.nasa.gov/omf/Scala");
    return Boolean.valueOf((!Objects.equal(null, _eAnnotation)));
  }
  
  public static String scalaAnnotation(final EOperation op) {
    EAnnotation _eAnnotation = op.getEAnnotation("http://imce.jpl.nasa.gov/omf/Scala");
    EMap<String, String> _details = null;
    if (_eAnnotation!=null) {
      _details=_eAnnotation.getDetails();
    }
    String _get = null;
    if (_details!=null) {
      _get=_details.get("code");
    }
    return _get;
  }
  
  public static Iterable<XExpression> xExpressions(final EOperation op) {
    XcoreMapper _xcoreMapper = new XcoreMapper();
    XOperation _xOperation = _xcoreMapper.getXOperation(op);
    XBlockExpression _body = null;
    if (_xOperation!=null) {
      _body=_xOperation.getBody();
    }
    EList<XExpression> _expressions = null;
    if (_body!=null) {
      _expressions=_body.getExpressions();
    }
    return _expressions;
  }
  
  public static String queryBody(final EOperation op) {
    String _xblockexpression = null;
    {
      final String scalaCode = OMLSpecificationResolverLibraryGenerator.scalaAnnotation(op);
      final Iterable<XExpression> xExpressions = OMLSpecificationResolverLibraryGenerator.xExpressions(op);
      String _xifexpression = null;
      boolean _notEquals = (!Objects.equal(null, scalaCode));
      if (_notEquals) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t\t\t  ");
        _builder.append(scalaCode, "\t\t\t  ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("}");
        _xifexpression = _builder.toString();
      } else {
        String _xifexpression_1 = null;
        boolean _notEquals_1 = (!Objects.equal(null, xExpressions));
        if (_notEquals_1) {
          StringConcatenation _builder_1 = new StringConcatenation();
          {
            boolean _hasElements = false;
            for(final XExpression exp : xExpressions) {
              if (!_hasElements) {
                _hasElements = true;
                _builder_1.append("{\n  ", "");
              } else {
                _builder_1.appendImmediate("\n  ", "");
              }
              String _scala = OMLSpecificationResolverLibraryGenerator.toScala(exp);
              _builder_1.append(_scala, "");
            }
            if (_hasElements) {
              _builder_1.append("\n}", "");
            }
          }
          _xifexpression_1 = _builder_1.toString();
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public static String doc(final ENamedElement op, final String indent) {
    String _xblockexpression = null;
    {
      String _elvis = null;
      EAnnotation _eAnnotation = op.getEAnnotation("http://www.eclipse.org/emf/2002/GenModel");
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
