package jpl.imce.oml.specification.util;

import com.google.common.base.Objects;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;

@SuppressWarnings("all")
public class OMLQualifiedNameConverter extends IQualifiedNameConverter.DefaultImpl {
  public String toString(final QualifiedName qualifiedName) {
    String _xblockexpression = null;
    {
      boolean _equals = Objects.equal(qualifiedName, null);
      if (_equals) {
        throw new IllegalArgumentException("Qualified name cannot be null");
      }
      String _delimiter = this.getDelimiter();
      _xblockexpression = qualifiedName.toString(_delimiter);
    }
    return _xblockexpression;
  }
  
  public String getDelimiter() {
    return ":";
  }
  
  public QualifiedName toQualifiedName(final String qualifiedNameAsString) {
    return super.toQualifiedName(qualifiedNameAsString);
  }
}
