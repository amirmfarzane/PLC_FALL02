package main.ast.node.declaration.handler;

import main.ast.node.expression.Identifier;
import main.visitor.IVisitor;
import main.visitor.Visitor;

//Line -> MSGHANDLER
public class InitHandlerDeclaration extends HandlerDeclaration {

    public InitHandlerDeclaration(Identifier name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "InitHandlerDeclaration";
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
