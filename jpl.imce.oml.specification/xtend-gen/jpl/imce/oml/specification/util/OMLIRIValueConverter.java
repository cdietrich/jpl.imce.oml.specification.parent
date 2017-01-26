package jpl.imce.oml.specification.util;

import com.google.inject.Inject;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode;

@SuppressWarnings("all")
public class OMLIRIValueConverter extends AbstractLexerBasedConverter<String> {
  @Inject
  protected IValueConverterService valueConverterService;
  
  @Override
  public String toEscapedString(final String value) {
    return (("<" + value) + ">");
  }
  
  @Override
  public String toValue(final String string, final INode node) throws ValueConverterException {
    if (((!string.startsWith("<")) || (!string.endsWith(">")))) {
      throw new ValueConverterException("Invalid IRI", node, null);
    }
    int _length = string.length();
    int _minus = (_length - 1);
    return string.substring(1, _minus);
  }
}
