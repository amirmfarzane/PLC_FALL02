package main.compileError.type;

import main.compileError.CompileError;

public class ActorNotDeclared extends CompileError {
    int line;
    String name;
    public ActorNotDeclared(int line, String name){
        this.line = line;
        this.name = name;
    }
    public String getMessage(){
        return "Line " + line + ": Actor "  + name + " is not declared";
    }

}
