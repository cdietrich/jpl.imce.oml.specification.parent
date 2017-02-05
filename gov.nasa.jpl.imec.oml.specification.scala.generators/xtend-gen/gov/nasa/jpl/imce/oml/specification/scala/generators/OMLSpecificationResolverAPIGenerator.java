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
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
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
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

public class OMLSpecificationResolverAPIGenerator {
  public static class OMLFeatureCompare implements Comparator<EStructuralFeature> {
    private final List<String> knownAttributes = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("graphUUID", "uuid", "axiomUUID", "terminologyUUID", "keyUUID", "subjectUUID", "propertyUUID", "kind", "isAbstract", "asymmetric", "essential", "functional", "inverseEssential", "inverseFunctional", "irreflexive", "reflexive", "symmetric", "transitive", "name", "unreifiedPropertyName", "unreifiedInversePropertyName", "iri", "value"));
    
    @Override
    public int compare(final EStructuralFeature o1, final EStructuralFeature o2) {
      int _xblockexpression = (int) 0;
      {
        final String name1 = OMLSpecificationResolverAPIGenerator.columnName(o1);
        final String name2 = OMLSpecificationResolverAPIGenerator.columnName(o2);
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
      final String sourceFile = "/jpl.imce.oml.specification.ecore/model/OMLSpecification.xcore";
      final String targetBundle = "gov.nasa.jpl.imce.oml.specification.tables";
      final XtextResourceSet set = new XtextResourceSet();
      set.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap(true));
      set.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
      final URI sourceURI = URI.createPlatformResourceURI(sourceFile, false);
      final Resource sourceResource = set.getResource(sourceURI, true);
      final EPackage ePackage = ((EPackage[])Conversions.unwrapArray(Iterables.<EPackage>filter(sourceResource.getContents(), EPackage.class), EPackage.class))[0];
      final String targetFolder = "/shared/src/main/scala/gov/nasa/jpl/imce/oml/specification/resolver/api";
      final URL targetURL = Platform.getBundle(targetBundle).getEntry(targetFolder);
      final URL folder = FileLocator.toFileURL(targetURL);
      this.generate(ePackage, "gov.nasa.jpl.imce.oml.specification.resolver.api", folder.getPath());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void generate(final EPackage ePackage, final String packageQName, final String targetFolder) {
    try {
      File _file = new File(((targetFolder + File.separator) + "package.scala"));
      final FileOutputStream packageFile = new FileOutputStream(_file);
      packageFile.write(this.generatePackageFile(ePackage, packageQName).getBytes());
      File _file_1 = new File(((targetFolder + File.separator) + "OMLResolvedFactory.scala"));
      final FileOutputStream factoryFile = new FileOutputStream(_file_1);
      factoryFile.write(this.generateFactoryFile(ePackage, packageQName).getBytes());
      final Function1<EClass, Boolean> _function = (EClass it) -> {
        return OMLSpecificationResolverAPIGenerator.isAPI(it);
      };
      Iterable<EClass> _filter = IterableExtensions.<EClass>filter(Iterables.<EClass>filter(ePackage.getEClassifiers(), EClass.class), _function);
      for (final EClass eClass : _filter) {
        {
          String _name = eClass.getName();
          String _plus = ((targetFolder + File.separator) + _name);
          String _plus_1 = (_plus + ".scala");
          File _file_2 = new File(_plus_1);
          final FileOutputStream classFile = new FileOutputStream(_file_2);
          classFile.write(this.generateClassFile(eClass).getBytes());
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String generatePackageFile(final EPackage ePackage, final String packageQName) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _copyright = this.copyright();
    _builder.append(_copyright);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("package ");
    String _substring = packageQName.substring(0, packageQName.lastIndexOf("."));
    _builder.append(_substring);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("package object ");
    int _lastIndexOf = packageQName.lastIndexOf(".");
    int _plus = (_lastIndexOf + 1);
    String _substring_1 = packageQName.substring(_plus);
    _builder.append(_substring_1);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      final Function1<EClass, Boolean> _function = (EClass it) -> {
        boolean _isEmpty = IterableExtensions.isEmpty(OMLSpecificationResolverAPIGenerator.orderingKeys(it));
        return Boolean.valueOf((!_isEmpty));
      };
      final Function1<EClass, String> _function_1 = (EClass it) -> {
        return it.getName();
      };
      List<EClass> _sortBy = IterableExtensions.<EClass, String>sortBy(IterableExtensions.<EClass>filter(OMLSpecificationResolverAPIGenerator.FunctionalAPIClasses(ePackage), _function), _function_1);
      for(final EClass eClass : _sortBy) {
        _builder.append("  ");
        _builder.append("implicit def ");
        String _firstLower = StringExtensions.toFirstLower(eClass.getName());
        _builder.append(_firstLower, "  ");
        _builder.append("Ordering");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append(": scala.Ordering[");
        String _name = eClass.getName();
        _builder.append(_name, "  ");
        _builder.append("]");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("= new scala.Ordering[");
        String _name_1 = eClass.getName();
        _builder.append(_name_1, "  ");
        _builder.append("] {");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("\t");
        _builder.append("def compare(x: ");
        String _name_2 = eClass.getName();
        _builder.append(_name_2, "  \t");
        _builder.append(", y: ");
        String _name_3 = eClass.getName();
        _builder.append(_name_3, "  \t");
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
          Iterable<EStructuralFeature> _orderingKeys = OMLSpecificationResolverAPIGenerator.orderingKeys(eClass);
          for(final EStructuralFeature keyFeature : _orderingKeys) {
            {
              Boolean _isClassFeature = OMLSpecificationResolverAPIGenerator.isClassFeature(keyFeature);
              if ((_isClassFeature).booleanValue()) {
                String _firstLower_1 = StringExtensions.toFirstLower(keyFeature.getEType().getName());
                _builder.append(_firstLower_1, "  \t");
                _builder.append("Ordering.compare(x.");
                String _name_4 = keyFeature.getName();
                _builder.append(_name_4, "  \t");
                _builder.append(",y.");
                String _name_5 = keyFeature.getName();
                _builder.append(_name_5, "  \t");
                _builder.append(")");
              } else {
                _builder.append("x.");
                String _columnName = OMLSpecificationResolverAPIGenerator.columnName(keyFeature);
                _builder.append(_columnName, "  \t");
                _builder.append(".compareTo(y.");
                String _columnName_1 = OMLSpecificationResolverAPIGenerator.columnName(keyFeature);
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
            String _name_6 = keyFeature.getName();
            _builder.append(_name_6, "  \t \t");
            _builder.append(" if 0 != c_");
            String _name_7 = keyFeature.getName();
            _builder.append(_name_7, "  \t \t");
            _builder.append(" => c_");
            String _name_8 = keyFeature.getName();
            _builder.append(_name_8, "  \t \t");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            _builder.append("\t");
            _builder.append(" \t");
            _builder.append("case 0 => ");
          }
        }
        {
          Iterable<EStructuralFeature> _orderingKeys_1 = OMLSpecificationResolverAPIGenerator.orderingKeys(eClass);
          boolean _hasElements = false;
          for(final EStructuralFeature keyFeature_1 : _orderingKeys_1) {
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
    CharSequence _copyright = this.copyright();
    _builder.append(_copyright);
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    _builder.append(packageQName);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("trait OMLResolvedFactory {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      final Function1<EClass, Boolean> _function = (EClass it) -> {
        boolean _isAbstract = it.isAbstract();
        return Boolean.valueOf((!_isAbstract));
      };
      final Function1<EClass, String> _function_1 = (EClass it) -> {
        return it.getName();
      };
      List<EClass> _sortBy = IterableExtensions.<EClass, String>sortBy(IterableExtensions.<EClass>filter(OMLSpecificationResolverAPIGenerator.FunctionalAPIClasses(ePackage), _function), _function_1);
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
            String _queryType = OMLSpecificationResolverAPIGenerator.queryType(attr);
            _builder.append(_queryType, "  ");
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
            String _queryType_1 = OMLSpecificationResolverAPIGenerator.queryType(attr_1);
            _builder.append(_queryType_1, "    ");
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
    CharSequence _copyright = this.copyright();
    _builder.append(_copyright);
    _builder.newLineIfNotEmpty();
    _builder.append("package gov.nasa.jpl.imce.oml.specification.resolver.api");
    _builder.newLine();
    _builder.newLine();
    String _doc = OMLSpecificationResolverAPIGenerator.doc(eClass, "");
    _builder.append(_doc);
    String _traitDeclaration = OMLSpecificationResolverAPIGenerator.traitDeclaration(eClass);
    _builder.append(_traitDeclaration);
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    {
      Iterable<EStructuralFeature> _APIStructuralFeatures = OMLSpecificationResolverAPIGenerator.APIStructuralFeatures(eClass);
      boolean _hasElements = false;
      for(final EStructuralFeature f : _APIStructuralFeatures) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("\n  ");
        } else {
          _builder.appendImmediate("\n  ", "");
        }
        String _doc_1 = OMLSpecificationResolverAPIGenerator.doc(f, "  ");
        _builder.append(_doc_1);
        {
          Boolean _isOverride = OMLSpecificationResolverAPIGenerator.isOverride(f);
          if ((_isOverride).booleanValue()) {
            _builder.append("override ");
          }
        }
        _builder.append("val ");
        String _name = f.getName();
        _builder.append(_name);
        _builder.append(": ");
        String _queryType = OMLSpecificationResolverAPIGenerator.queryType(f);
        _builder.append(_queryType);
      }
      if (_hasElements) {
        _builder.append("\n");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      Iterable<EOperation> _APIOperations = OMLSpecificationResolverAPIGenerator.APIOperations(eClass);
      boolean _hasElements_1 = false;
      for(final EOperation op : _APIOperations) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
          _builder.append("\n  ");
        } else {
          _builder.appendImmediate("\n  ", "");
        }
        String _doc_2 = OMLSpecificationResolverAPIGenerator.doc(op, "  ");
        _builder.append(_doc_2);
        String _queryName = OMLSpecificationResolverAPIGenerator.queryName(op);
        _builder.append(_queryName);
        _builder.append(": ");
        String _queryType_1 = OMLSpecificationResolverAPIGenerator.queryType(op);
        _builder.append(_queryType_1);
      }
      if (_hasElements_1) {
        _builder.append("\n");
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
  
  public static Iterable<EStructuralFeature> orderingKeys(final EClass eClass) {
    final Function1<EStructuralFeature, Boolean> _function = (EStructuralFeature f) -> {
      EAnnotation _eAnnotation = f.getEAnnotation("http://imce.jpl.nasa.gov/oml/IsOrderingKey");
      return Boolean.valueOf((null != _eAnnotation));
    };
    return IterableExtensions.<EStructuralFeature>filter(OMLSpecificationResolverAPIGenerator.getSortedAttributes(eClass), _function);
  }
  
  public static List<EStructuralFeature> getSortedAttributeSignature(final EClass eClass) {
    final Function1<EClass, EList<EStructuralFeature>> _function = (EClass it) -> {
      return it.getEStructuralFeatures();
    };
    Iterable<EStructuralFeature> _flatten = Iterables.<EStructuralFeature>concat(ListExtensions.<EClass, EList<EStructuralFeature>>map(OMLSpecificationResolverAPIGenerator.selfAndAllSupertypes(eClass), _function));
    OMLSpecificationResolverAPIGenerator.OMLFeatureCompare _oMLFeatureCompare = new OMLSpecificationResolverAPIGenerator.OMLFeatureCompare();
    return IterableExtensions.<EStructuralFeature>sortWith(_flatten, _oMLFeatureCompare);
  }
  
  public static List<EStructuralFeature> getSortedAttributes(final EClass eClass) {
    final Function1<EClass, EList<EStructuralFeature>> _function = (EClass it) -> {
      return it.getEStructuralFeatures();
    };
    final Function1<EStructuralFeature, Boolean> _function_1 = (EStructuralFeature f) -> {
      return Boolean.valueOf(((OMLSpecificationResolverAPIGenerator.isAttributeOrReferenceOrContainer(f)).booleanValue() && (OMLSpecificationResolverAPIGenerator.isSchema(f)).booleanValue()));
    };
    Iterable<EStructuralFeature> _filter = IterableExtensions.<EStructuralFeature>filter(Iterables.<EStructuralFeature>concat(ListExtensions.<EClass, EList<EStructuralFeature>>map(OMLSpecificationResolverAPIGenerator.selfAndAllSupertypes(eClass), _function)), _function_1);
    OMLSpecificationResolverAPIGenerator.OMLFeatureCompare _oMLFeatureCompare = new OMLSpecificationResolverAPIGenerator.OMLFeatureCompare();
    return IterableExtensions.<EStructuralFeature>sortWith(_filter, _oMLFeatureCompare);
  }
  
  public static List<EClass> selfAndAllSupertypes(final EClass eClass) {
    ArrayList<EClass> _xblockexpression = null;
    {
      EList<EClass> _eAllSuperTypes = eClass.getEAllSuperTypes();
      final ArrayList<EClass> parents = new ArrayList<EClass>(_eAllSuperTypes);
      parents.add(eClass);
      _xblockexpression = parents;
    }
    return _xblockexpression;
  }
  
  public static Boolean isSchema(final ENamedElement e) {
    EAnnotation _eAnnotation = e.getEAnnotation("http://imce.jpl.nasa.gov/oml/NotSchema");
    return Boolean.valueOf((null == _eAnnotation));
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
  
  public static Boolean isAuxiliaryClass(final EClass eClass) {
    return Boolean.valueOf(((eClass.isAbstract() && eClass.getESuperTypes().isEmpty()) && eClass.getEStructuralFeatures().isEmpty()));
  }
  
  public static Boolean isRootHierarchyClass(final EClass eClass) {
    return Boolean.valueOf(((eClass.isAbstract() && eClass.getESuperTypes().isEmpty()) && (!IterableExtensions.isEmpty(OMLSpecificationResolverAPIGenerator.orderingKeys(eClass)))));
  }
  
  public static Boolean isSpecializationOfRootClass(final EClass eClass) {
    return Boolean.valueOf(((!eClass.getESuperTypes().isEmpty()) && IterableExtensions.<EClass>exists(OMLSpecificationResolverAPIGenerator.selfAndAllSupertypes(eClass), ((Function1<EClass, Boolean>) (EClass it) -> {
      return OMLSpecificationResolverAPIGenerator.isRootHierarchyClass(it);
    }))));
  }
  
  public static String traitDeclaration(final EClass eClass) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("trait ");
    String _name = eClass.getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    {
      EList<EClass> _eSuperTypes = eClass.getESuperTypes();
      boolean _hasElements = false;
      for(final EClass parent : _eSuperTypes) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("  extends ");
        } else {
          _builder.appendImmediate("\n  with ", "");
        }
        String _name_1 = parent.getName();
        _builder.append(_name_1);
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
      if (_name != null) {
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
            _switchResult = "gov.nasa.jpl.imce.oml.specification.tables.IRI";
            break;
          case "Language":
            _switchResult = "gov.nasa.jpl.imce.oml.specification.tables.Language";
            break;
          case "LexicalNumber":
            _switchResult = "gov.nasa.jpl.imce.oml.specification.tables.LexicalNumber";
            break;
          case "LexicalTime":
            _switchResult = "gov.nasa.jpl.imce.oml.specification.tables.LexicalTime";
            break;
          case "LexicalValue":
            _switchResult = "gov.nasa.jpl.imce.oml.specification.tables.LexicalValue";
            break;
          case "LocalName":
            _switchResult = "gov.nasa.jpl.imce.oml.specification.tables.LocalName";
            break;
          case "Pattern":
            _switchResult = "gov.nasa.jpl.imce.oml.specification.tables.Pattern";
            break;
          case "UUID":
            _switchResult = "java.util.UUID";
            break;
          case "TerminologyGraphKind":
            _switchResult = "gov.nasa.jpl.imce.oml.specification.tables.TerminologyGraphKind";
            break;
          default:
            _switchResult = type.getName();
            break;
        }
      } else {
        _switchResult = type.getName();
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
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
  
  public static String queryType(final ETypedElement feature) {
    String _xblockexpression = null;
    {
      final EClassifier type = feature.getEType();
      final String scalaType = OMLSpecificationResolverAPIGenerator.scalaTypeName(feature);
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
                EAnnotation _eAnnotation = feature.getEAnnotation("http://imce.jpl.nasa.gov/oml/Collection");
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
                if (_elvis != null) {
                  switch (_elvis) {
                    case "Map(Seq)":
                      String _xblockexpression_2 = null;
                      {
                        final String key = ann.get("key");
                        String _name = type.getName();
                        String _plus = ((("scala.collection.immutable.Map[" + key) + ", scala.collection.immutable.Seq[") + _name);
                        _xblockexpression_2 = (_plus + "]]");
                      }
                      _switchResult_1 = _xblockexpression_2;
                      break;
                    case "Map":
                      String _xblockexpression_3 = null;
                      {
                        final String key = ann.get("key");
                        String _name = type.getName();
                        String _plus = ((("scala.collection.immutable.Map[" + key) + ", ") + _name);
                        _xblockexpression_3 = (_plus + "]");
                      }
                      _switchResult_1 = _xblockexpression_3;
                      break;
                    case "Set":
                      String _name = type.getName();
                      String _plus = ("scala.collection.immutable.Set[_ <: " + _name);
                      _switchResult_1 = (_plus + "]");
                      break;
                    case "SortedSet":
                      String _name_1 = type.getName();
                      String _plus_1 = ("scala.collection.immutable.SortedSet[" + _name_1);
                      _switchResult_1 = (_plus_1 + "]");
                      break;
                  }
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
      boolean _isEmpty = op.getEParameters().isEmpty();
      if (_isEmpty) {
        _xifexpression = "def";
      } else {
        _xifexpression = "def";
      }
      final String kind = _xifexpression;
      String _xifexpression_1 = null;
      EAnnotation _eAnnotation = op.getEAnnotation("http://imce.jpl.nasa.gov/oml/Override");
      boolean _tripleNotEquals = (null != _eAnnotation);
      if (_tripleNotEquals) {
        _xifexpression_1 = ("override " + kind);
      } else {
        _xifexpression_1 = kind;
      }
      final String decl = _xifexpression_1;
      StringConcatenation _builder = new StringConcatenation();
      {
        EList<EParameter> _eParameters = op.getEParameters();
        boolean _hasElements = false;
        for(final EParameter p : _eParameters) {
          if (!_hasElements) {
            _hasElements = true;
          } else {
            _builder.appendImmediate(",\n  ", "");
          }
          String _name = p.getName();
          _builder.append(_name);
          _builder.append(": ");
          String _queryType = OMLSpecificationResolverAPIGenerator.queryType(p);
          _builder.append(_queryType);
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
  
  public static Iterable<EStructuralFeature> lookupCopyConstructorArguments(final EClass eClass) {
    final Function1<EStructuralFeature, Boolean> _function = (EStructuralFeature it) -> {
      return OMLSpecificationResolverAPIGenerator.isCopyConstructorArgument(it);
    };
    return IterableExtensions.<EStructuralFeature>filter(OMLSpecificationResolverAPIGenerator.getSortedAttributeSignature(eClass), _function);
  }
  
  public static Boolean isCopyConstructorArgument(final EStructuralFeature attribute) {
    EAnnotation _eAnnotation = attribute.getEAnnotation("http://imce.jpl.nasa.gov/oml/CopyConstructor");
    return Boolean.valueOf((null != _eAnnotation));
  }
  
  public static String queryType(final EOperation op) {
    String _xblockexpression = null;
    {
      EAnnotation _eAnnotation = op.getEAnnotation("http://imce.jpl.nasa.gov/oml/Collection");
      EMap<String, String> _details = null;
      if (_eAnnotation!=null) {
        _details=_eAnnotation.getDetails();
      }
      final EMap<String, String> ann = _details;
      final String scalaType = OMLSpecificationResolverAPIGenerator.scalaTypeName(op);
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
      if (_elvis != null) {
        switch (_elvis) {
          case "Map":
            String _xblockexpression_1 = null;
            {
              final String key = ann.get("key");
              _xblockexpression_1 = (((("scala.collection.immutable.Map[" + key) + ",") + scalaType) + "]");
            }
            _switchResult = _xblockexpression_1;
            break;
          case "SortedSet":
            _switchResult = (("scala.collection.immutable.SortedSet[" + scalaType) + "]");
            break;
          case "Set":
            _switchResult = (("scala.collection.immutable.Set[_ <: " + scalaType) + "]");
            break;
          default:
            String _xifexpression = null;
            int _lowerBound = op.getLowerBound();
            boolean _equals = (0 == _lowerBound);
            if (_equals) {
              _xifexpression = (("scala.Option[" + scalaType) + "]");
            } else {
              _xifexpression = scalaType;
            }
            _switchResult = _xifexpression;
            break;
        }
      } else {
        String _xifexpression = null;
        int _lowerBound = op.getLowerBound();
        boolean _equals = (0 == _lowerBound);
        if (_equals) {
          _xifexpression = (("scala.Option[" + scalaType) + "]");
        } else {
          _xifexpression = scalaType;
        }
        _switchResult = _xifexpression;
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  public static Iterable<EStructuralFeature> APIStructuralFeatures(final EClass eClass) {
    final Function1<EStructuralFeature, Boolean> _function = (EStructuralFeature it) -> {
      return OMLSpecificationResolverAPIGenerator.isAPI(it);
    };
    return IterableExtensions.<EStructuralFeature>filter(eClass.getEStructuralFeatures(), _function);
  }
  
  public static Iterable<EClass> FunctionalAPIClasses(final EPackage ePkg) {
    final Function1<EClass, Boolean> _function = (EClass it) -> {
      return OMLSpecificationResolverAPIGenerator.isAPI(it);
    };
    return IterableExtensions.<EClass>filter(Iterables.<EClass>filter(ePkg.getEClassifiers(), EClass.class), _function);
  }
  
  public static Iterable<EOperation> APIOperations(final EClass eClass) {
    final Function1<EOperation, Boolean> _function = (EOperation it) -> {
      return OMLSpecificationResolverAPIGenerator.isAPI(it);
    };
    return IterableExtensions.<EOperation>filter(eClass.getEOperations(), _function);
  }
  
  public static Boolean isAPI(final ENamedElement e) {
    EAnnotation _eAnnotation = e.getEAnnotation("http://imce.jpl.nasa.gov/oml/NotFunctionalAPI");
    return Boolean.valueOf((null == _eAnnotation));
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
