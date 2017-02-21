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
package jpl.imce.oml.specification.ecore;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML Bundle is an OML TerminologyBox that is
 * an acyclic logical aggregate of other OML TerminologyBox(es)
 * and that logically assert OML TerminologyBundleStatement(s).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.Bundle#getBundleExtent <em>Bundle Extent</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.Bundle#getBundleStatements <em>Bundle Statements</em>}</li>
 *   <li>{@link jpl.imce.oml.specification.ecore.Bundle#getTerminologyBundleAxioms <em>Terminology Bundle Axioms</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getBundle()
 * @model
 * @generated
 */
public interface Bundle extends TerminologyBox {
	/**
	 * Returns the value of the '<em><b>Bundle Extent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jpl.imce.oml.specification.ecore.TerminologyExtent#getBundles <em>Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundle Extent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundle Extent</em>' container reference.
	 * @see #setBundleExtent(TerminologyExtent)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getBundle_BundleExtent()
	 * @see jpl.imce.oml.specification.ecore.TerminologyExtent#getBundles
	 * @model opposite="bundles" required="true" transient="false"
	 * @generated
	 */
	TerminologyExtent getBundleExtent();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.Bundle#getBundleExtent <em>Bundle Extent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle Extent</em>' container reference.
	 * @see #getBundleExtent()
	 * @generated
	 */
	void setBundleExtent(TerminologyExtent value);

	/**
	 * Returns the value of the '<em><b>Bundle Statements</b></em>' containment reference list.
	 * The list contents are of type {@link jpl.imce.oml.specification.ecore.TerminologyBundleStatement}.
	 * It is bidirectional and its opposite is '{@link jpl.imce.oml.specification.ecore.TerminologyBundleStatement#getBundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TerminologyBundleStatements asserted in this Bundle
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bundle Statements</em>' containment reference list.
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getBundle_BundleStatements()
	 * @see jpl.imce.oml.specification.ecore.TerminologyBundleStatement#getBundle
	 * @model opposite="bundle" containment="true"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<TerminologyBundleStatement> getBundleStatements();

	/**
	 * Returns the value of the '<em><b>Terminology Bundle Axioms</b></em>' containment reference list.
	 * The list contents are of type {@link jpl.imce.oml.specification.ecore.TerminologyBundleAxiom}.
	 * It is bidirectional and its opposite is '{@link jpl.imce.oml.specification.ecore.TerminologyBundleAxiom#getTerminologyBundle <em>Terminology Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The BundledTerminologyAxioms asserted in this Bundle
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Terminology Bundle Axioms</em>' containment reference list.
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getBundle_TerminologyBundleAxioms()
	 * @see jpl.imce.oml.specification.ecore.TerminologyBundleAxiom#getTerminologyBundle
	 * @model opposite="terminologyBundle" containment="true"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<TerminologyBundleAxiom> getTerminologyBundleAxioms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getBundleExtent();'"
	 * @generated
	 */
	TerminologyExtent extent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" aMapType="jpl.imce.oml.specification.ecore.AnnotationPropertyTable<jpl.imce.oml.specification.ecore.AnnotationProperty, jpl.imce.oml.specification.ecore.AnnotationEntry>"
	 *        aAnnotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='copy(annotations = this.annotations ++ resolver.convertToAnnotations(a))'"
	 * @generated
	 */
	Bundle withAnnotations(EMap<AnnotationProperty, EList<AnnotationEntry>> a);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model mapType="jpl.imce.oml.specification.ecore.AnnotationPropertyTable<jpl.imce.oml.specification.ecore.AnnotationProperty, jpl.imce.oml.specification.ecore.AnnotationEntry>"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='resolver.groupAnnotationsByProperty(annotations)'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EMap<AnnotationProperty, EList<AnnotationEntry>> annotationsByProperty();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" sUnique="false" sMany="true"
	 *        sAnnotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='copy(bundleStatements = this.bundleStatements ++ s)'"
	 * @generated
	 */
	Bundle withBundleStatements(EList<TerminologyBundleStatement> s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" sUnique="false" sMany="true"
	 *        sAnnotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='copy(boxStatements = this.boxStatements ++ s)'"
	 * @generated
	 */
	Bundle withBoxStatements(EList<TerminologyBoxStatement> s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='super.everything() ++ bundleStatements + this'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Collection kind='SortedSet'"
	 * @generated
	 */
	EList<TerminologyThing> everything();

} // Bundle
