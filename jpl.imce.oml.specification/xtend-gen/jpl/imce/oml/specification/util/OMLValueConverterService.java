/**
 * Copyright 2016 California Institute of Technology ("Caltech").
 * U.S. Government sponsorship acknowledged.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * License Terms
 */
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
  @Override
  public IValueConverter<String> ID() {
    return this.idValueConverter;
  }
}
