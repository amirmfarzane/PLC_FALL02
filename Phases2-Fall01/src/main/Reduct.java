package main;

import main.ast.node.Program;
import main.compileError.CompileError;
import main.visitor.nameAnalyzer.NameAnalyzer;
import main.visitor.typeAnalyzer.TypeAnalyzer;
import org.antlr.v4.runtime.*;
import parsers.*;

import java.io.IOException;

public class Reduct {
    public static void main(String[] args) throws IOException {
        CharStream reader = CharStreams.fromFileName(args[0]);
        reductLexer lexer = new reductLexer(reader);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        reductParser parser = new reductParser(tokens);
        Program program = parser.program().p;


        NameAnalyzer nameAnalyzer = new NameAnalyzer();
        nameAnalyzer.visit(program);
        if (nameAnalyzer.nameErrors.size() > 0){
            for(CompileError compileError: nameAnalyzer.nameErrors)
                System.out.println(compileError.getMessage());
            return;
        }
        TypeAnalyzer typeAnalyzer = new TypeAnalyzer();
        typeAnalyzer.visit(program);
        if (typeAnalyzer.typeErrors.size() > 0){
            for(CompileError compileError: typeAnalyzer.typeErrors)
                System.out.println(compileError.getMessage());
            return;
        }

        System.out.println("Compilation was Successful!!");
    }
}