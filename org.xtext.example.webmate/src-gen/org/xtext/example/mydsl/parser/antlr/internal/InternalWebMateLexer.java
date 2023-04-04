package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWebMateLexer extends Lexer {
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

    public InternalWebMateLexer() {;} 
    public InternalWebMateLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalWebMateLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalWebMate.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWebMate.g:11:7: ( '{' )
            // InternalWebMate.g:11:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWebMate.g:12:7: ( '}' )
            // InternalWebMate.g:12:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWebMate.g:13:7: ( '#' )
            // InternalWebMate.g:13:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWebMate.g:14:7: ( '*' )
            // InternalWebMate.g:14:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWebMate.g:15:7: ( '+' )
            // InternalWebMate.g:15:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWebMate.g:16:7: ( '>' )
            // InternalWebMate.g:16:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWebMate.g:17:7: ( '^' )
            // InternalWebMate.g:17:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWebMate.g:18:7: ( '.' )
            // InternalWebMate.g:18:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWebMate.g:19:7: ( '[' )
            // InternalWebMate.g:19:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWebMate.g:20:7: ( '=' )
            // InternalWebMate.g:20:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWebMate.g:21:7: ( ']' )
            // InternalWebMate.g:21:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWebMate.g:22:7: ( '(' )
            // InternalWebMate.g:22:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWebMate.g:23:7: ( ')' )
            // InternalWebMate.g:23:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWebMate.g:24:7: ( '-' )
            // InternalWebMate.g:24:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWebMate.g:25:7: ( 'div' )
            // InternalWebMate.g:25:9: 'div'
            {
            match("div"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWebMate.g:26:7: ( 'h1' )
            // InternalWebMate.g:26:9: 'h1'
            {
            match("h1"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWebMate.g:27:7: ( 'p' )
            // InternalWebMate.g:27:9: 'p'
            {
            match('p'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWebMate.g:28:7: ( 'ul' )
            // InternalWebMate.g:28:9: 'ul'
            {
            match("ul"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWebMate.g:29:7: ( 'li' )
            // InternalWebMate.g:29:9: 'li'
            {
            match("li"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWebMate.g:30:7: ( 'a' )
            // InternalWebMate.g:30:9: 'a'
            {
            match('a'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWebMate.g:31:7: ( 'img' )
            // InternalWebMate.g:31:9: 'img'
            {
            match("img"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWebMate.g:32:7: ( 'form' )
            // InternalWebMate.g:32:9: 'form'
            {
            match("form"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWebMate.g:33:7: ( 'input' )
            // InternalWebMate.g:33:9: 'input'
            {
            match("input"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWebMate.g:34:7: ( 'button' )
            // InternalWebMate.g:34:9: 'button'
            {
            match("button"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWebMate.g:35:7: ( 'option' )
            // InternalWebMate.g:35:9: 'option'
            {
            match("option"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWebMate.g:36:7: ( 'select' )
            // InternalWebMate.g:36:9: 'select'
            {
            match("select"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWebMate.g:920:10: ( ( '0' .. '9' )+ )
            // InternalWebMate.g:920:12: ( '0' .. '9' )+
            {
            // InternalWebMate.g:920:12: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWebMate.g:920:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWebMate.g:922:13: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalWebMate.g:922:15: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalWebMate.g:922:39: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalWebMate.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWebMate.g:924:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalWebMate.g:924:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalWebMate.g:924:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalWebMate.g:924:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalWebMate.g:924:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalWebMate.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWebMate.g:926:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalWebMate.g:926:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalWebMate.g:926:24: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='*') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='/') ) {
                        alt5=2;
                    }
                    else if ( ((LA5_1>='\u0000' && LA5_1<='.')||(LA5_1>='0' && LA5_1<='\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<=')')||(LA5_0>='+' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalWebMate.g:926:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWebMate.g:928:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalWebMate.g:928:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalWebMate.g:928:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalWebMate.g:928:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalWebMate.g:928:40: ( ( '\\r' )? '\\n' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalWebMate.g:928:41: ( '\\r' )? '\\n'
                    {
                    // InternalWebMate.g:928:41: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalWebMate.g:928:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWebMate.g:930:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalWebMate.g:930:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalWebMate.g:930:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\t' && LA9_0<='\n')||LA9_0=='\r'||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalWebMate.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWebMate.g:932:16: ( . )
            // InternalWebMate.g:932:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalWebMate.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | RULE_INT | RULE_STRING | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt10=33;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // InternalWebMate.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalWebMate.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalWebMate.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalWebMate.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalWebMate.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalWebMate.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalWebMate.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalWebMate.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalWebMate.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalWebMate.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalWebMate.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalWebMate.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalWebMate.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalWebMate.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalWebMate.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalWebMate.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalWebMate.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalWebMate.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalWebMate.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalWebMate.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalWebMate.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalWebMate.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalWebMate.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalWebMate.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalWebMate.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalWebMate.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalWebMate.g:1:166: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 28 :
                // InternalWebMate.g:1:175: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 29 :
                // InternalWebMate.g:1:187: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 30 :
                // InternalWebMate.g:1:195: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 31 :
                // InternalWebMate.g:1:211: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 32 :
                // InternalWebMate.g:1:227: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 33 :
                // InternalWebMate.g:1:235: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\7\uffff\1\45\7\uffff\2\60\1\62\2\60\1\65\5\60\1\uffff\1\60\1\36\21\uffff\2\60\1\uffff\1\101\1\uffff\1\102\1\103\1\uffff\6\60\4\uffff\1\112\3\uffff\1\113\5\60\2\uffff\1\60\1\122\3\60\1\126\1\uffff\3\60\1\uffff\1\132\1\133\1\134\3\uffff";
    static final String DFA10_eofS =
        "\135\uffff";
    static final String DFA10_minS =
        "\1\0\6\uffff\1\101\7\uffff\13\60\1\uffff\1\60\1\52\21\uffff\2\60\1\uffff\1\60\1\uffff\2\60\1\uffff\6\60\4\uffff\1\60\3\uffff\6\60\2\uffff\6\60\1\uffff\3\60\1\uffff\3\60\3\uffff";
    static final String DFA10_maxS =
        "\1\uffff\6\uffff\1\172\7\uffff\13\172\1\uffff\1\172\1\57\21\uffff\2\172\1\uffff\1\172\1\uffff\2\172\1\uffff\6\172\4\uffff\1\172\3\uffff\6\172\2\uffff\6\172\1\uffff\3\172\1\uffff\3\172\3\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\16\13\uffff\1\33\2\uffff\1\40\1\41\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\35\1\10\1\11\1\12\1\13\1\14\1\15\1\16\2\uffff\1\34\1\uffff\1\21\2\uffff\1\24\6\uffff\1\33\1\36\1\37\1\40\1\uffff\1\20\1\22\1\23\6\uffff\1\17\1\25\6\uffff\1\26\3\uffff\1\27\3\uffff\1\30\1\31\1\32";
    static final String DFA10_specialS =
        "\1\0\134\uffff}>";
    static final String[] DFA10_transitionS = {
            "\11\36\2\35\2\36\1\35\22\36\1\35\2\36\1\3\4\36\1\14\1\15\1\4\1\5\1\36\1\16\1\10\1\34\12\32\3\36\1\12\1\6\2\36\32\33\1\11\1\36\1\13\1\7\1\33\1\36\1\24\1\27\1\33\1\17\1\33\1\26\1\33\1\20\1\25\2\33\1\23\2\33\1\30\1\21\2\33\1\31\1\33\1\22\5\33\1\1\1\36\1\2\uff82\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\56\21\57",
            "\1\57\1\61\10\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\63\16\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\64\21\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\66\1\67\14\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\70\13\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\24\57\1\71\5\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\17\57\1\72\12\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\73\25\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\75\4\uffff\1\76",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\25\57\1\100\4\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\6\57\1\104\23\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\17\57\1\105\12\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\106\10\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\107\6\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\110\6\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\111\16\57",
            "",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\24\57\1\114\5\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\115\15\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\116\6\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\117\21\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\120\25\57",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\121\6\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\123\13\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\124\13\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\125\27\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\127\14\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\130\14\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\131\6\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | RULE_INT | RULE_STRING | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_0 = input.LA(1);

                        s = -1;
                        if ( (LA10_0=='{') ) {s = 1;}

                        else if ( (LA10_0=='}') ) {s = 2;}

                        else if ( (LA10_0=='#') ) {s = 3;}

                        else if ( (LA10_0=='*') ) {s = 4;}

                        else if ( (LA10_0=='+') ) {s = 5;}

                        else if ( (LA10_0=='>') ) {s = 6;}

                        else if ( (LA10_0=='^') ) {s = 7;}

                        else if ( (LA10_0=='.') ) {s = 8;}

                        else if ( (LA10_0=='[') ) {s = 9;}

                        else if ( (LA10_0=='=') ) {s = 10;}

                        else if ( (LA10_0==']') ) {s = 11;}

                        else if ( (LA10_0=='(') ) {s = 12;}

                        else if ( (LA10_0==')') ) {s = 13;}

                        else if ( (LA10_0=='-') ) {s = 14;}

                        else if ( (LA10_0=='d') ) {s = 15;}

                        else if ( (LA10_0=='h') ) {s = 16;}

                        else if ( (LA10_0=='p') ) {s = 17;}

                        else if ( (LA10_0=='u') ) {s = 18;}

                        else if ( (LA10_0=='l') ) {s = 19;}

                        else if ( (LA10_0=='a') ) {s = 20;}

                        else if ( (LA10_0=='i') ) {s = 21;}

                        else if ( (LA10_0=='f') ) {s = 22;}

                        else if ( (LA10_0=='b') ) {s = 23;}

                        else if ( (LA10_0=='o') ) {s = 24;}

                        else if ( (LA10_0=='s') ) {s = 25;}

                        else if ( ((LA10_0>='0' && LA10_0<='9')) ) {s = 26;}

                        else if ( ((LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||LA10_0=='c'||LA10_0=='e'||LA10_0=='g'||(LA10_0>='j' && LA10_0<='k')||(LA10_0>='m' && LA10_0<='n')||(LA10_0>='q' && LA10_0<='r')||LA10_0=='t'||(LA10_0>='v' && LA10_0<='z')) ) {s = 27;}

                        else if ( (LA10_0=='/') ) {s = 28;}

                        else if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {s = 29;}

                        else if ( ((LA10_0>='\u0000' && LA10_0<='\b')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\u001F')||(LA10_0>='!' && LA10_0<='\"')||(LA10_0>='$' && LA10_0<='\'')||LA10_0==','||(LA10_0>=':' && LA10_0<='<')||(LA10_0>='?' && LA10_0<='@')||LA10_0=='\\'||LA10_0=='`'||LA10_0=='|'||(LA10_0>='~' && LA10_0<='\uFFFF')) ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}