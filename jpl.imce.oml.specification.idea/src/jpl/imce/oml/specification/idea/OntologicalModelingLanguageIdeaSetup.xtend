/*
 * generated by Xtext 2.10.0
 */
package jpl.imce.oml.specification.idea

import org.eclipse.xtext.ISetup
import org.eclipse.xtext.idea.extensions.EcoreGlobalRegistries

class OntologicalModelingLanguageIdeaSetup implements ISetup {

	override createInjectorAndDoEMFRegistration() {
		EcoreGlobalRegistries.ensureInitialized
		new OntologicalModelingLanguageStandaloneSetupIdea().createInjector
	}

}
