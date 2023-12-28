package main.compileError.type;

import main.compileError.CompileError;

public class CallOnNonActor extends CompileError{

    int line;

    public CallOnNonActor(int line){
        this.line = line;

    }
    public String getMessage(){
        return "Line " + line + ": The instance is not callable" ;
    }
}


