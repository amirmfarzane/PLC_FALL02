grammar LogicPL;

program:
    (functionDec)*
    mainBlock
    ;

functionDec:
    FUNCTION ID {System.out.println("FunctionDec: " + $ID.getText());}
    LPAR (functionVarDec (COMMA functionVarDec)*)? RPAR COLON type
    LBRACE ((statement)+) RBRACE
    ;

functionVarDec:
    type ID {System.out.println("ArgumentDec: " + $ID.getText());}
    ;

mainBlock:
    {System.out.println("MainBody");} MAIN LBRACE (statement)+ RBRACE
    ;

statement:
    assignSmt | ( predicate SEMICOLON )
    | implication | returnSmt
    | printSmt | forLoop | localVarDeclaration
    ;

assignSmt:
    variable ASSIGN expression SEMICOLON
    ;

variable:
    ID | ID LBRACKET expression RBRACKET
    ;

localVarDeclaration:
     varDeclaration
    | arrayDeclaration
    ;

varDeclaration:
    type ID {System.out.println("VarDec: " + $ID.getText());} (ASSIGN expression )? SEMICOLON
    ;

arrayDeclaration:
    type LBRACKET INT_NUMBER RBRACKET ID {System.out.println("VarDec: " + $ID.getText());}
    (arrayInitialValue )? SEMICOLON
    ;

arrayInitialValue:
    ASSIGN arrayList
    ;

arrayList:
    LBRACKET ( value | ID ) (COMMA ( value | ID ))* RBRACKET
    ;

printSmt:
    PRINT {System.out.println("Built-in: print");} LPAR printExpr RPAR SEMICOLON
    ;

printExpr:
    variable
    | query
    ;

query:
      queryType1
     | queryType2
    ;

queryType1:
    LBRACKET QUARYMARK predicateIdentifier LPAR variable RPAR RBRACKET
    ;

queryType2:
    LBRACKET predicateIdentifier LPAR QUARYMARK RPAR RBRACKET
    ;

returnSmt:
    RETURN {System.out.println("Return");} (value  | ID)? SEMICOLON
    ;

forLoop:
    {System.out.println("Loop: for");} FOR LPAR ID COLON ID RPAR
    LBRACE ((statement)*) RBRACE
    ;

predicate:
    predicateIdentifier LPAR variable RPAR
    ;

implication:
    {System.out.println("Implication");} LPAR expression RPAR ARROW LPAR ((statement)+) RPAR
    ;

expression:
    andExpr expression2
    ;

expression2:
    OR andExpr expression2 {System.out.println("Operator: " + $OR.getText());}
    |
    ;

andExpr:
    eqExpr andExpr2
    ;

andExpr2:
    AND eqExpr andExpr2 {System.out.println("Operator: " + $AND.getText());}
    |
    ;

eqExpr:
    compExpr eqExpr2
    ;

eqExpr2:
    (op = ( EQ | NEQ )) compExpr eqExpr2 {System.out.println("Operator: " + $op.getText());}
    |
    ;

compExpr:
    additive compExpr2
    ;

compExpr2:
    (op = ( LT | LTE | GT | GTE)) additive compExpr2 {System.out.println("Operator: " + $op.getText());}
    |
    ;

additive:
    multicative additive2
    ;

additive2:
    (op = ( PLUS | MINUS )) multicative additive2 {System.out.println("Operator: " + $op.getText());}
    |
    ;

multicative:
    unary multicative2
    ;

multicative2:
    (op = ( MULT | MOD | DIV )) unary multicative2 {System.out.println("Operator: " + $op.getText());}
    |
    ;

unary:
    other
    |
     (op = ( PLUS | MINUS | NOT )) {System.out.println("Operator: " + $op.getText());} other
    ;

other:
    LPAR expression RPAR | variable | value
    | queryType1 | functionCall
    ;

functionCall:
    {System.out.println("FunctionCall");} ID LPAR (expression (COMMA expression)*)? RPAR
    ;

value:
    numericValue
    | TRUE
    | FALSE
    | MINUS numericValue
    ;

numericValue:
    INT_NUMBER
    | FLOAT_NUMBER
    ;

predicateIdentifier:
    PREDICATE_IDENTIFIER {System.out.println("Predicate: " + $PREDICATE_IDENTIFIER.getText());}
    ;

type:
    BOOLEAN
    | INT
    | FLOAT
    ;




FUNCTION : 'function';
BOOLEAN : 'boolean';
INT : 'int';
FLOAT: 'float';
MAIN: 'main';
PRINT: 'print';
RETURN: 'return';
FOR: 'for';
TRUE: 'true';
FALSE: 'false';

LPAR: '(';
RPAR: ')';
COLON: ':';
COMMA: ',';
LBRACE: '{';
RBRACE: '}';
SEMICOLON: ';';
ASSIGN: '=';
LBRACKET: '[';
RBRACKET: ']';
QUARYMARK: '?';
ARROW: '=>';
OR: '||';
AND: '&&';
EQ: '==';
GT: '>';
LT: '<';
GTE: '>=';
LTE: '<=';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
MOD: '%';
NEQ: '!=';
NOT: '!';


WS : [ \t\r\n]+ -> skip ;
COMMENT : '#' ~[\r\n]* -> skip ;

ID : [a-z][a-zA-Z0-9_]* ;
PREDICATE_IDENTIFIER : [A-Z][a-zA-Z0-9]* ;
INT_NUMBER : [0-9]+;
FLOAT_NUMBER: ([0-9]*[.])?[0-9]+;
