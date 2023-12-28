package main.ast.node;

import main.ast.node.declaration.MainDeclaration;
import main.visitor.IVisitor;
import main.visitor.Visitor;
import main.ast.node.declaration.ActorDeclaration;

import java.util.ArrayList;

//Line -> 0
public class Program extends Node{
    private ArrayList<ActorDeclaration> actors = new ArrayList<>();
    private MainDeclaration programMainDeclaration;


    public void addActor(ActorDeclaration actorDeclaration) {
        actors.add(actorDeclaration);
    }

    public ArrayList<ActorDeclaration> getActors() {
        return actors;
    }


    public MainDeclaration getMain() {
        return this.programMainDeclaration;
    }

    public void setMain(MainDeclaration mainDeclarationActors) {
        this.programMainDeclaration = mainDeclarationActors;
    }

    @Override
    public String toString() {
        return "Program";
    }
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

}
