// Generated from D:/University/TA_Lessons/PLC/Compiler-1401-fall/CA2/CA2/src/main/grammar\reduct.g4 by ANTLR 4.10.1
package parsers;

    import main.ast.node.*;
    import main.ast.node.declaration.*;
    import main.ast.node.declaration.handler.*;
    import main.ast.node.statement.*;
    import main.ast.node.expression.*;
    import main.ast.node.expression.operators.*;
    import main.ast.node.expression.values.*;
    import main.ast.type.primitiveType.*;
    import main.ast.type.actorType.*;
    import main.ast.type.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class reductParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTVAL=1, STRINGVAL=2, INT=3, STRING=4, ACTOR=5, EXTENDS=6, ACTORVARS=7, 
		KNOWNACTORS=8, INITIAL=9, MSGHANDLER=10, SELF=11, MAIN=12, IF=13, ELSE=14, 
		PRINT=15, LPAREN=16, RPAREN=17, LBRACE=18, RBRACE=19, COLON=20, SEMICOLON=21, 
		COMMA=22, DOT=23, ASSIGN=24, EQ=25, PLUS=26, MINUS=27, MULT=28, IDENTIFIER=29, 
		COMMENT=30, WHITESPACE=31;
	public static final int
		RULE_program = 0, RULE_actorDeclaration = 1, RULE_mainDeclaration = 2, 
		RULE_actorInstantiation = 3, RULE_initHandlerDeclaration = 4, RULE_msgHandlerDeclaration = 5, 
		RULE_argDeclarations = 6, RULE_varDeclarations = 7, RULE_varDeclaration = 8, 
		RULE_block = 9, RULE_statement = 10, RULE_printStmt = 11, RULE_assignStmt = 12, 
		RULE_conditionalStmt = 13, RULE_msgHandlerCall = 14, RULE_expressionList = 15, 
		RULE_expression = 16, RULE_additiveExpression = 17, RULE_multiplicativeExpression = 18, 
		RULE_preUnaryExpression = 19, RULE_otherExpression = 20, RULE_actorVarAccess = 21, 
		RULE_identifier = 22, RULE_value = 23, RULE_type = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "actorDeclaration", "mainDeclaration", "actorInstantiation", 
			"initHandlerDeclaration", "msgHandlerDeclaration", "argDeclarations", 
			"varDeclarations", "varDeclaration", "block", "statement", "printStmt", 
			"assignStmt", "conditionalStmt", "msgHandlerCall", "expressionList", 
			"expression", "additiveExpression", "multiplicativeExpression", "preUnaryExpression", 
			"otherExpression", "actorVarAccess", "identifier", "value", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'int'", "'string'", "'actor'", "'extends'", "'actorvars'", 
			"'knownactors'", "'initial'", "'msghandler'", "'self'", "'main'", "'if'", 
			"'else'", "'print'", "'('", "')'", "'{'", "'}'", "':'", "';'", "','", 
			"'.'", "'='", "'=='", "'+'", "'-'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INTVAL", "STRINGVAL", "INT", "STRING", "ACTOR", "EXTENDS", "ACTORVARS", 
			"KNOWNACTORS", "INITIAL", "MSGHANDLER", "SELF", "MAIN", "IF", "ELSE", 
			"PRINT", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "COLON", "SEMICOLON", 
			"COMMA", "DOT", "ASSIGN", "EQ", "PLUS", "MINUS", "MULT", "IDENTIFIER", 
			"COMMENT", "WHITESPACE"
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
	public String getGrammarFileName() { return "reduct.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public reductParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Program p;
		public ActorDeclarationContext actordec;
		public MainDeclarationContext programMain;
		public MainDeclarationContext mainDeclaration() {
			return getRuleContext(MainDeclarationContext.class,0);
		}
		public List<ActorDeclarationContext> actorDeclaration() {
			return getRuleContexts(ActorDeclarationContext.class);
		}
		public ActorDeclarationContext actorDeclaration(int i) {
			return getRuleContext(ActorDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reductVisitor ) return ((reductVisitor<? extends T>)visitor).visitProgram(this);
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
			((ProgramContext)_localctx).p =  new Program(); _localctx.p.setLine(0);
			setState(54); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(51);
				((ProgramContext)_localctx).actordec = actorDeclaration();
				_localctx.p.addActor(((ProgramContext)_localctx).actordec.actordec);
				}
				}
				setState(56); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ACTOR );
			setState(58);
			((ProgramContext)_localctx).programMain = mainDeclaration();
			_localctx.p.setMain(((ProgramContext)_localctx).programMain.mainDecRet);
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

	public static class ActorDeclarationContext extends ParserRuleContext {
		public ActorDeclaration actordec;
		public Token a;
		public IdentifierContext name;
		public IdentifierContext pname;
		public Token queue;
		public VarDeclarationsContext vardecs;
		public InitHandlerDeclarationContext inithandler;
		public MsgHandlerDeclarationContext msghandler;
		public TerminalNode LPAREN() { return getToken(reductParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(reductParser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(reductParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(reductParser.LBRACE, i);
		}
		public TerminalNode KNOWNACTORS() { return getToken(reductParser.KNOWNACTORS, 0); }
		public List<TerminalNode> RBRACE() { return getTokens(reductParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(reductParser.RBRACE, i);
		}
		public TerminalNode ACTORVARS() { return getToken(reductParser.ACTORVARS, 0); }
		public TerminalNode ACTOR() { return getToken(reductParser.ACTOR, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode INTVAL() { return getToken(reductParser.INTVAL, 0); }
		public List<VarDeclarationsContext> varDeclarations() {
			return getRuleContexts(VarDeclarationsContext.class);
		}
		public VarDeclarationsContext varDeclarations(int i) {
			return getRuleContext(VarDeclarationsContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(reductParser.EXTENDS, 0); }
		public InitHandlerDeclarationContext initHandlerDeclaration() {
			return getRuleContext(InitHandlerDeclarationContext.class,0);
		}
		public List<MsgHandlerDeclarationContext> msgHandlerDeclaration() {
			return getRuleContexts(MsgHandlerDeclarationContext.class);
		}
		public MsgHandlerDeclarationContext msgHandlerDeclaration(int i) {
			return getRuleContext(MsgHandlerDeclarationContext.class,i);
		}
		public ActorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).enterActorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).exitActorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reductVisitor ) return ((reductVisitor<? extends T>)visitor).visitActorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActorDeclarationContext actorDeclaration() throws RecognitionException {
		ActorDeclarationContext _localctx = new ActorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_actorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			((ActorDeclarationContext)_localctx).a = match(ACTOR);
			setState(62);
			((ActorDeclarationContext)_localctx).name = identifier();
			((ActorDeclarationContext)_localctx).actordec =  new ActorDeclaration(((ActorDeclarationContext)_localctx).name.id); _localctx.actordec.setLine(((ActorDeclarationContext)_localctx).a.getLine());
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(64);
				match(EXTENDS);
				setState(65);
				((ActorDeclarationContext)_localctx).pname = identifier();
				_localctx.actordec.setParentName(((ActorDeclarationContext)_localctx).pname.id);
				}
			}

			setState(70);
			match(LPAREN);
			setState(71);
			((ActorDeclarationContext)_localctx).queue = match(INTVAL);
			setState(72);
			match(RPAREN);
			_localctx.actordec.setQueueSize((((ActorDeclarationContext)_localctx).queue!=null?Integer.valueOf(((ActorDeclarationContext)_localctx).queue.getText()):0));
			setState(74);
			match(LBRACE);
			setState(75);
			match(KNOWNACTORS);
			setState(76);
			match(LBRACE);
			setState(77);
			((ActorDeclarationContext)_localctx).vardecs = varDeclarations();
			_localctx.actordec.setKnownActors(((ActorDeclarationContext)_localctx).vardecs.vardecs);
			setState(79);
			match(RBRACE);
			setState(80);
			match(ACTORVARS);
			setState(81);
			match(LBRACE);
			setState(82);
			((ActorDeclarationContext)_localctx).vardecs = varDeclarations();
			_localctx.actordec.setActorVars(((ActorDeclarationContext)_localctx).vardecs.vardecs);
			setState(84);
			match(RBRACE);
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(85);
				((ActorDeclarationContext)_localctx).inithandler = initHandlerDeclaration();
				_localctx.actordec.setInitHandler(((ActorDeclarationContext)_localctx).inithandler.inithandler);
				}
				break;
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MSGHANDLER) {
				{
				{
				setState(90);
				((ActorDeclarationContext)_localctx).msghandler = msgHandlerDeclaration();
				_localctx.actordec.addMsgHandler(((ActorDeclarationContext)_localctx).msghandler.msghandler);
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			match(RBRACE);
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

	public static class MainDeclarationContext extends ParserRuleContext {
		public MainDeclaration mainDecRet;
		public Token m;
		public ActorInstantiationContext actorInst;
		public TerminalNode LBRACE() { return getToken(reductParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(reductParser.RBRACE, 0); }
		public TerminalNode MAIN() { return getToken(reductParser.MAIN, 0); }
		public List<ActorInstantiationContext> actorInstantiation() {
			return getRuleContexts(ActorInstantiationContext.class);
		}
		public ActorInstantiationContext actorInstantiation(int i) {
			return getRuleContext(ActorInstantiationContext.class,i);
		}
		public MainDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).enterMainDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).exitMainDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reductVisitor ) return ((reductVisitor<? extends T>)visitor).visitMainDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainDeclarationContext mainDeclaration() throws RecognitionException {
		MainDeclarationContext _localctx = new MainDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MainDeclarationContext)_localctx).mainDecRet =  new MainDeclaration();
			setState(101);
			((MainDeclarationContext)_localctx).m = match(MAIN);
			_localctx.mainDecRet.setLine(((MainDeclarationContext)_localctx).m.getLine());
			setState(103);
			match(LBRACE);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(104);
				((MainDeclarationContext)_localctx).actorInst = actorInstantiation();
				_localctx.mainDecRet.addActorInstantiation(((MainDeclarationContext)_localctx).actorInst.actorInst);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(RBRACE);
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

	public static class ActorInstantiationContext extends ParserRuleContext {
		public ActorInstantiation actorInst;
		public IdentifierContext actor;
		public IdentifierContext name;
		public IdentifierContext id;
		public ExpressionListContext el;
		public List<TerminalNode> LPAREN() { return getTokens(reductParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(reductParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(reductParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(reductParser.RPAREN, i);
		}
		public TerminalNode COLON() { return getToken(reductParser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(reductParser.SEMICOLON, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(reductParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(reductParser.COMMA, i);
		}
		public ActorInstantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actorInstantiation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).enterActorInstantiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).exitActorInstantiation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reductVisitor ) return ((reductVisitor<? extends T>)visitor).visitActorInstantiation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActorInstantiationContext actorInstantiation() throws RecognitionException {
		ActorInstantiationContext _localctx = new ActorInstantiationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_actorInstantiation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			((ActorInstantiationContext)_localctx).actor = identifier();
			setState(115);
			((ActorInstantiationContext)_localctx).name = identifier();
			((ActorInstantiationContext)_localctx).actorInst =  new ActorInstantiation(new ActorType(((ActorInstantiationContext)_localctx).actor.id.getName()), ((ActorInstantiationContext)_localctx).name.id); _localctx.actorInst.setLine(((ActorInstantiationContext)_localctx).actor.id.getLine());
			setState(117);
			match(LPAREN);
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(118);
				((ActorInstantiationContext)_localctx).id = identifier();
				_localctx.actorInst.addKnownActor(((ActorInstantiationContext)_localctx).id.id);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(120);
					match(COMMA);
					setState(121);
					((ActorInstantiationContext)_localctx).id = identifier();
					_localctx.actorInst.addKnownActor(((ActorInstantiationContext)_localctx).id.id);
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RPAREN:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(132);
			match(RPAREN);
			setState(133);
			match(COLON);
			setState(134);
			match(LPAREN);
			setState(135);
			((ActorInstantiationContext)_localctx).el = expressionList();
			setState(136);
			match(RPAREN);
			setState(137);
			match(SEMICOLON);
			 _localctx.actorInst.setInitArgs(((ActorInstantiationContext)_localctx).el.expressions);
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

	public static class InitHandlerDeclarationContext extends ParserRuleContext {
		public InitHandlerDeclaration inithandler;
		public Token msg;
		public Token i;
		public ArgDeclarationsContext argdecs;
		public VarDeclarationsContext vardecs;
		public BlockContext b;
		public TerminalNode LPAREN() { return getToken(reductParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(reductParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(reductParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(reductParser.RBRACE, 0); }
		public TerminalNode MSGHANDLER() { return getToken(reductParser.MSGHANDLER, 0); }
		public TerminalNode INITIAL() { return getToken(reductParser.INITIAL, 0); }
		public ArgDeclarationsContext argDeclarations() {
			return getRuleContext(ArgDeclarationsContext.class,0);
		}
		public VarDeclarationsContext varDeclarations() {
			return getRuleContext(VarDeclarationsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InitHandlerDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initHandlerDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).enterInitHandlerDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).exitInitHandlerDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reductVisitor ) return ((reductVisitor<? extends T>)visitor).visitInitHandlerDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitHandlerDeclarationContext initHandlerDeclaration() throws RecognitionException {
		InitHandlerDeclarationContext _localctx = new InitHandlerDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_initHandlerDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			((InitHandlerDeclarationContext)_localctx).msg = match(MSGHANDLER);
			setState(141);
			((InitHandlerDeclarationContext)_localctx).i = match(INITIAL);

			    Identifier initId = new Identifier("initial");
			    initId.setLine(((InitHandlerDeclarationContext)_localctx).i.getLine());
			    ((InitHandlerDeclarationContext)_localctx).inithandler =  new InitHandlerDeclaration(initId);
			    _localctx.inithandler.setLine(((InitHandlerDeclarationContext)_localctx).msg.getLine());
			setState(143);
			match(LPAREN);
			setState(144);
			((InitHandlerDeclarationContext)_localctx).argdecs = argDeclarations();
			setState(145);
			match(RPAREN);
			_localctx.inithandler.setArgs(((InitHandlerDeclarationContext)_localctx).argdecs.argdecs);
			setState(147);
			match(LBRACE);
			setState(148);
			((InitHandlerDeclarationContext)_localctx).vardecs = varDeclarations();
			_localctx.inithandler.setLocalVars(((InitHandlerDeclarationContext)_localctx).vardecs.vardecs);
			setState(150);
			((InitHandlerDeclarationContext)_localctx).b = block();
			_localctx.inithandler.setBody(((InitHandlerDeclarationContext)_localctx).b.statements);
			setState(152);
			match(RBRACE);
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

	public static class MsgHandlerDeclarationContext extends ParserRuleContext {
		public MsgHandlerDeclaration msghandler;
		public Token msg;
		public IdentifierContext id;
		public ArgDeclarationsContext argdecs;
		public VarDeclarationsContext vardecs;
		public BlockContext b;
		public TerminalNode LPAREN() { return getToken(reductParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(reductParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(reductParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(reductParser.RBRACE, 0); }
		public TerminalNode MSGHANDLER() { return getToken(reductParser.MSGHANDLER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgDeclarationsContext argDeclarations() {
			return getRuleContext(ArgDeclarationsContext.class,0);
		}
		public VarDeclarationsContext varDeclarations() {
			return getRuleContext(VarDeclarationsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MsgHandlerDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_msgHandlerDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).enterMsgHandlerDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).exitMsgHandlerDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reductVisitor ) return ((reductVisitor<? extends T>)visitor).visitMsgHandlerDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MsgHandlerDeclarationContext msgHandlerDeclaration() throws RecognitionException {
		MsgHandlerDeclarationContext _localctx = new MsgHandlerDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_msgHandlerDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			((MsgHandlerDeclarationContext)_localctx).msg = match(MSGHANDLER);
			setState(155);
			((MsgHandlerDeclarationContext)_localctx).id = identifier();
			((MsgHandlerDeclarationContext)_localctx).msghandler =  new MsgHandlerDeclaration(((MsgHandlerDeclarationContext)_localctx).id.id); _localctx.msghandler.setLine(((MsgHandlerDeclarationContext)_localctx).msg.getLine());
			setState(157);
			match(LPAREN);
			setState(158);
			((MsgHandlerDeclarationContext)_localctx).argdecs = argDeclarations();
			setState(159);
			match(RPAREN);
			_localctx.msghandler.setArgs(((MsgHandlerDeclarationContext)_localctx).argdecs.argdecs);
			setState(161);
			match(LBRACE);
			setState(162);
			((MsgHandlerDeclarationContext)_localctx).vardecs = varDeclarations();
			_localctx.msghandler.setLocalVars(((MsgHandlerDeclarationContext)_localctx).vardecs.vardecs);
			setState(164);
			((MsgHandlerDeclarationContext)_localctx).b = block();
			_localctx.msghandler.setBody(((MsgHandlerDeclarationContext)_localctx).b.statements);
			setState(166);
			match(RBRACE);
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

	public static class ArgDeclarationsContext extends ParserRuleContext {
		public ArrayList<VarDeclaration> argdecs;
		public VarDeclarationContext vardec;
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(reductParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(reductParser.COMMA, i);
		}
		public ArgDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).enterArgDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).exitArgDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reductVisitor ) return ((reductVisitor<? extends T>)visitor).visitArgDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgDeclarationsContext argDeclarations() throws RecognitionException {
		ArgDeclarationsContext _localctx = new ArgDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_argDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ArgDeclarationsContext)_localctx).argdecs =  new ArrayList<>();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(169);
				((ArgDeclarationsContext)_localctx).vardec = varDeclaration();
				_localctx.argdecs.add(((ArgDeclarationsContext)_localctx).vardec.vardec);
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(171);
					match(COMMA);
					setState(172);
					((ArgDeclarationsContext)_localctx).vardec = varDeclaration();
					_localctx.argdecs.add(((ArgDeclarationsContext)_localctx).vardec.vardec);
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class VarDeclarationsContext extends ParserRuleContext {
		public ArrayList<VarDeclaration> vardecs;
		public VarDeclarationContext vardec;
		public List<TerminalNode> SEMICOLON() { return getTokens(reductParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(reductParser.SEMICOLON, i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public VarDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).enterVarDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).exitVarDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reductVisitor ) return ((reductVisitor<? extends T>)visitor).visitVarDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationsContext varDeclarations() throws RecognitionException {
		VarDeclarationsContext _localctx = new VarDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varDeclarations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((VarDeclarationsContext)_localctx).vardecs =  new ArrayList<>();
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(183);
					((VarDeclarationsContext)_localctx).vardec = varDeclaration();
					setState(184);
					match(SEMICOLON);
					_localctx.vardecs.add(((VarDeclarationsContext)_localctx).vardec.vardec);
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public VarDeclaration vardec;
		public TypeContext t;
		public IdentifierContext id;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reductVisitor ) return ((reductVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			((VarDeclarationContext)_localctx).t = type();
			setState(193);
			((VarDeclarationContext)_localctx).id = identifier();
			((VarDeclarationContext)_localctx).vardec =  new VarDeclaration(((VarDeclarationContext)_localctx).id.id, ((VarDeclarationContext)_localctx).t.typeRet); _localctx.vardec.setLine(((VarDeclarationContext)_localctx).id.id.getLine());
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

	public static class BlockContext extends ParserRuleContext {
		public ArrayList<Statement> statements;
		public StatementContext s;
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
			if ( listener instanceof reductListener ) ((reductListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reductVisitor ) return ((reductVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((BlockContext)_localctx).statements =  new ArrayList<>();
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTVAL) | (1L << STRINGVAL) | (1L << SELF) | (1L << IF) | (1L << PRINT) | (1L << LPAREN) | (1L << MINUS) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(197);
				((BlockContext)_localctx).s = statement();
				_localctx.statements.add(((BlockContext)_localctx).s.s);
				}
				}
				setState(204);
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

	public static class StatementContext extends ParserRuleContext {
		public Statement s;
		public PrintStmtContext p;
		public AssignStmtContext a;
		public ConditionalStmtContext c;
		public MsgHandlerCallContext m;
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public ConditionalStmtContext conditionalStmt() {
			return getRuleContext(ConditionalStmtContext.class,0);
		}
		public MsgHandlerCallContext msgHandlerCall() {
			return getRuleContext(MsgHandlerCallContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reductVisitor ) return ((reductVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				((StatementContext)_localctx).p = printStmt();
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).p.printRet;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				((StatementContext)_localctx).a = assignStmt();
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).a.assignRet;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				((StatementContext)_localctx).c = conditionalStmt();
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).c.conditionalRet;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
				((StatementContext)_localctx).m = msgHandlerCall();
				((StatementContext)_localctx).s =  ((StatementContext)_localctx).m.handlerCallRet;
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

	public static class PrintStmtContext extends ParserRuleContext {
		public PrintStmt printRet;
		public Token p;
		public ExpressionContext e;
		public TerminalNode LPAREN() { return getToken(reductParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(reductParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(reductParser.SEMICOLON, 0); }
		public TerminalNode PRINT() { return getToken(reductParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).enterPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).exitPrintStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reductVisitor ) return ((reductVisitor<? extends T>)visitor).visitPrintStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_printStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			((PrintStmtContext)_localctx).p = match(PRINT);
			setState(220);
			match(LPAREN);
			setState(221);
			((PrintStmtContext)_localctx).e = expression();
			setState(222);
			match(RPAREN);
			setState(223);
			match(SEMICOLON);
			((PrintStmtContext)_localctx).printRet =  new PrintStmt(((PrintStmtContext)_localctx).e.exprRet); _localctx.printRet.setLine(((PrintStmtContext)_localctx).p.getLine());
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

	public static class AssignStmtContext extends ParserRuleContext {
		public AssignStmt assignRet;
		public ExpressionContext lv;
		public Token a;
		public ExpressionContext rv;
		public TerminalNode SEMICOLON() { return getToken(reductParser.SEMICOLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(reductParser.ASSIGN, 0); }
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).enterAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).exitAssignStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reductVisitor ) return ((reductVisitor<? extends T>)visitor).visitAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			((AssignStmtContext)_localctx).lv = expression();
			setState(227);
			((AssignStmtContext)_localctx).a = match(ASSIGN);
			setState(228);
			((AssignStmtContext)_localctx).rv = expression();
			((AssignStmtContext)_localctx).assignRet =  new AssignStmt(((AssignStmtContext)_localctx).lv.exprRet, ((AssignStmtContext)_localctx).rv.exprRet); _localctx.assignRet.setLine(((AssignStmtContext)_localctx).a.getLine());
			setState(230);
			match(SEMICOLON);
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

	public static class ConditionalStmtContext extends ParserRuleContext {
		public ConditionalStmt conditionalRet;
		public Token i;
		public ExpressionContext cond;
		public BlockContext b;
		public TerminalNode LPAREN() { return getToken(reductParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(reductParser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(reductParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(reductParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(reductParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(reductParser.RBRACE, i);
		}
		public TerminalNode IF() { return getToken(reductParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(reductParser.ELSE, 0); }
		public ConditionalStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).enterConditionalStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).exitConditionalStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reductVisitor ) return ((reductVisitor<? extends T>)visitor).visitConditionalStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalStmtContext conditionalStmt() throws RecognitionException {
		ConditionalStmtContext _localctx = new ConditionalStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_conditionalStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			((ConditionalStmtContext)_localctx).i = match(IF);
			setState(233);
			match(LPAREN);
			setState(234);
			((ConditionalStmtContext)_localctx).cond = expression();
			setState(235);
			match(RPAREN);
			setState(236);
			match(LBRACE);
			setState(237);
			((ConditionalStmtContext)_localctx).b = block();
			((ConditionalStmtContext)_localctx).conditionalRet =  new ConditionalStmt(((ConditionalStmtContext)_localctx).cond.exprRet, ((ConditionalStmtContext)_localctx).b.statements); _localctx.conditionalRet.setLine(((ConditionalStmtContext)_localctx).i.getLine());
			setState(239);
			match(RBRACE);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(240);
				match(ELSE);
				setState(241);
				match(LBRACE);
				setState(242);
				((ConditionalStmtContext)_localctx).b = block();
				_localctx.conditionalRet.setElseBody(((ConditionalStmtContext)_localctx).b.statements);
				setState(244);
				match(RBRACE);
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

	public static class MsgHandlerCallContext extends ParserRuleContext {
		public MsgHandlerCall handlerCallRet;
		public IdentifierContext id;
		public Token s;
		public Token dot;
		public IdentifierContext name;
		public ExpressionListContext el;
		public TerminalNode LPAREN() { return getToken(reductParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(reductParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(reductParser.SEMICOLON, 0); }
		public TerminalNode DOT() { return getToken(reductParser.DOT, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode SELF() { return getToken(reductParser.SELF, 0); }
		public MsgHandlerCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_msgHandlerCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).enterMsgHandlerCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).exitMsgHandlerCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reductVisitor ) return ((reductVisitor<? extends T>)visitor).visitMsgHandlerCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MsgHandlerCallContext msgHandlerCall() throws RecognitionException {
		MsgHandlerCallContext _localctx = new MsgHandlerCallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_msgHandlerCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			Expression instance;
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(249);
				((MsgHandlerCallContext)_localctx).id = identifier();
				instance = ((MsgHandlerCallContext)_localctx).id.id;
				}
				break;
			case SELF:
				{
				setState(252);
				((MsgHandlerCallContext)_localctx).s = match(SELF);
				instance = new Self(); instance.setLine(((MsgHandlerCallContext)_localctx).s.getLine());
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(256);
			((MsgHandlerCallContext)_localctx).dot = match(DOT);
			setState(257);
			((MsgHandlerCallContext)_localctx).name = identifier();
			((MsgHandlerCallContext)_localctx).handlerCallRet =  new MsgHandlerCall(instance, ((MsgHandlerCallContext)_localctx).name.id); _localctx.handlerCallRet.setLine(((MsgHandlerCallContext)_localctx).dot.getLine());
			setState(259);
			match(LPAREN);
			setState(260);
			((MsgHandlerCallContext)_localctx).el = expressionList();
			setState(261);
			match(RPAREN);
			_localctx.handlerCallRet.setArgs(((MsgHandlerCallContext)_localctx).el.expressions);
			setState(263);
			match(SEMICOLON);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public ArrayList <Expression> expressions;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(reductParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(reductParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reductVisitor ) return ((reductVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpressionListContext)_localctx).expressions =  new ArrayList<>();
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTVAL) | (1L << STRINGVAL) | (1L << SELF) | (1L << LPAREN) | (1L << MINUS) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(266);
				((ExpressionListContext)_localctx).e1 = expression();
				_localctx.expressions.add(((ExpressionListContext)_localctx).e1.exprRet);
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(268);
					match(COMMA);
					setState(269);
					((ExpressionListContext)_localctx).e2 = expression();
					_localctx.expressions.add(((ExpressionListContext)_localctx).e2.exprRet);
					}
					}
					setState(276);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression exprRet;
		public AdditiveExpressionContext lexpr;
		public Token eq;
		public AdditiveExpressionContext rexpr;
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(reductParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(reductParser.EQ, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reductVisitor ) return ((reductVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			((ExpressionContext)_localctx).lexpr = additiveExpression();
			((ExpressionContext)_localctx).exprRet =  ((ExpressionContext)_localctx).lexpr.additiveExprRet;
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQ) {
				{
				{
				setState(281);
				((ExpressionContext)_localctx).eq = match(EQ);
				setState(282);
				((ExpressionContext)_localctx).rexpr = additiveExpression();
				((ExpressionContext)_localctx).exprRet =  new BinaryExpression(_localctx.exprRet, ((ExpressionContext)_localctx).rexpr.additiveExprRet, BinaryOperator.eq);
				     _localctx.exprRet.setLine(((ExpressionContext)_localctx).eq.getLine());
				}
				}
				setState(289);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public Expression additiveExprRet;
		public MultiplicativeExpressionContext lexpr;
		public Token plus;
		public Token minus;
		public MultiplicativeExpressionContext rexpr;
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(reductParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(reductParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(reductParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(reductParser.MINUS, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reductVisitor ) return ((reductVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			((AdditiveExpressionContext)_localctx).lexpr = multiplicativeExpression();
			((AdditiveExpressionContext)_localctx).additiveExprRet =  ((AdditiveExpressionContext)_localctx).lexpr.multiplicativeExprRet;
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				BinaryOperator op; int lineNum;
				setState(297);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(293);
					((AdditiveExpressionContext)_localctx).plus = match(PLUS);
					op = BinaryOperator.add; lineNum = ((AdditiveExpressionContext)_localctx).plus.getLine();
					}
					break;
				case MINUS:
					{
					setState(295);
					((AdditiveExpressionContext)_localctx).minus = match(MINUS);
					op = BinaryOperator.sub; lineNum = ((AdditiveExpressionContext)_localctx).minus.getLine();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(299);
				((AdditiveExpressionContext)_localctx).rexpr = multiplicativeExpression();
				((AdditiveExpressionContext)_localctx).additiveExprRet =  new BinaryExpression(_localctx.additiveExprRet, ((AdditiveExpressionContext)_localctx).rexpr.multiplicativeExprRet, op);
				     _localctx.additiveExprRet.setLine(lineNum);
				}
				}
				setState(306);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public Expression multiplicativeExprRet;
		public PreUnaryExpressionContext lexpr;
		public Token mult;
		public PreUnaryExpressionContext rexpr;
		public List<PreUnaryExpressionContext> preUnaryExpression() {
			return getRuleContexts(PreUnaryExpressionContext.class);
		}
		public PreUnaryExpressionContext preUnaryExpression(int i) {
			return getRuleContext(PreUnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(reductParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(reductParser.MULT, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reductVisitor ) return ((reductVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			((MultiplicativeExpressionContext)_localctx).lexpr = preUnaryExpression();
			((MultiplicativeExpressionContext)_localctx).multiplicativeExprRet =  ((MultiplicativeExpressionContext)_localctx).lexpr.preUnaryExprRet;
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT) {
				{
				{
				setState(309);
				((MultiplicativeExpressionContext)_localctx).mult = match(MULT);
				setState(310);
				((MultiplicativeExpressionContext)_localctx).rexpr = preUnaryExpression();
				((MultiplicativeExpressionContext)_localctx).multiplicativeExprRet =  new BinaryExpression(_localctx.multiplicativeExprRet, ((MultiplicativeExpressionContext)_localctx).rexpr.preUnaryExprRet, BinaryOperator.mult);
				     _localctx.multiplicativeExprRet.setLine(((MultiplicativeExpressionContext)_localctx).mult.getLine());
				}
				}
				setState(317);
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

	public static class PreUnaryExpressionContext extends ParserRuleContext {
		public Expression preUnaryExprRet;
		public Token minus;
		public PreUnaryExpressionContext pe;
		public OtherExpressionContext oe;
		public TerminalNode MINUS() { return getToken(reductParser.MINUS, 0); }
		public PreUnaryExpressionContext preUnaryExpression() {
			return getRuleContext(PreUnaryExpressionContext.class,0);
		}
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
		}
		public PreUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).enterPreUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).exitPreUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reductVisitor ) return ((reductVisitor<? extends T>)visitor).visitPreUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreUnaryExpressionContext preUnaryExpression() throws RecognitionException {
		PreUnaryExpressionContext _localctx = new PreUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_preUnaryExpression);
		try {
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				((PreUnaryExpressionContext)_localctx).minus = match(MINUS);
				setState(319);
				((PreUnaryExpressionContext)_localctx).pe = preUnaryExpression();
				((PreUnaryExpressionContext)_localctx).preUnaryExprRet =  new UnaryExpression(UnaryOperator.minus, ((PreUnaryExpressionContext)_localctx).pe.preUnaryExprRet);
				        _localctx.preUnaryExprRet.setLine(((PreUnaryExpressionContext)_localctx).minus.getLine());
				}
				break;
			case INTVAL:
			case STRINGVAL:
			case SELF:
			case LPAREN:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				((PreUnaryExpressionContext)_localctx).oe = otherExpression();
				((PreUnaryExpressionContext)_localctx).preUnaryExprRet =  ((PreUnaryExpressionContext)_localctx).oe.otherExprRet;
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

	public static class OtherExpressionContext extends ParserRuleContext {
		public Expression otherExprRet;
		public ExpressionContext e;
		public IdentifierContext id;
		public ActorVarAccessContext av;
		public ValueContext v;
		public TerminalNode LPAREN() { return getToken(reductParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(reductParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ActorVarAccessContext actorVarAccess() {
			return getRuleContext(ActorVarAccessContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public OtherExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).enterOtherExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).exitOtherExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reductVisitor ) return ((reductVisitor<? extends T>)visitor).visitOtherExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherExpressionContext otherExpression() throws RecognitionException {
		OtherExpressionContext _localctx = new OtherExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_otherExpression);
		try {
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				match(LPAREN);
				setState(328);
				((OtherExpressionContext)_localctx).e = expression();
				((OtherExpressionContext)_localctx).otherExprRet =  ((OtherExpressionContext)_localctx).e.exprRet;
				setState(330);
				match(RPAREN);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				((OtherExpressionContext)_localctx).id = identifier();
				((OtherExpressionContext)_localctx).otherExprRet =  ((OtherExpressionContext)_localctx).id.id;
				}
				break;
			case SELF:
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
				((OtherExpressionContext)_localctx).av = actorVarAccess();
				((OtherExpressionContext)_localctx).otherExprRet =  ((OtherExpressionContext)_localctx).av.av;
				}
				break;
			case INTVAL:
			case STRINGVAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(338);
				((OtherExpressionContext)_localctx).v = value();
				((OtherExpressionContext)_localctx).otherExprRet =  ((OtherExpressionContext)_localctx).v.valueRet;
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

	public static class ActorVarAccessContext extends ParserRuleContext {
		public ActorVarAccess av;
		public Token s;
		public Token d;
		public IdentifierContext id;
		public TerminalNode SELF() { return getToken(reductParser.SELF, 0); }
		public TerminalNode DOT() { return getToken(reductParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ActorVarAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actorVarAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).enterActorVarAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).exitActorVarAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reductVisitor ) return ((reductVisitor<? extends T>)visitor).visitActorVarAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActorVarAccessContext actorVarAccess() throws RecognitionException {
		ActorVarAccessContext _localctx = new ActorVarAccessContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_actorVarAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			Expression instance;
			setState(344);
			((ActorVarAccessContext)_localctx).s = match(SELF);
			instance = new Self(); instance.setLine(((ActorVarAccessContext)_localctx).s.getLine());
			setState(346);
			((ActorVarAccessContext)_localctx).d = match(DOT);
			setState(347);
			((ActorVarAccessContext)_localctx).id = identifier();
			((ActorVarAccessContext)_localctx).av =  new ActorVarAccess(instance, ((ActorVarAccessContext)_localctx).id.id); _localctx.av.setLine(((ActorVarAccessContext)_localctx).d.getLine());
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

	public static class IdentifierContext extends ParserRuleContext {
		public Identifier id;
		public Token iden;
		public TerminalNode IDENTIFIER() { return getToken(reductParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reductVisitor ) return ((reductVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			((IdentifierContext)_localctx).iden = match(IDENTIFIER);
			((IdentifierContext)_localctx).id =  new Identifier((((IdentifierContext)_localctx).iden!=null?((IdentifierContext)_localctx).iden.getText():null)); _localctx.id.setLine(((IdentifierContext)_localctx).iden.getLine());
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
		public Value valueRet;
		public Token intVal;
		public Token strVal;
		public TerminalNode INTVAL() { return getToken(reductParser.INTVAL, 0); }
		public TerminalNode STRINGVAL() { return getToken(reductParser.STRINGVAL, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reductVisitor ) return ((reductVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_value);
		try {
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTVAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				((ValueContext)_localctx).intVal = match(INTVAL);
				((ValueContext)_localctx).valueRet =  new IntValue((((ValueContext)_localctx).intVal!=null?Integer.valueOf(((ValueContext)_localctx).intVal.getText()):0)); _localctx.valueRet.setLine(((ValueContext)_localctx).intVal.getLine());
				}
				break;
			case STRINGVAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				((ValueContext)_localctx).strVal = match(STRINGVAL);
				((ValueContext)_localctx).valueRet =  new StringValue((((ValueContext)_localctx).strVal!=null?((ValueContext)_localctx).strVal.getText():null)); _localctx.valueRet.setLine(((ValueContext)_localctx).strVal.getLine());
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

	public static class TypeContext extends ParserRuleContext {
		public Type typeRet;
		public IdentifierContext id;
		public TerminalNode INT() { return getToken(reductParser.INT, 0); }
		public TerminalNode STRING() { return getToken(reductParser.STRING, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reductListener ) ((reductListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof reductVisitor ) return ((reductVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_type);
		try {
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				match(INT);
				((TypeContext)_localctx).typeRet =  new IntType();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				match(STRING);
				((TypeContext)_localctx).typeRet =  new StringType();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(363);
				((TypeContext)_localctx).id = identifier();
				((TypeContext)_localctx).typeRet =  new ActorType(((TypeContext)_localctx).id.id.getName());
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

	public static final String _serializedATN =
		"\u0004\u0001\u001f\u0171\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u00007\b"+
		"\u0000\u000b\u0000\f\u00008\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001E\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001Y\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001^\b\u0001\n\u0001\f\u0001a\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002l\b\u0002\n\u0002\f\u0002o\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003}\b\u0003\n\u0003\f\u0003\u0080\t\u0003\u0001\u0003"+
		"\u0003\u0003\u0083\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00b0\b\u0006\n\u0006"+
		"\f\u0006\u00b3\t\u0006\u0003\u0006\u00b5\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00bc\b\u0007\n\u0007"+
		"\f\u0007\u00bf\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0005\t\u00c9\b\t\n\t\f\t\u00cc\t\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00da\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00f7\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00ff\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u0111\b\u000f\n\u000f\f\u000f\u0114\t\u000f\u0003\u000f\u0116\b"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u011e\b\u0010\n\u0010\f\u0010\u0121\t\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u012a\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u012f\b\u0011\n\u0011\f\u0011\u0132\t\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u013a\b\u0012\n"+
		"\u0012\f\u0012\u013d\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0146\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u0156\b\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u0166\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u016f\b\u0018\u0001\u0018\u0000"+
		"\u0000\u0019\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.0\u0000\u0000\u0174\u00002\u0001\u0000"+
		"\u0000\u0000\u0002=\u0001\u0000\u0000\u0000\u0004d\u0001\u0000\u0000\u0000"+
		"\u0006r\u0001\u0000\u0000\u0000\b\u008c\u0001\u0000\u0000\u0000\n\u009a"+
		"\u0001\u0000\u0000\u0000\f\u00a8\u0001\u0000\u0000\u0000\u000e\u00b6\u0001"+
		"\u0000\u0000\u0000\u0010\u00c0\u0001\u0000\u0000\u0000\u0012\u00c4\u0001"+
		"\u0000\u0000\u0000\u0014\u00d9\u0001\u0000\u0000\u0000\u0016\u00db\u0001"+
		"\u0000\u0000\u0000\u0018\u00e2\u0001\u0000\u0000\u0000\u001a\u00e8\u0001"+
		"\u0000\u0000\u0000\u001c\u00f8\u0001\u0000\u0000\u0000\u001e\u0109\u0001"+
		"\u0000\u0000\u0000 \u0117\u0001\u0000\u0000\u0000\"\u0122\u0001\u0000"+
		"\u0000\u0000$\u0133\u0001\u0000\u0000\u0000&\u0145\u0001\u0000\u0000\u0000"+
		"(\u0155\u0001\u0000\u0000\u0000*\u0157\u0001\u0000\u0000\u0000,\u015e"+
		"\u0001\u0000\u0000\u0000.\u0165\u0001\u0000\u0000\u00000\u016e\u0001\u0000"+
		"\u0000\u000026\u0006\u0000\uffff\uffff\u000034\u0003\u0002\u0001\u0000"+
		"45\u0006\u0000\uffff\uffff\u000057\u0001\u0000\u0000\u000063\u0001\u0000"+
		"\u0000\u000078\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u000089\u0001"+
		"\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0003\u0004\u0002\u0000"+
		";<\u0006\u0000\uffff\uffff\u0000<\u0001\u0001\u0000\u0000\u0000=>\u0005"+
		"\u0005\u0000\u0000>?\u0003,\u0016\u0000?D\u0006\u0001\uffff\uffff\u0000"+
		"@A\u0005\u0006\u0000\u0000AB\u0003,\u0016\u0000BC\u0006\u0001\uffff\uffff"+
		"\u0000CE\u0001\u0000\u0000\u0000D@\u0001\u0000\u0000\u0000DE\u0001\u0000"+
		"\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0005\u0010\u0000\u0000GH\u0005"+
		"\u0001\u0000\u0000HI\u0005\u0011\u0000\u0000IJ\u0006\u0001\uffff\uffff"+
		"\u0000JK\u0005\u0012\u0000\u0000KL\u0005\b\u0000\u0000LM\u0005\u0012\u0000"+
		"\u0000MN\u0003\u000e\u0007\u0000NO\u0006\u0001\uffff\uffff\u0000OP\u0005"+
		"\u0013\u0000\u0000PQ\u0005\u0007\u0000\u0000QR\u0005\u0012\u0000\u0000"+
		"RS\u0003\u000e\u0007\u0000ST\u0006\u0001\uffff\uffff\u0000TX\u0005\u0013"+
		"\u0000\u0000UV\u0003\b\u0004\u0000VW\u0006\u0001\uffff\uffff\u0000WY\u0001"+
		"\u0000\u0000\u0000XU\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"Y_\u0001\u0000\u0000\u0000Z[\u0003\n\u0005\u0000[\\\u0006\u0001\uffff"+
		"\uffff\u0000\\^\u0001\u0000\u0000\u0000]Z\u0001\u0000\u0000\u0000^a\u0001"+
		"\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000"+
		"`b\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000bc\u0005\u0013\u0000"+
		"\u0000c\u0003\u0001\u0000\u0000\u0000de\u0006\u0002\uffff\uffff\u0000"+
		"ef\u0005\f\u0000\u0000fg\u0006\u0002\uffff\uffff\u0000gm\u0005\u0012\u0000"+
		"\u0000hi\u0003\u0006\u0003\u0000ij\u0006\u0002\uffff\uffff\u0000jl\u0001"+
		"\u0000\u0000\u0000kh\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000"+
		"mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001\u0000\u0000"+
		"\u0000om\u0001\u0000\u0000\u0000pq\u0005\u0013\u0000\u0000q\u0005\u0001"+
		"\u0000\u0000\u0000rs\u0003,\u0016\u0000st\u0003,\u0016\u0000tu\u0006\u0003"+
		"\uffff\uffff\u0000u\u0082\u0005\u0010\u0000\u0000vw\u0003,\u0016\u0000"+
		"w~\u0006\u0003\uffff\uffff\u0000xy\u0005\u0016\u0000\u0000yz\u0003,\u0016"+
		"\u0000z{\u0006\u0003\uffff\uffff\u0000{}\u0001\u0000\u0000\u0000|x\u0001"+
		"\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000"+
		"\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0083\u0001\u0000\u0000\u0000"+
		"\u0080~\u0001\u0000\u0000\u0000\u0081\u0083\u0001\u0000\u0000\u0000\u0082"+
		"v\u0001\u0000\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0011\u0000\u0000\u0085\u0086"+
		"\u0005\u0014\u0000\u0000\u0086\u0087\u0005\u0010\u0000\u0000\u0087\u0088"+
		"\u0003\u001e\u000f\u0000\u0088\u0089\u0005\u0011\u0000\u0000\u0089\u008a"+
		"\u0005\u0015\u0000\u0000\u008a\u008b\u0006\u0003\uffff\uffff\u0000\u008b"+
		"\u0007\u0001\u0000\u0000\u0000\u008c\u008d\u0005\n\u0000\u0000\u008d\u008e"+
		"\u0005\t\u0000\u0000\u008e\u008f\u0006\u0004\uffff\uffff\u0000\u008f\u0090"+
		"\u0005\u0010\u0000\u0000\u0090\u0091\u0003\f\u0006\u0000\u0091\u0092\u0005"+
		"\u0011\u0000\u0000\u0092\u0093\u0006\u0004\uffff\uffff\u0000\u0093\u0094"+
		"\u0005\u0012\u0000\u0000\u0094\u0095\u0003\u000e\u0007\u0000\u0095\u0096"+
		"\u0006\u0004\uffff\uffff\u0000\u0096\u0097\u0003\u0012\t\u0000\u0097\u0098"+
		"\u0006\u0004\uffff\uffff\u0000\u0098\u0099\u0005\u0013\u0000\u0000\u0099"+
		"\t\u0001\u0000\u0000\u0000\u009a\u009b\u0005\n\u0000\u0000\u009b\u009c"+
		"\u0003,\u0016\u0000\u009c\u009d\u0006\u0005\uffff\uffff\u0000\u009d\u009e"+
		"\u0005\u0010\u0000\u0000\u009e\u009f\u0003\f\u0006\u0000\u009f\u00a0\u0005"+
		"\u0011\u0000\u0000\u00a0\u00a1\u0006\u0005\uffff\uffff\u0000\u00a1\u00a2"+
		"\u0005\u0012\u0000\u0000\u00a2\u00a3\u0003\u000e\u0007\u0000\u00a3\u00a4"+
		"\u0006\u0005\uffff\uffff\u0000\u00a4\u00a5\u0003\u0012\t\u0000\u00a5\u00a6"+
		"\u0006\u0005\uffff\uffff\u0000\u00a6\u00a7\u0005\u0013\u0000\u0000\u00a7"+
		"\u000b\u0001\u0000\u0000\u0000\u00a8\u00b4\u0006\u0006\uffff\uffff\u0000"+
		"\u00a9\u00aa\u0003\u0010\b\u0000\u00aa\u00b1\u0006\u0006\uffff\uffff\u0000"+
		"\u00ab\u00ac\u0005\u0016\u0000\u0000\u00ac\u00ad\u0003\u0010\b\u0000\u00ad"+
		"\u00ae\u0006\u0006\uffff\uffff\u0000\u00ae\u00b0\u0001\u0000\u0000\u0000"+
		"\u00af\u00ab\u0001\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b4\u00a9\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b5\r\u0001\u0000\u0000\u0000\u00b6\u00bd\u0006\u0007\uffff\uffff\u0000"+
		"\u00b7\u00b8\u0003\u0010\b\u0000\u00b8\u00b9\u0005\u0015\u0000\u0000\u00b9"+
		"\u00ba\u0006\u0007\uffff\uffff\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000"+
		"\u00bb\u00b7\u0001\u0000\u0000\u0000\u00bc\u00bf\u0001\u0000\u0000\u0000"+
		"\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000"+
		"\u00be\u000f\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c1\u00030\u0018\u0000\u00c1\u00c2\u0003,\u0016\u0000\u00c2\u00c3"+
		"\u0006\b\uffff\uffff\u0000\u00c3\u0011\u0001\u0000\u0000\u0000\u00c4\u00ca"+
		"\u0006\t\uffff\uffff\u0000\u00c5\u00c6\u0003\u0014\n\u0000\u00c6\u00c7"+
		"\u0006\t\uffff\uffff\u0000\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca\u00c8"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u0013"+
		"\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd\u00ce"+
		"\u0003\u0016\u000b\u0000\u00ce\u00cf\u0006\n\uffff\uffff\u0000\u00cf\u00da"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d1\u0003\u0018\f\u0000\u00d1\u00d2\u0006"+
		"\n\uffff\uffff\u0000\u00d2\u00da\u0001\u0000\u0000\u0000\u00d3\u00d4\u0003"+
		"\u001a\r\u0000\u00d4\u00d5\u0006\n\uffff\uffff\u0000\u00d5\u00da\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0003\u001c\u000e\u0000\u00d7\u00d8\u0006"+
		"\n\uffff\uffff\u0000\u00d8\u00da\u0001\u0000\u0000\u0000\u00d9\u00cd\u0001"+
		"\u0000\u0000\u0000\u00d9\u00d0\u0001\u0000\u0000\u0000\u00d9\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d9\u00d6\u0001\u0000\u0000\u0000\u00da\u0015\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u0005\u000f\u0000\u0000\u00dc\u00dd\u0005"+
		"\u0010\u0000\u0000\u00dd\u00de\u0003 \u0010\u0000\u00de\u00df\u0005\u0011"+
		"\u0000\u0000\u00df\u00e0\u0005\u0015\u0000\u0000\u00e0\u00e1\u0006\u000b"+
		"\uffff\uffff\u0000\u00e1\u0017\u0001\u0000\u0000\u0000\u00e2\u00e3\u0003"+
		" \u0010\u0000\u00e3\u00e4\u0005\u0018\u0000\u0000\u00e4\u00e5\u0003 \u0010"+
		"\u0000\u00e5\u00e6\u0006\f\uffff\uffff\u0000\u00e6\u00e7\u0005\u0015\u0000"+
		"\u0000\u00e7\u0019\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005\r\u0000\u0000"+
		"\u00e9\u00ea\u0005\u0010\u0000\u0000\u00ea\u00eb\u0003 \u0010\u0000\u00eb"+
		"\u00ec\u0005\u0011\u0000\u0000\u00ec\u00ed\u0005\u0012\u0000\u0000\u00ed"+
		"\u00ee\u0003\u0012\t\u0000\u00ee\u00ef\u0006\r\uffff\uffff\u0000\u00ef"+
		"\u00f6\u0005\u0013\u0000\u0000\u00f0\u00f1\u0005\u000e\u0000\u0000\u00f1"+
		"\u00f2\u0005\u0012\u0000\u0000\u00f2\u00f3\u0003\u0012\t\u0000\u00f3\u00f4"+
		"\u0006\r\uffff\uffff\u0000\u00f4\u00f5\u0005\u0013\u0000\u0000\u00f5\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f0\u0001\u0000\u0000\u0000\u00f6\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f7\u001b\u0001\u0000\u0000\u0000\u00f8\u00fe"+
		"\u0006\u000e\uffff\uffff\u0000\u00f9\u00fa\u0003,\u0016\u0000\u00fa\u00fb"+
		"\u0006\u000e\uffff\uffff\u0000\u00fb\u00ff\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0005\u000b\u0000\u0000\u00fd\u00ff\u0006\u000e\uffff\uffff\u0000"+
		"\u00fe\u00f9\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000"+
		"\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0101\u0005\u0017\u0000\u0000"+
		"\u0101\u0102\u0003,\u0016\u0000\u0102\u0103\u0006\u000e\uffff\uffff\u0000"+
		"\u0103\u0104\u0005\u0010\u0000\u0000\u0104\u0105\u0003\u001e\u000f\u0000"+
		"\u0105\u0106\u0005\u0011\u0000\u0000\u0106\u0107\u0006\u000e\uffff\uffff"+
		"\u0000\u0107\u0108\u0005\u0015\u0000\u0000\u0108\u001d\u0001\u0000\u0000"+
		"\u0000\u0109\u0115\u0006\u000f\uffff\uffff\u0000\u010a\u010b\u0003 \u0010"+
		"\u0000\u010b\u0112\u0006\u000f\uffff\uffff\u0000\u010c\u010d\u0005\u0016"+
		"\u0000\u0000\u010d\u010e\u0003 \u0010\u0000\u010e\u010f\u0006\u000f\uffff"+
		"\uffff\u0000\u010f\u0111\u0001\u0000\u0000\u0000\u0110\u010c\u0001\u0000"+
		"\u0000\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000"+
		"\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0116\u0001\u0000"+
		"\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u010a\u0001\u0000"+
		"\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u001f\u0001\u0000"+
		"\u0000\u0000\u0117\u0118\u0003\"\u0011\u0000\u0118\u011f\u0006\u0010\uffff"+
		"\uffff\u0000\u0119\u011a\u0005\u0019\u0000\u0000\u011a\u011b\u0003\"\u0011"+
		"\u0000\u011b\u011c\u0006\u0010\uffff\uffff\u0000\u011c\u011e\u0001\u0000"+
		"\u0000\u0000\u011d\u0119\u0001\u0000\u0000\u0000\u011e\u0121\u0001\u0000"+
		"\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000"+
		"\u0000\u0000\u0120!\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000"+
		"\u0000\u0122\u0123\u0003$\u0012\u0000\u0123\u0130\u0006\u0011\uffff\uffff"+
		"\u0000\u0124\u0129\u0006\u0011\uffff\uffff\u0000\u0125\u0126\u0005\u001a"+
		"\u0000\u0000\u0126\u012a\u0006\u0011\uffff\uffff\u0000\u0127\u0128\u0005"+
		"\u001b\u0000\u0000\u0128\u012a\u0006\u0011\uffff\uffff\u0000\u0129\u0125"+
		"\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u012a\u012b"+
		"\u0001\u0000\u0000\u0000\u012b\u012c\u0003$\u0012\u0000\u012c\u012d\u0006"+
		"\u0011\uffff\uffff\u0000\u012d\u012f\u0001\u0000\u0000\u0000\u012e\u0124"+
		"\u0001\u0000\u0000\u0000\u012f\u0132\u0001\u0000\u0000\u0000\u0130\u012e"+
		"\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131#\u0001"+
		"\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0133\u0134\u0003"+
		"&\u0013\u0000\u0134\u013b\u0006\u0012\uffff\uffff\u0000\u0135\u0136\u0005"+
		"\u001c\u0000\u0000\u0136\u0137\u0003&\u0013\u0000\u0137\u0138\u0006\u0012"+
		"\uffff\uffff\u0000\u0138\u013a\u0001\u0000\u0000\u0000\u0139\u0135\u0001"+
		"\u0000\u0000\u0000\u013a\u013d\u0001\u0000\u0000\u0000\u013b\u0139\u0001"+
		"\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c%\u0001\u0000"+
		"\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013e\u013f\u0005\u001b"+
		"\u0000\u0000\u013f\u0140\u0003&\u0013\u0000\u0140\u0141\u0006\u0013\uffff"+
		"\uffff\u0000\u0141\u0146\u0001\u0000\u0000\u0000\u0142\u0143\u0003(\u0014"+
		"\u0000\u0143\u0144\u0006\u0013\uffff\uffff\u0000\u0144\u0146\u0001\u0000"+
		"\u0000\u0000\u0145\u013e\u0001\u0000\u0000\u0000\u0145\u0142\u0001\u0000"+
		"\u0000\u0000\u0146\'\u0001\u0000\u0000\u0000\u0147\u0148\u0005\u0010\u0000"+
		"\u0000\u0148\u0149\u0003 \u0010\u0000\u0149\u014a\u0006\u0014\uffff\uffff"+
		"\u0000\u014a\u014b\u0005\u0011\u0000\u0000\u014b\u0156\u0001\u0000\u0000"+
		"\u0000\u014c\u014d\u0003,\u0016\u0000\u014d\u014e\u0006\u0014\uffff\uffff"+
		"\u0000\u014e\u0156\u0001\u0000\u0000\u0000\u014f\u0150\u0003*\u0015\u0000"+
		"\u0150\u0151\u0006\u0014\uffff\uffff\u0000\u0151\u0156\u0001\u0000\u0000"+
		"\u0000\u0152\u0153\u0003.\u0017\u0000\u0153\u0154\u0006\u0014\uffff\uffff"+
		"\u0000\u0154\u0156\u0001\u0000\u0000\u0000\u0155\u0147\u0001\u0000\u0000"+
		"\u0000\u0155\u014c\u0001\u0000\u0000\u0000\u0155\u014f\u0001\u0000\u0000"+
		"\u0000\u0155\u0152\u0001\u0000\u0000\u0000\u0156)\u0001\u0000\u0000\u0000"+
		"\u0157\u0158\u0006\u0015\uffff\uffff\u0000\u0158\u0159\u0005\u000b\u0000"+
		"\u0000\u0159\u015a\u0006\u0015\uffff\uffff\u0000\u015a\u015b\u0005\u0017"+
		"\u0000\u0000\u015b\u015c\u0003,\u0016\u0000\u015c\u015d\u0006\u0015\uffff"+
		"\uffff\u0000\u015d+\u0001\u0000\u0000\u0000\u015e\u015f\u0005\u001d\u0000"+
		"\u0000\u015f\u0160\u0006\u0016\uffff\uffff\u0000\u0160-\u0001\u0000\u0000"+
		"\u0000\u0161\u0162\u0005\u0001\u0000\u0000\u0162\u0166\u0006\u0017\uffff"+
		"\uffff\u0000\u0163\u0164\u0005\u0002\u0000\u0000\u0164\u0166\u0006\u0017"+
		"\uffff\uffff\u0000\u0165\u0161\u0001\u0000\u0000\u0000\u0165\u0163\u0001"+
		"\u0000\u0000\u0000\u0166/\u0001\u0000\u0000\u0000\u0167\u0168\u0005\u0003"+
		"\u0000\u0000\u0168\u016f\u0006\u0018\uffff\uffff\u0000\u0169\u016a\u0005"+
		"\u0004\u0000\u0000\u016a\u016f\u0006\u0018\uffff\uffff\u0000\u016b\u016c"+
		"\u0003,\u0016\u0000\u016c\u016d\u0006\u0018\uffff\uffff\u0000\u016d\u016f"+
		"\u0001\u0000\u0000\u0000\u016e\u0167\u0001\u0000\u0000\u0000\u016e\u0169"+
		"\u0001\u0000\u0000\u0000\u016e\u016b\u0001\u0000\u0000\u0000\u016f1\u0001"+
		"\u0000\u0000\u0000\u00188DX_m~\u0082\u00b1\u00b4\u00bd\u00ca\u00d9\u00f6"+
		"\u00fe\u0112\u0115\u011f\u0129\u0130\u013b\u0145\u0155\u0165\u016e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}