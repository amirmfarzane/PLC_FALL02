package main.visitor;

import main.ast.node.Program;
import main.ast.node.declaration.*;
import main.ast.node.declaration.handler.HandlerDeclaration;
import main.ast.node.declaration.VarDeclaration;
import main.ast.node.expression.*;
import main.ast.node.expression.values.IntValue;
import main.ast.node.expression.values.StringValue;
import main.ast.node.statement.*;
import main.symbolTable.itemException.*;

public interface IVisitor<T> {

    T visit(Program program);

    T visit (ActorDeclaration actorDeclaration);
    T visit (HandlerDeclaration handlerDeclaration);
    T visit (VarDeclaration varDeclaration);
    T visit(MainDeclaration mainDeclarationActors);
    T visit(ActorInstantiation actorInstantiation);
    T visit(UnaryExpression unaryExpression);
    T visit(BinaryExpression binaryExpression);
    T visit(ActorVarAccess actorVarAccess);
    T visit(Identifier identifier);
    T visit(Self self);
    T visit(IntValue value);
    T visit(StringValue value);
    T visit(ConditionalStmt conditional);

    T visit(MsgHandlerCall msgHandlerCall);
    T visit(PrintStmt printStmt);
    T visit(AssignStmt assignStmt);
}
