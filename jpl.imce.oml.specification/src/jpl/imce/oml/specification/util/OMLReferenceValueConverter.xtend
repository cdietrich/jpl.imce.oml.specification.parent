package jpl.imce.oml.specification.util

import com.google.inject.Inject
import org.eclipse.xtext.conversion.IValueConverterService
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.conversion.impl.AbstractValueConverter
import org.eclipse.xtext.nodemodel.INode

class OMLReferenceValueConverter extends AbstractValueConverter<String> {
	
	@Inject
	protected IValueConverterService valueConverterService;

	def String getDelegateRuleName() {
		return "QNAME";
	}

	override toString(String value) {
		if (value.startsWith('<') && value.endsWith('>'))
			return value
		else 
			return valueConverterService.toString(value, getDelegateRuleName())
	}
	
	override toValue(String string, INode node) throws ValueConverterException {
		if (string.startsWith('<') && string.endsWith('>'))
			return string
		else 
			return valueConverterService.toValue(string, getDelegateRuleName(), null) as String
	}
	
}