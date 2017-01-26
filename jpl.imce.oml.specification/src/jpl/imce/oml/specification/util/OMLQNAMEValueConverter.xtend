package jpl.imce.oml.specification.util

import com.google.inject.Inject
import org.eclipse.xtext.conversion.IValueConverterService
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.conversion.impl.AbstractValueConverter
import org.eclipse.xtext.nodemodel.INode

class OMLQNAMEValueConverter extends AbstractValueConverter<String> {
	
	@Inject
	protected IValueConverterService valueConverterService;

	def String getDelegateRuleName() {
		return "ValidID";
	}

	override toString(String value) {
		if (value.contains(':')) {
			val buffer = new StringBuilder()
			val segment = value.split(':')
			if (!segment.get(0).equals(""))
				buffer.append(valueConverterService.toString(segment.get(0), getDelegateRuleName()))
			buffer.append(':');
			buffer.append(valueConverterService.toString(segment.get(1), getDelegateRuleName()))
			return buffer.toString()
		} else
			return valueConverterService.toString(value, getDelegateRuleName())
	}
	
	override toValue(String string, INode node) throws ValueConverterException {
		if (string.contains(':')) {
			val buffer = new StringBuilder()
			val segment = string.split(':')
			if (!segment.get(0).equals(""))
				buffer.append(valueConverterService.toValue(segment.get(0), getDelegateRuleName(), null) as String)
			buffer.append(':');
			buffer.append(valueConverterService.toValue(segment.get(1), getDelegateRuleName(), null) as String)
			return buffer.toString()
		}  else
			return valueConverterService.toValue(string, getDelegateRuleName(), null) as String
	}
	
}