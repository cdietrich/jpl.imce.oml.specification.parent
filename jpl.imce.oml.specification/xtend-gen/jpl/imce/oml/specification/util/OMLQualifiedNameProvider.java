package jpl.imce.oml.specification.util;

import com.google.inject.Inject;
import jpl.imce.oml.specification.ecore.AnnotationProperty;
import jpl.imce.oml.specification.ecore.Resource;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;

@SuppressWarnings("all")
public class OMLQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
  @Inject
  private IQualifiedNameConverter qnc;
  
  public QualifiedName qualifiedName(final AnnotationProperty ap) {
    String _iri = ap.getIri();
    String _plus = ("<" + _iri);
    String _plus_1 = (_plus + ">");
    return this.qnc.toQualifiedName(_plus_1);
  }
  
  public QualifiedName qualifiedName(final Resource resource) {
    String _iri = resource.iri();
    String _plus = ("<" + _iri);
    String _plus_1 = (_plus + ">");
    return this.qnc.toQualifiedName(_plus_1);
  }
}
