/*
 * generated by Xtext 2.10.0
 */
package jpl.imce.oml.specification.web

import com.google.inject.Provider
import java.util.List
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import javax.servlet.annotation.WebServlet
import org.eclipse.xtext.web.servlet.XtextServlet

/**
 * Deploy this class into a servlet container to enable DSL-specific services.
 */
@WebServlet(name = 'XtextServices', urlPatterns = '/xtext-service/*')
class OntologicalModelingLanguageServlet extends XtextServlet {
	
	val List<ExecutorService> executorServices = newArrayList
	
	override init() {
		super.init()
		val Provider<ExecutorService> executorServiceProvider = [Executors.newCachedThreadPool => [executorServices += it]]
		new OntologicalModelingLanguageWebSetup(executorServiceProvider).createInjectorAndDoEMFRegistration()
	}
	
	override destroy() {
		executorServices.forEach[shutdown()]
		executorServices.clear()
		super.destroy()
	}
	
}
