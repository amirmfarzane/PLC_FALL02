package main.visitor.nameAnalyzer;

import main.ast.node.Program;
import main.ast.node.declaration.*;
import main.ast.node.declaration.handler.*;
import main.compileError.*;
import main.compileError.name.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.symbolTableItems.*;
import main.symbolTable.itemException.ItemAlreadyExistsException;
import main.symbolTable.symbolTableItems.VariableItem;
import main.visitor.Visitor;

import java.util.ArrayList;

public class NameAnalyzer extends Visitor<Void> {

    public ArrayList<CompileError> nameErrors = new ArrayList<>();

    @Override
    public Void visit(Program program) {
        SymbolTable.root = new SymbolTable();
        SymbolTable.push(SymbolTable.root);

        for (ActorDeclaration actorDeclaration : program.getActors()) {
            actorDeclaration.accept(this);
        }

        return null;
    }

    @Override
    public Void visit(ActorDeclaration actorDeclaration) {
        //TODO make actor item and its symbol table then set it

        //TODO check the actor name is redundant or not , if it is redundant change its name and put it

        //TODO push actor symbol table

        for (VarDeclaration varDeclaration : actorDeclaration.getKnownActors()) {
            varDeclaration.accept(this);
        }

        for (VarDeclaration varDeclaration : actorDeclaration.getActorVars()) {
            varDeclaration.accept(this);
        }

        if (actorDeclaration.getInitHandler() != null) {
            actorDeclaration.getInitHandler().accept(this);
        }

        for (MsgHandlerDeclaration msgHandlerDeclaration : actorDeclaration.getMsgHandlers()) {
            msgHandlerDeclaration.accept(this);
        }

        //TODO pop actor symbol table

        return null;
    }

    @Override
    public Void visit(HandlerDeclaration handlerDeclaration) {
        //TODO make handler item and its symbol table then set it

        //TODO check the handler name is redundant or not , if it is redundant change its name and put it

        //TODO push handler symbol table

        for (VarDeclaration varDeclaration : handlerDeclaration.getArgs()) {
            varDeclaration.accept(this);
        }

        for (VarDeclaration varDeclaration : handlerDeclaration.getLocalVars()) {
            varDeclaration.accept(this);
        }

        //TODO pop handler symbol table

        return null;
    }

    @Override
    public Void visit(VarDeclaration varDeclaration) {
        //TODO check the variable name is redundant or not

        return null;
    }
}

