package org.xtext.selenium.eliedenis.ide.contentassist.antlr.internal;

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
import org.xtext.selenium.eliedenis.services.EDdslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEDdslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'firefox'", "'ie'", "'button'", "'link'", "'input'", "'=='", "'>'", "'<'", "'>='", "'<='", "'contain'", "'enabled'", "'h1'", "'all'", "'attribute'", "'browse'", "'check'", "'comparison'", "'count'", "'click'", "';'", "'('", "')'", "'read'", "'open'", "'type'", "'value'", "'='"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
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
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalEDdslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEDdslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEDdslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEDdsl.g"; }


    	private EDdslGrammarAccess grammarAccess;

    	public void setGrammarAccess(EDdslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleTest"
    // InternalEDdsl.g:53:1: entryRuleTest : ruleTest EOF ;
    public final void entryRuleTest() throws RecognitionException {
        try {
            // InternalEDdsl.g:54:1: ( ruleTest EOF )
            // InternalEDdsl.g:55:1: ruleTest EOF
            {
             before(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_1);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getTestRule()); 
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
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // InternalEDdsl.g:62:1: ruleTest : ( ( rule__Test__TestsAssignment ) ) ;
    public final void ruleTest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:66:2: ( ( ( rule__Test__TestsAssignment ) ) )
            // InternalEDdsl.g:67:2: ( ( rule__Test__TestsAssignment ) )
            {
            // InternalEDdsl.g:67:2: ( ( rule__Test__TestsAssignment ) )
            // InternalEDdsl.g:68:3: ( rule__Test__TestsAssignment )
            {
             before(grammarAccess.getTestAccess().getTestsAssignment()); 
            // InternalEDdsl.g:69:3: ( rule__Test__TestsAssignment )
            // InternalEDdsl.g:69:4: rule__Test__TestsAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Test__TestsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getTestsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleActionNoReturn"
    // InternalEDdsl.g:78:1: entryRuleActionNoReturn : ruleActionNoReturn EOF ;
    public final void entryRuleActionNoReturn() throws RecognitionException {
        try {
            // InternalEDdsl.g:79:1: ( ruleActionNoReturn EOF )
            // InternalEDdsl.g:80:1: ruleActionNoReturn EOF
            {
             before(grammarAccess.getActionNoReturnRule()); 
            pushFollow(FOLLOW_1);
            ruleActionNoReturn();

            state._fsp--;

             after(grammarAccess.getActionNoReturnRule()); 
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
    // $ANTLR end "entryRuleActionNoReturn"


    // $ANTLR start "ruleActionNoReturn"
    // InternalEDdsl.g:87:1: ruleActionNoReturn : ( ( rule__ActionNoReturn__Alternatives ) ) ;
    public final void ruleActionNoReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:91:2: ( ( ( rule__ActionNoReturn__Alternatives ) ) )
            // InternalEDdsl.g:92:2: ( ( rule__ActionNoReturn__Alternatives ) )
            {
            // InternalEDdsl.g:92:2: ( ( rule__ActionNoReturn__Alternatives ) )
            // InternalEDdsl.g:93:3: ( rule__ActionNoReturn__Alternatives )
            {
             before(grammarAccess.getActionNoReturnAccess().getAlternatives()); 
            // InternalEDdsl.g:94:3: ( rule__ActionNoReturn__Alternatives )
            // InternalEDdsl.g:94:4: rule__ActionNoReturn__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ActionNoReturn__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionNoReturnAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionNoReturn"


    // $ANTLR start "entryRuleActionReturn"
    // InternalEDdsl.g:103:1: entryRuleActionReturn : ruleActionReturn EOF ;
    public final void entryRuleActionReturn() throws RecognitionException {
        try {
            // InternalEDdsl.g:104:1: ( ruleActionReturn EOF )
            // InternalEDdsl.g:105:1: ruleActionReturn EOF
            {
             before(grammarAccess.getActionReturnRule()); 
            pushFollow(FOLLOW_1);
            ruleActionReturn();

            state._fsp--;

             after(grammarAccess.getActionReturnRule()); 
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
    // $ANTLR end "entryRuleActionReturn"


    // $ANTLR start "ruleActionReturn"
    // InternalEDdsl.g:112:1: ruleActionReturn : ( ( rule__ActionReturn__Alternatives ) ) ;
    public final void ruleActionReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:116:2: ( ( ( rule__ActionReturn__Alternatives ) ) )
            // InternalEDdsl.g:117:2: ( ( rule__ActionReturn__Alternatives ) )
            {
            // InternalEDdsl.g:117:2: ( ( rule__ActionReturn__Alternatives ) )
            // InternalEDdsl.g:118:3: ( rule__ActionReturn__Alternatives )
            {
             before(grammarAccess.getActionReturnAccess().getAlternatives()); 
            // InternalEDdsl.g:119:3: ( rule__ActionReturn__Alternatives )
            // InternalEDdsl.g:119:4: rule__ActionReturn__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ActionReturn__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionReturnAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionReturn"


    // $ANTLR start "entryRuleActionBoolReturn"
    // InternalEDdsl.g:128:1: entryRuleActionBoolReturn : ruleActionBoolReturn EOF ;
    public final void entryRuleActionBoolReturn() throws RecognitionException {
        try {
            // InternalEDdsl.g:129:1: ( ruleActionBoolReturn EOF )
            // InternalEDdsl.g:130:1: ruleActionBoolReturn EOF
            {
             before(grammarAccess.getActionBoolReturnRule()); 
            pushFollow(FOLLOW_1);
            ruleActionBoolReturn();

            state._fsp--;

             after(grammarAccess.getActionBoolReturnRule()); 
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
    // $ANTLR end "entryRuleActionBoolReturn"


    // $ANTLR start "ruleActionBoolReturn"
    // InternalEDdsl.g:137:1: ruleActionBoolReturn : ( ( rule__ActionBoolReturn__Alternatives ) ) ;
    public final void ruleActionBoolReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:141:2: ( ( ( rule__ActionBoolReturn__Alternatives ) ) )
            // InternalEDdsl.g:142:2: ( ( rule__ActionBoolReturn__Alternatives ) )
            {
            // InternalEDdsl.g:142:2: ( ( rule__ActionBoolReturn__Alternatives ) )
            // InternalEDdsl.g:143:3: ( rule__ActionBoolReturn__Alternatives )
            {
             before(grammarAccess.getActionBoolReturnAccess().getAlternatives()); 
            // InternalEDdsl.g:144:3: ( rule__ActionBoolReturn__Alternatives )
            // InternalEDdsl.g:144:4: rule__ActionBoolReturn__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ActionBoolReturn__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionBoolReturnAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionBoolReturn"


    // $ANTLR start "entryRuleAll"
    // InternalEDdsl.g:153:1: entryRuleAll : ruleAll EOF ;
    public final void entryRuleAll() throws RecognitionException {
        try {
            // InternalEDdsl.g:154:1: ( ruleAll EOF )
            // InternalEDdsl.g:155:1: ruleAll EOF
            {
             before(grammarAccess.getAllRule()); 
            pushFollow(FOLLOW_1);
            ruleAll();

            state._fsp--;

             after(grammarAccess.getAllRule()); 
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
    // $ANTLR end "entryRuleAll"


    // $ANTLR start "ruleAll"
    // InternalEDdsl.g:162:1: ruleAll : ( ( rule__All__Group__0 ) ) ;
    public final void ruleAll() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:166:2: ( ( ( rule__All__Group__0 ) ) )
            // InternalEDdsl.g:167:2: ( ( rule__All__Group__0 ) )
            {
            // InternalEDdsl.g:167:2: ( ( rule__All__Group__0 ) )
            // InternalEDdsl.g:168:3: ( rule__All__Group__0 )
            {
             before(grammarAccess.getAllAccess().getGroup()); 
            // InternalEDdsl.g:169:3: ( rule__All__Group__0 )
            // InternalEDdsl.g:169:4: rule__All__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__All__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAllAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAll"


    // $ANTLR start "entryRuleAttribute"
    // InternalEDdsl.g:178:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalEDdsl.g:179:1: ( ruleAttribute EOF )
            // InternalEDdsl.g:180:1: ruleAttribute EOF
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
    // InternalEDdsl.g:187:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:191:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalEDdsl.g:192:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalEDdsl.g:192:2: ( ( rule__Attribute__Group__0 ) )
            // InternalEDdsl.g:193:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalEDdsl.g:194:3: ( rule__Attribute__Group__0 )
            // InternalEDdsl.g:194:4: rule__Attribute__Group__0
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


    // $ANTLR start "entryRuleBrowse"
    // InternalEDdsl.g:203:1: entryRuleBrowse : ruleBrowse EOF ;
    public final void entryRuleBrowse() throws RecognitionException {
        try {
            // InternalEDdsl.g:204:1: ( ruleBrowse EOF )
            // InternalEDdsl.g:205:1: ruleBrowse EOF
            {
             before(grammarAccess.getBrowseRule()); 
            pushFollow(FOLLOW_1);
            ruleBrowse();

            state._fsp--;

             after(grammarAccess.getBrowseRule()); 
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
    // $ANTLR end "entryRuleBrowse"


    // $ANTLR start "ruleBrowse"
    // InternalEDdsl.g:212:1: ruleBrowse : ( ( rule__Browse__Group__0 ) ) ;
    public final void ruleBrowse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:216:2: ( ( ( rule__Browse__Group__0 ) ) )
            // InternalEDdsl.g:217:2: ( ( rule__Browse__Group__0 ) )
            {
            // InternalEDdsl.g:217:2: ( ( rule__Browse__Group__0 ) )
            // InternalEDdsl.g:218:3: ( rule__Browse__Group__0 )
            {
             before(grammarAccess.getBrowseAccess().getGroup()); 
            // InternalEDdsl.g:219:3: ( rule__Browse__Group__0 )
            // InternalEDdsl.g:219:4: rule__Browse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Browse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBrowseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBrowse"


    // $ANTLR start "entryRuleCheck"
    // InternalEDdsl.g:228:1: entryRuleCheck : ruleCheck EOF ;
    public final void entryRuleCheck() throws RecognitionException {
        try {
            // InternalEDdsl.g:229:1: ( ruleCheck EOF )
            // InternalEDdsl.g:230:1: ruleCheck EOF
            {
             before(grammarAccess.getCheckRule()); 
            pushFollow(FOLLOW_1);
            ruleCheck();

            state._fsp--;

             after(grammarAccess.getCheckRule()); 
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
    // $ANTLR end "entryRuleCheck"


    // $ANTLR start "ruleCheck"
    // InternalEDdsl.g:237:1: ruleCheck : ( ( rule__Check__Group__0 ) ) ;
    public final void ruleCheck() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:241:2: ( ( ( rule__Check__Group__0 ) ) )
            // InternalEDdsl.g:242:2: ( ( rule__Check__Group__0 ) )
            {
            // InternalEDdsl.g:242:2: ( ( rule__Check__Group__0 ) )
            // InternalEDdsl.g:243:3: ( rule__Check__Group__0 )
            {
             before(grammarAccess.getCheckAccess().getGroup()); 
            // InternalEDdsl.g:244:3: ( rule__Check__Group__0 )
            // InternalEDdsl.g:244:4: rule__Check__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Check__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCheck"


    // $ANTLR start "entryRuleComparison"
    // InternalEDdsl.g:253:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalEDdsl.g:254:1: ( ruleComparison EOF )
            // InternalEDdsl.g:255:1: ruleComparison EOF
            {
             before(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getComparisonRule()); 
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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalEDdsl.g:262:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:266:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalEDdsl.g:267:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalEDdsl.g:267:2: ( ( rule__Comparison__Group__0 ) )
            // InternalEDdsl.g:268:3: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // InternalEDdsl.g:269:3: ( rule__Comparison__Group__0 )
            // InternalEDdsl.g:269:4: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleConstraint"
    // InternalEDdsl.g:278:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalEDdsl.g:279:1: ( ruleConstraint EOF )
            // InternalEDdsl.g:280:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalEDdsl.g:287:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:291:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // InternalEDdsl.g:292:2: ( ( rule__Constraint__Group__0 ) )
            {
            // InternalEDdsl.g:292:2: ( ( rule__Constraint__Group__0 ) )
            // InternalEDdsl.g:293:3: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // InternalEDdsl.g:294:3: ( rule__Constraint__Group__0 )
            // InternalEDdsl.g:294:4: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleCount"
    // InternalEDdsl.g:303:1: entryRuleCount : ruleCount EOF ;
    public final void entryRuleCount() throws RecognitionException {
        try {
            // InternalEDdsl.g:304:1: ( ruleCount EOF )
            // InternalEDdsl.g:305:1: ruleCount EOF
            {
             before(grammarAccess.getCountRule()); 
            pushFollow(FOLLOW_1);
            ruleCount();

            state._fsp--;

             after(grammarAccess.getCountRule()); 
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
    // $ANTLR end "entryRuleCount"


    // $ANTLR start "ruleCount"
    // InternalEDdsl.g:312:1: ruleCount : ( ( rule__Count__Group__0 ) ) ;
    public final void ruleCount() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:316:2: ( ( ( rule__Count__Group__0 ) ) )
            // InternalEDdsl.g:317:2: ( ( rule__Count__Group__0 ) )
            {
            // InternalEDdsl.g:317:2: ( ( rule__Count__Group__0 ) )
            // InternalEDdsl.g:318:3: ( rule__Count__Group__0 )
            {
             before(grammarAccess.getCountAccess().getGroup()); 
            // InternalEDdsl.g:319:3: ( rule__Count__Group__0 )
            // InternalEDdsl.g:319:4: rule__Count__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Count__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCountAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCount"


    // $ANTLR start "entryRuleClick"
    // InternalEDdsl.g:328:1: entryRuleClick : ruleClick EOF ;
    public final void entryRuleClick() throws RecognitionException {
        try {
            // InternalEDdsl.g:329:1: ( ruleClick EOF )
            // InternalEDdsl.g:330:1: ruleClick EOF
            {
             before(grammarAccess.getClickRule()); 
            pushFollow(FOLLOW_1);
            ruleClick();

            state._fsp--;

             after(grammarAccess.getClickRule()); 
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
    // $ANTLR end "entryRuleClick"


    // $ANTLR start "ruleClick"
    // InternalEDdsl.g:337:1: ruleClick : ( ( rule__Click__Group__0 ) ) ;
    public final void ruleClick() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:341:2: ( ( ( rule__Click__Group__0 ) ) )
            // InternalEDdsl.g:342:2: ( ( rule__Click__Group__0 ) )
            {
            // InternalEDdsl.g:342:2: ( ( rule__Click__Group__0 ) )
            // InternalEDdsl.g:343:3: ( rule__Click__Group__0 )
            {
             before(grammarAccess.getClickAccess().getGroup()); 
            // InternalEDdsl.g:344:3: ( rule__Click__Group__0 )
            // InternalEDdsl.g:344:4: rule__Click__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Click__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClick"


    // $ANTLR start "entryRuleOperation"
    // InternalEDdsl.g:353:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalEDdsl.g:354:1: ( ruleOperation EOF )
            // InternalEDdsl.g:355:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalEDdsl.g:362:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:366:2: ( ( ( rule__Operation__Group__0 ) ) )
            // InternalEDdsl.g:367:2: ( ( rule__Operation__Group__0 ) )
            {
            // InternalEDdsl.g:367:2: ( ( rule__Operation__Group__0 ) )
            // InternalEDdsl.g:368:3: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // InternalEDdsl.g:369:3: ( rule__Operation__Group__0 )
            // InternalEDdsl.g:369:4: rule__Operation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleParameter"
    // InternalEDdsl.g:378:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalEDdsl.g:379:1: ( ruleParameter EOF )
            // InternalEDdsl.g:380:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalEDdsl.g:387:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:391:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalEDdsl.g:392:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalEDdsl.g:392:2: ( ( rule__Parameter__Group__0 ) )
            // InternalEDdsl.g:393:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalEDdsl.g:394:3: ( rule__Parameter__Group__0 )
            // InternalEDdsl.g:394:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleParameters"
    // InternalEDdsl.g:403:1: entryRuleParameters : ruleParameters EOF ;
    public final void entryRuleParameters() throws RecognitionException {
        try {
            // InternalEDdsl.g:404:1: ( ruleParameters EOF )
            // InternalEDdsl.g:405:1: ruleParameters EOF
            {
             before(grammarAccess.getParametersRule()); 
            pushFollow(FOLLOW_1);
            ruleParameters();

            state._fsp--;

             after(grammarAccess.getParametersRule()); 
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
    // $ANTLR end "entryRuleParameters"


    // $ANTLR start "ruleParameters"
    // InternalEDdsl.g:412:1: ruleParameters : ( ( rule__Parameters__ParametersAssignment )* ) ;
    public final void ruleParameters() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:416:2: ( ( ( rule__Parameters__ParametersAssignment )* ) )
            // InternalEDdsl.g:417:2: ( ( rule__Parameters__ParametersAssignment )* )
            {
            // InternalEDdsl.g:417:2: ( ( rule__Parameters__ParametersAssignment )* )
            // InternalEDdsl.g:418:3: ( rule__Parameters__ParametersAssignment )*
            {
             before(grammarAccess.getParametersAccess().getParametersAssignment()); 
            // InternalEDdsl.g:419:3: ( rule__Parameters__ParametersAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==34) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEDdsl.g:419:4: rule__Parameters__ParametersAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Parameters__ParametersAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getParametersAccess().getParametersAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameters"


    // $ANTLR start "entryRuleRead"
    // InternalEDdsl.g:428:1: entryRuleRead : ruleRead EOF ;
    public final void entryRuleRead() throws RecognitionException {
        try {
            // InternalEDdsl.g:429:1: ( ruleRead EOF )
            // InternalEDdsl.g:430:1: ruleRead EOF
            {
             before(grammarAccess.getReadRule()); 
            pushFollow(FOLLOW_1);
            ruleRead();

            state._fsp--;

             after(grammarAccess.getReadRule()); 
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
    // $ANTLR end "entryRuleRead"


    // $ANTLR start "ruleRead"
    // InternalEDdsl.g:437:1: ruleRead : ( ( rule__Read__Group__0 ) ) ;
    public final void ruleRead() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:441:2: ( ( ( rule__Read__Group__0 ) ) )
            // InternalEDdsl.g:442:2: ( ( rule__Read__Group__0 ) )
            {
            // InternalEDdsl.g:442:2: ( ( rule__Read__Group__0 ) )
            // InternalEDdsl.g:443:3: ( rule__Read__Group__0 )
            {
             before(grammarAccess.getReadAccess().getGroup()); 
            // InternalEDdsl.g:444:3: ( rule__Read__Group__0 )
            // InternalEDdsl.g:444:4: rule__Read__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Read__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReadAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRead"


    // $ANTLR start "entryRuleSeries"
    // InternalEDdsl.g:453:1: entryRuleSeries : ruleSeries EOF ;
    public final void entryRuleSeries() throws RecognitionException {
        try {
            // InternalEDdsl.g:454:1: ( ruleSeries EOF )
            // InternalEDdsl.g:455:1: ruleSeries EOF
            {
             before(grammarAccess.getSeriesRule()); 
            pushFollow(FOLLOW_1);
            ruleSeries();

            state._fsp--;

             after(grammarAccess.getSeriesRule()); 
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
    // $ANTLR end "entryRuleSeries"


    // $ANTLR start "ruleSeries"
    // InternalEDdsl.g:462:1: ruleSeries : ( ( rule__Series__Group__0 ) ) ;
    public final void ruleSeries() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:466:2: ( ( ( rule__Series__Group__0 ) ) )
            // InternalEDdsl.g:467:2: ( ( rule__Series__Group__0 ) )
            {
            // InternalEDdsl.g:467:2: ( ( rule__Series__Group__0 ) )
            // InternalEDdsl.g:468:3: ( rule__Series__Group__0 )
            {
             before(grammarAccess.getSeriesAccess().getGroup()); 
            // InternalEDdsl.g:469:3: ( rule__Series__Group__0 )
            // InternalEDdsl.g:469:4: rule__Series__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Series__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSeriesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSeries"


    // $ANTLR start "entryRuleType"
    // InternalEDdsl.g:478:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalEDdsl.g:479:1: ( ruleType EOF )
            // InternalEDdsl.g:480:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalEDdsl.g:487:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:491:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalEDdsl.g:492:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalEDdsl.g:492:2: ( ( rule__Type__Group__0 ) )
            // InternalEDdsl.g:493:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalEDdsl.g:494:3: ( rule__Type__Group__0 )
            // InternalEDdsl.g:494:4: rule__Type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleVal"
    // InternalEDdsl.g:503:1: entryRuleVal : ruleVal EOF ;
    public final void entryRuleVal() throws RecognitionException {
        try {
            // InternalEDdsl.g:504:1: ( ruleVal EOF )
            // InternalEDdsl.g:505:1: ruleVal EOF
            {
             before(grammarAccess.getValRule()); 
            pushFollow(FOLLOW_1);
            ruleVal();

            state._fsp--;

             after(grammarAccess.getValRule()); 
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
    // $ANTLR end "entryRuleVal"


    // $ANTLR start "ruleVal"
    // InternalEDdsl.g:512:1: ruleVal : ( ( rule__Val__Alternatives ) ) ;
    public final void ruleVal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:516:2: ( ( ( rule__Val__Alternatives ) ) )
            // InternalEDdsl.g:517:2: ( ( rule__Val__Alternatives ) )
            {
            // InternalEDdsl.g:517:2: ( ( rule__Val__Alternatives ) )
            // InternalEDdsl.g:518:3: ( rule__Val__Alternatives )
            {
             before(grammarAccess.getValAccess().getAlternatives()); 
            // InternalEDdsl.g:519:3: ( rule__Val__Alternatives )
            // InternalEDdsl.g:519:4: rule__Val__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Val__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVal"


    // $ANTLR start "entryRuleValue"
    // InternalEDdsl.g:528:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalEDdsl.g:529:1: ( ruleValue EOF )
            // InternalEDdsl.g:530:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalEDdsl.g:537:1: ruleValue : ( ( rule__Value__Group__0 ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:541:2: ( ( ( rule__Value__Group__0 ) ) )
            // InternalEDdsl.g:542:2: ( ( rule__Value__Group__0 ) )
            {
            // InternalEDdsl.g:542:2: ( ( rule__Value__Group__0 ) )
            // InternalEDdsl.g:543:3: ( rule__Value__Group__0 )
            {
             before(grammarAccess.getValueAccess().getGroup()); 
            // InternalEDdsl.g:544:3: ( rule__Value__Group__0 )
            // InternalEDdsl.g:544:4: rule__Value__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleVariableGet"
    // InternalEDdsl.g:553:1: entryRuleVariableGet : ruleVariableGet EOF ;
    public final void entryRuleVariableGet() throws RecognitionException {
        try {
            // InternalEDdsl.g:554:1: ( ruleVariableGet EOF )
            // InternalEDdsl.g:555:1: ruleVariableGet EOF
            {
             before(grammarAccess.getVariableGetRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableGet();

            state._fsp--;

             after(grammarAccess.getVariableGetRule()); 
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
    // $ANTLR end "entryRuleVariableGet"


    // $ANTLR start "ruleVariableGet"
    // InternalEDdsl.g:562:1: ruleVariableGet : ( ( rule__VariableGet__VarNameAssignment ) ) ;
    public final void ruleVariableGet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:566:2: ( ( ( rule__VariableGet__VarNameAssignment ) ) )
            // InternalEDdsl.g:567:2: ( ( rule__VariableGet__VarNameAssignment ) )
            {
            // InternalEDdsl.g:567:2: ( ( rule__VariableGet__VarNameAssignment ) )
            // InternalEDdsl.g:568:3: ( rule__VariableGet__VarNameAssignment )
            {
             before(grammarAccess.getVariableGetAccess().getVarNameAssignment()); 
            // InternalEDdsl.g:569:3: ( rule__VariableGet__VarNameAssignment )
            // InternalEDdsl.g:569:4: rule__VariableGet__VarNameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VariableGet__VarNameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableGetAccess().getVarNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableGet"


    // $ANTLR start "entryRuleVariableSet"
    // InternalEDdsl.g:578:1: entryRuleVariableSet : ruleVariableSet EOF ;
    public final void entryRuleVariableSet() throws RecognitionException {
        try {
            // InternalEDdsl.g:579:1: ( ruleVariableSet EOF )
            // InternalEDdsl.g:580:1: ruleVariableSet EOF
            {
             before(grammarAccess.getVariableSetRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableSet();

            state._fsp--;

             after(grammarAccess.getVariableSetRule()); 
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
    // $ANTLR end "entryRuleVariableSet"


    // $ANTLR start "ruleVariableSet"
    // InternalEDdsl.g:587:1: ruleVariableSet : ( ( rule__VariableSet__Group__0 ) ) ;
    public final void ruleVariableSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:591:2: ( ( ( rule__VariableSet__Group__0 ) ) )
            // InternalEDdsl.g:592:2: ( ( rule__VariableSet__Group__0 ) )
            {
            // InternalEDdsl.g:592:2: ( ( rule__VariableSet__Group__0 ) )
            // InternalEDdsl.g:593:3: ( rule__VariableSet__Group__0 )
            {
             before(grammarAccess.getVariableSetAccess().getGroup()); 
            // InternalEDdsl.g:594:3: ( rule__VariableSet__Group__0 )
            // InternalEDdsl.g:594:4: rule__VariableSet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableSetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableSet"


    // $ANTLR start "ruleBoolEnum"
    // InternalEDdsl.g:603:1: ruleBoolEnum : ( ( rule__BoolEnum__Alternatives ) ) ;
    public final void ruleBoolEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:607:1: ( ( ( rule__BoolEnum__Alternatives ) ) )
            // InternalEDdsl.g:608:2: ( ( rule__BoolEnum__Alternatives ) )
            {
            // InternalEDdsl.g:608:2: ( ( rule__BoolEnum__Alternatives ) )
            // InternalEDdsl.g:609:3: ( rule__BoolEnum__Alternatives )
            {
             before(grammarAccess.getBoolEnumAccess().getAlternatives()); 
            // InternalEDdsl.g:610:3: ( rule__BoolEnum__Alternatives )
            // InternalEDdsl.g:610:4: rule__BoolEnum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BoolEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBoolEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolEnum"


    // $ANTLR start "ruleBrowserEnum"
    // InternalEDdsl.g:619:1: ruleBrowserEnum : ( ( rule__BrowserEnum__Alternatives ) ) ;
    public final void ruleBrowserEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:623:1: ( ( ( rule__BrowserEnum__Alternatives ) ) )
            // InternalEDdsl.g:624:2: ( ( rule__BrowserEnum__Alternatives ) )
            {
            // InternalEDdsl.g:624:2: ( ( rule__BrowserEnum__Alternatives ) )
            // InternalEDdsl.g:625:3: ( rule__BrowserEnum__Alternatives )
            {
             before(grammarAccess.getBrowserEnumAccess().getAlternatives()); 
            // InternalEDdsl.g:626:3: ( rule__BrowserEnum__Alternatives )
            // InternalEDdsl.g:626:4: rule__BrowserEnum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BrowserEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBrowserEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBrowserEnum"


    // $ANTLR start "ruleClickableEnum"
    // InternalEDdsl.g:635:1: ruleClickableEnum : ( ( rule__ClickableEnum__Alternatives ) ) ;
    public final void ruleClickableEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:639:1: ( ( ( rule__ClickableEnum__Alternatives ) ) )
            // InternalEDdsl.g:640:2: ( ( rule__ClickableEnum__Alternatives ) )
            {
            // InternalEDdsl.g:640:2: ( ( rule__ClickableEnum__Alternatives ) )
            // InternalEDdsl.g:641:3: ( rule__ClickableEnum__Alternatives )
            {
             before(grammarAccess.getClickableEnumAccess().getAlternatives()); 
            // InternalEDdsl.g:642:3: ( rule__ClickableEnum__Alternatives )
            // InternalEDdsl.g:642:4: rule__ClickableEnum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ClickableEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getClickableEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClickableEnum"


    // $ANTLR start "ruleComparisonOperatorEnum"
    // InternalEDdsl.g:651:1: ruleComparisonOperatorEnum : ( ( rule__ComparisonOperatorEnum__Alternatives ) ) ;
    public final void ruleComparisonOperatorEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:655:1: ( ( ( rule__ComparisonOperatorEnum__Alternatives ) ) )
            // InternalEDdsl.g:656:2: ( ( rule__ComparisonOperatorEnum__Alternatives ) )
            {
            // InternalEDdsl.g:656:2: ( ( rule__ComparisonOperatorEnum__Alternatives ) )
            // InternalEDdsl.g:657:3: ( rule__ComparisonOperatorEnum__Alternatives )
            {
             before(grammarAccess.getComparisonOperatorEnumAccess().getAlternatives()); 
            // InternalEDdsl.g:658:3: ( rule__ComparisonOperatorEnum__Alternatives )
            // InternalEDdsl.g:658:4: rule__ComparisonOperatorEnum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonOperatorEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparisonOperatorEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparisonOperatorEnum"


    // $ANTLR start "ruleConstraintTypeEnum"
    // InternalEDdsl.g:667:1: ruleConstraintTypeEnum : ( ( rule__ConstraintTypeEnum__Alternatives ) ) ;
    public final void ruleConstraintTypeEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:671:1: ( ( ( rule__ConstraintTypeEnum__Alternatives ) ) )
            // InternalEDdsl.g:672:2: ( ( rule__ConstraintTypeEnum__Alternatives ) )
            {
            // InternalEDdsl.g:672:2: ( ( rule__ConstraintTypeEnum__Alternatives ) )
            // InternalEDdsl.g:673:3: ( rule__ConstraintTypeEnum__Alternatives )
            {
             before(grammarAccess.getConstraintTypeEnumAccess().getAlternatives()); 
            // InternalEDdsl.g:674:3: ( rule__ConstraintTypeEnum__Alternatives )
            // InternalEDdsl.g:674:4: rule__ConstraintTypeEnum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintTypeEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstraintTypeEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraintTypeEnum"


    // $ANTLR start "ruleReadableEnum"
    // InternalEDdsl.g:683:1: ruleReadableEnum : ( ( rule__ReadableEnum__Alternatives ) ) ;
    public final void ruleReadableEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:687:1: ( ( ( rule__ReadableEnum__Alternatives ) ) )
            // InternalEDdsl.g:688:2: ( ( rule__ReadableEnum__Alternatives ) )
            {
            // InternalEDdsl.g:688:2: ( ( rule__ReadableEnum__Alternatives ) )
            // InternalEDdsl.g:689:3: ( rule__ReadableEnum__Alternatives )
            {
             before(grammarAccess.getReadableEnumAccess().getAlternatives()); 
            // InternalEDdsl.g:690:3: ( rule__ReadableEnum__Alternatives )
            // InternalEDdsl.g:690:4: rule__ReadableEnum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ReadableEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getReadableEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReadableEnum"


    // $ANTLR start "rule__ActionNoReturn__Alternatives"
    // InternalEDdsl.g:698:1: rule__ActionNoReturn__Alternatives : ( ( ruleAll ) | ( ruleBrowse ) | ( ruleCheck ) | ( ruleClick ) | ( ruleType ) | ( ruleVariableSet ) );
    public final void rule__ActionNoReturn__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:702:1: ( ( ruleAll ) | ( ruleBrowse ) | ( ruleCheck ) | ( ruleClick ) | ( ruleType ) | ( ruleVariableSet ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt2=1;
                }
                break;
            case 28:
                {
                alt2=2;
                }
                break;
            case 29:
                {
                alt2=3;
                }
                break;
            case 32:
                {
                alt2=4;
                }
                break;
            case 38:
                {
                alt2=5;
                }
                break;
            case RULE_ID:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalEDdsl.g:703:2: ( ruleAll )
                    {
                    // InternalEDdsl.g:703:2: ( ruleAll )
                    // InternalEDdsl.g:704:3: ruleAll
                    {
                     before(grammarAccess.getActionNoReturnAccess().getAllParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAll();

                    state._fsp--;

                     after(grammarAccess.getActionNoReturnAccess().getAllParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEDdsl.g:709:2: ( ruleBrowse )
                    {
                    // InternalEDdsl.g:709:2: ( ruleBrowse )
                    // InternalEDdsl.g:710:3: ruleBrowse
                    {
                     before(grammarAccess.getActionNoReturnAccess().getBrowseParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBrowse();

                    state._fsp--;

                     after(grammarAccess.getActionNoReturnAccess().getBrowseParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEDdsl.g:715:2: ( ruleCheck )
                    {
                    // InternalEDdsl.g:715:2: ( ruleCheck )
                    // InternalEDdsl.g:716:3: ruleCheck
                    {
                     before(grammarAccess.getActionNoReturnAccess().getCheckParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCheck();

                    state._fsp--;

                     after(grammarAccess.getActionNoReturnAccess().getCheckParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEDdsl.g:721:2: ( ruleClick )
                    {
                    // InternalEDdsl.g:721:2: ( ruleClick )
                    // InternalEDdsl.g:722:3: ruleClick
                    {
                     before(grammarAccess.getActionNoReturnAccess().getClickParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleClick();

                    state._fsp--;

                     after(grammarAccess.getActionNoReturnAccess().getClickParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalEDdsl.g:727:2: ( ruleType )
                    {
                    // InternalEDdsl.g:727:2: ( ruleType )
                    // InternalEDdsl.g:728:3: ruleType
                    {
                     before(grammarAccess.getActionNoReturnAccess().getTypeParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getActionNoReturnAccess().getTypeParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalEDdsl.g:733:2: ( ruleVariableSet )
                    {
                    // InternalEDdsl.g:733:2: ( ruleVariableSet )
                    // InternalEDdsl.g:734:3: ruleVariableSet
                    {
                     before(grammarAccess.getActionNoReturnAccess().getVariableSetParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableSet();

                    state._fsp--;

                     after(grammarAccess.getActionNoReturnAccess().getVariableSetParserRuleCall_5()); 

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
    // $ANTLR end "rule__ActionNoReturn__Alternatives"


    // $ANTLR start "rule__ActionReturn__Alternatives"
    // InternalEDdsl.g:743:1: rule__ActionReturn__Alternatives : ( ( ruleCount ) | ( ruleRead ) );
    public final void rule__ActionReturn__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:747:1: ( ( ruleCount ) | ( ruleRead ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==31) ) {
                alt3=1;
            }
            else if ( (LA3_0==36) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalEDdsl.g:748:2: ( ruleCount )
                    {
                    // InternalEDdsl.g:748:2: ( ruleCount )
                    // InternalEDdsl.g:749:3: ruleCount
                    {
                     before(grammarAccess.getActionReturnAccess().getCountParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCount();

                    state._fsp--;

                     after(grammarAccess.getActionReturnAccess().getCountParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEDdsl.g:754:2: ( ruleRead )
                    {
                    // InternalEDdsl.g:754:2: ( ruleRead )
                    // InternalEDdsl.g:755:3: ruleRead
                    {
                     before(grammarAccess.getActionReturnAccess().getReadParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRead();

                    state._fsp--;

                     after(grammarAccess.getActionReturnAccess().getReadParserRuleCall_1()); 

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
    // $ANTLR end "rule__ActionReturn__Alternatives"


    // $ANTLR start "rule__ActionBoolReturn__Alternatives"
    // InternalEDdsl.g:764:1: rule__ActionBoolReturn__Alternatives : ( ( ruleComparison ) | ( ruleConstraint ) );
    public final void rule__ActionBoolReturn__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:768:1: ( ( ruleComparison ) | ( ruleConstraint ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==30) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=15 && LA4_0<=17)||LA4_0==25) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalEDdsl.g:769:2: ( ruleComparison )
                    {
                    // InternalEDdsl.g:769:2: ( ruleComparison )
                    // InternalEDdsl.g:770:3: ruleComparison
                    {
                     before(grammarAccess.getActionBoolReturnAccess().getComparisonParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleComparison();

                    state._fsp--;

                     after(grammarAccess.getActionBoolReturnAccess().getComparisonParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEDdsl.g:775:2: ( ruleConstraint )
                    {
                    // InternalEDdsl.g:775:2: ( ruleConstraint )
                    // InternalEDdsl.g:776:3: ruleConstraint
                    {
                     before(grammarAccess.getActionBoolReturnAccess().getConstraintParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleConstraint();

                    state._fsp--;

                     after(grammarAccess.getActionBoolReturnAccess().getConstraintParserRuleCall_1()); 

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
    // $ANTLR end "rule__ActionBoolReturn__Alternatives"


    // $ANTLR start "rule__Count__ParametersAlternatives_1_0"
    // InternalEDdsl.g:785:1: rule__Count__ParametersAlternatives_1_0 : ( ( ruleParameters ) | ( ruleActionReturn ) );
    public final void rule__Count__ParametersAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:789:1: ( ( ruleParameters ) | ( ruleActionReturn ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==EOF||(LA5_0>=33 && LA5_0<=34)) ) {
                alt5=1;
            }
            else if ( (LA5_0==31||LA5_0==36) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalEDdsl.g:790:2: ( ruleParameters )
                    {
                    // InternalEDdsl.g:790:2: ( ruleParameters )
                    // InternalEDdsl.g:791:3: ruleParameters
                    {
                     before(grammarAccess.getCountAccess().getParametersParametersParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleParameters();

                    state._fsp--;

                     after(grammarAccess.getCountAccess().getParametersParametersParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEDdsl.g:796:2: ( ruleActionReturn )
                    {
                    // InternalEDdsl.g:796:2: ( ruleActionReturn )
                    // InternalEDdsl.g:797:3: ruleActionReturn
                    {
                     before(grammarAccess.getCountAccess().getParametersActionReturnParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleActionReturn();

                    state._fsp--;

                     after(grammarAccess.getCountAccess().getParametersActionReturnParserRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__Count__ParametersAlternatives_1_0"


    // $ANTLR start "rule__Parameter__ParameterAlternatives_1_0"
    // InternalEDdsl.g:806:1: rule__Parameter__ParameterAlternatives_1_0 : ( ( ruleAttribute ) | ( ruleValue ) );
    public final void rule__Parameter__ParameterAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:810:1: ( ( ruleAttribute ) | ( ruleValue ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            else if ( (LA6_0==39) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalEDdsl.g:811:2: ( ruleAttribute )
                    {
                    // InternalEDdsl.g:811:2: ( ruleAttribute )
                    // InternalEDdsl.g:812:3: ruleAttribute
                    {
                     before(grammarAccess.getParameterAccess().getParameterAttributeParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAttribute();

                    state._fsp--;

                     after(grammarAccess.getParameterAccess().getParameterAttributeParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEDdsl.g:817:2: ( ruleValue )
                    {
                    // InternalEDdsl.g:817:2: ( ruleValue )
                    // InternalEDdsl.g:818:3: ruleValue
                    {
                     before(grammarAccess.getParameterAccess().getParameterValueParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleValue();

                    state._fsp--;

                     after(grammarAccess.getParameterAccess().getParameterValueParserRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__Parameter__ParameterAlternatives_1_0"


    // $ANTLR start "rule__Val__Alternatives"
    // InternalEDdsl.g:827:1: rule__Val__Alternatives : ( ( ruleVariableGet ) | ( RULE_STRING ) | ( ( rule__Val__BoolAssignment_2 ) ) );
    public final void rule__Val__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:831:1: ( ( ruleVariableGet ) | ( RULE_STRING ) | ( ( rule__Val__BoolAssignment_2 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case RULE_STRING:
                {
                alt7=2;
                }
                break;
            case 11:
            case 12:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalEDdsl.g:832:2: ( ruleVariableGet )
                    {
                    // InternalEDdsl.g:832:2: ( ruleVariableGet )
                    // InternalEDdsl.g:833:3: ruleVariableGet
                    {
                     before(grammarAccess.getValAccess().getVariableGetParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableGet();

                    state._fsp--;

                     after(grammarAccess.getValAccess().getVariableGetParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEDdsl.g:838:2: ( RULE_STRING )
                    {
                    // InternalEDdsl.g:838:2: ( RULE_STRING )
                    // InternalEDdsl.g:839:3: RULE_STRING
                    {
                     before(grammarAccess.getValAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getValAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEDdsl.g:844:2: ( ( rule__Val__BoolAssignment_2 ) )
                    {
                    // InternalEDdsl.g:844:2: ( ( rule__Val__BoolAssignment_2 ) )
                    // InternalEDdsl.g:845:3: ( rule__Val__BoolAssignment_2 )
                    {
                     before(grammarAccess.getValAccess().getBoolAssignment_2()); 
                    // InternalEDdsl.g:846:3: ( rule__Val__BoolAssignment_2 )
                    // InternalEDdsl.g:846:4: rule__Val__BoolAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Val__BoolAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getValAccess().getBoolAssignment_2()); 

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
    // $ANTLR end "rule__Val__Alternatives"


    // $ANTLR start "rule__BoolEnum__Alternatives"
    // InternalEDdsl.g:854:1: rule__BoolEnum__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );
    public final void rule__BoolEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:858:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==11) ) {
                alt8=1;
            }
            else if ( (LA8_0==12) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalEDdsl.g:859:2: ( ( 'true' ) )
                    {
                    // InternalEDdsl.g:859:2: ( ( 'true' ) )
                    // InternalEDdsl.g:860:3: ( 'true' )
                    {
                     before(grammarAccess.getBoolEnumAccess().getTrueEnumLiteralDeclaration_0()); 
                    // InternalEDdsl.g:861:3: ( 'true' )
                    // InternalEDdsl.g:861:4: 'true'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getBoolEnumAccess().getTrueEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEDdsl.g:865:2: ( ( 'false' ) )
                    {
                    // InternalEDdsl.g:865:2: ( ( 'false' ) )
                    // InternalEDdsl.g:866:3: ( 'false' )
                    {
                     before(grammarAccess.getBoolEnumAccess().getFalseEnumLiteralDeclaration_1()); 
                    // InternalEDdsl.g:867:3: ( 'false' )
                    // InternalEDdsl.g:867:4: 'false'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getBoolEnumAccess().getFalseEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__BoolEnum__Alternatives"


    // $ANTLR start "rule__BrowserEnum__Alternatives"
    // InternalEDdsl.g:875:1: rule__BrowserEnum__Alternatives : ( ( ( 'firefox' ) ) | ( ( 'ie' ) ) );
    public final void rule__BrowserEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:879:1: ( ( ( 'firefox' ) ) | ( ( 'ie' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            else if ( (LA9_0==14) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalEDdsl.g:880:2: ( ( 'firefox' ) )
                    {
                    // InternalEDdsl.g:880:2: ( ( 'firefox' ) )
                    // InternalEDdsl.g:881:3: ( 'firefox' )
                    {
                     before(grammarAccess.getBrowserEnumAccess().getFirefoxEnumLiteralDeclaration_0()); 
                    // InternalEDdsl.g:882:3: ( 'firefox' )
                    // InternalEDdsl.g:882:4: 'firefox'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getBrowserEnumAccess().getFirefoxEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEDdsl.g:886:2: ( ( 'ie' ) )
                    {
                    // InternalEDdsl.g:886:2: ( ( 'ie' ) )
                    // InternalEDdsl.g:887:3: ( 'ie' )
                    {
                     before(grammarAccess.getBrowserEnumAccess().getIEEnumLiteralDeclaration_1()); 
                    // InternalEDdsl.g:888:3: ( 'ie' )
                    // InternalEDdsl.g:888:4: 'ie'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getBrowserEnumAccess().getIEEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__BrowserEnum__Alternatives"


    // $ANTLR start "rule__ClickableEnum__Alternatives"
    // InternalEDdsl.g:896:1: rule__ClickableEnum__Alternatives : ( ( ( 'button' ) ) | ( ( 'link' ) ) | ( ( 'input' ) ) );
    public final void rule__ClickableEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:900:1: ( ( ( 'button' ) ) | ( ( 'link' ) ) | ( ( 'input' ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 15:
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
                    // InternalEDdsl.g:901:2: ( ( 'button' ) )
                    {
                    // InternalEDdsl.g:901:2: ( ( 'button' ) )
                    // InternalEDdsl.g:902:3: ( 'button' )
                    {
                     before(grammarAccess.getClickableEnumAccess().getButtonEnumLiteralDeclaration_0()); 
                    // InternalEDdsl.g:903:3: ( 'button' )
                    // InternalEDdsl.g:903:4: 'button'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getClickableEnumAccess().getButtonEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEDdsl.g:907:2: ( ( 'link' ) )
                    {
                    // InternalEDdsl.g:907:2: ( ( 'link' ) )
                    // InternalEDdsl.g:908:3: ( 'link' )
                    {
                     before(grammarAccess.getClickableEnumAccess().getLinkEnumLiteralDeclaration_1()); 
                    // InternalEDdsl.g:909:3: ( 'link' )
                    // InternalEDdsl.g:909:4: 'link'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getClickableEnumAccess().getLinkEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEDdsl.g:913:2: ( ( 'input' ) )
                    {
                    // InternalEDdsl.g:913:2: ( ( 'input' ) )
                    // InternalEDdsl.g:914:3: ( 'input' )
                    {
                     before(grammarAccess.getClickableEnumAccess().getInputEnumLiteralDeclaration_2()); 
                    // InternalEDdsl.g:915:3: ( 'input' )
                    // InternalEDdsl.g:915:4: 'input'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getClickableEnumAccess().getInputEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__ClickableEnum__Alternatives"


    // $ANTLR start "rule__ComparisonOperatorEnum__Alternatives"
    // InternalEDdsl.g:923:1: rule__ComparisonOperatorEnum__Alternatives : ( ( ( '==' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) );
    public final void rule__ComparisonOperatorEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:927:1: ( ( ( '==' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt11=1;
                }
                break;
            case 19:
                {
                alt11=2;
                }
                break;
            case 20:
                {
                alt11=3;
                }
                break;
            case 21:
                {
                alt11=4;
                }
                break;
            case 22:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalEDdsl.g:928:2: ( ( '==' ) )
                    {
                    // InternalEDdsl.g:928:2: ( ( '==' ) )
                    // InternalEDdsl.g:929:3: ( '==' )
                    {
                     before(grammarAccess.getComparisonOperatorEnumAccess().getEqualEnumLiteralDeclaration_0()); 
                    // InternalEDdsl.g:930:3: ( '==' )
                    // InternalEDdsl.g:930:4: '=='
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorEnumAccess().getEqualEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEDdsl.g:934:2: ( ( '>' ) )
                    {
                    // InternalEDdsl.g:934:2: ( ( '>' ) )
                    // InternalEDdsl.g:935:3: ( '>' )
                    {
                     before(grammarAccess.getComparisonOperatorEnumAccess().getSuperiorEnumLiteralDeclaration_1()); 
                    // InternalEDdsl.g:936:3: ( '>' )
                    // InternalEDdsl.g:936:4: '>'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorEnumAccess().getSuperiorEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEDdsl.g:940:2: ( ( '<' ) )
                    {
                    // InternalEDdsl.g:940:2: ( ( '<' ) )
                    // InternalEDdsl.g:941:3: ( '<' )
                    {
                     before(grammarAccess.getComparisonOperatorEnumAccess().getInferiorEnumLiteralDeclaration_2()); 
                    // InternalEDdsl.g:942:3: ( '<' )
                    // InternalEDdsl.g:942:4: '<'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorEnumAccess().getInferiorEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEDdsl.g:946:2: ( ( '>=' ) )
                    {
                    // InternalEDdsl.g:946:2: ( ( '>=' ) )
                    // InternalEDdsl.g:947:3: ( '>=' )
                    {
                     before(grammarAccess.getComparisonOperatorEnumAccess().getSupEqualEnumLiteralDeclaration_3()); 
                    // InternalEDdsl.g:948:3: ( '>=' )
                    // InternalEDdsl.g:948:4: '>='
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorEnumAccess().getSupEqualEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalEDdsl.g:952:2: ( ( '<=' ) )
                    {
                    // InternalEDdsl.g:952:2: ( ( '<=' ) )
                    // InternalEDdsl.g:953:3: ( '<=' )
                    {
                     before(grammarAccess.getComparisonOperatorEnumAccess().getInfEqualEnumLiteralDeclaration_4()); 
                    // InternalEDdsl.g:954:3: ( '<=' )
                    // InternalEDdsl.g:954:4: '<='
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonOperatorEnumAccess().getInfEqualEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__ComparisonOperatorEnum__Alternatives"


    // $ANTLR start "rule__ConstraintTypeEnum__Alternatives"
    // InternalEDdsl.g:962:1: rule__ConstraintTypeEnum__Alternatives : ( ( ( 'contain' ) ) | ( ( 'enabled' ) ) );
    public final void rule__ConstraintTypeEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:966:1: ( ( ( 'contain' ) ) | ( ( 'enabled' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            else if ( (LA12_0==24) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalEDdsl.g:967:2: ( ( 'contain' ) )
                    {
                    // InternalEDdsl.g:967:2: ( ( 'contain' ) )
                    // InternalEDdsl.g:968:3: ( 'contain' )
                    {
                     before(grammarAccess.getConstraintTypeEnumAccess().getContainEnumLiteralDeclaration_0()); 
                    // InternalEDdsl.g:969:3: ( 'contain' )
                    // InternalEDdsl.g:969:4: 'contain'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getConstraintTypeEnumAccess().getContainEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEDdsl.g:973:2: ( ( 'enabled' ) )
                    {
                    // InternalEDdsl.g:973:2: ( ( 'enabled' ) )
                    // InternalEDdsl.g:974:3: ( 'enabled' )
                    {
                     before(grammarAccess.getConstraintTypeEnumAccess().getEnabledEnumLiteralDeclaration_1()); 
                    // InternalEDdsl.g:975:3: ( 'enabled' )
                    // InternalEDdsl.g:975:4: 'enabled'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getConstraintTypeEnumAccess().getEnabledEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__ConstraintTypeEnum__Alternatives"


    // $ANTLR start "rule__ReadableEnum__Alternatives"
    // InternalEDdsl.g:983:1: rule__ReadableEnum__Alternatives : ( ( ( 'button' ) ) | ( ( 'link' ) ) | ( ( 'input' ) ) | ( ( 'h1' ) ) );
    public final void rule__ReadableEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:987:1: ( ( ( 'button' ) ) | ( ( 'link' ) ) | ( ( 'input' ) ) | ( ( 'h1' ) ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt13=1;
                }
                break;
            case 16:
                {
                alt13=2;
                }
                break;
            case 17:
                {
                alt13=3;
                }
                break;
            case 25:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalEDdsl.g:988:2: ( ( 'button' ) )
                    {
                    // InternalEDdsl.g:988:2: ( ( 'button' ) )
                    // InternalEDdsl.g:989:3: ( 'button' )
                    {
                     before(grammarAccess.getReadableEnumAccess().getButtonEnumLiteralDeclaration_0()); 
                    // InternalEDdsl.g:990:3: ( 'button' )
                    // InternalEDdsl.g:990:4: 'button'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getReadableEnumAccess().getButtonEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEDdsl.g:994:2: ( ( 'link' ) )
                    {
                    // InternalEDdsl.g:994:2: ( ( 'link' ) )
                    // InternalEDdsl.g:995:3: ( 'link' )
                    {
                     before(grammarAccess.getReadableEnumAccess().getLinkEnumLiteralDeclaration_1()); 
                    // InternalEDdsl.g:996:3: ( 'link' )
                    // InternalEDdsl.g:996:4: 'link'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getReadableEnumAccess().getLinkEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEDdsl.g:1000:2: ( ( 'input' ) )
                    {
                    // InternalEDdsl.g:1000:2: ( ( 'input' ) )
                    // InternalEDdsl.g:1001:3: ( 'input' )
                    {
                     before(grammarAccess.getReadableEnumAccess().getInputEnumLiteralDeclaration_2()); 
                    // InternalEDdsl.g:1002:3: ( 'input' )
                    // InternalEDdsl.g:1002:4: 'input'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getReadableEnumAccess().getInputEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEDdsl.g:1006:2: ( ( 'h1' ) )
                    {
                    // InternalEDdsl.g:1006:2: ( ( 'h1' ) )
                    // InternalEDdsl.g:1007:3: ( 'h1' )
                    {
                     before(grammarAccess.getReadableEnumAccess().getH1EnumLiteralDeclaration_3()); 
                    // InternalEDdsl.g:1008:3: ( 'h1' )
                    // InternalEDdsl.g:1008:4: 'h1'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getReadableEnumAccess().getH1EnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__ReadableEnum__Alternatives"


    // $ANTLR start "rule__All__Group__0"
    // InternalEDdsl.g:1016:1: rule__All__Group__0 : rule__All__Group__0__Impl rule__All__Group__1 ;
    public final void rule__All__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1020:1: ( rule__All__Group__0__Impl rule__All__Group__1 )
            // InternalEDdsl.g:1021:2: rule__All__Group__0__Impl rule__All__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__All__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__All__Group__1();

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
    // $ANTLR end "rule__All__Group__0"


    // $ANTLR start "rule__All__Group__0__Impl"
    // InternalEDdsl.g:1028:1: rule__All__Group__0__Impl : ( 'all' ) ;
    public final void rule__All__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1032:1: ( ( 'all' ) )
            // InternalEDdsl.g:1033:1: ( 'all' )
            {
            // InternalEDdsl.g:1033:1: ( 'all' )
            // InternalEDdsl.g:1034:2: 'all'
            {
             before(grammarAccess.getAllAccess().getAllKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAllAccess().getAllKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__All__Group__0__Impl"


    // $ANTLR start "rule__All__Group__1"
    // InternalEDdsl.g:1043:1: rule__All__Group__1 : rule__All__Group__1__Impl ;
    public final void rule__All__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1047:1: ( rule__All__Group__1__Impl )
            // InternalEDdsl.g:1048:2: rule__All__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__All__Group__1__Impl();

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
    // $ANTLR end "rule__All__Group__1"


    // $ANTLR start "rule__All__Group__1__Impl"
    // InternalEDdsl.g:1054:1: rule__All__Group__1__Impl : ( ( rule__All__OperationAssignment_1 ) ) ;
    public final void rule__All__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1058:1: ( ( ( rule__All__OperationAssignment_1 ) ) )
            // InternalEDdsl.g:1059:1: ( ( rule__All__OperationAssignment_1 ) )
            {
            // InternalEDdsl.g:1059:1: ( ( rule__All__OperationAssignment_1 ) )
            // InternalEDdsl.g:1060:2: ( rule__All__OperationAssignment_1 )
            {
             before(grammarAccess.getAllAccess().getOperationAssignment_1()); 
            // InternalEDdsl.g:1061:2: ( rule__All__OperationAssignment_1 )
            // InternalEDdsl.g:1061:3: rule__All__OperationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__All__OperationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAllAccess().getOperationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__All__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalEDdsl.g:1070:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1074:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalEDdsl.g:1075:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalEDdsl.g:1082:1: rule__Attribute__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1086:1: ( ( 'attribute' ) )
            // InternalEDdsl.g:1087:1: ( 'attribute' )
            {
            // InternalEDdsl.g:1087:1: ( 'attribute' )
            // InternalEDdsl.g:1088:2: 'attribute'
            {
             before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalEDdsl.g:1097:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1101:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalEDdsl.g:1102:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

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
    // InternalEDdsl.g:1109:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__AttributeNameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1113:1: ( ( ( rule__Attribute__AttributeNameAssignment_1 ) ) )
            // InternalEDdsl.g:1114:1: ( ( rule__Attribute__AttributeNameAssignment_1 ) )
            {
            // InternalEDdsl.g:1114:1: ( ( rule__Attribute__AttributeNameAssignment_1 ) )
            // InternalEDdsl.g:1115:2: ( rule__Attribute__AttributeNameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getAttributeNameAssignment_1()); 
            // InternalEDdsl.g:1116:2: ( rule__Attribute__AttributeNameAssignment_1 )
            // InternalEDdsl.g:1116:3: rule__Attribute__AttributeNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__AttributeNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAttributeNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalEDdsl.g:1124:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1128:1: ( rule__Attribute__Group__2__Impl )
            // InternalEDdsl.g:1129:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2__Impl();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalEDdsl.g:1135:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__AttributeValueAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1139:1: ( ( ( rule__Attribute__AttributeValueAssignment_2 ) ) )
            // InternalEDdsl.g:1140:1: ( ( rule__Attribute__AttributeValueAssignment_2 ) )
            {
            // InternalEDdsl.g:1140:1: ( ( rule__Attribute__AttributeValueAssignment_2 ) )
            // InternalEDdsl.g:1141:2: ( rule__Attribute__AttributeValueAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getAttributeValueAssignment_2()); 
            // InternalEDdsl.g:1142:2: ( rule__Attribute__AttributeValueAssignment_2 )
            // InternalEDdsl.g:1142:3: rule__Attribute__AttributeValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__AttributeValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAttributeValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Browse__Group__0"
    // InternalEDdsl.g:1151:1: rule__Browse__Group__0 : rule__Browse__Group__0__Impl rule__Browse__Group__1 ;
    public final void rule__Browse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1155:1: ( rule__Browse__Group__0__Impl rule__Browse__Group__1 )
            // InternalEDdsl.g:1156:2: rule__Browse__Group__0__Impl rule__Browse__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Browse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Browse__Group__1();

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
    // $ANTLR end "rule__Browse__Group__0"


    // $ANTLR start "rule__Browse__Group__0__Impl"
    // InternalEDdsl.g:1163:1: rule__Browse__Group__0__Impl : ( 'browse' ) ;
    public final void rule__Browse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1167:1: ( ( 'browse' ) )
            // InternalEDdsl.g:1168:1: ( 'browse' )
            {
            // InternalEDdsl.g:1168:1: ( 'browse' )
            // InternalEDdsl.g:1169:2: 'browse'
            {
             before(grammarAccess.getBrowseAccess().getBrowseKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getBrowseAccess().getBrowseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Browse__Group__0__Impl"


    // $ANTLR start "rule__Browse__Group__1"
    // InternalEDdsl.g:1178:1: rule__Browse__Group__1 : rule__Browse__Group__1__Impl ;
    public final void rule__Browse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1182:1: ( rule__Browse__Group__1__Impl )
            // InternalEDdsl.g:1183:2: rule__Browse__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Browse__Group__1__Impl();

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
    // $ANTLR end "rule__Browse__Group__1"


    // $ANTLR start "rule__Browse__Group__1__Impl"
    // InternalEDdsl.g:1189:1: rule__Browse__Group__1__Impl : ( ( rule__Browse__UrlAssignment_1 ) ) ;
    public final void rule__Browse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1193:1: ( ( ( rule__Browse__UrlAssignment_1 ) ) )
            // InternalEDdsl.g:1194:1: ( ( rule__Browse__UrlAssignment_1 ) )
            {
            // InternalEDdsl.g:1194:1: ( ( rule__Browse__UrlAssignment_1 ) )
            // InternalEDdsl.g:1195:2: ( rule__Browse__UrlAssignment_1 )
            {
             before(grammarAccess.getBrowseAccess().getUrlAssignment_1()); 
            // InternalEDdsl.g:1196:2: ( rule__Browse__UrlAssignment_1 )
            // InternalEDdsl.g:1196:3: rule__Browse__UrlAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Browse__UrlAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBrowseAccess().getUrlAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Browse__Group__1__Impl"


    // $ANTLR start "rule__Check__Group__0"
    // InternalEDdsl.g:1205:1: rule__Check__Group__0 : rule__Check__Group__0__Impl rule__Check__Group__1 ;
    public final void rule__Check__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1209:1: ( rule__Check__Group__0__Impl rule__Check__Group__1 )
            // InternalEDdsl.g:1210:2: rule__Check__Group__0__Impl rule__Check__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Check__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check__Group__1();

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
    // $ANTLR end "rule__Check__Group__0"


    // $ANTLR start "rule__Check__Group__0__Impl"
    // InternalEDdsl.g:1217:1: rule__Check__Group__0__Impl : ( 'check' ) ;
    public final void rule__Check__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1221:1: ( ( 'check' ) )
            // InternalEDdsl.g:1222:1: ( 'check' )
            {
            // InternalEDdsl.g:1222:1: ( 'check' )
            // InternalEDdsl.g:1223:2: 'check'
            {
             before(grammarAccess.getCheckAccess().getCheckKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCheckAccess().getCheckKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__0__Impl"


    // $ANTLR start "rule__Check__Group__1"
    // InternalEDdsl.g:1232:1: rule__Check__Group__1 : rule__Check__Group__1__Impl ;
    public final void rule__Check__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1236:1: ( rule__Check__Group__1__Impl )
            // InternalEDdsl.g:1237:2: rule__Check__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Check__Group__1__Impl();

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
    // $ANTLR end "rule__Check__Group__1"


    // $ANTLR start "rule__Check__Group__1__Impl"
    // InternalEDdsl.g:1243:1: rule__Check__Group__1__Impl : ( ( rule__Check__ActionAssignment_1 ) ) ;
    public final void rule__Check__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1247:1: ( ( ( rule__Check__ActionAssignment_1 ) ) )
            // InternalEDdsl.g:1248:1: ( ( rule__Check__ActionAssignment_1 ) )
            {
            // InternalEDdsl.g:1248:1: ( ( rule__Check__ActionAssignment_1 ) )
            // InternalEDdsl.g:1249:2: ( rule__Check__ActionAssignment_1 )
            {
             before(grammarAccess.getCheckAccess().getActionAssignment_1()); 
            // InternalEDdsl.g:1250:2: ( rule__Check__ActionAssignment_1 )
            // InternalEDdsl.g:1250:3: rule__Check__ActionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Check__ActionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckAccess().getActionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // InternalEDdsl.g:1259:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1263:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalEDdsl.g:1264:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Comparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1();

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
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // InternalEDdsl.g:1271:1: rule__Comparison__Group__0__Impl : ( 'comparison' ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1275:1: ( ( 'comparison' ) )
            // InternalEDdsl.g:1276:1: ( 'comparison' )
            {
            // InternalEDdsl.g:1276:1: ( 'comparison' )
            // InternalEDdsl.g:1277:2: 'comparison'
            {
             before(grammarAccess.getComparisonAccess().getComparisonKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getComparisonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // InternalEDdsl.g:1286:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl rule__Comparison__Group__2 ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1290:1: ( rule__Comparison__Group__1__Impl rule__Comparison__Group__2 )
            // InternalEDdsl.g:1291:2: rule__Comparison__Group__1__Impl rule__Comparison__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Comparison__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group__2();

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
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // InternalEDdsl.g:1298:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__FirstValAssignment_1 ) ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1302:1: ( ( ( rule__Comparison__FirstValAssignment_1 ) ) )
            // InternalEDdsl.g:1303:1: ( ( rule__Comparison__FirstValAssignment_1 ) )
            {
            // InternalEDdsl.g:1303:1: ( ( rule__Comparison__FirstValAssignment_1 ) )
            // InternalEDdsl.g:1304:2: ( rule__Comparison__FirstValAssignment_1 )
            {
             before(grammarAccess.getComparisonAccess().getFirstValAssignment_1()); 
            // InternalEDdsl.g:1305:2: ( rule__Comparison__FirstValAssignment_1 )
            // InternalEDdsl.g:1305:3: rule__Comparison__FirstValAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__FirstValAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getFirstValAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group__2"
    // InternalEDdsl.g:1313:1: rule__Comparison__Group__2 : rule__Comparison__Group__2__Impl rule__Comparison__Group__3 ;
    public final void rule__Comparison__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1317:1: ( rule__Comparison__Group__2__Impl rule__Comparison__Group__3 )
            // InternalEDdsl.g:1318:2: rule__Comparison__Group__2__Impl rule__Comparison__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Comparison__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group__3();

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
    // $ANTLR end "rule__Comparison__Group__2"


    // $ANTLR start "rule__Comparison__Group__2__Impl"
    // InternalEDdsl.g:1325:1: rule__Comparison__Group__2__Impl : ( ( rule__Comparison__ComparatorOperatorAssignment_2 ) ) ;
    public final void rule__Comparison__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1329:1: ( ( ( rule__Comparison__ComparatorOperatorAssignment_2 ) ) )
            // InternalEDdsl.g:1330:1: ( ( rule__Comparison__ComparatorOperatorAssignment_2 ) )
            {
            // InternalEDdsl.g:1330:1: ( ( rule__Comparison__ComparatorOperatorAssignment_2 ) )
            // InternalEDdsl.g:1331:2: ( rule__Comparison__ComparatorOperatorAssignment_2 )
            {
             before(grammarAccess.getComparisonAccess().getComparatorOperatorAssignment_2()); 
            // InternalEDdsl.g:1332:2: ( rule__Comparison__ComparatorOperatorAssignment_2 )
            // InternalEDdsl.g:1332:3: rule__Comparison__ComparatorOperatorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__ComparatorOperatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getComparatorOperatorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__2__Impl"


    // $ANTLR start "rule__Comparison__Group__3"
    // InternalEDdsl.g:1340:1: rule__Comparison__Group__3 : rule__Comparison__Group__3__Impl ;
    public final void rule__Comparison__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1344:1: ( rule__Comparison__Group__3__Impl )
            // InternalEDdsl.g:1345:2: rule__Comparison__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__3__Impl();

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
    // $ANTLR end "rule__Comparison__Group__3"


    // $ANTLR start "rule__Comparison__Group__3__Impl"
    // InternalEDdsl.g:1351:1: rule__Comparison__Group__3__Impl : ( ( rule__Comparison__SecondValAssignment_3 ) ) ;
    public final void rule__Comparison__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1355:1: ( ( ( rule__Comparison__SecondValAssignment_3 ) ) )
            // InternalEDdsl.g:1356:1: ( ( rule__Comparison__SecondValAssignment_3 ) )
            {
            // InternalEDdsl.g:1356:1: ( ( rule__Comparison__SecondValAssignment_3 ) )
            // InternalEDdsl.g:1357:2: ( rule__Comparison__SecondValAssignment_3 )
            {
             before(grammarAccess.getComparisonAccess().getSecondValAssignment_3()); 
            // InternalEDdsl.g:1358:2: ( rule__Comparison__SecondValAssignment_3 )
            // InternalEDdsl.g:1358:3: rule__Comparison__SecondValAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__SecondValAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getSecondValAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__3__Impl"


    // $ANTLR start "rule__Constraint__Group__0"
    // InternalEDdsl.g:1367:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1371:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalEDdsl.g:1372:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__1();

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
    // $ANTLR end "rule__Constraint__Group__0"


    // $ANTLR start "rule__Constraint__Group__0__Impl"
    // InternalEDdsl.g:1379:1: rule__Constraint__Group__0__Impl : ( ( rule__Constraint__ReadableElementAssignment_0 ) ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1383:1: ( ( ( rule__Constraint__ReadableElementAssignment_0 ) ) )
            // InternalEDdsl.g:1384:1: ( ( rule__Constraint__ReadableElementAssignment_0 ) )
            {
            // InternalEDdsl.g:1384:1: ( ( rule__Constraint__ReadableElementAssignment_0 ) )
            // InternalEDdsl.g:1385:2: ( rule__Constraint__ReadableElementAssignment_0 )
            {
             before(grammarAccess.getConstraintAccess().getReadableElementAssignment_0()); 
            // InternalEDdsl.g:1386:2: ( rule__Constraint__ReadableElementAssignment_0 )
            // InternalEDdsl.g:1386:3: rule__Constraint__ReadableElementAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__ReadableElementAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getReadableElementAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0__Impl"


    // $ANTLR start "rule__Constraint__Group__1"
    // InternalEDdsl.g:1394:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1398:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalEDdsl.g:1399:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Constraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__2();

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
    // $ANTLR end "rule__Constraint__Group__1"


    // $ANTLR start "rule__Constraint__Group__1__Impl"
    // InternalEDdsl.g:1406:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__ConstraintTypeAssignment_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1410:1: ( ( ( rule__Constraint__ConstraintTypeAssignment_1 ) ) )
            // InternalEDdsl.g:1411:1: ( ( rule__Constraint__ConstraintTypeAssignment_1 ) )
            {
            // InternalEDdsl.g:1411:1: ( ( rule__Constraint__ConstraintTypeAssignment_1 ) )
            // InternalEDdsl.g:1412:2: ( rule__Constraint__ConstraintTypeAssignment_1 )
            {
             before(grammarAccess.getConstraintAccess().getConstraintTypeAssignment_1()); 
            // InternalEDdsl.g:1413:2: ( rule__Constraint__ConstraintTypeAssignment_1 )
            // InternalEDdsl.g:1413:3: rule__Constraint__ConstraintTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__ConstraintTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getConstraintTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1__Impl"


    // $ANTLR start "rule__Constraint__Group__2"
    // InternalEDdsl.g:1421:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1425:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // InternalEDdsl.g:1426:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Constraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__3();

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
    // $ANTLR end "rule__Constraint__Group__2"


    // $ANTLR start "rule__Constraint__Group__2__Impl"
    // InternalEDdsl.g:1433:1: rule__Constraint__Group__2__Impl : ( ( rule__Constraint__ExpectedValAssignment_2 ) ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1437:1: ( ( ( rule__Constraint__ExpectedValAssignment_2 ) ) )
            // InternalEDdsl.g:1438:1: ( ( rule__Constraint__ExpectedValAssignment_2 ) )
            {
            // InternalEDdsl.g:1438:1: ( ( rule__Constraint__ExpectedValAssignment_2 ) )
            // InternalEDdsl.g:1439:2: ( rule__Constraint__ExpectedValAssignment_2 )
            {
             before(grammarAccess.getConstraintAccess().getExpectedValAssignment_2()); 
            // InternalEDdsl.g:1440:2: ( rule__Constraint__ExpectedValAssignment_2 )
            // InternalEDdsl.g:1440:3: rule__Constraint__ExpectedValAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__ExpectedValAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getExpectedValAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__2__Impl"


    // $ANTLR start "rule__Constraint__Group__3"
    // InternalEDdsl.g:1448:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1452:1: ( rule__Constraint__Group__3__Impl )
            // InternalEDdsl.g:1453:2: rule__Constraint__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__3__Impl();

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
    // $ANTLR end "rule__Constraint__Group__3"


    // $ANTLR start "rule__Constraint__Group__3__Impl"
    // InternalEDdsl.g:1459:1: rule__Constraint__Group__3__Impl : ( ( rule__Constraint__ParametersAssignment_3 ) ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1463:1: ( ( ( rule__Constraint__ParametersAssignment_3 ) ) )
            // InternalEDdsl.g:1464:1: ( ( rule__Constraint__ParametersAssignment_3 ) )
            {
            // InternalEDdsl.g:1464:1: ( ( rule__Constraint__ParametersAssignment_3 ) )
            // InternalEDdsl.g:1465:2: ( rule__Constraint__ParametersAssignment_3 )
            {
             before(grammarAccess.getConstraintAccess().getParametersAssignment_3()); 
            // InternalEDdsl.g:1466:2: ( rule__Constraint__ParametersAssignment_3 )
            // InternalEDdsl.g:1466:3: rule__Constraint__ParametersAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__ParametersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getParametersAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__3__Impl"


    // $ANTLR start "rule__Count__Group__0"
    // InternalEDdsl.g:1475:1: rule__Count__Group__0 : rule__Count__Group__0__Impl rule__Count__Group__1 ;
    public final void rule__Count__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1479:1: ( rule__Count__Group__0__Impl rule__Count__Group__1 )
            // InternalEDdsl.g:1480:2: rule__Count__Group__0__Impl rule__Count__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Count__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Count__Group__1();

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
    // $ANTLR end "rule__Count__Group__0"


    // $ANTLR start "rule__Count__Group__0__Impl"
    // InternalEDdsl.g:1487:1: rule__Count__Group__0__Impl : ( 'count' ) ;
    public final void rule__Count__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1491:1: ( ( 'count' ) )
            // InternalEDdsl.g:1492:1: ( 'count' )
            {
            // InternalEDdsl.g:1492:1: ( 'count' )
            // InternalEDdsl.g:1493:2: 'count'
            {
             before(grammarAccess.getCountAccess().getCountKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCountAccess().getCountKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Count__Group__0__Impl"


    // $ANTLR start "rule__Count__Group__1"
    // InternalEDdsl.g:1502:1: rule__Count__Group__1 : rule__Count__Group__1__Impl ;
    public final void rule__Count__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1506:1: ( rule__Count__Group__1__Impl )
            // InternalEDdsl.g:1507:2: rule__Count__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Count__Group__1__Impl();

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
    // $ANTLR end "rule__Count__Group__1"


    // $ANTLR start "rule__Count__Group__1__Impl"
    // InternalEDdsl.g:1513:1: rule__Count__Group__1__Impl : ( ( rule__Count__ParametersAssignment_1 ) ) ;
    public final void rule__Count__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1517:1: ( ( ( rule__Count__ParametersAssignment_1 ) ) )
            // InternalEDdsl.g:1518:1: ( ( rule__Count__ParametersAssignment_1 ) )
            {
            // InternalEDdsl.g:1518:1: ( ( rule__Count__ParametersAssignment_1 ) )
            // InternalEDdsl.g:1519:2: ( rule__Count__ParametersAssignment_1 )
            {
             before(grammarAccess.getCountAccess().getParametersAssignment_1()); 
            // InternalEDdsl.g:1520:2: ( rule__Count__ParametersAssignment_1 )
            // InternalEDdsl.g:1520:3: rule__Count__ParametersAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Count__ParametersAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCountAccess().getParametersAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Count__Group__1__Impl"


    // $ANTLR start "rule__Click__Group__0"
    // InternalEDdsl.g:1529:1: rule__Click__Group__0 : rule__Click__Group__0__Impl rule__Click__Group__1 ;
    public final void rule__Click__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1533:1: ( rule__Click__Group__0__Impl rule__Click__Group__1 )
            // InternalEDdsl.g:1534:2: rule__Click__Group__0__Impl rule__Click__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Click__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Click__Group__1();

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
    // $ANTLR end "rule__Click__Group__0"


    // $ANTLR start "rule__Click__Group__0__Impl"
    // InternalEDdsl.g:1541:1: rule__Click__Group__0__Impl : ( 'click' ) ;
    public final void rule__Click__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1545:1: ( ( 'click' ) )
            // InternalEDdsl.g:1546:1: ( 'click' )
            {
            // InternalEDdsl.g:1546:1: ( 'click' )
            // InternalEDdsl.g:1547:2: 'click'
            {
             before(grammarAccess.getClickAccess().getClickKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getClickAccess().getClickKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__0__Impl"


    // $ANTLR start "rule__Click__Group__1"
    // InternalEDdsl.g:1556:1: rule__Click__Group__1 : rule__Click__Group__1__Impl rule__Click__Group__2 ;
    public final void rule__Click__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1560:1: ( rule__Click__Group__1__Impl rule__Click__Group__2 )
            // InternalEDdsl.g:1561:2: rule__Click__Group__1__Impl rule__Click__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Click__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Click__Group__2();

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
    // $ANTLR end "rule__Click__Group__1"


    // $ANTLR start "rule__Click__Group__1__Impl"
    // InternalEDdsl.g:1568:1: rule__Click__Group__1__Impl : ( ( rule__Click__ClickableElementAssignment_1 ) ) ;
    public final void rule__Click__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1572:1: ( ( ( rule__Click__ClickableElementAssignment_1 ) ) )
            // InternalEDdsl.g:1573:1: ( ( rule__Click__ClickableElementAssignment_1 ) )
            {
            // InternalEDdsl.g:1573:1: ( ( rule__Click__ClickableElementAssignment_1 ) )
            // InternalEDdsl.g:1574:2: ( rule__Click__ClickableElementAssignment_1 )
            {
             before(grammarAccess.getClickAccess().getClickableElementAssignment_1()); 
            // InternalEDdsl.g:1575:2: ( rule__Click__ClickableElementAssignment_1 )
            // InternalEDdsl.g:1575:3: rule__Click__ClickableElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Click__ClickableElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getClickableElementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__1__Impl"


    // $ANTLR start "rule__Click__Group__2"
    // InternalEDdsl.g:1583:1: rule__Click__Group__2 : rule__Click__Group__2__Impl ;
    public final void rule__Click__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1587:1: ( rule__Click__Group__2__Impl )
            // InternalEDdsl.g:1588:2: rule__Click__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Click__Group__2__Impl();

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
    // $ANTLR end "rule__Click__Group__2"


    // $ANTLR start "rule__Click__Group__2__Impl"
    // InternalEDdsl.g:1594:1: rule__Click__Group__2__Impl : ( ( rule__Click__ParametersAssignment_2 ) ) ;
    public final void rule__Click__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1598:1: ( ( ( rule__Click__ParametersAssignment_2 ) ) )
            // InternalEDdsl.g:1599:1: ( ( rule__Click__ParametersAssignment_2 ) )
            {
            // InternalEDdsl.g:1599:1: ( ( rule__Click__ParametersAssignment_2 ) )
            // InternalEDdsl.g:1600:2: ( rule__Click__ParametersAssignment_2 )
            {
             before(grammarAccess.getClickAccess().getParametersAssignment_2()); 
            // InternalEDdsl.g:1601:2: ( rule__Click__ParametersAssignment_2 )
            // InternalEDdsl.g:1601:3: rule__Click__ParametersAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Click__ParametersAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getParametersAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__2__Impl"


    // $ANTLR start "rule__Operation__Group__0"
    // InternalEDdsl.g:1610:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1614:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // InternalEDdsl.g:1615:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__1();

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
    // $ANTLR end "rule__Operation__Group__0"


    // $ANTLR start "rule__Operation__Group__0__Impl"
    // InternalEDdsl.g:1622:1: rule__Operation__Group__0__Impl : ( ( rule__Operation__ActionAssignment_0 ) ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1626:1: ( ( ( rule__Operation__ActionAssignment_0 ) ) )
            // InternalEDdsl.g:1627:1: ( ( rule__Operation__ActionAssignment_0 ) )
            {
            // InternalEDdsl.g:1627:1: ( ( rule__Operation__ActionAssignment_0 ) )
            // InternalEDdsl.g:1628:2: ( rule__Operation__ActionAssignment_0 )
            {
             before(grammarAccess.getOperationAccess().getActionAssignment_0()); 
            // InternalEDdsl.g:1629:2: ( rule__Operation__ActionAssignment_0 )
            // InternalEDdsl.g:1629:3: rule__Operation__ActionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Operation__ActionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getActionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0__Impl"


    // $ANTLR start "rule__Operation__Group__1"
    // InternalEDdsl.g:1637:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1641:1: ( rule__Operation__Group__1__Impl )
            // InternalEDdsl.g:1642:2: rule__Operation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__1__Impl();

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
    // $ANTLR end "rule__Operation__Group__1"


    // $ANTLR start "rule__Operation__Group__1__Impl"
    // InternalEDdsl.g:1648:1: rule__Operation__Group__1__Impl : ( ';' ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1652:1: ( ( ';' ) )
            // InternalEDdsl.g:1653:1: ( ';' )
            {
            // InternalEDdsl.g:1653:1: ( ';' )
            // InternalEDdsl.g:1654:2: ';'
            {
             before(grammarAccess.getOperationAccess().getSemicolonKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalEDdsl.g:1664:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1668:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalEDdsl.g:1669:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

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
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalEDdsl.g:1676:1: rule__Parameter__Group__0__Impl : ( '(' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1680:1: ( ( '(' ) )
            // InternalEDdsl.g:1681:1: ( '(' )
            {
            // InternalEDdsl.g:1681:1: ( '(' )
            // InternalEDdsl.g:1682:2: '('
            {
             before(grammarAccess.getParameterAccess().getLeftParenthesisKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalEDdsl.g:1691:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1695:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalEDdsl.g:1696:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

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
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalEDdsl.g:1703:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__ParameterAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1707:1: ( ( ( rule__Parameter__ParameterAssignment_1 ) ) )
            // InternalEDdsl.g:1708:1: ( ( rule__Parameter__ParameterAssignment_1 ) )
            {
            // InternalEDdsl.g:1708:1: ( ( rule__Parameter__ParameterAssignment_1 ) )
            // InternalEDdsl.g:1709:2: ( rule__Parameter__ParameterAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getParameterAssignment_1()); 
            // InternalEDdsl.g:1710:2: ( rule__Parameter__ParameterAssignment_1 )
            // InternalEDdsl.g:1710:3: rule__Parameter__ParameterAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__ParameterAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getParameterAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalEDdsl.g:1718:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1722:1: ( rule__Parameter__Group__2__Impl )
            // InternalEDdsl.g:1723:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2__Impl();

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
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalEDdsl.g:1729:1: rule__Parameter__Group__2__Impl : ( ')' ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1733:1: ( ( ')' ) )
            // InternalEDdsl.g:1734:1: ( ')' )
            {
            // InternalEDdsl.g:1734:1: ( ')' )
            // InternalEDdsl.g:1735:2: ')'
            {
             before(grammarAccess.getParameterAccess().getRightParenthesisKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Read__Group__0"
    // InternalEDdsl.g:1745:1: rule__Read__Group__0 : rule__Read__Group__0__Impl rule__Read__Group__1 ;
    public final void rule__Read__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1749:1: ( rule__Read__Group__0__Impl rule__Read__Group__1 )
            // InternalEDdsl.g:1750:2: rule__Read__Group__0__Impl rule__Read__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Read__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Read__Group__1();

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
    // $ANTLR end "rule__Read__Group__0"


    // $ANTLR start "rule__Read__Group__0__Impl"
    // InternalEDdsl.g:1757:1: rule__Read__Group__0__Impl : ( 'read' ) ;
    public final void rule__Read__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1761:1: ( ( 'read' ) )
            // InternalEDdsl.g:1762:1: ( 'read' )
            {
            // InternalEDdsl.g:1762:1: ( 'read' )
            // InternalEDdsl.g:1763:2: 'read'
            {
             before(grammarAccess.getReadAccess().getReadKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getReadAccess().getReadKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__0__Impl"


    // $ANTLR start "rule__Read__Group__1"
    // InternalEDdsl.g:1772:1: rule__Read__Group__1 : rule__Read__Group__1__Impl rule__Read__Group__2 ;
    public final void rule__Read__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1776:1: ( rule__Read__Group__1__Impl rule__Read__Group__2 )
            // InternalEDdsl.g:1777:2: rule__Read__Group__1__Impl rule__Read__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Read__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Read__Group__2();

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
    // $ANTLR end "rule__Read__Group__1"


    // $ANTLR start "rule__Read__Group__1__Impl"
    // InternalEDdsl.g:1784:1: rule__Read__Group__1__Impl : ( ( rule__Read__ReadableElementAssignment_1 ) ) ;
    public final void rule__Read__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1788:1: ( ( ( rule__Read__ReadableElementAssignment_1 ) ) )
            // InternalEDdsl.g:1789:1: ( ( rule__Read__ReadableElementAssignment_1 ) )
            {
            // InternalEDdsl.g:1789:1: ( ( rule__Read__ReadableElementAssignment_1 ) )
            // InternalEDdsl.g:1790:2: ( rule__Read__ReadableElementAssignment_1 )
            {
             before(grammarAccess.getReadAccess().getReadableElementAssignment_1()); 
            // InternalEDdsl.g:1791:2: ( rule__Read__ReadableElementAssignment_1 )
            // InternalEDdsl.g:1791:3: rule__Read__ReadableElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Read__ReadableElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReadAccess().getReadableElementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__1__Impl"


    // $ANTLR start "rule__Read__Group__2"
    // InternalEDdsl.g:1799:1: rule__Read__Group__2 : rule__Read__Group__2__Impl ;
    public final void rule__Read__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1803:1: ( rule__Read__Group__2__Impl )
            // InternalEDdsl.g:1804:2: rule__Read__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Read__Group__2__Impl();

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
    // $ANTLR end "rule__Read__Group__2"


    // $ANTLR start "rule__Read__Group__2__Impl"
    // InternalEDdsl.g:1810:1: rule__Read__Group__2__Impl : ( ( rule__Read__ParametersAssignment_2 ) ) ;
    public final void rule__Read__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1814:1: ( ( ( rule__Read__ParametersAssignment_2 ) ) )
            // InternalEDdsl.g:1815:1: ( ( rule__Read__ParametersAssignment_2 ) )
            {
            // InternalEDdsl.g:1815:1: ( ( rule__Read__ParametersAssignment_2 ) )
            // InternalEDdsl.g:1816:2: ( rule__Read__ParametersAssignment_2 )
            {
             before(grammarAccess.getReadAccess().getParametersAssignment_2()); 
            // InternalEDdsl.g:1817:2: ( rule__Read__ParametersAssignment_2 )
            // InternalEDdsl.g:1817:3: rule__Read__ParametersAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Read__ParametersAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReadAccess().getParametersAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__2__Impl"


    // $ANTLR start "rule__Series__Group__0"
    // InternalEDdsl.g:1826:1: rule__Series__Group__0 : rule__Series__Group__0__Impl rule__Series__Group__1 ;
    public final void rule__Series__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1830:1: ( rule__Series__Group__0__Impl rule__Series__Group__1 )
            // InternalEDdsl.g:1831:2: rule__Series__Group__0__Impl rule__Series__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Series__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Series__Group__1();

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
    // $ANTLR end "rule__Series__Group__0"


    // $ANTLR start "rule__Series__Group__0__Impl"
    // InternalEDdsl.g:1838:1: rule__Series__Group__0__Impl : ( 'open' ) ;
    public final void rule__Series__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1842:1: ( ( 'open' ) )
            // InternalEDdsl.g:1843:1: ( 'open' )
            {
            // InternalEDdsl.g:1843:1: ( 'open' )
            // InternalEDdsl.g:1844:2: 'open'
            {
             before(grammarAccess.getSeriesAccess().getOpenKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSeriesAccess().getOpenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Series__Group__0__Impl"


    // $ANTLR start "rule__Series__Group__1"
    // InternalEDdsl.g:1853:1: rule__Series__Group__1 : rule__Series__Group__1__Impl rule__Series__Group__2 ;
    public final void rule__Series__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1857:1: ( rule__Series__Group__1__Impl rule__Series__Group__2 )
            // InternalEDdsl.g:1858:2: rule__Series__Group__1__Impl rule__Series__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Series__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Series__Group__2();

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
    // $ANTLR end "rule__Series__Group__1"


    // $ANTLR start "rule__Series__Group__1__Impl"
    // InternalEDdsl.g:1865:1: rule__Series__Group__1__Impl : ( ( rule__Series__BrowserAssignment_1 ) ) ;
    public final void rule__Series__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1869:1: ( ( ( rule__Series__BrowserAssignment_1 ) ) )
            // InternalEDdsl.g:1870:1: ( ( rule__Series__BrowserAssignment_1 ) )
            {
            // InternalEDdsl.g:1870:1: ( ( rule__Series__BrowserAssignment_1 ) )
            // InternalEDdsl.g:1871:2: ( rule__Series__BrowserAssignment_1 )
            {
             before(grammarAccess.getSeriesAccess().getBrowserAssignment_1()); 
            // InternalEDdsl.g:1872:2: ( rule__Series__BrowserAssignment_1 )
            // InternalEDdsl.g:1872:3: rule__Series__BrowserAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Series__BrowserAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSeriesAccess().getBrowserAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Series__Group__1__Impl"


    // $ANTLR start "rule__Series__Group__2"
    // InternalEDdsl.g:1880:1: rule__Series__Group__2 : rule__Series__Group__2__Impl rule__Series__Group__3 ;
    public final void rule__Series__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1884:1: ( rule__Series__Group__2__Impl rule__Series__Group__3 )
            // InternalEDdsl.g:1885:2: rule__Series__Group__2__Impl rule__Series__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Series__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Series__Group__3();

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
    // $ANTLR end "rule__Series__Group__2"


    // $ANTLR start "rule__Series__Group__2__Impl"
    // InternalEDdsl.g:1892:1: rule__Series__Group__2__Impl : ( ( rule__Series__ExpectedReturnAssignment_2 ) ) ;
    public final void rule__Series__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1896:1: ( ( ( rule__Series__ExpectedReturnAssignment_2 ) ) )
            // InternalEDdsl.g:1897:1: ( ( rule__Series__ExpectedReturnAssignment_2 ) )
            {
            // InternalEDdsl.g:1897:1: ( ( rule__Series__ExpectedReturnAssignment_2 ) )
            // InternalEDdsl.g:1898:2: ( rule__Series__ExpectedReturnAssignment_2 )
            {
             before(grammarAccess.getSeriesAccess().getExpectedReturnAssignment_2()); 
            // InternalEDdsl.g:1899:2: ( rule__Series__ExpectedReturnAssignment_2 )
            // InternalEDdsl.g:1899:3: rule__Series__ExpectedReturnAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Series__ExpectedReturnAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSeriesAccess().getExpectedReturnAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Series__Group__2__Impl"


    // $ANTLR start "rule__Series__Group__3"
    // InternalEDdsl.g:1907:1: rule__Series__Group__3 : rule__Series__Group__3__Impl rule__Series__Group__4 ;
    public final void rule__Series__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1911:1: ( rule__Series__Group__3__Impl rule__Series__Group__4 )
            // InternalEDdsl.g:1912:2: rule__Series__Group__3__Impl rule__Series__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Series__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Series__Group__4();

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
    // $ANTLR end "rule__Series__Group__3"


    // $ANTLR start "rule__Series__Group__3__Impl"
    // InternalEDdsl.g:1919:1: rule__Series__Group__3__Impl : ( ';' ) ;
    public final void rule__Series__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1923:1: ( ( ';' ) )
            // InternalEDdsl.g:1924:1: ( ';' )
            {
            // InternalEDdsl.g:1924:1: ( ';' )
            // InternalEDdsl.g:1925:2: ';'
            {
             before(grammarAccess.getSeriesAccess().getSemicolonKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSeriesAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Series__Group__3__Impl"


    // $ANTLR start "rule__Series__Group__4"
    // InternalEDdsl.g:1934:1: rule__Series__Group__4 : rule__Series__Group__4__Impl ;
    public final void rule__Series__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1938:1: ( rule__Series__Group__4__Impl )
            // InternalEDdsl.g:1939:2: rule__Series__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Series__Group__4__Impl();

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
    // $ANTLR end "rule__Series__Group__4"


    // $ANTLR start "rule__Series__Group__4__Impl"
    // InternalEDdsl.g:1945:1: rule__Series__Group__4__Impl : ( ( rule__Series__OperationsAssignment_4 )* ) ;
    public final void rule__Series__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1949:1: ( ( ( rule__Series__OperationsAssignment_4 )* ) )
            // InternalEDdsl.g:1950:1: ( ( rule__Series__OperationsAssignment_4 )* )
            {
            // InternalEDdsl.g:1950:1: ( ( rule__Series__OperationsAssignment_4 )* )
            // InternalEDdsl.g:1951:2: ( rule__Series__OperationsAssignment_4 )*
            {
             before(grammarAccess.getSeriesAccess().getOperationsAssignment_4()); 
            // InternalEDdsl.g:1952:2: ( rule__Series__OperationsAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==26||(LA14_0>=28 && LA14_0<=29)||LA14_0==32||LA14_0==38) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalEDdsl.g:1952:3: rule__Series__OperationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Series__OperationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSeriesAccess().getOperationsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Series__Group__4__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // InternalEDdsl.g:1961:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1965:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalEDdsl.g:1966:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__1();

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
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // InternalEDdsl.g:1973:1: rule__Type__Group__0__Impl : ( 'type' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1977:1: ( ( 'type' ) )
            // InternalEDdsl.g:1978:1: ( 'type' )
            {
            // InternalEDdsl.g:1978:1: ( 'type' )
            // InternalEDdsl.g:1979:2: 'type'
            {
             before(grammarAccess.getTypeAccess().getTypeKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // InternalEDdsl.g:1988:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:1992:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalEDdsl.g:1993:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__2();

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
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // InternalEDdsl.g:2000:1: rule__Type__Group__1__Impl : ( ( rule__Type__TextToTypeAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2004:1: ( ( ( rule__Type__TextToTypeAssignment_1 ) ) )
            // InternalEDdsl.g:2005:1: ( ( rule__Type__TextToTypeAssignment_1 ) )
            {
            // InternalEDdsl.g:2005:1: ( ( rule__Type__TextToTypeAssignment_1 ) )
            // InternalEDdsl.g:2006:2: ( rule__Type__TextToTypeAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getTextToTypeAssignment_1()); 
            // InternalEDdsl.g:2007:2: ( rule__Type__TextToTypeAssignment_1 )
            // InternalEDdsl.g:2007:3: rule__Type__TextToTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__TextToTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getTextToTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__Type__Group__2"
    // InternalEDdsl.g:2015:1: rule__Type__Group__2 : rule__Type__Group__2__Impl ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2019:1: ( rule__Type__Group__2__Impl )
            // InternalEDdsl.g:2020:2: rule__Type__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__2__Impl();

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
    // $ANTLR end "rule__Type__Group__2"


    // $ANTLR start "rule__Type__Group__2__Impl"
    // InternalEDdsl.g:2026:1: rule__Type__Group__2__Impl : ( ( rule__Type__ParametersAssignment_2 ) ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2030:1: ( ( ( rule__Type__ParametersAssignment_2 ) ) )
            // InternalEDdsl.g:2031:1: ( ( rule__Type__ParametersAssignment_2 ) )
            {
            // InternalEDdsl.g:2031:1: ( ( rule__Type__ParametersAssignment_2 ) )
            // InternalEDdsl.g:2032:2: ( rule__Type__ParametersAssignment_2 )
            {
             before(grammarAccess.getTypeAccess().getParametersAssignment_2()); 
            // InternalEDdsl.g:2033:2: ( rule__Type__ParametersAssignment_2 )
            // InternalEDdsl.g:2033:3: rule__Type__ParametersAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Type__ParametersAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getParametersAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__2__Impl"


    // $ANTLR start "rule__Value__Group__0"
    // InternalEDdsl.g:2042:1: rule__Value__Group__0 : rule__Value__Group__0__Impl rule__Value__Group__1 ;
    public final void rule__Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2046:1: ( rule__Value__Group__0__Impl rule__Value__Group__1 )
            // InternalEDdsl.g:2047:2: rule__Value__Group__0__Impl rule__Value__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Value__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group__1();

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
    // $ANTLR end "rule__Value__Group__0"


    // $ANTLR start "rule__Value__Group__0__Impl"
    // InternalEDdsl.g:2054:1: rule__Value__Group__0__Impl : ( 'value' ) ;
    public final void rule__Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2058:1: ( ( 'value' ) )
            // InternalEDdsl.g:2059:1: ( 'value' )
            {
            // InternalEDdsl.g:2059:1: ( 'value' )
            // InternalEDdsl.g:2060:2: 'value'
            {
             before(grammarAccess.getValueAccess().getValueKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getValueKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__0__Impl"


    // $ANTLR start "rule__Value__Group__1"
    // InternalEDdsl.g:2069:1: rule__Value__Group__1 : rule__Value__Group__1__Impl ;
    public final void rule__Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2073:1: ( rule__Value__Group__1__Impl )
            // InternalEDdsl.g:2074:2: rule__Value__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group__1__Impl();

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
    // $ANTLR end "rule__Value__Group__1"


    // $ANTLR start "rule__Value__Group__1__Impl"
    // InternalEDdsl.g:2080:1: rule__Value__Group__1__Impl : ( ( rule__Value__ValueAssignment_1 ) ) ;
    public final void rule__Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2084:1: ( ( ( rule__Value__ValueAssignment_1 ) ) )
            // InternalEDdsl.g:2085:1: ( ( rule__Value__ValueAssignment_1 ) )
            {
            // InternalEDdsl.g:2085:1: ( ( rule__Value__ValueAssignment_1 ) )
            // InternalEDdsl.g:2086:2: ( rule__Value__ValueAssignment_1 )
            {
             before(grammarAccess.getValueAccess().getValueAssignment_1()); 
            // InternalEDdsl.g:2087:2: ( rule__Value__ValueAssignment_1 )
            // InternalEDdsl.g:2087:3: rule__Value__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Value__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__1__Impl"


    // $ANTLR start "rule__VariableSet__Group__0"
    // InternalEDdsl.g:2096:1: rule__VariableSet__Group__0 : rule__VariableSet__Group__0__Impl rule__VariableSet__Group__1 ;
    public final void rule__VariableSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2100:1: ( rule__VariableSet__Group__0__Impl rule__VariableSet__Group__1 )
            // InternalEDdsl.g:2101:2: rule__VariableSet__Group__0__Impl rule__VariableSet__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__VariableSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableSet__Group__1();

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
    // $ANTLR end "rule__VariableSet__Group__0"


    // $ANTLR start "rule__VariableSet__Group__0__Impl"
    // InternalEDdsl.g:2108:1: rule__VariableSet__Group__0__Impl : ( ( rule__VariableSet__VarNameAssignment_0 ) ) ;
    public final void rule__VariableSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2112:1: ( ( ( rule__VariableSet__VarNameAssignment_0 ) ) )
            // InternalEDdsl.g:2113:1: ( ( rule__VariableSet__VarNameAssignment_0 ) )
            {
            // InternalEDdsl.g:2113:1: ( ( rule__VariableSet__VarNameAssignment_0 ) )
            // InternalEDdsl.g:2114:2: ( rule__VariableSet__VarNameAssignment_0 )
            {
             before(grammarAccess.getVariableSetAccess().getVarNameAssignment_0()); 
            // InternalEDdsl.g:2115:2: ( rule__VariableSet__VarNameAssignment_0 )
            // InternalEDdsl.g:2115:3: rule__VariableSet__VarNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VariableSet__VarNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableSetAccess().getVarNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableSet__Group__0__Impl"


    // $ANTLR start "rule__VariableSet__Group__1"
    // InternalEDdsl.g:2123:1: rule__VariableSet__Group__1 : rule__VariableSet__Group__1__Impl rule__VariableSet__Group__2 ;
    public final void rule__VariableSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2127:1: ( rule__VariableSet__Group__1__Impl rule__VariableSet__Group__2 )
            // InternalEDdsl.g:2128:2: rule__VariableSet__Group__1__Impl rule__VariableSet__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__VariableSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableSet__Group__2();

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
    // $ANTLR end "rule__VariableSet__Group__1"


    // $ANTLR start "rule__VariableSet__Group__1__Impl"
    // InternalEDdsl.g:2135:1: rule__VariableSet__Group__1__Impl : ( '=' ) ;
    public final void rule__VariableSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2139:1: ( ( '=' ) )
            // InternalEDdsl.g:2140:1: ( '=' )
            {
            // InternalEDdsl.g:2140:1: ( '=' )
            // InternalEDdsl.g:2141:2: '='
            {
             before(grammarAccess.getVariableSetAccess().getEqualsSignKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getVariableSetAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableSet__Group__1__Impl"


    // $ANTLR start "rule__VariableSet__Group__2"
    // InternalEDdsl.g:2150:1: rule__VariableSet__Group__2 : rule__VariableSet__Group__2__Impl ;
    public final void rule__VariableSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2154:1: ( rule__VariableSet__Group__2__Impl )
            // InternalEDdsl.g:2155:2: rule__VariableSet__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableSet__Group__2__Impl();

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
    // $ANTLR end "rule__VariableSet__Group__2"


    // $ANTLR start "rule__VariableSet__Group__2__Impl"
    // InternalEDdsl.g:2161:1: rule__VariableSet__Group__2__Impl : ( ( rule__VariableSet__ActionAssignment_2 ) ) ;
    public final void rule__VariableSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2165:1: ( ( ( rule__VariableSet__ActionAssignment_2 ) ) )
            // InternalEDdsl.g:2166:1: ( ( rule__VariableSet__ActionAssignment_2 ) )
            {
            // InternalEDdsl.g:2166:1: ( ( rule__VariableSet__ActionAssignment_2 ) )
            // InternalEDdsl.g:2167:2: ( rule__VariableSet__ActionAssignment_2 )
            {
             before(grammarAccess.getVariableSetAccess().getActionAssignment_2()); 
            // InternalEDdsl.g:2168:2: ( rule__VariableSet__ActionAssignment_2 )
            // InternalEDdsl.g:2168:3: rule__VariableSet__ActionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VariableSet__ActionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableSetAccess().getActionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableSet__Group__2__Impl"


    // $ANTLR start "rule__Test__TestsAssignment"
    // InternalEDdsl.g:2177:1: rule__Test__TestsAssignment : ( ruleSeries ) ;
    public final void rule__Test__TestsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2181:1: ( ( ruleSeries ) )
            // InternalEDdsl.g:2182:2: ( ruleSeries )
            {
            // InternalEDdsl.g:2182:2: ( ruleSeries )
            // InternalEDdsl.g:2183:3: ruleSeries
            {
             before(grammarAccess.getTestAccess().getTestsSeriesParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSeries();

            state._fsp--;

             after(grammarAccess.getTestAccess().getTestsSeriesParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__TestsAssignment"


    // $ANTLR start "rule__All__OperationAssignment_1"
    // InternalEDdsl.g:2192:1: rule__All__OperationAssignment_1 : ( ruleActionNoReturn ) ;
    public final void rule__All__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2196:1: ( ( ruleActionNoReturn ) )
            // InternalEDdsl.g:2197:2: ( ruleActionNoReturn )
            {
            // InternalEDdsl.g:2197:2: ( ruleActionNoReturn )
            // InternalEDdsl.g:2198:3: ruleActionNoReturn
            {
             before(grammarAccess.getAllAccess().getOperationActionNoReturnParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActionNoReturn();

            state._fsp--;

             after(grammarAccess.getAllAccess().getOperationActionNoReturnParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__All__OperationAssignment_1"


    // $ANTLR start "rule__Attribute__AttributeNameAssignment_1"
    // InternalEDdsl.g:2207:1: rule__Attribute__AttributeNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Attribute__AttributeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2211:1: ( ( RULE_STRING ) )
            // InternalEDdsl.g:2212:2: ( RULE_STRING )
            {
            // InternalEDdsl.g:2212:2: ( RULE_STRING )
            // InternalEDdsl.g:2213:3: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getAttributeNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAttributeNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__AttributeNameAssignment_1"


    // $ANTLR start "rule__Attribute__AttributeValueAssignment_2"
    // InternalEDdsl.g:2222:1: rule__Attribute__AttributeValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Attribute__AttributeValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2226:1: ( ( RULE_STRING ) )
            // InternalEDdsl.g:2227:2: ( RULE_STRING )
            {
            // InternalEDdsl.g:2227:2: ( RULE_STRING )
            // InternalEDdsl.g:2228:3: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getAttributeValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAttributeValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__AttributeValueAssignment_2"


    // $ANTLR start "rule__Browse__UrlAssignment_1"
    // InternalEDdsl.g:2237:1: rule__Browse__UrlAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Browse__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2241:1: ( ( RULE_STRING ) )
            // InternalEDdsl.g:2242:2: ( RULE_STRING )
            {
            // InternalEDdsl.g:2242:2: ( RULE_STRING )
            // InternalEDdsl.g:2243:3: RULE_STRING
            {
             before(grammarAccess.getBrowseAccess().getUrlSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBrowseAccess().getUrlSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Browse__UrlAssignment_1"


    // $ANTLR start "rule__Check__ActionAssignment_1"
    // InternalEDdsl.g:2252:1: rule__Check__ActionAssignment_1 : ( ruleActionBoolReturn ) ;
    public final void rule__Check__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2256:1: ( ( ruleActionBoolReturn ) )
            // InternalEDdsl.g:2257:2: ( ruleActionBoolReturn )
            {
            // InternalEDdsl.g:2257:2: ( ruleActionBoolReturn )
            // InternalEDdsl.g:2258:3: ruleActionBoolReturn
            {
             before(grammarAccess.getCheckAccess().getActionActionBoolReturnParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActionBoolReturn();

            state._fsp--;

             after(grammarAccess.getCheckAccess().getActionActionBoolReturnParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__ActionAssignment_1"


    // $ANTLR start "rule__Comparison__FirstValAssignment_1"
    // InternalEDdsl.g:2267:1: rule__Comparison__FirstValAssignment_1 : ( ruleVal ) ;
    public final void rule__Comparison__FirstValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2271:1: ( ( ruleVal ) )
            // InternalEDdsl.g:2272:2: ( ruleVal )
            {
            // InternalEDdsl.g:2272:2: ( ruleVal )
            // InternalEDdsl.g:2273:3: ruleVal
            {
             before(grammarAccess.getComparisonAccess().getFirstValValParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVal();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getFirstValValParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__FirstValAssignment_1"


    // $ANTLR start "rule__Comparison__ComparatorOperatorAssignment_2"
    // InternalEDdsl.g:2282:1: rule__Comparison__ComparatorOperatorAssignment_2 : ( ruleComparisonOperatorEnum ) ;
    public final void rule__Comparison__ComparatorOperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2286:1: ( ( ruleComparisonOperatorEnum ) )
            // InternalEDdsl.g:2287:2: ( ruleComparisonOperatorEnum )
            {
            // InternalEDdsl.g:2287:2: ( ruleComparisonOperatorEnum )
            // InternalEDdsl.g:2288:3: ruleComparisonOperatorEnum
            {
             before(grammarAccess.getComparisonAccess().getComparatorOperatorComparisonOperatorEnumEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComparisonOperatorEnum();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getComparatorOperatorComparisonOperatorEnumEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__ComparatorOperatorAssignment_2"


    // $ANTLR start "rule__Comparison__SecondValAssignment_3"
    // InternalEDdsl.g:2297:1: rule__Comparison__SecondValAssignment_3 : ( ruleVal ) ;
    public final void rule__Comparison__SecondValAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2301:1: ( ( ruleVal ) )
            // InternalEDdsl.g:2302:2: ( ruleVal )
            {
            // InternalEDdsl.g:2302:2: ( ruleVal )
            // InternalEDdsl.g:2303:3: ruleVal
            {
             before(grammarAccess.getComparisonAccess().getSecondValValParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVal();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getSecondValValParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__SecondValAssignment_3"


    // $ANTLR start "rule__Constraint__ReadableElementAssignment_0"
    // InternalEDdsl.g:2312:1: rule__Constraint__ReadableElementAssignment_0 : ( ruleReadableEnum ) ;
    public final void rule__Constraint__ReadableElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2316:1: ( ( ruleReadableEnum ) )
            // InternalEDdsl.g:2317:2: ( ruleReadableEnum )
            {
            // InternalEDdsl.g:2317:2: ( ruleReadableEnum )
            // InternalEDdsl.g:2318:3: ruleReadableEnum
            {
             before(grammarAccess.getConstraintAccess().getReadableElementReadableEnumEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleReadableEnum();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getReadableElementReadableEnumEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__ReadableElementAssignment_0"


    // $ANTLR start "rule__Constraint__ConstraintTypeAssignment_1"
    // InternalEDdsl.g:2327:1: rule__Constraint__ConstraintTypeAssignment_1 : ( ruleConstraintTypeEnum ) ;
    public final void rule__Constraint__ConstraintTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2331:1: ( ( ruleConstraintTypeEnum ) )
            // InternalEDdsl.g:2332:2: ( ruleConstraintTypeEnum )
            {
            // InternalEDdsl.g:2332:2: ( ruleConstraintTypeEnum )
            // InternalEDdsl.g:2333:3: ruleConstraintTypeEnum
            {
             before(grammarAccess.getConstraintAccess().getConstraintTypeConstraintTypeEnumEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraintTypeEnum();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getConstraintTypeConstraintTypeEnumEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__ConstraintTypeAssignment_1"


    // $ANTLR start "rule__Constraint__ExpectedValAssignment_2"
    // InternalEDdsl.g:2342:1: rule__Constraint__ExpectedValAssignment_2 : ( ruleVal ) ;
    public final void rule__Constraint__ExpectedValAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2346:1: ( ( ruleVal ) )
            // InternalEDdsl.g:2347:2: ( ruleVal )
            {
            // InternalEDdsl.g:2347:2: ( ruleVal )
            // InternalEDdsl.g:2348:3: ruleVal
            {
             before(grammarAccess.getConstraintAccess().getExpectedValValParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVal();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getExpectedValValParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__ExpectedValAssignment_2"


    // $ANTLR start "rule__Constraint__ParametersAssignment_3"
    // InternalEDdsl.g:2357:1: rule__Constraint__ParametersAssignment_3 : ( ruleParameters ) ;
    public final void rule__Constraint__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2361:1: ( ( ruleParameters ) )
            // InternalEDdsl.g:2362:2: ( ruleParameters )
            {
            // InternalEDdsl.g:2362:2: ( ruleParameters )
            // InternalEDdsl.g:2363:3: ruleParameters
            {
             before(grammarAccess.getConstraintAccess().getParametersParametersParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParameters();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getParametersParametersParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__ParametersAssignment_3"


    // $ANTLR start "rule__Count__ParametersAssignment_1"
    // InternalEDdsl.g:2372:1: rule__Count__ParametersAssignment_1 : ( ( rule__Count__ParametersAlternatives_1_0 ) ) ;
    public final void rule__Count__ParametersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2376:1: ( ( ( rule__Count__ParametersAlternatives_1_0 ) ) )
            // InternalEDdsl.g:2377:2: ( ( rule__Count__ParametersAlternatives_1_0 ) )
            {
            // InternalEDdsl.g:2377:2: ( ( rule__Count__ParametersAlternatives_1_0 ) )
            // InternalEDdsl.g:2378:3: ( rule__Count__ParametersAlternatives_1_0 )
            {
             before(grammarAccess.getCountAccess().getParametersAlternatives_1_0()); 
            // InternalEDdsl.g:2379:3: ( rule__Count__ParametersAlternatives_1_0 )
            // InternalEDdsl.g:2379:4: rule__Count__ParametersAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Count__ParametersAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCountAccess().getParametersAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Count__ParametersAssignment_1"


    // $ANTLR start "rule__Click__ClickableElementAssignment_1"
    // InternalEDdsl.g:2387:1: rule__Click__ClickableElementAssignment_1 : ( ruleClickableEnum ) ;
    public final void rule__Click__ClickableElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2391:1: ( ( ruleClickableEnum ) )
            // InternalEDdsl.g:2392:2: ( ruleClickableEnum )
            {
            // InternalEDdsl.g:2392:2: ( ruleClickableEnum )
            // InternalEDdsl.g:2393:3: ruleClickableEnum
            {
             before(grammarAccess.getClickAccess().getClickableElementClickableEnumEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClickableEnum();

            state._fsp--;

             after(grammarAccess.getClickAccess().getClickableElementClickableEnumEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__ClickableElementAssignment_1"


    // $ANTLR start "rule__Click__ParametersAssignment_2"
    // InternalEDdsl.g:2402:1: rule__Click__ParametersAssignment_2 : ( ruleParameters ) ;
    public final void rule__Click__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2406:1: ( ( ruleParameters ) )
            // InternalEDdsl.g:2407:2: ( ruleParameters )
            {
            // InternalEDdsl.g:2407:2: ( ruleParameters )
            // InternalEDdsl.g:2408:3: ruleParameters
            {
             before(grammarAccess.getClickAccess().getParametersParametersParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameters();

            state._fsp--;

             after(grammarAccess.getClickAccess().getParametersParametersParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__ParametersAssignment_2"


    // $ANTLR start "rule__Operation__ActionAssignment_0"
    // InternalEDdsl.g:2417:1: rule__Operation__ActionAssignment_0 : ( ruleActionNoReturn ) ;
    public final void rule__Operation__ActionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2421:1: ( ( ruleActionNoReturn ) )
            // InternalEDdsl.g:2422:2: ( ruleActionNoReturn )
            {
            // InternalEDdsl.g:2422:2: ( ruleActionNoReturn )
            // InternalEDdsl.g:2423:3: ruleActionNoReturn
            {
             before(grammarAccess.getOperationAccess().getActionActionNoReturnParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleActionNoReturn();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getActionActionNoReturnParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ActionAssignment_0"


    // $ANTLR start "rule__Parameter__ParameterAssignment_1"
    // InternalEDdsl.g:2432:1: rule__Parameter__ParameterAssignment_1 : ( ( rule__Parameter__ParameterAlternatives_1_0 ) ) ;
    public final void rule__Parameter__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2436:1: ( ( ( rule__Parameter__ParameterAlternatives_1_0 ) ) )
            // InternalEDdsl.g:2437:2: ( ( rule__Parameter__ParameterAlternatives_1_0 ) )
            {
            // InternalEDdsl.g:2437:2: ( ( rule__Parameter__ParameterAlternatives_1_0 ) )
            // InternalEDdsl.g:2438:3: ( rule__Parameter__ParameterAlternatives_1_0 )
            {
             before(grammarAccess.getParameterAccess().getParameterAlternatives_1_0()); 
            // InternalEDdsl.g:2439:3: ( rule__Parameter__ParameterAlternatives_1_0 )
            // InternalEDdsl.g:2439:4: rule__Parameter__ParameterAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__ParameterAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getParameterAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ParameterAssignment_1"


    // $ANTLR start "rule__Parameters__ParametersAssignment"
    // InternalEDdsl.g:2447:1: rule__Parameters__ParametersAssignment : ( ruleParameter ) ;
    public final void rule__Parameters__ParametersAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2451:1: ( ( ruleParameter ) )
            // InternalEDdsl.g:2452:2: ( ruleParameter )
            {
            // InternalEDdsl.g:2452:2: ( ruleParameter )
            // InternalEDdsl.g:2453:3: ruleParameter
            {
             before(grammarAccess.getParametersAccess().getParametersParameterParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParametersAccess().getParametersParameterParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__ParametersAssignment"


    // $ANTLR start "rule__Read__ReadableElementAssignment_1"
    // InternalEDdsl.g:2462:1: rule__Read__ReadableElementAssignment_1 : ( ruleReadableEnum ) ;
    public final void rule__Read__ReadableElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2466:1: ( ( ruleReadableEnum ) )
            // InternalEDdsl.g:2467:2: ( ruleReadableEnum )
            {
            // InternalEDdsl.g:2467:2: ( ruleReadableEnum )
            // InternalEDdsl.g:2468:3: ruleReadableEnum
            {
             before(grammarAccess.getReadAccess().getReadableElementReadableEnumEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReadableEnum();

            state._fsp--;

             after(grammarAccess.getReadAccess().getReadableElementReadableEnumEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__ReadableElementAssignment_1"


    // $ANTLR start "rule__Read__ParametersAssignment_2"
    // InternalEDdsl.g:2477:1: rule__Read__ParametersAssignment_2 : ( ruleParameters ) ;
    public final void rule__Read__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2481:1: ( ( ruleParameters ) )
            // InternalEDdsl.g:2482:2: ( ruleParameters )
            {
            // InternalEDdsl.g:2482:2: ( ruleParameters )
            // InternalEDdsl.g:2483:3: ruleParameters
            {
             before(grammarAccess.getReadAccess().getParametersParametersParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameters();

            state._fsp--;

             after(grammarAccess.getReadAccess().getParametersParametersParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__ParametersAssignment_2"


    // $ANTLR start "rule__Series__BrowserAssignment_1"
    // InternalEDdsl.g:2492:1: rule__Series__BrowserAssignment_1 : ( ruleBrowserEnum ) ;
    public final void rule__Series__BrowserAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2496:1: ( ( ruleBrowserEnum ) )
            // InternalEDdsl.g:2497:2: ( ruleBrowserEnum )
            {
            // InternalEDdsl.g:2497:2: ( ruleBrowserEnum )
            // InternalEDdsl.g:2498:3: ruleBrowserEnum
            {
             before(grammarAccess.getSeriesAccess().getBrowserBrowserEnumEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBrowserEnum();

            state._fsp--;

             after(grammarAccess.getSeriesAccess().getBrowserBrowserEnumEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Series__BrowserAssignment_1"


    // $ANTLR start "rule__Series__ExpectedReturnAssignment_2"
    // InternalEDdsl.g:2507:1: rule__Series__ExpectedReturnAssignment_2 : ( ruleBoolEnum ) ;
    public final void rule__Series__ExpectedReturnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2511:1: ( ( ruleBoolEnum ) )
            // InternalEDdsl.g:2512:2: ( ruleBoolEnum )
            {
            // InternalEDdsl.g:2512:2: ( ruleBoolEnum )
            // InternalEDdsl.g:2513:3: ruleBoolEnum
            {
             before(grammarAccess.getSeriesAccess().getExpectedReturnBoolEnumEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBoolEnum();

            state._fsp--;

             after(grammarAccess.getSeriesAccess().getExpectedReturnBoolEnumEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Series__ExpectedReturnAssignment_2"


    // $ANTLR start "rule__Series__OperationsAssignment_4"
    // InternalEDdsl.g:2522:1: rule__Series__OperationsAssignment_4 : ( ruleOperation ) ;
    public final void rule__Series__OperationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2526:1: ( ( ruleOperation ) )
            // InternalEDdsl.g:2527:2: ( ruleOperation )
            {
            // InternalEDdsl.g:2527:2: ( ruleOperation )
            // InternalEDdsl.g:2528:3: ruleOperation
            {
             before(grammarAccess.getSeriesAccess().getOperationsOperationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getSeriesAccess().getOperationsOperationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Series__OperationsAssignment_4"


    // $ANTLR start "rule__Type__TextToTypeAssignment_1"
    // InternalEDdsl.g:2537:1: rule__Type__TextToTypeAssignment_1 : ( ruleVal ) ;
    public final void rule__Type__TextToTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2541:1: ( ( ruleVal ) )
            // InternalEDdsl.g:2542:2: ( ruleVal )
            {
            // InternalEDdsl.g:2542:2: ( ruleVal )
            // InternalEDdsl.g:2543:3: ruleVal
            {
             before(grammarAccess.getTypeAccess().getTextToTypeValParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVal();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getTextToTypeValParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TextToTypeAssignment_1"


    // $ANTLR start "rule__Type__ParametersAssignment_2"
    // InternalEDdsl.g:2552:1: rule__Type__ParametersAssignment_2 : ( ruleParameters ) ;
    public final void rule__Type__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2556:1: ( ( ruleParameters ) )
            // InternalEDdsl.g:2557:2: ( ruleParameters )
            {
            // InternalEDdsl.g:2557:2: ( ruleParameters )
            // InternalEDdsl.g:2558:3: ruleParameters
            {
             before(grammarAccess.getTypeAccess().getParametersParametersParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameters();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getParametersParametersParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__ParametersAssignment_2"


    // $ANTLR start "rule__Val__BoolAssignment_2"
    // InternalEDdsl.g:2567:1: rule__Val__BoolAssignment_2 : ( ruleBoolEnum ) ;
    public final void rule__Val__BoolAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2571:1: ( ( ruleBoolEnum ) )
            // InternalEDdsl.g:2572:2: ( ruleBoolEnum )
            {
            // InternalEDdsl.g:2572:2: ( ruleBoolEnum )
            // InternalEDdsl.g:2573:3: ruleBoolEnum
            {
             before(grammarAccess.getValAccess().getBoolBoolEnumEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBoolEnum();

            state._fsp--;

             after(grammarAccess.getValAccess().getBoolBoolEnumEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Val__BoolAssignment_2"


    // $ANTLR start "rule__Value__ValueAssignment_1"
    // InternalEDdsl.g:2582:1: rule__Value__ValueAssignment_1 : ( ruleVal ) ;
    public final void rule__Value__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2586:1: ( ( ruleVal ) )
            // InternalEDdsl.g:2587:2: ( ruleVal )
            {
            // InternalEDdsl.g:2587:2: ( ruleVal )
            // InternalEDdsl.g:2588:3: ruleVal
            {
             before(grammarAccess.getValueAccess().getValueValParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVal();

            state._fsp--;

             after(grammarAccess.getValueAccess().getValueValParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__ValueAssignment_1"


    // $ANTLR start "rule__VariableGet__VarNameAssignment"
    // InternalEDdsl.g:2597:1: rule__VariableGet__VarNameAssignment : ( RULE_ID ) ;
    public final void rule__VariableGet__VarNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2601:1: ( ( RULE_ID ) )
            // InternalEDdsl.g:2602:2: ( RULE_ID )
            {
            // InternalEDdsl.g:2602:2: ( RULE_ID )
            // InternalEDdsl.g:2603:3: RULE_ID
            {
             before(grammarAccess.getVariableGetAccess().getVarNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableGetAccess().getVarNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableGet__VarNameAssignment"


    // $ANTLR start "rule__VariableSet__VarNameAssignment_0"
    // InternalEDdsl.g:2612:1: rule__VariableSet__VarNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__VariableSet__VarNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2616:1: ( ( RULE_ID ) )
            // InternalEDdsl.g:2617:2: ( RULE_ID )
            {
            // InternalEDdsl.g:2617:2: ( RULE_ID )
            // InternalEDdsl.g:2618:3: RULE_ID
            {
             before(grammarAccess.getVariableSetAccess().getVarNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableSetAccess().getVarNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableSet__VarNameAssignment_0"


    // $ANTLR start "rule__VariableSet__ActionAssignment_2"
    // InternalEDdsl.g:2627:1: rule__VariableSet__ActionAssignment_2 : ( ruleActionReturn ) ;
    public final void rule__VariableSet__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEDdsl.g:2631:1: ( ( ruleActionReturn ) )
            // InternalEDdsl.g:2632:2: ( ruleActionReturn )
            {
            // InternalEDdsl.g:2632:2: ( ruleActionReturn )
            // InternalEDdsl.g:2633:3: ruleActionReturn
            {
             before(grammarAccess.getVariableSetAccess().getActionActionReturnParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleActionReturn();

            state._fsp--;

             after(grammarAccess.getVariableSetAccess().getActionActionReturnParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableSet__ActionAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000004134000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000042038000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001830L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000007C0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001480000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000008008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004134000022L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000010000000000L});

}