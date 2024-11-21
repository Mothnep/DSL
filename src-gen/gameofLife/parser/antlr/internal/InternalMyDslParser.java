package gameofLife.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import gameofLife.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'grid'", "'x'", "'alive'", "','", "'rules'", "'live_to_dead'", "'if'", "'neighbors'", "'live_to_alive'", "'dead_to_alive'", "'steps'", "'>'", "'<'", "'='", "'('", "')'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_grid_0_0= rulegridDefinition ) ) ( (lv_rules_1_0= rulerulesDefinition ) ) ( (lv_steps_2_0= rulestepsDefinition ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_grid_0_0 = null;

        EObject lv_rules_1_0 = null;

        EObject lv_steps_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( (lv_grid_0_0= rulegridDefinition ) ) ( (lv_rules_1_0= rulerulesDefinition ) ) ( (lv_steps_2_0= rulestepsDefinition ) ) ) )
            // InternalMyDsl.g:78:2: ( ( (lv_grid_0_0= rulegridDefinition ) ) ( (lv_rules_1_0= rulerulesDefinition ) ) ( (lv_steps_2_0= rulestepsDefinition ) ) )
            {
            // InternalMyDsl.g:78:2: ( ( (lv_grid_0_0= rulegridDefinition ) ) ( (lv_rules_1_0= rulerulesDefinition ) ) ( (lv_steps_2_0= rulestepsDefinition ) ) )
            // InternalMyDsl.g:79:3: ( (lv_grid_0_0= rulegridDefinition ) ) ( (lv_rules_1_0= rulerulesDefinition ) ) ( (lv_steps_2_0= rulestepsDefinition ) )
            {
            // InternalMyDsl.g:79:3: ( (lv_grid_0_0= rulegridDefinition ) )
            // InternalMyDsl.g:80:4: (lv_grid_0_0= rulegridDefinition )
            {
            // InternalMyDsl.g:80:4: (lv_grid_0_0= rulegridDefinition )
            // InternalMyDsl.g:81:5: lv_grid_0_0= rulegridDefinition
            {

            					newCompositeNode(grammarAccess.getModelAccess().getGridGridDefinitionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_grid_0_0=rulegridDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"grid",
            						lv_grid_0_0,
            						"gameofLife.MyDsl.gridDefinition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:98:3: ( (lv_rules_1_0= rulerulesDefinition ) )
            // InternalMyDsl.g:99:4: (lv_rules_1_0= rulerulesDefinition )
            {
            // InternalMyDsl.g:99:4: (lv_rules_1_0= rulerulesDefinition )
            // InternalMyDsl.g:100:5: lv_rules_1_0= rulerulesDefinition
            {

            					newCompositeNode(grammarAccess.getModelAccess().getRulesRulesDefinitionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_rules_1_0=rulerulesDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"rules",
            						lv_rules_1_0,
            						"gameofLife.MyDsl.rulesDefinition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:117:3: ( (lv_steps_2_0= rulestepsDefinition ) )
            // InternalMyDsl.g:118:4: (lv_steps_2_0= rulestepsDefinition )
            {
            // InternalMyDsl.g:118:4: (lv_steps_2_0= rulestepsDefinition )
            // InternalMyDsl.g:119:5: lv_steps_2_0= rulestepsDefinition
            {

            					newCompositeNode(grammarAccess.getModelAccess().getStepsStepsDefinitionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_steps_2_0=rulestepsDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"steps",
            						lv_steps_2_0,
            						"gameofLife.MyDsl.stepsDefinition");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulegridDefinition"
    // InternalMyDsl.g:140:1: entryRulegridDefinition returns [EObject current=null] : iv_rulegridDefinition= rulegridDefinition EOF ;
    public final EObject entryRulegridDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegridDefinition = null;


        try {
            // InternalMyDsl.g:140:55: (iv_rulegridDefinition= rulegridDefinition EOF )
            // InternalMyDsl.g:141:2: iv_rulegridDefinition= rulegridDefinition EOF
            {
             newCompositeNode(grammarAccess.getGridDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulegridDefinition=rulegridDefinition();

            state._fsp--;

             current =iv_rulegridDefinition; 
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
    // $ANTLR end "entryRulegridDefinition"


    // $ANTLR start "rulegridDefinition"
    // InternalMyDsl.g:147:1: rulegridDefinition returns [EObject current=null] : (otherlv_0= 'grid' ( (lv_width_1_0= RULE_INT ) ) otherlv_2= 'x' ( (lv_height_3_0= RULE_INT ) ) (otherlv_4= 'alive' ( (lv_aliveCells_5_0= ruleCellCoord ) ) (otherlv_6= ',' ( (lv_aliveCells_7_0= ruleCellCoord ) ) )* )? ) ;
    public final EObject rulegridDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_width_1_0=null;
        Token otherlv_2=null;
        Token lv_height_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_aliveCells_5_0 = null;

        EObject lv_aliveCells_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:153:2: ( (otherlv_0= 'grid' ( (lv_width_1_0= RULE_INT ) ) otherlv_2= 'x' ( (lv_height_3_0= RULE_INT ) ) (otherlv_4= 'alive' ( (lv_aliveCells_5_0= ruleCellCoord ) ) (otherlv_6= ',' ( (lv_aliveCells_7_0= ruleCellCoord ) ) )* )? ) )
            // InternalMyDsl.g:154:2: (otherlv_0= 'grid' ( (lv_width_1_0= RULE_INT ) ) otherlv_2= 'x' ( (lv_height_3_0= RULE_INT ) ) (otherlv_4= 'alive' ( (lv_aliveCells_5_0= ruleCellCoord ) ) (otherlv_6= ',' ( (lv_aliveCells_7_0= ruleCellCoord ) ) )* )? )
            {
            // InternalMyDsl.g:154:2: (otherlv_0= 'grid' ( (lv_width_1_0= RULE_INT ) ) otherlv_2= 'x' ( (lv_height_3_0= RULE_INT ) ) (otherlv_4= 'alive' ( (lv_aliveCells_5_0= ruleCellCoord ) ) (otherlv_6= ',' ( (lv_aliveCells_7_0= ruleCellCoord ) ) )* )? )
            // InternalMyDsl.g:155:3: otherlv_0= 'grid' ( (lv_width_1_0= RULE_INT ) ) otherlv_2= 'x' ( (lv_height_3_0= RULE_INT ) ) (otherlv_4= 'alive' ( (lv_aliveCells_5_0= ruleCellCoord ) ) (otherlv_6= ',' ( (lv_aliveCells_7_0= ruleCellCoord ) ) )* )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getGridDefinitionAccess().getGridKeyword_0());
            		
            // InternalMyDsl.g:159:3: ( (lv_width_1_0= RULE_INT ) )
            // InternalMyDsl.g:160:4: (lv_width_1_0= RULE_INT )
            {
            // InternalMyDsl.g:160:4: (lv_width_1_0= RULE_INT )
            // InternalMyDsl.g:161:5: lv_width_1_0= RULE_INT
            {
            lv_width_1_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            					newLeafNode(lv_width_1_0, grammarAccess.getGridDefinitionAccess().getWidthINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGridDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"width",
            						lv_width_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getGridDefinitionAccess().getXKeyword_2());
            		
            // InternalMyDsl.g:181:3: ( (lv_height_3_0= RULE_INT ) )
            // InternalMyDsl.g:182:4: (lv_height_3_0= RULE_INT )
            {
            // InternalMyDsl.g:182:4: (lv_height_3_0= RULE_INT )
            // InternalMyDsl.g:183:5: lv_height_3_0= RULE_INT
            {
            lv_height_3_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_height_3_0, grammarAccess.getGridDefinitionAccess().getHeightINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGridDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"height",
            						lv_height_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalMyDsl.g:199:3: (otherlv_4= 'alive' ( (lv_aliveCells_5_0= ruleCellCoord ) ) (otherlv_6= ',' ( (lv_aliveCells_7_0= ruleCellCoord ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:200:4: otherlv_4= 'alive' ( (lv_aliveCells_5_0= ruleCellCoord ) ) (otherlv_6= ',' ( (lv_aliveCells_7_0= ruleCellCoord ) ) )*
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getGridDefinitionAccess().getAliveKeyword_4_0());
                    			
                    // InternalMyDsl.g:204:4: ( (lv_aliveCells_5_0= ruleCellCoord ) )
                    // InternalMyDsl.g:205:5: (lv_aliveCells_5_0= ruleCellCoord )
                    {
                    // InternalMyDsl.g:205:5: (lv_aliveCells_5_0= ruleCellCoord )
                    // InternalMyDsl.g:206:6: lv_aliveCells_5_0= ruleCellCoord
                    {

                    						newCompositeNode(grammarAccess.getGridDefinitionAccess().getAliveCellsCellCoordParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_aliveCells_5_0=ruleCellCoord();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGridDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"aliveCells",
                    							lv_aliveCells_5_0,
                    							"gameofLife.MyDsl.CellCoord");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:223:4: (otherlv_6= ',' ( (lv_aliveCells_7_0= ruleCellCoord ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMyDsl.g:224:5: otherlv_6= ',' ( (lv_aliveCells_7_0= ruleCellCoord ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getGridDefinitionAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMyDsl.g:228:5: ( (lv_aliveCells_7_0= ruleCellCoord ) )
                    	    // InternalMyDsl.g:229:6: (lv_aliveCells_7_0= ruleCellCoord )
                    	    {
                    	    // InternalMyDsl.g:229:6: (lv_aliveCells_7_0= ruleCellCoord )
                    	    // InternalMyDsl.g:230:7: lv_aliveCells_7_0= ruleCellCoord
                    	    {

                    	    							newCompositeNode(grammarAccess.getGridDefinitionAccess().getAliveCellsCellCoordParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_aliveCells_7_0=ruleCellCoord();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGridDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"aliveCells",
                    	    								lv_aliveCells_7_0,
                    	    								"gameofLife.MyDsl.CellCoord");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

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
    // $ANTLR end "rulegridDefinition"


    // $ANTLR start "entryRulerulesDefinition"
    // InternalMyDsl.g:253:1: entryRulerulesDefinition returns [EObject current=null] : iv_rulerulesDefinition= rulerulesDefinition EOF ;
    public final EObject entryRulerulesDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerulesDefinition = null;


        try {
            // InternalMyDsl.g:253:56: (iv_rulerulesDefinition= rulerulesDefinition EOF )
            // InternalMyDsl.g:254:2: iv_rulerulesDefinition= rulerulesDefinition EOF
            {
             newCompositeNode(grammarAccess.getRulesDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerulesDefinition=rulerulesDefinition();

            state._fsp--;

             current =iv_rulerulesDefinition; 
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
    // $ANTLR end "entryRulerulesDefinition"


    // $ANTLR start "rulerulesDefinition"
    // InternalMyDsl.g:260:1: rulerulesDefinition returns [EObject current=null] : (otherlv_0= 'rules' ( (lv_rules_1_0= ruleruleDefinition ) )* ) ;
    public final EObject rulerulesDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_rules_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:266:2: ( (otherlv_0= 'rules' ( (lv_rules_1_0= ruleruleDefinition ) )* ) )
            // InternalMyDsl.g:267:2: (otherlv_0= 'rules' ( (lv_rules_1_0= ruleruleDefinition ) )* )
            {
            // InternalMyDsl.g:267:2: (otherlv_0= 'rules' ( (lv_rules_1_0= ruleruleDefinition ) )* )
            // InternalMyDsl.g:268:3: otherlv_0= 'rules' ( (lv_rules_1_0= ruleruleDefinition ) )*
            {
            otherlv_0=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRulesDefinitionAccess().getRulesKeyword_0());
            		
            // InternalMyDsl.g:272:3: ( (lv_rules_1_0= ruleruleDefinition ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16||(LA3_0>=19 && LA3_0<=20)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:273:4: (lv_rules_1_0= ruleruleDefinition )
            	    {
            	    // InternalMyDsl.g:273:4: (lv_rules_1_0= ruleruleDefinition )
            	    // InternalMyDsl.g:274:5: lv_rules_1_0= ruleruleDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getRulesDefinitionAccess().getRulesRuleDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_rules_1_0=ruleruleDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRulesDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_1_0,
            	    						"gameofLife.MyDsl.ruleDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "rulerulesDefinition"


    // $ANTLR start "entryRuleruleDefinition"
    // InternalMyDsl.g:295:1: entryRuleruleDefinition returns [EObject current=null] : iv_ruleruleDefinition= ruleruleDefinition EOF ;
    public final EObject entryRuleruleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleruleDefinition = null;


        try {
            // InternalMyDsl.g:295:55: (iv_ruleruleDefinition= ruleruleDefinition EOF )
            // InternalMyDsl.g:296:2: iv_ruleruleDefinition= ruleruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getRuleDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleruleDefinition=ruleruleDefinition();

            state._fsp--;

             current =iv_ruleruleDefinition; 
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
    // $ANTLR end "entryRuleruleDefinition"


    // $ANTLR start "ruleruleDefinition"
    // InternalMyDsl.g:302:1: ruleruleDefinition returns [EObject current=null] : (this_LiveToDeadRule_0= ruleLiveToDeadRule | this_LiveToAliveRule_1= ruleLiveToAliveRule | this_DeadToAliveRule_2= ruleDeadToAliveRule ) ;
    public final EObject ruleruleDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_LiveToDeadRule_0 = null;

        EObject this_LiveToAliveRule_1 = null;

        EObject this_DeadToAliveRule_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:308:2: ( (this_LiveToDeadRule_0= ruleLiveToDeadRule | this_LiveToAliveRule_1= ruleLiveToAliveRule | this_DeadToAliveRule_2= ruleDeadToAliveRule ) )
            // InternalMyDsl.g:309:2: (this_LiveToDeadRule_0= ruleLiveToDeadRule | this_LiveToAliveRule_1= ruleLiveToAliveRule | this_DeadToAliveRule_2= ruleDeadToAliveRule )
            {
            // InternalMyDsl.g:309:2: (this_LiveToDeadRule_0= ruleLiveToDeadRule | this_LiveToAliveRule_1= ruleLiveToAliveRule | this_DeadToAliveRule_2= ruleDeadToAliveRule )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 20:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:310:3: this_LiveToDeadRule_0= ruleLiveToDeadRule
                    {

                    			newCompositeNode(grammarAccess.getRuleDefinitionAccess().getLiveToDeadRuleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiveToDeadRule_0=ruleLiveToDeadRule();

                    state._fsp--;


                    			current = this_LiveToDeadRule_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:319:3: this_LiveToAliveRule_1= ruleLiveToAliveRule
                    {

                    			newCompositeNode(grammarAccess.getRuleDefinitionAccess().getLiveToAliveRuleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiveToAliveRule_1=ruleLiveToAliveRule();

                    state._fsp--;


                    			current = this_LiveToAliveRule_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:328:3: this_DeadToAliveRule_2= ruleDeadToAliveRule
                    {

                    			newCompositeNode(grammarAccess.getRuleDefinitionAccess().getDeadToAliveRuleParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeadToAliveRule_2=ruleDeadToAliveRule();

                    state._fsp--;


                    			current = this_DeadToAliveRule_2;
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
    // $ANTLR end "ruleruleDefinition"


    // $ANTLR start "entryRuleLiveToDeadRule"
    // InternalMyDsl.g:340:1: entryRuleLiveToDeadRule returns [EObject current=null] : iv_ruleLiveToDeadRule= ruleLiveToDeadRule EOF ;
    public final EObject entryRuleLiveToDeadRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiveToDeadRule = null;


        try {
            // InternalMyDsl.g:340:55: (iv_ruleLiveToDeadRule= ruleLiveToDeadRule EOF )
            // InternalMyDsl.g:341:2: iv_ruleLiveToDeadRule= ruleLiveToDeadRule EOF
            {
             newCompositeNode(grammarAccess.getLiveToDeadRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiveToDeadRule=ruleLiveToDeadRule();

            state._fsp--;

             current =iv_ruleLiveToDeadRule; 
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
    // $ANTLR end "entryRuleLiveToDeadRule"


    // $ANTLR start "ruleLiveToDeadRule"
    // InternalMyDsl.g:347:1: ruleLiveToDeadRule returns [EObject current=null] : (otherlv_0= 'live_to_dead' otherlv_1= 'if' otherlv_2= 'neighbors' ( (lv_condition_3_0= ruleCondition ) ) ) ;
    public final EObject ruleLiveToDeadRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_condition_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:353:2: ( (otherlv_0= 'live_to_dead' otherlv_1= 'if' otherlv_2= 'neighbors' ( (lv_condition_3_0= ruleCondition ) ) ) )
            // InternalMyDsl.g:354:2: (otherlv_0= 'live_to_dead' otherlv_1= 'if' otherlv_2= 'neighbors' ( (lv_condition_3_0= ruleCondition ) ) )
            {
            // InternalMyDsl.g:354:2: (otherlv_0= 'live_to_dead' otherlv_1= 'if' otherlv_2= 'neighbors' ( (lv_condition_3_0= ruleCondition ) ) )
            // InternalMyDsl.g:355:3: otherlv_0= 'live_to_dead' otherlv_1= 'if' otherlv_2= 'neighbors' ( (lv_condition_3_0= ruleCondition ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getLiveToDeadRuleAccess().getLive_to_deadKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getLiveToDeadRuleAccess().getIfKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getLiveToDeadRuleAccess().getNeighborsKeyword_2());
            		
            // InternalMyDsl.g:367:3: ( (lv_condition_3_0= ruleCondition ) )
            // InternalMyDsl.g:368:4: (lv_condition_3_0= ruleCondition )
            {
            // InternalMyDsl.g:368:4: (lv_condition_3_0= ruleCondition )
            // InternalMyDsl.g:369:5: lv_condition_3_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getLiveToDeadRuleAccess().getConditionConditionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_condition_3_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLiveToDeadRuleRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_3_0,
            						"gameofLife.MyDsl.Condition");
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
    // $ANTLR end "ruleLiveToDeadRule"


    // $ANTLR start "entryRuleLiveToAliveRule"
    // InternalMyDsl.g:390:1: entryRuleLiveToAliveRule returns [EObject current=null] : iv_ruleLiveToAliveRule= ruleLiveToAliveRule EOF ;
    public final EObject entryRuleLiveToAliveRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiveToAliveRule = null;


        try {
            // InternalMyDsl.g:390:56: (iv_ruleLiveToAliveRule= ruleLiveToAliveRule EOF )
            // InternalMyDsl.g:391:2: iv_ruleLiveToAliveRule= ruleLiveToAliveRule EOF
            {
             newCompositeNode(grammarAccess.getLiveToAliveRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiveToAliveRule=ruleLiveToAliveRule();

            state._fsp--;

             current =iv_ruleLiveToAliveRule; 
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
    // $ANTLR end "entryRuleLiveToAliveRule"


    // $ANTLR start "ruleLiveToAliveRule"
    // InternalMyDsl.g:397:1: ruleLiveToAliveRule returns [EObject current=null] : (otherlv_0= 'live_to_alive' otherlv_1= 'if' otherlv_2= 'neighbors' ( (lv_condition_3_0= ruleCondition ) ) ) ;
    public final EObject ruleLiveToAliveRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_condition_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:403:2: ( (otherlv_0= 'live_to_alive' otherlv_1= 'if' otherlv_2= 'neighbors' ( (lv_condition_3_0= ruleCondition ) ) ) )
            // InternalMyDsl.g:404:2: (otherlv_0= 'live_to_alive' otherlv_1= 'if' otherlv_2= 'neighbors' ( (lv_condition_3_0= ruleCondition ) ) )
            {
            // InternalMyDsl.g:404:2: (otherlv_0= 'live_to_alive' otherlv_1= 'if' otherlv_2= 'neighbors' ( (lv_condition_3_0= ruleCondition ) ) )
            // InternalMyDsl.g:405:3: otherlv_0= 'live_to_alive' otherlv_1= 'if' otherlv_2= 'neighbors' ( (lv_condition_3_0= ruleCondition ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getLiveToAliveRuleAccess().getLive_to_aliveKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getLiveToAliveRuleAccess().getIfKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getLiveToAliveRuleAccess().getNeighborsKeyword_2());
            		
            // InternalMyDsl.g:417:3: ( (lv_condition_3_0= ruleCondition ) )
            // InternalMyDsl.g:418:4: (lv_condition_3_0= ruleCondition )
            {
            // InternalMyDsl.g:418:4: (lv_condition_3_0= ruleCondition )
            // InternalMyDsl.g:419:5: lv_condition_3_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getLiveToAliveRuleAccess().getConditionConditionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_condition_3_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLiveToAliveRuleRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_3_0,
            						"gameofLife.MyDsl.Condition");
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
    // $ANTLR end "ruleLiveToAliveRule"


    // $ANTLR start "entryRuleDeadToAliveRule"
    // InternalMyDsl.g:440:1: entryRuleDeadToAliveRule returns [EObject current=null] : iv_ruleDeadToAliveRule= ruleDeadToAliveRule EOF ;
    public final EObject entryRuleDeadToAliveRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeadToAliveRule = null;


        try {
            // InternalMyDsl.g:440:56: (iv_ruleDeadToAliveRule= ruleDeadToAliveRule EOF )
            // InternalMyDsl.g:441:2: iv_ruleDeadToAliveRule= ruleDeadToAliveRule EOF
            {
             newCompositeNode(grammarAccess.getDeadToAliveRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeadToAliveRule=ruleDeadToAliveRule();

            state._fsp--;

             current =iv_ruleDeadToAliveRule; 
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
    // $ANTLR end "entryRuleDeadToAliveRule"


    // $ANTLR start "ruleDeadToAliveRule"
    // InternalMyDsl.g:447:1: ruleDeadToAliveRule returns [EObject current=null] : (otherlv_0= 'dead_to_alive' otherlv_1= 'if' otherlv_2= 'neighbors' ( (lv_condition_3_0= ruleCondition ) ) ) ;
    public final EObject ruleDeadToAliveRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_condition_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:453:2: ( (otherlv_0= 'dead_to_alive' otherlv_1= 'if' otherlv_2= 'neighbors' ( (lv_condition_3_0= ruleCondition ) ) ) )
            // InternalMyDsl.g:454:2: (otherlv_0= 'dead_to_alive' otherlv_1= 'if' otherlv_2= 'neighbors' ( (lv_condition_3_0= ruleCondition ) ) )
            {
            // InternalMyDsl.g:454:2: (otherlv_0= 'dead_to_alive' otherlv_1= 'if' otherlv_2= 'neighbors' ( (lv_condition_3_0= ruleCondition ) ) )
            // InternalMyDsl.g:455:3: otherlv_0= 'dead_to_alive' otherlv_1= 'if' otherlv_2= 'neighbors' ( (lv_condition_3_0= ruleCondition ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getDeadToAliveRuleAccess().getDead_to_aliveKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getDeadToAliveRuleAccess().getIfKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getDeadToAliveRuleAccess().getNeighborsKeyword_2());
            		
            // InternalMyDsl.g:467:3: ( (lv_condition_3_0= ruleCondition ) )
            // InternalMyDsl.g:468:4: (lv_condition_3_0= ruleCondition )
            {
            // InternalMyDsl.g:468:4: (lv_condition_3_0= ruleCondition )
            // InternalMyDsl.g:469:5: lv_condition_3_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getDeadToAliveRuleAccess().getConditionConditionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_condition_3_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeadToAliveRuleRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_3_0,
            						"gameofLife.MyDsl.Condition");
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
    // $ANTLR end "ruleDeadToAliveRule"


    // $ANTLR start "entryRulestepsDefinition"
    // InternalMyDsl.g:490:1: entryRulestepsDefinition returns [EObject current=null] : iv_rulestepsDefinition= rulestepsDefinition EOF ;
    public final EObject entryRulestepsDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestepsDefinition = null;


        try {
            // InternalMyDsl.g:490:56: (iv_rulestepsDefinition= rulestepsDefinition EOF )
            // InternalMyDsl.g:491:2: iv_rulestepsDefinition= rulestepsDefinition EOF
            {
             newCompositeNode(grammarAccess.getStepsDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestepsDefinition=rulestepsDefinition();

            state._fsp--;

             current =iv_rulestepsDefinition; 
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
    // $ANTLR end "entryRulestepsDefinition"


    // $ANTLR start "rulestepsDefinition"
    // InternalMyDsl.g:497:1: rulestepsDefinition returns [EObject current=null] : (otherlv_0= 'steps' ( (lv_count_1_0= RULE_INT ) ) ) ;
    public final EObject rulestepsDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_count_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:503:2: ( (otherlv_0= 'steps' ( (lv_count_1_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:504:2: (otherlv_0= 'steps' ( (lv_count_1_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:504:2: (otherlv_0= 'steps' ( (lv_count_1_0= RULE_INT ) ) )
            // InternalMyDsl.g:505:3: otherlv_0= 'steps' ( (lv_count_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getStepsDefinitionAccess().getStepsKeyword_0());
            		
            // InternalMyDsl.g:509:3: ( (lv_count_1_0= RULE_INT ) )
            // InternalMyDsl.g:510:4: (lv_count_1_0= RULE_INT )
            {
            // InternalMyDsl.g:510:4: (lv_count_1_0= RULE_INT )
            // InternalMyDsl.g:511:5: lv_count_1_0= RULE_INT
            {
            lv_count_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_count_1_0, grammarAccess.getStepsDefinitionAccess().getCountINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStepsDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"count",
            						lv_count_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "rulestepsDefinition"


    // $ANTLR start "entryRuleCondition"
    // InternalMyDsl.g:531:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalMyDsl.g:531:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalMyDsl.g:532:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalMyDsl.g:538:1: ruleCondition returns [EObject current=null] : ( (otherlv_0= '>' ( (lv_number_1_0= RULE_INT ) ) ) | (otherlv_2= '<' ( (lv_number_3_0= RULE_INT ) ) ) | (otherlv_4= '=' ( (lv_number_5_0= RULE_INT ) ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_number_1_0=null;
        Token otherlv_2=null;
        Token lv_number_3_0=null;
        Token otherlv_4=null;
        Token lv_number_5_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:544:2: ( ( (otherlv_0= '>' ( (lv_number_1_0= RULE_INT ) ) ) | (otherlv_2= '<' ( (lv_number_3_0= RULE_INT ) ) ) | (otherlv_4= '=' ( (lv_number_5_0= RULE_INT ) ) ) ) )
            // InternalMyDsl.g:545:2: ( (otherlv_0= '>' ( (lv_number_1_0= RULE_INT ) ) ) | (otherlv_2= '<' ( (lv_number_3_0= RULE_INT ) ) ) | (otherlv_4= '=' ( (lv_number_5_0= RULE_INT ) ) ) )
            {
            // InternalMyDsl.g:545:2: ( (otherlv_0= '>' ( (lv_number_1_0= RULE_INT ) ) ) | (otherlv_2= '<' ( (lv_number_3_0= RULE_INT ) ) ) | (otherlv_4= '=' ( (lv_number_5_0= RULE_INT ) ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt5=1;
                }
                break;
            case 23:
                {
                alt5=2;
                }
                break;
            case 24:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:546:3: (otherlv_0= '>' ( (lv_number_1_0= RULE_INT ) ) )
                    {
                    // InternalMyDsl.g:546:3: (otherlv_0= '>' ( (lv_number_1_0= RULE_INT ) ) )
                    // InternalMyDsl.g:547:4: otherlv_0= '>' ( (lv_number_1_0= RULE_INT ) )
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getGreaterThanSignKeyword_0_0());
                    			
                    // InternalMyDsl.g:551:4: ( (lv_number_1_0= RULE_INT ) )
                    // InternalMyDsl.g:552:5: (lv_number_1_0= RULE_INT )
                    {
                    // InternalMyDsl.g:552:5: (lv_number_1_0= RULE_INT )
                    // InternalMyDsl.g:553:6: lv_number_1_0= RULE_INT
                    {
                    lv_number_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_number_1_0, grammarAccess.getConditionAccess().getNumberINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"number",
                    							lv_number_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:571:3: (otherlv_2= '<' ( (lv_number_3_0= RULE_INT ) ) )
                    {
                    // InternalMyDsl.g:571:3: (otherlv_2= '<' ( (lv_number_3_0= RULE_INT ) ) )
                    // InternalMyDsl.g:572:4: otherlv_2= '<' ( (lv_number_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getLessThanSignKeyword_1_0());
                    			
                    // InternalMyDsl.g:576:4: ( (lv_number_3_0= RULE_INT ) )
                    // InternalMyDsl.g:577:5: (lv_number_3_0= RULE_INT )
                    {
                    // InternalMyDsl.g:577:5: (lv_number_3_0= RULE_INT )
                    // InternalMyDsl.g:578:6: lv_number_3_0= RULE_INT
                    {
                    lv_number_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_number_3_0, grammarAccess.getConditionAccess().getNumberINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"number",
                    							lv_number_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:596:3: (otherlv_4= '=' ( (lv_number_5_0= RULE_INT ) ) )
                    {
                    // InternalMyDsl.g:596:3: (otherlv_4= '=' ( (lv_number_5_0= RULE_INT ) ) )
                    // InternalMyDsl.g:597:4: otherlv_4= '=' ( (lv_number_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getEqualsSignKeyword_2_0());
                    			
                    // InternalMyDsl.g:601:4: ( (lv_number_5_0= RULE_INT ) )
                    // InternalMyDsl.g:602:5: (lv_number_5_0= RULE_INT )
                    {
                    // InternalMyDsl.g:602:5: (lv_number_5_0= RULE_INT )
                    // InternalMyDsl.g:603:6: lv_number_5_0= RULE_INT
                    {
                    lv_number_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_number_5_0, grammarAccess.getConditionAccess().getNumberINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"number",
                    							lv_number_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleCellCoord"
    // InternalMyDsl.g:624:1: entryRuleCellCoord returns [EObject current=null] : iv_ruleCellCoord= ruleCellCoord EOF ;
    public final EObject entryRuleCellCoord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellCoord = null;


        try {
            // InternalMyDsl.g:624:50: (iv_ruleCellCoord= ruleCellCoord EOF )
            // InternalMyDsl.g:625:2: iv_ruleCellCoord= ruleCellCoord EOF
            {
             newCompositeNode(grammarAccess.getCellCoordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCellCoord=ruleCellCoord();

            state._fsp--;

             current =iv_ruleCellCoord; 
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
    // $ANTLR end "entryRuleCellCoord"


    // $ANTLR start "ruleCellCoord"
    // InternalMyDsl.g:631:1: ruleCellCoord returns [EObject current=null] : (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' ) ;
    public final EObject ruleCellCoord() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token otherlv_2=null;
        Token lv_y_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:637:2: ( (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' ) )
            // InternalMyDsl.g:638:2: (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' )
            {
            // InternalMyDsl.g:638:2: (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' )
            // InternalMyDsl.g:639:3: otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCellCoordAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMyDsl.g:643:3: ( (lv_x_1_0= RULE_INT ) )
            // InternalMyDsl.g:644:4: (lv_x_1_0= RULE_INT )
            {
            // InternalMyDsl.g:644:4: (lv_x_1_0= RULE_INT )
            // InternalMyDsl.g:645:5: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_x_1_0, grammarAccess.getCellCoordAccess().getXINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCellCoordRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getCellCoordAccess().getCommaKeyword_2());
            		
            // InternalMyDsl.g:665:3: ( (lv_y_3_0= RULE_INT ) )
            // InternalMyDsl.g:666:4: (lv_y_3_0= RULE_INT )
            {
            // InternalMyDsl.g:666:4: (lv_y_3_0= RULE_INT )
            // InternalMyDsl.g:667:5: lv_y_3_0= RULE_INT
            {
            lv_y_3_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_y_3_0, grammarAccess.getCellCoordAccess().getYINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCellCoordRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCellCoordAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleCellCoord"


    // $ANTLR start "entryRuleNeighbor"
    // InternalMyDsl.g:691:1: entryRuleNeighbor returns [EObject current=null] : iv_ruleNeighbor= ruleNeighbor EOF ;
    public final EObject entryRuleNeighbor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNeighbor = null;


        try {
            // InternalMyDsl.g:691:49: (iv_ruleNeighbor= ruleNeighbor EOF )
            // InternalMyDsl.g:692:2: iv_ruleNeighbor= ruleNeighbor EOF
            {
             newCompositeNode(grammarAccess.getNeighborRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNeighbor=ruleNeighbor();

            state._fsp--;

             current =iv_ruleNeighbor; 
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
    // $ANTLR end "entryRuleNeighbor"


    // $ANTLR start "ruleNeighbor"
    // InternalMyDsl.g:698:1: ruleNeighbor returns [EObject current=null] : (otherlv_0= '(' ( (lv_dx_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_dy_3_0= RULE_INT ) ) otherlv_4= ')' ) ;
    public final EObject ruleNeighbor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_dx_1_0=null;
        Token otherlv_2=null;
        Token lv_dy_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:704:2: ( (otherlv_0= '(' ( (lv_dx_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_dy_3_0= RULE_INT ) ) otherlv_4= ')' ) )
            // InternalMyDsl.g:705:2: (otherlv_0= '(' ( (lv_dx_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_dy_3_0= RULE_INT ) ) otherlv_4= ')' )
            {
            // InternalMyDsl.g:705:2: (otherlv_0= '(' ( (lv_dx_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_dy_3_0= RULE_INT ) ) otherlv_4= ')' )
            // InternalMyDsl.g:706:3: otherlv_0= '(' ( (lv_dx_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_dy_3_0= RULE_INT ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getNeighborAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMyDsl.g:710:3: ( (lv_dx_1_0= RULE_INT ) )
            // InternalMyDsl.g:711:4: (lv_dx_1_0= RULE_INT )
            {
            // InternalMyDsl.g:711:4: (lv_dx_1_0= RULE_INT )
            // InternalMyDsl.g:712:5: lv_dx_1_0= RULE_INT
            {
            lv_dx_1_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_dx_1_0, grammarAccess.getNeighborAccess().getDxINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNeighborRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dx",
            						lv_dx_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getNeighborAccess().getCommaKeyword_2());
            		
            // InternalMyDsl.g:732:3: ( (lv_dy_3_0= RULE_INT ) )
            // InternalMyDsl.g:733:4: (lv_dy_3_0= RULE_INT )
            {
            // InternalMyDsl.g:733:4: (lv_dy_3_0= RULE_INT )
            // InternalMyDsl.g:734:5: lv_dy_3_0= RULE_INT
            {
            lv_dy_3_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_dy_3_0, grammarAccess.getNeighborAccess().getDyINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNeighborRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dy",
            						lv_dy_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getNeighborAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleNeighbor"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000190002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});

}