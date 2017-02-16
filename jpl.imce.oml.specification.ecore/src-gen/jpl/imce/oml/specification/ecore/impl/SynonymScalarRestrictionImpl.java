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

import jpl.imce.oml.specification.ecore.DataRange;
import jpl.imce.oml.specification.ecore.OMLPackage;
import jpl.imce.oml.specification.ecore.SynonymScalarRestriction;
import jpl.imce.oml.specification.ecore.Term;
import jpl.imce.oml.specification.ecore.TerminologyThing;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synonym Scalar Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SynonymScalarRestrictionImpl extends RestrictedDataRangeImpl implements SynonymScalarRestriction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynonymScalarRestrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMLPackage.eINSTANCE.getSynonymScalarRestriction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String calculateUUID() {
		String _xblockexpression = null;
		{
			DataRange _restrictedRange = this.getRestrictedRange();
			String _uuid = _restrictedRange.getUuid();
			String _plus = ("SynonymScalarRestriction(restrictedRange=" + _uuid);
			final String namespace = (_plus + ")");
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
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == TerminologyThing.class) {
			switch (baseOperationID) {
				case OMLPackage.TERMINOLOGY_THING___CALCULATE_UUID: return OMLPackage.SYNONYM_SCALAR_RESTRICTION___CALCULATE_UUID;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Term.class) {
			switch (baseOperationID) {
				case OMLPackage.TERM___CALCULATE_UUID: return OMLPackage.SYNONYM_SCALAR_RESTRICTION___CALCULATE_UUID;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case OMLPackage.SYNONYM_SCALAR_RESTRICTION___CALCULATE_UUID:
				return calculateUUID();
		}
		return super.eInvoke(operationID, arguments);
	}

} //SynonymScalarRestrictionImpl
