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
package jpl.imce.oml.specification.ecore.impl;

import java.io.IOException;

import java.net.URL;

import jpl.imce.oml.specification.ecore.EcoreFactory;
import jpl.imce.oml.specification.ecore.EcorePackage;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcorePackageImpl extends EPackageImpl implements EcorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "ecore.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminologyThingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationPropertyTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationSubjectTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationSubjectPropertyValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminologyExtentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminologyBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminologyGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminologyBoxStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminologyBundleStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryTermKindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directedBinaryRelationshipKindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptualEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reifiedRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unreifiedRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scalarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataRelationshipDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataRelationshipFromEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataRelationshipFromStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataRelationshipRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataRelationshipToScalarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataRelationshipToStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityStructuredDataPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityScalarDataPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredDataPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scalarDataPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass axiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminologyAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminologyBoxAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminologyBundleAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptTreeDisjunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disjointUnionOfConceptsAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificDisjointConceptAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousConceptTaxonomyAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootConceptTaxonomyAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundledTerminologyAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptDesignationTerminologyAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminologyExtensionAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminologyNestingAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityRestrictionAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityExistentialRestrictionAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityUniversalRestrictionAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specializationAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aspectSpecializationAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptSpecializationAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reifiedRelationshipSpecializationAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityScalarDataPropertyRestrictionAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityScalarDataPropertyExistentialRestrictionAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityScalarDataPropertyUniversalRestrictionAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityScalarDataPropertyParticularRestrictionAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restrictedDataRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryScalarRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iriScalarRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericScalarRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plainLiteralScalarRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringScalarRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeScalarRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synonymScalarRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scalarOneOfRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scalarOneOfLiteralAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionBoxRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionBoxExtendsClosedWorldDefinitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionBoxRefinementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminologyInstanceAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singletonInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scalarDataPropertyValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredDataPropertyValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataStructureTupleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptualEntitySingletonInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reifiedRelationshipInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reifiedRelationshipInstanceDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reifiedRelationshipInstanceRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unreifiedRelationshipInstanceTupleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum terminologyGraphKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum descriptionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iriEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType localNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lexicalValueEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lexicalNumberEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lexicalTimeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType patternEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uuidEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType langRangeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType abbrevIRIEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType namespacePrefixEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see jpl.imce.oml.specification.ecore.EcorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EcorePackageImpl() {
		super(eNS_URI, EcoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EcorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static EcorePackage init() {
		if (isInited) return (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Obtain or create and register package
		EcorePackageImpl theEcorePackage = (EcorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EcorePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		org.eclipse.emf.ecore.EcorePackage.eINSTANCE.eClass();

		// Load packages
		theEcorePackage.loadPackage();

		// Fix loaded packages
		theEcorePackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theEcorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, theEcorePackage);
		return theEcorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		if (resourceEClass == null) {
			resourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(10);
		}
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResource__Iri() {
        return getResource().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResource__Name() {
        return getResource().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminologyThing() {
		if (terminologyThingEClass == null) {
			terminologyThingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(11);
		}
		return terminologyThingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTerminologyThing_Uuid() {
        return (EAttribute)getTerminologyThing().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminologyThing__CalculateUUID() {
        return getTerminologyThing().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationProperty() {
		if (annotationPropertyEClass == null) {
			annotationPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(12);
		}
		return annotationPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationProperty_Iri() {
        return (EAttribute)getAnnotationProperty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationProperty_AbbrevIRI() {
        return (EAttribute)getAnnotationProperty().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationProperty__Uuid() {
        return getAnnotationProperty().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationPropertyTable() {
		if (annotationPropertyTableEClass == null) {
			annotationPropertyTableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(13);
		}
		return annotationPropertyTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationPropertyTable_Key() {
        return (EReference)getAnnotationPropertyTable().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationPropertyTable_Value() {
        return (EReference)getAnnotationPropertyTable().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationEntry() {
		if (annotationEntryEClass == null) {
			annotationEntryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(14);
		}
		return annotationEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationEntry_Module() {
        return (EReference)getAnnotationEntry().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationEntry_Subject() {
        return (EReference)getAnnotationEntry().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationEntry_Value() {
        return (EAttribute)getAnnotationEntry().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationSubjectTable() {
		if (annotationSubjectTableEClass == null) {
			annotationSubjectTableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(15);
		}
		return annotationSubjectTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationSubjectTable_Key() {
        return (EReference)getAnnotationSubjectTable().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationSubjectTable_Value() {
        return (EReference)getAnnotationSubjectTable().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationSubjectPropertyValue() {
		if (annotationSubjectPropertyValueEClass == null) {
			annotationSubjectPropertyValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(16);
		}
		return annotationSubjectPropertyValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationSubjectPropertyValue_Property() {
        return (EReference)getAnnotationSubjectPropertyValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationSubjectPropertyValue_Value() {
        return (EAttribute)getAnnotationSubjectPropertyValue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		if (annotationEClass == null) {
			annotationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(17);
		}
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotation_Module() {
        return (EReference)getAnnotation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotation_Property() {
        return (EReference)getAnnotation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotation_Subject() {
        return (EReference)getAnnotation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Value() {
        return (EAttribute)getAnnotation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminologyExtent() {
		if (terminologyExtentEClass == null) {
			terminologyExtentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(18);
		}
		return terminologyExtentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminologyExtent_AnnotationProperties() {
        return (EReference)getTerminologyExtent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminologyExtent_TerminologyGraphs() {
        return (EReference)getTerminologyExtent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminologyExtent_Bundles() {
        return (EReference)getTerminologyExtent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminologyExtent_Descriptions() {
        return (EReference)getTerminologyExtent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		if (moduleEClass == null) {
			moduleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(19);
		}
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Iri() {
        return (EAttribute)getModule().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Annotations() {
        return (EReference)getModule().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModule__Extent() {
        return getModule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModule__CalculateUUID() {
        return getModule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModule__Iri() {
        return getModule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModule__NsPrefix() {
        return getModule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModule__Name() {
        return getModule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModule__AnnotationsBySubject() {
        return getModule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModule__AnnotationsByProperty() {
        return getModule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModule__WithAnnotations__EMap() {
        return getModule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModule__Entities() {
        return getModule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModule__Aspects() {
        return getModule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModule__Concepts() {
        return getModule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModule__ReifiedRelationships() {
        return getModule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModule__UnreifiedRelationships() {
        return getModule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModule__DataRelationships() {
        return getModule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModule__EntityScalarDataProperties() {
        return getModule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModule__Dataranges() {
        return getModule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModule__Scalars() {
        return getModule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModule__Structures() {
        return getModule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModule__TermAxioms() {
        return getModule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModule__Everything() {
        return getModule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminologyBox() {
		if (terminologyBoxEClass == null) {
			terminologyBoxEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(20);
		}
		return terminologyBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTerminologyBox_Kind() {
        return (EAttribute)getTerminologyBox().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminologyBox_TerminologyBoxAxioms() {
        return (EReference)getTerminologyBox().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminologyBox_BoxStatements() {
        return (EReference)getTerminologyBox().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminologyBox__WithBoxStatements__EList() {
        return getTerminologyBox().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminologyBox__Entities() {
        return getTerminologyBox().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminologyBox__Aspects() {
        return getTerminologyBox().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminologyBox__Concepts() {
        return getTerminologyBox().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminologyBox__ReifiedRelationships() {
        return getTerminologyBox().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminologyBox__UnreifiedRelationships() {
        return getTerminologyBox().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminologyBox__DataRelationships() {
        return getTerminologyBox().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminologyBox__EntityScalarDataProperties() {
        return getTerminologyBox().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminologyBox__Dataranges() {
        return getTerminologyBox().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminologyBox__Scalars() {
        return getTerminologyBox().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminologyBox__Structures() {
        return getTerminologyBox().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminologyBox__TermAxioms() {
        return getTerminologyBox().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminologyBox__Everything() {
        return getTerminologyBox().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundle() {
		if (bundleEClass == null) {
			bundleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(21);
		}
		return bundleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundle_BundleExtent() {
        return (EReference)getBundle().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundle_BundleStatements() {
        return (EReference)getBundle().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundle_TerminologyBundleAxioms() {
        return (EReference)getBundle().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBundle__Extent() {
        return getBundle().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBundle__WithAnnotations__EMap() {
        return getBundle().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBundle__AnnotationsByProperty() {
        return getBundle().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBundle__WithBundleStatements__EList() {
        return getBundle().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBundle__WithBoxStatements__EList() {
        return getBundle().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBundle__Everything() {
        return getBundle().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminologyGraph() {
		if (terminologyGraphEClass == null) {
			terminologyGraphEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(23);
		}
		return terminologyGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminologyGraph_GraphExtent() {
        return (EReference)getTerminologyGraph().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminologyGraph__Extent() {
        return getTerminologyGraph().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminologyGraph__WithAnnotations__EMap() {
        return getTerminologyGraph().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminologyGraph__AnnotationsByProperty() {
        return getTerminologyGraph().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminologyGraph__WithBoxStatements__EList() {
        return getTerminologyGraph().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminologyBoxStatement() {
		if (terminologyBoxStatementEClass == null) {
			terminologyBoxStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(24);
		}
		return terminologyBoxStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminologyBoxStatement_Tbox() {
        return (EReference)getTerminologyBoxStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminologyBundleStatement() {
		if (terminologyBundleStatementEClass == null) {
			terminologyBundleStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(25);
		}
		return terminologyBundleStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminologyBundleStatement_Bundle() {
        return (EReference)getTerminologyBundleStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerm() {
		if (termEClass == null) {
			termEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(26);
		}
		return termEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTerm_Name() {
        return (EAttribute)getTerm().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerm__CalculateUUID() {
        return getTerm().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerm__Iri() {
        return getTerm().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerm__Name() {
        return getTerm().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryTermKind() {
		if (unaryTermKindEClass == null) {
			unaryTermKindEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(27);
		}
		return unaryTermKindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectedBinaryRelationshipKind() {
		if (directedBinaryRelationshipKindEClass == null) {
			directedBinaryRelationshipKindEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(28);
		}
		return directedBinaryRelationshipKindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDirectedBinaryRelationshipKind__RelationDomain() {
        return getDirectedBinaryRelationshipKind().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDirectedBinaryRelationshipKind__RelationRange() {
        return getDirectedBinaryRelationshipKind().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		if (entityEClass == null) {
			entityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(29);
		}
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptualEntity() {
		if (conceptualEntityEClass == null) {
			conceptualEntityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(30);
		}
		return conceptualEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConceptualEntity_IsAbstract() {
        return (EAttribute)getConceptualEntity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAspect() {
		if (aspectEClass == null) {
			aspectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(31);
		}
		return aspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcept() {
		if (conceptEClass == null) {
			conceptEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(32);
		}
		return conceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityRelationship() {
		if (entityRelationshipEClass == null) {
			entityRelationshipEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(33);
		}
		return entityRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityRelationship_Source() {
        return (EReference)getEntityRelationship().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityRelationship_Target() {
        return (EReference)getEntityRelationship().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityRelationship_IsFunctional() {
        return (EAttribute)getEntityRelationship().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityRelationship_IsInverseFunctional() {
        return (EAttribute)getEntityRelationship().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityRelationship_IsEssential() {
        return (EAttribute)getEntityRelationship().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityRelationship_IsInverseEssential() {
        return (EAttribute)getEntityRelationship().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityRelationship_IsSymmetric() {
        return (EAttribute)getEntityRelationship().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityRelationship_IsAsymmetric() {
        return (EAttribute)getEntityRelationship().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityRelationship_IsReflexive() {
        return (EAttribute)getEntityRelationship().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityRelationship_IsIrreflexive() {
        return (EAttribute)getEntityRelationship().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityRelationship_IsTransitive() {
        return (EAttribute)getEntityRelationship().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntityRelationship__RelationDomain() {
        return getEntityRelationship().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntityRelationship__RelationRange() {
        return getEntityRelationship().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReifiedRelationship() {
		if (reifiedRelationshipEClass == null) {
			reifiedRelationshipEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(34);
		}
		return reifiedRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReifiedRelationship_UnreifiedPropertyName() {
        return (EAttribute)getReifiedRelationship().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReifiedRelationship_UnreifiedInversePropertyName() {
        return (EAttribute)getReifiedRelationship().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnreifiedRelationship() {
		if (unreifiedRelationshipEClass == null) {
			unreifiedRelationshipEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(35);
		}
		return unreifiedRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatype() {
		if (datatypeEClass == null) {
			datatypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(36);
		}
		return datatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataRange() {
		if (dataRangeEClass == null) {
			dataRangeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(37);
		}
		return dataRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScalar() {
		if (scalarEClass == null) {
			scalarEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(38);
		}
		return scalarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataRelationship() {
		if (dataRelationshipEClass == null) {
			dataRelationshipEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(39);
		}
		return dataRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataRelationship__Source() {
        return getDataRelationship().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataRelationship__RelationDomain() {
        return getDataRelationship().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataRelationship__Target() {
        return getDataRelationship().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataRelationship__RelationRange() {
        return getDataRelationship().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataRelationshipDomain() {
		if (dataRelationshipDomainEClass == null) {
			dataRelationshipDomainEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(40);
		}
		return dataRelationshipDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataRelationshipDomain__CalculateUUID() {
        return getDataRelationshipDomain().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataRelationshipFromEntity() {
		if (dataRelationshipFromEntityEClass == null) {
			dataRelationshipFromEntityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(41);
		}
		return dataRelationshipFromEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataRelationshipFromEntity_Domain() {
        return (EReference)getDataRelationshipFromEntity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataRelationshipFromEntity_IsIdentityCriteria() {
        return (EAttribute)getDataRelationshipFromEntity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataRelationshipFromStructure() {
		if (dataRelationshipFromStructureEClass == null) {
			dataRelationshipFromStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(42);
		}
		return dataRelationshipFromStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataRelationshipFromStructure_Domain() {
        return (EReference)getDataRelationshipFromStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataRelationshipRange() {
		if (dataRelationshipRangeEClass == null) {
			dataRelationshipRangeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(43);
		}
		return dataRelationshipRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataRelationshipRange__CalculateUUID() {
        return getDataRelationshipRange().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataRelationshipToScalar() {
		if (dataRelationshipToScalarEClass == null) {
			dataRelationshipToScalarEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(44);
		}
		return dataRelationshipToScalarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataRelationshipToScalar_Range() {
        return (EReference)getDataRelationshipToScalar().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataRelationshipToStructure() {
		if (dataRelationshipToStructureEClass == null) {
			dataRelationshipToStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(45);
		}
		return dataRelationshipToStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataRelationshipToStructure_Range() {
        return (EReference)getDataRelationshipToStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityStructuredDataProperty() {
		if (entityStructuredDataPropertyEClass == null) {
			entityStructuredDataPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(46);
		}
		return entityStructuredDataPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntityStructuredDataProperty__Source() {
        return getEntityStructuredDataProperty().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntityStructuredDataProperty__Target() {
        return getEntityStructuredDataProperty().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityScalarDataProperty() {
		if (entityScalarDataPropertyEClass == null) {
			entityScalarDataPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(47);
		}
		return entityScalarDataPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntityScalarDataProperty__Source() {
        return getEntityScalarDataProperty().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntityScalarDataProperty__Target() {
        return getEntityScalarDataProperty().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredDataProperty() {
		if (structuredDataPropertyEClass == null) {
			structuredDataPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(48);
		}
		return structuredDataPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStructuredDataProperty__Source() {
        return getStructuredDataProperty().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStructuredDataProperty__Target() {
        return getStructuredDataProperty().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScalarDataProperty() {
		if (scalarDataPropertyEClass == null) {
			scalarDataPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(49);
		}
		return scalarDataPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScalarDataProperty__Source() {
        return getScalarDataProperty().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScalarDataProperty__Target() {
        return getScalarDataProperty().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructure() {
		if (structureEClass == null) {
			structureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(50);
		}
		return structureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAxiom() {
		if (axiomEClass == null) {
			axiomEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(51);
		}
		return axiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminologyAxiom() {
		if (terminologyAxiomEClass == null) {
			terminologyAxiomEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(52);
		}
		return terminologyAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminologyAxiom__Source() {
        return getTerminologyAxiom().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminologyAxiom__Target() {
        return getTerminologyAxiom().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminologyBoxAxiom() {
		if (terminologyBoxAxiomEClass == null) {
			terminologyBoxAxiomEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(53);
		}
		return terminologyBoxAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminologyBoxAxiom_Tbox() {
        return (EReference)getTerminologyBoxAxiom().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminologyBundleAxiom() {
		if (terminologyBundleAxiomEClass == null) {
			terminologyBundleAxiomEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(54);
		}
		return terminologyBundleAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminologyBundleAxiom_TerminologyBundle() {
        return (EReference)getTerminologyBundleAxiom().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptTreeDisjunction() {
		if (conceptTreeDisjunctionEClass == null) {
			conceptTreeDisjunctionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(55);
		}
		return conceptTreeDisjunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConceptTreeDisjunction__CalculateUUID() {
        return getConceptTreeDisjunction().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisjointUnionOfConceptsAxiom() {
		if (disjointUnionOfConceptsAxiomEClass == null) {
			disjointUnionOfConceptsAxiomEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(56);
		}
		return disjointUnionOfConceptsAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjointUnionOfConceptsAxiom_DisjointTaxonomyParent() {
        return (EReference)getDisjointUnionOfConceptsAxiom().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificDisjointConceptAxiom() {
		if (specificDisjointConceptAxiomEClass == null) {
			specificDisjointConceptAxiomEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(57);
		}
		return specificDisjointConceptAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificDisjointConceptAxiom_DisjointLeaf() {
        return (EReference)getSpecificDisjointConceptAxiom().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpecificDisjointConceptAxiom__CalculateUUID() {
        return getSpecificDisjointConceptAxiom().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnonymousConceptTaxonomyAxiom() {
		if (anonymousConceptTaxonomyAxiomEClass == null) {
			anonymousConceptTaxonomyAxiomEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(58);
		}
		return anonymousConceptTaxonomyAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnonymousConceptTaxonomyAxiom__CalculateUUID() {
        return getAnonymousConceptTaxonomyAxiom().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootConceptTaxonomyAxiom() {
		if (rootConceptTaxonomyAxiomEClass == null) {
			rootConceptTaxonomyAxiomEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(59);
		}
		return rootConceptTaxonomyAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootConceptTaxonomyAxiom_Root() {
        return (EReference)getRootConceptTaxonomyAxiom().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRootConceptTaxonomyAxiom__CalculateUUID() {
        return getRootConceptTaxonomyAxiom().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundledTerminologyAxiom() {
		if (bundledTerminologyAxiomEClass == null) {
			bundledTerminologyAxiomEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(60);
		}
		return bundledTerminologyAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundledTerminologyAxiom_BundledTerminology() {
        return (EReference)getBundledTerminologyAxiom().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBundledTerminologyAxiom__CalculateUUID() {
        return getBundledTerminologyAxiom().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBundledTerminologyAxiom__Source() {
        return getBundledTerminologyAxiom().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBundledTerminologyAxiom__Target() {
        return getBundledTerminologyAxiom().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptDesignationTerminologyAxiom() {
		if (conceptDesignationTerminologyAxiomEClass == null) {
			conceptDesignationTerminologyAxiomEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(61);
		}
		return conceptDesignationTerminologyAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptDesignationTerminologyAxiom_DesignatedTerminology() {
        return (EReference)getConceptDesignationTerminologyAxiom().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptDesignationTerminologyAxiom_DesignatedConcept() {
        return (EReference)getConceptDesignationTerminologyAxiom().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConceptDesignationTerminologyAxiom__CalculateUUID() {
        return getConceptDesignationTerminologyAxiom().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConceptDesignationTerminologyAxiom__DesignationTerminologyGraph() {
        return getConceptDesignationTerminologyAxiom().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConceptDesignationTerminologyAxiom__Source() {
        return getConceptDesignationTerminologyAxiom().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConceptDesignationTerminologyAxiom__Target() {
        return getConceptDesignationTerminologyAxiom().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminologyExtensionAxiom() {
		if (terminologyExtensionAxiomEClass == null) {
			terminologyExtensionAxiomEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(62);
		}
		return terminologyExtensionAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminologyExtensionAxiom_ExtendedTerminology() {
        return (EReference)getTerminologyExtensionAxiom().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminologyExtensionAxiom__CalculateUUID() {
        return getTerminologyExtensionAxiom().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminologyExtensionAxiom__ExtendingTerminology() {
        return getTerminologyExtensionAxiom().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminologyExtensionAxiom__Source() {
        return getTerminologyExtensionAxiom().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminologyExtensionAxiom__Target() {
        return getTerminologyExtensionAxiom().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminologyNestingAxiom() {
		if (terminologyNestingAxiomEClass == null) {
			terminologyNestingAxiomEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(63);
		}
		return terminologyNestingAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminologyNestingAxiom_NestingTerminology() {
        return (EReference)getTerminologyNestingAxiom().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminologyNestingAxiom_NestingContext() {
        return (EReference)getTerminologyNestingAxiom().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminologyNestingAxiom__CalculateUUID() {
        return getTerminologyNestingAxiom().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminologyNestingAxiom__NestedTerminology() {
        return getTerminologyNestingAxiom().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminologyNestingAxiom__Source() {
        return getTerminologyNestingAxiom().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminologyNestingAxiom__Target() {
        return getTerminologyNestingAxiom().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTermAxiom() {
		if (termAxiomEClass == null) {
			termAxiomEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(64);
		}
		return termAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityRestrictionAxiom() {
		if (entityRestrictionAxiomEClass == null) {
			entityRestrictionAxiomEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(65);
		}
		return entityRestrictionAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityRestrictionAxiom_RestrictedRelation() {
        return (EReference)getEntityRestrictionAxiom().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityRestrictionAxiom_RestrictedRange() {
        return (EReference)getEntityRestrictionAxiom().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityRestrictionAxiom_RestrictedDomain() {
        return (EReference)getEntityRestrictionAxiom().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityExistentialRestrictionAxiom() {
		if (entityExistentialRestrictionAxiomEClass == null) {
			entityExistentialRestrictionAxiomEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(66);
		}
		return entityExistentialRestrictionAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntityExistentialRestrictionAxiom__CalculateUUID() {
        return getEntityExistentialRestrictionAxiom().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityUniversalRestrictionAxiom() {
		if (entityUniversalRestrictionAxiomEClass == null) {
			entityUniversalRestrictionAxiomEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(67);
		}
		return entityUniversalRestrictionAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntityUniversalRestrictionAxiom__CalculateUUID() {
        return getEntityUniversalRestrictionAxiom().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecializationAxiom() {
		if (specializationAxiomEClass == null) {
			specializationAxiomEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(68);
		}
		return specializationAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpecializationAxiom__Child() {
        return getSpecializationAxiom().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpecializationAxiom__Parent() {
        return getSpecializationAxiom().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAspectSpecializationAxiom() {
		if (aspectSpecializationAxiomEClass == null) {
			aspectSpecializationAxiomEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(69);
		}
		return aspectSpecializationAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAspectSpecializationAxiom_SubEntity() {
        return (EReference)getAspectSpecializationAxiom().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAspectSpecializationAxiom_SuperAspect() {
        return (EReference)getAspectSpecializationAxiom().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAspectSpecializationAxiom__CalculateUUID() {
        return getAspectSpecializationAxiom().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAspectSpecializationAxiom__Child() {
        return getAspectSpecializationAxiom().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAspectSpecializationAxiom__Parent() {
        return getAspectSpecializationAxiom().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptSpecializationAxiom() {
		if (conceptSpecializationAxiomEClass == null) {
			conceptSpecializationAxiomEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(70);
		}
		return conceptSpecializationAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptSpecializationAxiom_SubConcept() {
        return (EReference)getConceptSpecializationAxiom().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptSpecializationAxiom_SuperConcept() {
        return (EReference)getConceptSpecializationAxiom().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConceptSpecializationAxiom__CalculateUUID() {
        return getConceptSpecializationAxiom().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConceptSpecializationAxiom__Child() {
        return getConceptSpecializationAxiom().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConceptSpecializationAxiom__Parent() {
        return getConceptSpecializationAxiom().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReifiedRelationshipSpecializationAxiom() {
		if (reifiedRelationshipSpecializationAxiomEClass == null) {
			reifiedRelationshipSpecializationAxiomEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(71);
		}
		return reifiedRelationshipSpecializationAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReifiedRelationshipSpecializationAxiom_SubRelationship() {
        return (EReference)getReifiedRelationshipSpecializationAxiom().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReifiedRelationshipSpecializationAxiom_SuperRelationship() {
        return (EReference)getReifiedRelationshipSpecializationAxiom().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReifiedRelationshipSpecializationAxiom__CalculateUUID() {
        return getReifiedRelationshipSpecializationAxiom().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReifiedRelationshipSpecializationAxiom__Child() {
        return getReifiedRelationshipSpecializationAxiom().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReifiedRelationshipSpecializationAxiom__Parent() {
        return getReifiedRelationshipSpecializationAxiom().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityScalarDataPropertyRestrictionAxiom() {
		if (entityScalarDataPropertyRestrictionAxiomEClass == null) {
			entityScalarDataPropertyRestrictionAxiomEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(72);
		}
		return entityScalarDataPropertyRestrictionAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityScalarDataPropertyRestrictionAxiom_RestrictedEntity() {
        return (EReference)getEntityScalarDataPropertyRestrictionAxiom().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityScalarDataPropertyRestrictionAxiom_ScalarProperty() {
        return (EReference)getEntityScalarDataPropertyRestrictionAxiom().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityScalarDataPropertyExistentialRestrictionAxiom() {
		if (entityScalarDataPropertyExistentialRestrictionAxiomEClass == null) {
			entityScalarDataPropertyExistentialRestrictionAxiomEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(73);
		}
		return entityScalarDataPropertyExistentialRestrictionAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityScalarDataPropertyExistentialRestrictionAxiom_ScalarRestriction() {
        return (EReference)getEntityScalarDataPropertyExistentialRestrictionAxiom().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntityScalarDataPropertyExistentialRestrictionAxiom__CalculateUUID() {
        return getEntityScalarDataPropertyExistentialRestrictionAxiom().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityScalarDataPropertyUniversalRestrictionAxiom() {
		if (entityScalarDataPropertyUniversalRestrictionAxiomEClass == null) {
			entityScalarDataPropertyUniversalRestrictionAxiomEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(74);
		}
		return entityScalarDataPropertyUniversalRestrictionAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityScalarDataPropertyUniversalRestrictionAxiom_ScalarRestriction() {
        return (EReference)getEntityScalarDataPropertyUniversalRestrictionAxiom().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntityScalarDataPropertyUniversalRestrictionAxiom__CalculateUUID() {
        return getEntityScalarDataPropertyUniversalRestrictionAxiom().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityScalarDataPropertyParticularRestrictionAxiom() {
		if (entityScalarDataPropertyParticularRestrictionAxiomEClass == null) {
			entityScalarDataPropertyParticularRestrictionAxiomEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(75);
		}
		return entityScalarDataPropertyParticularRestrictionAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityScalarDataPropertyParticularRestrictionAxiom_LiteralValue() {
        return (EAttribute)getEntityScalarDataPropertyParticularRestrictionAxiom().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntityScalarDataPropertyParticularRestrictionAxiom__CalculateUUID() {
        return getEntityScalarDataPropertyParticularRestrictionAxiom().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestrictedDataRange() {
		if (restrictedDataRangeEClass == null) {
			restrictedDataRangeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(76);
		}
		return restrictedDataRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestrictedDataRange_RestrictedRange() {
        return (EReference)getRestrictedDataRange().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryScalarRestriction() {
		if (binaryScalarRestrictionEClass == null) {
			binaryScalarRestrictionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(77);
		}
		return binaryScalarRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryScalarRestriction_Length() {
        return (EAttribute)getBinaryScalarRestriction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryScalarRestriction_MinLength() {
        return (EAttribute)getBinaryScalarRestriction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryScalarRestriction_MaxLength() {
        return (EAttribute)getBinaryScalarRestriction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBinaryScalarRestriction__CalculateUUID() {
        return getBinaryScalarRestriction().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIRIScalarRestriction() {
		if (iriScalarRestrictionEClass == null) {
			iriScalarRestrictionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(78);
		}
		return iriScalarRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIRIScalarRestriction_Length() {
        return (EAttribute)getIRIScalarRestriction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIRIScalarRestriction_MinLength() {
        return (EAttribute)getIRIScalarRestriction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIRIScalarRestriction_MaxLength() {
        return (EAttribute)getIRIScalarRestriction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIRIScalarRestriction_Pattern() {
        return (EAttribute)getIRIScalarRestriction().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRIScalarRestriction__CalculateUUID() {
        return getIRIScalarRestriction().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericScalarRestriction() {
		if (numericScalarRestrictionEClass == null) {
			numericScalarRestrictionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(79);
		}
		return numericScalarRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericScalarRestriction_MinInclusive() {
        return (EAttribute)getNumericScalarRestriction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericScalarRestriction_MaxInclusive() {
        return (EAttribute)getNumericScalarRestriction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericScalarRestriction_MinExclusive() {
        return (EAttribute)getNumericScalarRestriction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericScalarRestriction_MaxExclusive() {
        return (EAttribute)getNumericScalarRestriction().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNumericScalarRestriction__CalculateUUID() {
        return getNumericScalarRestriction().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlainLiteralScalarRestriction() {
		if (plainLiteralScalarRestrictionEClass == null) {
			plainLiteralScalarRestrictionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(80);
		}
		return plainLiteralScalarRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainLiteralScalarRestriction_Length() {
        return (EAttribute)getPlainLiteralScalarRestriction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainLiteralScalarRestriction_MinLength() {
        return (EAttribute)getPlainLiteralScalarRestriction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainLiteralScalarRestriction_MaxLength() {
        return (EAttribute)getPlainLiteralScalarRestriction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainLiteralScalarRestriction_Pattern() {
        return (EAttribute)getPlainLiteralScalarRestriction().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainLiteralScalarRestriction_LangRange() {
        return (EAttribute)getPlainLiteralScalarRestriction().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlainLiteralScalarRestriction__CalculateUUID() {
        return getPlainLiteralScalarRestriction().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringScalarRestriction() {
		if (stringScalarRestrictionEClass == null) {
			stringScalarRestrictionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(81);
		}
		return stringScalarRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringScalarRestriction_Length() {
        return (EAttribute)getStringScalarRestriction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringScalarRestriction_MinLength() {
        return (EAttribute)getStringScalarRestriction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringScalarRestriction_MaxLength() {
        return (EAttribute)getStringScalarRestriction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringScalarRestriction_Pattern() {
        return (EAttribute)getStringScalarRestriction().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStringScalarRestriction__CalculateUUID() {
        return getStringScalarRestriction().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeScalarRestriction() {
		if (timeScalarRestrictionEClass == null) {
			timeScalarRestrictionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(82);
		}
		return timeScalarRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeScalarRestriction_MinInclusive() {
        return (EAttribute)getTimeScalarRestriction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeScalarRestriction_MaxInclusive() {
        return (EAttribute)getTimeScalarRestriction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeScalarRestriction_MinExclusive() {
        return (EAttribute)getTimeScalarRestriction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeScalarRestriction_MaxExclusive() {
        return (EAttribute)getTimeScalarRestriction().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeScalarRestriction__CalculateUUID() {
        return getTimeScalarRestriction().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynonymScalarRestriction() {
		if (synonymScalarRestrictionEClass == null) {
			synonymScalarRestrictionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(83);
		}
		return synonymScalarRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSynonymScalarRestriction__CalculateUUID() {
        return getSynonymScalarRestriction().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScalarOneOfRestriction() {
		if (scalarOneOfRestrictionEClass == null) {
			scalarOneOfRestrictionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(84);
		}
		return scalarOneOfRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScalarOneOfRestriction__CalculateUUID() {
        return getScalarOneOfRestriction().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScalarOneOfLiteralAxiom() {
		if (scalarOneOfLiteralAxiomEClass == null) {
			scalarOneOfLiteralAxiomEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(85);
		}
		return scalarOneOfLiteralAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScalarOneOfLiteralAxiom_Axiom() {
        return (EReference)getScalarOneOfLiteralAxiom().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScalarOneOfLiteralAxiom_Value() {
        return (EAttribute)getScalarOneOfLiteralAxiom().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScalarOneOfLiteralAxiom__CalculateUUID() {
        return getScalarOneOfLiteralAxiom().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptionBox() {
		if (descriptionBoxEClass == null) {
			descriptionBoxEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(87);
		}
		return descriptionBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptionBox_Kind() {
        return (EAttribute)getDescriptionBox().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescriptionBox_DescriptionExtent() {
        return (EReference)getDescriptionBox().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescriptionBox_ClosedWorldDefinitions() {
        return (EReference)getDescriptionBox().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescriptionBox_DescriptionBoxRefinements() {
        return (EReference)getDescriptionBox().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescriptionBox_ConceptInstances() {
        return (EReference)getDescriptionBox().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescriptionBox_ReifiedRelationshipInstances() {
        return (EReference)getDescriptionBox().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescriptionBox_ReifiedRelationshipInstanceDomains() {
        return (EReference)getDescriptionBox().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescriptionBox_ReifiedRelationshipInstanceRanges() {
        return (EReference)getDescriptionBox().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescriptionBox_UnreifiedRelationshipInstanceTuples() {
        return (EReference)getDescriptionBox().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDescriptionBox__WithAnnotations__EMap() {
        return getDescriptionBox().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDescriptionBox__AnnotationsByProperty() {
        return getDescriptionBox().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDescriptionBox__Extent() {
        return getDescriptionBox().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDescriptionBox__Entities() {
        return getDescriptionBox().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDescriptionBox__Aspects() {
        return getDescriptionBox().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDescriptionBox__Concepts() {
        return getDescriptionBox().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDescriptionBox__ReifiedRelationships() {
        return getDescriptionBox().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDescriptionBox__UnreifiedRelationships() {
        return getDescriptionBox().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDescriptionBox__DataRelationships() {
        return getDescriptionBox().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDescriptionBox__EntityScalarDataProperties() {
        return getDescriptionBox().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDescriptionBox__Dataranges() {
        return getDescriptionBox().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDescriptionBox__Scalars() {
        return getDescriptionBox().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDescriptionBox__Structures() {
        return getDescriptionBox().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDescriptionBox__TermAxioms() {
        return getDescriptionBox().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDescriptionBox__Everything() {
        return getDescriptionBox().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptionBoxRelationship() {
		if (descriptionBoxRelationshipEClass == null) {
			descriptionBoxRelationshipEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(88);
		}
		return descriptionBoxRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDescriptionBoxRelationship__DescriptionDomain() {
        return getDescriptionBoxRelationship().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDescriptionBoxRelationship__TargetModule() {
        return getDescriptionBoxRelationship().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptionBoxExtendsClosedWorldDefinitions() {
		if (descriptionBoxExtendsClosedWorldDefinitionsEClass == null) {
			descriptionBoxExtendsClosedWorldDefinitionsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(89);
		}
		return descriptionBoxExtendsClosedWorldDefinitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescriptionBoxExtendsClosedWorldDefinitions_DescriptionBox() {
        return (EReference)getDescriptionBoxExtendsClosedWorldDefinitions().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescriptionBoxExtendsClosedWorldDefinitions_ClosedWorldDefinitions() {
        return (EReference)getDescriptionBoxExtendsClosedWorldDefinitions().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDescriptionBoxExtendsClosedWorldDefinitions__CalculateUUID() {
        return getDescriptionBoxExtendsClosedWorldDefinitions().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDescriptionBoxExtendsClosedWorldDefinitions__DescriptionDomain() {
        return getDescriptionBoxExtendsClosedWorldDefinitions().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDescriptionBoxExtendsClosedWorldDefinitions__TargetModule() {
        return getDescriptionBoxExtendsClosedWorldDefinitions().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptionBoxRefinement() {
		if (descriptionBoxRefinementEClass == null) {
			descriptionBoxRefinementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(90);
		}
		return descriptionBoxRefinementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescriptionBoxRefinement_RefiningDescriptionBox() {
        return (EReference)getDescriptionBoxRefinement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescriptionBoxRefinement_RefinedDescriptionBox() {
        return (EReference)getDescriptionBoxRefinement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDescriptionBoxRefinement__CalculateUUID() {
        return getDescriptionBoxRefinement().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDescriptionBoxRefinement__DescriptionDomain() {
        return getDescriptionBoxRefinement().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDescriptionBoxRefinement__TargetModule() {
        return getDescriptionBoxRefinement().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminologyInstanceAssertion() {
		if (terminologyInstanceAssertionEClass == null) {
			terminologyInstanceAssertionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(91);
		}
		return terminologyInstanceAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTerminologyInstanceAssertion_Name() {
        return (EAttribute)getTerminologyInstanceAssertion().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminologyInstanceAssertion__DescriptionBox() {
        return getTerminologyInstanceAssertion().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminologyInstanceAssertion__CalculateUUID() {
        return getTerminologyInstanceAssertion().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminologyInstanceAssertion__Iri() {
        return getTerminologyInstanceAssertion().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminologyInstanceAssertion__Name() {
        return getTerminologyInstanceAssertion().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingletonInstance() {
		if (singletonInstanceEClass == null) {
			singletonInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(92);
		}
		return singletonInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingletonInstance_ScalarDataPropertyValues() {
        return (EReference)getSingletonInstance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingletonInstance_StructuredDataPropertyValues() {
        return (EReference)getSingletonInstance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScalarDataPropertyValue() {
		if (scalarDataPropertyValueEClass == null) {
			scalarDataPropertyValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(93);
		}
		return scalarDataPropertyValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScalarDataPropertyValue_SingletonInstance() {
        return (EReference)getScalarDataPropertyValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScalarDataPropertyValue_ScalarDataProperty() {
        return (EReference)getScalarDataPropertyValue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScalarDataPropertyValue_ScalarPropertyValue() {
        return (EAttribute)getScalarDataPropertyValue().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScalarDataPropertyValue__CalculateUUID() {
        return getScalarDataPropertyValue().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScalarDataPropertyValue__DescriptionBox() {
        return getScalarDataPropertyValue().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredDataPropertyValue() {
		if (structuredDataPropertyValueEClass == null) {
			structuredDataPropertyValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(94);
		}
		return structuredDataPropertyValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredDataPropertyValue_SingletonInstance() {
        return (EReference)getStructuredDataPropertyValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredDataPropertyValue_StructuredDataProperty() {
        return (EReference)getStructuredDataPropertyValue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredDataPropertyValue_StructuredPropertyTuple() {
        return (EReference)getStructuredDataPropertyValue().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStructuredDataPropertyValue__CalculateUUID() {
        return getStructuredDataPropertyValue().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStructuredDataPropertyValue__DescriptionBox() {
        return getStructuredDataPropertyValue().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataStructureTuple() {
		if (dataStructureTupleEClass == null) {
			dataStructureTupleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(95);
		}
		return dataStructureTupleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataStructureTuple_StructuredDataPropertyValue() {
        return (EReference)getDataStructureTuple().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataStructureTuple_DataStructureType() {
        return (EReference)getDataStructureTuple().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataStructureTuple__CalculateUUID() {
        return getDataStructureTuple().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataStructureTuple__DescriptionBox() {
        return getDataStructureTuple().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptualEntitySingletonInstance() {
		if (conceptualEntitySingletonInstanceEClass == null) {
			conceptualEntitySingletonInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(96);
		}
		return conceptualEntitySingletonInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConceptualEntitySingletonInstance__ConceptualEntitySingletonClassifier() {
        return getConceptualEntitySingletonInstance().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConceptualEntitySingletonInstance__IdentifyingScalarValues() {
        return getConceptualEntitySingletonInstance().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConceptualEntitySingletonInstance__IdentifyingStructuredTuples() {
        return getConceptualEntitySingletonInstance().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptInstance() {
		if (conceptInstanceEClass == null) {
			conceptInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(97);
		}
		return conceptInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptInstance_DescriptionBox() {
        return (EReference)getConceptInstance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptInstance_SingletonConceptClassifier() {
        return (EReference)getConceptInstance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConceptInstance__CalculateUUID() {
        return getConceptInstance().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConceptInstance__ConceptualEntitySingletonClassifier() {
        return getConceptInstance().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReifiedRelationshipInstance() {
		if (reifiedRelationshipInstanceEClass == null) {
			reifiedRelationshipInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(98);
		}
		return reifiedRelationshipInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReifiedRelationshipInstance_DescriptionBox() {
        return (EReference)getReifiedRelationshipInstance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReifiedRelationshipInstance_SingletonReifiedRelationshipClassifier() {
        return (EReference)getReifiedRelationshipInstance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReifiedRelationshipInstance__CalculateUUID() {
        return getReifiedRelationshipInstance().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReifiedRelationshipInstance__ConceptualEntitySingletonClassifier() {
        return getReifiedRelationshipInstance().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReifiedRelationshipInstanceDomain() {
		if (reifiedRelationshipInstanceDomainEClass == null) {
			reifiedRelationshipInstanceDomainEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(99);
		}
		return reifiedRelationshipInstanceDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReifiedRelationshipInstanceDomain_DescriptionBox() {
        return (EReference)getReifiedRelationshipInstanceDomain().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReifiedRelationshipInstanceDomain_ReifiedRelationshipInstance() {
        return (EReference)getReifiedRelationshipInstanceDomain().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReifiedRelationshipInstanceDomain_Domain() {
        return (EReference)getReifiedRelationshipInstanceDomain().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReifiedRelationshipInstanceDomain__CalculateUUID() {
        return getReifiedRelationshipInstanceDomain().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReifiedRelationshipInstanceRange() {
		if (reifiedRelationshipInstanceRangeEClass == null) {
			reifiedRelationshipInstanceRangeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(100);
		}
		return reifiedRelationshipInstanceRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReifiedRelationshipInstanceRange_DescriptionBox() {
        return (EReference)getReifiedRelationshipInstanceRange().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReifiedRelationshipInstanceRange_ReifiedRelationshipInstance() {
        return (EReference)getReifiedRelationshipInstanceRange().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReifiedRelationshipInstanceRange_Range() {
        return (EReference)getReifiedRelationshipInstanceRange().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReifiedRelationshipInstanceRange__CalculateUUID() {
        return getReifiedRelationshipInstanceRange().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnreifiedRelationshipInstanceTuple() {
		if (unreifiedRelationshipInstanceTupleEClass == null) {
			unreifiedRelationshipInstanceTupleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(101);
		}
		return unreifiedRelationshipInstanceTupleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnreifiedRelationshipInstanceTuple_DescriptionBox() {
        return (EReference)getUnreifiedRelationshipInstanceTuple().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnreifiedRelationshipInstanceTuple_UnreifiedRelationship() {
        return (EReference)getUnreifiedRelationshipInstanceTuple().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnreifiedRelationshipInstanceTuple_Domain() {
        return (EReference)getUnreifiedRelationshipInstanceTuple().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnreifiedRelationshipInstanceTuple_Range() {
        return (EReference)getUnreifiedRelationshipInstanceTuple().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnreifiedRelationshipInstanceTuple__CalculateUUID() {
        return getUnreifiedRelationshipInstanceTuple().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTerminologyGraphKind() {
		if (terminologyGraphKindEEnum == null) {
			terminologyGraphKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(22);
		}
		return terminologyGraphKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDescriptionKind() {
		if (descriptionKindEEnum == null) {
			descriptionKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(86);
		}
		return descriptionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIRI() {
		if (iriEDataType == null) {
			iriEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(0);
		}
		return iriEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLocalName() {
		if (localNameEDataType == null) {
			localNameEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(1);
		}
		return localNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLexicalValue() {
		if (lexicalValueEDataType == null) {
			lexicalValueEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(2);
		}
		return lexicalValueEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLexicalNumber() {
		if (lexicalNumberEDataType == null) {
			lexicalNumberEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(3);
		}
		return lexicalNumberEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLexicalTime() {
		if (lexicalTimeEDataType == null) {
			lexicalTimeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(4);
		}
		return lexicalTimeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPattern() {
		if (patternEDataType == null) {
			patternEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(5);
		}
		return patternEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUUID() {
		if (uuidEDataType == null) {
			uuidEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(6);
		}
		return uuidEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLangRange() {
		if (langRangeEDataType == null) {
			langRangeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(7);
		}
		return langRangeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAbbrevIRI() {
		if (abbrevIRIEDataType == null) {
			abbrevIRIEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(8);
		}
		return abbrevIRIEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNamespacePrefix() {
		if (namespacePrefixEDataType == null) {
			namespacePrefixEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI).getEClassifiers().get(9);
		}
		return namespacePrefixEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreFactory getEcoreFactory() {
		return (EcoreFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("jpl.imce.oml.specification.ecore." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //EcorePackageImpl
