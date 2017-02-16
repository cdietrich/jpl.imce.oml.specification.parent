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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

public class OMLSpecificationResolverLibraryGenerator extends OMLUtilities {
  public static void main(final String[] args) {
    int _length = args.length;
    boolean _notEquals = (1 != _length);
    if (_notEquals) {
      System.err.println("usage: <dir> where <dir> is the directory of the /gov.nasa.jpl.imce.oml.specification.tables project");
      System.exit(1);
    }
    OMLSpecificationResolverLibraryGenerator _oMLSpecificationResolverLibraryGenerator = new OMLSpecificationResolverLibraryGenerator();
    String _get = args[0];
    _oMLSpecificationResolverLibraryGenerator.generate(_get);
  }
  
  public void generate(final String targetDir) {
    final String omlXcore = "/model/OMLSpecification.xcore";
    final Procedure1<Map<URI, URI>> _function = (Map<URI, URI> uriMap) -> {
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
    };
    final XtextResourceSet set = OMLUtilities.createXcoreResourceSet(_function);
    final URI sourceURI = URI.createPlatformResourceURI(("/jpl.imce.oml.specification.ecore" + omlXcore), false);
    final Resource sourceResource = set.getResource(sourceURI, true);
    EcoreUtil.resolveAll(set);
    EList<EObject> _contents = sourceResource.getContents();
    Iterable<EPackage> _filter = Iterables.<EPackage>filter(_contents, EPackage.class);
    final EPackage ePackage = ((EPackage[])Conversions.unwrapArray(_filter, EPackage.class))[0];
    final Path bundlePath = Paths.get(targetDir);
    final String targetFolder = "src/main/scala/gov/nasa/jpl/imce/oml/specification/resolver/impl";
    final Path targetPath = bundlePath.resolve(targetFolder);
    File _file = targetPath.toFile();
    _file.mkdirs();
    Path _absolutePath = targetPath.toAbsolutePath();
    String _string = _absolutePath.toString();
    this.generate(ePackage, _string);
  }
  
  public void generate(final EPackage ePackage, final String targetFolder) {
    try {
      File _file = new File(((targetFolder + File.separator) + "OMLResolvedFactoryImpl.scala"));
      final FileOutputStream factoryFile = new FileOutputStream(_file);
      String _generateFactoryFile = this.generateFactoryFile(ePackage, "gov.nasa.jpl.imce.oml.specification.resolver.impl");
      byte[] _bytes = _generateFactoryFile.getBytes();
      factoryFile.write(_bytes);
      Iterable<EClass> _FunctionalAPIClasses = OMLUtilities.FunctionalAPIClasses(ePackage);
      for (final EClass eClass : _FunctionalAPIClasses) {
        {
          String _name = eClass.getName();
          String _plus = ((targetFolder + File.separator) + _name);
          String _plus_1 = (_plus + ".scala");
          File _file_1 = new File(_plus_1);
          final FileOutputStream classFile = new FileOutputStream(_file_1);
          String _generateClassFile = this.generateClassFile(eClass);
          byte[] _bytes_1 = _generateClassFile.getBytes();
          classFile.write(_bytes_1);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
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
    _builder.append("import gov.nasa.jpl.imce.oml.specification._");
    _builder.newLine();
    _builder.newLine();
    _builder.append("case class OMLResolvedFactoryImpl() extends resolver.api.OMLResolvedFactory {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      Iterable<EClass> _FunctionalAPIClasses = OMLUtilities.FunctionalAPIClasses(ePackage);
      final Function1<EClass, Boolean> _function = (EClass it) -> {
        boolean _isAbstract = it.isAbstract();
        return Boolean.valueOf((!_isAbstract));
      };
      Iterable<EClass> _filter = IterableExtensions.<EClass>filter(_FunctionalAPIClasses, _function);
      final Function1<EClass, String> _function_1 = (EClass it) -> {
        return it.getName();
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
            String _queryResolverType = OMLUtilities.queryResolverType(attr, "resolver.api.");
            _builder.append(_queryResolverType, "  ");
          }
          if (_hasElements) {
            _builder.append(")", "  ");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append(": resolver.api.");
        String _name_3 = eClass.getName();
        _builder.append(_name_3, "  ");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("= resolver.impl.");
        String _name_4 = eClass.getName();
        _builder.append(_name_4, "  ");
        {
          Iterable<EStructuralFeature> _sortedAttributeSignatureExceptDerived_1 = OMLUtilities.getSortedAttributeSignatureExceptDerived(eClass);
          boolean _hasElements_1 = false;
          for(final EStructuralFeature attr_1 : _sortedAttributeSignatureExceptDerived_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
              _builder.append("(\n", "  ");
            } else {
              _builder.appendImmediate(",\n", "  ");
            }
            _builder.append("  ");
            String _name_5 = attr_1.getName();
            _builder.append(_name_5, "  ");
          }
          if (_hasElements_1) {
            _builder.append(" )", "  ");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.newLine();
        {
          Iterable<EStructuralFeature> _lookupCopyConstructorArguments = OMLUtilities.lookupCopyConstructorArguments(eClass);
          for(final EStructuralFeature attr_2 : _lookupCopyConstructorArguments) {
            _builder.append("  ");
            _builder.append("def copy");
            String _name_6 = eClass.getName();
            _builder.append(_name_6, "  ");
            _builder.append("_");
            String _name_7 = attr_2.getName();
            _builder.append(_name_7, "  ");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            _builder.append("( that: resolver.api.");
            String _name_8 = eClass.getName();
            _builder.append(_name_8, "  ");
            _builder.append(",");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            _builder.append("  ");
            String _name_9 = attr_2.getName();
            _builder.append(_name_9, "    ");
            _builder.append(": ");
            String _queryResolverType_1 = OMLUtilities.queryResolverType(attr_2, "resolver.api.");
            _builder.append(_queryResolverType_1, "    ");
            _builder.append(" )");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            _builder.append(": resolver.api.");
            String _name_10 = eClass.getName();
            _builder.append(_name_10, "  ");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            _builder.append("= that match {");
            _builder.newLine();
            _builder.append("  ");
            _builder.append("\t");
            _builder.append("case x: resolver.impl.");
            String _name_11 = eClass.getName();
            _builder.append(_name_11, "  \t");
            _builder.append(" =>");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            _builder.append("\t  ");
            _builder.append("x.copy(");
            String _name_12 = attr_2.getName();
            _builder.append(_name_12, "  \t  ");
            _builder.append(" = ");
            String _name_13 = attr_2.getName();
            _builder.append(_name_13, "  \t  ");
            _builder.append(")");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            _builder.append("}");
            _builder.newLine();
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
    _builder.append("package gov.nasa.jpl.imce.oml.specification.resolver.impl");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import gov.nasa.jpl.imce.oml.specification._");
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
      Iterable<EOperation> _ScalaOperations = OMLUtilities.ScalaOperations(eClass);
      for(final EOperation op : _ScalaOperations) {
        _builder.append("  ");
        String _doc = OMLUtilities.doc(op, "  ");
        _builder.append(_doc, "");
        String _queryResolverName = OMLUtilities.queryResolverName(op, "resolver.api.");
        _builder.append(_queryResolverName, "");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append(": ");
        String _queryResolverType = OMLUtilities.queryResolverType(op, "resolver.api.");
        _builder.append(_queryResolverType, "  ");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("= ");
        String _queryBody = OMLUtilities.queryBody(op);
        _builder.append(_queryBody, "  ");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.newLine();
      }
    }
    _builder.newLine();
    {
      Iterable<EStructuralFeature> _sortedDerivedAttributeSignature = OMLUtilities.getSortedDerivedAttributeSignature(eClass);
      for(final EStructuralFeature sf : _sortedDerivedAttributeSignature) {
        _builder.append("  ");
        String _doc_1 = OMLUtilities.doc(sf, "  ");
        _builder.append(_doc_1, "");
        _builder.append("override val ");
        String _name = sf.getName();
        _builder.append(_name, "");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append(": ");
        String _queryResolverType_1 = OMLUtilities.queryResolverType(sf, "resolver.api.");
        _builder.append(_queryResolverType_1, "  ");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("= ");
        String _queryBody_1 = OMLUtilities.queryBody(sf);
        _builder.append(_queryBody_1, "  ");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.newLine();
      }
    }
    _builder.newLine();
    {
      Boolean _isSpecializationOfRootClass = OMLUtilities.isSpecializationOfRootClass(eClass);
      if ((_isSpecializationOfRootClass).booleanValue()) {
        _builder.newLine();
        _builder.append("  ");
        _builder.append("override def canEqual(that: scala.Any): scala.Boolean = that match {");
        _builder.newLine();
        _builder.append("  \t");
        _builder.append("case _: ");
        String _name_1 = eClass.getName();
        _builder.append(_name_1, "  \t");
        _builder.append(" => true");
        _builder.newLineIfNotEmpty();
        _builder.append("  \t");
        _builder.append("case _ => false");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    {
      boolean _isAbstract_1 = eClass.isAbstract();
      boolean _not = (!_isAbstract_1);
      if (_not) {
        _builder.newLine();
        _builder.append("  ");
        _builder.append("override val hashCode");
        _builder.newLine();
        _builder.append("  ");
        _builder.append(": scala.Int");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("= ");
        {
          Iterable<EStructuralFeature> _sortedAttributeSignature = OMLUtilities.getSortedAttributeSignature(eClass);
          boolean _hasElements = false;
          for(final EStructuralFeature keyFeature : _sortedAttributeSignature) {
            if (!_hasElements) {
              _hasElements = true;
              _builder.append("(", "  ");
            } else {
              _builder.appendImmediate(", ", "  ");
            }
            String _name_2 = keyFeature.getName();
            _builder.append(_name_2, "  ");
          }
          if (_hasElements) {
            _builder.append(").##", "  ");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("  ");
        _builder.append("override def equals(other: scala.Any): scala.Boolean = other match {");
        _builder.newLine();
        _builder.append("\t  ");
        _builder.append("case that: ");
        String _name_3 = eClass.getName();
        _builder.append(_name_3, "\t  ");
        _builder.append(" =>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t    ");
        _builder.append("(that canEqual this) &&");
        _builder.newLine();
        _builder.append("\t    ");
        {
          Iterable<EStructuralFeature> _sortedAttributeSignature_1 = OMLUtilities.getSortedAttributeSignature(eClass);
          boolean _hasElements_1 = false;
          for(final EStructuralFeature keyFeature_1 : _sortedAttributeSignature_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(" &&\n", "\t    ");
            }
            _builder.append("(this.");
            String _name_4 = keyFeature_1.getName();
            _builder.append(_name_4, "\t    ");
            _builder.append(" == that.");
            String _name_5 = keyFeature_1.getName();
            _builder.append(_name_5, "\t    ");
            _builder.append(")");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("\t  ");
        _builder.append("case _ =>");
        _builder.newLine();
        _builder.append("\t    ");
        _builder.append("false");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
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
          Iterable<EStructuralFeature> _sortedAttributeSignatureExceptDerived = OMLUtilities.getSortedAttributeSignatureExceptDerived(eClass);
          boolean _hasElements = false;
          for(final EStructuralFeature attr : _sortedAttributeSignatureExceptDerived) {
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
            String _queryResolverType = OMLUtilities.queryResolverType(attr, "resolver.api.");
            _builder.append(_queryResolverType, " ");
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
}
