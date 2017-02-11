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
 * A representation of the model object '<em><b>Terminology Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML TerminologyGraph is an OML TerminologyBox with no statements our axioms involving OML Bundles.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jpl.imce.oml.specification.ecore.TerminologyGraph#getGraphExtent <em>Graph Extent</em>}</li>
 * </ul>
 *
 * @see jpl.imce.oml.specification.ecore.OMLPackage#getTerminologyGraph()
 * @model
 * @generated
 */
public interface TerminologyGraph extends TerminologyBox {
	/**
	 * Returns the value of the '<em><b>Graph Extent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jpl.imce.oml.specification.ecore.TerminologyExtent#getTerminologyGraphs <em>Terminology Graphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph Extent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph Extent</em>' container reference.
	 * @see #setGraphExtent(TerminologyExtent)
	 * @see jpl.imce.oml.specification.ecore.OMLPackage#getTerminologyGraph_GraphExtent()
	 * @see jpl.imce.oml.specification.ecore.TerminologyExtent#getTerminologyGraphs
	 * @model opposite="terminologyGraphs" required="true" transient="false"
	 * @generated
	 */
	TerminologyExtent getGraphExtent();

	/**
	 * Sets the value of the '{@link jpl.imce.oml.specification.ecore.TerminologyGraph#getGraphExtent <em>Graph Extent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph Extent</em>' container reference.
	 * @see #getGraphExtent()
	 * @generated
	 */
	void setGraphExtent(TerminologyExtent value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getGraphExtent();'"
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
	TerminologyGraph withAnnotations(EMap<AnnotationProperty, EList<AnnotationEntry>> a);

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
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='copy(boxStatements = this.boxStatements ++ s)'"
	 * @generated
	 */
	TerminologyGraph withBoxStatements(EList<TerminologyBoxStatement> s);

} // TerminologyGraph
