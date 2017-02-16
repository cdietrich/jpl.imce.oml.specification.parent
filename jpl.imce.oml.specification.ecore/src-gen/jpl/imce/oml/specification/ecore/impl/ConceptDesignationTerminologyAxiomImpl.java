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

import com.fasterxml.uuid.Generators;

import com.fasterxml.uuid.impl.NameBasedGenerator;

import java.lang.reflect.InvocationTargetException;

import java.util.UUID;

import jpl.imce.oml.specification.ecore.Concept;
import jpl.imce.oml.specification.ecore.ConceptDesignationTerminologyAxiom;
import jpl.imce.oml.specification.ecore.OMLPackage;
import jpl.imce.oml.specification.ecore.TerminologyBox;
import jpl.imce.oml.specification.ecore.TerminologyGraph;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Designation Terminology Axiom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.ConceptDesignationTerminologyAxiomImpl#getDesignatedTerminology <em>Designated Terminology</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.ConceptDesignationTerminologyAxiomImpl#getDesignatedConcept <em>Designated Concept</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConceptDesignationTerminologyAxiomImpl extends TerminologyBoxAxiomImpl implements ConceptDesignationTerminologyAxiom {
	/**
	 * The cached value of the '{@link #getDesignatedTerminology() <em>Designated Terminology</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignatedTerminology()
	 * @generated
	 * @ordered
	 */
	protected TerminologyBox designatedTerminology;

	/**
	 * The cached value of the '{@link #getDesignatedConcept() <em>Designated Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignatedConcept()
	 * @generated
	 * @ordered
	 */
	protected Concept designatedConcept;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptDesignationTerminologyAxiomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMLPackage.eINSTANCE.getConceptDesignationTerminologyAxiom();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyBox getDesignatedTerminology() {
		if (designatedTerminology != null && ((EObject)designatedTerminology).eIsProxy()) {
			InternalEObject oldDesignatedTerminology = (InternalEObject)designatedTerminology;
			designatedTerminology = (TerminologyBox)eResolveProxy(oldDesignatedTerminology);
			if (designatedTerminology != oldDesignatedTerminology) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMLPackage.CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM__DESIGNATED_TERMINOLOGY, oldDesignatedTerminology, designatedTerminology));
			}
		}
		return designatedTerminology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyBox basicGetDesignatedTerminology() {
		return designatedTerminology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignatedTerminology(TerminologyBox newDesignatedTerminology) {
		TerminologyBox oldDesignatedTerminology = designatedTerminology;
		designatedTerminology = newDesignatedTerminology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM__DESIGNATED_TERMINOLOGY, oldDesignatedTerminology, designatedTerminology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept getDesignatedConcept() {
		if (designatedConcept != null && ((EObject)designatedConcept).eIsProxy()) {
			InternalEObject oldDesignatedConcept = (InternalEObject)designatedConcept;
			designatedConcept = (Concept)eResolveProxy(oldDesignatedConcept);
			if (designatedConcept != oldDesignatedConcept) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OMLPackage.CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM__DESIGNATED_CONCEPT, oldDesignatedConcept, designatedConcept));
			}
		}
		return designatedConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept basicGetDesignatedConcept() {
		return designatedConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignatedConcept(Concept newDesignatedConcept) {
		Concept oldDesignatedConcept = designatedConcept;
		designatedConcept = newDesignatedConcept;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM__DESIGNATED_CONCEPT, oldDesignatedConcept, designatedConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String calculateUUID() {
		String _xblockexpression = null;
		{
			TerminologyBox _tbox = this.getTbox();
			String _uuid = _tbox.getUuid();
			String _plus = ("ConceptDesignationTerminologyAxiom(designationTerminologyGraph=" + _uuid);
			String _plus_1 = (_plus + ",designatedConcept=");
			Concept _designatedConcept = this.getDesignatedConcept();
			String _uuid_1 = _designatedConcept.getUuid();
			String _plus_2 = (_plus_1 + _uuid_1);
			final String namespace = (_plus_2 + ")");
			NameBasedGenerator _nameBasedGenerator = Generators.nameBasedGenerator(NameBasedGenerator.NAMESPACE_URL);
			UUID _generate = _nameBasedGenerator.generate(namespace);
			_xblockexpression = _generate.toString();
		}
		return _xblockexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyGraph designationTerminologyGraph() {
		TerminologyGraph _switchResult = null;
		TerminologyBox _tbox = this.getTbox();
		boolean _matched = false;
		if (_tbox instanceof TerminologyGraph) {
			_matched=true;
			TerminologyBox _tbox_1 = this.getTbox();
			_switchResult = ((TerminologyGraph) _tbox_1);
		}
		return _switchResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyBox source() {
		return this.getTbox();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyBox target() {
		return this.getDesignatedTerminology();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMLPackage.CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM__DESIGNATED_TERMINOLOGY:
				if (resolve) return getDesignatedTerminology();
				return basicGetDesignatedTerminology();
			case OMLPackage.CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM__DESIGNATED_CONCEPT:
				if (resolve) return getDesignatedConcept();
				return basicGetDesignatedConcept();
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
			case OMLPackage.CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM__DESIGNATED_TERMINOLOGY:
				setDesignatedTerminology((TerminologyBox)newValue);
				return;
			case OMLPackage.CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM__DESIGNATED_CONCEPT:
				setDesignatedConcept((Concept)newValue);
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
			case OMLPackage.CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM__DESIGNATED_TERMINOLOGY:
				setDesignatedTerminology((TerminologyBox)null);
				return;
			case OMLPackage.CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM__DESIGNATED_CONCEPT:
				setDesignatedConcept((Concept)null);
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
			case OMLPackage.CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM__DESIGNATED_TERMINOLOGY:
				return designatedTerminology != null;
			case OMLPackage.CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM__DESIGNATED_CONCEPT:
				return designatedConcept != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OMLPackage.CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM___CALCULATE_UUID:
				return calculateUUID();
			case OMLPackage.CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM___DESIGNATION_TERMINOLOGY_GRAPH:
				return designationTerminologyGraph();
			case OMLPackage.CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM___SOURCE:
				return source();
			case OMLPackage.CONCEPT_DESIGNATION_TERMINOLOGY_AXIOM___TARGET:
				return target();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConceptDesignationTerminologyAxiomImpl
