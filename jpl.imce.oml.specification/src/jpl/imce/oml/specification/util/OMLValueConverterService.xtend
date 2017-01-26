package jpl.imce.oml.specification.util

import com.google.inject.Inject
import org.eclipse.xtext.common.services.DefaultTerminalConverters
import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverter
import org.eclipse.xtext.conversion.impl.AbstractIDValueConverter
import org.eclipse.xtext.conversion.impl.KeywordAlternativeConverter
import org.eclipse.xtext.conversion.impl.QualifiedNameValueConverter

class OMLValueConverterService extends DefaultTerminalConverters {

	@Inject OMLReferenceValueConverter referenceValueConverter;

	@Inject OMLQNAMEValueConverter qnameValueConverter;

	@Inject QualifiedNameValueConverter qualifiedNameValueConverter;

	@Inject OMLIRIValueConverter iriValueConverter;

	@Inject OMLSL_COMMENTValueConverter sl_CommentValueConverter;

	@Inject KeywordAlternativeConverter validIDValueConverter;

	@Inject AbstractIDValueConverter idValueConverter;

	@ValueConverter(rule="Reference")
	def IValueConverter<String> Reference() {
		referenceValueConverter;
	}

	@ValueConverter(rule="QNAME")
	def IValueConverter<String> QNAME() {
		qnameValueConverter;
	}

	@ValueConverter(rule="QualifiedName")
	def IValueConverter<String> QualifiedName() {
		qualifiedNameValueConverter;
	}

	@ValueConverter(rule="IRI")
	def IValueConverter<String> IRI() {
		iriValueConverter;
	}

	@ValueConverter(rule="SL_COMMENT")
	def IValueConverter<String> SL_COMMENT() {
		sl_CommentValueConverter;
	}

	@ValueConverter(rule="ValidID")
	def IValueConverter<String> ValidID() {
		validIDValueConverter;
	}

	@ValueConverter(rule="ID")
	override def IValueConverter<String> ID() {
		idValueConverter;
	}
}
