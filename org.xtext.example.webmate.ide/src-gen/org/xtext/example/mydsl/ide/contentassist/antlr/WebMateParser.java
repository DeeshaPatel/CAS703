/*
 * generated by Xtext 2.30.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalWebMateParser;
import org.xtext.example.mydsl.services.WebMateGrammarAccess;

public class WebMateParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(WebMateGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, WebMateGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getGroupAccess().getAlternatives(), "rule__Group__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getValidSymbolAccess().getAlternatives(), "rule__ValidSymbol__Alternatives");
			builder.put(grammarAccess.getHTMLTagAccess().getAlternatives(), "rule__HTMLTag__Alternatives");
			builder.put(grammarAccess.getHTMLAccess().getGroup(), "rule__HTML__Group__0");
			builder.put(grammarAccess.getAbbreviationAccess().getGroup(), "rule__Abbreviation__Group__0");
			builder.put(grammarAccess.getAbbreviationAccess().getGroup_2(), "rule__Abbreviation__Group_2__0");
			builder.put(grammarAccess.getID0Access().getGroup(), "rule__ID0__Group__0");
			builder.put(grammarAccess.getID0Access().getGroup_1(), "rule__ID0__Group_1__0");
			builder.put(grammarAccess.getSymbolAccess().getGroup(), "rule__Symbol__Group__0");
			builder.put(grammarAccess.getTagAccess().getGroup(), "rule__Tag__Group__0");
			builder.put(grammarAccess.getClassAccess().getGroup(), "rule__Class__Group__0");
			builder.put(grammarAccess.getGroupAccess().getGroup_0(), "rule__Group__Group_0__0");
			builder.put(grammarAccess.getGroupAccess().getGroup_1(), "rule__Group__Group_1__0");
			builder.put(grammarAccess.getGroupAccess().getGroup_2(), "rule__Group__Group_2__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup_1(), "rule__Attribute__Group_1__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup_1_2(), "rule__Attribute__Group_1_2__0");
			builder.put(grammarAccess.getHTMLAccess().getAbbreviationAssignment_1(), "rule__HTML__AbbreviationAssignment_1");
			builder.put(grammarAccess.getAbbreviationAccess().getAbbreviationAssignment_1(), "rule__Abbreviation__AbbreviationAssignment_1");
			builder.put(grammarAccess.getAbbreviationAccess().getTagsAssignment_2_0(), "rule__Abbreviation__TagsAssignment_2_0");
			builder.put(grammarAccess.getAbbreviationAccess().getClassesAssignment_2_1(), "rule__Abbreviation__ClassesAssignment_2_1");
			builder.put(grammarAccess.getAbbreviationAccess().getIdsAssignment_2_2(), "rule__Abbreviation__IdsAssignment_2_2");
			builder.put(grammarAccess.getAbbreviationAccess().getSymbolsAssignment_2_3(), "rule__Abbreviation__SymbolsAssignment_2_3");
			builder.put(grammarAccess.getAbbreviationAccess().getAttributesAssignment_2_4(), "rule__Abbreviation__AttributesAssignment_2_4");
			builder.put(grammarAccess.getAbbreviationAccess().getGroupAssignment_2_5(), "rule__Abbreviation__GroupAssignment_2_5");
			builder.put(grammarAccess.getID0Access().getIdNameAssignment_1_1(), "rule__ID0__IdNameAssignment_1_1");
			builder.put(grammarAccess.getSymbolAccess().getSymAssignment_1(), "rule__Symbol__SymAssignment_1");
			builder.put(grammarAccess.getSymbolAccess().getTagAssignment_2(), "rule__Symbol__TagAssignment_2");
			builder.put(grammarAccess.getTagAccess().getTagNameAssignment_1(), "rule__Tag__TagNameAssignment_1");
			builder.put(grammarAccess.getClassAccess().getClassNameAssignment_2(), "rule__Class__ClassNameAssignment_2");
			builder.put(grammarAccess.getGroupAccess().getAbbreviationAssignment_0_2(), "rule__Group__AbbreviationAssignment_0_2");
			builder.put(grammarAccess.getGroupAccess().getAbbreviationAssignment_0_5(), "rule__Group__AbbreviationAssignment_0_5");
			builder.put(grammarAccess.getGroupAccess().getCountAssignment_1_1(), "rule__Group__CountAssignment_1_1");
			builder.put(grammarAccess.getGroupAccess().getAbbreviationAssignment_2_1(), "rule__Group__AbbreviationAssignment_2_1");
			builder.put(grammarAccess.getAttributeAccess().getAttributeNameAssignment_1_1(), "rule__Attribute__AttributeNameAssignment_1_1");
			builder.put(grammarAccess.getAttributeAccess().getAttributeValueAssignment_1_2_1(), "rule__Attribute__AttributeValueAssignment_1_2_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private WebMateGrammarAccess grammarAccess;

	@Override
	protected InternalWebMateParser createParser() {
		InternalWebMateParser result = new InternalWebMateParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public WebMateGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(WebMateGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
