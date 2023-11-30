grammar UTL;

// Lexer rules


//VARS
STATIC:'static';
SHARED:'shared';

//Types
BOOL : 'bool';

INT : 'int';
FLOAT: 'float';
DOUBLE:'double';
STRING:'string';

VOID : 'void';


//Types Vals
INT_VALUE : [1-9][0-9]*;
ZERO : '0';
FLOAT_VALUE : ([0-9]*[.])?[0-9]+;

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
CATCH:'catch';

ONININT:'OnInit';
ONSTART:'OnStart';
THROW:'throw';
RETURN:'return';

EXCEPTION  : 'Exception';

TEXT  : 'Text';

DOT : '.';
//STRING_VAL:'"'[0-9a-zA-Z]*'"';
SCHEDULE:'@schedule';
STRING_VAL : '"' ( ~[\\"\n\r] | '\\' [\\"] )* '"'
               ;

MAIN: 'main' | 'Main';
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
CANDELES : 'candles';


TRADE  : 'Trade';
ORDER  : 'Order';
CANDLE  : 'Candle';

REFRESHRATE : 'RefreshRate';
GETCANDLE  : 'GetCandle';
TERMINATE  : 'Terminate';
CONNECT  : 'Connect';
OBSERVE  : 'Observe';
PRINT  : 'Print';
PREORDER : 'preorder';
PARALLEL : 'parallel';



//DOUBLE_VAL :
ID : [a-zA-Z_][a-zA-Z0-9_]*;



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
    (functionTotal | (globalVarDeclaration))*
    mainBlock
    ;

functionTotal:
    functionDec | func_on_start | func_on_init;


func_on_start:
        VOID ONSTART LPAR TRADE ID RPAR (THROW EXCEPTION)? LBRACE ((statement)*) RBRACE;

func_on_init:
        VOID ONININT LPAR TRADE ID RPAR (THROW EXCEPTION)? LBRACE ((statement)*) RBRACE;

functionDec:
    (type | VOID) ID {System.out.println("FunctionDec: " + $ID.getText());} //chap
    LPAR (functionVarDec (COMMA functionVarDec)*)? RPAR (THROW EXCEPTION)?
    LBRACE ((statement)*) RBRACE
    ;

functionVarDec:
    pretype? type ID {System.out.println("ArgumentDec: " + $ID.getText());}
    ;

mainBlock: // check!!!!!
    {System.out.println("MainBody");}(INT | VOID) MAIN LPAR RPAR LBRACE (statement)* RBRACE
    ;

statement:
    ((assignSmt  //| ( predicate SEMICOLON )
    | returnSmt //| functionCall | methodCall
    |break_statment
    | tryStatement | (assignmentExpression SEMICOLON) | scheduleStatment
    | forLoop | while_Loop | localVarDeclaration | ifStatement )
    )
    ;

scheduleStatment:
    SCHEDULE (LPAR schedule2Statement  RPAR | ID) (PARALLEL | PREORDER)
     ( LPAR schedule2Statement RPAR | ID) SEMICOLON
    ;

schedule2Statement:
    (LPAR schedule2Statement  RPAR | ID) (PARALLEL | PREORDER)
         ( LPAR schedule2Statement RPAR | ID)
    ;

forLoopStatement:
    (assignSmt  //| ( predicate SEMICOLON )
    | (assignmentExpression SEMICOLON?)
    | localVarDeclaration)
    ;

break_statment:
    BREAK SEMICOLON
    | CONTINUE SEMICOLON
    ;

methodCall:
    ID DOT ID LPAR expression RPAR
    ;

unaryOperator:
    BITWISE_AND
    | BITWISE_OR
    | BITWISE_XOR
    | TILDE
    | NOT
    ;

initializerClause
    : assignmentExpression
    | bracedInitList
    ;

initializerList
    : initializerClause (COMMA initializerClause)*
    ;

bracedInitList
    : LBRACE (initializerList COMMA?)? RBRACE
    ;

constantExpression
    : conditionalExpression
    ;

alignmentspecifier
    : LPAR (theTypeId | constantExpression)RPAR
    ;

balancedtoken
    : LPAR balancedTokenSeq RPAR
    | LBRACKET balancedTokenSeq RBRACKET
    | LBRACE balancedTokenSeq RBRACE
    | ~(LPAR | RPAR | LBRACE | RBRACE | LBRACKET | RBRACKET)+
    ;

balancedTokenSeq
    : balancedtoken+
    ;

attributeArgumentClause
    : LPAR balancedTokenSeq? RPAR
    ;

attribute
    : ID attributeArgumentClause?
    ;

attributeList
    : attribute (COMMA attribute)*
    ;

attributeSpecifier
    : LBRACKET LBRACKET attributeList? RBRACKET RBRACKET
    | alignmentspecifier
    ;

attributeSpecifierSeq
    : attributeSpecifier+
    ;

trailingTypeSpecifierSeq
    : type+ attributeSpecifierSeq?
    ;

typeSpecifierSeq
    : type+ attributeSpecifierSeq?
    ;

declSpecifier
    : STATIC
    | type
    ;

declSpecifierSeq
    : declSpecifier+? attributeSpecifierSeq?
    ;

noPointerDeclarator
    : ID attributeSpecifierSeq?
    | noPointerDeclarator (
        parametersAndQualifiers
        | LBRACKET constantExpression? RBRACKET attributeSpecifierSeq?
    )
    ;

declarator
    : noPointerDeclarator parametersAndQualifiers ID
    ;

parameterDeclaration
    : attributeSpecifierSeq? declSpecifierSeq (declarator | abstractDeclarator?) (
        ASSIGN initializerClause
    )?
    ;

parameterDeclarationList
    : parameterDeclaration (COMMA parameterDeclaration)*
    ;

parameterDeclarationClause
    : parameterDeclarationList (COMMA?)
    ;

parametersAndQualifiers
    : LPAR parameterDeclarationClause? RPAR attributeSpecifierSeq?
    //cvqualifierseq? refqualifier? exceptionSpecification?
    ;

noPointerAbstractDeclarator
    : noPointerAbstractDeclarator (
        parametersAndQualifiers
        | noPointerAbstractDeclarator LBRACKET constantExpression? RBRACKET attributeSpecifierSeq?
    )
    | parametersAndQualifiers
    | LBRACKET constantExpression? RBRACKET attributeSpecifierSeq?
    ;

abstractDeclarator
    : noPointerAbstractDeclarator? parametersAndQualifiers type
    ;

theTypeId
    : typeSpecifierSeq abstractDeclarator?
    ;

postfixExpression
    :(type ) (
             LPAR initializerList? RPAR
             | bracedInitList
         )postfixExpressionTemp
    | ID postfixExpressionTemp
    | builtInFunction LPAR initializerList? RPAR postfixExpressionTemp
    ;

postfixExpressionTemp
    :
    |  (DOT) (ID | builtInVar)postfixExpressionTemp
    |  (PLUS_PLUS | MINUS_MINUS) postfixExpressionTemp
    |  LPAR initializerList? RPAR postfixExpressionTemp
    |  LBRACKET (expression | bracedInitList) RBRACKET postfixExpressionTemp
    ;

builtInFunction:
    ORDER
    |CONNECT
    |OBSERVE
    |TERMINATE
    |GETCANDLE
    |CLOSE
    |PRINT
    |OPEN
    |ONSTART
    |REFRESHRATE
    ;

unaryExpression
    :
    assign_value
    |postfixExpression
    |(PLUS_PLUS | MINUS_MINUS | unaryOperator )
    ;

//typeSpecifierSeq
//    : type+ attributeSpecifierSeq?
//    ;
//
//theTypeId
//    //: typeSpecifierSeq abstractDeclarator?
//    ;

castExpression:
    unaryExpression
    | LPAR theTypeId RPAR castExpression
   ;

multiplicativeExpression
    : castExpression ((MUL | DIV | MOD) castExpression)*
    ;

additiveExpression
    : multiplicativeExpression ((PLUS | MINUS) multiplicativeExpression)*
    ;

shiftExpression
    :
    LPAR shiftExpression RPAR
    |additiveExpression (shiftOperator additiveExpression)*
    ;

shiftOperator
    : RIGHT_SHIFT
    | LEFT_SHIFT
    ;

relationalExpression
    :
    LPAR relationalExpression RPAR
    |shiftExpression ((LT | GT ) shiftExpression)*
    ;

equalityExpression
    :
    LPAR equalityExpression RPAR
    |relationalExpression ((EQ | NEQ) relationalExpression)*
    ;

logicalAndExpression:
    LPAR logicalAndExpression RPAR
    |equalityExpression (AND equalityExpression)*
    ;

logicalOrExpression:
    LPAR  logicalOrExpression RPAR
    |logicalAndExpression (OR logicalAndExpression)*
    ;

conditionalExpression:
    LPAR conditionalExpression RPAR
    | logicalOrExpression
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
    IF LPAR conditionalExpression RPAR (statement | LBRACE statement* RBRACE)
    (ELSE (statement | LBRACE statement*RBRACE ))?
    ;

assignSmt:
    variable ASSIGN expression SEMICOLON
    ;

variable:
    ID | ID LBRACKET expression RBRACKET
    ;

globalVarDeclaration:
        (varDeclaration
        | arrayDeclaration)
        ;

localVarDeclaration:
     varDeclaration
    | arrayDeclaration
    | THROW expression SEMICOLON
    ;

varDeclaration:
    pretype? type ID {System.out.println("VarDec: " + $ID.getText());} (ASSIGN expression )? SEMICOLON
    ;

arrayDeclaration:
    pretype? type LBRACKET INT_VALUE RBRACKET ID {System.out.println("VarDec: " + $ID.getText());}
    (arrayInitialValue )? SEMICOLON
    ;

arrayInitialValue:
    ASSIGN arrayList
    | ASSIGN postfixExpression // check postfix!!!!!!
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
    RETURN {System.out.println("Return");} (expression)? SEMICOLON
    ;

forLoop:
    {System.out.println("Loop: for");}

    FOR LPAR forLoopStatement conditionalExpression SEMICOLON forLoopStatement RPAR
    LBRACE statement+ RBRACE
    ;

while_Loop:
   WHILE LPAR forLoopStatement  RPAR
        ((LBRACE statement+ RBRACE) | statement)
       ;

tryStatement:
    TRY LBRACE statement* RBRACE CATCH EXCEPTION ID LBRACE statement* RBRACE
    ;

functionCall:
    ID LPAR (expression (COMMA expression)*)? RPAR {System.out.println("FunctionCall");}
    ;

value:
    numericValue
    |STRING_VAL
    | TRUE
    | FALSE
    | MINUS numericValue
    ;

numericValue:
    INT_VALUE
    | FLOAT
    | ZERO
    ;

pretype:
    STATIC
    | SHARED
    ;

type:
    BOOL
    | INT
    |DOUBLE
    | FLOAT
    | CANDLE
    | TRADE
    | STRING
    | ORDER
    | TRADE
    |EXCEPTION
    |THROW
    ;

assign_value:
    INT_VALUE
    |STRING_VAL
    | TRUE
    | FALSE
    | ID
    |FLOAT_VALUE
    | ZERO
    | SELL
    | BUY
    | STRING_VAL
    ;

builtInVar:
    BID
    |ASK
    |TIME
    |OPEN
    |CLOSE
    |HIGH
    |LOW
    |VOLUME
    |DIGITS
    |CANDELES
    ;

