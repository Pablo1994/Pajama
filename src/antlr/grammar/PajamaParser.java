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
		T__27=1, T__26=2, T__25=3, T__24=4, T__23=5, T__22=6, T__21=7, T__20=8, 
		T__19=9, T__18=10, T__17=11, T__16=12, T__15=13, T__14=14, T__13=15, T__12=16, 
		T__11=17, T__10=18, T__9=19, T__8=20, T__7=21, T__6=22, T__5=23, T__4=24, 
		T__3=25, T__2=26, T__1=27, T__0=28, NUMBER=29, STRING=30, ID=31, ADD=32, 
		MINUS=33, TIMES=34, DIV=35, CS=36, WS=37;
	public static final String[] tokenNames = {
		"<INVALID>", "'true'", "'!='", "'||'", "';'", "'{'", "'&&'", "'}'", "'rule'", 
		"'<='", "'when'", "'null'", "'('", "','", "'.'", "'false'", "'->'", "'case'", 
		"':'", "'>='", "'['", "'=='", "'<'", "'|'", "']'", "'>'", "'@'", "'!'", 
		"')'", "NUMBER", "STRING", "ID", "'+'", "'-'", "'*'", "'/'", "CS", "WS"
	};
	public static final int
		RULE_rules = 0, RULE_ruleStatement = 1, RULE_formal = 2, RULE_ruleBody = 3, 
		RULE_caseRule = 4, RULE_pattern = 5, RULE_pattInit = 6, RULE_pattRest = 7, 
		RULE_pattArray = 8, RULE_pattID = 9, RULE_pattObject = 10, RULE_pattListOrEmpty = 11, 
		RULE_pattList = 12, RULE_pattEmpty = 13, RULE_pattRestArray = 14, RULE_pattPair = 15, 
		RULE_pattConstant = 16, RULE_params = 17, RULE_object = 18, RULE_pairs = 19, 
		RULE_pair = 20, RULE_key = 21, RULE_expr = 22, RULE_relMonom = 23, RULE_relOperation = 24, 
		RULE_relOperator = 25, RULE_arithOperation = 26, RULE_arithMonom = 27, 
		RULE_arithSingle = 28, RULE_idSingle = 29, RULE_operAddPlus = 30, RULE_operTimesDiv = 31, 
		RULE_constant = 32, RULE_args = 33;
	public static final String[] ruleNames = {
		"rules", "ruleStatement", "formal", "ruleBody", "caseRule", "pattern", 
		"pattInit", "pattRest", "pattArray", "pattID", "pattObject", "pattListOrEmpty", 
		"pattList", "pattEmpty", "pattRestArray", "pattPair", "pattConstant", 
		"params", "object", "pairs", "pair", "key", "expr", "relMonom", "relOperation", 
		"relOperator", "arithOperation", "arithMonom", "arithSingle", "idSingle", 
		"operAddPlus", "operTimesDiv", "constant", "args"
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
		public List<RuleStatementContext> ruleStatement() {
			return getRuleContexts(RuleStatementContext.class);
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
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68); ruleStatement();
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__20 );
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
			setState(73); match(T__20);
			setState(74); match(ID);
			setState(75); formal();
			setState(76); match(T__23);
			setState(77); ruleBody();
			setState(78); match(T__21);
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
		enterRule(_localctx, 4, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(T__16);
			setState(81); match(ID);
			setState(82); match(T__0);
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
		enterRule(_localctx, 6, RULE_ruleBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); caseRule();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(85); match(T__5);
				setState(86); caseRule();
				}
				}
				setState(91);
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
		enterRule(_localctx, 8, RULE_caseRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); match(T__11);
			setState(93); pattern();
			setState(94); match(T__12);
			setState(95); expr();
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
		enterRule(_localctx, 10, RULE_pattern);
		int _la;
		try {
			setState(105);
			switch (_input.LA(1)) {
			case T__27:
			case T__23:
			case T__17:
			case T__13:
			case T__8:
			case NUMBER:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(97); pattInit();
				setState(99);
				_la = _input.LA(1);
				if (_la==T__18 || _la==T__2) {
					{
					setState(98); pattRest();
					}
				}

				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(101); match(T__16);
				setState(102); pattern();
				setState(103); match(T__0);
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
		enterRule(_localctx, 12, RULE_pattInit);
		try {
			setState(111);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new PIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(107); match(ID);
				}
				break;
			case T__8:
				_localctx = new PArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(108); pattArray();
				}
				break;
			case T__23:
				_localctx = new PObjectContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(109); pattObject();
				}
				break;
			case T__27:
			case T__17:
			case T__13:
			case NUMBER:
			case STRING:
				_localctx = new PCteContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(110); pattConstant();
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

	public static class PattRestContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PajamaParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PattRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PajamaVisitor ) return ((PajamaVisitor<? extends T>)visitor).visitPattRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PattRestContext pattRest() throws RecognitionException {
		PattRestContext _localctx = new PattRestContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pattRest);
		try {
			setState(117);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(113); match(T__2);
				setState(114); match(ID);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(115); match(T__18);
				setState(116); expr();
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
		enterRule(_localctx, 16, RULE_pattArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119); match(T__8);
			setState(120); pattListOrEmpty();
			setState(121); match(T__4);
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
		enterRule(_localctx, 18, RULE_pattID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); match(ID);
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
		enterRule(_localctx, 20, RULE_pattObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); match(T__23);
			setState(126); pattPair();
			setState(127); match(T__21);
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
		enterRule(_localctx, 22, RULE_pattListOrEmpty);
		try {
			setState(131);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(129); pattEmpty();
				}
				break;
			case T__27:
			case T__23:
			case T__17:
			case T__16:
			case T__13:
			case T__8:
			case NUMBER:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(130); pattList();
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
		enterRule(_localctx, 24, RULE_pattList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133); pattern();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(134); match(T__15);
				setState(135); pattern();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(141); match(T__5);
				setState(142); pattRestArray();
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
		enterRule(_localctx, 26, RULE_pattEmpty);
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
		enterRule(_localctx, 28, RULE_pattRestArray);
		try {
			setState(149);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(147); pattArray();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(148); pattID();
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
		enterRule(_localctx, 30, RULE_pattPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); key();
			setState(152); match(T__10);
			setState(153); pattern();
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
		enterRule(_localctx, 32, RULE_pattConstant);
		try {
			setState(160);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new PatNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(155); match(NUMBER);
				}
				break;
			case STRING:
				_localctx = new PatStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(156); match(STRING);
				}
				break;
			case T__27:
				_localctx = new PatTrueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(157); match(T__27);
				}
				break;
			case T__13:
				_localctx = new PatFalseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(158); match(T__13);
				}
				break;
			case T__17:
				_localctx = new NullPatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(159); match(T__17);
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
		enterRule(_localctx, 34, RULE_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); match(T__8);
			setState(163); args();
			setState(164); match(T__4);
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
		enterRule(_localctx, 36, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); match(T__23);
			setState(168);
			_la = _input.LA(1);
			if (_la==STRING || _la==ID) {
				{
				setState(167); pairs();
				}
			}

			setState(170); match(T__21);
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
		enterRule(_localctx, 38, RULE_pairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172); pair();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(173); match(T__24);
				setState(174); pair();
				}
				}
				setState(179);
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
		enterRule(_localctx, 40, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180); key();
			setState(181); match(T__10);
			setState(182); expr();
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
		enterRule(_localctx, 42, RULE_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
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
		enterRule(_localctx, 44, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186); relMonom();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(187); match(T__25);
				setState(188); relMonom();
				}
				}
				setState(193);
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
		enterRule(_localctx, 46, RULE_relMonom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194); relOperation();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(195); match(T__22);
				setState(196); relOperation();
				}
				}
				setState(201);
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
		enterRule(_localctx, 48, RULE_relOperation);
		int _la;
		try {
			setState(213);
			switch (_input.LA(1)) {
			case T__27:
			case T__23:
			case T__17:
			case T__16:
			case T__13:
			case NUMBER:
			case STRING:
			case ID:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(202); arithOperation();
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__19) | (1L << T__9) | (1L << T__7) | (1L << T__6) | (1L << T__3))) != 0)) {
					{
					{
					setState(203); relOperator();
					setState(204); arithOperation();
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(211); match(T__1);
				setState(212); relOperation();
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
		enterRule(_localctx, 50, RULE_relOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__19) | (1L << T__9) | (1L << T__7) | (1L << T__6) | (1L << T__3))) != 0)) ) {
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
		enterRule(_localctx, 52, RULE_arithOperation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(217); arithMonom();
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(218); operAddPlus();
					setState(219); arithMonom();
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		enterRule(_localctx, 54, RULE_arithMonom);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(226); arithSingle(0);
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(227); operTimesDiv();
					setState(228); arithSingle(0);
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_arithSingle, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			switch (_input.LA(1)) {
			case MINUS:
				{
				_localctx = new DecExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(236); match(MINUS);
				setState(237); arithOperation();
				}
				break;
			case T__16:
				{
				_localctx = new ParExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(238); match(T__16);
				setState(239); expr();
				setState(240); match(T__0);
				}
				break;
			case ID:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(242); idSingle();
				}
				break;
			case T__23:
				{
				_localctx = new ObjectExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(243); object();
				}
				break;
			case T__27:
			case T__17:
			case T__13:
			case NUMBER:
			case STRING:
				{
				_localctx = new ConstantExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(244); constant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(260);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new FunCallExprContext(new ArithSingleContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithSingle);
						setState(247);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(248); match(T__16);
						setState(250);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__23) | (1L << T__17) | (1L << T__16) | (1L << T__13) | (1L << T__1) | (1L << NUMBER) | (1L << STRING) | (1L << ID) | (1L << MINUS))) != 0)) {
							{
							setState(249); args();
							}
						}

						setState(252); match(T__0);
						}
						break;
					case 2:
						{
						_localctx = new ObjectAccessContext(new ArithSingleContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithSingle);
						setState(253);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(256); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(254); match(T__14);
								setState(255); match(ID);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(258); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		enterRule(_localctx, 58, RULE_idSingle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265); match(ID);
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
		enterRule(_localctx, 60, RULE_operAddPlus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
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
		enterRule(_localctx, 62, RULE_operTimesDiv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
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
		enterRule(_localctx, 64, RULE_constant);
		try {
			setState(276);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new ExprNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(271); match(NUMBER);
				}
				break;
			case STRING:
				_localctx = new ExprStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(272); match(STRING);
				}
				break;
			case T__27:
				_localctx = new ExprTrueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(273); match(T__27);
				}
				break;
			case T__13:
				_localctx = new ExprFalseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(274); match(T__13);
				}
				break;
			case T__17:
				_localctx = new ExprNullContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(275); match(T__17);
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
		enterRule(_localctx, 66, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278); expr();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(279); match(T__15);
				setState(280); expr();
				}
				}
				setState(285);
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
		case 28: return arithSingle_sempred((ArithSingleContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\'\u0121\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\6\2H\n\2\r\2\16\2I\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5Z\n\5\f\5\16\5]\13\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\5\7f\n\7\3\7\3\7\3\7\3\7\5\7l\n\7\3\b\3\b\3\b\3\b\5\br\n\b\3"+
		"\t\3\t\3\t\3\t\5\tx\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\5\r\u0086\n\r\3\16\3\16\3\16\7\16\u008b\n\16\f\16\16\16\u008e\13"+
		"\16\3\16\3\16\5\16\u0092\n\16\3\17\3\17\3\20\3\20\5\20\u0098\n\20\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u00a3\n\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\5\24\u00ab\n\24\3\24\3\24\3\25\3\25\3\25\7\25\u00b2\n"+
		"\25\f\25\16\25\u00b5\13\25\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30"+
		"\7\30\u00c0\n\30\f\30\16\30\u00c3\13\30\3\31\3\31\3\31\7\31\u00c8\n\31"+
		"\f\31\16\31\u00cb\13\31\3\32\3\32\3\32\3\32\7\32\u00d1\n\32\f\32\16\32"+
		"\u00d4\13\32\3\32\3\32\5\32\u00d8\n\32\3\33\3\33\3\34\3\34\3\34\3\34\7"+
		"\34\u00e0\n\34\f\34\16\34\u00e3\13\34\3\35\3\35\3\35\3\35\7\35\u00e9\n"+
		"\35\f\35\16\35\u00ec\13\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\5\36\u00f8\n\36\3\36\3\36\3\36\5\36\u00fd\n\36\3\36\3\36\3\36\3"+
		"\36\6\36\u0103\n\36\r\36\16\36\u0104\7\36\u0107\n\36\f\36\16\36\u010a"+
		"\13\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\5\"\u0117\n\"\3#\3#\3"+
		"#\7#\u011c\n#\f#\16#\u011f\13#\3#\2\3:$\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\6\3\2 !\7\2\4\4\13\13\25\25\27"+
		"\30\33\33\3\2\"#\3\2$%\u0123\2G\3\2\2\2\4K\3\2\2\2\6R\3\2\2\2\bV\3\2\2"+
		"\2\n^\3\2\2\2\fk\3\2\2\2\16q\3\2\2\2\20w\3\2\2\2\22y\3\2\2\2\24}\3\2\2"+
		"\2\26\177\3\2\2\2\30\u0085\3\2\2\2\32\u0087\3\2\2\2\34\u0093\3\2\2\2\36"+
		"\u0097\3\2\2\2 \u0099\3\2\2\2\"\u00a2\3\2\2\2$\u00a4\3\2\2\2&\u00a8\3"+
		"\2\2\2(\u00ae\3\2\2\2*\u00b6\3\2\2\2,\u00ba\3\2\2\2.\u00bc\3\2\2\2\60"+
		"\u00c4\3\2\2\2\62\u00d7\3\2\2\2\64\u00d9\3\2\2\2\66\u00db\3\2\2\28\u00e4"+
		"\3\2\2\2:\u00f7\3\2\2\2<\u010b\3\2\2\2>\u010d\3\2\2\2@\u010f\3\2\2\2B"+
		"\u0116\3\2\2\2D\u0118\3\2\2\2FH\5\4\3\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2"+
		"IJ\3\2\2\2J\3\3\2\2\2KL\7\n\2\2LM\7!\2\2MN\5\6\4\2NO\7\7\2\2OP\5\b\5\2"+
		"PQ\7\t\2\2Q\5\3\2\2\2RS\7\16\2\2ST\7!\2\2TU\7\36\2\2U\7\3\2\2\2V[\5\n"+
		"\6\2WX\7\31\2\2XZ\5\n\6\2YW\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\t"+
		"\3\2\2\2][\3\2\2\2^_\7\23\2\2_`\5\f\7\2`a\7\22\2\2ab\5.\30\2b\13\3\2\2"+
		"\2ce\5\16\b\2df\5\20\t\2ed\3\2\2\2ef\3\2\2\2fl\3\2\2\2gh\7\16\2\2hi\5"+
		"\f\7\2ij\7\36\2\2jl\3\2\2\2kc\3\2\2\2kg\3\2\2\2l\r\3\2\2\2mr\7!\2\2nr"+
		"\5\22\n\2or\5\26\f\2pr\5\"\22\2qm\3\2\2\2qn\3\2\2\2qo\3\2\2\2qp\3\2\2"+
		"\2r\17\3\2\2\2st\7\34\2\2tx\7!\2\2uv\7\f\2\2vx\5.\30\2ws\3\2\2\2wu\3\2"+
		"\2\2x\21\3\2\2\2yz\7\26\2\2z{\5\30\r\2{|\7\32\2\2|\23\3\2\2\2}~\7!\2\2"+
		"~\25\3\2\2\2\177\u0080\7\7\2\2\u0080\u0081\5 \21\2\u0081\u0082\7\t\2\2"+
		"\u0082\27\3\2\2\2\u0083\u0086\5\34\17\2\u0084\u0086\5\32\16\2\u0085\u0083"+
		"\3\2\2\2\u0085\u0084\3\2\2\2\u0086\31\3\2\2\2\u0087\u008c\5\f\7\2\u0088"+
		"\u0089\7\17\2\2\u0089\u008b\5\f\7\2\u008a\u0088\3\2\2\2\u008b\u008e\3"+
		"\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0091\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008f\u0090\7\31\2\2\u0090\u0092\5\36\20\2\u0091\u008f"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\33\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\35\3\2\2\2\u0095\u0098\5\22\n\2\u0096\u0098\5\24\13\2\u0097\u0095\3\2"+
		"\2\2\u0097\u0096\3\2\2\2\u0098\37\3\2\2\2\u0099\u009a\5,\27\2\u009a\u009b"+
		"\7\24\2\2\u009b\u009c\5\f\7\2\u009c!\3\2\2\2\u009d\u00a3\7\37\2\2\u009e"+
		"\u00a3\7 \2\2\u009f\u00a3\7\3\2\2\u00a0\u00a3\7\21\2\2\u00a1\u00a3\7\r"+
		"\2\2\u00a2\u009d\3\2\2\2\u00a2\u009e\3\2\2\2\u00a2\u009f\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3#\3\2\2\2\u00a4\u00a5\7\26\2\2"+
		"\u00a5\u00a6\5D#\2\u00a6\u00a7\7\32\2\2\u00a7%\3\2\2\2\u00a8\u00aa\7\7"+
		"\2\2\u00a9\u00ab\5(\25\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ad\7\t\2\2\u00ad\'\3\2\2\2\u00ae\u00b3\5*\26\2"+
		"\u00af\u00b0\7\6\2\2\u00b0\u00b2\5*\26\2\u00b1\u00af\3\2\2\2\u00b2\u00b5"+
		"\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4)\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00b7\5,\27\2\u00b7\u00b8\7\24\2\2\u00b8\u00b9\5"+
		".\30\2\u00b9+\3\2\2\2\u00ba\u00bb\t\2\2\2\u00bb-\3\2\2\2\u00bc\u00c1\5"+
		"\60\31\2\u00bd\u00be\7\5\2\2\u00be\u00c0\5\60\31\2\u00bf\u00bd\3\2\2\2"+
		"\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2/\3"+
		"\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c9\5\62\32\2\u00c5\u00c6\7\b\2\2\u00c6"+
		"\u00c8\5\62\32\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3"+
		"\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\61\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00d2\5\66\34\2\u00cd\u00ce\5\64\33\2\u00ce\u00cf\5\66\34\2\u00cf\u00d1"+
		"\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d8\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7\35"+
		"\2\2\u00d6\u00d8\5\62\32\2\u00d7\u00cc\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"\63\3\2\2\2\u00d9\u00da\t\3\2\2\u00da\65\3\2\2\2\u00db\u00e1\58\35\2\u00dc"+
		"\u00dd\5> \2\u00dd\u00de\58\35\2\u00de\u00e0\3\2\2\2\u00df\u00dc\3\2\2"+
		"\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\67"+
		"\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00ea\5:\36\2\u00e5\u00e6\5@!\2\u00e6"+
		"\u00e7\5:\36\2\u00e7\u00e9\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e9\u00ec\3\2"+
		"\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb9\3\2\2\2\u00ec\u00ea"+
		"\3\2\2\2\u00ed\u00ee\b\36\1\2\u00ee\u00ef\7#\2\2\u00ef\u00f8\5\66\34\2"+
		"\u00f0\u00f1\7\16\2\2\u00f1\u00f2\5.\30\2\u00f2\u00f3\7\36\2\2\u00f3\u00f8"+
		"\3\2\2\2\u00f4\u00f8\5<\37\2\u00f5\u00f8\5&\24\2\u00f6\u00f8\5B\"\2\u00f7"+
		"\u00ed\3\2\2\2\u00f7\u00f0\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f7\u00f6\3\2\2\2\u00f8\u0108\3\2\2\2\u00f9\u00fa\f\7\2\2\u00fa"+
		"\u00fc\7\16\2\2\u00fb\u00fd\5D#\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2"+
		"\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0107\7\36\2\2\u00ff\u0102\f\6\2\2\u0100"+
		"\u0101\7\20\2\2\u0101\u0103\7!\2\2\u0102\u0100\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106"+
		"\u00f9\3\2\2\2\u0106\u00ff\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2"+
		"\2\2\u0108\u0109\3\2\2\2\u0109;\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010c"+
		"\7!\2\2\u010c=\3\2\2\2\u010d\u010e\t\4\2\2\u010e?\3\2\2\2\u010f\u0110"+
		"\t\5\2\2\u0110A\3\2\2\2\u0111\u0117\7\37\2\2\u0112\u0117\7 \2\2\u0113"+
		"\u0117\7\3\2\2\u0114\u0117\7\21\2\2\u0115\u0117\7\r\2\2\u0116\u0111\3"+
		"\2\2\2\u0116\u0112\3\2\2\2\u0116\u0113\3\2\2\2\u0116\u0114\3\2\2\2\u0116"+
		"\u0115\3\2\2\2\u0117C\3\2\2\2\u0118\u011d\5.\30\2\u0119\u011a\7\17\2\2"+
		"\u011a\u011c\5.\30\2\u011b\u0119\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b"+
		"\3\2\2\2\u011d\u011e\3\2\2\2\u011eE\3\2\2\2\u011f\u011d\3\2\2\2\34I[e"+
		"kqw\u0085\u008c\u0091\u0097\u00a2\u00aa\u00b3\u00c1\u00c9\u00d2\u00d7"+
		"\u00e1\u00ea\u00f7\u00fc\u0104\u0106\u0108\u0116\u011d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
