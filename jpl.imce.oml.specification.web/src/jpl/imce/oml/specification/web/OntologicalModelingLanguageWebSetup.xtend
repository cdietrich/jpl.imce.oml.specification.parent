/*
 * generated by Xtext 2.10.0
 */
package jpl.imce.oml.specification.web

import com.google.inject.Guice
import com.google.inject.Injector
import com.google.inject.Provider
import com.google.inject.util.Modules
import java.util.concurrent.ExecutorService
import jpl.imce.oml.specification.OntologicalModelingLanguageRuntimeModule
import jpl.imce.oml.specification.OntologicalModelingLanguageStandaloneSetup
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

/**
 * Initialization support for running Xtext languages in web applications.
 */
@FinalFieldsConstructor
class OntologicalModelingLanguageWebSetup extends OntologicalModelingLanguageStandaloneSetup {
	
	val Provider<ExecutorService> executorServiceProvider;
	
	override Injector createInjector() {
		val runtimeModule = new OntologicalModelingLanguageRuntimeModule()
		val webModule = new OntologicalModelingLanguageWebModule(executorServiceProvider)
		return Guice.createInjector(Modules.override(runtimeModule).with(webModule))
	}
	
}
