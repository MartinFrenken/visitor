// Generated from C:/Users/Martin/Documents/S3/Automata/calculatorTreeVisitor/src/main/java/com/company\MyGrammar.g4 by ANTLR 4.7.2
package com.company;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GREATERTHAN=1, LESSERTHAN=2, WHILE=3, DO=4, IF=5, END=6, TRUE=7, FALSE=8, 
		PRINT=9, EOL=10, GOODBYE=11, HELLO=12, NUMBER=13, MULTIPLICATION=14, DIVISION=15, 
		ADDITION=16, ASSIGNMENT=17, DECLARATION=18, SUBTRACTION=19, EQUALS=20, 
		VARIABLE=21, ID=22, WS=23;
	public static final int
		RULE_myStart = 0, RULE_line = 1, RULE_input = 2, RULE_expression = 3, 
		RULE_myBoolean = 4, RULE_ifStatement = 5, RULE_whileStatement = 6, RULE_assignment = 7, 
		RULE_declaration = 8, RULE_value = 9, RULE_newVariable = 10, RULE_bool = 11, 
		RULE_integer = 12, RULE_print = 13, RULE_variable = 14, RULE_multiplication = 15, 
		RULE_division = 16, RULE_addition = 17, RULE_subtraction = 18, RULE_equals = 19, 
		RULE_whitespace = 20, RULE_eol = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"myStart", "line", "input", "expression", "myBoolean", "ifStatement", 
			"whileStatement", "assignment", "declaration", "value", "newVariable", 
			"bool", "integer", "print", "variable", "multiplication", "division", 
			"addition", "subtraction", "equals", "whitespace", "eol"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'is greater than'", "'is lesser than'", "'while'", "'do'", "'if'", 
			"'end'", "'true'", "'false'", "'print'", "'.'", "'Bye'", "'Hello'", null, 
			"'times'", "'divided by'", "'plus'", "'is'", "'new'", "'minus'", "'equals'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GREATERTHAN", "LESSERTHAN", "WHILE", "DO", "IF", "END", "TRUE", 
			"FALSE", "PRINT", "EOL", "GOODBYE", "HELLO", "NUMBER", "MULTIPLICATION", 
			"DIVISION", "ADDITION", "ASSIGNMENT", "DECLARATION", "SUBTRACTION", "EQUALS", 
			"VARIABLE", "ID", "WS"
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
	public String getGrammarFileName() { return "MyGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MyStartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MyGrammarParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public MyStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterMyStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitMyStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitMyStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MyStartContext myStart() throws RecognitionException {
		MyStartContext _localctx = new MyStartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_myStart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << IF) | (1L << TRUE) | (1L << FALSE) | (1L << PRINT) | (1L << NUMBER) | (1L << DECLARATION) | (1L << VARIABLE))) != 0)) {
				{
				{
				setState(44);
				line();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(EOF);
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

	public static class LineContext extends ParserRuleContext {
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public List<InputContext> input() {
			return getRuleContexts(InputContext.class);
		}
		public InputContext input(int i) {
			return getRuleContext(InputContext.class,i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				input();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << IF) | (1L << TRUE) | (1L << FALSE) | (1L << PRINT) | (1L << NUMBER) | (1L << DECLARATION) | (1L << VARIABLE))) != 0) );
			setState(57);
			eol();
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

	public static class InputContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_input);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				print();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				ifStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(64);
				whileStatement();
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OnIntegerContext extends ExpressionContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public OnIntegerContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterOnInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitOnInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitOnInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditionExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AdditionContext addition() {
			return getRuleContext(AdditionContext.class,0);
		}
		public AdditionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterAdditionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitAdditionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitAdditionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OnVariableContext extends ExpressionContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public OnVariableContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterOnVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitOnVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitOnVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtractionExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SubtractionContext subtraction() {
			return getRuleContext(SubtractionContext.class,0);
		}
		public SubtractionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterSubtractionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitSubtractionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitSubtractionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OnBooleanContext extends ExpressionContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public OnBooleanContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterOnBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitOnBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitOnBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultiplicationContext multiplication() {
			return getRuleContext(MultiplicationContext.class,0);
		}
		public MultiplicationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterMultiplicationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitMultiplicationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitMultiplicationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DivisionContext division() {
			return getRuleContext(DivisionContext.class,0);
		}
		public DivisionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterDivisionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitDivisionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitDivisionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				_localctx = new OnIntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(68);
				integer();
				}
				break;
			case VARIABLE:
				{
				_localctx = new OnVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69);
				variable();
				}
				break;
			case TRUE:
			case FALSE:
				{
				_localctx = new OnBooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				bool();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(89);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(73);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(74);
						multiplication();
						setState(75);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new AdditionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(77);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(78);
						addition();
						setState(79);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new SubtractionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(81);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(82);
						subtraction();
						setState(83);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new DivisionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(85);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(86);
						division();
						setState(87);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class MyBooleanContext extends ParserRuleContext {
		public MyBooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myBoolean; }
	 
		public MyBooleanContext() { }
		public void copyFrom(MyBooleanContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqualsBooleanContext extends MyBooleanContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(MyGrammarParser.EQUALS, 0); }
		public EqualsBooleanContext(MyBooleanContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterEqualsBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitEqualsBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitEqualsBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LesserThanBooleanContext extends MyBooleanContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LESSERTHAN() { return getToken(MyGrammarParser.LESSERTHAN, 0); }
		public LesserThanBooleanContext(MyBooleanContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterLesserThanBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitLesserThanBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitLesserThanBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterThanBooleanContext extends MyBooleanContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GREATERTHAN() { return getToken(MyGrammarParser.GREATERTHAN, 0); }
		public GreaterThanBooleanContext(MyBooleanContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterGreaterThanBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitGreaterThanBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitGreaterThanBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MyBooleanContext myBoolean() throws RecognitionException {
		MyBooleanContext _localctx = new MyBooleanContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_myBoolean);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new EqualsBooleanContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				expression(0);
				setState(95);
				match(EQUALS);
				setState(96);
				expression(0);
				}
				break;
			case 2:
				_localctx = new LesserThanBooleanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				expression(0);
				setState(99);
				match(LESSERTHAN);
				setState(100);
				expression(0);
				}
				break;
			case 3:
				_localctx = new GreaterThanBooleanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				expression(0);
				setState(103);
				match(GREATERTHAN);
				setState(104);
				expression(0);
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MyGrammarParser.IF, 0); }
		public MyBooleanContext myBoolean() {
			return getRuleContext(MyBooleanContext.class,0);
		}
		public TerminalNode DO() { return getToken(MyGrammarParser.DO, 0); }
		public List<InputContext> input() {
			return getRuleContexts(InputContext.class);
		}
		public InputContext input(int i) {
			return getRuleContext(InputContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(IF);
			setState(109);
			myBoolean();
			setState(110);
			match(DO);
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(111);
					input();
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MyGrammarParser.WHILE, 0); }
		public MyBooleanContext myBoolean() {
			return getRuleContext(MyBooleanContext.class,0);
		}
		public TerminalNode DO() { return getToken(MyGrammarParser.DO, 0); }
		public TerminalNode END() { return getToken(MyGrammarParser.END, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(WHILE);
			setState(118);
			myBoolean();
			setState(119);
			match(DO);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << IF) | (1L << TRUE) | (1L << FALSE) | (1L << PRINT) | (1L << NUMBER) | (1L << DECLARATION) | (1L << VARIABLE))) != 0)) {
				{
				{
				setState(120);
				line();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			match(END);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(MyGrammarParser.VARIABLE, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(MyGrammarParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(VARIABLE);
			setState(129);
			match(ASSIGNMENT);
			setState(130);
			expression(0);
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

	public static class DeclarationContext extends ParserRuleContext {
		public NewVariableContext newVariable() {
			return getRuleContext(NewVariableContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			newVariable();
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

	public static class ValueContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_value);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				integer();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				variable();
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

	public static class NewVariableContext extends ParserRuleContext {
		public TerminalNode DECLARATION() { return getToken(MyGrammarParser.DECLARATION, 0); }
		public TerminalNode VARIABLE() { return getToken(MyGrammarParser.VARIABLE, 0); }
		public NewVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterNewVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitNewVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitNewVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewVariableContext newVariable() throws RecognitionException {
		NewVariableContext _localctx = new NewVariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_newVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(DECLARATION);
			setState(139);
			match(VARIABLE);
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(MyGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MyGrammarParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(MyGrammarParser.NUMBER, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(NUMBER);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(MyGrammarParser.PRINT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_print);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(PRINT);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(146);
					expression(0);
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(MyGrammarParser.VARIABLE, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(VARIABLE);
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

	public static class MultiplicationContext extends ParserRuleContext {
		public TerminalNode MULTIPLICATION() { return getToken(MyGrammarParser.MULTIPLICATION, 0); }
		public MultiplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicationContext multiplication() throws RecognitionException {
		MultiplicationContext _localctx = new MultiplicationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_multiplication);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(MULTIPLICATION);
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

	public static class DivisionContext extends ParserRuleContext {
		public TerminalNode DIVISION() { return getToken(MyGrammarParser.DIVISION, 0); }
		public DivisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_division; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivisionContext division() throws RecognitionException {
		DivisionContext _localctx = new DivisionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_division);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(DIVISION);
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

	public static class AdditionContext extends ParserRuleContext {
		public TerminalNode ADDITION() { return getToken(MyGrammarParser.ADDITION, 0); }
		public AdditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionContext addition() throws RecognitionException {
		AdditionContext _localctx = new AdditionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_addition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(ADDITION);
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

	public static class SubtractionContext extends ParserRuleContext {
		public TerminalNode SUBTRACTION() { return getToken(MyGrammarParser.SUBTRACTION, 0); }
		public SubtractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtraction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitSubtraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubtractionContext subtraction() throws RecognitionException {
		SubtractionContext _localctx = new SubtractionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_subtraction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(SUBTRACTION);
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

	public static class EqualsContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(MyGrammarParser.EQUALS, 0); }
		public EqualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitEquals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualsContext equals() throws RecognitionException {
		EqualsContext _localctx = new EqualsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_equals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(EQUALS);
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

	public static class WhitespaceContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(MyGrammarParser.WS, 0); }
		public WhitespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whitespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterWhitespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitWhitespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitWhitespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhitespaceContext whitespace() throws RecognitionException {
		WhitespaceContext _localctx = new WhitespaceContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_whitespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(WS);
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

	public static class EolContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(MyGrammarParser.EOL, 0); }
		public EolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterEol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitEol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitEol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EolContext eol() throws RecognitionException {
		EolContext _localctx = new EolContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_eol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(EOL);
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
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u00ab\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\7\2\60\n\2\f\2"+
		"\16\2\63\13\2\3\2\3\2\3\3\6\38\n\3\r\3\16\39\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4D\n\4\3\5\3\5\3\5\3\5\5\5J\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\\\n\5\f\5\16\5_\13\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6m\n\6\3\7\3\7\3\7\3\7\7\7s\n"+
		"\7\f\7\16\7v\13\7\3\b\3\b\3\b\3\b\7\b|\n\b\f\b\16\b\177\13\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\5\13\u008b\n\13\3\f\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\7\17\u0096\n\17\f\17\16\17\u0099\13\17\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3"+
		"\27\2\3\b\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\3\3\2\t"+
		"\n\2\u00a7\2\61\3\2\2\2\4\67\3\2\2\2\6C\3\2\2\2\bI\3\2\2\2\nl\3\2\2\2"+
		"\fn\3\2\2\2\16w\3\2\2\2\20\u0082\3\2\2\2\22\u0086\3\2\2\2\24\u008a\3\2"+
		"\2\2\26\u008c\3\2\2\2\30\u008f\3\2\2\2\32\u0091\3\2\2\2\34\u0093\3\2\2"+
		"\2\36\u009a\3\2\2\2 \u009c\3\2\2\2\"\u009e\3\2\2\2$\u00a0\3\2\2\2&\u00a2"+
		"\3\2\2\2(\u00a4\3\2\2\2*\u00a6\3\2\2\2,\u00a8\3\2\2\2.\60\5\4\3\2/.\3"+
		"\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2"+
		"\2\2\64\65\7\2\2\3\65\3\3\2\2\2\668\5\6\4\2\67\66\3\2\2\289\3\2\2\29\67"+
		"\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\5,\27\2<\5\3\2\2\2=D\5\b\5\2>D\5\22\n\2"+
		"?D\5\20\t\2@D\5\34\17\2AD\5\f\7\2BD\5\16\b\2C=\3\2\2\2C>\3\2\2\2C?\3\2"+
		"\2\2C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2D\7\3\2\2\2EF\b\5\1\2FJ\5\32\16\2GJ"+
		"\5\36\20\2HJ\5\30\r\2IE\3\2\2\2IG\3\2\2\2IH\3\2\2\2J]\3\2\2\2KL\f\t\2"+
		"\2LM\5 \21\2MN\5\b\5\nN\\\3\2\2\2OP\f\b\2\2PQ\5$\23\2QR\5\b\5\tR\\\3\2"+
		"\2\2ST\f\7\2\2TU\5&\24\2UV\5\b\5\bV\\\3\2\2\2WX\f\6\2\2XY\5\"\22\2YZ\5"+
		"\b\5\7Z\\\3\2\2\2[K\3\2\2\2[O\3\2\2\2[S\3\2\2\2[W\3\2\2\2\\_\3\2\2\2]"+
		"[\3\2\2\2]^\3\2\2\2^\t\3\2\2\2_]\3\2\2\2`a\5\b\5\2ab\7\26\2\2bc\5\b\5"+
		"\2cm\3\2\2\2de\5\b\5\2ef\7\4\2\2fg\5\b\5\2gm\3\2\2\2hi\5\b\5\2ij\7\3\2"+
		"\2jk\5\b\5\2km\3\2\2\2l`\3\2\2\2ld\3\2\2\2lh\3\2\2\2m\13\3\2\2\2no\7\7"+
		"\2\2op\5\n\6\2pt\7\6\2\2qs\5\6\4\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2"+
		"\2\2u\r\3\2\2\2vt\3\2\2\2wx\7\5\2\2xy\5\n\6\2y}\7\6\2\2z|\5\4\3\2{z\3"+
		"\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080"+
		"\u0081\7\b\2\2\u0081\17\3\2\2\2\u0082\u0083\7\27\2\2\u0083\u0084\7\23"+
		"\2\2\u0084\u0085\5\b\5\2\u0085\21\3\2\2\2\u0086\u0087\5\26\f\2\u0087\23"+
		"\3\2\2\2\u0088\u008b\5\32\16\2\u0089\u008b\5\36\20\2\u008a\u0088\3\2\2"+
		"\2\u008a\u0089\3\2\2\2\u008b\25\3\2\2\2\u008c\u008d\7\24\2\2\u008d\u008e"+
		"\7\27\2\2\u008e\27\3\2\2\2\u008f\u0090\t\2\2\2\u0090\31\3\2\2\2\u0091"+
		"\u0092\7\17\2\2\u0092\33\3\2\2\2\u0093\u0097\7\13\2\2\u0094\u0096\5\b"+
		"\5\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\35\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7\27\2"+
		"\2\u009b\37\3\2\2\2\u009c\u009d\7\20\2\2\u009d!\3\2\2\2\u009e\u009f\7"+
		"\21\2\2\u009f#\3\2\2\2\u00a0\u00a1\7\22\2\2\u00a1%\3\2\2\2\u00a2\u00a3"+
		"\7\25\2\2\u00a3\'\3\2\2\2\u00a4\u00a5\7\26\2\2\u00a5)\3\2\2\2\u00a6\u00a7"+
		"\7\31\2\2\u00a7+\3\2\2\2\u00a8\u00a9\7\f\2\2\u00a9-\3\2\2\2\r\619CI[]"+
		"lt}\u008a\u0097";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}