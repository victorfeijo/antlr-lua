// Generated from Pandora.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PandoraLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, NAME=49, NORMALSTRING=50, CHARSTRING=51, 
		LONGSTRING=52, INT=53, HEX=54, FLOAT=55, HEX_FLOAT=56, COMMENT=57, LINE_COMMENT=58, 
		WS=59, SHEBANG=60;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "NAME", 
		"NORMALSTRING", "CHARSTRING", "LONGSTRING", "NESTED_STR", "INT", "HEX", 
		"FLOAT", "HEX_FLOAT", "ExponentPart", "HexExponentPart", "EscapeSequence", 
		"DecimalEscape", "HexEscape", "UtfEscape", "Digit", "HexDigit", "COMMENT", 
		"LINE_COMMENT", "WS", "SHEBANG"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'break'", "'if'", "'then'", "'elseif'", "'else'", "'end'", 
		"'defn'", "'return'", "':'", "','", "'def'", "'='", "'nil'", "'false'", 
		"'true'", "'...'", "'('", "')'", "'['", "']'", "'.'", "'function'", "'=>'", 
		"'{'", "'}'", "'or'", "'and'", "'<'", "'>'", "'<='", "'>='", "'~='", "'=='", 
		"'..'", "'+'", "'-'", "'*'", "'/'", "'%'", "'&'", "'|'", "'~'", "'<<'", 
		"'>>'", "'not'", "'#'", "'^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "NAME", "NORMALSTRING", "CHARSTRING", "LONGSTRING", "INT", "HEX", 
		"FLOAT", "HEX_FLOAT", "COMMENT", "LINE_COMMENT", "WS", "SHEBANG"
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


	public PandoraLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pandora.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2>\u0212\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3("+
		"\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\61"+
		"\3\61\3\62\3\62\7\62\u012b\n\62\f\62\16\62\u012e\13\62\3\63\3\63\3\63"+
		"\7\63\u0133\n\63\f\63\16\63\u0136\13\63\3\63\3\63\3\64\3\64\3\64\7\64"+
		"\u013d\n\64\f\64\16\64\u0140\13\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\7\66\u014e\n\66\f\66\16\66\u0151\13\66\3\66"+
		"\5\66\u0154\n\66\3\67\6\67\u0157\n\67\r\67\16\67\u0158\38\38\38\68\u015e"+
		"\n8\r8\168\u015f\39\69\u0163\n9\r9\169\u0164\39\39\79\u0169\n9\f9\169"+
		"\u016c\139\39\59\u016f\n9\39\39\69\u0173\n9\r9\169\u0174\39\59\u0178\n"+
		"9\39\69\u017b\n9\r9\169\u017c\39\39\59\u0181\n9\3:\3:\3:\6:\u0186\n:\r"+
		":\16:\u0187\3:\3:\7:\u018c\n:\f:\16:\u018f\13:\3:\5:\u0192\n:\3:\3:\3"+
		":\3:\6:\u0198\n:\r:\16:\u0199\3:\5:\u019d\n:\3:\3:\3:\6:\u01a2\n:\r:\16"+
		":\u01a3\3:\3:\5:\u01a8\n:\3;\3;\5;\u01ac\n;\3;\6;\u01af\n;\r;\16;\u01b0"+
		"\3<\3<\5<\u01b5\n<\3<\6<\u01b8\n<\r<\16<\u01b9\3=\3=\3=\3=\5=\u01c0\n"+
		"=\3=\3=\3=\3=\5=\u01c6\n=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u01d3\n"+
		">\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\6@\u01df\n@\r@\16@\u01e0\3@\3@\3A\3A\3"+
		"B\3B\3C\3C\3C\3C\7C\u01ed\nC\fC\16C\u01f0\13C\3C\3C\3C\3C\3C\3D\3D\3D"+
		"\3D\7D\u01fb\nD\fD\16D\u01fe\13D\3D\3D\3E\6E\u0203\nE\rE\16E\u0204\3E"+
		"\3E\3F\3F\3F\7F\u020c\nF\fF\16F\u020f\13F\3F\3F\4\u014f\u01ee\2G\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\2m\67o8q9"+
		"s:u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085;\u0087<\u0089=\u008b>\3"+
		"\2\20\5\2C\\aac|\6\2\62;C\\aac|\4\2$$^^\4\2))^^\4\2ZZzz\4\2GGgg\4\2--"+
		"//\4\2RRrr\f\2$$))^^cdhhppttvvxx||\3\2\62\64\3\2\62;\5\2\62;CHch\4\2\f"+
		"\f\17\17\5\2\13\f\16\17\"\"\2\u0231\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2\u0085\3"+
		"\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\3\u008d\3\2\2\2"+
		"\5\u008f\3\2\2\2\7\u0095\3\2\2\2\t\u0098\3\2\2\2\13\u009d\3\2\2\2\r\u00a4"+
		"\3\2\2\2\17\u00a9\3\2\2\2\21\u00ad\3\2\2\2\23\u00b2\3\2\2\2\25\u00b9\3"+
		"\2\2\2\27\u00bb\3\2\2\2\31\u00bd\3\2\2\2\33\u00c1\3\2\2\2\35\u00c3\3\2"+
		"\2\2\37\u00c7\3\2\2\2!\u00cd\3\2\2\2#\u00d2\3\2\2\2%\u00d6\3\2\2\2\'\u00d8"+
		"\3\2\2\2)\u00da\3\2\2\2+\u00dc\3\2\2\2-\u00de\3\2\2\2/\u00e0\3\2\2\2\61"+
		"\u00e9\3\2\2\2\63\u00ec\3\2\2\2\65\u00ee\3\2\2\2\67\u00f0\3\2\2\29\u00f3"+
		"\3\2\2\2;\u00f7\3\2\2\2=\u00f9\3\2\2\2?\u00fb\3\2\2\2A\u00fe\3\2\2\2C"+
		"\u0101\3\2\2\2E\u0104\3\2\2\2G\u0107\3\2\2\2I\u010a\3\2\2\2K\u010c\3\2"+
		"\2\2M\u010e\3\2\2\2O\u0110\3\2\2\2Q\u0112\3\2\2\2S\u0114\3\2\2\2U\u0116"+
		"\3\2\2\2W\u0118\3\2\2\2Y\u011a\3\2\2\2[\u011d\3\2\2\2]\u0120\3\2\2\2_"+
		"\u0124\3\2\2\2a\u0126\3\2\2\2c\u0128\3\2\2\2e\u012f\3\2\2\2g\u0139\3\2"+
		"\2\2i\u0143\3\2\2\2k\u0153\3\2\2\2m\u0156\3\2\2\2o\u015a\3\2\2\2q\u0180"+
		"\3\2\2\2s\u01a7\3\2\2\2u\u01a9\3\2\2\2w\u01b2\3\2\2\2y\u01c5\3\2\2\2{"+
		"\u01d2\3\2\2\2}\u01d4\3\2\2\2\177\u01d9\3\2\2\2\u0081\u01e4\3\2\2\2\u0083"+
		"\u01e6\3\2\2\2\u0085\u01e8\3\2\2\2\u0087\u01f6\3\2\2\2\u0089\u0202\3\2"+
		"\2\2\u008b\u0208\3\2\2\2\u008d\u008e\7=\2\2\u008e\4\3\2\2\2\u008f\u0090"+
		"\7d\2\2\u0090\u0091\7t\2\2\u0091\u0092\7g\2\2\u0092\u0093\7c\2\2\u0093"+
		"\u0094\7m\2\2\u0094\6\3\2\2\2\u0095\u0096\7k\2\2\u0096\u0097\7h\2\2\u0097"+
		"\b\3\2\2\2\u0098\u0099\7v\2\2\u0099\u009a\7j\2\2\u009a\u009b\7g\2\2\u009b"+
		"\u009c\7p\2\2\u009c\n\3\2\2\2\u009d\u009e\7g\2\2\u009e\u009f\7n\2\2\u009f"+
		"\u00a0\7u\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7h\2\2"+
		"\u00a3\f\3\2\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7\7u"+
		"\2\2\u00a7\u00a8\7g\2\2\u00a8\16\3\2\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab"+
		"\7p\2\2\u00ab\u00ac\7f\2\2\u00ac\20\3\2\2\2\u00ad\u00ae\7f\2\2\u00ae\u00af"+
		"\7g\2\2\u00af\u00b0\7h\2\2\u00b0\u00b1\7p\2\2\u00b1\22\3\2\2\2\u00b2\u00b3"+
		"\7t\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7w\2\2\u00b6"+
		"\u00b7\7t\2\2\u00b7\u00b8\7p\2\2\u00b8\24\3\2\2\2\u00b9\u00ba\7<\2\2\u00ba"+
		"\26\3\2\2\2\u00bb\u00bc\7.\2\2\u00bc\30\3\2\2\2\u00bd\u00be\7f\2\2\u00be"+
		"\u00bf\7g\2\2\u00bf\u00c0\7h\2\2\u00c0\32\3\2\2\2\u00c1\u00c2\7?\2\2\u00c2"+
		"\34\3\2\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7n\2\2\u00c6"+
		"\36\3\2\2\2\u00c7\u00c8\7h\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7n\2\2\u00ca"+
		"\u00cb\7u\2\2\u00cb\u00cc\7g\2\2\u00cc \3\2\2\2\u00cd\u00ce\7v\2\2\u00ce"+
		"\u00cf\7t\2\2\u00cf\u00d0\7w\2\2\u00d0\u00d1\7g\2\2\u00d1\"\3\2\2\2\u00d2"+
		"\u00d3\7\60\2\2\u00d3\u00d4\7\60\2\2\u00d4\u00d5\7\60\2\2\u00d5$\3\2\2"+
		"\2\u00d6\u00d7\7*\2\2\u00d7&\3\2\2\2\u00d8\u00d9\7+\2\2\u00d9(\3\2\2\2"+
		"\u00da\u00db\7]\2\2\u00db*\3\2\2\2\u00dc\u00dd\7_\2\2\u00dd,\3\2\2\2\u00de"+
		"\u00df\7\60\2\2\u00df.\3\2\2\2\u00e0\u00e1\7h\2\2\u00e1\u00e2\7w\2\2\u00e2"+
		"\u00e3\7p\2\2\u00e3\u00e4\7e\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7k\2\2"+
		"\u00e6\u00e7\7q\2\2\u00e7\u00e8\7p\2\2\u00e8\60\3\2\2\2\u00e9\u00ea\7"+
		"?\2\2\u00ea\u00eb\7@\2\2\u00eb\62\3\2\2\2\u00ec\u00ed\7}\2\2\u00ed\64"+
		"\3\2\2\2\u00ee\u00ef\7\177\2\2\u00ef\66\3\2\2\2\u00f0\u00f1\7q\2\2\u00f1"+
		"\u00f2\7t\2\2\u00f28\3\2\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7p\2\2\u00f5"+
		"\u00f6\7f\2\2\u00f6:\3\2\2\2\u00f7\u00f8\7>\2\2\u00f8<\3\2\2\2\u00f9\u00fa"+
		"\7@\2\2\u00fa>\3\2\2\2\u00fb\u00fc\7>\2\2\u00fc\u00fd\7?\2\2\u00fd@\3"+
		"\2\2\2\u00fe\u00ff\7@\2\2\u00ff\u0100\7?\2\2\u0100B\3\2\2\2\u0101\u0102"+
		"\7\u0080\2\2\u0102\u0103\7?\2\2\u0103D\3\2\2\2\u0104\u0105\7?\2\2\u0105"+
		"\u0106\7?\2\2\u0106F\3\2\2\2\u0107\u0108\7\60\2\2\u0108\u0109\7\60\2\2"+
		"\u0109H\3\2\2\2\u010a\u010b\7-\2\2\u010bJ\3\2\2\2\u010c\u010d\7/\2\2\u010d"+
		"L\3\2\2\2\u010e\u010f\7,\2\2\u010fN\3\2\2\2\u0110\u0111\7\61\2\2\u0111"+
		"P\3\2\2\2\u0112\u0113\7\'\2\2\u0113R\3\2\2\2\u0114\u0115\7(\2\2\u0115"+
		"T\3\2\2\2\u0116\u0117\7~\2\2\u0117V\3\2\2\2\u0118\u0119\7\u0080\2\2\u0119"+
		"X\3\2\2\2\u011a\u011b\7>\2\2\u011b\u011c\7>\2\2\u011cZ\3\2\2\2\u011d\u011e"+
		"\7@\2\2\u011e\u011f\7@\2\2\u011f\\\3\2\2\2\u0120\u0121\7p\2\2\u0121\u0122"+
		"\7q\2\2\u0122\u0123\7v\2\2\u0123^\3\2\2\2\u0124\u0125\7%\2\2\u0125`\3"+
		"\2\2\2\u0126\u0127\7`\2\2\u0127b\3\2\2\2\u0128\u012c\t\2\2\2\u0129\u012b"+
		"\t\3\2\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012dd\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0134\7$\2\2\u0130"+
		"\u0133\5y=\2\u0131\u0133\n\4\2\2\u0132\u0130\3\2\2\2\u0132\u0131\3\2\2"+
		"\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137"+
		"\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138\7$\2\2\u0138f\3\2\2\2\u0139\u013e"+
		"\7)\2\2\u013a\u013d\5y=\2\u013b\u013d\n\5\2\2\u013c\u013a\3\2\2\2\u013c"+
		"\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2"+
		"\2\2\u013f\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\7)\2\2\u0142"+
		"h\3\2\2\2\u0143\u0144\7]\2\2\u0144\u0145\5k\66\2\u0145\u0146\7_\2\2\u0146"+
		"j\3\2\2\2\u0147\u0148\7?\2\2\u0148\u0149\5k\66\2\u0149\u014a\7?\2\2\u014a"+
		"\u0154\3\2\2\2\u014b\u014f\7]\2\2\u014c\u014e\13\2\2\2\u014d\u014c\3\2"+
		"\2\2\u014e\u0151\3\2\2\2\u014f\u0150\3\2\2\2\u014f\u014d\3\2\2\2\u0150"+
		"\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0154\7_\2\2\u0153\u0147\3\2"+
		"\2\2\u0153\u014b\3\2\2\2\u0154l\3\2\2\2\u0155\u0157\5\u0081A\2\u0156\u0155"+
		"\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"n\3\2\2\2\u015a\u015b\7\62\2\2\u015b\u015d\t\6\2\2\u015c\u015e\5\u0083"+
		"B\2\u015d\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u015d\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160p\3\2\2\2\u0161\u0163\5\u0081A\2\u0162\u0161\3\2\2"+
		"\2\u0163\u0164\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166"+
		"\3\2\2\2\u0166\u016a\7\60\2\2\u0167\u0169\5\u0081A\2\u0168\u0167\3\2\2"+
		"\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016e"+
		"\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016f\5u;\2\u016e\u016d\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0181\3\2\2\2\u0170\u0172\7\60\2\2\u0171\u0173\5"+
		"\u0081A\2\u0172\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0172\3\2\2\2"+
		"\u0174\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0178\5u;\2\u0177\u0176"+
		"\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0181\3\2\2\2\u0179\u017b\5\u0081A"+
		"\2\u017a\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d"+
		"\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\5u;\2\u017f\u0181\3\2\2\2\u0180"+
		"\u0162\3\2\2\2\u0180\u0170\3\2\2\2\u0180\u017a\3\2\2\2\u0181r\3\2\2\2"+
		"\u0182\u0183\7\62\2\2\u0183\u0185\t\6\2\2\u0184\u0186\5\u0083B\2\u0185"+
		"\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2"+
		"\2\2\u0188\u0189\3\2\2\2\u0189\u018d\7\60\2\2\u018a\u018c\5\u0083B\2\u018b"+
		"\u018a\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2"+
		"\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0192\5w<\2\u0191\u0190"+
		"\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u01a8\3\2\2\2\u0193\u0194\7\62\2\2"+
		"\u0194\u0195\t\6\2\2\u0195\u0197\7\60\2\2\u0196\u0198\5\u0083B\2\u0197"+
		"\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2"+
		"\2\2\u019a\u019c\3\2\2\2\u019b\u019d\5w<\2\u019c\u019b\3\2\2\2\u019c\u019d"+
		"\3\2\2\2\u019d\u01a8\3\2\2\2\u019e\u019f\7\62\2\2\u019f\u01a1\t\6\2\2"+
		"\u01a0\u01a2\5\u0083B\2\u01a1\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\5w"+
		"<\2\u01a6\u01a8\3\2\2\2\u01a7\u0182\3\2\2\2\u01a7\u0193\3\2\2\2\u01a7"+
		"\u019e\3\2\2\2\u01a8t\3\2\2\2\u01a9\u01ab\t\7\2\2\u01aa\u01ac\t\b\2\2"+
		"\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01af"+
		"\5\u0081A\2\u01ae\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01ae\3\2\2"+
		"\2\u01b0\u01b1\3\2\2\2\u01b1v\3\2\2\2\u01b2\u01b4\t\t\2\2\u01b3\u01b5"+
		"\t\b\2\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\3\2\2\2\u01b6"+
		"\u01b8\5\u0081A\2\u01b7\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01b7"+
		"\3\2\2\2\u01b9\u01ba\3\2\2\2\u01bax\3\2\2\2\u01bb\u01bc\7^\2\2\u01bc\u01c6"+
		"\t\n\2\2\u01bd\u01bf\7^\2\2\u01be\u01c0\7\17\2\2\u01bf\u01be\3\2\2\2\u01bf"+
		"\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c6\7\f\2\2\u01c2\u01c6\5{"+
		">\2\u01c3\u01c6\5}?\2\u01c4\u01c6\5\177@\2\u01c5\u01bb\3\2\2\2\u01c5\u01bd"+
		"\3\2\2\2\u01c5\u01c2\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c4\3\2\2\2\u01c6"+
		"z\3\2\2\2\u01c7\u01c8\7^\2\2\u01c8\u01d3\5\u0081A\2\u01c9\u01ca\7^\2\2"+
		"\u01ca\u01cb\5\u0081A\2\u01cb\u01cc\5\u0081A\2\u01cc\u01d3\3\2\2\2\u01cd"+
		"\u01ce\7^\2\2\u01ce\u01cf\t\13\2\2\u01cf\u01d0\5\u0081A\2\u01d0\u01d1"+
		"\5\u0081A\2\u01d1\u01d3\3\2\2\2\u01d2\u01c7\3\2\2\2\u01d2\u01c9\3\2\2"+
		"\2\u01d2\u01cd\3\2\2\2\u01d3|\3\2\2\2\u01d4\u01d5\7^\2\2\u01d5\u01d6\7"+
		"z\2\2\u01d6\u01d7\5\u0083B\2\u01d7\u01d8\5\u0083B\2\u01d8~\3\2\2\2\u01d9"+
		"\u01da\7^\2\2\u01da\u01db\7w\2\2\u01db\u01dc\7}\2\2\u01dc\u01de\3\2\2"+
		"\2\u01dd\u01df\5\u0083B\2\u01de\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0"+
		"\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\7\177"+
		"\2\2\u01e3\u0080\3\2\2\2\u01e4\u01e5\t\f\2\2\u01e5\u0082\3\2\2\2\u01e6"+
		"\u01e7\t\r\2\2\u01e7\u0084\3\2\2\2\u01e8\u01e9\7\61\2\2\u01e9\u01ea\7"+
		",\2\2\u01ea\u01ee\3\2\2\2\u01eb\u01ed\13\2\2\2\u01ec\u01eb\3\2\2\2\u01ed"+
		"\u01f0\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f1\3\2"+
		"\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01f2\7,\2\2\u01f2\u01f3\7\61\2\2\u01f3"+
		"\u01f4\3\2\2\2\u01f4\u01f5\bC\2\2\u01f5\u0086\3\2\2\2\u01f6\u01f7\7\61"+
		"\2\2\u01f7\u01f8\7\61\2\2\u01f8\u01fc\3\2\2\2\u01f9\u01fb\n\16\2\2\u01fa"+
		"\u01f9\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2"+
		"\2\2\u01fd\u01ff\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0200\bD\2\2\u0200"+
		"\u0088\3\2\2\2\u0201\u0203\t\17\2\2\u0202\u0201\3\2\2\2\u0203\u0204\3"+
		"\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\3\2\2\2\u0206"+
		"\u0207\bE\2\2\u0207\u008a\3\2\2\2\u0208\u0209\7%\2\2\u0209\u020d\7#\2"+
		"\2\u020a\u020c\n\16\2\2\u020b\u020a\3\2\2\2\u020c\u020f\3\2\2\2\u020d"+
		"\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0210\3\2\2\2\u020f\u020d\3\2"+
		"\2\2\u0210\u0211\bF\3\2\u0211\u008c\3\2\2\2&\2\u012c\u0132\u0134\u013c"+
		"\u013e\u014f\u0153\u0158\u015f\u0164\u016a\u016e\u0174\u0177\u017c\u0180"+
		"\u0187\u018d\u0191\u0199\u019c\u01a3\u01a7\u01ab\u01b0\u01b4\u01b9\u01bf"+
		"\u01c5\u01d2\u01e0\u01ee\u01fc\u0204\u020d\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}