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
		POWER=1, GREATERTHAN=2, LESSERTHAN=3, WHILE=4, DO=5, IF=6, END=7, TRUE=8, 
		FALSE=9, PRINT=10, EOL=11, GOODBYE=12, HELLO=13, NUMBER=14, MULTIPLICATION=15, 
		DIVISION=16, ADDITION=17, ASSIGNMENT=18, DECLARATION=19, SUBTRACTION=20, 
		EQUALS=21, VARIABLE=22, ID=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"POWER", "GREATERTHAN", "LESSERTHAN", "WHILE", "DO", "IF", "END", "TRUE", 
			"FALSE", "PRINT", "EOL", "GOODBYE", "HELLO", "NUMBER", "MULTIPLICATION", 
			"DIVISION", "ADDITION", "ASSIGNMENT", "DECLARATION", "SUBTRACTION", "EQUALS", 
			"VARIABLE", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'to the power of'", "'is greater than'", "'is lesser than'", "'while'", 
			"'do'", "'if'", "'end'", "'true'", "'false'", "'print'", "'.'", "'Bye'", 
			"'Hello'", null, "'times'", "'divided by'", "'plus'", "'is'", "'new'", 
			"'minus'", "'equals'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "POWER", "GREATERTHAN", "LESSERTHAN", "WHILE", "DO", "IF", "END", 
			"TRUE", "FALSE", "PRINT", "EOL", "GOODBYE", "HELLO", "NUMBER", "MULTIPLICATION", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00d1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\6\17\u0091\n\17\r\17\16\17\u0092"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\6\27\u00c0\n\27\r\27\16\27\u00c1\3\30\3\30\7\30\u00c6\n\30\f\30"+
		"\16\30\u00c9\13\30\3\31\6\31\u00cc\n\31\r\31\16\31\u00cd\3\31\3\31\2\2"+
		"\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\7\3\2\62;\4\2C\\"+
		"c|\5\2C\\aac|\b\2##\60\60\62;C\\aac|\5\2\13\f\17\17\"\"\2\u00d4\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\3\63\3\2\2\2\5C\3\2\2\2\7S\3\2\2\2\tb\3\2\2\2\13h\3\2\2\2\rk"+
		"\3\2\2\2\17n\3\2\2\2\21r\3\2\2\2\23w\3\2\2\2\25}\3\2\2\2\27\u0083\3\2"+
		"\2\2\31\u0085\3\2\2\2\33\u0089\3\2\2\2\35\u0090\3\2\2\2\37\u0094\3\2\2"+
		"\2!\u009a\3\2\2\2#\u00a5\3\2\2\2%\u00aa\3\2\2\2\'\u00ad\3\2\2\2)\u00b1"+
		"\3\2\2\2+\u00b7\3\2\2\2-\u00bf\3\2\2\2/\u00c3\3\2\2\2\61\u00cb\3\2\2\2"+
		"\63\64\7v\2\2\64\65\7q\2\2\65\66\7\"\2\2\66\67\7v\2\2\678\7j\2\289\7g"+
		"\2\29:\7\"\2\2:;\7r\2\2;<\7q\2\2<=\7y\2\2=>\7g\2\2>?\7t\2\2?@\7\"\2\2"+
		"@A\7q\2\2AB\7h\2\2B\4\3\2\2\2CD\7k\2\2DE\7u\2\2EF\7\"\2\2FG\7i\2\2GH\7"+
		"t\2\2HI\7g\2\2IJ\7c\2\2JK\7v\2\2KL\7g\2\2LM\7t\2\2MN\7\"\2\2NO\7v\2\2"+
		"OP\7j\2\2PQ\7c\2\2QR\7p\2\2R\6\3\2\2\2ST\7k\2\2TU\7u\2\2UV\7\"\2\2VW\7"+
		"n\2\2WX\7g\2\2XY\7u\2\2YZ\7u\2\2Z[\7g\2\2[\\\7t\2\2\\]\7\"\2\2]^\7v\2"+
		"\2^_\7j\2\2_`\7c\2\2`a\7p\2\2a\b\3\2\2\2bc\7y\2\2cd\7j\2\2de\7k\2\2ef"+
		"\7n\2\2fg\7g\2\2g\n\3\2\2\2hi\7f\2\2ij\7q\2\2j\f\3\2\2\2kl\7k\2\2lm\7"+
		"h\2\2m\16\3\2\2\2no\7g\2\2op\7p\2\2pq\7f\2\2q\20\3\2\2\2rs\7v\2\2st\7"+
		"t\2\2tu\7w\2\2uv\7g\2\2v\22\3\2\2\2wx\7h\2\2xy\7c\2\2yz\7n\2\2z{\7u\2"+
		"\2{|\7g\2\2|\24\3\2\2\2}~\7r\2\2~\177\7t\2\2\177\u0080\7k\2\2\u0080\u0081"+
		"\7p\2\2\u0081\u0082\7v\2\2\u0082\26\3\2\2\2\u0083\u0084\7\60\2\2\u0084"+
		"\30\3\2\2\2\u0085\u0086\7D\2\2\u0086\u0087\7{\2\2\u0087\u0088\7g\2\2\u0088"+
		"\32\3\2\2\2\u0089\u008a\7J\2\2\u008a\u008b\7g\2\2\u008b\u008c\7n\2\2\u008c"+
		"\u008d\7n\2\2\u008d\u008e\7q\2\2\u008e\34\3\2\2\2\u008f\u0091\t\2\2\2"+
		"\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\36\3\2\2\2\u0094\u0095\7v\2\2\u0095\u0096\7k\2\2\u0096"+
		"\u0097\7o\2\2\u0097\u0098\7g\2\2\u0098\u0099\7u\2\2\u0099 \3\2\2\2\u009a"+
		"\u009b\7f\2\2\u009b\u009c\7k\2\2\u009c\u009d\7x\2\2\u009d\u009e\7k\2\2"+
		"\u009e\u009f\7f\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7f\2\2\u00a1\u00a2"+
		"\7\"\2\2\u00a2\u00a3\7d\2\2\u00a3\u00a4\7{\2\2\u00a4\"\3\2\2\2\u00a5\u00a6"+
		"\7r\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8\7w\2\2\u00a8\u00a9\7u\2\2\u00a9"+
		"$\3\2\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7u\2\2\u00ac&\3\2\2\2\u00ad\u00ae"+
		"\7p\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7y\2\2\u00b0(\3\2\2\2\u00b1\u00b2"+
		"\7o\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5\7w\2\2\u00b5"+
		"\u00b6\7u\2\2\u00b6*\3\2\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7s\2\2\u00b9"+
		"\u00ba\7w\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7u\2\2"+
		"\u00bd,\3\2\2\2\u00be\u00c0\t\3\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3"+
		"\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2.\3\2\2\2\u00c3\u00c7"+
		"\t\4\2\2\u00c4\u00c6\t\5\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\60\3\2\2\2\u00c9\u00c7\3\2\2"+
		"\2\u00ca\u00cc\t\6\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb"+
		"\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\b\31\2\2"+
		"\u00d0\62\3\2\2\2\7\2\u0092\u00c1\u00c7\u00cd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}