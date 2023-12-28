package main.visitor;

import main.ast.node.Program;
import main.ast.node.declaration.*;
import main.ast.node.declaration.handler.HandlerDeclaration;
import main.ast.node.declaration.VarDeclaration;
import main.ast.node.expression.*;
import main.ast.node.expression.values.IntValue;
import main.ast.node.expression.values.StringValue;
import main.ast.node.statement.*;
import main.symbolTable.itemException.ItemNotFoundException;

public class Visitor<T> implements IVisitor<T> {

    @Override
    public T visit(Program program) {
        return null;
    }
    @Override
    public T visit (ActorDeclaration actorDeclaration) {return null;}
    @Override
    public T visit (HandlerDeclaration handlerDeclaration){return null;}
    @Override
    public T visit (VarDeclaration varDeclaration) {
        return null;
    }
    @Override
    public T visit(MainDeclaration mainDeclarationActors) {
        return null;
    }
    @Override
    public T visit(ActorInstantiation actorInstantiation) {
        return null;
    }
    @Override
    public T visit(UnaryExpression unaryExpression) {
        return null;
    }
    @Override
    public T visit(BinaryExpression binaryExpression) {
        return null;
    }
    @Override
    public T visit(ActorVarAccess actorVarAccess) {
        return null;
    }
    @Override
    public T visit(Identifier identifier) {
        return null;
    }
    @Override
    public T visit(Self self) {
        return null;
    }
    @Override
    public T visit(IntValue value) {
        return null;
    }
    @Override
    public T visit(StringValue value) {
        return null;
    }
    @Override
    public T visit(ConditionalStmt conditional) {
        return null;
    }

    @Override
    public T visit(MsgHandlerCall msgHandlerCall) {
        return null;
    }
    @Override
    public T visit(PrintStmt printStmt) {
        return null;
    }
    @Override
    public T visit(AssignStmt assignStmt) {
        return null;
    }
}
