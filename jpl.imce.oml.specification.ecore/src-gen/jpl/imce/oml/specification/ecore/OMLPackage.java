/**
 * 
 * Copyright 2016 California Institute of Technology ("Caltech").
 * U.S. Government sponsorship acknowledged.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package jpl.imce.oml.specification.ecore;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see jpl.imce.oml.specification.ecore.OMLFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel copyrightText='\nCopyright 2016 California Institute of Technology (\"Caltech\").\nU.S. Government sponsorship acknowledged.\n\nLicensed under the Apache License, Version 2.0 (the \"License\");\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\n\n     http://www.apache.org/licenses/LICENSE-2.0\n\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.\n' featureDelegation='None' modelPluginVariables='org.eclipse.xtext.xbase.lib org.eclipse.emf.ecore.xcore.lib org.eclipse.emf.cdo' rootExtendsClass='org.eclipse.emf.internal.cdo.CDOObjectImpl' rootExtendsInterface='org.eclipse.emf.cdo.CDOObject' childCreationExtenders='true' pluginKey='OML' modelName='OML' prefix='OML' modelPluginID='jpl.imce.oml.specification.ecore' modelDirectory='/jpl.imce.oml.specification.ecore/src-gen' editPluginID='jpl.imce.oml.specification.ecore.edit' editPluginClass='jpl.imce.oml.specification.ecore.edit.provider.OMLEditPlugin' editDirectory='/jpl.imce.oml.specification.ecore.edit/src-gen' editorPluginID='jpl.imce.oml.specification.ecore.editor' editorPluginClass='jpl.imce.oml.specification.eore.editor.presentation.OMLEditorPlugin' editorDirectory='/jpl.imce.oml.specification.ecore.editor/src-gen' basePackage='jpl.imce.oml.specification'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Collection='http://imce.jpl.nasa.gov/oml/Collection' Override='http://imce.jpl.nasa.gov/oml/Override' NotFunctionalAPI='http://imce.jpl.nasa.gov/oml/NotFunctionalAPI' FunctionalInterface='http://imce.jpl.nasa.gov/oml/FunctionalInterface' NotSchema='http://imce.jpl.nasa.gov/oml/NotSchema' ValueTable='http://imce.jpl.nasa.gov/oml/ValueTable' Scala='http://imce.jpl.nasa.gov/oml/Scala' IsOrderingKey='http://imce.jpl.nasa.gov/oml/IsOrderingKey' CopyConstructor='http://imce.jpl.nasa.gov/oml/CopyConstructor' Glossary='http://imce.jpl.nasa.gov/oml/Glossary'"
 * @generated
 */
public interface OMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "jpl.imce.oml.specification.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ecore";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OMLPackage eINSTANCE = jpl.imce.oml.specification.ecore.impl.OMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.ResourceImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 0;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___IRI = 0;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___NAME = 1;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.TerminologyThingImpl <em>Terminology Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.TerminologyThingImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getTerminologyThing()
	 * @generated
	 */
	int TERMINOLOGY_THING = 1;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_THING__UUID = 0;

	/**
	 * The number of structural features of the '<em>Terminology Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_THING_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_THING___CALCULATE_UUID = 0;

	/**
	 * The number of operations of the '<em>Terminology Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_THING_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.AnnotationPropertyImpl <em>Annotation Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.AnnotationPropertyImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getAnnotationProperty()
	 * @generated
	 */
	int ANNOTATION_PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY__IRI = 0;

	/**
	 * The feature id for the '<em><b>Abbrev IRI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY__ABBREV_IRI = 1;

	/**
	 * The number of structural features of the '<em>Annotation Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Uuid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY___UUID = 0;

	/**
	 * The number of operations of the '<em>Annotation Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.AnnotationPropertyTableImpl <em>Annotation Property Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.AnnotationPropertyTableImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getAnnotationPropertyTable()
	 * @generated
	 */
	int ANNOTATION_PROPERTY_TABLE = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_TABLE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_TABLE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Annotation Property Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_TABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Annotation Property Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_PROPERTY_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.AnnotationEntryImpl <em>Annotation Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.AnnotationEntryImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getAnnotationEntry()
	 * @generated
	 */
	int ANNOTATION_ENTRY = 4;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ENTRY__MODULE = 0;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ENTRY__SUBJECT = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ENTRY__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Annotation Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ENTRY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Annotation Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.AnnotationSubjectTableImpl <em>Annotation Subject Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.AnnotationSubjectTableImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getAnnotationSubjectTable()
	 * @generated
	 */
	int ANNOTATION_SUBJECT_TABLE = 5;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_SUBJECT_TABLE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_SUBJECT_TABLE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Annotation Subject Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_SUBJECT_TABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Annotation Subject Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_SUBJECT_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.AnnotationSubjectPropertyValueImpl <em>Annotation Subject Property Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.AnnotationSubjectPropertyValueImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getAnnotationSubjectPropertyValue()
	 * @generated
	 */
	int ANNOTATION_SUBJECT_PROPERTY_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_SUBJECT_PROPERTY_VALUE__PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_SUBJECT_PROPERTY_VALUE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Annotation Subject Property Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_SUBJECT_PROPERTY_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Annotation Subject Property Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_SUBJECT_PROPERTY_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.AnnotationImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 7;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__MODULE = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__SUBJECT = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__VALUE = 3;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.TerminologyExtentImpl <em>Terminology Extent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.TerminologyExtentImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getTerminologyExtent()
	 * @generated
	 */
	int TERMINOLOGY_EXTENT = 8;

	/**
	 * The feature id for the '<em><b>Annotation Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_EXTENT__ANNOTATION_PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Terminology Graphs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_EXTENT__TERMINOLOGY_GRAPHS = 1;

	/**
	 * The feature id for the '<em><b>Bundles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_EXTENT__BUNDLES = 2;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_EXTENT__DESCRIPTIONS = 3;

	/**
	 * The number of structural features of the '<em>Terminology Extent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_EXTENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Terminology Extent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_EXTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.ModuleImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 9;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__UUID = TERMINOLOGY_THING__UUID;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__IRI = TERMINOLOGY_THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ANNOTATIONS = TERMINOLOGY_THING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = TERMINOLOGY_THING_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Extent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE___EXTENT = TERMINOLOGY_THING_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE___CALCULATE_UUID = TERMINOLOGY_THING_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE___IRI = TERMINOLOGY_THING_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Ns Prefix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE___NS_PREFIX = TERMINOLOGY_THING_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE___NAME = TERMINOLOGY_THING_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Annotations By Subject</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE___ANNOTATIONS_BY_SUBJECT = TERMINOLOGY_THING_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Annotations By Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE___ANNOTATIONS_BY_PROPERTY = TERMINOLOGY_THING_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>With Annotations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE___WITH_ANNOTATIONS__EMAP = TERMINOLOGY_THING_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Entities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE___ENTITIES = TERMINOLOGY_THING_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Aspects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE___ASPECTS = TERMINOLOGY_THING_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Concepts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE___CONCEPTS = TERMINOLOGY_THING_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Reified Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE___REIFIED_RELATIONSHIPS = TERMINOLOGY_THING_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Unreified Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE___UNREIFIED_RELATIONSHIPS = TERMINOLOGY_THING_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Data Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE___DATA_RELATIONSHIPS = TERMINOLOGY_THING_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Entity Scalar Data Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE___ENTITY_SCALAR_DATA_PROPERTIES = TERMINOLOGY_THING_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Dataranges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE___DATARANGES = TERMINOLOGY_THING_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Scalars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE___SCALARS = TERMINOLOGY_THING_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Structures</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE___STRUCTURES = TERMINOLOGY_THING_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Term Axioms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE___TERM_AXIOMS = TERMINOLOGY_THING_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Everything</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE___EVERYTHING = TERMINOLOGY_THING_OPERATION_COUNT + 21;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = TERMINOLOGY_THING_OPERATION_COUNT + 22;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.TerminologyBoxImpl <em>Terminology Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.TerminologyBoxImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getTerminologyBox()
	 * @generated
	 */
	int TERMINOLOGY_BOX = 10;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX__UUID = MODULE__UUID;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX__IRI = MODULE__IRI;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX__ANNOTATIONS = MODULE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX__KIND = MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Terminology Box Axioms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX__TERMINOLOGY_BOX_AXIOMS = MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Box Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX__BOX_STATEMENTS = MODULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Terminology Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX_FEATURE_COUNT = MODULE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Extent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX___EXTENT = MODULE___EXTENT;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX___CALCULATE_UUID = MODULE___CALCULATE_UUID;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX___IRI = MODULE___IRI;

	/**
	 * The operation id for the '<em>Ns Prefix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX___NS_PREFIX = MODULE___NS_PREFIX;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX___NAME = MODULE___NAME;

	/**
	 * The operation id for the '<em>Annotations By Subject</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX___ANNOTATIONS_BY_SUBJECT = MODULE___ANNOTATIONS_BY_SUBJECT;

	/**
	 * The operation id for the '<em>Annotations By Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX___ANNOTATIONS_BY_PROPERTY = MODULE___ANNOTATIONS_BY_PROPERTY;

	/**
	 * The operation id for the '<em>With Annotations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX___WITH_ANNOTATIONS__EMAP = MODULE___WITH_ANNOTATIONS__EMAP;

	/**
	 * The operation id for the '<em>With Box Statements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX___WITH_BOX_STATEMENTS__ELIST = MODULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Entities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX___ENTITIES = MODULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Aspects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX___ASPECTS = MODULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Concepts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX___CONCEPTS = MODULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Reified Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX___REIFIED_RELATIONSHIPS = MODULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Unreified Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX___UNREIFIED_RELATIONSHIPS = MODULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Data Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX___DATA_RELATIONSHIPS = MODULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Entity Scalar Data Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX___ENTITY_SCALAR_DATA_PROPERTIES = MODULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Dataranges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX___DATARANGES = MODULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Scalars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX___SCALARS = MODULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Structures</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX___STRUCTURES = MODULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Term Axioms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX___TERM_AXIOMS = MODULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Everything</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX___EVERYTHING = MODULE_OPERATION_COUNT + 12;

	/**
	 * The number of operations of the '<em>Terminology Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX_OPERATION_COUNT = MODULE_OPERATION_COUNT + 13;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.BundleImpl <em>Bundle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.BundleImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getBundle()
	 * @generated
	 */
	int BUNDLE = 11;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__UUID = TERMINOLOGY_BOX__UUID;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__IRI = TERMINOLOGY_BOX__IRI;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__ANNOTATIONS = TERMINOLOGY_BOX__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__KIND = TERMINOLOGY_BOX__KIND;

	/**
	 * The feature id for the '<em><b>Terminology Box Axioms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__TERMINOLOGY_BOX_AXIOMS = TERMINOLOGY_BOX__TERMINOLOGY_BOX_AXIOMS;

	/**
	 * The feature id for the '<em><b>Box Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__BOX_STATEMENTS = TERMINOLOGY_BOX__BOX_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Bundle Extent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__BUNDLE_EXTENT = TERMINOLOGY_BOX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bundle Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__BUNDLE_STATEMENTS = TERMINOLOGY_BOX_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Terminology Bundle Axioms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__TERMINOLOGY_BUNDLE_AXIOMS = TERMINOLOGY_BOX_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_FEATURE_COUNT = TERMINOLOGY_BOX_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE___CALCULATE_UUID = TERMINOLOGY_BOX___CALCULATE_UUID;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE___IRI = TERMINOLOGY_BOX___IRI;

	/**
	 * The operation id for the '<em>Ns Prefix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE___NS_PREFIX = TERMINOLOGY_BOX___NS_PREFIX;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE___NAME = TERMINOLOGY_BOX___NAME;

	/**
	 * The operation id for the '<em>Annotations By Subject</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE___ANNOTATIONS_BY_SUBJECT = TERMINOLOGY_BOX___ANNOTATIONS_BY_SUBJECT;

	/**
	 * The operation id for the '<em>Entities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE___ENTITIES = TERMINOLOGY_BOX___ENTITIES;

	/**
	 * The operation id for the '<em>Aspects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE___ASPECTS = TERMINOLOGY_BOX___ASPECTS;

	/**
	 * The operation id for the '<em>Concepts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE___CONCEPTS = TERMINOLOGY_BOX___CONCEPTS;

	/**
	 * The operation id for the '<em>Reified Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE___REIFIED_RELATIONSHIPS = TERMINOLOGY_BOX___REIFIED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Unreified Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE___UNREIFIED_RELATIONSHIPS = TERMINOLOGY_BOX___UNREIFIED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Data Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE___DATA_RELATIONSHIPS = TERMINOLOGY_BOX___DATA_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Entity Scalar Data Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE___ENTITY_SCALAR_DATA_PROPERTIES = TERMINOLOGY_BOX___ENTITY_SCALAR_DATA_PROPERTIES;

	/**
	 * The operation id for the '<em>Dataranges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE___DATARANGES = TERMINOLOGY_BOX___DATARANGES;

	/**
	 * The operation id for the '<em>Scalars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE___SCALARS = TERMINOLOGY_BOX___SCALARS;

	/**
	 * The operation id for the '<em>Structures</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE___STRUCTURES = TERMINOLOGY_BOX___STRUCTURES;

	/**
	 * The operation id for the '<em>Term Axioms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE___TERM_AXIOMS = TERMINOLOGY_BOX___TERM_AXIOMS;

	/**
	 * The operation id for the '<em>Extent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE___EXTENT = TERMINOLOGY_BOX_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>With Annotations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE___WITH_ANNOTATIONS__EMAP = TERMINOLOGY_BOX_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Annotations By Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE___ANNOTATIONS_BY_PROPERTY = TERMINOLOGY_BOX_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>With Bundle Statements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE___WITH_BUNDLE_STATEMENTS__ELIST = TERMINOLOGY_BOX_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>With Box Statements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE___WITH_BOX_STATEMENTS__ELIST = TERMINOLOGY_BOX_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Everything</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE___EVERYTHING = TERMINOLOGY_BOX_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_OPERATION_COUNT = TERMINOLOGY_BOX_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.TerminologyGraphImpl <em>Terminology Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.TerminologyGraphImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getTerminologyGraph()
	 * @generated
	 */
	int TERMINOLOGY_GRAPH = 12;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GRAPH__UUID = TERMINOLOGY_BOX__UUID;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GRAPH__IRI = TERMINOLOGY_BOX__IRI;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GRAPH__ANNOTATIONS = TERMINOLOGY_BOX__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GRAPH__KIND = TERMINOLOGY_BOX__KIND;

	/**
	 * The feature id for the '<em><b>Terminology Box Axioms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GRAPH__TERMINOLOGY_BOX_AXIOMS = TERMINOLOGY_BOX__TERMINOLOGY_BOX_AXIOMS;

	/**
	 * The feature id for the '<em><b>Box Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GRAPH__BOX_STATEMENTS = TERMINOLOGY_BOX__BOX_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Graph Extent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GRAPH__GRAPH_EXTENT = TERMINOLOGY_BOX_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Terminology Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GRAPH_FEATURE_COUNT = TERMINOLOGY_BOX_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GRAPH___CALCULATE_UUID = TERMINOLOGY_BOX___CALCULATE_UUID;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GRAPH___IRI = TERMINOLOGY_BOX___IRI;

	/**
	 * The operation id for the '<em>Ns Prefix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GRAPH___NS_PREFIX = TERMINOLOGY_BOX___NS_PREFIX;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GRAPH___NAME = TERMINOLOGY_BOX___NAME;

	/**
	 * The operation id for the '<em>Annotations By Subject</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GRAPH___ANNOTATIONS_BY_SUBJECT = TERMINOLOGY_BOX___ANNOTATIONS_BY_SUBJECT;

	/**
	 * The operation id for the '<em>Entities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GRAPH___ENTITIES = TERMINOLOGY_BOX___ENTITIES;

	/**
	 * The operation id for the '<em>Aspects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GRAPH___ASPECTS = TERMINOLOGY_BOX___ASPECTS;

	/**
	 * The operation id for the '<em>Concepts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GRAPH___CONCEPTS = TERMINOLOGY_BOX___CONCEPTS;

	/**
	 * The operation id for the '<em>Reified Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GRAPH___REIFIED_RELATIONSHIPS = TERMINOLOGY_BOX___REIFIED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Unreified Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GRAPH___UNREIFIED_RELATIONSHIPS = TERMINOLOGY_BOX___UNREIFIED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Data Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GRAPH___DATA_RELATIONSHIPS = TERMINOLOGY_BOX___DATA_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Entity Scalar Data Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GRAPH___ENTITY_SCALAR_DATA_PROPERTIES = TERMINOLOGY_BOX___ENTITY_SCALAR_DATA_PROPERTIES;

	/**
	 * The operation id for the '<em>Dataranges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GRAPH___DATARANGES = TERMINOLOGY_BOX___DATARANGES;

	/**
	 * The operation id for the '<em>Scalars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GRAPH___SCALARS = TERMINOLOGY_BOX___SCALARS;

	/**
	 * The operation id for the '<em>Structures</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GRAPH___STRUCTURES = TERMINOLOGY_BOX___STRUCTURES;

	/**
	 * The operation id for the '<em>Term Axioms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GRAPH___TERM_AXIOMS = TERMINOLOGY_BOX___TERM_AXIOMS;

	/**
	 * The operation id for the '<em>Everything</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GRAPH___EVERYTHING = TERMINOLOGY_BOX___EVERYTHING;

	/**
	 * The operation id for the '<em>Extent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GRAPH___EXTENT = TERMINOLOGY_BOX_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>With Annotations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GRAPH___WITH_ANNOTATIONS__EMAP = TERMINOLOGY_BOX_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Annotations By Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GRAPH___ANNOTATIONS_BY_PROPERTY = TERMINOLOGY_BOX_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>With Box Statements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GRAPH___WITH_BOX_STATEMENTS__ELIST = TERMINOLOGY_BOX_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Terminology Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GRAPH_OPERATION_COUNT = TERMINOLOGY_BOX_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.TerminologyBoxStatementImpl <em>Terminology Box Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.TerminologyBoxStatementImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getTerminologyBoxStatement()
	 * @generated
	 */
	int TERMINOLOGY_BOX_STATEMENT = 13;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX_STATEMENT__UUID = TERMINOLOGY_THING__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX_STATEMENT__TBOX = TERMINOLOGY_THING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Terminology Box Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX_STATEMENT_FEATURE_COUNT = TERMINOLOGY_THING_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX_STATEMENT___CALCULATE_UUID = TERMINOLOGY_THING___CALCULATE_UUID;

	/**
	 * The number of operations of the '<em>Terminology Box Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX_STATEMENT_OPERATION_COUNT = TERMINOLOGY_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.TerminologyBundleStatementImpl <em>Terminology Bundle Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.TerminologyBundleStatementImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getTerminologyBundleStatement()
	 * @generated
	 */
	int TERMINOLOGY_BUNDLE_STATEMENT = 14;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BUNDLE_STATEMENT__UUID = TERMINOLOGY_THING__UUID;

	/**
	 * The feature id for the '<em><b>Bundle</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BUNDLE_STATEMENT__BUNDLE = TERMINOLOGY_THING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Terminology Bundle Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BUNDLE_STATEMENT_FEATURE_COUNT = TERMINOLOGY_THING_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BUNDLE_STATEMENT___CALCULATE_UUID = TERMINOLOGY_THING___CALCULATE_UUID;

	/**
	 * The number of operations of the '<em>Terminology Bundle Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BUNDLE_STATEMENT_OPERATION_COUNT = TERMINOLOGY_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.TermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.TermImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 15;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__UUID = TERMINOLOGY_BOX_STATEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__TBOX = TERMINOLOGY_BOX_STATEMENT__TBOX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__NAME = TERMINOLOGY_BOX_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_FEATURE_COUNT = TERMINOLOGY_BOX_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM___CALCULATE_UUID = TERMINOLOGY_BOX_STATEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM___IRI = TERMINOLOGY_BOX_STATEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM___NAME = TERMINOLOGY_BOX_STATEMENT_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_OPERATION_COUNT = TERMINOLOGY_BOX_STATEMENT_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.UnaryTermKindImpl <em>Unary Term Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.UnaryTermKindImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getUnaryTermKind()
	 * @generated
	 */
	int UNARY_TERM_KIND = 16;

	/**
	 * The number of structural features of the '<em>Unary Term Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_TERM_KIND_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Unary Term Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_TERM_KIND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.DirectedBinaryRelationshipKindImpl <em>Directed Binary Relationship Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.DirectedBinaryRelationshipKindImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getDirectedBinaryRelationshipKind()
	 * @generated
	 */
	int DIRECTED_BINARY_RELATIONSHIP_KIND = 17;

	/**
	 * The number of structural features of the '<em>Directed Binary Relationship Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_BINARY_RELATIONSHIP_KIND_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Relation Domain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_BINARY_RELATIONSHIP_KIND___RELATION_DOMAIN = 0;

	/**
	 * The operation id for the '<em>Relation Range</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_BINARY_RELATIONSHIP_KIND___RELATION_RANGE = 1;

	/**
	 * The number of operations of the '<em>Directed Binary Relationship Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_BINARY_RELATIONSHIP_KIND_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.EntityImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 18;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__UUID = TERM__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__TBOX = TERM__TBOX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = TERM__NAME;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = TERM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___CALCULATE_UUID = TERM___CALCULATE_UUID;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___IRI = TERM___IRI;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___NAME = TERM___NAME;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.ConceptualEntityImpl <em>Conceptual Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.ConceptualEntityImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getConceptualEntity()
	 * @generated
	 */
	int CONCEPTUAL_ENTITY = 19;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ENTITY__IS_ABSTRACT = 0;

	/**
	 * The number of structural features of the '<em>Conceptual Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ENTITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Conceptual Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.AspectImpl <em>Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.AspectImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getAspect()
	 * @generated
	 */
	int ASPECT = 20;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__UUID = ENTITY__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__TBOX = ENTITY__TBOX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__NAME = ENTITY__NAME;

	/**
	 * The number of structural features of the '<em>Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT___CALCULATE_UUID = ENTITY___CALCULATE_UUID;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT___IRI = ENTITY___IRI;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT___NAME = ENTITY___NAME;

	/**
	 * The number of operations of the '<em>Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.ConceptImpl <em>Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.ConceptImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getConcept()
	 * @generated
	 */
	int CONCEPT = 21;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__UUID = ENTITY__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__TBOX = ENTITY__TBOX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__IS_ABSTRACT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT___CALCULATE_UUID = ENTITY___CALCULATE_UUID;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT___IRI = ENTITY___IRI;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT___NAME = ENTITY___NAME;

	/**
	 * The number of operations of the '<em>Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.EntityRelationshipImpl <em>Entity Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.EntityRelationshipImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getEntityRelationship()
	 * @generated
	 */
	int ENTITY_RELATIONSHIP = 22;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP__UUID = TERM__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP__TBOX = TERM__TBOX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP__NAME = TERM__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP__SOURCE = TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP__TARGET = TERM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Functional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP__IS_FUNCTIONAL = TERM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Inverse Functional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP__IS_INVERSE_FUNCTIONAL = TERM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Essential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP__IS_ESSENTIAL = TERM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Inverse Essential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP__IS_INVERSE_ESSENTIAL = TERM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Symmetric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP__IS_SYMMETRIC = TERM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Asymmetric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP__IS_ASYMMETRIC = TERM_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Reflexive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP__IS_REFLEXIVE = TERM_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Is Irreflexive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP__IS_IRREFLEXIVE = TERM_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Is Transitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP__IS_TRANSITIVE = TERM_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Entity Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP_FEATURE_COUNT = TERM_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP___CALCULATE_UUID = TERM___CALCULATE_UUID;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP___IRI = TERM___IRI;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP___NAME = TERM___NAME;

	/**
	 * The operation id for the '<em>Relation Domain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP___RELATION_DOMAIN = TERM_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Relation Range</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP___RELATION_RANGE = TERM_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Entity Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RELATIONSHIP_OPERATION_COUNT = TERM_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.ReifiedRelationshipImpl <em>Reified Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.ReifiedRelationshipImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getReifiedRelationship()
	 * @generated
	 */
	int REIFIED_RELATIONSHIP = 23;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP__UUID = ENTITY_RELATIONSHIP__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP__TBOX = ENTITY_RELATIONSHIP__TBOX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP__NAME = ENTITY_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP__SOURCE = ENTITY_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP__TARGET = ENTITY_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Is Functional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP__IS_FUNCTIONAL = ENTITY_RELATIONSHIP__IS_FUNCTIONAL;

	/**
	 * The feature id for the '<em><b>Is Inverse Functional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP__IS_INVERSE_FUNCTIONAL = ENTITY_RELATIONSHIP__IS_INVERSE_FUNCTIONAL;

	/**
	 * The feature id for the '<em><b>Is Essential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP__IS_ESSENTIAL = ENTITY_RELATIONSHIP__IS_ESSENTIAL;

	/**
	 * The feature id for the '<em><b>Is Inverse Essential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP__IS_INVERSE_ESSENTIAL = ENTITY_RELATIONSHIP__IS_INVERSE_ESSENTIAL;

	/**
	 * The feature id for the '<em><b>Is Symmetric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP__IS_SYMMETRIC = ENTITY_RELATIONSHIP__IS_SYMMETRIC;

	/**
	 * The feature id for the '<em><b>Is Asymmetric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP__IS_ASYMMETRIC = ENTITY_RELATIONSHIP__IS_ASYMMETRIC;

	/**
	 * The feature id for the '<em><b>Is Reflexive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP__IS_REFLEXIVE = ENTITY_RELATIONSHIP__IS_REFLEXIVE;

	/**
	 * The feature id for the '<em><b>Is Irreflexive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP__IS_IRREFLEXIVE = ENTITY_RELATIONSHIP__IS_IRREFLEXIVE;

	/**
	 * The feature id for the '<em><b>Is Transitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP__IS_TRANSITIVE = ENTITY_RELATIONSHIP__IS_TRANSITIVE;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP__IS_ABSTRACT = ENTITY_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unreified Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP__UNREIFIED_PROPERTY_NAME = ENTITY_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unreified Inverse Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP__UNREIFIED_INVERSE_PROPERTY_NAME = ENTITY_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reified Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_FEATURE_COUNT = ENTITY_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP___CALCULATE_UUID = ENTITY_RELATIONSHIP___CALCULATE_UUID;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP___IRI = ENTITY_RELATIONSHIP___IRI;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP___NAME = ENTITY_RELATIONSHIP___NAME;

	/**
	 * The operation id for the '<em>Relation Domain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP___RELATION_DOMAIN = ENTITY_RELATIONSHIP___RELATION_DOMAIN;

	/**
	 * The operation id for the '<em>Relation Range</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP___RELATION_RANGE = ENTITY_RELATIONSHIP___RELATION_RANGE;

	/**
	 * The number of operations of the '<em>Reified Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_OPERATION_COUNT = ENTITY_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.UnreifiedRelationshipImpl <em>Unreified Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.UnreifiedRelationshipImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getUnreifiedRelationship()
	 * @generated
	 */
	int UNREIFIED_RELATIONSHIP = 24;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREIFIED_RELATIONSHIP__UUID = ENTITY_RELATIONSHIP__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREIFIED_RELATIONSHIP__TBOX = ENTITY_RELATIONSHIP__TBOX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREIFIED_RELATIONSHIP__NAME = ENTITY_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREIFIED_RELATIONSHIP__SOURCE = ENTITY_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREIFIED_RELATIONSHIP__TARGET = ENTITY_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Is Functional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREIFIED_RELATIONSHIP__IS_FUNCTIONAL = ENTITY_RELATIONSHIP__IS_FUNCTIONAL;

	/**
	 * The feature id for the '<em><b>Is Inverse Functional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREIFIED_RELATIONSHIP__IS_INVERSE_FUNCTIONAL = ENTITY_RELATIONSHIP__IS_INVERSE_FUNCTIONAL;

	/**
	 * The feature id for the '<em><b>Is Essential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREIFIED_RELATIONSHIP__IS_ESSENTIAL = ENTITY_RELATIONSHIP__IS_ESSENTIAL;

	/**
	 * The feature id for the '<em><b>Is Inverse Essential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREIFIED_RELATIONSHIP__IS_INVERSE_ESSENTIAL = ENTITY_RELATIONSHIP__IS_INVERSE_ESSENTIAL;

	/**
	 * The feature id for the '<em><b>Is Symmetric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREIFIED_RELATIONSHIP__IS_SYMMETRIC = ENTITY_RELATIONSHIP__IS_SYMMETRIC;

	/**
	 * The feature id for the '<em><b>Is Asymmetric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREIFIED_RELATIONSHIP__IS_ASYMMETRIC = ENTITY_RELATIONSHIP__IS_ASYMMETRIC;

	/**
	 * The feature id for the '<em><b>Is Reflexive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREIFIED_RELATIONSHIP__IS_REFLEXIVE = ENTITY_RELATIONSHIP__IS_REFLEXIVE;

	/**
	 * The feature id for the '<em><b>Is Irreflexive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREIFIED_RELATIONSHIP__IS_IRREFLEXIVE = ENTITY_RELATIONSHIP__IS_IRREFLEXIVE;

	/**
	 * The feature id for the '<em><b>Is Transitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREIFIED_RELATIONSHIP__IS_TRANSITIVE = ENTITY_RELATIONSHIP__IS_TRANSITIVE;

	/**
	 * The number of structural features of the '<em>Unreified Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREIFIED_RELATIONSHIP_FEATURE_COUNT = ENTITY_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREIFIED_RELATIONSHIP___CALCULATE_UUID = ENTITY_RELATIONSHIP___CALCULATE_UUID;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREIFIED_RELATIONSHIP___IRI = ENTITY_RELATIONSHIP___IRI;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREIFIED_RELATIONSHIP___NAME = ENTITY_RELATIONSHIP___NAME;

	/**
	 * The operation id for the '<em>Relation Domain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREIFIED_RELATIONSHIP___RELATION_DOMAIN = ENTITY_RELATIONSHIP___RELATION_DOMAIN;

	/**
	 * The operation id for the '<em>Relation Range</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREIFIED_RELATIONSHIP___RELATION_RANGE = ENTITY_RELATIONSHIP___RELATION_RANGE;

	/**
	 * The number of operations of the '<em>Unreified Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREIFIED_RELATIONSHIP_OPERATION_COUNT = ENTITY_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.DatatypeImpl <em>Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.DatatypeImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getDatatype()
	 * @generated
	 */
	int DATATYPE = 25;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__UUID = TERM__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__TBOX = TERM__TBOX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__NAME = TERM__NAME;

	/**
	 * The number of structural features of the '<em>Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_FEATURE_COUNT = TERM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE___CALCULATE_UUID = TERM___CALCULATE_UUID;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE___IRI = TERM___IRI;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE___NAME = TERM___NAME;

	/**
	 * The number of operations of the '<em>Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_OPERATION_COUNT = TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.DataRangeImpl <em>Data Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.DataRangeImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getDataRange()
	 * @generated
	 */
	int DATA_RANGE = 26;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE__UUID = DATATYPE__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE__TBOX = DATATYPE__TBOX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE__NAME = DATATYPE__NAME;

	/**
	 * The number of structural features of the '<em>Data Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE___CALCULATE_UUID = DATATYPE___CALCULATE_UUID;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE___IRI = DATATYPE___IRI;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE___NAME = DATATYPE___NAME;

	/**
	 * The number of operations of the '<em>Data Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RANGE_OPERATION_COUNT = DATATYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.ScalarImpl <em>Scalar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.ScalarImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getScalar()
	 * @generated
	 */
	int SCALAR = 27;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR__UUID = DATA_RANGE__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR__TBOX = DATA_RANGE__TBOX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR__NAME = DATA_RANGE__NAME;

	/**
	 * The number of structural features of the '<em>Scalar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_FEATURE_COUNT = DATA_RANGE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR___CALCULATE_UUID = DATA_RANGE___CALCULATE_UUID;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR___IRI = DATA_RANGE___IRI;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR___NAME = DATA_RANGE___NAME;

	/**
	 * The number of operations of the '<em>Scalar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_OPERATION_COUNT = DATA_RANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.DataRelationshipImpl <em>Data Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.DataRelationshipImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getDataRelationship()
	 * @generated
	 */
	int DATA_RELATIONSHIP = 28;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP__UUID = TERM__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP__TBOX = TERM__TBOX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP__NAME = TERM__NAME;

	/**
	 * The number of structural features of the '<em>Data Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP_FEATURE_COUNT = TERM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP___CALCULATE_UUID = TERM___CALCULATE_UUID;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP___IRI = TERM___IRI;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP___NAME = TERM___NAME;

	/**
	 * The operation id for the '<em>Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP___SOURCE = TERM_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Relation Domain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP___RELATION_DOMAIN = TERM_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP___TARGET = TERM_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Relation Range</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP___RELATION_RANGE = TERM_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Data Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP_OPERATION_COUNT = TERM_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.DataRelationshipDomainImpl <em>Data Relationship Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.DataRelationshipDomainImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getDataRelationshipDomain()
	 * @generated
	 */
	int DATA_RELATIONSHIP_DOMAIN = 29;

	/**
	 * The number of structural features of the '<em>Data Relationship Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP_DOMAIN_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP_DOMAIN___CALCULATE_UUID = 0;

	/**
	 * The number of operations of the '<em>Data Relationship Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP_DOMAIN_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.DataRelationshipFromEntityImpl <em>Data Relationship From Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.DataRelationshipFromEntityImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getDataRelationshipFromEntity()
	 * @generated
	 */
	int DATA_RELATIONSHIP_FROM_ENTITY = 30;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP_FROM_ENTITY__DOMAIN = DATA_RELATIONSHIP_DOMAIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Identity Criteria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP_FROM_ENTITY__IS_IDENTITY_CRITERIA = DATA_RELATIONSHIP_DOMAIN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Relationship From Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP_FROM_ENTITY_FEATURE_COUNT = DATA_RELATIONSHIP_DOMAIN_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP_FROM_ENTITY___CALCULATE_UUID = DATA_RELATIONSHIP_DOMAIN___CALCULATE_UUID;

	/**
	 * The number of operations of the '<em>Data Relationship From Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP_FROM_ENTITY_OPERATION_COUNT = DATA_RELATIONSHIP_DOMAIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.DataRelationshipFromStructureImpl <em>Data Relationship From Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.DataRelationshipFromStructureImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getDataRelationshipFromStructure()
	 * @generated
	 */
	int DATA_RELATIONSHIP_FROM_STRUCTURE = 31;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP_FROM_STRUCTURE__DOMAIN = DATA_RELATIONSHIP_DOMAIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Relationship From Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP_FROM_STRUCTURE_FEATURE_COUNT = DATA_RELATIONSHIP_DOMAIN_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP_FROM_STRUCTURE___CALCULATE_UUID = DATA_RELATIONSHIP_DOMAIN___CALCULATE_UUID;

	/**
	 * The number of operations of the '<em>Data Relationship From Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP_FROM_STRUCTURE_OPERATION_COUNT = DATA_RELATIONSHIP_DOMAIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.DataRelationshipRangeImpl <em>Data Relationship Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.DataRelationshipRangeImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getDataRelationshipRange()
	 * @generated
	 */
	int DATA_RELATIONSHIP_RANGE = 32;

	/**
	 * The number of structural features of the '<em>Data Relationship Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP_RANGE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP_RANGE___CALCULATE_UUID = 0;

	/**
	 * The number of operations of the '<em>Data Relationship Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP_RANGE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.DataRelationshipToScalarImpl <em>Data Relationship To Scalar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.DataRelationshipToScalarImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getDataRelationshipToScalar()
	 * @generated
	 */
	int DATA_RELATIONSHIP_TO_SCALAR = 33;

	/**
	 * The feature id for the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP_TO_SCALAR__RANGE = DATA_RELATIONSHIP_RANGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Relationship To Scalar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP_TO_SCALAR_FEATURE_COUNT = DATA_RELATIONSHIP_RANGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP_TO_SCALAR___CALCULATE_UUID = DATA_RELATIONSHIP_RANGE___CALCULATE_UUID;

	/**
	 * The number of operations of the '<em>Data Relationship To Scalar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP_TO_SCALAR_OPERATION_COUNT = DATA_RELATIONSHIP_RANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.DataRelationshipToStructureImpl <em>Data Relationship To Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.DataRelationshipToStructureImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getDataRelationshipToStructure()
	 * @generated
	 */
	int DATA_RELATIONSHIP_TO_STRUCTURE = 34;

	/**
	 * The feature id for the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP_TO_STRUCTURE__RANGE = DATA_RELATIONSHIP_RANGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Relationship To Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP_TO_STRUCTURE_FEATURE_COUNT = DATA_RELATIONSHIP_RANGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP_TO_STRUCTURE___CALCULATE_UUID = DATA_RELATIONSHIP_RANGE___CALCULATE_UUID;

	/**
	 * The number of operations of the '<em>Data Relationship To Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RELATIONSHIP_TO_STRUCTURE_OPERATION_COUNT = DATA_RELATIONSHIP_RANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.EntityStructuredDataPropertyImpl <em>Entity Structured Data Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.EntityStructuredDataPropertyImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getEntityStructuredDataProperty()
	 * @generated
	 */
	int ENTITY_STRUCTURED_DATA_PROPERTY = 35;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_STRUCTURED_DATA_PROPERTY__UUID = DATA_RELATIONSHIP__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_STRUCTURED_DATA_PROPERTY__TBOX = DATA_RELATIONSHIP__TBOX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_STRUCTURED_DATA_PROPERTY__NAME = DATA_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_STRUCTURED_DATA_PROPERTY__DOMAIN = DATA_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Identity Criteria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_STRUCTURED_DATA_PROPERTY__IS_IDENTITY_CRITERIA = DATA_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_STRUCTURED_DATA_PROPERTY__RANGE = DATA_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entity Structured Data Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_STRUCTURED_DATA_PROPERTY_FEATURE_COUNT = DATA_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_STRUCTURED_DATA_PROPERTY___IRI = DATA_RELATIONSHIP___IRI;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_STRUCTURED_DATA_PROPERTY___NAME = DATA_RELATIONSHIP___NAME;

	/**
	 * The operation id for the '<em>Relation Domain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_STRUCTURED_DATA_PROPERTY___RELATION_DOMAIN = DATA_RELATIONSHIP___RELATION_DOMAIN;

	/**
	 * The operation id for the '<em>Relation Range</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_STRUCTURED_DATA_PROPERTY___RELATION_RANGE = DATA_RELATIONSHIP___RELATION_RANGE;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_STRUCTURED_DATA_PROPERTY___CALCULATE_UUID = DATA_RELATIONSHIP_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_STRUCTURED_DATA_PROPERTY___SOURCE = DATA_RELATIONSHIP_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_STRUCTURED_DATA_PROPERTY___TARGET = DATA_RELATIONSHIP_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Entity Structured Data Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_STRUCTURED_DATA_PROPERTY_OPERATION_COUNT = DATA_RELATIONSHIP_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.EntityScalarDataPropertyImpl <em>Entity Scalar Data Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.EntityScalarDataPropertyImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getEntityScalarDataProperty()
	 * @generated
	 */
	int ENTITY_SCALAR_DATA_PROPERTY = 36;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY__UUID = DATA_RELATIONSHIP__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY__TBOX = DATA_RELATIONSHIP__TBOX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY__NAME = DATA_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY__DOMAIN = DATA_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Identity Criteria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY__IS_IDENTITY_CRITERIA = DATA_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY__RANGE = DATA_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entity Scalar Data Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY_FEATURE_COUNT = DATA_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY___IRI = DATA_RELATIONSHIP___IRI;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY___NAME = DATA_RELATIONSHIP___NAME;

	/**
	 * The operation id for the '<em>Relation Domain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY___RELATION_DOMAIN = DATA_RELATIONSHIP___RELATION_DOMAIN;

	/**
	 * The operation id for the '<em>Relation Range</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY___RELATION_RANGE = DATA_RELATIONSHIP___RELATION_RANGE;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY___CALCULATE_UUID = DATA_RELATIONSHIP_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY___SOURCE = DATA_RELATIONSHIP_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY___TARGET = DATA_RELATIONSHIP_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Entity Scalar Data Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY_OPERATION_COUNT = DATA_RELATIONSHIP_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.StructuredDataPropertyImpl <em>Structured Data Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.StructuredDataPropertyImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getStructuredDataProperty()
	 * @generated
	 */
	int STRUCTURED_DATA_PROPERTY = 37;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_PROPERTY__UUID = DATA_RELATIONSHIP__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_PROPERTY__TBOX = DATA_RELATIONSHIP__TBOX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_PROPERTY__NAME = DATA_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_PROPERTY__DOMAIN = DATA_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_PROPERTY__RANGE = DATA_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Structured Data Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_PROPERTY_FEATURE_COUNT = DATA_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_PROPERTY___IRI = DATA_RELATIONSHIP___IRI;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_PROPERTY___NAME = DATA_RELATIONSHIP___NAME;

	/**
	 * The operation id for the '<em>Relation Domain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_PROPERTY___RELATION_DOMAIN = DATA_RELATIONSHIP___RELATION_DOMAIN;

	/**
	 * The operation id for the '<em>Relation Range</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_PROPERTY___RELATION_RANGE = DATA_RELATIONSHIP___RELATION_RANGE;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_PROPERTY___CALCULATE_UUID = DATA_RELATIONSHIP_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_PROPERTY___SOURCE = DATA_RELATIONSHIP_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_PROPERTY___TARGET = DATA_RELATIONSHIP_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Structured Data Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_PROPERTY_OPERATION_COUNT = DATA_RELATIONSHIP_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.ScalarDataPropertyImpl <em>Scalar Data Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.ScalarDataPropertyImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getScalarDataProperty()
	 * @generated
	 */
	int SCALAR_DATA_PROPERTY = 38;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_DATA_PROPERTY__UUID = DATA_RELATIONSHIP__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_DATA_PROPERTY__TBOX = DATA_RELATIONSHIP__TBOX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_DATA_PROPERTY__NAME = DATA_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_DATA_PROPERTY__DOMAIN = DATA_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_DATA_PROPERTY__RANGE = DATA_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Scalar Data Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_DATA_PROPERTY_FEATURE_COUNT = DATA_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_DATA_PROPERTY___IRI = DATA_RELATIONSHIP___IRI;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_DATA_PROPERTY___NAME = DATA_RELATIONSHIP___NAME;

	/**
	 * The operation id for the '<em>Relation Domain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_DATA_PROPERTY___RELATION_DOMAIN = DATA_RELATIONSHIP___RELATION_DOMAIN;

	/**
	 * The operation id for the '<em>Relation Range</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_DATA_PROPERTY___RELATION_RANGE = DATA_RELATIONSHIP___RELATION_RANGE;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_DATA_PROPERTY___CALCULATE_UUID = DATA_RELATIONSHIP_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_DATA_PROPERTY___SOURCE = DATA_RELATIONSHIP_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_DATA_PROPERTY___TARGET = DATA_RELATIONSHIP_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Scalar Data Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_DATA_PROPERTY_OPERATION_COUNT = DATA_RELATIONSHIP_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.StructureImpl <em>Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.StructureImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getStructure()
	 * @generated
	 */
	int STRUCTURE = 39;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__UUID = DATATYPE__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__TBOX = DATATYPE__TBOX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__NAME = DATATYPE__NAME;

	/**
	 * The number of structural features of the '<em>Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE___CALCULATE_UUID = DATATYPE___CALCULATE_UUID;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE___IRI = DATATYPE___IRI;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE___NAME = DATATYPE___NAME;

	/**
	 * The number of operations of the '<em>Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_OPERATION_COUNT = DATATYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.AxiomImpl <em>Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.AxiomImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getAxiom()
	 * @generated
	 */
	int AXIOM = 40;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIOM__UUID = TERMINOLOGY_BOX_STATEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIOM__TBOX = TERMINOLOGY_BOX_STATEMENT__TBOX;

	/**
	 * The number of structural features of the '<em>Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIOM_FEATURE_COUNT = TERMINOLOGY_BOX_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIOM___CALCULATE_UUID = TERMINOLOGY_BOX_STATEMENT___CALCULATE_UUID;

	/**
	 * The number of operations of the '<em>Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIOM_OPERATION_COUNT = TERMINOLOGY_BOX_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.TerminologyAxiomImpl <em>Terminology Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.TerminologyAxiomImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getTerminologyAxiom()
	 * @generated
	 */
	int TERMINOLOGY_AXIOM = 41;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_AXIOM__UUID = TERMINOLOGY_THING__UUID;

	/**
	 * The number of structural features of the '<em>Terminology Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_AXIOM_FEATURE_COUNT = TERMINOLOGY_THING_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_AXIOM___CALCULATE_UUID = TERMINOLOGY_THING___CALCULATE_UUID;

	/**
	 * The operation id for the '<em>Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_AXIOM___SOURCE = TERMINOLOGY_THING_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_AXIOM___TARGET = TERMINOLOGY_THING_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Terminology Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_AXIOM_OPERATION_COUNT = TERMINOLOGY_THING_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.TerminologyBoxAxiomImpl <em>Terminology Box Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.TerminologyBoxAxiomImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getTerminologyBoxAxiom()
	 * @generated
	 */
	int TERMINOLOGY_BOX_AXIOM = 42;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX_AXIOM__UUID = TERMINOLOGY_AXIOM__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX_AXIOM__TBOX = TERMINOLOGY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Terminology Box Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX_AXIOM_FEATURE_COUNT = TERMINOLOGY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX_AXIOM___CALCULATE_UUID = TERMINOLOGY_AXIOM___CALCULATE_UUID;

	/**
	 * The operation id for the '<em>Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX_AXIOM___SOURCE = TERMINOLOGY_AXIOM___SOURCE;

	/**
	 * The operation id for the '<em>Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX_AXIOM___TARGET = TERMINOLOGY_AXIOM___TARGET;

	/**
	 * The number of operations of the '<em>Terminology Box Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BOX_AXIOM_OPERATION_COUNT = TERMINOLOGY_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.TerminologyBundleAxiomImpl <em>Terminology Bundle Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.TerminologyBundleAxiomImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getTerminologyBundleAxiom()
	 * @generated
	 */
	int TERMINOLOGY_BUNDLE_AXIOM = 43;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BUNDLE_AXIOM__UUID = TERMINOLOGY_AXIOM__UUID;

	/**
	 * The feature id for the '<em><b>Terminology Bundle</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BUNDLE_AXIOM__TERMINOLOGY_BUNDLE = TERMINOLOGY_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Terminology Bundle Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BUNDLE_AXIOM_FEATURE_COUNT = TERMINOLOGY_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BUNDLE_AXIOM___CALCULATE_UUID = TERMINOLOGY_AXIOM___CALCULATE_UUID;

	/**
	 * The operation id for the '<em>Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BUNDLE_AXIOM___SOURCE = TERMINOLOGY_AXIOM___SOURCE;

	/**
	 * The operation id for the '<em>Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BUNDLE_AXIOM___TARGET = TERMINOLOGY_AXIOM___TARGET;

	/**
	 * The number of operations of the '<em>Terminology Bundle Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_BUNDLE_AXIOM_OPERATION_COUNT = TERMINOLOGY_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.ConceptTreeDisjunctionImpl <em>Concept Tree Disjunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.ConceptTreeDisjunctionImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getConceptTreeDisjunction()
	 * @generated
	 */
	int CONCEPT_TREE_DISJUNCTION = 44;

	/**
	 * The number of structural features of the '<em>Concept Tree Disjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_TREE_DISJUNCTION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_TREE_DISJUNCTION___CALCULATE_UUID = 0;

	/**
	 * The number of operations of the '<em>Concept Tree Disjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_TREE_DISJUNCTION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.DisjointUnionOfConceptsAxiomImpl <em>Disjoint Union Of Concepts Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.DisjointUnionOfConceptsAxiomImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getDisjointUnionOfConceptsAxiom()
	 * @generated
	 */
	int DISJOINT_UNION_OF_CONCEPTS_AXIOM = 45;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_UNION_OF_CONCEPTS_AXIOM__UUID = TERMINOLOGY_BUNDLE_STATEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Bundle</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_UNION_OF_CONCEPTS_AXIOM__BUNDLE = TERMINOLOGY_BUNDLE_STATEMENT__BUNDLE;

	/**
	 * The feature id for the '<em><b>Disjoint Taxonomy Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_UNION_OF_CONCEPTS_AXIOM__DISJOINT_TAXONOMY_PARENT = TERMINOLOGY_BUNDLE_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Disjoint Union Of Concepts Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_UNION_OF_CONCEPTS_AXIOM_FEATURE_COUNT = TERMINOLOGY_BUNDLE_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_UNION_OF_CONCEPTS_AXIOM___CALCULATE_UUID = TERMINOLOGY_BUNDLE_STATEMENT___CALCULATE_UUID;

	/**
	 * The number of operations of the '<em>Disjoint Union Of Concepts Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJOINT_UNION_OF_CONCEPTS_AXIOM_OPERATION_COUNT = TERMINOLOGY_BUNDLE_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.SpecificDisjointConceptAxiomImpl <em>Specific Disjoint Concept Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.SpecificDisjointConceptAxiomImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getSpecificDisjointConceptAxiom()
	 * @generated
	 */
	int SPECIFIC_DISJOINT_CONCEPT_AXIOM = 46;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_DISJOINT_CONCEPT_AXIOM__UUID = DISJOINT_UNION_OF_CONCEPTS_AXIOM__UUID;

	/**
	 * The feature id for the '<em><b>Bundle</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_DISJOINT_CONCEPT_AXIOM__BUNDLE = DISJOINT_UNION_OF_CONCEPTS_AXIOM__BUNDLE;

	/**
	 * The feature id for the '<em><b>Disjoint Taxonomy Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_DISJOINT_CONCEPT_AXIOM__DISJOINT_TAXONOMY_PARENT = DISJOINT_UNION_OF_CONCEPTS_AXIOM__DISJOINT_TAXONOMY_PARENT;

	/**
	 * The feature id for the '<em><b>Disjoint Leaf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_DISJOINT_CONCEPT_AXIOM__DISJOINT_LEAF = DISJOINT_UNION_OF_CONCEPTS_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Specific Disjoint Concept Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_DISJOINT_CONCEPT_AXIOM_FEATURE_COUNT = DISJOINT_UNION_OF_CONCEPTS_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_DISJOINT_CONCEPT_AXIOM___CALCULATE_UUID = DISJOINT_UNION_OF_CONCEPTS_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Specific Disjoint Concept Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_DISJOINT_CONCEPT_AXIOM_OPERATION_COUNT = DISJOINT_UNION_OF_CONCEPTS_AXIOM_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.AnonymousConceptTaxonomyAxiomImpl <em>Anonymous Concept Taxonomy Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.AnonymousConceptTaxonomyAxiomImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getAnonymousConceptTaxonomyAxiom()
	 * @generated
	 */
	int ANONYMOUS_CONCEPT_TAXONOMY_AXIOM = 47;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CONCEPT_TAXONOMY_AXIOM__UUID = DISJOINT_UNION_OF_CONCEPTS_AXIOM__UUID;

	/**
	 * The feature id for the '<em><b>Bundle</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CONCEPT_TAXONOMY_AXIOM__BUNDLE = DISJOINT_UNION_OF_CONCEPTS_AXIOM__BUNDLE;

	/**
	 * The feature id for the '<em><b>Disjoint Taxonomy Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CONCEPT_TAXONOMY_AXIOM__DISJOINT_TAXONOMY_PARENT = DISJOINT_UNION_OF_CONCEPTS_AXIOM__DISJOINT_TAXONOMY_PARENT;

	/**
	 * The number of structural features of the '<em>Anonymous Concept Taxonomy Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_FEATURE_COUNT = DISJOINT_UNION_OF_CONCEPTS_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CONCEPT_TAXONOMY_AXIOM___CALCULATE_UUID = DISJOINT_UNION_OF_CONCEPTS_AXIOM_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Anonymous Concept Taxonomy Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CONCEPT_TAXONOMY_AXIOM_OPERATION_COUNT = DISJOINT_UNION_OF_CONCEPTS_AXIOM_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.RootConceptTaxonomyAxiomImpl <em>Root Concept Taxonomy Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.RootConceptTaxonomyAxiomImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getRootConceptTaxonomyAxiom()
	 * @generated
	 */
	int ROOT_CONCEPT_TAXONOMY_AXIOM = 48;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONCEPT_TAXONOMY_AXIOM__UUID = TERMINOLOGY_BUNDLE_STATEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Bundle</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONCEPT_TAXONOMY_AXIOM__BUNDLE = TERMINOLOGY_BUNDLE_STATEMENT__BUNDLE;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONCEPT_TAXONOMY_AXIOM__ROOT = TERMINOLOGY_BUNDLE_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Concept Taxonomy Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONCEPT_TAXONOMY_AXIOM_FEATURE_COUNT = TERMINOLOGY_BUNDLE_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONCEPT_TAXONOMY_AXIOM___CALCULATE_UUID = TERMINOLOGY_BUNDLE_STATEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Concept Taxonomy Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONCEPT_TAXONOMY_AXIOM_OPERATION_COUNT = TERMINOLOGY_BUNDLE_STATEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.BundledTerminologyAxiomImpl <em>Bundled Terminology Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.BundledTerminologyAxiomImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getBundledTerminologyAxiom()
	 * @generated
	 */
	int BUNDLED_TERMINOLOGY_AXIOM = 49;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLED_TERMINOLOGY_AXIOM__UUID = TERMINOLOGY_BUNDLE_AXIOM__UUID;

	/**
	 * The feature id for the '<em><b>Terminology Bundle</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLED_TERMINOLOGY_AXIOM__TERMINOLOGY_BUNDLE = TERMINOLOGY_BUNDLE_AXIOM__TERMINOLOGY_BUNDLE;

	/**
	 * The feature id for the '<em><b>Bundled Terminology</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLED_TERMINOLOGY_AXIOM__BUNDLED_TERMINOLOGY = TERMINOLOGY_BUNDLE_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bundled Terminology Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLED_TERMINOLOGY_AXIOM_FEATURE_COUNT = TERMINOLOGY_BUNDLE_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLED_TERMINOLOGY_AXIOM___CALCULATE_UUID = TERMINOLOGY_BUNDLE_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLED_TERMINOLOGY_AXIOM___SOURCE = TERMINOLOGY_BUNDLE_AXIOM_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLED_TERMINOLOGY_AXIOM___TARGET = TERMINOLOGY_BUNDLE_AXIOM_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bundled Terminology Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLED_TERMINOLOGY_AXIOM_OPERATION_COUNT = TERMINOLOGY_BUNDLE_AXIOM_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.ConceptDesignationTerminologyAxiomImpl <em>Concept Designation Terminology Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.ConceptDesignationTerminologyAxiomImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getConceptDesignationTerminologyAxiom()
	 * @generated
	 */
	int CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM = 50;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM__UUID = TERMINOLOGY_BOX_AXIOM__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM__TBOX = TERMINOLOGY_BOX_AXIOM__TBOX;

	/**
	 * The feature id for the '<em><b>Designated Terminology</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM__DESIGNATED_TERMINOLOGY = TERMINOLOGY_BOX_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Designated Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM__DESIGNATED_CONCEPT = TERMINOLOGY_BOX_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Concept Designation Terminology Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_FEATURE_COUNT = TERMINOLOGY_BOX_AXIOM_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM___CALCULATE_UUID = TERMINOLOGY_BOX_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Designation Terminology Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM___DESIGNATION_TERMINOLOGY_GRAPH = TERMINOLOGY_BOX_AXIOM_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM___SOURCE = TERMINOLOGY_BOX_AXIOM_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM___TARGET = TERMINOLOGY_BOX_AXIOM_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Concept Designation Terminology Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM_OPERATION_COUNT = TERMINOLOGY_BOX_AXIOM_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.TerminologyExtensionAxiomImpl <em>Terminology Extension Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.TerminologyExtensionAxiomImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getTerminologyExtensionAxiom()
	 * @generated
	 */
	int TERMINOLOGY_EXTENSION_AXIOM = 51;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_EXTENSION_AXIOM__UUID = TERMINOLOGY_BOX_AXIOM__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_EXTENSION_AXIOM__TBOX = TERMINOLOGY_BOX_AXIOM__TBOX;

	/**
	 * The feature id for the '<em><b>Extended Terminology</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_EXTENSION_AXIOM__EXTENDED_TERMINOLOGY = TERMINOLOGY_BOX_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Terminology Extension Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_EXTENSION_AXIOM_FEATURE_COUNT = TERMINOLOGY_BOX_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_EXTENSION_AXIOM___CALCULATE_UUID = TERMINOLOGY_BOX_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Extending Terminology</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_EXTENSION_AXIOM___EXTENDING_TERMINOLOGY = TERMINOLOGY_BOX_AXIOM_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_EXTENSION_AXIOM___SOURCE = TERMINOLOGY_BOX_AXIOM_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_EXTENSION_AXIOM___TARGET = TERMINOLOGY_BOX_AXIOM_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Terminology Extension Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_EXTENSION_AXIOM_OPERATION_COUNT = TERMINOLOGY_BOX_AXIOM_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.TerminologyNestingAxiomImpl <em>Terminology Nesting Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.TerminologyNestingAxiomImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getTerminologyNestingAxiom()
	 * @generated
	 */
	int TERMINOLOGY_NESTING_AXIOM = 52;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_NESTING_AXIOM__UUID = TERMINOLOGY_BOX_AXIOM__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_NESTING_AXIOM__TBOX = TERMINOLOGY_BOX_AXIOM__TBOX;

	/**
	 * The feature id for the '<em><b>Nesting Terminology</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_NESTING_AXIOM__NESTING_TERMINOLOGY = TERMINOLOGY_BOX_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nesting Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_NESTING_AXIOM__NESTING_CONTEXT = TERMINOLOGY_BOX_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Terminology Nesting Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_NESTING_AXIOM_FEATURE_COUNT = TERMINOLOGY_BOX_AXIOM_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_NESTING_AXIOM___CALCULATE_UUID = TERMINOLOGY_BOX_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Nested Terminology</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_NESTING_AXIOM___NESTED_TERMINOLOGY = TERMINOLOGY_BOX_AXIOM_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_NESTING_AXIOM___SOURCE = TERMINOLOGY_BOX_AXIOM_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_NESTING_AXIOM___TARGET = TERMINOLOGY_BOX_AXIOM_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Terminology Nesting Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_NESTING_AXIOM_OPERATION_COUNT = TERMINOLOGY_BOX_AXIOM_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.TermAxiomImpl <em>Term Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.TermAxiomImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getTermAxiom()
	 * @generated
	 */
	int TERM_AXIOM = 53;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_AXIOM__UUID = AXIOM__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_AXIOM__TBOX = AXIOM__TBOX;

	/**
	 * The number of structural features of the '<em>Term Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_AXIOM_FEATURE_COUNT = AXIOM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_AXIOM___CALCULATE_UUID = AXIOM___CALCULATE_UUID;

	/**
	 * The number of operations of the '<em>Term Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_AXIOM_OPERATION_COUNT = AXIOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.EntityRestrictionAxiomImpl <em>Entity Restriction Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.EntityRestrictionAxiomImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getEntityRestrictionAxiom()
	 * @generated
	 */
	int ENTITY_RESTRICTION_AXIOM = 54;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RESTRICTION_AXIOM__UUID = TERM_AXIOM__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RESTRICTION_AXIOM__TBOX = TERM_AXIOM__TBOX;

	/**
	 * The feature id for the '<em><b>Restricted Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RESTRICTION_AXIOM__RESTRICTED_RELATION = TERM_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Restricted Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RESTRICTION_AXIOM__RESTRICTED_RANGE = TERM_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Restricted Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RESTRICTION_AXIOM__RESTRICTED_DOMAIN = TERM_AXIOM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entity Restriction Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RESTRICTION_AXIOM_FEATURE_COUNT = TERM_AXIOM_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RESTRICTION_AXIOM___CALCULATE_UUID = TERM_AXIOM___CALCULATE_UUID;

	/**
	 * The number of operations of the '<em>Entity Restriction Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RESTRICTION_AXIOM_OPERATION_COUNT = TERM_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.EntityExistentialRestrictionAxiomImpl <em>Entity Existential Restriction Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.EntityExistentialRestrictionAxiomImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getEntityExistentialRestrictionAxiom()
	 * @generated
	 */
	int ENTITY_EXISTENTIAL_RESTRICTION_AXIOM = 55;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_EXISTENTIAL_RESTRICTION_AXIOM__UUID = ENTITY_RESTRICTION_AXIOM__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_EXISTENTIAL_RESTRICTION_AXIOM__TBOX = ENTITY_RESTRICTION_AXIOM__TBOX;

	/**
	 * The feature id for the '<em><b>Restricted Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_EXISTENTIAL_RESTRICTION_AXIOM__RESTRICTED_RELATION = ENTITY_RESTRICTION_AXIOM__RESTRICTED_RELATION;

	/**
	 * The feature id for the '<em><b>Restricted Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_EXISTENTIAL_RESTRICTION_AXIOM__RESTRICTED_RANGE = ENTITY_RESTRICTION_AXIOM__RESTRICTED_RANGE;

	/**
	 * The feature id for the '<em><b>Restricted Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_EXISTENTIAL_RESTRICTION_AXIOM__RESTRICTED_DOMAIN = ENTITY_RESTRICTION_AXIOM__RESTRICTED_DOMAIN;

	/**
	 * The number of structural features of the '<em>Entity Existential Restriction Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_FEATURE_COUNT = ENTITY_RESTRICTION_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_EXISTENTIAL_RESTRICTION_AXIOM___CALCULATE_UUID = ENTITY_RESTRICTION_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entity Existential Restriction Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_EXISTENTIAL_RESTRICTION_AXIOM_OPERATION_COUNT = ENTITY_RESTRICTION_AXIOM_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.EntityUniversalRestrictionAxiomImpl <em>Entity Universal Restriction Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.EntityUniversalRestrictionAxiomImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getEntityUniversalRestrictionAxiom()
	 * @generated
	 */
	int ENTITY_UNIVERSAL_RESTRICTION_AXIOM = 56;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_UNIVERSAL_RESTRICTION_AXIOM__UUID = ENTITY_RESTRICTION_AXIOM__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_UNIVERSAL_RESTRICTION_AXIOM__TBOX = ENTITY_RESTRICTION_AXIOM__TBOX;

	/**
	 * The feature id for the '<em><b>Restricted Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_UNIVERSAL_RESTRICTION_AXIOM__RESTRICTED_RELATION = ENTITY_RESTRICTION_AXIOM__RESTRICTED_RELATION;

	/**
	 * The feature id for the '<em><b>Restricted Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_UNIVERSAL_RESTRICTION_AXIOM__RESTRICTED_RANGE = ENTITY_RESTRICTION_AXIOM__RESTRICTED_RANGE;

	/**
	 * The feature id for the '<em><b>Restricted Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_UNIVERSAL_RESTRICTION_AXIOM__RESTRICTED_DOMAIN = ENTITY_RESTRICTION_AXIOM__RESTRICTED_DOMAIN;

	/**
	 * The number of structural features of the '<em>Entity Universal Restriction Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_UNIVERSAL_RESTRICTION_AXIOM_FEATURE_COUNT = ENTITY_RESTRICTION_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_UNIVERSAL_RESTRICTION_AXIOM___CALCULATE_UUID = ENTITY_RESTRICTION_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entity Universal Restriction Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_UNIVERSAL_RESTRICTION_AXIOM_OPERATION_COUNT = ENTITY_RESTRICTION_AXIOM_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.SpecializationAxiomImpl <em>Specialization Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.SpecializationAxiomImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getSpecializationAxiom()
	 * @generated
	 */
	int SPECIALIZATION_AXIOM = 57;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_AXIOM__UUID = TERM_AXIOM__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_AXIOM__TBOX = TERM_AXIOM__TBOX;

	/**
	 * The number of structural features of the '<em>Specialization Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_AXIOM_FEATURE_COUNT = TERM_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_AXIOM___CALCULATE_UUID = TERM_AXIOM___CALCULATE_UUID;

	/**
	 * The operation id for the '<em>Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_AXIOM___CHILD = TERM_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_AXIOM___PARENT = TERM_AXIOM_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Specialization Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_AXIOM_OPERATION_COUNT = TERM_AXIOM_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.AspectSpecializationAxiomImpl <em>Aspect Specialization Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.AspectSpecializationAxiomImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getAspectSpecializationAxiom()
	 * @generated
	 */
	int ASPECT_SPECIALIZATION_AXIOM = 58;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_SPECIALIZATION_AXIOM__UUID = SPECIALIZATION_AXIOM__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_SPECIALIZATION_AXIOM__TBOX = SPECIALIZATION_AXIOM__TBOX;

	/**
	 * The feature id for the '<em><b>Sub Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_SPECIALIZATION_AXIOM__SUB_ENTITY = SPECIALIZATION_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Aspect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_SPECIALIZATION_AXIOM__SUPER_ASPECT = SPECIALIZATION_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Aspect Specialization Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_SPECIALIZATION_AXIOM_FEATURE_COUNT = SPECIALIZATION_AXIOM_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_SPECIALIZATION_AXIOM___CALCULATE_UUID = SPECIALIZATION_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_SPECIALIZATION_AXIOM___CHILD = SPECIALIZATION_AXIOM_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_SPECIALIZATION_AXIOM___PARENT = SPECIALIZATION_AXIOM_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Aspect Specialization Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_SPECIALIZATION_AXIOM_OPERATION_COUNT = SPECIALIZATION_AXIOM_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.ConceptSpecializationAxiomImpl <em>Concept Specialization Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.ConceptSpecializationAxiomImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getConceptSpecializationAxiom()
	 * @generated
	 */
	int CONCEPT_SPECIALIZATION_AXIOM = 59;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_SPECIALIZATION_AXIOM__UUID = SPECIALIZATION_AXIOM__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_SPECIALIZATION_AXIOM__TBOX = SPECIALIZATION_AXIOM__TBOX;

	/**
	 * The feature id for the '<em><b>Sub Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_SPECIALIZATION_AXIOM__SUB_CONCEPT = SPECIALIZATION_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_SPECIALIZATION_AXIOM__SUPER_CONCEPT = SPECIALIZATION_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Concept Specialization Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_SPECIALIZATION_AXIOM_FEATURE_COUNT = SPECIALIZATION_AXIOM_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_SPECIALIZATION_AXIOM___CALCULATE_UUID = SPECIALIZATION_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_SPECIALIZATION_AXIOM___CHILD = SPECIALIZATION_AXIOM_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_SPECIALIZATION_AXIOM___PARENT = SPECIALIZATION_AXIOM_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Concept Specialization Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_SPECIALIZATION_AXIOM_OPERATION_COUNT = SPECIALIZATION_AXIOM_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.ReifiedRelationshipSpecializationAxiomImpl <em>Reified Relationship Specialization Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.ReifiedRelationshipSpecializationAxiomImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getReifiedRelationshipSpecializationAxiom()
	 * @generated
	 */
	int REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM = 60;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM__UUID = SPECIALIZATION_AXIOM__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM__TBOX = SPECIALIZATION_AXIOM__TBOX;

	/**
	 * The feature id for the '<em><b>Sub Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM__SUB_RELATIONSHIP = SPECIALIZATION_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM__SUPER_RELATIONSHIP = SPECIALIZATION_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reified Relationship Specialization Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_FEATURE_COUNT = SPECIALIZATION_AXIOM_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM___CALCULATE_UUID = SPECIALIZATION_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM___CHILD = SPECIALIZATION_AXIOM_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM___PARENT = SPECIALIZATION_AXIOM_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Reified Relationship Specialization Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM_OPERATION_COUNT = SPECIALIZATION_AXIOM_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.EntityScalarDataPropertyRestrictionAxiomImpl <em>Entity Scalar Data Property Restriction Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.EntityScalarDataPropertyRestrictionAxiomImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getEntityScalarDataPropertyRestrictionAxiom()
	 * @generated
	 */
	int ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM = 61;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__UUID = TERM_AXIOM__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__TBOX = TERM_AXIOM__TBOX;

	/**
	 * The feature id for the '<em><b>Restricted Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__RESTRICTED_ENTITY = TERM_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scalar Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__SCALAR_PROPERTY = TERM_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entity Scalar Data Property Restriction Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM_FEATURE_COUNT = TERM_AXIOM_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM___CALCULATE_UUID = TERM_AXIOM___CALCULATE_UUID;

	/**
	 * The number of operations of the '<em>Entity Scalar Data Property Restriction Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM_OPERATION_COUNT = TERM_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.EntityScalarDataPropertyExistentialRestrictionAxiomImpl <em>Entity Scalar Data Property Existential Restriction Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.EntityScalarDataPropertyExistentialRestrictionAxiomImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getEntityScalarDataPropertyExistentialRestrictionAxiom()
	 * @generated
	 */
	int ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM = 62;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM__UUID = ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM__TBOX = ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__TBOX;

	/**
	 * The feature id for the '<em><b>Restricted Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM__RESTRICTED_ENTITY = ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__RESTRICTED_ENTITY;

	/**
	 * The feature id for the '<em><b>Scalar Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM__SCALAR_PROPERTY = ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__SCALAR_PROPERTY;

	/**
	 * The feature id for the '<em><b>Scalar Restriction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM__SCALAR_RESTRICTION = ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity Scalar Data Property Existential Restriction Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_FEATURE_COUNT = ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM___CALCULATE_UUID = ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entity Scalar Data Property Existential Restriction Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM_OPERATION_COUNT = ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.EntityScalarDataPropertyUniversalRestrictionAxiomImpl <em>Entity Scalar Data Property Universal Restriction Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.EntityScalarDataPropertyUniversalRestrictionAxiomImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getEntityScalarDataPropertyUniversalRestrictionAxiom()
	 * @generated
	 */
	int ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM = 63;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM__UUID = ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM__TBOX = ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__TBOX;

	/**
	 * The feature id for the '<em><b>Restricted Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM__RESTRICTED_ENTITY = ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__RESTRICTED_ENTITY;

	/**
	 * The feature id for the '<em><b>Scalar Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM__SCALAR_PROPERTY = ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__SCALAR_PROPERTY;

	/**
	 * The feature id for the '<em><b>Scalar Restriction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM__SCALAR_RESTRICTION = ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity Scalar Data Property Universal Restriction Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_FEATURE_COUNT = ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM___CALCULATE_UUID = ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entity Scalar Data Property Universal Restriction Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM_OPERATION_COUNT = ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.EntityScalarDataPropertyParticularRestrictionAxiomImpl <em>Entity Scalar Data Property Particular Restriction Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.EntityScalarDataPropertyParticularRestrictionAxiomImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getEntityScalarDataPropertyParticularRestrictionAxiom()
	 * @generated
	 */
	int ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM = 64;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM__UUID = ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM__TBOX = ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__TBOX;

	/**
	 * The feature id for the '<em><b>Restricted Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM__RESTRICTED_ENTITY = ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__RESTRICTED_ENTITY;

	/**
	 * The feature id for the '<em><b>Scalar Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM__SCALAR_PROPERTY = ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM__SCALAR_PROPERTY;

	/**
	 * The feature id for the '<em><b>Literal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM__LITERAL_VALUE = ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity Scalar Data Property Particular Restriction Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_FEATURE_COUNT = ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM___CALCULATE_UUID = ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entity Scalar Data Property Particular Restriction Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM_OPERATION_COUNT = ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.RestrictedDataRangeImpl <em>Restricted Data Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.RestrictedDataRangeImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getRestrictedDataRange()
	 * @generated
	 */
	int RESTRICTED_DATA_RANGE = 65;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTED_DATA_RANGE__UUID = DATA_RANGE__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTED_DATA_RANGE__TBOX = DATA_RANGE__TBOX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTED_DATA_RANGE__NAME = DATA_RANGE__NAME;

	/**
	 * The feature id for the '<em><b>Restricted Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTED_DATA_RANGE__RESTRICTED_RANGE = DATA_RANGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Restricted Data Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTED_DATA_RANGE_FEATURE_COUNT = DATA_RANGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTED_DATA_RANGE___CALCULATE_UUID = DATA_RANGE___CALCULATE_UUID;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTED_DATA_RANGE___IRI = DATA_RANGE___IRI;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTED_DATA_RANGE___NAME = DATA_RANGE___NAME;

	/**
	 * The number of operations of the '<em>Restricted Data Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTED_DATA_RANGE_OPERATION_COUNT = DATA_RANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.BinaryScalarRestrictionImpl <em>Binary Scalar Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.BinaryScalarRestrictionImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getBinaryScalarRestriction()
	 * @generated
	 */
	int BINARY_SCALAR_RESTRICTION = 66;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SCALAR_RESTRICTION__UUID = RESTRICTED_DATA_RANGE__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SCALAR_RESTRICTION__TBOX = RESTRICTED_DATA_RANGE__TBOX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SCALAR_RESTRICTION__NAME = RESTRICTED_DATA_RANGE__NAME;

	/**
	 * The feature id for the '<em><b>Restricted Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SCALAR_RESTRICTION__RESTRICTED_RANGE = RESTRICTED_DATA_RANGE__RESTRICTED_RANGE;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SCALAR_RESTRICTION__LENGTH = RESTRICTED_DATA_RANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SCALAR_RESTRICTION__MIN_LENGTH = RESTRICTED_DATA_RANGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SCALAR_RESTRICTION__MAX_LENGTH = RESTRICTED_DATA_RANGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Scalar Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SCALAR_RESTRICTION_FEATURE_COUNT = RESTRICTED_DATA_RANGE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SCALAR_RESTRICTION___IRI = RESTRICTED_DATA_RANGE___IRI;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SCALAR_RESTRICTION___NAME = RESTRICTED_DATA_RANGE___NAME;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SCALAR_RESTRICTION___CALCULATE_UUID = RESTRICTED_DATA_RANGE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Binary Scalar Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SCALAR_RESTRICTION_OPERATION_COUNT = RESTRICTED_DATA_RANGE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.IRIScalarRestrictionImpl <em>IRI Scalar Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.IRIScalarRestrictionImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getIRIScalarRestriction()
	 * @generated
	 */
	int IRI_SCALAR_RESTRICTION = 67;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_SCALAR_RESTRICTION__UUID = RESTRICTED_DATA_RANGE__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_SCALAR_RESTRICTION__TBOX = RESTRICTED_DATA_RANGE__TBOX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_SCALAR_RESTRICTION__NAME = RESTRICTED_DATA_RANGE__NAME;

	/**
	 * The feature id for the '<em><b>Restricted Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_SCALAR_RESTRICTION__RESTRICTED_RANGE = RESTRICTED_DATA_RANGE__RESTRICTED_RANGE;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_SCALAR_RESTRICTION__LENGTH = RESTRICTED_DATA_RANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_SCALAR_RESTRICTION__MIN_LENGTH = RESTRICTED_DATA_RANGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_SCALAR_RESTRICTION__MAX_LENGTH = RESTRICTED_DATA_RANGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_SCALAR_RESTRICTION__PATTERN = RESTRICTED_DATA_RANGE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>IRI Scalar Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_SCALAR_RESTRICTION_FEATURE_COUNT = RESTRICTED_DATA_RANGE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_SCALAR_RESTRICTION___IRI = RESTRICTED_DATA_RANGE___IRI;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_SCALAR_RESTRICTION___NAME = RESTRICTED_DATA_RANGE___NAME;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_SCALAR_RESTRICTION___CALCULATE_UUID = RESTRICTED_DATA_RANGE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>IRI Scalar Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRI_SCALAR_RESTRICTION_OPERATION_COUNT = RESTRICTED_DATA_RANGE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.NumericScalarRestrictionImpl <em>Numeric Scalar Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.NumericScalarRestrictionImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getNumericScalarRestriction()
	 * @generated
	 */
	int NUMERIC_SCALAR_RESTRICTION = 68;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_SCALAR_RESTRICTION__UUID = RESTRICTED_DATA_RANGE__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_SCALAR_RESTRICTION__TBOX = RESTRICTED_DATA_RANGE__TBOX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_SCALAR_RESTRICTION__NAME = RESTRICTED_DATA_RANGE__NAME;

	/**
	 * The feature id for the '<em><b>Restricted Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_SCALAR_RESTRICTION__RESTRICTED_RANGE = RESTRICTED_DATA_RANGE__RESTRICTED_RANGE;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_SCALAR_RESTRICTION__MIN_INCLUSIVE = RESTRICTED_DATA_RANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_SCALAR_RESTRICTION__MAX_INCLUSIVE = RESTRICTED_DATA_RANGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_SCALAR_RESTRICTION__MIN_EXCLUSIVE = RESTRICTED_DATA_RANGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_SCALAR_RESTRICTION__MAX_EXCLUSIVE = RESTRICTED_DATA_RANGE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Numeric Scalar Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_SCALAR_RESTRICTION_FEATURE_COUNT = RESTRICTED_DATA_RANGE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_SCALAR_RESTRICTION___IRI = RESTRICTED_DATA_RANGE___IRI;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_SCALAR_RESTRICTION___NAME = RESTRICTED_DATA_RANGE___NAME;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_SCALAR_RESTRICTION___CALCULATE_UUID = RESTRICTED_DATA_RANGE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Numeric Scalar Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_SCALAR_RESTRICTION_OPERATION_COUNT = RESTRICTED_DATA_RANGE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.PlainLiteralScalarRestrictionImpl <em>Plain Literal Scalar Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.PlainLiteralScalarRestrictionImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getPlainLiteralScalarRestriction()
	 * @generated
	 */
	int PLAIN_LITERAL_SCALAR_RESTRICTION = 69;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_LITERAL_SCALAR_RESTRICTION__UUID = RESTRICTED_DATA_RANGE__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_LITERAL_SCALAR_RESTRICTION__TBOX = RESTRICTED_DATA_RANGE__TBOX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_LITERAL_SCALAR_RESTRICTION__NAME = RESTRICTED_DATA_RANGE__NAME;

	/**
	 * The feature id for the '<em><b>Restricted Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_LITERAL_SCALAR_RESTRICTION__RESTRICTED_RANGE = RESTRICTED_DATA_RANGE__RESTRICTED_RANGE;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_LITERAL_SCALAR_RESTRICTION__LENGTH = RESTRICTED_DATA_RANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_LITERAL_SCALAR_RESTRICTION__MIN_LENGTH = RESTRICTED_DATA_RANGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_LITERAL_SCALAR_RESTRICTION__MAX_LENGTH = RESTRICTED_DATA_RANGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_LITERAL_SCALAR_RESTRICTION__PATTERN = RESTRICTED_DATA_RANGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_LITERAL_SCALAR_RESTRICTION__LANG_RANGE = RESTRICTED_DATA_RANGE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Plain Literal Scalar Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_LITERAL_SCALAR_RESTRICTION_FEATURE_COUNT = RESTRICTED_DATA_RANGE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_LITERAL_SCALAR_RESTRICTION___IRI = RESTRICTED_DATA_RANGE___IRI;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_LITERAL_SCALAR_RESTRICTION___NAME = RESTRICTED_DATA_RANGE___NAME;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_LITERAL_SCALAR_RESTRICTION___CALCULATE_UUID = RESTRICTED_DATA_RANGE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Plain Literal Scalar Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_LITERAL_SCALAR_RESTRICTION_OPERATION_COUNT = RESTRICTED_DATA_RANGE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.StringScalarRestrictionImpl <em>String Scalar Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.StringScalarRestrictionImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getStringScalarRestriction()
	 * @generated
	 */
	int STRING_SCALAR_RESTRICTION = 70;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCALAR_RESTRICTION__UUID = RESTRICTED_DATA_RANGE__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCALAR_RESTRICTION__TBOX = RESTRICTED_DATA_RANGE__TBOX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCALAR_RESTRICTION__NAME = RESTRICTED_DATA_RANGE__NAME;

	/**
	 * The feature id for the '<em><b>Restricted Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCALAR_RESTRICTION__RESTRICTED_RANGE = RESTRICTED_DATA_RANGE__RESTRICTED_RANGE;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCALAR_RESTRICTION__LENGTH = RESTRICTED_DATA_RANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCALAR_RESTRICTION__MIN_LENGTH = RESTRICTED_DATA_RANGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCALAR_RESTRICTION__MAX_LENGTH = RESTRICTED_DATA_RANGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCALAR_RESTRICTION__PATTERN = RESTRICTED_DATA_RANGE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>String Scalar Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCALAR_RESTRICTION_FEATURE_COUNT = RESTRICTED_DATA_RANGE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCALAR_RESTRICTION___IRI = RESTRICTED_DATA_RANGE___IRI;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCALAR_RESTRICTION___NAME = RESTRICTED_DATA_RANGE___NAME;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCALAR_RESTRICTION___CALCULATE_UUID = RESTRICTED_DATA_RANGE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>String Scalar Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCALAR_RESTRICTION_OPERATION_COUNT = RESTRICTED_DATA_RANGE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.TimeScalarRestrictionImpl <em>Time Scalar Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.TimeScalarRestrictionImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getTimeScalarRestriction()
	 * @generated
	 */
	int TIME_SCALAR_RESTRICTION = 71;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCALAR_RESTRICTION__UUID = RESTRICTED_DATA_RANGE__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCALAR_RESTRICTION__TBOX = RESTRICTED_DATA_RANGE__TBOX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCALAR_RESTRICTION__NAME = RESTRICTED_DATA_RANGE__NAME;

	/**
	 * The feature id for the '<em><b>Restricted Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCALAR_RESTRICTION__RESTRICTED_RANGE = RESTRICTED_DATA_RANGE__RESTRICTED_RANGE;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCALAR_RESTRICTION__MIN_INCLUSIVE = RESTRICTED_DATA_RANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCALAR_RESTRICTION__MAX_INCLUSIVE = RESTRICTED_DATA_RANGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCALAR_RESTRICTION__MIN_EXCLUSIVE = RESTRICTED_DATA_RANGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCALAR_RESTRICTION__MAX_EXCLUSIVE = RESTRICTED_DATA_RANGE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Time Scalar Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCALAR_RESTRICTION_FEATURE_COUNT = RESTRICTED_DATA_RANGE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCALAR_RESTRICTION___IRI = RESTRICTED_DATA_RANGE___IRI;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCALAR_RESTRICTION___NAME = RESTRICTED_DATA_RANGE___NAME;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCALAR_RESTRICTION___CALCULATE_UUID = RESTRICTED_DATA_RANGE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time Scalar Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SCALAR_RESTRICTION_OPERATION_COUNT = RESTRICTED_DATA_RANGE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.SynonymScalarRestrictionImpl <em>Synonym Scalar Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.SynonymScalarRestrictionImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getSynonymScalarRestriction()
	 * @generated
	 */
	int SYNONYM_SCALAR_RESTRICTION = 72;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYM_SCALAR_RESTRICTION__UUID = RESTRICTED_DATA_RANGE__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYM_SCALAR_RESTRICTION__TBOX = RESTRICTED_DATA_RANGE__TBOX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYM_SCALAR_RESTRICTION__NAME = RESTRICTED_DATA_RANGE__NAME;

	/**
	 * The feature id for the '<em><b>Restricted Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYM_SCALAR_RESTRICTION__RESTRICTED_RANGE = RESTRICTED_DATA_RANGE__RESTRICTED_RANGE;

	/**
	 * The number of structural features of the '<em>Synonym Scalar Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYM_SCALAR_RESTRICTION_FEATURE_COUNT = RESTRICTED_DATA_RANGE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYM_SCALAR_RESTRICTION___IRI = RESTRICTED_DATA_RANGE___IRI;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYM_SCALAR_RESTRICTION___NAME = RESTRICTED_DATA_RANGE___NAME;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYM_SCALAR_RESTRICTION___CALCULATE_UUID = RESTRICTED_DATA_RANGE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Synonym Scalar Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYM_SCALAR_RESTRICTION_OPERATION_COUNT = RESTRICTED_DATA_RANGE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.ScalarOneOfRestrictionImpl <em>Scalar One Of Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.ScalarOneOfRestrictionImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getScalarOneOfRestriction()
	 * @generated
	 */
	int SCALAR_ONE_OF_RESTRICTION = 73;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_ONE_OF_RESTRICTION__UUID = RESTRICTED_DATA_RANGE__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_ONE_OF_RESTRICTION__TBOX = RESTRICTED_DATA_RANGE__TBOX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_ONE_OF_RESTRICTION__NAME = RESTRICTED_DATA_RANGE__NAME;

	/**
	 * The feature id for the '<em><b>Restricted Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_ONE_OF_RESTRICTION__RESTRICTED_RANGE = RESTRICTED_DATA_RANGE__RESTRICTED_RANGE;

	/**
	 * The number of structural features of the '<em>Scalar One Of Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_ONE_OF_RESTRICTION_FEATURE_COUNT = RESTRICTED_DATA_RANGE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_ONE_OF_RESTRICTION___IRI = RESTRICTED_DATA_RANGE___IRI;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_ONE_OF_RESTRICTION___NAME = RESTRICTED_DATA_RANGE___NAME;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_ONE_OF_RESTRICTION___CALCULATE_UUID = RESTRICTED_DATA_RANGE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scalar One Of Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_ONE_OF_RESTRICTION_OPERATION_COUNT = RESTRICTED_DATA_RANGE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.ScalarOneOfLiteralAxiomImpl <em>Scalar One Of Literal Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.ScalarOneOfLiteralAxiomImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getScalarOneOfLiteralAxiom()
	 * @generated
	 */
	int SCALAR_ONE_OF_LITERAL_AXIOM = 74;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_ONE_OF_LITERAL_AXIOM__UUID = AXIOM__UUID;

	/**
	 * The feature id for the '<em><b>Tbox</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_ONE_OF_LITERAL_AXIOM__TBOX = AXIOM__TBOX;

	/**
	 * The feature id for the '<em><b>Axiom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_ONE_OF_LITERAL_AXIOM__AXIOM = AXIOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_ONE_OF_LITERAL_AXIOM__VALUE = AXIOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Scalar One Of Literal Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_ONE_OF_LITERAL_AXIOM_FEATURE_COUNT = AXIOM_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_ONE_OF_LITERAL_AXIOM___CALCULATE_UUID = AXIOM_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scalar One Of Literal Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_ONE_OF_LITERAL_AXIOM_OPERATION_COUNT = AXIOM_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.DescriptionBoxImpl <em>Description Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.DescriptionBoxImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getDescriptionBox()
	 * @generated
	 */
	int DESCRIPTION_BOX = 75;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX__UUID = MODULE__UUID;

	/**
	 * The feature id for the '<em><b>Iri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX__IRI = MODULE__IRI;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX__ANNOTATIONS = MODULE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX__KIND = MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description Extent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX__DESCRIPTION_EXTENT = MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Closed World Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX__CLOSED_WORLD_DEFINITIONS = MODULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description Box Refinements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX__DESCRIPTION_BOX_REFINEMENTS = MODULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Concept Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX__CONCEPT_INSTANCES = MODULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Reified Relationship Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCES = MODULE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Reified Relationship Instance Domains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCE_DOMAINS = MODULE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Reified Relationship Instance Ranges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX__REIFIED_RELATIONSHIP_INSTANCE_RANGES = MODULE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Unreified Relationship Instance Tuples</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX__UNREIFIED_RELATIONSHIP_INSTANCE_TUPLES = MODULE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Description Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX_FEATURE_COUNT = MODULE_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX___CALCULATE_UUID = MODULE___CALCULATE_UUID;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX___IRI = MODULE___IRI;

	/**
	 * The operation id for the '<em>Ns Prefix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX___NS_PREFIX = MODULE___NS_PREFIX;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX___NAME = MODULE___NAME;

	/**
	 * The operation id for the '<em>Annotations By Subject</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX___ANNOTATIONS_BY_SUBJECT = MODULE___ANNOTATIONS_BY_SUBJECT;

	/**
	 * The operation id for the '<em>With Annotations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX___WITH_ANNOTATIONS__EMAP = MODULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Annotations By Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX___ANNOTATIONS_BY_PROPERTY = MODULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Extent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX___EXTENT = MODULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Entities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX___ENTITIES = MODULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Aspects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX___ASPECTS = MODULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Concepts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX___CONCEPTS = MODULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Reified Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX___REIFIED_RELATIONSHIPS = MODULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Unreified Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX___UNREIFIED_RELATIONSHIPS = MODULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Data Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX___DATA_RELATIONSHIPS = MODULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Entity Scalar Data Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX___ENTITY_SCALAR_DATA_PROPERTIES = MODULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Dataranges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX___DATARANGES = MODULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Scalars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX___SCALARS = MODULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Structures</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX___STRUCTURES = MODULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Term Axioms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX___TERM_AXIOMS = MODULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Everything</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX___EVERYTHING = MODULE_OPERATION_COUNT + 14;

	/**
	 * The number of operations of the '<em>Description Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX_OPERATION_COUNT = MODULE_OPERATION_COUNT + 15;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.DescriptionBoxRelationshipImpl <em>Description Box Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.DescriptionBoxRelationshipImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getDescriptionBoxRelationship()
	 * @generated
	 */
	int DESCRIPTION_BOX_RELATIONSHIP = 76;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX_RELATIONSHIP__UUID = TERMINOLOGY_THING__UUID;

	/**
	 * The number of structural features of the '<em>Description Box Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX_RELATIONSHIP_FEATURE_COUNT = TERMINOLOGY_THING_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX_RELATIONSHIP___CALCULATE_UUID = TERMINOLOGY_THING___CALCULATE_UUID;

	/**
	 * The operation id for the '<em>Description Domain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX_RELATIONSHIP___DESCRIPTION_DOMAIN = TERMINOLOGY_THING_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Target Module</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX_RELATIONSHIP___TARGET_MODULE = TERMINOLOGY_THING_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Description Box Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX_RELATIONSHIP_OPERATION_COUNT = TERMINOLOGY_THING_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.DescriptionBoxExtendsClosedWorldDefinitionsImpl <em>Description Box Extends Closed World Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.DescriptionBoxExtendsClosedWorldDefinitionsImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getDescriptionBoxExtendsClosedWorldDefinitions()
	 * @generated
	 */
	int DESCRIPTION_BOX_EXTENDS_CLOSED_WORLD_DEFINITIONS = 77;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX_EXTENDS_CLOSED_WORLD_DEFINITIONS__UUID = DESCRIPTION_BOX_RELATIONSHIP__UUID;

	/**
	 * The feature id for the '<em><b>Description Box</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX_EXTENDS_CLOSED_WORLD_DEFINITIONS__DESCRIPTION_BOX = DESCRIPTION_BOX_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Closed World Definitions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX_EXTENDS_CLOSED_WORLD_DEFINITIONS__CLOSED_WORLD_DEFINITIONS = DESCRIPTION_BOX_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Description Box Extends Closed World Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX_EXTENDS_CLOSED_WORLD_DEFINITIONS_FEATURE_COUNT = DESCRIPTION_BOX_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX_EXTENDS_CLOSED_WORLD_DEFINITIONS___CALCULATE_UUID = DESCRIPTION_BOX_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Description Domain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX_EXTENDS_CLOSED_WORLD_DEFINITIONS___DESCRIPTION_DOMAIN = DESCRIPTION_BOX_RELATIONSHIP_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Target Module</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX_EXTENDS_CLOSED_WORLD_DEFINITIONS___TARGET_MODULE = DESCRIPTION_BOX_RELATIONSHIP_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Description Box Extends Closed World Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX_EXTENDS_CLOSED_WORLD_DEFINITIONS_OPERATION_COUNT = DESCRIPTION_BOX_RELATIONSHIP_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.DescriptionBoxRefinementImpl <em>Description Box Refinement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.DescriptionBoxRefinementImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getDescriptionBoxRefinement()
	 * @generated
	 */
	int DESCRIPTION_BOX_REFINEMENT = 78;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX_REFINEMENT__UUID = DESCRIPTION_BOX_RELATIONSHIP__UUID;

	/**
	 * The feature id for the '<em><b>Refining Description Box</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX_REFINEMENT__REFINING_DESCRIPTION_BOX = DESCRIPTION_BOX_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refined Description Box</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX_REFINEMENT__REFINED_DESCRIPTION_BOX = DESCRIPTION_BOX_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Description Box Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX_REFINEMENT_FEATURE_COUNT = DESCRIPTION_BOX_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX_REFINEMENT___CALCULATE_UUID = DESCRIPTION_BOX_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Description Domain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX_REFINEMENT___DESCRIPTION_DOMAIN = DESCRIPTION_BOX_RELATIONSHIP_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Target Module</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX_REFINEMENT___TARGET_MODULE = DESCRIPTION_BOX_RELATIONSHIP_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Description Box Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_BOX_REFINEMENT_OPERATION_COUNT = DESCRIPTION_BOX_RELATIONSHIP_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.TerminologyInstanceAssertionImpl <em>Terminology Instance Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.TerminologyInstanceAssertionImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getTerminologyInstanceAssertion()
	 * @generated
	 */
	int TERMINOLOGY_INSTANCE_ASSERTION = 79;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_INSTANCE_ASSERTION__UUID = TERMINOLOGY_THING__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_INSTANCE_ASSERTION__NAME = TERMINOLOGY_THING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Terminology Instance Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_INSTANCE_ASSERTION_FEATURE_COUNT = TERMINOLOGY_THING_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Description Box</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_INSTANCE_ASSERTION___DESCRIPTION_BOX = TERMINOLOGY_THING_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_INSTANCE_ASSERTION___CALCULATE_UUID = TERMINOLOGY_THING_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_INSTANCE_ASSERTION___IRI = TERMINOLOGY_THING_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_INSTANCE_ASSERTION___NAME = TERMINOLOGY_THING_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Terminology Instance Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_INSTANCE_ASSERTION_OPERATION_COUNT = TERMINOLOGY_THING_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.SingletonInstanceImpl <em>Singleton Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.SingletonInstanceImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getSingletonInstance()
	 * @generated
	 */
	int SINGLETON_INSTANCE = 80;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_INSTANCE__UUID = TERMINOLOGY_INSTANCE_ASSERTION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_INSTANCE__NAME = TERMINOLOGY_INSTANCE_ASSERTION__NAME;

	/**
	 * The feature id for the '<em><b>Scalar Data Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_INSTANCE__SCALAR_DATA_PROPERTY_VALUES = TERMINOLOGY_INSTANCE_ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Structured Data Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_INSTANCE__STRUCTURED_DATA_PROPERTY_VALUES = TERMINOLOGY_INSTANCE_ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Singleton Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_INSTANCE_FEATURE_COUNT = TERMINOLOGY_INSTANCE_ASSERTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Description Box</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_INSTANCE___DESCRIPTION_BOX = TERMINOLOGY_INSTANCE_ASSERTION___DESCRIPTION_BOX;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_INSTANCE___CALCULATE_UUID = TERMINOLOGY_INSTANCE_ASSERTION___CALCULATE_UUID;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_INSTANCE___IRI = TERMINOLOGY_INSTANCE_ASSERTION___IRI;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_INSTANCE___NAME = TERMINOLOGY_INSTANCE_ASSERTION___NAME;

	/**
	 * The number of operations of the '<em>Singleton Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_INSTANCE_OPERATION_COUNT = TERMINOLOGY_INSTANCE_ASSERTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.ScalarDataPropertyValueImpl <em>Scalar Data Property Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.ScalarDataPropertyValueImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getScalarDataPropertyValue()
	 * @generated
	 */
	int SCALAR_DATA_PROPERTY_VALUE = 81;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_DATA_PROPERTY_VALUE__UUID = TERMINOLOGY_INSTANCE_ASSERTION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_DATA_PROPERTY_VALUE__NAME = TERMINOLOGY_INSTANCE_ASSERTION__NAME;

	/**
	 * The feature id for the '<em><b>Singleton Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_DATA_PROPERTY_VALUE__SINGLETON_INSTANCE = TERMINOLOGY_INSTANCE_ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scalar Data Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_DATA_PROPERTY_VALUE__SCALAR_DATA_PROPERTY = TERMINOLOGY_INSTANCE_ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scalar Property Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_DATA_PROPERTY_VALUE__SCALAR_PROPERTY_VALUE = TERMINOLOGY_INSTANCE_ASSERTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Scalar Data Property Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_DATA_PROPERTY_VALUE_FEATURE_COUNT = TERMINOLOGY_INSTANCE_ASSERTION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_DATA_PROPERTY_VALUE___IRI = TERMINOLOGY_INSTANCE_ASSERTION___IRI;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_DATA_PROPERTY_VALUE___NAME = TERMINOLOGY_INSTANCE_ASSERTION___NAME;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_DATA_PROPERTY_VALUE___CALCULATE_UUID = TERMINOLOGY_INSTANCE_ASSERTION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Description Box</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_DATA_PROPERTY_VALUE___DESCRIPTION_BOX = TERMINOLOGY_INSTANCE_ASSERTION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Scalar Data Property Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_DATA_PROPERTY_VALUE_OPERATION_COUNT = TERMINOLOGY_INSTANCE_ASSERTION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.StructuredDataPropertyValueImpl <em>Structured Data Property Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.StructuredDataPropertyValueImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getStructuredDataPropertyValue()
	 * @generated
	 */
	int STRUCTURED_DATA_PROPERTY_VALUE = 82;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_PROPERTY_VALUE__UUID = TERMINOLOGY_INSTANCE_ASSERTION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_PROPERTY_VALUE__NAME = TERMINOLOGY_INSTANCE_ASSERTION__NAME;

	/**
	 * The feature id for the '<em><b>Singleton Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_PROPERTY_VALUE__SINGLETON_INSTANCE = TERMINOLOGY_INSTANCE_ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Structured Data Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_PROPERTY_VALUE__STRUCTURED_DATA_PROPERTY = TERMINOLOGY_INSTANCE_ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Structured Property Tuple</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_PROPERTY_VALUE__STRUCTURED_PROPERTY_TUPLE = TERMINOLOGY_INSTANCE_ASSERTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Structured Data Property Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_PROPERTY_VALUE_FEATURE_COUNT = TERMINOLOGY_INSTANCE_ASSERTION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_PROPERTY_VALUE___IRI = TERMINOLOGY_INSTANCE_ASSERTION___IRI;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_PROPERTY_VALUE___NAME = TERMINOLOGY_INSTANCE_ASSERTION___NAME;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_PROPERTY_VALUE___CALCULATE_UUID = TERMINOLOGY_INSTANCE_ASSERTION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Description Box</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_PROPERTY_VALUE___DESCRIPTION_BOX = TERMINOLOGY_INSTANCE_ASSERTION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Structured Data Property Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_PROPERTY_VALUE_OPERATION_COUNT = TERMINOLOGY_INSTANCE_ASSERTION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.DataStructureTupleImpl <em>Data Structure Tuple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.DataStructureTupleImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getDataStructureTuple()
	 * @generated
	 */
	int DATA_STRUCTURE_TUPLE = 83;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE_TUPLE__UUID = SINGLETON_INSTANCE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE_TUPLE__NAME = SINGLETON_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Scalar Data Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE_TUPLE__SCALAR_DATA_PROPERTY_VALUES = SINGLETON_INSTANCE__SCALAR_DATA_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Structured Data Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE_TUPLE__STRUCTURED_DATA_PROPERTY_VALUES = SINGLETON_INSTANCE__STRUCTURED_DATA_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Structured Data Property Value</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE_TUPLE__STRUCTURED_DATA_PROPERTY_VALUE = SINGLETON_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Structure Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE_TUPLE__DATA_STRUCTURE_TYPE = SINGLETON_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Structure Tuple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE_TUPLE_FEATURE_COUNT = SINGLETON_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE_TUPLE___IRI = SINGLETON_INSTANCE___IRI;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE_TUPLE___NAME = SINGLETON_INSTANCE___NAME;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE_TUPLE___CALCULATE_UUID = SINGLETON_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Description Box</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE_TUPLE___DESCRIPTION_BOX = SINGLETON_INSTANCE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Structure Tuple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE_TUPLE_OPERATION_COUNT = SINGLETON_INSTANCE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.ConceptualEntitySingletonInstanceImpl <em>Conceptual Entity Singleton Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.ConceptualEntitySingletonInstanceImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getConceptualEntitySingletonInstance()
	 * @generated
	 */
	int CONCEPTUAL_ENTITY_SINGLETON_INSTANCE = 84;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ENTITY_SINGLETON_INSTANCE__UUID = SINGLETON_INSTANCE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ENTITY_SINGLETON_INSTANCE__NAME = SINGLETON_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Scalar Data Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ENTITY_SINGLETON_INSTANCE__SCALAR_DATA_PROPERTY_VALUES = SINGLETON_INSTANCE__SCALAR_DATA_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Structured Data Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ENTITY_SINGLETON_INSTANCE__STRUCTURED_DATA_PROPERTY_VALUES = SINGLETON_INSTANCE__STRUCTURED_DATA_PROPERTY_VALUES;

	/**
	 * The number of structural features of the '<em>Conceptual Entity Singleton Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ENTITY_SINGLETON_INSTANCE_FEATURE_COUNT = SINGLETON_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Description Box</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ENTITY_SINGLETON_INSTANCE___DESCRIPTION_BOX = SINGLETON_INSTANCE___DESCRIPTION_BOX;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ENTITY_SINGLETON_INSTANCE___CALCULATE_UUID = SINGLETON_INSTANCE___CALCULATE_UUID;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ENTITY_SINGLETON_INSTANCE___IRI = SINGLETON_INSTANCE___IRI;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ENTITY_SINGLETON_INSTANCE___NAME = SINGLETON_INSTANCE___NAME;

	/**
	 * The operation id for the '<em>Conceptual Entity Singleton Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ENTITY_SINGLETON_INSTANCE___CONCEPTUAL_ENTITY_SINGLETON_CLASSIFIER = SINGLETON_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Identifying Scalar Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ENTITY_SINGLETON_INSTANCE___IDENTIFYING_SCALAR_VALUES = SINGLETON_INSTANCE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Identifying Structured Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ENTITY_SINGLETON_INSTANCE___IDENTIFYING_STRUCTURED_TUPLES = SINGLETON_INSTANCE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Conceptual Entity Singleton Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_ENTITY_SINGLETON_INSTANCE_OPERATION_COUNT = SINGLETON_INSTANCE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.ConceptInstanceImpl <em>Concept Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.ConceptInstanceImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getConceptInstance()
	 * @generated
	 */
	int CONCEPT_INSTANCE = 85;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_INSTANCE__UUID = CONCEPTUAL_ENTITY_SINGLETON_INSTANCE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_INSTANCE__NAME = CONCEPTUAL_ENTITY_SINGLETON_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Scalar Data Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_INSTANCE__SCALAR_DATA_PROPERTY_VALUES = CONCEPTUAL_ENTITY_SINGLETON_INSTANCE__SCALAR_DATA_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Structured Data Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_INSTANCE__STRUCTURED_DATA_PROPERTY_VALUES = CONCEPTUAL_ENTITY_SINGLETON_INSTANCE__STRUCTURED_DATA_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Description Box</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_INSTANCE__DESCRIPTION_BOX = CONCEPTUAL_ENTITY_SINGLETON_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Singleton Concept Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_INSTANCE__SINGLETON_CONCEPT_CLASSIFIER = CONCEPTUAL_ENTITY_SINGLETON_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Concept Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_INSTANCE_FEATURE_COUNT = CONCEPTUAL_ENTITY_SINGLETON_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Description Box</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_INSTANCE___DESCRIPTION_BOX = CONCEPTUAL_ENTITY_SINGLETON_INSTANCE___DESCRIPTION_BOX;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_INSTANCE___IRI = CONCEPTUAL_ENTITY_SINGLETON_INSTANCE___IRI;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_INSTANCE___NAME = CONCEPTUAL_ENTITY_SINGLETON_INSTANCE___NAME;

	/**
	 * The operation id for the '<em>Identifying Scalar Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_INSTANCE___IDENTIFYING_SCALAR_VALUES = CONCEPTUAL_ENTITY_SINGLETON_INSTANCE___IDENTIFYING_SCALAR_VALUES;

	/**
	 * The operation id for the '<em>Identifying Structured Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_INSTANCE___IDENTIFYING_STRUCTURED_TUPLES = CONCEPTUAL_ENTITY_SINGLETON_INSTANCE___IDENTIFYING_STRUCTURED_TUPLES;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_INSTANCE___CALCULATE_UUID = CONCEPTUAL_ENTITY_SINGLETON_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Conceptual Entity Singleton Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_INSTANCE___CONCEPTUAL_ENTITY_SINGLETON_CLASSIFIER = CONCEPTUAL_ENTITY_SINGLETON_INSTANCE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Concept Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_INSTANCE_OPERATION_COUNT = CONCEPTUAL_ENTITY_SINGLETON_INSTANCE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.ReifiedRelationshipInstanceImpl <em>Reified Relationship Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.ReifiedRelationshipInstanceImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getReifiedRelationshipInstance()
	 * @generated
	 */
	int REIFIED_RELATIONSHIP_INSTANCE = 86;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_INSTANCE__UUID = CONCEPTUAL_ENTITY_SINGLETON_INSTANCE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_INSTANCE__NAME = CONCEPTUAL_ENTITY_SINGLETON_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Scalar Data Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_INSTANCE__SCALAR_DATA_PROPERTY_VALUES = CONCEPTUAL_ENTITY_SINGLETON_INSTANCE__SCALAR_DATA_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Structured Data Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_INSTANCE__STRUCTURED_DATA_PROPERTY_VALUES = CONCEPTUAL_ENTITY_SINGLETON_INSTANCE__STRUCTURED_DATA_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Description Box</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_INSTANCE__DESCRIPTION_BOX = CONCEPTUAL_ENTITY_SINGLETON_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Singleton Reified Relationship Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_INSTANCE__SINGLETON_REIFIED_RELATIONSHIP_CLASSIFIER = CONCEPTUAL_ENTITY_SINGLETON_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reified Relationship Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_INSTANCE_FEATURE_COUNT = CONCEPTUAL_ENTITY_SINGLETON_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Description Box</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_INSTANCE___DESCRIPTION_BOX = CONCEPTUAL_ENTITY_SINGLETON_INSTANCE___DESCRIPTION_BOX;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_INSTANCE___IRI = CONCEPTUAL_ENTITY_SINGLETON_INSTANCE___IRI;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_INSTANCE___NAME = CONCEPTUAL_ENTITY_SINGLETON_INSTANCE___NAME;

	/**
	 * The operation id for the '<em>Identifying Scalar Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_INSTANCE___IDENTIFYING_SCALAR_VALUES = CONCEPTUAL_ENTITY_SINGLETON_INSTANCE___IDENTIFYING_SCALAR_VALUES;

	/**
	 * The operation id for the '<em>Identifying Structured Tuples</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_INSTANCE___IDENTIFYING_STRUCTURED_TUPLES = CONCEPTUAL_ENTITY_SINGLETON_INSTANCE___IDENTIFYING_STRUCTURED_TUPLES;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_INSTANCE___CALCULATE_UUID = CONCEPTUAL_ENTITY_SINGLETON_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Conceptual Entity Singleton Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_INSTANCE___CONCEPTUAL_ENTITY_SINGLETON_CLASSIFIER = CONCEPTUAL_ENTITY_SINGLETON_INSTANCE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reified Relationship Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_INSTANCE_OPERATION_COUNT = CONCEPTUAL_ENTITY_SINGLETON_INSTANCE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.ReifiedRelationshipInstanceDomainImpl <em>Reified Relationship Instance Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.ReifiedRelationshipInstanceDomainImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getReifiedRelationshipInstanceDomain()
	 * @generated
	 */
	int REIFIED_RELATIONSHIP_INSTANCE_DOMAIN = 87;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_INSTANCE_DOMAIN__UUID = TERMINOLOGY_INSTANCE_ASSERTION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_INSTANCE_DOMAIN__NAME = TERMINOLOGY_INSTANCE_ASSERTION__NAME;

	/**
	 * The feature id for the '<em><b>Description Box</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_INSTANCE_DOMAIN__DESCRIPTION_BOX = TERMINOLOGY_INSTANCE_ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reified Relationship Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_INSTANCE_DOMAIN__REIFIED_RELATIONSHIP_INSTANCE = TERMINOLOGY_INSTANCE_ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_INSTANCE_DOMAIN__DOMAIN = TERMINOLOGY_INSTANCE_ASSERTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reified Relationship Instance Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_INSTANCE_DOMAIN_FEATURE_COUNT = TERMINOLOGY_INSTANCE_ASSERTION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Description Box</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_INSTANCE_DOMAIN___DESCRIPTION_BOX = TERMINOLOGY_INSTANCE_ASSERTION___DESCRIPTION_BOX;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_INSTANCE_DOMAIN___IRI = TERMINOLOGY_INSTANCE_ASSERTION___IRI;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_INSTANCE_DOMAIN___NAME = TERMINOLOGY_INSTANCE_ASSERTION___NAME;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_INSTANCE_DOMAIN___CALCULATE_UUID = TERMINOLOGY_INSTANCE_ASSERTION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reified Relationship Instance Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_INSTANCE_DOMAIN_OPERATION_COUNT = TERMINOLOGY_INSTANCE_ASSERTION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.ReifiedRelationshipInstanceRangeImpl <em>Reified Relationship Instance Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.ReifiedRelationshipInstanceRangeImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getReifiedRelationshipInstanceRange()
	 * @generated
	 */
	int REIFIED_RELATIONSHIP_INSTANCE_RANGE = 88;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_INSTANCE_RANGE__UUID = TERMINOLOGY_INSTANCE_ASSERTION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_INSTANCE_RANGE__NAME = TERMINOLOGY_INSTANCE_ASSERTION__NAME;

	/**
	 * The feature id for the '<em><b>Description Box</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_INSTANCE_RANGE__DESCRIPTION_BOX = TERMINOLOGY_INSTANCE_ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reified Relationship Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_INSTANCE_RANGE__REIFIED_RELATIONSHIP_INSTANCE = TERMINOLOGY_INSTANCE_ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_INSTANCE_RANGE__RANGE = TERMINOLOGY_INSTANCE_ASSERTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reified Relationship Instance Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_INSTANCE_RANGE_FEATURE_COUNT = TERMINOLOGY_INSTANCE_ASSERTION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Description Box</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_INSTANCE_RANGE___DESCRIPTION_BOX = TERMINOLOGY_INSTANCE_ASSERTION___DESCRIPTION_BOX;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_INSTANCE_RANGE___IRI = TERMINOLOGY_INSTANCE_ASSERTION___IRI;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_INSTANCE_RANGE___NAME = TERMINOLOGY_INSTANCE_ASSERTION___NAME;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_INSTANCE_RANGE___CALCULATE_UUID = TERMINOLOGY_INSTANCE_ASSERTION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reified Relationship Instance Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFIED_RELATIONSHIP_INSTANCE_RANGE_OPERATION_COUNT = TERMINOLOGY_INSTANCE_ASSERTION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.impl.UnreifiedRelationshipInstanceTupleImpl <em>Unreified Relationship Instance Tuple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.impl.UnreifiedRelationshipInstanceTupleImpl
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getUnreifiedRelationshipInstanceTuple()
	 * @generated
	 */
	int UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE = 89;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__UUID = TERMINOLOGY_INSTANCE_ASSERTION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__NAME = TERMINOLOGY_INSTANCE_ASSERTION__NAME;

	/**
	 * The feature id for the '<em><b>Description Box</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__DESCRIPTION_BOX = TERMINOLOGY_INSTANCE_ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unreified Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__UNREIFIED_RELATIONSHIP = TERMINOLOGY_INSTANCE_ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__DOMAIN = TERMINOLOGY_INSTANCE_ASSERTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE__RANGE = TERMINOLOGY_INSTANCE_ASSERTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Unreified Relationship Instance Tuple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE_FEATURE_COUNT = TERMINOLOGY_INSTANCE_ASSERTION_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Description Box</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE___DESCRIPTION_BOX = TERMINOLOGY_INSTANCE_ASSERTION___DESCRIPTION_BOX;

	/**
	 * The operation id for the '<em>Iri</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE___IRI = TERMINOLOGY_INSTANCE_ASSERTION___IRI;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE___NAME = TERMINOLOGY_INSTANCE_ASSERTION___NAME;

	/**
	 * The operation id for the '<em>Calculate UUID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE___CALCULATE_UUID = TERMINOLOGY_INSTANCE_ASSERTION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unreified Relationship Instance Tuple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREIFIED_RELATIONSHIP_INSTANCE_TUPLE_OPERATION_COUNT = TERMINOLOGY_INSTANCE_ASSERTION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.TerminologyGraphKind <em>Terminology Graph Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.TerminologyGraphKind
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getTerminologyGraphKind()
	 * @generated
	 */
	int TERMINOLOGY_GRAPH_KIND = 90;

	/**
	 * The meta object id for the '{@link jpl.imce.oml.specification.ecore.DescriptionKind <em>Description Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jpl.imce.oml.specification.ecore.DescriptionKind
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getDescriptionKind()
	 * @generated
	 */
	int DESCRIPTION_KIND = 91;

	/**
	 * The meta object id for the '<em>IRI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getIRI()
	 * @generated
	 */
	int IRI = 92;

	/**
	 * The meta object id for the '<em>Local Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getLocalName()
	 * @generated
	 */
	int LOCAL_NAME = 93;

	/**
	 * The meta object id for the '<em>Lexical Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getLexicalValue()
	 * @generated
	 */
	int LEXICAL_VALUE = 94;

	/**
	 * The meta object id for the '<em>Lexical Number</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getLexicalNumber()
	 * @generated
	 */
	int LEXICAL_NUMBER = 95;

	/**
	 * The meta object id for the '<em>Lexical Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getLexicalTime()
	 * @generated
	 */
	int LEXICAL_TIME = 96;

	/**
	 * The meta object id for the '<em>Pattern</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getPattern()
	 * @generated
	 */
	int PATTERN = 97;

	/**
	 * The meta object id for the '<em>UUID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getUUID()
	 * @generated
	 */
	int UUID = 98;

	/**
	 * The meta object id for the '<em>Lang Range</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getLangRange()
	 * @generated
	 */
	int LANG_RANGE = 99;

	/**
	 * The meta object id for the '<em>Abbrev IRI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getAbbrevIRI()
	 * @generated
	 */
	int ABBREV_IRI = 100;

	/**
	 * The meta object id for the '<em>Namespace Prefix</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see jpl.imce.oml.specification.ecore.impl.OMLPackageImpl#getNamespacePrefix()
	 * @generated
	 */
	int NAMESPACE_PREFIX = 101;


	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see jpl.imce.oml.specification.ecore.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.Resource#iri() <em>Iri</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Iri</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.Resource#iri()
	 * @generated
	 */
	EOperation getResource__Iri();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.Resource#name() <em>Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Name</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.Resource#name()
	 * @generated
	 */
	EOperation getResource__Name();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.TerminologyThing <em>Terminology Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminology Thing</em>'.
	 * @see jpl.imce.oml.specification.ecore.TerminologyThing
	 * @generated
	 */
	EClass getTerminologyThing();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.TerminologyThing#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see jpl.imce.oml.specification.ecore.TerminologyThing#getUuid()
	 * @see #getTerminologyThing()
	 * @generated
	 */
	EAttribute getTerminologyThing_Uuid();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.TerminologyThing#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.TerminologyThing#calculateUUID()
	 * @generated
	 */
	EOperation getTerminologyThing__CalculateUUID();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.AnnotationProperty <em>Annotation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Property</em>'.
	 * @see jpl.imce.oml.specification.ecore.AnnotationProperty
	 * @generated
	 */
	EClass getAnnotationProperty();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.AnnotationProperty#getIri <em>Iri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iri</em>'.
	 * @see jpl.imce.oml.specification.ecore.AnnotationProperty#getIri()
	 * @see #getAnnotationProperty()
	 * @generated
	 */
	EAttribute getAnnotationProperty_Iri();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.AnnotationProperty#getAbbrevIRI <em>Abbrev IRI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abbrev IRI</em>'.
	 * @see jpl.imce.oml.specification.ecore.AnnotationProperty#getAbbrevIRI()
	 * @see #getAnnotationProperty()
	 * @generated
	 */
	EAttribute getAnnotationProperty_AbbrevIRI();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.AnnotationProperty#uuid() <em>Uuid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Uuid</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.AnnotationProperty#uuid()
	 * @generated
	 */
	EOperation getAnnotationProperty__Uuid();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Annotation Property Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Property Table</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="jpl.imce.oml.specification.ecore.AnnotationProperty" keyRequired="true"
	 *        valueType="jpl.imce.oml.specification.ecore.AnnotationEntry" valueContainment="true" valueMany="true"
	 *        valueAnnotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EClass getAnnotationPropertyTable();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getAnnotationPropertyTable()
	 * @generated
	 */
	EReference getAnnotationPropertyTable_Key();

	/**
	 * Returns the meta object for the containment reference list '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getAnnotationPropertyTable()
	 * @generated
	 */
	EReference getAnnotationPropertyTable_Value();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.AnnotationEntry <em>Annotation Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Entry</em>'.
	 * @see jpl.imce.oml.specification.ecore.AnnotationEntry
	 * @generated
	 */
	EClass getAnnotationEntry();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.AnnotationEntry#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module</em>'.
	 * @see jpl.imce.oml.specification.ecore.AnnotationEntry#getModule()
	 * @see #getAnnotationEntry()
	 * @generated
	 */
	EReference getAnnotationEntry_Module();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.AnnotationEntry#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subject</em>'.
	 * @see jpl.imce.oml.specification.ecore.AnnotationEntry#getSubject()
	 * @see #getAnnotationEntry()
	 * @generated
	 */
	EReference getAnnotationEntry_Subject();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.AnnotationEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see jpl.imce.oml.specification.ecore.AnnotationEntry#getValue()
	 * @see #getAnnotationEntry()
	 * @generated
	 */
	EAttribute getAnnotationEntry_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Annotation Subject Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Subject Table</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="jpl.imce.oml.specification.ecore.TerminologyThing" keyRequired="true"
	 *        valueType="jpl.imce.oml.specification.ecore.AnnotationSubjectPropertyValue" valueContainment="true" valueMany="true"
	 * @generated
	 */
	EClass getAnnotationSubjectTable();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getAnnotationSubjectTable()
	 * @generated
	 */
	EReference getAnnotationSubjectTable_Key();

	/**
	 * Returns the meta object for the containment reference list '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getAnnotationSubjectTable()
	 * @generated
	 */
	EReference getAnnotationSubjectTable_Value();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.AnnotationSubjectPropertyValue <em>Annotation Subject Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Subject Property Value</em>'.
	 * @see jpl.imce.oml.specification.ecore.AnnotationSubjectPropertyValue
	 * @generated
	 */
	EClass getAnnotationSubjectPropertyValue();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.AnnotationSubjectPropertyValue#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see jpl.imce.oml.specification.ecore.AnnotationSubjectPropertyValue#getProperty()
	 * @see #getAnnotationSubjectPropertyValue()
	 * @generated
	 */
	EReference getAnnotationSubjectPropertyValue_Property();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.AnnotationSubjectPropertyValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see jpl.imce.oml.specification.ecore.AnnotationSubjectPropertyValue#getValue()
	 * @see #getAnnotationSubjectPropertyValue()
	 * @generated
	 */
	EAttribute getAnnotationSubjectPropertyValue_Value();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see jpl.imce.oml.specification.ecore.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the container reference '{@link jpl.imce.oml.specification.ecore.Annotation#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Module</em>'.
	 * @see jpl.imce.oml.specification.ecore.Annotation#getModule()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Module();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.Annotation#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see jpl.imce.oml.specification.ecore.Annotation#getProperty()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Property();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.Annotation#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subject</em>'.
	 * @see jpl.imce.oml.specification.ecore.Annotation#getSubject()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Subject();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.Annotation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see jpl.imce.oml.specification.ecore.Annotation#getValue()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Value();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.TerminologyExtent <em>Terminology Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminology Extent</em>'.
	 * @see jpl.imce.oml.specification.ecore.TerminologyExtent
	 * @generated
	 */
	EClass getTerminologyExtent();

	/**
	 * Returns the meta object for the containment reference list '{@link jpl.imce.oml.specification.ecore.TerminologyExtent#getAnnotationProperties <em>Annotation Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation Properties</em>'.
	 * @see jpl.imce.oml.specification.ecore.TerminologyExtent#getAnnotationProperties()
	 * @see #getTerminologyExtent()
	 * @generated
	 */
	EReference getTerminologyExtent_AnnotationProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link jpl.imce.oml.specification.ecore.TerminologyExtent#getTerminologyGraphs <em>Terminology Graphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terminology Graphs</em>'.
	 * @see jpl.imce.oml.specification.ecore.TerminologyExtent#getTerminologyGraphs()
	 * @see #getTerminologyExtent()
	 * @generated
	 */
	EReference getTerminologyExtent_TerminologyGraphs();

	/**
	 * Returns the meta object for the containment reference list '{@link jpl.imce.oml.specification.ecore.TerminologyExtent#getBundles <em>Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bundles</em>'.
	 * @see jpl.imce.oml.specification.ecore.TerminologyExtent#getBundles()
	 * @see #getTerminologyExtent()
	 * @generated
	 */
	EReference getTerminologyExtent_Bundles();

	/**
	 * Returns the meta object for the containment reference list '{@link jpl.imce.oml.specification.ecore.TerminologyExtent#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see jpl.imce.oml.specification.ecore.TerminologyExtent#getDescriptions()
	 * @see #getTerminologyExtent()
	 * @generated
	 */
	EReference getTerminologyExtent_Descriptions();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see jpl.imce.oml.specification.ecore.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.Module#getIri <em>Iri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iri</em>'.
	 * @see jpl.imce.oml.specification.ecore.Module#getIri()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Iri();

	/**
	 * Returns the meta object for the containment reference list '{@link jpl.imce.oml.specification.ecore.Module#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see jpl.imce.oml.specification.ecore.Module#getAnnotations()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Annotations();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.Module#extent() <em>Extent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Extent</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.Module#extent()
	 * @generated
	 */
	EOperation getModule__Extent();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.Module#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.Module#calculateUUID()
	 * @generated
	 */
	EOperation getModule__CalculateUUID();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.Module#iri() <em>Iri</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Iri</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.Module#iri()
	 * @generated
	 */
	EOperation getModule__Iri();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.Module#nsPrefix() <em>Ns Prefix</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ns Prefix</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.Module#nsPrefix()
	 * @generated
	 */
	EOperation getModule__NsPrefix();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.Module#name() <em>Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Name</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.Module#name()
	 * @generated
	 */
	EOperation getModule__Name();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.Module#annotationsBySubject() <em>Annotations By Subject</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Annotations By Subject</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.Module#annotationsBySubject()
	 * @generated
	 */
	EOperation getModule__AnnotationsBySubject();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.Module#annotationsByProperty() <em>Annotations By Property</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Annotations By Property</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.Module#annotationsByProperty()
	 * @generated
	 */
	EOperation getModule__AnnotationsByProperty();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.Module#withAnnotations(org.eclipse.emf.common.util.EMap) <em>With Annotations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>With Annotations</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.Module#withAnnotations(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getModule__WithAnnotations__EMap();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.Module#entities() <em>Entities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Entities</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.Module#entities()
	 * @generated
	 */
	EOperation getModule__Entities();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.Module#aspects() <em>Aspects</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Aspects</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.Module#aspects()
	 * @generated
	 */
	EOperation getModule__Aspects();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.Module#concepts() <em>Concepts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Concepts</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.Module#concepts()
	 * @generated
	 */
	EOperation getModule__Concepts();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.Module#reifiedRelationships() <em>Reified Relationships</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reified Relationships</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.Module#reifiedRelationships()
	 * @generated
	 */
	EOperation getModule__ReifiedRelationships();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.Module#unreifiedRelationships() <em>Unreified Relationships</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unreified Relationships</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.Module#unreifiedRelationships()
	 * @generated
	 */
	EOperation getModule__UnreifiedRelationships();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.Module#dataRelationships() <em>Data Relationships</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Data Relationships</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.Module#dataRelationships()
	 * @generated
	 */
	EOperation getModule__DataRelationships();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.Module#entityScalarDataProperties() <em>Entity Scalar Data Properties</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Entity Scalar Data Properties</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.Module#entityScalarDataProperties()
	 * @generated
	 */
	EOperation getModule__EntityScalarDataProperties();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.Module#dataranges() <em>Dataranges</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dataranges</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.Module#dataranges()
	 * @generated
	 */
	EOperation getModule__Dataranges();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.Module#scalars() <em>Scalars</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Scalars</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.Module#scalars()
	 * @generated
	 */
	EOperation getModule__Scalars();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.Module#structures() <em>Structures</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Structures</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.Module#structures()
	 * @generated
	 */
	EOperation getModule__Structures();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.Module#termAxioms() <em>Term Axioms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Term Axioms</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.Module#termAxioms()
	 * @generated
	 */
	EOperation getModule__TermAxioms();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.Module#everything() <em>Everything</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Everything</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.Module#everything()
	 * @generated
	 */
	EOperation getModule__Everything();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.TerminologyBox <em>Terminology Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminology Box</em>'.
	 * @see jpl.imce.oml.specification.ecore.TerminologyBox
	 * @generated
	 */
	EClass getTerminologyBox();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.TerminologyBox#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see jpl.imce.oml.specification.ecore.TerminologyBox#getKind()
	 * @see #getTerminologyBox()
	 * @generated
	 */
	EAttribute getTerminologyBox_Kind();

	/**
	 * Returns the meta object for the containment reference list '{@link jpl.imce.oml.specification.ecore.TerminologyBox#getTerminologyBoxAxioms <em>Terminology Box Axioms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terminology Box Axioms</em>'.
	 * @see jpl.imce.oml.specification.ecore.TerminologyBox#getTerminologyBoxAxioms()
	 * @see #getTerminologyBox()
	 * @generated
	 */
	EReference getTerminologyBox_TerminologyBoxAxioms();

	/**
	 * Returns the meta object for the containment reference list '{@link jpl.imce.oml.specification.ecore.TerminologyBox#getBoxStatements <em>Box Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Box Statements</em>'.
	 * @see jpl.imce.oml.specification.ecore.TerminologyBox#getBoxStatements()
	 * @see #getTerminologyBox()
	 * @generated
	 */
	EReference getTerminologyBox_BoxStatements();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.TerminologyBox#withBoxStatements(org.eclipse.emf.common.util.EList) <em>With Box Statements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>With Box Statements</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.TerminologyBox#withBoxStatements(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTerminologyBox__WithBoxStatements__EList();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.TerminologyBox#entities() <em>Entities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Entities</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.TerminologyBox#entities()
	 * @generated
	 */
	EOperation getTerminologyBox__Entities();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.TerminologyBox#aspects() <em>Aspects</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Aspects</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.TerminologyBox#aspects()
	 * @generated
	 */
	EOperation getTerminologyBox__Aspects();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.TerminologyBox#concepts() <em>Concepts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Concepts</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.TerminologyBox#concepts()
	 * @generated
	 */
	EOperation getTerminologyBox__Concepts();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.TerminologyBox#reifiedRelationships() <em>Reified Relationships</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reified Relationships</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.TerminologyBox#reifiedRelationships()
	 * @generated
	 */
	EOperation getTerminologyBox__ReifiedRelationships();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.TerminologyBox#unreifiedRelationships() <em>Unreified Relationships</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unreified Relationships</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.TerminologyBox#unreifiedRelationships()
	 * @generated
	 */
	EOperation getTerminologyBox__UnreifiedRelationships();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.TerminologyBox#dataRelationships() <em>Data Relationships</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Data Relationships</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.TerminologyBox#dataRelationships()
	 * @generated
	 */
	EOperation getTerminologyBox__DataRelationships();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.TerminologyBox#entityScalarDataProperties() <em>Entity Scalar Data Properties</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Entity Scalar Data Properties</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.TerminologyBox#entityScalarDataProperties()
	 * @generated
	 */
	EOperation getTerminologyBox__EntityScalarDataProperties();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.TerminologyBox#dataranges() <em>Dataranges</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dataranges</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.TerminologyBox#dataranges()
	 * @generated
	 */
	EOperation getTerminologyBox__Dataranges();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.TerminologyBox#scalars() <em>Scalars</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Scalars</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.TerminologyBox#scalars()
	 * @generated
	 */
	EOperation getTerminologyBox__Scalars();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.TerminologyBox#structures() <em>Structures</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Structures</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.TerminologyBox#structures()
	 * @generated
	 */
	EOperation getTerminologyBox__Structures();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.TerminologyBox#termAxioms() <em>Term Axioms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Term Axioms</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.TerminologyBox#termAxioms()
	 * @generated
	 */
	EOperation getTerminologyBox__TermAxioms();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.TerminologyBox#everything() <em>Everything</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Everything</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.TerminologyBox#everything()
	 * @generated
	 */
	EOperation getTerminologyBox__Everything();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.Bundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle</em>'.
	 * @see jpl.imce.oml.specification.ecore.Bundle
	 * @generated
	 */
	EClass getBundle();

	/**
	 * Returns the meta object for the container reference '{@link jpl.imce.oml.specification.ecore.Bundle#getBundleExtent <em>Bundle Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Bundle Extent</em>'.
	 * @see jpl.imce.oml.specification.ecore.Bundle#getBundleExtent()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_BundleExtent();

	/**
	 * Returns the meta object for the containment reference list '{@link jpl.imce.oml.specification.ecore.Bundle#getBundleStatements <em>Bundle Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bundle Statements</em>'.
	 * @see jpl.imce.oml.specification.ecore.Bundle#getBundleStatements()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_BundleStatements();

	/**
	 * Returns the meta object for the containment reference list '{@link jpl.imce.oml.specification.ecore.Bundle#getTerminologyBundleAxioms <em>Terminology Bundle Axioms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terminology Bundle Axioms</em>'.
	 * @see jpl.imce.oml.specification.ecore.Bundle#getTerminologyBundleAxioms()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_TerminologyBundleAxioms();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.Bundle#extent() <em>Extent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Extent</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.Bundle#extent()
	 * @generated
	 */
	EOperation getBundle__Extent();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.Bundle#withAnnotations(org.eclipse.emf.common.util.EMap) <em>With Annotations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>With Annotations</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.Bundle#withAnnotations(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getBundle__WithAnnotations__EMap();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.Bundle#annotationsByProperty() <em>Annotations By Property</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Annotations By Property</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.Bundle#annotationsByProperty()
	 * @generated
	 */
	EOperation getBundle__AnnotationsByProperty();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.Bundle#withBundleStatements(org.eclipse.emf.common.util.EList) <em>With Bundle Statements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>With Bundle Statements</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.Bundle#withBundleStatements(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getBundle__WithBundleStatements__EList();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.Bundle#withBoxStatements(org.eclipse.emf.common.util.EList) <em>With Box Statements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>With Box Statements</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.Bundle#withBoxStatements(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getBundle__WithBoxStatements__EList();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.Bundle#everything() <em>Everything</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Everything</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.Bundle#everything()
	 * @generated
	 */
	EOperation getBundle__Everything();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.TerminologyGraph <em>Terminology Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminology Graph</em>'.
	 * @see jpl.imce.oml.specification.ecore.TerminologyGraph
	 * @generated
	 */
	EClass getTerminologyGraph();

	/**
	 * Returns the meta object for the container reference '{@link jpl.imce.oml.specification.ecore.TerminologyGraph#getGraphExtent <em>Graph Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Graph Extent</em>'.
	 * @see jpl.imce.oml.specification.ecore.TerminologyGraph#getGraphExtent()
	 * @see #getTerminologyGraph()
	 * @generated
	 */
	EReference getTerminologyGraph_GraphExtent();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.TerminologyGraph#extent() <em>Extent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Extent</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.TerminologyGraph#extent()
	 * @generated
	 */
	EOperation getTerminologyGraph__Extent();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.TerminologyGraph#withAnnotations(org.eclipse.emf.common.util.EMap) <em>With Annotations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>With Annotations</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.TerminologyGraph#withAnnotations(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getTerminologyGraph__WithAnnotations__EMap();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.TerminologyGraph#annotationsByProperty() <em>Annotations By Property</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Annotations By Property</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.TerminologyGraph#annotationsByProperty()
	 * @generated
	 */
	EOperation getTerminologyGraph__AnnotationsByProperty();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.TerminologyGraph#withBoxStatements(org.eclipse.emf.common.util.EList) <em>With Box Statements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>With Box Statements</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.TerminologyGraph#withBoxStatements(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTerminologyGraph__WithBoxStatements__EList();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.TerminologyBoxStatement <em>Terminology Box Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminology Box Statement</em>'.
	 * @see jpl.imce.oml.specification.ecore.TerminologyBoxStatement
	 * @generated
	 */
	EClass getTerminologyBoxStatement();

	/**
	 * Returns the meta object for the container reference '{@link jpl.imce.oml.specification.ecore.TerminologyBoxStatement#getTbox <em>Tbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tbox</em>'.
	 * @see jpl.imce.oml.specification.ecore.TerminologyBoxStatement#getTbox()
	 * @see #getTerminologyBoxStatement()
	 * @generated
	 */
	EReference getTerminologyBoxStatement_Tbox();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.TerminologyBundleStatement <em>Terminology Bundle Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminology Bundle Statement</em>'.
	 * @see jpl.imce.oml.specification.ecore.TerminologyBundleStatement
	 * @generated
	 */
	EClass getTerminologyBundleStatement();

	/**
	 * Returns the meta object for the container reference '{@link jpl.imce.oml.specification.ecore.TerminologyBundleStatement#getBundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Bundle</em>'.
	 * @see jpl.imce.oml.specification.ecore.TerminologyBundleStatement#getBundle()
	 * @see #getTerminologyBundleStatement()
	 * @generated
	 */
	EReference getTerminologyBundleStatement_Bundle();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see jpl.imce.oml.specification.ecore.Term
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.Term#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jpl.imce.oml.specification.ecore.Term#getName()
	 * @see #getTerm()
	 * @generated
	 */
	EAttribute getTerm_Name();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.Term#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.Term#calculateUUID()
	 * @generated
	 */
	EOperation getTerm__CalculateUUID();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.Term#iri() <em>Iri</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Iri</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.Term#iri()
	 * @generated
	 */
	EOperation getTerm__Iri();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.Term#name() <em>Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Name</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.Term#name()
	 * @generated
	 */
	EOperation getTerm__Name();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.UnaryTermKind <em>Unary Term Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Term Kind</em>'.
	 * @see jpl.imce.oml.specification.ecore.UnaryTermKind
	 * @generated
	 */
	EClass getUnaryTermKind();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.DirectedBinaryRelationshipKind <em>Directed Binary Relationship Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directed Binary Relationship Kind</em>'.
	 * @see jpl.imce.oml.specification.ecore.DirectedBinaryRelationshipKind
	 * @generated
	 */
	EClass getDirectedBinaryRelationshipKind();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.DirectedBinaryRelationshipKind#relationDomain() <em>Relation Domain</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Relation Domain</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.DirectedBinaryRelationshipKind#relationDomain()
	 * @generated
	 */
	EOperation getDirectedBinaryRelationshipKind__RelationDomain();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.DirectedBinaryRelationshipKind#relationRange() <em>Relation Range</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Relation Range</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.DirectedBinaryRelationshipKind#relationRange()
	 * @generated
	 */
	EOperation getDirectedBinaryRelationshipKind__RelationRange();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see jpl.imce.oml.specification.ecore.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.ConceptualEntity <em>Conceptual Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conceptual Entity</em>'.
	 * @see jpl.imce.oml.specification.ecore.ConceptualEntity
	 * @generated
	 */
	EClass getConceptualEntity();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.ConceptualEntity#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see jpl.imce.oml.specification.ecore.ConceptualEntity#isIsAbstract()
	 * @see #getConceptualEntity()
	 * @generated
	 */
	EAttribute getConceptualEntity_IsAbstract();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.Aspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aspect</em>'.
	 * @see jpl.imce.oml.specification.ecore.Aspect
	 * @generated
	 */
	EClass getAspect();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.Concept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept</em>'.
	 * @see jpl.imce.oml.specification.ecore.Concept
	 * @generated
	 */
	EClass getConcept();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.EntityRelationship <em>Entity Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Relationship</em>'.
	 * @see jpl.imce.oml.specification.ecore.EntityRelationship
	 * @generated
	 */
	EClass getEntityRelationship();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.EntityRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see jpl.imce.oml.specification.ecore.EntityRelationship#getSource()
	 * @see #getEntityRelationship()
	 * @generated
	 */
	EReference getEntityRelationship_Source();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.EntityRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see jpl.imce.oml.specification.ecore.EntityRelationship#getTarget()
	 * @see #getEntityRelationship()
	 * @generated
	 */
	EReference getEntityRelationship_Target();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.EntityRelationship#isIsFunctional <em>Is Functional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Functional</em>'.
	 * @see jpl.imce.oml.specification.ecore.EntityRelationship#isIsFunctional()
	 * @see #getEntityRelationship()
	 * @generated
	 */
	EAttribute getEntityRelationship_IsFunctional();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.EntityRelationship#isIsInverseFunctional <em>Is Inverse Functional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Inverse Functional</em>'.
	 * @see jpl.imce.oml.specification.ecore.EntityRelationship#isIsInverseFunctional()
	 * @see #getEntityRelationship()
	 * @generated
	 */
	EAttribute getEntityRelationship_IsInverseFunctional();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.EntityRelationship#isIsEssential <em>Is Essential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Essential</em>'.
	 * @see jpl.imce.oml.specification.ecore.EntityRelationship#isIsEssential()
	 * @see #getEntityRelationship()
	 * @generated
	 */
	EAttribute getEntityRelationship_IsEssential();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.EntityRelationship#isIsInverseEssential <em>Is Inverse Essential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Inverse Essential</em>'.
	 * @see jpl.imce.oml.specification.ecore.EntityRelationship#isIsInverseEssential()
	 * @see #getEntityRelationship()
	 * @generated
	 */
	EAttribute getEntityRelationship_IsInverseEssential();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.EntityRelationship#isIsSymmetric <em>Is Symmetric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Symmetric</em>'.
	 * @see jpl.imce.oml.specification.ecore.EntityRelationship#isIsSymmetric()
	 * @see #getEntityRelationship()
	 * @generated
	 */
	EAttribute getEntityRelationship_IsSymmetric();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.EntityRelationship#isIsAsymmetric <em>Is Asymmetric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Asymmetric</em>'.
	 * @see jpl.imce.oml.specification.ecore.EntityRelationship#isIsAsymmetric()
	 * @see #getEntityRelationship()
	 * @generated
	 */
	EAttribute getEntityRelationship_IsAsymmetric();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.EntityRelationship#isIsReflexive <em>Is Reflexive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Reflexive</em>'.
	 * @see jpl.imce.oml.specification.ecore.EntityRelationship#isIsReflexive()
	 * @see #getEntityRelationship()
	 * @generated
	 */
	EAttribute getEntityRelationship_IsReflexive();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.EntityRelationship#isIsIrreflexive <em>Is Irreflexive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Irreflexive</em>'.
	 * @see jpl.imce.oml.specification.ecore.EntityRelationship#isIsIrreflexive()
	 * @see #getEntityRelationship()
	 * @generated
	 */
	EAttribute getEntityRelationship_IsIrreflexive();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.EntityRelationship#isIsTransitive <em>Is Transitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Transitive</em>'.
	 * @see jpl.imce.oml.specification.ecore.EntityRelationship#isIsTransitive()
	 * @see #getEntityRelationship()
	 * @generated
	 */
	EAttribute getEntityRelationship_IsTransitive();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.EntityRelationship#relationDomain() <em>Relation Domain</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Relation Domain</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.EntityRelationship#relationDomain()
	 * @generated
	 */
	EOperation getEntityRelationship__RelationDomain();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.EntityRelationship#relationRange() <em>Relation Range</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Relation Range</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.EntityRelationship#relationRange()
	 * @generated
	 */
	EOperation getEntityRelationship__RelationRange();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.ReifiedRelationship <em>Reified Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reified Relationship</em>'.
	 * @see jpl.imce.oml.specification.ecore.ReifiedRelationship
	 * @generated
	 */
	EClass getReifiedRelationship();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.ReifiedRelationship#getUnreifiedPropertyName <em>Unreified Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unreified Property Name</em>'.
	 * @see jpl.imce.oml.specification.ecore.ReifiedRelationship#getUnreifiedPropertyName()
	 * @see #getReifiedRelationship()
	 * @generated
	 */
	EAttribute getReifiedRelationship_UnreifiedPropertyName();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.ReifiedRelationship#getUnreifiedInversePropertyName <em>Unreified Inverse Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unreified Inverse Property Name</em>'.
	 * @see jpl.imce.oml.specification.ecore.ReifiedRelationship#getUnreifiedInversePropertyName()
	 * @see #getReifiedRelationship()
	 * @generated
	 */
	EAttribute getReifiedRelationship_UnreifiedInversePropertyName();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.UnreifiedRelationship <em>Unreified Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unreified Relationship</em>'.
	 * @see jpl.imce.oml.specification.ecore.UnreifiedRelationship
	 * @generated
	 */
	EClass getUnreifiedRelationship();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.Datatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype</em>'.
	 * @see jpl.imce.oml.specification.ecore.Datatype
	 * @generated
	 */
	EClass getDatatype();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.DataRange <em>Data Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Range</em>'.
	 * @see jpl.imce.oml.specification.ecore.DataRange
	 * @generated
	 */
	EClass getDataRange();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.Scalar <em>Scalar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scalar</em>'.
	 * @see jpl.imce.oml.specification.ecore.Scalar
	 * @generated
	 */
	EClass getScalar();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.DataRelationship <em>Data Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Relationship</em>'.
	 * @see jpl.imce.oml.specification.ecore.DataRelationship
	 * @generated
	 */
	EClass getDataRelationship();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.DataRelationship#source() <em>Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.DataRelationship#source()
	 * @generated
	 */
	EOperation getDataRelationship__Source();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.DataRelationship#relationDomain() <em>Relation Domain</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Relation Domain</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.DataRelationship#relationDomain()
	 * @generated
	 */
	EOperation getDataRelationship__RelationDomain();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.DataRelationship#target() <em>Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.DataRelationship#target()
	 * @generated
	 */
	EOperation getDataRelationship__Target();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.DataRelationship#relationRange() <em>Relation Range</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Relation Range</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.DataRelationship#relationRange()
	 * @generated
	 */
	EOperation getDataRelationship__RelationRange();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.DataRelationshipDomain <em>Data Relationship Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Relationship Domain</em>'.
	 * @see jpl.imce.oml.specification.ecore.DataRelationshipDomain
	 * @generated
	 */
	EClass getDataRelationshipDomain();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.DataRelationshipDomain#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.DataRelationshipDomain#calculateUUID()
	 * @generated
	 */
	EOperation getDataRelationshipDomain__CalculateUUID();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.DataRelationshipFromEntity <em>Data Relationship From Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Relationship From Entity</em>'.
	 * @see jpl.imce.oml.specification.ecore.DataRelationshipFromEntity
	 * @generated
	 */
	EClass getDataRelationshipFromEntity();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.DataRelationshipFromEntity#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see jpl.imce.oml.specification.ecore.DataRelationshipFromEntity#getDomain()
	 * @see #getDataRelationshipFromEntity()
	 * @generated
	 */
	EReference getDataRelationshipFromEntity_Domain();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.DataRelationshipFromEntity#isIsIdentityCriteria <em>Is Identity Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Identity Criteria</em>'.
	 * @see jpl.imce.oml.specification.ecore.DataRelationshipFromEntity#isIsIdentityCriteria()
	 * @see #getDataRelationshipFromEntity()
	 * @generated
	 */
	EAttribute getDataRelationshipFromEntity_IsIdentityCriteria();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.DataRelationshipFromStructure <em>Data Relationship From Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Relationship From Structure</em>'.
	 * @see jpl.imce.oml.specification.ecore.DataRelationshipFromStructure
	 * @generated
	 */
	EClass getDataRelationshipFromStructure();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.DataRelationshipFromStructure#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see jpl.imce.oml.specification.ecore.DataRelationshipFromStructure#getDomain()
	 * @see #getDataRelationshipFromStructure()
	 * @generated
	 */
	EReference getDataRelationshipFromStructure_Domain();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.DataRelationshipRange <em>Data Relationship Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Relationship Range</em>'.
	 * @see jpl.imce.oml.specification.ecore.DataRelationshipRange
	 * @generated
	 */
	EClass getDataRelationshipRange();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.DataRelationshipRange#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.DataRelationshipRange#calculateUUID()
	 * @generated
	 */
	EOperation getDataRelationshipRange__CalculateUUID();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.DataRelationshipToScalar <em>Data Relationship To Scalar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Relationship To Scalar</em>'.
	 * @see jpl.imce.oml.specification.ecore.DataRelationshipToScalar
	 * @generated
	 */
	EClass getDataRelationshipToScalar();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.DataRelationshipToScalar#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Range</em>'.
	 * @see jpl.imce.oml.specification.ecore.DataRelationshipToScalar#getRange()
	 * @see #getDataRelationshipToScalar()
	 * @generated
	 */
	EReference getDataRelationshipToScalar_Range();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.DataRelationshipToStructure <em>Data Relationship To Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Relationship To Structure</em>'.
	 * @see jpl.imce.oml.specification.ecore.DataRelationshipToStructure
	 * @generated
	 */
	EClass getDataRelationshipToStructure();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.DataRelationshipToStructure#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Range</em>'.
	 * @see jpl.imce.oml.specification.ecore.DataRelationshipToStructure#getRange()
	 * @see #getDataRelationshipToStructure()
	 * @generated
	 */
	EReference getDataRelationshipToStructure_Range();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.EntityStructuredDataProperty <em>Entity Structured Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Structured Data Property</em>'.
	 * @see jpl.imce.oml.specification.ecore.EntityStructuredDataProperty
	 * @generated
	 */
	EClass getEntityStructuredDataProperty();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.EntityStructuredDataProperty#source() <em>Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.EntityStructuredDataProperty#source()
	 * @generated
	 */
	EOperation getEntityStructuredDataProperty__Source();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.EntityStructuredDataProperty#target() <em>Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.EntityStructuredDataProperty#target()
	 * @generated
	 */
	EOperation getEntityStructuredDataProperty__Target();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.EntityScalarDataProperty <em>Entity Scalar Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Scalar Data Property</em>'.
	 * @see jpl.imce.oml.specification.ecore.EntityScalarDataProperty
	 * @generated
	 */
	EClass getEntityScalarDataProperty();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.EntityScalarDataProperty#source() <em>Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.EntityScalarDataProperty#source()
	 * @generated
	 */
	EOperation getEntityScalarDataProperty__Source();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.EntityScalarDataProperty#target() <em>Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.EntityScalarDataProperty#target()
	 * @generated
	 */
	EOperation getEntityScalarDataProperty__Target();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.StructuredDataProperty <em>Structured Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Data Property</em>'.
	 * @see jpl.imce.oml.specification.ecore.StructuredDataProperty
	 * @generated
	 */
	EClass getStructuredDataProperty();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.StructuredDataProperty#source() <em>Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.StructuredDataProperty#source()
	 * @generated
	 */
	EOperation getStructuredDataProperty__Source();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.StructuredDataProperty#target() <em>Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.StructuredDataProperty#target()
	 * @generated
	 */
	EOperation getStructuredDataProperty__Target();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.ScalarDataProperty <em>Scalar Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scalar Data Property</em>'.
	 * @see jpl.imce.oml.specification.ecore.ScalarDataProperty
	 * @generated
	 */
	EClass getScalarDataProperty();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.ScalarDataProperty#source() <em>Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.ScalarDataProperty#source()
	 * @generated
	 */
	EOperation getScalarDataProperty__Source();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.ScalarDataProperty#target() <em>Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.ScalarDataProperty#target()
	 * @generated
	 */
	EOperation getScalarDataProperty__Target();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.Structure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure</em>'.
	 * @see jpl.imce.oml.specification.ecore.Structure
	 * @generated
	 */
	EClass getStructure();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.Axiom <em>Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Axiom</em>'.
	 * @see jpl.imce.oml.specification.ecore.Axiom
	 * @generated
	 */
	EClass getAxiom();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.TerminologyAxiom <em>Terminology Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminology Axiom</em>'.
	 * @see jpl.imce.oml.specification.ecore.TerminologyAxiom
	 * @generated
	 */
	EClass getTerminologyAxiom();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.TerminologyAxiom#source() <em>Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.TerminologyAxiom#source()
	 * @generated
	 */
	EOperation getTerminologyAxiom__Source();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.TerminologyAxiom#target() <em>Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.TerminologyAxiom#target()
	 * @generated
	 */
	EOperation getTerminologyAxiom__Target();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.TerminologyBoxAxiom <em>Terminology Box Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminology Box Axiom</em>'.
	 * @see jpl.imce.oml.specification.ecore.TerminologyBoxAxiom
	 * @generated
	 */
	EClass getTerminologyBoxAxiom();

	/**
	 * Returns the meta object for the container reference '{@link jpl.imce.oml.specification.ecore.TerminologyBoxAxiom#getTbox <em>Tbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tbox</em>'.
	 * @see jpl.imce.oml.specification.ecore.TerminologyBoxAxiom#getTbox()
	 * @see #getTerminologyBoxAxiom()
	 * @generated
	 */
	EReference getTerminologyBoxAxiom_Tbox();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.TerminologyBundleAxiom <em>Terminology Bundle Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminology Bundle Axiom</em>'.
	 * @see jpl.imce.oml.specification.ecore.TerminologyBundleAxiom
	 * @generated
	 */
	EClass getTerminologyBundleAxiom();

	/**
	 * Returns the meta object for the container reference '{@link jpl.imce.oml.specification.ecore.TerminologyBundleAxiom#getTerminologyBundle <em>Terminology Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Terminology Bundle</em>'.
	 * @see jpl.imce.oml.specification.ecore.TerminologyBundleAxiom#getTerminologyBundle()
	 * @see #getTerminologyBundleAxiom()
	 * @generated
	 */
	EReference getTerminologyBundleAxiom_TerminologyBundle();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.ConceptTreeDisjunction <em>Concept Tree Disjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept Tree Disjunction</em>'.
	 * @see jpl.imce.oml.specification.ecore.ConceptTreeDisjunction
	 * @generated
	 */
	EClass getConceptTreeDisjunction();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.ConceptTreeDisjunction#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.ConceptTreeDisjunction#calculateUUID()
	 * @generated
	 */
	EOperation getConceptTreeDisjunction__CalculateUUID();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.DisjointUnionOfConceptsAxiom <em>Disjoint Union Of Concepts Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disjoint Union Of Concepts Axiom</em>'.
	 * @see jpl.imce.oml.specification.ecore.DisjointUnionOfConceptsAxiom
	 * @generated
	 */
	EClass getDisjointUnionOfConceptsAxiom();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.DisjointUnionOfConceptsAxiom#getDisjointTaxonomyParent <em>Disjoint Taxonomy Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Disjoint Taxonomy Parent</em>'.
	 * @see jpl.imce.oml.specification.ecore.DisjointUnionOfConceptsAxiom#getDisjointTaxonomyParent()
	 * @see #getDisjointUnionOfConceptsAxiom()
	 * @generated
	 */
	EReference getDisjointUnionOfConceptsAxiom_DisjointTaxonomyParent();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.SpecificDisjointConceptAxiom <em>Specific Disjoint Concept Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Disjoint Concept Axiom</em>'.
	 * @see jpl.imce.oml.specification.ecore.SpecificDisjointConceptAxiom
	 * @generated
	 */
	EClass getSpecificDisjointConceptAxiom();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.SpecificDisjointConceptAxiom#getDisjointLeaf <em>Disjoint Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Disjoint Leaf</em>'.
	 * @see jpl.imce.oml.specification.ecore.SpecificDisjointConceptAxiom#getDisjointLeaf()
	 * @see #getSpecificDisjointConceptAxiom()
	 * @generated
	 */
	EReference getSpecificDisjointConceptAxiom_DisjointLeaf();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.SpecificDisjointConceptAxiom#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.SpecificDisjointConceptAxiom#calculateUUID()
	 * @generated
	 */
	EOperation getSpecificDisjointConceptAxiom__CalculateUUID();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.AnonymousConceptTaxonomyAxiom <em>Anonymous Concept Taxonomy Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anonymous Concept Taxonomy Axiom</em>'.
	 * @see jpl.imce.oml.specification.ecore.AnonymousConceptTaxonomyAxiom
	 * @generated
	 */
	EClass getAnonymousConceptTaxonomyAxiom();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.AnonymousConceptTaxonomyAxiom#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.AnonymousConceptTaxonomyAxiom#calculateUUID()
	 * @generated
	 */
	EOperation getAnonymousConceptTaxonomyAxiom__CalculateUUID();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.RootConceptTaxonomyAxiom <em>Root Concept Taxonomy Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Concept Taxonomy Axiom</em>'.
	 * @see jpl.imce.oml.specification.ecore.RootConceptTaxonomyAxiom
	 * @generated
	 */
	EClass getRootConceptTaxonomyAxiom();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.RootConceptTaxonomyAxiom#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root</em>'.
	 * @see jpl.imce.oml.specification.ecore.RootConceptTaxonomyAxiom#getRoot()
	 * @see #getRootConceptTaxonomyAxiom()
	 * @generated
	 */
	EReference getRootConceptTaxonomyAxiom_Root();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.RootConceptTaxonomyAxiom#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.RootConceptTaxonomyAxiom#calculateUUID()
	 * @generated
	 */
	EOperation getRootConceptTaxonomyAxiom__CalculateUUID();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.BundledTerminologyAxiom <em>Bundled Terminology Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundled Terminology Axiom</em>'.
	 * @see jpl.imce.oml.specification.ecore.BundledTerminologyAxiom
	 * @generated
	 */
	EClass getBundledTerminologyAxiom();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.BundledTerminologyAxiom#getBundledTerminology <em>Bundled Terminology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bundled Terminology</em>'.
	 * @see jpl.imce.oml.specification.ecore.BundledTerminologyAxiom#getBundledTerminology()
	 * @see #getBundledTerminologyAxiom()
	 * @generated
	 */
	EReference getBundledTerminologyAxiom_BundledTerminology();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.BundledTerminologyAxiom#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.BundledTerminologyAxiom#calculateUUID()
	 * @generated
	 */
	EOperation getBundledTerminologyAxiom__CalculateUUID();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.BundledTerminologyAxiom#source() <em>Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.BundledTerminologyAxiom#source()
	 * @generated
	 */
	EOperation getBundledTerminologyAxiom__Source();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.BundledTerminologyAxiom#target() <em>Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.BundledTerminologyAxiom#target()
	 * @generated
	 */
	EOperation getBundledTerminologyAxiom__Target();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.ConceptDesignationTerminologyAxiom <em>Concept Designation Terminology Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept Designation Terminology Axiom</em>'.
	 * @see jpl.imce.oml.specification.ecore.ConceptDesignationTerminologyAxiom
	 * @generated
	 */
	EClass getConceptDesignationTerminologyAxiom();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.ConceptDesignationTerminologyAxiom#getDesignatedTerminology <em>Designated Terminology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Designated Terminology</em>'.
	 * @see jpl.imce.oml.specification.ecore.ConceptDesignationTerminologyAxiom#getDesignatedTerminology()
	 * @see #getConceptDesignationTerminologyAxiom()
	 * @generated
	 */
	EReference getConceptDesignationTerminologyAxiom_DesignatedTerminology();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.ConceptDesignationTerminologyAxiom#getDesignatedConcept <em>Designated Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Designated Concept</em>'.
	 * @see jpl.imce.oml.specification.ecore.ConceptDesignationTerminologyAxiom#getDesignatedConcept()
	 * @see #getConceptDesignationTerminologyAxiom()
	 * @generated
	 */
	EReference getConceptDesignationTerminologyAxiom_DesignatedConcept();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.ConceptDesignationTerminologyAxiom#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.ConceptDesignationTerminologyAxiom#calculateUUID()
	 * @generated
	 */
	EOperation getConceptDesignationTerminologyAxiom__CalculateUUID();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.ConceptDesignationTerminologyAxiom#designationTerminologyGraph() <em>Designation Terminology Graph</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Designation Terminology Graph</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.ConceptDesignationTerminologyAxiom#designationTerminologyGraph()
	 * @generated
	 */
	EOperation getConceptDesignationTerminologyAxiom__DesignationTerminologyGraph();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.ConceptDesignationTerminologyAxiom#source() <em>Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.ConceptDesignationTerminologyAxiom#source()
	 * @generated
	 */
	EOperation getConceptDesignationTerminologyAxiom__Source();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.ConceptDesignationTerminologyAxiom#target() <em>Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.ConceptDesignationTerminologyAxiom#target()
	 * @generated
	 */
	EOperation getConceptDesignationTerminologyAxiom__Target();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.TerminologyExtensionAxiom <em>Terminology Extension Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminology Extension Axiom</em>'.
	 * @see jpl.imce.oml.specification.ecore.TerminologyExtensionAxiom
	 * @generated
	 */
	EClass getTerminologyExtensionAxiom();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.TerminologyExtensionAxiom#getExtendedTerminology <em>Extended Terminology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extended Terminology</em>'.
	 * @see jpl.imce.oml.specification.ecore.TerminologyExtensionAxiom#getExtendedTerminology()
	 * @see #getTerminologyExtensionAxiom()
	 * @generated
	 */
	EReference getTerminologyExtensionAxiom_ExtendedTerminology();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.TerminologyExtensionAxiom#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.TerminologyExtensionAxiom#calculateUUID()
	 * @generated
	 */
	EOperation getTerminologyExtensionAxiom__CalculateUUID();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.TerminologyExtensionAxiom#extendingTerminology() <em>Extending Terminology</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Extending Terminology</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.TerminologyExtensionAxiom#extendingTerminology()
	 * @generated
	 */
	EOperation getTerminologyExtensionAxiom__ExtendingTerminology();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.TerminologyExtensionAxiom#source() <em>Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.TerminologyExtensionAxiom#source()
	 * @generated
	 */
	EOperation getTerminologyExtensionAxiom__Source();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.TerminologyExtensionAxiom#target() <em>Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.TerminologyExtensionAxiom#target()
	 * @generated
	 */
	EOperation getTerminologyExtensionAxiom__Target();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.TerminologyNestingAxiom <em>Terminology Nesting Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminology Nesting Axiom</em>'.
	 * @see jpl.imce.oml.specification.ecore.TerminologyNestingAxiom
	 * @generated
	 */
	EClass getTerminologyNestingAxiom();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.TerminologyNestingAxiom#getNestingTerminology <em>Nesting Terminology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nesting Terminology</em>'.
	 * @see jpl.imce.oml.specification.ecore.TerminologyNestingAxiom#getNestingTerminology()
	 * @see #getTerminologyNestingAxiom()
	 * @generated
	 */
	EReference getTerminologyNestingAxiom_NestingTerminology();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.TerminologyNestingAxiom#getNestingContext <em>Nesting Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nesting Context</em>'.
	 * @see jpl.imce.oml.specification.ecore.TerminologyNestingAxiom#getNestingContext()
	 * @see #getTerminologyNestingAxiom()
	 * @generated
	 */
	EReference getTerminologyNestingAxiom_NestingContext();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.TerminologyNestingAxiom#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.TerminologyNestingAxiom#calculateUUID()
	 * @generated
	 */
	EOperation getTerminologyNestingAxiom__CalculateUUID();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.TerminologyNestingAxiom#nestedTerminology() <em>Nested Terminology</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Nested Terminology</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.TerminologyNestingAxiom#nestedTerminology()
	 * @generated
	 */
	EOperation getTerminologyNestingAxiom__NestedTerminology();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.TerminologyNestingAxiom#source() <em>Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.TerminologyNestingAxiom#source()
	 * @generated
	 */
	EOperation getTerminologyNestingAxiom__Source();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.TerminologyNestingAxiom#target() <em>Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.TerminologyNestingAxiom#target()
	 * @generated
	 */
	EOperation getTerminologyNestingAxiom__Target();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.TermAxiom <em>Term Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Axiom</em>'.
	 * @see jpl.imce.oml.specification.ecore.TermAxiom
	 * @generated
	 */
	EClass getTermAxiom();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.EntityRestrictionAxiom <em>Entity Restriction Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Restriction Axiom</em>'.
	 * @see jpl.imce.oml.specification.ecore.EntityRestrictionAxiom
	 * @generated
	 */
	EClass getEntityRestrictionAxiom();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.EntityRestrictionAxiom#getRestrictedRelation <em>Restricted Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Restricted Relation</em>'.
	 * @see jpl.imce.oml.specification.ecore.EntityRestrictionAxiom#getRestrictedRelation()
	 * @see #getEntityRestrictionAxiom()
	 * @generated
	 */
	EReference getEntityRestrictionAxiom_RestrictedRelation();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.EntityRestrictionAxiom#getRestrictedRange <em>Restricted Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Restricted Range</em>'.
	 * @see jpl.imce.oml.specification.ecore.EntityRestrictionAxiom#getRestrictedRange()
	 * @see #getEntityRestrictionAxiom()
	 * @generated
	 */
	EReference getEntityRestrictionAxiom_RestrictedRange();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.EntityRestrictionAxiom#getRestrictedDomain <em>Restricted Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Restricted Domain</em>'.
	 * @see jpl.imce.oml.specification.ecore.EntityRestrictionAxiom#getRestrictedDomain()
	 * @see #getEntityRestrictionAxiom()
	 * @generated
	 */
	EReference getEntityRestrictionAxiom_RestrictedDomain();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.EntityExistentialRestrictionAxiom <em>Entity Existential Restriction Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Existential Restriction Axiom</em>'.
	 * @see jpl.imce.oml.specification.ecore.EntityExistentialRestrictionAxiom
	 * @generated
	 */
	EClass getEntityExistentialRestrictionAxiom();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.EntityExistentialRestrictionAxiom#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.EntityExistentialRestrictionAxiom#calculateUUID()
	 * @generated
	 */
	EOperation getEntityExistentialRestrictionAxiom__CalculateUUID();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.EntityUniversalRestrictionAxiom <em>Entity Universal Restriction Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Universal Restriction Axiom</em>'.
	 * @see jpl.imce.oml.specification.ecore.EntityUniversalRestrictionAxiom
	 * @generated
	 */
	EClass getEntityUniversalRestrictionAxiom();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.EntityUniversalRestrictionAxiom#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.EntityUniversalRestrictionAxiom#calculateUUID()
	 * @generated
	 */
	EOperation getEntityUniversalRestrictionAxiom__CalculateUUID();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.SpecializationAxiom <em>Specialization Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialization Axiom</em>'.
	 * @see jpl.imce.oml.specification.ecore.SpecializationAxiom
	 * @generated
	 */
	EClass getSpecializationAxiom();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.SpecializationAxiom#child() <em>Child</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Child</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.SpecializationAxiom#child()
	 * @generated
	 */
	EOperation getSpecializationAxiom__Child();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.SpecializationAxiom#parent() <em>Parent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Parent</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.SpecializationAxiom#parent()
	 * @generated
	 */
	EOperation getSpecializationAxiom__Parent();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.AspectSpecializationAxiom <em>Aspect Specialization Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aspect Specialization Axiom</em>'.
	 * @see jpl.imce.oml.specification.ecore.AspectSpecializationAxiom
	 * @generated
	 */
	EClass getAspectSpecializationAxiom();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.AspectSpecializationAxiom#getSubEntity <em>Sub Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Entity</em>'.
	 * @see jpl.imce.oml.specification.ecore.AspectSpecializationAxiom#getSubEntity()
	 * @see #getAspectSpecializationAxiom()
	 * @generated
	 */
	EReference getAspectSpecializationAxiom_SubEntity();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.AspectSpecializationAxiom#getSuperAspect <em>Super Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Aspect</em>'.
	 * @see jpl.imce.oml.specification.ecore.AspectSpecializationAxiom#getSuperAspect()
	 * @see #getAspectSpecializationAxiom()
	 * @generated
	 */
	EReference getAspectSpecializationAxiom_SuperAspect();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.AspectSpecializationAxiom#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.AspectSpecializationAxiom#calculateUUID()
	 * @generated
	 */
	EOperation getAspectSpecializationAxiom__CalculateUUID();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.AspectSpecializationAxiom#child() <em>Child</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Child</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.AspectSpecializationAxiom#child()
	 * @generated
	 */
	EOperation getAspectSpecializationAxiom__Child();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.AspectSpecializationAxiom#parent() <em>Parent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Parent</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.AspectSpecializationAxiom#parent()
	 * @generated
	 */
	EOperation getAspectSpecializationAxiom__Parent();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.ConceptSpecializationAxiom <em>Concept Specialization Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept Specialization Axiom</em>'.
	 * @see jpl.imce.oml.specification.ecore.ConceptSpecializationAxiom
	 * @generated
	 */
	EClass getConceptSpecializationAxiom();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.ConceptSpecializationAxiom#getSubConcept <em>Sub Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Concept</em>'.
	 * @see jpl.imce.oml.specification.ecore.ConceptSpecializationAxiom#getSubConcept()
	 * @see #getConceptSpecializationAxiom()
	 * @generated
	 */
	EReference getConceptSpecializationAxiom_SubConcept();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.ConceptSpecializationAxiom#getSuperConcept <em>Super Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Concept</em>'.
	 * @see jpl.imce.oml.specification.ecore.ConceptSpecializationAxiom#getSuperConcept()
	 * @see #getConceptSpecializationAxiom()
	 * @generated
	 */
	EReference getConceptSpecializationAxiom_SuperConcept();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.ConceptSpecializationAxiom#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.ConceptSpecializationAxiom#calculateUUID()
	 * @generated
	 */
	EOperation getConceptSpecializationAxiom__CalculateUUID();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.ConceptSpecializationAxiom#child() <em>Child</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Child</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.ConceptSpecializationAxiom#child()
	 * @generated
	 */
	EOperation getConceptSpecializationAxiom__Child();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.ConceptSpecializationAxiom#parent() <em>Parent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Parent</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.ConceptSpecializationAxiom#parent()
	 * @generated
	 */
	EOperation getConceptSpecializationAxiom__Parent();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipSpecializationAxiom <em>Reified Relationship Specialization Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reified Relationship Specialization Axiom</em>'.
	 * @see jpl.imce.oml.specification.ecore.ReifiedRelationshipSpecializationAxiom
	 * @generated
	 */
	EClass getReifiedRelationshipSpecializationAxiom();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipSpecializationAxiom#getSubRelationship <em>Sub Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Relationship</em>'.
	 * @see jpl.imce.oml.specification.ecore.ReifiedRelationshipSpecializationAxiom#getSubRelationship()
	 * @see #getReifiedRelationshipSpecializationAxiom()
	 * @generated
	 */
	EReference getReifiedRelationshipSpecializationAxiom_SubRelationship();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipSpecializationAxiom#getSuperRelationship <em>Super Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Relationship</em>'.
	 * @see jpl.imce.oml.specification.ecore.ReifiedRelationshipSpecializationAxiom#getSuperRelationship()
	 * @see #getReifiedRelationshipSpecializationAxiom()
	 * @generated
	 */
	EReference getReifiedRelationshipSpecializationAxiom_SuperRelationship();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipSpecializationAxiom#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.ReifiedRelationshipSpecializationAxiom#calculateUUID()
	 * @generated
	 */
	EOperation getReifiedRelationshipSpecializationAxiom__CalculateUUID();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipSpecializationAxiom#child() <em>Child</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Child</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.ReifiedRelationshipSpecializationAxiom#child()
	 * @generated
	 */
	EOperation getReifiedRelationshipSpecializationAxiom__Child();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipSpecializationAxiom#parent() <em>Parent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Parent</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.ReifiedRelationshipSpecializationAxiom#parent()
	 * @generated
	 */
	EOperation getReifiedRelationshipSpecializationAxiom__Parent();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.EntityScalarDataPropertyRestrictionAxiom <em>Entity Scalar Data Property Restriction Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Scalar Data Property Restriction Axiom</em>'.
	 * @see jpl.imce.oml.specification.ecore.EntityScalarDataPropertyRestrictionAxiom
	 * @generated
	 */
	EClass getEntityScalarDataPropertyRestrictionAxiom();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.EntityScalarDataPropertyRestrictionAxiom#getRestrictedEntity <em>Restricted Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Restricted Entity</em>'.
	 * @see jpl.imce.oml.specification.ecore.EntityScalarDataPropertyRestrictionAxiom#getRestrictedEntity()
	 * @see #getEntityScalarDataPropertyRestrictionAxiom()
	 * @generated
	 */
	EReference getEntityScalarDataPropertyRestrictionAxiom_RestrictedEntity();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.EntityScalarDataPropertyRestrictionAxiom#getScalarProperty <em>Scalar Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scalar Property</em>'.
	 * @see jpl.imce.oml.specification.ecore.EntityScalarDataPropertyRestrictionAxiom#getScalarProperty()
	 * @see #getEntityScalarDataPropertyRestrictionAxiom()
	 * @generated
	 */
	EReference getEntityScalarDataPropertyRestrictionAxiom_ScalarProperty();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.EntityScalarDataPropertyExistentialRestrictionAxiom <em>Entity Scalar Data Property Existential Restriction Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Scalar Data Property Existential Restriction Axiom</em>'.
	 * @see jpl.imce.oml.specification.ecore.EntityScalarDataPropertyExistentialRestrictionAxiom
	 * @generated
	 */
	EClass getEntityScalarDataPropertyExistentialRestrictionAxiom();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.EntityScalarDataPropertyExistentialRestrictionAxiom#getScalarRestriction <em>Scalar Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scalar Restriction</em>'.
	 * @see jpl.imce.oml.specification.ecore.EntityScalarDataPropertyExistentialRestrictionAxiom#getScalarRestriction()
	 * @see #getEntityScalarDataPropertyExistentialRestrictionAxiom()
	 * @generated
	 */
	EReference getEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarRestriction();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.EntityScalarDataPropertyExistentialRestrictionAxiom#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.EntityScalarDataPropertyExistentialRestrictionAxiom#calculateUUID()
	 * @generated
	 */
	EOperation getEntityScalarDataPropertyExistentialRestrictionAxiom__CalculateUUID();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.EntityScalarDataPropertyUniversalRestrictionAxiom <em>Entity Scalar Data Property Universal Restriction Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Scalar Data Property Universal Restriction Axiom</em>'.
	 * @see jpl.imce.oml.specification.ecore.EntityScalarDataPropertyUniversalRestrictionAxiom
	 * @generated
	 */
	EClass getEntityScalarDataPropertyUniversalRestrictionAxiom();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.EntityScalarDataPropertyUniversalRestrictionAxiom#getScalarRestriction <em>Scalar Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scalar Restriction</em>'.
	 * @see jpl.imce.oml.specification.ecore.EntityScalarDataPropertyUniversalRestrictionAxiom#getScalarRestriction()
	 * @see #getEntityScalarDataPropertyUniversalRestrictionAxiom()
	 * @generated
	 */
	EReference getEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarRestriction();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.EntityScalarDataPropertyUniversalRestrictionAxiom#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.EntityScalarDataPropertyUniversalRestrictionAxiom#calculateUUID()
	 * @generated
	 */
	EOperation getEntityScalarDataPropertyUniversalRestrictionAxiom__CalculateUUID();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.EntityScalarDataPropertyParticularRestrictionAxiom <em>Entity Scalar Data Property Particular Restriction Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Scalar Data Property Particular Restriction Axiom</em>'.
	 * @see jpl.imce.oml.specification.ecore.EntityScalarDataPropertyParticularRestrictionAxiom
	 * @generated
	 */
	EClass getEntityScalarDataPropertyParticularRestrictionAxiom();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.EntityScalarDataPropertyParticularRestrictionAxiom#getLiteralValue <em>Literal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal Value</em>'.
	 * @see jpl.imce.oml.specification.ecore.EntityScalarDataPropertyParticularRestrictionAxiom#getLiteralValue()
	 * @see #getEntityScalarDataPropertyParticularRestrictionAxiom()
	 * @generated
	 */
	EAttribute getEntityScalarDataPropertyParticularRestrictionAxiom_LiteralValue();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.EntityScalarDataPropertyParticularRestrictionAxiom#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.EntityScalarDataPropertyParticularRestrictionAxiom#calculateUUID()
	 * @generated
	 */
	EOperation getEntityScalarDataPropertyParticularRestrictionAxiom__CalculateUUID();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.RestrictedDataRange <em>Restricted Data Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restricted Data Range</em>'.
	 * @see jpl.imce.oml.specification.ecore.RestrictedDataRange
	 * @generated
	 */
	EClass getRestrictedDataRange();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.RestrictedDataRange#getRestrictedRange <em>Restricted Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Restricted Range</em>'.
	 * @see jpl.imce.oml.specification.ecore.RestrictedDataRange#getRestrictedRange()
	 * @see #getRestrictedDataRange()
	 * @generated
	 */
	EReference getRestrictedDataRange_RestrictedRange();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.BinaryScalarRestriction <em>Binary Scalar Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Scalar Restriction</em>'.
	 * @see jpl.imce.oml.specification.ecore.BinaryScalarRestriction
	 * @generated
	 */
	EClass getBinaryScalarRestriction();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.BinaryScalarRestriction#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see jpl.imce.oml.specification.ecore.BinaryScalarRestriction#getLength()
	 * @see #getBinaryScalarRestriction()
	 * @generated
	 */
	EAttribute getBinaryScalarRestriction_Length();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.BinaryScalarRestriction#getMinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Length</em>'.
	 * @see jpl.imce.oml.specification.ecore.BinaryScalarRestriction#getMinLength()
	 * @see #getBinaryScalarRestriction()
	 * @generated
	 */
	EAttribute getBinaryScalarRestriction_MinLength();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.BinaryScalarRestriction#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see jpl.imce.oml.specification.ecore.BinaryScalarRestriction#getMaxLength()
	 * @see #getBinaryScalarRestriction()
	 * @generated
	 */
	EAttribute getBinaryScalarRestriction_MaxLength();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.BinaryScalarRestriction#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.BinaryScalarRestriction#calculateUUID()
	 * @generated
	 */
	EOperation getBinaryScalarRestriction__CalculateUUID();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.IRIScalarRestriction <em>IRI Scalar Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IRI Scalar Restriction</em>'.
	 * @see jpl.imce.oml.specification.ecore.IRIScalarRestriction
	 * @generated
	 */
	EClass getIRIScalarRestriction();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.IRIScalarRestriction#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see jpl.imce.oml.specification.ecore.IRIScalarRestriction#getLength()
	 * @see #getIRIScalarRestriction()
	 * @generated
	 */
	EAttribute getIRIScalarRestriction_Length();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.IRIScalarRestriction#getMinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Length</em>'.
	 * @see jpl.imce.oml.specification.ecore.IRIScalarRestriction#getMinLength()
	 * @see #getIRIScalarRestriction()
	 * @generated
	 */
	EAttribute getIRIScalarRestriction_MinLength();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.IRIScalarRestriction#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see jpl.imce.oml.specification.ecore.IRIScalarRestriction#getMaxLength()
	 * @see #getIRIScalarRestriction()
	 * @generated
	 */
	EAttribute getIRIScalarRestriction_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.IRIScalarRestriction#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see jpl.imce.oml.specification.ecore.IRIScalarRestriction#getPattern()
	 * @see #getIRIScalarRestriction()
	 * @generated
	 */
	EAttribute getIRIScalarRestriction_Pattern();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.IRIScalarRestriction#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.IRIScalarRestriction#calculateUUID()
	 * @generated
	 */
	EOperation getIRIScalarRestriction__CalculateUUID();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.NumericScalarRestriction <em>Numeric Scalar Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Scalar Restriction</em>'.
	 * @see jpl.imce.oml.specification.ecore.NumericScalarRestriction
	 * @generated
	 */
	EClass getNumericScalarRestriction();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.NumericScalarRestriction#getMinInclusive <em>Min Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Inclusive</em>'.
	 * @see jpl.imce.oml.specification.ecore.NumericScalarRestriction#getMinInclusive()
	 * @see #getNumericScalarRestriction()
	 * @generated
	 */
	EAttribute getNumericScalarRestriction_MinInclusive();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.NumericScalarRestriction#getMaxInclusive <em>Max Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Inclusive</em>'.
	 * @see jpl.imce.oml.specification.ecore.NumericScalarRestriction#getMaxInclusive()
	 * @see #getNumericScalarRestriction()
	 * @generated
	 */
	EAttribute getNumericScalarRestriction_MaxInclusive();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.NumericScalarRestriction#getMinExclusive <em>Min Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Exclusive</em>'.
	 * @see jpl.imce.oml.specification.ecore.NumericScalarRestriction#getMinExclusive()
	 * @see #getNumericScalarRestriction()
	 * @generated
	 */
	EAttribute getNumericScalarRestriction_MinExclusive();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.NumericScalarRestriction#getMaxExclusive <em>Max Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Exclusive</em>'.
	 * @see jpl.imce.oml.specification.ecore.NumericScalarRestriction#getMaxExclusive()
	 * @see #getNumericScalarRestriction()
	 * @generated
	 */
	EAttribute getNumericScalarRestriction_MaxExclusive();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.NumericScalarRestriction#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.NumericScalarRestriction#calculateUUID()
	 * @generated
	 */
	EOperation getNumericScalarRestriction__CalculateUUID();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.PlainLiteralScalarRestriction <em>Plain Literal Scalar Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plain Literal Scalar Restriction</em>'.
	 * @see jpl.imce.oml.specification.ecore.PlainLiteralScalarRestriction
	 * @generated
	 */
	EClass getPlainLiteralScalarRestriction();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.PlainLiteralScalarRestriction#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see jpl.imce.oml.specification.ecore.PlainLiteralScalarRestriction#getLength()
	 * @see #getPlainLiteralScalarRestriction()
	 * @generated
	 */
	EAttribute getPlainLiteralScalarRestriction_Length();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.PlainLiteralScalarRestriction#getMinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Length</em>'.
	 * @see jpl.imce.oml.specification.ecore.PlainLiteralScalarRestriction#getMinLength()
	 * @see #getPlainLiteralScalarRestriction()
	 * @generated
	 */
	EAttribute getPlainLiteralScalarRestriction_MinLength();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.PlainLiteralScalarRestriction#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see jpl.imce.oml.specification.ecore.PlainLiteralScalarRestriction#getMaxLength()
	 * @see #getPlainLiteralScalarRestriction()
	 * @generated
	 */
	EAttribute getPlainLiteralScalarRestriction_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.PlainLiteralScalarRestriction#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see jpl.imce.oml.specification.ecore.PlainLiteralScalarRestriction#getPattern()
	 * @see #getPlainLiteralScalarRestriction()
	 * @generated
	 */
	EAttribute getPlainLiteralScalarRestriction_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.PlainLiteralScalarRestriction#getLangRange <em>Lang Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang Range</em>'.
	 * @see jpl.imce.oml.specification.ecore.PlainLiteralScalarRestriction#getLangRange()
	 * @see #getPlainLiteralScalarRestriction()
	 * @generated
	 */
	EAttribute getPlainLiteralScalarRestriction_LangRange();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.PlainLiteralScalarRestriction#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.PlainLiteralScalarRestriction#calculateUUID()
	 * @generated
	 */
	EOperation getPlainLiteralScalarRestriction__CalculateUUID();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.StringScalarRestriction <em>String Scalar Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Scalar Restriction</em>'.
	 * @see jpl.imce.oml.specification.ecore.StringScalarRestriction
	 * @generated
	 */
	EClass getStringScalarRestriction();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.StringScalarRestriction#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see jpl.imce.oml.specification.ecore.StringScalarRestriction#getLength()
	 * @see #getStringScalarRestriction()
	 * @generated
	 */
	EAttribute getStringScalarRestriction_Length();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.StringScalarRestriction#getMinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Length</em>'.
	 * @see jpl.imce.oml.specification.ecore.StringScalarRestriction#getMinLength()
	 * @see #getStringScalarRestriction()
	 * @generated
	 */
	EAttribute getStringScalarRestriction_MinLength();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.StringScalarRestriction#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see jpl.imce.oml.specification.ecore.StringScalarRestriction#getMaxLength()
	 * @see #getStringScalarRestriction()
	 * @generated
	 */
	EAttribute getStringScalarRestriction_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.StringScalarRestriction#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see jpl.imce.oml.specification.ecore.StringScalarRestriction#getPattern()
	 * @see #getStringScalarRestriction()
	 * @generated
	 */
	EAttribute getStringScalarRestriction_Pattern();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.StringScalarRestriction#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.StringScalarRestriction#calculateUUID()
	 * @generated
	 */
	EOperation getStringScalarRestriction__CalculateUUID();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.TimeScalarRestriction <em>Time Scalar Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Scalar Restriction</em>'.
	 * @see jpl.imce.oml.specification.ecore.TimeScalarRestriction
	 * @generated
	 */
	EClass getTimeScalarRestriction();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.TimeScalarRestriction#getMinInclusive <em>Min Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Inclusive</em>'.
	 * @see jpl.imce.oml.specification.ecore.TimeScalarRestriction#getMinInclusive()
	 * @see #getTimeScalarRestriction()
	 * @generated
	 */
	EAttribute getTimeScalarRestriction_MinInclusive();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.TimeScalarRestriction#getMaxInclusive <em>Max Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Inclusive</em>'.
	 * @see jpl.imce.oml.specification.ecore.TimeScalarRestriction#getMaxInclusive()
	 * @see #getTimeScalarRestriction()
	 * @generated
	 */
	EAttribute getTimeScalarRestriction_MaxInclusive();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.TimeScalarRestriction#getMinExclusive <em>Min Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Exclusive</em>'.
	 * @see jpl.imce.oml.specification.ecore.TimeScalarRestriction#getMinExclusive()
	 * @see #getTimeScalarRestriction()
	 * @generated
	 */
	EAttribute getTimeScalarRestriction_MinExclusive();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.TimeScalarRestriction#getMaxExclusive <em>Max Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Exclusive</em>'.
	 * @see jpl.imce.oml.specification.ecore.TimeScalarRestriction#getMaxExclusive()
	 * @see #getTimeScalarRestriction()
	 * @generated
	 */
	EAttribute getTimeScalarRestriction_MaxExclusive();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.TimeScalarRestriction#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.TimeScalarRestriction#calculateUUID()
	 * @generated
	 */
	EOperation getTimeScalarRestriction__CalculateUUID();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.SynonymScalarRestriction <em>Synonym Scalar Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synonym Scalar Restriction</em>'.
	 * @see jpl.imce.oml.specification.ecore.SynonymScalarRestriction
	 * @generated
	 */
	EClass getSynonymScalarRestriction();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.SynonymScalarRestriction#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.SynonymScalarRestriction#calculateUUID()
	 * @generated
	 */
	EOperation getSynonymScalarRestriction__CalculateUUID();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.ScalarOneOfRestriction <em>Scalar One Of Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scalar One Of Restriction</em>'.
	 * @see jpl.imce.oml.specification.ecore.ScalarOneOfRestriction
	 * @generated
	 */
	EClass getScalarOneOfRestriction();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.ScalarOneOfRestriction#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.ScalarOneOfRestriction#calculateUUID()
	 * @generated
	 */
	EOperation getScalarOneOfRestriction__CalculateUUID();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.ScalarOneOfLiteralAxiom <em>Scalar One Of Literal Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scalar One Of Literal Axiom</em>'.
	 * @see jpl.imce.oml.specification.ecore.ScalarOneOfLiteralAxiom
	 * @generated
	 */
	EClass getScalarOneOfLiteralAxiom();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.ScalarOneOfLiteralAxiom#getAxiom <em>Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Axiom</em>'.
	 * @see jpl.imce.oml.specification.ecore.ScalarOneOfLiteralAxiom#getAxiom()
	 * @see #getScalarOneOfLiteralAxiom()
	 * @generated
	 */
	EReference getScalarOneOfLiteralAxiom_Axiom();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.ScalarOneOfLiteralAxiom#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see jpl.imce.oml.specification.ecore.ScalarOneOfLiteralAxiom#getValue()
	 * @see #getScalarOneOfLiteralAxiom()
	 * @generated
	 */
	EAttribute getScalarOneOfLiteralAxiom_Value();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.ScalarOneOfLiteralAxiom#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.ScalarOneOfLiteralAxiom#calculateUUID()
	 * @generated
	 */
	EOperation getScalarOneOfLiteralAxiom__CalculateUUID();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.DescriptionBox <em>Description Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Box</em>'.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBox
	 * @generated
	 */
	EClass getDescriptionBox();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.DescriptionBox#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBox#getKind()
	 * @see #getDescriptionBox()
	 * @generated
	 */
	EAttribute getDescriptionBox_Kind();

	/**
	 * Returns the meta object for the container reference '{@link jpl.imce.oml.specification.ecore.DescriptionBox#getDescriptionExtent <em>Description Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Description Extent</em>'.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBox#getDescriptionExtent()
	 * @see #getDescriptionBox()
	 * @generated
	 */
	EReference getDescriptionBox_DescriptionExtent();

	/**
	 * Returns the meta object for the containment reference list '{@link jpl.imce.oml.specification.ecore.DescriptionBox#getClosedWorldDefinitions <em>Closed World Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Closed World Definitions</em>'.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBox#getClosedWorldDefinitions()
	 * @see #getDescriptionBox()
	 * @generated
	 */
	EReference getDescriptionBox_ClosedWorldDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link jpl.imce.oml.specification.ecore.DescriptionBox#getDescriptionBoxRefinements <em>Description Box Refinements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Box Refinements</em>'.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBox#getDescriptionBoxRefinements()
	 * @see #getDescriptionBox()
	 * @generated
	 */
	EReference getDescriptionBox_DescriptionBoxRefinements();

	/**
	 * Returns the meta object for the containment reference list '{@link jpl.imce.oml.specification.ecore.DescriptionBox#getConceptInstances <em>Concept Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concept Instances</em>'.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBox#getConceptInstances()
	 * @see #getDescriptionBox()
	 * @generated
	 */
	EReference getDescriptionBox_ConceptInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link jpl.imce.oml.specification.ecore.DescriptionBox#getReifiedRelationshipInstances <em>Reified Relationship Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reified Relationship Instances</em>'.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBox#getReifiedRelationshipInstances()
	 * @see #getDescriptionBox()
	 * @generated
	 */
	EReference getDescriptionBox_ReifiedRelationshipInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link jpl.imce.oml.specification.ecore.DescriptionBox#getReifiedRelationshipInstanceDomains <em>Reified Relationship Instance Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reified Relationship Instance Domains</em>'.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBox#getReifiedRelationshipInstanceDomains()
	 * @see #getDescriptionBox()
	 * @generated
	 */
	EReference getDescriptionBox_ReifiedRelationshipInstanceDomains();

	/**
	 * Returns the meta object for the containment reference list '{@link jpl.imce.oml.specification.ecore.DescriptionBox#getReifiedRelationshipInstanceRanges <em>Reified Relationship Instance Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reified Relationship Instance Ranges</em>'.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBox#getReifiedRelationshipInstanceRanges()
	 * @see #getDescriptionBox()
	 * @generated
	 */
	EReference getDescriptionBox_ReifiedRelationshipInstanceRanges();

	/**
	 * Returns the meta object for the containment reference list '{@link jpl.imce.oml.specification.ecore.DescriptionBox#getUnreifiedRelationshipInstanceTuples <em>Unreified Relationship Instance Tuples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unreified Relationship Instance Tuples</em>'.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBox#getUnreifiedRelationshipInstanceTuples()
	 * @see #getDescriptionBox()
	 * @generated
	 */
	EReference getDescriptionBox_UnreifiedRelationshipInstanceTuples();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.DescriptionBox#withAnnotations(org.eclipse.emf.common.util.EMap) <em>With Annotations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>With Annotations</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBox#withAnnotations(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getDescriptionBox__WithAnnotations__EMap();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.DescriptionBox#annotationsByProperty() <em>Annotations By Property</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Annotations By Property</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBox#annotationsByProperty()
	 * @generated
	 */
	EOperation getDescriptionBox__AnnotationsByProperty();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.DescriptionBox#extent() <em>Extent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Extent</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBox#extent()
	 * @generated
	 */
	EOperation getDescriptionBox__Extent();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.DescriptionBox#entities() <em>Entities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Entities</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBox#entities()
	 * @generated
	 */
	EOperation getDescriptionBox__Entities();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.DescriptionBox#aspects() <em>Aspects</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Aspects</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBox#aspects()
	 * @generated
	 */
	EOperation getDescriptionBox__Aspects();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.DescriptionBox#concepts() <em>Concepts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Concepts</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBox#concepts()
	 * @generated
	 */
	EOperation getDescriptionBox__Concepts();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.DescriptionBox#reifiedRelationships() <em>Reified Relationships</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reified Relationships</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBox#reifiedRelationships()
	 * @generated
	 */
	EOperation getDescriptionBox__ReifiedRelationships();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.DescriptionBox#unreifiedRelationships() <em>Unreified Relationships</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unreified Relationships</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBox#unreifiedRelationships()
	 * @generated
	 */
	EOperation getDescriptionBox__UnreifiedRelationships();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.DescriptionBox#dataRelationships() <em>Data Relationships</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Data Relationships</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBox#dataRelationships()
	 * @generated
	 */
	EOperation getDescriptionBox__DataRelationships();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.DescriptionBox#entityScalarDataProperties() <em>Entity Scalar Data Properties</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Entity Scalar Data Properties</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBox#entityScalarDataProperties()
	 * @generated
	 */
	EOperation getDescriptionBox__EntityScalarDataProperties();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.DescriptionBox#dataranges() <em>Dataranges</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dataranges</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBox#dataranges()
	 * @generated
	 */
	EOperation getDescriptionBox__Dataranges();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.DescriptionBox#scalars() <em>Scalars</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Scalars</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBox#scalars()
	 * @generated
	 */
	EOperation getDescriptionBox__Scalars();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.DescriptionBox#structures() <em>Structures</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Structures</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBox#structures()
	 * @generated
	 */
	EOperation getDescriptionBox__Structures();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.DescriptionBox#termAxioms() <em>Term Axioms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Term Axioms</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBox#termAxioms()
	 * @generated
	 */
	EOperation getDescriptionBox__TermAxioms();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.DescriptionBox#everything() <em>Everything</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Everything</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBox#everything()
	 * @generated
	 */
	EOperation getDescriptionBox__Everything();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.DescriptionBoxRelationship <em>Description Box Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Box Relationship</em>'.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBoxRelationship
	 * @generated
	 */
	EClass getDescriptionBoxRelationship();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.DescriptionBoxRelationship#descriptionDomain() <em>Description Domain</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Description Domain</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBoxRelationship#descriptionDomain()
	 * @generated
	 */
	EOperation getDescriptionBoxRelationship__DescriptionDomain();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.DescriptionBoxRelationship#targetModule() <em>Target Module</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target Module</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBoxRelationship#targetModule()
	 * @generated
	 */
	EOperation getDescriptionBoxRelationship__TargetModule();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.DescriptionBoxExtendsClosedWorldDefinitions <em>Description Box Extends Closed World Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Box Extends Closed World Definitions</em>'.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBoxExtendsClosedWorldDefinitions
	 * @generated
	 */
	EClass getDescriptionBoxExtendsClosedWorldDefinitions();

	/**
	 * Returns the meta object for the container reference '{@link jpl.imce.oml.specification.ecore.DescriptionBoxExtendsClosedWorldDefinitions#getDescriptionBox <em>Description Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Description Box</em>'.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBoxExtendsClosedWorldDefinitions#getDescriptionBox()
	 * @see #getDescriptionBoxExtendsClosedWorldDefinitions()
	 * @generated
	 */
	EReference getDescriptionBoxExtendsClosedWorldDefinitions_DescriptionBox();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.DescriptionBoxExtendsClosedWorldDefinitions#getClosedWorldDefinitions <em>Closed World Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Closed World Definitions</em>'.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBoxExtendsClosedWorldDefinitions#getClosedWorldDefinitions()
	 * @see #getDescriptionBoxExtendsClosedWorldDefinitions()
	 * @generated
	 */
	EReference getDescriptionBoxExtendsClosedWorldDefinitions_ClosedWorldDefinitions();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.DescriptionBoxExtendsClosedWorldDefinitions#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBoxExtendsClosedWorldDefinitions#calculateUUID()
	 * @generated
	 */
	EOperation getDescriptionBoxExtendsClosedWorldDefinitions__CalculateUUID();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.DescriptionBoxExtendsClosedWorldDefinitions#descriptionDomain() <em>Description Domain</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Description Domain</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBoxExtendsClosedWorldDefinitions#descriptionDomain()
	 * @generated
	 */
	EOperation getDescriptionBoxExtendsClosedWorldDefinitions__DescriptionDomain();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.DescriptionBoxExtendsClosedWorldDefinitions#targetModule() <em>Target Module</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target Module</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBoxExtendsClosedWorldDefinitions#targetModule()
	 * @generated
	 */
	EOperation getDescriptionBoxExtendsClosedWorldDefinitions__TargetModule();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.DescriptionBoxRefinement <em>Description Box Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Box Refinement</em>'.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBoxRefinement
	 * @generated
	 */
	EClass getDescriptionBoxRefinement();

	/**
	 * Returns the meta object for the container reference '{@link jpl.imce.oml.specification.ecore.DescriptionBoxRefinement#getRefiningDescriptionBox <em>Refining Description Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Refining Description Box</em>'.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBoxRefinement#getRefiningDescriptionBox()
	 * @see #getDescriptionBoxRefinement()
	 * @generated
	 */
	EReference getDescriptionBoxRefinement_RefiningDescriptionBox();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.DescriptionBoxRefinement#getRefinedDescriptionBox <em>Refined Description Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refined Description Box</em>'.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBoxRefinement#getRefinedDescriptionBox()
	 * @see #getDescriptionBoxRefinement()
	 * @generated
	 */
	EReference getDescriptionBoxRefinement_RefinedDescriptionBox();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.DescriptionBoxRefinement#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBoxRefinement#calculateUUID()
	 * @generated
	 */
	EOperation getDescriptionBoxRefinement__CalculateUUID();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.DescriptionBoxRefinement#descriptionDomain() <em>Description Domain</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Description Domain</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBoxRefinement#descriptionDomain()
	 * @generated
	 */
	EOperation getDescriptionBoxRefinement__DescriptionDomain();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.DescriptionBoxRefinement#targetModule() <em>Target Module</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target Module</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.DescriptionBoxRefinement#targetModule()
	 * @generated
	 */
	EOperation getDescriptionBoxRefinement__TargetModule();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.TerminologyInstanceAssertion <em>Terminology Instance Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminology Instance Assertion</em>'.
	 * @see jpl.imce.oml.specification.ecore.TerminologyInstanceAssertion
	 * @generated
	 */
	EClass getTerminologyInstanceAssertion();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.TerminologyInstanceAssertion#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jpl.imce.oml.specification.ecore.TerminologyInstanceAssertion#getName()
	 * @see #getTerminologyInstanceAssertion()
	 * @generated
	 */
	EAttribute getTerminologyInstanceAssertion_Name();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.TerminologyInstanceAssertion#descriptionBox() <em>Description Box</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Description Box</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.TerminologyInstanceAssertion#descriptionBox()
	 * @generated
	 */
	EOperation getTerminologyInstanceAssertion__DescriptionBox();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.TerminologyInstanceAssertion#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.TerminologyInstanceAssertion#calculateUUID()
	 * @generated
	 */
	EOperation getTerminologyInstanceAssertion__CalculateUUID();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.TerminologyInstanceAssertion#iri() <em>Iri</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Iri</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.TerminologyInstanceAssertion#iri()
	 * @generated
	 */
	EOperation getTerminologyInstanceAssertion__Iri();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.TerminologyInstanceAssertion#name() <em>Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Name</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.TerminologyInstanceAssertion#name()
	 * @generated
	 */
	EOperation getTerminologyInstanceAssertion__Name();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.SingletonInstance <em>Singleton Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Singleton Instance</em>'.
	 * @see jpl.imce.oml.specification.ecore.SingletonInstance
	 * @generated
	 */
	EClass getSingletonInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link jpl.imce.oml.specification.ecore.SingletonInstance#getScalarDataPropertyValues <em>Scalar Data Property Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scalar Data Property Values</em>'.
	 * @see jpl.imce.oml.specification.ecore.SingletonInstance#getScalarDataPropertyValues()
	 * @see #getSingletonInstance()
	 * @generated
	 */
	EReference getSingletonInstance_ScalarDataPropertyValues();

	/**
	 * Returns the meta object for the containment reference list '{@link jpl.imce.oml.specification.ecore.SingletonInstance#getStructuredDataPropertyValues <em>Structured Data Property Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Structured Data Property Values</em>'.
	 * @see jpl.imce.oml.specification.ecore.SingletonInstance#getStructuredDataPropertyValues()
	 * @see #getSingletonInstance()
	 * @generated
	 */
	EReference getSingletonInstance_StructuredDataPropertyValues();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.ScalarDataPropertyValue <em>Scalar Data Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scalar Data Property Value</em>'.
	 * @see jpl.imce.oml.specification.ecore.ScalarDataPropertyValue
	 * @generated
	 */
	EClass getScalarDataPropertyValue();

	/**
	 * Returns the meta object for the container reference '{@link jpl.imce.oml.specification.ecore.ScalarDataPropertyValue#getSingletonInstance <em>Singleton Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Singleton Instance</em>'.
	 * @see jpl.imce.oml.specification.ecore.ScalarDataPropertyValue#getSingletonInstance()
	 * @see #getScalarDataPropertyValue()
	 * @generated
	 */
	EReference getScalarDataPropertyValue_SingletonInstance();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.ScalarDataPropertyValue#getScalarDataProperty <em>Scalar Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scalar Data Property</em>'.
	 * @see jpl.imce.oml.specification.ecore.ScalarDataPropertyValue#getScalarDataProperty()
	 * @see #getScalarDataPropertyValue()
	 * @generated
	 */
	EReference getScalarDataPropertyValue_ScalarDataProperty();

	/**
	 * Returns the meta object for the attribute '{@link jpl.imce.oml.specification.ecore.ScalarDataPropertyValue#getScalarPropertyValue <em>Scalar Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scalar Property Value</em>'.
	 * @see jpl.imce.oml.specification.ecore.ScalarDataPropertyValue#getScalarPropertyValue()
	 * @see #getScalarDataPropertyValue()
	 * @generated
	 */
	EAttribute getScalarDataPropertyValue_ScalarPropertyValue();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.ScalarDataPropertyValue#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.ScalarDataPropertyValue#calculateUUID()
	 * @generated
	 */
	EOperation getScalarDataPropertyValue__CalculateUUID();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.ScalarDataPropertyValue#descriptionBox() <em>Description Box</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Description Box</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.ScalarDataPropertyValue#descriptionBox()
	 * @generated
	 */
	EOperation getScalarDataPropertyValue__DescriptionBox();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.StructuredDataPropertyValue <em>Structured Data Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Data Property Value</em>'.
	 * @see jpl.imce.oml.specification.ecore.StructuredDataPropertyValue
	 * @generated
	 */
	EClass getStructuredDataPropertyValue();

	/**
	 * Returns the meta object for the container reference '{@link jpl.imce.oml.specification.ecore.StructuredDataPropertyValue#getSingletonInstance <em>Singleton Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Singleton Instance</em>'.
	 * @see jpl.imce.oml.specification.ecore.StructuredDataPropertyValue#getSingletonInstance()
	 * @see #getStructuredDataPropertyValue()
	 * @generated
	 */
	EReference getStructuredDataPropertyValue_SingletonInstance();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.StructuredDataPropertyValue#getStructuredDataProperty <em>Structured Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Structured Data Property</em>'.
	 * @see jpl.imce.oml.specification.ecore.StructuredDataPropertyValue#getStructuredDataProperty()
	 * @see #getStructuredDataPropertyValue()
	 * @generated
	 */
	EReference getStructuredDataPropertyValue_StructuredDataProperty();

	/**
	 * Returns the meta object for the containment reference '{@link jpl.imce.oml.specification.ecore.StructuredDataPropertyValue#getStructuredPropertyTuple <em>Structured Property Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structured Property Tuple</em>'.
	 * @see jpl.imce.oml.specification.ecore.StructuredDataPropertyValue#getStructuredPropertyTuple()
	 * @see #getStructuredDataPropertyValue()
	 * @generated
	 */
	EReference getStructuredDataPropertyValue_StructuredPropertyTuple();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.StructuredDataPropertyValue#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.StructuredDataPropertyValue#calculateUUID()
	 * @generated
	 */
	EOperation getStructuredDataPropertyValue__CalculateUUID();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.StructuredDataPropertyValue#descriptionBox() <em>Description Box</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Description Box</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.StructuredDataPropertyValue#descriptionBox()
	 * @generated
	 */
	EOperation getStructuredDataPropertyValue__DescriptionBox();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.DataStructureTuple <em>Data Structure Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Structure Tuple</em>'.
	 * @see jpl.imce.oml.specification.ecore.DataStructureTuple
	 * @generated
	 */
	EClass getDataStructureTuple();

	/**
	 * Returns the meta object for the container reference '{@link jpl.imce.oml.specification.ecore.DataStructureTuple#getStructuredDataPropertyValue <em>Structured Data Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Structured Data Property Value</em>'.
	 * @see jpl.imce.oml.specification.ecore.DataStructureTuple#getStructuredDataPropertyValue()
	 * @see #getDataStructureTuple()
	 * @generated
	 */
	EReference getDataStructureTuple_StructuredDataPropertyValue();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.DataStructureTuple#getDataStructureType <em>Data Structure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Structure Type</em>'.
	 * @see jpl.imce.oml.specification.ecore.DataStructureTuple#getDataStructureType()
	 * @see #getDataStructureTuple()
	 * @generated
	 */
	EReference getDataStructureTuple_DataStructureType();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.DataStructureTuple#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.DataStructureTuple#calculateUUID()
	 * @generated
	 */
	EOperation getDataStructureTuple__CalculateUUID();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.DataStructureTuple#descriptionBox() <em>Description Box</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Description Box</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.DataStructureTuple#descriptionBox()
	 * @generated
	 */
	EOperation getDataStructureTuple__DescriptionBox();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.ConceptualEntitySingletonInstance <em>Conceptual Entity Singleton Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conceptual Entity Singleton Instance</em>'.
	 * @see jpl.imce.oml.specification.ecore.ConceptualEntitySingletonInstance
	 * @generated
	 */
	EClass getConceptualEntitySingletonInstance();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.ConceptualEntitySingletonInstance#conceptualEntitySingletonClassifier() <em>Conceptual Entity Singleton Classifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conceptual Entity Singleton Classifier</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.ConceptualEntitySingletonInstance#conceptualEntitySingletonClassifier()
	 * @generated
	 */
	EOperation getConceptualEntitySingletonInstance__ConceptualEntitySingletonClassifier();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.ConceptualEntitySingletonInstance#identifyingScalarValues() <em>Identifying Scalar Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Identifying Scalar Values</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.ConceptualEntitySingletonInstance#identifyingScalarValues()
	 * @generated
	 */
	EOperation getConceptualEntitySingletonInstance__IdentifyingScalarValues();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.ConceptualEntitySingletonInstance#identifyingStructuredTuples() <em>Identifying Structured Tuples</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Identifying Structured Tuples</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.ConceptualEntitySingletonInstance#identifyingStructuredTuples()
	 * @generated
	 */
	EOperation getConceptualEntitySingletonInstance__IdentifyingStructuredTuples();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.ConceptInstance <em>Concept Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept Instance</em>'.
	 * @see jpl.imce.oml.specification.ecore.ConceptInstance
	 * @generated
	 */
	EClass getConceptInstance();

	/**
	 * Returns the meta object for the container reference '{@link jpl.imce.oml.specification.ecore.ConceptInstance#getDescriptionBox <em>Description Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Description Box</em>'.
	 * @see jpl.imce.oml.specification.ecore.ConceptInstance#getDescriptionBox()
	 * @see #getConceptInstance()
	 * @generated
	 */
	EReference getConceptInstance_DescriptionBox();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.ConceptInstance#getSingletonConceptClassifier <em>Singleton Concept Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Singleton Concept Classifier</em>'.
	 * @see jpl.imce.oml.specification.ecore.ConceptInstance#getSingletonConceptClassifier()
	 * @see #getConceptInstance()
	 * @generated
	 */
	EReference getConceptInstance_SingletonConceptClassifier();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.ConceptInstance#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.ConceptInstance#calculateUUID()
	 * @generated
	 */
	EOperation getConceptInstance__CalculateUUID();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.ConceptInstance#conceptualEntitySingletonClassifier() <em>Conceptual Entity Singleton Classifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conceptual Entity Singleton Classifier</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.ConceptInstance#conceptualEntitySingletonClassifier()
	 * @generated
	 */
	EOperation getConceptInstance__ConceptualEntitySingletonClassifier();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstance <em>Reified Relationship Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reified Relationship Instance</em>'.
	 * @see jpl.imce.oml.specification.ecore.ReifiedRelationshipInstance
	 * @generated
	 */
	EClass getReifiedRelationshipInstance();

	/**
	 * Returns the meta object for the container reference '{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstance#getDescriptionBox <em>Description Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Description Box</em>'.
	 * @see jpl.imce.oml.specification.ecore.ReifiedRelationshipInstance#getDescriptionBox()
	 * @see #getReifiedRelationshipInstance()
	 * @generated
	 */
	EReference getReifiedRelationshipInstance_DescriptionBox();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstance#getSingletonReifiedRelationshipClassifier <em>Singleton Reified Relationship Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Singleton Reified Relationship Classifier</em>'.
	 * @see jpl.imce.oml.specification.ecore.ReifiedRelationshipInstance#getSingletonReifiedRelationshipClassifier()
	 * @see #getReifiedRelationshipInstance()
	 * @generated
	 */
	EReference getReifiedRelationshipInstance_SingletonReifiedRelationshipClassifier();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstance#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.ReifiedRelationshipInstance#calculateUUID()
	 * @generated
	 */
	EOperation getReifiedRelationshipInstance__CalculateUUID();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstance#conceptualEntitySingletonClassifier() <em>Conceptual Entity Singleton Classifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conceptual Entity Singleton Classifier</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.ReifiedRelationshipInstance#conceptualEntitySingletonClassifier()
	 * @generated
	 */
	EOperation getReifiedRelationshipInstance__ConceptualEntitySingletonClassifier();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceDomain <em>Reified Relationship Instance Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reified Relationship Instance Domain</em>'.
	 * @see jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceDomain
	 * @generated
	 */
	EClass getReifiedRelationshipInstanceDomain();

	/**
	 * Returns the meta object for the container reference '{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceDomain#getDescriptionBox <em>Description Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Description Box</em>'.
	 * @see jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceDomain#getDescriptionBox()
	 * @see #getReifiedRelationshipInstanceDomain()
	 * @generated
	 */
	EReference getReifiedRelationshipInstanceDomain_DescriptionBox();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceDomain#getReifiedRelationshipInstance <em>Reified Relationship Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reified Relationship Instance</em>'.
	 * @see jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceDomain#getReifiedRelationshipInstance()
	 * @see #getReifiedRelationshipInstanceDomain()
	 * @generated
	 */
	EReference getReifiedRelationshipInstanceDomain_ReifiedRelationshipInstance();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceDomain#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceDomain#getDomain()
	 * @see #getReifiedRelationshipInstanceDomain()
	 * @generated
	 */
	EReference getReifiedRelationshipInstanceDomain_Domain();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceDomain#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceDomain#calculateUUID()
	 * @generated
	 */
	EOperation getReifiedRelationshipInstanceDomain__CalculateUUID();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceRange <em>Reified Relationship Instance Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reified Relationship Instance Range</em>'.
	 * @see jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceRange
	 * @generated
	 */
	EClass getReifiedRelationshipInstanceRange();

	/**
	 * Returns the meta object for the container reference '{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceRange#getDescriptionBox <em>Description Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Description Box</em>'.
	 * @see jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceRange#getDescriptionBox()
	 * @see #getReifiedRelationshipInstanceRange()
	 * @generated
	 */
	EReference getReifiedRelationshipInstanceRange_DescriptionBox();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceRange#getReifiedRelationshipInstance <em>Reified Relationship Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reified Relationship Instance</em>'.
	 * @see jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceRange#getReifiedRelationshipInstance()
	 * @see #getReifiedRelationshipInstanceRange()
	 * @generated
	 */
	EReference getReifiedRelationshipInstanceRange_ReifiedRelationshipInstance();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceRange#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Range</em>'.
	 * @see jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceRange#getRange()
	 * @see #getReifiedRelationshipInstanceRange()
	 * @generated
	 */
	EReference getReifiedRelationshipInstanceRange_Range();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceRange#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.ReifiedRelationshipInstanceRange#calculateUUID()
	 * @generated
	 */
	EOperation getReifiedRelationshipInstanceRange__CalculateUUID();

	/**
	 * Returns the meta object for class '{@link jpl.imce.oml.specification.ecore.UnreifiedRelationshipInstanceTuple <em>Unreified Relationship Instance Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unreified Relationship Instance Tuple</em>'.
	 * @see jpl.imce.oml.specification.ecore.UnreifiedRelationshipInstanceTuple
	 * @generated
	 */
	EClass getUnreifiedRelationshipInstanceTuple();

	/**
	 * Returns the meta object for the container reference '{@link jpl.imce.oml.specification.ecore.UnreifiedRelationshipInstanceTuple#getDescriptionBox <em>Description Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Description Box</em>'.
	 * @see jpl.imce.oml.specification.ecore.UnreifiedRelationshipInstanceTuple#getDescriptionBox()
	 * @see #getUnreifiedRelationshipInstanceTuple()
	 * @generated
	 */
	EReference getUnreifiedRelationshipInstanceTuple_DescriptionBox();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.UnreifiedRelationshipInstanceTuple#getUnreifiedRelationship <em>Unreified Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unreified Relationship</em>'.
	 * @see jpl.imce.oml.specification.ecore.UnreifiedRelationshipInstanceTuple#getUnreifiedRelationship()
	 * @see #getUnreifiedRelationshipInstanceTuple()
	 * @generated
	 */
	EReference getUnreifiedRelationshipInstanceTuple_UnreifiedRelationship();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.UnreifiedRelationshipInstanceTuple#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see jpl.imce.oml.specification.ecore.UnreifiedRelationshipInstanceTuple#getDomain()
	 * @see #getUnreifiedRelationshipInstanceTuple()
	 * @generated
	 */
	EReference getUnreifiedRelationshipInstanceTuple_Domain();

	/**
	 * Returns the meta object for the reference '{@link jpl.imce.oml.specification.ecore.UnreifiedRelationshipInstanceTuple#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Range</em>'.
	 * @see jpl.imce.oml.specification.ecore.UnreifiedRelationshipInstanceTuple#getRange()
	 * @see #getUnreifiedRelationshipInstanceTuple()
	 * @generated
	 */
	EReference getUnreifiedRelationshipInstanceTuple_Range();

	/**
	 * Returns the meta object for the '{@link jpl.imce.oml.specification.ecore.UnreifiedRelationshipInstanceTuple#calculateUUID() <em>Calculate UUID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate UUID</em>' operation.
	 * @see jpl.imce.oml.specification.ecore.UnreifiedRelationshipInstanceTuple#calculateUUID()
	 * @generated
	 */
	EOperation getUnreifiedRelationshipInstanceTuple__CalculateUUID();

	/**
	 * Returns the meta object for enum '{@link jpl.imce.oml.specification.ecore.TerminologyGraphKind <em>Terminology Graph Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Terminology Graph Kind</em>'.
	 * @see jpl.imce.oml.specification.ecore.TerminologyGraphKind
	 * @generated
	 */
	EEnum getTerminologyGraphKind();

	/**
	 * Returns the meta object for enum '{@link jpl.imce.oml.specification.ecore.DescriptionKind <em>Description Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Description Kind</em>'.
	 * @see jpl.imce.oml.specification.ecore.DescriptionKind
	 * @generated
	 */
	EEnum getDescriptionKind();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>IRI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IRI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getIRI();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Local Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Local Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getLocalName();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Lexical Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Lexical Value</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getLexicalValue();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Lexical Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Lexical Number</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getLexicalNumber();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Lexical Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Lexical Time</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getLexicalTime();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pattern</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getPattern();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>UUID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getUUID();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Lang Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Lang Range</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getLangRange();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Abbrev IRI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Abbrev IRI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getAbbrevIRI();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Namespace Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Namespace Prefix</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getNamespacePrefix();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OMLFactory getOMLFactory();

} //OMLPackage
