// Generated from grammar/Pajama.g4 by ANTLR 4.4
package pajama.compile;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PajamaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__28=1, T__27=2, T__26=3, T__25=4, T__24=5, T__23=6, T__22=7, T__21=8, 
		T__20=9, T__19=10, T__18=11, T__17=12, T__16=13, T__15=14, T__14=15, T__13=16, 
		T__12=17, T__11=18, T__10=19, T__9=20, T__8=21, T__7=22, T__6=23, T__5=24, 
		T__4=25, T__3=26, T__2=27, T__1=28, T__0=29, NUMBER=30, STRING=31, ID=32, 
		ADD=33, MINUS=34, TIMES=35, DIV=36, CS=37, WS=38;
	public static final String[] tokenNames = {
		"<INVALID>", "'true'", "'!='", "'||'", "';'", "'{'", "'&&'", "'}'", "'rule'", 
		"'<='", "'when'", "'null'", "'('", "','", "'.'", "'false'", "'->'", "'case'", 
		"':'", "'>='", "'['", "'=='", "'<'", "'|'", "']'", "'>'", "'_'", "'@'", 
		"'!'", "')'", "NUMBER", "STRING", "ID", "'+'", "'-'", "'*'", "'/'", "CS", 
		"WS"
	};
	public static final int
		RULE_rules = 0, RULE_ruleStatement = 1, RULE_testStatement = 2, RULE_formal = 3, 
		RULE_ruleBody = 4, RULE_caseRule = 5, RULE_pattern = 6, RULE_pattInit = 7, 
		RULE_pattRest = 8, RULE_pattArray = 9, RULE_pattID = 10, RULE_pattRestID = 11, 
		RULE_pattAny = 12, RULE_pattObject = 13, RULE_pattListOrEmpty = 14, RULE_pattList = 15, 
		RULE_pattEmpty = 16, RULE_pattRestArray = 17, RULE_pattPairs = 18, RULE_pattPair = 19, 
		RULE_pattConstant = 20, RULE_params = 21, RULE_object = 22, RULE_pairs = 23, 
		RULE_pair = 24, RULE_key = 25, RULE_expr = 26, RULE_relMonom = 27, RULE_relOperation = 28, 
		RULE_relOperator = 29, RULE_arithOperation = 30, RULE_arithMonom = 31, 
		RULE_arithSingle = 32, RULE_idSingle = 33, RULE_operAddPlus = 34, RULE_operTimesDiv = 35, 
		RULE_constant = 36, RULE_args = 37;
	public static final String[] ruleNames = {
		"rules", "ruleStatement", "testStatement", "formal", "ruleBody", "caseRule", 
		"pattern", "pattInit", "pattRest", "pattArray", "pattID", "pattRestID", 
		"pattAny", "pattObject", "pattListOrEmpty", "pattList", "pattEmpty", "pattRestArray", 
		"pattPairs", "pattPair", "pattConstant", "params", "object", "pairs", 
		"pair", "key", "expr", "relMonom", "relOperation", "relOperator", "arithOperation", 
		"arithMonom", "arithSingle", "idSingle", "operAddPlus", "operTimesDiv", 
		"constant", "args"
	};

	@Override
	public String getGrammarFileName() { return "Pajama.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PajamaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RulesContext extends ParserRuleContext {
		public List<TestStatementContext> testStatement() {
			return getRuleContexts(TestStatementContext.class);
		}
		public List<RuleStatementContext> ruleStatement() {
			return getRuleContexts(RuleStatementContext.class);
		}
		public TestStatementContext testStatement(int i) {
			return getRuleContext(TestStatementContext.class,i);
		}
		public RuleStatementContext ruleStatement(int i) {
			return getRuleContext(RuleStatementContext.class,i);
		}
		public RulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rules; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesContext rules() throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76); ruleStatement();
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__21 );
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(81); testStatement();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PajamaParser.ID, 0); }
		public RuleBodyContext ruleBody() {
			return getRuleContext(RuleBodyContext.class,0);
		}
		public FormalContext formal() {
			return getRuleContext(FormalContext.class,0);
		}
		public RuleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitRuleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleStatementContext ruleStatement() throws RecognitionException {
		RuleStatementContext _localctx = new RuleStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ruleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); match(T__21);
			setState(88); match(ID);
			setState(89); formal();
			setState(90); match(T__24);
			setState(91); ruleBody();
			setState(92); match(T__22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TestStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PajamaParser.ID, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TestStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitTestStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestStatementContext testStatement() throws RecognitionException {
		TestStatementContext _localctx = new TestStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_testStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); match(ID);
			setState(95); match(T__17);
			setState(97);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__24) | (1L << T__18) | (1L << T__17) | (1L << T__14) | (1L << T__9) | (1L << T__1) | (1L << NUMBER) | (1L << STRING) | (1L << ID) | (1L << MINUS))) != 0)) {
				{
				setState(96); args();
				}
			}

			setState(99); match(T__0);
			setState(100); match(T__25);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PajamaParser.ID, 0); }
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitFormal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); match(T__17);
			setState(103); match(ID);
			setState(104); match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleBodyContext extends ParserRuleContext {
		public List<CaseRuleContext> caseRule() {
			return getRuleContexts(CaseRuleContext.class);
		}
		public CaseRuleContext caseRule(int i) {
			return getRuleContext(CaseRuleContext.class,i);
		}
		public RuleBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitRuleBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleBodyContext ruleBody() throws RecognitionException {
		RuleBodyContext _localctx = new RuleBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ruleBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); caseRule();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(107); match(T__6);
				setState(108); caseRule();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseRuleContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CaseRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseRule; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitCaseRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseRuleContext caseRule() throws RecognitionException {
		CaseRuleContext _localctx = new CaseRuleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_caseRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); match(T__12);
			setState(115); pattern();
			setState(116); match(T__13);
			setState(117); expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public PattRestContext pattRest() {
			return getRuleContext(PattRestContext.class,0);
		}
		public PattInitContext pattInit() {
			return getRuleContext(PattInitContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pattern);
		int _la;
		try {
			setState(127);
			switch (_input.LA(1)) {
			case T__28:
			case T__24:
			case T__18:
			case T__14:
			case T__9:
			case T__3:
			case NUMBER:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(119); pattInit();
				setState(121);
				_la = _input.LA(1);
				if (_la==T__19 || _la==T__2) {
					{
					setState(120); pattRest();
					}
				}

				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(123); match(T__17);
				setState(124); pattern();
				setState(125); match(T__0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PattInitContext extends ParserRuleContext {
		public PattInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattInit; }
	 
		public PattInitContext() { }
		public void copyFrom(PattInitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PCteContext extends PattInitContext {
		public PattConstantContext pattConstant() {
			return getRuleContext(PattConstantContext.class,0);
		}
		public PCteContext(PattInitContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPCte(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PArrayContext extends PattInitContext {
		public PattArrayContext pattArray() {
			return getRuleContext(PattArrayContext.class,0);
		}
		public PArrayContext(PattInitContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PObjectContext extends PattInitContext {
		public PattObjectContext pattObject() {
			return getRuleContext(PattObjectContext.class,0);
		}
		public PObjectContext(PattInitContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPObject(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PAnyContext extends PattInitContext {
		public PAnyContext(PattInitContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPAny(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PIdContext extends PattInitContext {
		public TerminalNode ID() { return getToken(PajamaParser.ID, 0); }
		public PIdContext(PattInitContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PattInitContext pattInit() throws RecognitionException {
		PattInitContext _localctx = new PattInitContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pattInit);
		try {
			setState(134);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new PIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(129); match(ID);
				}
				break;
			case 2:
				_localctx = new PAnyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(130); match(T__3);
				}
				break;
			case 3:
				_localctx = new PArrayContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(131); pattArray();
				}
				break;
			case 4:
				_localctx = new PObjectContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(132); pattObject();
				}
				break;
			case 5:
				_localctx = new PCteContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(133); pattConstant();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PattRestContext extends ParserRuleContext {
		public PattRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattRest; }
	 
		public PattRestContext() { }
		public void copyFrom(PattRestContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PRSaveContext extends PattRestContext {
		public TerminalNode ID() { return getToken(PajamaParser.ID, 0); }
		public PRSaveContext(PattRestContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPRSave(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PRWhenContext extends PattRestContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PRWhenContext(PattRestContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPRWhen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PattRestContext pattRest() throws RecognitionException {
		PattRestContext _localctx = new PattRestContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pattRest);
		try {
			setState(140);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new PRSaveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(136); match(T__2);
				setState(137); match(ID);
				}
				break;
			case T__19:
				_localctx = new PRWhenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(138); match(T__19);
				setState(139); expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PattArrayContext extends ParserRuleContext {
		public PattListOrEmptyContext pattListOrEmpty() {
			return getRuleContext(PattListOrEmptyContext.class,0);
		}
		public PattArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattArray; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPattArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PattArrayContext pattArray() throws RecognitionException {
		PattArrayContext _localctx = new PattArrayContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pattArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); match(T__9);
			setState(143); pattListOrEmpty();
			setState(144); match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PattIDContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PajamaParser.ID, 0); }
		public PattIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattID; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPattID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PattIDContext pattID() throws RecognitionException {
		PattIDContext _localctx = new PattIDContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pattID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PattRestIDContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PajamaParser.ID, 0); }
		public PattRestIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattRestID; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPattRestID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PattRestIDContext pattRestID() throws RecognitionException {
		PattRestIDContext _localctx = new PattRestIDContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_pattRestID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PattAnyContext extends ParserRuleContext {
		public PattAnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattAny; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPattAny(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PattAnyContext pattAny() throws RecognitionException {
		PattAnyContext _localctx = new PattAnyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pattAny);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PattObjectContext extends ParserRuleContext {
		public PattPairsContext pattPairs() {
			return getRuleContext(PattPairsContext.class,0);
		}
		public PattObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattObject; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPattObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PattObjectContext pattObject() throws RecognitionException {
		PattObjectContext _localctx = new PattObjectContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pattObject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); match(T__24);
			setState(154);
			_la = _input.LA(1);
			if (_la==STRING || _la==ID) {
				{
				setState(153); pattPairs();
				}
			}

			setState(156); match(T__22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PattListOrEmptyContext extends ParserRuleContext {
		public PattListContext pattList() {
			return getRuleContext(PattListContext.class,0);
		}
		public PattEmptyContext pattEmpty() {
			return getRuleContext(PattEmptyContext.class,0);
		}
		public PattListOrEmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattListOrEmpty; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPattListOrEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PattListOrEmptyContext pattListOrEmpty() throws RecognitionException {
		PattListOrEmptyContext _localctx = new PattListOrEmptyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pattListOrEmpty);
		try {
			setState(160);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(158); pattEmpty();
				}
				break;
			case T__28:
			case T__24:
			case T__18:
			case T__17:
			case T__14:
			case T__9:
			case T__3:
			case NUMBER:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(159); pattList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PattListContext extends ParserRuleContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public PattRestArrayContext pattRestArray() {
			return getRuleContext(PattRestArrayContext.class,0);
		}
		public PattListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPattList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PattListContext pattList() throws RecognitionException {
		PattListContext _localctx = new PattListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_pattList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); pattern();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(163); match(T__16);
				setState(164); pattern();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(170); match(T__6);
				setState(171); pattRestArray();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PattEmptyContext extends ParserRuleContext {
		public PattEmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattEmpty; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPattEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PattEmptyContext pattEmpty() throws RecognitionException {
		PattEmptyContext _localctx = new PattEmptyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_pattEmpty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PattRestArrayContext extends ParserRuleContext {
		public PattRestIDContext pattRestID() {
			return getRuleContext(PattRestIDContext.class,0);
		}
		public PattArrayContext pattArray() {
			return getRuleContext(PattArrayContext.class,0);
		}
		public PattAnyContext pattAny() {
			return getRuleContext(PattAnyContext.class,0);
		}
		public PattRestArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattRestArray; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPattRestArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PattRestArrayContext pattRestArray() throws RecognitionException {
		PattRestArrayContext _localctx = new PattRestArrayContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pattRestArray);
		try {
			setState(179);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(176); pattArray();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(177); pattRestID();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(178); pattAny();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PattPairsContext extends ParserRuleContext {
		public List<PattPairContext> pattPair() {
			return getRuleContexts(PattPairContext.class);
		}
		public PattPairContext pattPair(int i) {
			return getRuleContext(PattPairContext.class,i);
		}
		public PattPairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattPairs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPattPairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PattPairsContext pattPairs() throws RecognitionException {
		PattPairsContext _localctx = new PattPairsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_pattPairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); pattPair();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(182); match(T__16);
				setState(183); pattPair();
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PattPairContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public PattPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattPair; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPattPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PattPairContext pattPair() throws RecognitionException {
		PattPairContext _localctx = new PattPairContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_pattPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189); key();
			setState(190); match(T__11);
			setState(191); pattern();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PattConstantContext extends ParserRuleContext {
		public PattConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattConstant; }
	 
		public PattConstantContext() { }
		public void copyFrom(PattConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PatTrueContext extends PattConstantContext {
		public PatTrueContext(PattConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPatTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PatNumContext extends PattConstantContext {
		public TerminalNode NUMBER() { return getToken(PajamaParser.NUMBER, 0); }
		public PatNumContext(PattConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPatNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PatFalseContext extends PattConstantContext {
		public PatFalseContext(PattConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPatFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PatStringContext extends PattConstantContext {
		public TerminalNode STRING() { return getToken(PajamaParser.STRING, 0); }
		public PatStringContext(PattConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPatString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PatAnyContext extends PattConstantContext {
		public PatAnyContext(PattConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPatAny(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullPatContext extends PattConstantContext {
		public NullPatContext(PattConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitNullPat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PattConstantContext pattConstant() throws RecognitionException {
		PattConstantContext _localctx = new PattConstantContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_pattConstant);
		try {
			setState(199);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new PatNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(193); match(NUMBER);
				}
				break;
			case T__3:
				_localctx = new PatAnyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(194); match(T__3);
				}
				break;
			case STRING:
				_localctx = new PatStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(195); match(STRING);
				}
				break;
			case T__28:
				_localctx = new PatTrueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(196); match(T__28);
				}
				break;
			case T__14:
				_localctx = new PatFalseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(197); match(T__14);
				}
				break;
			case T__18:
				_localctx = new NullPatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(198); match(T__18);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); match(T__9);
			setState(202); args();
			setState(203); match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectContext extends ParserRuleContext {
		public PairsContext pairs() {
			return getRuleContext(PairsContext.class,0);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205); match(T__24);
			setState(207);
			_la = _input.LA(1);
			if (_la==STRING || _la==ID) {
				{
				setState(206); pairs();
				}
			}

			setState(209); match(T__22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PairsContext extends ParserRuleContext {
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairsContext pairs() throws RecognitionException {
		PairsContext _localctx = new PairsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_pairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211); pair();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(212); match(T__16);
				setState(213); pair();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PairContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219); key();
			setState(220); match(T__11);
			setState(221); expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PajamaParser.ID, 0); }
		public TerminalNode STRING() { return getToken(PajamaParser.STRING, 0); }
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public RelMonomContext relMonom(int i) {
			return getRuleContext(RelMonomContext.class,i);
		}
		public List<RelMonomContext> relMonom() {
			return getRuleContexts(RelMonomContext.class);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225); relMonom();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(226); match(T__26);
				setState(227); relMonom();
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelMonomContext extends ParserRuleContext {
		public RelOperationContext relOperation(int i) {
			return getRuleContext(RelOperationContext.class,i);
		}
		public List<RelOperationContext> relOperation() {
			return getRuleContexts(RelOperationContext.class);
		}
		public RelMonomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relMonom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitRelMonom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelMonomContext relMonom() throws RecognitionException {
		RelMonomContext _localctx = new RelMonomContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_relMonom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233); relOperation();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(234); match(T__23);
				setState(235); relOperation();
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelOperationContext extends ParserRuleContext {
		public ArithOperationContext arithOperation(int i) {
			return getRuleContext(ArithOperationContext.class,i);
		}
		public RelOperatorContext relOperator(int i) {
			return getRuleContext(RelOperatorContext.class,i);
		}
		public List<ArithOperationContext> arithOperation() {
			return getRuleContexts(ArithOperationContext.class);
		}
		public List<RelOperatorContext> relOperator() {
			return getRuleContexts(RelOperatorContext.class);
		}
		public RelOperationContext relOperation() {
			return getRuleContext(RelOperationContext.class,0);
		}
		public RelOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOperation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitRelOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelOperationContext relOperation() throws RecognitionException {
		RelOperationContext _localctx = new RelOperationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_relOperation);
		try {
			int _alt;
			setState(252);
			switch (_input.LA(1)) {
			case T__28:
			case T__24:
			case T__18:
			case T__17:
			case T__14:
			case T__9:
			case NUMBER:
			case STRING:
			case ID:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(241); arithOperation();
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(242); relOperator();
						setState(243); arithOperation();
						}
						} 
					}
					setState(249);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(250); match(T__1);
				setState(251); relOperation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelOperatorContext extends ParserRuleContext {
		public Token op;
		public RelOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitRelOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelOperatorContext relOperator() throws RecognitionException {
		RelOperatorContext _localctx = new RelOperatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_relOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			((RelOperatorContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__26) | (1L << T__23) | (1L << T__20) | (1L << T__10) | (1L << T__8) | (1L << T__7) | (1L << T__4))) != 0)) ) {
				((RelOperatorContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithOperationContext extends ParserRuleContext {
		public List<OperAddPlusContext> operAddPlus() {
			return getRuleContexts(OperAddPlusContext.class);
		}
		public List<ArithMonomContext> arithMonom() {
			return getRuleContexts(ArithMonomContext.class);
		}
		public ArithMonomContext arithMonom(int i) {
			return getRuleContext(ArithMonomContext.class,i);
		}
		public OperAddPlusContext operAddPlus(int i) {
			return getRuleContext(OperAddPlusContext.class,i);
		}
		public ArithOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithOperation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitArithOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithOperationContext arithOperation() throws RecognitionException {
		ArithOperationContext _localctx = new ArithOperationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_arithOperation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(256); arithMonom();
			setState(262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(257); operAddPlus();
					setState(258); arithMonom();
					}
					} 
				}
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithMonomContext extends ParserRuleContext {
		public List<ArithSingleContext> arithSingle() {
			return getRuleContexts(ArithSingleContext.class);
		}
		public ArithSingleContext arithSingle(int i) {
			return getRuleContext(ArithSingleContext.class,i);
		}
		public OperTimesDivContext operTimesDiv(int i) {
			return getRuleContext(OperTimesDivContext.class,i);
		}
		public List<OperTimesDivContext> operTimesDiv() {
			return getRuleContexts(OperTimesDivContext.class);
		}
		public ArithMonomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithMonom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitArithMonom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithMonomContext arithMonom() throws RecognitionException {
		ArithMonomContext _localctx = new ArithMonomContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_arithMonom);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(265); arithSingle(0);
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(266); operTimesDiv();
					setState(267); arithSingle(0);
					}
					} 
				}
				setState(273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithSingleContext extends ParserRuleContext {
		public ArithSingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithSingle; }
	 
		public ArithSingleContext() { }
		public void copyFrom(ArithSingleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecExprContext extends ArithSingleContext {
		public ArithOperationContext arithOperation() {
			return getRuleContext(ArithOperationContext.class,0);
		}
		public DecExprContext(ArithSingleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitDecExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectExprContext extends ArithSingleContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ObjectExprContext(ArithSingleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitObjectExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParExprContext extends ArithSingleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParExprContext(ArithSingleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitParExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAccessExprContext extends ArithSingleContext {
		public IdSingleContext idSingle() {
			return getRuleContext(IdSingleContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(PajamaParser.NUMBER, 0); }
		public ArrayAccessExprContext(ArithSingleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitArrayAccessExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantExprContext extends ArithSingleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantExprContext(ArithSingleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitConstantExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunCallExprContext extends ArithSingleContext {
		public ArithSingleContext arithSingle() {
			return getRuleContext(ArithSingleContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public FunCallExprContext(ArithSingleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitFunCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectAccessContext extends ArithSingleContext {
		public ArithSingleContext arithSingle() {
			return getRuleContext(ArithSingleContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(PajamaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PajamaParser.ID, i);
		}
		public ObjectAccessContext(ArithSingleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitObjectAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyArrayExprContext extends ArithSingleContext {
		public EmptyArrayExprContext(ArithSingleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitEmptyArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExprContext extends ArithSingleContext {
		public IdSingleContext idSingle() {
			return getRuleContext(IdSingleContext.class,0);
		}
		public IdExprContext(ArithSingleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithSingleContext arithSingle() throws RecognitionException {
		return arithSingle(0);
	}

	private ArithSingleContext arithSingle(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithSingleContext _localctx = new ArithSingleContext(_ctx, _parentState);
		ArithSingleContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_arithSingle, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				_localctx = new DecExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(275); match(MINUS);
				setState(276); arithOperation();
				}
				break;
			case 2:
				{
				_localctx = new ParExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(277); match(T__17);
				setState(278); expr();
				setState(279); match(T__0);
				}
				break;
			case 3:
				{
				_localctx = new EmptyArrayExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(281); match(T__9);
				setState(282); match(T__5);
				}
				break;
			case 4:
				{
				_localctx = new ArrayAccessExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(283); idSingle();
				setState(284); match(T__9);
				setState(285); match(NUMBER);
				setState(286); match(T__5);
				}
				break;
			case 5:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(288); idSingle();
				}
				break;
			case 6:
				{
				_localctx = new ObjectExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(289); object();
				}
				break;
			case 7:
				{
				_localctx = new ConstantExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(290); constant();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(307);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new FunCallExprContext(new ArithSingleContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithSingle);
						setState(293);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(294); match(T__17);
						setState(297);
						switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
						case 1:
							{
							setState(295); params();
							}
							break;
						case 2:
							{
							setState(296); args();
							}
							break;
						}
						setState(299); match(T__0);
						}
						break;
					case 2:
						{
						_localctx = new ObjectAccessContext(new ArithSingleContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithSingle);
						setState(300);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(303); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(301); match(T__15);
								setState(302); match(ID);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(305); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IdSingleContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PajamaParser.ID, 0); }
		public IdSingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idSingle; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitIdSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdSingleContext idSingle() throws RecognitionException {
		IdSingleContext _localctx = new IdSingleContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_idSingle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperAddPlusContext extends ParserRuleContext {
		public Token op;
		public OperAddPlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operAddPlus; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitOperAddPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperAddPlusContext operAddPlus() throws RecognitionException {
		OperAddPlusContext _localctx = new OperAddPlusContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_operAddPlus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			((OperAddPlusContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==MINUS) ) {
				((OperAddPlusContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperTimesDivContext extends ParserRuleContext {
		public Token op;
		public OperTimesDivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operTimesDiv; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitOperTimesDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperTimesDivContext operTimesDiv() throws RecognitionException {
		OperTimesDivContext _localctx = new OperTimesDivContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_operTimesDiv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			((OperTimesDivContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==TIMES || _la==DIV) ) {
				((OperTimesDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprNumContext extends ConstantContext {
		public TerminalNode NUMBER() { return getToken(PajamaParser.NUMBER, 0); }
		public ExprNumContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitExprNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStringContext extends ConstantContext {
		public TerminalNode STRING() { return getToken(PajamaParser.STRING, 0); }
		public ExprStringContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitExprString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprFalseContext extends ConstantContext {
		public ExprFalseContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitExprFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprTrueContext extends ConstantContext {
		public ExprTrueContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitExprTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNullContext extends ConstantContext {
		public ExprNullContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitExprNull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_constant);
		try {
			setState(323);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new ExprNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(318); match(NUMBER);
				}
				break;
			case STRING:
				_localctx = new ExprStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(319); match(STRING);
				}
				break;
			case T__28:
				_localctx = new ExprTrueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(320); match(T__28);
				}
				break;
			case T__14:
				_localctx = new ExprFalseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(321); match(T__14);
				}
				break;
			case T__18:
				_localctx = new ExprNullContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(322); match(T__18);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325); expr();
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(326); match(T__16);
				setState(327); expr();
				}
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 32: return arithSingle_sempred((ArithSingleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithSingle_sempred(ArithSingleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 7);
		case 1: return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u0150\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\6\2P\n\2\r\2\16\2Q\3\2"+
		"\7\2U\n\2\f\2\16\2X\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4d"+
		"\n\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6p\n\6\f\6\16\6s\13\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\5\b|\n\b\3\b\3\b\3\b\3\b\5\b\u0082\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u0089\n\t\3\n\3\n\3\n\3\n\5\n\u008f\n\n\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\5\17\u009d\n\17\3\17\3"+
		"\17\3\20\3\20\5\20\u00a3\n\20\3\21\3\21\3\21\7\21\u00a8\n\21\f\21\16\21"+
		"\u00ab\13\21\3\21\3\21\5\21\u00af\n\21\3\22\3\22\3\23\3\23\3\23\5\23\u00b6"+
		"\n\23\3\24\3\24\3\24\7\24\u00bb\n\24\f\24\16\24\u00be\13\24\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00ca\n\26\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\5\30\u00d2\n\30\3\30\3\30\3\31\3\31\3\31\7\31\u00d9\n"+
		"\31\f\31\16\31\u00dc\13\31\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34"+
		"\7\34\u00e7\n\34\f\34\16\34\u00ea\13\34\3\35\3\35\3\35\7\35\u00ef\n\35"+
		"\f\35\16\35\u00f2\13\35\3\36\3\36\3\36\3\36\7\36\u00f8\n\36\f\36\16\36"+
		"\u00fb\13\36\3\36\3\36\5\36\u00ff\n\36\3\37\3\37\3 \3 \3 \3 \7 \u0107"+
		"\n \f \16 \u010a\13 \3!\3!\3!\3!\7!\u0110\n!\f!\16!\u0113\13!\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0126"+
		"\n\"\3\"\3\"\3\"\3\"\5\"\u012c\n\"\3\"\3\"\3\"\3\"\6\"\u0132\n\"\r\"\16"+
		"\"\u0133\7\"\u0136\n\"\f\"\16\"\u0139\13\"\3#\3#\3$\3$\3%\3%\3&\3&\3&"+
		"\3&\3&\5&\u0146\n&\3\'\3\'\3\'\7\'\u014b\n\'\f\'\16\'\u014e\13\'\3\'\2"+
		"\3B(\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@"+
		"BDFHJL\2\6\3\2!\"\b\2\4\5\b\b\13\13\25\25\27\30\33\33\3\2#$\3\2%&\u0158"+
		"\2O\3\2\2\2\4Y\3\2\2\2\6`\3\2\2\2\bh\3\2\2\2\nl\3\2\2\2\ft\3\2\2\2\16"+
		"\u0081\3\2\2\2\20\u0088\3\2\2\2\22\u008e\3\2\2\2\24\u0090\3\2\2\2\26\u0094"+
		"\3\2\2\2\30\u0096\3\2\2\2\32\u0098\3\2\2\2\34\u009a\3\2\2\2\36\u00a2\3"+
		"\2\2\2 \u00a4\3\2\2\2\"\u00b0\3\2\2\2$\u00b5\3\2\2\2&\u00b7\3\2\2\2(\u00bf"+
		"\3\2\2\2*\u00c9\3\2\2\2,\u00cb\3\2\2\2.\u00cf\3\2\2\2\60\u00d5\3\2\2\2"+
		"\62\u00dd\3\2\2\2\64\u00e1\3\2\2\2\66\u00e3\3\2\2\28\u00eb\3\2\2\2:\u00fe"+
		"\3\2\2\2<\u0100\3\2\2\2>\u0102\3\2\2\2@\u010b\3\2\2\2B\u0125\3\2\2\2D"+
		"\u013a\3\2\2\2F\u013c\3\2\2\2H\u013e\3\2\2\2J\u0145\3\2\2\2L\u0147\3\2"+
		"\2\2NP\5\4\3\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RV\3\2\2\2SU\5\6"+
		"\4\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\3\3\2\2\2XV\3\2\2\2YZ\7"+
		"\n\2\2Z[\7\"\2\2[\\\5\b\5\2\\]\7\7\2\2]^\5\n\6\2^_\7\t\2\2_\5\3\2\2\2"+
		"`a\7\"\2\2ac\7\16\2\2bd\5L\'\2cb\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\7\37\2"+
		"\2fg\7\6\2\2g\7\3\2\2\2hi\7\16\2\2ij\7\"\2\2jk\7\37\2\2k\t\3\2\2\2lq\5"+
		"\f\7\2mn\7\31\2\2np\5\f\7\2om\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\13"+
		"\3\2\2\2sq\3\2\2\2tu\7\23\2\2uv\5\16\b\2vw\7\22\2\2wx\5\66\34\2x\r\3\2"+
		"\2\2y{\5\20\t\2z|\5\22\n\2{z\3\2\2\2{|\3\2\2\2|\u0082\3\2\2\2}~\7\16\2"+
		"\2~\177\5\16\b\2\177\u0080\7\37\2\2\u0080\u0082\3\2\2\2\u0081y\3\2\2\2"+
		"\u0081}\3\2\2\2\u0082\17\3\2\2\2\u0083\u0089\7\"\2\2\u0084\u0089\7\34"+
		"\2\2\u0085\u0089\5\24\13\2\u0086\u0089\5\34\17\2\u0087\u0089\5*\26\2\u0088"+
		"\u0083\3\2\2\2\u0088\u0084\3\2\2\2\u0088\u0085\3\2\2\2\u0088\u0086\3\2"+
		"\2\2\u0088\u0087\3\2\2\2\u0089\21\3\2\2\2\u008a\u008b\7\35\2\2\u008b\u008f"+
		"\7\"\2\2\u008c\u008d\7\f\2\2\u008d\u008f\5\66\34\2\u008e\u008a\3\2\2\2"+
		"\u008e\u008c\3\2\2\2\u008f\23\3\2\2\2\u0090\u0091\7\26\2\2\u0091\u0092"+
		"\5\36\20\2\u0092\u0093\7\32\2\2\u0093\25\3\2\2\2\u0094\u0095\7\"\2\2\u0095"+
		"\27\3\2\2\2\u0096\u0097\7\"\2\2\u0097\31\3\2\2\2\u0098\u0099\7\34\2\2"+
		"\u0099\33\3\2\2\2\u009a\u009c\7\7\2\2\u009b\u009d\5&\24\2\u009c\u009b"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7\t\2\2\u009f"+
		"\35\3\2\2\2\u00a0\u00a3\5\"\22\2\u00a1\u00a3\5 \21\2\u00a2\u00a0\3\2\2"+
		"\2\u00a2\u00a1\3\2\2\2\u00a3\37\3\2\2\2\u00a4\u00a9\5\16\b\2\u00a5\u00a6"+
		"\7\17\2\2\u00a6\u00a8\5\16\b\2\u00a7\u00a5\3\2\2\2\u00a8\u00ab\3\2\2\2"+
		"\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ae\3\2\2\2\u00ab\u00a9"+
		"\3\2\2\2\u00ac\u00ad\7\31\2\2\u00ad\u00af\5$\23\2\u00ae\u00ac\3\2\2\2"+
		"\u00ae\u00af\3\2\2\2\u00af!\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1#\3\2\2\2"+
		"\u00b2\u00b6\5\24\13\2\u00b3\u00b6\5\30\r\2\u00b4\u00b6\5\32\16\2\u00b5"+
		"\u00b2\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6%\3\2\2\2"+
		"\u00b7\u00bc\5(\25\2\u00b8\u00b9\7\17\2\2\u00b9\u00bb\5(\25\2\u00ba\u00b8"+
		"\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\'\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\5\64\33\2\u00c0\u00c1\7\24"+
		"\2\2\u00c1\u00c2\5\16\b\2\u00c2)\3\2\2\2\u00c3\u00ca\7 \2\2\u00c4\u00ca"+
		"\7\34\2\2\u00c5\u00ca\7!\2\2\u00c6\u00ca\7\3\2\2\u00c7\u00ca\7\21\2\2"+
		"\u00c8\u00ca\7\r\2\2\u00c9\u00c3\3\2\2\2\u00c9\u00c4\3\2\2\2\u00c9\u00c5"+
		"\3\2\2\2\u00c9\u00c6\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca"+
		"+\3\2\2\2\u00cb\u00cc\7\26\2\2\u00cc\u00cd\5L\'\2\u00cd\u00ce\7\32\2\2"+
		"\u00ce-\3\2\2\2\u00cf\u00d1\7\7\2\2\u00d0\u00d2\5\60\31\2\u00d1\u00d0"+
		"\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\7\t\2\2\u00d4"+
		"/\3\2\2\2\u00d5\u00da\5\62\32\2\u00d6\u00d7\7\17\2\2\u00d7\u00d9\5\62"+
		"\32\2\u00d8\u00d6\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\61\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\5\64\33"+
		"\2\u00de\u00df\7\24\2\2\u00df\u00e0\5\66\34\2\u00e0\63\3\2\2\2\u00e1\u00e2"+
		"\t\2\2\2\u00e2\65\3\2\2\2\u00e3\u00e8\58\35\2\u00e4\u00e5\7\5\2\2\u00e5"+
		"\u00e7\58\35\2\u00e6\u00e4\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9\67\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00f0"+
		"\5:\36\2\u00ec\u00ed\7\b\2\2\u00ed\u00ef\5:\36\2\u00ee\u00ec\3\2\2\2\u00ef"+
		"\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f19\3\2\2\2"+
		"\u00f2\u00f0\3\2\2\2\u00f3\u00f9\5> \2\u00f4\u00f5\5<\37\2\u00f5\u00f6"+
		"\5> \2\u00f6\u00f8\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00ff\3\2\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fc\u00fd\7\36\2\2\u00fd\u00ff\5:\36\2\u00fe\u00f3\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00ff;\3\2\2\2\u0100\u0101\t\3\2\2\u0101=\3\2\2\2\u0102"+
		"\u0108\5@!\2\u0103\u0104\5F$\2\u0104\u0105\5@!\2\u0105\u0107\3\2\2\2\u0106"+
		"\u0103\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2"+
		"\2\2\u0109?\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u0111\5B\"\2\u010c\u010d"+
		"\5H%\2\u010d\u010e\5B\"\2\u010e\u0110\3\2\2\2\u010f\u010c\3\2\2\2\u0110"+
		"\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112A\3\2\2\2"+
		"\u0113\u0111\3\2\2\2\u0114\u0115\b\"\1\2\u0115\u0116\7$\2\2\u0116\u0126"+
		"\5> \2\u0117\u0118\7\16\2\2\u0118\u0119\5\66\34\2\u0119\u011a\7\37\2\2"+
		"\u011a\u0126\3\2\2\2\u011b\u011c\7\26\2\2\u011c\u0126\7\32\2\2\u011d\u011e"+
		"\5D#\2\u011e\u011f\7\26\2\2\u011f\u0120\7 \2\2\u0120\u0121\7\32\2\2\u0121"+
		"\u0126\3\2\2\2\u0122\u0126\5D#\2\u0123\u0126\5.\30\2\u0124\u0126\5J&\2"+
		"\u0125\u0114\3\2\2\2\u0125\u0117\3\2\2\2\u0125\u011b\3\2\2\2\u0125\u011d"+
		"\3\2\2\2\u0125\u0122\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0124\3\2\2\2\u0126"+
		"\u0137\3\2\2\2\u0127\u0128\f\t\2\2\u0128\u012b\7\16\2\2\u0129\u012c\5"+
		",\27\2\u012a\u012c\5L\'\2\u012b\u0129\3\2\2\2\u012b\u012a\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0136\7\37\2\2\u012e\u0131\f"+
		"\6\2\2\u012f\u0130\7\20\2\2\u0130\u0132\7\"\2\2\u0131\u012f\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2"+
		"\2\2\u0135\u0127\3\2\2\2\u0135\u012e\3\2\2\2\u0136\u0139\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138C\3\2\2\2\u0139\u0137\3\2\2\2"+
		"\u013a\u013b\7\"\2\2\u013bE\3\2\2\2\u013c\u013d\t\4\2\2\u013dG\3\2\2\2"+
		"\u013e\u013f\t\5\2\2\u013fI\3\2\2\2\u0140\u0146\7 \2\2\u0141\u0146\7!"+
		"\2\2\u0142\u0146\7\3\2\2\u0143\u0146\7\21\2\2\u0144\u0146\7\r\2\2\u0145"+
		"\u0140\3\2\2\2\u0145\u0141\3\2\2\2\u0145\u0142\3\2\2\2\u0145\u0143\3\2"+
		"\2\2\u0145\u0144\3\2\2\2\u0146K\3\2\2\2\u0147\u014c\5\66\34\2\u0148\u0149"+
		"\7\17\2\2\u0149\u014b\5\66\34\2\u014a\u0148\3\2\2\2\u014b\u014e\3\2\2"+
		"\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014dM\3\2\2\2\u014e\u014c"+
		"\3\2\2\2 QVcq{\u0081\u0088\u008e\u009c\u00a2\u00a9\u00ae\u00b5\u00bc\u00c9"+
		"\u00d1\u00da\u00e8\u00f0\u00f9\u00fe\u0108\u0111\u0125\u012b\u0133\u0135"+
		"\u0137\u0145\u014c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}