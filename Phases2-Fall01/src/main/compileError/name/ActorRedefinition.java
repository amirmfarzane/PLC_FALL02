package main.compileError.name;

import main.compileError.CompileError;

public class ActorRedefinition extends CompileError {
    int line;
    String name;
    public ActorRedefinition(int line, String name){
        this.line = line;
        this.name = name;
    }

    public String getMessage(){
        return "Line " + line + ": Redefinition of actor " + name;
    }
}
