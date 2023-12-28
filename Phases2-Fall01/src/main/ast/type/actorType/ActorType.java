package main.ast.type.actorType;

import main.ast.type.Type;
import main.ast.node.declaration.ActorDeclaration;
import main.ast.node.expression.Identifier;

public class ActorType extends Type {
    private String name;

    public ActorType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
