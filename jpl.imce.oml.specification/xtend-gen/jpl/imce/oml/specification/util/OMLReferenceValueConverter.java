package jpl.imce.oml.specification.util;

import com.google.inject.Inject;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractValueConverter;
import org.eclipse.xtext.nodemodel.INode;

@SuppressWarnings("all")
public class OMLReferenceValueConverter extends AbstractValueConverter<String> {
  @Inject
  protected IValueConverterService valueConverterService;
  
  public String getDelegateRuleName() {
    return "QNAME";
  }
  
  public String toString(final String value) {
    if ((value.startsWith("<") && value.endsWith(">"))) {
      return value;
    } else {
      String _delegateRuleName = this.getDelegateRuleName();
      return this.valueConverterService.toString(value, _delegateRuleName);
    }
  }
  
  public String toValue(final String string, final INode node) throws ValueConverterException {
    if ((string.startsWith("<") && string.endsWith(">"))) {
      return string;
    } else {
      String _delegateRuleName = this.getDelegateRuleName();
      Object _value = this.valueConverterService.toValue(string, _delegateRuleName, null);
      return ((String) _value);
    }
  }
}
