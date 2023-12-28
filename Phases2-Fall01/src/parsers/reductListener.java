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

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link reductParser}.
 */
public interface reductListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link reductParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(reductParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link reductParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(reductParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link reductParser#actorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterActorDeclaration(reductParser.ActorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link reductParser#actorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitActorDeclaration(reductParser.ActorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link reductParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMainDeclaration(reductParser.MainDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link reductParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMainDeclaration(reductParser.MainDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link reductParser#actorInstantiation}.
	 * @param ctx the parse tree
	 */
	void enterActorInstantiation(reductParser.ActorInstantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link reductParser#actorInstantiation}.
	 * @param ctx the parse tree
	 */
	void exitActorInstantiation(reductParser.ActorInstantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link reductParser#initHandlerDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInitHandlerDeclaration(reductParser.InitHandlerDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link reductParser#initHandlerDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInitHandlerDeclaration(reductParser.InitHandlerDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link reductParser#msgHandlerDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMsgHandlerDeclaration(reductParser.MsgHandlerDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link reductParser#msgHandlerDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMsgHandlerDeclaration(reductParser.MsgHandlerDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link reductParser#argDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterArgDeclarations(reductParser.ArgDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link reductParser#argDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitArgDeclarations(reductParser.ArgDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link reductParser#varDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclarations(reductParser.VarDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link reductParser#varDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclarations(reductParser.VarDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link reductParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(reductParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link reductParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(reductParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link reductParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(reductParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link reductParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(reductParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link reductParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(reductParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link reductParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(reductParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link reductParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(reductParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link reductParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(reductParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link reductParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(reductParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link reductParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(reductParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link reductParser#conditionalStmt}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStmt(reductParser.ConditionalStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link reductParser#conditionalStmt}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStmt(reductParser.ConditionalStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link reductParser#msgHandlerCall}.
	 * @param ctx the parse tree
	 */
	void enterMsgHandlerCall(reductParser.MsgHandlerCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link reductParser#msgHandlerCall}.
	 * @param ctx the parse tree
	 */
	void exitMsgHandlerCall(reductParser.MsgHandlerCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link reductParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(reductParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link reductParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(reductParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link reductParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(reductParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reductParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(reductParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reductParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(reductParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reductParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(reductParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reductParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(reductParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reductParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(reductParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reductParser#preUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreUnaryExpression(reductParser.PreUnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reductParser#preUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreUnaryExpression(reductParser.PreUnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reductParser#otherExpression}.
	 * @param ctx the parse tree
	 */
	void enterOtherExpression(reductParser.OtherExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reductParser#otherExpression}.
	 * @param ctx the parse tree
	 */
	void exitOtherExpression(reductParser.OtherExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reductParser#actorVarAccess}.
	 * @param ctx the parse tree
	 */
	void enterActorVarAccess(reductParser.ActorVarAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link reductParser#actorVarAccess}.
	 * @param ctx the parse tree
	 */
	void exitActorVarAccess(reductParser.ActorVarAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link reductParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(reductParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link reductParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(reductParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link reductParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(reductParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link reductParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(reductParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link reductParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(reductParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link reductParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(reductParser.TypeContext ctx);
}