package org.xtext.selenium.eliedenis.parser.antlr.internal;

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
import org.xtext.selenium.eliedenis.services.EDdslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEDdslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'all'", "'attribute'", "'browse'", "'check'", "'comparison'", "'count'", "'click'", "';'", "'('", "')'", "'read'", "'open'", "'type'", "'value'", "'='", "'true'", "'false'", "'firefox'", "'ie'", "'button'", "'link'", "'input'", "'=='", "'>'", "'<'", "'>='", "'<='", "'contain'", "'enabled'", "'h1'"
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

        public InternalEDdslParser(TokenStream input, EDdslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Test";
       	}

       	@Override
       	protected EDdslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTest"
    // InternalEDdsl.g:65:1: entryRuleTest returns [EObject current=null] : iv_ruleTest= ruleTest EOF ;
    public final EObject entryRuleTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTest = null;


        try {
            // InternalEDdsl.g:65:45: (iv_ruleTest= ruleTest EOF )
            // InternalEDdsl.g:66:2: iv_ruleTest= ruleTest EOF
            {
             newCompositeNode(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTest=ruleTest();

            state._fsp--;

             current =iv_ruleTest; 
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
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // InternalEDdsl.g:72:1: ruleTest returns [EObject current=null] : ( (lv_tests_0_0= ruleSeries ) ) ;
    public final EObject ruleTest() throws RecognitionException {
        EObject current = null;

        EObject lv_tests_0_0 = null;



        	enterRule();

        try {
            // InternalEDdsl.g:78:2: ( ( (lv_tests_0_0= ruleSeries ) ) )
            // InternalEDdsl.g:79:2: ( (lv_tests_0_0= ruleSeries ) )
            {
            // InternalEDdsl.g:79:2: ( (lv_tests_0_0= ruleSeries ) )
            // InternalEDdsl.g:80:3: (lv_tests_0_0= ruleSeries )
            {
            // InternalEDdsl.g:80:3: (lv_tests_0_0= ruleSeries )
            // InternalEDdsl.g:81:4: lv_tests_0_0= ruleSeries
            {

            				newCompositeNode(grammarAccess.getTestAccess().getTestsSeriesParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_tests_0_0=ruleSeries();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getTestRule());
            				}
            				set(
            					current,
            					"tests",
            					lv_tests_0_0,
            					"org.xtext.selenium.eliedenis.EDdsl.Series");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleActionNoReturn"
    // InternalEDdsl.g:101:1: entryRuleActionNoReturn returns [EObject current=null] : iv_ruleActionNoReturn= ruleActionNoReturn EOF ;
    public final EObject entryRuleActionNoReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionNoReturn = null;


        try {
            // InternalEDdsl.g:101:55: (iv_ruleActionNoReturn= ruleActionNoReturn EOF )
            // InternalEDdsl.g:102:2: iv_ruleActionNoReturn= ruleActionNoReturn EOF
            {
             newCompositeNode(grammarAccess.getActionNoReturnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionNoReturn=ruleActionNoReturn();

            state._fsp--;

             current =iv_ruleActionNoReturn; 
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
    // $ANTLR end "entryRuleActionNoReturn"


    // $ANTLR start "ruleActionNoReturn"
    // InternalEDdsl.g:108:1: ruleActionNoReturn returns [EObject current=null] : (this_All_0= ruleAll | this_Browse_1= ruleBrowse | this_Check_2= ruleCheck | this_Click_3= ruleClick | this_Type_4= ruleType | this_VariableSet_5= ruleVariableSet ) ;
    public final EObject ruleActionNoReturn() throws RecognitionException {
        EObject current = null;

        EObject this_All_0 = null;

        EObject this_Browse_1 = null;

        EObject this_Check_2 = null;

        EObject this_Click_3 = null;

        EObject this_Type_4 = null;

        EObject this_VariableSet_5 = null;



        	enterRule();

        try {
            // InternalEDdsl.g:114:2: ( (this_All_0= ruleAll | this_Browse_1= ruleBrowse | this_Check_2= ruleCheck | this_Click_3= ruleClick | this_Type_4= ruleType | this_VariableSet_5= ruleVariableSet ) )
            // InternalEDdsl.g:115:2: (this_All_0= ruleAll | this_Browse_1= ruleBrowse | this_Check_2= ruleCheck | this_Click_3= ruleClick | this_Type_4= ruleType | this_VariableSet_5= ruleVariableSet )
            {
            // InternalEDdsl.g:115:2: (this_All_0= ruleAll | this_Browse_1= ruleBrowse | this_Check_2= ruleCheck | this_Click_3= ruleClick | this_Type_4= ruleType | this_VariableSet_5= ruleVariableSet )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 13:
                {
                alt1=2;
                }
                break;
            case 14:
                {
                alt1=3;
                }
                break;
            case 17:
                {
                alt1=4;
                }
                break;
            case 23:
                {
                alt1=5;
                }
                break;
            case RULE_ID:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalEDdsl.g:116:3: this_All_0= ruleAll
                    {

                    			newCompositeNode(grammarAccess.getActionNoReturnAccess().getAllParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_All_0=ruleAll();

                    state._fsp--;


                    			current = this_All_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEDdsl.g:125:3: this_Browse_1= ruleBrowse
                    {

                    			newCompositeNode(grammarAccess.getActionNoReturnAccess().getBrowseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Browse_1=ruleBrowse();

                    state._fsp--;


                    			current = this_Browse_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalEDdsl.g:134:3: this_Check_2= ruleCheck
                    {

                    			newCompositeNode(grammarAccess.getActionNoReturnAccess().getCheckParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Check_2=ruleCheck();

                    state._fsp--;


                    			current = this_Check_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalEDdsl.g:143:3: this_Click_3= ruleClick
                    {

                    			newCompositeNode(grammarAccess.getActionNoReturnAccess().getClickParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Click_3=ruleClick();

                    state._fsp--;


                    			current = this_Click_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalEDdsl.g:152:3: this_Type_4= ruleType
                    {

                    			newCompositeNode(grammarAccess.getActionNoReturnAccess().getTypeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Type_4=ruleType();

                    state._fsp--;


                    			current = this_Type_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalEDdsl.g:161:3: this_VariableSet_5= ruleVariableSet
                    {

                    			newCompositeNode(grammarAccess.getActionNoReturnAccess().getVariableSetParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableSet_5=ruleVariableSet();

                    state._fsp--;


                    			current = this_VariableSet_5;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleActionNoReturn"


    // $ANTLR start "entryRuleActionReturn"
    // InternalEDdsl.g:173:1: entryRuleActionReturn returns [EObject current=null] : iv_ruleActionReturn= ruleActionReturn EOF ;
    public final EObject entryRuleActionReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionReturn = null;


        try {
            // InternalEDdsl.g:173:53: (iv_ruleActionReturn= ruleActionReturn EOF )
            // InternalEDdsl.g:174:2: iv_ruleActionReturn= ruleActionReturn EOF
            {
             newCompositeNode(grammarAccess.getActionReturnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionReturn=ruleActionReturn();

            state._fsp--;

             current =iv_ruleActionReturn; 
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
    // $ANTLR end "entryRuleActionReturn"


    // $ANTLR start "ruleActionReturn"
    // InternalEDdsl.g:180:1: ruleActionReturn returns [EObject current=null] : (this_Count_0= ruleCount | this_Read_1= ruleRead ) ;
    public final EObject ruleActionReturn() throws RecognitionException {
        EObject current = null;

        EObject this_Count_0 = null;

        EObject this_Read_1 = null;



        	enterRule();

        try {
            // InternalEDdsl.g:186:2: ( (this_Count_0= ruleCount | this_Read_1= ruleRead ) )
            // InternalEDdsl.g:187:2: (this_Count_0= ruleCount | this_Read_1= ruleRead )
            {
            // InternalEDdsl.g:187:2: (this_Count_0= ruleCount | this_Read_1= ruleRead )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==21) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalEDdsl.g:188:3: this_Count_0= ruleCount
                    {

                    			newCompositeNode(grammarAccess.getActionReturnAccess().getCountParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Count_0=ruleCount();

                    state._fsp--;


                    			current = this_Count_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEDdsl.g:197:3: this_Read_1= ruleRead
                    {

                    			newCompositeNode(grammarAccess.getActionReturnAccess().getReadParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Read_1=ruleRead();

                    state._fsp--;


                    			current = this_Read_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleActionReturn"


    // $ANTLR start "entryRuleActionBoolReturn"
    // InternalEDdsl.g:209:1: entryRuleActionBoolReturn returns [EObject current=null] : iv_ruleActionBoolReturn= ruleActionBoolReturn EOF ;
    public final EObject entryRuleActionBoolReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionBoolReturn = null;


        try {
            // InternalEDdsl.g:209:57: (iv_ruleActionBoolReturn= ruleActionBoolReturn EOF )
            // InternalEDdsl.g:210:2: iv_ruleActionBoolReturn= ruleActionBoolReturn EOF
            {
             newCompositeNode(grammarAccess.getActionBoolReturnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionBoolReturn=ruleActionBoolReturn();

            state._fsp--;

             current =iv_ruleActionBoolReturn; 
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
    // $ANTLR end "entryRuleActionBoolReturn"


    // $ANTLR start "ruleActionBoolReturn"
    // InternalEDdsl.g:216:1: ruleActionBoolReturn returns [EObject current=null] : (this_Comparison_0= ruleComparison | this_Constraint_1= ruleConstraint ) ;
    public final EObject ruleActionBoolReturn() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;

        EObject this_Constraint_1 = null;



        	enterRule();

        try {
            // InternalEDdsl.g:222:2: ( (this_Comparison_0= ruleComparison | this_Constraint_1= ruleConstraint ) )
            // InternalEDdsl.g:223:2: (this_Comparison_0= ruleComparison | this_Constraint_1= ruleConstraint )
            {
            // InternalEDdsl.g:223:2: (this_Comparison_0= ruleComparison | this_Constraint_1= ruleConstraint )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=30 && LA3_0<=32)||LA3_0==40) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalEDdsl.g:224:3: this_Comparison_0= ruleComparison
                    {

                    			newCompositeNode(grammarAccess.getActionBoolReturnAccess().getComparisonParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Comparison_0=ruleComparison();

                    state._fsp--;


                    			current = this_Comparison_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEDdsl.g:233:3: this_Constraint_1= ruleConstraint
                    {

                    			newCompositeNode(grammarAccess.getActionBoolReturnAccess().getConstraintParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Constraint_1=ruleConstraint();

                    state._fsp--;


                    			current = this_Constraint_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleActionBoolReturn"


    // $ANTLR start "entryRuleAll"
    // InternalEDdsl.g:245:1: entryRuleAll returns [EObject current=null] : iv_ruleAll= ruleAll EOF ;
    public final EObject entryRuleAll() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAll = null;


        try {
            // InternalEDdsl.g:245:44: (iv_ruleAll= ruleAll EOF )
            // InternalEDdsl.g:246:2: iv_ruleAll= ruleAll EOF
            {
             newCompositeNode(grammarAccess.getAllRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAll=ruleAll();

            state._fsp--;

             current =iv_ruleAll; 
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
    // $ANTLR end "entryRuleAll"


    // $ANTLR start "ruleAll"
    // InternalEDdsl.g:252:1: ruleAll returns [EObject current=null] : (otherlv_0= 'all' ( (lv_operation_1_0= ruleActionNoReturn ) ) ) ;
    public final EObject ruleAll() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_operation_1_0 = null;



        	enterRule();

        try {
            // InternalEDdsl.g:258:2: ( (otherlv_0= 'all' ( (lv_operation_1_0= ruleActionNoReturn ) ) ) )
            // InternalEDdsl.g:259:2: (otherlv_0= 'all' ( (lv_operation_1_0= ruleActionNoReturn ) ) )
            {
            // InternalEDdsl.g:259:2: (otherlv_0= 'all' ( (lv_operation_1_0= ruleActionNoReturn ) ) )
            // InternalEDdsl.g:260:3: otherlv_0= 'all' ( (lv_operation_1_0= ruleActionNoReturn ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAllAccess().getAllKeyword_0());
            		
            // InternalEDdsl.g:264:3: ( (lv_operation_1_0= ruleActionNoReturn ) )
            // InternalEDdsl.g:265:4: (lv_operation_1_0= ruleActionNoReturn )
            {
            // InternalEDdsl.g:265:4: (lv_operation_1_0= ruleActionNoReturn )
            // InternalEDdsl.g:266:5: lv_operation_1_0= ruleActionNoReturn
            {

            					newCompositeNode(grammarAccess.getAllAccess().getOperationActionNoReturnParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_operation_1_0=ruleActionNoReturn();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAllRule());
            					}
            					set(
            						current,
            						"operation",
            						lv_operation_1_0,
            						"org.xtext.selenium.eliedenis.EDdsl.ActionNoReturn");
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
    // $ANTLR end "ruleAll"


    // $ANTLR start "entryRuleAttribute"
    // InternalEDdsl.g:287:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalEDdsl.g:287:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalEDdsl.g:288:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalEDdsl.g:294:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_attributeName_1_0= RULE_STRING ) ) ( (lv_attributeValue_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_attributeName_1_0=null;
        Token lv_attributeValue_2_0=null;


        	enterRule();

        try {
            // InternalEDdsl.g:300:2: ( (otherlv_0= 'attribute' ( (lv_attributeName_1_0= RULE_STRING ) ) ( (lv_attributeValue_2_0= RULE_STRING ) ) ) )
            // InternalEDdsl.g:301:2: (otherlv_0= 'attribute' ( (lv_attributeName_1_0= RULE_STRING ) ) ( (lv_attributeValue_2_0= RULE_STRING ) ) )
            {
            // InternalEDdsl.g:301:2: (otherlv_0= 'attribute' ( (lv_attributeName_1_0= RULE_STRING ) ) ( (lv_attributeValue_2_0= RULE_STRING ) ) )
            // InternalEDdsl.g:302:3: otherlv_0= 'attribute' ( (lv_attributeName_1_0= RULE_STRING ) ) ( (lv_attributeValue_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalEDdsl.g:306:3: ( (lv_attributeName_1_0= RULE_STRING ) )
            // InternalEDdsl.g:307:4: (lv_attributeName_1_0= RULE_STRING )
            {
            // InternalEDdsl.g:307:4: (lv_attributeName_1_0= RULE_STRING )
            // InternalEDdsl.g:308:5: lv_attributeName_1_0= RULE_STRING
            {
            lv_attributeName_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_attributeName_1_0, grammarAccess.getAttributeAccess().getAttributeNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"attributeName",
            						lv_attributeName_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalEDdsl.g:324:3: ( (lv_attributeValue_2_0= RULE_STRING ) )
            // InternalEDdsl.g:325:4: (lv_attributeValue_2_0= RULE_STRING )
            {
            // InternalEDdsl.g:325:4: (lv_attributeValue_2_0= RULE_STRING )
            // InternalEDdsl.g:326:5: lv_attributeValue_2_0= RULE_STRING
            {
            lv_attributeValue_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_attributeValue_2_0, grammarAccess.getAttributeAccess().getAttributeValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"attributeValue",
            						lv_attributeValue_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleBrowse"
    // InternalEDdsl.g:346:1: entryRuleBrowse returns [EObject current=null] : iv_ruleBrowse= ruleBrowse EOF ;
    public final EObject entryRuleBrowse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrowse = null;


        try {
            // InternalEDdsl.g:346:47: (iv_ruleBrowse= ruleBrowse EOF )
            // InternalEDdsl.g:347:2: iv_ruleBrowse= ruleBrowse EOF
            {
             newCompositeNode(grammarAccess.getBrowseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBrowse=ruleBrowse();

            state._fsp--;

             current =iv_ruleBrowse; 
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
    // $ANTLR end "entryRuleBrowse"


    // $ANTLR start "ruleBrowse"
    // InternalEDdsl.g:353:1: ruleBrowse returns [EObject current=null] : (otherlv_0= 'browse' ( (lv_url_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleBrowse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;


        	enterRule();

        try {
            // InternalEDdsl.g:359:2: ( (otherlv_0= 'browse' ( (lv_url_1_0= RULE_STRING ) ) ) )
            // InternalEDdsl.g:360:2: (otherlv_0= 'browse' ( (lv_url_1_0= RULE_STRING ) ) )
            {
            // InternalEDdsl.g:360:2: (otherlv_0= 'browse' ( (lv_url_1_0= RULE_STRING ) ) )
            // InternalEDdsl.g:361:3: otherlv_0= 'browse' ( (lv_url_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBrowseAccess().getBrowseKeyword_0());
            		
            // InternalEDdsl.g:365:3: ( (lv_url_1_0= RULE_STRING ) )
            // InternalEDdsl.g:366:4: (lv_url_1_0= RULE_STRING )
            {
            // InternalEDdsl.g:366:4: (lv_url_1_0= RULE_STRING )
            // InternalEDdsl.g:367:5: lv_url_1_0= RULE_STRING
            {
            lv_url_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_url_1_0, grammarAccess.getBrowseAccess().getUrlSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBrowseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleBrowse"


    // $ANTLR start "entryRuleCheck"
    // InternalEDdsl.g:387:1: entryRuleCheck returns [EObject current=null] : iv_ruleCheck= ruleCheck EOF ;
    public final EObject entryRuleCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheck = null;


        try {
            // InternalEDdsl.g:387:46: (iv_ruleCheck= ruleCheck EOF )
            // InternalEDdsl.g:388:2: iv_ruleCheck= ruleCheck EOF
            {
             newCompositeNode(grammarAccess.getCheckRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheck=ruleCheck();

            state._fsp--;

             current =iv_ruleCheck; 
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
    // $ANTLR end "entryRuleCheck"


    // $ANTLR start "ruleCheck"
    // InternalEDdsl.g:394:1: ruleCheck returns [EObject current=null] : (otherlv_0= 'check' ( (lv_action_1_0= ruleActionBoolReturn ) ) ) ;
    public final EObject ruleCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_action_1_0 = null;



        	enterRule();

        try {
            // InternalEDdsl.g:400:2: ( (otherlv_0= 'check' ( (lv_action_1_0= ruleActionBoolReturn ) ) ) )
            // InternalEDdsl.g:401:2: (otherlv_0= 'check' ( (lv_action_1_0= ruleActionBoolReturn ) ) )
            {
            // InternalEDdsl.g:401:2: (otherlv_0= 'check' ( (lv_action_1_0= ruleActionBoolReturn ) ) )
            // InternalEDdsl.g:402:3: otherlv_0= 'check' ( (lv_action_1_0= ruleActionBoolReturn ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCheckAccess().getCheckKeyword_0());
            		
            // InternalEDdsl.g:406:3: ( (lv_action_1_0= ruleActionBoolReturn ) )
            // InternalEDdsl.g:407:4: (lv_action_1_0= ruleActionBoolReturn )
            {
            // InternalEDdsl.g:407:4: (lv_action_1_0= ruleActionBoolReturn )
            // InternalEDdsl.g:408:5: lv_action_1_0= ruleActionBoolReturn
            {

            					newCompositeNode(grammarAccess.getCheckAccess().getActionActionBoolReturnParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_action_1_0=ruleActionBoolReturn();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheckRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_1_0,
            						"org.xtext.selenium.eliedenis.EDdsl.ActionBoolReturn");
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
    // $ANTLR end "ruleCheck"


    // $ANTLR start "entryRuleComparison"
    // InternalEDdsl.g:429:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalEDdsl.g:429:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalEDdsl.g:430:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalEDdsl.g:436:1: ruleComparison returns [EObject current=null] : (otherlv_0= 'comparison' ( (lv_firstVal_1_0= ruleVal ) ) ( (lv_comparatorOperator_2_0= ruleComparisonOperatorEnum ) ) ( (lv_secondVal_3_0= ruleVal ) ) ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_firstVal_1_0 = null;

        Enumerator lv_comparatorOperator_2_0 = null;

        EObject lv_secondVal_3_0 = null;



        	enterRule();

        try {
            // InternalEDdsl.g:442:2: ( (otherlv_0= 'comparison' ( (lv_firstVal_1_0= ruleVal ) ) ( (lv_comparatorOperator_2_0= ruleComparisonOperatorEnum ) ) ( (lv_secondVal_3_0= ruleVal ) ) ) )
            // InternalEDdsl.g:443:2: (otherlv_0= 'comparison' ( (lv_firstVal_1_0= ruleVal ) ) ( (lv_comparatorOperator_2_0= ruleComparisonOperatorEnum ) ) ( (lv_secondVal_3_0= ruleVal ) ) )
            {
            // InternalEDdsl.g:443:2: (otherlv_0= 'comparison' ( (lv_firstVal_1_0= ruleVal ) ) ( (lv_comparatorOperator_2_0= ruleComparisonOperatorEnum ) ) ( (lv_secondVal_3_0= ruleVal ) ) )
            // InternalEDdsl.g:444:3: otherlv_0= 'comparison' ( (lv_firstVal_1_0= ruleVal ) ) ( (lv_comparatorOperator_2_0= ruleComparisonOperatorEnum ) ) ( (lv_secondVal_3_0= ruleVal ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getComparisonAccess().getComparisonKeyword_0());
            		
            // InternalEDdsl.g:448:3: ( (lv_firstVal_1_0= ruleVal ) )
            // InternalEDdsl.g:449:4: (lv_firstVal_1_0= ruleVal )
            {
            // InternalEDdsl.g:449:4: (lv_firstVal_1_0= ruleVal )
            // InternalEDdsl.g:450:5: lv_firstVal_1_0= ruleVal
            {

            					newCompositeNode(grammarAccess.getComparisonAccess().getFirstValValParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_firstVal_1_0=ruleVal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComparisonRule());
            					}
            					set(
            						current,
            						"firstVal",
            						lv_firstVal_1_0,
            						"org.xtext.selenium.eliedenis.EDdsl.Val");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEDdsl.g:467:3: ( (lv_comparatorOperator_2_0= ruleComparisonOperatorEnum ) )
            // InternalEDdsl.g:468:4: (lv_comparatorOperator_2_0= ruleComparisonOperatorEnum )
            {
            // InternalEDdsl.g:468:4: (lv_comparatorOperator_2_0= ruleComparisonOperatorEnum )
            // InternalEDdsl.g:469:5: lv_comparatorOperator_2_0= ruleComparisonOperatorEnum
            {

            					newCompositeNode(grammarAccess.getComparisonAccess().getComparatorOperatorComparisonOperatorEnumEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_comparatorOperator_2_0=ruleComparisonOperatorEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComparisonRule());
            					}
            					set(
            						current,
            						"comparatorOperator",
            						lv_comparatorOperator_2_0,
            						"org.xtext.selenium.eliedenis.EDdsl.ComparisonOperatorEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEDdsl.g:486:3: ( (lv_secondVal_3_0= ruleVal ) )
            // InternalEDdsl.g:487:4: (lv_secondVal_3_0= ruleVal )
            {
            // InternalEDdsl.g:487:4: (lv_secondVal_3_0= ruleVal )
            // InternalEDdsl.g:488:5: lv_secondVal_3_0= ruleVal
            {

            					newCompositeNode(grammarAccess.getComparisonAccess().getSecondValValParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_secondVal_3_0=ruleVal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComparisonRule());
            					}
            					set(
            						current,
            						"secondVal",
            						lv_secondVal_3_0,
            						"org.xtext.selenium.eliedenis.EDdsl.Val");
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleConstraint"
    // InternalEDdsl.g:509:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalEDdsl.g:509:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalEDdsl.g:510:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalEDdsl.g:516:1: ruleConstraint returns [EObject current=null] : ( ( (lv_readableElement_0_0= ruleReadableEnum ) ) ( (lv_constraintType_1_0= ruleConstraintTypeEnum ) ) ( (lv_expectedVal_2_0= ruleVal ) ) ( (lv_parameters_3_0= ruleParameters ) ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Enumerator lv_readableElement_0_0 = null;

        Enumerator lv_constraintType_1_0 = null;

        EObject lv_expectedVal_2_0 = null;

        EObject lv_parameters_3_0 = null;



        	enterRule();

        try {
            // InternalEDdsl.g:522:2: ( ( ( (lv_readableElement_0_0= ruleReadableEnum ) ) ( (lv_constraintType_1_0= ruleConstraintTypeEnum ) ) ( (lv_expectedVal_2_0= ruleVal ) ) ( (lv_parameters_3_0= ruleParameters ) ) ) )
            // InternalEDdsl.g:523:2: ( ( (lv_readableElement_0_0= ruleReadableEnum ) ) ( (lv_constraintType_1_0= ruleConstraintTypeEnum ) ) ( (lv_expectedVal_2_0= ruleVal ) ) ( (lv_parameters_3_0= ruleParameters ) ) )
            {
            // InternalEDdsl.g:523:2: ( ( (lv_readableElement_0_0= ruleReadableEnum ) ) ( (lv_constraintType_1_0= ruleConstraintTypeEnum ) ) ( (lv_expectedVal_2_0= ruleVal ) ) ( (lv_parameters_3_0= ruleParameters ) ) )
            // InternalEDdsl.g:524:3: ( (lv_readableElement_0_0= ruleReadableEnum ) ) ( (lv_constraintType_1_0= ruleConstraintTypeEnum ) ) ( (lv_expectedVal_2_0= ruleVal ) ) ( (lv_parameters_3_0= ruleParameters ) )
            {
            // InternalEDdsl.g:524:3: ( (lv_readableElement_0_0= ruleReadableEnum ) )
            // InternalEDdsl.g:525:4: (lv_readableElement_0_0= ruleReadableEnum )
            {
            // InternalEDdsl.g:525:4: (lv_readableElement_0_0= ruleReadableEnum )
            // InternalEDdsl.g:526:5: lv_readableElement_0_0= ruleReadableEnum
            {

            					newCompositeNode(grammarAccess.getConstraintAccess().getReadableElementReadableEnumEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_readableElement_0_0=ruleReadableEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintRule());
            					}
            					set(
            						current,
            						"readableElement",
            						lv_readableElement_0_0,
            						"org.xtext.selenium.eliedenis.EDdsl.ReadableEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEDdsl.g:543:3: ( (lv_constraintType_1_0= ruleConstraintTypeEnum ) )
            // InternalEDdsl.g:544:4: (lv_constraintType_1_0= ruleConstraintTypeEnum )
            {
            // InternalEDdsl.g:544:4: (lv_constraintType_1_0= ruleConstraintTypeEnum )
            // InternalEDdsl.g:545:5: lv_constraintType_1_0= ruleConstraintTypeEnum
            {

            					newCompositeNode(grammarAccess.getConstraintAccess().getConstraintTypeConstraintTypeEnumEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_constraintType_1_0=ruleConstraintTypeEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintRule());
            					}
            					set(
            						current,
            						"constraintType",
            						lv_constraintType_1_0,
            						"org.xtext.selenium.eliedenis.EDdsl.ConstraintTypeEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEDdsl.g:562:3: ( (lv_expectedVal_2_0= ruleVal ) )
            // InternalEDdsl.g:563:4: (lv_expectedVal_2_0= ruleVal )
            {
            // InternalEDdsl.g:563:4: (lv_expectedVal_2_0= ruleVal )
            // InternalEDdsl.g:564:5: lv_expectedVal_2_0= ruleVal
            {

            					newCompositeNode(grammarAccess.getConstraintAccess().getExpectedValValParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_expectedVal_2_0=ruleVal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintRule());
            					}
            					set(
            						current,
            						"expectedVal",
            						lv_expectedVal_2_0,
            						"org.xtext.selenium.eliedenis.EDdsl.Val");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEDdsl.g:581:3: ( (lv_parameters_3_0= ruleParameters ) )
            // InternalEDdsl.g:582:4: (lv_parameters_3_0= ruleParameters )
            {
            // InternalEDdsl.g:582:4: (lv_parameters_3_0= ruleParameters )
            // InternalEDdsl.g:583:5: lv_parameters_3_0= ruleParameters
            {

            					newCompositeNode(grammarAccess.getConstraintAccess().getParametersParametersParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_parameters_3_0=ruleParameters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintRule());
            					}
            					set(
            						current,
            						"parameters",
            						lv_parameters_3_0,
            						"org.xtext.selenium.eliedenis.EDdsl.Parameters");
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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleCount"
    // InternalEDdsl.g:604:1: entryRuleCount returns [EObject current=null] : iv_ruleCount= ruleCount EOF ;
    public final EObject entryRuleCount() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCount = null;


        try {
            // InternalEDdsl.g:604:46: (iv_ruleCount= ruleCount EOF )
            // InternalEDdsl.g:605:2: iv_ruleCount= ruleCount EOF
            {
             newCompositeNode(grammarAccess.getCountRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCount=ruleCount();

            state._fsp--;

             current =iv_ruleCount; 
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
    // $ANTLR end "entryRuleCount"


    // $ANTLR start "ruleCount"
    // InternalEDdsl.g:611:1: ruleCount returns [EObject current=null] : (otherlv_0= 'count' ( ( (lv_parameters_1_1= ruleParameters | lv_parameters_1_2= ruleActionReturn ) ) ) ) ;
    public final EObject ruleCount() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_parameters_1_1 = null;

        EObject lv_parameters_1_2 = null;



        	enterRule();

        try {
            // InternalEDdsl.g:617:2: ( (otherlv_0= 'count' ( ( (lv_parameters_1_1= ruleParameters | lv_parameters_1_2= ruleActionReturn ) ) ) ) )
            // InternalEDdsl.g:618:2: (otherlv_0= 'count' ( ( (lv_parameters_1_1= ruleParameters | lv_parameters_1_2= ruleActionReturn ) ) ) )
            {
            // InternalEDdsl.g:618:2: (otherlv_0= 'count' ( ( (lv_parameters_1_1= ruleParameters | lv_parameters_1_2= ruleActionReturn ) ) ) )
            // InternalEDdsl.g:619:3: otherlv_0= 'count' ( ( (lv_parameters_1_1= ruleParameters | lv_parameters_1_2= ruleActionReturn ) ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getCountAccess().getCountKeyword_0());
            		
            // InternalEDdsl.g:623:3: ( ( (lv_parameters_1_1= ruleParameters | lv_parameters_1_2= ruleActionReturn ) ) )
            // InternalEDdsl.g:624:4: ( (lv_parameters_1_1= ruleParameters | lv_parameters_1_2= ruleActionReturn ) )
            {
            // InternalEDdsl.g:624:4: ( (lv_parameters_1_1= ruleParameters | lv_parameters_1_2= ruleActionReturn ) )
            // InternalEDdsl.g:625:5: (lv_parameters_1_1= ruleParameters | lv_parameters_1_2= ruleActionReturn )
            {
            // InternalEDdsl.g:625:5: (lv_parameters_1_1= ruleParameters | lv_parameters_1_2= ruleActionReturn )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EOF||(LA4_0>=18 && LA4_0<=19)) ) {
                alt4=1;
            }
            else if ( (LA4_0==16||LA4_0==21) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalEDdsl.g:626:6: lv_parameters_1_1= ruleParameters
                    {

                    						newCompositeNode(grammarAccess.getCountAccess().getParametersParametersParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_parameters_1_1=ruleParameters();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCountRule());
                    						}
                    						set(
                    							current,
                    							"parameters",
                    							lv_parameters_1_1,
                    							"org.xtext.selenium.eliedenis.EDdsl.Parameters");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalEDdsl.g:642:6: lv_parameters_1_2= ruleActionReturn
                    {

                    						newCompositeNode(grammarAccess.getCountAccess().getParametersActionReturnParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_parameters_1_2=ruleActionReturn();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCountRule());
                    						}
                    						set(
                    							current,
                    							"parameters",
                    							lv_parameters_1_2,
                    							"org.xtext.selenium.eliedenis.EDdsl.ActionReturn");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

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
    // $ANTLR end "ruleCount"


    // $ANTLR start "entryRuleClick"
    // InternalEDdsl.g:664:1: entryRuleClick returns [EObject current=null] : iv_ruleClick= ruleClick EOF ;
    public final EObject entryRuleClick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClick = null;


        try {
            // InternalEDdsl.g:664:46: (iv_ruleClick= ruleClick EOF )
            // InternalEDdsl.g:665:2: iv_ruleClick= ruleClick EOF
            {
             newCompositeNode(grammarAccess.getClickRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClick=ruleClick();

            state._fsp--;

             current =iv_ruleClick; 
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
    // $ANTLR end "entryRuleClick"


    // $ANTLR start "ruleClick"
    // InternalEDdsl.g:671:1: ruleClick returns [EObject current=null] : (otherlv_0= 'click' ( (lv_clickableElement_1_0= ruleClickableEnum ) ) ( (lv_parameters_2_0= ruleParameters ) ) ) ;
    public final EObject ruleClick() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_clickableElement_1_0 = null;

        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalEDdsl.g:677:2: ( (otherlv_0= 'click' ( (lv_clickableElement_1_0= ruleClickableEnum ) ) ( (lv_parameters_2_0= ruleParameters ) ) ) )
            // InternalEDdsl.g:678:2: (otherlv_0= 'click' ( (lv_clickableElement_1_0= ruleClickableEnum ) ) ( (lv_parameters_2_0= ruleParameters ) ) )
            {
            // InternalEDdsl.g:678:2: (otherlv_0= 'click' ( (lv_clickableElement_1_0= ruleClickableEnum ) ) ( (lv_parameters_2_0= ruleParameters ) ) )
            // InternalEDdsl.g:679:3: otherlv_0= 'click' ( (lv_clickableElement_1_0= ruleClickableEnum ) ) ( (lv_parameters_2_0= ruleParameters ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getClickAccess().getClickKeyword_0());
            		
            // InternalEDdsl.g:683:3: ( (lv_clickableElement_1_0= ruleClickableEnum ) )
            // InternalEDdsl.g:684:4: (lv_clickableElement_1_0= ruleClickableEnum )
            {
            // InternalEDdsl.g:684:4: (lv_clickableElement_1_0= ruleClickableEnum )
            // InternalEDdsl.g:685:5: lv_clickableElement_1_0= ruleClickableEnum
            {

            					newCompositeNode(grammarAccess.getClickAccess().getClickableElementClickableEnumEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_clickableElement_1_0=ruleClickableEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClickRule());
            					}
            					set(
            						current,
            						"clickableElement",
            						lv_clickableElement_1_0,
            						"org.xtext.selenium.eliedenis.EDdsl.ClickableEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEDdsl.g:702:3: ( (lv_parameters_2_0= ruleParameters ) )
            // InternalEDdsl.g:703:4: (lv_parameters_2_0= ruleParameters )
            {
            // InternalEDdsl.g:703:4: (lv_parameters_2_0= ruleParameters )
            // InternalEDdsl.g:704:5: lv_parameters_2_0= ruleParameters
            {

            					newCompositeNode(grammarAccess.getClickAccess().getParametersParametersParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_parameters_2_0=ruleParameters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClickRule());
            					}
            					set(
            						current,
            						"parameters",
            						lv_parameters_2_0,
            						"org.xtext.selenium.eliedenis.EDdsl.Parameters");
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
    // $ANTLR end "ruleClick"


    // $ANTLR start "entryRuleOperation"
    // InternalEDdsl.g:725:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalEDdsl.g:725:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalEDdsl.g:726:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalEDdsl.g:732:1: ruleOperation returns [EObject current=null] : ( ( (lv_action_0_0= ruleActionNoReturn ) ) otherlv_1= ';' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_action_0_0 = null;



        	enterRule();

        try {
            // InternalEDdsl.g:738:2: ( ( ( (lv_action_0_0= ruleActionNoReturn ) ) otherlv_1= ';' ) )
            // InternalEDdsl.g:739:2: ( ( (lv_action_0_0= ruleActionNoReturn ) ) otherlv_1= ';' )
            {
            // InternalEDdsl.g:739:2: ( ( (lv_action_0_0= ruleActionNoReturn ) ) otherlv_1= ';' )
            // InternalEDdsl.g:740:3: ( (lv_action_0_0= ruleActionNoReturn ) ) otherlv_1= ';'
            {
            // InternalEDdsl.g:740:3: ( (lv_action_0_0= ruleActionNoReturn ) )
            // InternalEDdsl.g:741:4: (lv_action_0_0= ruleActionNoReturn )
            {
            // InternalEDdsl.g:741:4: (lv_action_0_0= ruleActionNoReturn )
            // InternalEDdsl.g:742:5: lv_action_0_0= ruleActionNoReturn
            {

            					newCompositeNode(grammarAccess.getOperationAccess().getActionActionNoReturnParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_action_0_0=ruleActionNoReturn();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_0_0,
            						"org.xtext.selenium.eliedenis.EDdsl.ActionNoReturn");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getSemicolonKeyword_1());
            		

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleParameter"
    // InternalEDdsl.g:767:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalEDdsl.g:767:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalEDdsl.g:768:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalEDdsl.g:774:1: ruleParameter returns [EObject current=null] : (otherlv_0= '(' ( ( (lv_parameter_1_1= ruleAttribute | lv_parameter_1_2= ruleValue ) ) ) otherlv_2= ')' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_parameter_1_1 = null;

        EObject lv_parameter_1_2 = null;



        	enterRule();

        try {
            // InternalEDdsl.g:780:2: ( (otherlv_0= '(' ( ( (lv_parameter_1_1= ruleAttribute | lv_parameter_1_2= ruleValue ) ) ) otherlv_2= ')' ) )
            // InternalEDdsl.g:781:2: (otherlv_0= '(' ( ( (lv_parameter_1_1= ruleAttribute | lv_parameter_1_2= ruleValue ) ) ) otherlv_2= ')' )
            {
            // InternalEDdsl.g:781:2: (otherlv_0= '(' ( ( (lv_parameter_1_1= ruleAttribute | lv_parameter_1_2= ruleValue ) ) ) otherlv_2= ')' )
            // InternalEDdsl.g:782:3: otherlv_0= '(' ( ( (lv_parameter_1_1= ruleAttribute | lv_parameter_1_2= ruleValue ) ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getLeftParenthesisKeyword_0());
            		
            // InternalEDdsl.g:786:3: ( ( (lv_parameter_1_1= ruleAttribute | lv_parameter_1_2= ruleValue ) ) )
            // InternalEDdsl.g:787:4: ( (lv_parameter_1_1= ruleAttribute | lv_parameter_1_2= ruleValue ) )
            {
            // InternalEDdsl.g:787:4: ( (lv_parameter_1_1= ruleAttribute | lv_parameter_1_2= ruleValue ) )
            // InternalEDdsl.g:788:5: (lv_parameter_1_1= ruleAttribute | lv_parameter_1_2= ruleValue )
            {
            // InternalEDdsl.g:788:5: (lv_parameter_1_1= ruleAttribute | lv_parameter_1_2= ruleValue )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==24) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalEDdsl.g:789:6: lv_parameter_1_1= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getParameterAttributeParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_parameter_1_1=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"parameter",
                    							lv_parameter_1_1,
                    							"org.xtext.selenium.eliedenis.EDdsl.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalEDdsl.g:805:6: lv_parameter_1_2= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getParameterValueParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_14);
                    lv_parameter_1_2=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"parameter",
                    							lv_parameter_1_2,
                    							"org.xtext.selenium.eliedenis.EDdsl.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleParameters"
    // InternalEDdsl.g:831:1: entryRuleParameters returns [EObject current=null] : iv_ruleParameters= ruleParameters EOF ;
    public final EObject entryRuleParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameters = null;


        try {
            // InternalEDdsl.g:831:51: (iv_ruleParameters= ruleParameters EOF )
            // InternalEDdsl.g:832:2: iv_ruleParameters= ruleParameters EOF
            {
             newCompositeNode(grammarAccess.getParametersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameters=ruleParameters();

            state._fsp--;

             current =iv_ruleParameters; 
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
    // $ANTLR end "entryRuleParameters"


    // $ANTLR start "ruleParameters"
    // InternalEDdsl.g:838:1: ruleParameters returns [EObject current=null] : ( (lv_parameters_0_0= ruleParameter ) )* ;
    public final EObject ruleParameters() throws RecognitionException {
        EObject current = null;

        EObject lv_parameters_0_0 = null;



        	enterRule();

        try {
            // InternalEDdsl.g:844:2: ( ( (lv_parameters_0_0= ruleParameter ) )* )
            // InternalEDdsl.g:845:2: ( (lv_parameters_0_0= ruleParameter ) )*
            {
            // InternalEDdsl.g:845:2: ( (lv_parameters_0_0= ruleParameter ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEDdsl.g:846:3: (lv_parameters_0_0= ruleParameter )
            	    {
            	    // InternalEDdsl.g:846:3: (lv_parameters_0_0= ruleParameter )
            	    // InternalEDdsl.g:847:4: lv_parameters_0_0= ruleParameter
            	    {

            	    				newCompositeNode(grammarAccess.getParametersAccess().getParametersParameterParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_15);
            	    lv_parameters_0_0=ruleParameter();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getParametersRule());
            	    				}
            	    				add(
            	    					current,
            	    					"parameters",
            	    					lv_parameters_0_0,
            	    					"org.xtext.selenium.eliedenis.EDdsl.Parameter");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


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
    // $ANTLR end "ruleParameters"


    // $ANTLR start "entryRuleRead"
    // InternalEDdsl.g:867:1: entryRuleRead returns [EObject current=null] : iv_ruleRead= ruleRead EOF ;
    public final EObject entryRuleRead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRead = null;


        try {
            // InternalEDdsl.g:867:45: (iv_ruleRead= ruleRead EOF )
            // InternalEDdsl.g:868:2: iv_ruleRead= ruleRead EOF
            {
             newCompositeNode(grammarAccess.getReadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRead=ruleRead();

            state._fsp--;

             current =iv_ruleRead; 
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
    // $ANTLR end "entryRuleRead"


    // $ANTLR start "ruleRead"
    // InternalEDdsl.g:874:1: ruleRead returns [EObject current=null] : (otherlv_0= 'read' ( (lv_readableElement_1_0= ruleReadableEnum ) ) ( (lv_parameters_2_0= ruleParameters ) ) ) ;
    public final EObject ruleRead() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_readableElement_1_0 = null;

        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalEDdsl.g:880:2: ( (otherlv_0= 'read' ( (lv_readableElement_1_0= ruleReadableEnum ) ) ( (lv_parameters_2_0= ruleParameters ) ) ) )
            // InternalEDdsl.g:881:2: (otherlv_0= 'read' ( (lv_readableElement_1_0= ruleReadableEnum ) ) ( (lv_parameters_2_0= ruleParameters ) ) )
            {
            // InternalEDdsl.g:881:2: (otherlv_0= 'read' ( (lv_readableElement_1_0= ruleReadableEnum ) ) ( (lv_parameters_2_0= ruleParameters ) ) )
            // InternalEDdsl.g:882:3: otherlv_0= 'read' ( (lv_readableElement_1_0= ruleReadableEnum ) ) ( (lv_parameters_2_0= ruleParameters ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getReadAccess().getReadKeyword_0());
            		
            // InternalEDdsl.g:886:3: ( (lv_readableElement_1_0= ruleReadableEnum ) )
            // InternalEDdsl.g:887:4: (lv_readableElement_1_0= ruleReadableEnum )
            {
            // InternalEDdsl.g:887:4: (lv_readableElement_1_0= ruleReadableEnum )
            // InternalEDdsl.g:888:5: lv_readableElement_1_0= ruleReadableEnum
            {

            					newCompositeNode(grammarAccess.getReadAccess().getReadableElementReadableEnumEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_readableElement_1_0=ruleReadableEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReadRule());
            					}
            					set(
            						current,
            						"readableElement",
            						lv_readableElement_1_0,
            						"org.xtext.selenium.eliedenis.EDdsl.ReadableEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEDdsl.g:905:3: ( (lv_parameters_2_0= ruleParameters ) )
            // InternalEDdsl.g:906:4: (lv_parameters_2_0= ruleParameters )
            {
            // InternalEDdsl.g:906:4: (lv_parameters_2_0= ruleParameters )
            // InternalEDdsl.g:907:5: lv_parameters_2_0= ruleParameters
            {

            					newCompositeNode(grammarAccess.getReadAccess().getParametersParametersParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_parameters_2_0=ruleParameters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReadRule());
            					}
            					set(
            						current,
            						"parameters",
            						lv_parameters_2_0,
            						"org.xtext.selenium.eliedenis.EDdsl.Parameters");
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
    // $ANTLR end "ruleRead"


    // $ANTLR start "entryRuleSeries"
    // InternalEDdsl.g:928:1: entryRuleSeries returns [EObject current=null] : iv_ruleSeries= ruleSeries EOF ;
    public final EObject entryRuleSeries() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeries = null;


        try {
            // InternalEDdsl.g:928:47: (iv_ruleSeries= ruleSeries EOF )
            // InternalEDdsl.g:929:2: iv_ruleSeries= ruleSeries EOF
            {
             newCompositeNode(grammarAccess.getSeriesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSeries=ruleSeries();

            state._fsp--;

             current =iv_ruleSeries; 
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
    // $ANTLR end "entryRuleSeries"


    // $ANTLR start "ruleSeries"
    // InternalEDdsl.g:935:1: ruleSeries returns [EObject current=null] : (otherlv_0= 'open' ( (lv_browser_1_0= ruleBrowserEnum ) ) ( (lv_expectedReturn_2_0= ruleBoolEnum ) ) otherlv_3= ';' ( (lv_operations_4_0= ruleOperation ) )* ) ;
    public final EObject ruleSeries() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Enumerator lv_browser_1_0 = null;

        Enumerator lv_expectedReturn_2_0 = null;

        EObject lv_operations_4_0 = null;



        	enterRule();

        try {
            // InternalEDdsl.g:941:2: ( (otherlv_0= 'open' ( (lv_browser_1_0= ruleBrowserEnum ) ) ( (lv_expectedReturn_2_0= ruleBoolEnum ) ) otherlv_3= ';' ( (lv_operations_4_0= ruleOperation ) )* ) )
            // InternalEDdsl.g:942:2: (otherlv_0= 'open' ( (lv_browser_1_0= ruleBrowserEnum ) ) ( (lv_expectedReturn_2_0= ruleBoolEnum ) ) otherlv_3= ';' ( (lv_operations_4_0= ruleOperation ) )* )
            {
            // InternalEDdsl.g:942:2: (otherlv_0= 'open' ( (lv_browser_1_0= ruleBrowserEnum ) ) ( (lv_expectedReturn_2_0= ruleBoolEnum ) ) otherlv_3= ';' ( (lv_operations_4_0= ruleOperation ) )* )
            // InternalEDdsl.g:943:3: otherlv_0= 'open' ( (lv_browser_1_0= ruleBrowserEnum ) ) ( (lv_expectedReturn_2_0= ruleBoolEnum ) ) otherlv_3= ';' ( (lv_operations_4_0= ruleOperation ) )*
            {
            otherlv_0=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getSeriesAccess().getOpenKeyword_0());
            		
            // InternalEDdsl.g:947:3: ( (lv_browser_1_0= ruleBrowserEnum ) )
            // InternalEDdsl.g:948:4: (lv_browser_1_0= ruleBrowserEnum )
            {
            // InternalEDdsl.g:948:4: (lv_browser_1_0= ruleBrowserEnum )
            // InternalEDdsl.g:949:5: lv_browser_1_0= ruleBrowserEnum
            {

            					newCompositeNode(grammarAccess.getSeriesAccess().getBrowserBrowserEnumEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_browser_1_0=ruleBrowserEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSeriesRule());
            					}
            					set(
            						current,
            						"browser",
            						lv_browser_1_0,
            						"org.xtext.selenium.eliedenis.EDdsl.BrowserEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEDdsl.g:966:3: ( (lv_expectedReturn_2_0= ruleBoolEnum ) )
            // InternalEDdsl.g:967:4: (lv_expectedReturn_2_0= ruleBoolEnum )
            {
            // InternalEDdsl.g:967:4: (lv_expectedReturn_2_0= ruleBoolEnum )
            // InternalEDdsl.g:968:5: lv_expectedReturn_2_0= ruleBoolEnum
            {

            					newCompositeNode(grammarAccess.getSeriesAccess().getExpectedReturnBoolEnumEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_expectedReturn_2_0=ruleBoolEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSeriesRule());
            					}
            					set(
            						current,
            						"expectedReturn",
            						lv_expectedReturn_2_0,
            						"org.xtext.selenium.eliedenis.EDdsl.BoolEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getSeriesAccess().getSemicolonKeyword_3());
            		
            // InternalEDdsl.g:989:3: ( (lv_operations_4_0= ruleOperation ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==11||(LA7_0>=13 && LA7_0<=14)||LA7_0==17||LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEDdsl.g:990:4: (lv_operations_4_0= ruleOperation )
            	    {
            	    // InternalEDdsl.g:990:4: (lv_operations_4_0= ruleOperation )
            	    // InternalEDdsl.g:991:5: lv_operations_4_0= ruleOperation
            	    {

            	    					newCompositeNode(grammarAccess.getSeriesAccess().getOperationsOperationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_operations_4_0=ruleOperation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSeriesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"operations",
            	    						lv_operations_4_0,
            	    						"org.xtext.selenium.eliedenis.EDdsl.Operation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleSeries"


    // $ANTLR start "entryRuleType"
    // InternalEDdsl.g:1012:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalEDdsl.g:1012:45: (iv_ruleType= ruleType EOF )
            // InternalEDdsl.g:1013:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalEDdsl.g:1019:1: ruleType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_textToType_1_0= ruleVal ) ) ( (lv_parameters_2_0= ruleParameters ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_textToType_1_0 = null;

        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalEDdsl.g:1025:2: ( (otherlv_0= 'type' ( (lv_textToType_1_0= ruleVal ) ) ( (lv_parameters_2_0= ruleParameters ) ) ) )
            // InternalEDdsl.g:1026:2: (otherlv_0= 'type' ( (lv_textToType_1_0= ruleVal ) ) ( (lv_parameters_2_0= ruleParameters ) ) )
            {
            // InternalEDdsl.g:1026:2: (otherlv_0= 'type' ( (lv_textToType_1_0= ruleVal ) ) ( (lv_parameters_2_0= ruleParameters ) ) )
            // InternalEDdsl.g:1027:3: otherlv_0= 'type' ( (lv_textToType_1_0= ruleVal ) ) ( (lv_parameters_2_0= ruleParameters ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getTypeKeyword_0());
            		
            // InternalEDdsl.g:1031:3: ( (lv_textToType_1_0= ruleVal ) )
            // InternalEDdsl.g:1032:4: (lv_textToType_1_0= ruleVal )
            {
            // InternalEDdsl.g:1032:4: (lv_textToType_1_0= ruleVal )
            // InternalEDdsl.g:1033:5: lv_textToType_1_0= ruleVal
            {

            					newCompositeNode(grammarAccess.getTypeAccess().getTextToTypeValParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_textToType_1_0=ruleVal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeRule());
            					}
            					set(
            						current,
            						"textToType",
            						lv_textToType_1_0,
            						"org.xtext.selenium.eliedenis.EDdsl.Val");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEDdsl.g:1050:3: ( (lv_parameters_2_0= ruleParameters ) )
            // InternalEDdsl.g:1051:4: (lv_parameters_2_0= ruleParameters )
            {
            // InternalEDdsl.g:1051:4: (lv_parameters_2_0= ruleParameters )
            // InternalEDdsl.g:1052:5: lv_parameters_2_0= ruleParameters
            {

            					newCompositeNode(grammarAccess.getTypeAccess().getParametersParametersParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_parameters_2_0=ruleParameters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeRule());
            					}
            					set(
            						current,
            						"parameters",
            						lv_parameters_2_0,
            						"org.xtext.selenium.eliedenis.EDdsl.Parameters");
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleVal"
    // InternalEDdsl.g:1073:1: entryRuleVal returns [EObject current=null] : iv_ruleVal= ruleVal EOF ;
    public final EObject entryRuleVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVal = null;


        try {
            // InternalEDdsl.g:1073:44: (iv_ruleVal= ruleVal EOF )
            // InternalEDdsl.g:1074:2: iv_ruleVal= ruleVal EOF
            {
             newCompositeNode(grammarAccess.getValRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVal=ruleVal();

            state._fsp--;

             current =iv_ruleVal; 
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
    // $ANTLR end "entryRuleVal"


    // $ANTLR start "ruleVal"
    // InternalEDdsl.g:1080:1: ruleVal returns [EObject current=null] : (this_VariableGet_0= ruleVariableGet | this_STRING_1= RULE_STRING | ( (lv_bool_2_0= ruleBoolEnum ) ) ) ;
    public final EObject ruleVal() throws RecognitionException {
        EObject current = null;

        Token this_STRING_1=null;
        EObject this_VariableGet_0 = null;

        Enumerator lv_bool_2_0 = null;



        	enterRule();

        try {
            // InternalEDdsl.g:1086:2: ( (this_VariableGet_0= ruleVariableGet | this_STRING_1= RULE_STRING | ( (lv_bool_2_0= ruleBoolEnum ) ) ) )
            // InternalEDdsl.g:1087:2: (this_VariableGet_0= ruleVariableGet | this_STRING_1= RULE_STRING | ( (lv_bool_2_0= ruleBoolEnum ) ) )
            {
            // InternalEDdsl.g:1087:2: (this_VariableGet_0= ruleVariableGet | this_STRING_1= RULE_STRING | ( (lv_bool_2_0= ruleBoolEnum ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt8=1;
                }
                break;
            case RULE_STRING:
                {
                alt8=2;
                }
                break;
            case 26:
            case 27:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalEDdsl.g:1088:3: this_VariableGet_0= ruleVariableGet
                    {

                    			newCompositeNode(grammarAccess.getValAccess().getVariableGetParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableGet_0=ruleVariableGet();

                    state._fsp--;


                    			current = this_VariableGet_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEDdsl.g:1097:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(this_STRING_1, grammarAccess.getValAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalEDdsl.g:1102:3: ( (lv_bool_2_0= ruleBoolEnum ) )
                    {
                    // InternalEDdsl.g:1102:3: ( (lv_bool_2_0= ruleBoolEnum ) )
                    // InternalEDdsl.g:1103:4: (lv_bool_2_0= ruleBoolEnum )
                    {
                    // InternalEDdsl.g:1103:4: (lv_bool_2_0= ruleBoolEnum )
                    // InternalEDdsl.g:1104:5: lv_bool_2_0= ruleBoolEnum
                    {

                    					newCompositeNode(grammarAccess.getValAccess().getBoolBoolEnumEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_bool_2_0=ruleBoolEnum();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getValRule());
                    					}
                    					set(
                    						current,
                    						"bool",
                    						lv_bool_2_0,
                    						"org.xtext.selenium.eliedenis.EDdsl.BoolEnum");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleVal"


    // $ANTLR start "entryRuleValue"
    // InternalEDdsl.g:1125:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalEDdsl.g:1125:46: (iv_ruleValue= ruleValue EOF )
            // InternalEDdsl.g:1126:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalEDdsl.g:1132:1: ruleValue returns [EObject current=null] : (otherlv_0= 'value' ( (lv_value_1_0= ruleVal ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalEDdsl.g:1138:2: ( (otherlv_0= 'value' ( (lv_value_1_0= ruleVal ) ) ) )
            // InternalEDdsl.g:1139:2: (otherlv_0= 'value' ( (lv_value_1_0= ruleVal ) ) )
            {
            // InternalEDdsl.g:1139:2: (otherlv_0= 'value' ( (lv_value_1_0= ruleVal ) ) )
            // InternalEDdsl.g:1140:3: otherlv_0= 'value' ( (lv_value_1_0= ruleVal ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getValueAccess().getValueKeyword_0());
            		
            // InternalEDdsl.g:1144:3: ( (lv_value_1_0= ruleVal ) )
            // InternalEDdsl.g:1145:4: (lv_value_1_0= ruleVal )
            {
            // InternalEDdsl.g:1145:4: (lv_value_1_0= ruleVal )
            // InternalEDdsl.g:1146:5: lv_value_1_0= ruleVal
            {

            					newCompositeNode(grammarAccess.getValueAccess().getValueValParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleVal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.selenium.eliedenis.EDdsl.Val");
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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleVariableGet"
    // InternalEDdsl.g:1167:1: entryRuleVariableGet returns [EObject current=null] : iv_ruleVariableGet= ruleVariableGet EOF ;
    public final EObject entryRuleVariableGet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableGet = null;


        try {
            // InternalEDdsl.g:1167:52: (iv_ruleVariableGet= ruleVariableGet EOF )
            // InternalEDdsl.g:1168:2: iv_ruleVariableGet= ruleVariableGet EOF
            {
             newCompositeNode(grammarAccess.getVariableGetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableGet=ruleVariableGet();

            state._fsp--;

             current =iv_ruleVariableGet; 
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
    // $ANTLR end "entryRuleVariableGet"


    // $ANTLR start "ruleVariableGet"
    // InternalEDdsl.g:1174:1: ruleVariableGet returns [EObject current=null] : ( (lv_varName_0_0= RULE_ID ) ) ;
    public final EObject ruleVariableGet() throws RecognitionException {
        EObject current = null;

        Token lv_varName_0_0=null;


        	enterRule();

        try {
            // InternalEDdsl.g:1180:2: ( ( (lv_varName_0_0= RULE_ID ) ) )
            // InternalEDdsl.g:1181:2: ( (lv_varName_0_0= RULE_ID ) )
            {
            // InternalEDdsl.g:1181:2: ( (lv_varName_0_0= RULE_ID ) )
            // InternalEDdsl.g:1182:3: (lv_varName_0_0= RULE_ID )
            {
            // InternalEDdsl.g:1182:3: (lv_varName_0_0= RULE_ID )
            // InternalEDdsl.g:1183:4: lv_varName_0_0= RULE_ID
            {
            lv_varName_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_varName_0_0, grammarAccess.getVariableGetAccess().getVarNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableGetRule());
            				}
            				setWithLastConsumed(
            					current,
            					"varName",
            					lv_varName_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleVariableGet"


    // $ANTLR start "entryRuleVariableSet"
    // InternalEDdsl.g:1202:1: entryRuleVariableSet returns [EObject current=null] : iv_ruleVariableSet= ruleVariableSet EOF ;
    public final EObject entryRuleVariableSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableSet = null;


        try {
            // InternalEDdsl.g:1202:52: (iv_ruleVariableSet= ruleVariableSet EOF )
            // InternalEDdsl.g:1203:2: iv_ruleVariableSet= ruleVariableSet EOF
            {
             newCompositeNode(grammarAccess.getVariableSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableSet=ruleVariableSet();

            state._fsp--;

             current =iv_ruleVariableSet; 
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
    // $ANTLR end "entryRuleVariableSet"


    // $ANTLR start "ruleVariableSet"
    // InternalEDdsl.g:1209:1: ruleVariableSet returns [EObject current=null] : ( ( (lv_varName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_action_2_0= ruleActionReturn ) ) ) ;
    public final EObject ruleVariableSet() throws RecognitionException {
        EObject current = null;

        Token lv_varName_0_0=null;
        Token otherlv_1=null;
        EObject lv_action_2_0 = null;



        	enterRule();

        try {
            // InternalEDdsl.g:1215:2: ( ( ( (lv_varName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_action_2_0= ruleActionReturn ) ) ) )
            // InternalEDdsl.g:1216:2: ( ( (lv_varName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_action_2_0= ruleActionReturn ) ) )
            {
            // InternalEDdsl.g:1216:2: ( ( (lv_varName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_action_2_0= ruleActionReturn ) ) )
            // InternalEDdsl.g:1217:3: ( (lv_varName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_action_2_0= ruleActionReturn ) )
            {
            // InternalEDdsl.g:1217:3: ( (lv_varName_0_0= RULE_ID ) )
            // InternalEDdsl.g:1218:4: (lv_varName_0_0= RULE_ID )
            {
            // InternalEDdsl.g:1218:4: (lv_varName_0_0= RULE_ID )
            // InternalEDdsl.g:1219:5: lv_varName_0_0= RULE_ID
            {
            lv_varName_0_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_varName_0_0, grammarAccess.getVariableSetAccess().getVarNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableSetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varName",
            						lv_varName_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableSetAccess().getEqualsSignKeyword_1());
            		
            // InternalEDdsl.g:1239:3: ( (lv_action_2_0= ruleActionReturn ) )
            // InternalEDdsl.g:1240:4: (lv_action_2_0= ruleActionReturn )
            {
            // InternalEDdsl.g:1240:4: (lv_action_2_0= ruleActionReturn )
            // InternalEDdsl.g:1241:5: lv_action_2_0= ruleActionReturn
            {

            					newCompositeNode(grammarAccess.getVariableSetAccess().getActionActionReturnParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_action_2_0=ruleActionReturn();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableSetRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_2_0,
            						"org.xtext.selenium.eliedenis.EDdsl.ActionReturn");
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
    // $ANTLR end "ruleVariableSet"


    // $ANTLR start "ruleBoolEnum"
    // InternalEDdsl.g:1262:1: ruleBoolEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBoolEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalEDdsl.g:1268:2: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // InternalEDdsl.g:1269:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // InternalEDdsl.g:1269:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            else if ( (LA9_0==27) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalEDdsl.g:1270:3: (enumLiteral_0= 'true' )
                    {
                    // InternalEDdsl.g:1270:3: (enumLiteral_0= 'true' )
                    // InternalEDdsl.g:1271:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getBoolEnumAccess().getTrueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBoolEnumAccess().getTrueEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEDdsl.g:1278:3: (enumLiteral_1= 'false' )
                    {
                    // InternalEDdsl.g:1278:3: (enumLiteral_1= 'false' )
                    // InternalEDdsl.g:1279:4: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getBoolEnumAccess().getFalseEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBoolEnumAccess().getFalseEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleBoolEnum"


    // $ANTLR start "ruleBrowserEnum"
    // InternalEDdsl.g:1289:1: ruleBrowserEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'firefox' ) | (enumLiteral_1= 'ie' ) ) ;
    public final Enumerator ruleBrowserEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalEDdsl.g:1295:2: ( ( (enumLiteral_0= 'firefox' ) | (enumLiteral_1= 'ie' ) ) )
            // InternalEDdsl.g:1296:2: ( (enumLiteral_0= 'firefox' ) | (enumLiteral_1= 'ie' ) )
            {
            // InternalEDdsl.g:1296:2: ( (enumLiteral_0= 'firefox' ) | (enumLiteral_1= 'ie' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            else if ( (LA10_0==29) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalEDdsl.g:1297:3: (enumLiteral_0= 'firefox' )
                    {
                    // InternalEDdsl.g:1297:3: (enumLiteral_0= 'firefox' )
                    // InternalEDdsl.g:1298:4: enumLiteral_0= 'firefox'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getBrowserEnumAccess().getFirefoxEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBrowserEnumAccess().getFirefoxEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEDdsl.g:1305:3: (enumLiteral_1= 'ie' )
                    {
                    // InternalEDdsl.g:1305:3: (enumLiteral_1= 'ie' )
                    // InternalEDdsl.g:1306:4: enumLiteral_1= 'ie'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getBrowserEnumAccess().getIEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBrowserEnumAccess().getIEEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleBrowserEnum"


    // $ANTLR start "ruleClickableEnum"
    // InternalEDdsl.g:1316:1: ruleClickableEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'button' ) | (enumLiteral_1= 'link' ) | (enumLiteral_2= 'input' ) ) ;
    public final Enumerator ruleClickableEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalEDdsl.g:1322:2: ( ( (enumLiteral_0= 'button' ) | (enumLiteral_1= 'link' ) | (enumLiteral_2= 'input' ) ) )
            // InternalEDdsl.g:1323:2: ( (enumLiteral_0= 'button' ) | (enumLiteral_1= 'link' ) | (enumLiteral_2= 'input' ) )
            {
            // InternalEDdsl.g:1323:2: ( (enumLiteral_0= 'button' ) | (enumLiteral_1= 'link' ) | (enumLiteral_2= 'input' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt11=1;
                }
                break;
            case 31:
                {
                alt11=2;
                }
                break;
            case 32:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalEDdsl.g:1324:3: (enumLiteral_0= 'button' )
                    {
                    // InternalEDdsl.g:1324:3: (enumLiteral_0= 'button' )
                    // InternalEDdsl.g:1325:4: enumLiteral_0= 'button'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getClickableEnumAccess().getButtonEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getClickableEnumAccess().getButtonEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEDdsl.g:1332:3: (enumLiteral_1= 'link' )
                    {
                    // InternalEDdsl.g:1332:3: (enumLiteral_1= 'link' )
                    // InternalEDdsl.g:1333:4: enumLiteral_1= 'link'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getClickableEnumAccess().getLinkEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getClickableEnumAccess().getLinkEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEDdsl.g:1340:3: (enumLiteral_2= 'input' )
                    {
                    // InternalEDdsl.g:1340:3: (enumLiteral_2= 'input' )
                    // InternalEDdsl.g:1341:4: enumLiteral_2= 'input'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getClickableEnumAccess().getInputEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getClickableEnumAccess().getInputEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleClickableEnum"


    // $ANTLR start "ruleComparisonOperatorEnum"
    // InternalEDdsl.g:1351:1: ruleComparisonOperatorEnum returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<=' ) ) ;
    public final Enumerator ruleComparisonOperatorEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalEDdsl.g:1357:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<=' ) ) )
            // InternalEDdsl.g:1358:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<=' ) )
            {
            // InternalEDdsl.g:1358:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<=' ) )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt12=1;
                }
                break;
            case 34:
                {
                alt12=2;
                }
                break;
            case 35:
                {
                alt12=3;
                }
                break;
            case 36:
                {
                alt12=4;
                }
                break;
            case 37:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalEDdsl.g:1359:3: (enumLiteral_0= '==' )
                    {
                    // InternalEDdsl.g:1359:3: (enumLiteral_0= '==' )
                    // InternalEDdsl.g:1360:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorEnumAccess().getEqualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorEnumAccess().getEqualEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEDdsl.g:1367:3: (enumLiteral_1= '>' )
                    {
                    // InternalEDdsl.g:1367:3: (enumLiteral_1= '>' )
                    // InternalEDdsl.g:1368:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorEnumAccess().getSuperiorEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorEnumAccess().getSuperiorEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEDdsl.g:1375:3: (enumLiteral_2= '<' )
                    {
                    // InternalEDdsl.g:1375:3: (enumLiteral_2= '<' )
                    // InternalEDdsl.g:1376:4: enumLiteral_2= '<'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorEnumAccess().getInferiorEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorEnumAccess().getInferiorEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalEDdsl.g:1383:3: (enumLiteral_3= '>=' )
                    {
                    // InternalEDdsl.g:1383:3: (enumLiteral_3= '>=' )
                    // InternalEDdsl.g:1384:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorEnumAccess().getSupEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getComparisonOperatorEnumAccess().getSupEqualEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalEDdsl.g:1391:3: (enumLiteral_4= '<=' )
                    {
                    // InternalEDdsl.g:1391:3: (enumLiteral_4= '<=' )
                    // InternalEDdsl.g:1392:4: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorEnumAccess().getInfEqualEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getComparisonOperatorEnumAccess().getInfEqualEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleComparisonOperatorEnum"


    // $ANTLR start "ruleConstraintTypeEnum"
    // InternalEDdsl.g:1402:1: ruleConstraintTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'contain' ) | (enumLiteral_1= 'enabled' ) ) ;
    public final Enumerator ruleConstraintTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalEDdsl.g:1408:2: ( ( (enumLiteral_0= 'contain' ) | (enumLiteral_1= 'enabled' ) ) )
            // InternalEDdsl.g:1409:2: ( (enumLiteral_0= 'contain' ) | (enumLiteral_1= 'enabled' ) )
            {
            // InternalEDdsl.g:1409:2: ( (enumLiteral_0= 'contain' ) | (enumLiteral_1= 'enabled' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==38) ) {
                alt13=1;
            }
            else if ( (LA13_0==39) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalEDdsl.g:1410:3: (enumLiteral_0= 'contain' )
                    {
                    // InternalEDdsl.g:1410:3: (enumLiteral_0= 'contain' )
                    // InternalEDdsl.g:1411:4: enumLiteral_0= 'contain'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getConstraintTypeEnumAccess().getContainEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getConstraintTypeEnumAccess().getContainEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEDdsl.g:1418:3: (enumLiteral_1= 'enabled' )
                    {
                    // InternalEDdsl.g:1418:3: (enumLiteral_1= 'enabled' )
                    // InternalEDdsl.g:1419:4: enumLiteral_1= 'enabled'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getConstraintTypeEnumAccess().getEnabledEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getConstraintTypeEnumAccess().getEnabledEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleConstraintTypeEnum"


    // $ANTLR start "ruleReadableEnum"
    // InternalEDdsl.g:1429:1: ruleReadableEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'button' ) | (enumLiteral_1= 'link' ) | (enumLiteral_2= 'input' ) | (enumLiteral_3= 'h1' ) ) ;
    public final Enumerator ruleReadableEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalEDdsl.g:1435:2: ( ( (enumLiteral_0= 'button' ) | (enumLiteral_1= 'link' ) | (enumLiteral_2= 'input' ) | (enumLiteral_3= 'h1' ) ) )
            // InternalEDdsl.g:1436:2: ( (enumLiteral_0= 'button' ) | (enumLiteral_1= 'link' ) | (enumLiteral_2= 'input' ) | (enumLiteral_3= 'h1' ) )
            {
            // InternalEDdsl.g:1436:2: ( (enumLiteral_0= 'button' ) | (enumLiteral_1= 'link' ) | (enumLiteral_2= 'input' ) | (enumLiteral_3= 'h1' ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt14=1;
                }
                break;
            case 31:
                {
                alt14=2;
                }
                break;
            case 32:
                {
                alt14=3;
                }
                break;
            case 40:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalEDdsl.g:1437:3: (enumLiteral_0= 'button' )
                    {
                    // InternalEDdsl.g:1437:3: (enumLiteral_0= 'button' )
                    // InternalEDdsl.g:1438:4: enumLiteral_0= 'button'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getReadableEnumAccess().getButtonEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getReadableEnumAccess().getButtonEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEDdsl.g:1445:3: (enumLiteral_1= 'link' )
                    {
                    // InternalEDdsl.g:1445:3: (enumLiteral_1= 'link' )
                    // InternalEDdsl.g:1446:4: enumLiteral_1= 'link'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getReadableEnumAccess().getLinkEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getReadableEnumAccess().getLinkEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEDdsl.g:1453:3: (enumLiteral_2= 'input' )
                    {
                    // InternalEDdsl.g:1453:3: (enumLiteral_2= 'input' )
                    // InternalEDdsl.g:1454:4: enumLiteral_2= 'input'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getReadableEnumAccess().getInputEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getReadableEnumAccess().getInputEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalEDdsl.g:1461:3: (enumLiteral_3= 'h1' )
                    {
                    // InternalEDdsl.g:1461:3: (enumLiteral_3= 'h1' )
                    // InternalEDdsl.g:1462:4: enumLiteral_3= 'h1'
                    {
                    enumLiteral_3=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getReadableEnumAccess().getH1EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getReadableEnumAccess().getH1EnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleReadableEnum"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000826820L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000101C0008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000C000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000003E00000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000290000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000826822L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});

}