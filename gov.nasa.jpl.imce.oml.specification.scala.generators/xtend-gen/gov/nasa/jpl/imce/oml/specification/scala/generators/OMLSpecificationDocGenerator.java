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
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

public class OMLSpecificationDocGenerator extends OMLUtilities {
  public static void main(final String[] args) {
    int _length = args.length;
    boolean _notEquals = (1 != _length);
    if (_notEquals) {
      System.err.println(
        "usage: <dir> where <dir> is the directory of the /gov.nasa.jpl.imce.oml.specification.doc project");
      System.exit(1);
    }
    new OMLSpecificationDocGenerator().generate(args[0]);
  }
  
  public void generate(final String targetDir) {
    final Path targetPath = Paths.get(targetDir);
    targetPath.toFile().mkdirs();
    this.generateGlossaryFile(
      Collections.<EPackage>unmodifiableList(CollectionLiterals.<EPackage>newArrayList(this.c, this.t, this.g, this.b, this.d, this.e)), 
      targetPath.toAbsolutePath().toString());
  }
  
  public void generateGlossaryFile(final List<EPackage> ePackages, final String targetFolder) {
    try {
      File _file = new File(((targetFolder + File.separator) + "GLOSSARY.md"));
      final FileOutputStream glossaryFile = new FileOutputStream(_file);
      try {
        final Function1<EPackage, EList<EClassifier>> _function = (EPackage it) -> {
          return it.getEClassifiers();
        };
        final Function1<EClass, Boolean> _function_1 = (EClass it) -> {
          return OMLUtilities.isGlossary(it);
        };
        final Function1<EClass, String> _function_2 = (EClass it) -> {
          return it.getName();
        };
        final List<EClass> glossaryEntries = IterableExtensions.<EClass, String>sortBy(IterableExtensions.<EClass>filter(Iterables.<EClass>filter(Iterables.<EClassifier>concat(ListExtensions.<EPackage, EList<EClassifier>>map(ePackages, _function)), EClass.class), _function_1), _function_2);
        final Function1<EClass, Boolean> _function_3 = (EClass it) -> {
          return Boolean.valueOf(it.isAbstract());
        };
        final Map<Boolean, List<EClass>> entriesByAbstraction = IterableExtensions.<Boolean, EClass>groupBy(glossaryEntries, _function_3);
        final Function1<EClass, Boolean> _function_4 = (EClass it) -> {
          return OMLUtilities.isSchema(it);
        };
        final Iterable<EClass> schemaEntries = IterableExtensions.<EClass>filter(entriesByAbstraction.get(Boolean.valueOf(false)), _function_4);
        final Function1<EClass, Boolean> _function_5 = (EClass it) -> {
          return Boolean.valueOf(((OMLUtilities.isAPI(it)).booleanValue() && (!(OMLUtilities.isSchema(it)).booleanValue())));
        };
        final Iterable<EClass> apiEntries = IterableExtensions.<EClass>filter(entriesByAbstraction.get(Boolean.valueOf(false)), _function_5);
        final Function1<EClass, Boolean> _function_6 = (EClass it) -> {
          return OMLUtilities.isOO(it);
        };
        final Iterable<EClass> ooEntries = IterableExtensions.<EClass>filter(entriesByAbstraction.get(Boolean.valueOf(false)), _function_6);
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("{% include \"./external-links.md\" %}");
        _builder.newLine();
        _builder.append("# OML Glossary Summary");
        _builder.newLine();
        _builder.newLine();
        _builder.append("The vocabulary of the Ontological Modeling Language, OML, consists of ");
        int _size = glossaryEntries.size();
        _builder.append(_size);
        _builder.append(" definitions");
        _builder.newLineIfNotEmpty();
        _builder.append("(");
        int _size_1 = entriesByAbstraction.get(Boolean.valueOf(true)).size();
        _builder.append(_size_1);
        _builder.append(" abstract and ");
        int _size_2 = entriesByAbstraction.get(Boolean.valueOf(false)).size();
        _builder.append(_size_2);
        _builder.append(" concrete).");
        _builder.newLineIfNotEmpty();
        _builder.append("This OML vocabulary is the basis of the Ontological Modeling Framework (OMF), which is ");
        _builder.newLine();
        _builder.append("a collection of multiple technology-based Application Programming Interfaces (APIs) & libraries.");
        _builder.newLine();
        _builder.newLine();
        _builder.append("- **EMF/CDO** OMF APIs and libraries based on the [Eclipse Modeling Framework] and [Connected Data Objects]");
        _builder.newLine();
        _builder.newLine();
        _builder.append("  ");
        _builder.append("All ");
        int _size_3 = glossaryEntries.size();
        _builder.append(_size_3, "  ");
        _builder.append(" definitions induce corresponding EMF-based APIs and libraries.");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("For the ");
        int _size_4 = entriesByAbstraction.get(Boolean.valueOf(false)).size();
        _builder.append(_size_4, "  ");
        _builder.append(" concrete definitions, the *EMF/CDO* APIs");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("include all the ");
        int _size_5 = IterableExtensions.size(schemaEntries);
        _builder.append(_size_5, "  ");
        _builder.append(" *Normalized* APIs, all the ");
        int _size_6 = IterableExtensions.size(apiEntries);
        _builder.append(_size_6, "  ");
        _builder.append(" *Functional* APIs,");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("and ");
        int _size_7 = IterableExtensions.size(ooEntries);
        _builder.append(_size_7, "  ");
        _builder.append(" definitions uniquely intended for *EMF/CDO*.");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.newLine();
        _builder.append("- **Normalized** OMF APIs and libraries based on polyglot functional programming in Java, JavaScript and Scala");
        _builder.newLine();
        _builder.newLine();
        _builder.append("  ");
        _builder.append("A subset of ");
        int _size_8 = IterableExtensions.size(schemaEntries);
        _builder.append(_size_8, "  ");
        _builder.append(" definitions from the ");
        int _size_9 = entriesByAbstraction.get(Boolean.valueOf(false)).size();
        _builder.append(_size_9, "  ");
        _builder.append(" concrete definitions");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("constitute the set of normalized relational database schema tables for the technology-agnostic OML tabular interchange representation.");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("These definitions generate language-friendly functional programming APIs for Java, JavaScript and Scala.");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("Note that Scala is the only language that can provide strong compile-time guarantees of the referential transparency of the OML functional APIs.");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("For Java and JavaScript, the OML functional APIs are intended to be referentially transparent; ");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("however, these languages do not provide any guarantees at compile time or runtime for preserving these properties.");
        _builder.newLine();
        _builder.append("  ");
        _builder.newLine();
        _builder.append("- **Functional** OMF APIs and libraries in Scala for in-memory processing of OML tabular interchange representations");
        _builder.newLine();
        _builder.newLine();
        _builder.append("  ");
        _builder.append("A subset of ");
        int _size_10 = IterableExtensions.size(apiEntries);
        _builder.append(_size_10, "  ");
        _builder.append(" definitions from the ");
        int _size_11 = entriesByAbstraction.get(Boolean.valueOf(false)).size();
        _builder.append(_size_11, "  ");
        _builder.append(" concrete definitions");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("augment the normalized OMF APIs for the in-memory processing of OMF information");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("extracted from parsing the OML tabular interchange representation.");
        _builder.newLine();
        _builder.newLine();
        _builder.append("# OML Glossary of ");
        int _size_12 = entriesByAbstraction.get(Boolean.valueOf(true)).size();
        _builder.append(_size_12);
        _builder.append(" Abstract Definitions {#oml-abstract-glossary}");
        _builder.newLineIfNotEmpty();
        final StringBuffer b1 = new StringBuffer(_builder);
        final Function2<StringBuffer, EClass, StringBuffer> _function_7 = (StringBuffer buffer, EClass eClass) -> {
          return this.generateClassGlossaryContents(buffer, eClass);
        };
        final StringBuffer b2 = IterableExtensions.<EClass, StringBuffer>fold(entriesByAbstraction.get(Boolean.valueOf(true)), b1, _function_7);
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("# OML Glossary of ");
        int _size_13 = entriesByAbstraction.get(Boolean.valueOf(false)).size();
        _builder_1.append(_size_13);
        _builder_1.append(" Concrete Definitions {#oml-concrete-glossary}");
        String _plus = ("\n" + _builder_1);
        String _plus_1 = (_plus + "\n");
        b2.append(_plus_1);
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("# OML Glossary of ");
        int _size_14 = IterableExtensions.size(schemaEntries);
        _builder_2.append(_size_14);
        _builder_2.append(" Schema Concrete Definitions {#oml-schema-concrete-glossary}");
        String _plus_2 = ("\n" + _builder_2);
        String _plus_3 = (_plus_2 + "\n");
        b2.append(_plus_3);
        OMLUtilities.OMLTableCompare _oMLTableCompare = new OMLUtilities.OMLTableCompare();
        final Function2<StringBuffer, EClass, StringBuffer> _function_8 = (StringBuffer buffer, EClass eClass) -> {
          return this.generateClassGlossaryContents(buffer, eClass);
        };
        final StringBuffer b3 = IterableExtensions.<EClass, StringBuffer>fold(IterableExtensions.<EClass>sortWith(schemaEntries, _oMLTableCompare), b2, _function_8);
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("# OML Glossary of ");
        int _size_15 = IterableExtensions.size(apiEntries);
        _builder_3.append(_size_15);
        _builder_3.append(" Functional API Concrete Definitions {#oml-functional-concrete-glossary}");
        String _plus_4 = ("\n" + _builder_3);
        String _plus_5 = (_plus_4 + "\n");
        b3.append(_plus_5);
        final Function2<StringBuffer, EClass, StringBuffer> _function_9 = (StringBuffer buffer, EClass eClass) -> {
          return this.generateClassGlossaryContents(buffer, eClass);
        };
        final StringBuffer b4 = IterableExtensions.<EClass, StringBuffer>fold(apiEntries, b3, _function_9);
        StringConcatenation _builder_4 = new StringConcatenation();
        _builder_4.append("# OML Glossary of ");
        int _size_16 = IterableExtensions.size(ooEntries);
        _builder_4.append(_size_16);
        _builder_4.append(" EMF/CDO API Concrete Definitions {#oml-emf-cdo-concrete-glossary}");
        String _plus_6 = ("\n" + _builder_4);
        String _plus_7 = (_plus_6 + "\n");
        b4.append(_plus_7);
        final Function2<StringBuffer, EClass, StringBuffer> _function_10 = (StringBuffer buffer, EClass eClass) -> {
          return this.generateClassGlossaryContents(buffer, eClass);
        };
        final StringBuffer b5 = IterableExtensions.<EClass, StringBuffer>fold(ooEntries, b4, _function_10);
        glossaryFile.write(b5.toString().getBytes());
      } finally {
        glossaryFile.close();
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public StringBuffer generateClassGlossaryContents(final StringBuffer buffer, final EClass eClass) {
    StringBuffer _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("## OML ");
      String _name = eClass.getName();
      _builder.append(_name);
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      String _markDown = OMLUtilities.markDown(eClass);
      _builder.append(_markDown);
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      buffer.append(_builder);
      String prefix = "{APIs: ";
      Boolean _isSchema = OMLUtilities.isSchema(eClass);
      if ((_isSchema).booleanValue()) {
        buffer.append((prefix + "**Normalized**"));
        prefix = ", ";
      }
      Boolean _isAPI = OMLUtilities.isAPI(eClass);
      if ((_isAPI).booleanValue()) {
        buffer.append((prefix + "**Functional**"));
        prefix = ", ";
      }
      Boolean _isOO = OMLUtilities.isOO(eClass);
      if ((_isOO).booleanValue()) {
        buffer.append((prefix + "**EMF/CDO**"));
        prefix = ", ";
      }
      buffer.append("}\n");
      String _xifexpression = null;
      boolean _isAbstract = eClass.isAbstract();
      if (_isAbstract) {
        _xifexpression = "Abstract";
      } else {
        _xifexpression = "Concrete";
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
              _builder_2.append(gprefix);
              _builder_2.append(" definition with ");
              int _size = IterableExtensions.size(general);
              _builder_2.append(_size);
              _builder_2.append(" ");
              String _pluralizeIfMany = OMLUtilities.pluralizeIfMany("generalization", IterableExtensions.size(general));
              _builder_2.append(_pluralizeIfMany);
              _builder_2.append(":");
              String _plus = (_builder_2.toString() + "\n");
              _builder_1.append(_plus);
            } else {
              _builder_1.appendImmediate("\n", "");
            }
            _builder_1.append(" - OML ");
            String _name_1 = g.getName();
            _builder_1.append(_name_1);
          }
          if (_hasElements) {
            _builder_1.append("\n");
          }
        }
        String _plus_1 = ("\n" + _builder_1);
        buffer.append(_plus_1);
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
              _builder_4.append(sprefix);
              _builder_4.append(" with ");
              int _size_1 = IterableExtensions.size(specific);
              _builder_4.append(_size_1);
              _builder_4.append(" ");
              String _pluralizeIfMany_1 = OMLUtilities.pluralizeIfMany("specialization", IterableExtensions.size(specific));
              _builder_4.append(_pluralizeIfMany_1);
              _builder_4.append(":");
              String _plus_2 = (_builder_4.toString() + "\n");
              _builder_3.append(_plus_2);
            } else {
              _builder_3.appendImmediate("\n", "");
            }
            _builder_3.append(" - OML ");
            String _name_2 = s.getName();
            _builder_3.append(_name_2);
          }
          if (_hasElements_1) {
            _builder_3.append("\n");
          }
        }
        String _plus_3 = ("\n" + _builder_3);
        buffer.append(_plus_3);
      } else {
        Boolean _isSchema_1 = OMLUtilities.isSchema(eClass);
        if ((_isSchema_1).booleanValue()) {
          StringConcatenation _builder_5 = new StringConcatenation();
          {
            Iterable<ETypedElement> _functionalAPIOrOrderingKeyAttributes = OMLUtilities.functionalAPIOrOrderingKeyAttributes(eClass);
            for(final ETypedElement attr : _functionalAPIOrOrderingKeyAttributes) {
              _builder_5.append("- ");
              String _columnName = OMLUtilities.columnName(attr);
              _builder_5.append(_columnName);
              _builder_5.append(": ");
              String _schemaColumnTypeDescription = OMLUtilities.schemaColumnTypeDescription(attr);
              _builder_5.append(_schemaColumnTypeDescription);
              _builder_5.newLineIfNotEmpty();
            }
          }
          String _plus_4 = ("\nNormalized Relational Schema Table:\n" + _builder_5);
          buffer.append(_plus_4);
        }
      }
      _xblockexpression = buffer;
    }
    return _xblockexpression;
  }
}
