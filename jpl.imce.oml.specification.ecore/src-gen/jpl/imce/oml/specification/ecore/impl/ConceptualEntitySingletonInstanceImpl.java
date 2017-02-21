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

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import jpl.imce.oml.specification.ecore.ConceptualEntity;
import jpl.imce.oml.specification.ecore.ConceptualEntitySingletonInstance;
import jpl.imce.oml.specification.ecore.DataRelationshipToScalar;
import jpl.imce.oml.specification.ecore.DataRelationshipToStructure;
import jpl.imce.oml.specification.ecore.EntityScalarDataProperty;
import jpl.imce.oml.specification.ecore.EntityStructuredDataProperty;
import jpl.imce.oml.specification.ecore.OMLPackage;
import jpl.imce.oml.specification.ecore.ScalarDataPropertyValue;
import jpl.imce.oml.specification.ecore.StructuredDataPropertyValue;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conceptual Entity Singleton Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ConceptualEntitySingletonInstanceImpl extends SingletonInstanceImpl implements ConceptualEntitySingletonInstance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptualEntitySingletonInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMLPackage.eINSTANCE.getConceptualEntitySingletonInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualEntity conceptualEntitySingletonClassifier() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScalarDataPropertyValue> identifyingScalarValues() {
		EList<ScalarDataPropertyValue> _scalarDataPropertyValues = this.getScalarDataPropertyValues();
		final Function1<ScalarDataPropertyValue, Boolean> _function = new Function1<ScalarDataPropertyValue, Boolean>() {
			public Boolean apply(final ScalarDataPropertyValue v) {
				boolean _xblockexpression = false;
				{
					final DataRelationshipToScalar p = v.getScalarDataProperty();
					boolean _switchResult = false;
					boolean _matched = false;
					if (p instanceof EntityScalarDataProperty) {
						_matched=true;
						_switchResult = ((EntityScalarDataProperty)p).isIsIdentityCriteria();
					}
					if (!_matched) {
						_switchResult = false;
					}
					_xblockexpression = _switchResult;
				}
				return Boolean.valueOf(_xblockexpression);
			}
		};
		Iterable<ScalarDataPropertyValue> _filter = IterableExtensions.<ScalarDataPropertyValue>filter(_scalarDataPropertyValues, _function);
		return ECollections.<ScalarDataPropertyValue>asEList(((ScalarDataPropertyValue[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(_filter, ScalarDataPropertyValue.class)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredDataPropertyValue> identifyingStructuredTuples() {
		EList<StructuredDataPropertyValue> _structuredDataPropertyValues = this.getStructuredDataPropertyValues();
		final Function1<StructuredDataPropertyValue, Boolean> _function = new Function1<StructuredDataPropertyValue, Boolean>() {
			public Boolean apply(final StructuredDataPropertyValue v) {
				boolean _xblockexpression = false;
				{
					final DataRelationshipToStructure p = v.getStructuredDataProperty();
					boolean _switchResult = false;
					boolean _matched = false;
					if (p instanceof EntityStructuredDataProperty) {
						_matched=true;
						_switchResult = ((EntityStructuredDataProperty)p).isIsIdentityCriteria();
					}
					if (!_matched) {
						_switchResult = false;
					}
					_xblockexpression = _switchResult;
				}
				return Boolean.valueOf(_xblockexpression);
			}
		};
		Iterable<StructuredDataPropertyValue> _filter = IterableExtensions.<StructuredDataPropertyValue>filter(_structuredDataPropertyValues, _function);
		return ECollections.<StructuredDataPropertyValue>asEList(((StructuredDataPropertyValue[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(_filter, StructuredDataPropertyValue.class)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OMLPackage.CONCEPTUAL_ENTITY_SINGLETON_INSTANCE___CONCEPTUAL_ENTITY_SINGLETON_CLASSIFIER:
				return conceptualEntitySingletonClassifier();
			case OMLPackage.CONCEPTUAL_ENTITY_SINGLETON_INSTANCE___IDENTIFYING_SCALAR_VALUES:
				return identifyingScalarValues();
			case OMLPackage.CONCEPTUAL_ENTITY_SINGLETON_INSTANCE___IDENTIFYING_STRUCTURED_TUPLES:
				return identifyingStructuredTuples();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConceptualEntitySingletonInstanceImpl
