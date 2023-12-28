package main.visitor.typeAnalyzer;

import main.ast.node.Program;
import main.ast.node.declaration.*;
import main.ast.node.declaration.handler.*;
import main.ast.node.expression.*;
import main.ast.node.expression.operators.*;
import main.ast.node.statement.*;
import main.ast.type.*;
import main.ast.type.actorType.*;
import main.ast.type.primitiveType.*;
import main.compileError.*;
import main.compileError.type.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.itemException.*;
import main.symbolTable.symbolTableItems.*;
import main.visitor.Visitor;

import java.util.ArrayList;

public class TypeAnalyzer extends Visitor<Void> {
    public ArrayList<CompileError> typeErrors = new ArrayList<>();
    ExpressionTypeChecker expressionTypeChecker = new ExpressionTypeChecker(typeErrors);

    @Override
    public Void visit(Program program) {
        for (ActorDeclaration actorDeclaration : program.getActors()) {
            actorDeclaration.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ActorDeclaration actorDeclaration){
        try {
            ActorItem actorItem = (ActorItem) SymbolTable.root.get(ActorItem.STARTKEY + actorDeclaration.getName().getName());
            SymbolTable.push(actorItem.getActorSymbolTable());
        }catch (ItemNotFoundException e){
            // unreachable
        }

        for (VarDeclaration knownActor : actorDeclaration.getKnownActors()) {
            knownActor.accept(this);
        }

        for (VarDeclaration actorVar : actorDeclaration.getActorVars()) {
            actorVar.accept(this);
        }

        for (HandlerDeclaration actorHandler: actorDeclaration.getMsgHandlers()) {
            actorHandler.accept(this);
        }
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(HandlerDeclaration handlerDeclaration){
        try {
            HandlerItem handlerTableItem = (HandlerItem) SymbolTable.top.get(HandlerItem.STARTKEY + handlerDeclaration.getName().getName());
            SymbolTable.push(handlerTableItem.getHandlerSymbolTable());
        }catch (ItemNotFoundException e){
            // unreachable
        }

        for (VarDeclaration varDeclaration: handlerDeclaration.getArgs())
            varDeclaration.accept(this);

        for (VarDeclaration varDeclaration: handlerDeclaration.getLocalVars())
            varDeclaration.accept(this);

        for (Statement statement: handlerDeclaration.getBody())
            statement.accept(this);

        SymbolTable.pop();

        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditional) {
        Type conditionType = conditional.getCondition().accept(expressionTypeChecker);
        //TODO check errors

        for (Statement stmt: conditional.getThenBody())
            stmt.accept(this);

        if(conditional.getElseBody() != null){
            for (Statement stmt: conditional.getElseBody())
                stmt.accept(this);
        }
        return null;
    }


    @Override
    public Void visit(MsgHandlerCall msgHandlerCall) {
        Type instanceType = msgHandlerCall.getInstance().accept(expressionTypeChecker);

        //TODO check errors


        for (Expression arg: msgHandlerCall.getArgs())
            arg.accept(expressionTypeChecker);

        return null;
    }

    @Override
    public Void visit(AssignStmt assignStmt) {
        Type tl = assignStmt.getLValue().accept(expressionTypeChecker);
        Type tr = assignStmt.getRValue().accept(expressionTypeChecker);

        //TODO check errors

        return null;
    }

    @Override
    public Void visit(VarDeclaration varDeclaration) {
        //TODO check errors

        return null;
    }

}

