// Generated from my_lexer.g4 by ANTLR 4.7.1
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, EXP=2, FLOAT=3, STRING=4, READ=5, WRITE=6, IF=7, THEN=8, ELSE=9, 
		WHILE=10, DO=11, ASSIGN=12, PLUS=13, MINUS=14, MULT=15, DIV=16, LE=17, 
		LT=18, GE=19, GT=20, EQ=21, NE=22, OR=23, AND=24, SCOLON=25, COMA=26, 
		LBRACKET=27, RBRACKET=28, BOOL=29, LINE_COMMENT=30, WS=31, ID=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INT", "EXP", "FLOAT", "STRING", "READ", "WRITE", "IF", "THEN", "ELSE", 
		"WHILE", "DO", "ASSIGN", "PLUS", "MINUS", "MULT", "DIV", "LE", "LT", "GE", 
		"GT", "EQ", "NE", "OR", "AND", "SCOLON", "COMA", "LBRACKET", "RBRACKET", 
		"BOOL", "LINE_COMMENT", "WS", "ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'read'", "'write'", "'if'", "'then'", "'else'", 
		"'while'", "'do'", "'='", "'+'", "'-'", "'*'", "'/'", "'<'", "'<='", "'>'", 
		"'>='", "'=='", "'!='", "'||'", "'&&'", "';'", "','", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT", "EXP", "FLOAT", "STRING", "READ", "WRITE", "IF", "THEN", 
		"ELSE", "WHILE", "DO", "ASSIGN", "PLUS", "MINUS", "MULT", "DIV", "LE", 
		"LT", "GE", "GT", "EQ", "NE", "OR", "AND", "SCOLON", "COMA", "LBRACKET", 
		"RBRACKET", "BOOL", "LINE_COMMENT", "WS", "ID"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u00e2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\5\2F\n\2\3\2\3\2\7\2J\n\2\f\2\16\2M\13\2\5\2O\n\2\3\3\3\3"+
		"\5\3S\n\3\3\3\3\3\3\4\5\4X\n\4\3\4\3\4\3\4\3\4\5\4^\n\4\3\4\5\4a\n\4\3"+
		"\4\3\4\3\4\5\4f\n\4\3\5\3\5\3\5\3\5\7\5l\n\5\f\5\16\5o\13\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u00c5\n\36\3\37\3\37\3\37\3\37\7\37"+
		"\u00cb\n\37\f\37\16\37\u00ce\13\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!"+
		"\6!\u00d9\n!\r!\16!\u00da\3!\7!\u00de\n!\f!\16!\u00e1\13!\2\2\"\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"\3\2\13\3\2\63;\3\2\62;\4\2GGgg\4\2--//\3\2$$\3\2\f\f\5\2\13\f\17\17"+
		"\"\"\4\2aac|\5\2\62;aac|\2\u00ef\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\3N\3\2\2\2\5P\3\2\2\2\7e\3\2\2\2\tg\3\2\2\2\13r\3\2\2\2\rw\3\2\2\2\17"+
		"}\3\2\2\2\21\u0080\3\2\2\2\23\u0085\3\2\2\2\25\u008a\3\2\2\2\27\u0090"+
		"\3\2\2\2\31\u0093\3\2\2\2\33\u0095\3\2\2\2\35\u0097\3\2\2\2\37\u0099\3"+
		"\2\2\2!\u009b\3\2\2\2#\u009d\3\2\2\2%\u009f\3\2\2\2\'\u00a2\3\2\2\2)\u00a4"+
		"\3\2\2\2+\u00a7\3\2\2\2-\u00aa\3\2\2\2/\u00ad\3\2\2\2\61\u00b0\3\2\2\2"+
		"\63\u00b3\3\2\2\2\65\u00b5\3\2\2\2\67\u00b7\3\2\2\29\u00b9\3\2\2\2;\u00c4"+
		"\3\2\2\2=\u00c6\3\2\2\2?\u00d3\3\2\2\2A\u00d8\3\2\2\2CO\7\62\2\2DF\7/"+
		"\2\2ED\3\2\2\2EF\3\2\2\2FG\3\2\2\2GK\t\2\2\2HJ\t\3\2\2IH\3\2\2\2JM\3\2"+
		"\2\2KI\3\2\2\2KL\3\2\2\2LO\3\2\2\2MK\3\2\2\2NC\3\2\2\2NE\3\2\2\2O\4\3"+
		"\2\2\2PR\t\4\2\2QS\t\5\2\2RQ\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\5\3\2\2U\6"+
		"\3\2\2\2VX\7/\2\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\5\3\2\2Z[\7\60\2\2["+
		"]\5\3\2\2\\^\5\5\3\2]\\\3\2\2\2]^\3\2\2\2^f\3\2\2\2_a\7/\2\2`_\3\2\2\2"+
		"`a\3\2\2\2ab\3\2\2\2bc\5\3\2\2cd\5\5\3\2df\3\2\2\2eW\3\2\2\2e`\3\2\2\2"+
		"f\b\3\2\2\2gm\7$\2\2hl\n\6\2\2ij\7^\2\2jl\7$\2\2kh\3\2\2\2ki\3\2\2\2l"+
		"o\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7$\2\2q\n\3\2\2\2"+
		"rs\7t\2\2st\7g\2\2tu\7c\2\2uv\7f\2\2v\f\3\2\2\2wx\7y\2\2xy\7t\2\2yz\7"+
		"k\2\2z{\7v\2\2{|\7g\2\2|\16\3\2\2\2}~\7k\2\2~\177\7h\2\2\177\20\3\2\2"+
		"\2\u0080\u0081\7v\2\2\u0081\u0082\7j\2\2\u0082\u0083\7g\2\2\u0083\u0084"+
		"\7p\2\2\u0084\22\3\2\2\2\u0085\u0086\7g\2\2\u0086\u0087\7n\2\2\u0087\u0088"+
		"\7u\2\2\u0088\u0089\7g\2\2\u0089\24\3\2\2\2\u008a\u008b\7y\2\2\u008b\u008c"+
		"\7j\2\2\u008c\u008d\7k\2\2\u008d\u008e\7n\2\2\u008e\u008f\7g\2\2\u008f"+
		"\26\3\2\2\2\u0090\u0091\7f\2\2\u0091\u0092\7q\2\2\u0092\30\3\2\2\2\u0093"+
		"\u0094\7?\2\2\u0094\32\3\2\2\2\u0095\u0096\7-\2\2\u0096\34\3\2\2\2\u0097"+
		"\u0098\7/\2\2\u0098\36\3\2\2\2\u0099\u009a\7,\2\2\u009a \3\2\2\2\u009b"+
		"\u009c\7\61\2\2\u009c\"\3\2\2\2\u009d\u009e\7>\2\2\u009e$\3\2\2\2\u009f"+
		"\u00a0\7>\2\2\u00a0\u00a1\7?\2\2\u00a1&\3\2\2\2\u00a2\u00a3\7@\2\2\u00a3"+
		"(\3\2\2\2\u00a4\u00a5\7@\2\2\u00a5\u00a6\7?\2\2\u00a6*\3\2\2\2\u00a7\u00a8"+
		"\7?\2\2\u00a8\u00a9\7?\2\2\u00a9,\3\2\2\2\u00aa\u00ab\7#\2\2\u00ab\u00ac"+
		"\7?\2\2\u00ac.\3\2\2\2\u00ad\u00ae\7~\2\2\u00ae\u00af\7~\2\2\u00af\60"+
		"\3\2\2\2\u00b0\u00b1\7(\2\2\u00b1\u00b2\7(\2\2\u00b2\62\3\2\2\2\u00b3"+
		"\u00b4\7=\2\2\u00b4\64\3\2\2\2\u00b5\u00b6\7.\2\2\u00b6\66\3\2\2\2\u00b7"+
		"\u00b8\7*\2\2\u00b88\3\2\2\2\u00b9\u00ba\7+\2\2\u00ba:\3\2\2\2\u00bb\u00bc"+
		"\7v\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7w\2\2\u00be\u00c5\7g\2\2\u00bf"+
		"\u00c0\7h\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3\7u\2\2"+
		"\u00c3\u00c5\7g\2\2\u00c4\u00bb\3\2\2\2\u00c4\u00bf\3\2\2\2\u00c5<\3\2"+
		"\2\2\u00c6\u00c7\7\61\2\2\u00c7\u00c8\7\61\2\2\u00c8\u00cc\3\2\2\2\u00c9"+
		"\u00cb\n\7\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"\u00d0\7\f\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\b\37\2\2\u00d2>\3\2\2\2"+
		"\u00d3\u00d4\t\b\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\b \3\2\u00d6@\3\2"+
		"\2\2\u00d7\u00d9\t\t\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00df\3\2\2\2\u00dc\u00de\t\n"+
		"\2\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0B\3\2\2\2\u00e1\u00df\3\2\2\2\21\2EKNRW]`ekm\u00c4"+
		"\u00cc\u00da\u00df\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}