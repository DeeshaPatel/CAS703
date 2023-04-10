/*
 * generated by Xtext 2.30.0
 */
grammar InternalWebMate;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl1.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.mydsl1.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl1.services.WebMateGrammarAccess;

}

@parser::members {

 	private WebMateGrammarAccess grammarAccess;

    public InternalWebMateParser(TokenStream input, WebMateGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "HTML";
   	}

   	@Override
   	protected WebMateGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleHTML
entryRuleHTML returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHTMLRule()); }
	iv_ruleHTML=ruleHTML
	{ $current=$iv_ruleHTML.current; }
	EOF;

// Rule HTML
ruleHTML returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getHTMLAccess().getHTMLAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getHTMLAccess().getAbbreviationAbbreviationParserRuleCall_1_0());
				}
				lv_abbreviation_1_0=ruleAbbreviation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHTMLRule());
					}
					add(
						$current,
						"abbreviation",
						lv_abbreviation_1_0,
						"org.xtext.example.mydsl1.WebMate.Abbreviation");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleAbbreviation
entryRuleAbbreviation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbbreviationRule()); }
	iv_ruleAbbreviation=ruleAbbreviation
	{ $current=$iv_ruleAbbreviation.current; }
	EOF;

// Rule Abbreviation
ruleAbbreviation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getAbbreviationAccess().getAbbreviationAction_0(),
					$current);
			}
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getAbbreviationAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAbbreviationRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getAbbreviationAccess().getAbbreviationAbbreviationCrossReference_2_0_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)*
			    |
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getAbbreviationAccess().getTagsTagParserRuleCall_2_1_0_0());
						}
						lv_tags_3_0=ruleTag
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getAbbreviationRule());
							}
							add(
								$current,
								"tags",
								lv_tags_3_0,
								"org.xtext.example.mydsl1.WebMate.Tag");
							afterParserOrEnumRuleCall();
						}
					)
				)+
				(
					(
						(
							{
								newCompositeNode(grammarAccess.getAbbreviationAccess().getIdsID0ParserRuleCall_2_1_1_0_0());
							}
							lv_ids_4_0=ruleID0
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getAbbreviationRule());
								}
								add(
									$current,
									"ids",
									lv_ids_4_0,
									"org.xtext.example.mydsl1.WebMate.ID0");
								afterParserOrEnumRuleCall();
							}
						)
					)*
					(
						(
							{
								newCompositeNode(grammarAccess.getAbbreviationAccess().getSymbolsSymbolParserRuleCall_2_1_1_1_0());
							}
							lv_symbols_5_0=ruleSymbol
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getAbbreviationRule());
								}
								add(
									$current,
									"symbols",
									lv_symbols_5_0,
									"org.xtext.example.mydsl1.WebMate.Symbol");
								afterParserOrEnumRuleCall();
							}
						)
					)*
					(
						(
							{
								newCompositeNode(grammarAccess.getAbbreviationAccess().getClassesClassParserRuleCall_2_1_1_2_0());
							}
							lv_classes_6_0=ruleClass
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getAbbreviationRule());
								}
								add(
									$current,
									"classes",
									lv_classes_6_0,
									"org.xtext.example.mydsl1.WebMate.Class");
								afterParserOrEnumRuleCall();
							}
						)
					)*
					(
						(
							{
								newCompositeNode(grammarAccess.getAbbreviationAccess().getAttributesAttributeParserRuleCall_2_1_1_3_0());
							}
							lv_attributes_7_0=ruleAttribute
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getAbbreviationRule());
								}
								add(
									$current,
									"attributes",
									lv_attributes_7_0,
									"org.xtext.example.mydsl1.WebMate.Attribute");
								afterParserOrEnumRuleCall();
							}
						)
					)*
					(
						(
							{
								newCompositeNode(grammarAccess.getAbbreviationAccess().getGroupGroupParserRuleCall_2_1_1_4_0());
							}
							lv_group_8_0=ruleGroup
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getAbbreviationRule());
								}
								add(
									$current,
									"group",
									lv_group_8_0,
									"org.xtext.example.mydsl1.WebMate.Group");
								afterParserOrEnumRuleCall();
							}
						)
					)*
				)
			)
		)
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getAbbreviationAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleID0
entryRuleID0 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getID0Rule()); }
	iv_ruleID0=ruleID0
	{ $current=$iv_ruleID0.current; }
	EOF;

// Rule ID0
ruleID0 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getID0Access().getIDAction_0(),
					$current);
			}
		)
		(
			otherlv_1='#'
			{
				newLeafNode(otherlv_1, grammarAccess.getID0Access().getNumberSignKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getID0Access().getIdNameEStringParserRuleCall_1_1_0());
					}
					lv_idName_2_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getID0Rule());
						}
						set(
							$current,
							"idName",
							lv_idName_2_0,
							"org.xtext.example.mydsl1.WebMate.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleSymbol
entryRuleSymbol returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSymbolRule()); }
	iv_ruleSymbol=ruleSymbol
	{ $current=$iv_ruleSymbol.current; }
	EOF;

// Rule Symbol
ruleSymbol returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSymbolAccess().getSymbolAction_0_0(),
						$current);
				}
			)
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getSymbolAccess().getSymSYMEnumRuleCall_0_1_0_0());
						}
						lv_sym_1_0=ruleSYM
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSymbolRule());
							}
							set(
								$current,
								"sym",
								lv_sym_1_0,
								"org.xtext.example.mydsl1.WebMate.SYM");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getSymbolAccess().getCountEIntParserRuleCall_0_1_1_0());
						}
						lv_count_2_0=ruleEInt
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSymbolRule());
							}
							set(
								$current,
								"count",
								lv_count_2_0,
								"org.xtext.example.mydsl1.WebMate.EInt");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)
		    |
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getSymbolAccess().getSymSYMEnumRuleCall_1_0_0());
					}
					lv_sym_3_0=ruleSYM
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSymbolRule());
						}
						set(
							$current,
							"sym",
							lv_sym_3_0,
							"org.xtext.example.mydsl1.WebMate.SYM");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getSymbolAccess().getTagTagParserRuleCall_1_1_0());
					}
					lv_tag_4_0=ruleTag
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSymbolRule());
						}
						set(
							$current,
							"tag",
							lv_tag_4_0,
							"org.xtext.example.mydsl1.WebMate.Tag");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleTag
entryRuleTag returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTagRule()); }
	iv_ruleTag=ruleTag
	{ $current=$iv_ruleTag.current; }
	EOF;

// Rule Tag
ruleTag returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getTagAccess().getTagAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTagAccess().getTagNameHTMLTagEnumRuleCall_1_0());
				}
				lv_tagName_1_0=ruleHTMLTag
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTagRule());
					}
					set(
						$current,
						"tagName",
						lv_tagName_1_0,
						"org.xtext.example.mydsl1.WebMate.HTMLTag");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTagAccess().getClassClassParserRuleCall_2_0());
				}
				lv_class_2_0=ruleClass
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTagRule());
					}
					add(
						$current,
						"class",
						lv_class_2_0,
						"org.xtext.example.mydsl1.WebMate.Class");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getTagAccess().getIdID0ParserRuleCall_3_0());
				}
				lv_id_3_0=ruleID0
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTagRule());
					}
					set(
						$current,
						"id",
						lv_id_3_0,
						"org.xtext.example.mydsl1.WebMate.ID0");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getTagAccess().getAttributeAttributeParserRuleCall_4_0());
				}
				lv_attribute_4_0=ruleAttribute
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTagRule());
					}
					add(
						$current,
						"attribute",
						lv_attribute_4_0,
						"org.xtext.example.mydsl1.WebMate.Attribute");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			otherlv_5='{'
			{
				newLeafNode(otherlv_5, grammarAccess.getTagAccess().getLeftCurlyBracketKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTagAccess().getInputStringEStringParserRuleCall_5_1_0());
					}
					lv_inputString_6_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTagRule());
						}
						set(
							$current,
							"inputString",
							lv_inputString_6_0,
							"org.xtext.example.mydsl1.WebMate.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_7='}'
			{
				newLeafNode(otherlv_7, grammarAccess.getTagAccess().getRightCurlyBracketKeyword_5_2());
			}
		)?
	)
;

// Entry rule entryRuleClass
entryRuleClass returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClassRule()); }
	iv_ruleClass=ruleClass
	{ $current=$iv_ruleClass.current; }
	EOF;

// Rule Class
ruleClass returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getClassAccess().getClassAction_0(),
					$current);
			}
		)
		otherlv_1='.'
		{
			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getFullStopKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getClassAccess().getClassNameEStringParserRuleCall_2_0());
				}
				lv_className_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getClassRule());
					}
					set(
						$current,
						"className",
						lv_className_2_0,
						"org.xtext.example.mydsl1.WebMate.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleAttribute
entryRuleAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeRule()); }
	iv_ruleAttribute=ruleAttribute
	{ $current=$iv_ruleAttribute.current; }
	EOF;

// Rule Attribute
ruleAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getAttributeAccess().getAttributeAction_0(),
					$current);
			}
		)
		(
			otherlv_1='['
			{
				newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAttributeAccess().getAttributeNameEStringParserRuleCall_1_1_0());
					}
					lv_attributeName_2_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAttributeRule());
						}
						set(
							$current,
							"attributeName",
							lv_attributeName_2_0,
							"org.xtext.example.mydsl1.WebMate.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_3='='
				{
					newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getEqualsSignKeyword_1_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getAttributeAccess().getAttributeValueEStringParserRuleCall_1_2_1_0());
						}
						lv_attributeValue_4_0=ruleEString
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getAttributeRule());
							}
							set(
								$current,
								"attributeValue",
								lv_attributeValue_4_0,
								"org.xtext.example.mydsl1.WebMate.EString");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)?
			otherlv_5=']'
			{
				newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_1_3());
			}
		)
	)
;

// Entry rule entryRuleGroup
entryRuleGroup returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGroupRule()); }
	iv_ruleGroup=ruleGroup
	{ $current=$iv_ruleGroup.current; }
	EOF;

// Rule Group
ruleGroup returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getGroupAccess().getGroupAction_0(),
					$current);
			}
		)
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getGroupAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGroupAccess().getAbbreviationAbbreviationParserRuleCall_2_0());
				}
				lv_abbreviation_2_0=ruleAbbreviation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGroupRule());
					}
					add(
						$current,
						"abbreviation",
						lv_abbreviation_2_0,
						"org.xtext.example.mydsl1.WebMate.Abbreviation");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getGroupAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEIntRule()); }
	iv_ruleEInt=ruleEInt
	{ $current=$iv_ruleEInt.current.getText(); }
	EOF;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
			}
		)?
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Rule HTMLTag
ruleHTMLTag returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='div'
			{
				$current = grammarAccess.getHTMLTagAccess().getDivEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getHTMLTagAccess().getDivEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='h1'
			{
				$current = grammarAccess.getHTMLTagAccess().getH1EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getHTMLTagAccess().getH1EnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='p'
			{
				$current = grammarAccess.getHTMLTagAccess().getPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getHTMLTagAccess().getPEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='ul'
			{
				$current = grammarAccess.getHTMLTagAccess().getUlEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getHTMLTagAccess().getUlEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='li'
			{
				$current = grammarAccess.getHTMLTagAccess().getLiEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getHTMLTagAccess().getLiEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='a'
			{
				$current = grammarAccess.getHTMLTagAccess().getAEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getHTMLTagAccess().getAEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='img'
			{
				$current = grammarAccess.getHTMLTagAccess().getImgEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getHTMLTagAccess().getImgEnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='form'
			{
				$current = grammarAccess.getHTMLTagAccess().getFormEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getHTMLTagAccess().getFormEnumLiteralDeclaration_7());
			}
		)
		    |
		(
			enumLiteral_8='input'
			{
				$current = grammarAccess.getHTMLTagAccess().getInputEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_8, grammarAccess.getHTMLTagAccess().getInputEnumLiteralDeclaration_8());
			}
		)
		    |
		(
			enumLiteral_9='button'
			{
				$current = grammarAccess.getHTMLTagAccess().getButtonEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_9, grammarAccess.getHTMLTagAccess().getButtonEnumLiteralDeclaration_9());
			}
		)
		    |
		(
			enumLiteral_10='option'
			{
				$current = grammarAccess.getHTMLTagAccess().getOptionEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_10, grammarAccess.getHTMLTagAccess().getOptionEnumLiteralDeclaration_10());
			}
		)
		    |
		(
			enumLiteral_11='select'
			{
				$current = grammarAccess.getHTMLTagAccess().getSelectEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_11, grammarAccess.getHTMLTagAccess().getSelectEnumLiteralDeclaration_11());
			}
		)
	)
;

// Rule SYM
ruleSYM returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='+'
			{
				$current = grammarAccess.getSYMAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getSYMAccess().getPLUSEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='*'
			{
				$current = grammarAccess.getSYMAccess().getMULTIPLYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getSYMAccess().getMULTIPLYEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='>'
			{
				$current = grammarAccess.getSYMAccess().getGREATEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getSYMAccess().getGREATEREnumLiteralDeclaration_2());
			}
		)
	)
;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('a'..'z'|'A'..'Z'|'_'|' ') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
