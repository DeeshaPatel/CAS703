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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWebMateParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'#'", "'*'", "'+'", "'>'", "'^'", "'.'", "'['", "'='", "']'", "'('", "')'", "'-'", "'div'", "'h1'", "'p'", "'ul'", "'li'", "'a'", "'img'", "'form'", "'input'", "'button'", "'option'", "'select'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalWebMateParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWebMateParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWebMateParser.tokenNames; }
    public String getGrammarFileName() { return "InternalWebMate.g"; }



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




    // $ANTLR start "entryRuleHTML"
    // InternalWebMate.g:65:1: entryRuleHTML returns [EObject current=null] : iv_ruleHTML= ruleHTML EOF ;
    public final EObject entryRuleHTML() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHTML = null;


        try {
            // InternalWebMate.g:65:45: (iv_ruleHTML= ruleHTML EOF )
            // InternalWebMate.g:66:2: iv_ruleHTML= ruleHTML EOF
            {
             newCompositeNode(grammarAccess.getHTMLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHTML=ruleHTML();

            state._fsp--;

             current =iv_ruleHTML; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHTML"


    // $ANTLR start "ruleHTML"
    // InternalWebMate.g:72:1: ruleHTML returns [EObject current=null] : ( () ( (lv_abbreviation_1_0= ruleAbbreviation ) )+ ) ;
    public final EObject ruleHTML() throws RecognitionException {
        EObject current = null;

        EObject lv_abbreviation_1_0 = null;



        	enterRule();

        try {
            // InternalWebMate.g:78:2: ( ( () ( (lv_abbreviation_1_0= ruleAbbreviation ) )+ ) )
            // InternalWebMate.g:79:2: ( () ( (lv_abbreviation_1_0= ruleAbbreviation ) )+ )
            {
            // InternalWebMate.g:79:2: ( () ( (lv_abbreviation_1_0= ruleAbbreviation ) )+ )
            // InternalWebMate.g:80:3: () ( (lv_abbreviation_1_0= ruleAbbreviation ) )+
            {
            // InternalWebMate.g:80:3: ()
            // InternalWebMate.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHTMLAccess().getHTMLAction_0(),
            					current);
            			

            }

            // InternalWebMate.g:87:3: ( (lv_abbreviation_1_0= ruleAbbreviation ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWebMate.g:88:4: (lv_abbreviation_1_0= ruleAbbreviation )
            	    {
            	    // InternalWebMate.g:88:4: (lv_abbreviation_1_0= ruleAbbreviation )
            	    // InternalWebMate.g:89:5: lv_abbreviation_1_0= ruleAbbreviation
            	    {

            	    					newCompositeNode(grammarAccess.getHTMLAccess().getAbbreviationAbbreviationParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_abbreviation_1_0=ruleAbbreviation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getHTMLRule());
            	    					}
            	    					add(
            	    						current,
            	    						"abbreviation",
            	    						lv_abbreviation_1_0,
            	    						"org.xtext.example.mydsl1.WebMate.Abbreviation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHTML"


    // $ANTLR start "entryRuleAbbreviation"
    // InternalWebMate.g:110:1: entryRuleAbbreviation returns [EObject current=null] : iv_ruleAbbreviation= ruleAbbreviation EOF ;
    public final EObject entryRuleAbbreviation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbbreviation = null;


        try {
            // InternalWebMate.g:110:53: (iv_ruleAbbreviation= ruleAbbreviation EOF )
            // InternalWebMate.g:111:2: iv_ruleAbbreviation= ruleAbbreviation EOF
            {
             newCompositeNode(grammarAccess.getAbbreviationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbbreviation=ruleAbbreviation();

            state._fsp--;

             current =iv_ruleAbbreviation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbbreviation"


    // $ANTLR start "ruleAbbreviation"
    // InternalWebMate.g:117:1: ruleAbbreviation returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ruleEString ) )* | ( ( (lv_tags_3_0= ruleTag ) )+ ( ( (lv_ids_4_0= ruleID0 ) )* ( (lv_symbols_5_0= ruleSymbol ) )* ( (lv_classes_6_0= ruleClass ) )* ( (lv_attributes_7_0= ruleAttribute ) )* ( (lv_group_8_0= ruleGroup ) )* ) ) ) otherlv_9= '}' ) ;
    public final EObject ruleAbbreviation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_9=null;
        EObject lv_tags_3_0 = null;

        EObject lv_ids_4_0 = null;

        EObject lv_symbols_5_0 = null;

        EObject lv_classes_6_0 = null;

        EObject lv_attributes_7_0 = null;

        EObject lv_group_8_0 = null;



        	enterRule();

        try {
            // InternalWebMate.g:123:2: ( ( () otherlv_1= '{' ( ( ( ruleEString ) )* | ( ( (lv_tags_3_0= ruleTag ) )+ ( ( (lv_ids_4_0= ruleID0 ) )* ( (lv_symbols_5_0= ruleSymbol ) )* ( (lv_classes_6_0= ruleClass ) )* ( (lv_attributes_7_0= ruleAttribute ) )* ( (lv_group_8_0= ruleGroup ) )* ) ) ) otherlv_9= '}' ) )
            // InternalWebMate.g:124:2: ( () otherlv_1= '{' ( ( ( ruleEString ) )* | ( ( (lv_tags_3_0= ruleTag ) )+ ( ( (lv_ids_4_0= ruleID0 ) )* ( (lv_symbols_5_0= ruleSymbol ) )* ( (lv_classes_6_0= ruleClass ) )* ( (lv_attributes_7_0= ruleAttribute ) )* ( (lv_group_8_0= ruleGroup ) )* ) ) ) otherlv_9= '}' )
            {
            // InternalWebMate.g:124:2: ( () otherlv_1= '{' ( ( ( ruleEString ) )* | ( ( (lv_tags_3_0= ruleTag ) )+ ( ( (lv_ids_4_0= ruleID0 ) )* ( (lv_symbols_5_0= ruleSymbol ) )* ( (lv_classes_6_0= ruleClass ) )* ( (lv_attributes_7_0= ruleAttribute ) )* ( (lv_group_8_0= ruleGroup ) )* ) ) ) otherlv_9= '}' )
            // InternalWebMate.g:125:3: () otherlv_1= '{' ( ( ( ruleEString ) )* | ( ( (lv_tags_3_0= ruleTag ) )+ ( ( (lv_ids_4_0= ruleID0 ) )* ( (lv_symbols_5_0= ruleSymbol ) )* ( (lv_classes_6_0= ruleClass ) )* ( (lv_attributes_7_0= ruleAttribute ) )* ( (lv_group_8_0= ruleGroup ) )* ) ) ) otherlv_9= '}'
            {
            // InternalWebMate.g:125:3: ()
            // InternalWebMate.g:126:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAbbreviationAccess().getAbbreviationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAbbreviationAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalWebMate.g:136:3: ( ( ( ruleEString ) )* | ( ( (lv_tags_3_0= ruleTag ) )+ ( ( (lv_ids_4_0= ruleID0 ) )* ( (lv_symbols_5_0= ruleSymbol ) )* ( (lv_classes_6_0= ruleClass ) )* ( (lv_attributes_7_0= ruleAttribute ) )* ( (lv_group_8_0= ruleGroup ) )* ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)||LA9_0==12) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=25 && LA9_0<=36)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalWebMate.g:137:4: ( ( ruleEString ) )*
                    {
                    // InternalWebMate.g:137:4: ( ( ruleEString ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalWebMate.g:138:5: ( ruleEString )
                    	    {
                    	    // InternalWebMate.g:138:5: ( ruleEString )
                    	    // InternalWebMate.g:139:6: ruleEString
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getAbbreviationRule());
                    	    						}
                    	    					

                    	    						newCompositeNode(grammarAccess.getAbbreviationAccess().getAbbreviationAbbreviationCrossReference_2_0_0());
                    	    					
                    	    pushFollow(FOLLOW_5);
                    	    ruleEString();

                    	    state._fsp--;


                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalWebMate.g:154:4: ( ( (lv_tags_3_0= ruleTag ) )+ ( ( (lv_ids_4_0= ruleID0 ) )* ( (lv_symbols_5_0= ruleSymbol ) )* ( (lv_classes_6_0= ruleClass ) )* ( (lv_attributes_7_0= ruleAttribute ) )* ( (lv_group_8_0= ruleGroup ) )* ) )
                    {
                    // InternalWebMate.g:154:4: ( ( (lv_tags_3_0= ruleTag ) )+ ( ( (lv_ids_4_0= ruleID0 ) )* ( (lv_symbols_5_0= ruleSymbol ) )* ( (lv_classes_6_0= ruleClass ) )* ( (lv_attributes_7_0= ruleAttribute ) )* ( (lv_group_8_0= ruleGroup ) )* ) )
                    // InternalWebMate.g:155:5: ( (lv_tags_3_0= ruleTag ) )+ ( ( (lv_ids_4_0= ruleID0 ) )* ( (lv_symbols_5_0= ruleSymbol ) )* ( (lv_classes_6_0= ruleClass ) )* ( (lv_attributes_7_0= ruleAttribute ) )* ( (lv_group_8_0= ruleGroup ) )* )
                    {
                    // InternalWebMate.g:155:5: ( (lv_tags_3_0= ruleTag ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=25 && LA3_0<=36)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalWebMate.g:156:6: (lv_tags_3_0= ruleTag )
                    	    {
                    	    // InternalWebMate.g:156:6: (lv_tags_3_0= ruleTag )
                    	    // InternalWebMate.g:157:7: lv_tags_3_0= ruleTag
                    	    {

                    	    							newCompositeNode(grammarAccess.getAbbreviationAccess().getTagsTagParserRuleCall_2_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_tags_3_0=ruleTag();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAbbreviationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"tags",
                    	    								lv_tags_3_0,
                    	    								"org.xtext.example.mydsl1.WebMate.Tag");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    // InternalWebMate.g:174:5: ( ( (lv_ids_4_0= ruleID0 ) )* ( (lv_symbols_5_0= ruleSymbol ) )* ( (lv_classes_6_0= ruleClass ) )* ( (lv_attributes_7_0= ruleAttribute ) )* ( (lv_group_8_0= ruleGroup ) )* )
                    // InternalWebMate.g:175:6: ( (lv_ids_4_0= ruleID0 ) )* ( (lv_symbols_5_0= ruleSymbol ) )* ( (lv_classes_6_0= ruleClass ) )* ( (lv_attributes_7_0= ruleAttribute ) )* ( (lv_group_8_0= ruleGroup ) )*
                    {
                    // InternalWebMate.g:175:6: ( (lv_ids_4_0= ruleID0 ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==13) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalWebMate.g:176:7: (lv_ids_4_0= ruleID0 )
                    	    {
                    	    // InternalWebMate.g:176:7: (lv_ids_4_0= ruleID0 )
                    	    // InternalWebMate.g:177:8: lv_ids_4_0= ruleID0
                    	    {

                    	    								newCompositeNode(grammarAccess.getAbbreviationAccess().getIdsID0ParserRuleCall_2_1_1_0_0());
                    	    							
                    	    pushFollow(FOLLOW_7);
                    	    lv_ids_4_0=ruleID0();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getAbbreviationRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"ids",
                    	    									lv_ids_4_0,
                    	    									"org.xtext.example.mydsl1.WebMate.ID0");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    // InternalWebMate.g:194:6: ( (lv_symbols_5_0= ruleSymbol ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=14 && LA5_0<=17)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalWebMate.g:195:7: (lv_symbols_5_0= ruleSymbol )
                    	    {
                    	    // InternalWebMate.g:195:7: (lv_symbols_5_0= ruleSymbol )
                    	    // InternalWebMate.g:196:8: lv_symbols_5_0= ruleSymbol
                    	    {

                    	    								newCompositeNode(grammarAccess.getAbbreviationAccess().getSymbolsSymbolParserRuleCall_2_1_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_8);
                    	    lv_symbols_5_0=ruleSymbol();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getAbbreviationRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"symbols",
                    	    									lv_symbols_5_0,
                    	    									"org.xtext.example.mydsl1.WebMate.Symbol");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    // InternalWebMate.g:213:6: ( (lv_classes_6_0= ruleClass ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==18) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalWebMate.g:214:7: (lv_classes_6_0= ruleClass )
                    	    {
                    	    // InternalWebMate.g:214:7: (lv_classes_6_0= ruleClass )
                    	    // InternalWebMate.g:215:8: lv_classes_6_0= ruleClass
                    	    {

                    	    								newCompositeNode(grammarAccess.getAbbreviationAccess().getClassesClassParserRuleCall_2_1_1_2_0());
                    	    							
                    	    pushFollow(FOLLOW_9);
                    	    lv_classes_6_0=ruleClass();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getAbbreviationRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"classes",
                    	    									lv_classes_6_0,
                    	    									"org.xtext.example.mydsl1.WebMate.Class");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    // InternalWebMate.g:232:6: ( (lv_attributes_7_0= ruleAttribute ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==19) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalWebMate.g:233:7: (lv_attributes_7_0= ruleAttribute )
                    	    {
                    	    // InternalWebMate.g:233:7: (lv_attributes_7_0= ruleAttribute )
                    	    // InternalWebMate.g:234:8: lv_attributes_7_0= ruleAttribute
                    	    {

                    	    								newCompositeNode(grammarAccess.getAbbreviationAccess().getAttributesAttributeParserRuleCall_2_1_1_3_0());
                    	    							
                    	    pushFollow(FOLLOW_10);
                    	    lv_attributes_7_0=ruleAttribute();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getAbbreviationRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"attributes",
                    	    									lv_attributes_7_0,
                    	    									"org.xtext.example.mydsl1.WebMate.Attribute");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    // InternalWebMate.g:251:6: ( (lv_group_8_0= ruleGroup ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==22) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalWebMate.g:252:7: (lv_group_8_0= ruleGroup )
                    	    {
                    	    // InternalWebMate.g:252:7: (lv_group_8_0= ruleGroup )
                    	    // InternalWebMate.g:253:8: lv_group_8_0= ruleGroup
                    	    {

                    	    								newCompositeNode(grammarAccess.getAbbreviationAccess().getGroupGroupParserRuleCall_2_1_1_4_0());
                    	    							
                    	    pushFollow(FOLLOW_11);
                    	    lv_group_8_0=ruleGroup();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getAbbreviationRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"group",
                    	    									lv_group_8_0,
                    	    									"org.xtext.example.mydsl1.WebMate.Group");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getAbbreviationAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbbreviation"


    // $ANTLR start "entryRuleID0"
    // InternalWebMate.g:281:1: entryRuleID0 returns [EObject current=null] : iv_ruleID0= ruleID0 EOF ;
    public final EObject entryRuleID0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleID0 = null;


        try {
            // InternalWebMate.g:281:44: (iv_ruleID0= ruleID0 EOF )
            // InternalWebMate.g:282:2: iv_ruleID0= ruleID0 EOF
            {
             newCompositeNode(grammarAccess.getID0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleID0=ruleID0();

            state._fsp--;

             current =iv_ruleID0; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleID0"


    // $ANTLR start "ruleID0"
    // InternalWebMate.g:288:1: ruleID0 returns [EObject current=null] : ( () (otherlv_1= '#' ( (lv_idName_2_0= ruleEString ) ) ) ) ;
    public final EObject ruleID0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_idName_2_0 = null;



        	enterRule();

        try {
            // InternalWebMate.g:294:2: ( ( () (otherlv_1= '#' ( (lv_idName_2_0= ruleEString ) ) ) ) )
            // InternalWebMate.g:295:2: ( () (otherlv_1= '#' ( (lv_idName_2_0= ruleEString ) ) ) )
            {
            // InternalWebMate.g:295:2: ( () (otherlv_1= '#' ( (lv_idName_2_0= ruleEString ) ) ) )
            // InternalWebMate.g:296:3: () (otherlv_1= '#' ( (lv_idName_2_0= ruleEString ) ) )
            {
            // InternalWebMate.g:296:3: ()
            // InternalWebMate.g:297:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getID0Access().getIDAction_0(),
            					current);
            			

            }

            // InternalWebMate.g:303:3: (otherlv_1= '#' ( (lv_idName_2_0= ruleEString ) ) )
            // InternalWebMate.g:304:4: otherlv_1= '#' ( (lv_idName_2_0= ruleEString ) )
            {
            otherlv_1=(Token)match(input,13,FOLLOW_12); 

            				newLeafNode(otherlv_1, grammarAccess.getID0Access().getNumberSignKeyword_1_0());
            			
            // InternalWebMate.g:308:4: ( (lv_idName_2_0= ruleEString ) )
            // InternalWebMate.g:309:5: (lv_idName_2_0= ruleEString )
            {
            // InternalWebMate.g:309:5: (lv_idName_2_0= ruleEString )
            // InternalWebMate.g:310:6: lv_idName_2_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getID0Access().getIdNameEStringParserRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_2);
            lv_idName_2_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getID0Rule());
            						}
            						set(
            							current,
            							"idName",
            							lv_idName_2_0,
            							"org.xtext.example.mydsl1.WebMate.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleID0"


    // $ANTLR start "entryRuleSymbol"
    // InternalWebMate.g:332:1: entryRuleSymbol returns [EObject current=null] : iv_ruleSymbol= ruleSymbol EOF ;
    public final EObject entryRuleSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbol = null;


        try {
            // InternalWebMate.g:332:47: (iv_ruleSymbol= ruleSymbol EOF )
            // InternalWebMate.g:333:2: iv_ruleSymbol= ruleSymbol EOF
            {
             newCompositeNode(grammarAccess.getSymbolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSymbol=ruleSymbol();

            state._fsp--;

             current =iv_ruleSymbol; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSymbol"


    // $ANTLR start "ruleSymbol"
    // InternalWebMate.g:339:1: ruleSymbol returns [EObject current=null] : ( ( () (otherlv_1= '*' ( (lv_count_2_0= ruleEInt ) ) ) ) | (otherlv_3= '+' ( (lv_tag_4_0= ruleTag ) ) ) | (otherlv_5= '>' ( (lv_tag_6_0= ruleTag ) ) ) | (otherlv_7= '^' ( (lv_tag_8_0= ruleTag ) ) ) ) ;
    public final EObject ruleSymbol() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_count_2_0 = null;

        EObject lv_tag_4_0 = null;

        EObject lv_tag_6_0 = null;

        EObject lv_tag_8_0 = null;



        	enterRule();

        try {
            // InternalWebMate.g:345:2: ( ( ( () (otherlv_1= '*' ( (lv_count_2_0= ruleEInt ) ) ) ) | (otherlv_3= '+' ( (lv_tag_4_0= ruleTag ) ) ) | (otherlv_5= '>' ( (lv_tag_6_0= ruleTag ) ) ) | (otherlv_7= '^' ( (lv_tag_8_0= ruleTag ) ) ) ) )
            // InternalWebMate.g:346:2: ( ( () (otherlv_1= '*' ( (lv_count_2_0= ruleEInt ) ) ) ) | (otherlv_3= '+' ( (lv_tag_4_0= ruleTag ) ) ) | (otherlv_5= '>' ( (lv_tag_6_0= ruleTag ) ) ) | (otherlv_7= '^' ( (lv_tag_8_0= ruleTag ) ) ) )
            {
            // InternalWebMate.g:346:2: ( ( () (otherlv_1= '*' ( (lv_count_2_0= ruleEInt ) ) ) ) | (otherlv_3= '+' ( (lv_tag_4_0= ruleTag ) ) ) | (otherlv_5= '>' ( (lv_tag_6_0= ruleTag ) ) ) | (otherlv_7= '^' ( (lv_tag_8_0= ruleTag ) ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt10=1;
                }
                break;
            case 15:
                {
                alt10=2;
                }
                break;
            case 16:
                {
                alt10=3;
                }
                break;
            case 17:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalWebMate.g:347:3: ( () (otherlv_1= '*' ( (lv_count_2_0= ruleEInt ) ) ) )
                    {
                    // InternalWebMate.g:347:3: ( () (otherlv_1= '*' ( (lv_count_2_0= ruleEInt ) ) ) )
                    // InternalWebMate.g:348:4: () (otherlv_1= '*' ( (lv_count_2_0= ruleEInt ) ) )
                    {
                    // InternalWebMate.g:348:4: ()
                    // InternalWebMate.g:349:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSymbolAccess().getSymbolAction_0_0(),
                    						current);
                    				

                    }

                    // InternalWebMate.g:355:4: (otherlv_1= '*' ( (lv_count_2_0= ruleEInt ) ) )
                    // InternalWebMate.g:356:5: otherlv_1= '*' ( (lv_count_2_0= ruleEInt ) )
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_13); 

                    					newLeafNode(otherlv_1, grammarAccess.getSymbolAccess().getAsteriskKeyword_0_1_0());
                    				
                    // InternalWebMate.g:360:5: ( (lv_count_2_0= ruleEInt ) )
                    // InternalWebMate.g:361:6: (lv_count_2_0= ruleEInt )
                    {
                    // InternalWebMate.g:361:6: (lv_count_2_0= ruleEInt )
                    // InternalWebMate.g:362:7: lv_count_2_0= ruleEInt
                    {

                    							newCompositeNode(grammarAccess.getSymbolAccess().getCountEIntParserRuleCall_0_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_count_2_0=ruleEInt();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSymbolRule());
                    							}
                    							set(
                    								current,
                    								"count",
                    								lv_count_2_0,
                    								"org.xtext.example.mydsl1.WebMate.EInt");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWebMate.g:382:3: (otherlv_3= '+' ( (lv_tag_4_0= ruleTag ) ) )
                    {
                    // InternalWebMate.g:382:3: (otherlv_3= '+' ( (lv_tag_4_0= ruleTag ) ) )
                    // InternalWebMate.g:383:4: otherlv_3= '+' ( (lv_tag_4_0= ruleTag ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getSymbolAccess().getPlusSignKeyword_1_0());
                    			
                    // InternalWebMate.g:387:4: ( (lv_tag_4_0= ruleTag ) )
                    // InternalWebMate.g:388:5: (lv_tag_4_0= ruleTag )
                    {
                    // InternalWebMate.g:388:5: (lv_tag_4_0= ruleTag )
                    // InternalWebMate.g:389:6: lv_tag_4_0= ruleTag
                    {

                    						newCompositeNode(grammarAccess.getSymbolAccess().getTagTagParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_tag_4_0=ruleTag();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSymbolRule());
                    						}
                    						set(
                    							current,
                    							"tag",
                    							lv_tag_4_0,
                    							"org.xtext.example.mydsl1.WebMate.Tag");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalWebMate.g:408:3: (otherlv_5= '>' ( (lv_tag_6_0= ruleTag ) ) )
                    {
                    // InternalWebMate.g:408:3: (otherlv_5= '>' ( (lv_tag_6_0= ruleTag ) ) )
                    // InternalWebMate.g:409:4: otherlv_5= '>' ( (lv_tag_6_0= ruleTag ) )
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getSymbolAccess().getGreaterThanSignKeyword_2_0());
                    			
                    // InternalWebMate.g:413:4: ( (lv_tag_6_0= ruleTag ) )
                    // InternalWebMate.g:414:5: (lv_tag_6_0= ruleTag )
                    {
                    // InternalWebMate.g:414:5: (lv_tag_6_0= ruleTag )
                    // InternalWebMate.g:415:6: lv_tag_6_0= ruleTag
                    {

                    						newCompositeNode(grammarAccess.getSymbolAccess().getTagTagParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_tag_6_0=ruleTag();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSymbolRule());
                    						}
                    						set(
                    							current,
                    							"tag",
                    							lv_tag_6_0,
                    							"org.xtext.example.mydsl1.WebMate.Tag");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalWebMate.g:434:3: (otherlv_7= '^' ( (lv_tag_8_0= ruleTag ) ) )
                    {
                    // InternalWebMate.g:434:3: (otherlv_7= '^' ( (lv_tag_8_0= ruleTag ) ) )
                    // InternalWebMate.g:435:4: otherlv_7= '^' ( (lv_tag_8_0= ruleTag ) )
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getSymbolAccess().getCircumflexAccentKeyword_3_0());
                    			
                    // InternalWebMate.g:439:4: ( (lv_tag_8_0= ruleTag ) )
                    // InternalWebMate.g:440:5: (lv_tag_8_0= ruleTag )
                    {
                    // InternalWebMate.g:440:5: (lv_tag_8_0= ruleTag )
                    // InternalWebMate.g:441:6: lv_tag_8_0= ruleTag
                    {

                    						newCompositeNode(grammarAccess.getSymbolAccess().getTagTagParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_tag_8_0=ruleTag();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSymbolRule());
                    						}
                    						set(
                    							current,
                    							"tag",
                    							lv_tag_8_0,
                    							"org.xtext.example.mydsl1.WebMate.Tag");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSymbol"


    // $ANTLR start "entryRuleTag"
    // InternalWebMate.g:463:1: entryRuleTag returns [EObject current=null] : iv_ruleTag= ruleTag EOF ;
    public final EObject entryRuleTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTag = null;


        try {
            // InternalWebMate.g:463:44: (iv_ruleTag= ruleTag EOF )
            // InternalWebMate.g:464:2: iv_ruleTag= ruleTag EOF
            {
             newCompositeNode(grammarAccess.getTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTag=ruleTag();

            state._fsp--;

             current =iv_ruleTag; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // InternalWebMate.g:470:1: ruleTag returns [EObject current=null] : ( () ( (lv_tagName_1_0= ruleHTMLTag ) ) ( (lv_class_2_0= ruleClass ) )* ( (lv_id_3_0= ruleID0 ) )? ( (lv_attribute_4_0= ruleAttribute ) )* ) ;
    public final EObject ruleTag() throws RecognitionException {
        EObject current = null;

        Enumerator lv_tagName_1_0 = null;

        EObject lv_class_2_0 = null;

        EObject lv_id_3_0 = null;

        EObject lv_attribute_4_0 = null;



        	enterRule();

        try {
            // InternalWebMate.g:476:2: ( ( () ( (lv_tagName_1_0= ruleHTMLTag ) ) ( (lv_class_2_0= ruleClass ) )* ( (lv_id_3_0= ruleID0 ) )? ( (lv_attribute_4_0= ruleAttribute ) )* ) )
            // InternalWebMate.g:477:2: ( () ( (lv_tagName_1_0= ruleHTMLTag ) ) ( (lv_class_2_0= ruleClass ) )* ( (lv_id_3_0= ruleID0 ) )? ( (lv_attribute_4_0= ruleAttribute ) )* )
            {
            // InternalWebMate.g:477:2: ( () ( (lv_tagName_1_0= ruleHTMLTag ) ) ( (lv_class_2_0= ruleClass ) )* ( (lv_id_3_0= ruleID0 ) )? ( (lv_attribute_4_0= ruleAttribute ) )* )
            // InternalWebMate.g:478:3: () ( (lv_tagName_1_0= ruleHTMLTag ) ) ( (lv_class_2_0= ruleClass ) )* ( (lv_id_3_0= ruleID0 ) )? ( (lv_attribute_4_0= ruleAttribute ) )*
            {
            // InternalWebMate.g:478:3: ()
            // InternalWebMate.g:479:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTagAccess().getTagAction_0(),
            					current);
            			

            }

            // InternalWebMate.g:485:3: ( (lv_tagName_1_0= ruleHTMLTag ) )
            // InternalWebMate.g:486:4: (lv_tagName_1_0= ruleHTMLTag )
            {
            // InternalWebMate.g:486:4: (lv_tagName_1_0= ruleHTMLTag )
            // InternalWebMate.g:487:5: lv_tagName_1_0= ruleHTMLTag
            {

            					newCompositeNode(grammarAccess.getTagAccess().getTagNameHTMLTagEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_tagName_1_0=ruleHTMLTag();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTagRule());
            					}
            					set(
            						current,
            						"tagName",
            						lv_tagName_1_0,
            						"org.xtext.example.mydsl1.WebMate.HTMLTag");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWebMate.g:504:3: ( (lv_class_2_0= ruleClass ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18) ) {
                    int LA11_2 = input.LA(2);

                    if ( (LA11_2==RULE_STRING) ) {
                        alt11=1;
                    }
                    else if ( (LA11_2==RULE_ID) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalWebMate.g:505:4: (lv_class_2_0= ruleClass )
            	    {
            	    // InternalWebMate.g:505:4: (lv_class_2_0= ruleClass )
            	    // InternalWebMate.g:506:5: lv_class_2_0= ruleClass
            	    {

            	    					newCompositeNode(grammarAccess.getTagAccess().getClassClassParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_class_2_0=ruleClass();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTagRule());
            	    					}
            	    					add(
            	    						current,
            	    						"class",
            	    						lv_class_2_0,
            	    						"org.xtext.example.mydsl1.WebMate.Class");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalWebMate.g:523:3: ( (lv_id_3_0= ruleID0 ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==RULE_STRING) ) {
                    alt12=1;
                }
                else if ( (LA12_1==RULE_ID) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalWebMate.g:524:4: (lv_id_3_0= ruleID0 )
                    {
                    // InternalWebMate.g:524:4: (lv_id_3_0= ruleID0 )
                    // InternalWebMate.g:525:5: lv_id_3_0= ruleID0
                    {

                    					newCompositeNode(grammarAccess.getTagAccess().getIdID0ParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_15);
                    lv_id_3_0=ruleID0();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTagRule());
                    					}
                    					set(
                    						current,
                    						"id",
                    						lv_id_3_0,
                    						"org.xtext.example.mydsl1.WebMate.ID0");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalWebMate.g:542:3: ( (lv_attribute_4_0= ruleAttribute ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==19) ) {
                    int LA13_2 = input.LA(2);

                    if ( (LA13_2==RULE_STRING) ) {
                        int LA13_3 = input.LA(3);

                        if ( (LA13_3==20) ) {
                            int LA13_5 = input.LA(4);

                            if ( (LA13_5==RULE_STRING) ) {
                                int LA13_7 = input.LA(5);

                                if ( (LA13_7==21) ) {
                                    alt13=1;
                                }


                            }
                            else if ( (LA13_5==RULE_ID) ) {
                                int LA13_8 = input.LA(5);

                                if ( (LA13_8==21) ) {
                                    alt13=1;
                                }


                            }


                        }
                        else if ( (LA13_3==21) ) {
                            alt13=1;
                        }


                    }
                    else if ( (LA13_2==RULE_ID) ) {
                        int LA13_4 = input.LA(3);

                        if ( (LA13_4==20) ) {
                            int LA13_5 = input.LA(4);

                            if ( (LA13_5==RULE_STRING) ) {
                                int LA13_7 = input.LA(5);

                                if ( (LA13_7==21) ) {
                                    alt13=1;
                                }


                            }
                            else if ( (LA13_5==RULE_ID) ) {
                                int LA13_8 = input.LA(5);

                                if ( (LA13_8==21) ) {
                                    alt13=1;
                                }


                            }


                        }
                        else if ( (LA13_4==21) ) {
                            alt13=1;
                        }


                    }


                }


                switch (alt13) {
            	case 1 :
            	    // InternalWebMate.g:543:4: (lv_attribute_4_0= ruleAttribute )
            	    {
            	    // InternalWebMate.g:543:4: (lv_attribute_4_0= ruleAttribute )
            	    // InternalWebMate.g:544:5: lv_attribute_4_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getTagAccess().getAttributeAttributeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_attribute_4_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTagRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attribute",
            	    						lv_attribute_4_0,
            	    						"org.xtext.example.mydsl1.WebMate.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRuleClass"
    // InternalWebMate.g:565:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalWebMate.g:565:46: (iv_ruleClass= ruleClass EOF )
            // InternalWebMate.g:566:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalWebMate.g:572:1: ruleClass returns [EObject current=null] : ( () otherlv_1= '.' ( (lv_className_2_0= ruleEString ) ) ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_className_2_0 = null;



        	enterRule();

        try {
            // InternalWebMate.g:578:2: ( ( () otherlv_1= '.' ( (lv_className_2_0= ruleEString ) ) ) )
            // InternalWebMate.g:579:2: ( () otherlv_1= '.' ( (lv_className_2_0= ruleEString ) ) )
            {
            // InternalWebMate.g:579:2: ( () otherlv_1= '.' ( (lv_className_2_0= ruleEString ) ) )
            // InternalWebMate.g:580:3: () otherlv_1= '.' ( (lv_className_2_0= ruleEString ) )
            {
            // InternalWebMate.g:580:3: ()
            // InternalWebMate.g:581:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClassAccess().getClassAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getFullStopKeyword_1());
            		
            // InternalWebMate.g:591:3: ( (lv_className_2_0= ruleEString ) )
            // InternalWebMate.g:592:4: (lv_className_2_0= ruleEString )
            {
            // InternalWebMate.g:592:4: (lv_className_2_0= ruleEString )
            // InternalWebMate.g:593:5: lv_className_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClassAccess().getClassNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_className_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassRule());
            					}
            					set(
            						current,
            						"className",
            						lv_className_2_0,
            						"org.xtext.example.mydsl1.WebMate.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleAttribute"
    // InternalWebMate.g:614:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalWebMate.g:614:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalWebMate.g:615:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalWebMate.g:621:1: ruleAttribute returns [EObject current=null] : ( () (otherlv_1= '[' ( (lv_attributeName_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_attributeValue_4_0= ruleEString ) ) )? otherlv_5= ']' ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_attributeName_2_0 = null;

        AntlrDatatypeRuleToken lv_attributeValue_4_0 = null;



        	enterRule();

        try {
            // InternalWebMate.g:627:2: ( ( () (otherlv_1= '[' ( (lv_attributeName_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_attributeValue_4_0= ruleEString ) ) )? otherlv_5= ']' ) ) )
            // InternalWebMate.g:628:2: ( () (otherlv_1= '[' ( (lv_attributeName_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_attributeValue_4_0= ruleEString ) ) )? otherlv_5= ']' ) )
            {
            // InternalWebMate.g:628:2: ( () (otherlv_1= '[' ( (lv_attributeName_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_attributeValue_4_0= ruleEString ) ) )? otherlv_5= ']' ) )
            // InternalWebMate.g:629:3: () (otherlv_1= '[' ( (lv_attributeName_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_attributeValue_4_0= ruleEString ) ) )? otherlv_5= ']' )
            {
            // InternalWebMate.g:629:3: ()
            // InternalWebMate.g:630:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeAccess().getAttributeAction_0(),
            					current);
            			

            }

            // InternalWebMate.g:636:3: (otherlv_1= '[' ( (lv_attributeName_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_attributeValue_4_0= ruleEString ) ) )? otherlv_5= ']' )
            // InternalWebMate.g:637:4: otherlv_1= '[' ( (lv_attributeName_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_attributeValue_4_0= ruleEString ) ) )? otherlv_5= ']'
            {
            otherlv_1=(Token)match(input,19,FOLLOW_12); 

            				newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_1_0());
            			
            // InternalWebMate.g:641:4: ( (lv_attributeName_2_0= ruleEString ) )
            // InternalWebMate.g:642:5: (lv_attributeName_2_0= ruleEString )
            {
            // InternalWebMate.g:642:5: (lv_attributeName_2_0= ruleEString )
            // InternalWebMate.g:643:6: lv_attributeName_2_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getAttributeAccess().getAttributeNameEStringParserRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_16);
            lv_attributeName_2_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getAttributeRule());
            						}
            						set(
            							current,
            							"attributeName",
            							lv_attributeName_2_0,
            							"org.xtext.example.mydsl1.WebMate.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalWebMate.g:660:4: (otherlv_3= '=' ( (lv_attributeValue_4_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalWebMate.g:661:5: otherlv_3= '=' ( (lv_attributeValue_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_12); 

                    					newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getEqualsSignKeyword_1_2_0());
                    				
                    // InternalWebMate.g:665:5: ( (lv_attributeValue_4_0= ruleEString ) )
                    // InternalWebMate.g:666:6: (lv_attributeValue_4_0= ruleEString )
                    {
                    // InternalWebMate.g:666:6: (lv_attributeValue_4_0= ruleEString )
                    // InternalWebMate.g:667:7: lv_attributeValue_4_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getAttributeAccess().getAttributeValueEStringParserRuleCall_1_2_1_0());
                    						
                    pushFollow(FOLLOW_17);
                    lv_attributeValue_4_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAttributeRule());
                    							}
                    							set(
                    								current,
                    								"attributeValue",
                    								lv_attributeValue_4_0,
                    								"org.xtext.example.mydsl1.WebMate.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            				newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_1_3());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleGroup"
    // InternalWebMate.g:694:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // InternalWebMate.g:694:46: (iv_ruleGroup= ruleGroup EOF )
            // InternalWebMate.g:695:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // InternalWebMate.g:701:1: ruleGroup returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_abbreviation_2_0= ruleAbbreviation ) )+ otherlv_3= ')' ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_abbreviation_2_0 = null;



        	enterRule();

        try {
            // InternalWebMate.g:707:2: ( ( () otherlv_1= '(' ( (lv_abbreviation_2_0= ruleAbbreviation ) )+ otherlv_3= ')' ) )
            // InternalWebMate.g:708:2: ( () otherlv_1= '(' ( (lv_abbreviation_2_0= ruleAbbreviation ) )+ otherlv_3= ')' )
            {
            // InternalWebMate.g:708:2: ( () otherlv_1= '(' ( (lv_abbreviation_2_0= ruleAbbreviation ) )+ otherlv_3= ')' )
            // InternalWebMate.g:709:3: () otherlv_1= '(' ( (lv_abbreviation_2_0= ruleAbbreviation ) )+ otherlv_3= ')'
            {
            // InternalWebMate.g:709:3: ()
            // InternalWebMate.g:710:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGroupAccess().getGroupAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getGroupAccess().getLeftParenthesisKeyword_1());
            		
            // InternalWebMate.g:720:3: ( (lv_abbreviation_2_0= ruleAbbreviation ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==11) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalWebMate.g:721:4: (lv_abbreviation_2_0= ruleAbbreviation )
            	    {
            	    // InternalWebMate.g:721:4: (lv_abbreviation_2_0= ruleAbbreviation )
            	    // InternalWebMate.g:722:5: lv_abbreviation_2_0= ruleAbbreviation
            	    {

            	    					newCompositeNode(grammarAccess.getGroupAccess().getAbbreviationAbbreviationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_abbreviation_2_0=ruleAbbreviation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGroupRule());
            	    					}
            	    					add(
            	    						current,
            	    						"abbreviation",
            	    						lv_abbreviation_2_0,
            	    						"org.xtext.example.mydsl1.WebMate.Abbreviation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            otherlv_3=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getGroupAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleEString"
    // InternalWebMate.g:747:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalWebMate.g:747:47: (iv_ruleEString= ruleEString EOF )
            // InternalWebMate.g:748:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalWebMate.g:754:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalWebMate.g:760:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalWebMate.g:761:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalWebMate.g:761:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalWebMate.g:762:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalWebMate.g:770:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalWebMate.g:781:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalWebMate.g:781:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalWebMate.g:782:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalWebMate.g:788:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalWebMate.g:794:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalWebMate.g:795:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalWebMate.g:795:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalWebMate.g:796:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalWebMate.g:796:3: (kw= '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalWebMate.g:797:4: kw= '-'
                    {
                    kw=(Token)match(input,24,FOLLOW_19); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleHTMLTag"
    // InternalWebMate.g:814:1: ruleHTMLTag returns [Enumerator current=null] : ( (enumLiteral_0= 'div' ) | (enumLiteral_1= 'h1' ) | (enumLiteral_2= 'p' ) | (enumLiteral_3= 'ul' ) | (enumLiteral_4= 'li' ) | (enumLiteral_5= 'a' ) | (enumLiteral_6= 'img' ) | (enumLiteral_7= 'form' ) | (enumLiteral_8= 'input' ) | (enumLiteral_9= 'button' ) | (enumLiteral_10= 'option' ) | (enumLiteral_11= 'select' ) ) ;
    public final Enumerator ruleHTMLTag() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;


        	enterRule();

        try {
            // InternalWebMate.g:820:2: ( ( (enumLiteral_0= 'div' ) | (enumLiteral_1= 'h1' ) | (enumLiteral_2= 'p' ) | (enumLiteral_3= 'ul' ) | (enumLiteral_4= 'li' ) | (enumLiteral_5= 'a' ) | (enumLiteral_6= 'img' ) | (enumLiteral_7= 'form' ) | (enumLiteral_8= 'input' ) | (enumLiteral_9= 'button' ) | (enumLiteral_10= 'option' ) | (enumLiteral_11= 'select' ) ) )
            // InternalWebMate.g:821:2: ( (enumLiteral_0= 'div' ) | (enumLiteral_1= 'h1' ) | (enumLiteral_2= 'p' ) | (enumLiteral_3= 'ul' ) | (enumLiteral_4= 'li' ) | (enumLiteral_5= 'a' ) | (enumLiteral_6= 'img' ) | (enumLiteral_7= 'form' ) | (enumLiteral_8= 'input' ) | (enumLiteral_9= 'button' ) | (enumLiteral_10= 'option' ) | (enumLiteral_11= 'select' ) )
            {
            // InternalWebMate.g:821:2: ( (enumLiteral_0= 'div' ) | (enumLiteral_1= 'h1' ) | (enumLiteral_2= 'p' ) | (enumLiteral_3= 'ul' ) | (enumLiteral_4= 'li' ) | (enumLiteral_5= 'a' ) | (enumLiteral_6= 'img' ) | (enumLiteral_7= 'form' ) | (enumLiteral_8= 'input' ) | (enumLiteral_9= 'button' ) | (enumLiteral_10= 'option' ) | (enumLiteral_11= 'select' ) )
            int alt18=12;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt18=1;
                }
                break;
            case 26:
                {
                alt18=2;
                }
                break;
            case 27:
                {
                alt18=3;
                }
                break;
            case 28:
                {
                alt18=4;
                }
                break;
            case 29:
                {
                alt18=5;
                }
                break;
            case 30:
                {
                alt18=6;
                }
                break;
            case 31:
                {
                alt18=7;
                }
                break;
            case 32:
                {
                alt18=8;
                }
                break;
            case 33:
                {
                alt18=9;
                }
                break;
            case 34:
                {
                alt18=10;
                }
                break;
            case 35:
                {
                alt18=11;
                }
                break;
            case 36:
                {
                alt18=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalWebMate.g:822:3: (enumLiteral_0= 'div' )
                    {
                    // InternalWebMate.g:822:3: (enumLiteral_0= 'div' )
                    // InternalWebMate.g:823:4: enumLiteral_0= 'div'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getHTMLTagAccess().getDivEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getHTMLTagAccess().getDivEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalWebMate.g:830:3: (enumLiteral_1= 'h1' )
                    {
                    // InternalWebMate.g:830:3: (enumLiteral_1= 'h1' )
                    // InternalWebMate.g:831:4: enumLiteral_1= 'h1'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getHTMLTagAccess().getH1EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getHTMLTagAccess().getH1EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalWebMate.g:838:3: (enumLiteral_2= 'p' )
                    {
                    // InternalWebMate.g:838:3: (enumLiteral_2= 'p' )
                    // InternalWebMate.g:839:4: enumLiteral_2= 'p'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getHTMLTagAccess().getPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getHTMLTagAccess().getPEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalWebMate.g:846:3: (enumLiteral_3= 'ul' )
                    {
                    // InternalWebMate.g:846:3: (enumLiteral_3= 'ul' )
                    // InternalWebMate.g:847:4: enumLiteral_3= 'ul'
                    {
                    enumLiteral_3=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getHTMLTagAccess().getUlEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getHTMLTagAccess().getUlEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalWebMate.g:854:3: (enumLiteral_4= 'li' )
                    {
                    // InternalWebMate.g:854:3: (enumLiteral_4= 'li' )
                    // InternalWebMate.g:855:4: enumLiteral_4= 'li'
                    {
                    enumLiteral_4=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getHTMLTagAccess().getLiEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getHTMLTagAccess().getLiEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalWebMate.g:862:3: (enumLiteral_5= 'a' )
                    {
                    // InternalWebMate.g:862:3: (enumLiteral_5= 'a' )
                    // InternalWebMate.g:863:4: enumLiteral_5= 'a'
                    {
                    enumLiteral_5=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getHTMLTagAccess().getAEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getHTMLTagAccess().getAEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalWebMate.g:870:3: (enumLiteral_6= 'img' )
                    {
                    // InternalWebMate.g:870:3: (enumLiteral_6= 'img' )
                    // InternalWebMate.g:871:4: enumLiteral_6= 'img'
                    {
                    enumLiteral_6=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getHTMLTagAccess().getImgEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getHTMLTagAccess().getImgEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalWebMate.g:878:3: (enumLiteral_7= 'form' )
                    {
                    // InternalWebMate.g:878:3: (enumLiteral_7= 'form' )
                    // InternalWebMate.g:879:4: enumLiteral_7= 'form'
                    {
                    enumLiteral_7=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getHTMLTagAccess().getFormEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getHTMLTagAccess().getFormEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalWebMate.g:886:3: (enumLiteral_8= 'input' )
                    {
                    // InternalWebMate.g:886:3: (enumLiteral_8= 'input' )
                    // InternalWebMate.g:887:4: enumLiteral_8= 'input'
                    {
                    enumLiteral_8=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getHTMLTagAccess().getInputEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getHTMLTagAccess().getInputEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalWebMate.g:894:3: (enumLiteral_9= 'button' )
                    {
                    // InternalWebMate.g:894:3: (enumLiteral_9= 'button' )
                    // InternalWebMate.g:895:4: enumLiteral_9= 'button'
                    {
                    enumLiteral_9=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getHTMLTagAccess().getButtonEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getHTMLTagAccess().getButtonEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalWebMate.g:902:3: (enumLiteral_10= 'option' )
                    {
                    // InternalWebMate.g:902:3: (enumLiteral_10= 'option' )
                    // InternalWebMate.g:903:4: enumLiteral_10= 'option'
                    {
                    enumLiteral_10=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getHTMLTagAccess().getOptionEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getHTMLTagAccess().getOptionEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalWebMate.g:910:3: (enumLiteral_11= 'select' )
                    {
                    // InternalWebMate.g:910:3: (enumLiteral_11= 'select' )
                    // InternalWebMate.g:911:4: enumLiteral_11= 'select'
                    {
                    enumLiteral_11=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getHTMLTagAccess().getSelectEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getHTMLTagAccess().getSelectEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHTMLTag"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000001FFE001030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000001FFE4FF030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000004FF000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000004FD000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000004C1000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000481000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000C2002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});

}