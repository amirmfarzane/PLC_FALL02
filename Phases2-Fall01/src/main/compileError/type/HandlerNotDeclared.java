package main.compileError.type;

import main.compileError.CompileError;

public class HandlerNotDeclared extends CompileError {
    int line;
    String name;
    String actorName;

    public HandlerNotDeclared(int line, String name, String actorName) {
        this.line = line;
        this.name = name;
        this.actorName = actorName;
    }

    public String getMessage() {
        return "Line " + line + ": There is no msghandler name " + name + " in actor " + actorName;
    }

}
