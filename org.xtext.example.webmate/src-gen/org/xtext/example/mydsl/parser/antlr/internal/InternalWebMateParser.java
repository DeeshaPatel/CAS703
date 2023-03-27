package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Emmet'", "'{'", "'abbreviation'", "','", "'}'", "'Abbreviation'", "'prefix'", "'element'", "'suffix'", "'Prefix'", "'count'", "'elementName'", "'elementClass'", "'elementID'", "'Element'", "'attributes'", "'Suffix'", "'text'", "'-'", "'Tag'", "'tagName'", "'Class'", "'className'", "'ID'", "'idName'", "'Attribute'", "'attributeName'", "'attributeValue'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
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
        	return "Emmet";
       	}

       	@Override
       	protected WebMateGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEmmet"
    // InternalWebMate.g:64:1: entryRuleEmmet returns [EObject current=null] : iv_ruleEmmet= ruleEmmet EOF ;
    public final EObject entryRuleEmmet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmmet = null;


        try {
            // InternalWebMate.g:64:46: (iv_ruleEmmet= ruleEmmet EOF )
            // InternalWebMate.g:65:2: iv_ruleEmmet= ruleEmmet EOF
            {
             newCompositeNode(grammarAccess.getEmmetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmmet=ruleEmmet();

            state._fsp--;

             current =iv_ruleEmmet; 
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
    // $ANTLR end "entryRuleEmmet"


    // $ANTLR start "ruleEmmet"
    // InternalWebMate.g:71:1: ruleEmmet returns [EObject current=null] : (otherlv_0= 'Emmet' otherlv_1= '{' otherlv_2= 'abbreviation' otherlv_3= '{' ( (lv_abbreviation_4_0= ruleAbbreviation ) ) (otherlv_5= ',' ( (lv_abbreviation_6_0= ruleAbbreviation ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleEmmet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_abbreviation_4_0 = null;

        EObject lv_abbreviation_6_0 = null;



        	enterRule();

        try {
            // InternalWebMate.g:77:2: ( (otherlv_0= 'Emmet' otherlv_1= '{' otherlv_2= 'abbreviation' otherlv_3= '{' ( (lv_abbreviation_4_0= ruleAbbreviation ) ) (otherlv_5= ',' ( (lv_abbreviation_6_0= ruleAbbreviation ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalWebMate.g:78:2: (otherlv_0= 'Emmet' otherlv_1= '{' otherlv_2= 'abbreviation' otherlv_3= '{' ( (lv_abbreviation_4_0= ruleAbbreviation ) ) (otherlv_5= ',' ( (lv_abbreviation_6_0= ruleAbbreviation ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalWebMate.g:78:2: (otherlv_0= 'Emmet' otherlv_1= '{' otherlv_2= 'abbreviation' otherlv_3= '{' ( (lv_abbreviation_4_0= ruleAbbreviation ) ) (otherlv_5= ',' ( (lv_abbreviation_6_0= ruleAbbreviation ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalWebMate.g:79:3: otherlv_0= 'Emmet' otherlv_1= '{' otherlv_2= 'abbreviation' otherlv_3= '{' ( (lv_abbreviation_4_0= ruleAbbreviation ) ) (otherlv_5= ',' ( (lv_abbreviation_6_0= ruleAbbreviation ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEmmetAccess().getEmmetKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEmmetAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getEmmetAccess().getAbbreviationKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getEmmetAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalWebMate.g:95:3: ( (lv_abbreviation_4_0= ruleAbbreviation ) )
            // InternalWebMate.g:96:4: (lv_abbreviation_4_0= ruleAbbreviation )
            {
            // InternalWebMate.g:96:4: (lv_abbreviation_4_0= ruleAbbreviation )
            // InternalWebMate.g:97:5: lv_abbreviation_4_0= ruleAbbreviation
            {

            					newCompositeNode(grammarAccess.getEmmetAccess().getAbbreviationAbbreviationParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_abbreviation_4_0=ruleAbbreviation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEmmetRule());
            					}
            					add(
            						current,
            						"abbreviation",
            						lv_abbreviation_4_0,
            						"org.xtext.example.mydsl.WebMate.Abbreviation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWebMate.g:114:3: (otherlv_5= ',' ( (lv_abbreviation_6_0= ruleAbbreviation ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWebMate.g:115:4: otherlv_5= ',' ( (lv_abbreviation_6_0= ruleAbbreviation ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getEmmetAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalWebMate.g:119:4: ( (lv_abbreviation_6_0= ruleAbbreviation ) )
            	    // InternalWebMate.g:120:5: (lv_abbreviation_6_0= ruleAbbreviation )
            	    {
            	    // InternalWebMate.g:120:5: (lv_abbreviation_6_0= ruleAbbreviation )
            	    // InternalWebMate.g:121:6: lv_abbreviation_6_0= ruleAbbreviation
            	    {

            	    						newCompositeNode(grammarAccess.getEmmetAccess().getAbbreviationAbbreviationParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_abbreviation_6_0=ruleAbbreviation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEmmetRule());
            	    						}
            	    						add(
            	    							current,
            	    							"abbreviation",
            	    							lv_abbreviation_6_0,
            	    							"org.xtext.example.mydsl.WebMate.Abbreviation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getEmmetAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getEmmetAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleEmmet"


    // $ANTLR start "entryRuleAbbreviation"
    // InternalWebMate.g:151:1: entryRuleAbbreviation returns [EObject current=null] : iv_ruleAbbreviation= ruleAbbreviation EOF ;
    public final EObject entryRuleAbbreviation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbbreviation = null;


        try {
            // InternalWebMate.g:151:53: (iv_ruleAbbreviation= ruleAbbreviation EOF )
            // InternalWebMate.g:152:2: iv_ruleAbbreviation= ruleAbbreviation EOF
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
    // InternalWebMate.g:158:1: ruleAbbreviation returns [EObject current=null] : ( () otherlv_1= 'Abbreviation' otherlv_2= '{' (otherlv_3= 'prefix' ( (lv_prefix_4_0= rulePrefix ) ) )? (otherlv_5= 'element' otherlv_6= '{' ( (lv_element_7_0= ruleElement ) ) (otherlv_8= ',' ( (lv_element_9_0= ruleElement ) ) )* otherlv_10= '}' )? (otherlv_11= 'suffix' ( (lv_suffix_12_0= ruleSuffix ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleAbbreviation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_prefix_4_0 = null;

        EObject lv_element_7_0 = null;

        EObject lv_element_9_0 = null;

        EObject lv_suffix_12_0 = null;



        	enterRule();

        try {
            // InternalWebMate.g:164:2: ( ( () otherlv_1= 'Abbreviation' otherlv_2= '{' (otherlv_3= 'prefix' ( (lv_prefix_4_0= rulePrefix ) ) )? (otherlv_5= 'element' otherlv_6= '{' ( (lv_element_7_0= ruleElement ) ) (otherlv_8= ',' ( (lv_element_9_0= ruleElement ) ) )* otherlv_10= '}' )? (otherlv_11= 'suffix' ( (lv_suffix_12_0= ruleSuffix ) ) )? otherlv_13= '}' ) )
            // InternalWebMate.g:165:2: ( () otherlv_1= 'Abbreviation' otherlv_2= '{' (otherlv_3= 'prefix' ( (lv_prefix_4_0= rulePrefix ) ) )? (otherlv_5= 'element' otherlv_6= '{' ( (lv_element_7_0= ruleElement ) ) (otherlv_8= ',' ( (lv_element_9_0= ruleElement ) ) )* otherlv_10= '}' )? (otherlv_11= 'suffix' ( (lv_suffix_12_0= ruleSuffix ) ) )? otherlv_13= '}' )
            {
            // InternalWebMate.g:165:2: ( () otherlv_1= 'Abbreviation' otherlv_2= '{' (otherlv_3= 'prefix' ( (lv_prefix_4_0= rulePrefix ) ) )? (otherlv_5= 'element' otherlv_6= '{' ( (lv_element_7_0= ruleElement ) ) (otherlv_8= ',' ( (lv_element_9_0= ruleElement ) ) )* otherlv_10= '}' )? (otherlv_11= 'suffix' ( (lv_suffix_12_0= ruleSuffix ) ) )? otherlv_13= '}' )
            // InternalWebMate.g:166:3: () otherlv_1= 'Abbreviation' otherlv_2= '{' (otherlv_3= 'prefix' ( (lv_prefix_4_0= rulePrefix ) ) )? (otherlv_5= 'element' otherlv_6= '{' ( (lv_element_7_0= ruleElement ) ) (otherlv_8= ',' ( (lv_element_9_0= ruleElement ) ) )* otherlv_10= '}' )? (otherlv_11= 'suffix' ( (lv_suffix_12_0= ruleSuffix ) ) )? otherlv_13= '}'
            {
            // InternalWebMate.g:166:3: ()
            // InternalWebMate.g:167:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAbbreviationAccess().getAbbreviationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAbbreviationAccess().getAbbreviationKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getAbbreviationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWebMate.g:181:3: (otherlv_3= 'prefix' ( (lv_prefix_4_0= rulePrefix ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalWebMate.g:182:4: otherlv_3= 'prefix' ( (lv_prefix_4_0= rulePrefix ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getAbbreviationAccess().getPrefixKeyword_3_0());
                    			
                    // InternalWebMate.g:186:4: ( (lv_prefix_4_0= rulePrefix ) )
                    // InternalWebMate.g:187:5: (lv_prefix_4_0= rulePrefix )
                    {
                    // InternalWebMate.g:187:5: (lv_prefix_4_0= rulePrefix )
                    // InternalWebMate.g:188:6: lv_prefix_4_0= rulePrefix
                    {

                    						newCompositeNode(grammarAccess.getAbbreviationAccess().getPrefixPrefixParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_prefix_4_0=rulePrefix();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAbbreviationRule());
                    						}
                    						set(
                    							current,
                    							"prefix",
                    							lv_prefix_4_0,
                    							"org.xtext.example.mydsl.WebMate.Prefix");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalWebMate.g:206:3: (otherlv_5= 'element' otherlv_6= '{' ( (lv_element_7_0= ruleElement ) ) (otherlv_8= ',' ( (lv_element_9_0= ruleElement ) ) )* otherlv_10= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalWebMate.g:207:4: otherlv_5= 'element' otherlv_6= '{' ( (lv_element_7_0= ruleElement ) ) (otherlv_8= ',' ( (lv_element_9_0= ruleElement ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getAbbreviationAccess().getElementKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getAbbreviationAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalWebMate.g:215:4: ( (lv_element_7_0= ruleElement ) )
                    // InternalWebMate.g:216:5: (lv_element_7_0= ruleElement )
                    {
                    // InternalWebMate.g:216:5: (lv_element_7_0= ruleElement )
                    // InternalWebMate.g:217:6: lv_element_7_0= ruleElement
                    {

                    						newCompositeNode(grammarAccess.getAbbreviationAccess().getElementElementParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_element_7_0=ruleElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAbbreviationRule());
                    						}
                    						add(
                    							current,
                    							"element",
                    							lv_element_7_0,
                    							"org.xtext.example.mydsl.WebMate.Element");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalWebMate.g:234:4: (otherlv_8= ',' ( (lv_element_9_0= ruleElement ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalWebMate.g:235:5: otherlv_8= ',' ( (lv_element_9_0= ruleElement ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_11); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getAbbreviationAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalWebMate.g:239:5: ( (lv_element_9_0= ruleElement ) )
                    	    // InternalWebMate.g:240:6: (lv_element_9_0= ruleElement )
                    	    {
                    	    // InternalWebMate.g:240:6: (lv_element_9_0= ruleElement )
                    	    // InternalWebMate.g:241:7: lv_element_9_0= ruleElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getAbbreviationAccess().getElementElementParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_element_9_0=ruleElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAbbreviationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"element",
                    	    								lv_element_9_0,
                    	    								"org.xtext.example.mydsl.WebMate.Element");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getAbbreviationAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalWebMate.g:264:3: (otherlv_11= 'suffix' ( (lv_suffix_12_0= ruleSuffix ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalWebMate.g:265:4: otherlv_11= 'suffix' ( (lv_suffix_12_0= ruleSuffix ) )
                    {
                    otherlv_11=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_11, grammarAccess.getAbbreviationAccess().getSuffixKeyword_5_0());
                    			
                    // InternalWebMate.g:269:4: ( (lv_suffix_12_0= ruleSuffix ) )
                    // InternalWebMate.g:270:5: (lv_suffix_12_0= ruleSuffix )
                    {
                    // InternalWebMate.g:270:5: (lv_suffix_12_0= ruleSuffix )
                    // InternalWebMate.g:271:6: lv_suffix_12_0= ruleSuffix
                    {

                    						newCompositeNode(grammarAccess.getAbbreviationAccess().getSuffixSuffixParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_suffix_12_0=ruleSuffix();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAbbreviationRule());
                    						}
                    						set(
                    							current,
                    							"suffix",
                    							lv_suffix_12_0,
                    							"org.xtext.example.mydsl.WebMate.Suffix");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getAbbreviationAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "entryRulePrefix"
    // InternalWebMate.g:297:1: entryRulePrefix returns [EObject current=null] : iv_rulePrefix= rulePrefix EOF ;
    public final EObject entryRulePrefix() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefix = null;


        try {
            // InternalWebMate.g:297:47: (iv_rulePrefix= rulePrefix EOF )
            // InternalWebMate.g:298:2: iv_rulePrefix= rulePrefix EOF
            {
             newCompositeNode(grammarAccess.getPrefixRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrefix=rulePrefix();

            state._fsp--;

             current =iv_rulePrefix; 
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
    // $ANTLR end "entryRulePrefix"


    // $ANTLR start "rulePrefix"
    // InternalWebMate.g:304:1: rulePrefix returns [EObject current=null] : ( () otherlv_1= 'Prefix' otherlv_2= '{' (otherlv_3= 'count' ( (lv_count_4_0= ruleEInt ) ) )? (otherlv_5= 'elementName' ( (lv_elementName_6_0= ruleTag ) ) )? (otherlv_7= 'elementClass' ( (lv_elementClass_8_0= ruleClass ) ) )? (otherlv_9= 'elementID' ( (lv_elementID_10_0= ruleID0 ) ) )? otherlv_11= '}' ) ;
    public final EObject rulePrefix() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_count_4_0 = null;

        EObject lv_elementName_6_0 = null;

        EObject lv_elementClass_8_0 = null;

        EObject lv_elementID_10_0 = null;



        	enterRule();

        try {
            // InternalWebMate.g:310:2: ( ( () otherlv_1= 'Prefix' otherlv_2= '{' (otherlv_3= 'count' ( (lv_count_4_0= ruleEInt ) ) )? (otherlv_5= 'elementName' ( (lv_elementName_6_0= ruleTag ) ) )? (otherlv_7= 'elementClass' ( (lv_elementClass_8_0= ruleClass ) ) )? (otherlv_9= 'elementID' ( (lv_elementID_10_0= ruleID0 ) ) )? otherlv_11= '}' ) )
            // InternalWebMate.g:311:2: ( () otherlv_1= 'Prefix' otherlv_2= '{' (otherlv_3= 'count' ( (lv_count_4_0= ruleEInt ) ) )? (otherlv_5= 'elementName' ( (lv_elementName_6_0= ruleTag ) ) )? (otherlv_7= 'elementClass' ( (lv_elementClass_8_0= ruleClass ) ) )? (otherlv_9= 'elementID' ( (lv_elementID_10_0= ruleID0 ) ) )? otherlv_11= '}' )
            {
            // InternalWebMate.g:311:2: ( () otherlv_1= 'Prefix' otherlv_2= '{' (otherlv_3= 'count' ( (lv_count_4_0= ruleEInt ) ) )? (otherlv_5= 'elementName' ( (lv_elementName_6_0= ruleTag ) ) )? (otherlv_7= 'elementClass' ( (lv_elementClass_8_0= ruleClass ) ) )? (otherlv_9= 'elementID' ( (lv_elementID_10_0= ruleID0 ) ) )? otherlv_11= '}' )
            // InternalWebMate.g:312:3: () otherlv_1= 'Prefix' otherlv_2= '{' (otherlv_3= 'count' ( (lv_count_4_0= ruleEInt ) ) )? (otherlv_5= 'elementName' ( (lv_elementName_6_0= ruleTag ) ) )? (otherlv_7= 'elementClass' ( (lv_elementClass_8_0= ruleClass ) ) )? (otherlv_9= 'elementID' ( (lv_elementID_10_0= ruleID0 ) ) )? otherlv_11= '}'
            {
            // InternalWebMate.g:312:3: ()
            // InternalWebMate.g:313:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrefixAccess().getPrefixAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPrefixAccess().getPrefixKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getPrefixAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWebMate.g:327:3: (otherlv_3= 'count' ( (lv_count_4_0= ruleEInt ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalWebMate.g:328:4: otherlv_3= 'count' ( (lv_count_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrefixAccess().getCountKeyword_3_0());
                    			
                    // InternalWebMate.g:332:4: ( (lv_count_4_0= ruleEInt ) )
                    // InternalWebMate.g:333:5: (lv_count_4_0= ruleEInt )
                    {
                    // InternalWebMate.g:333:5: (lv_count_4_0= ruleEInt )
                    // InternalWebMate.g:334:6: lv_count_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPrefixAccess().getCountEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_count_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrefixRule());
                    						}
                    						set(
                    							current,
                    							"count",
                    							lv_count_4_0,
                    							"org.xtext.example.mydsl.WebMate.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalWebMate.g:352:3: (otherlv_5= 'elementName' ( (lv_elementName_6_0= ruleTag ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalWebMate.g:353:4: otherlv_5= 'elementName' ( (lv_elementName_6_0= ruleTag ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrefixAccess().getElementNameKeyword_4_0());
                    			
                    // InternalWebMate.g:357:4: ( (lv_elementName_6_0= ruleTag ) )
                    // InternalWebMate.g:358:5: (lv_elementName_6_0= ruleTag )
                    {
                    // InternalWebMate.g:358:5: (lv_elementName_6_0= ruleTag )
                    // InternalWebMate.g:359:6: lv_elementName_6_0= ruleTag
                    {

                    						newCompositeNode(grammarAccess.getPrefixAccess().getElementNameTagParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_elementName_6_0=ruleTag();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrefixRule());
                    						}
                    						set(
                    							current,
                    							"elementName",
                    							lv_elementName_6_0,
                    							"org.xtext.example.mydsl.WebMate.Tag");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalWebMate.g:377:3: (otherlv_7= 'elementClass' ( (lv_elementClass_8_0= ruleClass ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalWebMate.g:378:4: otherlv_7= 'elementClass' ( (lv_elementClass_8_0= ruleClass ) )
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_19); 

                    				newLeafNode(otherlv_7, grammarAccess.getPrefixAccess().getElementClassKeyword_5_0());
                    			
                    // InternalWebMate.g:382:4: ( (lv_elementClass_8_0= ruleClass ) )
                    // InternalWebMate.g:383:5: (lv_elementClass_8_0= ruleClass )
                    {
                    // InternalWebMate.g:383:5: (lv_elementClass_8_0= ruleClass )
                    // InternalWebMate.g:384:6: lv_elementClass_8_0= ruleClass
                    {

                    						newCompositeNode(grammarAccess.getPrefixAccess().getElementClassClassParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_elementClass_8_0=ruleClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrefixRule());
                    						}
                    						set(
                    							current,
                    							"elementClass",
                    							lv_elementClass_8_0,
                    							"org.xtext.example.mydsl.WebMate.Class");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalWebMate.g:402:3: (otherlv_9= 'elementID' ( (lv_elementID_10_0= ruleID0 ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalWebMate.g:403:4: otherlv_9= 'elementID' ( (lv_elementID_10_0= ruleID0 ) )
                    {
                    otherlv_9=(Token)match(input,24,FOLLOW_21); 

                    				newLeafNode(otherlv_9, grammarAccess.getPrefixAccess().getElementIDKeyword_6_0());
                    			
                    // InternalWebMate.g:407:4: ( (lv_elementID_10_0= ruleID0 ) )
                    // InternalWebMate.g:408:5: (lv_elementID_10_0= ruleID0 )
                    {
                    // InternalWebMate.g:408:5: (lv_elementID_10_0= ruleID0 )
                    // InternalWebMate.g:409:6: lv_elementID_10_0= ruleID0
                    {

                    						newCompositeNode(grammarAccess.getPrefixAccess().getElementIDID0ParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_elementID_10_0=ruleID0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrefixRule());
                    						}
                    						set(
                    							current,
                    							"elementID",
                    							lv_elementID_10_0,
                    							"org.xtext.example.mydsl.WebMate.ID0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getPrefixAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "rulePrefix"


    // $ANTLR start "entryRuleElement"
    // InternalWebMate.g:435:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalWebMate.g:435:48: (iv_ruleElement= ruleElement EOF )
            // InternalWebMate.g:436:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalWebMate.g:442:1: ruleElement returns [EObject current=null] : ( () otherlv_1= 'Element' otherlv_2= '{' (otherlv_3= 'count' ( (lv_count_4_0= ruleEInt ) ) )? (otherlv_5= 'elementName' ( (lv_elementName_6_0= ruleTag ) ) )? (otherlv_7= 'elementClass' ( (lv_elementClass_8_0= ruleClass ) ) )? (otherlv_9= 'elementID' ( (lv_elementID_10_0= ruleID0 ) ) )? (otherlv_11= 'attributes' otherlv_12= '{' ( (lv_attributes_13_0= ruleAttribute ) ) (otherlv_14= ',' ( (lv_attributes_15_0= ruleAttribute ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_count_4_0 = null;

        EObject lv_elementName_6_0 = null;

        EObject lv_elementClass_8_0 = null;

        EObject lv_elementID_10_0 = null;

        EObject lv_attributes_13_0 = null;

        EObject lv_attributes_15_0 = null;



        	enterRule();

        try {
            // InternalWebMate.g:448:2: ( ( () otherlv_1= 'Element' otherlv_2= '{' (otherlv_3= 'count' ( (lv_count_4_0= ruleEInt ) ) )? (otherlv_5= 'elementName' ( (lv_elementName_6_0= ruleTag ) ) )? (otherlv_7= 'elementClass' ( (lv_elementClass_8_0= ruleClass ) ) )? (otherlv_9= 'elementID' ( (lv_elementID_10_0= ruleID0 ) ) )? (otherlv_11= 'attributes' otherlv_12= '{' ( (lv_attributes_13_0= ruleAttribute ) ) (otherlv_14= ',' ( (lv_attributes_15_0= ruleAttribute ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) )
            // InternalWebMate.g:449:2: ( () otherlv_1= 'Element' otherlv_2= '{' (otherlv_3= 'count' ( (lv_count_4_0= ruleEInt ) ) )? (otherlv_5= 'elementName' ( (lv_elementName_6_0= ruleTag ) ) )? (otherlv_7= 'elementClass' ( (lv_elementClass_8_0= ruleClass ) ) )? (otherlv_9= 'elementID' ( (lv_elementID_10_0= ruleID0 ) ) )? (otherlv_11= 'attributes' otherlv_12= '{' ( (lv_attributes_13_0= ruleAttribute ) ) (otherlv_14= ',' ( (lv_attributes_15_0= ruleAttribute ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            {
            // InternalWebMate.g:449:2: ( () otherlv_1= 'Element' otherlv_2= '{' (otherlv_3= 'count' ( (lv_count_4_0= ruleEInt ) ) )? (otherlv_5= 'elementName' ( (lv_elementName_6_0= ruleTag ) ) )? (otherlv_7= 'elementClass' ( (lv_elementClass_8_0= ruleClass ) ) )? (otherlv_9= 'elementID' ( (lv_elementID_10_0= ruleID0 ) ) )? (otherlv_11= 'attributes' otherlv_12= '{' ( (lv_attributes_13_0= ruleAttribute ) ) (otherlv_14= ',' ( (lv_attributes_15_0= ruleAttribute ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            // InternalWebMate.g:450:3: () otherlv_1= 'Element' otherlv_2= '{' (otherlv_3= 'count' ( (lv_count_4_0= ruleEInt ) ) )? (otherlv_5= 'elementName' ( (lv_elementName_6_0= ruleTag ) ) )? (otherlv_7= 'elementClass' ( (lv_elementClass_8_0= ruleClass ) ) )? (otherlv_9= 'elementID' ( (lv_elementID_10_0= ruleID0 ) ) )? (otherlv_11= 'attributes' otherlv_12= '{' ( (lv_attributes_13_0= ruleAttribute ) ) (otherlv_14= ',' ( (lv_attributes_15_0= ruleAttribute ) ) )* otherlv_16= '}' )? otherlv_17= '}'
            {
            // InternalWebMate.g:450:3: ()
            // InternalWebMate.g:451:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getElementAccess().getElementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getElementAccess().getElementKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getElementAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWebMate.g:465:3: (otherlv_3= 'count' ( (lv_count_4_0= ruleEInt ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalWebMate.g:466:4: otherlv_3= 'count' ( (lv_count_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getElementAccess().getCountKeyword_3_0());
                    			
                    // InternalWebMate.g:470:4: ( (lv_count_4_0= ruleEInt ) )
                    // InternalWebMate.g:471:5: (lv_count_4_0= ruleEInt )
                    {
                    // InternalWebMate.g:471:5: (lv_count_4_0= ruleEInt )
                    // InternalWebMate.g:472:6: lv_count_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getElementAccess().getCountEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_count_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementRule());
                    						}
                    						set(
                    							current,
                    							"count",
                    							lv_count_4_0,
                    							"org.xtext.example.mydsl.WebMate.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalWebMate.g:490:3: (otherlv_5= 'elementName' ( (lv_elementName_6_0= ruleTag ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalWebMate.g:491:4: otherlv_5= 'elementName' ( (lv_elementName_6_0= ruleTag ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getElementAccess().getElementNameKeyword_4_0());
                    			
                    // InternalWebMate.g:495:4: ( (lv_elementName_6_0= ruleTag ) )
                    // InternalWebMate.g:496:5: (lv_elementName_6_0= ruleTag )
                    {
                    // InternalWebMate.g:496:5: (lv_elementName_6_0= ruleTag )
                    // InternalWebMate.g:497:6: lv_elementName_6_0= ruleTag
                    {

                    						newCompositeNode(grammarAccess.getElementAccess().getElementNameTagParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_elementName_6_0=ruleTag();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementRule());
                    						}
                    						set(
                    							current,
                    							"elementName",
                    							lv_elementName_6_0,
                    							"org.xtext.example.mydsl.WebMate.Tag");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalWebMate.g:515:3: (otherlv_7= 'elementClass' ( (lv_elementClass_8_0= ruleClass ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalWebMate.g:516:4: otherlv_7= 'elementClass' ( (lv_elementClass_8_0= ruleClass ) )
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_19); 

                    				newLeafNode(otherlv_7, grammarAccess.getElementAccess().getElementClassKeyword_5_0());
                    			
                    // InternalWebMate.g:520:4: ( (lv_elementClass_8_0= ruleClass ) )
                    // InternalWebMate.g:521:5: (lv_elementClass_8_0= ruleClass )
                    {
                    // InternalWebMate.g:521:5: (lv_elementClass_8_0= ruleClass )
                    // InternalWebMate.g:522:6: lv_elementClass_8_0= ruleClass
                    {

                    						newCompositeNode(grammarAccess.getElementAccess().getElementClassClassParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_elementClass_8_0=ruleClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementRule());
                    						}
                    						set(
                    							current,
                    							"elementClass",
                    							lv_elementClass_8_0,
                    							"org.xtext.example.mydsl.WebMate.Class");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalWebMate.g:540:3: (otherlv_9= 'elementID' ( (lv_elementID_10_0= ruleID0 ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalWebMate.g:541:4: otherlv_9= 'elementID' ( (lv_elementID_10_0= ruleID0 ) )
                    {
                    otherlv_9=(Token)match(input,24,FOLLOW_21); 

                    				newLeafNode(otherlv_9, grammarAccess.getElementAccess().getElementIDKeyword_6_0());
                    			
                    // InternalWebMate.g:545:4: ( (lv_elementID_10_0= ruleID0 ) )
                    // InternalWebMate.g:546:5: (lv_elementID_10_0= ruleID0 )
                    {
                    // InternalWebMate.g:546:5: (lv_elementID_10_0= ruleID0 )
                    // InternalWebMate.g:547:6: lv_elementID_10_0= ruleID0
                    {

                    						newCompositeNode(grammarAccess.getElementAccess().getElementIDID0ParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_elementID_10_0=ruleID0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementRule());
                    						}
                    						set(
                    							current,
                    							"elementID",
                    							lv_elementID_10_0,
                    							"org.xtext.example.mydsl.WebMate.ID0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalWebMate.g:565:3: (otherlv_11= 'attributes' otherlv_12= '{' ( (lv_attributes_13_0= ruleAttribute ) ) (otherlv_14= ',' ( (lv_attributes_15_0= ruleAttribute ) ) )* otherlv_16= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalWebMate.g:566:4: otherlv_11= 'attributes' otherlv_12= '{' ( (lv_attributes_13_0= ruleAttribute ) ) (otherlv_14= ',' ( (lv_attributes_15_0= ruleAttribute ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getElementAccess().getAttributesKeyword_7_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_27); 

                    				newLeafNode(otherlv_12, grammarAccess.getElementAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalWebMate.g:574:4: ( (lv_attributes_13_0= ruleAttribute ) )
                    // InternalWebMate.g:575:5: (lv_attributes_13_0= ruleAttribute )
                    {
                    // InternalWebMate.g:575:5: (lv_attributes_13_0= ruleAttribute )
                    // InternalWebMate.g:576:6: lv_attributes_13_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getElementAccess().getAttributesAttributeParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_attributes_13_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_13_0,
                    							"org.xtext.example.mydsl.WebMate.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalWebMate.g:593:4: (otherlv_14= ',' ( (lv_attributes_15_0= ruleAttribute ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalWebMate.g:594:5: otherlv_14= ',' ( (lv_attributes_15_0= ruleAttribute ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FOLLOW_27); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getElementAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalWebMate.g:598:5: ( (lv_attributes_15_0= ruleAttribute ) )
                    	    // InternalWebMate.g:599:6: (lv_attributes_15_0= ruleAttribute )
                    	    {
                    	    // InternalWebMate.g:599:6: (lv_attributes_15_0= ruleAttribute )
                    	    // InternalWebMate.g:600:7: lv_attributes_15_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getElementAccess().getAttributesAttributeParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_attributes_15_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getElementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_15_0,
                    	    								"org.xtext.example.mydsl.WebMate.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_16, grammarAccess.getElementAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getElementAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleSuffix"
    // InternalWebMate.g:631:1: entryRuleSuffix returns [EObject current=null] : iv_ruleSuffix= ruleSuffix EOF ;
    public final EObject entryRuleSuffix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuffix = null;


        try {
            // InternalWebMate.g:631:47: (iv_ruleSuffix= ruleSuffix EOF )
            // InternalWebMate.g:632:2: iv_ruleSuffix= ruleSuffix EOF
            {
             newCompositeNode(grammarAccess.getSuffixRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSuffix=ruleSuffix();

            state._fsp--;

             current =iv_ruleSuffix; 
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
    // $ANTLR end "entryRuleSuffix"


    // $ANTLR start "ruleSuffix"
    // InternalWebMate.g:638:1: ruleSuffix returns [EObject current=null] : ( () otherlv_1= 'Suffix' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? (otherlv_5= 'elementName' ( (lv_elementName_6_0= ruleTag ) ) )? (otherlv_7= 'elementClass' ( (lv_elementClass_8_0= ruleClass ) ) )? (otherlv_9= 'elementID' ( (lv_elementID_10_0= ruleID0 ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleSuffix() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_text_4_0 = null;

        EObject lv_elementName_6_0 = null;

        EObject lv_elementClass_8_0 = null;

        EObject lv_elementID_10_0 = null;



        	enterRule();

        try {
            // InternalWebMate.g:644:2: ( ( () otherlv_1= 'Suffix' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? (otherlv_5= 'elementName' ( (lv_elementName_6_0= ruleTag ) ) )? (otherlv_7= 'elementClass' ( (lv_elementClass_8_0= ruleClass ) ) )? (otherlv_9= 'elementID' ( (lv_elementID_10_0= ruleID0 ) ) )? otherlv_11= '}' ) )
            // InternalWebMate.g:645:2: ( () otherlv_1= 'Suffix' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? (otherlv_5= 'elementName' ( (lv_elementName_6_0= ruleTag ) ) )? (otherlv_7= 'elementClass' ( (lv_elementClass_8_0= ruleClass ) ) )? (otherlv_9= 'elementID' ( (lv_elementID_10_0= ruleID0 ) ) )? otherlv_11= '}' )
            {
            // InternalWebMate.g:645:2: ( () otherlv_1= 'Suffix' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? (otherlv_5= 'elementName' ( (lv_elementName_6_0= ruleTag ) ) )? (otherlv_7= 'elementClass' ( (lv_elementClass_8_0= ruleClass ) ) )? (otherlv_9= 'elementID' ( (lv_elementID_10_0= ruleID0 ) ) )? otherlv_11= '}' )
            // InternalWebMate.g:646:3: () otherlv_1= 'Suffix' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? (otherlv_5= 'elementName' ( (lv_elementName_6_0= ruleTag ) ) )? (otherlv_7= 'elementClass' ( (lv_elementClass_8_0= ruleClass ) ) )? (otherlv_9= 'elementID' ( (lv_elementID_10_0= ruleID0 ) ) )? otherlv_11= '}'
            {
            // InternalWebMate.g:646:3: ()
            // InternalWebMate.g:647:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSuffixAccess().getSuffixAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSuffixAccess().getSuffixKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getSuffixAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWebMate.g:661:3: (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalWebMate.g:662:4: otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_29); 

                    				newLeafNode(otherlv_3, grammarAccess.getSuffixAccess().getTextKeyword_3_0());
                    			
                    // InternalWebMate.g:666:4: ( (lv_text_4_0= ruleEString ) )
                    // InternalWebMate.g:667:5: (lv_text_4_0= ruleEString )
                    {
                    // InternalWebMate.g:667:5: (lv_text_4_0= ruleEString )
                    // InternalWebMate.g:668:6: lv_text_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSuffixAccess().getTextEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_text_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSuffixRule());
                    						}
                    						set(
                    							current,
                    							"text",
                    							lv_text_4_0,
                    							"org.xtext.example.mydsl.WebMate.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalWebMate.g:686:3: (otherlv_5= 'elementName' ( (lv_elementName_6_0= ruleTag ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalWebMate.g:687:4: otherlv_5= 'elementName' ( (lv_elementName_6_0= ruleTag ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getSuffixAccess().getElementNameKeyword_4_0());
                    			
                    // InternalWebMate.g:691:4: ( (lv_elementName_6_0= ruleTag ) )
                    // InternalWebMate.g:692:5: (lv_elementName_6_0= ruleTag )
                    {
                    // InternalWebMate.g:692:5: (lv_elementName_6_0= ruleTag )
                    // InternalWebMate.g:693:6: lv_elementName_6_0= ruleTag
                    {

                    						newCompositeNode(grammarAccess.getSuffixAccess().getElementNameTagParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_elementName_6_0=ruleTag();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSuffixRule());
                    						}
                    						set(
                    							current,
                    							"elementName",
                    							lv_elementName_6_0,
                    							"org.xtext.example.mydsl.WebMate.Tag");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalWebMate.g:711:3: (otherlv_7= 'elementClass' ( (lv_elementClass_8_0= ruleClass ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalWebMate.g:712:4: otherlv_7= 'elementClass' ( (lv_elementClass_8_0= ruleClass ) )
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_19); 

                    				newLeafNode(otherlv_7, grammarAccess.getSuffixAccess().getElementClassKeyword_5_0());
                    			
                    // InternalWebMate.g:716:4: ( (lv_elementClass_8_0= ruleClass ) )
                    // InternalWebMate.g:717:5: (lv_elementClass_8_0= ruleClass )
                    {
                    // InternalWebMate.g:717:5: (lv_elementClass_8_0= ruleClass )
                    // InternalWebMate.g:718:6: lv_elementClass_8_0= ruleClass
                    {

                    						newCompositeNode(grammarAccess.getSuffixAccess().getElementClassClassParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_elementClass_8_0=ruleClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSuffixRule());
                    						}
                    						set(
                    							current,
                    							"elementClass",
                    							lv_elementClass_8_0,
                    							"org.xtext.example.mydsl.WebMate.Class");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalWebMate.g:736:3: (otherlv_9= 'elementID' ( (lv_elementID_10_0= ruleID0 ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalWebMate.g:737:4: otherlv_9= 'elementID' ( (lv_elementID_10_0= ruleID0 ) )
                    {
                    otherlv_9=(Token)match(input,24,FOLLOW_21); 

                    				newLeafNode(otherlv_9, grammarAccess.getSuffixAccess().getElementIDKeyword_6_0());
                    			
                    // InternalWebMate.g:741:4: ( (lv_elementID_10_0= ruleID0 ) )
                    // InternalWebMate.g:742:5: (lv_elementID_10_0= ruleID0 )
                    {
                    // InternalWebMate.g:742:5: (lv_elementID_10_0= ruleID0 )
                    // InternalWebMate.g:743:6: lv_elementID_10_0= ruleID0
                    {

                    						newCompositeNode(grammarAccess.getSuffixAccess().getElementIDID0ParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_elementID_10_0=ruleID0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSuffixRule());
                    						}
                    						set(
                    							current,
                    							"elementID",
                    							lv_elementID_10_0,
                    							"org.xtext.example.mydsl.WebMate.ID0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSuffixAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleSuffix"


    // $ANTLR start "entryRuleEInt"
    // InternalWebMate.g:769:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalWebMate.g:769:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalWebMate.g:770:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalWebMate.g:776:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalWebMate.g:782:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalWebMate.g:783:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalWebMate.g:783:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalWebMate.g:784:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalWebMate.g:784:3: (kw= '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalWebMate.g:785:4: kw= '-'
                    {
                    kw=(Token)match(input,29,FOLLOW_30); 

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


    // $ANTLR start "entryRuleTag"
    // InternalWebMate.g:802:1: entryRuleTag returns [EObject current=null] : iv_ruleTag= ruleTag EOF ;
    public final EObject entryRuleTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTag = null;


        try {
            // InternalWebMate.g:802:44: (iv_ruleTag= ruleTag EOF )
            // InternalWebMate.g:803:2: iv_ruleTag= ruleTag EOF
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
    // InternalWebMate.g:809:1: ruleTag returns [EObject current=null] : ( () otherlv_1= 'Tag' otherlv_2= '{' (otherlv_3= 'tagName' ( (lv_tagName_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_tagName_4_0 = null;



        	enterRule();

        try {
            // InternalWebMate.g:815:2: ( ( () otherlv_1= 'Tag' otherlv_2= '{' (otherlv_3= 'tagName' ( (lv_tagName_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalWebMate.g:816:2: ( () otherlv_1= 'Tag' otherlv_2= '{' (otherlv_3= 'tagName' ( (lv_tagName_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalWebMate.g:816:2: ( () otherlv_1= 'Tag' otherlv_2= '{' (otherlv_3= 'tagName' ( (lv_tagName_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalWebMate.g:817:3: () otherlv_1= 'Tag' otherlv_2= '{' (otherlv_3= 'tagName' ( (lv_tagName_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalWebMate.g:817:3: ()
            // InternalWebMate.g:818:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTagAccess().getTagAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTagAccess().getTagKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getTagAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWebMate.g:832:3: (otherlv_3= 'tagName' ( (lv_tagName_4_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalWebMate.g:833:4: otherlv_3= 'tagName' ( (lv_tagName_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_29); 

                    				newLeafNode(otherlv_3, grammarAccess.getTagAccess().getTagNameKeyword_3_0());
                    			
                    // InternalWebMate.g:837:4: ( (lv_tagName_4_0= ruleEString ) )
                    // InternalWebMate.g:838:5: (lv_tagName_4_0= ruleEString )
                    {
                    // InternalWebMate.g:838:5: (lv_tagName_4_0= ruleEString )
                    // InternalWebMate.g:839:6: lv_tagName_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTagAccess().getTagNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_tagName_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTagRule());
                    						}
                    						set(
                    							current,
                    							"tagName",
                    							lv_tagName_4_0,
                    							"org.xtext.example.mydsl.WebMate.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTagAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalWebMate.g:865:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalWebMate.g:865:46: (iv_ruleClass= ruleClass EOF )
            // InternalWebMate.g:866:2: iv_ruleClass= ruleClass EOF
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
    // InternalWebMate.g:872:1: ruleClass returns [EObject current=null] : ( () otherlv_1= 'Class' otherlv_2= '{' (otherlv_3= 'className' ( (lv_className_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_className_4_0 = null;



        	enterRule();

        try {
            // InternalWebMate.g:878:2: ( ( () otherlv_1= 'Class' otherlv_2= '{' (otherlv_3= 'className' ( (lv_className_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalWebMate.g:879:2: ( () otherlv_1= 'Class' otherlv_2= '{' (otherlv_3= 'className' ( (lv_className_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalWebMate.g:879:2: ( () otherlv_1= 'Class' otherlv_2= '{' (otherlv_3= 'className' ( (lv_className_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalWebMate.g:880:3: () otherlv_1= 'Class' otherlv_2= '{' (otherlv_3= 'className' ( (lv_className_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalWebMate.g:880:3: ()
            // InternalWebMate.g:881:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClassAccess().getClassAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWebMate.g:895:3: (otherlv_3= 'className' ( (lv_className_4_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalWebMate.g:896:4: otherlv_3= 'className' ( (lv_className_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_29); 

                    				newLeafNode(otherlv_3, grammarAccess.getClassAccess().getClassNameKeyword_3_0());
                    			
                    // InternalWebMate.g:900:4: ( (lv_className_4_0= ruleEString ) )
                    // InternalWebMate.g:901:5: (lv_className_4_0= ruleEString )
                    {
                    // InternalWebMate.g:901:5: (lv_className_4_0= ruleEString )
                    // InternalWebMate.g:902:6: lv_className_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getClassNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_className_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassRule());
                    						}
                    						set(
                    							current,
                    							"className",
                    							lv_className_4_0,
                    							"org.xtext.example.mydsl.WebMate.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleID0"
    // InternalWebMate.g:928:1: entryRuleID0 returns [EObject current=null] : iv_ruleID0= ruleID0 EOF ;
    public final EObject entryRuleID0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleID0 = null;


        try {
            // InternalWebMate.g:928:44: (iv_ruleID0= ruleID0 EOF )
            // InternalWebMate.g:929:2: iv_ruleID0= ruleID0 EOF
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
    // InternalWebMate.g:935:1: ruleID0 returns [EObject current=null] : ( () otherlv_1= 'ID' otherlv_2= '{' (otherlv_3= 'idName' ( (lv_idName_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleID0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_idName_4_0 = null;



        	enterRule();

        try {
            // InternalWebMate.g:941:2: ( ( () otherlv_1= 'ID' otherlv_2= '{' (otherlv_3= 'idName' ( (lv_idName_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalWebMate.g:942:2: ( () otherlv_1= 'ID' otherlv_2= '{' (otherlv_3= 'idName' ( (lv_idName_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalWebMate.g:942:2: ( () otherlv_1= 'ID' otherlv_2= '{' (otherlv_3= 'idName' ( (lv_idName_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalWebMate.g:943:3: () otherlv_1= 'ID' otherlv_2= '{' (otherlv_3= 'idName' ( (lv_idName_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalWebMate.g:943:3: ()
            // InternalWebMate.g:944:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getID0Access().getIDAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getID0Access().getIDKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getID0Access().getLeftCurlyBracketKeyword_2());
            		
            // InternalWebMate.g:958:3: (otherlv_3= 'idName' ( (lv_idName_4_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalWebMate.g:959:4: otherlv_3= 'idName' ( (lv_idName_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_29); 

                    				newLeafNode(otherlv_3, grammarAccess.getID0Access().getIdNameKeyword_3_0());
                    			
                    // InternalWebMate.g:963:4: ( (lv_idName_4_0= ruleEString ) )
                    // InternalWebMate.g:964:5: (lv_idName_4_0= ruleEString )
                    {
                    // InternalWebMate.g:964:5: (lv_idName_4_0= ruleEString )
                    // InternalWebMate.g:965:6: lv_idName_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getID0Access().getIdNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_idName_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getID0Rule());
                    						}
                    						set(
                    							current,
                    							"idName",
                    							lv_idName_4_0,
                    							"org.xtext.example.mydsl.WebMate.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getID0Access().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleEString"
    // InternalWebMate.g:991:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalWebMate.g:991:47: (iv_ruleEString= ruleEString EOF )
            // InternalWebMate.g:992:2: iv_ruleEString= ruleEString EOF
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
    // InternalWebMate.g:998:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalWebMate.g:1004:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalWebMate.g:1005:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalWebMate.g:1005:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_ID) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalWebMate.g:1006:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalWebMate.g:1014:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleAttribute"
    // InternalWebMate.g:1025:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalWebMate.g:1025:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalWebMate.g:1026:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalWebMate.g:1032:1: ruleAttribute returns [EObject current=null] : ( () otherlv_1= 'Attribute' otherlv_2= '{' (otherlv_3= 'attributeName' ( (lv_attributeName_4_0= ruleEString ) ) )? (otherlv_5= 'attributeValue' ( (lv_attributeValue_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_attributeName_4_0 = null;

        AntlrDatatypeRuleToken lv_attributeValue_6_0 = null;



        	enterRule();

        try {
            // InternalWebMate.g:1038:2: ( ( () otherlv_1= 'Attribute' otherlv_2= '{' (otherlv_3= 'attributeName' ( (lv_attributeName_4_0= ruleEString ) ) )? (otherlv_5= 'attributeValue' ( (lv_attributeValue_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalWebMate.g:1039:2: ( () otherlv_1= 'Attribute' otherlv_2= '{' (otherlv_3= 'attributeName' ( (lv_attributeName_4_0= ruleEString ) ) )? (otherlv_5= 'attributeValue' ( (lv_attributeValue_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalWebMate.g:1039:2: ( () otherlv_1= 'Attribute' otherlv_2= '{' (otherlv_3= 'attributeName' ( (lv_attributeName_4_0= ruleEString ) ) )? (otherlv_5= 'attributeValue' ( (lv_attributeValue_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalWebMate.g:1040:3: () otherlv_1= 'Attribute' otherlv_2= '{' (otherlv_3= 'attributeName' ( (lv_attributeName_4_0= ruleEString ) ) )? (otherlv_5= 'attributeValue' ( (lv_attributeValue_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalWebMate.g:1040:3: ()
            // InternalWebMate.g:1041:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeAccess().getAttributeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getAttributeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWebMate.g:1055:3: (otherlv_3= 'attributeName' ( (lv_attributeName_4_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==37) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalWebMate.g:1056:4: otherlv_3= 'attributeName' ( (lv_attributeName_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_29); 

                    				newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getAttributeNameKeyword_3_0());
                    			
                    // InternalWebMate.g:1060:4: ( (lv_attributeName_4_0= ruleEString ) )
                    // InternalWebMate.g:1061:5: (lv_attributeName_4_0= ruleEString )
                    {
                    // InternalWebMate.g:1061:5: (lv_attributeName_4_0= ruleEString )
                    // InternalWebMate.g:1062:6: lv_attributeName_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getAttributeNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_attributeName_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"attributeName",
                    							lv_attributeName_4_0,
                    							"org.xtext.example.mydsl.WebMate.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalWebMate.g:1080:3: (otherlv_5= 'attributeValue' ( (lv_attributeValue_6_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalWebMate.g:1081:4: otherlv_5= 'attributeValue' ( (lv_attributeValue_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,38,FOLLOW_29); 

                    				newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getAttributeValueKeyword_4_0());
                    			
                    // InternalWebMate.g:1085:4: ( (lv_attributeValue_6_0= ruleEString ) )
                    // InternalWebMate.g:1086:5: (lv_attributeValue_6_0= ruleEString )
                    {
                    // InternalWebMate.g:1086:5: (lv_attributeValue_6_0= ruleEString )
                    // InternalWebMate.g:1087:6: lv_attributeValue_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getAttributeValueEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_attributeValue_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"attributeValue",
                    							lv_attributeValue_6_0,
                    							"org.xtext.example.mydsl.WebMate.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5());
            		

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000E8000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C8000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001E08000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001C08000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001808000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000005E08000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000005C08000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000005808000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000005008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000011C08000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800008000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000006000008000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000008000L});

}