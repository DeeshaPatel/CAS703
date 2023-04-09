package org.xtext.example.mydsl1.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl1.services.WebMateGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWebMateParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'div'", "'h1'", "'p'", "'ul'", "'li'", "'a'", "'img'", "'form'", "'input'", "'button'", "'option'", "'select'", "'+'", "'*'", "'>'", "'{'", "'}'", "'#'", "'.'", "'['", "']'", "'='", "'('", "')'", "'-'"
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


    // $ANTLR start "ruleSYM"
    // InternalWebMate.g:319:1: ruleSYM : ( ( rule__SYM__Alternatives ) ) ;
    public final void ruleSYM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:323:1: ( ( ( rule__SYM__Alternatives ) ) )
            // InternalWebMate.g:324:2: ( ( rule__SYM__Alternatives ) )
            {
            // InternalWebMate.g:324:2: ( ( rule__SYM__Alternatives ) )
            // InternalWebMate.g:325:3: ( rule__SYM__Alternatives )
            {
             before(grammarAccess.getSYMAccess().getAlternatives()); 
            // InternalWebMate.g:326:3: ( rule__SYM__Alternatives )
            // InternalWebMate.g:326:4: rule__SYM__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SYM__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSYMAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSYM"


    // $ANTLR start "rule__Abbreviation__Alternatives_2"
    // InternalWebMate.g:334:1: rule__Abbreviation__Alternatives_2 : ( ( ( rule__Abbreviation__AbbreviationAssignment_2_0 )* ) | ( ( rule__Abbreviation__Group_2_1__0 ) ) );
    public final void rule__Abbreviation__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:338:1: ( ( ( rule__Abbreviation__AbbreviationAssignment_2_0 )* ) | ( ( rule__Abbreviation__Group_2_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)||LA2_0==27) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=11 && LA2_0<=22)) ) {
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
    // InternalWebMate.g:355:1: rule__Symbol__Alternatives : ( ( ( rule__Symbol__Group_0__0 ) ) | ( ( rule__Symbol__Group_1__0 ) ) );
    public final void rule__Symbol__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:359:1: ( ( ( rule__Symbol__Group_0__0 ) ) | ( ( rule__Symbol__Group_1__0 ) ) )
            int alt3=2;
            switch ( input.LA(1) ) {
            case 23:
                {
                int LA3_1 = input.LA(2);

                if ( ((LA3_1>=11 && LA3_1<=22)) ) {
                    alt3=2;
                }
                else if ( (LA3_1==RULE_INT||LA3_1==35) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                int LA3_2 = input.LA(2);

                if ( ((LA3_2>=11 && LA3_2<=22)) ) {
                    alt3=2;
                }
                else if ( (LA3_2==RULE_INT||LA3_2==35) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 25:
                {
                int LA3_3 = input.LA(2);

                if ( ((LA3_3>=11 && LA3_3<=22)) ) {
                    alt3=2;
                }
                else if ( (LA3_3==RULE_INT||LA3_3==35) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
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

            }
        }
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
    // InternalWebMate.g:376:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:380:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalWebMate.g:381:2: ( RULE_STRING )
                    {
                    // InternalWebMate.g:381:2: ( RULE_STRING )
                    // InternalWebMate.g:382:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebMate.g:387:2: ( RULE_ID )
                    {
                    // InternalWebMate.g:387:2: ( RULE_ID )
                    // InternalWebMate.g:388:3: RULE_ID
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
    // InternalWebMate.g:397:1: rule__HTMLTag__Alternatives : ( ( ( 'div' ) ) | ( ( 'h1' ) ) | ( ( 'p' ) ) | ( ( 'ul' ) ) | ( ( 'li' ) ) | ( ( 'a' ) ) | ( ( 'img' ) ) | ( ( 'form' ) ) | ( ( 'input' ) ) | ( ( 'button' ) ) | ( ( 'option' ) ) | ( ( 'select' ) ) );
    public final void rule__HTMLTag__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:401:1: ( ( ( 'div' ) ) | ( ( 'h1' ) ) | ( ( 'p' ) ) | ( ( 'ul' ) ) | ( ( 'li' ) ) | ( ( 'a' ) ) | ( ( 'img' ) ) | ( ( 'form' ) ) | ( ( 'input' ) ) | ( ( 'button' ) ) | ( ( 'option' ) ) | ( ( 'select' ) ) )
            int alt5=12;
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
            case 17:
                {
                alt5=7;
                }
                break;
            case 18:
                {
                alt5=8;
                }
                break;
            case 19:
                {
                alt5=9;
                }
                break;
            case 20:
                {
                alt5=10;
                }
                break;
            case 21:
                {
                alt5=11;
                }
                break;
            case 22:
                {
                alt5=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalWebMate.g:402:2: ( ( 'div' ) )
                    {
                    // InternalWebMate.g:402:2: ( ( 'div' ) )
                    // InternalWebMate.g:403:3: ( 'div' )
                    {
                     before(grammarAccess.getHTMLTagAccess().getDivEnumLiteralDeclaration_0()); 
                    // InternalWebMate.g:404:3: ( 'div' )
                    // InternalWebMate.g:404:4: 'div'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getHTMLTagAccess().getDivEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebMate.g:408:2: ( ( 'h1' ) )
                    {
                    // InternalWebMate.g:408:2: ( ( 'h1' ) )
                    // InternalWebMate.g:409:3: ( 'h1' )
                    {
                     before(grammarAccess.getHTMLTagAccess().getH1EnumLiteralDeclaration_1()); 
                    // InternalWebMate.g:410:3: ( 'h1' )
                    // InternalWebMate.g:410:4: 'h1'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getHTMLTagAccess().getH1EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWebMate.g:414:2: ( ( 'p' ) )
                    {
                    // InternalWebMate.g:414:2: ( ( 'p' ) )
                    // InternalWebMate.g:415:3: ( 'p' )
                    {
                     before(grammarAccess.getHTMLTagAccess().getPEnumLiteralDeclaration_2()); 
                    // InternalWebMate.g:416:3: ( 'p' )
                    // InternalWebMate.g:416:4: 'p'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getHTMLTagAccess().getPEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalWebMate.g:420:2: ( ( 'ul' ) )
                    {
                    // InternalWebMate.g:420:2: ( ( 'ul' ) )
                    // InternalWebMate.g:421:3: ( 'ul' )
                    {
                     before(grammarAccess.getHTMLTagAccess().getUlEnumLiteralDeclaration_3()); 
                    // InternalWebMate.g:422:3: ( 'ul' )
                    // InternalWebMate.g:422:4: 'ul'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getHTMLTagAccess().getUlEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalWebMate.g:426:2: ( ( 'li' ) )
                    {
                    // InternalWebMate.g:426:2: ( ( 'li' ) )
                    // InternalWebMate.g:427:3: ( 'li' )
                    {
                     before(grammarAccess.getHTMLTagAccess().getLiEnumLiteralDeclaration_4()); 
                    // InternalWebMate.g:428:3: ( 'li' )
                    // InternalWebMate.g:428:4: 'li'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getHTMLTagAccess().getLiEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalWebMate.g:432:2: ( ( 'a' ) )
                    {
                    // InternalWebMate.g:432:2: ( ( 'a' ) )
                    // InternalWebMate.g:433:3: ( 'a' )
                    {
                     before(grammarAccess.getHTMLTagAccess().getAEnumLiteralDeclaration_5()); 
                    // InternalWebMate.g:434:3: ( 'a' )
                    // InternalWebMate.g:434:4: 'a'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getHTMLTagAccess().getAEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalWebMate.g:438:2: ( ( 'img' ) )
                    {
                    // InternalWebMate.g:438:2: ( ( 'img' ) )
                    // InternalWebMate.g:439:3: ( 'img' )
                    {
                     before(grammarAccess.getHTMLTagAccess().getImgEnumLiteralDeclaration_6()); 
                    // InternalWebMate.g:440:3: ( 'img' )
                    // InternalWebMate.g:440:4: 'img'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getHTMLTagAccess().getImgEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalWebMate.g:444:2: ( ( 'form' ) )
                    {
                    // InternalWebMate.g:444:2: ( ( 'form' ) )
                    // InternalWebMate.g:445:3: ( 'form' )
                    {
                     before(grammarAccess.getHTMLTagAccess().getFormEnumLiteralDeclaration_7()); 
                    // InternalWebMate.g:446:3: ( 'form' )
                    // InternalWebMate.g:446:4: 'form'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getHTMLTagAccess().getFormEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalWebMate.g:450:2: ( ( 'input' ) )
                    {
                    // InternalWebMate.g:450:2: ( ( 'input' ) )
                    // InternalWebMate.g:451:3: ( 'input' )
                    {
                     before(grammarAccess.getHTMLTagAccess().getInputEnumLiteralDeclaration_8()); 
                    // InternalWebMate.g:452:3: ( 'input' )
                    // InternalWebMate.g:452:4: 'input'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getHTMLTagAccess().getInputEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalWebMate.g:456:2: ( ( 'button' ) )
                    {
                    // InternalWebMate.g:456:2: ( ( 'button' ) )
                    // InternalWebMate.g:457:3: ( 'button' )
                    {
                     before(grammarAccess.getHTMLTagAccess().getButtonEnumLiteralDeclaration_9()); 
                    // InternalWebMate.g:458:3: ( 'button' )
                    // InternalWebMate.g:458:4: 'button'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getHTMLTagAccess().getButtonEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalWebMate.g:462:2: ( ( 'option' ) )
                    {
                    // InternalWebMate.g:462:2: ( ( 'option' ) )
                    // InternalWebMate.g:463:3: ( 'option' )
                    {
                     before(grammarAccess.getHTMLTagAccess().getOptionEnumLiteralDeclaration_10()); 
                    // InternalWebMate.g:464:3: ( 'option' )
                    // InternalWebMate.g:464:4: 'option'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getHTMLTagAccess().getOptionEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalWebMate.g:468:2: ( ( 'select' ) )
                    {
                    // InternalWebMate.g:468:2: ( ( 'select' ) )
                    // InternalWebMate.g:469:3: ( 'select' )
                    {
                     before(grammarAccess.getHTMLTagAccess().getSelectEnumLiteralDeclaration_11()); 
                    // InternalWebMate.g:470:3: ( 'select' )
                    // InternalWebMate.g:470:4: 'select'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getHTMLTagAccess().getSelectEnumLiteralDeclaration_11()); 

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


    // $ANTLR start "rule__SYM__Alternatives"
    // InternalWebMate.g:478:1: rule__SYM__Alternatives : ( ( ( '+' ) ) | ( ( '*' ) ) | ( ( '>' ) ) );
    public final void rule__SYM__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:482:1: ( ( ( '+' ) ) | ( ( '*' ) ) | ( ( '>' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt6=1;
                }
                break;
            case 24:
                {
                alt6=2;
                }
                break;
            case 25:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalWebMate.g:483:2: ( ( '+' ) )
                    {
                    // InternalWebMate.g:483:2: ( ( '+' ) )
                    // InternalWebMate.g:484:3: ( '+' )
                    {
                     before(grammarAccess.getSYMAccess().getPLUSEnumLiteralDeclaration_0()); 
                    // InternalWebMate.g:485:3: ( '+' )
                    // InternalWebMate.g:485:4: '+'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getSYMAccess().getPLUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebMate.g:489:2: ( ( '*' ) )
                    {
                    // InternalWebMate.g:489:2: ( ( '*' ) )
                    // InternalWebMate.g:490:3: ( '*' )
                    {
                     before(grammarAccess.getSYMAccess().getMULTIPLYEnumLiteralDeclaration_1()); 
                    // InternalWebMate.g:491:3: ( '*' )
                    // InternalWebMate.g:491:4: '*'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getSYMAccess().getMULTIPLYEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWebMate.g:495:2: ( ( '>' ) )
                    {
                    // InternalWebMate.g:495:2: ( ( '>' ) )
                    // InternalWebMate.g:496:3: ( '>' )
                    {
                     before(grammarAccess.getSYMAccess().getGREATEREnumLiteralDeclaration_2()); 
                    // InternalWebMate.g:497:3: ( '>' )
                    // InternalWebMate.g:497:4: '>'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getSYMAccess().getGREATEREnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__SYM__Alternatives"


    // $ANTLR start "rule__HTML__Group__0"
    // InternalWebMate.g:505:1: rule__HTML__Group__0 : rule__HTML__Group__0__Impl rule__HTML__Group__1 ;
    public final void rule__HTML__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:509:1: ( rule__HTML__Group__0__Impl rule__HTML__Group__1 )
            // InternalWebMate.g:510:2: rule__HTML__Group__0__Impl rule__HTML__Group__1
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
    // InternalWebMate.g:517:1: rule__HTML__Group__0__Impl : ( () ) ;
    public final void rule__HTML__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:521:1: ( ( () ) )
            // InternalWebMate.g:522:1: ( () )
            {
            // InternalWebMate.g:522:1: ( () )
            // InternalWebMate.g:523:2: ()
            {
             before(grammarAccess.getHTMLAccess().getHTMLAction_0()); 
            // InternalWebMate.g:524:2: ()
            // InternalWebMate.g:524:3: 
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
    // InternalWebMate.g:532:1: rule__HTML__Group__1 : rule__HTML__Group__1__Impl ;
    public final void rule__HTML__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:536:1: ( rule__HTML__Group__1__Impl )
            // InternalWebMate.g:537:2: rule__HTML__Group__1__Impl
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
    // InternalWebMate.g:543:1: rule__HTML__Group__1__Impl : ( ( ( rule__HTML__AbbreviationAssignment_1 ) ) ( ( rule__HTML__AbbreviationAssignment_1 )* ) ) ;
    public final void rule__HTML__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:547:1: ( ( ( ( rule__HTML__AbbreviationAssignment_1 ) ) ( ( rule__HTML__AbbreviationAssignment_1 )* ) ) )
            // InternalWebMate.g:548:1: ( ( ( rule__HTML__AbbreviationAssignment_1 ) ) ( ( rule__HTML__AbbreviationAssignment_1 )* ) )
            {
            // InternalWebMate.g:548:1: ( ( ( rule__HTML__AbbreviationAssignment_1 ) ) ( ( rule__HTML__AbbreviationAssignment_1 )* ) )
            // InternalWebMate.g:549:2: ( ( rule__HTML__AbbreviationAssignment_1 ) ) ( ( rule__HTML__AbbreviationAssignment_1 )* )
            {
            // InternalWebMate.g:549:2: ( ( rule__HTML__AbbreviationAssignment_1 ) )
            // InternalWebMate.g:550:3: ( rule__HTML__AbbreviationAssignment_1 )
            {
             before(grammarAccess.getHTMLAccess().getAbbreviationAssignment_1()); 
            // InternalWebMate.g:551:3: ( rule__HTML__AbbreviationAssignment_1 )
            // InternalWebMate.g:551:4: rule__HTML__AbbreviationAssignment_1
            {
            pushFollow(FOLLOW_5);
            rule__HTML__AbbreviationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHTMLAccess().getAbbreviationAssignment_1()); 

            }

            // InternalWebMate.g:554:2: ( ( rule__HTML__AbbreviationAssignment_1 )* )
            // InternalWebMate.g:555:3: ( rule__HTML__AbbreviationAssignment_1 )*
            {
             before(grammarAccess.getHTMLAccess().getAbbreviationAssignment_1()); 
            // InternalWebMate.g:556:3: ( rule__HTML__AbbreviationAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalWebMate.g:556:4: rule__HTML__AbbreviationAssignment_1
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
    // InternalWebMate.g:566:1: rule__Abbreviation__Group__0 : rule__Abbreviation__Group__0__Impl rule__Abbreviation__Group__1 ;
    public final void rule__Abbreviation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:570:1: ( rule__Abbreviation__Group__0__Impl rule__Abbreviation__Group__1 )
            // InternalWebMate.g:571:2: rule__Abbreviation__Group__0__Impl rule__Abbreviation__Group__1
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
    // InternalWebMate.g:578:1: rule__Abbreviation__Group__0__Impl : ( () ) ;
    public final void rule__Abbreviation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:582:1: ( ( () ) )
            // InternalWebMate.g:583:1: ( () )
            {
            // InternalWebMate.g:583:1: ( () )
            // InternalWebMate.g:584:2: ()
            {
             before(grammarAccess.getAbbreviationAccess().getAbbreviationAction_0()); 
            // InternalWebMate.g:585:2: ()
            // InternalWebMate.g:585:3: 
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
    // InternalWebMate.g:593:1: rule__Abbreviation__Group__1 : rule__Abbreviation__Group__1__Impl rule__Abbreviation__Group__2 ;
    public final void rule__Abbreviation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:597:1: ( rule__Abbreviation__Group__1__Impl rule__Abbreviation__Group__2 )
            // InternalWebMate.g:598:2: rule__Abbreviation__Group__1__Impl rule__Abbreviation__Group__2
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
    // InternalWebMate.g:605:1: rule__Abbreviation__Group__1__Impl : ( '{' ) ;
    public final void rule__Abbreviation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:609:1: ( ( '{' ) )
            // InternalWebMate.g:610:1: ( '{' )
            {
            // InternalWebMate.g:610:1: ( '{' )
            // InternalWebMate.g:611:2: '{'
            {
             before(grammarAccess.getAbbreviationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalWebMate.g:620:1: rule__Abbreviation__Group__2 : rule__Abbreviation__Group__2__Impl rule__Abbreviation__Group__3 ;
    public final void rule__Abbreviation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:624:1: ( rule__Abbreviation__Group__2__Impl rule__Abbreviation__Group__3 )
            // InternalWebMate.g:625:2: rule__Abbreviation__Group__2__Impl rule__Abbreviation__Group__3
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
    // InternalWebMate.g:632:1: rule__Abbreviation__Group__2__Impl : ( ( rule__Abbreviation__Alternatives_2 ) ) ;
    public final void rule__Abbreviation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:636:1: ( ( ( rule__Abbreviation__Alternatives_2 ) ) )
            // InternalWebMate.g:637:1: ( ( rule__Abbreviation__Alternatives_2 ) )
            {
            // InternalWebMate.g:637:1: ( ( rule__Abbreviation__Alternatives_2 ) )
            // InternalWebMate.g:638:2: ( rule__Abbreviation__Alternatives_2 )
            {
             before(grammarAccess.getAbbreviationAccess().getAlternatives_2()); 
            // InternalWebMate.g:639:2: ( rule__Abbreviation__Alternatives_2 )
            // InternalWebMate.g:639:3: rule__Abbreviation__Alternatives_2
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
    // InternalWebMate.g:647:1: rule__Abbreviation__Group__3 : rule__Abbreviation__Group__3__Impl ;
    public final void rule__Abbreviation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:651:1: ( rule__Abbreviation__Group__3__Impl )
            // InternalWebMate.g:652:2: rule__Abbreviation__Group__3__Impl
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
    // InternalWebMate.g:658:1: rule__Abbreviation__Group__3__Impl : ( '}' ) ;
    public final void rule__Abbreviation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:662:1: ( ( '}' ) )
            // InternalWebMate.g:663:1: ( '}' )
            {
            // InternalWebMate.g:663:1: ( '}' )
            // InternalWebMate.g:664:2: '}'
            {
             before(grammarAccess.getAbbreviationAccess().getRightCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalWebMate.g:674:1: rule__Abbreviation__Group_2_1__0 : rule__Abbreviation__Group_2_1__0__Impl rule__Abbreviation__Group_2_1__1 ;
    public final void rule__Abbreviation__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:678:1: ( rule__Abbreviation__Group_2_1__0__Impl rule__Abbreviation__Group_2_1__1 )
            // InternalWebMate.g:679:2: rule__Abbreviation__Group_2_1__0__Impl rule__Abbreviation__Group_2_1__1
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
    // InternalWebMate.g:686:1: rule__Abbreviation__Group_2_1__0__Impl : ( ( ( rule__Abbreviation__TagsAssignment_2_1_0 ) ) ( ( rule__Abbreviation__TagsAssignment_2_1_0 )* ) ) ;
    public final void rule__Abbreviation__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:690:1: ( ( ( ( rule__Abbreviation__TagsAssignment_2_1_0 ) ) ( ( rule__Abbreviation__TagsAssignment_2_1_0 )* ) ) )
            // InternalWebMate.g:691:1: ( ( ( rule__Abbreviation__TagsAssignment_2_1_0 ) ) ( ( rule__Abbreviation__TagsAssignment_2_1_0 )* ) )
            {
            // InternalWebMate.g:691:1: ( ( ( rule__Abbreviation__TagsAssignment_2_1_0 ) ) ( ( rule__Abbreviation__TagsAssignment_2_1_0 )* ) )
            // InternalWebMate.g:692:2: ( ( rule__Abbreviation__TagsAssignment_2_1_0 ) ) ( ( rule__Abbreviation__TagsAssignment_2_1_0 )* )
            {
            // InternalWebMate.g:692:2: ( ( rule__Abbreviation__TagsAssignment_2_1_0 ) )
            // InternalWebMate.g:693:3: ( rule__Abbreviation__TagsAssignment_2_1_0 )
            {
             before(grammarAccess.getAbbreviationAccess().getTagsAssignment_2_1_0()); 
            // InternalWebMate.g:694:3: ( rule__Abbreviation__TagsAssignment_2_1_0 )
            // InternalWebMate.g:694:4: rule__Abbreviation__TagsAssignment_2_1_0
            {
            pushFollow(FOLLOW_9);
            rule__Abbreviation__TagsAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAbbreviationAccess().getTagsAssignment_2_1_0()); 

            }

            // InternalWebMate.g:697:2: ( ( rule__Abbreviation__TagsAssignment_2_1_0 )* )
            // InternalWebMate.g:698:3: ( rule__Abbreviation__TagsAssignment_2_1_0 )*
            {
             before(grammarAccess.getAbbreviationAccess().getTagsAssignment_2_1_0()); 
            // InternalWebMate.g:699:3: ( rule__Abbreviation__TagsAssignment_2_1_0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=11 && LA8_0<=22)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalWebMate.g:699:4: rule__Abbreviation__TagsAssignment_2_1_0
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
    // InternalWebMate.g:708:1: rule__Abbreviation__Group_2_1__1 : rule__Abbreviation__Group_2_1__1__Impl ;
    public final void rule__Abbreviation__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:712:1: ( rule__Abbreviation__Group_2_1__1__Impl )
            // InternalWebMate.g:713:2: rule__Abbreviation__Group_2_1__1__Impl
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
    // InternalWebMate.g:719:1: rule__Abbreviation__Group_2_1__1__Impl : ( ( rule__Abbreviation__Group_2_1_1__0 ) ) ;
    public final void rule__Abbreviation__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:723:1: ( ( ( rule__Abbreviation__Group_2_1_1__0 ) ) )
            // InternalWebMate.g:724:1: ( ( rule__Abbreviation__Group_2_1_1__0 ) )
            {
            // InternalWebMate.g:724:1: ( ( rule__Abbreviation__Group_2_1_1__0 ) )
            // InternalWebMate.g:725:2: ( rule__Abbreviation__Group_2_1_1__0 )
            {
             before(grammarAccess.getAbbreviationAccess().getGroup_2_1_1()); 
            // InternalWebMate.g:726:2: ( rule__Abbreviation__Group_2_1_1__0 )
            // InternalWebMate.g:726:3: rule__Abbreviation__Group_2_1_1__0
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
    // InternalWebMate.g:735:1: rule__Abbreviation__Group_2_1_1__0 : rule__Abbreviation__Group_2_1_1__0__Impl rule__Abbreviation__Group_2_1_1__1 ;
    public final void rule__Abbreviation__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:739:1: ( rule__Abbreviation__Group_2_1_1__0__Impl rule__Abbreviation__Group_2_1_1__1 )
            // InternalWebMate.g:740:2: rule__Abbreviation__Group_2_1_1__0__Impl rule__Abbreviation__Group_2_1_1__1
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
    // InternalWebMate.g:747:1: rule__Abbreviation__Group_2_1_1__0__Impl : ( ( rule__Abbreviation__IdsAssignment_2_1_1_0 )* ) ;
    public final void rule__Abbreviation__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:751:1: ( ( ( rule__Abbreviation__IdsAssignment_2_1_1_0 )* ) )
            // InternalWebMate.g:752:1: ( ( rule__Abbreviation__IdsAssignment_2_1_1_0 )* )
            {
            // InternalWebMate.g:752:1: ( ( rule__Abbreviation__IdsAssignment_2_1_1_0 )* )
            // InternalWebMate.g:753:2: ( rule__Abbreviation__IdsAssignment_2_1_1_0 )*
            {
             before(grammarAccess.getAbbreviationAccess().getIdsAssignment_2_1_1_0()); 
            // InternalWebMate.g:754:2: ( rule__Abbreviation__IdsAssignment_2_1_1_0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalWebMate.g:754:3: rule__Abbreviation__IdsAssignment_2_1_1_0
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
    // InternalWebMate.g:762:1: rule__Abbreviation__Group_2_1_1__1 : rule__Abbreviation__Group_2_1_1__1__Impl rule__Abbreviation__Group_2_1_1__2 ;
    public final void rule__Abbreviation__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:766:1: ( rule__Abbreviation__Group_2_1_1__1__Impl rule__Abbreviation__Group_2_1_1__2 )
            // InternalWebMate.g:767:2: rule__Abbreviation__Group_2_1_1__1__Impl rule__Abbreviation__Group_2_1_1__2
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
    // InternalWebMate.g:774:1: rule__Abbreviation__Group_2_1_1__1__Impl : ( ( rule__Abbreviation__SymbolsAssignment_2_1_1_1 )* ) ;
    public final void rule__Abbreviation__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:778:1: ( ( ( rule__Abbreviation__SymbolsAssignment_2_1_1_1 )* ) )
            // InternalWebMate.g:779:1: ( ( rule__Abbreviation__SymbolsAssignment_2_1_1_1 )* )
            {
            // InternalWebMate.g:779:1: ( ( rule__Abbreviation__SymbolsAssignment_2_1_1_1 )* )
            // InternalWebMate.g:780:2: ( rule__Abbreviation__SymbolsAssignment_2_1_1_1 )*
            {
             before(grammarAccess.getAbbreviationAccess().getSymbolsAssignment_2_1_1_1()); 
            // InternalWebMate.g:781:2: ( rule__Abbreviation__SymbolsAssignment_2_1_1_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=23 && LA10_0<=25)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalWebMate.g:781:3: rule__Abbreviation__SymbolsAssignment_2_1_1_1
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
    // InternalWebMate.g:789:1: rule__Abbreviation__Group_2_1_1__2 : rule__Abbreviation__Group_2_1_1__2__Impl rule__Abbreviation__Group_2_1_1__3 ;
    public final void rule__Abbreviation__Group_2_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:793:1: ( rule__Abbreviation__Group_2_1_1__2__Impl rule__Abbreviation__Group_2_1_1__3 )
            // InternalWebMate.g:794:2: rule__Abbreviation__Group_2_1_1__2__Impl rule__Abbreviation__Group_2_1_1__3
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
    // InternalWebMate.g:801:1: rule__Abbreviation__Group_2_1_1__2__Impl : ( ( rule__Abbreviation__ClassesAssignment_2_1_1_2 )* ) ;
    public final void rule__Abbreviation__Group_2_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:805:1: ( ( ( rule__Abbreviation__ClassesAssignment_2_1_1_2 )* ) )
            // InternalWebMate.g:806:1: ( ( rule__Abbreviation__ClassesAssignment_2_1_1_2 )* )
            {
            // InternalWebMate.g:806:1: ( ( rule__Abbreviation__ClassesAssignment_2_1_1_2 )* )
            // InternalWebMate.g:807:2: ( rule__Abbreviation__ClassesAssignment_2_1_1_2 )*
            {
             before(grammarAccess.getAbbreviationAccess().getClassesAssignment_2_1_1_2()); 
            // InternalWebMate.g:808:2: ( rule__Abbreviation__ClassesAssignment_2_1_1_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==29) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalWebMate.g:808:3: rule__Abbreviation__ClassesAssignment_2_1_1_2
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
    // InternalWebMate.g:816:1: rule__Abbreviation__Group_2_1_1__3 : rule__Abbreviation__Group_2_1_1__3__Impl rule__Abbreviation__Group_2_1_1__4 ;
    public final void rule__Abbreviation__Group_2_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:820:1: ( rule__Abbreviation__Group_2_1_1__3__Impl rule__Abbreviation__Group_2_1_1__4 )
            // InternalWebMate.g:821:2: rule__Abbreviation__Group_2_1_1__3__Impl rule__Abbreviation__Group_2_1_1__4
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
    // InternalWebMate.g:828:1: rule__Abbreviation__Group_2_1_1__3__Impl : ( ( rule__Abbreviation__AttributesAssignment_2_1_1_3 )* ) ;
    public final void rule__Abbreviation__Group_2_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:832:1: ( ( ( rule__Abbreviation__AttributesAssignment_2_1_1_3 )* ) )
            // InternalWebMate.g:833:1: ( ( rule__Abbreviation__AttributesAssignment_2_1_1_3 )* )
            {
            // InternalWebMate.g:833:1: ( ( rule__Abbreviation__AttributesAssignment_2_1_1_3 )* )
            // InternalWebMate.g:834:2: ( rule__Abbreviation__AttributesAssignment_2_1_1_3 )*
            {
             before(grammarAccess.getAbbreviationAccess().getAttributesAssignment_2_1_1_3()); 
            // InternalWebMate.g:835:2: ( rule__Abbreviation__AttributesAssignment_2_1_1_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==30) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalWebMate.g:835:3: rule__Abbreviation__AttributesAssignment_2_1_1_3
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
    // InternalWebMate.g:843:1: rule__Abbreviation__Group_2_1_1__4 : rule__Abbreviation__Group_2_1_1__4__Impl ;
    public final void rule__Abbreviation__Group_2_1_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:847:1: ( rule__Abbreviation__Group_2_1_1__4__Impl )
            // InternalWebMate.g:848:2: rule__Abbreviation__Group_2_1_1__4__Impl
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
    // InternalWebMate.g:854:1: rule__Abbreviation__Group_2_1_1__4__Impl : ( ( rule__Abbreviation__GroupAssignment_2_1_1_4 )* ) ;
    public final void rule__Abbreviation__Group_2_1_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:858:1: ( ( ( rule__Abbreviation__GroupAssignment_2_1_1_4 )* ) )
            // InternalWebMate.g:859:1: ( ( rule__Abbreviation__GroupAssignment_2_1_1_4 )* )
            {
            // InternalWebMate.g:859:1: ( ( rule__Abbreviation__GroupAssignment_2_1_1_4 )* )
            // InternalWebMate.g:860:2: ( rule__Abbreviation__GroupAssignment_2_1_1_4 )*
            {
             before(grammarAccess.getAbbreviationAccess().getGroupAssignment_2_1_1_4()); 
            // InternalWebMate.g:861:2: ( rule__Abbreviation__GroupAssignment_2_1_1_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==33) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalWebMate.g:861:3: rule__Abbreviation__GroupAssignment_2_1_1_4
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
    // InternalWebMate.g:870:1: rule__ID0__Group__0 : rule__ID0__Group__0__Impl rule__ID0__Group__1 ;
    public final void rule__ID0__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:874:1: ( rule__ID0__Group__0__Impl rule__ID0__Group__1 )
            // InternalWebMate.g:875:2: rule__ID0__Group__0__Impl rule__ID0__Group__1
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
    // InternalWebMate.g:882:1: rule__ID0__Group__0__Impl : ( () ) ;
    public final void rule__ID0__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:886:1: ( ( () ) )
            // InternalWebMate.g:887:1: ( () )
            {
            // InternalWebMate.g:887:1: ( () )
            // InternalWebMate.g:888:2: ()
            {
             before(grammarAccess.getID0Access().getIDAction_0()); 
            // InternalWebMate.g:889:2: ()
            // InternalWebMate.g:889:3: 
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
    // InternalWebMate.g:897:1: rule__ID0__Group__1 : rule__ID0__Group__1__Impl ;
    public final void rule__ID0__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:901:1: ( rule__ID0__Group__1__Impl )
            // InternalWebMate.g:902:2: rule__ID0__Group__1__Impl
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
    // InternalWebMate.g:908:1: rule__ID0__Group__1__Impl : ( ( rule__ID0__Group_1__0 ) ) ;
    public final void rule__ID0__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:912:1: ( ( ( rule__ID0__Group_1__0 ) ) )
            // InternalWebMate.g:913:1: ( ( rule__ID0__Group_1__0 ) )
            {
            // InternalWebMate.g:913:1: ( ( rule__ID0__Group_1__0 ) )
            // InternalWebMate.g:914:2: ( rule__ID0__Group_1__0 )
            {
             before(grammarAccess.getID0Access().getGroup_1()); 
            // InternalWebMate.g:915:2: ( rule__ID0__Group_1__0 )
            // InternalWebMate.g:915:3: rule__ID0__Group_1__0
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
    // InternalWebMate.g:924:1: rule__ID0__Group_1__0 : rule__ID0__Group_1__0__Impl rule__ID0__Group_1__1 ;
    public final void rule__ID0__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:928:1: ( rule__ID0__Group_1__0__Impl rule__ID0__Group_1__1 )
            // InternalWebMate.g:929:2: rule__ID0__Group_1__0__Impl rule__ID0__Group_1__1
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
    // InternalWebMate.g:936:1: rule__ID0__Group_1__0__Impl : ( '#' ) ;
    public final void rule__ID0__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:940:1: ( ( '#' ) )
            // InternalWebMate.g:941:1: ( '#' )
            {
            // InternalWebMate.g:941:1: ( '#' )
            // InternalWebMate.g:942:2: '#'
            {
             before(grammarAccess.getID0Access().getNumberSignKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalWebMate.g:951:1: rule__ID0__Group_1__1 : rule__ID0__Group_1__1__Impl ;
    public final void rule__ID0__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:955:1: ( rule__ID0__Group_1__1__Impl )
            // InternalWebMate.g:956:2: rule__ID0__Group_1__1__Impl
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
    // InternalWebMate.g:962:1: rule__ID0__Group_1__1__Impl : ( ( rule__ID0__IdNameAssignment_1_1 ) ) ;
    public final void rule__ID0__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:966:1: ( ( ( rule__ID0__IdNameAssignment_1_1 ) ) )
            // InternalWebMate.g:967:1: ( ( rule__ID0__IdNameAssignment_1_1 ) )
            {
            // InternalWebMate.g:967:1: ( ( rule__ID0__IdNameAssignment_1_1 ) )
            // InternalWebMate.g:968:2: ( rule__ID0__IdNameAssignment_1_1 )
            {
             before(grammarAccess.getID0Access().getIdNameAssignment_1_1()); 
            // InternalWebMate.g:969:2: ( rule__ID0__IdNameAssignment_1_1 )
            // InternalWebMate.g:969:3: rule__ID0__IdNameAssignment_1_1
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
    // InternalWebMate.g:978:1: rule__Symbol__Group_0__0 : rule__Symbol__Group_0__0__Impl rule__Symbol__Group_0__1 ;
    public final void rule__Symbol__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:982:1: ( rule__Symbol__Group_0__0__Impl rule__Symbol__Group_0__1 )
            // InternalWebMate.g:983:2: rule__Symbol__Group_0__0__Impl rule__Symbol__Group_0__1
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
    // InternalWebMate.g:990:1: rule__Symbol__Group_0__0__Impl : ( () ) ;
    public final void rule__Symbol__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:994:1: ( ( () ) )
            // InternalWebMate.g:995:1: ( () )
            {
            // InternalWebMate.g:995:1: ( () )
            // InternalWebMate.g:996:2: ()
            {
             before(grammarAccess.getSymbolAccess().getSymbolAction_0_0()); 
            // InternalWebMate.g:997:2: ()
            // InternalWebMate.g:997:3: 
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
    // InternalWebMate.g:1005:1: rule__Symbol__Group_0__1 : rule__Symbol__Group_0__1__Impl ;
    public final void rule__Symbol__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1009:1: ( rule__Symbol__Group_0__1__Impl )
            // InternalWebMate.g:1010:2: rule__Symbol__Group_0__1__Impl
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
    // InternalWebMate.g:1016:1: rule__Symbol__Group_0__1__Impl : ( ( rule__Symbol__Group_0_1__0 ) ) ;
    public final void rule__Symbol__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1020:1: ( ( ( rule__Symbol__Group_0_1__0 ) ) )
            // InternalWebMate.g:1021:1: ( ( rule__Symbol__Group_0_1__0 ) )
            {
            // InternalWebMate.g:1021:1: ( ( rule__Symbol__Group_0_1__0 ) )
            // InternalWebMate.g:1022:2: ( rule__Symbol__Group_0_1__0 )
            {
             before(grammarAccess.getSymbolAccess().getGroup_0_1()); 
            // InternalWebMate.g:1023:2: ( rule__Symbol__Group_0_1__0 )
            // InternalWebMate.g:1023:3: rule__Symbol__Group_0_1__0
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
    // InternalWebMate.g:1032:1: rule__Symbol__Group_0_1__0 : rule__Symbol__Group_0_1__0__Impl rule__Symbol__Group_0_1__1 ;
    public final void rule__Symbol__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1036:1: ( rule__Symbol__Group_0_1__0__Impl rule__Symbol__Group_0_1__1 )
            // InternalWebMate.g:1037:2: rule__Symbol__Group_0_1__0__Impl rule__Symbol__Group_0_1__1
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
    // InternalWebMate.g:1044:1: rule__Symbol__Group_0_1__0__Impl : ( ( rule__Symbol__SymAssignment_0_1_0 ) ) ;
    public final void rule__Symbol__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1048:1: ( ( ( rule__Symbol__SymAssignment_0_1_0 ) ) )
            // InternalWebMate.g:1049:1: ( ( rule__Symbol__SymAssignment_0_1_0 ) )
            {
            // InternalWebMate.g:1049:1: ( ( rule__Symbol__SymAssignment_0_1_0 ) )
            // InternalWebMate.g:1050:2: ( rule__Symbol__SymAssignment_0_1_0 )
            {
             before(grammarAccess.getSymbolAccess().getSymAssignment_0_1_0()); 
            // InternalWebMate.g:1051:2: ( rule__Symbol__SymAssignment_0_1_0 )
            // InternalWebMate.g:1051:3: rule__Symbol__SymAssignment_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Symbol__SymAssignment_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSymbolAccess().getSymAssignment_0_1_0()); 

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
    // InternalWebMate.g:1059:1: rule__Symbol__Group_0_1__1 : rule__Symbol__Group_0_1__1__Impl ;
    public final void rule__Symbol__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1063:1: ( rule__Symbol__Group_0_1__1__Impl )
            // InternalWebMate.g:1064:2: rule__Symbol__Group_0_1__1__Impl
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
    // InternalWebMate.g:1070:1: rule__Symbol__Group_0_1__1__Impl : ( ( rule__Symbol__CountAssignment_0_1_1 ) ) ;
    public final void rule__Symbol__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1074:1: ( ( ( rule__Symbol__CountAssignment_0_1_1 ) ) )
            // InternalWebMate.g:1075:1: ( ( rule__Symbol__CountAssignment_0_1_1 ) )
            {
            // InternalWebMate.g:1075:1: ( ( rule__Symbol__CountAssignment_0_1_1 ) )
            // InternalWebMate.g:1076:2: ( rule__Symbol__CountAssignment_0_1_1 )
            {
             before(grammarAccess.getSymbolAccess().getCountAssignment_0_1_1()); 
            // InternalWebMate.g:1077:2: ( rule__Symbol__CountAssignment_0_1_1 )
            // InternalWebMate.g:1077:3: rule__Symbol__CountAssignment_0_1_1
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
    // InternalWebMate.g:1086:1: rule__Symbol__Group_1__0 : rule__Symbol__Group_1__0__Impl rule__Symbol__Group_1__1 ;
    public final void rule__Symbol__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1090:1: ( rule__Symbol__Group_1__0__Impl rule__Symbol__Group_1__1 )
            // InternalWebMate.g:1091:2: rule__Symbol__Group_1__0__Impl rule__Symbol__Group_1__1
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
    // InternalWebMate.g:1098:1: rule__Symbol__Group_1__0__Impl : ( ( rule__Symbol__SymAssignment_1_0 ) ) ;
    public final void rule__Symbol__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1102:1: ( ( ( rule__Symbol__SymAssignment_1_0 ) ) )
            // InternalWebMate.g:1103:1: ( ( rule__Symbol__SymAssignment_1_0 ) )
            {
            // InternalWebMate.g:1103:1: ( ( rule__Symbol__SymAssignment_1_0 ) )
            // InternalWebMate.g:1104:2: ( rule__Symbol__SymAssignment_1_0 )
            {
             before(grammarAccess.getSymbolAccess().getSymAssignment_1_0()); 
            // InternalWebMate.g:1105:2: ( rule__Symbol__SymAssignment_1_0 )
            // InternalWebMate.g:1105:3: rule__Symbol__SymAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Symbol__SymAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSymbolAccess().getSymAssignment_1_0()); 

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
    // InternalWebMate.g:1113:1: rule__Symbol__Group_1__1 : rule__Symbol__Group_1__1__Impl ;
    public final void rule__Symbol__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1117:1: ( rule__Symbol__Group_1__1__Impl )
            // InternalWebMate.g:1118:2: rule__Symbol__Group_1__1__Impl
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
    // InternalWebMate.g:1124:1: rule__Symbol__Group_1__1__Impl : ( ( rule__Symbol__TagAssignment_1_1 ) ) ;
    public final void rule__Symbol__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1128:1: ( ( ( rule__Symbol__TagAssignment_1_1 ) ) )
            // InternalWebMate.g:1129:1: ( ( rule__Symbol__TagAssignment_1_1 ) )
            {
            // InternalWebMate.g:1129:1: ( ( rule__Symbol__TagAssignment_1_1 ) )
            // InternalWebMate.g:1130:2: ( rule__Symbol__TagAssignment_1_1 )
            {
             before(grammarAccess.getSymbolAccess().getTagAssignment_1_1()); 
            // InternalWebMate.g:1131:2: ( rule__Symbol__TagAssignment_1_1 )
            // InternalWebMate.g:1131:3: rule__Symbol__TagAssignment_1_1
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


    // $ANTLR start "rule__Tag__Group__0"
    // InternalWebMate.g:1140:1: rule__Tag__Group__0 : rule__Tag__Group__0__Impl rule__Tag__Group__1 ;
    public final void rule__Tag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1144:1: ( rule__Tag__Group__0__Impl rule__Tag__Group__1 )
            // InternalWebMate.g:1145:2: rule__Tag__Group__0__Impl rule__Tag__Group__1
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
    // InternalWebMate.g:1152:1: rule__Tag__Group__0__Impl : ( () ) ;
    public final void rule__Tag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1156:1: ( ( () ) )
            // InternalWebMate.g:1157:1: ( () )
            {
            // InternalWebMate.g:1157:1: ( () )
            // InternalWebMate.g:1158:2: ()
            {
             before(grammarAccess.getTagAccess().getTagAction_0()); 
            // InternalWebMate.g:1159:2: ()
            // InternalWebMate.g:1159:3: 
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
    // InternalWebMate.g:1167:1: rule__Tag__Group__1 : rule__Tag__Group__1__Impl rule__Tag__Group__2 ;
    public final void rule__Tag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1171:1: ( rule__Tag__Group__1__Impl rule__Tag__Group__2 )
            // InternalWebMate.g:1172:2: rule__Tag__Group__1__Impl rule__Tag__Group__2
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
    // InternalWebMate.g:1179:1: rule__Tag__Group__1__Impl : ( ( rule__Tag__TagNameAssignment_1 ) ) ;
    public final void rule__Tag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1183:1: ( ( ( rule__Tag__TagNameAssignment_1 ) ) )
            // InternalWebMate.g:1184:1: ( ( rule__Tag__TagNameAssignment_1 ) )
            {
            // InternalWebMate.g:1184:1: ( ( rule__Tag__TagNameAssignment_1 ) )
            // InternalWebMate.g:1185:2: ( rule__Tag__TagNameAssignment_1 )
            {
             before(grammarAccess.getTagAccess().getTagNameAssignment_1()); 
            // InternalWebMate.g:1186:2: ( rule__Tag__TagNameAssignment_1 )
            // InternalWebMate.g:1186:3: rule__Tag__TagNameAssignment_1
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
    // InternalWebMate.g:1194:1: rule__Tag__Group__2 : rule__Tag__Group__2__Impl rule__Tag__Group__3 ;
    public final void rule__Tag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1198:1: ( rule__Tag__Group__2__Impl rule__Tag__Group__3 )
            // InternalWebMate.g:1199:2: rule__Tag__Group__2__Impl rule__Tag__Group__3
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
    // InternalWebMate.g:1206:1: rule__Tag__Group__2__Impl : ( ( rule__Tag__ClassAssignment_2 )* ) ;
    public final void rule__Tag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1210:1: ( ( ( rule__Tag__ClassAssignment_2 )* ) )
            // InternalWebMate.g:1211:1: ( ( rule__Tag__ClassAssignment_2 )* )
            {
            // InternalWebMate.g:1211:1: ( ( rule__Tag__ClassAssignment_2 )* )
            // InternalWebMate.g:1212:2: ( rule__Tag__ClassAssignment_2 )*
            {
             before(grammarAccess.getTagAccess().getClassAssignment_2()); 
            // InternalWebMate.g:1213:2: ( rule__Tag__ClassAssignment_2 )*
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
            	    // InternalWebMate.g:1213:3: rule__Tag__ClassAssignment_2
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
    // InternalWebMate.g:1221:1: rule__Tag__Group__3 : rule__Tag__Group__3__Impl rule__Tag__Group__4 ;
    public final void rule__Tag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1225:1: ( rule__Tag__Group__3__Impl rule__Tag__Group__4 )
            // InternalWebMate.g:1226:2: rule__Tag__Group__3__Impl rule__Tag__Group__4
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
    // InternalWebMate.g:1233:1: rule__Tag__Group__3__Impl : ( ( rule__Tag__IdAssignment_3 )? ) ;
    public final void rule__Tag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1237:1: ( ( ( rule__Tag__IdAssignment_3 )? ) )
            // InternalWebMate.g:1238:1: ( ( rule__Tag__IdAssignment_3 )? )
            {
            // InternalWebMate.g:1238:1: ( ( rule__Tag__IdAssignment_3 )? )
            // InternalWebMate.g:1239:2: ( rule__Tag__IdAssignment_3 )?
            {
             before(grammarAccess.getTagAccess().getIdAssignment_3()); 
            // InternalWebMate.g:1240:2: ( rule__Tag__IdAssignment_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
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
                    // InternalWebMate.g:1240:3: rule__Tag__IdAssignment_3
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
    // InternalWebMate.g:1248:1: rule__Tag__Group__4 : rule__Tag__Group__4__Impl ;
    public final void rule__Tag__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1252:1: ( rule__Tag__Group__4__Impl )
            // InternalWebMate.g:1253:2: rule__Tag__Group__4__Impl
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
    // InternalWebMate.g:1259:1: rule__Tag__Group__4__Impl : ( ( rule__Tag__AttributeAssignment_4 )* ) ;
    public final void rule__Tag__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1263:1: ( ( ( rule__Tag__AttributeAssignment_4 )* ) )
            // InternalWebMate.g:1264:1: ( ( rule__Tag__AttributeAssignment_4 )* )
            {
            // InternalWebMate.g:1264:1: ( ( rule__Tag__AttributeAssignment_4 )* )
            // InternalWebMate.g:1265:2: ( rule__Tag__AttributeAssignment_4 )*
            {
             before(grammarAccess.getTagAccess().getAttributeAssignment_4()); 
            // InternalWebMate.g:1266:2: ( rule__Tag__AttributeAssignment_4 )*
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
            	    // InternalWebMate.g:1266:3: rule__Tag__AttributeAssignment_4
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
    // InternalWebMate.g:1275:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1279:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalWebMate.g:1280:2: rule__Class__Group__0__Impl rule__Class__Group__1
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
    // InternalWebMate.g:1287:1: rule__Class__Group__0__Impl : ( () ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1291:1: ( ( () ) )
            // InternalWebMate.g:1292:1: ( () )
            {
            // InternalWebMate.g:1292:1: ( () )
            // InternalWebMate.g:1293:2: ()
            {
             before(grammarAccess.getClassAccess().getClassAction_0()); 
            // InternalWebMate.g:1294:2: ()
            // InternalWebMate.g:1294:3: 
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
    // InternalWebMate.g:1302:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1306:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalWebMate.g:1307:2: rule__Class__Group__1__Impl rule__Class__Group__2
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
    // InternalWebMate.g:1314:1: rule__Class__Group__1__Impl : ( '.' ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1318:1: ( ( '.' ) )
            // InternalWebMate.g:1319:1: ( '.' )
            {
            // InternalWebMate.g:1319:1: ( '.' )
            // InternalWebMate.g:1320:2: '.'
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
    // InternalWebMate.g:1329:1: rule__Class__Group__2 : rule__Class__Group__2__Impl ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1333:1: ( rule__Class__Group__2__Impl )
            // InternalWebMate.g:1334:2: rule__Class__Group__2__Impl
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
    // InternalWebMate.g:1340:1: rule__Class__Group__2__Impl : ( ( rule__Class__ClassNameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1344:1: ( ( ( rule__Class__ClassNameAssignment_2 ) ) )
            // InternalWebMate.g:1345:1: ( ( rule__Class__ClassNameAssignment_2 ) )
            {
            // InternalWebMate.g:1345:1: ( ( rule__Class__ClassNameAssignment_2 ) )
            // InternalWebMate.g:1346:2: ( rule__Class__ClassNameAssignment_2 )
            {
             before(grammarAccess.getClassAccess().getClassNameAssignment_2()); 
            // InternalWebMate.g:1347:2: ( rule__Class__ClassNameAssignment_2 )
            // InternalWebMate.g:1347:3: rule__Class__ClassNameAssignment_2
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
    // InternalWebMate.g:1356:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1360:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalWebMate.g:1361:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalWebMate.g:1368:1: rule__Attribute__Group__0__Impl : ( () ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1372:1: ( ( () ) )
            // InternalWebMate.g:1373:1: ( () )
            {
            // InternalWebMate.g:1373:1: ( () )
            // InternalWebMate.g:1374:2: ()
            {
             before(grammarAccess.getAttributeAccess().getAttributeAction_0()); 
            // InternalWebMate.g:1375:2: ()
            // InternalWebMate.g:1375:3: 
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
    // InternalWebMate.g:1383:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1387:1: ( rule__Attribute__Group__1__Impl )
            // InternalWebMate.g:1388:2: rule__Attribute__Group__1__Impl
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
    // InternalWebMate.g:1394:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__Group_1__0 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1398:1: ( ( ( rule__Attribute__Group_1__0 ) ) )
            // InternalWebMate.g:1399:1: ( ( rule__Attribute__Group_1__0 ) )
            {
            // InternalWebMate.g:1399:1: ( ( rule__Attribute__Group_1__0 ) )
            // InternalWebMate.g:1400:2: ( rule__Attribute__Group_1__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup_1()); 
            // InternalWebMate.g:1401:2: ( rule__Attribute__Group_1__0 )
            // InternalWebMate.g:1401:3: rule__Attribute__Group_1__0
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
    // InternalWebMate.g:1410:1: rule__Attribute__Group_1__0 : rule__Attribute__Group_1__0__Impl rule__Attribute__Group_1__1 ;
    public final void rule__Attribute__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1414:1: ( rule__Attribute__Group_1__0__Impl rule__Attribute__Group_1__1 )
            // InternalWebMate.g:1415:2: rule__Attribute__Group_1__0__Impl rule__Attribute__Group_1__1
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
    // InternalWebMate.g:1422:1: rule__Attribute__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Attribute__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1426:1: ( ( '[' ) )
            // InternalWebMate.g:1427:1: ( '[' )
            {
            // InternalWebMate.g:1427:1: ( '[' )
            // InternalWebMate.g:1428:2: '['
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
    // InternalWebMate.g:1437:1: rule__Attribute__Group_1__1 : rule__Attribute__Group_1__1__Impl rule__Attribute__Group_1__2 ;
    public final void rule__Attribute__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1441:1: ( rule__Attribute__Group_1__1__Impl rule__Attribute__Group_1__2 )
            // InternalWebMate.g:1442:2: rule__Attribute__Group_1__1__Impl rule__Attribute__Group_1__2
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
    // InternalWebMate.g:1449:1: rule__Attribute__Group_1__1__Impl : ( ( rule__Attribute__AttributeNameAssignment_1_1 ) ) ;
    public final void rule__Attribute__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1453:1: ( ( ( rule__Attribute__AttributeNameAssignment_1_1 ) ) )
            // InternalWebMate.g:1454:1: ( ( rule__Attribute__AttributeNameAssignment_1_1 ) )
            {
            // InternalWebMate.g:1454:1: ( ( rule__Attribute__AttributeNameAssignment_1_1 ) )
            // InternalWebMate.g:1455:2: ( rule__Attribute__AttributeNameAssignment_1_1 )
            {
             before(grammarAccess.getAttributeAccess().getAttributeNameAssignment_1_1()); 
            // InternalWebMate.g:1456:2: ( rule__Attribute__AttributeNameAssignment_1_1 )
            // InternalWebMate.g:1456:3: rule__Attribute__AttributeNameAssignment_1_1
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
    // InternalWebMate.g:1464:1: rule__Attribute__Group_1__2 : rule__Attribute__Group_1__2__Impl rule__Attribute__Group_1__3 ;
    public final void rule__Attribute__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1468:1: ( rule__Attribute__Group_1__2__Impl rule__Attribute__Group_1__3 )
            // InternalWebMate.g:1469:2: rule__Attribute__Group_1__2__Impl rule__Attribute__Group_1__3
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
    // InternalWebMate.g:1476:1: rule__Attribute__Group_1__2__Impl : ( ( rule__Attribute__Group_1_2__0 )? ) ;
    public final void rule__Attribute__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1480:1: ( ( ( rule__Attribute__Group_1_2__0 )? ) )
            // InternalWebMate.g:1481:1: ( ( rule__Attribute__Group_1_2__0 )? )
            {
            // InternalWebMate.g:1481:1: ( ( rule__Attribute__Group_1_2__0 )? )
            // InternalWebMate.g:1482:2: ( rule__Attribute__Group_1_2__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_1_2()); 
            // InternalWebMate.g:1483:2: ( rule__Attribute__Group_1_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalWebMate.g:1483:3: rule__Attribute__Group_1_2__0
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
    // InternalWebMate.g:1491:1: rule__Attribute__Group_1__3 : rule__Attribute__Group_1__3__Impl ;
    public final void rule__Attribute__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1495:1: ( rule__Attribute__Group_1__3__Impl )
            // InternalWebMate.g:1496:2: rule__Attribute__Group_1__3__Impl
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
    // InternalWebMate.g:1502:1: rule__Attribute__Group_1__3__Impl : ( ']' ) ;
    public final void rule__Attribute__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1506:1: ( ( ']' ) )
            // InternalWebMate.g:1507:1: ( ']' )
            {
            // InternalWebMate.g:1507:1: ( ']' )
            // InternalWebMate.g:1508:2: ']'
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
    // InternalWebMate.g:1518:1: rule__Attribute__Group_1_2__0 : rule__Attribute__Group_1_2__0__Impl rule__Attribute__Group_1_2__1 ;
    public final void rule__Attribute__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1522:1: ( rule__Attribute__Group_1_2__0__Impl rule__Attribute__Group_1_2__1 )
            // InternalWebMate.g:1523:2: rule__Attribute__Group_1_2__0__Impl rule__Attribute__Group_1_2__1
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
    // InternalWebMate.g:1530:1: rule__Attribute__Group_1_2__0__Impl : ( '=' ) ;
    public final void rule__Attribute__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1534:1: ( ( '=' ) )
            // InternalWebMate.g:1535:1: ( '=' )
            {
            // InternalWebMate.g:1535:1: ( '=' )
            // InternalWebMate.g:1536:2: '='
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
    // InternalWebMate.g:1545:1: rule__Attribute__Group_1_2__1 : rule__Attribute__Group_1_2__1__Impl ;
    public final void rule__Attribute__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1549:1: ( rule__Attribute__Group_1_2__1__Impl )
            // InternalWebMate.g:1550:2: rule__Attribute__Group_1_2__1__Impl
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
    // InternalWebMate.g:1556:1: rule__Attribute__Group_1_2__1__Impl : ( ( rule__Attribute__AttributeValueAssignment_1_2_1 ) ) ;
    public final void rule__Attribute__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1560:1: ( ( ( rule__Attribute__AttributeValueAssignment_1_2_1 ) ) )
            // InternalWebMate.g:1561:1: ( ( rule__Attribute__AttributeValueAssignment_1_2_1 ) )
            {
            // InternalWebMate.g:1561:1: ( ( rule__Attribute__AttributeValueAssignment_1_2_1 ) )
            // InternalWebMate.g:1562:2: ( rule__Attribute__AttributeValueAssignment_1_2_1 )
            {
             before(grammarAccess.getAttributeAccess().getAttributeValueAssignment_1_2_1()); 
            // InternalWebMate.g:1563:2: ( rule__Attribute__AttributeValueAssignment_1_2_1 )
            // InternalWebMate.g:1563:3: rule__Attribute__AttributeValueAssignment_1_2_1
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
    // InternalWebMate.g:1572:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1576:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // InternalWebMate.g:1577:2: rule__Group__Group__0__Impl rule__Group__Group__1
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
    // InternalWebMate.g:1584:1: rule__Group__Group__0__Impl : ( () ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1588:1: ( ( () ) )
            // InternalWebMate.g:1589:1: ( () )
            {
            // InternalWebMate.g:1589:1: ( () )
            // InternalWebMate.g:1590:2: ()
            {
             before(grammarAccess.getGroupAccess().getGroupAction_0()); 
            // InternalWebMate.g:1591:2: ()
            // InternalWebMate.g:1591:3: 
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
    // InternalWebMate.g:1599:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1603:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // InternalWebMate.g:1604:2: rule__Group__Group__1__Impl rule__Group__Group__2
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
    // InternalWebMate.g:1611:1: rule__Group__Group__1__Impl : ( '(' ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1615:1: ( ( '(' ) )
            // InternalWebMate.g:1616:1: ( '(' )
            {
            // InternalWebMate.g:1616:1: ( '(' )
            // InternalWebMate.g:1617:2: '('
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
    // InternalWebMate.g:1626:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1630:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // InternalWebMate.g:1631:2: rule__Group__Group__2__Impl rule__Group__Group__3
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
    // InternalWebMate.g:1638:1: rule__Group__Group__2__Impl : ( ( ( rule__Group__AbbreviationAssignment_2 ) ) ( ( rule__Group__AbbreviationAssignment_2 )* ) ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1642:1: ( ( ( ( rule__Group__AbbreviationAssignment_2 ) ) ( ( rule__Group__AbbreviationAssignment_2 )* ) ) )
            // InternalWebMate.g:1643:1: ( ( ( rule__Group__AbbreviationAssignment_2 ) ) ( ( rule__Group__AbbreviationAssignment_2 )* ) )
            {
            // InternalWebMate.g:1643:1: ( ( ( rule__Group__AbbreviationAssignment_2 ) ) ( ( rule__Group__AbbreviationAssignment_2 )* ) )
            // InternalWebMate.g:1644:2: ( ( rule__Group__AbbreviationAssignment_2 ) ) ( ( rule__Group__AbbreviationAssignment_2 )* )
            {
            // InternalWebMate.g:1644:2: ( ( rule__Group__AbbreviationAssignment_2 ) )
            // InternalWebMate.g:1645:3: ( rule__Group__AbbreviationAssignment_2 )
            {
             before(grammarAccess.getGroupAccess().getAbbreviationAssignment_2()); 
            // InternalWebMate.g:1646:3: ( rule__Group__AbbreviationAssignment_2 )
            // InternalWebMate.g:1646:4: rule__Group__AbbreviationAssignment_2
            {
            pushFollow(FOLLOW_5);
            rule__Group__AbbreviationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getAbbreviationAssignment_2()); 

            }

            // InternalWebMate.g:1649:2: ( ( rule__Group__AbbreviationAssignment_2 )* )
            // InternalWebMate.g:1650:3: ( rule__Group__AbbreviationAssignment_2 )*
            {
             before(grammarAccess.getGroupAccess().getAbbreviationAssignment_2()); 
            // InternalWebMate.g:1651:3: ( rule__Group__AbbreviationAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalWebMate.g:1651:4: rule__Group__AbbreviationAssignment_2
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
    // InternalWebMate.g:1660:1: rule__Group__Group__3 : rule__Group__Group__3__Impl ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1664:1: ( rule__Group__Group__3__Impl )
            // InternalWebMate.g:1665:2: rule__Group__Group__3__Impl
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
    // InternalWebMate.g:1671:1: rule__Group__Group__3__Impl : ( ')' ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1675:1: ( ( ')' ) )
            // InternalWebMate.g:1676:1: ( ')' )
            {
            // InternalWebMate.g:1676:1: ( ')' )
            // InternalWebMate.g:1677:2: ')'
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
    // InternalWebMate.g:1687:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1691:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalWebMate.g:1692:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalWebMate.g:1699:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1703:1: ( ( ( '-' )? ) )
            // InternalWebMate.g:1704:1: ( ( '-' )? )
            {
            // InternalWebMate.g:1704:1: ( ( '-' )? )
            // InternalWebMate.g:1705:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalWebMate.g:1706:2: ( '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalWebMate.g:1706:3: '-'
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
    // InternalWebMate.g:1714:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1718:1: ( rule__EInt__Group__1__Impl )
            // InternalWebMate.g:1719:2: rule__EInt__Group__1__Impl
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
    // InternalWebMate.g:1725:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1729:1: ( ( RULE_INT ) )
            // InternalWebMate.g:1730:1: ( RULE_INT )
            {
            // InternalWebMate.g:1730:1: ( RULE_INT )
            // InternalWebMate.g:1731:2: RULE_INT
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
    // InternalWebMate.g:1741:1: rule__HTML__AbbreviationAssignment_1 : ( ruleAbbreviation ) ;
    public final void rule__HTML__AbbreviationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1745:1: ( ( ruleAbbreviation ) )
            // InternalWebMate.g:1746:2: ( ruleAbbreviation )
            {
            // InternalWebMate.g:1746:2: ( ruleAbbreviation )
            // InternalWebMate.g:1747:3: ruleAbbreviation
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
    // InternalWebMate.g:1756:1: rule__Abbreviation__AbbreviationAssignment_2_0 : ( ( ruleEString ) ) ;
    public final void rule__Abbreviation__AbbreviationAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1760:1: ( ( ( ruleEString ) ) )
            // InternalWebMate.g:1761:2: ( ( ruleEString ) )
            {
            // InternalWebMate.g:1761:2: ( ( ruleEString ) )
            // InternalWebMate.g:1762:3: ( ruleEString )
            {
             before(grammarAccess.getAbbreviationAccess().getAbbreviationAbbreviationCrossReference_2_0_0()); 
            // InternalWebMate.g:1763:3: ( ruleEString )
            // InternalWebMate.g:1764:4: ruleEString
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
    // InternalWebMate.g:1775:1: rule__Abbreviation__TagsAssignment_2_1_0 : ( ruleTag ) ;
    public final void rule__Abbreviation__TagsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1779:1: ( ( ruleTag ) )
            // InternalWebMate.g:1780:2: ( ruleTag )
            {
            // InternalWebMate.g:1780:2: ( ruleTag )
            // InternalWebMate.g:1781:3: ruleTag
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
    // InternalWebMate.g:1790:1: rule__Abbreviation__IdsAssignment_2_1_1_0 : ( ruleID0 ) ;
    public final void rule__Abbreviation__IdsAssignment_2_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1794:1: ( ( ruleID0 ) )
            // InternalWebMate.g:1795:2: ( ruleID0 )
            {
            // InternalWebMate.g:1795:2: ( ruleID0 )
            // InternalWebMate.g:1796:3: ruleID0
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
    // InternalWebMate.g:1805:1: rule__Abbreviation__SymbolsAssignment_2_1_1_1 : ( ruleSymbol ) ;
    public final void rule__Abbreviation__SymbolsAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1809:1: ( ( ruleSymbol ) )
            // InternalWebMate.g:1810:2: ( ruleSymbol )
            {
            // InternalWebMate.g:1810:2: ( ruleSymbol )
            // InternalWebMate.g:1811:3: ruleSymbol
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
    // InternalWebMate.g:1820:1: rule__Abbreviation__ClassesAssignment_2_1_1_2 : ( ruleClass ) ;
    public final void rule__Abbreviation__ClassesAssignment_2_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1824:1: ( ( ruleClass ) )
            // InternalWebMate.g:1825:2: ( ruleClass )
            {
            // InternalWebMate.g:1825:2: ( ruleClass )
            // InternalWebMate.g:1826:3: ruleClass
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
    // InternalWebMate.g:1835:1: rule__Abbreviation__AttributesAssignment_2_1_1_3 : ( ruleAttribute ) ;
    public final void rule__Abbreviation__AttributesAssignment_2_1_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1839:1: ( ( ruleAttribute ) )
            // InternalWebMate.g:1840:2: ( ruleAttribute )
            {
            // InternalWebMate.g:1840:2: ( ruleAttribute )
            // InternalWebMate.g:1841:3: ruleAttribute
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
    // InternalWebMate.g:1850:1: rule__Abbreviation__GroupAssignment_2_1_1_4 : ( ruleGroup ) ;
    public final void rule__Abbreviation__GroupAssignment_2_1_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1854:1: ( ( ruleGroup ) )
            // InternalWebMate.g:1855:2: ( ruleGroup )
            {
            // InternalWebMate.g:1855:2: ( ruleGroup )
            // InternalWebMate.g:1856:3: ruleGroup
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
    // InternalWebMate.g:1865:1: rule__ID0__IdNameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__ID0__IdNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1869:1: ( ( ruleEString ) )
            // InternalWebMate.g:1870:2: ( ruleEString )
            {
            // InternalWebMate.g:1870:2: ( ruleEString )
            // InternalWebMate.g:1871:3: ruleEString
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


    // $ANTLR start "rule__Symbol__SymAssignment_0_1_0"
    // InternalWebMate.g:1880:1: rule__Symbol__SymAssignment_0_1_0 : ( ruleSYM ) ;
    public final void rule__Symbol__SymAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1884:1: ( ( ruleSYM ) )
            // InternalWebMate.g:1885:2: ( ruleSYM )
            {
            // InternalWebMate.g:1885:2: ( ruleSYM )
            // InternalWebMate.g:1886:3: ruleSYM
            {
             before(grammarAccess.getSymbolAccess().getSymSYMEnumRuleCall_0_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSYM();

            state._fsp--;

             after(grammarAccess.getSymbolAccess().getSymSYMEnumRuleCall_0_1_0_0()); 

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
    // $ANTLR end "rule__Symbol__SymAssignment_0_1_0"


    // $ANTLR start "rule__Symbol__CountAssignment_0_1_1"
    // InternalWebMate.g:1895:1: rule__Symbol__CountAssignment_0_1_1 : ( ruleEInt ) ;
    public final void rule__Symbol__CountAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1899:1: ( ( ruleEInt ) )
            // InternalWebMate.g:1900:2: ( ruleEInt )
            {
            // InternalWebMate.g:1900:2: ( ruleEInt )
            // InternalWebMate.g:1901:3: ruleEInt
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


    // $ANTLR start "rule__Symbol__SymAssignment_1_0"
    // InternalWebMate.g:1910:1: rule__Symbol__SymAssignment_1_0 : ( ruleSYM ) ;
    public final void rule__Symbol__SymAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1914:1: ( ( ruleSYM ) )
            // InternalWebMate.g:1915:2: ( ruleSYM )
            {
            // InternalWebMate.g:1915:2: ( ruleSYM )
            // InternalWebMate.g:1916:3: ruleSYM
            {
             before(grammarAccess.getSymbolAccess().getSymSYMEnumRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSYM();

            state._fsp--;

             after(grammarAccess.getSymbolAccess().getSymSYMEnumRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Symbol__SymAssignment_1_0"


    // $ANTLR start "rule__Symbol__TagAssignment_1_1"
    // InternalWebMate.g:1925:1: rule__Symbol__TagAssignment_1_1 : ( ruleTag ) ;
    public final void rule__Symbol__TagAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1929:1: ( ( ruleTag ) )
            // InternalWebMate.g:1930:2: ( ruleTag )
            {
            // InternalWebMate.g:1930:2: ( ruleTag )
            // InternalWebMate.g:1931:3: ruleTag
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


    // $ANTLR start "rule__Tag__TagNameAssignment_1"
    // InternalWebMate.g:1940:1: rule__Tag__TagNameAssignment_1 : ( ruleHTMLTag ) ;
    public final void rule__Tag__TagNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1944:1: ( ( ruleHTMLTag ) )
            // InternalWebMate.g:1945:2: ( ruleHTMLTag )
            {
            // InternalWebMate.g:1945:2: ( ruleHTMLTag )
            // InternalWebMate.g:1946:3: ruleHTMLTag
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
    // InternalWebMate.g:1955:1: rule__Tag__ClassAssignment_2 : ( ruleClass ) ;
    public final void rule__Tag__ClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1959:1: ( ( ruleClass ) )
            // InternalWebMate.g:1960:2: ( ruleClass )
            {
            // InternalWebMate.g:1960:2: ( ruleClass )
            // InternalWebMate.g:1961:3: ruleClass
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
    // InternalWebMate.g:1970:1: rule__Tag__IdAssignment_3 : ( ruleID0 ) ;
    public final void rule__Tag__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1974:1: ( ( ruleID0 ) )
            // InternalWebMate.g:1975:2: ( ruleID0 )
            {
            // InternalWebMate.g:1975:2: ( ruleID0 )
            // InternalWebMate.g:1976:3: ruleID0
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
    // InternalWebMate.g:1985:1: rule__Tag__AttributeAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Tag__AttributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:1989:1: ( ( ruleAttribute ) )
            // InternalWebMate.g:1990:2: ( ruleAttribute )
            {
            // InternalWebMate.g:1990:2: ( ruleAttribute )
            // InternalWebMate.g:1991:3: ruleAttribute
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
    // InternalWebMate.g:2000:1: rule__Class__ClassNameAssignment_2 : ( ruleEString ) ;
    public final void rule__Class__ClassNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:2004:1: ( ( ruleEString ) )
            // InternalWebMate.g:2005:2: ( ruleEString )
            {
            // InternalWebMate.g:2005:2: ( ruleEString )
            // InternalWebMate.g:2006:3: ruleEString
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
    // InternalWebMate.g:2015:1: rule__Attribute__AttributeNameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__Attribute__AttributeNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:2019:1: ( ( ruleEString ) )
            // InternalWebMate.g:2020:2: ( ruleEString )
            {
            // InternalWebMate.g:2020:2: ( ruleEString )
            // InternalWebMate.g:2021:3: ruleEString
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
    // InternalWebMate.g:2030:1: rule__Attribute__AttributeValueAssignment_1_2_1 : ( ruleEString ) ;
    public final void rule__Attribute__AttributeValueAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:2034:1: ( ( ruleEString ) )
            // InternalWebMate.g:2035:2: ( ruleEString )
            {
            // InternalWebMate.g:2035:2: ( ruleEString )
            // InternalWebMate.g:2036:3: ruleEString
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
    // InternalWebMate.g:2045:1: rule__Group__AbbreviationAssignment_2 : ( ruleAbbreviation ) ;
    public final void rule__Group__AbbreviationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebMate.g:2049:1: ( ( ruleAbbreviation ) )
            // InternalWebMate.g:2050:2: ( ruleAbbreviation )
            {
            // InternalWebMate.g:2050:2: ( ruleAbbreviation )
            // InternalWebMate.g:2051:3: ruleAbbreviation
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000007FF830L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000273800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000007FF832L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000003800002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});

}