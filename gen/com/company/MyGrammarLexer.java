// Generated from C:/Users/Martin/Documents/S3/Automata/calculatorTreeVisitor/src/main/java/com/company\MyGrammar.g4 by ANTLR 4.7.2
package com.company;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GREATERTHAN=1, LESSERTHAN=2, WHILE=3, DO=4, IF=5, END=6, TRUE=7, FALSE=8, 
		PRINT=9, EOL=10, GOODBYE=11, HELLO=12, NUMBER=13, MULTIPLICATION=14, DIVISION=15, 
		ADDITION=16, ASSIGNMENT=17, DECLARATION=18, SUBTRACTION=19, EQUALS=20, 
		VARIABLE=21, ID=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"GREATERTHAN", "LESSERTHAN", "WHILE", "DO", "IF", "END", "TRUE", "FALSE", 
			"PRINT", "EOL", "GOODBYE", "HELLO", "NUMBER", "MULTIPLICATION", "DIVISION", 
			"ADDITION", "ASSIGNMENT", "DECLARATION", "SUBTRACTION", "EQUALS", "VARIABLE", 
			"ID", "WS"
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


	public MyGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00bf\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\6\16\177\n\16\r\16\16\16\u0080\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\6\26\u00ae"+
		"\n\26\r\26\16\26\u00af\3\27\3\27\7\27\u00b4\n\27\f\27\16\27\u00b7\13\27"+
		"\3\30\6\30\u00ba\n\30\r\30\16\30\u00bb\3\30\3\30\2\2\31\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\3\2\7\3\2\62;\4\2C\\c|\5\2C\\aac|\b\2##\60\60"+
		"\62;C\\aac|\5\2\13\f\17\17\"\"\2\u00c2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5A\3\2\2\2\7P\3\2"+
		"\2\2\tV\3\2\2\2\13Y\3\2\2\2\r\\\3\2\2\2\17`\3\2\2\2\21e\3\2\2\2\23k\3"+
		"\2\2\2\25q\3\2\2\2\27s\3\2\2\2\31w\3\2\2\2\33~\3\2\2\2\35\u0082\3\2\2"+
		"\2\37\u0088\3\2\2\2!\u0093\3\2\2\2#\u0098\3\2\2\2%\u009b\3\2\2\2\'\u009f"+
		"\3\2\2\2)\u00a5\3\2\2\2+\u00ad\3\2\2\2-\u00b1\3\2\2\2/\u00b9\3\2\2\2\61"+
		"\62\7k\2\2\62\63\7u\2\2\63\64\7\"\2\2\64\65\7i\2\2\65\66\7t\2\2\66\67"+
		"\7g\2\2\678\7c\2\289\7v\2\29:\7g\2\2:;\7t\2\2;<\7\"\2\2<=\7v\2\2=>\7j"+
		"\2\2>?\7c\2\2?@\7p\2\2@\4\3\2\2\2AB\7k\2\2BC\7u\2\2CD\7\"\2\2DE\7n\2\2"+
		"EF\7g\2\2FG\7u\2\2GH\7u\2\2HI\7g\2\2IJ\7t\2\2JK\7\"\2\2KL\7v\2\2LM\7j"+
		"\2\2MN\7c\2\2NO\7p\2\2O\6\3\2\2\2PQ\7y\2\2QR\7j\2\2RS\7k\2\2ST\7n\2\2"+
		"TU\7g\2\2U\b\3\2\2\2VW\7f\2\2WX\7q\2\2X\n\3\2\2\2YZ\7k\2\2Z[\7h\2\2[\f"+
		"\3\2\2\2\\]\7g\2\2]^\7p\2\2^_\7f\2\2_\16\3\2\2\2`a\7v\2\2ab\7t\2\2bc\7"+
		"w\2\2cd\7g\2\2d\20\3\2\2\2ef\7h\2\2fg\7c\2\2gh\7n\2\2hi\7u\2\2ij\7g\2"+
		"\2j\22\3\2\2\2kl\7r\2\2lm\7t\2\2mn\7k\2\2no\7p\2\2op\7v\2\2p\24\3\2\2"+
		"\2qr\7\60\2\2r\26\3\2\2\2st\7D\2\2tu\7{\2\2uv\7g\2\2v\30\3\2\2\2wx\7J"+
		"\2\2xy\7g\2\2yz\7n\2\2z{\7n\2\2{|\7q\2\2|\32\3\2\2\2}\177\t\2\2\2~}\3"+
		"\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\34\3"+
		"\2\2\2\u0082\u0083\7v\2\2\u0083\u0084\7k\2\2\u0084\u0085\7o\2\2\u0085"+
		"\u0086\7g\2\2\u0086\u0087\7u\2\2\u0087\36\3\2\2\2\u0088\u0089\7f\2\2\u0089"+
		"\u008a\7k\2\2\u008a\u008b\7x\2\2\u008b\u008c\7k\2\2\u008c\u008d\7f\2\2"+
		"\u008d\u008e\7g\2\2\u008e\u008f\7f\2\2\u008f\u0090\7\"\2\2\u0090\u0091"+
		"\7d\2\2\u0091\u0092\7{\2\2\u0092 \3\2\2\2\u0093\u0094\7r\2\2\u0094\u0095"+
		"\7n\2\2\u0095\u0096\7w\2\2\u0096\u0097\7u\2\2\u0097\"\3\2\2\2\u0098\u0099"+
		"\7k\2\2\u0099\u009a\7u\2\2\u009a$\3\2\2\2\u009b\u009c\7p\2\2\u009c\u009d"+
		"\7g\2\2\u009d\u009e\7y\2\2\u009e&\3\2\2\2\u009f\u00a0\7o\2\2\u00a0\u00a1"+
		"\7k\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7w\2\2\u00a3\u00a4\7u\2\2\u00a4"+
		"(\3\2\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7s\2\2\u00a7\u00a8\7w\2\2\u00a8"+
		"\u00a9\7c\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab\7u\2\2\u00ab*\3\2\2\2\u00ac"+
		"\u00ae\t\3\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0,\3\2\2\2\u00b1\u00b5\t\4\2\2\u00b2\u00b4"+
		"\t\5\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6.\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00ba\t\6\2\2"+
		"\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\b\30\2\2\u00be\60\3\2\2\2\7\2"+
		"\u0080\u00af\u00b5\u00bb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}