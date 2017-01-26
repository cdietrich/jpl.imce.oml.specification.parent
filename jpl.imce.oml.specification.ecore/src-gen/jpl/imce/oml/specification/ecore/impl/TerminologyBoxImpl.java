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

import java.util.Collection;
import java.util.UUID;

import jpl.imce.oml.specification.ecore.Annotation;
import jpl.imce.oml.specification.ecore.AnnotationEntry;
import jpl.imce.oml.specification.ecore.AnnotationProperty;
import jpl.imce.oml.specification.ecore.AnnotationSubjectPropertyValue;
import jpl.imce.oml.specification.ecore.Aspect;
import jpl.imce.oml.specification.ecore.Concept;
import jpl.imce.oml.specification.ecore.DataRange;
import jpl.imce.oml.specification.ecore.DataRelationship;
import jpl.imce.oml.specification.ecore.Entity;
import jpl.imce.oml.specification.ecore.EntityScalarDataProperty;
import jpl.imce.oml.specification.ecore.OMLPackage;
import jpl.imce.oml.specification.ecore.ReifiedRelationship;
import jpl.imce.oml.specification.ecore.Resource;
import jpl.imce.oml.specification.ecore.Scalar;
import jpl.imce.oml.specification.ecore.Structure;
import jpl.imce.oml.specification.ecore.TermAxiom;
import jpl.imce.oml.specification.ecore.TerminologyBox;
import jpl.imce.oml.specification.ecore.TerminologyBoxAxiom;
import jpl.imce.oml.specification.ecore.TerminologyBoxStatement;
import jpl.imce.oml.specification.ecore.TerminologyExtent;
import jpl.imce.oml.specification.ecore.TerminologyGraphKind;
import jpl.imce.oml.specification.ecore.TerminologyThing;
import jpl.imce.oml.specification.ecore.UnreifiedRelationship;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminology Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.TerminologyBoxImpl#getIri <em>Iri</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.TerminologyBoxImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.TerminologyBoxImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.TerminologyBoxImpl#getTerminologyBoxAxioms <em>Terminology Box Axioms</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.impl.TerminologyBoxImpl#getBoxStatements <em>Box Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TerminologyBoxImpl extends TerminologyThingImpl implements TerminologyBox {
	/**
	 * The default value of the '{@link #getIri() <em>Iri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIri()
	 * @generated
	 * @ordered
	 */
	protected static final String IRI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIri() <em>Iri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIri()
	 * @generated
	 * @ordered
	 */
	protected String iri = IRI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotations;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final TerminologyGraphKind KIND_EDEFAULT = TerminologyGraphKind.OPEN_WORLD_DEFINITIONS;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected TerminologyGraphKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTerminologyBoxAxioms() <em>Terminology Box Axioms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminologyBoxAxioms()
	 * @generated
	 * @ordered
	 */
	protected EList<TerminologyBoxAxiom> terminologyBoxAxioms;

	/**
	 * The cached value of the '{@link #getBoxStatements() <em>Box Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<TerminologyBoxStatement> boxStatements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminologyBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMLPackage.Literals.TERMINOLOGY_BOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIri() {
		return iri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIri(String newIri) {
		String oldIri = iri;
		iri = newIri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.TERMINOLOGY_BOX__IRI, oldIri, iri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentWithInverseEList<Annotation>(Annotation.class, this, OMLPackage.TERMINOLOGY_BOX__ANNOTATIONS, OMLPackage.ANNOTATION__TERMINOLOGY);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyGraphKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(TerminologyGraphKind newKind) {
		TerminologyGraphKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMLPackage.TERMINOLOGY_BOX__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TerminologyBoxAxiom> getTerminologyBoxAxioms() {
		if (terminologyBoxAxioms == null) {
			terminologyBoxAxioms = new EObjectContainmentWithInverseEList<TerminologyBoxAxiom>(TerminologyBoxAxiom.class, this, OMLPackage.TERMINOLOGY_BOX__TERMINOLOGY_BOX_AXIOMS, OMLPackage.TERMINOLOGY_BOX_AXIOM__TERMINOLOGY);
		}
		return terminologyBoxAxioms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TerminologyBoxStatement> getBoxStatements() {
		if (boxStatements == null) {
			boxStatements = new EObjectContainmentWithInverseEList<TerminologyBoxStatement>(TerminologyBoxStatement.class, this, OMLPackage.TERMINOLOGY_BOX__BOX_STATEMENTS, OMLPackage.TERMINOLOGY_BOX_STATEMENT__GRAPH);
		}
		return boxStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyExtent extent() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String calculateUUID() {
		NameBasedGenerator _nameBasedGenerator = Generators.nameBasedGenerator(NameBasedGenerator.NAMESPACE_URL);
		String _iri = this.iri();
		UUID _generate = _nameBasedGenerator.generate(_iri);
		return _generate.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String iri() {
		return this.getIri();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String nsPrefix() {
		String _iri = this.getIri();
		String _iri_1 = this.getIri();
		int _lastIndexOf = _iri_1.lastIndexOf("/");
		int _plus = (1 + _lastIndexOf);
		return _iri.substring(_plus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String name() {
		return this.nsPrefix();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<TerminologyThing, EList<AnnotationSubjectPropertyValue>> annotationsBySubject() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<AnnotationProperty, EList<AnnotationEntry>> annotationsByProperty() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyBox withAnnotations(EMap<AnnotationProperty, EList<AnnotationEntry>> a) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyBox withBoxStatements(EList<TerminologyBoxStatement> s) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> entities() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Aspect> aspects() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Concept> concepts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReifiedRelationship> reifiedRelationships() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnreifiedRelationship> unreifiedRelationships() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataRelationship> dataRelationships() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityScalarDataProperty> entityScalarDataProperties() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataRange> dataranges() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scalar> scalars() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Structure> structures() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TermAxiom> termAxioms() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TerminologyThing> everything() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case OMLPackage.TERMINOLOGY_BOX__ANNOTATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAnnotations()).basicAdd(otherEnd, msgs);
			case OMLPackage.TERMINOLOGY_BOX__TERMINOLOGY_BOX_AXIOMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTerminologyBoxAxioms()).basicAdd(otherEnd, msgs);
			case OMLPackage.TERMINOLOGY_BOX__BOX_STATEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBoxStatements()).basicAdd(otherEnd, msgs);
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
			case OMLPackage.TERMINOLOGY_BOX__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case OMLPackage.TERMINOLOGY_BOX__TERMINOLOGY_BOX_AXIOMS:
				return ((InternalEList<?>)getTerminologyBoxAxioms()).basicRemove(otherEnd, msgs);
			case OMLPackage.TERMINOLOGY_BOX__BOX_STATEMENTS:
				return ((InternalEList<?>)getBoxStatements()).basicRemove(otherEnd, msgs);
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
			case OMLPackage.TERMINOLOGY_BOX__IRI:
				return getIri();
			case OMLPackage.TERMINOLOGY_BOX__ANNOTATIONS:
				return getAnnotations();
			case OMLPackage.TERMINOLOGY_BOX__KIND:
				return getKind();
			case OMLPackage.TERMINOLOGY_BOX__TERMINOLOGY_BOX_AXIOMS:
				return getTerminologyBoxAxioms();
			case OMLPackage.TERMINOLOGY_BOX__BOX_STATEMENTS:
				return getBoxStatements();
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
			case OMLPackage.TERMINOLOGY_BOX__IRI:
				setIri((String)newValue);
				return;
			case OMLPackage.TERMINOLOGY_BOX__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case OMLPackage.TERMINOLOGY_BOX__KIND:
				setKind((TerminologyGraphKind)newValue);
				return;
			case OMLPackage.TERMINOLOGY_BOX__TERMINOLOGY_BOX_AXIOMS:
				getTerminologyBoxAxioms().clear();
				getTerminologyBoxAxioms().addAll((Collection<? extends TerminologyBoxAxiom>)newValue);
				return;
			case OMLPackage.TERMINOLOGY_BOX__BOX_STATEMENTS:
				getBoxStatements().clear();
				getBoxStatements().addAll((Collection<? extends TerminologyBoxStatement>)newValue);
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
			case OMLPackage.TERMINOLOGY_BOX__IRI:
				setIri(IRI_EDEFAULT);
				return;
			case OMLPackage.TERMINOLOGY_BOX__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case OMLPackage.TERMINOLOGY_BOX__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case OMLPackage.TERMINOLOGY_BOX__TERMINOLOGY_BOX_AXIOMS:
				getTerminologyBoxAxioms().clear();
				return;
			case OMLPackage.TERMINOLOGY_BOX__BOX_STATEMENTS:
				getBoxStatements().clear();
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
			case OMLPackage.TERMINOLOGY_BOX__IRI:
				return IRI_EDEFAULT == null ? iri != null : !IRI_EDEFAULT.equals(iri);
			case OMLPackage.TERMINOLOGY_BOX__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case OMLPackage.TERMINOLOGY_BOX__KIND:
				return kind != KIND_EDEFAULT;
			case OMLPackage.TERMINOLOGY_BOX__TERMINOLOGY_BOX_AXIOMS:
				return terminologyBoxAxioms != null && !terminologyBoxAxioms.isEmpty();
			case OMLPackage.TERMINOLOGY_BOX__BOX_STATEMENTS:
				return boxStatements != null && !boxStatements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == TerminologyThing.class) {
			switch (baseOperationID) {
				case OMLPackage.TERMINOLOGY_THING___CALCULATE_UUID: return OMLPackage.TERMINOLOGY_BOX___CALCULATE_UUID;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Resource.class) {
			switch (baseOperationID) {
				case OMLPackage.RESOURCE___IRI: return OMLPackage.TERMINOLOGY_BOX___IRI;
				case OMLPackage.RESOURCE___NAME: return OMLPackage.TERMINOLOGY_BOX___NAME;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OMLPackage.TERMINOLOGY_BOX___EXTENT:
				return extent();
			case OMLPackage.TERMINOLOGY_BOX___CALCULATE_UUID:
				return calculateUUID();
			case OMLPackage.TERMINOLOGY_BOX___IRI:
				return iri();
			case OMLPackage.TERMINOLOGY_BOX___NS_PREFIX:
				return nsPrefix();
			case OMLPackage.TERMINOLOGY_BOX___NAME:
				return name();
			case OMLPackage.TERMINOLOGY_BOX___ANNOTATIONS_BY_SUBJECT:
				return annotationsBySubject();
			case OMLPackage.TERMINOLOGY_BOX___ANNOTATIONS_BY_PROPERTY:
				return annotationsByProperty();
			case OMLPackage.TERMINOLOGY_BOX___WITH_ANNOTATIONS__EMAP:
				return withAnnotations((EMap<AnnotationProperty, EList<AnnotationEntry>>)arguments.get(0));
			case OMLPackage.TERMINOLOGY_BOX___WITH_BOX_STATEMENTS__ELIST:
				return withBoxStatements((EList<TerminologyBoxStatement>)arguments.get(0));
			case OMLPackage.TERMINOLOGY_BOX___ENTITIES:
				return entities();
			case OMLPackage.TERMINOLOGY_BOX___ASPECTS:
				return aspects();
			case OMLPackage.TERMINOLOGY_BOX___CONCEPTS:
				return concepts();
			case OMLPackage.TERMINOLOGY_BOX___REIFIED_RELATIONSHIPS:
				return reifiedRelationships();
			case OMLPackage.TERMINOLOGY_BOX___UNREIFIED_RELATIONSHIPS:
				return unreifiedRelationships();
			case OMLPackage.TERMINOLOGY_BOX___DATA_RELATIONSHIPS:
				return dataRelationships();
			case OMLPackage.TERMINOLOGY_BOX___ENTITY_SCALAR_DATA_PROPERTIES:
				return entityScalarDataProperties();
			case OMLPackage.TERMINOLOGY_BOX___DATARANGES:
				return dataranges();
			case OMLPackage.TERMINOLOGY_BOX___SCALARS:
				return scalars();
			case OMLPackage.TERMINOLOGY_BOX___STRUCTURES:
				return structures();
			case OMLPackage.TERMINOLOGY_BOX___TERM_AXIOMS:
				return termAxioms();
			case OMLPackage.TERMINOLOGY_BOX___EVERYTHING:
				return everything();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (iri: ");
		result.append(iri);
		result.append(", kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //TerminologyBoxImpl
