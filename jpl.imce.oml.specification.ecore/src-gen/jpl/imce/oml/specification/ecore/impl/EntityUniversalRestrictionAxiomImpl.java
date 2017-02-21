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

import jpl.imce.oml.specification.ecore.EcorePackage;
import jpl.imce.oml.specification.ecore.Entity;
import jpl.imce.oml.specification.ecore.EntityRelationship;
import jpl.imce.oml.specification.ecore.EntityUniversalRestrictionAxiom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Universal Restriction Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EntityUniversalRestrictionAxiomImpl extends EntityRestrictionAxiomImpl implements EntityUniversalRestrictionAxiom {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityUniversalRestrictionAxiomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.eINSTANCE.getEntityUniversalRestrictionAxiom();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String calculateUUID() {
		String _xblockexpression = null;
		{
			Entity _restrictedDomain = this.getRestrictedDomain();
			String _uuid = _restrictedDomain.getUuid();
			String _plus = ("EntityUniversalRestrictionAxiom(restrictedDomain=" + _uuid);
			String _plus_1 = (_plus + ",restrictedRelation=");
			EntityRelationship _restrictedRelation = this.getRestrictedRelation();
			String _uuid_1 = _restrictedRelation.getUuid();
			String _plus_2 = (_plus_1 + _uuid_1);
			String _plus_3 = (_plus_2 + ",restrictedRange=");
			Entity _restrictedRange = this.getRestrictedRange();
			String _uuid_2 = _restrictedRange.getUuid();
			String _plus_4 = (_plus_3 + _uuid_2);
			final String namespace = (_plus_4 + ")");
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EcorePackage.ENTITY_UNIVERSAL_RESTRICTION_AXIOM___CALCULATE_UUID:
				return calculateUUID();
		}
		return super.eInvoke(operationID, arguments);
	}

} //EntityUniversalRestrictionAxiomImpl
