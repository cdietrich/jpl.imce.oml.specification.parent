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
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

public class OMLSpecificationResolverAPIGenerator extends OMLUtilities {
  public static void main(final String[] args) {
    int _length = args.length;
    boolean _notEquals = (1 != _length);
    if (_notEquals) {
      System.err.println("usage: <dir> where <dir> is the directory of the /gov.nasa.jpl.imce.oml.specification.tables project");
      System.exit(1);
    }
    new OMLSpecificationResolverAPIGenerator().generate(args[0]);
  }
  
  public void generate(final String targetDir) {
    final Path bundlePath = Paths.get(targetDir);
    final String targetFolder = "shared/src/main/scala/gov/nasa/jpl/imce/oml/specification/resolver/api";
    final Path targetPath = bundlePath.resolve(targetFolder);
    targetPath.toFile().mkdirs();
    this.generate(
      Collections.<EPackage>unmodifiableList(CollectionLiterals.<EPackage>newArrayList(this.c, this.t, this.g, this.b, this.d, this.e)), 
      "gov.nasa.jpl.imce.oml.specification.resolver.api", 
      targetPath.toAbsolutePath().toString());
  }
  
  public void generate(final List<EPackage> ePackages, final String packageQName, final String targetFolder) {
    try {
      File _file = new File(((targetFolder + File.separator) + "package.scala"));
      final FileOutputStream packageFile = new FileOutputStream(_file);
      try {
        packageFile.write(this.generatePackageFile(ePackages, packageQName).getBytes());
      } finally {
        packageFile.close();
      }
      File _file_1 = new File(((targetFolder + File.separator) + "OMLResolvedFactory.scala"));
      final FileOutputStream factoryFile = new FileOutputStream(_file_1);
      try {
        factoryFile.write(this.generateFactoryFile(ePackages, packageQName).getBytes());
      } finally {
        factoryFile.close();
      }
      final Function1<EPackage, EList<EClassifier>> _function = (EPackage it) -> {
        return it.getEClassifiers();
      };
      final Function1<EClass, Boolean> _function_1 = (EClass it) -> {
        return OMLUtilities.isAPI(it);
      };
      Iterable<EClass> _filter = IterableExtensions.<EClass>filter(Iterables.<EClass>filter(Iterables.<EClassifier>concat(ListExtensions.<EPackage, EList<EClassifier>>map(ePackages, _function)), EClass.class), _function_1);
      for (final EClass eClass : _filter) {
        {
          String _name = eClass.getName();
          String _plus = ((targetFolder + File.separator) + _name);
          String _plus_1 = (_plus + ".scala");
          File _file_2 = new File(_plus_1);
          final FileOutputStream classFile = new FileOutputStream(_file_2);
          try {
            classFile.write(this.generateClassFile(eClass).getBytes());
          } finally {
            classFile.close();
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String generatePackageFile(final List<EPackage> ePackages, final String packageQName) {
    StringConcatenation _builder = new StringConcatenation();
    String _copyright = OMLUtilities.copyright();
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
      final Function1<EPackage, Iterable<EClass>> _function = (EPackage it) -> {
        return OMLUtilities.FunctionalAPIClasses(it);
      };
      final Function1<EClass, Boolean> _function_1 = (EClass it) -> {
        boolean _isEmpty = IterableExtensions.isEmpty(OMLUtilities.orderingKeys(it));
        return Boolean.valueOf((!_isEmpty));
      };
      final Function1<EClass, String> _function_2 = (EClass it) -> {
        return it.getName();
      };
      List<EClass> _sortBy = IterableExtensions.<EClass, String>sortBy(IterableExtensions.<EClass>filter(Iterables.<EClass>concat(ListExtensions.<EPackage, Iterable<EClass>>map(ePackages, _function)), _function_1), _function_2);
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
          Iterable<ETypedElement> _orderingKeys = OMLUtilities.orderingKeys(eClass);
          for(final ETypedElement keyFeature : _orderingKeys) {
            {
              Boolean _isClassFeature = OMLUtilities.isClassFeature(keyFeature);
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
  
  public String generateFactoryFile(final List<EPackage> ePackages, final String packageQName) {
    StringConcatenation _builder = new StringConcatenation();
    String _copyright = OMLUtilities.copyright();
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
      final Function1<EPackage, Iterable<EClass>> _function = (EPackage it) -> {
        return OMLUtilities.FunctionalAPIClasses(it);
      };
      final Function1<EClass, Boolean> _function_1 = (EClass it) -> {
        boolean _isAbstract = it.isAbstract();
        return Boolean.valueOf((!_isAbstract));
      };
      final Function1<EClass, String> _function_2 = (EClass it) -> {
        return it.getName();
      };
      List<EClass> _sortBy = IterableExtensions.<EClass, String>sortBy(IterableExtensions.<EClass>filter(Iterables.<EClass>concat(ListExtensions.<EPackage, Iterable<EClass>>map(ePackages, _function)), _function_1), _function_2);
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
          Iterable<EStructuralFeature> _sortedAttributeSignatureExceptDerived = OMLUtilities.getSortedAttributeSignatureExceptDerived(eClass);
          boolean _hasElements = false;
          for(final EStructuralFeature attr : _sortedAttributeSignatureExceptDerived) {
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
            String _queryResolverType = OMLUtilities.queryResolverType(attr, "");
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
          Iterable<EStructuralFeature> _lookupCopyConstructorArguments = OMLUtilities.lookupCopyConstructorArguments(eClass);
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
            String _queryResolverType_1 = OMLUtilities.queryResolverType(attr_1, "");
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
    _builder.append(_copyright);
    _builder.newLineIfNotEmpty();
    _builder.append("package gov.nasa.jpl.imce.oml.specification.resolver.api");
    _builder.newLine();
    _builder.newLine();
    String _doc = OMLUtilities.doc(eClass, "");
    _builder.append(_doc);
    String _traitDeclaration = OMLSpecificationResolverAPIGenerator.traitDeclaration(eClass);
    _builder.append(_traitDeclaration);
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    {
      Iterable<EStructuralFeature> _APIStructuralFeatures = OMLUtilities.APIStructuralFeatures(eClass);
      boolean _hasElements = false;
      for(final EStructuralFeature f : _APIStructuralFeatures) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("\n  ");
        } else {
          _builder.appendImmediate("\n  ", "");
        }
        String _doc_1 = OMLUtilities.doc(f, "  ");
        _builder.append(_doc_1);
        {
          Boolean _isOverride = OMLUtilities.isOverride(f);
          if ((_isOverride).booleanValue()) {
            _builder.append("override ");
          }
        }
        _builder.append("val ");
        String _name = f.getName();
        _builder.append(_name);
        _builder.append(": ");
        String _queryResolverType = OMLUtilities.queryResolverType(f, "");
        _builder.append(_queryResolverType);
      }
      if (_hasElements) {
        _builder.append("\n");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      Iterable<EOperation> _APIOperations = OMLUtilities.APIOperations(eClass);
      boolean _hasElements_1 = false;
      for(final EOperation op : _APIOperations) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
          _builder.append("\n  ");
        } else {
          _builder.appendImmediate("\n  ", "");
        }
        String _doc_2 = OMLUtilities.doc(op, "  ");
        _builder.append(_doc_2);
        String _queryResolverName = OMLUtilities.queryResolverName(op, "");
        _builder.append(_queryResolverName);
        _builder.append(": ");
        String _queryResolverType_1 = OMLUtilities.queryResolverType(op, "");
        _builder.append(_queryResolverType_1);
      }
      if (_hasElements_1) {
        _builder.append("\n");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      Boolean _isRootHierarchyClass = OMLUtilities.isRootHierarchyClass(eClass);
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
}
