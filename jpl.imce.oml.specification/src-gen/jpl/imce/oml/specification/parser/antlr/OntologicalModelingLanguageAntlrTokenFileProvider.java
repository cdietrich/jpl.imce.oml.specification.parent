/*
 * generated by Xtext 2.10.0
 */
package jpl.imce.oml.specification.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class OntologicalModelingLanguageAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("jpl/imce/oml/specification/parser/antlr/internal/InternalOntologicalModelingLanguage.tokens");
	}
}
