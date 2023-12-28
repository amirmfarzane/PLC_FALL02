package main.ast.node.statement;

import main.visitor.IVisitor;
import main.visitor.Visitor;
import main.ast.node.expression.Expression;

import java.util.ArrayList;

// Line -> IF
public class ConditionalStmt extends Statement {
    private Expression condition;
    private ArrayList<Statement> thenBody;
    private ArrayList<Statement> elseBody;

    public ConditionalStmt(Expression condition, ArrayList<Statement> thenBody) {
        this.condition = condition;
        this.thenBody = thenBody;
    }

    public Expression getCondition() {
        return condition;
    }
    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public ArrayList<Statement> getThenBody() {
        return thenBody;
    }
    public void setThenBody(ArrayList<Statement> thenBody) {
        this.thenBody = thenBody;
    }

    public ArrayList<Statement> getElseBody() {
        return elseBody;
    }
    public void setElseBody(ArrayList<Statement> elseBody) {
        this.elseBody = elseBody;
    }

    @Override
    public String toString() {
        return "ConditionalStmt";
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
