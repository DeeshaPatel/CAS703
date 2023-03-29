package org.xtext.example.mydsl.parser.antlr.internal;

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
import org.xtext.example.mydsl.services.WebMateGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWebMateParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#'", "'.'", "'('", "')'", "'>'", "'*'", "'+'", "'['", "'='", "']'", "'plus'", "'multiply'", "'dot'", "'hash'", "'greaterthan'", "'caret'", "'div'", "'h1'", "'p'", "'ul'", "'li'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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

                if ( ((LA1_0>=RULE_INT && LA1_0<=RULE_STRING)||(LA1_0>=27 && LA1_0<=31)) ) {
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
            	    						"org.xtext.example.mydsl.WebMate.Abbreviation");
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
    // InternalWebMate.g:117:1: ruleAbbreviation returns [EObject current=null] : ( () ( ( ruleEString ) )* ( ( (lv_tags_2_0= ruleTag ) ) ( (lv_classes_3_0= ruleClass ) )? ( (lv_ids_4_0= ruleID0 ) )? ( (lv_symbols_5_0= ruleSymbol ) )? ( (lv_attributes_6_0= ruleAttribute ) )? ( (lv_group_7_0= ruleGroup ) )? ) ) ;
    public final EObject ruleAbbreviation() throws RecognitionException {
        EObject current = null;

        EObject lv_tags_2_0 = null;

        EObject lv_classes_3_0 = null;

        EObject lv_ids_4_0 = null;

        EObject lv_symbols_5_0 = null;

        EObject lv_attributes_6_0 = null;

        EObject lv_group_7_0 = null;



        	enterRule();

        try {
            // InternalWebMate.g:123:2: ( ( () ( ( ruleEString ) )* ( ( (lv_tags_2_0= ruleTag ) ) ( (lv_classes_3_0= ruleClass ) )? ( (lv_ids_4_0= ruleID0 ) )? ( (lv_symbols_5_0= ruleSymbol ) )? ( (lv_attributes_6_0= ruleAttribute ) )? ( (lv_group_7_0= ruleGroup ) )? ) ) )
            // InternalWebMate.g:124:2: ( () ( ( ruleEString ) )* ( ( (lv_tags_2_0= ruleTag ) ) ( (lv_classes_3_0= ruleClass ) )? ( (lv_ids_4_0= ruleID0 ) )? ( (lv_symbols_5_0= ruleSymbol ) )? ( (lv_attributes_6_0= ruleAttribute ) )? ( (lv_group_7_0= ruleGroup ) )? ) )
            {
            // InternalWebMate.g:124:2: ( () ( ( ruleEString ) )* ( ( (lv_tags_2_0= ruleTag ) ) ( (lv_classes_3_0= ruleClass ) )? ( (lv_ids_4_0= ruleID0 ) )? ( (lv_symbols_5_0= ruleSymbol ) )? ( (lv_attributes_6_0= ruleAttribute ) )? ( (lv_group_7_0= ruleGroup ) )? ) )
            // InternalWebMate.g:125:3: () ( ( ruleEString ) )* ( ( (lv_tags_2_0= ruleTag ) ) ( (lv_classes_3_0= ruleClass ) )? ( (lv_ids_4_0= ruleID0 ) )? ( (lv_symbols_5_0= ruleSymbol ) )? ( (lv_attributes_6_0= ruleAttribute ) )? ( (lv_group_7_0= ruleGroup ) )? )
            {
            // InternalWebMate.g:125:3: ()
            // InternalWebMate.g:126:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAbbreviationAccess().getAbbreviationAction_0(),
            					current);
            			

            }

            // InternalWebMate.g:132:3: ( ( ruleEString ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_INT && LA2_0<=RULE_STRING)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalWebMate.g:133:4: ( ruleEString )
            	    {
            	    // InternalWebMate.g:133:4: ( ruleEString )
            	    // InternalWebMate.g:134:5: ruleEString
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getAbbreviationRule());
            	    					}
            	    				

            	    					newCompositeNode(grammarAccess.getAbbreviationAccess().getAbbreviationAbbreviationCrossReference_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
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

            // InternalWebMate.g:148:3: ( ( (lv_tags_2_0= ruleTag ) ) ( (lv_classes_3_0= ruleClass ) )? ( (lv_ids_4_0= ruleID0 ) )? ( (lv_symbols_5_0= ruleSymbol ) )? ( (lv_attributes_6_0= ruleAttribute ) )? ( (lv_group_7_0= ruleGroup ) )? )
            // InternalWebMate.g:149:4: ( (lv_tags_2_0= ruleTag ) ) ( (lv_classes_3_0= ruleClass ) )? ( (lv_ids_4_0= ruleID0 ) )? ( (lv_symbols_5_0= ruleSymbol ) )? ( (lv_attributes_6_0= ruleAttribute ) )? ( (lv_group_7_0= ruleGroup ) )?
            {
            // InternalWebMate.g:149:4: ( (lv_tags_2_0= ruleTag ) )
            // InternalWebMate.g:150:5: (lv_tags_2_0= ruleTag )
            {
            // InternalWebMate.g:150:5: (lv_tags_2_0= ruleTag )
            // InternalWebMate.g:151:6: lv_tags_2_0= ruleTag
            {

            						newCompositeNode(grammarAccess.getAbbreviationAccess().getTagsTagParserRuleCall_2_0_0());
            					
            pushFollow(FOLLOW_5);
            lv_tags_2_0=ruleTag();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getAbbreviationRule());
            						}
            						set(
            							current,
            							"tags",
            							lv_tags_2_0,
            							"org.xtext.example.mydsl.WebMate.Tag");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalWebMate.g:168:4: ( (lv_classes_3_0= ruleClass ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalWebMate.g:169:5: (lv_classes_3_0= ruleClass )
                    {
                    // InternalWebMate.g:169:5: (lv_classes_3_0= ruleClass )
                    // InternalWebMate.g:170:6: lv_classes_3_0= ruleClass
                    {

                    						newCompositeNode(grammarAccess.getAbbreviationAccess().getClassesClassParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_classes_3_0=ruleClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAbbreviationRule());
                    						}
                    						set(
                    							current,
                    							"classes",
                    							lv_classes_3_0,
                    							"org.xtext.example.mydsl.WebMate.Class");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }

            // InternalWebMate.g:187:4: ( (lv_ids_4_0= ruleID0 ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalWebMate.g:188:5: (lv_ids_4_0= ruleID0 )
                    {
                    // InternalWebMate.g:188:5: (lv_ids_4_0= ruleID0 )
                    // InternalWebMate.g:189:6: lv_ids_4_0= ruleID0
                    {

                    						newCompositeNode(grammarAccess.getAbbreviationAccess().getIdsID0ParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_ids_4_0=ruleID0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAbbreviationRule());
                    						}
                    						set(
                    							current,
                    							"ids",
                    							lv_ids_4_0,
                    							"org.xtext.example.mydsl.WebMate.ID0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }

            // InternalWebMate.g:206:4: ( (lv_symbols_5_0= ruleSymbol ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=21 && LA5_0<=26)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalWebMate.g:207:5: (lv_symbols_5_0= ruleSymbol )
                    {
                    // InternalWebMate.g:207:5: (lv_symbols_5_0= ruleSymbol )
                    // InternalWebMate.g:208:6: lv_symbols_5_0= ruleSymbol
                    {

                    						newCompositeNode(grammarAccess.getAbbreviationAccess().getSymbolsSymbolParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_symbols_5_0=ruleSymbol();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAbbreviationRule());
                    						}
                    						set(
                    							current,
                    							"symbols",
                    							lv_symbols_5_0,
                    							"org.xtext.example.mydsl.WebMate.Symbol");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }

            // InternalWebMate.g:225:4: ( (lv_attributes_6_0= ruleAttribute ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalWebMate.g:226:5: (lv_attributes_6_0= ruleAttribute )
                    {
                    // InternalWebMate.g:226:5: (lv_attributes_6_0= ruleAttribute )
                    // InternalWebMate.g:227:6: lv_attributes_6_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getAbbreviationAccess().getAttributesAttributeParserRuleCall_2_4_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_attributes_6_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAbbreviationRule());
                    						}
                    						set(
                    							current,
                    							"attributes",
                    							lv_attributes_6_0,
                    							"org.xtext.example.mydsl.WebMate.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }

            // InternalWebMate.g:244:4: ( (lv_group_7_0= ruleGroup ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13||(LA7_0>=16 && LA7_0<=17)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalWebMate.g:245:5: (lv_group_7_0= ruleGroup )
                    {
                    // InternalWebMate.g:245:5: (lv_group_7_0= ruleGroup )
                    // InternalWebMate.g:246:6: lv_group_7_0= ruleGroup
                    {

                    						newCompositeNode(grammarAccess.getAbbreviationAccess().getGroupGroupParserRuleCall_2_5_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_group_7_0=ruleGroup();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAbbreviationRule());
                    						}
                    						set(
                    							current,
                    							"group",
                    							lv_group_7_0,
                    							"org.xtext.example.mydsl.WebMate.Group");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

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
    // $ANTLR end "ruleAbbreviation"


    // $ANTLR start "entryRuleID0"
    // InternalWebMate.g:268:1: entryRuleID0 returns [EObject current=null] : iv_ruleID0= ruleID0 EOF ;
    public final EObject entryRuleID0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleID0 = null;


        try {
            // InternalWebMate.g:268:44: (iv_ruleID0= ruleID0 EOF )
            // InternalWebMate.g:269:2: iv_ruleID0= ruleID0 EOF
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
    // InternalWebMate.g:275:1: ruleID0 returns [EObject current=null] : ( () (otherlv_1= '#' ( (lv_idName_2_0= ruleEString ) ) ) ) ;
    public final EObject ruleID0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_idName_2_0 = null;



        	enterRule();

        try {
            // InternalWebMate.g:281:2: ( ( () (otherlv_1= '#' ( (lv_idName_2_0= ruleEString ) ) ) ) )
            // InternalWebMate.g:282:2: ( () (otherlv_1= '#' ( (lv_idName_2_0= ruleEString ) ) ) )
            {
            // InternalWebMate.g:282:2: ( () (otherlv_1= '#' ( (lv_idName_2_0= ruleEString ) ) ) )
            // InternalWebMate.g:283:3: () (otherlv_1= '#' ( (lv_idName_2_0= ruleEString ) ) )
            {
            // InternalWebMate.g:283:3: ()
            // InternalWebMate.g:284:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getID0Access().getIDAction_0(),
            					current);
            			

            }

            // InternalWebMate.g:290:3: (otherlv_1= '#' ( (lv_idName_2_0= ruleEString ) ) )
            // InternalWebMate.g:291:4: otherlv_1= '#' ( (lv_idName_2_0= ruleEString ) )
            {
            otherlv_1=(Token)match(input,11,FOLLOW_10); 

            				newLeafNode(otherlv_1, grammarAccess.getID0Access().getNumberSignKeyword_1_0());
            			
            // InternalWebMate.g:295:4: ( (lv_idName_2_0= ruleEString ) )
            // InternalWebMate.g:296:5: (lv_idName_2_0= ruleEString )
            {
            // InternalWebMate.g:296:5: (lv_idName_2_0= ruleEString )
            // InternalWebMate.g:297:6: lv_idName_2_0= ruleEString
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
            							"org.xtext.example.mydsl.WebMate.EString");
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
    // InternalWebMate.g:319:1: entryRuleSymbol returns [EObject current=null] : iv_ruleSymbol= ruleSymbol EOF ;
    public final EObject entryRuleSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbol = null;


        try {
            // InternalWebMate.g:319:47: (iv_ruleSymbol= ruleSymbol EOF )
            // InternalWebMate.g:320:2: iv_ruleSymbol= ruleSymbol EOF
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
    // InternalWebMate.g:326:1: ruleSymbol returns [EObject current=null] : ( () ( (lv_sym_1_0= ruleValidSymbol ) ) ( ( ruleEString ) ) ) ;
    public final EObject ruleSymbol() throws RecognitionException {
        EObject current = null;

        Enumerator lv_sym_1_0 = null;



        	enterRule();

        try {
            // InternalWebMate.g:332:2: ( ( () ( (lv_sym_1_0= ruleValidSymbol ) ) ( ( ruleEString ) ) ) )
            // InternalWebMate.g:333:2: ( () ( (lv_sym_1_0= ruleValidSymbol ) ) ( ( ruleEString ) ) )
            {
            // InternalWebMate.g:333:2: ( () ( (lv_sym_1_0= ruleValidSymbol ) ) ( ( ruleEString ) ) )
            // InternalWebMate.g:334:3: () ( (lv_sym_1_0= ruleValidSymbol ) ) ( ( ruleEString ) )
            {
            // InternalWebMate.g:334:3: ()
            // InternalWebMate.g:335:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSymbolAccess().getSymbolAction_0(),
            					current);
            			

            }

            // InternalWebMate.g:341:3: ( (lv_sym_1_0= ruleValidSymbol ) )
            // InternalWebMate.g:342:4: (lv_sym_1_0= ruleValidSymbol )
            {
            // InternalWebMate.g:342:4: (lv_sym_1_0= ruleValidSymbol )
            // InternalWebMate.g:343:5: lv_sym_1_0= ruleValidSymbol
            {

            					newCompositeNode(grammarAccess.getSymbolAccess().getSymValidSymbolEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_sym_1_0=ruleValidSymbol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSymbolRule());
            					}
            					set(
            						current,
            						"sym",
            						lv_sym_1_0,
            						"org.xtext.example.mydsl.WebMate.ValidSymbol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWebMate.g:360:3: ( ( ruleEString ) )
            // InternalWebMate.g:361:4: ( ruleEString )
            {
            // InternalWebMate.g:361:4: ( ruleEString )
            // InternalWebMate.g:362:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSymbolRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSymbolAccess().getTagTagCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleSymbol"


    // $ANTLR start "entryRuleTag"
    // InternalWebMate.g:380:1: entryRuleTag returns [EObject current=null] : iv_ruleTag= ruleTag EOF ;
    public final EObject entryRuleTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTag = null;


        try {
            // InternalWebMate.g:380:44: (iv_ruleTag= ruleTag EOF )
            // InternalWebMate.g:381:2: iv_ruleTag= ruleTag EOF
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
    // InternalWebMate.g:387:1: ruleTag returns [EObject current=null] : ( () ( (lv_tagName_1_0= ruleHTMLTag ) ) ) ;
    public final EObject ruleTag() throws RecognitionException {
        EObject current = null;

        Enumerator lv_tagName_1_0 = null;



        	enterRule();

        try {
            // InternalWebMate.g:393:2: ( ( () ( (lv_tagName_1_0= ruleHTMLTag ) ) ) )
            // InternalWebMate.g:394:2: ( () ( (lv_tagName_1_0= ruleHTMLTag ) ) )
            {
            // InternalWebMate.g:394:2: ( () ( (lv_tagName_1_0= ruleHTMLTag ) ) )
            // InternalWebMate.g:395:3: () ( (lv_tagName_1_0= ruleHTMLTag ) )
            {
            // InternalWebMate.g:395:3: ()
            // InternalWebMate.g:396:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTagAccess().getTagAction_0(),
            					current);
            			

            }

            // InternalWebMate.g:402:3: ( (lv_tagName_1_0= ruleHTMLTag ) )
            // InternalWebMate.g:403:4: (lv_tagName_1_0= ruleHTMLTag )
            {
            // InternalWebMate.g:403:4: (lv_tagName_1_0= ruleHTMLTag )
            // InternalWebMate.g:404:5: lv_tagName_1_0= ruleHTMLTag
            {

            					newCompositeNode(grammarAccess.getTagAccess().getTagNameHTMLTagEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_tagName_1_0=ruleHTMLTag();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTagRule());
            					}
            					set(
            						current,
            						"tagName",
            						lv_tagName_1_0,
            						"org.xtext.example.mydsl.WebMate.HTMLTag");
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
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRuleClass"
    // InternalWebMate.g:425:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalWebMate.g:425:46: (iv_ruleClass= ruleClass EOF )
            // InternalWebMate.g:426:2: iv_ruleClass= ruleClass EOF
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
    // InternalWebMate.g:432:1: ruleClass returns [EObject current=null] : ( () otherlv_1= '.' ( (lv_className_2_0= ruleEString ) ) ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_className_2_0 = null;



        	enterRule();

        try {
            // InternalWebMate.g:438:2: ( ( () otherlv_1= '.' ( (lv_className_2_0= ruleEString ) ) ) )
            // InternalWebMate.g:439:2: ( () otherlv_1= '.' ( (lv_className_2_0= ruleEString ) ) )
            {
            // InternalWebMate.g:439:2: ( () otherlv_1= '.' ( (lv_className_2_0= ruleEString ) ) )
            // InternalWebMate.g:440:3: () otherlv_1= '.' ( (lv_className_2_0= ruleEString ) )
            {
            // InternalWebMate.g:440:3: ()
            // InternalWebMate.g:441:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClassAccess().getClassAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getFullStopKeyword_1());
            		
            // InternalWebMate.g:451:3: ( (lv_className_2_0= ruleEString ) )
            // InternalWebMate.g:452:4: (lv_className_2_0= ruleEString )
            {
            // InternalWebMate.g:452:4: (lv_className_2_0= ruleEString )
            // InternalWebMate.g:453:5: lv_className_2_0= ruleEString
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
            						"org.xtext.example.mydsl.WebMate.EString");
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


    // $ANTLR start "entryRuleGroup"
    // InternalWebMate.g:474:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // InternalWebMate.g:474:46: (iv_ruleGroup= ruleGroup EOF )
            // InternalWebMate.g:475:2: iv_ruleGroup= ruleGroup EOF
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
    // InternalWebMate.g:481:1: ruleGroup returns [EObject current=null] : ( ( () otherlv_1= '(' ( (lv_abbreviation_2_0= ruleAbbreviation ) )+ (otherlv_3= ')' )? otherlv_4= '>' ( (lv_abbreviation_5_0= ruleAbbreviation ) ) ) | (otherlv_6= '*' ( (lv_count_7_0= RULE_INT ) ) ) | (otherlv_8= '+' ( (lv_abbreviation_9_0= ruleAbbreviation ) ) ) ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_count_7_0=null;
        Token otherlv_8=null;
        EObject lv_abbreviation_2_0 = null;

        EObject lv_abbreviation_5_0 = null;

        EObject lv_abbreviation_9_0 = null;



        	enterRule();

        try {
            // InternalWebMate.g:487:2: ( ( ( () otherlv_1= '(' ( (lv_abbreviation_2_0= ruleAbbreviation ) )+ (otherlv_3= ')' )? otherlv_4= '>' ( (lv_abbreviation_5_0= ruleAbbreviation ) ) ) | (otherlv_6= '*' ( (lv_count_7_0= RULE_INT ) ) ) | (otherlv_8= '+' ( (lv_abbreviation_9_0= ruleAbbreviation ) ) ) ) )
            // InternalWebMate.g:488:2: ( ( () otherlv_1= '(' ( (lv_abbreviation_2_0= ruleAbbreviation ) )+ (otherlv_3= ')' )? otherlv_4= '>' ( (lv_abbreviation_5_0= ruleAbbreviation ) ) ) | (otherlv_6= '*' ( (lv_count_7_0= RULE_INT ) ) ) | (otherlv_8= '+' ( (lv_abbreviation_9_0= ruleAbbreviation ) ) ) )
            {
            // InternalWebMate.g:488:2: ( ( () otherlv_1= '(' ( (lv_abbreviation_2_0= ruleAbbreviation ) )+ (otherlv_3= ')' )? otherlv_4= '>' ( (lv_abbreviation_5_0= ruleAbbreviation ) ) ) | (otherlv_6= '*' ( (lv_count_7_0= RULE_INT ) ) ) | (otherlv_8= '+' ( (lv_abbreviation_9_0= ruleAbbreviation ) ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt10=1;
                }
                break;
            case 16:
                {
                alt10=2;
                }
                break;
            case 17:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalWebMate.g:489:3: ( () otherlv_1= '(' ( (lv_abbreviation_2_0= ruleAbbreviation ) )+ (otherlv_3= ')' )? otherlv_4= '>' ( (lv_abbreviation_5_0= ruleAbbreviation ) ) )
                    {
                    // InternalWebMate.g:489:3: ( () otherlv_1= '(' ( (lv_abbreviation_2_0= ruleAbbreviation ) )+ (otherlv_3= ')' )? otherlv_4= '>' ( (lv_abbreviation_5_0= ruleAbbreviation ) ) )
                    // InternalWebMate.g:490:4: () otherlv_1= '(' ( (lv_abbreviation_2_0= ruleAbbreviation ) )+ (otherlv_3= ')' )? otherlv_4= '>' ( (lv_abbreviation_5_0= ruleAbbreviation ) )
                    {
                    // InternalWebMate.g:490:4: ()
                    // InternalWebMate.g:491:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getGroupAccess().getGroupAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,13,FOLLOW_11); 

                    				newLeafNode(otherlv_1, grammarAccess.getGroupAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalWebMate.g:501:4: ( (lv_abbreviation_2_0= ruleAbbreviation ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>=RULE_INT && LA8_0<=RULE_STRING)||(LA8_0>=27 && LA8_0<=31)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalWebMate.g:502:5: (lv_abbreviation_2_0= ruleAbbreviation )
                    	    {
                    	    // InternalWebMate.g:502:5: (lv_abbreviation_2_0= ruleAbbreviation )
                    	    // InternalWebMate.g:503:6: lv_abbreviation_2_0= ruleAbbreviation
                    	    {

                    	    						newCompositeNode(grammarAccess.getGroupAccess().getAbbreviationAbbreviationParserRuleCall_0_2_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_abbreviation_2_0=ruleAbbreviation();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getGroupRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"abbreviation",
                    	    							lv_abbreviation_2_0,
                    	    							"org.xtext.example.mydsl.WebMate.Abbreviation");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    // InternalWebMate.g:520:4: (otherlv_3= ')' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==14) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalWebMate.g:521:5: otherlv_3= ')'
                            {
                            otherlv_3=(Token)match(input,14,FOLLOW_12); 

                            					newLeafNode(otherlv_3, grammarAccess.getGroupAccess().getRightParenthesisKeyword_0_3());
                            				

                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getGreaterThanSignKeyword_0_4());
                    			
                    // InternalWebMate.g:530:4: ( (lv_abbreviation_5_0= ruleAbbreviation ) )
                    // InternalWebMate.g:531:5: (lv_abbreviation_5_0= ruleAbbreviation )
                    {
                    // InternalWebMate.g:531:5: (lv_abbreviation_5_0= ruleAbbreviation )
                    // InternalWebMate.g:532:6: lv_abbreviation_5_0= ruleAbbreviation
                    {

                    						newCompositeNode(grammarAccess.getGroupAccess().getAbbreviationAbbreviationParserRuleCall_0_5_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_abbreviation_5_0=ruleAbbreviation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGroupRule());
                    						}
                    						add(
                    							current,
                    							"abbreviation",
                    							lv_abbreviation_5_0,
                    							"org.xtext.example.mydsl.WebMate.Abbreviation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWebMate.g:551:3: (otherlv_6= '*' ( (lv_count_7_0= RULE_INT ) ) )
                    {
                    // InternalWebMate.g:551:3: (otherlv_6= '*' ( (lv_count_7_0= RULE_INT ) ) )
                    // InternalWebMate.g:552:4: otherlv_6= '*' ( (lv_count_7_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getGroupAccess().getAsteriskKeyword_1_0());
                    			
                    // InternalWebMate.g:556:4: ( (lv_count_7_0= RULE_INT ) )
                    // InternalWebMate.g:557:5: (lv_count_7_0= RULE_INT )
                    {
                    // InternalWebMate.g:557:5: (lv_count_7_0= RULE_INT )
                    // InternalWebMate.g:558:6: lv_count_7_0= RULE_INT
                    {
                    lv_count_7_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_count_7_0, grammarAccess.getGroupAccess().getCountINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGroupRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"count",
                    							lv_count_7_0,
                    							"org.xtext.example.mydsl.WebMate.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalWebMate.g:576:3: (otherlv_8= '+' ( (lv_abbreviation_9_0= ruleAbbreviation ) ) )
                    {
                    // InternalWebMate.g:576:3: (otherlv_8= '+' ( (lv_abbreviation_9_0= ruleAbbreviation ) ) )
                    // InternalWebMate.g:577:4: otherlv_8= '+' ( (lv_abbreviation_9_0= ruleAbbreviation ) )
                    {
                    otherlv_8=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getGroupAccess().getPlusSignKeyword_2_0());
                    			
                    // InternalWebMate.g:581:4: ( (lv_abbreviation_9_0= ruleAbbreviation ) )
                    // InternalWebMate.g:582:5: (lv_abbreviation_9_0= ruleAbbreviation )
                    {
                    // InternalWebMate.g:582:5: (lv_abbreviation_9_0= ruleAbbreviation )
                    // InternalWebMate.g:583:6: lv_abbreviation_9_0= ruleAbbreviation
                    {

                    						newCompositeNode(grammarAccess.getGroupAccess().getAbbreviationAbbreviationParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_abbreviation_9_0=ruleAbbreviation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGroupRule());
                    						}
                    						add(
                    							current,
                    							"abbreviation",
                    							lv_abbreviation_9_0,
                    							"org.xtext.example.mydsl.WebMate.Abbreviation");
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
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleAttribute"
    // InternalWebMate.g:605:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalWebMate.g:605:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalWebMate.g:606:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalWebMate.g:612:1: ruleAttribute returns [EObject current=null] : ( () (otherlv_1= '[' ( (lv_attributeName_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_attributeValue_4_0= ruleEString ) ) )? otherlv_5= ']' ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_attributeName_2_0 = null;

        AntlrDatatypeRuleToken lv_attributeValue_4_0 = null;



        	enterRule();

        try {
            // InternalWebMate.g:618:2: ( ( () (otherlv_1= '[' ( (lv_attributeName_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_attributeValue_4_0= ruleEString ) ) )? otherlv_5= ']' ) ) )
            // InternalWebMate.g:619:2: ( () (otherlv_1= '[' ( (lv_attributeName_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_attributeValue_4_0= ruleEString ) ) )? otherlv_5= ']' ) )
            {
            // InternalWebMate.g:619:2: ( () (otherlv_1= '[' ( (lv_attributeName_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_attributeValue_4_0= ruleEString ) ) )? otherlv_5= ']' ) )
            // InternalWebMate.g:620:3: () (otherlv_1= '[' ( (lv_attributeName_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_attributeValue_4_0= ruleEString ) ) )? otherlv_5= ']' )
            {
            // InternalWebMate.g:620:3: ()
            // InternalWebMate.g:621:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeAccess().getAttributeAction_0(),
            					current);
            			

            }

            // InternalWebMate.g:627:3: (otherlv_1= '[' ( (lv_attributeName_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_attributeValue_4_0= ruleEString ) ) )? otherlv_5= ']' )
            // InternalWebMate.g:628:4: otherlv_1= '[' ( (lv_attributeName_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_attributeValue_4_0= ruleEString ) ) )? otherlv_5= ']'
            {
            otherlv_1=(Token)match(input,18,FOLLOW_10); 

            				newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_1_0());
            			
            // InternalWebMate.g:632:4: ( (lv_attributeName_2_0= ruleEString ) )
            // InternalWebMate.g:633:5: (lv_attributeName_2_0= ruleEString )
            {
            // InternalWebMate.g:633:5: (lv_attributeName_2_0= ruleEString )
            // InternalWebMate.g:634:6: lv_attributeName_2_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getAttributeAccess().getAttributeNameEStringParserRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_15);
            lv_attributeName_2_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getAttributeRule());
            						}
            						set(
            							current,
            							"attributeName",
            							lv_attributeName_2_0,
            							"org.xtext.example.mydsl.WebMate.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalWebMate.g:651:4: (otherlv_3= '=' ( (lv_attributeValue_4_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalWebMate.g:652:5: otherlv_3= '=' ( (lv_attributeValue_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_10); 

                    					newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getEqualsSignKeyword_1_2_0());
                    				
                    // InternalWebMate.g:656:5: ( (lv_attributeValue_4_0= ruleEString ) )
                    // InternalWebMate.g:657:6: (lv_attributeValue_4_0= ruleEString )
                    {
                    // InternalWebMate.g:657:6: (lv_attributeValue_4_0= ruleEString )
                    // InternalWebMate.g:658:7: lv_attributeValue_4_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getAttributeAccess().getAttributeValueEStringParserRuleCall_1_2_1_0());
                    						
                    pushFollow(FOLLOW_16);
                    lv_attributeValue_4_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAttributeRule());
                    							}
                    							set(
                    								current,
                    								"attributeValue",
                    								lv_attributeValue_4_0,
                    								"org.xtext.example.mydsl.WebMate.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEString"
    // InternalWebMate.g:685:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalWebMate.g:685:47: (iv_ruleEString= ruleEString EOF )
            // InternalWebMate.g:686:2: iv_ruleEString= ruleEString EOF
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
    // InternalWebMate.g:692:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalWebMate.g:698:2: ( (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT ) )
            // InternalWebMate.g:699:2: (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT )
            {
            // InternalWebMate.g:699:2: (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_INT) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalWebMate.g:700:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalWebMate.g:708:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getEStringAccess().getINTTerminalRuleCall_1());
                    		

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


    // $ANTLR start "ruleValidSymbol"
    // InternalWebMate.g:719:1: ruleValidSymbol returns [Enumerator current=null] : ( (enumLiteral_0= 'plus' ) | (enumLiteral_1= 'multiply' ) | (enumLiteral_2= 'dot' ) | (enumLiteral_3= 'hash' ) | (enumLiteral_4= 'greaterthan' ) | (enumLiteral_5= 'caret' ) ) ;
    public final Enumerator ruleValidSymbol() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalWebMate.g:725:2: ( ( (enumLiteral_0= 'plus' ) | (enumLiteral_1= 'multiply' ) | (enumLiteral_2= 'dot' ) | (enumLiteral_3= 'hash' ) | (enumLiteral_4= 'greaterthan' ) | (enumLiteral_5= 'caret' ) ) )
            // InternalWebMate.g:726:2: ( (enumLiteral_0= 'plus' ) | (enumLiteral_1= 'multiply' ) | (enumLiteral_2= 'dot' ) | (enumLiteral_3= 'hash' ) | (enumLiteral_4= 'greaterthan' ) | (enumLiteral_5= 'caret' ) )
            {
            // InternalWebMate.g:726:2: ( (enumLiteral_0= 'plus' ) | (enumLiteral_1= 'multiply' ) | (enumLiteral_2= 'dot' ) | (enumLiteral_3= 'hash' ) | (enumLiteral_4= 'greaterthan' ) | (enumLiteral_5= 'caret' ) )
            int alt13=6;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt13=1;
                }
                break;
            case 22:
                {
                alt13=2;
                }
                break;
            case 23:
                {
                alt13=3;
                }
                break;
            case 24:
                {
                alt13=4;
                }
                break;
            case 25:
                {
                alt13=5;
                }
                break;
            case 26:
                {
                alt13=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalWebMate.g:727:3: (enumLiteral_0= 'plus' )
                    {
                    // InternalWebMate.g:727:3: (enumLiteral_0= 'plus' )
                    // InternalWebMate.g:728:4: enumLiteral_0= 'plus'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getValidSymbolAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getValidSymbolAccess().getPlusEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalWebMate.g:735:3: (enumLiteral_1= 'multiply' )
                    {
                    // InternalWebMate.g:735:3: (enumLiteral_1= 'multiply' )
                    // InternalWebMate.g:736:4: enumLiteral_1= 'multiply'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getValidSymbolAccess().getMultiplyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getValidSymbolAccess().getMultiplyEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalWebMate.g:743:3: (enumLiteral_2= 'dot' )
                    {
                    // InternalWebMate.g:743:3: (enumLiteral_2= 'dot' )
                    // InternalWebMate.g:744:4: enumLiteral_2= 'dot'
                    {
                    enumLiteral_2=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getValidSymbolAccess().getDotEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getValidSymbolAccess().getDotEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalWebMate.g:751:3: (enumLiteral_3= 'hash' )
                    {
                    // InternalWebMate.g:751:3: (enumLiteral_3= 'hash' )
                    // InternalWebMate.g:752:4: enumLiteral_3= 'hash'
                    {
                    enumLiteral_3=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getValidSymbolAccess().getHashEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getValidSymbolAccess().getHashEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalWebMate.g:759:3: (enumLiteral_4= 'greaterthan' )
                    {
                    // InternalWebMate.g:759:3: (enumLiteral_4= 'greaterthan' )
                    // InternalWebMate.g:760:4: enumLiteral_4= 'greaterthan'
                    {
                    enumLiteral_4=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getValidSymbolAccess().getGreaterthanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getValidSymbolAccess().getGreaterthanEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalWebMate.g:767:3: (enumLiteral_5= 'caret' )
                    {
                    // InternalWebMate.g:767:3: (enumLiteral_5= 'caret' )
                    // InternalWebMate.g:768:4: enumLiteral_5= 'caret'
                    {
                    enumLiteral_5=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getValidSymbolAccess().getCaretEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getValidSymbolAccess().getCaretEnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleValidSymbol"


    // $ANTLR start "ruleHTMLTag"
    // InternalWebMate.g:778:1: ruleHTMLTag returns [Enumerator current=null] : ( (enumLiteral_0= 'div' ) | (enumLiteral_1= 'h1' ) | (enumLiteral_2= 'p' ) | (enumLiteral_3= 'ul' ) | (enumLiteral_4= 'li' ) ) ;
    public final Enumerator ruleHTMLTag() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalWebMate.g:784:2: ( ( (enumLiteral_0= 'div' ) | (enumLiteral_1= 'h1' ) | (enumLiteral_2= 'p' ) | (enumLiteral_3= 'ul' ) | (enumLiteral_4= 'li' ) ) )
            // InternalWebMate.g:785:2: ( (enumLiteral_0= 'div' ) | (enumLiteral_1= 'h1' ) | (enumLiteral_2= 'p' ) | (enumLiteral_3= 'ul' ) | (enumLiteral_4= 'li' ) )
            {
            // InternalWebMate.g:785:2: ( (enumLiteral_0= 'div' ) | (enumLiteral_1= 'h1' ) | (enumLiteral_2= 'p' ) | (enumLiteral_3= 'ul' ) | (enumLiteral_4= 'li' ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt14=1;
                }
                break;
            case 28:
                {
                alt14=2;
                }
                break;
            case 29:
                {
                alt14=3;
                }
                break;
            case 30:
                {
                alt14=4;
                }
                break;
            case 31:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalWebMate.g:786:3: (enumLiteral_0= 'div' )
                    {
                    // InternalWebMate.g:786:3: (enumLiteral_0= 'div' )
                    // InternalWebMate.g:787:4: enumLiteral_0= 'div'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getHTMLTagAccess().getDivEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getHTMLTagAccess().getDivEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalWebMate.g:794:3: (enumLiteral_1= 'h1' )
                    {
                    // InternalWebMate.g:794:3: (enumLiteral_1= 'h1' )
                    // InternalWebMate.g:795:4: enumLiteral_1= 'h1'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getHTMLTagAccess().getH1EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getHTMLTagAccess().getH1EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalWebMate.g:802:3: (enumLiteral_2= 'p' )
                    {
                    // InternalWebMate.g:802:3: (enumLiteral_2= 'p' )
                    // InternalWebMate.g:803:4: enumLiteral_2= 'p'
                    {
                    enumLiteral_2=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getHTMLTagAccess().getPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getHTMLTagAccess().getPEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalWebMate.g:810:3: (enumLiteral_3= 'ul' )
                    {
                    // InternalWebMate.g:810:3: (enumLiteral_3= 'ul' )
                    // InternalWebMate.g:811:4: enumLiteral_3= 'ul'
                    {
                    enumLiteral_3=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getHTMLTagAccess().getUlEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getHTMLTagAccess().getUlEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalWebMate.g:818:3: (enumLiteral_4= 'li' )
                    {
                    // InternalWebMate.g:818:3: (enumLiteral_4= 'li' )
                    // InternalWebMate.g:819:4: enumLiteral_4= 'li'
                    {
                    enumLiteral_4=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getHTMLTagAccess().getLiEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getHTMLTagAccess().getLiEnumLiteralDeclaration_4());
                    			

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000F8000032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000FFE73830L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000007E73802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000007E72802L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000007E72002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000072002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000032002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000F800C030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000F8000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});

}