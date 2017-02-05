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

import java.lang.reflect.InvocationTargetException;

import jpl.imce.oml.specification.ecore.DataRelationship;
import jpl.imce.oml.specification.ecore.Datatype;
import jpl.imce.oml.specification.ecore.DirectedBinaryRelationshipKind;
import jpl.imce.oml.specification.ecore.OMLPackage;
import jpl.imce.oml.specification.ecore.Term;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class DataRelationshipImpl extends TermImpl implements DataRelationship {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMLPackage.Literals.DATA_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term source() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term relationDomain() {
		return this.source();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype target() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term relationRange() {
		return this.target();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term relationshipSubject() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == DirectedBinaryRelationshipKind.class) {
			switch (baseOperationID) {
				case OMLPackage.DIRECTED_BINARY_RELATIONSHIP_KIND___RELATIONSHIP_SUBJECT: return OMLPackage.DATA_RELATIONSHIP___RELATIONSHIP_SUBJECT;
				case OMLPackage.DIRECTED_BINARY_RELATIONSHIP_KIND___RELATION_RANGE: return OMLPackage.DATA_RELATIONSHIP___RELATION_RANGE;
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OMLPackage.DATA_RELATIONSHIP___SOURCE:
				return source();
			case OMLPackage.DATA_RELATIONSHIP___RELATION_DOMAIN:
				return relationDomain();
			case OMLPackage.DATA_RELATIONSHIP___TARGET:
				return target();
			case OMLPackage.DATA_RELATIONSHIP___RELATION_RANGE:
				return relationRange();
			case OMLPackage.DATA_RELATIONSHIP___RELATIONSHIP_SUBJECT:
				return relationshipSubject();
		}
		return super.eInvoke(operationID, arguments);
	}

} //DataRelationshipImpl
