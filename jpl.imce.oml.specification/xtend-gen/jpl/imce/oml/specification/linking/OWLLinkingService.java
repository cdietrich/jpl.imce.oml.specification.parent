/**
 * Copyright 2016 California Institute of Technology ("Caltech").
 * U.S. Government sponsorship acknowledged.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * License Terms
 */
package jpl.imce.oml.specification.linking;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.nodemodel.INode;

/**
 * In the OML metamodel, an OML Annotation has 2 non-container references that require cross-reference resolution:
 * - property, which is specified in the concrete syntax grammar via an OML AnnotationProperty's abbreviated IRI
 * - subject, which is specified implicitly based on the fact that OML Annotations appear after an OML TerminologyThing subject.
 * 
 * The cross-reference resolution of the property in terms of its abbreviated IRI will trigger a call: getLinkedObjects(context, ref, node)
 * where ref corresponds to Annotation.property and node is the concrete syntax AST for the Annotation itself.
 * 
 * The concrete syntax for annotations looks like this ('...' means a repetition of the previous concrete syntax statement)
 * 
 * <TerminologyBox(tbox)> {
 *   <Annotation(subject=tbox, property=..., value=...)>
 *   ...
 *   <Annotation(subject=tbox, property=..., value=...)>
 * 
 *   <TerminologyThing(t1)>
 *   <Annotation(subject=t1, property=..., value=...)>
 *   ...
 *   <Annotation(subject=t1, property=..., value=...)>
 * 
 *   <TerminologyThing(t2)>
 *   <Annotation(subject=t2, property=..., value=...)>
 *   ...
 *   <Annotation(subject=t2, property=..., value=...)>
 * }
 */
@SuppressWarnings("all")
public class OWLLinkingService extends DefaultLinkingService {
  @Inject
  private IQualifiedNameConverter qualifiedNameConverter;
  
  public List<EObject> getLinkedObjects(final EObject context, final EReference ref, final INode node) throws IllegalNodeException {
    throw new Error("Unresolved compilation problems:"
      + "\nAnnotation cannot be resolved to a type."
      + "\nAnnotationProperty cannot be resolved to a type."
      + "\nTerminologyThing cannot be resolved to a type."
      + "\nAnnotation cannot be resolved to a type."
      + "\nThe method subject(EObject) is undefined for the type EObject"
      + "\nThe method subject(Object) is undefined for the type EObject"
      + "\nThe method or field subject is undefined for the type EObject"
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition.");
  }
}
