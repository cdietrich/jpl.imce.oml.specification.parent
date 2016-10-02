package gov.nasa.jpl.imce.omf.schema.generators;

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
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.osgi.framework.Bundle;

@SuppressWarnings("all")
public class OMFSchemaTableGenerator {
  public static class OMFFeatureCompare implements Comparator<EStructuralFeature> {
    private final List<String> knownAttributes = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("graphUUID", "uuid", "kind", "isAbstract", "asymmetric", "essential", "functional", "inverseEssential", "inverseFunctional", "irreflexive", "reflexive", "symmetric", "transitive", "name", "iri"));
    
    @Override
    public int compare(final EStructuralFeature o1, final EStructuralFeature o2) {
      int _xblockexpression = (int) 0;
      {
        final String name1 = OMFSchemaTableGenerator.columnName(o1);
        final String name2 = OMFSchemaTableGenerator.columnName(o2);
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
      final String targetBundle = "jpl.omf.schema.tables";
      final String targetFolder = "/shared/src/main/scala/gov/nasa/jpl/imce/omf/schema/tables";
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
      Bundle _bundle = Platform.getBundle(targetBundle);
      URL _entry = _bundle.getEntry(targetFolder);
      final URL folder = FileLocator.toFileURL(_entry);
      String _path = folder.getPath();
      this.generate(ePackage, _path);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void generate(final EPackage ePackage, final String targetFolder) {
    try {
      File _file = new File(((targetFolder + File.separator) + "package.scala"));
      final FileOutputStream packageFile = new FileOutputStream(_file);
      String _generatePackageFile = this.generatePackageFile(ePackage);
      byte[] _bytes = _generatePackageFile.getBytes();
      packageFile.write(_bytes);
      EList<EClassifier> _eClassifiers = ePackage.getEClassifiers();
      Iterable<EClass> _filter = Iterables.<EClass>filter(_eClassifiers, EClass.class);
      final Function1<EClass, Boolean> _function = (EClass it) -> {
        boolean _isAbstract = it.isAbstract();
        return Boolean.valueOf((!_isAbstract));
      };
      Iterable<EClass> _filter_1 = IterableExtensions.<EClass>filter(_filter, _function);
      for (final EClass eClass : _filter_1) {
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
  
  public String generatePackageFile(final EPackage ePackage) {
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
    _builder.append("package gov.nasa.jpl.imce.omf.schema");
    _builder.newLine();
    _builder.newLine();
    _builder.append("package object tables {");
    _builder.newLine();
    {
      EList<EClassifier> _eClassifiers = ePackage.getEClassifiers();
      Iterable<EDataType> _filter = Iterables.<EDataType>filter(_eClassifiers, EDataType.class);
      final Function1<EDataType, Boolean> _function = (EDataType t) -> {
        return Boolean.valueOf((!(t instanceof EEnum)));
      };
      Iterable<EDataType> _filter_1 = IterableExtensions.<EDataType>filter(_filter, _function);
      final Function1<EDataType, String> _function_1 = (EDataType it) -> {
        return it.getName();
      };
      List<EDataType> _sortBy = IterableExtensions.<EDataType, String>sortBy(_filter_1, _function_1);
      for(final EDataType type : _sortBy) {
        _builder.append("\t");
        _builder.append("type ");
        String _name = type.getName();
        _builder.append(_name, "\t");
        _builder.append(" = scala.Predef.String");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String generateClassFile(final EClass eClass) {
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
    _builder.append(" ");
    _builder.newLine();
    _builder.append("package gov.nasa.jpl.imce.omf.schema.tables");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import scala.annotation.meta.field");
    _builder.newLine();
    _builder.append("import scala.scalajs.js.annotation.JSExport");
    _builder.newLine();
    _builder.append("import scala._");
    _builder.newLine();
    _builder.append("import scala.Predef._");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    {
      List<EStructuralFeature> _sortedAttributes = this.getSortedAttributes(eClass);
      for(final EStructuralFeature attr : _sortedAttributes) {
        _builder.append("  ");
        _builder.append("* @param ");
        String _columnName = OMFSchemaTableGenerator.columnName(attr);
        _builder.append(_columnName, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("  ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("@JSExport");
    _builder.newLine();
    _builder.append("case class ");
    String _name = eClass.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    _builder.append("(");
    _builder.newLine();
    {
      List<EStructuralFeature> _sortedAttributes_1 = this.getSortedAttributes(eClass);
      boolean _hasElements = false;
      for(final EStructuralFeature attr_1 : _sortedAttributes_1) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", " ");
        }
        _builder.append(" ");
        _builder.append("@(JSExport @field) ");
        String _columnName_1 = OMFSchemaTableGenerator.columnName(attr_1);
        _builder.append(_columnName_1, " ");
        _builder.append(": ");
        String _typeName = OMFSchemaTableGenerator.typeName(attr_1);
        _builder.append(_typeName, " ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append(")");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@JSExport");
    _builder.newLine();
    _builder.append("object ");
    String _name_1 = eClass.getName();
    _builder.append(_name_1, "");
    _builder.append("Helper {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("implicit val w");
    _builder.newLine();
    _builder.append("  ");
    _builder.append(": upickle.default.Writer[");
    String _name_2 = eClass.getName();
    _builder.append(_name_2, "  ");
    _builder.append("]");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("= upickle.default.macroW[");
    String _name_3 = eClass.getName();
    _builder.append(_name_3, "  ");
    _builder.append("]");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("@JSExport");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("def toJSON(c: ");
    String _name_4 = eClass.getName();
    _builder.append(_name_4, "  ");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append(": String");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("= upickle.default.write(expr=c, indent=0)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("implicit val r");
    _builder.newLine();
    _builder.append("  ");
    _builder.append(": upickle.default.Reader[");
    String _name_5 = eClass.getName();
    _builder.append(_name_5, "  ");
    _builder.append("]");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("= upickle.default.macroR[");
    String _name_6 = eClass.getName();
    _builder.append(_name_6, "  ");
    _builder.append("]");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("@JSExport");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("def fromJSON(c: String)");
    _builder.newLine();
    _builder.append("  ");
    _builder.append(": ");
    String _name_7 = eClass.getName();
    _builder.append(_name_7, "  ");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("= upickle.default.read[");
    String _name_8 = eClass.getName();
    _builder.append(_name_8, "  ");
    _builder.append("](c)");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("}\t");
    _builder.newLine();
    return _builder.toString();
  }
  
  public List<EStructuralFeature> getSortedAttributes(final EClass eClass) {
    List<EClass> _selfAndAllSupertypes = this.selfAndAllSupertypes(eClass);
    final Function1<EClass, EList<EStructuralFeature>> _function = (EClass it) -> {
      return it.getEStructuralFeatures();
    };
    List<EList<EStructuralFeature>> _map = ListExtensions.<EClass, EList<EStructuralFeature>>map(_selfAndAllSupertypes, _function);
    Iterable<EStructuralFeature> _flatten = Iterables.<EStructuralFeature>concat(_map);
    OMFSchemaTableGenerator.OMFFeatureCompare _oMFFeatureCompare = new OMFSchemaTableGenerator.OMFFeatureCompare();
    return IterableExtensions.<EStructuralFeature>sortWith(_flatten, _oMFFeatureCompare);
  }
  
  public List<EClass> selfAndAllSupertypes(final EClass eClass) {
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
  
  public static String typeName(final EStructuralFeature feature) {
    String _xblockexpression = null;
    {
      final EClassifier type = feature.getEType();
      String _switchResult = null;
      String _name = type.getName();
      boolean _matched = false;
      if (Objects.equal(_name, "EInt")) {
        _matched=true;
        _switchResult = "scala.Int";
      }
      if (!_matched) {
        if (Objects.equal(_name, "EBoolean")) {
          _matched=true;
          _switchResult = "scala.Boolean";
        }
      }
      if (!_matched) {
        if (Objects.equal(_name, "EString")) {
          _matched=true;
          _switchResult = "scala.Predef.String";
        }
      }
      if (!_matched) {
        if ((type instanceof EClass)) {
          _matched=true;
          _switchResult = "UUID";
        }
      }
      if (!_matched) {
        _switchResult = type.getName();
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
}
