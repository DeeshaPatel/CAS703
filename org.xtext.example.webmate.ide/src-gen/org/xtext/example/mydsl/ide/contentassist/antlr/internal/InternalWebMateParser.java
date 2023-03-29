package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.WebMateGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWebMateParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'plus'", "'multiply'", "'dot'", "'hash'", "'greaterthan'", "'caret'", "'div'", "'h1'", "'p'", "'ul'", "'li'", "'#'", "'.'", "'('", "')'", "'>'", "'*'", "'+'", "'['", "']'", "'='"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_INT=5;
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

    	public void setGrammarAccess(WebMateGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleHTML"
    // InternalWebMate.g:53:1: entryRuleHTML : ruleHTML EOF ;
    public final void entryRuleHTML() throws RecognitionException {
        try {
            // InternalWebMate.g:54:1: ( ruleHTML EOF )
            // InternalWebMate.g:55:1: ruleHTML EOF
            {
             before(grammarAccess.getHTMLRule()); 
            pushFollow(FOLLOW_1);
            ruleHTML();

            state._fsp--;

             after(grammarAccess.getHTMLRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHTML"


    // $ANTLR start "ruleHTML"
    // InternalWebMate.g:62:1: ruleHTML : ( ( rule__HTML__Group__0 ) ) ;
    public final void ruleHTML() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:66:2: ( ( ( rule__HTML__Group__0 ) ) )
            // InternalWebMate.g:67:2: ( ( rule__HTML__Group__0 ) )
            {
            // InternalWebMate.g:67:2: ( ( rule__HTML__Group__0 ) )
            // InternalWebMate.g:68:3: ( rule__HTML__Group__0 )
            {
             before(grammarAccess.getHTMLAccess().getGroup()); 
            // InternalWebMate.g:69:3: ( rule__HTML__Group__0 )
            // InternalWebMate.g:69:4: rule__HTML__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HTML__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHTMLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHTML"


    // $ANTLR start "entryRuleAbbreviation"
    // InternalWebMate.g:78:1: entryRuleAbbreviation : ruleAbbreviation EOF ;
    public final void entryRuleAbbreviation() throws RecognitionException {
        try {
            // InternalWebMate.g:79:1: ( ruleAbbreviation EOF )
            // InternalWebMate.g:80:1: ruleAbbreviation EOF
            {
             before(grammarAccess.getAbbreviationRule()); 
            pushFollow(FOLLOW_1);
            ruleAbbreviation();

            state._fsp--;

             after(grammarAccess.getAbbreviationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbbreviation"


    // $ANTLR start "ruleAbbreviation"
    // InternalWebMate.g:87:1: ruleAbbreviation : ( ( rule__Abbreviation__Group__0 ) ) ;
    public final void ruleAbbreviation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:91:2: ( ( ( rule__Abbreviation__Group__0 ) ) )
            // InternalWebMate.g:92:2: ( ( rule__Abbreviation__Group__0 ) )
            {
            // InternalWebMate.g:92:2: ( ( rule__Abbreviation__Group__0 ) )
            // InternalWebMate.g:93:3: ( rule__Abbreviation__Group__0 )
            {
             before(grammarAccess.getAbbreviationAccess().getGroup()); 
            // InternalWebMate.g:94:3: ( rule__Abbreviation__Group__0 )
            // InternalWebMate.g:94:4: rule__Abbreviation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Abbreviation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAbbreviationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbbreviation"


    // $ANTLR start "entryRuleID0"
    // InternalWebMate.g:103:1: entryRuleID0 : ruleID0 EOF ;
    public final void entryRuleID0() throws RecognitionException {
        try {
            // InternalWebMate.g:104:1: ( ruleID0 EOF )
            // InternalWebMate.g:105:1: ruleID0 EOF
            {
             before(grammarAccess.getID0Rule()); 
            pushFollow(FOLLOW_1);
            ruleID0();

            state._fsp--;

             after(grammarAccess.getID0Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleID0"


    // $ANTLR start "ruleID0"
    // InternalWebMate.g:112:1: ruleID0 : ( ( rule__ID0__Group__0 ) ) ;
    public final void ruleID0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:116:2: ( ( ( rule__ID0__Group__0 ) ) )
            // InternalWebMate.g:117:2: ( ( rule__ID0__Group__0 ) )
            {
            // InternalWebMate.g:117:2: ( ( rule__ID0__Group__0 ) )
            // InternalWebMate.g:118:3: ( rule__ID0__Group__0 )
            {
             before(grammarAccess.getID0Access().getGroup()); 
            // InternalWebMate.g:119:3: ( rule__ID0__Group__0 )
            // InternalWebMate.g:119:4: rule__ID0__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ID0__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getID0Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleID0"


    // $ANTLR start "entryRuleSymbol"
    // InternalWebMate.g:128:1: entryRuleSymbol : ruleSymbol EOF ;
    public final void entryRuleSymbol() throws RecognitionException {
        try {
            // InternalWebMate.g:129:1: ( ruleSymbol EOF )
            // InternalWebMate.g:130:1: ruleSymbol EOF
            {
             before(grammarAccess.getSymbolRule()); 
            pushFollow(FOLLOW_1);
            ruleSymbol();

            state._fsp--;

             after(grammarAccess.getSymbolRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSymbol"


    // $ANTLR start "ruleSymbol"
    // InternalWebMate.g:137:1: ruleSymbol : ( ( rule__Symbol__Group__0 ) ) ;
    public final void ruleSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:141:2: ( ( ( rule__Symbol__Group__0 ) ) )
            // InternalWebMate.g:142:2: ( ( rule__Symbol__Group__0 ) )
            {
            // InternalWebMate.g:142:2: ( ( rule__Symbol__Group__0 ) )
            // InternalWebMate.g:143:3: ( rule__Symbol__Group__0 )
            {
             before(grammarAccess.getSymbolAccess().getGroup()); 
            // InternalWebMate.g:144:3: ( rule__Symbol__Group__0 )
            // InternalWebMate.g:144:4: rule__Symbol__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Symbol__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSymbolAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSymbol"


    // $ANTLR start "entryRuleTag"
    // InternalWebMate.g:153:1: entryRuleTag : ruleTag EOF ;
    public final void entryRuleTag() throws RecognitionException {
        try {
            // InternalWebMate.g:154:1: ( ruleTag EOF )
            // InternalWebMate.g:155:1: ruleTag EOF
            {
             before(grammarAccess.getTagRule()); 
            pushFollow(FOLLOW_1);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getTagRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // InternalWebMate.g:162:1: ruleTag : ( ( rule__Tag__Group__0 ) ) ;
    public final void ruleTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:166:2: ( ( ( rule__Tag__Group__0 ) ) )
            // InternalWebMate.g:167:2: ( ( rule__Tag__Group__0 ) )
            {
            // InternalWebMate.g:167:2: ( ( rule__Tag__Group__0 ) )
            // InternalWebMate.g:168:3: ( rule__Tag__Group__0 )
            {
             before(grammarAccess.getTagAccess().getGroup()); 
            // InternalWebMate.g:169:3: ( rule__Tag__Group__0 )
            // InternalWebMate.g:169:4: rule__Tag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRuleClass"
    // InternalWebMate.g:178:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalWebMate.g:179:1: ( ruleClass EOF )
            // InternalWebMate.g:180:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalWebMate.g:187:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:191:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalWebMate.g:192:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalWebMate.g:192:2: ( ( rule__Class__Group__0 ) )
            // InternalWebMate.g:193:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalWebMate.g:194:3: ( rule__Class__Group__0 )
            // InternalWebMate.g:194:4: rule__Class__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleGroup"
    // InternalWebMate.g:203:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // InternalWebMate.g:204:1: ( ruleGroup EOF )
            // InternalWebMate.g:205:1: ruleGroup EOF
            {
             before(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_1);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getGroupRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // InternalWebMate.g:212:1: ruleGroup : ( ( rule__Group__Alternatives ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:216:2: ( ( ( rule__Group__Alternatives ) ) )
            // InternalWebMate.g:217:2: ( ( rule__Group__Alternatives ) )
            {
            // InternalWebMate.g:217:2: ( ( rule__Group__Alternatives ) )
            // InternalWebMate.g:218:3: ( rule__Group__Alternatives )
            {
             before(grammarAccess.getGroupAccess().getAlternatives()); 
            // InternalWebMate.g:219:3: ( rule__Group__Alternatives )
            // InternalWebMate.g:219:4: rule__Group__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Group__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleAttribute"
    // InternalWebMate.g:228:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalWebMate.g:229:1: ( ruleAttribute EOF )
            // InternalWebMate.g:230:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalWebMate.g:237:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:241:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalWebMate.g:242:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalWebMate.g:242:2: ( ( rule__Attribute__Group__0 ) )
            // InternalWebMate.g:243:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalWebMate.g:244:3: ( rule__Attribute__Group__0 )
            // InternalWebMate.g:244:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleEString"
    // InternalWebMate.g:253:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalWebMate.g:254:1: ( ruleEString EOF )
            // InternalWebMate.g:255:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalWebMate.g:262:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:266:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalWebMate.g:267:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalWebMate.g:267:2: ( ( rule__EString__Alternatives ) )
            // InternalWebMate.g:268:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalWebMate.g:269:3: ( rule__EString__Alternatives )
            // InternalWebMate.g:269:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "ruleValidSymbol"
    // InternalWebMate.g:278:1: ruleValidSymbol : ( ( rule__ValidSymbol__Alternatives ) ) ;
    public final void ruleValidSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:282:1: ( ( ( rule__ValidSymbol__Alternatives ) ) )
            // InternalWebMate.g:283:2: ( ( rule__ValidSymbol__Alternatives ) )
            {
            // InternalWebMate.g:283:2: ( ( rule__ValidSymbol__Alternatives ) )
            // InternalWebMate.g:284:3: ( rule__ValidSymbol__Alternatives )
            {
             before(grammarAccess.getValidSymbolAccess().getAlternatives()); 
            // InternalWebMate.g:285:3: ( rule__ValidSymbol__Alternatives )
            // InternalWebMate.g:285:4: rule__ValidSymbol__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ValidSymbol__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValidSymbolAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValidSymbol"


    // $ANTLR start "ruleHTMLTag"
    // InternalWebMate.g:294:1: ruleHTMLTag : ( ( rule__HTMLTag__Alternatives ) ) ;
    public final void ruleHTMLTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:298:1: ( ( ( rule__HTMLTag__Alternatives ) ) )
            // InternalWebMate.g:299:2: ( ( rule__HTMLTag__Alternatives ) )
            {
            // InternalWebMate.g:299:2: ( ( rule__HTMLTag__Alternatives ) )
            // InternalWebMate.g:300:3: ( rule__HTMLTag__Alternatives )
            {
             before(grammarAccess.getHTMLTagAccess().getAlternatives()); 
            // InternalWebMate.g:301:3: ( rule__HTMLTag__Alternatives )
            // InternalWebMate.g:301:4: rule__HTMLTag__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__HTMLTag__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHTMLTagAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHTMLTag"


    // $ANTLR start "rule__Group__Alternatives"
    // InternalWebMate.g:309:1: rule__Group__Alternatives : ( ( ( rule__Group__Group_0__0 ) ) | ( ( rule__Group__Group_1__0 ) ) | ( ( rule__Group__Group_2__0 ) ) );
    public final void rule__Group__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:313:1: ( ( ( rule__Group__Group_0__0 ) ) | ( ( rule__Group__Group_1__0 ) ) | ( ( rule__Group__Group_2__0 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt1=1;
                }
                break;
            case 27:
                {
                alt1=2;
                }
                break;
            case 28:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalWebMate.g:314:2: ( ( rule__Group__Group_0__0 ) )
                    {
                    // InternalWebMate.g:314:2: ( ( rule__Group__Group_0__0 ) )
                    // InternalWebMate.g:315:3: ( rule__Group__Group_0__0 )
                    {
                     before(grammarAccess.getGroupAccess().getGroup_0()); 
                    // InternalWebMate.g:316:3: ( rule__Group__Group_0__0 )
                    // InternalWebMate.g:316:4: rule__Group__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Group__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGroupAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebMate.g:320:2: ( ( rule__Group__Group_1__0 ) )
                    {
                    // InternalWebMate.g:320:2: ( ( rule__Group__Group_1__0 ) )
                    // InternalWebMate.g:321:3: ( rule__Group__Group_1__0 )
                    {
                     before(grammarAccess.getGroupAccess().getGroup_1()); 
                    // InternalWebMate.g:322:3: ( rule__Group__Group_1__0 )
                    // InternalWebMate.g:322:4: rule__Group__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Group__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGroupAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWebMate.g:326:2: ( ( rule__Group__Group_2__0 ) )
                    {
                    // InternalWebMate.g:326:2: ( ( rule__Group__Group_2__0 ) )
                    // InternalWebMate.g:327:3: ( rule__Group__Group_2__0 )
                    {
                     before(grammarAccess.getGroupAccess().getGroup_2()); 
                    // InternalWebMate.g:328:3: ( rule__Group__Group_2__0 )
                    // InternalWebMate.g:328:4: rule__Group__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Group__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGroupAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalWebMate.g:336:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_INT ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:340:1: ( ( RULE_STRING ) | ( RULE_INT ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_INT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalWebMate.g:341:2: ( RULE_STRING )
                    {
                    // InternalWebMate.g:341:2: ( RULE_STRING )
                    // InternalWebMate.g:342:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebMate.g:347:2: ( RULE_INT )
                    {
                    // InternalWebMate.g:347:2: ( RULE_INT )
                    // InternalWebMate.g:348:3: RULE_INT
                    {
                     before(grammarAccess.getEStringAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getINTTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__ValidSymbol__Alternatives"
    // InternalWebMate.g:357:1: rule__ValidSymbol__Alternatives : ( ( ( 'plus' ) ) | ( ( 'multiply' ) ) | ( ( 'dot' ) ) | ( ( 'hash' ) ) | ( ( 'greaterthan' ) ) | ( ( 'caret' ) ) );
    public final void rule__ValidSymbol__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:361:1: ( ( ( 'plus' ) ) | ( ( 'multiply' ) ) | ( ( 'dot' ) ) | ( ( 'hash' ) ) | ( ( 'greaterthan' ) ) | ( ( 'caret' ) ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalWebMate.g:362:2: ( ( 'plus' ) )
                    {
                    // InternalWebMate.g:362:2: ( ( 'plus' ) )
                    // InternalWebMate.g:363:3: ( 'plus' )
                    {
                     before(grammarAccess.getValidSymbolAccess().getPlusEnumLiteralDeclaration_0()); 
                    // InternalWebMate.g:364:3: ( 'plus' )
                    // InternalWebMate.g:364:4: 'plus'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getValidSymbolAccess().getPlusEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebMate.g:368:2: ( ( 'multiply' ) )
                    {
                    // InternalWebMate.g:368:2: ( ( 'multiply' ) )
                    // InternalWebMate.g:369:3: ( 'multiply' )
                    {
                     before(grammarAccess.getValidSymbolAccess().getMultiplyEnumLiteralDeclaration_1()); 
                    // InternalWebMate.g:370:3: ( 'multiply' )
                    // InternalWebMate.g:370:4: 'multiply'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getValidSymbolAccess().getMultiplyEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWebMate.g:374:2: ( ( 'dot' ) )
                    {
                    // InternalWebMate.g:374:2: ( ( 'dot' ) )
                    // InternalWebMate.g:375:3: ( 'dot' )
                    {
                     before(grammarAccess.getValidSymbolAccess().getDotEnumLiteralDeclaration_2()); 
                    // InternalWebMate.g:376:3: ( 'dot' )
                    // InternalWebMate.g:376:4: 'dot'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getValidSymbolAccess().getDotEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalWebMate.g:380:2: ( ( 'hash' ) )
                    {
                    // InternalWebMate.g:380:2: ( ( 'hash' ) )
                    // InternalWebMate.g:381:3: ( 'hash' )
                    {
                     before(grammarAccess.getValidSymbolAccess().getHashEnumLiteralDeclaration_3()); 
                    // InternalWebMate.g:382:3: ( 'hash' )
                    // InternalWebMate.g:382:4: 'hash'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getValidSymbolAccess().getHashEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalWebMate.g:386:2: ( ( 'greaterthan' ) )
                    {
                    // InternalWebMate.g:386:2: ( ( 'greaterthan' ) )
                    // InternalWebMate.g:387:3: ( 'greaterthan' )
                    {
                     before(grammarAccess.getValidSymbolAccess().getGreaterthanEnumLiteralDeclaration_4()); 
                    // InternalWebMate.g:388:3: ( 'greaterthan' )
                    // InternalWebMate.g:388:4: 'greaterthan'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getValidSymbolAccess().getGreaterthanEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalWebMate.g:392:2: ( ( 'caret' ) )
                    {
                    // InternalWebMate.g:392:2: ( ( 'caret' ) )
                    // InternalWebMate.g:393:3: ( 'caret' )
                    {
                     before(grammarAccess.getValidSymbolAccess().getCaretEnumLiteralDeclaration_5()); 
                    // InternalWebMate.g:394:3: ( 'caret' )
                    // InternalWebMate.g:394:4: 'caret'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getValidSymbolAccess().getCaretEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidSymbol__Alternatives"


    // $ANTLR start "rule__HTMLTag__Alternatives"
    // InternalWebMate.g:402:1: rule__HTMLTag__Alternatives : ( ( ( 'div' ) ) | ( ( 'h1' ) ) | ( ( 'p' ) ) | ( ( 'ul' ) ) | ( ( 'li' ) ) );
    public final void rule__HTMLTag__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:406:1: ( ( ( 'div' ) ) | ( ( 'h1' ) ) | ( ( 'p' ) ) | ( ( 'ul' ) ) | ( ( 'li' ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            case 20:
                {
                alt4=4;
                }
                break;
            case 21:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalWebMate.g:407:2: ( ( 'div' ) )
                    {
                    // InternalWebMate.g:407:2: ( ( 'div' ) )
                    // InternalWebMate.g:408:3: ( 'div' )
                    {
                     before(grammarAccess.getHTMLTagAccess().getDivEnumLiteralDeclaration_0()); 
                    // InternalWebMate.g:409:3: ( 'div' )
                    // InternalWebMate.g:409:4: 'div'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getHTMLTagAccess().getDivEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebMate.g:413:2: ( ( 'h1' ) )
                    {
                    // InternalWebMate.g:413:2: ( ( 'h1' ) )
                    // InternalWebMate.g:414:3: ( 'h1' )
                    {
                     before(grammarAccess.getHTMLTagAccess().getH1EnumLiteralDeclaration_1()); 
                    // InternalWebMate.g:415:3: ( 'h1' )
                    // InternalWebMate.g:415:4: 'h1'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getHTMLTagAccess().getH1EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWebMate.g:419:2: ( ( 'p' ) )
                    {
                    // InternalWebMate.g:419:2: ( ( 'p' ) )
                    // InternalWebMate.g:420:3: ( 'p' )
                    {
                     before(grammarAccess.getHTMLTagAccess().getPEnumLiteralDeclaration_2()); 
                    // InternalWebMate.g:421:3: ( 'p' )
                    // InternalWebMate.g:421:4: 'p'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getHTMLTagAccess().getPEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalWebMate.g:425:2: ( ( 'ul' ) )
                    {
                    // InternalWebMate.g:425:2: ( ( 'ul' ) )
                    // InternalWebMate.g:426:3: ( 'ul' )
                    {
                     before(grammarAccess.getHTMLTagAccess().getUlEnumLiteralDeclaration_3()); 
                    // InternalWebMate.g:427:3: ( 'ul' )
                    // InternalWebMate.g:427:4: 'ul'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getHTMLTagAccess().getUlEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalWebMate.g:431:2: ( ( 'li' ) )
                    {
                    // InternalWebMate.g:431:2: ( ( 'li' ) )
                    // InternalWebMate.g:432:3: ( 'li' )
                    {
                     before(grammarAccess.getHTMLTagAccess().getLiEnumLiteralDeclaration_4()); 
                    // InternalWebMate.g:433:3: ( 'li' )
                    // InternalWebMate.g:433:4: 'li'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getHTMLTagAccess().getLiEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTMLTag__Alternatives"


    // $ANTLR start "rule__HTML__Group__0"
    // InternalWebMate.g:441:1: rule__HTML__Group__0 : rule__HTML__Group__0__Impl rule__HTML__Group__1 ;
    public final void rule__HTML__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:445:1: ( rule__HTML__Group__0__Impl rule__HTML__Group__1 )
            // InternalWebMate.g:446:2: rule__HTML__Group__0__Impl rule__HTML__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__HTML__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HTML__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTML__Group__0"


    // $ANTLR start "rule__HTML__Group__0__Impl"
    // InternalWebMate.g:453:1: rule__HTML__Group__0__Impl : ( () ) ;
    public final void rule__HTML__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:457:1: ( ( () ) )
            // InternalWebMate.g:458:1: ( () )
            {
            // InternalWebMate.g:458:1: ( () )
            // InternalWebMate.g:459:2: ()
            {
             before(grammarAccess.getHTMLAccess().getHTMLAction_0()); 
            // InternalWebMate.g:460:2: ()
            // InternalWebMate.g:460:3: 
            {
            }

             after(grammarAccess.getHTMLAccess().getHTMLAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTML__Group__0__Impl"


    // $ANTLR start "rule__HTML__Group__1"
    // InternalWebMate.g:468:1: rule__HTML__Group__1 : rule__HTML__Group__1__Impl ;
    public final void rule__HTML__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:472:1: ( rule__HTML__Group__1__Impl )
            // InternalWebMate.g:473:2: rule__HTML__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HTML__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTML__Group__1"


    // $ANTLR start "rule__HTML__Group__1__Impl"
    // InternalWebMate.g:479:1: rule__HTML__Group__1__Impl : ( ( ( rule__HTML__AbbreviationAssignment_1 ) ) ( ( rule__HTML__AbbreviationAssignment_1 )* ) ) ;
    public final void rule__HTML__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:483:1: ( ( ( ( rule__HTML__AbbreviationAssignment_1 ) ) ( ( rule__HTML__AbbreviationAssignment_1 )* ) ) )
            // InternalWebMate.g:484:1: ( ( ( rule__HTML__AbbreviationAssignment_1 ) ) ( ( rule__HTML__AbbreviationAssignment_1 )* ) )
            {
            // InternalWebMate.g:484:1: ( ( ( rule__HTML__AbbreviationAssignment_1 ) ) ( ( rule__HTML__AbbreviationAssignment_1 )* ) )
            // InternalWebMate.g:485:2: ( ( rule__HTML__AbbreviationAssignment_1 ) ) ( ( rule__HTML__AbbreviationAssignment_1 )* )
            {
            // InternalWebMate.g:485:2: ( ( rule__HTML__AbbreviationAssignment_1 ) )
            // InternalWebMate.g:486:3: ( rule__HTML__AbbreviationAssignment_1 )
            {
             before(grammarAccess.getHTMLAccess().getAbbreviationAssignment_1()); 
            // InternalWebMate.g:487:3: ( rule__HTML__AbbreviationAssignment_1 )
            // InternalWebMate.g:487:4: rule__HTML__AbbreviationAssignment_1
            {
            pushFollow(FOLLOW_4);
            rule__HTML__AbbreviationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHTMLAccess().getAbbreviationAssignment_1()); 

            }

            // InternalWebMate.g:490:2: ( ( rule__HTML__AbbreviationAssignment_1 )* )
            // InternalWebMate.g:491:3: ( rule__HTML__AbbreviationAssignment_1 )*
            {
             before(grammarAccess.getHTMLAccess().getAbbreviationAssignment_1()); 
            // InternalWebMate.g:492:3: ( rule__HTML__AbbreviationAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_INT)||(LA5_0>=17 && LA5_0<=21)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalWebMate.g:492:4: rule__HTML__AbbreviationAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__HTML__AbbreviationAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getHTMLAccess().getAbbreviationAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTML__Group__1__Impl"


    // $ANTLR start "rule__Abbreviation__Group__0"
    // InternalWebMate.g:502:1: rule__Abbreviation__Group__0 : rule__Abbreviation__Group__0__Impl rule__Abbreviation__Group__1 ;
    public final void rule__Abbreviation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:506:1: ( rule__Abbreviation__Group__0__Impl rule__Abbreviation__Group__1 )
            // InternalWebMate.g:507:2: rule__Abbreviation__Group__0__Impl rule__Abbreviation__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Abbreviation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Abbreviation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abbreviation__Group__0"


    // $ANTLR start "rule__Abbreviation__Group__0__Impl"
    // InternalWebMate.g:514:1: rule__Abbreviation__Group__0__Impl : ( () ) ;
    public final void rule__Abbreviation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:518:1: ( ( () ) )
            // InternalWebMate.g:519:1: ( () )
            {
            // InternalWebMate.g:519:1: ( () )
            // InternalWebMate.g:520:2: ()
            {
             before(grammarAccess.getAbbreviationAccess().getAbbreviationAction_0()); 
            // InternalWebMate.g:521:2: ()
            // InternalWebMate.g:521:3: 
            {
            }

             after(grammarAccess.getAbbreviationAccess().getAbbreviationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abbreviation__Group__0__Impl"


    // $ANTLR start "rule__Abbreviation__Group__1"
    // InternalWebMate.g:529:1: rule__Abbreviation__Group__1 : rule__Abbreviation__Group__1__Impl rule__Abbreviation__Group__2 ;
    public final void rule__Abbreviation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:533:1: ( rule__Abbreviation__Group__1__Impl rule__Abbreviation__Group__2 )
            // InternalWebMate.g:534:2: rule__Abbreviation__Group__1__Impl rule__Abbreviation__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Abbreviation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Abbreviation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abbreviation__Group__1"


    // $ANTLR start "rule__Abbreviation__Group__1__Impl"
    // InternalWebMate.g:541:1: rule__Abbreviation__Group__1__Impl : ( ( rule__Abbreviation__AbbreviationAssignment_1 )* ) ;
    public final void rule__Abbreviation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:545:1: ( ( ( rule__Abbreviation__AbbreviationAssignment_1 )* ) )
            // InternalWebMate.g:546:1: ( ( rule__Abbreviation__AbbreviationAssignment_1 )* )
            {
            // InternalWebMate.g:546:1: ( ( rule__Abbreviation__AbbreviationAssignment_1 )* )
            // InternalWebMate.g:547:2: ( rule__Abbreviation__AbbreviationAssignment_1 )*
            {
             before(grammarAccess.getAbbreviationAccess().getAbbreviationAssignment_1()); 
            // InternalWebMate.g:548:2: ( rule__Abbreviation__AbbreviationAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_INT)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalWebMate.g:548:3: rule__Abbreviation__AbbreviationAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Abbreviation__AbbreviationAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getAbbreviationAccess().getAbbreviationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abbreviation__Group__1__Impl"


    // $ANTLR start "rule__Abbreviation__Group__2"
    // InternalWebMate.g:556:1: rule__Abbreviation__Group__2 : rule__Abbreviation__Group__2__Impl ;
    public final void rule__Abbreviation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:560:1: ( rule__Abbreviation__Group__2__Impl )
            // InternalWebMate.g:561:2: rule__Abbreviation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Abbreviation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abbreviation__Group__2"


    // $ANTLR start "rule__Abbreviation__Group__2__Impl"
    // InternalWebMate.g:567:1: rule__Abbreviation__Group__2__Impl : ( ( rule__Abbreviation__Group_2__0 ) ) ;
    public final void rule__Abbreviation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:571:1: ( ( ( rule__Abbreviation__Group_2__0 ) ) )
            // InternalWebMate.g:572:1: ( ( rule__Abbreviation__Group_2__0 ) )
            {
            // InternalWebMate.g:572:1: ( ( rule__Abbreviation__Group_2__0 ) )
            // InternalWebMate.g:573:2: ( rule__Abbreviation__Group_2__0 )
            {
             before(grammarAccess.getAbbreviationAccess().getGroup_2()); 
            // InternalWebMate.g:574:2: ( rule__Abbreviation__Group_2__0 )
            // InternalWebMate.g:574:3: rule__Abbreviation__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Abbreviation__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getAbbreviationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abbreviation__Group__2__Impl"


    // $ANTLR start "rule__Abbreviation__Group_2__0"
    // InternalWebMate.g:583:1: rule__Abbreviation__Group_2__0 : rule__Abbreviation__Group_2__0__Impl rule__Abbreviation__Group_2__1 ;
    public final void rule__Abbreviation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:587:1: ( rule__Abbreviation__Group_2__0__Impl rule__Abbreviation__Group_2__1 )
            // InternalWebMate.g:588:2: rule__Abbreviation__Group_2__0__Impl rule__Abbreviation__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Abbreviation__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Abbreviation__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abbreviation__Group_2__0"


    // $ANTLR start "rule__Abbreviation__Group_2__0__Impl"
    // InternalWebMate.g:595:1: rule__Abbreviation__Group_2__0__Impl : ( ( rule__Abbreviation__TagsAssignment_2_0 ) ) ;
    public final void rule__Abbreviation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:599:1: ( ( ( rule__Abbreviation__TagsAssignment_2_0 ) ) )
            // InternalWebMate.g:600:1: ( ( rule__Abbreviation__TagsAssignment_2_0 ) )
            {
            // InternalWebMate.g:600:1: ( ( rule__Abbreviation__TagsAssignment_2_0 ) )
            // InternalWebMate.g:601:2: ( rule__Abbreviation__TagsAssignment_2_0 )
            {
             before(grammarAccess.getAbbreviationAccess().getTagsAssignment_2_0()); 
            // InternalWebMate.g:602:2: ( rule__Abbreviation__TagsAssignment_2_0 )
            // InternalWebMate.g:602:3: rule__Abbreviation__TagsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Abbreviation__TagsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAbbreviationAccess().getTagsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abbreviation__Group_2__0__Impl"


    // $ANTLR start "rule__Abbreviation__Group_2__1"
    // InternalWebMate.g:610:1: rule__Abbreviation__Group_2__1 : rule__Abbreviation__Group_2__1__Impl rule__Abbreviation__Group_2__2 ;
    public final void rule__Abbreviation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:614:1: ( rule__Abbreviation__Group_2__1__Impl rule__Abbreviation__Group_2__2 )
            // InternalWebMate.g:615:2: rule__Abbreviation__Group_2__1__Impl rule__Abbreviation__Group_2__2
            {
            pushFollow(FOLLOW_6);
            rule__Abbreviation__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Abbreviation__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abbreviation__Group_2__1"


    // $ANTLR start "rule__Abbreviation__Group_2__1__Impl"
    // InternalWebMate.g:622:1: rule__Abbreviation__Group_2__1__Impl : ( ( rule__Abbreviation__ClassesAssignment_2_1 )? ) ;
    public final void rule__Abbreviation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:626:1: ( ( ( rule__Abbreviation__ClassesAssignment_2_1 )? ) )
            // InternalWebMate.g:627:1: ( ( rule__Abbreviation__ClassesAssignment_2_1 )? )
            {
            // InternalWebMate.g:627:1: ( ( rule__Abbreviation__ClassesAssignment_2_1 )? )
            // InternalWebMate.g:628:2: ( rule__Abbreviation__ClassesAssignment_2_1 )?
            {
             before(grammarAccess.getAbbreviationAccess().getClassesAssignment_2_1()); 
            // InternalWebMate.g:629:2: ( rule__Abbreviation__ClassesAssignment_2_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalWebMate.g:629:3: rule__Abbreviation__ClassesAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Abbreviation__ClassesAssignment_2_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAbbreviationAccess().getClassesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abbreviation__Group_2__1__Impl"


    // $ANTLR start "rule__Abbreviation__Group_2__2"
    // InternalWebMate.g:637:1: rule__Abbreviation__Group_2__2 : rule__Abbreviation__Group_2__2__Impl rule__Abbreviation__Group_2__3 ;
    public final void rule__Abbreviation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:641:1: ( rule__Abbreviation__Group_2__2__Impl rule__Abbreviation__Group_2__3 )
            // InternalWebMate.g:642:2: rule__Abbreviation__Group_2__2__Impl rule__Abbreviation__Group_2__3
            {
            pushFollow(FOLLOW_6);
            rule__Abbreviation__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Abbreviation__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abbreviation__Group_2__2"


    // $ANTLR start "rule__Abbreviation__Group_2__2__Impl"
    // InternalWebMate.g:649:1: rule__Abbreviation__Group_2__2__Impl : ( ( rule__Abbreviation__IdsAssignment_2_2 )? ) ;
    public final void rule__Abbreviation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:653:1: ( ( ( rule__Abbreviation__IdsAssignment_2_2 )? ) )
            // InternalWebMate.g:654:1: ( ( rule__Abbreviation__IdsAssignment_2_2 )? )
            {
            // InternalWebMate.g:654:1: ( ( rule__Abbreviation__IdsAssignment_2_2 )? )
            // InternalWebMate.g:655:2: ( rule__Abbreviation__IdsAssignment_2_2 )?
            {
             before(grammarAccess.getAbbreviationAccess().getIdsAssignment_2_2()); 
            // InternalWebMate.g:656:2: ( rule__Abbreviation__IdsAssignment_2_2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalWebMate.g:656:3: rule__Abbreviation__IdsAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Abbreviation__IdsAssignment_2_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAbbreviationAccess().getIdsAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abbreviation__Group_2__2__Impl"


    // $ANTLR start "rule__Abbreviation__Group_2__3"
    // InternalWebMate.g:664:1: rule__Abbreviation__Group_2__3 : rule__Abbreviation__Group_2__3__Impl rule__Abbreviation__Group_2__4 ;
    public final void rule__Abbreviation__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:668:1: ( rule__Abbreviation__Group_2__3__Impl rule__Abbreviation__Group_2__4 )
            // InternalWebMate.g:669:2: rule__Abbreviation__Group_2__3__Impl rule__Abbreviation__Group_2__4
            {
            pushFollow(FOLLOW_6);
            rule__Abbreviation__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Abbreviation__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abbreviation__Group_2__3"


    // $ANTLR start "rule__Abbreviation__Group_2__3__Impl"
    // InternalWebMate.g:676:1: rule__Abbreviation__Group_2__3__Impl : ( ( rule__Abbreviation__SymbolsAssignment_2_3 )? ) ;
    public final void rule__Abbreviation__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:680:1: ( ( ( rule__Abbreviation__SymbolsAssignment_2_3 )? ) )
            // InternalWebMate.g:681:1: ( ( rule__Abbreviation__SymbolsAssignment_2_3 )? )
            {
            // InternalWebMate.g:681:1: ( ( rule__Abbreviation__SymbolsAssignment_2_3 )? )
            // InternalWebMate.g:682:2: ( rule__Abbreviation__SymbolsAssignment_2_3 )?
            {
             before(grammarAccess.getAbbreviationAccess().getSymbolsAssignment_2_3()); 
            // InternalWebMate.g:683:2: ( rule__Abbreviation__SymbolsAssignment_2_3 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=11 && LA9_0<=16)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalWebMate.g:683:3: rule__Abbreviation__SymbolsAssignment_2_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Abbreviation__SymbolsAssignment_2_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAbbreviationAccess().getSymbolsAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abbreviation__Group_2__3__Impl"


    // $ANTLR start "rule__Abbreviation__Group_2__4"
    // InternalWebMate.g:691:1: rule__Abbreviation__Group_2__4 : rule__Abbreviation__Group_2__4__Impl rule__Abbreviation__Group_2__5 ;
    public final void rule__Abbreviation__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:695:1: ( rule__Abbreviation__Group_2__4__Impl rule__Abbreviation__Group_2__5 )
            // InternalWebMate.g:696:2: rule__Abbreviation__Group_2__4__Impl rule__Abbreviation__Group_2__5
            {
            pushFollow(FOLLOW_6);
            rule__Abbreviation__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Abbreviation__Group_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abbreviation__Group_2__4"


    // $ANTLR start "rule__Abbreviation__Group_2__4__Impl"
    // InternalWebMate.g:703:1: rule__Abbreviation__Group_2__4__Impl : ( ( rule__Abbreviation__AttributesAssignment_2_4 )? ) ;
    public final void rule__Abbreviation__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:707:1: ( ( ( rule__Abbreviation__AttributesAssignment_2_4 )? ) )
            // InternalWebMate.g:708:1: ( ( rule__Abbreviation__AttributesAssignment_2_4 )? )
            {
            // InternalWebMate.g:708:1: ( ( rule__Abbreviation__AttributesAssignment_2_4 )? )
            // InternalWebMate.g:709:2: ( rule__Abbreviation__AttributesAssignment_2_4 )?
            {
             before(grammarAccess.getAbbreviationAccess().getAttributesAssignment_2_4()); 
            // InternalWebMate.g:710:2: ( rule__Abbreviation__AttributesAssignment_2_4 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalWebMate.g:710:3: rule__Abbreviation__AttributesAssignment_2_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Abbreviation__AttributesAssignment_2_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAbbreviationAccess().getAttributesAssignment_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abbreviation__Group_2__4__Impl"


    // $ANTLR start "rule__Abbreviation__Group_2__5"
    // InternalWebMate.g:718:1: rule__Abbreviation__Group_2__5 : rule__Abbreviation__Group_2__5__Impl ;
    public final void rule__Abbreviation__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:722:1: ( rule__Abbreviation__Group_2__5__Impl )
            // InternalWebMate.g:723:2: rule__Abbreviation__Group_2__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Abbreviation__Group_2__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abbreviation__Group_2__5"


    // $ANTLR start "rule__Abbreviation__Group_2__5__Impl"
    // InternalWebMate.g:729:1: rule__Abbreviation__Group_2__5__Impl : ( ( rule__Abbreviation__GroupAssignment_2_5 )? ) ;
    public final void rule__Abbreviation__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:733:1: ( ( ( rule__Abbreviation__GroupAssignment_2_5 )? ) )
            // InternalWebMate.g:734:1: ( ( rule__Abbreviation__GroupAssignment_2_5 )? )
            {
            // InternalWebMate.g:734:1: ( ( rule__Abbreviation__GroupAssignment_2_5 )? )
            // InternalWebMate.g:735:2: ( rule__Abbreviation__GroupAssignment_2_5 )?
            {
             before(grammarAccess.getAbbreviationAccess().getGroupAssignment_2_5()); 
            // InternalWebMate.g:736:2: ( rule__Abbreviation__GroupAssignment_2_5 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24||(LA11_0>=27 && LA11_0<=28)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalWebMate.g:736:3: rule__Abbreviation__GroupAssignment_2_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Abbreviation__GroupAssignment_2_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAbbreviationAccess().getGroupAssignment_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abbreviation__Group_2__5__Impl"


    // $ANTLR start "rule__ID0__Group__0"
    // InternalWebMate.g:745:1: rule__ID0__Group__0 : rule__ID0__Group__0__Impl rule__ID0__Group__1 ;
    public final void rule__ID0__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:749:1: ( rule__ID0__Group__0__Impl rule__ID0__Group__1 )
            // InternalWebMate.g:750:2: rule__ID0__Group__0__Impl rule__ID0__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ID0__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ID0__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ID0__Group__0"


    // $ANTLR start "rule__ID0__Group__0__Impl"
    // InternalWebMate.g:757:1: rule__ID0__Group__0__Impl : ( () ) ;
    public final void rule__ID0__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:761:1: ( ( () ) )
            // InternalWebMate.g:762:1: ( () )
            {
            // InternalWebMate.g:762:1: ( () )
            // InternalWebMate.g:763:2: ()
            {
             before(grammarAccess.getID0Access().getIDAction_0()); 
            // InternalWebMate.g:764:2: ()
            // InternalWebMate.g:764:3: 
            {
            }

             after(grammarAccess.getID0Access().getIDAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ID0__Group__0__Impl"


    // $ANTLR start "rule__ID0__Group__1"
    // InternalWebMate.g:772:1: rule__ID0__Group__1 : rule__ID0__Group__1__Impl ;
    public final void rule__ID0__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:776:1: ( rule__ID0__Group__1__Impl )
            // InternalWebMate.g:777:2: rule__ID0__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ID0__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ID0__Group__1"


    // $ANTLR start "rule__ID0__Group__1__Impl"
    // InternalWebMate.g:783:1: rule__ID0__Group__1__Impl : ( ( rule__ID0__Group_1__0 ) ) ;
    public final void rule__ID0__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:787:1: ( ( ( rule__ID0__Group_1__0 ) ) )
            // InternalWebMate.g:788:1: ( ( rule__ID0__Group_1__0 ) )
            {
            // InternalWebMate.g:788:1: ( ( rule__ID0__Group_1__0 ) )
            // InternalWebMate.g:789:2: ( rule__ID0__Group_1__0 )
            {
             before(grammarAccess.getID0Access().getGroup_1()); 
            // InternalWebMate.g:790:2: ( rule__ID0__Group_1__0 )
            // InternalWebMate.g:790:3: rule__ID0__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__ID0__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getID0Access().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ID0__Group__1__Impl"


    // $ANTLR start "rule__ID0__Group_1__0"
    // InternalWebMate.g:799:1: rule__ID0__Group_1__0 : rule__ID0__Group_1__0__Impl rule__ID0__Group_1__1 ;
    public final void rule__ID0__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:803:1: ( rule__ID0__Group_1__0__Impl rule__ID0__Group_1__1 )
            // InternalWebMate.g:804:2: rule__ID0__Group_1__0__Impl rule__ID0__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__ID0__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ID0__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ID0__Group_1__0"


    // $ANTLR start "rule__ID0__Group_1__0__Impl"
    // InternalWebMate.g:811:1: rule__ID0__Group_1__0__Impl : ( '#' ) ;
    public final void rule__ID0__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:815:1: ( ( '#' ) )
            // InternalWebMate.g:816:1: ( '#' )
            {
            // InternalWebMate.g:816:1: ( '#' )
            // InternalWebMate.g:817:2: '#'
            {
             before(grammarAccess.getID0Access().getNumberSignKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getID0Access().getNumberSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ID0__Group_1__0__Impl"


    // $ANTLR start "rule__ID0__Group_1__1"
    // InternalWebMate.g:826:1: rule__ID0__Group_1__1 : rule__ID0__Group_1__1__Impl ;
    public final void rule__ID0__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:830:1: ( rule__ID0__Group_1__1__Impl )
            // InternalWebMate.g:831:2: rule__ID0__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ID0__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ID0__Group_1__1"


    // $ANTLR start "rule__ID0__Group_1__1__Impl"
    // InternalWebMate.g:837:1: rule__ID0__Group_1__1__Impl : ( ( rule__ID0__IdNameAssignment_1_1 ) ) ;
    public final void rule__ID0__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:841:1: ( ( ( rule__ID0__IdNameAssignment_1_1 ) ) )
            // InternalWebMate.g:842:1: ( ( rule__ID0__IdNameAssignment_1_1 ) )
            {
            // InternalWebMate.g:842:1: ( ( rule__ID0__IdNameAssignment_1_1 ) )
            // InternalWebMate.g:843:2: ( rule__ID0__IdNameAssignment_1_1 )
            {
             before(grammarAccess.getID0Access().getIdNameAssignment_1_1()); 
            // InternalWebMate.g:844:2: ( rule__ID0__IdNameAssignment_1_1 )
            // InternalWebMate.g:844:3: rule__ID0__IdNameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ID0__IdNameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getID0Access().getIdNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ID0__Group_1__1__Impl"


    // $ANTLR start "rule__Symbol__Group__0"
    // InternalWebMate.g:853:1: rule__Symbol__Group__0 : rule__Symbol__Group__0__Impl rule__Symbol__Group__1 ;
    public final void rule__Symbol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:857:1: ( rule__Symbol__Group__0__Impl rule__Symbol__Group__1 )
            // InternalWebMate.g:858:2: rule__Symbol__Group__0__Impl rule__Symbol__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Symbol__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Symbol__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__0"


    // $ANTLR start "rule__Symbol__Group__0__Impl"
    // InternalWebMate.g:865:1: rule__Symbol__Group__0__Impl : ( () ) ;
    public final void rule__Symbol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:869:1: ( ( () ) )
            // InternalWebMate.g:870:1: ( () )
            {
            // InternalWebMate.g:870:1: ( () )
            // InternalWebMate.g:871:2: ()
            {
             before(grammarAccess.getSymbolAccess().getSymbolAction_0()); 
            // InternalWebMate.g:872:2: ()
            // InternalWebMate.g:872:3: 
            {
            }

             after(grammarAccess.getSymbolAccess().getSymbolAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__0__Impl"


    // $ANTLR start "rule__Symbol__Group__1"
    // InternalWebMate.g:880:1: rule__Symbol__Group__1 : rule__Symbol__Group__1__Impl rule__Symbol__Group__2 ;
    public final void rule__Symbol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:884:1: ( rule__Symbol__Group__1__Impl rule__Symbol__Group__2 )
            // InternalWebMate.g:885:2: rule__Symbol__Group__1__Impl rule__Symbol__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Symbol__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Symbol__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__1"


    // $ANTLR start "rule__Symbol__Group__1__Impl"
    // InternalWebMate.g:892:1: rule__Symbol__Group__1__Impl : ( ( rule__Symbol__SymAssignment_1 ) ) ;
    public final void rule__Symbol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:896:1: ( ( ( rule__Symbol__SymAssignment_1 ) ) )
            // InternalWebMate.g:897:1: ( ( rule__Symbol__SymAssignment_1 ) )
            {
            // InternalWebMate.g:897:1: ( ( rule__Symbol__SymAssignment_1 ) )
            // InternalWebMate.g:898:2: ( rule__Symbol__SymAssignment_1 )
            {
             before(grammarAccess.getSymbolAccess().getSymAssignment_1()); 
            // InternalWebMate.g:899:2: ( rule__Symbol__SymAssignment_1 )
            // InternalWebMate.g:899:3: rule__Symbol__SymAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Symbol__SymAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSymbolAccess().getSymAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__1__Impl"


    // $ANTLR start "rule__Symbol__Group__2"
    // InternalWebMate.g:907:1: rule__Symbol__Group__2 : rule__Symbol__Group__2__Impl ;
    public final void rule__Symbol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:911:1: ( rule__Symbol__Group__2__Impl )
            // InternalWebMate.g:912:2: rule__Symbol__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Symbol__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__2"


    // $ANTLR start "rule__Symbol__Group__2__Impl"
    // InternalWebMate.g:918:1: rule__Symbol__Group__2__Impl : ( ( rule__Symbol__TagAssignment_2 ) ) ;
    public final void rule__Symbol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:922:1: ( ( ( rule__Symbol__TagAssignment_2 ) ) )
            // InternalWebMate.g:923:1: ( ( rule__Symbol__TagAssignment_2 ) )
            {
            // InternalWebMate.g:923:1: ( ( rule__Symbol__TagAssignment_2 ) )
            // InternalWebMate.g:924:2: ( rule__Symbol__TagAssignment_2 )
            {
             before(grammarAccess.getSymbolAccess().getTagAssignment_2()); 
            // InternalWebMate.g:925:2: ( rule__Symbol__TagAssignment_2 )
            // InternalWebMate.g:925:3: rule__Symbol__TagAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Symbol__TagAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSymbolAccess().getTagAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__2__Impl"


    // $ANTLR start "rule__Tag__Group__0"
    // InternalWebMate.g:934:1: rule__Tag__Group__0 : rule__Tag__Group__0__Impl rule__Tag__Group__1 ;
    public final void rule__Tag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:938:1: ( rule__Tag__Group__0__Impl rule__Tag__Group__1 )
            // InternalWebMate.g:939:2: rule__Tag__Group__0__Impl rule__Tag__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Tag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tag__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__0"


    // $ANTLR start "rule__Tag__Group__0__Impl"
    // InternalWebMate.g:946:1: rule__Tag__Group__0__Impl : ( () ) ;
    public final void rule__Tag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:950:1: ( ( () ) )
            // InternalWebMate.g:951:1: ( () )
            {
            // InternalWebMate.g:951:1: ( () )
            // InternalWebMate.g:952:2: ()
            {
             before(grammarAccess.getTagAccess().getTagAction_0()); 
            // InternalWebMate.g:953:2: ()
            // InternalWebMate.g:953:3: 
            {
            }

             after(grammarAccess.getTagAccess().getTagAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__0__Impl"


    // $ANTLR start "rule__Tag__Group__1"
    // InternalWebMate.g:961:1: rule__Tag__Group__1 : rule__Tag__Group__1__Impl ;
    public final void rule__Tag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:965:1: ( rule__Tag__Group__1__Impl )
            // InternalWebMate.g:966:2: rule__Tag__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tag__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__1"


    // $ANTLR start "rule__Tag__Group__1__Impl"
    // InternalWebMate.g:972:1: rule__Tag__Group__1__Impl : ( ( rule__Tag__TagNameAssignment_1 ) ) ;
    public final void rule__Tag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:976:1: ( ( ( rule__Tag__TagNameAssignment_1 ) ) )
            // InternalWebMate.g:977:1: ( ( rule__Tag__TagNameAssignment_1 ) )
            {
            // InternalWebMate.g:977:1: ( ( rule__Tag__TagNameAssignment_1 ) )
            // InternalWebMate.g:978:2: ( rule__Tag__TagNameAssignment_1 )
            {
             before(grammarAccess.getTagAccess().getTagNameAssignment_1()); 
            // InternalWebMate.g:979:2: ( rule__Tag__TagNameAssignment_1 )
            // InternalWebMate.g:979:3: rule__Tag__TagNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Tag__TagNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTagAccess().getTagNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // InternalWebMate.g:988:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:992:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalWebMate.g:993:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // InternalWebMate.g:1000:1: rule__Class__Group__0__Impl : ( () ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1004:1: ( ( () ) )
            // InternalWebMate.g:1005:1: ( () )
            {
            // InternalWebMate.g:1005:1: ( () )
            // InternalWebMate.g:1006:2: ()
            {
             before(grammarAccess.getClassAccess().getClassAction_0()); 
            // InternalWebMate.g:1007:2: ()
            // InternalWebMate.g:1007:3: 
            {
            }

             after(grammarAccess.getClassAccess().getClassAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // InternalWebMate.g:1015:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1019:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalWebMate.g:1020:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // InternalWebMate.g:1027:1: rule__Class__Group__1__Impl : ( '.' ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1031:1: ( ( '.' ) )
            // InternalWebMate.g:1032:1: ( '.' )
            {
            // InternalWebMate.g:1032:1: ( '.' )
            // InternalWebMate.g:1033:2: '.'
            {
             before(grammarAccess.getClassAccess().getFullStopKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__2"
    // InternalWebMate.g:1042:1: rule__Class__Group__2 : rule__Class__Group__2__Impl ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1046:1: ( rule__Class__Group__2__Impl )
            // InternalWebMate.g:1047:2: rule__Class__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2"


    // $ANTLR start "rule__Class__Group__2__Impl"
    // InternalWebMate.g:1053:1: rule__Class__Group__2__Impl : ( ( rule__Class__ClassNameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1057:1: ( ( ( rule__Class__ClassNameAssignment_2 ) ) )
            // InternalWebMate.g:1058:1: ( ( rule__Class__ClassNameAssignment_2 ) )
            {
            // InternalWebMate.g:1058:1: ( ( rule__Class__ClassNameAssignment_2 ) )
            // InternalWebMate.g:1059:2: ( rule__Class__ClassNameAssignment_2 )
            {
             before(grammarAccess.getClassAccess().getClassNameAssignment_2()); 
            // InternalWebMate.g:1060:2: ( rule__Class__ClassNameAssignment_2 )
            // InternalWebMate.g:1060:3: rule__Class__ClassNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Class__ClassNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getClassNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2__Impl"


    // $ANTLR start "rule__Group__Group_0__0"
    // InternalWebMate.g:1069:1: rule__Group__Group_0__0 : rule__Group__Group_0__0__Impl rule__Group__Group_0__1 ;
    public final void rule__Group__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1073:1: ( rule__Group__Group_0__0__Impl rule__Group__Group_0__1 )
            // InternalWebMate.g:1074:2: rule__Group__Group_0__0__Impl rule__Group__Group_0__1
            {
            pushFollow(FOLLOW_11);
            rule__Group__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_0__0"


    // $ANTLR start "rule__Group__Group_0__0__Impl"
    // InternalWebMate.g:1081:1: rule__Group__Group_0__0__Impl : ( () ) ;
    public final void rule__Group__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1085:1: ( ( () ) )
            // InternalWebMate.g:1086:1: ( () )
            {
            // InternalWebMate.g:1086:1: ( () )
            // InternalWebMate.g:1087:2: ()
            {
             before(grammarAccess.getGroupAccess().getGroupAction_0_0()); 
            // InternalWebMate.g:1088:2: ()
            // InternalWebMate.g:1088:3: 
            {
            }

             after(grammarAccess.getGroupAccess().getGroupAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_0__0__Impl"


    // $ANTLR start "rule__Group__Group_0__1"
    // InternalWebMate.g:1096:1: rule__Group__Group_0__1 : rule__Group__Group_0__1__Impl rule__Group__Group_0__2 ;
    public final void rule__Group__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1100:1: ( rule__Group__Group_0__1__Impl rule__Group__Group_0__2 )
            // InternalWebMate.g:1101:2: rule__Group__Group_0__1__Impl rule__Group__Group_0__2
            {
            pushFollow(FOLLOW_3);
            rule__Group__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_0__1"


    // $ANTLR start "rule__Group__Group_0__1__Impl"
    // InternalWebMate.g:1108:1: rule__Group__Group_0__1__Impl : ( '(' ) ;
    public final void rule__Group__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1112:1: ( ( '(' ) )
            // InternalWebMate.g:1113:1: ( '(' )
            {
            // InternalWebMate.g:1113:1: ( '(' )
            // InternalWebMate.g:1114:2: '('
            {
             before(grammarAccess.getGroupAccess().getLeftParenthesisKeyword_0_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getLeftParenthesisKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_0__1__Impl"


    // $ANTLR start "rule__Group__Group_0__2"
    // InternalWebMate.g:1123:1: rule__Group__Group_0__2 : rule__Group__Group_0__2__Impl rule__Group__Group_0__3 ;
    public final void rule__Group__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1127:1: ( rule__Group__Group_0__2__Impl rule__Group__Group_0__3 )
            // InternalWebMate.g:1128:2: rule__Group__Group_0__2__Impl rule__Group__Group_0__3
            {
            pushFollow(FOLLOW_12);
            rule__Group__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_0__2"


    // $ANTLR start "rule__Group__Group_0__2__Impl"
    // InternalWebMate.g:1135:1: rule__Group__Group_0__2__Impl : ( ( ( rule__Group__AbbreviationAssignment_0_2 ) ) ( ( rule__Group__AbbreviationAssignment_0_2 )* ) ) ;
    public final void rule__Group__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1139:1: ( ( ( ( rule__Group__AbbreviationAssignment_0_2 ) ) ( ( rule__Group__AbbreviationAssignment_0_2 )* ) ) )
            // InternalWebMate.g:1140:1: ( ( ( rule__Group__AbbreviationAssignment_0_2 ) ) ( ( rule__Group__AbbreviationAssignment_0_2 )* ) )
            {
            // InternalWebMate.g:1140:1: ( ( ( rule__Group__AbbreviationAssignment_0_2 ) ) ( ( rule__Group__AbbreviationAssignment_0_2 )* ) )
            // InternalWebMate.g:1141:2: ( ( rule__Group__AbbreviationAssignment_0_2 ) ) ( ( rule__Group__AbbreviationAssignment_0_2 )* )
            {
            // InternalWebMate.g:1141:2: ( ( rule__Group__AbbreviationAssignment_0_2 ) )
            // InternalWebMate.g:1142:3: ( rule__Group__AbbreviationAssignment_0_2 )
            {
             before(grammarAccess.getGroupAccess().getAbbreviationAssignment_0_2()); 
            // InternalWebMate.g:1143:3: ( rule__Group__AbbreviationAssignment_0_2 )
            // InternalWebMate.g:1143:4: rule__Group__AbbreviationAssignment_0_2
            {
            pushFollow(FOLLOW_4);
            rule__Group__AbbreviationAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getAbbreviationAssignment_0_2()); 

            }

            // InternalWebMate.g:1146:2: ( ( rule__Group__AbbreviationAssignment_0_2 )* )
            // InternalWebMate.g:1147:3: ( rule__Group__AbbreviationAssignment_0_2 )*
            {
             before(grammarAccess.getGroupAccess().getAbbreviationAssignment_0_2()); 
            // InternalWebMate.g:1148:3: ( rule__Group__AbbreviationAssignment_0_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_INT)||(LA12_0>=17 && LA12_0<=21)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalWebMate.g:1148:4: rule__Group__AbbreviationAssignment_0_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Group__AbbreviationAssignment_0_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getGroupAccess().getAbbreviationAssignment_0_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_0__2__Impl"


    // $ANTLR start "rule__Group__Group_0__3"
    // InternalWebMate.g:1157:1: rule__Group__Group_0__3 : rule__Group__Group_0__3__Impl rule__Group__Group_0__4 ;
    public final void rule__Group__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1161:1: ( rule__Group__Group_0__3__Impl rule__Group__Group_0__4 )
            // InternalWebMate.g:1162:2: rule__Group__Group_0__3__Impl rule__Group__Group_0__4
            {
            pushFollow(FOLLOW_12);
            rule__Group__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_0__3"


    // $ANTLR start "rule__Group__Group_0__3__Impl"
    // InternalWebMate.g:1169:1: rule__Group__Group_0__3__Impl : ( ( ')' )? ) ;
    public final void rule__Group__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1173:1: ( ( ( ')' )? ) )
            // InternalWebMate.g:1174:1: ( ( ')' )? )
            {
            // InternalWebMate.g:1174:1: ( ( ')' )? )
            // InternalWebMate.g:1175:2: ( ')' )?
            {
             before(grammarAccess.getGroupAccess().getRightParenthesisKeyword_0_3()); 
            // InternalWebMate.g:1176:2: ( ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalWebMate.g:1176:3: ')'
                    {
                    match(input,25,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getGroupAccess().getRightParenthesisKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_0__3__Impl"


    // $ANTLR start "rule__Group__Group_0__4"
    // InternalWebMate.g:1184:1: rule__Group__Group_0__4 : rule__Group__Group_0__4__Impl rule__Group__Group_0__5 ;
    public final void rule__Group__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1188:1: ( rule__Group__Group_0__4__Impl rule__Group__Group_0__5 )
            // InternalWebMate.g:1189:2: rule__Group__Group_0__4__Impl rule__Group__Group_0__5
            {
            pushFollow(FOLLOW_3);
            rule__Group__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_0__4"


    // $ANTLR start "rule__Group__Group_0__4__Impl"
    // InternalWebMate.g:1196:1: rule__Group__Group_0__4__Impl : ( '>' ) ;
    public final void rule__Group__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1200:1: ( ( '>' ) )
            // InternalWebMate.g:1201:1: ( '>' )
            {
            // InternalWebMate.g:1201:1: ( '>' )
            // InternalWebMate.g:1202:2: '>'
            {
             before(grammarAccess.getGroupAccess().getGreaterThanSignKeyword_0_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getGreaterThanSignKeyword_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_0__4__Impl"


    // $ANTLR start "rule__Group__Group_0__5"
    // InternalWebMate.g:1211:1: rule__Group__Group_0__5 : rule__Group__Group_0__5__Impl ;
    public final void rule__Group__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1215:1: ( rule__Group__Group_0__5__Impl )
            // InternalWebMate.g:1216:2: rule__Group__Group_0__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group_0__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_0__5"


    // $ANTLR start "rule__Group__Group_0__5__Impl"
    // InternalWebMate.g:1222:1: rule__Group__Group_0__5__Impl : ( ( rule__Group__AbbreviationAssignment_0_5 ) ) ;
    public final void rule__Group__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1226:1: ( ( ( rule__Group__AbbreviationAssignment_0_5 ) ) )
            // InternalWebMate.g:1227:1: ( ( rule__Group__AbbreviationAssignment_0_5 ) )
            {
            // InternalWebMate.g:1227:1: ( ( rule__Group__AbbreviationAssignment_0_5 ) )
            // InternalWebMate.g:1228:2: ( rule__Group__AbbreviationAssignment_0_5 )
            {
             before(grammarAccess.getGroupAccess().getAbbreviationAssignment_0_5()); 
            // InternalWebMate.g:1229:2: ( rule__Group__AbbreviationAssignment_0_5 )
            // InternalWebMate.g:1229:3: rule__Group__AbbreviationAssignment_0_5
            {
            pushFollow(FOLLOW_2);
            rule__Group__AbbreviationAssignment_0_5();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getAbbreviationAssignment_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_0__5__Impl"


    // $ANTLR start "rule__Group__Group_1__0"
    // InternalWebMate.g:1238:1: rule__Group__Group_1__0 : rule__Group__Group_1__0__Impl rule__Group__Group_1__1 ;
    public final void rule__Group__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1242:1: ( rule__Group__Group_1__0__Impl rule__Group__Group_1__1 )
            // InternalWebMate.g:1243:2: rule__Group__Group_1__0__Impl rule__Group__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Group__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_1__0"


    // $ANTLR start "rule__Group__Group_1__0__Impl"
    // InternalWebMate.g:1250:1: rule__Group__Group_1__0__Impl : ( '*' ) ;
    public final void rule__Group__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1254:1: ( ( '*' ) )
            // InternalWebMate.g:1255:1: ( '*' )
            {
            // InternalWebMate.g:1255:1: ( '*' )
            // InternalWebMate.g:1256:2: '*'
            {
             before(grammarAccess.getGroupAccess().getAsteriskKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getAsteriskKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_1__0__Impl"


    // $ANTLR start "rule__Group__Group_1__1"
    // InternalWebMate.g:1265:1: rule__Group__Group_1__1 : rule__Group__Group_1__1__Impl ;
    public final void rule__Group__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1269:1: ( rule__Group__Group_1__1__Impl )
            // InternalWebMate.g:1270:2: rule__Group__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_1__1"


    // $ANTLR start "rule__Group__Group_1__1__Impl"
    // InternalWebMate.g:1276:1: rule__Group__Group_1__1__Impl : ( ( rule__Group__CountAssignment_1_1 ) ) ;
    public final void rule__Group__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1280:1: ( ( ( rule__Group__CountAssignment_1_1 ) ) )
            // InternalWebMate.g:1281:1: ( ( rule__Group__CountAssignment_1_1 ) )
            {
            // InternalWebMate.g:1281:1: ( ( rule__Group__CountAssignment_1_1 ) )
            // InternalWebMate.g:1282:2: ( rule__Group__CountAssignment_1_1 )
            {
             before(grammarAccess.getGroupAccess().getCountAssignment_1_1()); 
            // InternalWebMate.g:1283:2: ( rule__Group__CountAssignment_1_1 )
            // InternalWebMate.g:1283:3: rule__Group__CountAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Group__CountAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getCountAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_1__1__Impl"


    // $ANTLR start "rule__Group__Group_2__0"
    // InternalWebMate.g:1292:1: rule__Group__Group_2__0 : rule__Group__Group_2__0__Impl rule__Group__Group_2__1 ;
    public final void rule__Group__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1296:1: ( rule__Group__Group_2__0__Impl rule__Group__Group_2__1 )
            // InternalWebMate.g:1297:2: rule__Group__Group_2__0__Impl rule__Group__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Group__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_2__0"


    // $ANTLR start "rule__Group__Group_2__0__Impl"
    // InternalWebMate.g:1304:1: rule__Group__Group_2__0__Impl : ( '+' ) ;
    public final void rule__Group__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1308:1: ( ( '+' ) )
            // InternalWebMate.g:1309:1: ( '+' )
            {
            // InternalWebMate.g:1309:1: ( '+' )
            // InternalWebMate.g:1310:2: '+'
            {
             before(grammarAccess.getGroupAccess().getPlusSignKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getPlusSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_2__0__Impl"


    // $ANTLR start "rule__Group__Group_2__1"
    // InternalWebMate.g:1319:1: rule__Group__Group_2__1 : rule__Group__Group_2__1__Impl ;
    public final void rule__Group__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1323:1: ( rule__Group__Group_2__1__Impl )
            // InternalWebMate.g:1324:2: rule__Group__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_2__1"


    // $ANTLR start "rule__Group__Group_2__1__Impl"
    // InternalWebMate.g:1330:1: rule__Group__Group_2__1__Impl : ( ( rule__Group__AbbreviationAssignment_2_1 ) ) ;
    public final void rule__Group__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1334:1: ( ( ( rule__Group__AbbreviationAssignment_2_1 ) ) )
            // InternalWebMate.g:1335:1: ( ( rule__Group__AbbreviationAssignment_2_1 ) )
            {
            // InternalWebMate.g:1335:1: ( ( rule__Group__AbbreviationAssignment_2_1 ) )
            // InternalWebMate.g:1336:2: ( rule__Group__AbbreviationAssignment_2_1 )
            {
             before(grammarAccess.getGroupAccess().getAbbreviationAssignment_2_1()); 
            // InternalWebMate.g:1337:2: ( rule__Group__AbbreviationAssignment_2_1 )
            // InternalWebMate.g:1337:3: rule__Group__AbbreviationAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Group__AbbreviationAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getAbbreviationAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalWebMate.g:1346:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1350:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalWebMate.g:1351:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalWebMate.g:1358:1: rule__Attribute__Group__0__Impl : ( () ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1362:1: ( ( () ) )
            // InternalWebMate.g:1363:1: ( () )
            {
            // InternalWebMate.g:1363:1: ( () )
            // InternalWebMate.g:1364:2: ()
            {
             before(grammarAccess.getAttributeAccess().getAttributeAction_0()); 
            // InternalWebMate.g:1365:2: ()
            // InternalWebMate.g:1365:3: 
            {
            }

             after(grammarAccess.getAttributeAccess().getAttributeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalWebMate.g:1373:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1377:1: ( rule__Attribute__Group__1__Impl )
            // InternalWebMate.g:1378:2: rule__Attribute__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalWebMate.g:1384:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__Group_1__0 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1388:1: ( ( ( rule__Attribute__Group_1__0 ) ) )
            // InternalWebMate.g:1389:1: ( ( rule__Attribute__Group_1__0 ) )
            {
            // InternalWebMate.g:1389:1: ( ( rule__Attribute__Group_1__0 ) )
            // InternalWebMate.g:1390:2: ( rule__Attribute__Group_1__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup_1()); 
            // InternalWebMate.g:1391:2: ( rule__Attribute__Group_1__0 )
            // InternalWebMate.g:1391:3: rule__Attribute__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group_1__0"
    // InternalWebMate.g:1400:1: rule__Attribute__Group_1__0 : rule__Attribute__Group_1__0__Impl rule__Attribute__Group_1__1 ;
    public final void rule__Attribute__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1404:1: ( rule__Attribute__Group_1__0__Impl rule__Attribute__Group_1__1 )
            // InternalWebMate.g:1405:2: rule__Attribute__Group_1__0__Impl rule__Attribute__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Attribute__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_1__0"


    // $ANTLR start "rule__Attribute__Group_1__0__Impl"
    // InternalWebMate.g:1412:1: rule__Attribute__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Attribute__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1416:1: ( ( '[' ) )
            // InternalWebMate.g:1417:1: ( '[' )
            {
            // InternalWebMate.g:1417:1: ( '[' )
            // InternalWebMate.g:1418:2: '['
            {
             before(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_1__0__Impl"


    // $ANTLR start "rule__Attribute__Group_1__1"
    // InternalWebMate.g:1427:1: rule__Attribute__Group_1__1 : rule__Attribute__Group_1__1__Impl rule__Attribute__Group_1__2 ;
    public final void rule__Attribute__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1431:1: ( rule__Attribute__Group_1__1__Impl rule__Attribute__Group_1__2 )
            // InternalWebMate.g:1432:2: rule__Attribute__Group_1__1__Impl rule__Attribute__Group_1__2
            {
            pushFollow(FOLLOW_15);
            rule__Attribute__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_1__1"


    // $ANTLR start "rule__Attribute__Group_1__1__Impl"
    // InternalWebMate.g:1439:1: rule__Attribute__Group_1__1__Impl : ( ( rule__Attribute__AttributeNameAssignment_1_1 ) ) ;
    public final void rule__Attribute__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1443:1: ( ( ( rule__Attribute__AttributeNameAssignment_1_1 ) ) )
            // InternalWebMate.g:1444:1: ( ( rule__Attribute__AttributeNameAssignment_1_1 ) )
            {
            // InternalWebMate.g:1444:1: ( ( rule__Attribute__AttributeNameAssignment_1_1 ) )
            // InternalWebMate.g:1445:2: ( rule__Attribute__AttributeNameAssignment_1_1 )
            {
             before(grammarAccess.getAttributeAccess().getAttributeNameAssignment_1_1()); 
            // InternalWebMate.g:1446:2: ( rule__Attribute__AttributeNameAssignment_1_1 )
            // InternalWebMate.g:1446:3: rule__Attribute__AttributeNameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__AttributeNameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAttributeNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_1__1__Impl"


    // $ANTLR start "rule__Attribute__Group_1__2"
    // InternalWebMate.g:1454:1: rule__Attribute__Group_1__2 : rule__Attribute__Group_1__2__Impl rule__Attribute__Group_1__3 ;
    public final void rule__Attribute__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1458:1: ( rule__Attribute__Group_1__2__Impl rule__Attribute__Group_1__3 )
            // InternalWebMate.g:1459:2: rule__Attribute__Group_1__2__Impl rule__Attribute__Group_1__3
            {
            pushFollow(FOLLOW_15);
            rule__Attribute__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_1__2"


    // $ANTLR start "rule__Attribute__Group_1__2__Impl"
    // InternalWebMate.g:1466:1: rule__Attribute__Group_1__2__Impl : ( ( rule__Attribute__Group_1_2__0 )? ) ;
    public final void rule__Attribute__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1470:1: ( ( ( rule__Attribute__Group_1_2__0 )? ) )
            // InternalWebMate.g:1471:1: ( ( rule__Attribute__Group_1_2__0 )? )
            {
            // InternalWebMate.g:1471:1: ( ( rule__Attribute__Group_1_2__0 )? )
            // InternalWebMate.g:1472:2: ( rule__Attribute__Group_1_2__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_1_2()); 
            // InternalWebMate.g:1473:2: ( rule__Attribute__Group_1_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalWebMate.g:1473:3: rule__Attribute__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_1_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_1__2__Impl"


    // $ANTLR start "rule__Attribute__Group_1__3"
    // InternalWebMate.g:1481:1: rule__Attribute__Group_1__3 : rule__Attribute__Group_1__3__Impl ;
    public final void rule__Attribute__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1485:1: ( rule__Attribute__Group_1__3__Impl )
            // InternalWebMate.g:1486:2: rule__Attribute__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_1__3"


    // $ANTLR start "rule__Attribute__Group_1__3__Impl"
    // InternalWebMate.g:1492:1: rule__Attribute__Group_1__3__Impl : ( ']' ) ;
    public final void rule__Attribute__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1496:1: ( ( ']' ) )
            // InternalWebMate.g:1497:1: ( ']' )
            {
            // InternalWebMate.g:1497:1: ( ']' )
            // InternalWebMate.g:1498:2: ']'
            {
             before(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_1_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_1__3__Impl"


    // $ANTLR start "rule__Attribute__Group_1_2__0"
    // InternalWebMate.g:1508:1: rule__Attribute__Group_1_2__0 : rule__Attribute__Group_1_2__0__Impl rule__Attribute__Group_1_2__1 ;
    public final void rule__Attribute__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1512:1: ( rule__Attribute__Group_1_2__0__Impl rule__Attribute__Group_1_2__1 )
            // InternalWebMate.g:1513:2: rule__Attribute__Group_1_2__0__Impl rule__Attribute__Group_1_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Attribute__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_1_2__0"


    // $ANTLR start "rule__Attribute__Group_1_2__0__Impl"
    // InternalWebMate.g:1520:1: rule__Attribute__Group_1_2__0__Impl : ( '=' ) ;
    public final void rule__Attribute__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1524:1: ( ( '=' ) )
            // InternalWebMate.g:1525:1: ( '=' )
            {
            // InternalWebMate.g:1525:1: ( '=' )
            // InternalWebMate.g:1526:2: '='
            {
             before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_1_2__0__Impl"


    // $ANTLR start "rule__Attribute__Group_1_2__1"
    // InternalWebMate.g:1535:1: rule__Attribute__Group_1_2__1 : rule__Attribute__Group_1_2__1__Impl ;
    public final void rule__Attribute__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1539:1: ( rule__Attribute__Group_1_2__1__Impl )
            // InternalWebMate.g:1540:2: rule__Attribute__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_1_2__1"


    // $ANTLR start "rule__Attribute__Group_1_2__1__Impl"
    // InternalWebMate.g:1546:1: rule__Attribute__Group_1_2__1__Impl : ( ( rule__Attribute__AttributeValueAssignment_1_2_1 ) ) ;
    public final void rule__Attribute__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1550:1: ( ( ( rule__Attribute__AttributeValueAssignment_1_2_1 ) ) )
            // InternalWebMate.g:1551:1: ( ( rule__Attribute__AttributeValueAssignment_1_2_1 ) )
            {
            // InternalWebMate.g:1551:1: ( ( rule__Attribute__AttributeValueAssignment_1_2_1 ) )
            // InternalWebMate.g:1552:2: ( rule__Attribute__AttributeValueAssignment_1_2_1 )
            {
             before(grammarAccess.getAttributeAccess().getAttributeValueAssignment_1_2_1()); 
            // InternalWebMate.g:1553:2: ( rule__Attribute__AttributeValueAssignment_1_2_1 )
            // InternalWebMate.g:1553:3: rule__Attribute__AttributeValueAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__AttributeValueAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAttributeValueAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_1_2__1__Impl"


    // $ANTLR start "rule__HTML__AbbreviationAssignment_1"
    // InternalWebMate.g:1562:1: rule__HTML__AbbreviationAssignment_1 : ( ruleAbbreviation ) ;
    public final void rule__HTML__AbbreviationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1566:1: ( ( ruleAbbreviation ) )
            // InternalWebMate.g:1567:2: ( ruleAbbreviation )
            {
            // InternalWebMate.g:1567:2: ( ruleAbbreviation )
            // InternalWebMate.g:1568:3: ruleAbbreviation
            {
             before(grammarAccess.getHTMLAccess().getAbbreviationAbbreviationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbbreviation();

            state._fsp--;

             after(grammarAccess.getHTMLAccess().getAbbreviationAbbreviationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTML__AbbreviationAssignment_1"


    // $ANTLR start "rule__Abbreviation__AbbreviationAssignment_1"
    // InternalWebMate.g:1577:1: rule__Abbreviation__AbbreviationAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Abbreviation__AbbreviationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1581:1: ( ( ( ruleEString ) ) )
            // InternalWebMate.g:1582:2: ( ( ruleEString ) )
            {
            // InternalWebMate.g:1582:2: ( ( ruleEString ) )
            // InternalWebMate.g:1583:3: ( ruleEString )
            {
             before(grammarAccess.getAbbreviationAccess().getAbbreviationAbbreviationCrossReference_1_0()); 
            // InternalWebMate.g:1584:3: ( ruleEString )
            // InternalWebMate.g:1585:4: ruleEString
            {
             before(grammarAccess.getAbbreviationAccess().getAbbreviationAbbreviationEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAbbreviationAccess().getAbbreviationAbbreviationEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAbbreviationAccess().getAbbreviationAbbreviationCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abbreviation__AbbreviationAssignment_1"


    // $ANTLR start "rule__Abbreviation__TagsAssignment_2_0"
    // InternalWebMate.g:1596:1: rule__Abbreviation__TagsAssignment_2_0 : ( ruleTag ) ;
    public final void rule__Abbreviation__TagsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1600:1: ( ( ruleTag ) )
            // InternalWebMate.g:1601:2: ( ruleTag )
            {
            // InternalWebMate.g:1601:2: ( ruleTag )
            // InternalWebMate.g:1602:3: ruleTag
            {
             before(grammarAccess.getAbbreviationAccess().getTagsTagParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getAbbreviationAccess().getTagsTagParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abbreviation__TagsAssignment_2_0"


    // $ANTLR start "rule__Abbreviation__ClassesAssignment_2_1"
    // InternalWebMate.g:1611:1: rule__Abbreviation__ClassesAssignment_2_1 : ( ruleClass ) ;
    public final void rule__Abbreviation__ClassesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1615:1: ( ( ruleClass ) )
            // InternalWebMate.g:1616:2: ( ruleClass )
            {
            // InternalWebMate.g:1616:2: ( ruleClass )
            // InternalWebMate.g:1617:3: ruleClass
            {
             before(grammarAccess.getAbbreviationAccess().getClassesClassParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getAbbreviationAccess().getClassesClassParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abbreviation__ClassesAssignment_2_1"


    // $ANTLR start "rule__Abbreviation__IdsAssignment_2_2"
    // InternalWebMate.g:1626:1: rule__Abbreviation__IdsAssignment_2_2 : ( ruleID0 ) ;
    public final void rule__Abbreviation__IdsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1630:1: ( ( ruleID0 ) )
            // InternalWebMate.g:1631:2: ( ruleID0 )
            {
            // InternalWebMate.g:1631:2: ( ruleID0 )
            // InternalWebMate.g:1632:3: ruleID0
            {
             before(grammarAccess.getAbbreviationAccess().getIdsID0ParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleID0();

            state._fsp--;

             after(grammarAccess.getAbbreviationAccess().getIdsID0ParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abbreviation__IdsAssignment_2_2"


    // $ANTLR start "rule__Abbreviation__SymbolsAssignment_2_3"
    // InternalWebMate.g:1641:1: rule__Abbreviation__SymbolsAssignment_2_3 : ( ruleSymbol ) ;
    public final void rule__Abbreviation__SymbolsAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1645:1: ( ( ruleSymbol ) )
            // InternalWebMate.g:1646:2: ( ruleSymbol )
            {
            // InternalWebMate.g:1646:2: ( ruleSymbol )
            // InternalWebMate.g:1647:3: ruleSymbol
            {
             before(grammarAccess.getAbbreviationAccess().getSymbolsSymbolParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSymbol();

            state._fsp--;

             after(grammarAccess.getAbbreviationAccess().getSymbolsSymbolParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abbreviation__SymbolsAssignment_2_3"


    // $ANTLR start "rule__Abbreviation__AttributesAssignment_2_4"
    // InternalWebMate.g:1656:1: rule__Abbreviation__AttributesAssignment_2_4 : ( ruleAttribute ) ;
    public final void rule__Abbreviation__AttributesAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1660:1: ( ( ruleAttribute ) )
            // InternalWebMate.g:1661:2: ( ruleAttribute )
            {
            // InternalWebMate.g:1661:2: ( ruleAttribute )
            // InternalWebMate.g:1662:3: ruleAttribute
            {
             before(grammarAccess.getAbbreviationAccess().getAttributesAttributeParserRuleCall_2_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAbbreviationAccess().getAttributesAttributeParserRuleCall_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abbreviation__AttributesAssignment_2_4"


    // $ANTLR start "rule__Abbreviation__GroupAssignment_2_5"
    // InternalWebMate.g:1671:1: rule__Abbreviation__GroupAssignment_2_5 : ( ruleGroup ) ;
    public final void rule__Abbreviation__GroupAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1675:1: ( ( ruleGroup ) )
            // InternalWebMate.g:1676:2: ( ruleGroup )
            {
            // InternalWebMate.g:1676:2: ( ruleGroup )
            // InternalWebMate.g:1677:3: ruleGroup
            {
             before(grammarAccess.getAbbreviationAccess().getGroupGroupParserRuleCall_2_5_0()); 
            pushFollow(FOLLOW_2);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getAbbreviationAccess().getGroupGroupParserRuleCall_2_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abbreviation__GroupAssignment_2_5"


    // $ANTLR start "rule__ID0__IdNameAssignment_1_1"
    // InternalWebMate.g:1686:1: rule__ID0__IdNameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__ID0__IdNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1690:1: ( ( ruleEString ) )
            // InternalWebMate.g:1691:2: ( ruleEString )
            {
            // InternalWebMate.g:1691:2: ( ruleEString )
            // InternalWebMate.g:1692:3: ruleEString
            {
             before(grammarAccess.getID0Access().getIdNameEStringParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getID0Access().getIdNameEStringParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ID0__IdNameAssignment_1_1"


    // $ANTLR start "rule__Symbol__SymAssignment_1"
    // InternalWebMate.g:1701:1: rule__Symbol__SymAssignment_1 : ( ruleValidSymbol ) ;
    public final void rule__Symbol__SymAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1705:1: ( ( ruleValidSymbol ) )
            // InternalWebMate.g:1706:2: ( ruleValidSymbol )
            {
            // InternalWebMate.g:1706:2: ( ruleValidSymbol )
            // InternalWebMate.g:1707:3: ruleValidSymbol
            {
             before(grammarAccess.getSymbolAccess().getSymValidSymbolEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValidSymbol();

            state._fsp--;

             after(grammarAccess.getSymbolAccess().getSymValidSymbolEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__SymAssignment_1"


    // $ANTLR start "rule__Symbol__TagAssignment_2"
    // InternalWebMate.g:1716:1: rule__Symbol__TagAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Symbol__TagAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1720:1: ( ( ( ruleEString ) ) )
            // InternalWebMate.g:1721:2: ( ( ruleEString ) )
            {
            // InternalWebMate.g:1721:2: ( ( ruleEString ) )
            // InternalWebMate.g:1722:3: ( ruleEString )
            {
             before(grammarAccess.getSymbolAccess().getTagTagCrossReference_2_0()); 
            // InternalWebMate.g:1723:3: ( ruleEString )
            // InternalWebMate.g:1724:4: ruleEString
            {
             before(grammarAccess.getSymbolAccess().getTagTagEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSymbolAccess().getTagTagEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getSymbolAccess().getTagTagCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__TagAssignment_2"


    // $ANTLR start "rule__Tag__TagNameAssignment_1"
    // InternalWebMate.g:1735:1: rule__Tag__TagNameAssignment_1 : ( ruleHTMLTag ) ;
    public final void rule__Tag__TagNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1739:1: ( ( ruleHTMLTag ) )
            // InternalWebMate.g:1740:2: ( ruleHTMLTag )
            {
            // InternalWebMate.g:1740:2: ( ruleHTMLTag )
            // InternalWebMate.g:1741:3: ruleHTMLTag
            {
             before(grammarAccess.getTagAccess().getTagNameHTMLTagEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHTMLTag();

            state._fsp--;

             after(grammarAccess.getTagAccess().getTagNameHTMLTagEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__TagNameAssignment_1"


    // $ANTLR start "rule__Class__ClassNameAssignment_2"
    // InternalWebMate.g:1750:1: rule__Class__ClassNameAssignment_2 : ( ruleEString ) ;
    public final void rule__Class__ClassNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1754:1: ( ( ruleEString ) )
            // InternalWebMate.g:1755:2: ( ruleEString )
            {
            // InternalWebMate.g:1755:2: ( ruleEString )
            // InternalWebMate.g:1756:3: ruleEString
            {
             before(grammarAccess.getClassAccess().getClassNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClassAccess().getClassNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__ClassNameAssignment_2"


    // $ANTLR start "rule__Group__AbbreviationAssignment_0_2"
    // InternalWebMate.g:1765:1: rule__Group__AbbreviationAssignment_0_2 : ( ruleAbbreviation ) ;
    public final void rule__Group__AbbreviationAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1769:1: ( ( ruleAbbreviation ) )
            // InternalWebMate.g:1770:2: ( ruleAbbreviation )
            {
            // InternalWebMate.g:1770:2: ( ruleAbbreviation )
            // InternalWebMate.g:1771:3: ruleAbbreviation
            {
             before(grammarAccess.getGroupAccess().getAbbreviationAbbreviationParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAbbreviation();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getAbbreviationAbbreviationParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__AbbreviationAssignment_0_2"


    // $ANTLR start "rule__Group__AbbreviationAssignment_0_5"
    // InternalWebMate.g:1780:1: rule__Group__AbbreviationAssignment_0_5 : ( ruleAbbreviation ) ;
    public final void rule__Group__AbbreviationAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1784:1: ( ( ruleAbbreviation ) )
            // InternalWebMate.g:1785:2: ( ruleAbbreviation )
            {
            // InternalWebMate.g:1785:2: ( ruleAbbreviation )
            // InternalWebMate.g:1786:3: ruleAbbreviation
            {
             before(grammarAccess.getGroupAccess().getAbbreviationAbbreviationParserRuleCall_0_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAbbreviation();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getAbbreviationAbbreviationParserRuleCall_0_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__AbbreviationAssignment_0_5"


    // $ANTLR start "rule__Group__CountAssignment_1_1"
    // InternalWebMate.g:1795:1: rule__Group__CountAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Group__CountAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1799:1: ( ( RULE_INT ) )
            // InternalWebMate.g:1800:2: ( RULE_INT )
            {
            // InternalWebMate.g:1800:2: ( RULE_INT )
            // InternalWebMate.g:1801:3: RULE_INT
            {
             before(grammarAccess.getGroupAccess().getCountINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getCountINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__CountAssignment_1_1"


    // $ANTLR start "rule__Group__AbbreviationAssignment_2_1"
    // InternalWebMate.g:1810:1: rule__Group__AbbreviationAssignment_2_1 : ( ruleAbbreviation ) ;
    public final void rule__Group__AbbreviationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1814:1: ( ( ruleAbbreviation ) )
            // InternalWebMate.g:1815:2: ( ruleAbbreviation )
            {
            // InternalWebMate.g:1815:2: ( ruleAbbreviation )
            // InternalWebMate.g:1816:3: ruleAbbreviation
            {
             before(grammarAccess.getGroupAccess().getAbbreviationAbbreviationParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbbreviation();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getAbbreviationAbbreviationParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__AbbreviationAssignment_2_1"


    // $ANTLR start "rule__Attribute__AttributeNameAssignment_1_1"
    // InternalWebMate.g:1825:1: rule__Attribute__AttributeNameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__Attribute__AttributeNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1829:1: ( ( ruleEString ) )
            // InternalWebMate.g:1830:2: ( ruleEString )
            {
            // InternalWebMate.g:1830:2: ( ruleEString )
            // InternalWebMate.g:1831:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getAttributeNameEStringParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getAttributeNameEStringParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__AttributeNameAssignment_1_1"


    // $ANTLR start "rule__Attribute__AttributeValueAssignment_1_2_1"
    // InternalWebMate.g:1840:1: rule__Attribute__AttributeValueAssignment_1_2_1 : ( ruleEString ) ;
    public final void rule__Attribute__AttributeValueAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1844:1: ( ( ruleEString ) )
            // InternalWebMate.g:1845:2: ( ruleEString )
            {
            // InternalWebMate.g:1845:2: ( ruleEString )
            // InternalWebMate.g:1846:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getAttributeValueEStringParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getAttributeValueEStringParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__AttributeValueAssignment_1_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000003E0030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000003E0032L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000039C1F800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000001F800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000C0000000L});

}