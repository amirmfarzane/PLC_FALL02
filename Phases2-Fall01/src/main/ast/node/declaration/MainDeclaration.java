package main.ast.node.declaration;

import java.util.ArrayList;

import main.visitor.IVisitor;
import main.visitor.Visitor;

//Line -> MAIN
public class MainDeclaration extends Declaration {

    private ArrayList<ActorInstantiation> mainActors = new ArrayList<>();

    public ArrayList<ActorInstantiation> getMainActors(){
        return this.mainActors;
    }

    public void setMainActors(ArrayList<ActorInstantiation> mainActors) {
        this.mainActors = mainActors;
    }

    public void addActorInstantiation(ActorInstantiation actorInstantiation) {
        mainActors.add(actorInstantiation);
    }

    @Override
    public String toString() {
        return "MainDeclaration";
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}