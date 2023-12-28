package main.compileError.name;

import main.compileError.CompileError;

public class HandlerRedefinition extends CompileError {
    int line;
    String name;
    public HandlerRedefinition(int line, String name){
        this.line = line;
        this.name = name;
    }

    public String getMessage(){
        return "Line " + line + ": Redefinition of handler " + name;
    }
}
