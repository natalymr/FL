// Generated from /home/q1/Documents/FL/fl_lexer/src/main/antlr/my_lexer.g4 by ANTLR 4.7
package ru.spbau.mit.my_lexer;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class my_lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, EXP=2, FLOAT=3, STRING=4, READ=5, WRITE=6, IF=7, THEN=8, ELSE=9, 
		WHILE=10, DO=11, POW=12, ASSIGN=13, PLUS=14, MINUS=15, MULT=16, MOD=17, 
		DIV=18, LE=19, LT=20, GE=21, GT=22, EQ=23, NE=24, OR=25, AND=26, SCOLON=27, 
		COMA=28, LBRACKET=29, RBRACKET=30, BOOL=31, LINE_COMMENT=32, COMMENT=33, 
		WS=34, ID=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INT", "EXP", "FLOAT", "STRING", "READ", "WRITE", "IF", "THEN", "ELSE", 
		"WHILE", "DO", "POW", "ASSIGN", "PLUS", "MINUS", "MULT", "MOD", "DIV", 
		"LE", "LT", "GE", "GT", "EQ", "NE", "OR", "AND", "SCOLON", "COMA", "LBRACKET", 
		"RBRACKET", "BOOL", "LINE_COMMENT", "COMMENT", "WS", "ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'read'", "'write'", "'if'", "'then'", "'else'", 
		"'while'", "'do'", "'**'", "'='", "'+'", "'-'", "'*'", "'%'", "'/'", "'<'", 
		"'<='", "'>'", "'>='", "'=='", "'!='", "'||'", "'&&'", "';'", "','", "'('", 
		"')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT", "EXP", "FLOAT", "STRING", "READ", "WRITE", "IF", "THEN", 
		"ELSE", "WHILE", "DO", "POW", "ASSIGN", "PLUS", "MINUS", "MULT", "MOD", 
		"DIV", "LE", "LT", "GE", "GT", "EQ", "NE", "OR", "AND", "SCOLON", "COMA", 
		"LBRACKET", "RBRACKET", "BOOL", "LINE_COMMENT", "COMMENT", "WS", "ID"
	};
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


	public my_lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "my_lexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u00fb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\5\2L\n\2\3\2\3\2\7\2P\n\2\f\2\16\2S\13"+
		"\2\5\2U\n\2\3\3\3\3\5\3Y\n\3\3\3\3\3\3\4\5\4^\n\4\3\4\3\4\3\4\3\4\5\4"+
		"d\n\4\3\4\5\4g\n\4\3\4\3\4\3\4\5\4l\n\4\3\5\3\5\3\5\3\5\7\5r\n\5\f\5\16"+
		"\5u\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u00d0\n \3"+
		"!\3!\3!\3!\7!\u00d6\n!\f!\16!\u00d9\13!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\7"+
		"\"\u00e3\n\"\f\"\16\"\u00e6\13\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\6"+
		"$\u00f2\n$\r$\16$\u00f3\3$\7$\u00f7\n$\f$\16$\u00fa\13$\3\u00e4\2%\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%\3\2\13\3\2\63;\3\2\62;\4\2GGgg\4\2--//\3\2$$\3\2\f\f\5\2\13"+
		"\f\17\17\"\"\4\2aac|\5\2\62;aac|\2\u0109\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3T\3\2\2\2\5V\3\2\2\2\7k\3"+
		"\2\2\2\tm\3\2\2\2\13x\3\2\2\2\r}\3\2\2\2\17\u0083\3\2\2\2\21\u0086\3\2"+
		"\2\2\23\u008b\3\2\2\2\25\u0090\3\2\2\2\27\u0096\3\2\2\2\31\u0099\3\2\2"+
		"\2\33\u009c\3\2\2\2\35\u009e\3\2\2\2\37\u00a0\3\2\2\2!\u00a2\3\2\2\2#"+
		"\u00a4\3\2\2\2%\u00a6\3\2\2\2\'\u00a8\3\2\2\2)\u00aa\3\2\2\2+\u00ad\3"+
		"\2\2\2-\u00af\3\2\2\2/\u00b2\3\2\2\2\61\u00b5\3\2\2\2\63\u00b8\3\2\2\2"+
		"\65\u00bb\3\2\2\2\67\u00be\3\2\2\29\u00c0\3\2\2\2;\u00c2\3\2\2\2=\u00c4"+
		"\3\2\2\2?\u00cf\3\2\2\2A\u00d1\3\2\2\2C\u00de\3\2\2\2E\u00ec\3\2\2\2G"+
		"\u00f1\3\2\2\2IU\7\62\2\2JL\7/\2\2KJ\3\2\2\2KL\3\2\2\2LM\3\2\2\2MQ\t\2"+
		"\2\2NP\t\3\2\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RU\3\2\2\2SQ\3\2"+
		"\2\2TI\3\2\2\2TK\3\2\2\2U\4\3\2\2\2VX\t\4\2\2WY\t\5\2\2XW\3\2\2\2XY\3"+
		"\2\2\2YZ\3\2\2\2Z[\5\3\2\2[\6\3\2\2\2\\^\7/\2\2]\\\3\2\2\2]^\3\2\2\2^"+
		"_\3\2\2\2_`\5\3\2\2`a\7\60\2\2ac\5\3\2\2bd\5\5\3\2cb\3\2\2\2cd\3\2\2\2"+
		"dl\3\2\2\2eg\7/\2\2fe\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\5\3\2\2ij\5\5\3\2"+
		"jl\3\2\2\2k]\3\2\2\2kf\3\2\2\2l\b\3\2\2\2ms\7$\2\2nr\n\6\2\2op\7^\2\2"+
		"pr\7$\2\2qn\3\2\2\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2"+
		"us\3\2\2\2vw\7$\2\2w\n\3\2\2\2xy\7t\2\2yz\7g\2\2z{\7c\2\2{|\7f\2\2|\f"+
		"\3\2\2\2}~\7y\2\2~\177\7t\2\2\177\u0080\7k\2\2\u0080\u0081\7v\2\2\u0081"+
		"\u0082\7g\2\2\u0082\16\3\2\2\2\u0083\u0084\7k\2\2\u0084\u0085\7h\2\2\u0085"+
		"\20\3\2\2\2\u0086\u0087\7v\2\2\u0087\u0088\7j\2\2\u0088\u0089\7g\2\2\u0089"+
		"\u008a\7p\2\2\u008a\22\3\2\2\2\u008b\u008c\7g\2\2\u008c\u008d\7n\2\2\u008d"+
		"\u008e\7u\2\2\u008e\u008f\7g\2\2\u008f\24\3\2\2\2\u0090\u0091\7y\2\2\u0091"+
		"\u0092\7j\2\2\u0092\u0093\7k\2\2\u0093\u0094\7n\2\2\u0094\u0095\7g\2\2"+
		"\u0095\26\3\2\2\2\u0096\u0097\7f\2\2\u0097\u0098\7q\2\2\u0098\30\3\2\2"+
		"\2\u0099\u009a\7,\2\2\u009a\u009b\7,\2\2\u009b\32\3\2\2\2\u009c\u009d"+
		"\7?\2\2\u009d\34\3\2\2\2\u009e\u009f\7-\2\2\u009f\36\3\2\2\2\u00a0\u00a1"+
		"\7/\2\2\u00a1 \3\2\2\2\u00a2\u00a3\7,\2\2\u00a3\"\3\2\2\2\u00a4\u00a5"+
		"\7\'\2\2\u00a5$\3\2\2\2\u00a6\u00a7\7\61\2\2\u00a7&\3\2\2\2\u00a8\u00a9"+
		"\7>\2\2\u00a9(\3\2\2\2\u00aa\u00ab\7>\2\2\u00ab\u00ac\7?\2\2\u00ac*\3"+
		"\2\2\2\u00ad\u00ae\7@\2\2\u00ae,\3\2\2\2\u00af\u00b0\7@\2\2\u00b0\u00b1"+
		"\7?\2\2\u00b1.\3\2\2\2\u00b2\u00b3\7?\2\2\u00b3\u00b4\7?\2\2\u00b4\60"+
		"\3\2\2\2\u00b5\u00b6\7#\2\2\u00b6\u00b7\7?\2\2\u00b7\62\3\2\2\2\u00b8"+
		"\u00b9\7~\2\2\u00b9\u00ba\7~\2\2\u00ba\64\3\2\2\2\u00bb\u00bc\7(\2\2\u00bc"+
		"\u00bd\7(\2\2\u00bd\66\3\2\2\2\u00be\u00bf\7=\2\2\u00bf8\3\2\2\2\u00c0"+
		"\u00c1\7.\2\2\u00c1:\3\2\2\2\u00c2\u00c3\7*\2\2\u00c3<\3\2\2\2\u00c4\u00c5"+
		"\7+\2\2\u00c5>\3\2\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9"+
		"\7w\2\2\u00c9\u00d0\7g\2\2\u00ca\u00cb\7h\2\2\u00cb\u00cc\7c\2\2\u00cc"+
		"\u00cd\7n\2\2\u00cd\u00ce\7u\2\2\u00ce\u00d0\7g\2\2\u00cf\u00c6\3\2\2"+
		"\2\u00cf\u00ca\3\2\2\2\u00d0@\3\2\2\2\u00d1\u00d2\7\61\2\2\u00d2\u00d3"+
		"\7\61\2\2\u00d3\u00d7\3\2\2\2\u00d4\u00d6\n\7\2\2\u00d5\u00d4\3\2\2\2"+
		"\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da"+
		"\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7\f\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00dd\b!\2\2\u00ddB\3\2\2\2\u00de\u00df\7\61\2\2\u00df\u00e0\7,\2\2\u00e0"+
		"\u00e4\3\2\2\2\u00e1\u00e3\13\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3"+
		"\2\2\2\u00e4\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e7\u00e8\7,\2\2\u00e8\u00e9\7\61\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\u00eb\b\"\2\2\u00ebD\3\2\2\2\u00ec\u00ed\t\b\2\2\u00ed\u00ee"+
		"\3\2\2\2\u00ee\u00ef\b#\3\2\u00efF\3\2\2\2\u00f0\u00f2\t\t\2\2\u00f1\u00f0"+
		"\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f8\3\2\2\2\u00f5\u00f7\t\n\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2"+
		"\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9H\3\2\2\2\u00fa\u00f8"+
		"\3\2\2\2\22\2KQTX]cfkqs\u00cf\u00d7\u00e4\u00f3\u00f8\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}