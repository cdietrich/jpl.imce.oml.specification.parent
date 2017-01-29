package jpl.imce.oml.specification.util;

import com.google.inject.Inject;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode;

@SuppressWarnings("all")
public class OMLSL_COMMENTValueConverter extends AbstractLexerBasedConverter<String> {
  @Inject
  protected IValueConverterService valueConverterService;
  
  public String toEscapedString(final String value) {
    return ("//" + value);
  }
  
  public String toValue(final String string, final INode node) throws ValueConverterException {
    boolean _startsWith = string.startsWith("//");
    boolean _not = (!_startsWith);
    if (_not) {
      throw new ValueConverterException("Invalid Single Line Comment", node, null);
    }
    int _length = string.length();
    return string.substring(2, _length);
  }
}
