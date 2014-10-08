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
		RULE_pattRest = 8, RULE_pattArray = 9, RULE_pattID = 10, RULE_pattAny = 11, 
		RULE_pattObject = 12, RULE_pattListOrEmpty = 13, RULE_pattList = 14, RULE_pattEmpty = 15, 
		RULE_pattRestArray = 16, RULE_pattPair = 17, RULE_pattConstant = 18, RULE_params = 19, 
		RULE_object = 20, RULE_pairs = 21, RULE_pair = 22, RULE_key = 23, RULE_expr = 24, 
		RULE_relMonom = 25, RULE_relOperation = 26, RULE_relOperator = 27, RULE_arithOperation = 28, 
		RULE_arithMonom = 29, RULE_arithSingle = 30, RULE_idSingle = 31, RULE_operAddPlus = 32, 
		RULE_operTimesDiv = 33, RULE_constant = 34, RULE_args = 35;
	public static final String[] ruleNames = {
		"rules", "ruleStatement", "testStatement", "formal", "ruleBody", "caseRule", 
		"pattern", "pattInit", "pattRest", "pattArray", "pattID", "pattAny", "pattObject", 
		"pattListOrEmpty", "pattList", "pattEmpty", "pattRestArray", "pattPair", 
		"pattConstant", "params", "object", "pairs", "pair", "key", "expr", "relMonom", 
		"relOperation", "relOperator", "arithOperation", "arithMonom", "arithSingle", 
		"idSingle", "operAddPlus", "operTimesDiv", "constant", "args"
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
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72); ruleStatement();
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__21 );
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(77); testStatement();
				}
				}
				setState(82);
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
			setState(83); match(T__21);
			setState(84); match(ID);
			setState(85); formal();
			setState(86); match(T__24);
			setState(87); ruleBody();
			setState(88); match(T__22);
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
			setState(90); match(ID);
			setState(91); match(T__17);
			setState(93);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__24) | (1L << T__18) | (1L << T__17) | (1L << T__14) | (1L << T__1) | (1L << NUMBER) | (1L << STRING) | (1L << ID) | (1L << MINUS))) != 0)) {
				{
				setState(92); args();
				}
			}

			setState(95); match(T__0);
			setState(96); match(T__25);
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
			setState(98); match(T__17);
			setState(99); match(ID);
			setState(100); match(T__0);
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
			setState(102); caseRule();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(103); match(T__6);
				setState(104); caseRule();
				}
				}
				setState(109);
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
			setState(110); match(T__12);
			setState(111); pattern();
			setState(112); match(T__13);
			setState(113); expr();
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
			setState(123);
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
				setState(115); pattInit();
				setState(117);
				_la = _input.LA(1);
				if (_la==T__19 || _la==T__2) {
					{
					setState(116); pattRest();
					}
				}

				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(119); match(T__17);
				setState(120); pattern();
				setState(121); match(T__0);
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
			setState(130);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new PIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(125); match(ID);
				}
				break;
			case 2:
				_localctx = new PAnyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(126); match(T__3);
				}
				break;
			case 3:
				_localctx = new PArrayContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(127); pattArray();
				}
				break;
			case 4:
				_localctx = new PObjectContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(128); pattObject();
				}
				break;
			case 5:
				_localctx = new PCteContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(129); pattConstant();
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
			setState(136);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new PRSaveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(132); match(T__2);
				setState(133); match(ID);
				}
				break;
			case T__19:
				_localctx = new PRWhenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(134); match(T__19);
				setState(135); expr();
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
			setState(138); match(T__9);
			setState(139); pattListOrEmpty();
			setState(140); match(T__5);
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
			setState(142); match(ID);
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
		enterRule(_localctx, 22, RULE_pattAny);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); match(T__3);
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
		public PattPairContext pattPair() {
			return getRuleContext(PattPairContext.class,0);
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
		enterRule(_localctx, 24, RULE_pattObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); match(T__24);
			setState(147); pattPair();
			setState(148); match(T__22);
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
		enterRule(_localctx, 26, RULE_pattListOrEmpty);
		try {
			setState(152);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(150); pattEmpty();
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
				setState(151); pattList();
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
		enterRule(_localctx, 28, RULE_pattList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); pattern();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(155); match(T__16);
				setState(156); pattern();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(162); match(T__6);
				setState(163); pattRestArray();
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
		enterRule(_localctx, 30, RULE_pattEmpty);
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
		public PattIDContext pattID() {
			return getRuleContext(PattIDContext.class,0);
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
		enterRule(_localctx, 32, RULE_pattRestArray);
		try {
			setState(171);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(168); pattArray();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(169); pattID();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170); pattAny();
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
		enterRule(_localctx, 34, RULE_pattPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173); key();
			setState(174); match(T__11);
			setState(175); pattern();
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
		enterRule(_localctx, 36, RULE_pattConstant);
		try {
			setState(183);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new PatNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(177); match(NUMBER);
				}
				break;
			case T__3:
				_localctx = new PatAnyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(178); match(T__3);
				}
				break;
			case STRING:
				_localctx = new PatStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(179); match(STRING);
				}
				break;
			case T__28:
				_localctx = new PatTrueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(180); match(T__28);
				}
				break;
			case T__14:
				_localctx = new PatFalseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(181); match(T__14);
				}
				break;
			case T__18:
				_localctx = new NullPatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(182); match(T__18);
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
		enterRule(_localctx, 38, RULE_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185); match(T__9);
			setState(186); args();
			setState(187); match(T__5);
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
		enterRule(_localctx, 40, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189); match(T__24);
			setState(191);
			_la = _input.LA(1);
			if (_la==STRING || _la==ID) {
				{
				setState(190); pairs();
				}
			}

			setState(193); match(T__22);
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
		enterRule(_localctx, 42, RULE_pairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195); pair();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(196); match(T__25);
				setState(197); pair();
				}
				}
				setState(202);
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
		enterRule(_localctx, 44, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); key();
			setState(204); match(T__11);
			setState(205); expr();
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
		enterRule(_localctx, 46, RULE_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
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
		enterRule(_localctx, 48, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); relMonom();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(210); match(T__26);
				setState(211); relMonom();
				}
				}
				setState(216);
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
		enterRule(_localctx, 50, RULE_relMonom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217); relOperation();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(218); match(T__23);
				setState(219); relOperation();
				}
				}
				setState(224);
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
		enterRule(_localctx, 52, RULE_relOperation);
		int _la;
		try {
			setState(236);
			switch (_input.LA(1)) {
			case T__28:
			case T__24:
			case T__18:
			case T__17:
			case T__14:
			case NUMBER:
			case STRING:
			case ID:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(225); arithOperation();
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__20) | (1L << T__10) | (1L << T__8) | (1L << T__7) | (1L << T__4))) != 0)) {
					{
					{
					setState(226); relOperator();
					setState(227); arithOperation();
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(234); match(T__1);
				setState(235); relOperation();
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
		enterRule(_localctx, 54, RULE_relOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			((RelOperatorContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__20) | (1L << T__10) | (1L << T__8) | (1L << T__7) | (1L << T__4))) != 0)) ) {
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
		enterRule(_localctx, 56, RULE_arithOperation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(240); arithMonom();
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(241); operAddPlus();
					setState(242); arithMonom();
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		enterRule(_localctx, 58, RULE_arithMonom);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(249); arithSingle(0);
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(250); operTimesDiv();
					setState(251); arithSingle(0);
					}
					} 
				}
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_arithSingle, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			switch (_input.LA(1)) {
			case MINUS:
				{
				_localctx = new DecExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(259); match(MINUS);
				setState(260); arithOperation();
				}
				break;
			case T__17:
				{
				_localctx = new ParExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(261); match(T__17);
				setState(262); expr();
				setState(263); match(T__0);
				}
				break;
			case ID:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(265); idSingle();
				}
				break;
			case T__24:
				{
				_localctx = new ObjectExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(266); object();
				}
				break;
			case T__28:
			case T__18:
			case T__14:
			case NUMBER:
			case STRING:
				{
				_localctx = new ConstantExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(267); constant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(284);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new FunCallExprContext(new ArithSingleContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithSingle);
						setState(270);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(271); match(T__17);
						setState(274);
						switch (_input.LA(1)) {
						case T__9:
							{
							setState(272); params();
							}
							break;
						case T__28:
						case T__24:
						case T__18:
						case T__17:
						case T__14:
						case T__1:
						case NUMBER:
						case STRING:
						case ID:
						case MINUS:
							{
							setState(273); args();
							}
							break;
						case T__0:
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(276); match(T__0);
						}
						break;
					case 2:
						{
						_localctx = new ObjectAccessContext(new ArithSingleContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithSingle);
						setState(277);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(280); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(278); match(T__15);
								setState(279); match(ID);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(282); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		enterRule(_localctx, 62, RULE_idSingle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289); match(ID);
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
		enterRule(_localctx, 64, RULE_operAddPlus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
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
		enterRule(_localctx, 66, RULE_operTimesDiv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
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
		enterRule(_localctx, 68, RULE_constant);
		try {
			setState(300);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new ExprNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(295); match(NUMBER);
				}
				break;
			case STRING:
				_localctx = new ExprStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(296); match(STRING);
				}
				break;
			case T__28:
				_localctx = new ExprTrueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(297); match(T__28);
				}
				break;
			case T__14:
				_localctx = new ExprFalseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(298); match(T__14);
				}
				break;
			case T__18:
				_localctx = new ExprNullContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(299); match(T__18);
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
		enterRule(_localctx, 70, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302); expr();
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(303); match(T__16);
				setState(304); expr();
				}
				}
				setState(309);
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
		case 30: return arithSingle_sempred((ArithSingleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithSingle_sempred(ArithSingleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 5);
		case 1: return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u0139\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\6\2L\n\2\r\2\16\2M\3\2\7\2Q\n\2\f\2"+
		"\16\2T\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4`\n\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6l\n\6\f\6\16\6o\13\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\5\bx\n\b\3\b\3\b\3\b\3\b\5\b~\n\b\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u0085\n\t\3\n\3\n\3\n\3\n\5\n\u008b\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\5\17\u009b\n\17\3\20\3\20\3\20\7"+
		"\20\u00a0\n\20\f\20\16\20\u00a3\13\20\3\20\3\20\5\20\u00a7\n\20\3\21\3"+
		"\21\3\22\3\22\3\22\5\22\u00ae\n\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u00ba\n\24\3\25\3\25\3\25\3\25\3\26\3\26\5\26\u00c2"+
		"\n\26\3\26\3\26\3\27\3\27\3\27\7\27\u00c9\n\27\f\27\16\27\u00cc\13\27"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\7\32\u00d7\n\32\f\32\16"+
		"\32\u00da\13\32\3\33\3\33\3\33\7\33\u00df\n\33\f\33\16\33\u00e2\13\33"+
		"\3\34\3\34\3\34\3\34\7\34\u00e8\n\34\f\34\16\34\u00eb\13\34\3\34\3\34"+
		"\5\34\u00ef\n\34\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u00f7\n\36\f\36\16"+
		"\36\u00fa\13\36\3\37\3\37\3\37\3\37\7\37\u0100\n\37\f\37\16\37\u0103\13"+
		"\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u010f\n \3 \3 \3 \3 \5 \u0115\n "+
		"\3 \3 \3 \3 \6 \u011b\n \r \16 \u011c\7 \u011f\n \f \16 \u0122\13 \3!"+
		"\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\5$\u012f\n$\3%\3%\3%\7%\u0134\n%\f%\16"+
		"%\u0137\13%\3%\2\3>&\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFH\2\6\3\2!\"\7\2\4\4\13\13\25\25\27\30\33\33\3\2#$\3"+
		"\2%&\u013f\2K\3\2\2\2\4U\3\2\2\2\6\\\3\2\2\2\bd\3\2\2\2\nh\3\2\2\2\fp"+
		"\3\2\2\2\16}\3\2\2\2\20\u0084\3\2\2\2\22\u008a\3\2\2\2\24\u008c\3\2\2"+
		"\2\26\u0090\3\2\2\2\30\u0092\3\2\2\2\32\u0094\3\2\2\2\34\u009a\3\2\2\2"+
		"\36\u009c\3\2\2\2 \u00a8\3\2\2\2\"\u00ad\3\2\2\2$\u00af\3\2\2\2&\u00b9"+
		"\3\2\2\2(\u00bb\3\2\2\2*\u00bf\3\2\2\2,\u00c5\3\2\2\2.\u00cd\3\2\2\2\60"+
		"\u00d1\3\2\2\2\62\u00d3\3\2\2\2\64\u00db\3\2\2\2\66\u00ee\3\2\2\28\u00f0"+
		"\3\2\2\2:\u00f2\3\2\2\2<\u00fb\3\2\2\2>\u010e\3\2\2\2@\u0123\3\2\2\2B"+
		"\u0125\3\2\2\2D\u0127\3\2\2\2F\u012e\3\2\2\2H\u0130\3\2\2\2JL\5\4\3\2"+
		"KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2NR\3\2\2\2OQ\5\6\4\2PO\3\2\2\2"+
		"QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\3\3\2\2\2TR\3\2\2\2UV\7\n\2\2VW\7\"\2"+
		"\2WX\5\b\5\2XY\7\7\2\2YZ\5\n\6\2Z[\7\t\2\2[\5\3\2\2\2\\]\7\"\2\2]_\7\16"+
		"\2\2^`\5H%\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7\37\2\2bc\7\6\2\2c\7\3\2"+
		"\2\2de\7\16\2\2ef\7\"\2\2fg\7\37\2\2g\t\3\2\2\2hm\5\f\7\2ij\7\31\2\2j"+
		"l\5\f\7\2ki\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\13\3\2\2\2om\3\2\2"+
		"\2pq\7\23\2\2qr\5\16\b\2rs\7\22\2\2st\5\62\32\2t\r\3\2\2\2uw\5\20\t\2"+
		"vx\5\22\n\2wv\3\2\2\2wx\3\2\2\2x~\3\2\2\2yz\7\16\2\2z{\5\16\b\2{|\7\37"+
		"\2\2|~\3\2\2\2}u\3\2\2\2}y\3\2\2\2~\17\3\2\2\2\177\u0085\7\"\2\2\u0080"+
		"\u0085\7\34\2\2\u0081\u0085\5\24\13\2\u0082\u0085\5\32\16\2\u0083\u0085"+
		"\5&\24\2\u0084\177\3\2\2\2\u0084\u0080\3\2\2\2\u0084\u0081\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\21\3\2\2\2\u0086\u0087\7\35\2"+
		"\2\u0087\u008b\7\"\2\2\u0088\u0089\7\f\2\2\u0089\u008b\5\62\32\2\u008a"+
		"\u0086\3\2\2\2\u008a\u0088\3\2\2\2\u008b\23\3\2\2\2\u008c\u008d\7\26\2"+
		"\2\u008d\u008e\5\34\17\2\u008e\u008f\7\32\2\2\u008f\25\3\2\2\2\u0090\u0091"+
		"\7\"\2\2\u0091\27\3\2\2\2\u0092\u0093\7\34\2\2\u0093\31\3\2\2\2\u0094"+
		"\u0095\7\7\2\2\u0095\u0096\5$\23\2\u0096\u0097\7\t\2\2\u0097\33\3\2\2"+
		"\2\u0098\u009b\5 \21\2\u0099\u009b\5\36\20\2\u009a\u0098\3\2\2\2\u009a"+
		"\u0099\3\2\2\2\u009b\35\3\2\2\2\u009c\u00a1\5\16\b\2\u009d\u009e\7\17"+
		"\2\2\u009e\u00a0\5\16\b\2\u009f\u009d\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a6\3\2\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a4\u00a5\7\31\2\2\u00a5\u00a7\5\"\22\2\u00a6\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\37\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9!\3\2\2\2\u00aa"+
		"\u00ae\5\24\13\2\u00ab\u00ae\5\26\f\2\u00ac\u00ae\5\30\r\2\u00ad\u00aa"+
		"\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae#\3\2\2\2\u00af"+
		"\u00b0\5\60\31\2\u00b0\u00b1\7\24\2\2\u00b1\u00b2\5\16\b\2\u00b2%\3\2"+
		"\2\2\u00b3\u00ba\7 \2\2\u00b4\u00ba\7\34\2\2\u00b5\u00ba\7!\2\2\u00b6"+
		"\u00ba\7\3\2\2\u00b7\u00ba\7\21\2\2\u00b8\u00ba\7\r\2\2\u00b9\u00b3\3"+
		"\2\2\2\u00b9\u00b4\3\2\2\2\u00b9\u00b5\3\2\2\2\u00b9\u00b6\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\'\3\2\2\2\u00bb\u00bc\7\26\2"+
		"\2\u00bc\u00bd\5H%\2\u00bd\u00be\7\32\2\2\u00be)\3\2\2\2\u00bf\u00c1\7"+
		"\7\2\2\u00c0\u00c2\5,\27\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c4\7\t\2\2\u00c4+\3\2\2\2\u00c5\u00ca\5.\30\2"+
		"\u00c6\u00c7\7\6\2\2\u00c7\u00c9\5.\30\2\u00c8\u00c6\3\2\2\2\u00c9\u00cc"+
		"\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb-\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cd\u00ce\5\60\31\2\u00ce\u00cf\7\24\2\2\u00cf\u00d0"+
		"\5\62\32\2\u00d0/\3\2\2\2\u00d1\u00d2\t\2\2\2\u00d2\61\3\2\2\2\u00d3\u00d8"+
		"\5\64\33\2\u00d4\u00d5\7\5\2\2\u00d5\u00d7\5\64\33\2\u00d6\u00d4\3\2\2"+
		"\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\63"+
		"\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00e0\5\66\34\2\u00dc\u00dd\7\b\2\2"+
		"\u00dd\u00df\5\66\34\2\u00de\u00dc\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de"+
		"\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\65\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3"+
		"\u00e9\5:\36\2\u00e4\u00e5\58\35\2\u00e5\u00e6\5:\36\2\u00e6\u00e8\3\2"+
		"\2\2\u00e7\u00e4\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00ef\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\7\36"+
		"\2\2\u00ed\u00ef\5\66\34\2\u00ee\u00e3\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef"+
		"\67\3\2\2\2\u00f0\u00f1\t\3\2\2\u00f19\3\2\2\2\u00f2\u00f8\5<\37\2\u00f3"+
		"\u00f4\5B\"\2\u00f4\u00f5\5<\37\2\u00f5\u00f7\3\2\2\2\u00f6\u00f3\3\2"+
		"\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		";\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u0101\5> \2\u00fc\u00fd\5D#\2\u00fd"+
		"\u00fe\5> \2\u00fe\u0100\3\2\2\2\u00ff\u00fc\3\2\2\2\u0100\u0103\3\2\2"+
		"\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102=\3\2\2\2\u0103\u0101"+
		"\3\2\2\2\u0104\u0105\b \1\2\u0105\u0106\7$\2\2\u0106\u010f\5:\36\2\u0107"+
		"\u0108\7\16\2\2\u0108\u0109\5\62\32\2\u0109\u010a\7\37\2\2\u010a\u010f"+
		"\3\2\2\2\u010b\u010f\5@!\2\u010c\u010f\5*\26\2\u010d\u010f\5F$\2\u010e"+
		"\u0104\3\2\2\2\u010e\u0107\3\2\2\2\u010e\u010b\3\2\2\2\u010e\u010c\3\2"+
		"\2\2\u010e\u010d\3\2\2\2\u010f\u0120\3\2\2\2\u0110\u0111\f\7\2\2\u0111"+
		"\u0114\7\16\2\2\u0112\u0115\5(\25\2\u0113\u0115\5H%\2\u0114\u0112\3\2"+
		"\2\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u011f\7\37\2\2\u0117\u011a\f\6\2\2\u0118\u0119\7\20\2\2\u0119\u011b\7"+
		"\"\2\2\u011a\u0118\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011a\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u0110\3\2\2\2\u011e\u0117\3\2"+
		"\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"?\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\7\"\2\2\u0124A\3\2\2\2\u0125"+
		"\u0126\t\4\2\2\u0126C\3\2\2\2\u0127\u0128\t\5\2\2\u0128E\3\2\2\2\u0129"+
		"\u012f\7 \2\2\u012a\u012f\7!\2\2\u012b\u012f\7\3\2\2\u012c\u012f\7\21"+
		"\2\2\u012d\u012f\7\r\2\2\u012e\u0129\3\2\2\2\u012e\u012a\3\2\2\2\u012e"+
		"\u012b\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012d\3\2\2\2\u012fG\3\2\2\2"+
		"\u0130\u0135\5\62\32\2\u0131\u0132\7\17\2\2\u0132\u0134\5\62\32\2\u0133"+
		"\u0131\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2"+
		"\2\2\u0136I\3\2\2\2\u0137\u0135\3\2\2\2\36MR_mw}\u0084\u008a\u009a\u00a1"+
		"\u00a6\u00ad\u00b9\u00c1\u00ca\u00d8\u00e0\u00e9\u00ee\u00f8\u0101\u010e"+
		"\u0114\u011c\u011e\u0120\u012e\u0135";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}