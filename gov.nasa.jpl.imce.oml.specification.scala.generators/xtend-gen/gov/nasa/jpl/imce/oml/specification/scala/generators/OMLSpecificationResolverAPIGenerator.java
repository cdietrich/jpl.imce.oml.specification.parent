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
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;

public class OMLSpecificationResolverAPIGenerator extends OMLUtilities {
  public static void main(final String[] args) {
    int _length = args.length;
    boolean _notEquals = (1 != _length);
    if (_notEquals) {
      System.err.println("usage: <dir> where <dir> is the directory of the /gov.nasa.jpl.imce.oml.specification.tables project");
      System.exit(1);
    }
    OMLSpecificationResolverAPIGenerator _oMLSpecificationResolverAPIGenerator = new OMLSpecificationResolverAPIGenerator();
    String _get = args[0];
    _oMLSpecificationResolverAPIGenerator.generate(_get);
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
    final Path bundlePath = Paths.get(targetDir);
    final String targetFolder = "shared/src/main/scala/gov/nasa/jpl/imce/oml/specification/resolver/api";
    final Path targetPath = bundlePath.resolve(targetFolder);
    File _file = targetPath.toFile();
    _file.mkdirs();
    Path _absolutePath = targetPath.toAbsolutePath();
    String _string = _absolutePath.toString();
    this.generate(ePackage, 
      "gov.nasa.jpl.imce.oml.specification.resolver.api", _string);
  }
  
  public void generate(final EPackage ePackage, final String packageQName, final String targetFolder) {
    try {
      File _file = new File(((targetFolder + File.separator) + "package.scala"));
      final FileOutputStream packageFile = new FileOutputStream(_file);
      try {
        String _generatePackageFile = this.generatePackageFile(ePackage, packageQName);
        byte[] _bytes = _generatePackageFile.getBytes();
        packageFile.write(_bytes);
      } finally {
        packageFile.close();
      }
      File _file_1 = new File(((targetFolder + File.separator) + "OMLResolvedFactory.scala"));
      final FileOutputStream factoryFile = new FileOutputStream(_file_1);
      try {
        String _generateFactoryFile = this.generateFactoryFile(ePackage, packageQName);
        byte[] _bytes_1 = _generateFactoryFile.getBytes();
        factoryFile.write(_bytes_1);
      } finally {
        factoryFile.close();
      }
      EList<EClassifier> _eClassifiers = ePackage.getEClassifiers();
      Iterable<EClass> _filter = Iterables.<EClass>filter(_eClassifiers, EClass.class);
      final Function1<EClass, Boolean> _function = new Function1<EClass, Boolean>() {
        @Override
        public Boolean apply(final EClass it) {
          return OMLUtilities.isAPI(it);
        }
      };
      Iterable<EClass> _filter_1 = IterableExtensions.<EClass>filter(_filter, _function);
      for (final EClass eClass : _filter_1) {
        {
          String _name = eClass.getName();
          String _plus = ((targetFolder + File.separator) + _name);
          String _plus_1 = (_plus + ".scala");
          File _file_2 = new File(_plus_1);
          final FileOutputStream classFile = new FileOutputStream(_file_2);
          try {
            String _generateClassFile = this.generateClassFile(eClass);
            byte[] _bytes_2 = _generateClassFile.getBytes();
            classFile.write(_bytes_2);
          } finally {
            classFile.close();
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String generatePackageFile(final EPackage ePackage, final String packageQName) {
    StringConcatenation _builder = new StringConcatenation();
    String _copyright = OMLUtilities.copyright();
    _builder.append(_copyright, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("package ");
    int _lastIndexOf = packageQName.lastIndexOf(".");
    String _substring = packageQName.substring(0, _lastIndexOf);
    _builder.append(_substring, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("package object ");
    int _lastIndexOf_1 = packageQName.lastIndexOf(".");
    int _plus = (_lastIndexOf_1 + 1);
    String _substring_1 = packageQName.substring(_plus);
    _builder.append(_substring_1, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      Iterable<EClass> _FunctionalAPIClasses = OMLSpecificationResolverAPIGenerator.FunctionalAPIClasses(ePackage);
      final Function1<EClass, Boolean> _function = new Function1<EClass, Boolean>() {
        @Override
        public Boolean apply(final EClass it) {
          Iterable<ETypedElement> _orderingKeys = OMLUtilities.orderingKeys(it);
          boolean _isEmpty = IterableExtensions.isEmpty(_orderingKeys);
          return Boolean.valueOf((!_isEmpty));
        }
      };
      Iterable<EClass> _filter = IterableExtensions.<EClass>filter(_FunctionalAPIClasses, _function);
      final Function1<EClass, String> _function_1 = new Function1<EClass, String>() {
        @Override
        public String apply(final EClass it) {
          return it.getName();
        }
      };
      List<EClass> _sortBy = IterableExtensions.<EClass, String>sortBy(_filter, _function_1);
      for(final EClass eClass : _sortBy) {
        _builder.append("  ");
        _builder.append("implicit def ");
        String _name = eClass.getName();
        String _firstLower = StringExtensions.toFirstLower(_name);
        _builder.append(_firstLower, "  ");
        _builder.append("Ordering");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append(": scala.Ordering[");
        String _name_1 = eClass.getName();
        _builder.append(_name_1, "  ");
        _builder.append("]");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("= new scala.Ordering[");
        String _name_2 = eClass.getName();
        _builder.append(_name_2, "  ");
        _builder.append("] {");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("\t");
        _builder.append("def compare(x: ");
        String _name_3 = eClass.getName();
        _builder.append(_name_3, "  \t");
        _builder.append(", y: ");
        String _name_4 = eClass.getName();
        _builder.append(_name_4, "  \t");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("\t");
        _builder.append(": scala.Int");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("\t");
        _builder.append("= ");
        {
          Iterable<ETypedElement> _orderingKeys = OMLUtilities.orderingKeys(eClass);
          for(final ETypedElement keyFeature : _orderingKeys) {
            {
              Boolean _isClassFeature = OMLSpecificationResolverAPIGenerator.isClassFeature(keyFeature);
              if ((_isClassFeature).booleanValue()) {
                EClassifier _eType = keyFeature.getEType();
                String _name_5 = _eType.getName();
                String _firstLower_1 = StringExtensions.toFirstLower(_name_5);
                _builder.append(_firstLower_1, "  \t");
                _builder.append("Ordering.compare(x.");
                String _name_6 = keyFeature.getName();
                _builder.append(_name_6, "  \t");
                _builder.append(",y.");
                String _name_7 = keyFeature.getName();
                _builder.append(_name_7, "  \t");
                _builder.append(")");
              } else {
                _builder.append("x.");
                String _columnName = OMLUtilities.columnName(keyFeature);
                _builder.append(_columnName, "  \t");
                _builder.append(".compareTo(y.");
                String _columnName_1 = OMLUtilities.columnName(keyFeature);
                _builder.append(_columnName_1, "  \t");
                _builder.append(")");
              }
            }
            _builder.append(" match {");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            _builder.append("\t");
            _builder.append(" \t");
            _builder.append("case c_");
            String _name_8 = keyFeature.getName();
            _builder.append(_name_8, "  \t \t");
            _builder.append(" if 0 != c_");
            String _name_9 = keyFeature.getName();
            _builder.append(_name_9, "  \t \t");
            _builder.append(" => c_");
            String _name_10 = keyFeature.getName();
            _builder.append(_name_10, "  \t \t");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            _builder.append("\t");
            _builder.append(" \t");
            _builder.append("case 0 => ");
          }
        }
        {
          Iterable<ETypedElement> _orderingKeys_1 = OMLUtilities.orderingKeys(eClass);
          boolean _hasElements = false;
          for(final ETypedElement keyFeature_1 : _orderingKeys_1) {
            if (!_hasElements) {
              _hasElements = true;
              _builder.append("0 }", "  \t");
            } else {
              _builder.appendImmediate(" }", "  \t");
            }
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("  ");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String generateFactoryFile(final EPackage ePackage, final String packageQName) {
    StringConcatenation _builder = new StringConcatenation();
    String _copyright = OMLUtilities.copyright();
    _builder.append(_copyright, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    _builder.append(packageQName, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("trait OMLResolvedFactory {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      Iterable<EClass> _FunctionalAPIClasses = OMLSpecificationResolverAPIGenerator.FunctionalAPIClasses(ePackage);
      final Function1<EClass, Boolean> _function = new Function1<EClass, Boolean>() {
        @Override
        public Boolean apply(final EClass it) {
          boolean _isAbstract = it.isAbstract();
          return Boolean.valueOf((!_isAbstract));
        }
      };
      Iterable<EClass> _filter = IterableExtensions.<EClass>filter(_FunctionalAPIClasses, _function);
      final Function1<EClass, String> _function_1 = new Function1<EClass, String>() {
        @Override
        public String apply(final EClass it) {
          return it.getName();
        }
      };
      List<EClass> _sortBy = IterableExtensions.<EClass, String>sortBy(_filter, _function_1);
      for(final EClass eClass : _sortBy) {
        _builder.append("  ");
        _builder.append("// ");
        String _name = eClass.getName();
        _builder.append(_name, "  ");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("def create");
        String _name_1 = eClass.getName();
        _builder.append(_name_1, "  ");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        {
          List<EStructuralFeature> _sortedAttributeSignature = OMLSpecificationResolverAPIGenerator.getSortedAttributeSignature(eClass);
          boolean _hasElements = false;
          for(final EStructuralFeature attr : _sortedAttributeSignature) {
            if (!_hasElements) {
              _hasElements = true;
              _builder.append("(", "  ");
            } else {
              _builder.appendImmediate(",\n ", "  ");
            }
            _builder.append(" ");
            String _name_2 = attr.getName();
            _builder.append(_name_2, "  ");
            _builder.append(": ");
            String _queryResolverType = OMLUtilities.queryResolverType(attr);
            _builder.append(_queryResolverType, "  ");
          }
          if (_hasElements) {
            _builder.append(" )", "  ");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append(": ");
        String _name_3 = eClass.getName();
        _builder.append(_name_3, "  ");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.newLine();
        {
          Iterable<EStructuralFeature> _lookupCopyConstructorArguments = OMLSpecificationResolverAPIGenerator.lookupCopyConstructorArguments(eClass);
          for(final EStructuralFeature attr_1 : _lookupCopyConstructorArguments) {
            _builder.append("  ");
            _builder.append("def copy");
            String _name_4 = eClass.getName();
            _builder.append(_name_4, "  ");
            _builder.append("_");
            String _name_5 = attr_1.getName();
            _builder.append(_name_5, "  ");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            _builder.append("( that: ");
            String _name_6 = eClass.getName();
            _builder.append(_name_6, "  ");
            _builder.append(",");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            _builder.append("  ");
            String _name_7 = attr_1.getName();
            _builder.append(_name_7, "    ");
            _builder.append(": ");
            String _queryResolverType_1 = OMLUtilities.queryResolverType(attr_1);
            _builder.append(_queryResolverType_1, "    ");
            _builder.append(" )");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            _builder.append(": ");
            String _name_8 = eClass.getName();
            _builder.append(_name_8, "  ");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String generateClassFile(final EClass eClass) {
    StringConcatenation _builder = new StringConcatenation();
    String _copyright = OMLUtilities.copyright();
    _builder.append(_copyright, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package gov.nasa.jpl.imce.oml.specification.resolver.api");
    _builder.newLine();
    _builder.newLine();
    String _doc = OMLUtilities.doc(eClass, "");
    _builder.append(_doc, "");
    String _traitDeclaration = OMLSpecificationResolverAPIGenerator.traitDeclaration(eClass);
    _builder.append(_traitDeclaration, "");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    {
      Iterable<EStructuralFeature> _APIStructuralFeatures = OMLSpecificationResolverAPIGenerator.APIStructuralFeatures(eClass);
      boolean _hasElements = false;
      for(final EStructuralFeature f : _APIStructuralFeatures) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("\n  ", "");
        } else {
          _builder.appendImmediate("\n  ", "");
        }
        String _doc_1 = OMLUtilities.doc(f, "  ");
        _builder.append(_doc_1, "");
        {
          Boolean _isOverride = OMLSpecificationResolverAPIGenerator.isOverride(f);
          if ((_isOverride).booleanValue()) {
            _builder.append("override ");
          }
        }
        _builder.append("val ");
        String _name = f.getName();
        _builder.append(_name, "");
        _builder.append(": ");
        String _queryResolverType = OMLUtilities.queryResolverType(f);
        _builder.append(_queryResolverType, "");
      }
      if (_hasElements) {
        _builder.append("\n", "");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      Iterable<EOperation> _APIOperations = OMLSpecificationResolverAPIGenerator.APIOperations(eClass);
      boolean _hasElements_1 = false;
      for(final EOperation op : _APIOperations) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
          _builder.append("\n  ", "");
        } else {
          _builder.appendImmediate("\n  ", "");
        }
        String _doc_2 = OMLUtilities.doc(op, "  ");
        _builder.append(_doc_2, "");
        String _queryResolverName = OMLUtilities.queryResolverName(op);
        _builder.append(_queryResolverName, "");
        _builder.append(": ");
        String _queryResolverType_1 = OMLUtilities.queryResolverType(op);
        _builder.append(_queryResolverType_1, "");
      }
      if (_hasElements_1) {
        _builder.append("\n", "");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      Boolean _isRootHierarchyClass = OMLSpecificationResolverAPIGenerator.isRootHierarchyClass(eClass);
      if ((_isRootHierarchyClass).booleanValue()) {
        _builder.newLine();
        _builder.append("def canEqual(that: scala.Any): scala.Boolean");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public static List<EStructuralFeature> getSortedAttributeSignature(final EClass eClass) {
    Iterable<EClass> _selfAndAllSupertypes = OMLUtilities.selfAndAllSupertypes(eClass);
    final Function1<EClass, Iterable<EStructuralFeature>> _function = new Function1<EClass, Iterable<EStructuralFeature>>() {
      @Override
      public Iterable<EStructuralFeature> apply(final EClass it) {
        return OMLSpecificationResolverAPIGenerator.APIStructuralFeatures(it);
      }
    };
    Iterable<Iterable<EStructuralFeature>> _map = IterableExtensions.<EClass, Iterable<EStructuralFeature>>map(_selfAndAllSupertypes, _function);
    Iterable<EStructuralFeature> _flatten = Iterables.<EStructuralFeature>concat(_map);
    OMLUtilities.OMLFeatureCompare _oMLFeatureCompare = new OMLUtilities.OMLFeatureCompare();
    return IterableExtensions.<EStructuralFeature>sortWith(_flatten, _oMLFeatureCompare);
  }
  
  public static List<EStructuralFeature> getSortedAttributes(final EClass eClass) {
    Iterable<EClass> _selfAndAllSupertypes = OMLUtilities.selfAndAllSupertypes(eClass);
    final Function1<EClass, EList<EStructuralFeature>> _function = new Function1<EClass, EList<EStructuralFeature>>() {
      @Override
      public EList<EStructuralFeature> apply(final EClass it) {
        return it.getEStructuralFeatures();
      }
    };
    Iterable<EList<EStructuralFeature>> _map = IterableExtensions.<EClass, EList<EStructuralFeature>>map(_selfAndAllSupertypes, _function);
    Iterable<EStructuralFeature> _flatten = Iterables.<EStructuralFeature>concat(_map);
    final Function1<EStructuralFeature, Boolean> _function_1 = new Function1<EStructuralFeature, Boolean>() {
      @Override
      public Boolean apply(final EStructuralFeature f) {
        return Boolean.valueOf(((OMLSpecificationResolverAPIGenerator.isAttributeOrReferenceOrContainer(f)).booleanValue() && (OMLUtilities.isSchema(f)).booleanValue()));
      }
    };
    Iterable<EStructuralFeature> _filter = IterableExtensions.<EStructuralFeature>filter(_flatten, _function_1);
    OMLUtilities.OMLFeatureCompare _oMLFeatureCompare = new OMLUtilities.OMLFeatureCompare();
    return IterableExtensions.<EStructuralFeature>sortWith(_filter, _oMLFeatureCompare);
  }
  
  public static Boolean isAuxiliaryClass(final EClass eClass) {
    return Boolean.valueOf(((eClass.isAbstract() && eClass.getESuperTypes().isEmpty()) && eClass.getEStructuralFeatures().isEmpty()));
  }
  
  public static Boolean isRootHierarchyClass(final EClass eClass) {
    return Boolean.valueOf(((eClass.isAbstract() && eClass.getESuperTypes().isEmpty()) && (!IterableExtensions.isEmpty(OMLUtilities.orderingKeys(eClass)))));
  }
  
  public static Boolean isSpecializationOfRootClass(final EClass eClass) {
    return Boolean.valueOf(((!eClass.getESuperTypes().isEmpty()) && IterableExtensions.<EClass>exists(OMLUtilities.selfAndAllSupertypes(eClass), new Function1<EClass, Boolean>() {
      @Override
      public Boolean apply(final EClass it) {
        return OMLSpecificationResolverAPIGenerator.isRootHierarchyClass(it);
      }
    })));
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
  
  public static Boolean isClassFeature(final ETypedElement feature) {
    boolean _xblockexpression = false;
    {
      final EClassifier type = feature.getEType();
      _xblockexpression = (type instanceof EClass);
    }
    return Boolean.valueOf(_xblockexpression);
  }
  
  public static Boolean isOverride(final ETypedElement feature) {
    EAnnotation _eAnnotation = feature.getEAnnotation("http://imce.jpl.nasa.gov/oml/Override");
    return Boolean.valueOf((null != _eAnnotation));
  }
  
  public static Iterable<EStructuralFeature> lookupCopyConstructorArguments(final EClass eClass) {
    List<EStructuralFeature> _sortedAttributeSignature = OMLSpecificationResolverAPIGenerator.getSortedAttributeSignature(eClass);
    final Function1<EStructuralFeature, Boolean> _function = new Function1<EStructuralFeature, Boolean>() {
      @Override
      public Boolean apply(final EStructuralFeature it) {
        return OMLSpecificationResolverAPIGenerator.isCopyConstructorArgument(it);
      }
    };
    return IterableExtensions.<EStructuralFeature>filter(_sortedAttributeSignature, _function);
  }
  
  public static Boolean isCopyConstructorArgument(final EStructuralFeature attribute) {
    EAnnotation _eAnnotation = attribute.getEAnnotation("http://imce.jpl.nasa.gov/oml/CopyConstructor");
    return Boolean.valueOf((null != _eAnnotation));
  }
  
  public static Iterable<EStructuralFeature> APIStructuralFeatures(final EClass eClass) {
    EList<EStructuralFeature> _eStructuralFeatures = eClass.getEStructuralFeatures();
    final Function1<EStructuralFeature, Boolean> _function = new Function1<EStructuralFeature, Boolean>() {
      @Override
      public Boolean apply(final EStructuralFeature it) {
        return OMLUtilities.isAPI(it);
      }
    };
    return IterableExtensions.<EStructuralFeature>filter(_eStructuralFeatures, _function);
  }
  
  public static Iterable<EClass> FunctionalAPIClasses(final EPackage ePkg) {
    EList<EClassifier> _eClassifiers = ePkg.getEClassifiers();
    Iterable<EClass> _filter = Iterables.<EClass>filter(_eClassifiers, EClass.class);
    final Function1<EClass, Boolean> _function = new Function1<EClass, Boolean>() {
      @Override
      public Boolean apply(final EClass it) {
        return OMLUtilities.isAPI(it);
      }
    };
    return IterableExtensions.<EClass>filter(_filter, _function);
  }
  
  public static Iterable<EOperation> APIOperations(final EClass eClass) {
    EList<EOperation> _eOperations = eClass.getEOperations();
    final Function1<EOperation, Boolean> _function = new Function1<EOperation, Boolean>() {
      @Override
      public Boolean apply(final EOperation it) {
        return OMLUtilities.isAPI(it);
      }
    };
    return IterableExtensions.<EOperation>filter(_eOperations, _function);
  }
}
