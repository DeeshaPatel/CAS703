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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'plus'", "'multiply'", "'dot'", "'hash'", "'greaterthan'", "'caret'", "'div'", "'h1'", "'p'", "'ul'", "'li'", "'{'", "'}'", "'#'", "'*'", "'+'", "'>'", "'^'", "'.'", "'['", "']'", "'='", "'('", "')'", "'-'"
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


    // $ANTLR start "ruleValidSymbol"
    // InternalWebMate.g:303:1: ruleValidSymbol : ( ( rule__ValidSymbol__Alternatives ) ) ;
    public final void ruleValidSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:307:1: ( ( ( rule__ValidSymbol__Alternatives ) ) )
            // InternalWebMate.g:308:2: ( ( rule__ValidSymbol__Alternatives ) )
            {
            // InternalWebMate.g:308:2: ( ( rule__ValidSymbol__Alternatives ) )
            // InternalWebMate.g:309:3: ( rule__ValidSymbol__Alternatives )
            {
             before(grammarAccess.getValidSymbolAccess().getAlternatives()); 
            // InternalWebMate.g:310:3: ( rule__ValidSymbol__Alternatives )
            // InternalWebMate.g:310:4: rule__ValidSymbol__Alternatives
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
    // InternalWebMate.g:319:1: ruleHTMLTag : ( ( rule__HTMLTag__Alternatives ) ) ;
    public final void ruleHTMLTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:323:1: ( ( ( rule__HTMLTag__Alternatives ) ) )
            // InternalWebMate.g:324:2: ( ( rule__HTMLTag__Alternatives ) )
            {
            // InternalWebMate.g:324:2: ( ( rule__HTMLTag__Alternatives ) )
            // InternalWebMate.g:325:3: ( rule__HTMLTag__Alternatives )
            {
             before(grammarAccess.getHTMLTagAccess().getAlternatives()); 
            // InternalWebMate.g:326:3: ( rule__HTMLTag__Alternatives )
            // InternalWebMate.g:326:4: rule__HTMLTag__Alternatives
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
    // InternalWebMate.g:334:1: rule__Abbreviation__Alternatives_2 : ( ( ( rule__Abbreviation__AbbreviationAssignment_2_0 )* ) | ( ( rule__Abbreviation__Group_2_1__0 ) ) );
    public final void rule__Abbreviation__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:338:1: ( ( ( rule__Abbreviation__AbbreviationAssignment_2_0 )* ) | ( ( rule__Abbreviation__Group_2_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)||LA2_0==23) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=17 && LA2_0<=21)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalWebMate.g:339:2: ( ( rule__Abbreviation__AbbreviationAssignment_2_0 )* )
                    {
                    // InternalWebMate.g:339:2: ( ( rule__Abbreviation__AbbreviationAssignment_2_0 )* )
                    // InternalWebMate.g:340:3: ( rule__Abbreviation__AbbreviationAssignment_2_0 )*
                    {
                     before(grammarAccess.getAbbreviationAccess().getAbbreviationAssignment_2_0()); 
                    // InternalWebMate.g:341:3: ( rule__Abbreviation__AbbreviationAssignment_2_0 )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalWebMate.g:341:4: rule__Abbreviation__AbbreviationAssignment_2_0
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
                    // InternalWebMate.g:345:2: ( ( rule__Abbreviation__Group_2_1__0 ) )
                    {
                    // InternalWebMate.g:345:2: ( ( rule__Abbreviation__Group_2_1__0 ) )
                    // InternalWebMate.g:346:3: ( rule__Abbreviation__Group_2_1__0 )
                    {
                     before(grammarAccess.getAbbreviationAccess().getGroup_2_1()); 
                    // InternalWebMate.g:347:3: ( rule__Abbreviation__Group_2_1__0 )
                    // InternalWebMate.g:347:4: rule__Abbreviation__Group_2_1__0
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
    // InternalWebMate.g:355:1: rule__Symbol__Alternatives : ( ( ( rule__Symbol__Group_0__0 ) ) | ( ( rule__Symbol__Group_1__0 ) ) | ( ( rule__Symbol__Group_2__0 ) ) | ( ( rule__Symbol__Group_3__0 ) ) | ( ( rule__Symbol__SymAssignment_4 ) ) );
    public final void rule__Symbol__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:359:1: ( ( ( rule__Symbol__Group_0__0 ) ) | ( ( rule__Symbol__Group_1__0 ) ) | ( ( rule__Symbol__Group_2__0 ) ) | ( ( rule__Symbol__Group_3__0 ) ) | ( ( rule__Symbol__SymAssignment_4 ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt3=1;
                }
                break;
            case 26:
                {
                alt3=2;
                }
                break;
            case 27:
                {
                alt3=3;
                }
                break;
            case 28:
                {
                alt3=4;
                }
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalWebMate.g:360:2: ( ( rule__Symbol__Group_0__0 ) )
                    {
                    // InternalWebMate.g:360:2: ( ( rule__Symbol__Group_0__0 ) )
                    // InternalWebMate.g:361:3: ( rule__Symbol__Group_0__0 )
                    {
                     before(grammarAccess.getSymbolAccess().getGroup_0()); 
                    // InternalWebMate.g:362:3: ( rule__Symbol__Group_0__0 )
                    // InternalWebMate.g:362:4: rule__Symbol__Group_0__0
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
                    // InternalWebMate.g:366:2: ( ( rule__Symbol__Group_1__0 ) )
                    {
                    // InternalWebMate.g:366:2: ( ( rule__Symbol__Group_1__0 ) )
                    // InternalWebMate.g:367:3: ( rule__Symbol__Group_1__0 )
                    {
                     before(grammarAccess.getSymbolAccess().getGroup_1()); 
                    // InternalWebMate.g:368:3: ( rule__Symbol__Group_1__0 )
                    // InternalWebMate.g:368:4: rule__Symbol__Group_1__0
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
                    // InternalWebMate.g:372:2: ( ( rule__Symbol__Group_2__0 ) )
                    {
                    // InternalWebMate.g:372:2: ( ( rule__Symbol__Group_2__0 ) )
                    // InternalWebMate.g:373:3: ( rule__Symbol__Group_2__0 )
                    {
                     before(grammarAccess.getSymbolAccess().getGroup_2()); 
                    // InternalWebMate.g:374:3: ( rule__Symbol__Group_2__0 )
                    // InternalWebMate.g:374:4: rule__Symbol__Group_2__0
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
                    // InternalWebMate.g:378:2: ( ( rule__Symbol__Group_3__0 ) )
                    {
                    // InternalWebMate.g:378:2: ( ( rule__Symbol__Group_3__0 ) )
                    // InternalWebMate.g:379:3: ( rule__Symbol__Group_3__0 )
                    {
                     before(grammarAccess.getSymbolAccess().getGroup_3()); 
                    // InternalWebMate.g:380:3: ( rule__Symbol__Group_3__0 )
                    // InternalWebMate.g:380:4: rule__Symbol__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Symbol__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSymbolAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalWebMate.g:384:2: ( ( rule__Symbol__SymAssignment_4 ) )
                    {
                    // InternalWebMate.g:384:2: ( ( rule__Symbol__SymAssignment_4 ) )
                    // InternalWebMate.g:385:3: ( rule__Symbol__SymAssignment_4 )
                    {
                     before(grammarAccess.getSymbolAccess().getSymAssignment_4()); 
                    // InternalWebMate.g:386:3: ( rule__Symbol__SymAssignment_4 )
                    // InternalWebMate.g:386:4: rule__Symbol__SymAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Symbol__SymAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getSymbolAccess().getSymAssignment_4()); 

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
    // InternalWebMate.g:394:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:398:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalWebMate.g:399:2: ( RULE_STRING )
                    {
                    // InternalWebMate.g:399:2: ( RULE_STRING )
                    // InternalWebMate.g:400:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebMate.g:405:2: ( RULE_ID )
                    {
                    // InternalWebMate.g:405:2: ( RULE_ID )
                    // InternalWebMate.g:406:3: RULE_ID
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


    // $ANTLR start "rule__ValidSymbol__Alternatives"
    // InternalWebMate.g:415:1: rule__ValidSymbol__Alternatives : ( ( ( 'plus' ) ) | ( ( 'multiply' ) ) | ( ( 'dot' ) ) | ( ( 'hash' ) ) | ( ( 'greaterthan' ) ) | ( ( 'caret' ) ) );
    public final void rule__ValidSymbol__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:419:1: ( ( ( 'plus' ) ) | ( ( 'multiply' ) ) | ( ( 'dot' ) ) | ( ( 'hash' ) ) | ( ( 'greaterthan' ) ) | ( ( 'caret' ) ) )
            int alt5=6;
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
            case 16:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalWebMate.g:420:2: ( ( 'plus' ) )
                    {
                    // InternalWebMate.g:420:2: ( ( 'plus' ) )
                    // InternalWebMate.g:421:3: ( 'plus' )
                    {
                     before(grammarAccess.getValidSymbolAccess().getPlusEnumLiteralDeclaration_0()); 
                    // InternalWebMate.g:422:3: ( 'plus' )
                    // InternalWebMate.g:422:4: 'plus'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getValidSymbolAccess().getPlusEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebMate.g:426:2: ( ( 'multiply' ) )
                    {
                    // InternalWebMate.g:426:2: ( ( 'multiply' ) )
                    // InternalWebMate.g:427:3: ( 'multiply' )
                    {
                     before(grammarAccess.getValidSymbolAccess().getMultiplyEnumLiteralDeclaration_1()); 
                    // InternalWebMate.g:428:3: ( 'multiply' )
                    // InternalWebMate.g:428:4: 'multiply'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getValidSymbolAccess().getMultiplyEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWebMate.g:432:2: ( ( 'dot' ) )
                    {
                    // InternalWebMate.g:432:2: ( ( 'dot' ) )
                    // InternalWebMate.g:433:3: ( 'dot' )
                    {
                     before(grammarAccess.getValidSymbolAccess().getDotEnumLiteralDeclaration_2()); 
                    // InternalWebMate.g:434:3: ( 'dot' )
                    // InternalWebMate.g:434:4: 'dot'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getValidSymbolAccess().getDotEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalWebMate.g:438:2: ( ( 'hash' ) )
                    {
                    // InternalWebMate.g:438:2: ( ( 'hash' ) )
                    // InternalWebMate.g:439:3: ( 'hash' )
                    {
                     before(grammarAccess.getValidSymbolAccess().getHashEnumLiteralDeclaration_3()); 
                    // InternalWebMate.g:440:3: ( 'hash' )
                    // InternalWebMate.g:440:4: 'hash'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getValidSymbolAccess().getHashEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalWebMate.g:444:2: ( ( 'greaterthan' ) )
                    {
                    // InternalWebMate.g:444:2: ( ( 'greaterthan' ) )
                    // InternalWebMate.g:445:3: ( 'greaterthan' )
                    {
                     before(grammarAccess.getValidSymbolAccess().getGreaterthanEnumLiteralDeclaration_4()); 
                    // InternalWebMate.g:446:3: ( 'greaterthan' )
                    // InternalWebMate.g:446:4: 'greaterthan'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getValidSymbolAccess().getGreaterthanEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalWebMate.g:450:2: ( ( 'caret' ) )
                    {
                    // InternalWebMate.g:450:2: ( ( 'caret' ) )
                    // InternalWebMate.g:451:3: ( 'caret' )
                    {
                     before(grammarAccess.getValidSymbolAccess().getCaretEnumLiteralDeclaration_5()); 
                    // InternalWebMate.g:452:3: ( 'caret' )
                    // InternalWebMate.g:452:4: 'caret'
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
    // InternalWebMate.g:460:1: rule__HTMLTag__Alternatives : ( ( ( 'div' ) ) | ( ( 'h1' ) ) | ( ( 'p' ) ) | ( ( 'ul' ) ) | ( ( 'li' ) ) );
    public final void rule__HTMLTag__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:464:1: ( ( ( 'div' ) ) | ( ( 'h1' ) ) | ( ( 'p' ) ) | ( ( 'ul' ) ) | ( ( 'li' ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 18:
                {
                alt6=2;
                }
                break;
            case 19:
                {
                alt6=3;
                }
                break;
            case 20:
                {
                alt6=4;
                }
                break;
            case 21:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalWebMate.g:465:2: ( ( 'div' ) )
                    {
                    // InternalWebMate.g:465:2: ( ( 'div' ) )
                    // InternalWebMate.g:466:3: ( 'div' )
                    {
                     before(grammarAccess.getHTMLTagAccess().getDivEnumLiteralDeclaration_0()); 
                    // InternalWebMate.g:467:3: ( 'div' )
                    // InternalWebMate.g:467:4: 'div'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getHTMLTagAccess().getDivEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebMate.g:471:2: ( ( 'h1' ) )
                    {
                    // InternalWebMate.g:471:2: ( ( 'h1' ) )
                    // InternalWebMate.g:472:3: ( 'h1' )
                    {
                     before(grammarAccess.getHTMLTagAccess().getH1EnumLiteralDeclaration_1()); 
                    // InternalWebMate.g:473:3: ( 'h1' )
                    // InternalWebMate.g:473:4: 'h1'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getHTMLTagAccess().getH1EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWebMate.g:477:2: ( ( 'p' ) )
                    {
                    // InternalWebMate.g:477:2: ( ( 'p' ) )
                    // InternalWebMate.g:478:3: ( 'p' )
                    {
                     before(grammarAccess.getHTMLTagAccess().getPEnumLiteralDeclaration_2()); 
                    // InternalWebMate.g:479:3: ( 'p' )
                    // InternalWebMate.g:479:4: 'p'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getHTMLTagAccess().getPEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalWebMate.g:483:2: ( ( 'ul' ) )
                    {
                    // InternalWebMate.g:483:2: ( ( 'ul' ) )
                    // InternalWebMate.g:484:3: ( 'ul' )
                    {
                     before(grammarAccess.getHTMLTagAccess().getUlEnumLiteralDeclaration_3()); 
                    // InternalWebMate.g:485:3: ( 'ul' )
                    // InternalWebMate.g:485:4: 'ul'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getHTMLTagAccess().getUlEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalWebMate.g:489:2: ( ( 'li' ) )
                    {
                    // InternalWebMate.g:489:2: ( ( 'li' ) )
                    // InternalWebMate.g:490:3: ( 'li' )
                    {
                     before(grammarAccess.getHTMLTagAccess().getLiEnumLiteralDeclaration_4()); 
                    // InternalWebMate.g:491:3: ( 'li' )
                    // InternalWebMate.g:491:4: 'li'
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
    // InternalWebMate.g:499:1: rule__HTML__Group__0 : rule__HTML__Group__0__Impl rule__HTML__Group__1 ;
    public final void rule__HTML__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:503:1: ( rule__HTML__Group__0__Impl rule__HTML__Group__1 )
            // InternalWebMate.g:504:2: rule__HTML__Group__0__Impl rule__HTML__Group__1
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
    // InternalWebMate.g:511:1: rule__HTML__Group__0__Impl : ( () ) ;
    public final void rule__HTML__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:515:1: ( ( () ) )
            // InternalWebMate.g:516:1: ( () )
            {
            // InternalWebMate.g:516:1: ( () )
            // InternalWebMate.g:517:2: ()
            {
             before(grammarAccess.getHTMLAccess().getHTMLAction_0()); 
            // InternalWebMate.g:518:2: ()
            // InternalWebMate.g:518:3: 
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
    // InternalWebMate.g:526:1: rule__HTML__Group__1 : rule__HTML__Group__1__Impl ;
    public final void rule__HTML__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:530:1: ( rule__HTML__Group__1__Impl )
            // InternalWebMate.g:531:2: rule__HTML__Group__1__Impl
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
    // InternalWebMate.g:537:1: rule__HTML__Group__1__Impl : ( ( ( rule__HTML__AbbreviationAssignment_1 ) ) ( ( rule__HTML__AbbreviationAssignment_1 )* ) ) ;
    public final void rule__HTML__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:541:1: ( ( ( ( rule__HTML__AbbreviationAssignment_1 ) ) ( ( rule__HTML__AbbreviationAssignment_1 )* ) ) )
            // InternalWebMate.g:542:1: ( ( ( rule__HTML__AbbreviationAssignment_1 ) ) ( ( rule__HTML__AbbreviationAssignment_1 )* ) )
            {
            // InternalWebMate.g:542:1: ( ( ( rule__HTML__AbbreviationAssignment_1 ) ) ( ( rule__HTML__AbbreviationAssignment_1 )* ) )
            // InternalWebMate.g:543:2: ( ( rule__HTML__AbbreviationAssignment_1 ) ) ( ( rule__HTML__AbbreviationAssignment_1 )* )
            {
            // InternalWebMate.g:543:2: ( ( rule__HTML__AbbreviationAssignment_1 ) )
            // InternalWebMate.g:544:3: ( rule__HTML__AbbreviationAssignment_1 )
            {
             before(grammarAccess.getHTMLAccess().getAbbreviationAssignment_1()); 
            // InternalWebMate.g:545:3: ( rule__HTML__AbbreviationAssignment_1 )
            // InternalWebMate.g:545:4: rule__HTML__AbbreviationAssignment_1
            {
            pushFollow(FOLLOW_5);
            rule__HTML__AbbreviationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHTMLAccess().getAbbreviationAssignment_1()); 

            }

            // InternalWebMate.g:548:2: ( ( rule__HTML__AbbreviationAssignment_1 )* )
            // InternalWebMate.g:549:3: ( rule__HTML__AbbreviationAssignment_1 )*
            {
             before(grammarAccess.getHTMLAccess().getAbbreviationAssignment_1()); 
            // InternalWebMate.g:550:3: ( rule__HTML__AbbreviationAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalWebMate.g:550:4: rule__HTML__AbbreviationAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__HTML__AbbreviationAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalWebMate.g:560:1: rule__Abbreviation__Group__0 : rule__Abbreviation__Group__0__Impl rule__Abbreviation__Group__1 ;
    public final void rule__Abbreviation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:564:1: ( rule__Abbreviation__Group__0__Impl rule__Abbreviation__Group__1 )
            // InternalWebMate.g:565:2: rule__Abbreviation__Group__0__Impl rule__Abbreviation__Group__1
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
    // InternalWebMate.g:572:1: rule__Abbreviation__Group__0__Impl : ( () ) ;
    public final void rule__Abbreviation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:576:1: ( ( () ) )
            // InternalWebMate.g:577:1: ( () )
            {
            // InternalWebMate.g:577:1: ( () )
            // InternalWebMate.g:578:2: ()
            {
             before(grammarAccess.getAbbreviationAccess().getAbbreviationAction_0()); 
            // InternalWebMate.g:579:2: ()
            // InternalWebMate.g:579:3: 
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
    // InternalWebMate.g:587:1: rule__Abbreviation__Group__1 : rule__Abbreviation__Group__1__Impl rule__Abbreviation__Group__2 ;
    public final void rule__Abbreviation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:591:1: ( rule__Abbreviation__Group__1__Impl rule__Abbreviation__Group__2 )
            // InternalWebMate.g:592:2: rule__Abbreviation__Group__1__Impl rule__Abbreviation__Group__2
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
    // InternalWebMate.g:599:1: rule__Abbreviation__Group__1__Impl : ( '{' ) ;
    public final void rule__Abbreviation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:603:1: ( ( '{' ) )
            // InternalWebMate.g:604:1: ( '{' )
            {
            // InternalWebMate.g:604:1: ( '{' )
            // InternalWebMate.g:605:2: '{'
            {
             before(grammarAccess.getAbbreviationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalWebMate.g:614:1: rule__Abbreviation__Group__2 : rule__Abbreviation__Group__2__Impl rule__Abbreviation__Group__3 ;
    public final void rule__Abbreviation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:618:1: ( rule__Abbreviation__Group__2__Impl rule__Abbreviation__Group__3 )
            // InternalWebMate.g:619:2: rule__Abbreviation__Group__2__Impl rule__Abbreviation__Group__3
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
    // InternalWebMate.g:626:1: rule__Abbreviation__Group__2__Impl : ( ( rule__Abbreviation__Alternatives_2 ) ) ;
    public final void rule__Abbreviation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:630:1: ( ( ( rule__Abbreviation__Alternatives_2 ) ) )
            // InternalWebMate.g:631:1: ( ( rule__Abbreviation__Alternatives_2 ) )
            {
            // InternalWebMate.g:631:1: ( ( rule__Abbreviation__Alternatives_2 ) )
            // InternalWebMate.g:632:2: ( rule__Abbreviation__Alternatives_2 )
            {
             before(grammarAccess.getAbbreviationAccess().getAlternatives_2()); 
            // InternalWebMate.g:633:2: ( rule__Abbreviation__Alternatives_2 )
            // InternalWebMate.g:633:3: rule__Abbreviation__Alternatives_2
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
    // InternalWebMate.g:641:1: rule__Abbreviation__Group__3 : rule__Abbreviation__Group__3__Impl ;
    public final void rule__Abbreviation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:645:1: ( rule__Abbreviation__Group__3__Impl )
            // InternalWebMate.g:646:2: rule__Abbreviation__Group__3__Impl
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
    // InternalWebMate.g:652:1: rule__Abbreviation__Group__3__Impl : ( '}' ) ;
    public final void rule__Abbreviation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:656:1: ( ( '}' ) )
            // InternalWebMate.g:657:1: ( '}' )
            {
            // InternalWebMate.g:657:1: ( '}' )
            // InternalWebMate.g:658:2: '}'
            {
             before(grammarAccess.getAbbreviationAccess().getRightCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalWebMate.g:668:1: rule__Abbreviation__Group_2_1__0 : rule__Abbreviation__Group_2_1__0__Impl rule__Abbreviation__Group_2_1__1 ;
    public final void rule__Abbreviation__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:672:1: ( rule__Abbreviation__Group_2_1__0__Impl rule__Abbreviation__Group_2_1__1 )
            // InternalWebMate.g:673:2: rule__Abbreviation__Group_2_1__0__Impl rule__Abbreviation__Group_2_1__1
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
    // InternalWebMate.g:680:1: rule__Abbreviation__Group_2_1__0__Impl : ( ( ( rule__Abbreviation__TagsAssignment_2_1_0 ) ) ( ( rule__Abbreviation__TagsAssignment_2_1_0 )* ) ) ;
    public final void rule__Abbreviation__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:684:1: ( ( ( ( rule__Abbreviation__TagsAssignment_2_1_0 ) ) ( ( rule__Abbreviation__TagsAssignment_2_1_0 )* ) ) )
            // InternalWebMate.g:685:1: ( ( ( rule__Abbreviation__TagsAssignment_2_1_0 ) ) ( ( rule__Abbreviation__TagsAssignment_2_1_0 )* ) )
            {
            // InternalWebMate.g:685:1: ( ( ( rule__Abbreviation__TagsAssignment_2_1_0 ) ) ( ( rule__Abbreviation__TagsAssignment_2_1_0 )* ) )
            // InternalWebMate.g:686:2: ( ( rule__Abbreviation__TagsAssignment_2_1_0 ) ) ( ( rule__Abbreviation__TagsAssignment_2_1_0 )* )
            {
            // InternalWebMate.g:686:2: ( ( rule__Abbreviation__TagsAssignment_2_1_0 ) )
            // InternalWebMate.g:687:3: ( rule__Abbreviation__TagsAssignment_2_1_0 )
            {
             before(grammarAccess.getAbbreviationAccess().getTagsAssignment_2_1_0()); 
            // InternalWebMate.g:688:3: ( rule__Abbreviation__TagsAssignment_2_1_0 )
            // InternalWebMate.g:688:4: rule__Abbreviation__TagsAssignment_2_1_0
            {
            pushFollow(FOLLOW_9);
            rule__Abbreviation__TagsAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAbbreviationAccess().getTagsAssignment_2_1_0()); 

            }

            // InternalWebMate.g:691:2: ( ( rule__Abbreviation__TagsAssignment_2_1_0 )* )
            // InternalWebMate.g:692:3: ( rule__Abbreviation__TagsAssignment_2_1_0 )*
            {
             before(grammarAccess.getAbbreviationAccess().getTagsAssignment_2_1_0()); 
            // InternalWebMate.g:693:3: ( rule__Abbreviation__TagsAssignment_2_1_0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=17 && LA8_0<=21)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalWebMate.g:693:4: rule__Abbreviation__TagsAssignment_2_1_0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Abbreviation__TagsAssignment_2_1_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalWebMate.g:702:1: rule__Abbreviation__Group_2_1__1 : rule__Abbreviation__Group_2_1__1__Impl ;
    public final void rule__Abbreviation__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:706:1: ( rule__Abbreviation__Group_2_1__1__Impl )
            // InternalWebMate.g:707:2: rule__Abbreviation__Group_2_1__1__Impl
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
    // InternalWebMate.g:713:1: rule__Abbreviation__Group_2_1__1__Impl : ( ( rule__Abbreviation__Group_2_1_1__0 ) ) ;
    public final void rule__Abbreviation__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:717:1: ( ( ( rule__Abbreviation__Group_2_1_1__0 ) ) )
            // InternalWebMate.g:718:1: ( ( rule__Abbreviation__Group_2_1_1__0 ) )
            {
            // InternalWebMate.g:718:1: ( ( rule__Abbreviation__Group_2_1_1__0 ) )
            // InternalWebMate.g:719:2: ( rule__Abbreviation__Group_2_1_1__0 )
            {
             before(grammarAccess.getAbbreviationAccess().getGroup_2_1_1()); 
            // InternalWebMate.g:720:2: ( rule__Abbreviation__Group_2_1_1__0 )
            // InternalWebMate.g:720:3: rule__Abbreviation__Group_2_1_1__0
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
    // InternalWebMate.g:729:1: rule__Abbreviation__Group_2_1_1__0 : rule__Abbreviation__Group_2_1_1__0__Impl rule__Abbreviation__Group_2_1_1__1 ;
    public final void rule__Abbreviation__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:733:1: ( rule__Abbreviation__Group_2_1_1__0__Impl rule__Abbreviation__Group_2_1_1__1 )
            // InternalWebMate.g:734:2: rule__Abbreviation__Group_2_1_1__0__Impl rule__Abbreviation__Group_2_1_1__1
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
    // InternalWebMate.g:741:1: rule__Abbreviation__Group_2_1_1__0__Impl : ( ( rule__Abbreviation__IdsAssignment_2_1_1_0 )* ) ;
    public final void rule__Abbreviation__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:745:1: ( ( ( rule__Abbreviation__IdsAssignment_2_1_1_0 )* ) )
            // InternalWebMate.g:746:1: ( ( rule__Abbreviation__IdsAssignment_2_1_1_0 )* )
            {
            // InternalWebMate.g:746:1: ( ( rule__Abbreviation__IdsAssignment_2_1_1_0 )* )
            // InternalWebMate.g:747:2: ( rule__Abbreviation__IdsAssignment_2_1_1_0 )*
            {
             before(grammarAccess.getAbbreviationAccess().getIdsAssignment_2_1_1_0()); 
            // InternalWebMate.g:748:2: ( rule__Abbreviation__IdsAssignment_2_1_1_0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalWebMate.g:748:3: rule__Abbreviation__IdsAssignment_2_1_1_0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Abbreviation__IdsAssignment_2_1_1_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalWebMate.g:756:1: rule__Abbreviation__Group_2_1_1__1 : rule__Abbreviation__Group_2_1_1__1__Impl rule__Abbreviation__Group_2_1_1__2 ;
    public final void rule__Abbreviation__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:760:1: ( rule__Abbreviation__Group_2_1_1__1__Impl rule__Abbreviation__Group_2_1_1__2 )
            // InternalWebMate.g:761:2: rule__Abbreviation__Group_2_1_1__1__Impl rule__Abbreviation__Group_2_1_1__2
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
    // InternalWebMate.g:768:1: rule__Abbreviation__Group_2_1_1__1__Impl : ( ( rule__Abbreviation__SymbolsAssignment_2_1_1_1 )* ) ;
    public final void rule__Abbreviation__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:772:1: ( ( ( rule__Abbreviation__SymbolsAssignment_2_1_1_1 )* ) )
            // InternalWebMate.g:773:1: ( ( rule__Abbreviation__SymbolsAssignment_2_1_1_1 )* )
            {
            // InternalWebMate.g:773:1: ( ( rule__Abbreviation__SymbolsAssignment_2_1_1_1 )* )
            // InternalWebMate.g:774:2: ( rule__Abbreviation__SymbolsAssignment_2_1_1_1 )*
            {
             before(grammarAccess.getAbbreviationAccess().getSymbolsAssignment_2_1_1_1()); 
            // InternalWebMate.g:775:2: ( rule__Abbreviation__SymbolsAssignment_2_1_1_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=11 && LA10_0<=16)||(LA10_0>=25 && LA10_0<=28)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalWebMate.g:775:3: rule__Abbreviation__SymbolsAssignment_2_1_1_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Abbreviation__SymbolsAssignment_2_1_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalWebMate.g:783:1: rule__Abbreviation__Group_2_1_1__2 : rule__Abbreviation__Group_2_1_1__2__Impl rule__Abbreviation__Group_2_1_1__3 ;
    public final void rule__Abbreviation__Group_2_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:787:1: ( rule__Abbreviation__Group_2_1_1__2__Impl rule__Abbreviation__Group_2_1_1__3 )
            // InternalWebMate.g:788:2: rule__Abbreviation__Group_2_1_1__2__Impl rule__Abbreviation__Group_2_1_1__3
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
    // InternalWebMate.g:795:1: rule__Abbreviation__Group_2_1_1__2__Impl : ( ( rule__Abbreviation__ClassesAssignment_2_1_1_2 )* ) ;
    public final void rule__Abbreviation__Group_2_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:799:1: ( ( ( rule__Abbreviation__ClassesAssignment_2_1_1_2 )* ) )
            // InternalWebMate.g:800:1: ( ( rule__Abbreviation__ClassesAssignment_2_1_1_2 )* )
            {
            // InternalWebMate.g:800:1: ( ( rule__Abbreviation__ClassesAssignment_2_1_1_2 )* )
            // InternalWebMate.g:801:2: ( rule__Abbreviation__ClassesAssignment_2_1_1_2 )*
            {
             before(grammarAccess.getAbbreviationAccess().getClassesAssignment_2_1_1_2()); 
            // InternalWebMate.g:802:2: ( rule__Abbreviation__ClassesAssignment_2_1_1_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==29) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalWebMate.g:802:3: rule__Abbreviation__ClassesAssignment_2_1_1_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Abbreviation__ClassesAssignment_2_1_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalWebMate.g:810:1: rule__Abbreviation__Group_2_1_1__3 : rule__Abbreviation__Group_2_1_1__3__Impl rule__Abbreviation__Group_2_1_1__4 ;
    public final void rule__Abbreviation__Group_2_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:814:1: ( rule__Abbreviation__Group_2_1_1__3__Impl rule__Abbreviation__Group_2_1_1__4 )
            // InternalWebMate.g:815:2: rule__Abbreviation__Group_2_1_1__3__Impl rule__Abbreviation__Group_2_1_1__4
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
    // InternalWebMate.g:822:1: rule__Abbreviation__Group_2_1_1__3__Impl : ( ( rule__Abbreviation__AttributesAssignment_2_1_1_3 )* ) ;
    public final void rule__Abbreviation__Group_2_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:826:1: ( ( ( rule__Abbreviation__AttributesAssignment_2_1_1_3 )* ) )
            // InternalWebMate.g:827:1: ( ( rule__Abbreviation__AttributesAssignment_2_1_1_3 )* )
            {
            // InternalWebMate.g:827:1: ( ( rule__Abbreviation__AttributesAssignment_2_1_1_3 )* )
            // InternalWebMate.g:828:2: ( rule__Abbreviation__AttributesAssignment_2_1_1_3 )*
            {
             before(grammarAccess.getAbbreviationAccess().getAttributesAssignment_2_1_1_3()); 
            // InternalWebMate.g:829:2: ( rule__Abbreviation__AttributesAssignment_2_1_1_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==30) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalWebMate.g:829:3: rule__Abbreviation__AttributesAssignment_2_1_1_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Abbreviation__AttributesAssignment_2_1_1_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalWebMate.g:837:1: rule__Abbreviation__Group_2_1_1__4 : rule__Abbreviation__Group_2_1_1__4__Impl ;
    public final void rule__Abbreviation__Group_2_1_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:841:1: ( rule__Abbreviation__Group_2_1_1__4__Impl )
            // InternalWebMate.g:842:2: rule__Abbreviation__Group_2_1_1__4__Impl
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
    // InternalWebMate.g:848:1: rule__Abbreviation__Group_2_1_1__4__Impl : ( ( rule__Abbreviation__GroupAssignment_2_1_1_4 )* ) ;
    public final void rule__Abbreviation__Group_2_1_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:852:1: ( ( ( rule__Abbreviation__GroupAssignment_2_1_1_4 )* ) )
            // InternalWebMate.g:853:1: ( ( rule__Abbreviation__GroupAssignment_2_1_1_4 )* )
            {
            // InternalWebMate.g:853:1: ( ( rule__Abbreviation__GroupAssignment_2_1_1_4 )* )
            // InternalWebMate.g:854:2: ( rule__Abbreviation__GroupAssignment_2_1_1_4 )*
            {
             before(grammarAccess.getAbbreviationAccess().getGroupAssignment_2_1_1_4()); 
            // InternalWebMate.g:855:2: ( rule__Abbreviation__GroupAssignment_2_1_1_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==33) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalWebMate.g:855:3: rule__Abbreviation__GroupAssignment_2_1_1_4
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Abbreviation__GroupAssignment_2_1_1_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalWebMate.g:864:1: rule__ID0__Group__0 : rule__ID0__Group__0__Impl rule__ID0__Group__1 ;
    public final void rule__ID0__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:868:1: ( rule__ID0__Group__0__Impl rule__ID0__Group__1 )
            // InternalWebMate.g:869:2: rule__ID0__Group__0__Impl rule__ID0__Group__1
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
    // InternalWebMate.g:876:1: rule__ID0__Group__0__Impl : ( () ) ;
    public final void rule__ID0__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:880:1: ( ( () ) )
            // InternalWebMate.g:881:1: ( () )
            {
            // InternalWebMate.g:881:1: ( () )
            // InternalWebMate.g:882:2: ()
            {
             before(grammarAccess.getID0Access().getIDAction_0()); 
            // InternalWebMate.g:883:2: ()
            // InternalWebMate.g:883:3: 
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
    // InternalWebMate.g:891:1: rule__ID0__Group__1 : rule__ID0__Group__1__Impl ;
    public final void rule__ID0__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:895:1: ( rule__ID0__Group__1__Impl )
            // InternalWebMate.g:896:2: rule__ID0__Group__1__Impl
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
    // InternalWebMate.g:902:1: rule__ID0__Group__1__Impl : ( ( rule__ID0__Group_1__0 ) ) ;
    public final void rule__ID0__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:906:1: ( ( ( rule__ID0__Group_1__0 ) ) )
            // InternalWebMate.g:907:1: ( ( rule__ID0__Group_1__0 ) )
            {
            // InternalWebMate.g:907:1: ( ( rule__ID0__Group_1__0 ) )
            // InternalWebMate.g:908:2: ( rule__ID0__Group_1__0 )
            {
             before(grammarAccess.getID0Access().getGroup_1()); 
            // InternalWebMate.g:909:2: ( rule__ID0__Group_1__0 )
            // InternalWebMate.g:909:3: rule__ID0__Group_1__0
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
    // InternalWebMate.g:918:1: rule__ID0__Group_1__0 : rule__ID0__Group_1__0__Impl rule__ID0__Group_1__1 ;
    public final void rule__ID0__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:922:1: ( rule__ID0__Group_1__0__Impl rule__ID0__Group_1__1 )
            // InternalWebMate.g:923:2: rule__ID0__Group_1__0__Impl rule__ID0__Group_1__1
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
    // InternalWebMate.g:930:1: rule__ID0__Group_1__0__Impl : ( '#' ) ;
    public final void rule__ID0__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:934:1: ( ( '#' ) )
            // InternalWebMate.g:935:1: ( '#' )
            {
            // InternalWebMate.g:935:1: ( '#' )
            // InternalWebMate.g:936:2: '#'
            {
             before(grammarAccess.getID0Access().getNumberSignKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalWebMate.g:945:1: rule__ID0__Group_1__1 : rule__ID0__Group_1__1__Impl ;
    public final void rule__ID0__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:949:1: ( rule__ID0__Group_1__1__Impl )
            // InternalWebMate.g:950:2: rule__ID0__Group_1__1__Impl
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
    // InternalWebMate.g:956:1: rule__ID0__Group_1__1__Impl : ( ( rule__ID0__IdNameAssignment_1_1 ) ) ;
    public final void rule__ID0__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:960:1: ( ( ( rule__ID0__IdNameAssignment_1_1 ) ) )
            // InternalWebMate.g:961:1: ( ( rule__ID0__IdNameAssignment_1_1 ) )
            {
            // InternalWebMate.g:961:1: ( ( rule__ID0__IdNameAssignment_1_1 ) )
            // InternalWebMate.g:962:2: ( rule__ID0__IdNameAssignment_1_1 )
            {
             before(grammarAccess.getID0Access().getIdNameAssignment_1_1()); 
            // InternalWebMate.g:963:2: ( rule__ID0__IdNameAssignment_1_1 )
            // InternalWebMate.g:963:3: rule__ID0__IdNameAssignment_1_1
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
    // InternalWebMate.g:972:1: rule__Symbol__Group_0__0 : rule__Symbol__Group_0__0__Impl rule__Symbol__Group_0__1 ;
    public final void rule__Symbol__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:976:1: ( rule__Symbol__Group_0__0__Impl rule__Symbol__Group_0__1 )
            // InternalWebMate.g:977:2: rule__Symbol__Group_0__0__Impl rule__Symbol__Group_0__1
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
    // InternalWebMate.g:984:1: rule__Symbol__Group_0__0__Impl : ( () ) ;
    public final void rule__Symbol__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:988:1: ( ( () ) )
            // InternalWebMate.g:989:1: ( () )
            {
            // InternalWebMate.g:989:1: ( () )
            // InternalWebMate.g:990:2: ()
            {
             before(grammarAccess.getSymbolAccess().getSymbolAction_0_0()); 
            // InternalWebMate.g:991:2: ()
            // InternalWebMate.g:991:3: 
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
    // InternalWebMate.g:999:1: rule__Symbol__Group_0__1 : rule__Symbol__Group_0__1__Impl ;
    public final void rule__Symbol__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1003:1: ( rule__Symbol__Group_0__1__Impl )
            // InternalWebMate.g:1004:2: rule__Symbol__Group_0__1__Impl
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
    // InternalWebMate.g:1010:1: rule__Symbol__Group_0__1__Impl : ( ( rule__Symbol__Group_0_1__0 ) ) ;
    public final void rule__Symbol__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1014:1: ( ( ( rule__Symbol__Group_0_1__0 ) ) )
            // InternalWebMate.g:1015:1: ( ( rule__Symbol__Group_0_1__0 ) )
            {
            // InternalWebMate.g:1015:1: ( ( rule__Symbol__Group_0_1__0 ) )
            // InternalWebMate.g:1016:2: ( rule__Symbol__Group_0_1__0 )
            {
             before(grammarAccess.getSymbolAccess().getGroup_0_1()); 
            // InternalWebMate.g:1017:2: ( rule__Symbol__Group_0_1__0 )
            // InternalWebMate.g:1017:3: rule__Symbol__Group_0_1__0
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
    // InternalWebMate.g:1026:1: rule__Symbol__Group_0_1__0 : rule__Symbol__Group_0_1__0__Impl rule__Symbol__Group_0_1__1 ;
    public final void rule__Symbol__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1030:1: ( rule__Symbol__Group_0_1__0__Impl rule__Symbol__Group_0_1__1 )
            // InternalWebMate.g:1031:2: rule__Symbol__Group_0_1__0__Impl rule__Symbol__Group_0_1__1
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
    // InternalWebMate.g:1038:1: rule__Symbol__Group_0_1__0__Impl : ( '*' ) ;
    public final void rule__Symbol__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1042:1: ( ( '*' ) )
            // InternalWebMate.g:1043:1: ( '*' )
            {
            // InternalWebMate.g:1043:1: ( '*' )
            // InternalWebMate.g:1044:2: '*'
            {
             before(grammarAccess.getSymbolAccess().getAsteriskKeyword_0_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalWebMate.g:1053:1: rule__Symbol__Group_0_1__1 : rule__Symbol__Group_0_1__1__Impl ;
    public final void rule__Symbol__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1057:1: ( rule__Symbol__Group_0_1__1__Impl )
            // InternalWebMate.g:1058:2: rule__Symbol__Group_0_1__1__Impl
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
    // InternalWebMate.g:1064:1: rule__Symbol__Group_0_1__1__Impl : ( ( rule__Symbol__CountAssignment_0_1_1 ) ) ;
    public final void rule__Symbol__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1068:1: ( ( ( rule__Symbol__CountAssignment_0_1_1 ) ) )
            // InternalWebMate.g:1069:1: ( ( rule__Symbol__CountAssignment_0_1_1 ) )
            {
            // InternalWebMate.g:1069:1: ( ( rule__Symbol__CountAssignment_0_1_1 ) )
            // InternalWebMate.g:1070:2: ( rule__Symbol__CountAssignment_0_1_1 )
            {
             before(grammarAccess.getSymbolAccess().getCountAssignment_0_1_1()); 
            // InternalWebMate.g:1071:2: ( rule__Symbol__CountAssignment_0_1_1 )
            // InternalWebMate.g:1071:3: rule__Symbol__CountAssignment_0_1_1
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
    // InternalWebMate.g:1080:1: rule__Symbol__Group_1__0 : rule__Symbol__Group_1__0__Impl rule__Symbol__Group_1__1 ;
    public final void rule__Symbol__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1084:1: ( rule__Symbol__Group_1__0__Impl rule__Symbol__Group_1__1 )
            // InternalWebMate.g:1085:2: rule__Symbol__Group_1__0__Impl rule__Symbol__Group_1__1
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
    // InternalWebMate.g:1092:1: rule__Symbol__Group_1__0__Impl : ( '+' ) ;
    public final void rule__Symbol__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1096:1: ( ( '+' ) )
            // InternalWebMate.g:1097:1: ( '+' )
            {
            // InternalWebMate.g:1097:1: ( '+' )
            // InternalWebMate.g:1098:2: '+'
            {
             before(grammarAccess.getSymbolAccess().getPlusSignKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalWebMate.g:1107:1: rule__Symbol__Group_1__1 : rule__Symbol__Group_1__1__Impl ;
    public final void rule__Symbol__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1111:1: ( rule__Symbol__Group_1__1__Impl )
            // InternalWebMate.g:1112:2: rule__Symbol__Group_1__1__Impl
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
    // InternalWebMate.g:1118:1: rule__Symbol__Group_1__1__Impl : ( ( rule__Symbol__TagAssignment_1_1 ) ) ;
    public final void rule__Symbol__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1122:1: ( ( ( rule__Symbol__TagAssignment_1_1 ) ) )
            // InternalWebMate.g:1123:1: ( ( rule__Symbol__TagAssignment_1_1 ) )
            {
            // InternalWebMate.g:1123:1: ( ( rule__Symbol__TagAssignment_1_1 ) )
            // InternalWebMate.g:1124:2: ( rule__Symbol__TagAssignment_1_1 )
            {
             before(grammarAccess.getSymbolAccess().getTagAssignment_1_1()); 
            // InternalWebMate.g:1125:2: ( rule__Symbol__TagAssignment_1_1 )
            // InternalWebMate.g:1125:3: rule__Symbol__TagAssignment_1_1
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
    // InternalWebMate.g:1134:1: rule__Symbol__Group_2__0 : rule__Symbol__Group_2__0__Impl rule__Symbol__Group_2__1 ;
    public final void rule__Symbol__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1138:1: ( rule__Symbol__Group_2__0__Impl rule__Symbol__Group_2__1 )
            // InternalWebMate.g:1139:2: rule__Symbol__Group_2__0__Impl rule__Symbol__Group_2__1
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
    // InternalWebMate.g:1146:1: rule__Symbol__Group_2__0__Impl : ( '>' ) ;
    public final void rule__Symbol__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1150:1: ( ( '>' ) )
            // InternalWebMate.g:1151:1: ( '>' )
            {
            // InternalWebMate.g:1151:1: ( '>' )
            // InternalWebMate.g:1152:2: '>'
            {
             before(grammarAccess.getSymbolAccess().getGreaterThanSignKeyword_2_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalWebMate.g:1161:1: rule__Symbol__Group_2__1 : rule__Symbol__Group_2__1__Impl ;
    public final void rule__Symbol__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1165:1: ( rule__Symbol__Group_2__1__Impl )
            // InternalWebMate.g:1166:2: rule__Symbol__Group_2__1__Impl
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
    // InternalWebMate.g:1172:1: rule__Symbol__Group_2__1__Impl : ( ( rule__Symbol__TagAssignment_2_1 ) ) ;
    public final void rule__Symbol__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1176:1: ( ( ( rule__Symbol__TagAssignment_2_1 ) ) )
            // InternalWebMate.g:1177:1: ( ( rule__Symbol__TagAssignment_2_1 ) )
            {
            // InternalWebMate.g:1177:1: ( ( rule__Symbol__TagAssignment_2_1 ) )
            // InternalWebMate.g:1178:2: ( rule__Symbol__TagAssignment_2_1 )
            {
             before(grammarAccess.getSymbolAccess().getTagAssignment_2_1()); 
            // InternalWebMate.g:1179:2: ( rule__Symbol__TagAssignment_2_1 )
            // InternalWebMate.g:1179:3: rule__Symbol__TagAssignment_2_1
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
    // InternalWebMate.g:1188:1: rule__Symbol__Group_3__0 : rule__Symbol__Group_3__0__Impl rule__Symbol__Group_3__1 ;
    public final void rule__Symbol__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1192:1: ( rule__Symbol__Group_3__0__Impl rule__Symbol__Group_3__1 )
            // InternalWebMate.g:1193:2: rule__Symbol__Group_3__0__Impl rule__Symbol__Group_3__1
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
    // InternalWebMate.g:1200:1: rule__Symbol__Group_3__0__Impl : ( '^' ) ;
    public final void rule__Symbol__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1204:1: ( ( '^' ) )
            // InternalWebMate.g:1205:1: ( '^' )
            {
            // InternalWebMate.g:1205:1: ( '^' )
            // InternalWebMate.g:1206:2: '^'
            {
             before(grammarAccess.getSymbolAccess().getCircumflexAccentKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalWebMate.g:1215:1: rule__Symbol__Group_3__1 : rule__Symbol__Group_3__1__Impl ;
    public final void rule__Symbol__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1219:1: ( rule__Symbol__Group_3__1__Impl )
            // InternalWebMate.g:1220:2: rule__Symbol__Group_3__1__Impl
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
    // InternalWebMate.g:1226:1: rule__Symbol__Group_3__1__Impl : ( ( rule__Symbol__TagAssignment_3_1 ) ) ;
    public final void rule__Symbol__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1230:1: ( ( ( rule__Symbol__TagAssignment_3_1 ) ) )
            // InternalWebMate.g:1231:1: ( ( rule__Symbol__TagAssignment_3_1 ) )
            {
            // InternalWebMate.g:1231:1: ( ( rule__Symbol__TagAssignment_3_1 ) )
            // InternalWebMate.g:1232:2: ( rule__Symbol__TagAssignment_3_1 )
            {
             before(grammarAccess.getSymbolAccess().getTagAssignment_3_1()); 
            // InternalWebMate.g:1233:2: ( rule__Symbol__TagAssignment_3_1 )
            // InternalWebMate.g:1233:3: rule__Symbol__TagAssignment_3_1
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
    // InternalWebMate.g:1242:1: rule__Tag__Group__0 : rule__Tag__Group__0__Impl rule__Tag__Group__1 ;
    public final void rule__Tag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1246:1: ( rule__Tag__Group__0__Impl rule__Tag__Group__1 )
            // InternalWebMate.g:1247:2: rule__Tag__Group__0__Impl rule__Tag__Group__1
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
    // InternalWebMate.g:1254:1: rule__Tag__Group__0__Impl : ( () ) ;
    public final void rule__Tag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1258:1: ( ( () ) )
            // InternalWebMate.g:1259:1: ( () )
            {
            // InternalWebMate.g:1259:1: ( () )
            // InternalWebMate.g:1260:2: ()
            {
             before(grammarAccess.getTagAccess().getTagAction_0()); 
            // InternalWebMate.g:1261:2: ()
            // InternalWebMate.g:1261:3: 
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
    // InternalWebMate.g:1269:1: rule__Tag__Group__1 : rule__Tag__Group__1__Impl rule__Tag__Group__2 ;
    public final void rule__Tag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1273:1: ( rule__Tag__Group__1__Impl rule__Tag__Group__2 )
            // InternalWebMate.g:1274:2: rule__Tag__Group__1__Impl rule__Tag__Group__2
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
    // InternalWebMate.g:1281:1: rule__Tag__Group__1__Impl : ( ( rule__Tag__TagNameAssignment_1 ) ) ;
    public final void rule__Tag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1285:1: ( ( ( rule__Tag__TagNameAssignment_1 ) ) )
            // InternalWebMate.g:1286:1: ( ( rule__Tag__TagNameAssignment_1 ) )
            {
            // InternalWebMate.g:1286:1: ( ( rule__Tag__TagNameAssignment_1 ) )
            // InternalWebMate.g:1287:2: ( rule__Tag__TagNameAssignment_1 )
            {
             before(grammarAccess.getTagAccess().getTagNameAssignment_1()); 
            // InternalWebMate.g:1288:2: ( rule__Tag__TagNameAssignment_1 )
            // InternalWebMate.g:1288:3: rule__Tag__TagNameAssignment_1
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
    // InternalWebMate.g:1296:1: rule__Tag__Group__2 : rule__Tag__Group__2__Impl rule__Tag__Group__3 ;
    public final void rule__Tag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1300:1: ( rule__Tag__Group__2__Impl rule__Tag__Group__3 )
            // InternalWebMate.g:1301:2: rule__Tag__Group__2__Impl rule__Tag__Group__3
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
    // InternalWebMate.g:1308:1: rule__Tag__Group__2__Impl : ( ( rule__Tag__ClassAssignment_2 )* ) ;
    public final void rule__Tag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1312:1: ( ( ( rule__Tag__ClassAssignment_2 )* ) )
            // InternalWebMate.g:1313:1: ( ( rule__Tag__ClassAssignment_2 )* )
            {
            // InternalWebMate.g:1313:1: ( ( rule__Tag__ClassAssignment_2 )* )
            // InternalWebMate.g:1314:2: ( rule__Tag__ClassAssignment_2 )*
            {
             before(grammarAccess.getTagAccess().getClassAssignment_2()); 
            // InternalWebMate.g:1315:2: ( rule__Tag__ClassAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29) ) {
                    int LA14_2 = input.LA(2);

                    if ( (LA14_2==RULE_STRING) ) {
                        alt14=1;
                    }
                    else if ( (LA14_2==RULE_ID) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // InternalWebMate.g:1315:3: rule__Tag__ClassAssignment_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Tag__ClassAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalWebMate.g:1323:1: rule__Tag__Group__3 : rule__Tag__Group__3__Impl rule__Tag__Group__4 ;
    public final void rule__Tag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1327:1: ( rule__Tag__Group__3__Impl rule__Tag__Group__4 )
            // InternalWebMate.g:1328:2: rule__Tag__Group__3__Impl rule__Tag__Group__4
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
    // InternalWebMate.g:1335:1: rule__Tag__Group__3__Impl : ( ( rule__Tag__IdAssignment_3 )? ) ;
    public final void rule__Tag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1339:1: ( ( ( rule__Tag__IdAssignment_3 )? ) )
            // InternalWebMate.g:1340:1: ( ( rule__Tag__IdAssignment_3 )? )
            {
            // InternalWebMate.g:1340:1: ( ( rule__Tag__IdAssignment_3 )? )
            // InternalWebMate.g:1341:2: ( rule__Tag__IdAssignment_3 )?
            {
             before(grammarAccess.getTagAccess().getIdAssignment_3()); 
            // InternalWebMate.g:1342:2: ( rule__Tag__IdAssignment_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==RULE_STRING) ) {
                    alt15=1;
                }
                else if ( (LA15_1==RULE_ID) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalWebMate.g:1342:3: rule__Tag__IdAssignment_3
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
    // InternalWebMate.g:1350:1: rule__Tag__Group__4 : rule__Tag__Group__4__Impl ;
    public final void rule__Tag__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1354:1: ( rule__Tag__Group__4__Impl )
            // InternalWebMate.g:1355:2: rule__Tag__Group__4__Impl
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
    // InternalWebMate.g:1361:1: rule__Tag__Group__4__Impl : ( ( rule__Tag__AttributeAssignment_4 )* ) ;
    public final void rule__Tag__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1365:1: ( ( ( rule__Tag__AttributeAssignment_4 )* ) )
            // InternalWebMate.g:1366:1: ( ( rule__Tag__AttributeAssignment_4 )* )
            {
            // InternalWebMate.g:1366:1: ( ( rule__Tag__AttributeAssignment_4 )* )
            // InternalWebMate.g:1367:2: ( rule__Tag__AttributeAssignment_4 )*
            {
             before(grammarAccess.getTagAccess().getAttributeAssignment_4()); 
            // InternalWebMate.g:1368:2: ( rule__Tag__AttributeAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30) ) {
                    int LA16_2 = input.LA(2);

                    if ( (LA16_2==RULE_STRING) ) {
                        int LA16_3 = input.LA(3);

                        if ( (LA16_3==32) ) {
                            int LA16_5 = input.LA(4);

                            if ( (LA16_5==RULE_STRING) ) {
                                int LA16_7 = input.LA(5);

                                if ( (LA16_7==31) ) {
                                    alt16=1;
                                }


                            }
                            else if ( (LA16_5==RULE_ID) ) {
                                int LA16_8 = input.LA(5);

                                if ( (LA16_8==31) ) {
                                    alt16=1;
                                }


                            }


                        }
                        else if ( (LA16_3==31) ) {
                            alt16=1;
                        }


                    }
                    else if ( (LA16_2==RULE_ID) ) {
                        int LA16_4 = input.LA(3);

                        if ( (LA16_4==32) ) {
                            int LA16_5 = input.LA(4);

                            if ( (LA16_5==RULE_STRING) ) {
                                int LA16_7 = input.LA(5);

                                if ( (LA16_7==31) ) {
                                    alt16=1;
                                }


                            }
                            else if ( (LA16_5==RULE_ID) ) {
                                int LA16_8 = input.LA(5);

                                if ( (LA16_8==31) ) {
                                    alt16=1;
                                }


                            }


                        }
                        else if ( (LA16_4==31) ) {
                            alt16=1;
                        }


                    }


                }


                switch (alt16) {
            	case 1 :
            	    // InternalWebMate.g:1368:3: rule__Tag__AttributeAssignment_4
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Tag__AttributeAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalWebMate.g:1377:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1381:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalWebMate.g:1382:2: rule__Class__Group__0__Impl rule__Class__Group__1
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
    // InternalWebMate.g:1389:1: rule__Class__Group__0__Impl : ( () ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1393:1: ( ( () ) )
            // InternalWebMate.g:1394:1: ( () )
            {
            // InternalWebMate.g:1394:1: ( () )
            // InternalWebMate.g:1395:2: ()
            {
             before(grammarAccess.getClassAccess().getClassAction_0()); 
            // InternalWebMate.g:1396:2: ()
            // InternalWebMate.g:1396:3: 
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
    // InternalWebMate.g:1404:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1408:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalWebMate.g:1409:2: rule__Class__Group__1__Impl rule__Class__Group__2
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
    // InternalWebMate.g:1416:1: rule__Class__Group__1__Impl : ( '.' ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1420:1: ( ( '.' ) )
            // InternalWebMate.g:1421:1: ( '.' )
            {
            // InternalWebMate.g:1421:1: ( '.' )
            // InternalWebMate.g:1422:2: '.'
            {
             before(grammarAccess.getClassAccess().getFullStopKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalWebMate.g:1431:1: rule__Class__Group__2 : rule__Class__Group__2__Impl ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1435:1: ( rule__Class__Group__2__Impl )
            // InternalWebMate.g:1436:2: rule__Class__Group__2__Impl
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
    // InternalWebMate.g:1442:1: rule__Class__Group__2__Impl : ( ( rule__Class__ClassNameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1446:1: ( ( ( rule__Class__ClassNameAssignment_2 ) ) )
            // InternalWebMate.g:1447:1: ( ( rule__Class__ClassNameAssignment_2 ) )
            {
            // InternalWebMate.g:1447:1: ( ( rule__Class__ClassNameAssignment_2 ) )
            // InternalWebMate.g:1448:2: ( rule__Class__ClassNameAssignment_2 )
            {
             before(grammarAccess.getClassAccess().getClassNameAssignment_2()); 
            // InternalWebMate.g:1449:2: ( rule__Class__ClassNameAssignment_2 )
            // InternalWebMate.g:1449:3: rule__Class__ClassNameAssignment_2
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
    // InternalWebMate.g:1458:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1462:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalWebMate.g:1463:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalWebMate.g:1470:1: rule__Attribute__Group__0__Impl : ( () ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1474:1: ( ( () ) )
            // InternalWebMate.g:1475:1: ( () )
            {
            // InternalWebMate.g:1475:1: ( () )
            // InternalWebMate.g:1476:2: ()
            {
             before(grammarAccess.getAttributeAccess().getAttributeAction_0()); 
            // InternalWebMate.g:1477:2: ()
            // InternalWebMate.g:1477:3: 
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
    // InternalWebMate.g:1485:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1489:1: ( rule__Attribute__Group__1__Impl )
            // InternalWebMate.g:1490:2: rule__Attribute__Group__1__Impl
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
    // InternalWebMate.g:1496:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__Group_1__0 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1500:1: ( ( ( rule__Attribute__Group_1__0 ) ) )
            // InternalWebMate.g:1501:1: ( ( rule__Attribute__Group_1__0 ) )
            {
            // InternalWebMate.g:1501:1: ( ( rule__Attribute__Group_1__0 ) )
            // InternalWebMate.g:1502:2: ( rule__Attribute__Group_1__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup_1()); 
            // InternalWebMate.g:1503:2: ( rule__Attribute__Group_1__0 )
            // InternalWebMate.g:1503:3: rule__Attribute__Group_1__0
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
    // InternalWebMate.g:1512:1: rule__Attribute__Group_1__0 : rule__Attribute__Group_1__0__Impl rule__Attribute__Group_1__1 ;
    public final void rule__Attribute__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1516:1: ( rule__Attribute__Group_1__0__Impl rule__Attribute__Group_1__1 )
            // InternalWebMate.g:1517:2: rule__Attribute__Group_1__0__Impl rule__Attribute__Group_1__1
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
    // InternalWebMate.g:1524:1: rule__Attribute__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Attribute__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1528:1: ( ( '[' ) )
            // InternalWebMate.g:1529:1: ( '[' )
            {
            // InternalWebMate.g:1529:1: ( '[' )
            // InternalWebMate.g:1530:2: '['
            {
             before(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalWebMate.g:1539:1: rule__Attribute__Group_1__1 : rule__Attribute__Group_1__1__Impl rule__Attribute__Group_1__2 ;
    public final void rule__Attribute__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1543:1: ( rule__Attribute__Group_1__1__Impl rule__Attribute__Group_1__2 )
            // InternalWebMate.g:1544:2: rule__Attribute__Group_1__1__Impl rule__Attribute__Group_1__2
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
    // InternalWebMate.g:1551:1: rule__Attribute__Group_1__1__Impl : ( ( rule__Attribute__AttributeNameAssignment_1_1 ) ) ;
    public final void rule__Attribute__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1555:1: ( ( ( rule__Attribute__AttributeNameAssignment_1_1 ) ) )
            // InternalWebMate.g:1556:1: ( ( rule__Attribute__AttributeNameAssignment_1_1 ) )
            {
            // InternalWebMate.g:1556:1: ( ( rule__Attribute__AttributeNameAssignment_1_1 ) )
            // InternalWebMate.g:1557:2: ( rule__Attribute__AttributeNameAssignment_1_1 )
            {
             before(grammarAccess.getAttributeAccess().getAttributeNameAssignment_1_1()); 
            // InternalWebMate.g:1558:2: ( rule__Attribute__AttributeNameAssignment_1_1 )
            // InternalWebMate.g:1558:3: rule__Attribute__AttributeNameAssignment_1_1
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
    // InternalWebMate.g:1566:1: rule__Attribute__Group_1__2 : rule__Attribute__Group_1__2__Impl rule__Attribute__Group_1__3 ;
    public final void rule__Attribute__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1570:1: ( rule__Attribute__Group_1__2__Impl rule__Attribute__Group_1__3 )
            // InternalWebMate.g:1571:2: rule__Attribute__Group_1__2__Impl rule__Attribute__Group_1__3
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
    // InternalWebMate.g:1578:1: rule__Attribute__Group_1__2__Impl : ( ( rule__Attribute__Group_1_2__0 )? ) ;
    public final void rule__Attribute__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1582:1: ( ( ( rule__Attribute__Group_1_2__0 )? ) )
            // InternalWebMate.g:1583:1: ( ( rule__Attribute__Group_1_2__0 )? )
            {
            // InternalWebMate.g:1583:1: ( ( rule__Attribute__Group_1_2__0 )? )
            // InternalWebMate.g:1584:2: ( rule__Attribute__Group_1_2__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_1_2()); 
            // InternalWebMate.g:1585:2: ( rule__Attribute__Group_1_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalWebMate.g:1585:3: rule__Attribute__Group_1_2__0
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
    // InternalWebMate.g:1593:1: rule__Attribute__Group_1__3 : rule__Attribute__Group_1__3__Impl ;
    public final void rule__Attribute__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1597:1: ( rule__Attribute__Group_1__3__Impl )
            // InternalWebMate.g:1598:2: rule__Attribute__Group_1__3__Impl
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
    // InternalWebMate.g:1604:1: rule__Attribute__Group_1__3__Impl : ( ']' ) ;
    public final void rule__Attribute__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1608:1: ( ( ']' ) )
            // InternalWebMate.g:1609:1: ( ']' )
            {
            // InternalWebMate.g:1609:1: ( ']' )
            // InternalWebMate.g:1610:2: ']'
            {
             before(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_1_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalWebMate.g:1620:1: rule__Attribute__Group_1_2__0 : rule__Attribute__Group_1_2__0__Impl rule__Attribute__Group_1_2__1 ;
    public final void rule__Attribute__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1624:1: ( rule__Attribute__Group_1_2__0__Impl rule__Attribute__Group_1_2__1 )
            // InternalWebMate.g:1625:2: rule__Attribute__Group_1_2__0__Impl rule__Attribute__Group_1_2__1
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
    // InternalWebMate.g:1632:1: rule__Attribute__Group_1_2__0__Impl : ( '=' ) ;
    public final void rule__Attribute__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1636:1: ( ( '=' ) )
            // InternalWebMate.g:1637:1: ( '=' )
            {
            // InternalWebMate.g:1637:1: ( '=' )
            // InternalWebMate.g:1638:2: '='
            {
             before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1_2_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalWebMate.g:1647:1: rule__Attribute__Group_1_2__1 : rule__Attribute__Group_1_2__1__Impl ;
    public final void rule__Attribute__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1651:1: ( rule__Attribute__Group_1_2__1__Impl )
            // InternalWebMate.g:1652:2: rule__Attribute__Group_1_2__1__Impl
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
    // InternalWebMate.g:1658:1: rule__Attribute__Group_1_2__1__Impl : ( ( rule__Attribute__AttributeValueAssignment_1_2_1 ) ) ;
    public final void rule__Attribute__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1662:1: ( ( ( rule__Attribute__AttributeValueAssignment_1_2_1 ) ) )
            // InternalWebMate.g:1663:1: ( ( rule__Attribute__AttributeValueAssignment_1_2_1 ) )
            {
            // InternalWebMate.g:1663:1: ( ( rule__Attribute__AttributeValueAssignment_1_2_1 ) )
            // InternalWebMate.g:1664:2: ( rule__Attribute__AttributeValueAssignment_1_2_1 )
            {
             before(grammarAccess.getAttributeAccess().getAttributeValueAssignment_1_2_1()); 
            // InternalWebMate.g:1665:2: ( rule__Attribute__AttributeValueAssignment_1_2_1 )
            // InternalWebMate.g:1665:3: rule__Attribute__AttributeValueAssignment_1_2_1
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
    // InternalWebMate.g:1674:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1678:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // InternalWebMate.g:1679:2: rule__Group__Group__0__Impl rule__Group__Group__1
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
    // InternalWebMate.g:1686:1: rule__Group__Group__0__Impl : ( () ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1690:1: ( ( () ) )
            // InternalWebMate.g:1691:1: ( () )
            {
            // InternalWebMate.g:1691:1: ( () )
            // InternalWebMate.g:1692:2: ()
            {
             before(grammarAccess.getGroupAccess().getGroupAction_0()); 
            // InternalWebMate.g:1693:2: ()
            // InternalWebMate.g:1693:3: 
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
    // InternalWebMate.g:1701:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1705:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // InternalWebMate.g:1706:2: rule__Group__Group__1__Impl rule__Group__Group__2
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
    // InternalWebMate.g:1713:1: rule__Group__Group__1__Impl : ( '(' ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1717:1: ( ( '(' ) )
            // InternalWebMate.g:1718:1: ( '(' )
            {
            // InternalWebMate.g:1718:1: ( '(' )
            // InternalWebMate.g:1719:2: '('
            {
             before(grammarAccess.getGroupAccess().getLeftParenthesisKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalWebMate.g:1728:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1732:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // InternalWebMate.g:1733:2: rule__Group__Group__2__Impl rule__Group__Group__3
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
    // InternalWebMate.g:1740:1: rule__Group__Group__2__Impl : ( ( ( rule__Group__AbbreviationAssignment_2 ) ) ( ( rule__Group__AbbreviationAssignment_2 )* ) ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1744:1: ( ( ( ( rule__Group__AbbreviationAssignment_2 ) ) ( ( rule__Group__AbbreviationAssignment_2 )* ) ) )
            // InternalWebMate.g:1745:1: ( ( ( rule__Group__AbbreviationAssignment_2 ) ) ( ( rule__Group__AbbreviationAssignment_2 )* ) )
            {
            // InternalWebMate.g:1745:1: ( ( ( rule__Group__AbbreviationAssignment_2 ) ) ( ( rule__Group__AbbreviationAssignment_2 )* ) )
            // InternalWebMate.g:1746:2: ( ( rule__Group__AbbreviationAssignment_2 ) ) ( ( rule__Group__AbbreviationAssignment_2 )* )
            {
            // InternalWebMate.g:1746:2: ( ( rule__Group__AbbreviationAssignment_2 ) )
            // InternalWebMate.g:1747:3: ( rule__Group__AbbreviationAssignment_2 )
            {
             before(grammarAccess.getGroupAccess().getAbbreviationAssignment_2()); 
            // InternalWebMate.g:1748:3: ( rule__Group__AbbreviationAssignment_2 )
            // InternalWebMate.g:1748:4: rule__Group__AbbreviationAssignment_2
            {
            pushFollow(FOLLOW_5);
            rule__Group__AbbreviationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getAbbreviationAssignment_2()); 

            }

            // InternalWebMate.g:1751:2: ( ( rule__Group__AbbreviationAssignment_2 )* )
            // InternalWebMate.g:1752:3: ( rule__Group__AbbreviationAssignment_2 )*
            {
             before(grammarAccess.getGroupAccess().getAbbreviationAssignment_2()); 
            // InternalWebMate.g:1753:3: ( rule__Group__AbbreviationAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==22) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalWebMate.g:1753:4: rule__Group__AbbreviationAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Group__AbbreviationAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalWebMate.g:1762:1: rule__Group__Group__3 : rule__Group__Group__3__Impl ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1766:1: ( rule__Group__Group__3__Impl )
            // InternalWebMate.g:1767:2: rule__Group__Group__3__Impl
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
    // InternalWebMate.g:1773:1: rule__Group__Group__3__Impl : ( ')' ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1777:1: ( ( ')' ) )
            // InternalWebMate.g:1778:1: ( ')' )
            {
            // InternalWebMate.g:1778:1: ( ')' )
            // InternalWebMate.g:1779:2: ')'
            {
             before(grammarAccess.getGroupAccess().getRightParenthesisKeyword_3()); 
            match(input,34,FOLLOW_2); 
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
    // InternalWebMate.g:1789:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1793:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalWebMate.g:1794:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalWebMate.g:1801:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1805:1: ( ( ( '-' )? ) )
            // InternalWebMate.g:1806:1: ( ( '-' )? )
            {
            // InternalWebMate.g:1806:1: ( ( '-' )? )
            // InternalWebMate.g:1807:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalWebMate.g:1808:2: ( '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalWebMate.g:1808:3: '-'
                    {
                    match(input,35,FOLLOW_2); 

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
    // InternalWebMate.g:1816:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1820:1: ( rule__EInt__Group__1__Impl )
            // InternalWebMate.g:1821:2: rule__EInt__Group__1__Impl
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
    // InternalWebMate.g:1827:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1831:1: ( ( RULE_INT ) )
            // InternalWebMate.g:1832:1: ( RULE_INT )
            {
            // InternalWebMate.g:1832:1: ( RULE_INT )
            // InternalWebMate.g:1833:2: RULE_INT
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
    // InternalWebMate.g:1843:1: rule__HTML__AbbreviationAssignment_1 : ( ruleAbbreviation ) ;
    public final void rule__HTML__AbbreviationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1847:1: ( ( ruleAbbreviation ) )
            // InternalWebMate.g:1848:2: ( ruleAbbreviation )
            {
            // InternalWebMate.g:1848:2: ( ruleAbbreviation )
            // InternalWebMate.g:1849:3: ruleAbbreviation
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
    // InternalWebMate.g:1858:1: rule__Abbreviation__AbbreviationAssignment_2_0 : ( ( ruleEString ) ) ;
    public final void rule__Abbreviation__AbbreviationAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1862:1: ( ( ( ruleEString ) ) )
            // InternalWebMate.g:1863:2: ( ( ruleEString ) )
            {
            // InternalWebMate.g:1863:2: ( ( ruleEString ) )
            // InternalWebMate.g:1864:3: ( ruleEString )
            {
             before(grammarAccess.getAbbreviationAccess().getAbbreviationAbbreviationCrossReference_2_0_0()); 
            // InternalWebMate.g:1865:3: ( ruleEString )
            // InternalWebMate.g:1866:4: ruleEString
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
    // InternalWebMate.g:1877:1: rule__Abbreviation__TagsAssignment_2_1_0 : ( ruleTag ) ;
    public final void rule__Abbreviation__TagsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1881:1: ( ( ruleTag ) )
            // InternalWebMate.g:1882:2: ( ruleTag )
            {
            // InternalWebMate.g:1882:2: ( ruleTag )
            // InternalWebMate.g:1883:3: ruleTag
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
    // InternalWebMate.g:1892:1: rule__Abbreviation__IdsAssignment_2_1_1_0 : ( ruleID0 ) ;
    public final void rule__Abbreviation__IdsAssignment_2_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1896:1: ( ( ruleID0 ) )
            // InternalWebMate.g:1897:2: ( ruleID0 )
            {
            // InternalWebMate.g:1897:2: ( ruleID0 )
            // InternalWebMate.g:1898:3: ruleID0
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
    // InternalWebMate.g:1907:1: rule__Abbreviation__SymbolsAssignment_2_1_1_1 : ( ruleSymbol ) ;
    public final void rule__Abbreviation__SymbolsAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1911:1: ( ( ruleSymbol ) )
            // InternalWebMate.g:1912:2: ( ruleSymbol )
            {
            // InternalWebMate.g:1912:2: ( ruleSymbol )
            // InternalWebMate.g:1913:3: ruleSymbol
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
    // InternalWebMate.g:1922:1: rule__Abbreviation__ClassesAssignment_2_1_1_2 : ( ruleClass ) ;
    public final void rule__Abbreviation__ClassesAssignment_2_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1926:1: ( ( ruleClass ) )
            // InternalWebMate.g:1927:2: ( ruleClass )
            {
            // InternalWebMate.g:1927:2: ( ruleClass )
            // InternalWebMate.g:1928:3: ruleClass
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
    // InternalWebMate.g:1937:1: rule__Abbreviation__AttributesAssignment_2_1_1_3 : ( ruleAttribute ) ;
    public final void rule__Abbreviation__AttributesAssignment_2_1_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1941:1: ( ( ruleAttribute ) )
            // InternalWebMate.g:1942:2: ( ruleAttribute )
            {
            // InternalWebMate.g:1942:2: ( ruleAttribute )
            // InternalWebMate.g:1943:3: ruleAttribute
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
    // InternalWebMate.g:1952:1: rule__Abbreviation__GroupAssignment_2_1_1_4 : ( ruleGroup ) ;
    public final void rule__Abbreviation__GroupAssignment_2_1_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1956:1: ( ( ruleGroup ) )
            // InternalWebMate.g:1957:2: ( ruleGroup )
            {
            // InternalWebMate.g:1957:2: ( ruleGroup )
            // InternalWebMate.g:1958:3: ruleGroup
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
    // InternalWebMate.g:1967:1: rule__ID0__IdNameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__ID0__IdNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1971:1: ( ( ruleEString ) )
            // InternalWebMate.g:1972:2: ( ruleEString )
            {
            // InternalWebMate.g:1972:2: ( ruleEString )
            // InternalWebMate.g:1973:3: ruleEString
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
    // InternalWebMate.g:1982:1: rule__Symbol__CountAssignment_0_1_1 : ( ruleEInt ) ;
    public final void rule__Symbol__CountAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1986:1: ( ( ruleEInt ) )
            // InternalWebMate.g:1987:2: ( ruleEInt )
            {
            // InternalWebMate.g:1987:2: ( ruleEInt )
            // InternalWebMate.g:1988:3: ruleEInt
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
    // InternalWebMate.g:1997:1: rule__Symbol__TagAssignment_1_1 : ( ruleTag ) ;
    public final void rule__Symbol__TagAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:2001:1: ( ( ruleTag ) )
            // InternalWebMate.g:2002:2: ( ruleTag )
            {
            // InternalWebMate.g:2002:2: ( ruleTag )
            // InternalWebMate.g:2003:3: ruleTag
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
    // InternalWebMate.g:2012:1: rule__Symbol__TagAssignment_2_1 : ( ruleTag ) ;
    public final void rule__Symbol__TagAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:2016:1: ( ( ruleTag ) )
            // InternalWebMate.g:2017:2: ( ruleTag )
            {
            // InternalWebMate.g:2017:2: ( ruleTag )
            // InternalWebMate.g:2018:3: ruleTag
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
    // InternalWebMate.g:2027:1: rule__Symbol__TagAssignment_3_1 : ( ruleTag ) ;
    public final void rule__Symbol__TagAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:2031:1: ( ( ruleTag ) )
            // InternalWebMate.g:2032:2: ( ruleTag )
            {
            // InternalWebMate.g:2032:2: ( ruleTag )
            // InternalWebMate.g:2033:3: ruleTag
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


    // $ANTLR start "rule__Symbol__SymAssignment_4"
    // InternalWebMate.g:2042:1: rule__Symbol__SymAssignment_4 : ( ruleValidSymbol ) ;
    public final void rule__Symbol__SymAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:2046:1: ( ( ruleValidSymbol ) )
            // InternalWebMate.g:2047:2: ( ruleValidSymbol )
            {
            // InternalWebMate.g:2047:2: ( ruleValidSymbol )
            // InternalWebMate.g:2048:3: ruleValidSymbol
            {
             before(grammarAccess.getSymbolAccess().getSymValidSymbolEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleValidSymbol();

            state._fsp--;

             after(grammarAccess.getSymbolAccess().getSymValidSymbolEnumRuleCall_4_0()); 

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
    // $ANTLR end "rule__Symbol__SymAssignment_4"


    // $ANTLR start "rule__Tag__TagNameAssignment_1"
    // InternalWebMate.g:2057:1: rule__Tag__TagNameAssignment_1 : ( ruleHTMLTag ) ;
    public final void rule__Tag__TagNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:2061:1: ( ( ruleHTMLTag ) )
            // InternalWebMate.g:2062:2: ( ruleHTMLTag )
            {
            // InternalWebMate.g:2062:2: ( ruleHTMLTag )
            // InternalWebMate.g:2063:3: ruleHTMLTag
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
    // InternalWebMate.g:2072:1: rule__Tag__ClassAssignment_2 : ( ruleClass ) ;
    public final void rule__Tag__ClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:2076:1: ( ( ruleClass ) )
            // InternalWebMate.g:2077:2: ( ruleClass )
            {
            // InternalWebMate.g:2077:2: ( ruleClass )
            // InternalWebMate.g:2078:3: ruleClass
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
    // InternalWebMate.g:2087:1: rule__Tag__IdAssignment_3 : ( ruleID0 ) ;
    public final void rule__Tag__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:2091:1: ( ( ruleID0 ) )
            // InternalWebMate.g:2092:2: ( ruleID0 )
            {
            // InternalWebMate.g:2092:2: ( ruleID0 )
            // InternalWebMate.g:2093:3: ruleID0
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
    // InternalWebMate.g:2102:1: rule__Tag__AttributeAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Tag__AttributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:2106:1: ( ( ruleAttribute ) )
            // InternalWebMate.g:2107:2: ( ruleAttribute )
            {
            // InternalWebMate.g:2107:2: ( ruleAttribute )
            // InternalWebMate.g:2108:3: ruleAttribute
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
    // InternalWebMate.g:2117:1: rule__Class__ClassNameAssignment_2 : ( ruleEString ) ;
    public final void rule__Class__ClassNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:2121:1: ( ( ruleEString ) )
            // InternalWebMate.g:2122:2: ( ruleEString )
            {
            // InternalWebMate.g:2122:2: ( ruleEString )
            // InternalWebMate.g:2123:3: ruleEString
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
    // InternalWebMate.g:2132:1: rule__Attribute__AttributeNameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__Attribute__AttributeNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:2136:1: ( ( ruleEString ) )
            // InternalWebMate.g:2137:2: ( ruleEString )
            {
            // InternalWebMate.g:2137:2: ( ruleEString )
            // InternalWebMate.g:2138:3: ruleEString
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
    // InternalWebMate.g:2147:1: rule__Attribute__AttributeValueAssignment_1_2_1 : ( ruleEString ) ;
    public final void rule__Attribute__AttributeValueAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:2151:1: ( ( ruleEString ) )
            // InternalWebMate.g:2152:2: ( ruleEString )
            {
            // InternalWebMate.g:2152:2: ( ruleEString )
            // InternalWebMate.g:2153:3: ruleEString
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
    // InternalWebMate.g:2162:1: rule__Group__AbbreviationAssignment_2 : ( ruleAbbreviation ) ;
    public final void rule__Group__AbbreviationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:2166:1: ( ( ruleAbbreviation ) )
            // InternalWebMate.g:2167:2: ( ruleAbbreviation )
            {
            // InternalWebMate.g:2167:2: ( ruleAbbreviation )
            // InternalWebMate.g:2168:3: ruleAbbreviation
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000003E0030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000027F01F800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000003E0032L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000001E01F802L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000061000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});

}