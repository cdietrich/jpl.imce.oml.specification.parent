/*
 * generated by Xtext 2.10.0
 */
package jpl.imce.oml.specification.parser.antlr;

import com.google.inject.Inject;
import jpl.imce.oml.specification.parser.antlr.internal.InternalOntologicalModelingLanguageParser;
import jpl.imce.oml.specification.services.OntologicalModelingLanguageGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class OntologicalModelingLanguageParser extends AbstractAntlrParser {

	@Inject
	private OntologicalModelingLanguageGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalOntologicalModelingLanguageParser createParser(XtextTokenStream stream) {
		return new InternalOntologicalModelingLanguageParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "TerminologyExtent";
	}

	public OntologicalModelingLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(OntologicalModelingLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
