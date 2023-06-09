/*
 * generated by Xtext 2.30.0
 */
package org.xtext.example.mydsl1.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.mydsl1.parser.antlr.internal.InternalWebMateParser;
import org.xtext.example.mydsl1.services.WebMateGrammarAccess;

public class WebMateParser extends AbstractAntlrParser {

	@Inject
	private WebMateGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalWebMateParser createParser(XtextTokenStream stream) {
		return new InternalWebMateParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "HTML";
	}

	public WebMateGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(WebMateGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
