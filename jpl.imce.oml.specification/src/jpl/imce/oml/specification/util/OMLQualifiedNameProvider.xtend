package jpl.imce.oml.specification.util

import com.google.inject.Inject
import jpl.imce.oml.specification.ecore.Resource
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.naming.QualifiedName
import jpl.imce.oml.specification.ecore.AnnotationProperty

class OMLQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	@Inject IQualifiedNameConverter qnc

	def QualifiedName qualifiedName(AnnotationProperty ap) {
		return qnc.toQualifiedName('<'+ap.iri+'>')
	}
	
	def QualifiedName qualifiedName(Resource resource) {
		return qnc.toQualifiedName('<'+resource.iri+'>')
	}
}