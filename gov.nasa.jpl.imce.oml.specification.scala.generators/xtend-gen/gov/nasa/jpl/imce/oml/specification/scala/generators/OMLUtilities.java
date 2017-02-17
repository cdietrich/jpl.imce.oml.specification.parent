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

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.net.URL;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.core.resources.IWorkspaceRoot;
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
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.xcore.XOperation;
import org.eclipse.emf.ecore.xcore.XcoreStandaloneSetup;
import org.eclipse.emf.ecore.xcore.mappings.XcoreMapper;
import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

public class OMLUtilities {
  public static class OMLTableCompare implements Comparator<EClass> {
    private final List<String> knownTables = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("Annotation", "AnnotationEntry", "AnnotationProperty", "AnnotationPropertyTable", "AnnotationSubjectPropertyValue", "AnnotationSubjectTable", "TerminologyGraph", "Bundle", "ConceptDesignationTerminologyAxiom", "TerminologyExtensionAxiom", "TerminologyNestingAxiom", "Aspect", "Concept", "ReifiedRelationship", "UnreifiedRelationship", "Scalar", "Structure", "BinaryScalarRestriction", "IRIScalarRestriction", "NumericScalarRestriction", "PlainLiteralScalarRestriction", "ScalarOneOfRestriction", "StringScalarRestriction", "SynonymScalarRestriction", "TimeScalarRestriction", "EntityScalarDataProperty", "EntityStructuredDataProperty", "ScalarDataProperty", "StructuredDataProperty", "AspectSpecializationAxiom", "ConceptSpecializationAxiom", "ReifiedRelationshipSpecializationAxiom", "EntityExistentialRestrictionAxiom", "EntityUniversalRestrictionAxiom", "EntityScalarDataPropertyExistentialRestrictionAxiom", "EntityScalarDataPropertyParticularRestrictionAxiom", "EntityScalarDataPropertyUniversalRestrictionAxiom", "ScalarOneOfLiteralAxiom", "BundledTerminologyAxiom", "AnonymousConceptTaxonomyAxiom", "RootConceptTaxonomyAxiom", "SpecificDisjointConceptAxiom", "Annotation"));
    
    public int compare(final EClass c1, final EClass c2) {
      int _xblockexpression = (int) 0;
      {
        final String name1 = c1.getName();
        final String name2 = c2.getName();
        final int i1 = this.knownTables.indexOf(name1);
        final int i2 = this.knownTables.indexOf(name2);
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
  
  public static class OMLFeatureCompare implements Comparator<ETypedElement> {
    private final List<String> knownAttributes = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("uuid", "tboxUUID", "bundleExtentUUID", "graphExtentUUID", "descriptionExtentUUID", "terminologyBundleUUID", "bundledTerminologyUUID", "extendedTerminologyUUID", "nestingTerminologyUUID", "nestingContextUUID", "bundleUUID", "moduleUUID", "descriptionBoxUUID", "refiningDescriptionBoxUUID", "singletonConceptClassifierUUID", "singletonReifiedRelationshipClassifierUUID", "dataStructureTypeUUID", "superAspectUUID", "subEntityUUID", "superConceptUUID", "subConceptUUID", "axiomUUID", "keyUUID", "subjectUUID", "propertyUUID", "closedWorldDefinitionsUUID", "refinedDescriptionBoxUUID", "refiningDescriptionBoxUUID", "dataStructureTypeUUID", "structuredDataPropertyValueUUID", "singletonInstanceUUID", "structuredDataPropertyUUID", "scalarDataPropertyUUID", "structuredPropertyTupleUUID", "singletonConceptClassifierUUID", "singletonReifiedRelationshipClassifierUUID", "reifiedRelationshipInstanceUUID", "unreifiedRelationshipUUID", "restrictedRelationUUID", "restrictedDomainUUID", "restrictedRangeUUID", "restrictedEntityUUID", "scalarPropertyUUID", "scalarRestrictionUUID", "domainUUID", "rangeUUID", "sourceUUID", "targetUUID", "superRelationshipUUID", "subRelationshipUUID", "rootUUID", "disjointTaxonomyParentUUID", "disjointLeafUUID", "kind", "isAbstract", "isAsymmetric", "isEssential", "isFunctional", "isInverseEssential", "isInverseFunctional", "isIrreflexive", "isReflexive", "isSymmetric", "isTransitive", "isIdentityCriteria", "minExclusive", "minInclusive", "maxExclusive", "maxInclusive", "length", "minLength", "maxLength", "nsPrefix", "name", "langRange", "pattern", "unreifiedPropertyName", "unreifiedInversePropertyName", "iri", "value", "scalarPropertyValue", "literalValue"));
    
    public int compare(final ETypedElement o1, final ETypedElement o2) {
      int _xblockexpression = (int) 0;
      {
        final String name1 = OMLUtilities.columnName(o1);
        final String name2 = OMLUtilities.columnName(o2);
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
  
  public static XtextResourceSet createXcoreResourceSet(final Procedure1<Map<URI, URI>> standaloneURIMapInitializer) {
    try {
      XtextResourceSet _xblockexpression = null;
      {
        final XtextResourceSet set = new XtextResourceSet();
        URIConverter _uRIConverter = set.getURIConverter();
        final Map<URI, URI> uriMap = _uRIConverter.getURIMap();
        IWorkspaceRoot _workspaceRoot = EcorePlugin.getWorkspaceRoot();
        boolean _tripleEquals = (null == _workspaceRoot);
        if (_tripleEquals) {
          XcoreStandaloneSetup.doSetup();
          Map<URI, URI> _computePlatformURIMap = EcorePlugin.computePlatformURIMap(false);
          uriMap.putAll(_computePlatformURIMap);
          URI _createURI = URI.createURI("platform:/resource/org.eclipse.emf.ecore/model/Ecore.ecore");
          URL _resource = EcorePackage.class.getResource("/model/Ecore.ecore");
          java.net.URI _uRI = _resource.toURI();
          String _string = _uRI.toString();
          URI _createURI_1 = URI.createURI(_string);
          uriMap.put(_createURI, _createURI_1);
          URI _createURI_2 = URI.createURI("platform:/resource/org.eclipse.emf.ecore/model/Ecore.genmodel");
          URL _resource_1 = EcorePackage.class.getResource("/model/Ecore.genmodel");
          java.net.URI _uRI_1 = _resource_1.toURI();
          String _string_1 = _uRI_1.toString();
          URI _createURI_3 = URI.createURI(_string_1);
          uriMap.put(_createURI_2, _createURI_3);
          URI _createURI_4 = URI.createURI("platform:/resource/org.eclipse.emf.ecore/model/XMLNamespace.ecore");
          URL _resource_2 = XMLNamespacePackage.class.getResource("/model/XMLNamespace.ecore");
          java.net.URI _uRI_2 = _resource_2.toURI();
          String _string_2 = _uRI_2.toString();
          URI _createURI_5 = URI.createURI(_string_2);
          uriMap.put(_createURI_4, _createURI_5);
          URI _createURI_6 = URI.createURI("platform:/resource/org.eclipse.emf.ecore/model/XMLNamespace.genmodel");
          URL _resource_3 = XMLNamespacePackage.class.getResource("/model/XMLNamespace.genmodel");
          java.net.URI _uRI_3 = _resource_3.toURI();
          String _string_3 = _uRI_3.toString();
          URI _createURI_7 = URI.createURI(_string_3);
          uriMap.put(_createURI_6, _createURI_7);
          URI _createURI_8 = URI.createURI("platform:/resource/org.eclipse.emf.ecore/model/XMLType.ecore");
          URL _resource_4 = XMLTypePackage.class.getResource("/model/XMLType.ecore");
          java.net.URI _uRI_4 = _resource_4.toURI();
          String _string_4 = _uRI_4.toString();
          URI _createURI_9 = URI.createURI(_string_4);
          uriMap.put(_createURI_8, _createURI_9);
          URI _createURI_10 = URI.createURI("platform:/resource/org.eclipse.emf.ecore/model/XMLType.genmodel");
          URL _resource_5 = XMLTypePackage.class.getResource("/model/XMLType.genmodel");
          java.net.URI _uRI_5 = _resource_5.toURI();
          String _string_5 = _uRI_5.toString();
          URI _createURI_11 = URI.createURI(_string_5);
          uriMap.put(_createURI_10, _createURI_11);
          standaloneURIMapInitializer.apply(uriMap);
        } else {
          Map<URI, URI> _computePlatformURIMap_1 = EcorePlugin.computePlatformURIMap(true);
          uriMap.putAll(_computePlatformURIMap_1);
        }
        set.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
        _xblockexpression = set;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static String queryResolverName(final EOperation op, final String typePrefix) {
    String _xblockexpression = null;
    {
      final String kind = "def";
      String _xifexpression = null;
      EAnnotation _eAnnotation = op.getEAnnotation("http://imce.jpl.nasa.gov/oml/Override");
      boolean _tripleNotEquals = (null != _eAnnotation);
      if (_tripleNotEquals) {
        _xifexpression = ("override " + kind);
      } else {
        _xifexpression = kind;
      }
      final String decl = _xifexpression;
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
          _builder.append(_name, "");
          _builder.append(": ");
          String _queryResolverType = OMLUtilities.queryResolverType(p, typePrefix);
          _builder.append(_queryResolverType, "");
        }
      }
      final String args = _builder.toString();
      String _name_1 = op.getName();
      String _plus = ((decl + " ") + _name_1);
      String _plus_1 = (_plus + "\n  (");
      String _plus_2 = (_plus_1 + args);
      _xblockexpression = (_plus_2 + ")");
    }
    return _xblockexpression;
  }
  
  public static String queryResolverType(final ETypedElement feature, final String typePrefix) {
    String _xblockexpression = null;
    {
      final EClassifier type = feature.getEType();
      final String scalaType = OMLUtilities.scalaResolverTypeName(feature);
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
                boolean _matched_1 = false;
                if (Objects.equal(_elvis, "Map(Seq)")) {
                  _matched_1=true;
                  String _xblockexpression_2 = null;
                  {
                    final String key = ann.get("key");
                    String _name = type.getName();
                    String _plus = (((("scala.collection.immutable.Map[" + key) + ", scala.collection.immutable.Seq[") + typePrefix) + _name);
                    _xblockexpression_2 = (_plus + "]]");
                  }
                  _switchResult_1 = _xblockexpression_2;
                }
                if (!_matched_1) {
                  if (Objects.equal(_elvis, "Map")) {
                    _matched_1=true;
                    String _xblockexpression_3 = null;
                    {
                      final String key = ann.get("key");
                      String _name = type.getName();
                      String _plus = (((("scala.collection.immutable.Map[" + key) + ", ") + typePrefix) + _name);
                      _xblockexpression_3 = (_plus + "]");
                    }
                    _switchResult_1 = _xblockexpression_3;
                  }
                }
                if (!_matched_1) {
                  if (Objects.equal(_elvis, "Set")) {
                    _matched_1=true;
                    String _name = type.getName();
                    String _plus = (("scala.collection.immutable.Set[_ <: " + typePrefix) + _name);
                    _switchResult_1 = (_plus + "]");
                  }
                }
                if (!_matched_1) {
                  if (Objects.equal(_elvis, "SortedSet")) {
                    _matched_1=true;
                    String _name_1 = type.getName();
                    String _plus_1 = (("scala.collection.immutable.SortedSet[" + typePrefix) + _name_1);
                    _switchResult_1 = (_plus_1 + "]");
                  }
                }
                _xblockexpression_1 = _switchResult_1;
              }
              _xifexpression_2 = _xblockexpression_1;
            } else {
              String _name = type.getName();
              String _plus = (("scala.Option[" + typePrefix) + _name);
              _xifexpression_2 = (_plus + "]");
            }
            _xifexpression_1 = _xifexpression_2;
          } else {
            String _name_1 = type.getName();
            _xifexpression_1 = (typePrefix + _name_1);
          }
          _switchResult = _xifexpression_1;
        }
      }
      if (!_matched) {
        String _name_2 = type.getName();
        String _plus_1 = (typePrefix + _name_2);
        _switchResult = (_plus_1 + "//Default");
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  public static String scalaResolverTypeName(final ETypedElement feature) {
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
        if (Objects.equal(_name, "AbbrevIRI")) {
          _matched=true;
          _switchResult = "gov.nasa.jpl.imce.oml.specification.tables.AbbrevIRI";
        }
      }
      if (!_matched) {
        if (Objects.equal(_name, "DescriptionKind")) {
          _matched=true;
          _switchResult = "gov.nasa.jpl.imce.oml.specification.tables.DescriptionKind";
        }
      }
      if (!_matched) {
        if (Objects.equal(_name, "IRI")) {
          _matched=true;
          _switchResult = "gov.nasa.jpl.imce.oml.specification.tables.IRI";
        }
      }
      if (!_matched) {
        if (Objects.equal(_name, "LangRange")) {
          _matched=true;
          _switchResult = "gov.nasa.jpl.imce.oml.specification.tables.LangRange";
        }
      }
      if (!_matched) {
        if (Objects.equal(_name, "LexicalNumber")) {
          _matched=true;
          _switchResult = "gov.nasa.jpl.imce.oml.specification.tables.LexicalNumber";
        }
      }
      if (!_matched) {
        if (Objects.equal(_name, "LexicalTime")) {
          _matched=true;
          _switchResult = "gov.nasa.jpl.imce.oml.specification.tables.LexicalTime";
        }
      }
      if (!_matched) {
        if (Objects.equal(_name, "LexicalValue")) {
          _matched=true;
          _switchResult = "gov.nasa.jpl.imce.oml.specification.tables.LexicalValue";
        }
      }
      if (!_matched) {
        if (Objects.equal(_name, "LocalName")) {
          _matched=true;
          _switchResult = "gov.nasa.jpl.imce.oml.specification.tables.LocalName";
        }
      }
      if (!_matched) {
        if (Objects.equal(_name, "NamespacePrefix")) {
          _matched=true;
          _switchResult = "gov.nasa.jpl.imce.oml.specification.tables.NamespacePrefix";
        }
      }
      if (!_matched) {
        if (Objects.equal(_name, "Pattern")) {
          _matched=true;
          _switchResult = "gov.nasa.jpl.imce.oml.specification.tables.Pattern";
        }
      }
      if (!_matched) {
        if (Objects.equal(_name, "UUID")) {
          _matched=true;
          _switchResult = "java.util.UUID";
        }
      }
      if (!_matched) {
        if (Objects.equal(_name, "TerminologyGraphKind")) {
          _matched=true;
          _switchResult = "gov.nasa.jpl.imce.oml.specification.tables.TerminologyGraphKind";
        }
      }
      if (!_matched) {
        String _name_1 = type.getName();
        _switchResult = ("resolver.api." + _name_1);
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  public static String schemaColumnTypeName(final ETypedElement feature) {
    String _xblockexpression = null;
    {
      final EClassifier type = feature.getEType();
      String _switchResult = null;
      String _name = type.getName();
      boolean _matched = false;
      if (Objects.equal(_name, "EInt")) {
        _matched=true;
        _switchResult = "Int";
      }
      if (!_matched) {
        if (Objects.equal(_name, "EBoolean")) {
          _matched=true;
          _switchResult = "Boolean";
        }
      }
      if (!_matched) {
        if (Objects.equal(_name, "EString")) {
          _matched=true;
          _switchResult = "String";
        }
      }
      if (!_matched) {
        if ((type instanceof EClass)) {
          _matched=true;
          String _name_1 = type.getName();
          String _plus = ("UUID (Foreign Key for: OML " + _name_1);
          _switchResult = (_plus + ")");
        }
      }
      if (!_matched) {
        if (Objects.equal(_name, "UUID")) {
          _matched=true;
          _switchResult = "UUID (Primary Key)";
        }
      }
      if (!_matched) {
        _switchResult = type.getName();
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  public static String schemaColumnTypeDescription(final ETypedElement feature) {
    String _xblockexpression = null;
    {
      final String columnTypeName = OMLUtilities.schemaColumnTypeName(feature);
      String _xifexpression = null;
      int _lowerBound = feature.getLowerBound();
      boolean _equals = (_lowerBound == 0);
      if (_equals) {
        _xifexpression = (("Option[" + columnTypeName) + "]");
      } else {
        _xifexpression = columnTypeName;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public static String constructorTypeName(final ETypedElement feature) {
    String _xblockexpression = null;
    {
      final String scalaType = OMLUtilities.scalaTableTypeName(feature);
      String _xifexpression = null;
      int _lowerBound = feature.getLowerBound();
      boolean _equals = (_lowerBound == 0);
      if (_equals) {
        _xifexpression = (("scala.Option[" + scalaType) + "]");
      } else {
        _xifexpression = scalaType;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public static String javaArgName(final ETypedElement feature) {
    String _xifexpression = null;
    int _lowerBound = feature.getLowerBound();
    boolean _equals = (_lowerBound == 0);
    if (_equals) {
      String _columnName = OMLUtilities.columnName(feature);
      _xifexpression = (_columnName + ".asScala");
    } else {
      _xifexpression = OMLUtilities.columnName(feature);
    }
    return _xifexpression;
  }
  
  public static String javaTypeName(final ETypedElement feature) {
    String _xblockexpression = null;
    {
      final String scalaType = OMLUtilities.scalaTableTypeName(feature);
      String _xifexpression = null;
      int _lowerBound = feature.getLowerBound();
      boolean _equals = (_lowerBound == 0);
      if (_equals) {
        _xifexpression = (("Optional[" + scalaType) + "]");
      } else {
        _xifexpression = scalaType;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public static String jsArgName(final ETypedElement feature) {
    String _xifexpression = null;
    int _lowerBound = feature.getLowerBound();
    boolean _equals = (_lowerBound == 0);
    if (_equals) {
      String _columnName = OMLUtilities.columnName(feature);
      _xifexpression = (_columnName + ".toOption");
    } else {
      _xifexpression = OMLUtilities.columnName(feature);
    }
    return _xifexpression;
  }
  
  public static String jsTypeName(final ETypedElement feature) {
    String _xblockexpression = null;
    {
      final String scalaType = OMLUtilities.scalaTableTypeName(feature);
      String _xifexpression = null;
      int _lowerBound = feature.getLowerBound();
      boolean _equals = (_lowerBound == 0);
      if (_equals) {
        _xifexpression = (("scala.scalajs.js.UndefOr[" + scalaType) + "]");
      } else {
        _xifexpression = scalaType;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public static String scalaTableTypeName(final ETypedElement feature) {
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
  
  public static Iterable<EClass> FunctionalAPIClasses(final EPackage ePkg) {
    EList<EClassifier> _eClassifiers = ePkg.getEClassifiers();
    Iterable<EClass> _filter = Iterables.<EClass>filter(_eClassifiers, EClass.class);
    final Function1<EClass, Boolean> _function = new Function1<EClass, Boolean>() {
      public Boolean apply(final EClass it) {
        return OMLUtilities.isAPI(it);
      }
    };
    return IterableExtensions.<EClass>filter(_filter, _function);
  }
  
  public static Boolean isFunctionalAPIWithOrderingKeys(final EClass eClass) {
    Boolean _isFunctionalAPI = OMLUtilities.isFunctionalAPI(eClass);
    boolean _not = (!(_isFunctionalAPI).booleanValue());
    if (_not) {
      return Boolean.valueOf(false);
    } else {
      final Iterable<ETypedElement> keys = OMLUtilities.orderingKeys(eClass);
      boolean _isEmpty = IterableExtensions.isEmpty(keys);
      if (_isEmpty) {
        return Boolean.valueOf(false);
      } else {
        return Boolean.valueOf(true);
      }
    }
  }
  
  public static Iterable<ETypedElement> orderingKeys(final EClass eClass) {
    Iterable<ETypedElement> _functionalAPIOrOrderingKeyAttributes = OMLUtilities.functionalAPIOrOrderingKeyAttributes(eClass);
    final Function1<ETypedElement, Boolean> _function = new Function1<ETypedElement, Boolean>() {
      public Boolean apply(final ETypedElement it) {
        return OMLUtilities.isOrderingKey(it);
      }
    };
    return IterableExtensions.<ETypedElement>filter(_functionalAPIOrOrderingKeyAttributes, _function);
  }
  
  public static Boolean hasOptionalAttributes(final EClass eClass) {
    Iterable<ETypedElement> _functionalAPIOrOrderingKeyAttributes = OMLUtilities.functionalAPIOrOrderingKeyAttributes(eClass);
    final Function1<ETypedElement, Boolean> _function = new Function1<ETypedElement, Boolean>() {
      public Boolean apply(final ETypedElement a) {
        int _lowerBound = a.getLowerBound();
        return Boolean.valueOf((_lowerBound == 0));
      }
    };
    return Boolean.valueOf(IterableExtensions.<ETypedElement>exists(_functionalAPIOrOrderingKeyAttributes, _function));
  }
  
  public static Iterable<ETypedElement> functionalAPIOrOrderingKeyAttributes(final EClass eClass) {
    Iterable<ETypedElement> _functionalAPIOrOrderingKeyFeatures = OMLUtilities.functionalAPIOrOrderingKeyFeatures(eClass);
    final Function1<ETypedElement, Boolean> _function = new Function1<ETypedElement, Boolean>() {
      public Boolean apply(final ETypedElement it) {
        return Boolean.valueOf(((!(OMLUtilities.isInterface(it)).booleanValue()) && ((OMLUtilities.isAttributeOrReferenceOrContainer(it)).booleanValue() || (OMLUtilities.isOrderingKey(it)).booleanValue())));
      }
    };
    return IterableExtensions.<ETypedElement>filter(_functionalAPIOrOrderingKeyFeatures, _function);
  }
  
  public static Iterable<ETypedElement> functionalAPIOrOrderingKeyFeatures(final EClass eClass) {
    List<ETypedElement> _xblockexpression = null;
    {
      Iterable<EClass> _selfAndAllSupertypes = OMLUtilities.selfAndAllSupertypes(eClass);
      final Function1<EClass, Iterable<ETypedElement>> _function = new Function1<EClass, Iterable<ETypedElement>>() {
        public Iterable<ETypedElement> apply(final EClass it) {
          return OMLUtilities.ETypedElements(it);
        }
      };
      Iterable<Iterable<ETypedElement>> _map = IterableExtensions.<EClass, Iterable<ETypedElement>>map(_selfAndAllSupertypes, _function);
      Iterable<ETypedElement> _flatten = Iterables.<ETypedElement>concat(_map);
      final Set<ETypedElement> features = IterableExtensions.<ETypedElement>toSet(_flatten);
      OMLUtilities.OMLFeatureCompare _oMLFeatureCompare = new OMLUtilities.OMLFeatureCompare();
      final List<ETypedElement> sorted = IterableExtensions.<ETypedElement>sortWith(features, _oMLFeatureCompare);
      _xblockexpression = sorted;
    }
    return _xblockexpression;
  }
  
  public static Iterable<ETypedElement> ETypedElements(final EClass eClass) {
    HashSet<ETypedElement> _xblockexpression = null;
    {
      final HashSet<ETypedElement> features = new HashSet<ETypedElement>();
      EList<EStructuralFeature> _eStructuralFeatures = eClass.getEStructuralFeatures();
      final Function1<EStructuralFeature, Boolean> _function = new Function1<EStructuralFeature, Boolean>() {
        public Boolean apply(final EStructuralFeature it) {
          return OMLUtilities.isFunctionalAPIOrOrderingKey(it);
        }
      };
      Iterable<EStructuralFeature> _filter = IterableExtensions.<EStructuralFeature>filter(_eStructuralFeatures, _function);
      Iterables.<ETypedElement>addAll(features, _filter);
      EList<EOperation> _eOperations = eClass.getEOperations();
      final Function1<EOperation, Boolean> _function_1 = new Function1<EOperation, Boolean>() {
        public Boolean apply(final EOperation it) {
          return OMLUtilities.isFunctionalAPIOrOrderingKey(it);
        }
      };
      Iterable<EOperation> _filter_1 = IterableExtensions.<EOperation>filter(_eOperations, _function_1);
      Iterables.<ETypedElement>addAll(features, _filter_1);
      _xblockexpression = features;
    }
    return _xblockexpression;
  }
  
  public static Iterable<EClass> selfAndAllSupertypes(final EClass eClass) {
    HashSet<EClass> _xblockexpression = null;
    {
      EList<EClass> _eAllSuperTypes = eClass.getEAllSuperTypes();
      final HashSet<EClass> parents = new HashSet<EClass>(_eAllSuperTypes);
      parents.add(eClass);
      _xblockexpression = parents;
    }
    return _xblockexpression;
  }
  
  public static Iterable<EClass> ESuperClasses(final EClass eClass) {
    EList<EClass> _eSuperTypes = eClass.getESuperTypes();
    final Function1<EClass, String> _function = new Function1<EClass, String>() {
      public String apply(final EClass it) {
        return it.getName();
      }
    };
    return IterableExtensions.<EClass, String>sortBy(_eSuperTypes, _function);
  }
  
  public static Iterable<EClass> ESpecificClasses(final EClass eClass) {
    EPackage _ePackage = eClass.getEPackage();
    EList<EClassifier> _eClassifiers = _ePackage.getEClassifiers();
    Iterable<EClass> _filter = Iterables.<EClass>filter(_eClassifiers, EClass.class);
    final Function1<EClass, Boolean> _function = new Function1<EClass, Boolean>() {
      public Boolean apply(final EClass it) {
        EList<EClass> _eSuperTypes = it.getESuperTypes();
        return Boolean.valueOf(_eSuperTypes.contains(eClass));
      }
    };
    Iterable<EClass> _filter_1 = IterableExtensions.<EClass>filter(_filter, _function);
    final Function1<EClass, String> _function_1 = new Function1<EClass, String>() {
      public String apply(final EClass it) {
        return it.getName();
      }
    };
    return IterableExtensions.<EClass, String>sortBy(_filter_1, _function_1);
  }
  
  public static Iterable<EStructuralFeature> APIStructuralFeatures(final EClass eClass) {
    EList<EStructuralFeature> _eStructuralFeatures = eClass.getEStructuralFeatures();
    final Function1<EStructuralFeature, Boolean> _function = new Function1<EStructuralFeature, Boolean>() {
      public Boolean apply(final EStructuralFeature it) {
        return OMLUtilities.isAPI(it);
      }
    };
    return IterableExtensions.<EStructuralFeature>filter(_eStructuralFeatures, _function);
  }
  
  public static Boolean isRootHierarchyClass(final EClass eClass) {
    return Boolean.valueOf(((eClass.isAbstract() && eClass.getESuperTypes().isEmpty()) && (!IterableExtensions.isEmpty(OMLUtilities.orderingKeys(eClass)))));
  }
  
  public static Boolean isSpecializationOfRootClass(final EClass eClass) {
    return Boolean.valueOf(((!eClass.getESuperTypes().isEmpty()) && IterableExtensions.<EClass>exists(OMLUtilities.selfAndAllSupertypes(eClass), new Function1<EClass, Boolean>() {
      public Boolean apply(final EClass it) {
        return OMLUtilities.isRootHierarchyClass(it);
      }
    })));
  }
  
  public static Iterable<EOperation> APIOperations(final EClass eClass) {
    EList<EOperation> _eOperations = eClass.getEOperations();
    final Function1<EOperation, Boolean> _function = new Function1<EOperation, Boolean>() {
      public Boolean apply(final EOperation it) {
        return OMLUtilities.isAPI(it);
      }
    };
    return IterableExtensions.<EOperation>filter(_eOperations, _function);
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
  
  public static Iterable<EStructuralFeature> getSortedDerivedAttributeSignature(final EClass eClass) {
    Iterable<EStructuralFeature> _sortedAttributeSignature = OMLUtilities.getSortedAttributeSignature(eClass);
    final Function1<EStructuralFeature, Boolean> _function = new Function1<EStructuralFeature, Boolean>() {
      public Boolean apply(final EStructuralFeature it) {
        return Boolean.valueOf(it.isDerived());
      }
    };
    return IterableExtensions.<EStructuralFeature>filter(_sortedAttributeSignature, _function);
  }
  
  public static Iterable<EStructuralFeature> getSortedAttributeSignatureExceptDerived(final EClass eClass) {
    Iterable<EStructuralFeature> _sortedAttributeSignature = OMLUtilities.getSortedAttributeSignature(eClass);
    final Function1<EStructuralFeature, Boolean> _function = new Function1<EStructuralFeature, Boolean>() {
      public Boolean apply(final EStructuralFeature it) {
        boolean _isDerived = it.isDerived();
        return Boolean.valueOf((!_isDerived));
      }
    };
    return IterableExtensions.<EStructuralFeature>filter(_sortedAttributeSignature, _function);
  }
  
  public static Iterable<EStructuralFeature> getSortedAttributeSignature(final EClass eClass) {
    Iterable<EClass> _selfAndAllSupertypes = OMLUtilities.selfAndAllSupertypes(eClass);
    final Function1<EClass, Iterable<EStructuralFeature>> _function = new Function1<EClass, Iterable<EStructuralFeature>>() {
      public Iterable<EStructuralFeature> apply(final EClass it) {
        return OMLUtilities.APIStructuralFeatures(it);
      }
    };
    Iterable<Iterable<EStructuralFeature>> _map = IterableExtensions.<EClass, Iterable<EStructuralFeature>>map(_selfAndAllSupertypes, _function);
    Iterable<EStructuralFeature> _flatten = Iterables.<EStructuralFeature>concat(_map);
    OMLUtilities.OMLFeatureCompare _oMLFeatureCompare = new OMLUtilities.OMLFeatureCompare();
    return IterableExtensions.<EStructuralFeature>sortWith(_flatten, _oMLFeatureCompare);
  }
  
  public static Iterable<EStructuralFeature> lookupCopyConstructorArguments(final EClass eClass) {
    Iterable<EStructuralFeature> _sortedAttributeSignature = OMLUtilities.getSortedAttributeSignature(eClass);
    final Function1<EStructuralFeature, Boolean> _function = new Function1<EStructuralFeature, Boolean>() {
      public Boolean apply(final EStructuralFeature it) {
        return OMLUtilities.isCopyConstructorArgument(it);
      }
    };
    return IterableExtensions.<EStructuralFeature>filter(_sortedAttributeSignature, _function);
  }
  
  public static Boolean isCopyConstructorArgument(final EStructuralFeature attribute) {
    EAnnotation _eAnnotation = attribute.getEAnnotation("http://imce.jpl.nasa.gov/oml/CopyConstructor");
    return Boolean.valueOf((null != _eAnnotation));
  }
  
  public static Iterable<EOperation> ScalaOperations(final EClass eClass) {
    Iterable<EOperation> _APIOperations = OMLUtilities.APIOperations(eClass);
    final Function1<EOperation, Boolean> _function = new Function1<EOperation, Boolean>() {
      public Boolean apply(final EOperation op) {
        return Boolean.valueOf(((OMLUtilities.isScala(op)).booleanValue() || (null != OMLUtilities.xExpressions(op))));
      }
    };
    return IterableExtensions.<EOperation>filter(_APIOperations, _function);
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
      final String scalaCode = OMLUtilities.scalaAnnotation(op);
      final Iterable<XExpression> xExpressions = OMLUtilities.xExpressions(op);
      String _xifexpression = null;
      if ((null != scalaCode)) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("{");
        _builder.newLine();
        _builder.append("  ");
        _builder.append(scalaCode, "  ");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _xifexpression = _builder.toString();
      } else {
        String _xifexpression_1 = null;
        if ((null != xExpressions)) {
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
              String _scala = OMLUtilities.toScala(exp);
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
        if (exp instanceof XMemberFeatureCall) {
          _matched=true;
          String _xblockexpression_1 = null;
          {
            final XExpression rF = ((XMemberFeatureCall)exp).getActualReceiver();
            final String rS = OMLUtilities.toScala(rF);
            EList<XExpression> _actualArguments = ((XMemberFeatureCall)exp).getActualArguments();
            boolean _isEmpty = _actualArguments.isEmpty();
            boolean _not = (!_isEmpty);
            if (_not) {
              throw new IllegalArgumentException(".toScala can only handle an XMemberFeatureCall for calling an operation with 0 arguments.");
            }
            final JvmIdentifiableElement tF = ((XMemberFeatureCall)exp).getFeature();
            final String tS = tF.getSimpleName();
            final String s = (((rS + ".") + tS) + "()");
            _xblockexpression_1 = s;
          }
          _switchResult = _xblockexpression_1;
        }
      }
      if (!_matched) {
        String _string = exp.toString();
        _switchResult = (_string + "/* default(debug) */");
      }
      final String result = _switchResult;
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public static String queryBody(final EStructuralFeature f) {
    String _xblockexpression = null;
    {
      final String scalaCode = OMLUtilities.scalaAnnotation(f);
      String _xifexpression = null;
      if ((null != scalaCode)) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("{");
        _builder.newLine();
        _builder.append("  ");
        _builder.append(scalaCode, "  ");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _xifexpression = _builder.toString();
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("// N/A");
        _xifexpression = _builder_1.toString();
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public static Boolean isFunctionalAPIOrOrderingKey(final ENamedElement e) {
    return Boolean.valueOf(((OMLUtilities.isFunctionalAPI(e)).booleanValue() || (OMLUtilities.isOrderingKey(e)).booleanValue()));
  }
  
  public static Boolean isFunctionalAPI(final ENamedElement e) {
    boolean _xifexpression = false;
    if (((OMLUtilities.isSchema(e)).booleanValue() && (OMLUtilities.isAPI(e)).booleanValue())) {
      boolean _switchResult = false;
      boolean _matched = false;
      if (e instanceof EClass) {
        _matched=true;
        boolean _isAbstract = ((EClass)e).isAbstract();
        _switchResult = (!_isAbstract);
      }
      if (!_matched) {
        _switchResult = true;
      }
      _xifexpression = _switchResult;
    } else {
      _xifexpression = false;
    }
    return Boolean.valueOf(_xifexpression);
  }
  
  public static Boolean isAttributeOrReferenceOrContainer(final ETypedElement f) {
    Boolean _switchResult = null;
    boolean _matched = false;
    if (f instanceof EReference) {
      _matched=true;
      _switchResult = Boolean.valueOf(((OMLUtilities.isSchema(f)).booleanValue() && (!((EReference)f).isContainment())));
    }
    if (!_matched) {
      _switchResult = OMLUtilities.isSchema(f);
    }
    return _switchResult;
  }
  
  public static EClass EClassContainer(final ETypedElement f) {
    EClass _xblockexpression = null;
    {
      final EObject c = f.eContainer();
      EClass _switchResult = null;
      boolean _matched = false;
      if (c instanceof EClass) {
        _matched=true;
        _switchResult = ((EClass)c);
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
  
  public static Boolean isOrderingKey(final ENamedElement e) {
    EAnnotation _eAnnotation = e.getEAnnotation("http://imce.jpl.nasa.gov/oml/IsOrderingKey");
    return Boolean.valueOf((null != _eAnnotation));
  }
  
  public static Boolean isOverride(final ETypedElement feature) {
    EAnnotation _eAnnotation = feature.getEAnnotation("http://imce.jpl.nasa.gov/oml/Override");
    return Boolean.valueOf((null != _eAnnotation));
  }
  
  public static Boolean isOO(final ENamedElement e) {
    EAnnotation _eAnnotation = e.getEAnnotation("http://imce.jpl.nasa.gov/oml/NotFunctionalAPI");
    return Boolean.valueOf((null != _eAnnotation));
  }
  
  public static Boolean isInterface(final ENamedElement e) {
    EAnnotation _eAnnotation = e.getEAnnotation("http://imce.jpl.nasa.gov/oml/FunctionalInterface");
    return Boolean.valueOf((null != _eAnnotation));
  }
  
  public static Boolean isAPI(final ENamedElement e) {
    EAnnotation _eAnnotation = e.getEAnnotation("http://imce.jpl.nasa.gov/oml/NotFunctionalAPI");
    return Boolean.valueOf((null == _eAnnotation));
  }
  
  public static Boolean isGlossary(final ENamedElement e) {
    EAnnotation _eAnnotation = e.getEAnnotation("http://imce.jpl.nasa.gov/oml/Glossary");
    return Boolean.valueOf((null != _eAnnotation));
  }
  
  public static Boolean isScala(final ENamedElement e) {
    EAnnotation _eAnnotation = e.getEAnnotation("http://imce.jpl.nasa.gov/oml/Scala");
    return Boolean.valueOf((null != _eAnnotation));
  }
  
  public static String scalaAnnotation(final ETypedElement f) {
    EAnnotation _eAnnotation = f.getEAnnotation("http://imce.jpl.nasa.gov/oml/Scala");
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
  
  public static Boolean isSchema(final ENamedElement e) {
    EAnnotation _eAnnotation = e.getEAnnotation("http://imce.jpl.nasa.gov/oml/NotSchema");
    return Boolean.valueOf((null == _eAnnotation));
  }
  
  public static Boolean isValueTable(final ENamedElement e) {
    EAnnotation _eAnnotation = e.getEAnnotation("http://imce.jpl.nasa.gov/oml/ValueTable");
    return Boolean.valueOf((null != _eAnnotation));
  }
  
  public static String pluralizeIfMany(final String s, final int cardinality) {
    String _xifexpression = null;
    if ((cardinality > 1)) {
      _xifexpression = OMLUtilities.pluralize(s);
    } else {
      _xifexpression = s;
    }
    return _xifexpression;
  }
  
  public static String pluralize(final String s) {
    String _xifexpression = null;
    boolean _endsWith = s.endsWith("y");
    if (_endsWith) {
      int _length = s.length();
      int _minus = (_length - 1);
      String _substring = s.substring(0, _minus);
      _xifexpression = (_substring + "ies");
    } else {
      _xifexpression = (s + "s");
    }
    return _xifexpression;
  }
  
  public static String columnName(final ETypedElement feature) {
    String _xifexpression = null;
    if ((feature instanceof EReference)) {
      String _name = ((EReference)feature).getName();
      _xifexpression = (_name + "UUID");
    } else {
      _xifexpression = feature.getName();
    }
    return _xifexpression;
  }
  
  public static String markDown(final ENamedElement e) {
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
      _xblockexpression = doc;
    }
    return _xblockexpression;
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
  
  public static String copyright() {
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
    return _builder.toString();
  }
}
