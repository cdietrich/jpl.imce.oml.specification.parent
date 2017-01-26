/*
 * generated by Xtext 2.10.0
 */
package jpl.imce.oml.specification.idea

import com.google.inject.Guice
import jpl.imce.oml.specification.OntologicalModelingLanguageRuntimeModule
import jpl.imce.oml.specification.OntologicalModelingLanguageStandaloneSetupGenerated
import org.eclipse.xtext.util.Modules2

class OntologicalModelingLanguageStandaloneSetupIdea extends OntologicalModelingLanguageStandaloneSetupGenerated {
	override createInjector() {
		val runtimeModule = new OntologicalModelingLanguageRuntimeModule()
		val ideaModule = new OntologicalModelingLanguageIdeaModule()
		val mergedModule = Modules2.mixin(runtimeModule, ideaModule)
		return Guice.createInjector(mergedModule)
	}
}
