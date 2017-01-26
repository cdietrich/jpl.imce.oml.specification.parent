package jpl.imce.oml.specification.util

import com.google.inject.Inject
import org.eclipse.xtext.conversion.IValueConverterService
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter
import org.eclipse.xtext.nodemodel.INode

class OMLIRIValueConverter extends AbstractLexerBasedConverter<String> {
	
	@Inject
	protected IValueConverterService valueConverterService;

	override toEscapedString(String value) {
		return '<'+value+'>'
	}
	
	override toValue(String string, INode node) throws ValueConverterException {
		if (!string.startsWith('<') || !string.endsWith('>'))
			throw new ValueConverterException("Invalid IRI", node, null);
		return string.substring(1, string.length-1)
	}
	
}