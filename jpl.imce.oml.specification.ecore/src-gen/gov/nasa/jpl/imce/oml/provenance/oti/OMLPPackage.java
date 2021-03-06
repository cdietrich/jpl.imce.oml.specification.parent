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
package gov.nasa.jpl.imce.oml.provenance.oti;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

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
 * @see gov.nasa.jpl.imce.oml.provenance.oti.OMLPFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelName='OMLProvenance' prefix='OMLP' copyrightText='\nCopyright 2016 California Institute of Technology (\"Caltech\").\nU.S. Government sponsorship acknowledged.\n\nLicensed under the Apache License, Version 2.0 (the \"License\");\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\n\n     http://www.apache.org/licenses/LICENSE-2.0\n\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.\n' basePackage='gov.nasa.jpl.imce.oml.provenance'"
 * @generated
 */
public interface OMLPPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "oti";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "gov.nasa.jpl.imce.oml.provenance.oti";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "oti";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OMLPPackage eINSTANCE = gov.nasa.jpl.imce.oml.provenance.oti.impl.OMLPPackageImpl.init();

	/**
	 * The meta object id for the '{@link gov.nasa.jpl.imce.oml.provenance.oti.impl.OML2OTIProvenanceImpl <em>OML2OTI Provenance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nasa.jpl.imce.oml.provenance.oti.impl.OML2OTIProvenanceImpl
	 * @see gov.nasa.jpl.imce.oml.provenance.oti.impl.OMLPPackageImpl#getOML2OTIProvenance()
	 * @generated
	 */
	int OML2OTI_PROVENANCE = 0;

	/**
	 * The feature id for the '<em><b>Oml UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OML2OTI_PROVENANCE__OML_UUID = 0;

	/**
	 * The feature id for the '<em><b>Oti ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OML2OTI_PROVENANCE__OTI_ID = 1;

	/**
	 * The feature id for the '<em><b>Oti URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OML2OTI_PROVENANCE__OTI_URL = 2;

	/**
	 * The feature id for the '<em><b>Oti UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OML2OTI_PROVENANCE__OTI_UUID = 3;

	/**
	 * The feature id for the '<em><b>Explanation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OML2OTI_PROVENANCE__EXPLANATION = 4;

	/**
	 * The number of structural features of the '<em>OML2OTI Provenance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OML2OTI_PROVENANCE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>OML2OTI Provenance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OML2OTI_PROVENANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>UUID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nasa.jpl.imce.oml.provenance.oti.impl.OMLPPackageImpl#getUUID()
	 * @generated
	 */
	int UUID = 1;

	/**
	 * The meta object id for the '<em>OTI TOOL SPECIFIC ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nasa.jpl.imce.oml.provenance.oti.impl.OMLPPackageImpl#getOTI_TOOL_SPECIFIC_ID()
	 * @generated
	 */
	int OTI_TOOL_SPECIFIC_ID = 2;

	/**
	 * The meta object id for the '<em>OTI TOOL SPECIFIC UUID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nasa.jpl.imce.oml.provenance.oti.impl.OMLPPackageImpl#getOTI_TOOL_SPECIFIC_UUID()
	 * @generated
	 */
	int OTI_TOOL_SPECIFIC_UUID = 3;

	/**
	 * The meta object id for the '<em>OTI TOOL SPECIFIC URL</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.nasa.jpl.imce.oml.provenance.oti.impl.OMLPPackageImpl#getOTI_TOOL_SPECIFIC_URL()
	 * @generated
	 */
	int OTI_TOOL_SPECIFIC_URL = 4;


	/**
	 * Returns the meta object for class '{@link gov.nasa.jpl.imce.oml.provenance.oti.OML2OTIProvenance <em>OML2OTI Provenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OML2OTI Provenance</em>'.
	 * @see gov.nasa.jpl.imce.oml.provenance.oti.OML2OTIProvenance
	 * @generated
	 */
	EClass getOML2OTIProvenance();

	/**
	 * Returns the meta object for the attribute '{@link gov.nasa.jpl.imce.oml.provenance.oti.OML2OTIProvenance#getOmlUUID <em>Oml UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oml UUID</em>'.
	 * @see gov.nasa.jpl.imce.oml.provenance.oti.OML2OTIProvenance#getOmlUUID()
	 * @see #getOML2OTIProvenance()
	 * @generated
	 */
	EAttribute getOML2OTIProvenance_OmlUUID();

	/**
	 * Returns the meta object for the attribute '{@link gov.nasa.jpl.imce.oml.provenance.oti.OML2OTIProvenance#getOtiID <em>Oti ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oti ID</em>'.
	 * @see gov.nasa.jpl.imce.oml.provenance.oti.OML2OTIProvenance#getOtiID()
	 * @see #getOML2OTIProvenance()
	 * @generated
	 */
	EAttribute getOML2OTIProvenance_OtiID();

	/**
	 * Returns the meta object for the attribute '{@link gov.nasa.jpl.imce.oml.provenance.oti.OML2OTIProvenance#getOtiURL <em>Oti URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oti URL</em>'.
	 * @see gov.nasa.jpl.imce.oml.provenance.oti.OML2OTIProvenance#getOtiURL()
	 * @see #getOML2OTIProvenance()
	 * @generated
	 */
	EAttribute getOML2OTIProvenance_OtiURL();

	/**
	 * Returns the meta object for the attribute '{@link gov.nasa.jpl.imce.oml.provenance.oti.OML2OTIProvenance#getOtiUUID <em>Oti UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oti UUID</em>'.
	 * @see gov.nasa.jpl.imce.oml.provenance.oti.OML2OTIProvenance#getOtiUUID()
	 * @see #getOML2OTIProvenance()
	 * @generated
	 */
	EAttribute getOML2OTIProvenance_OtiUUID();

	/**
	 * Returns the meta object for the attribute '{@link gov.nasa.jpl.imce.oml.provenance.oti.OML2OTIProvenance#getExplanation <em>Explanation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explanation</em>'.
	 * @see gov.nasa.jpl.imce.oml.provenance.oti.OML2OTIProvenance#getExplanation()
	 * @see #getOML2OTIProvenance()
	 * @generated
	 */
	EAttribute getOML2OTIProvenance_Explanation();

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
	 * Returns the meta object for data type '{@link java.lang.String <em>OTI TOOL SPECIFIC ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>OTI TOOL SPECIFIC ID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getOTI_TOOL_SPECIFIC_ID();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>OTI TOOL SPECIFIC UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>OTI TOOL SPECIFIC UUID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getOTI_TOOL_SPECIFIC_UUID();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>OTI TOOL SPECIFIC URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>OTI TOOL SPECIFIC URL</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getOTI_TOOL_SPECIFIC_URL();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OMLPFactory getOMLPFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gov.nasa.jpl.imce.oml.provenance.oti.impl.OML2OTIProvenanceImpl <em>OML2OTI Provenance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nasa.jpl.imce.oml.provenance.oti.impl.OML2OTIProvenanceImpl
		 * @see gov.nasa.jpl.imce.oml.provenance.oti.impl.OMLPPackageImpl#getOML2OTIProvenance()
		 * @generated
		 */
		EClass OML2OTI_PROVENANCE = eINSTANCE.getOML2OTIProvenance();

		/**
		 * The meta object literal for the '<em><b>Oml UUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OML2OTI_PROVENANCE__OML_UUID = eINSTANCE.getOML2OTIProvenance_OmlUUID();

		/**
		 * The meta object literal for the '<em><b>Oti ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OML2OTI_PROVENANCE__OTI_ID = eINSTANCE.getOML2OTIProvenance_OtiID();

		/**
		 * The meta object literal for the '<em><b>Oti URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OML2OTI_PROVENANCE__OTI_URL = eINSTANCE.getOML2OTIProvenance_OtiURL();

		/**
		 * The meta object literal for the '<em><b>Oti UUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OML2OTI_PROVENANCE__OTI_UUID = eINSTANCE.getOML2OTIProvenance_OtiUUID();

		/**
		 * The meta object literal for the '<em><b>Explanation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OML2OTI_PROVENANCE__EXPLANATION = eINSTANCE.getOML2OTIProvenance_Explanation();

		/**
		 * The meta object literal for the '<em>UUID</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see gov.nasa.jpl.imce.oml.provenance.oti.impl.OMLPPackageImpl#getUUID()
		 * @generated
		 */
		EDataType UUID = eINSTANCE.getUUID();

		/**
		 * The meta object literal for the '<em>OTI TOOL SPECIFIC ID</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see gov.nasa.jpl.imce.oml.provenance.oti.impl.OMLPPackageImpl#getOTI_TOOL_SPECIFIC_ID()
		 * @generated
		 */
		EDataType OTI_TOOL_SPECIFIC_ID = eINSTANCE.getOTI_TOOL_SPECIFIC_ID();

		/**
		 * The meta object literal for the '<em>OTI TOOL SPECIFIC UUID</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see gov.nasa.jpl.imce.oml.provenance.oti.impl.OMLPPackageImpl#getOTI_TOOL_SPECIFIC_UUID()
		 * @generated
		 */
		EDataType OTI_TOOL_SPECIFIC_UUID = eINSTANCE.getOTI_TOOL_SPECIFIC_UUID();

		/**
		 * The meta object literal for the '<em>OTI TOOL SPECIFIC URL</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see gov.nasa.jpl.imce.oml.provenance.oti.impl.OMLPPackageImpl#getOTI_TOOL_SPECIFIC_URL()
		 * @generated
		 */
		EDataType OTI_TOOL_SPECIFIC_URL = eINSTANCE.getOTI_TOOL_SPECIFIC_URL();

	}

} //OMLPPackage
