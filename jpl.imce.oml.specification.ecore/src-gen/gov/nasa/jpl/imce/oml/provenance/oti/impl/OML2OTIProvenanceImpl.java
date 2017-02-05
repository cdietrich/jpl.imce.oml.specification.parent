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
package gov.nasa.jpl.imce.oml.provenance.oti.impl;

import gov.nasa.jpl.imce.oml.provenance.oti.OML2OTIProvenance;
import gov.nasa.jpl.imce.oml.provenance.oti.OMLPPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OML2OTI Provenance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nasa.jpl.imce.oml.provenance.oti.impl.OML2OTIProvenanceImpl#getOmlUUID <em>Oml UUID</em>}</li>
 *   <li>{@link gov.nasa.jpl.imce.oml.provenance.oti.impl.OML2OTIProvenanceImpl#getOtiID <em>Oti ID</em>}</li>
 *   <li>{@link gov.nasa.jpl.imce.oml.provenance.oti.impl.OML2OTIProvenanceImpl#getOtiURL <em>Oti URL</em>}</li>
 *   <li>{@link gov.nasa.jpl.imce.oml.provenance.oti.impl.OML2OTIProvenanceImpl#getOtiUUID <em>Oti UUID</em>}</li>
 *   <li>{@link gov.nasa.jpl.imce.oml.provenance.oti.impl.OML2OTIProvenanceImpl#getExplanation <em>Explanation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OML2OTIProvenanceImpl extends MinimalEObjectImpl.Container implements OML2OTIProvenance {
	/**
	 * The default value of the '{@link #getOmlUUID() <em>Oml UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOmlUUID()
	 * @generated
	 * @ordered
	 */
	protected static final String OML_UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOmlUUID() <em>Oml UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOmlUUID()
	 * @generated
	 * @ordered
	 */
	protected String omlUUID = OML_UUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtiID() <em>Oti ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtiID()
	 * @generated
	 * @ordered
	 */
	protected static final String OTI_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtiID() <em>Oti ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtiID()
	 * @generated
	 * @ordered
	 */
	protected String otiID = OTI_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtiURL() <em>Oti URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtiURL()
	 * @generated
	 * @ordered
	 */
	protected static final String OTI_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtiURL() <em>Oti URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtiURL()
	 * @generated
	 * @ordered
	 */
	protected String otiURL = OTI_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtiUUID() <em>Oti UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtiUUID()
	 * @generated
	 * @ordered
	 */
	protected static final String OTI_UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtiUUID() <em>Oti UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtiUUID()
	 * @generated
	 * @ordered
	 */
	protected String otiUUID = OTI_UUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getExplanation() <em>Explanation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplanation()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPLANATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExplanation() <em>Explanation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplanation()
	 * @generated
	 * @ordered
	 */
	protected String explanation = EXPLANATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OML2OTIProvenanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMLPPackage.Literals.OML2OTI_PROVENANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOmlUUID() {
		return omlUUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOmlUUID(String newOmlUUID) {
		String oldOmlUUID = omlUUID;
		omlUUID = newOmlUUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPPackage.OML2OTI_PROVENANCE__OML_UUID, oldOmlUUID, omlUUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtiID() {
		return otiID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtiID(String newOtiID) {
		String oldOtiID = otiID;
		otiID = newOtiID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPPackage.OML2OTI_PROVENANCE__OTI_ID, oldOtiID, otiID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtiURL() {
		return otiURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtiURL(String newOtiURL) {
		String oldOtiURL = otiURL;
		otiURL = newOtiURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPPackage.OML2OTI_PROVENANCE__OTI_URL, oldOtiURL, otiURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtiUUID() {
		return otiUUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtiUUID(String newOtiUUID) {
		String oldOtiUUID = otiUUID;
		otiUUID = newOtiUUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPPackage.OML2OTI_PROVENANCE__OTI_UUID, oldOtiUUID, otiUUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExplanation() {
		return explanation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExplanation(String newExplanation) {
		String oldExplanation = explanation;
		explanation = newExplanation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPPackage.OML2OTI_PROVENANCE__EXPLANATION, oldExplanation, explanation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMLPPackage.OML2OTI_PROVENANCE__OML_UUID:
				return getOmlUUID();
			case OMLPPackage.OML2OTI_PROVENANCE__OTI_ID:
				return getOtiID();
			case OMLPPackage.OML2OTI_PROVENANCE__OTI_URL:
				return getOtiURL();
			case OMLPPackage.OML2OTI_PROVENANCE__OTI_UUID:
				return getOtiUUID();
			case OMLPPackage.OML2OTI_PROVENANCE__EXPLANATION:
				return getExplanation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OMLPPackage.OML2OTI_PROVENANCE__OML_UUID:
				setOmlUUID((String)newValue);
				return;
			case OMLPPackage.OML2OTI_PROVENANCE__OTI_ID:
				setOtiID((String)newValue);
				return;
			case OMLPPackage.OML2OTI_PROVENANCE__OTI_URL:
				setOtiURL((String)newValue);
				return;
			case OMLPPackage.OML2OTI_PROVENANCE__OTI_UUID:
				setOtiUUID((String)newValue);
				return;
			case OMLPPackage.OML2OTI_PROVENANCE__EXPLANATION:
				setExplanation((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OMLPPackage.OML2OTI_PROVENANCE__OML_UUID:
				setOmlUUID(OML_UUID_EDEFAULT);
				return;
			case OMLPPackage.OML2OTI_PROVENANCE__OTI_ID:
				setOtiID(OTI_ID_EDEFAULT);
				return;
			case OMLPPackage.OML2OTI_PROVENANCE__OTI_URL:
				setOtiURL(OTI_URL_EDEFAULT);
				return;
			case OMLPPackage.OML2OTI_PROVENANCE__OTI_UUID:
				setOtiUUID(OTI_UUID_EDEFAULT);
				return;
			case OMLPPackage.OML2OTI_PROVENANCE__EXPLANATION:
				setExplanation(EXPLANATION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OMLPPackage.OML2OTI_PROVENANCE__OML_UUID:
				return OML_UUID_EDEFAULT == null ? omlUUID != null : !OML_UUID_EDEFAULT.equals(omlUUID);
			case OMLPPackage.OML2OTI_PROVENANCE__OTI_ID:
				return OTI_ID_EDEFAULT == null ? otiID != null : !OTI_ID_EDEFAULT.equals(otiID);
			case OMLPPackage.OML2OTI_PROVENANCE__OTI_URL:
				return OTI_URL_EDEFAULT == null ? otiURL != null : !OTI_URL_EDEFAULT.equals(otiURL);
			case OMLPPackage.OML2OTI_PROVENANCE__OTI_UUID:
				return OTI_UUID_EDEFAULT == null ? otiUUID != null : !OTI_UUID_EDEFAULT.equals(otiUUID);
			case OMLPPackage.OML2OTI_PROVENANCE__EXPLANATION:
				return EXPLANATION_EDEFAULT == null ? explanation != null : !EXPLANATION_EDEFAULT.equals(explanation);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (omlUUID: ");
		result.append(omlUUID);
		result.append(", otiID: ");
		result.append(otiID);
		result.append(", otiURL: ");
		result.append(otiURL);
		result.append(", otiUUID: ");
		result.append(otiUUID);
		result.append(", explanation: ");
		result.append(explanation);
		result.append(')');
		return result.toString();
	}

} //OML2OTIProvenanceImpl
