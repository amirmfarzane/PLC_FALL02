package main.ast.node.expression;

import main.visitor.IVisitor;
import main.visitor.Visitor;

//Line -> SELF
public class Self extends Expression {
    @Override
    public String toString() {
        return "Self";
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
