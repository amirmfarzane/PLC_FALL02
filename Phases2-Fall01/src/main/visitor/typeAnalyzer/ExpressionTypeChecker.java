package main.visitor.typeAnalyzer;

import main.ast.node.expression.*;
import main.ast.node.expression.values.*;
import main.ast.type.*;
import main.ast.type.actorType.*;
import main.compileError.*;
import main.ast.node.expression.operators.*;
import main.compileError.type.*;
import main.visitor.*;
import main.ast.type.primitiveType.*;
import main.symbolTable.*;
import main.symbolTable.symbolTableItems.*;
import main.symbolTable.itemException.*;
import java.util.ArrayList;

public class ExpressionTypeChecker extends Visitor<Type> {
    public ArrayList<CompileError> typeErrors;
    public ExpressionTypeChecker(ArrayList<CompileError> typeErrors){
        this.typeErrors = typeErrors;
    }

    public boolean sameType(Type el1,Type el2){
        //TODO check the two type are same or not
        return false;

    }

    public boolean isLvalue(Expression expr){
        //TODO check the expr are lvalue or not
        return false;
    }


    @Override
    public Type visit(UnaryExpression unaryExpression) {

        Expression uExpr = unaryExpression.getOperand();
        Type expType = uExpr.accept(this);
        UnaryOperator operator = unaryExpression.getUnaryOperator();

        //TODO check errors and return the type

        return null;
    }

    @Override
    public Type visit(BinaryExpression binaryExpression) {
        Type tl = binaryExpression.getLeft().accept(this);
        Type tr = binaryExpression.getRight().accept(this);
        BinaryOperator operator =  binaryExpression.getBinaryOperator();

        if(operator.equals(BinaryOperator.eq)) {
            //TODO check errors and return the type

        }

        else { // + -  *
            //TODO check errors and return the type

        }

        return null;
    }

    @Override
    public Type visit(ActorVarAccess actorVarAccess) {
        //TODO check errors and return the type

        return null;
    }

    @Override
    public Type visit(Identifier identifier) {
        //TODO check errors and return the type

        return null;

    }


    @Override
    public Type visit(Self self) {
        String currentActorName = SymbolTable.top.pre.name;
        return new ActorType(currentActorName);
    }

    @Override
    public Type visit(IntValue value) {
        return new IntType();
    }

    @Override
    public Type visit(StringValue value) {
        return new StringType();
    }
}