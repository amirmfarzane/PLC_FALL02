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

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link reductParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface reductVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link reductParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(reductParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link reductParser#actorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActorDeclaration(reductParser.ActorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link reductParser#mainDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainDeclaration(reductParser.MainDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link reductParser#actorInstantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActorInstantiation(reductParser.ActorInstantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link reductParser#initHandlerDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitHandlerDeclaration(reductParser.InitHandlerDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link reductParser#msgHandlerDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMsgHandlerDeclaration(reductParser.MsgHandlerDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link reductParser#argDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgDeclarations(reductParser.ArgDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link reductParser#varDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclarations(reductParser.VarDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link reductParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(reductParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link reductParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(reductParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link reductParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(reductParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link reductParser#printStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(reductParser.PrintStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link reductParser#assignStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(reductParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link reductParser#conditionalStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStmt(reductParser.ConditionalStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link reductParser#msgHandlerCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMsgHandlerCall(reductParser.MsgHandlerCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link reductParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(reductParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link reductParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(reductParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reductParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(reductParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reductParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(reductParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reductParser#preUnaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreUnaryExpression(reductParser.PreUnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reductParser#otherExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherExpression(reductParser.OtherExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reductParser#actorVarAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActorVarAccess(reductParser.ActorVarAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link reductParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(reductParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link reductParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(reductParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link reductParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(reductParser.TypeContext ctx);
}