grammar UTL;

// Lexer rules


//VARS
STATIC:'Static';
SHARED:'Shared';

//Types
BOOL : 'bool';
NUM: INT | FLOAT | DOUBLE;
INT : 'int';
FLOAT: 'float';
DOUBLE:'double';
STRING:'string';

VOID : 'void';


//Types Vals
NATURAL_DIGIT : [1-9];
DIGIT:[0-9];
ZERO : '0';

INT_VAL : NATURAL_DIGIT DIGIT*;
FLOAT_VAL: INT_VAL '.' DIGIT+ | '0.' DIGIT*;
//DOUBLE_VAL :
ID : [a-z][a-zA-Z0-9_]*;


//Loops
FOR: 'for';
WHILE: 'while';
CONTINUE:'continue';
BREAK:'break';

//Conditions
IF : 'if';
ELSE : 'else';


TRY : 'try';
CATCH:'cartch';

ONININT:'OnInit';
ONSTART:'OnStart';
THROW:'throw';
RETURN:'return';

EXCEPTION  : 'Exception';
TYPE:'bool' | 'int' | 'double' | 'string';
TEXT  : 'Text';

SCHEDULE:'@schedule';

MAIN: 'main';
BUY:'BUY';
DIGITS:'Digits';
SELL:'SELL';
BID:'Bid';
ASK:'Ask';

VOLUME  : 'Volum';
LOW  : 'Low';
HIGH  : 'High';
CLOSE  : 'Close';
OPEN  : 'Open';
TIME : 'Tiem';

TRADE  : 'Trade';
ORDER  : 'Order';
CANDLE  : 'Candle';

REFRESHRATE : 'RefreshRate';
GETCANDLE  : 'GetCandle';
TERMINATE  : 'Terminate';
CONNECT  : 'Connect';
OBSERVE  : 'Observe';
PRINT  : 'Print';
PREORDER : 'Preorder';
PARALLEL : 'parallel';

LPAR: '(';
RPAR: ')';
COLON: ':';
COMMA: ',';
LBRACE: '{';
RBRACE: '}';
LBRACKET: '[';
RBRACKET: ']';
SEMICOLON: ';';

//Arithmetic Operators
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
MOD: '%';
PLUS_PLUS: '++';
MINUS_MINUS:'--';

//Comparison Operators
NEQ: '!=';
EQ: '==';
GT: '>';
LT: '<';

//QUESTION_MARK: '?';
//ARROW: '=>';

//Logical Operators
OR: '||';
AND: '&&';
NOT: '!';

//FOR NUMBERS
COMP: '~';
RIGHT_SHIFT:'>>';
LEFT_SHIFT:'<<';
BITWISE_AND:'&';
BITWISE_OR:'|';
BITWISE_XOR:'^';

// Assignment Operators
ASSIGN: '=';
PLUS_EQ: '+=';
MINUS_EQ : '-=';
MUL_EQ : '*=';
DIV_EQ : '/=';
PERC_EQ : '%=';

BlockComment: '/*' .*? '*/' -> skip;
COMMENT : '//' ~[\r\n]* -> skip ;
//PREDICATE_IDENTIFIER : [A-Z][a-zA-Z0-9]* ;

// Parser rules

// TODO: Complete the parser rules
/*Ex:
statement : VarDeclaration {System.out.println("VarDec:"+...);}
          | ArrayDeclaration ...
          | ...
          ;
*/




program:
    (functionTotal)*
    mainBlock
    ;

functionTotal:
    functionDec | func_on_start | func_on_init;


func_on_start:
        VOID ONSTART LPAR TRADE ID RPAR (THROW EXCEPTION)? LBRACE ((statement)+) RBRACE;

func_on_init:
        VOID ONININT LPAR TRADE ID RPAR (THROW EXCEPTION)? LBRACE ((statement)+) RBRACE;

functionDec:
    (type | VOID) ID {System.out.println("FunctionDec: " + $ID.getText());} //chap
    LPAR (functionVarDec (COMMA functionVarDec)*)? RPAR (THROW EXCEPTION)?
    LBRACE ((statement)+) RBRACE
    ;

functionVarDec:
    type ID {System.out.println("ArgumentDec: " + $ID.getText());}
    ;

mainBlock: // check!!!!!
    {System.out.println("MainBody");}(INT | VOID) MAIN LBRACE (statement)+ RBRACE
    ;

statement:
    assignSmt | ( predicate SEMICOLON )
    | returnSmt | functionCall
    | printSmt | forLoop | localVarDeclaration
    | methodCall | tryStatement
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
    | CANDLE
    | TRADE
    | STRING
    ;









