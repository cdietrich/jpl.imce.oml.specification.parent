package jpl.imce.oml.specification.util;

import com.google.inject.Inject;
import jpl.imce.oml.specification.util.OMLIRIValueConverter;
import jpl.imce.oml.specification.util.OMLQNAMEValueConverter;
import jpl.imce.oml.specification.util.OMLReferenceValueConverter;
import jpl.imce.oml.specification.util.OMLSL_COMMENTValueConverter;
import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.impl.AbstractIDValueConverter;
import org.eclipse.xtext.conversion.impl.KeywordAlternativeConverter;
import org.eclipse.xtext.conversion.impl.QualifiedNameValueConverter;

@SuppressWarnings("all")
public class OMLValueConverterService extends DefaultTerminalConverters {
  @Inject
  private OMLReferenceValueConverter referenceValueConverter;
  
  @Inject
  private OMLQNAMEValueConverter qnameValueConverter;
  
  @Inject
  private QualifiedNameValueConverter qualifiedNameValueConverter;
  
  @Inject
  private OMLIRIValueConverter iriValueConverter;
  
  @Inject
  private OMLSL_COMMENTValueConverter sl_CommentValueConverter;
  
  @Inject
  private KeywordAlternativeConverter validIDValueConverter;
  
  @Inject
  private AbstractIDValueConverter idValueConverter;
  
  @ValueConverter(rule = "Reference")
  public IValueConverter<String> Reference() {
    return this.referenceValueConverter;
  }
  
  @ValueConverter(rule = "QNAME")
  public IValueConverter<String> QNAME() {
    return this.qnameValueConverter;
  }
  
  @ValueConverter(rule = "QualifiedName")
  public IValueConverter<String> QualifiedName() {
    return this.qualifiedNameValueConverter;
  }
  
  @ValueConverter(rule = "IRI")
  public IValueConverter<String> IRI() {
    return this.iriValueConverter;
  }
  
  @ValueConverter(rule = "SL_COMMENT")
  public IValueConverter<String> SL_COMMENT() {
    return this.sl_CommentValueConverter;
  }
  
  @ValueConverter(rule = "ValidID")
  public IValueConverter<String> ValidID() {
    return this.validIDValueConverter;
  }
  
  @ValueConverter(rule = "ID")
  public IValueConverter<String> ID() {
    return this.idValueConverter;
  }
}
