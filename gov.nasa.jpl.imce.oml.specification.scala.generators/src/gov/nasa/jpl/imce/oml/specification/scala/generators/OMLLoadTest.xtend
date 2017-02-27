/*
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
 package gov.nasa.jpl.imce.oml.specification.scala.generators

import org.eclipse.emf.ecore.EClass

/*
 * For some mysterious reason, this fails to execute like this:
 * :gov.nasa.jpl.imce.oml.specification.scala.generators:generateXtext UP-TO-DATE
:gov.nasa.jpl.imce.oml.specification.scala.generators:compileJava UP-TO-DATE
:gov.nasa.jpl.imce.oml.specification.scala.generators:processResources NO-SOURCE
:gov.nasa.jpl.imce.oml.specification.scala.generators:classes UP-TO-DATE
:gov.nasa.jpl.imce.oml.specification.scala.generators:jar UP-TO-DATE
:gov.nasa.jpl.imce.oml.specification.scala.generators:OMLLoadTest
0    [main] ERROR base.resource.BatchLinkableResource  - resolution of uriFragment '|6' failed.
org.eclipse.emf.common.util.BasicEList$BasicIndexOutOfBoundsException: index=1, size=1
        at org.eclipse.emf.common.util.BasicEList.get(BasicEList.java:346)
        at org.eclipse.emf.ecore.xcore.scoping.XcoreImportedNamespaceAwareScopeProvider.getLocalClassifiersScope(XcoreImportedNamespaceAwareScopeProvider.java:285)
        at org.eclipse.emf.ecore.xcore.scoping.XcoreImportedNamespaceAwareScopeProvider.access$9(XcoreImportedNamespaceAwareScopeProvider.java:280)
        at org.eclipse.emf.ecore.xcore.scoping.XcoreImportedNamespaceAwareScopeProvider$3.get(XcoreImportedNamespaceAwareScopeProvider.java:261)
        at org.eclipse.emf.ecore.xcore.scoping.XcoreImportedNamespaceAwareScopeProvider$3.get(XcoreImportedNamespaceAwareScopeProvider.java:1)
        at org.eclipse.xtext.util.OnChangeEvictingCache.get(OnChangeEvictingCache.java:77)
        at org.eclipse.emf.ecore.xcore.scoping.XcoreImportedNamespaceAwareScopeProvider.getClassifierScope(XcoreImportedNamespaceAwareScopeProvider.java:222)
        at org.eclipse.emf.ecore.xcore.scoping.XcoreImportedNamespaceAwareScopeProvider.getScope(XcoreImportedNamespaceAwareScopeProvider.java:104)
        at org.eclipse.xtext.xbase.scoping.batch.XbaseBatchScopeProvider.delegateGetScope(XbaseBatchScopeProvider.java:63)
        at org.eclipse.xtext.xbase.scoping.batch.XbaseBatchScopeProvider.getScope(XbaseBatchScopeProvider.java:107)
        at org.eclipse.xtext.xbase.annotations.typesystem.XbaseWithAnnotationsBatchScopeProvider.getScope(XbaseWithAnnotationsBatchScopeProvider.java:53)
        at org.eclipse.emf.ecore.xcore.scoping.XcoreScopeProvider.getScope(XcoreScopeProvider.java:74)
        at org.eclipse.xtext.linking.impl.DefaultLinkingService.getScope(DefaultLinkingService.java:59)
        at org.eclipse.xtext.linking.impl.DefaultLinkingService.getLinkedObjects(DefaultLinkingService.java:120)
        at org.eclipse.xtext.linking.lazy.LazyLinkingResource.getEObject(LazyLinkingResource.java:247)
        at org.eclipse.xtext.xbase.resource.BatchLinkableResource.getEObject(BatchLinkableResource.java:119)
        at org.eclipse.emf.ecore.xcore.resource.XcoreResource.getEObject(XcoreResource.java:186)
        at org.eclipse.emf.ecore.resource.impl.ResourceSetImpl.getEObject(ResourceSetImpl.java:223)
        at org.eclipse.emf.ecore.util.EcoreUtil.resolve(EcoreUtil.java:199)
        at org.eclipse.emf.ecore.util.EcoreUtil.resolve(EcoreUtil.java:259)
        at org.eclipse.emf.ecore.impl.BasicEObjectImpl.eResolveProxy(BasicEObjectImpl.java:1477)
        at org.eclipse.emf.ecore.xcore.impl.XGenericTypeImpl.getType(XGenericTypeImpl.java:232)
        at org.eclipse.emf.ecore.xcore.impl.XGenericTypeImpl.eGet(XGenericTypeImpl.java:302)
        at org.eclipse.emf.ecore.impl.BasicEObjectImpl.eGet(BasicEObjectImpl.java:1011)
        at org.eclipse.emf.ecore.impl.BasicEObjectImpl.eGet(BasicEObjectImpl.java:1003)
        at org.eclipse.emf.ecore.util.EContentsEList$FeatureIteratorImpl.hasNext(EContentsEList.java:439)
        at org.eclipse.emf.ecore.util.EcoreUtil.resolveCrossReferences(EcoreUtil.java:304)
        at org.eclipse.emf.ecore.util.EcoreUtil.resolveAll(EcoreUtil.java:298)
        at org.eclipse.emf.ecore.util.EcoreUtil.resolveAll(EcoreUtil.java:283)
        at org.eclipse.xtext.linking.lazy.LazyLinkingResource.doLoad(LazyLinkingResource.java:102)
        at org.eclipse.emf.ecore.resource.impl.ResourceImpl.load(ResourceImpl.java:1518)
        at org.eclipse.emf.ecore.resource.impl.ResourceImpl.load(ResourceImpl.java:1297)
        at org.eclipse.xtext.resource.persistence.StorageAwareResource.load(StorageAwareResource.java:80)
        at org.eclipse.emf.ecore.resource.impl.ResourceSetImpl.demandLoad(ResourceSetImpl.java:259)
        at org.eclipse.emf.ecore.resource.impl.ResourceSetImpl.demandLoadHelper(ResourceSetImpl.java:274)
        at org.eclipse.xtext.resource.XtextResourceSet.getResource(XtextResourceSet.java:265)
        at jpl.imce.oml.specification.ecore.extensions.OMLXcorePackages.<init>(OMLXcorePackages.java:72)
        at gov.nasa.jpl.imce.oml.specification.scala.generators.OMLUtilities.<init>(OMLUtilities.java:56)
        at gov.nasa.jpl.imce.oml.specification.scala.generators.OMLLoadTest.<init>(OMLLoadTest.java:29)
        at gov.nasa.jpl.imce.oml.specification.scala.generators.OMLLoadTest.main(OMLLoadTest.java:31)
 
 * 
 */
class OMLLoadTest extends OMLUtilities {
	
	static def main(String[] args) {
		val o = new OMLLoadTest()
		o.test()
	}
	
	def test() {
		val terminologyExtent =
		e
		.EClassifiers
		.filter(EClass)
		.findFirst[name == 'TerminologyExtent']
		
      	val module_extent = 
      	t
      	.EClassifiers
      	.filter(EClass)
      	.findFirst[name == 'Module']
      	.EOperations
      	.findFirst[name == 'extent']
      	
      	if (terminologyExtent != module_extent.EType) {
      		System.err.println("Module.extent() should be typed by TerminologyExtent")
      		System.err.println("Module.extent().EType ="+module_extent.EType)
      		System.err.println("TerminologyExtent ="+terminologyExtent)
      	} else { 		
     		System.out.println("OK")
      	}
      	
	}
	
}