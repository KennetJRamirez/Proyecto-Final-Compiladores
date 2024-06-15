// Generated from C:/Users/Joab Ramirez/Desktop/ProyectoFinalCompiladores/src/JavaSubset.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JavaSubsetParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, ID=29, INT=30, WS=31;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_varDecl = 2, RULE_assignment = 3, 
		RULE_printStatement = 4, RULE_inputStatement = 5, RULE_loop = 6, RULE_block = 7, 
		RULE_type = 8, RULE_expr = 9, RULE_comparison = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "varDecl", "assignment", "printStatement", "inputStatement", 
			"loop", "block", "type", "expr", "comparison"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'System.out.println'", "'('", "')'", "'Scanner'", 
			"'.'", "'next'", "'for'", "'while'", "'do'", "'{'", "'}'", "'int'", "'float'", 
			"'double'", "'char'", "'boolean'", "'+'", "'-'", "'*'", "'/'", "'=='", 
			"'!='", "'<'", "'>'", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "ID", "INT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JavaSubset.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaSubsetParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				statement();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 537382472L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public InputStatementContext inputStatement() {
			return getRuleContext(InputStatementContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				varDecl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				assignment();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(29);
				printStatement();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(30);
				inputStatement();
				}
				break;
			case T__8:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(31);
				loop();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(JavaSubsetParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			type();
			setState(35);
			match(ID);
			setState(36);
			match(T__0);
			setState(37);
			expr(0);
			setState(38);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaSubsetParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(ID);
			setState(41);
			match(T__0);
			setState(42);
			expr(0);
			setState(43);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__2);
			setState(46);
			match(T__3);
			setState(47);
			expr(0);
			setState(48);
			match(T__4);
			setState(49);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InputStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaSubsetParser.ID, 0); }
		public InputStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterInputStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitInputStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitInputStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputStatementContext inputStatement() throws RecognitionException {
		InputStatementContext _localctx = new InputStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_inputStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__5);
			setState(52);
			match(T__6);
			setState(53);
			match(T__7);
			setState(54);
			match(T__3);
			setState(55);
			match(T__4);
			setState(56);
			match(T__0);
			setState(57);
			match(ID);
			setState(58);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_loop);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(T__8);
				setState(61);
				match(T__3);
				setState(62);
				varDecl();
				setState(63);
				comparison();
				setState(64);
				match(T__1);
				setState(65);
				assignment();
				setState(66);
				match(T__1);
				setState(67);
				match(T__4);
				setState(68);
				block();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(T__9);
				setState(71);
				match(T__3);
				setState(72);
				comparison();
				setState(73);
				match(T__4);
				setState(74);
				block();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				match(T__10);
				setState(77);
				block();
				setState(78);
				match(T__9);
				setState(79);
				match(T__3);
				setState(80);
				comparison();
				setState(81);
				match(T__4);
				setState(82);
				match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__11);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 537382472L) != 0)) {
				{
				{
				setState(87);
				statement();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(T__12);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 507904L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(JavaSubsetParser.INT, 0); }
		public TerminalNode ID() { return getToken(JavaSubsetParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(98);
				match(INT);
				}
				break;
			case ID:
				{
				setState(99);
				match(ID);
				}
				break;
			case T__3:
				{
				setState(100);
				match(T__3);
				setState(101);
				expr(0);
				setState(102);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(112);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(106);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(107);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7864320L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(108);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(109);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(110);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 528482304L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(111);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaSubsetListener ) ((JavaSubsetListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaSubsetVisitor ) return ((JavaSubsetVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			expr(0);
			setState(118);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 528482304L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(119);
			expr(0);
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
		case 9:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001fz\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0004\u0000\u0018"+
		"\b\u0000\u000b\u0000\f\u0000\u0019\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001!\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006U\b\u0006\u0001\u0007\u0001\u0007\u0005\u0007Y\b\u0007\n\u0007"+
		"\f\u0007\\\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\ti\b\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\tq\b\t\n\t\f\tt\t\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0000\u0001\u0012\u000b\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0000\u0003\u0001\u0000\u000e\u0012\u0001"+
		"\u0000\u0013\u0016\u0001\u0000\u0017\u001cz\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0002 \u0001\u0000\u0000\u0000\u0004\"\u0001\u0000\u0000\u0000"+
		"\u0006(\u0001\u0000\u0000\u0000\b-\u0001\u0000\u0000\u0000\n3\u0001\u0000"+
		"\u0000\u0000\fT\u0001\u0000\u0000\u0000\u000eV\u0001\u0000\u0000\u0000"+
		"\u0010_\u0001\u0000\u0000\u0000\u0012h\u0001\u0000\u0000\u0000\u0014u"+
		"\u0001\u0000\u0000\u0000\u0016\u0018\u0003\u0002\u0001\u0000\u0017\u0016"+
		"\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u0017"+
		"\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u0001"+
		"\u0001\u0000\u0000\u0000\u001b!\u0003\u0004\u0002\u0000\u001c!\u0003\u0006"+
		"\u0003\u0000\u001d!\u0003\b\u0004\u0000\u001e!\u0003\n\u0005\u0000\u001f"+
		"!\u0003\f\u0006\u0000 \u001b\u0001\u0000\u0000\u0000 \u001c\u0001\u0000"+
		"\u0000\u0000 \u001d\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000"+
		" \u001f\u0001\u0000\u0000\u0000!\u0003\u0001\u0000\u0000\u0000\"#\u0003"+
		"\u0010\b\u0000#$\u0005\u001d\u0000\u0000$%\u0005\u0001\u0000\u0000%&\u0003"+
		"\u0012\t\u0000&\'\u0005\u0002\u0000\u0000\'\u0005\u0001\u0000\u0000\u0000"+
		"()\u0005\u001d\u0000\u0000)*\u0005\u0001\u0000\u0000*+\u0003\u0012\t\u0000"+
		"+,\u0005\u0002\u0000\u0000,\u0007\u0001\u0000\u0000\u0000-.\u0005\u0003"+
		"\u0000\u0000./\u0005\u0004\u0000\u0000/0\u0003\u0012\t\u000001\u0005\u0005"+
		"\u0000\u000012\u0005\u0002\u0000\u00002\t\u0001\u0000\u0000\u000034\u0005"+
		"\u0006\u0000\u000045\u0005\u0007\u0000\u000056\u0005\b\u0000\u000067\u0005"+
		"\u0004\u0000\u000078\u0005\u0005\u0000\u000089\u0005\u0001\u0000\u0000"+
		"9:\u0005\u001d\u0000\u0000:;\u0005\u0002\u0000\u0000;\u000b\u0001\u0000"+
		"\u0000\u0000<=\u0005\t\u0000\u0000=>\u0005\u0004\u0000\u0000>?\u0003\u0004"+
		"\u0002\u0000?@\u0003\u0014\n\u0000@A\u0005\u0002\u0000\u0000AB\u0003\u0006"+
		"\u0003\u0000BC\u0005\u0002\u0000\u0000CD\u0005\u0005\u0000\u0000DE\u0003"+
		"\u000e\u0007\u0000EU\u0001\u0000\u0000\u0000FG\u0005\n\u0000\u0000GH\u0005"+
		"\u0004\u0000\u0000HI\u0003\u0014\n\u0000IJ\u0005\u0005\u0000\u0000JK\u0003"+
		"\u000e\u0007\u0000KU\u0001\u0000\u0000\u0000LM\u0005\u000b\u0000\u0000"+
		"MN\u0003\u000e\u0007\u0000NO\u0005\n\u0000\u0000OP\u0005\u0004\u0000\u0000"+
		"PQ\u0003\u0014\n\u0000QR\u0005\u0005\u0000\u0000RS\u0005\u0002\u0000\u0000"+
		"SU\u0001\u0000\u0000\u0000T<\u0001\u0000\u0000\u0000TF\u0001\u0000\u0000"+
		"\u0000TL\u0001\u0000\u0000\u0000U\r\u0001\u0000\u0000\u0000VZ\u0005\f"+
		"\u0000\u0000WY\u0003\u0002\u0001\u0000XW\u0001\u0000\u0000\u0000Y\\\u0001"+
		"\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000"+
		"[]\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]^\u0005\r\u0000"+
		"\u0000^\u000f\u0001\u0000\u0000\u0000_`\u0007\u0000\u0000\u0000`\u0011"+
		"\u0001\u0000\u0000\u0000ab\u0006\t\uffff\uffff\u0000bi\u0005\u001e\u0000"+
		"\u0000ci\u0005\u001d\u0000\u0000de\u0005\u0004\u0000\u0000ef\u0003\u0012"+
		"\t\u0000fg\u0005\u0005\u0000\u0000gi\u0001\u0000\u0000\u0000ha\u0001\u0000"+
		"\u0000\u0000hc\u0001\u0000\u0000\u0000hd\u0001\u0000\u0000\u0000ir\u0001"+
		"\u0000\u0000\u0000jk\n\u0005\u0000\u0000kl\u0007\u0001\u0000\u0000lq\u0003"+
		"\u0012\t\u0006mn\n\u0004\u0000\u0000no\u0007\u0002\u0000\u0000oq\u0003"+
		"\u0012\t\u0005pj\u0001\u0000\u0000\u0000pm\u0001\u0000\u0000\u0000qt\u0001"+
		"\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000"+
		"s\u0013\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000uv\u0003\u0012"+
		"\t\u0000vw\u0007\u0002\u0000\u0000wx\u0003\u0012\t\u0000x\u0015\u0001"+
		"\u0000\u0000\u0000\u0007\u0019 TZhpr";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}