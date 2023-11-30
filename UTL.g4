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
NATURAL_DIGIT : [1-9][0-9]*;
ZERO : '0';

TRUE: 'true';
FALSE: 'false';

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

TEXT  : 'Text';

DOT : '.';

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



//DOUBLE_VAL :
ID : [a-z][a-zA-Z0-9_]*;



LPAR: '(';
RPAR: ')';
COLON: ':';
COMMA: ',';
LBRACE: '{';
RBRACE: '}';
LBRACKET: '[';
RBRACKET: ']';
SEMICOLON: ';';
QUESTION: '?';

//Arithmetic Operators
PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
MOD: '%';
PLUS_PLUS: '++';
MINUS_MINUS:'--';

//Comparison Operators
COMPARE_OP :
    NEQ | EQ | GT | LT ;
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
TILDE: '~';
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
    assignSmt  //| ( predicate SEMICOLON )
    | returnSmt | functionCall | methodCall
    | printSmt | forLoop | localVarDeclaration | ifStatement
    ;


methodCall:
    ID DOT ID // .....
    ;



//primaryExpression
//    :
//    LPAR expression RPAR
//    | ID
//    ;

//postfixExpression
//    : primaryExpression
//    | postfixExpression LeftBracket (expression | bracedInitList) RightBracket
////    | postfixExpression LeftParen expressionList? RightParen
////    | (simpleTypeSpecifier | typeNameSpecifier) (
////        LeftParen expressionList? RightParen
////        | bracedInitList
////    )
////    | postfixExpression (Dot | Arrow) (Template? idExpression | pseudoDestructorName)
////    | postfixExpression (PlusPlus | MinusMinus)
////    | (Dynamic_cast | Static_cast | Reinterpret_cast | Const_cast) Less theTypeId Greater LeftParen expression RightParen
////    | typeIdOfTheTypeId LeftParen (expression | theTypeId) RightParen
//    ;

unaryOperator
    :
    | BITWISE_AND
    | BITWISE_OR
    | BITWISE_XOR
    | TILDE
    | NOT
    ;

unaryExpression
      :
//    : postfixExpression
//    | (PlusPlus | MinusMinus | unaryOperator ) unaryExpression
    unaryOperator
    ;

castExpression:
//    unaryExpression
//    | LPAR theTypeId RPAR castExpression
   ;

multiplicativeExpression
    : castExpression ((MUL | DIV | MOD) castExpression)*
    ;

additiveExpression
    : multiplicativeExpression ((PLUS | MINUS) multiplicativeExpression)*
    ;

shiftExpression
    : additiveExpression (shiftOperator additiveExpression)*
    ;

shiftOperator
    : RIGHT_SHIFT
    | LEFT_SHIFT
    ;

relationalExpression
    : shiftExpression ((LT | GT ) shiftExpression)*
    ;

equalityExpression
    : relationalExpression ((EQ | NEQ) relationalExpression)*
    ;

logicalAndExpression
    : equalityExpression (AND equalityExpression)*
    ;

logicalOrExpression
    : logicalAndExpression (OR logicalAndExpression)*
    ;

conditionalExpression
    : logicalOrExpression
//     ( expression Colon assignmentExpression)?
    ;

assignmentExpression
    : conditionalExpression;

expression
    : assignmentExpression (COMMA assignmentExpression)*
    ;

condition :
    expression;

ifStatement :
    IF LPAR condition RPAR statement (ELSE statement)?
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
    type LBRACKET NATURAL_DIGIT RBRACKET ID {System.out.println("VarDec: " + $ID.getText());}
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
    //LBRACKET QUARYMARK predicateIdentifier LPAR variable RPAR RBRACKET
    ;

queryType2:
    //LBRACKET predicateIdentifier LPAR QUARYMARK RPAR RBRACKET
    ;

returnSmt:
    RETURN {System.out.println("Return");} (value  | ID)? SEMICOLON
    ;

forLoop:
    {System.out.println("Loop: for");} FOR LPAR ID COLON ID RPAR
    LBRACE ((statement)*) RBRACE
    ;

// predicate:
//     predicateIdentifier LPAR variable RPAR
//     ;

//expression:
//    andExpr expression2
//    ;
//
//expression2:
//    OR andExpr expression2 {System.out.println("Operator: " + $OR.getText());}
//    |
//    ;
//
//andExpr:
//    eqExpr andExpr2
//    ;
//
//andExpr2:
//    AND eqExpr andExpr2 {System.out.println("Operator: " + $AND.getText());}
//    |
//    ;
//
//eqExpr:
//    compExpr eqExpr2
//    ;
//
//eqExpr2:
//    (op = ( EQ | NEQ )) compExpr eqExpr2 {System.out.println("Operator: " + $op.getText());}
//    |
//    ;
//
//compExpr:
//    additive compExpr2
//    ;
//
//compExpr2:
//    (op = ( LT | LTE | GT | GTE)) additive compExpr2 {System.out.println("Operator: " + $op.getText());}
//    |
//    ;
//
//additive:
//    multicative additive2
//    ;
//
//additive2:
//    (op = ( PLUS | MINUS )) multicative additive2 {System.out.println("Operator: " + $op.getText());}
//    |
//    ;
//
//multicative:
//    unary multicative2
//    ;
//
//multicative2:
//    (op = ( MULT | MOD | DIV )) unary multicative2 {System.out.println("Operator: " + $op.getText());}
//    |
//    ;

//unary:
//    other
//    |
//     (op = ( PLUS | MINUS | NOT )) {System.out.println("Operator: " + $op.getText());} other
//    ;
//
//other:
//    LPAR expression RPAR | variable | value
//    | queryType1 | functionCall
//    ;

functionCall:
    ID LPAR (expression (COMMA expression)*)? RPAR {System.out.println("FunctionCall");}
    ;

value:
    numericValue
    | TRUE
    | FALSE
    | MINUS numericValue
    ;

numericValue:
    NATURAL_DIGIT
    | FLOAT
    | ZERO
    ;

// predicateIdentifier:
//     PREDICATE_IDENTIFIER {System.out.println("Predicate: " + $PREDICATE_IDENTIFIER.getText());}
//     ;

type:
    BOOL
    | INT
    | FLOAT
    | CANDLE
    | TRADE
    | STRING
    ;








