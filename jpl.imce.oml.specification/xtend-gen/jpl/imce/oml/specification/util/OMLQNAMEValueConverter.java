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
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractValueConverter;
import org.eclipse.xtext.nodemodel.INode;

@SuppressWarnings("all")
public class OMLQNAMEValueConverter extends AbstractValueConverter<String> {
  @Inject
  protected IValueConverterService valueConverterService;
  
  public String getDelegateRuleName() {
    return "ValidID";
  }
  
  public String toString(final String value) {
    boolean _contains = value.contains(":");
    if (_contains) {
      final StringBuilder buffer = new StringBuilder();
      final String[] segment = value.split(":");
      String _get = segment[0];
      boolean _equals = _get.equals("");
      boolean _not = (!_equals);
      if (_not) {
        Object _get_1 = segment[0];
        String _delegateRuleName = this.getDelegateRuleName();
        String _string = this.valueConverterService.toString(_get_1, _delegateRuleName);
        buffer.append(_string);
      }
      buffer.append(":");
      Object _get_2 = segment[1];
      String _delegateRuleName_1 = this.getDelegateRuleName();
      String _string_1 = this.valueConverterService.toString(_get_2, _delegateRuleName_1);
      buffer.append(_string_1);
      return buffer.toString();
    } else {
      String _delegateRuleName_2 = this.getDelegateRuleName();
      return this.valueConverterService.toString(value, _delegateRuleName_2);
    }
  }
  
  public String toValue(final String string, final INode node) throws ValueConverterException {
    boolean _contains = string.contains(":");
    if (_contains) {
      final StringBuilder buffer = new StringBuilder();
      final String[] segment = string.split(":");
      String _get = segment[0];
      boolean _equals = _get.equals("");
      boolean _not = (!_equals);
      if (_not) {
        String _get_1 = segment[0];
        String _delegateRuleName = this.getDelegateRuleName();
        Object _value = this.valueConverterService.toValue(_get_1, _delegateRuleName, null);
        buffer.append(((String) _value));
      }
      buffer.append(":");
      String _get_2 = segment[1];
      String _delegateRuleName_1 = this.getDelegateRuleName();
      Object _value_1 = this.valueConverterService.toValue(_get_2, _delegateRuleName_1, null);
      buffer.append(((String) _value_1));
      return buffer.toString();
    } else {
      String _delegateRuleName_2 = this.getDelegateRuleName();
      Object _value_2 = this.valueConverterService.toValue(string, _delegateRuleName_2, null);
      return ((String) _value_2);
    }
  }
}
