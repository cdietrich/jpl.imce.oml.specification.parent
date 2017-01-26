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

import java.util.Collection;

import jpl.imce.oml.specification.ecore.AnnotationProperty;
import jpl.imce.oml.specification.ecore.Bundle;
import jpl.imce.oml.specification.ecore.OMLPackage;
import jpl.imce.oml.specification.ecore.TerminologyExtent;
import jpl.imce.oml.specification.ecore.TerminologyGraph;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminology Extent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.TerminologyExtentImpl#getAnnotationProperties <em>Annotation Properties</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.TerminologyExtentImpl#getTerminologyGraphs <em>Terminology Graphs</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.TerminologyExtentImpl#getBundles <em>Bundles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminologyExtentImpl extends CDOObjectImpl implements TerminologyExtent {
	/**
	 * The cached value of the '{@link #getAnnotationProperties() <em>Annotation Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationProperty> annotationProperties;

	/**
	 * The cached value of the '{@link #getTerminologyGraphs() <em>Terminology Graphs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminologyGraphs()
	 * @generated
	 * @ordered
	 */
	protected EList<TerminologyGraph> terminologyGraphs;

	/**
	 * The cached value of the '{@link #getBundles() <em>Bundles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundles()
	 * @generated
	 * @ordered
	 */
	protected EList<Bundle> bundles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminologyExtentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMLPackage.Literals.TERMINOLOGY_EXTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotationProperty> getAnnotationProperties() {
		if (annotationProperties == null) {
			annotationProperties = new EObjectContainmentEList<AnnotationProperty>(AnnotationProperty.class, this, OMLPackage.TERMINOLOGY_EXTENT__ANNOTATION_PROPERTIES);
		}
		return annotationProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TerminologyGraph> getTerminologyGraphs() {
		if (terminologyGraphs == null) {
			terminologyGraphs = new EObjectContainmentWithInverseEList<TerminologyGraph>(TerminologyGraph.class, this, OMLPackage.TERMINOLOGY_EXTENT__TERMINOLOGY_GRAPHS, OMLPackage.TERMINOLOGY_GRAPH__GRAPH_EXTENT);
		}
		return terminologyGraphs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bundle> getBundles() {
		if (bundles == null) {
			bundles = new EObjectContainmentWithInverseEList<Bundle>(Bundle.class, this, OMLPackage.TERMINOLOGY_EXTENT__BUNDLES, OMLPackage.BUNDLE__BUNDLE_EXTENT);
		}
		return bundles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMLPackage.TERMINOLOGY_EXTENT__TERMINOLOGY_GRAPHS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTerminologyGraphs()).basicAdd(otherEnd, msgs);
			case OMLPackage.TERMINOLOGY_EXTENT__BUNDLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBundles()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMLPackage.TERMINOLOGY_EXTENT__ANNOTATION_PROPERTIES:
				return ((InternalEList<?>)getAnnotationProperties()).basicRemove(otherEnd, msgs);
			case OMLPackage.TERMINOLOGY_EXTENT__TERMINOLOGY_GRAPHS:
				return ((InternalEList<?>)getTerminologyGraphs()).basicRemove(otherEnd, msgs);
			case OMLPackage.TERMINOLOGY_EXTENT__BUNDLES:
				return ((InternalEList<?>)getBundles()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMLPackage.TERMINOLOGY_EXTENT__ANNOTATION_PROPERTIES:
				return getAnnotationProperties();
			case OMLPackage.TERMINOLOGY_EXTENT__TERMINOLOGY_GRAPHS:
				return getTerminologyGraphs();
			case OMLPackage.TERMINOLOGY_EXTENT__BUNDLES:
				return getBundles();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OMLPackage.TERMINOLOGY_EXTENT__ANNOTATION_PROPERTIES:
				getAnnotationProperties().clear();
				getAnnotationProperties().addAll((Collection<? extends AnnotationProperty>)newValue);
				return;
			case OMLPackage.TERMINOLOGY_EXTENT__TERMINOLOGY_GRAPHS:
				getTerminologyGraphs().clear();
				getTerminologyGraphs().addAll((Collection<? extends TerminologyGraph>)newValue);
				return;
			case OMLPackage.TERMINOLOGY_EXTENT__BUNDLES:
				getBundles().clear();
				getBundles().addAll((Collection<? extends Bundle>)newValue);
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
			case OMLPackage.TERMINOLOGY_EXTENT__ANNOTATION_PROPERTIES:
				getAnnotationProperties().clear();
				return;
			case OMLPackage.TERMINOLOGY_EXTENT__TERMINOLOGY_GRAPHS:
				getTerminologyGraphs().clear();
				return;
			case OMLPackage.TERMINOLOGY_EXTENT__BUNDLES:
				getBundles().clear();
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
			case OMLPackage.TERMINOLOGY_EXTENT__ANNOTATION_PROPERTIES:
				return annotationProperties != null && !annotationProperties.isEmpty();
			case OMLPackage.TERMINOLOGY_EXTENT__TERMINOLOGY_GRAPHS:
				return terminologyGraphs != null && !terminologyGraphs.isEmpty();
			case OMLPackage.TERMINOLOGY_EXTENT__BUNDLES:
				return bundles != null && !bundles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TerminologyExtentImpl
