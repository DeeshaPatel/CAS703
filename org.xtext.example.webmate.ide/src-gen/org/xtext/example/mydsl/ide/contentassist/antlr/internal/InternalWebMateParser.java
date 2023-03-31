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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'div'", "'h1'", "'p'", "'ul'", "'li'", "'{'", "'}'", "'#'", "'*'", "'+'", "'>'", "'^'", "'.'", "'['", "']'", "'='", "'('", "')'", "'-'"
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
    // InternalWebMate.g:137:1: ruleSymbol : ( ( rule__Symbol__Alternatives ) ) ;
    public final void ruleSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:141:2: ( ( ( rule__Symbol__Alternatives ) ) )
            // InternalWebMate.g:142:2: ( ( rule__Symbol__Alternatives ) )
            {
            // InternalWebMate.g:142:2: ( ( rule__Symbol__Alternatives ) )
            // InternalWebMate.g:143:3: ( rule__Symbol__Alternatives )
            {
             before(grammarAccess.getSymbolAccess().getAlternatives()); 
            // InternalWebMate.g:144:3: ( rule__Symbol__Alternatives )
            // InternalWebMate.g:144:4: rule__Symbol__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Symbol__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSymbolAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleAttribute"
    // InternalWebMate.g:203:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalWebMate.g:204:1: ( ruleAttribute EOF )
            // InternalWebMate.g:205:1: ruleAttribute EOF
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
    // InternalWebMate.g:212:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:216:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalWebMate.g:217:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalWebMate.g:217:2: ( ( rule__Attribute__Group__0 ) )
            // InternalWebMate.g:218:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalWebMate.g:219:3: ( rule__Attribute__Group__0 )
            // InternalWebMate.g:219:4: rule__Attribute__Group__0
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


    // $ANTLR start "entryRuleGroup"
    // InternalWebMate.g:228:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // InternalWebMate.g:229:1: ( ruleGroup EOF )
            // InternalWebMate.g:230:1: ruleGroup EOF
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
    // InternalWebMate.g:237:1: ruleGroup : ( ( rule__Group__Group__0 ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:241:2: ( ( ( rule__Group__Group__0 ) ) )
            // InternalWebMate.g:242:2: ( ( rule__Group__Group__0 ) )
            {
            // InternalWebMate.g:242:2: ( ( rule__Group__Group__0 ) )
            // InternalWebMate.g:243:3: ( rule__Group__Group__0 )
            {
             before(grammarAccess.getGroupAccess().getGroup()); 
            // InternalWebMate.g:244:3: ( rule__Group__Group__0 )
            // InternalWebMate.g:244:4: rule__Group__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getGroup()); 

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


    // $ANTLR start "entryRuleEInt"
    // InternalWebMate.g:278:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalWebMate.g:279:1: ( ruleEInt EOF )
            // InternalWebMate.g:280:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalWebMate.g:287:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:291:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalWebMate.g:292:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalWebMate.g:292:2: ( ( rule__EInt__Group__0 ) )
            // InternalWebMate.g:293:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalWebMate.g:294:3: ( rule__EInt__Group__0 )
            // InternalWebMate.g:294:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleHTMLTag"
    // InternalWebMate.g:303:1: ruleHTMLTag : ( ( rule__HTMLTag__Alternatives ) ) ;
    public final void ruleHTMLTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:307:1: ( ( ( rule__HTMLTag__Alternatives ) ) )
            // InternalWebMate.g:308:2: ( ( rule__HTMLTag__Alternatives ) )
            {
            // InternalWebMate.g:308:2: ( ( rule__HTMLTag__Alternatives ) )
            // InternalWebMate.g:309:3: ( rule__HTMLTag__Alternatives )
            {
             before(grammarAccess.getHTMLTagAccess().getAlternatives()); 
            // InternalWebMate.g:310:3: ( rule__HTMLTag__Alternatives )
            // InternalWebMate.g:310:4: rule__HTMLTag__Alternatives
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


    // $ANTLR start "rule__Abbreviation__Alternatives_2"
    // InternalWebMate.g:318:1: rule__Abbreviation__Alternatives_2 : ( ( ( rule__Abbreviation__AbbreviationAssignment_2_0 )* ) | ( ( rule__Abbreviation__Group_2_1__0 ) ) );
    public final void rule__Abbreviation__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:322:1: ( ( ( rule__Abbreviation__AbbreviationAssignment_2_0 )* ) | ( ( rule__Abbreviation__Group_2_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)||LA2_0==17) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=11 && LA2_0<=15)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalWebMate.g:323:2: ( ( rule__Abbreviation__AbbreviationAssignment_2_0 )* )
                    {
                    // InternalWebMate.g:323:2: ( ( rule__Abbreviation__AbbreviationAssignment_2_0 )* )
                    // InternalWebMate.g:324:3: ( rule__Abbreviation__AbbreviationAssignment_2_0 )*
                    {
                     before(grammarAccess.getAbbreviationAccess().getAbbreviationAssignment_2_0()); 
                    // InternalWebMate.g:325:3: ( rule__Abbreviation__AbbreviationAssignment_2_0 )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalWebMate.g:325:4: rule__Abbreviation__AbbreviationAssignment_2_0
                    	    {
                    	    pushFollow(FOLLOW_3);
                    	    rule__Abbreviation__AbbreviationAssignment_2_0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                     after(grammarAccess.getAbbreviationAccess().getAbbreviationAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebMate.g:329:2: ( ( rule__Abbreviation__Group_2_1__0 ) )
                    {
                    // InternalWebMate.g:329:2: ( ( rule__Abbreviation__Group_2_1__0 ) )
                    // InternalWebMate.g:330:3: ( rule__Abbreviation__Group_2_1__0 )
                    {
                     before(grammarAccess.getAbbreviationAccess().getGroup_2_1()); 
                    // InternalWebMate.g:331:3: ( rule__Abbreviation__Group_2_1__0 )
                    // InternalWebMate.g:331:4: rule__Abbreviation__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Abbreviation__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAbbreviationAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Abbreviation__Alternatives_2"


    // $ANTLR start "rule__Symbol__Alternatives"
    // InternalWebMate.g:339:1: rule__Symbol__Alternatives : ( ( ( rule__Symbol__Group_0__0 ) ) | ( ( rule__Symbol__Group_1__0 ) ) | ( ( rule__Symbol__Group_2__0 ) ) | ( ( rule__Symbol__Group_3__0 ) ) );
    public final void rule__Symbol__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:343:1: ( ( ( rule__Symbol__Group_0__0 ) ) | ( ( rule__Symbol__Group_1__0 ) ) | ( ( rule__Symbol__Group_2__0 ) ) | ( ( rule__Symbol__Group_3__0 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt3=1;
                }
                break;
            case 20:
                {
                alt3=2;
                }
                break;
            case 21:
                {
                alt3=3;
                }
                break;
            case 22:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalWebMate.g:344:2: ( ( rule__Symbol__Group_0__0 ) )
                    {
                    // InternalWebMate.g:344:2: ( ( rule__Symbol__Group_0__0 ) )
                    // InternalWebMate.g:345:3: ( rule__Symbol__Group_0__0 )
                    {
                     before(grammarAccess.getSymbolAccess().getGroup_0()); 
                    // InternalWebMate.g:346:3: ( rule__Symbol__Group_0__0 )
                    // InternalWebMate.g:346:4: rule__Symbol__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Symbol__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSymbolAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebMate.g:350:2: ( ( rule__Symbol__Group_1__0 ) )
                    {
                    // InternalWebMate.g:350:2: ( ( rule__Symbol__Group_1__0 ) )
                    // InternalWebMate.g:351:3: ( rule__Symbol__Group_1__0 )
                    {
                     before(grammarAccess.getSymbolAccess().getGroup_1()); 
                    // InternalWebMate.g:352:3: ( rule__Symbol__Group_1__0 )
                    // InternalWebMate.g:352:4: rule__Symbol__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Symbol__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSymbolAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWebMate.g:356:2: ( ( rule__Symbol__Group_2__0 ) )
                    {
                    // InternalWebMate.g:356:2: ( ( rule__Symbol__Group_2__0 ) )
                    // InternalWebMate.g:357:3: ( rule__Symbol__Group_2__0 )
                    {
                     before(grammarAccess.getSymbolAccess().getGroup_2()); 
                    // InternalWebMate.g:358:3: ( rule__Symbol__Group_2__0 )
                    // InternalWebMate.g:358:4: rule__Symbol__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Symbol__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSymbolAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalWebMate.g:362:2: ( ( rule__Symbol__Group_3__0 ) )
                    {
                    // InternalWebMate.g:362:2: ( ( rule__Symbol__Group_3__0 ) )
                    // InternalWebMate.g:363:3: ( rule__Symbol__Group_3__0 )
                    {
                     before(grammarAccess.getSymbolAccess().getGroup_3()); 
                    // InternalWebMate.g:364:3: ( rule__Symbol__Group_3__0 )
                    // InternalWebMate.g:364:4: rule__Symbol__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Symbol__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSymbolAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Symbol__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalWebMate.g:372:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:376:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalWebMate.g:377:2: ( RULE_STRING )
                    {
                    // InternalWebMate.g:377:2: ( RULE_STRING )
                    // InternalWebMate.g:378:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebMate.g:383:2: ( RULE_ID )
                    {
                    // InternalWebMate.g:383:2: ( RULE_ID )
                    // InternalWebMate.g:384:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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


    // $ANTLR start "rule__HTMLTag__Alternatives"
    // InternalWebMate.g:393:1: rule__HTMLTag__Alternatives : ( ( ( 'div' ) ) | ( ( 'h1' ) ) | ( ( 'p' ) ) | ( ( 'ul' ) ) | ( ( 'li' ) ) );
    public final void rule__HTMLTag__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:397:1: ( ( ( 'div' ) ) | ( ( 'h1' ) ) | ( ( 'p' ) ) | ( ( 'ul' ) ) | ( ( 'li' ) ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            case 14:
                {
                alt5=4;
                }
                break;
            case 15:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalWebMate.g:398:2: ( ( 'div' ) )
                    {
                    // InternalWebMate.g:398:2: ( ( 'div' ) )
                    // InternalWebMate.g:399:3: ( 'div' )
                    {
                     before(grammarAccess.getHTMLTagAccess().getDivEnumLiteralDeclaration_0()); 
                    // InternalWebMate.g:400:3: ( 'div' )
                    // InternalWebMate.g:400:4: 'div'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getHTMLTagAccess().getDivEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebMate.g:404:2: ( ( 'h1' ) )
                    {
                    // InternalWebMate.g:404:2: ( ( 'h1' ) )
                    // InternalWebMate.g:405:3: ( 'h1' )
                    {
                     before(grammarAccess.getHTMLTagAccess().getH1EnumLiteralDeclaration_1()); 
                    // InternalWebMate.g:406:3: ( 'h1' )
                    // InternalWebMate.g:406:4: 'h1'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getHTMLTagAccess().getH1EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWebMate.g:410:2: ( ( 'p' ) )
                    {
                    // InternalWebMate.g:410:2: ( ( 'p' ) )
                    // InternalWebMate.g:411:3: ( 'p' )
                    {
                     before(grammarAccess.getHTMLTagAccess().getPEnumLiteralDeclaration_2()); 
                    // InternalWebMate.g:412:3: ( 'p' )
                    // InternalWebMate.g:412:4: 'p'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getHTMLTagAccess().getPEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalWebMate.g:416:2: ( ( 'ul' ) )
                    {
                    // InternalWebMate.g:416:2: ( ( 'ul' ) )
                    // InternalWebMate.g:417:3: ( 'ul' )
                    {
                     before(grammarAccess.getHTMLTagAccess().getUlEnumLiteralDeclaration_3()); 
                    // InternalWebMate.g:418:3: ( 'ul' )
                    // InternalWebMate.g:418:4: 'ul'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getHTMLTagAccess().getUlEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalWebMate.g:422:2: ( ( 'li' ) )
                    {
                    // InternalWebMate.g:422:2: ( ( 'li' ) )
                    // InternalWebMate.g:423:3: ( 'li' )
                    {
                     before(grammarAccess.getHTMLTagAccess().getLiEnumLiteralDeclaration_4()); 
                    // InternalWebMate.g:424:3: ( 'li' )
                    // InternalWebMate.g:424:4: 'li'
                    {
                    match(input,15,FOLLOW_2); 

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
    // InternalWebMate.g:432:1: rule__HTML__Group__0 : rule__HTML__Group__0__Impl rule__HTML__Group__1 ;
    public final void rule__HTML__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:436:1: ( rule__HTML__Group__0__Impl rule__HTML__Group__1 )
            // InternalWebMate.g:437:2: rule__HTML__Group__0__Impl rule__HTML__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalWebMate.g:444:1: rule__HTML__Group__0__Impl : ( () ) ;
    public final void rule__HTML__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:448:1: ( ( () ) )
            // InternalWebMate.g:449:1: ( () )
            {
            // InternalWebMate.g:449:1: ( () )
            // InternalWebMate.g:450:2: ()
            {
             before(grammarAccess.getHTMLAccess().getHTMLAction_0()); 
            // InternalWebMate.g:451:2: ()
            // InternalWebMate.g:451:3: 
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
    // InternalWebMate.g:459:1: rule__HTML__Group__1 : rule__HTML__Group__1__Impl ;
    public final void rule__HTML__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:463:1: ( rule__HTML__Group__1__Impl )
            // InternalWebMate.g:464:2: rule__HTML__Group__1__Impl
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
    // InternalWebMate.g:470:1: rule__HTML__Group__1__Impl : ( ( ( rule__HTML__AbbreviationAssignment_1 ) ) ( ( rule__HTML__AbbreviationAssignment_1 )* ) ) ;
    public final void rule__HTML__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:474:1: ( ( ( ( rule__HTML__AbbreviationAssignment_1 ) ) ( ( rule__HTML__AbbreviationAssignment_1 )* ) ) )
            // InternalWebMate.g:475:1: ( ( ( rule__HTML__AbbreviationAssignment_1 ) ) ( ( rule__HTML__AbbreviationAssignment_1 )* ) )
            {
            // InternalWebMate.g:475:1: ( ( ( rule__HTML__AbbreviationAssignment_1 ) ) ( ( rule__HTML__AbbreviationAssignment_1 )* ) )
            // InternalWebMate.g:476:2: ( ( rule__HTML__AbbreviationAssignment_1 ) ) ( ( rule__HTML__AbbreviationAssignment_1 )* )
            {
            // InternalWebMate.g:476:2: ( ( rule__HTML__AbbreviationAssignment_1 ) )
            // InternalWebMate.g:477:3: ( rule__HTML__AbbreviationAssignment_1 )
            {
             before(grammarAccess.getHTMLAccess().getAbbreviationAssignment_1()); 
            // InternalWebMate.g:478:3: ( rule__HTML__AbbreviationAssignment_1 )
            // InternalWebMate.g:478:4: rule__HTML__AbbreviationAssignment_1
            {
            pushFollow(FOLLOW_5);
            rule__HTML__AbbreviationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHTMLAccess().getAbbreviationAssignment_1()); 

            }

            // InternalWebMate.g:481:2: ( ( rule__HTML__AbbreviationAssignment_1 )* )
            // InternalWebMate.g:482:3: ( rule__HTML__AbbreviationAssignment_1 )*
            {
             before(grammarAccess.getHTMLAccess().getAbbreviationAssignment_1()); 
            // InternalWebMate.g:483:3: ( rule__HTML__AbbreviationAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalWebMate.g:483:4: rule__HTML__AbbreviationAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__HTML__AbbreviationAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalWebMate.g:493:1: rule__Abbreviation__Group__0 : rule__Abbreviation__Group__0__Impl rule__Abbreviation__Group__1 ;
    public final void rule__Abbreviation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:497:1: ( rule__Abbreviation__Group__0__Impl rule__Abbreviation__Group__1 )
            // InternalWebMate.g:498:2: rule__Abbreviation__Group__0__Impl rule__Abbreviation__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalWebMate.g:505:1: rule__Abbreviation__Group__0__Impl : ( () ) ;
    public final void rule__Abbreviation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:509:1: ( ( () ) )
            // InternalWebMate.g:510:1: ( () )
            {
            // InternalWebMate.g:510:1: ( () )
            // InternalWebMate.g:511:2: ()
            {
             before(grammarAccess.getAbbreviationAccess().getAbbreviationAction_0()); 
            // InternalWebMate.g:512:2: ()
            // InternalWebMate.g:512:3: 
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
    // InternalWebMate.g:520:1: rule__Abbreviation__Group__1 : rule__Abbreviation__Group__1__Impl rule__Abbreviation__Group__2 ;
    public final void rule__Abbreviation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:524:1: ( rule__Abbreviation__Group__1__Impl rule__Abbreviation__Group__2 )
            // InternalWebMate.g:525:2: rule__Abbreviation__Group__1__Impl rule__Abbreviation__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalWebMate.g:532:1: rule__Abbreviation__Group__1__Impl : ( '{' ) ;
    public final void rule__Abbreviation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:536:1: ( ( '{' ) )
            // InternalWebMate.g:537:1: ( '{' )
            {
            // InternalWebMate.g:537:1: ( '{' )
            // InternalWebMate.g:538:2: '{'
            {
             before(grammarAccess.getAbbreviationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAbbreviationAccess().getLeftCurlyBracketKeyword_1()); 

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
    // InternalWebMate.g:547:1: rule__Abbreviation__Group__2 : rule__Abbreviation__Group__2__Impl rule__Abbreviation__Group__3 ;
    public final void rule__Abbreviation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:551:1: ( rule__Abbreviation__Group__2__Impl rule__Abbreviation__Group__3 )
            // InternalWebMate.g:552:2: rule__Abbreviation__Group__2__Impl rule__Abbreviation__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Abbreviation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Abbreviation__Group__3();

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
    // InternalWebMate.g:559:1: rule__Abbreviation__Group__2__Impl : ( ( rule__Abbreviation__Alternatives_2 ) ) ;
    public final void rule__Abbreviation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:563:1: ( ( ( rule__Abbreviation__Alternatives_2 ) ) )
            // InternalWebMate.g:564:1: ( ( rule__Abbreviation__Alternatives_2 ) )
            {
            // InternalWebMate.g:564:1: ( ( rule__Abbreviation__Alternatives_2 ) )
            // InternalWebMate.g:565:2: ( rule__Abbreviation__Alternatives_2 )
            {
             before(grammarAccess.getAbbreviationAccess().getAlternatives_2()); 
            // InternalWebMate.g:566:2: ( rule__Abbreviation__Alternatives_2 )
            // InternalWebMate.g:566:3: rule__Abbreviation__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Abbreviation__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getAbbreviationAccess().getAlternatives_2()); 

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


    // $ANTLR start "rule__Abbreviation__Group__3"
    // InternalWebMate.g:574:1: rule__Abbreviation__Group__3 : rule__Abbreviation__Group__3__Impl ;
    public final void rule__Abbreviation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:578:1: ( rule__Abbreviation__Group__3__Impl )
            // InternalWebMate.g:579:2: rule__Abbreviation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Abbreviation__Group__3__Impl();

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
    // $ANTLR end "rule__Abbreviation__Group__3"


    // $ANTLR start "rule__Abbreviation__Group__3__Impl"
    // InternalWebMate.g:585:1: rule__Abbreviation__Group__3__Impl : ( '}' ) ;
    public final void rule__Abbreviation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:589:1: ( ( '}' ) )
            // InternalWebMate.g:590:1: ( '}' )
            {
            // InternalWebMate.g:590:1: ( '}' )
            // InternalWebMate.g:591:2: '}'
            {
             before(grammarAccess.getAbbreviationAccess().getRightCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAbbreviationAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Abbreviation__Group__3__Impl"


    // $ANTLR start "rule__Abbreviation__Group_2_1__0"
    // InternalWebMate.g:601:1: rule__Abbreviation__Group_2_1__0 : rule__Abbreviation__Group_2_1__0__Impl rule__Abbreviation__Group_2_1__1 ;
    public final void rule__Abbreviation__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:605:1: ( rule__Abbreviation__Group_2_1__0__Impl rule__Abbreviation__Group_2_1__1 )
            // InternalWebMate.g:606:2: rule__Abbreviation__Group_2_1__0__Impl rule__Abbreviation__Group_2_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Abbreviation__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Abbreviation__Group_2_1__1();

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
    // $ANTLR end "rule__Abbreviation__Group_2_1__0"


    // $ANTLR start "rule__Abbreviation__Group_2_1__0__Impl"
    // InternalWebMate.g:613:1: rule__Abbreviation__Group_2_1__0__Impl : ( ( ( rule__Abbreviation__TagsAssignment_2_1_0 ) ) ( ( rule__Abbreviation__TagsAssignment_2_1_0 )* ) ) ;
    public final void rule__Abbreviation__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:617:1: ( ( ( ( rule__Abbreviation__TagsAssignment_2_1_0 ) ) ( ( rule__Abbreviation__TagsAssignment_2_1_0 )* ) ) )
            // InternalWebMate.g:618:1: ( ( ( rule__Abbreviation__TagsAssignment_2_1_0 ) ) ( ( rule__Abbreviation__TagsAssignment_2_1_0 )* ) )
            {
            // InternalWebMate.g:618:1: ( ( ( rule__Abbreviation__TagsAssignment_2_1_0 ) ) ( ( rule__Abbreviation__TagsAssignment_2_1_0 )* ) )
            // InternalWebMate.g:619:2: ( ( rule__Abbreviation__TagsAssignment_2_1_0 ) ) ( ( rule__Abbreviation__TagsAssignment_2_1_0 )* )
            {
            // InternalWebMate.g:619:2: ( ( rule__Abbreviation__TagsAssignment_2_1_0 ) )
            // InternalWebMate.g:620:3: ( rule__Abbreviation__TagsAssignment_2_1_0 )
            {
             before(grammarAccess.getAbbreviationAccess().getTagsAssignment_2_1_0()); 
            // InternalWebMate.g:621:3: ( rule__Abbreviation__TagsAssignment_2_1_0 )
            // InternalWebMate.g:621:4: rule__Abbreviation__TagsAssignment_2_1_0
            {
            pushFollow(FOLLOW_9);
            rule__Abbreviation__TagsAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAbbreviationAccess().getTagsAssignment_2_1_0()); 

            }

            // InternalWebMate.g:624:2: ( ( rule__Abbreviation__TagsAssignment_2_1_0 )* )
            // InternalWebMate.g:625:3: ( rule__Abbreviation__TagsAssignment_2_1_0 )*
            {
             before(grammarAccess.getAbbreviationAccess().getTagsAssignment_2_1_0()); 
            // InternalWebMate.g:626:3: ( rule__Abbreviation__TagsAssignment_2_1_0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=11 && LA7_0<=15)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalWebMate.g:626:4: rule__Abbreviation__TagsAssignment_2_1_0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Abbreviation__TagsAssignment_2_1_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getAbbreviationAccess().getTagsAssignment_2_1_0()); 

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
    // $ANTLR end "rule__Abbreviation__Group_2_1__0__Impl"


    // $ANTLR start "rule__Abbreviation__Group_2_1__1"
    // InternalWebMate.g:635:1: rule__Abbreviation__Group_2_1__1 : rule__Abbreviation__Group_2_1__1__Impl ;
    public final void rule__Abbreviation__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:639:1: ( rule__Abbreviation__Group_2_1__1__Impl )
            // InternalWebMate.g:640:2: rule__Abbreviation__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Abbreviation__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__Abbreviation__Group_2_1__1"


    // $ANTLR start "rule__Abbreviation__Group_2_1__1__Impl"
    // InternalWebMate.g:646:1: rule__Abbreviation__Group_2_1__1__Impl : ( ( rule__Abbreviation__Group_2_1_1__0 ) ) ;
    public final void rule__Abbreviation__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:650:1: ( ( ( rule__Abbreviation__Group_2_1_1__0 ) ) )
            // InternalWebMate.g:651:1: ( ( rule__Abbreviation__Group_2_1_1__0 ) )
            {
            // InternalWebMate.g:651:1: ( ( rule__Abbreviation__Group_2_1_1__0 ) )
            // InternalWebMate.g:652:2: ( rule__Abbreviation__Group_2_1_1__0 )
            {
             before(grammarAccess.getAbbreviationAccess().getGroup_2_1_1()); 
            // InternalWebMate.g:653:2: ( rule__Abbreviation__Group_2_1_1__0 )
            // InternalWebMate.g:653:3: rule__Abbreviation__Group_2_1_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Abbreviation__Group_2_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getAbbreviationAccess().getGroup_2_1_1()); 

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
    // $ANTLR end "rule__Abbreviation__Group_2_1__1__Impl"


    // $ANTLR start "rule__Abbreviation__Group_2_1_1__0"
    // InternalWebMate.g:662:1: rule__Abbreviation__Group_2_1_1__0 : rule__Abbreviation__Group_2_1_1__0__Impl rule__Abbreviation__Group_2_1_1__1 ;
    public final void rule__Abbreviation__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:666:1: ( rule__Abbreviation__Group_2_1_1__0__Impl rule__Abbreviation__Group_2_1_1__1 )
            // InternalWebMate.g:667:2: rule__Abbreviation__Group_2_1_1__0__Impl rule__Abbreviation__Group_2_1_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Abbreviation__Group_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Abbreviation__Group_2_1_1__1();

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
    // $ANTLR end "rule__Abbreviation__Group_2_1_1__0"


    // $ANTLR start "rule__Abbreviation__Group_2_1_1__0__Impl"
    // InternalWebMate.g:674:1: rule__Abbreviation__Group_2_1_1__0__Impl : ( ( rule__Abbreviation__IdsAssignment_2_1_1_0 )* ) ;
    public final void rule__Abbreviation__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:678:1: ( ( ( rule__Abbreviation__IdsAssignment_2_1_1_0 )* ) )
            // InternalWebMate.g:679:1: ( ( rule__Abbreviation__IdsAssignment_2_1_1_0 )* )
            {
            // InternalWebMate.g:679:1: ( ( rule__Abbreviation__IdsAssignment_2_1_1_0 )* )
            // InternalWebMate.g:680:2: ( rule__Abbreviation__IdsAssignment_2_1_1_0 )*
            {
             before(grammarAccess.getAbbreviationAccess().getIdsAssignment_2_1_1_0()); 
            // InternalWebMate.g:681:2: ( rule__Abbreviation__IdsAssignment_2_1_1_0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalWebMate.g:681:3: rule__Abbreviation__IdsAssignment_2_1_1_0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Abbreviation__IdsAssignment_2_1_1_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getAbbreviationAccess().getIdsAssignment_2_1_1_0()); 

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
    // $ANTLR end "rule__Abbreviation__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__Abbreviation__Group_2_1_1__1"
    // InternalWebMate.g:689:1: rule__Abbreviation__Group_2_1_1__1 : rule__Abbreviation__Group_2_1_1__1__Impl rule__Abbreviation__Group_2_1_1__2 ;
    public final void rule__Abbreviation__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:693:1: ( rule__Abbreviation__Group_2_1_1__1__Impl rule__Abbreviation__Group_2_1_1__2 )
            // InternalWebMate.g:694:2: rule__Abbreviation__Group_2_1_1__1__Impl rule__Abbreviation__Group_2_1_1__2
            {
            pushFollow(FOLLOW_8);
            rule__Abbreviation__Group_2_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Abbreviation__Group_2_1_1__2();

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
    // $ANTLR end "rule__Abbreviation__Group_2_1_1__1"


    // $ANTLR start "rule__Abbreviation__Group_2_1_1__1__Impl"
    // InternalWebMate.g:701:1: rule__Abbreviation__Group_2_1_1__1__Impl : ( ( rule__Abbreviation__SymbolsAssignment_2_1_1_1 )* ) ;
    public final void rule__Abbreviation__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:705:1: ( ( ( rule__Abbreviation__SymbolsAssignment_2_1_1_1 )* ) )
            // InternalWebMate.g:706:1: ( ( rule__Abbreviation__SymbolsAssignment_2_1_1_1 )* )
            {
            // InternalWebMate.g:706:1: ( ( rule__Abbreviation__SymbolsAssignment_2_1_1_1 )* )
            // InternalWebMate.g:707:2: ( rule__Abbreviation__SymbolsAssignment_2_1_1_1 )*
            {
             before(grammarAccess.getAbbreviationAccess().getSymbolsAssignment_2_1_1_1()); 
            // InternalWebMate.g:708:2: ( rule__Abbreviation__SymbolsAssignment_2_1_1_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=19 && LA9_0<=22)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalWebMate.g:708:3: rule__Abbreviation__SymbolsAssignment_2_1_1_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Abbreviation__SymbolsAssignment_2_1_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getAbbreviationAccess().getSymbolsAssignment_2_1_1_1()); 

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
    // $ANTLR end "rule__Abbreviation__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__Abbreviation__Group_2_1_1__2"
    // InternalWebMate.g:716:1: rule__Abbreviation__Group_2_1_1__2 : rule__Abbreviation__Group_2_1_1__2__Impl rule__Abbreviation__Group_2_1_1__3 ;
    public final void rule__Abbreviation__Group_2_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:720:1: ( rule__Abbreviation__Group_2_1_1__2__Impl rule__Abbreviation__Group_2_1_1__3 )
            // InternalWebMate.g:721:2: rule__Abbreviation__Group_2_1_1__2__Impl rule__Abbreviation__Group_2_1_1__3
            {
            pushFollow(FOLLOW_8);
            rule__Abbreviation__Group_2_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Abbreviation__Group_2_1_1__3();

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
    // $ANTLR end "rule__Abbreviation__Group_2_1_1__2"


    // $ANTLR start "rule__Abbreviation__Group_2_1_1__2__Impl"
    // InternalWebMate.g:728:1: rule__Abbreviation__Group_2_1_1__2__Impl : ( ( rule__Abbreviation__ClassesAssignment_2_1_1_2 )* ) ;
    public final void rule__Abbreviation__Group_2_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:732:1: ( ( ( rule__Abbreviation__ClassesAssignment_2_1_1_2 )* ) )
            // InternalWebMate.g:733:1: ( ( rule__Abbreviation__ClassesAssignment_2_1_1_2 )* )
            {
            // InternalWebMate.g:733:1: ( ( rule__Abbreviation__ClassesAssignment_2_1_1_2 )* )
            // InternalWebMate.g:734:2: ( rule__Abbreviation__ClassesAssignment_2_1_1_2 )*
            {
             before(grammarAccess.getAbbreviationAccess().getClassesAssignment_2_1_1_2()); 
            // InternalWebMate.g:735:2: ( rule__Abbreviation__ClassesAssignment_2_1_1_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalWebMate.g:735:3: rule__Abbreviation__ClassesAssignment_2_1_1_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Abbreviation__ClassesAssignment_2_1_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getAbbreviationAccess().getClassesAssignment_2_1_1_2()); 

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
    // $ANTLR end "rule__Abbreviation__Group_2_1_1__2__Impl"


    // $ANTLR start "rule__Abbreviation__Group_2_1_1__3"
    // InternalWebMate.g:743:1: rule__Abbreviation__Group_2_1_1__3 : rule__Abbreviation__Group_2_1_1__3__Impl rule__Abbreviation__Group_2_1_1__4 ;
    public final void rule__Abbreviation__Group_2_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:747:1: ( rule__Abbreviation__Group_2_1_1__3__Impl rule__Abbreviation__Group_2_1_1__4 )
            // InternalWebMate.g:748:2: rule__Abbreviation__Group_2_1_1__3__Impl rule__Abbreviation__Group_2_1_1__4
            {
            pushFollow(FOLLOW_8);
            rule__Abbreviation__Group_2_1_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Abbreviation__Group_2_1_1__4();

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
    // $ANTLR end "rule__Abbreviation__Group_2_1_1__3"


    // $ANTLR start "rule__Abbreviation__Group_2_1_1__3__Impl"
    // InternalWebMate.g:755:1: rule__Abbreviation__Group_2_1_1__3__Impl : ( ( rule__Abbreviation__AttributesAssignment_2_1_1_3 )* ) ;
    public final void rule__Abbreviation__Group_2_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:759:1: ( ( ( rule__Abbreviation__AttributesAssignment_2_1_1_3 )* ) )
            // InternalWebMate.g:760:1: ( ( rule__Abbreviation__AttributesAssignment_2_1_1_3 )* )
            {
            // InternalWebMate.g:760:1: ( ( rule__Abbreviation__AttributesAssignment_2_1_1_3 )* )
            // InternalWebMate.g:761:2: ( rule__Abbreviation__AttributesAssignment_2_1_1_3 )*
            {
             before(grammarAccess.getAbbreviationAccess().getAttributesAssignment_2_1_1_3()); 
            // InternalWebMate.g:762:2: ( rule__Abbreviation__AttributesAssignment_2_1_1_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalWebMate.g:762:3: rule__Abbreviation__AttributesAssignment_2_1_1_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Abbreviation__AttributesAssignment_2_1_1_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getAbbreviationAccess().getAttributesAssignment_2_1_1_3()); 

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
    // $ANTLR end "rule__Abbreviation__Group_2_1_1__3__Impl"


    // $ANTLR start "rule__Abbreviation__Group_2_1_1__4"
    // InternalWebMate.g:770:1: rule__Abbreviation__Group_2_1_1__4 : rule__Abbreviation__Group_2_1_1__4__Impl ;
    public final void rule__Abbreviation__Group_2_1_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:774:1: ( rule__Abbreviation__Group_2_1_1__4__Impl )
            // InternalWebMate.g:775:2: rule__Abbreviation__Group_2_1_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Abbreviation__Group_2_1_1__4__Impl();

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
    // $ANTLR end "rule__Abbreviation__Group_2_1_1__4"


    // $ANTLR start "rule__Abbreviation__Group_2_1_1__4__Impl"
    // InternalWebMate.g:781:1: rule__Abbreviation__Group_2_1_1__4__Impl : ( ( rule__Abbreviation__GroupAssignment_2_1_1_4 )* ) ;
    public final void rule__Abbreviation__Group_2_1_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:785:1: ( ( ( rule__Abbreviation__GroupAssignment_2_1_1_4 )* ) )
            // InternalWebMate.g:786:1: ( ( rule__Abbreviation__GroupAssignment_2_1_1_4 )* )
            {
            // InternalWebMate.g:786:1: ( ( rule__Abbreviation__GroupAssignment_2_1_1_4 )* )
            // InternalWebMate.g:787:2: ( rule__Abbreviation__GroupAssignment_2_1_1_4 )*
            {
             before(grammarAccess.getAbbreviationAccess().getGroupAssignment_2_1_1_4()); 
            // InternalWebMate.g:788:2: ( rule__Abbreviation__GroupAssignment_2_1_1_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalWebMate.g:788:3: rule__Abbreviation__GroupAssignment_2_1_1_4
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Abbreviation__GroupAssignment_2_1_1_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getAbbreviationAccess().getGroupAssignment_2_1_1_4()); 

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
    // $ANTLR end "rule__Abbreviation__Group_2_1_1__4__Impl"


    // $ANTLR start "rule__ID0__Group__0"
    // InternalWebMate.g:797:1: rule__ID0__Group__0 : rule__ID0__Group__0__Impl rule__ID0__Group__1 ;
    public final void rule__ID0__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:801:1: ( rule__ID0__Group__0__Impl rule__ID0__Group__1 )
            // InternalWebMate.g:802:2: rule__ID0__Group__0__Impl rule__ID0__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalWebMate.g:809:1: rule__ID0__Group__0__Impl : ( () ) ;
    public final void rule__ID0__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:813:1: ( ( () ) )
            // InternalWebMate.g:814:1: ( () )
            {
            // InternalWebMate.g:814:1: ( () )
            // InternalWebMate.g:815:2: ()
            {
             before(grammarAccess.getID0Access().getIDAction_0()); 
            // InternalWebMate.g:816:2: ()
            // InternalWebMate.g:816:3: 
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
    // InternalWebMate.g:824:1: rule__ID0__Group__1 : rule__ID0__Group__1__Impl ;
    public final void rule__ID0__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:828:1: ( rule__ID0__Group__1__Impl )
            // InternalWebMate.g:829:2: rule__ID0__Group__1__Impl
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
    // InternalWebMate.g:835:1: rule__ID0__Group__1__Impl : ( ( rule__ID0__Group_1__0 ) ) ;
    public final void rule__ID0__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:839:1: ( ( ( rule__ID0__Group_1__0 ) ) )
            // InternalWebMate.g:840:1: ( ( rule__ID0__Group_1__0 ) )
            {
            // InternalWebMate.g:840:1: ( ( rule__ID0__Group_1__0 ) )
            // InternalWebMate.g:841:2: ( rule__ID0__Group_1__0 )
            {
             before(grammarAccess.getID0Access().getGroup_1()); 
            // InternalWebMate.g:842:2: ( rule__ID0__Group_1__0 )
            // InternalWebMate.g:842:3: rule__ID0__Group_1__0
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
    // InternalWebMate.g:851:1: rule__ID0__Group_1__0 : rule__ID0__Group_1__0__Impl rule__ID0__Group_1__1 ;
    public final void rule__ID0__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:855:1: ( rule__ID0__Group_1__0__Impl rule__ID0__Group_1__1 )
            // InternalWebMate.g:856:2: rule__ID0__Group_1__0__Impl rule__ID0__Group_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalWebMate.g:863:1: rule__ID0__Group_1__0__Impl : ( '#' ) ;
    public final void rule__ID0__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:867:1: ( ( '#' ) )
            // InternalWebMate.g:868:1: ( '#' )
            {
            // InternalWebMate.g:868:1: ( '#' )
            // InternalWebMate.g:869:2: '#'
            {
             before(grammarAccess.getID0Access().getNumberSignKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalWebMate.g:878:1: rule__ID0__Group_1__1 : rule__ID0__Group_1__1__Impl ;
    public final void rule__ID0__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:882:1: ( rule__ID0__Group_1__1__Impl )
            // InternalWebMate.g:883:2: rule__ID0__Group_1__1__Impl
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
    // InternalWebMate.g:889:1: rule__ID0__Group_1__1__Impl : ( ( rule__ID0__IdNameAssignment_1_1 ) ) ;
    public final void rule__ID0__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:893:1: ( ( ( rule__ID0__IdNameAssignment_1_1 ) ) )
            // InternalWebMate.g:894:1: ( ( rule__ID0__IdNameAssignment_1_1 ) )
            {
            // InternalWebMate.g:894:1: ( ( rule__ID0__IdNameAssignment_1_1 ) )
            // InternalWebMate.g:895:2: ( rule__ID0__IdNameAssignment_1_1 )
            {
             before(grammarAccess.getID0Access().getIdNameAssignment_1_1()); 
            // InternalWebMate.g:896:2: ( rule__ID0__IdNameAssignment_1_1 )
            // InternalWebMate.g:896:3: rule__ID0__IdNameAssignment_1_1
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


    // $ANTLR start "rule__Symbol__Group_0__0"
    // InternalWebMate.g:905:1: rule__Symbol__Group_0__0 : rule__Symbol__Group_0__0__Impl rule__Symbol__Group_0__1 ;
    public final void rule__Symbol__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:909:1: ( rule__Symbol__Group_0__0__Impl rule__Symbol__Group_0__1 )
            // InternalWebMate.g:910:2: rule__Symbol__Group_0__0__Impl rule__Symbol__Group_0__1
            {
            pushFollow(FOLLOW_17);
            rule__Symbol__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Symbol__Group_0__1();

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
    // $ANTLR end "rule__Symbol__Group_0__0"


    // $ANTLR start "rule__Symbol__Group_0__0__Impl"
    // InternalWebMate.g:917:1: rule__Symbol__Group_0__0__Impl : ( () ) ;
    public final void rule__Symbol__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:921:1: ( ( () ) )
            // InternalWebMate.g:922:1: ( () )
            {
            // InternalWebMate.g:922:1: ( () )
            // InternalWebMate.g:923:2: ()
            {
             before(grammarAccess.getSymbolAccess().getSymbolAction_0_0()); 
            // InternalWebMate.g:924:2: ()
            // InternalWebMate.g:924:3: 
            {
            }

             after(grammarAccess.getSymbolAccess().getSymbolAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_0__0__Impl"


    // $ANTLR start "rule__Symbol__Group_0__1"
    // InternalWebMate.g:932:1: rule__Symbol__Group_0__1 : rule__Symbol__Group_0__1__Impl ;
    public final void rule__Symbol__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:936:1: ( rule__Symbol__Group_0__1__Impl )
            // InternalWebMate.g:937:2: rule__Symbol__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Symbol__Group_0__1__Impl();

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
    // $ANTLR end "rule__Symbol__Group_0__1"


    // $ANTLR start "rule__Symbol__Group_0__1__Impl"
    // InternalWebMate.g:943:1: rule__Symbol__Group_0__1__Impl : ( ( rule__Symbol__Group_0_1__0 ) ) ;
    public final void rule__Symbol__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:947:1: ( ( ( rule__Symbol__Group_0_1__0 ) ) )
            // InternalWebMate.g:948:1: ( ( rule__Symbol__Group_0_1__0 ) )
            {
            // InternalWebMate.g:948:1: ( ( rule__Symbol__Group_0_1__0 ) )
            // InternalWebMate.g:949:2: ( rule__Symbol__Group_0_1__0 )
            {
             before(grammarAccess.getSymbolAccess().getGroup_0_1()); 
            // InternalWebMate.g:950:2: ( rule__Symbol__Group_0_1__0 )
            // InternalWebMate.g:950:3: rule__Symbol__Group_0_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Symbol__Group_0_1__0();

            state._fsp--;


            }

             after(grammarAccess.getSymbolAccess().getGroup_0_1()); 

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
    // $ANTLR end "rule__Symbol__Group_0__1__Impl"


    // $ANTLR start "rule__Symbol__Group_0_1__0"
    // InternalWebMate.g:959:1: rule__Symbol__Group_0_1__0 : rule__Symbol__Group_0_1__0__Impl rule__Symbol__Group_0_1__1 ;
    public final void rule__Symbol__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:963:1: ( rule__Symbol__Group_0_1__0__Impl rule__Symbol__Group_0_1__1 )
            // InternalWebMate.g:964:2: rule__Symbol__Group_0_1__0__Impl rule__Symbol__Group_0_1__1
            {
            pushFollow(FOLLOW_18);
            rule__Symbol__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Symbol__Group_0_1__1();

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
    // $ANTLR end "rule__Symbol__Group_0_1__0"


    // $ANTLR start "rule__Symbol__Group_0_1__0__Impl"
    // InternalWebMate.g:971:1: rule__Symbol__Group_0_1__0__Impl : ( '*' ) ;
    public final void rule__Symbol__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:975:1: ( ( '*' ) )
            // InternalWebMate.g:976:1: ( '*' )
            {
            // InternalWebMate.g:976:1: ( '*' )
            // InternalWebMate.g:977:2: '*'
            {
             before(grammarAccess.getSymbolAccess().getAsteriskKeyword_0_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSymbolAccess().getAsteriskKeyword_0_1_0()); 

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
    // $ANTLR end "rule__Symbol__Group_0_1__0__Impl"


    // $ANTLR start "rule__Symbol__Group_0_1__1"
    // InternalWebMate.g:986:1: rule__Symbol__Group_0_1__1 : rule__Symbol__Group_0_1__1__Impl ;
    public final void rule__Symbol__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:990:1: ( rule__Symbol__Group_0_1__1__Impl )
            // InternalWebMate.g:991:2: rule__Symbol__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Symbol__Group_0_1__1__Impl();

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
    // $ANTLR end "rule__Symbol__Group_0_1__1"


    // $ANTLR start "rule__Symbol__Group_0_1__1__Impl"
    // InternalWebMate.g:997:1: rule__Symbol__Group_0_1__1__Impl : ( ( rule__Symbol__CountAssignment_0_1_1 ) ) ;
    public final void rule__Symbol__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1001:1: ( ( ( rule__Symbol__CountAssignment_0_1_1 ) ) )
            // InternalWebMate.g:1002:1: ( ( rule__Symbol__CountAssignment_0_1_1 ) )
            {
            // InternalWebMate.g:1002:1: ( ( rule__Symbol__CountAssignment_0_1_1 ) )
            // InternalWebMate.g:1003:2: ( rule__Symbol__CountAssignment_0_1_1 )
            {
             before(grammarAccess.getSymbolAccess().getCountAssignment_0_1_1()); 
            // InternalWebMate.g:1004:2: ( rule__Symbol__CountAssignment_0_1_1 )
            // InternalWebMate.g:1004:3: rule__Symbol__CountAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Symbol__CountAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSymbolAccess().getCountAssignment_0_1_1()); 

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
    // $ANTLR end "rule__Symbol__Group_0_1__1__Impl"


    // $ANTLR start "rule__Symbol__Group_1__0"
    // InternalWebMate.g:1013:1: rule__Symbol__Group_1__0 : rule__Symbol__Group_1__0__Impl rule__Symbol__Group_1__1 ;
    public final void rule__Symbol__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1017:1: ( rule__Symbol__Group_1__0__Impl rule__Symbol__Group_1__1 )
            // InternalWebMate.g:1018:2: rule__Symbol__Group_1__0__Impl rule__Symbol__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Symbol__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Symbol__Group_1__1();

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
    // $ANTLR end "rule__Symbol__Group_1__0"


    // $ANTLR start "rule__Symbol__Group_1__0__Impl"
    // InternalWebMate.g:1025:1: rule__Symbol__Group_1__0__Impl : ( '+' ) ;
    public final void rule__Symbol__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1029:1: ( ( '+' ) )
            // InternalWebMate.g:1030:1: ( '+' )
            {
            // InternalWebMate.g:1030:1: ( '+' )
            // InternalWebMate.g:1031:2: '+'
            {
             before(grammarAccess.getSymbolAccess().getPlusSignKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSymbolAccess().getPlusSignKeyword_1_0()); 

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
    // $ANTLR end "rule__Symbol__Group_1__0__Impl"


    // $ANTLR start "rule__Symbol__Group_1__1"
    // InternalWebMate.g:1040:1: rule__Symbol__Group_1__1 : rule__Symbol__Group_1__1__Impl ;
    public final void rule__Symbol__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1044:1: ( rule__Symbol__Group_1__1__Impl )
            // InternalWebMate.g:1045:2: rule__Symbol__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Symbol__Group_1__1__Impl();

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
    // $ANTLR end "rule__Symbol__Group_1__1"


    // $ANTLR start "rule__Symbol__Group_1__1__Impl"
    // InternalWebMate.g:1051:1: rule__Symbol__Group_1__1__Impl : ( ( rule__Symbol__TagAssignment_1_1 ) ) ;
    public final void rule__Symbol__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1055:1: ( ( ( rule__Symbol__TagAssignment_1_1 ) ) )
            // InternalWebMate.g:1056:1: ( ( rule__Symbol__TagAssignment_1_1 ) )
            {
            // InternalWebMate.g:1056:1: ( ( rule__Symbol__TagAssignment_1_1 ) )
            // InternalWebMate.g:1057:2: ( rule__Symbol__TagAssignment_1_1 )
            {
             before(grammarAccess.getSymbolAccess().getTagAssignment_1_1()); 
            // InternalWebMate.g:1058:2: ( rule__Symbol__TagAssignment_1_1 )
            // InternalWebMate.g:1058:3: rule__Symbol__TagAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Symbol__TagAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSymbolAccess().getTagAssignment_1_1()); 

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
    // $ANTLR end "rule__Symbol__Group_1__1__Impl"


    // $ANTLR start "rule__Symbol__Group_2__0"
    // InternalWebMate.g:1067:1: rule__Symbol__Group_2__0 : rule__Symbol__Group_2__0__Impl rule__Symbol__Group_2__1 ;
    public final void rule__Symbol__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1071:1: ( rule__Symbol__Group_2__0__Impl rule__Symbol__Group_2__1 )
            // InternalWebMate.g:1072:2: rule__Symbol__Group_2__0__Impl rule__Symbol__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Symbol__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Symbol__Group_2__1();

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
    // $ANTLR end "rule__Symbol__Group_2__0"


    // $ANTLR start "rule__Symbol__Group_2__0__Impl"
    // InternalWebMate.g:1079:1: rule__Symbol__Group_2__0__Impl : ( '>' ) ;
    public final void rule__Symbol__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1083:1: ( ( '>' ) )
            // InternalWebMate.g:1084:1: ( '>' )
            {
            // InternalWebMate.g:1084:1: ( '>' )
            // InternalWebMate.g:1085:2: '>'
            {
             before(grammarAccess.getSymbolAccess().getGreaterThanSignKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSymbolAccess().getGreaterThanSignKeyword_2_0()); 

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
    // $ANTLR end "rule__Symbol__Group_2__0__Impl"


    // $ANTLR start "rule__Symbol__Group_2__1"
    // InternalWebMate.g:1094:1: rule__Symbol__Group_2__1 : rule__Symbol__Group_2__1__Impl ;
    public final void rule__Symbol__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1098:1: ( rule__Symbol__Group_2__1__Impl )
            // InternalWebMate.g:1099:2: rule__Symbol__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Symbol__Group_2__1__Impl();

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
    // $ANTLR end "rule__Symbol__Group_2__1"


    // $ANTLR start "rule__Symbol__Group_2__1__Impl"
    // InternalWebMate.g:1105:1: rule__Symbol__Group_2__1__Impl : ( ( rule__Symbol__TagAssignment_2_1 ) ) ;
    public final void rule__Symbol__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1109:1: ( ( ( rule__Symbol__TagAssignment_2_1 ) ) )
            // InternalWebMate.g:1110:1: ( ( rule__Symbol__TagAssignment_2_1 ) )
            {
            // InternalWebMate.g:1110:1: ( ( rule__Symbol__TagAssignment_2_1 ) )
            // InternalWebMate.g:1111:2: ( rule__Symbol__TagAssignment_2_1 )
            {
             before(grammarAccess.getSymbolAccess().getTagAssignment_2_1()); 
            // InternalWebMate.g:1112:2: ( rule__Symbol__TagAssignment_2_1 )
            // InternalWebMate.g:1112:3: rule__Symbol__TagAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Symbol__TagAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSymbolAccess().getTagAssignment_2_1()); 

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
    // $ANTLR end "rule__Symbol__Group_2__1__Impl"


    // $ANTLR start "rule__Symbol__Group_3__0"
    // InternalWebMate.g:1121:1: rule__Symbol__Group_3__0 : rule__Symbol__Group_3__0__Impl rule__Symbol__Group_3__1 ;
    public final void rule__Symbol__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1125:1: ( rule__Symbol__Group_3__0__Impl rule__Symbol__Group_3__1 )
            // InternalWebMate.g:1126:2: rule__Symbol__Group_3__0__Impl rule__Symbol__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Symbol__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Symbol__Group_3__1();

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
    // $ANTLR end "rule__Symbol__Group_3__0"


    // $ANTLR start "rule__Symbol__Group_3__0__Impl"
    // InternalWebMate.g:1133:1: rule__Symbol__Group_3__0__Impl : ( '^' ) ;
    public final void rule__Symbol__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1137:1: ( ( '^' ) )
            // InternalWebMate.g:1138:1: ( '^' )
            {
            // InternalWebMate.g:1138:1: ( '^' )
            // InternalWebMate.g:1139:2: '^'
            {
             before(grammarAccess.getSymbolAccess().getCircumflexAccentKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSymbolAccess().getCircumflexAccentKeyword_3_0()); 

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
    // $ANTLR end "rule__Symbol__Group_3__0__Impl"


    // $ANTLR start "rule__Symbol__Group_3__1"
    // InternalWebMate.g:1148:1: rule__Symbol__Group_3__1 : rule__Symbol__Group_3__1__Impl ;
    public final void rule__Symbol__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1152:1: ( rule__Symbol__Group_3__1__Impl )
            // InternalWebMate.g:1153:2: rule__Symbol__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Symbol__Group_3__1__Impl();

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
    // $ANTLR end "rule__Symbol__Group_3__1"


    // $ANTLR start "rule__Symbol__Group_3__1__Impl"
    // InternalWebMate.g:1159:1: rule__Symbol__Group_3__1__Impl : ( ( rule__Symbol__TagAssignment_3_1 ) ) ;
    public final void rule__Symbol__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1163:1: ( ( ( rule__Symbol__TagAssignment_3_1 ) ) )
            // InternalWebMate.g:1164:1: ( ( rule__Symbol__TagAssignment_3_1 ) )
            {
            // InternalWebMate.g:1164:1: ( ( rule__Symbol__TagAssignment_3_1 ) )
            // InternalWebMate.g:1165:2: ( rule__Symbol__TagAssignment_3_1 )
            {
             before(grammarAccess.getSymbolAccess().getTagAssignment_3_1()); 
            // InternalWebMate.g:1166:2: ( rule__Symbol__TagAssignment_3_1 )
            // InternalWebMate.g:1166:3: rule__Symbol__TagAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Symbol__TagAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSymbolAccess().getTagAssignment_3_1()); 

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
    // $ANTLR end "rule__Symbol__Group_3__1__Impl"


    // $ANTLR start "rule__Tag__Group__0"
    // InternalWebMate.g:1175:1: rule__Tag__Group__0 : rule__Tag__Group__0__Impl rule__Tag__Group__1 ;
    public final void rule__Tag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1179:1: ( rule__Tag__Group__0__Impl rule__Tag__Group__1 )
            // InternalWebMate.g:1180:2: rule__Tag__Group__0__Impl rule__Tag__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalWebMate.g:1187:1: rule__Tag__Group__0__Impl : ( () ) ;
    public final void rule__Tag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1191:1: ( ( () ) )
            // InternalWebMate.g:1192:1: ( () )
            {
            // InternalWebMate.g:1192:1: ( () )
            // InternalWebMate.g:1193:2: ()
            {
             before(grammarAccess.getTagAccess().getTagAction_0()); 
            // InternalWebMate.g:1194:2: ()
            // InternalWebMate.g:1194:3: 
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
    // InternalWebMate.g:1202:1: rule__Tag__Group__1 : rule__Tag__Group__1__Impl rule__Tag__Group__2 ;
    public final void rule__Tag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1206:1: ( rule__Tag__Group__1__Impl rule__Tag__Group__2 )
            // InternalWebMate.g:1207:2: rule__Tag__Group__1__Impl rule__Tag__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Tag__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tag__Group__2();

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
    // InternalWebMate.g:1214:1: rule__Tag__Group__1__Impl : ( ( rule__Tag__TagNameAssignment_1 ) ) ;
    public final void rule__Tag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1218:1: ( ( ( rule__Tag__TagNameAssignment_1 ) ) )
            // InternalWebMate.g:1219:1: ( ( rule__Tag__TagNameAssignment_1 ) )
            {
            // InternalWebMate.g:1219:1: ( ( rule__Tag__TagNameAssignment_1 ) )
            // InternalWebMate.g:1220:2: ( rule__Tag__TagNameAssignment_1 )
            {
             before(grammarAccess.getTagAccess().getTagNameAssignment_1()); 
            // InternalWebMate.g:1221:2: ( rule__Tag__TagNameAssignment_1 )
            // InternalWebMate.g:1221:3: rule__Tag__TagNameAssignment_1
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


    // $ANTLR start "rule__Tag__Group__2"
    // InternalWebMate.g:1229:1: rule__Tag__Group__2 : rule__Tag__Group__2__Impl rule__Tag__Group__3 ;
    public final void rule__Tag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1233:1: ( rule__Tag__Group__2__Impl rule__Tag__Group__3 )
            // InternalWebMate.g:1234:2: rule__Tag__Group__2__Impl rule__Tag__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Tag__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tag__Group__3();

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
    // $ANTLR end "rule__Tag__Group__2"


    // $ANTLR start "rule__Tag__Group__2__Impl"
    // InternalWebMate.g:1241:1: rule__Tag__Group__2__Impl : ( ( rule__Tag__ClassAssignment_2 )* ) ;
    public final void rule__Tag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1245:1: ( ( ( rule__Tag__ClassAssignment_2 )* ) )
            // InternalWebMate.g:1246:1: ( ( rule__Tag__ClassAssignment_2 )* )
            {
            // InternalWebMate.g:1246:1: ( ( rule__Tag__ClassAssignment_2 )* )
            // InternalWebMate.g:1247:2: ( rule__Tag__ClassAssignment_2 )*
            {
             before(grammarAccess.getTagAccess().getClassAssignment_2()); 
            // InternalWebMate.g:1248:2: ( rule__Tag__ClassAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23) ) {
                    int LA13_2 = input.LA(2);

                    if ( (LA13_2==RULE_STRING) ) {
                        alt13=1;
                    }
                    else if ( (LA13_2==RULE_ID) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // InternalWebMate.g:1248:3: rule__Tag__ClassAssignment_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Tag__ClassAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getTagAccess().getClassAssignment_2()); 

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
    // $ANTLR end "rule__Tag__Group__2__Impl"


    // $ANTLR start "rule__Tag__Group__3"
    // InternalWebMate.g:1256:1: rule__Tag__Group__3 : rule__Tag__Group__3__Impl rule__Tag__Group__4 ;
    public final void rule__Tag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1260:1: ( rule__Tag__Group__3__Impl rule__Tag__Group__4 )
            // InternalWebMate.g:1261:2: rule__Tag__Group__3__Impl rule__Tag__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Tag__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tag__Group__4();

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
    // $ANTLR end "rule__Tag__Group__3"


    // $ANTLR start "rule__Tag__Group__3__Impl"
    // InternalWebMate.g:1268:1: rule__Tag__Group__3__Impl : ( ( rule__Tag__IdAssignment_3 )? ) ;
    public final void rule__Tag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1272:1: ( ( ( rule__Tag__IdAssignment_3 )? ) )
            // InternalWebMate.g:1273:1: ( ( rule__Tag__IdAssignment_3 )? )
            {
            // InternalWebMate.g:1273:1: ( ( rule__Tag__IdAssignment_3 )? )
            // InternalWebMate.g:1274:2: ( rule__Tag__IdAssignment_3 )?
            {
             before(grammarAccess.getTagAccess().getIdAssignment_3()); 
            // InternalWebMate.g:1275:2: ( rule__Tag__IdAssignment_3 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==RULE_STRING) ) {
                    alt14=1;
                }
                else if ( (LA14_1==RULE_ID) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalWebMate.g:1275:3: rule__Tag__IdAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tag__IdAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTagAccess().getIdAssignment_3()); 

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
    // $ANTLR end "rule__Tag__Group__3__Impl"


    // $ANTLR start "rule__Tag__Group__4"
    // InternalWebMate.g:1283:1: rule__Tag__Group__4 : rule__Tag__Group__4__Impl ;
    public final void rule__Tag__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1287:1: ( rule__Tag__Group__4__Impl )
            // InternalWebMate.g:1288:2: rule__Tag__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tag__Group__4__Impl();

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
    // $ANTLR end "rule__Tag__Group__4"


    // $ANTLR start "rule__Tag__Group__4__Impl"
    // InternalWebMate.g:1294:1: rule__Tag__Group__4__Impl : ( ( rule__Tag__AttributeAssignment_4 )* ) ;
    public final void rule__Tag__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1298:1: ( ( ( rule__Tag__AttributeAssignment_4 )* ) )
            // InternalWebMate.g:1299:1: ( ( rule__Tag__AttributeAssignment_4 )* )
            {
            // InternalWebMate.g:1299:1: ( ( rule__Tag__AttributeAssignment_4 )* )
            // InternalWebMate.g:1300:2: ( rule__Tag__AttributeAssignment_4 )*
            {
             before(grammarAccess.getTagAccess().getAttributeAssignment_4()); 
            // InternalWebMate.g:1301:2: ( rule__Tag__AttributeAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==24) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==RULE_STRING) ) {
                        int LA15_3 = input.LA(3);

                        if ( (LA15_3==26) ) {
                            int LA15_5 = input.LA(4);

                            if ( (LA15_5==RULE_STRING) ) {
                                int LA15_7 = input.LA(5);

                                if ( (LA15_7==25) ) {
                                    alt15=1;
                                }


                            }
                            else if ( (LA15_5==RULE_ID) ) {
                                int LA15_8 = input.LA(5);

                                if ( (LA15_8==25) ) {
                                    alt15=1;
                                }


                            }


                        }
                        else if ( (LA15_3==25) ) {
                            alt15=1;
                        }


                    }
                    else if ( (LA15_2==RULE_ID) ) {
                        int LA15_4 = input.LA(3);

                        if ( (LA15_4==26) ) {
                            int LA15_5 = input.LA(4);

                            if ( (LA15_5==RULE_STRING) ) {
                                int LA15_7 = input.LA(5);

                                if ( (LA15_7==25) ) {
                                    alt15=1;
                                }


                            }
                            else if ( (LA15_5==RULE_ID) ) {
                                int LA15_8 = input.LA(5);

                                if ( (LA15_8==25) ) {
                                    alt15=1;
                                }


                            }


                        }
                        else if ( (LA15_4==25) ) {
                            alt15=1;
                        }


                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalWebMate.g:1301:3: rule__Tag__AttributeAssignment_4
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Tag__AttributeAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getTagAccess().getAttributeAssignment_4()); 

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
    // $ANTLR end "rule__Tag__Group__4__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // InternalWebMate.g:1310:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1314:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalWebMate.g:1315:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalWebMate.g:1322:1: rule__Class__Group__0__Impl : ( () ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1326:1: ( ( () ) )
            // InternalWebMate.g:1327:1: ( () )
            {
            // InternalWebMate.g:1327:1: ( () )
            // InternalWebMate.g:1328:2: ()
            {
             before(grammarAccess.getClassAccess().getClassAction_0()); 
            // InternalWebMate.g:1329:2: ()
            // InternalWebMate.g:1329:3: 
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
    // InternalWebMate.g:1337:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1341:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalWebMate.g:1342:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalWebMate.g:1349:1: rule__Class__Group__1__Impl : ( '.' ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1353:1: ( ( '.' ) )
            // InternalWebMate.g:1354:1: ( '.' )
            {
            // InternalWebMate.g:1354:1: ( '.' )
            // InternalWebMate.g:1355:2: '.'
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
    // InternalWebMate.g:1364:1: rule__Class__Group__2 : rule__Class__Group__2__Impl ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1368:1: ( rule__Class__Group__2__Impl )
            // InternalWebMate.g:1369:2: rule__Class__Group__2__Impl
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
    // InternalWebMate.g:1375:1: rule__Class__Group__2__Impl : ( ( rule__Class__ClassNameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1379:1: ( ( ( rule__Class__ClassNameAssignment_2 ) ) )
            // InternalWebMate.g:1380:1: ( ( rule__Class__ClassNameAssignment_2 ) )
            {
            // InternalWebMate.g:1380:1: ( ( rule__Class__ClassNameAssignment_2 ) )
            // InternalWebMate.g:1381:2: ( rule__Class__ClassNameAssignment_2 )
            {
             before(grammarAccess.getClassAccess().getClassNameAssignment_2()); 
            // InternalWebMate.g:1382:2: ( rule__Class__ClassNameAssignment_2 )
            // InternalWebMate.g:1382:3: rule__Class__ClassNameAssignment_2
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


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalWebMate.g:1391:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1395:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalWebMate.g:1396:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalWebMate.g:1403:1: rule__Attribute__Group__0__Impl : ( () ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1407:1: ( ( () ) )
            // InternalWebMate.g:1408:1: ( () )
            {
            // InternalWebMate.g:1408:1: ( () )
            // InternalWebMate.g:1409:2: ()
            {
             before(grammarAccess.getAttributeAccess().getAttributeAction_0()); 
            // InternalWebMate.g:1410:2: ()
            // InternalWebMate.g:1410:3: 
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
    // InternalWebMate.g:1418:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1422:1: ( rule__Attribute__Group__1__Impl )
            // InternalWebMate.g:1423:2: rule__Attribute__Group__1__Impl
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
    // InternalWebMate.g:1429:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__Group_1__0 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1433:1: ( ( ( rule__Attribute__Group_1__0 ) ) )
            // InternalWebMate.g:1434:1: ( ( rule__Attribute__Group_1__0 ) )
            {
            // InternalWebMate.g:1434:1: ( ( rule__Attribute__Group_1__0 ) )
            // InternalWebMate.g:1435:2: ( rule__Attribute__Group_1__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup_1()); 
            // InternalWebMate.g:1436:2: ( rule__Attribute__Group_1__0 )
            // InternalWebMate.g:1436:3: rule__Attribute__Group_1__0
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
    // InternalWebMate.g:1445:1: rule__Attribute__Group_1__0 : rule__Attribute__Group_1__0__Impl rule__Attribute__Group_1__1 ;
    public final void rule__Attribute__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1449:1: ( rule__Attribute__Group_1__0__Impl rule__Attribute__Group_1__1 )
            // InternalWebMate.g:1450:2: rule__Attribute__Group_1__0__Impl rule__Attribute__Group_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalWebMate.g:1457:1: rule__Attribute__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Attribute__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1461:1: ( ( '[' ) )
            // InternalWebMate.g:1462:1: ( '[' )
            {
            // InternalWebMate.g:1462:1: ( '[' )
            // InternalWebMate.g:1463:2: '['
            {
             before(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalWebMate.g:1472:1: rule__Attribute__Group_1__1 : rule__Attribute__Group_1__1__Impl rule__Attribute__Group_1__2 ;
    public final void rule__Attribute__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1476:1: ( rule__Attribute__Group_1__1__Impl rule__Attribute__Group_1__2 )
            // InternalWebMate.g:1477:2: rule__Attribute__Group_1__1__Impl rule__Attribute__Group_1__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalWebMate.g:1484:1: rule__Attribute__Group_1__1__Impl : ( ( rule__Attribute__AttributeNameAssignment_1_1 ) ) ;
    public final void rule__Attribute__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1488:1: ( ( ( rule__Attribute__AttributeNameAssignment_1_1 ) ) )
            // InternalWebMate.g:1489:1: ( ( rule__Attribute__AttributeNameAssignment_1_1 ) )
            {
            // InternalWebMate.g:1489:1: ( ( rule__Attribute__AttributeNameAssignment_1_1 ) )
            // InternalWebMate.g:1490:2: ( rule__Attribute__AttributeNameAssignment_1_1 )
            {
             before(grammarAccess.getAttributeAccess().getAttributeNameAssignment_1_1()); 
            // InternalWebMate.g:1491:2: ( rule__Attribute__AttributeNameAssignment_1_1 )
            // InternalWebMate.g:1491:3: rule__Attribute__AttributeNameAssignment_1_1
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
    // InternalWebMate.g:1499:1: rule__Attribute__Group_1__2 : rule__Attribute__Group_1__2__Impl rule__Attribute__Group_1__3 ;
    public final void rule__Attribute__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1503:1: ( rule__Attribute__Group_1__2__Impl rule__Attribute__Group_1__3 )
            // InternalWebMate.g:1504:2: rule__Attribute__Group_1__2__Impl rule__Attribute__Group_1__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalWebMate.g:1511:1: rule__Attribute__Group_1__2__Impl : ( ( rule__Attribute__Group_1_2__0 )? ) ;
    public final void rule__Attribute__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1515:1: ( ( ( rule__Attribute__Group_1_2__0 )? ) )
            // InternalWebMate.g:1516:1: ( ( rule__Attribute__Group_1_2__0 )? )
            {
            // InternalWebMate.g:1516:1: ( ( rule__Attribute__Group_1_2__0 )? )
            // InternalWebMate.g:1517:2: ( rule__Attribute__Group_1_2__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_1_2()); 
            // InternalWebMate.g:1518:2: ( rule__Attribute__Group_1_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalWebMate.g:1518:3: rule__Attribute__Group_1_2__0
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
    // InternalWebMate.g:1526:1: rule__Attribute__Group_1__3 : rule__Attribute__Group_1__3__Impl ;
    public final void rule__Attribute__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1530:1: ( rule__Attribute__Group_1__3__Impl )
            // InternalWebMate.g:1531:2: rule__Attribute__Group_1__3__Impl
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
    // InternalWebMate.g:1537:1: rule__Attribute__Group_1__3__Impl : ( ']' ) ;
    public final void rule__Attribute__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1541:1: ( ( ']' ) )
            // InternalWebMate.g:1542:1: ( ']' )
            {
            // InternalWebMate.g:1542:1: ( ']' )
            // InternalWebMate.g:1543:2: ']'
            {
             before(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_1_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalWebMate.g:1553:1: rule__Attribute__Group_1_2__0 : rule__Attribute__Group_1_2__0__Impl rule__Attribute__Group_1_2__1 ;
    public final void rule__Attribute__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1557:1: ( rule__Attribute__Group_1_2__0__Impl rule__Attribute__Group_1_2__1 )
            // InternalWebMate.g:1558:2: rule__Attribute__Group_1_2__0__Impl rule__Attribute__Group_1_2__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalWebMate.g:1565:1: rule__Attribute__Group_1_2__0__Impl : ( '=' ) ;
    public final void rule__Attribute__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1569:1: ( ( '=' ) )
            // InternalWebMate.g:1570:1: ( '=' )
            {
            // InternalWebMate.g:1570:1: ( '=' )
            // InternalWebMate.g:1571:2: '='
            {
             before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1_2_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalWebMate.g:1580:1: rule__Attribute__Group_1_2__1 : rule__Attribute__Group_1_2__1__Impl ;
    public final void rule__Attribute__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1584:1: ( rule__Attribute__Group_1_2__1__Impl )
            // InternalWebMate.g:1585:2: rule__Attribute__Group_1_2__1__Impl
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
    // InternalWebMate.g:1591:1: rule__Attribute__Group_1_2__1__Impl : ( ( rule__Attribute__AttributeValueAssignment_1_2_1 ) ) ;
    public final void rule__Attribute__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1595:1: ( ( ( rule__Attribute__AttributeValueAssignment_1_2_1 ) ) )
            // InternalWebMate.g:1596:1: ( ( rule__Attribute__AttributeValueAssignment_1_2_1 ) )
            {
            // InternalWebMate.g:1596:1: ( ( rule__Attribute__AttributeValueAssignment_1_2_1 ) )
            // InternalWebMate.g:1597:2: ( rule__Attribute__AttributeValueAssignment_1_2_1 )
            {
             before(grammarAccess.getAttributeAccess().getAttributeValueAssignment_1_2_1()); 
            // InternalWebMate.g:1598:2: ( rule__Attribute__AttributeValueAssignment_1_2_1 )
            // InternalWebMate.g:1598:3: rule__Attribute__AttributeValueAssignment_1_2_1
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


    // $ANTLR start "rule__Group__Group__0"
    // InternalWebMate.g:1607:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1611:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // InternalWebMate.g:1612:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Group__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__1();

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
    // $ANTLR end "rule__Group__Group__0"


    // $ANTLR start "rule__Group__Group__0__Impl"
    // InternalWebMate.g:1619:1: rule__Group__Group__0__Impl : ( () ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1623:1: ( ( () ) )
            // InternalWebMate.g:1624:1: ( () )
            {
            // InternalWebMate.g:1624:1: ( () )
            // InternalWebMate.g:1625:2: ()
            {
             before(grammarAccess.getGroupAccess().getGroupAction_0()); 
            // InternalWebMate.g:1626:2: ()
            // InternalWebMate.g:1626:3: 
            {
            }

             after(grammarAccess.getGroupAccess().getGroupAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__0__Impl"


    // $ANTLR start "rule__Group__Group__1"
    // InternalWebMate.g:1634:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1638:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // InternalWebMate.g:1639:2: rule__Group__Group__1__Impl rule__Group__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Group__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__2();

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
    // $ANTLR end "rule__Group__Group__1"


    // $ANTLR start "rule__Group__Group__1__Impl"
    // InternalWebMate.g:1646:1: rule__Group__Group__1__Impl : ( '(' ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1650:1: ( ( '(' ) )
            // InternalWebMate.g:1651:1: ( '(' )
            {
            // InternalWebMate.g:1651:1: ( '(' )
            // InternalWebMate.g:1652:2: '('
            {
             before(grammarAccess.getGroupAccess().getLeftParenthesisKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Group__Group__1__Impl"


    // $ANTLR start "rule__Group__Group__2"
    // InternalWebMate.g:1661:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1665:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // InternalWebMate.g:1666:2: rule__Group__Group__2__Impl rule__Group__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Group__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__3();

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
    // $ANTLR end "rule__Group__Group__2"


    // $ANTLR start "rule__Group__Group__2__Impl"
    // InternalWebMate.g:1673:1: rule__Group__Group__2__Impl : ( ( ( rule__Group__AbbreviationAssignment_2 ) ) ( ( rule__Group__AbbreviationAssignment_2 )* ) ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1677:1: ( ( ( ( rule__Group__AbbreviationAssignment_2 ) ) ( ( rule__Group__AbbreviationAssignment_2 )* ) ) )
            // InternalWebMate.g:1678:1: ( ( ( rule__Group__AbbreviationAssignment_2 ) ) ( ( rule__Group__AbbreviationAssignment_2 )* ) )
            {
            // InternalWebMate.g:1678:1: ( ( ( rule__Group__AbbreviationAssignment_2 ) ) ( ( rule__Group__AbbreviationAssignment_2 )* ) )
            // InternalWebMate.g:1679:2: ( ( rule__Group__AbbreviationAssignment_2 ) ) ( ( rule__Group__AbbreviationAssignment_2 )* )
            {
            // InternalWebMate.g:1679:2: ( ( rule__Group__AbbreviationAssignment_2 ) )
            // InternalWebMate.g:1680:3: ( rule__Group__AbbreviationAssignment_2 )
            {
             before(grammarAccess.getGroupAccess().getAbbreviationAssignment_2()); 
            // InternalWebMate.g:1681:3: ( rule__Group__AbbreviationAssignment_2 )
            // InternalWebMate.g:1681:4: rule__Group__AbbreviationAssignment_2
            {
            pushFollow(FOLLOW_5);
            rule__Group__AbbreviationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getAbbreviationAssignment_2()); 

            }

            // InternalWebMate.g:1684:2: ( ( rule__Group__AbbreviationAssignment_2 )* )
            // InternalWebMate.g:1685:3: ( rule__Group__AbbreviationAssignment_2 )*
            {
             before(grammarAccess.getGroupAccess().getAbbreviationAssignment_2()); 
            // InternalWebMate.g:1686:3: ( rule__Group__AbbreviationAssignment_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==16) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalWebMate.g:1686:4: rule__Group__AbbreviationAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Group__AbbreviationAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getGroupAccess().getAbbreviationAssignment_2()); 

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
    // $ANTLR end "rule__Group__Group__2__Impl"


    // $ANTLR start "rule__Group__Group__3"
    // InternalWebMate.g:1695:1: rule__Group__Group__3 : rule__Group__Group__3__Impl ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1699:1: ( rule__Group__Group__3__Impl )
            // InternalWebMate.g:1700:2: rule__Group__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group__3__Impl();

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
    // $ANTLR end "rule__Group__Group__3"


    // $ANTLR start "rule__Group__Group__3__Impl"
    // InternalWebMate.g:1706:1: rule__Group__Group__3__Impl : ( ')' ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1710:1: ( ( ')' ) )
            // InternalWebMate.g:1711:1: ( ')' )
            {
            // InternalWebMate.g:1711:1: ( ')' )
            // InternalWebMate.g:1712:2: ')'
            {
             before(grammarAccess.getGroupAccess().getRightParenthesisKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Group__Group__3__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalWebMate.g:1722:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1726:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalWebMate.g:1727:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalWebMate.g:1734:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1738:1: ( ( ( '-' )? ) )
            // InternalWebMate.g:1739:1: ( ( '-' )? )
            {
            // InternalWebMate.g:1739:1: ( ( '-' )? )
            // InternalWebMate.g:1740:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalWebMate.g:1741:2: ( '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalWebMate.g:1741:3: '-'
                    {
                    match(input,29,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalWebMate.g:1749:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1753:1: ( rule__EInt__Group__1__Impl )
            // InternalWebMate.g:1754:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalWebMate.g:1760:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1764:1: ( ( RULE_INT ) )
            // InternalWebMate.g:1765:1: ( RULE_INT )
            {
            // InternalWebMate.g:1765:1: ( RULE_INT )
            // InternalWebMate.g:1766:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__HTML__AbbreviationAssignment_1"
    // InternalWebMate.g:1776:1: rule__HTML__AbbreviationAssignment_1 : ( ruleAbbreviation ) ;
    public final void rule__HTML__AbbreviationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1780:1: ( ( ruleAbbreviation ) )
            // InternalWebMate.g:1781:2: ( ruleAbbreviation )
            {
            // InternalWebMate.g:1781:2: ( ruleAbbreviation )
            // InternalWebMate.g:1782:3: ruleAbbreviation
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


    // $ANTLR start "rule__Abbreviation__AbbreviationAssignment_2_0"
    // InternalWebMate.g:1791:1: rule__Abbreviation__AbbreviationAssignment_2_0 : ( ( ruleEString ) ) ;
    public final void rule__Abbreviation__AbbreviationAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1795:1: ( ( ( ruleEString ) ) )
            // InternalWebMate.g:1796:2: ( ( ruleEString ) )
            {
            // InternalWebMate.g:1796:2: ( ( ruleEString ) )
            // InternalWebMate.g:1797:3: ( ruleEString )
            {
             before(grammarAccess.getAbbreviationAccess().getAbbreviationAbbreviationCrossReference_2_0_0()); 
            // InternalWebMate.g:1798:3: ( ruleEString )
            // InternalWebMate.g:1799:4: ruleEString
            {
             before(grammarAccess.getAbbreviationAccess().getAbbreviationAbbreviationEStringParserRuleCall_2_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAbbreviationAccess().getAbbreviationAbbreviationEStringParserRuleCall_2_0_0_1()); 

            }

             after(grammarAccess.getAbbreviationAccess().getAbbreviationAbbreviationCrossReference_2_0_0()); 

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
    // $ANTLR end "rule__Abbreviation__AbbreviationAssignment_2_0"


    // $ANTLR start "rule__Abbreviation__TagsAssignment_2_1_0"
    // InternalWebMate.g:1810:1: rule__Abbreviation__TagsAssignment_2_1_0 : ( ruleTag ) ;
    public final void rule__Abbreviation__TagsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1814:1: ( ( ruleTag ) )
            // InternalWebMate.g:1815:2: ( ruleTag )
            {
            // InternalWebMate.g:1815:2: ( ruleTag )
            // InternalWebMate.g:1816:3: ruleTag
            {
             before(grammarAccess.getAbbreviationAccess().getTagsTagParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getAbbreviationAccess().getTagsTagParserRuleCall_2_1_0_0()); 

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
    // $ANTLR end "rule__Abbreviation__TagsAssignment_2_1_0"


    // $ANTLR start "rule__Abbreviation__IdsAssignment_2_1_1_0"
    // InternalWebMate.g:1825:1: rule__Abbreviation__IdsAssignment_2_1_1_0 : ( ruleID0 ) ;
    public final void rule__Abbreviation__IdsAssignment_2_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1829:1: ( ( ruleID0 ) )
            // InternalWebMate.g:1830:2: ( ruleID0 )
            {
            // InternalWebMate.g:1830:2: ( ruleID0 )
            // InternalWebMate.g:1831:3: ruleID0
            {
             before(grammarAccess.getAbbreviationAccess().getIdsID0ParserRuleCall_2_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleID0();

            state._fsp--;

             after(grammarAccess.getAbbreviationAccess().getIdsID0ParserRuleCall_2_1_1_0_0()); 

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
    // $ANTLR end "rule__Abbreviation__IdsAssignment_2_1_1_0"


    // $ANTLR start "rule__Abbreviation__SymbolsAssignment_2_1_1_1"
    // InternalWebMate.g:1840:1: rule__Abbreviation__SymbolsAssignment_2_1_1_1 : ( ruleSymbol ) ;
    public final void rule__Abbreviation__SymbolsAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1844:1: ( ( ruleSymbol ) )
            // InternalWebMate.g:1845:2: ( ruleSymbol )
            {
            // InternalWebMate.g:1845:2: ( ruleSymbol )
            // InternalWebMate.g:1846:3: ruleSymbol
            {
             before(grammarAccess.getAbbreviationAccess().getSymbolsSymbolParserRuleCall_2_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSymbol();

            state._fsp--;

             after(grammarAccess.getAbbreviationAccess().getSymbolsSymbolParserRuleCall_2_1_1_1_0()); 

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
    // $ANTLR end "rule__Abbreviation__SymbolsAssignment_2_1_1_1"


    // $ANTLR start "rule__Abbreviation__ClassesAssignment_2_1_1_2"
    // InternalWebMate.g:1855:1: rule__Abbreviation__ClassesAssignment_2_1_1_2 : ( ruleClass ) ;
    public final void rule__Abbreviation__ClassesAssignment_2_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1859:1: ( ( ruleClass ) )
            // InternalWebMate.g:1860:2: ( ruleClass )
            {
            // InternalWebMate.g:1860:2: ( ruleClass )
            // InternalWebMate.g:1861:3: ruleClass
            {
             before(grammarAccess.getAbbreviationAccess().getClassesClassParserRuleCall_2_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getAbbreviationAccess().getClassesClassParserRuleCall_2_1_1_2_0()); 

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
    // $ANTLR end "rule__Abbreviation__ClassesAssignment_2_1_1_2"


    // $ANTLR start "rule__Abbreviation__AttributesAssignment_2_1_1_3"
    // InternalWebMate.g:1870:1: rule__Abbreviation__AttributesAssignment_2_1_1_3 : ( ruleAttribute ) ;
    public final void rule__Abbreviation__AttributesAssignment_2_1_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1874:1: ( ( ruleAttribute ) )
            // InternalWebMate.g:1875:2: ( ruleAttribute )
            {
            // InternalWebMate.g:1875:2: ( ruleAttribute )
            // InternalWebMate.g:1876:3: ruleAttribute
            {
             before(grammarAccess.getAbbreviationAccess().getAttributesAttributeParserRuleCall_2_1_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAbbreviationAccess().getAttributesAttributeParserRuleCall_2_1_1_3_0()); 

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
    // $ANTLR end "rule__Abbreviation__AttributesAssignment_2_1_1_3"


    // $ANTLR start "rule__Abbreviation__GroupAssignment_2_1_1_4"
    // InternalWebMate.g:1885:1: rule__Abbreviation__GroupAssignment_2_1_1_4 : ( ruleGroup ) ;
    public final void rule__Abbreviation__GroupAssignment_2_1_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1889:1: ( ( ruleGroup ) )
            // InternalWebMate.g:1890:2: ( ruleGroup )
            {
            // InternalWebMate.g:1890:2: ( ruleGroup )
            // InternalWebMate.g:1891:3: ruleGroup
            {
             before(grammarAccess.getAbbreviationAccess().getGroupGroupParserRuleCall_2_1_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getAbbreviationAccess().getGroupGroupParserRuleCall_2_1_1_4_0()); 

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
    // $ANTLR end "rule__Abbreviation__GroupAssignment_2_1_1_4"


    // $ANTLR start "rule__ID0__IdNameAssignment_1_1"
    // InternalWebMate.g:1900:1: rule__ID0__IdNameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__ID0__IdNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1904:1: ( ( ruleEString ) )
            // InternalWebMate.g:1905:2: ( ruleEString )
            {
            // InternalWebMate.g:1905:2: ( ruleEString )
            // InternalWebMate.g:1906:3: ruleEString
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


    // $ANTLR start "rule__Symbol__CountAssignment_0_1_1"
    // InternalWebMate.g:1915:1: rule__Symbol__CountAssignment_0_1_1 : ( ruleEInt ) ;
    public final void rule__Symbol__CountAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1919:1: ( ( ruleEInt ) )
            // InternalWebMate.g:1920:2: ( ruleEInt )
            {
            // InternalWebMate.g:1920:2: ( ruleEInt )
            // InternalWebMate.g:1921:3: ruleEInt
            {
             before(grammarAccess.getSymbolAccess().getCountEIntParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getSymbolAccess().getCountEIntParserRuleCall_0_1_1_0()); 

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
    // $ANTLR end "rule__Symbol__CountAssignment_0_1_1"


    // $ANTLR start "rule__Symbol__TagAssignment_1_1"
    // InternalWebMate.g:1930:1: rule__Symbol__TagAssignment_1_1 : ( ruleTag ) ;
    public final void rule__Symbol__TagAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1934:1: ( ( ruleTag ) )
            // InternalWebMate.g:1935:2: ( ruleTag )
            {
            // InternalWebMate.g:1935:2: ( ruleTag )
            // InternalWebMate.g:1936:3: ruleTag
            {
             before(grammarAccess.getSymbolAccess().getTagTagParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getSymbolAccess().getTagTagParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Symbol__TagAssignment_1_1"


    // $ANTLR start "rule__Symbol__TagAssignment_2_1"
    // InternalWebMate.g:1945:1: rule__Symbol__TagAssignment_2_1 : ( ruleTag ) ;
    public final void rule__Symbol__TagAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1949:1: ( ( ruleTag ) )
            // InternalWebMate.g:1950:2: ( ruleTag )
            {
            // InternalWebMate.g:1950:2: ( ruleTag )
            // InternalWebMate.g:1951:3: ruleTag
            {
             before(grammarAccess.getSymbolAccess().getTagTagParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getSymbolAccess().getTagTagParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Symbol__TagAssignment_2_1"


    // $ANTLR start "rule__Symbol__TagAssignment_3_1"
    // InternalWebMate.g:1960:1: rule__Symbol__TagAssignment_3_1 : ( ruleTag ) ;
    public final void rule__Symbol__TagAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1964:1: ( ( ruleTag ) )
            // InternalWebMate.g:1965:2: ( ruleTag )
            {
            // InternalWebMate.g:1965:2: ( ruleTag )
            // InternalWebMate.g:1966:3: ruleTag
            {
             before(grammarAccess.getSymbolAccess().getTagTagParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getSymbolAccess().getTagTagParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Symbol__TagAssignment_3_1"


    // $ANTLR start "rule__Tag__TagNameAssignment_1"
    // InternalWebMate.g:1975:1: rule__Tag__TagNameAssignment_1 : ( ruleHTMLTag ) ;
    public final void rule__Tag__TagNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1979:1: ( ( ruleHTMLTag ) )
            // InternalWebMate.g:1980:2: ( ruleHTMLTag )
            {
            // InternalWebMate.g:1980:2: ( ruleHTMLTag )
            // InternalWebMate.g:1981:3: ruleHTMLTag
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


    // $ANTLR start "rule__Tag__ClassAssignment_2"
    // InternalWebMate.g:1990:1: rule__Tag__ClassAssignment_2 : ( ruleClass ) ;
    public final void rule__Tag__ClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1994:1: ( ( ruleClass ) )
            // InternalWebMate.g:1995:2: ( ruleClass )
            {
            // InternalWebMate.g:1995:2: ( ruleClass )
            // InternalWebMate.g:1996:3: ruleClass
            {
             before(grammarAccess.getTagAccess().getClassClassParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getTagAccess().getClassClassParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Tag__ClassAssignment_2"


    // $ANTLR start "rule__Tag__IdAssignment_3"
    // InternalWebMate.g:2005:1: rule__Tag__IdAssignment_3 : ( ruleID0 ) ;
    public final void rule__Tag__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:2009:1: ( ( ruleID0 ) )
            // InternalWebMate.g:2010:2: ( ruleID0 )
            {
            // InternalWebMate.g:2010:2: ( ruleID0 )
            // InternalWebMate.g:2011:3: ruleID0
            {
             before(grammarAccess.getTagAccess().getIdID0ParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleID0();

            state._fsp--;

             after(grammarAccess.getTagAccess().getIdID0ParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Tag__IdAssignment_3"


    // $ANTLR start "rule__Tag__AttributeAssignment_4"
    // InternalWebMate.g:2020:1: rule__Tag__AttributeAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Tag__AttributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:2024:1: ( ( ruleAttribute ) )
            // InternalWebMate.g:2025:2: ( ruleAttribute )
            {
            // InternalWebMate.g:2025:2: ( ruleAttribute )
            // InternalWebMate.g:2026:3: ruleAttribute
            {
             before(grammarAccess.getTagAccess().getAttributeAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getTagAccess().getAttributeAttributeParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Tag__AttributeAssignment_4"


    // $ANTLR start "rule__Class__ClassNameAssignment_2"
    // InternalWebMate.g:2035:1: rule__Class__ClassNameAssignment_2 : ( ruleEString ) ;
    public final void rule__Class__ClassNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:2039:1: ( ( ruleEString ) )
            // InternalWebMate.g:2040:2: ( ruleEString )
            {
            // InternalWebMate.g:2040:2: ( ruleEString )
            // InternalWebMate.g:2041:3: ruleEString
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


    // $ANTLR start "rule__Attribute__AttributeNameAssignment_1_1"
    // InternalWebMate.g:2050:1: rule__Attribute__AttributeNameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__Attribute__AttributeNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:2054:1: ( ( ruleEString ) )
            // InternalWebMate.g:2055:2: ( ruleEString )
            {
            // InternalWebMate.g:2055:2: ( ruleEString )
            // InternalWebMate.g:2056:3: ruleEString
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
    // InternalWebMate.g:2065:1: rule__Attribute__AttributeValueAssignment_1_2_1 : ( ruleEString ) ;
    public final void rule__Attribute__AttributeValueAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:2069:1: ( ( ruleEString ) )
            // InternalWebMate.g:2070:2: ( ruleEString )
            {
            // InternalWebMate.g:2070:2: ( ruleEString )
            // InternalWebMate.g:2071:3: ruleEString
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


    // $ANTLR start "rule__Group__AbbreviationAssignment_2"
    // InternalWebMate.g:2080:1: rule__Group__AbbreviationAssignment_2 : ( ruleAbbreviation ) ;
    public final void rule__Group__AbbreviationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:2084:1: ( ( ruleAbbreviation ) )
            // InternalWebMate.g:2085:2: ( ruleAbbreviation )
            {
            // InternalWebMate.g:2085:2: ( ruleAbbreviation )
            // InternalWebMate.g:2086:3: ruleAbbreviation
            {
             before(grammarAccess.getGroupAccess().getAbbreviationAbbreviationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAbbreviation();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getAbbreviationAbbreviationParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Group__AbbreviationAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000F830L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000009FC0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000000F832L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000780002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001840000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});

}