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

import jpl.imce.oml.specification.ecore.AnonymousConceptTaxonomyAxiom;
import jpl.imce.oml.specification.ecore.Bundle;
import jpl.imce.oml.specification.ecore.ConceptTreeDisjunction;
import jpl.imce.oml.specification.ecore.OMLPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anonymous Concept Taxonomy Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AnonymousConceptTaxonomyAxiomImpl extends DisjointUnionOfConceptsAxiomImpl implements AnonymousConceptTaxonomyAxiom {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnonymousConceptTaxonomyAxiomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMLPackage.eINSTANCE.getAnonymousConceptTaxonomyAxiom();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String calculateUUID() {
		String _xblockexpression = null;
		{
			Bundle _bundle = this.getBundle();
			String _uuid = _bundle.getUuid();
			String _plus = ("AnonymousConceptTaxonomyAxiom(bundle=" + _uuid);
			String _plus_1 = (_plus + ",disjointTaxonomyParent=");
			ConceptTreeDisjunction _disjointTaxonomyParent = this.getDisjointTaxonomyParent();
			String _calculateUUID = _disjointTaxonomyParent.calculateUUID();
			String _plus_2 = (_plus_1 + _calculateUUID);
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
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OMLPackage.ANONYMOUS_CONCEPT_TAXONOMY_AXIOM___CALCULATE_UUID:
				return calculateUUID();
		}
		return super.eInvoke(operationID, arguments);
	}

} //AnonymousConceptTaxonomyAxiomImpl
