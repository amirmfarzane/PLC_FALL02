grammar UTL;


program:
    (functionTotal | (globalVarDeclaration))*
    mainBlock
    ;


// Lexer rules


//VARS

// Parser rules



functionTotal:
    functionDec | func_on_start | func_on_init;


func_on_start:
        VOID ONSTART LPAR TRADE ID RPAR (THROW EXCEPTION)? LBRACE ((statement)*) RBRACE;

func_on_init:
        VOID ONININT LPAR TRADE ID RPAR (THROW EXCEPTION)? LBRACE ((statement)*) RBRACE;

functionDec:
    (type | VOID) ID {System.out.println("FunctionDec:" + $ID.getText());} //chap
    LPAR (functionVarDec (COMMA functionVarDec)*)? RPAR (THROW EXCEPTION)?
    LBRACE ((statement)*) RBRACE
    ;

functionVarDec:
    pretype? type ID
    ;

mainBlock: // check!!!!!
    (INT | VOID) MAIN LPAR RPAR LBRACE (statement)* RBRACE
    ;

statement:
    ((assignSmt  //| ( predicate SEMICOLON )
    | returnSmt //| functionCall | methodCall
    |break_statment | printSmt | (functionCall | SEMICOLON)
    | tryStatement |scheduleStatment //| (assignmentExpression SEMICOLON)
    | forLoop | while_Loop | localVarDeclaration | ifStatement )
    )
    ;

scheduleStatment:
    SCHEDULE {System.out.println("ConcurrencyControl:Schedule");}
    (LPAR schedule2Statement  RPAR | ID) (PARALLEL | PREORDER)
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
    (BREAK SEMICOLON {System.out.println("Control:break");})
    | (CONTINUE {System.out.println("Control:continue");} SEMICOLON )
    ;

unaryOperator:
    BITWISE_AND
    | BITWISE_OR
    | BITWISE_XOR
    |PLUS_PLUS {System.out.println("Operator:++");}
    |MINUS_MINUS {System.out.println("Operator:--");}
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
    :(type2 ) (
             LPAR initializerList? RPAR
             | bracedInitList
         )postfixExpressionTemp
    | (EXCEPTION ) (
                     LPAR INT_VALUE COMMA STRING_VAL RPAR {System.out.println("ErrorControl:" + $INT_VALUE.getText());}
                     | bracedInitList
                 )postfixExpressionTemp
    | ID postfixExpressionTemp
    | builtInFunction LPAR initializerList? RPAR postfixExpressionTemp
    |  (DOT) (ID | builtInVar)postfixExpressionTemp
    |  LPAR initializerList? RPAR
    |  LBRACKET (expression | bracedInitList) RBRACKET
    ;

postfixExpressionTemp
    :
    |  (DOT) (ID | builtInVar)postfixExpressionTemp
    |  ( MINUS_MINUS) postfixExpressionTemp {System.out.println("Operator:--");}
    |  (PLUS_PLUS) postfixExpressionTemp {System.out.println("Operator:++");}
    |  LPAR initializerList? RPAR postfixExpressionTemp
    |  LBRACKET (expression | bracedInitList) RBRACKET postfixExpressionTemp
    ;

functionCall:
     ID DOT (ID | builtInVar) postfixExpressionTemp
    | ID ( MINUS_MINUS) postfixExpressionTemp {System.out.println("Operator:--");}
    | ID (PLUS_PLUS ) postfixExpressionTemp {System.out.println("Operator:++");}
    | ID LBRACKET (expression | bracedInitList) RBRACKET postfixExpressionTemp
    | (builtInFunction | ID) {System.out.println("FunctionCall");}
     LPAR initializerList? RPAR postfixExpressionTemp
//    | (THROW?) (EXCEPTION ) (
//                         LPAR INT_VALUE COMMA STRING_VAL RPAR {System.out.println("ErrorControl:" + $INT_VALUE.getText());}
//                         | bracedInitList
//                     )postfixExpressionTemp
    | THROW  postfixExpression
    ;

builtInFunction:
    ORDER
    |CONNECT
    |OBSERVE
    |TERMINATE
    |GETCANDLE
    |CLOSE
    |OPEN
    |ONSTART
    |REFRESHRATE
    ;

postUnaryExpression
    :
   assign_value (unaryOperator)?
    ;

unaryExpression
    :
    (unaryOperator )? postUnaryExpression
    |postfixExpression
    ;

castExpression:
    unaryExpression
    | LPAR theTypeId RPAR castExpression
   ;

multiplicativeExpression
    :castExpression
    |LPAR multiplicativeExpression RPAR
    |castExpression ((MUL) multiplicativeExpression ){System.out.println("Operator:*");}
    |castExpression ((DIV) multiplicativeExpression ){System.out.println("Operator:/");}
    |castExpression ( (MOD) multiplicativeExpression ){System.out.println("Operator:%");}
    ;

additiveExpression
    :
    multiplicativeExpression
    |LPAR additiveExpression RPAR
    |multiplicativeExpression ((PLUS) additiveExpression {System.out.println("Operator:+");})
    |multiplicativeExpression ((MINUS) additiveExpression {System.out.println("Operator:-");})
    ;

shiftExpression
    :
    |additiveExpression
    |additiveExpression (RIGHT_SHIFT shiftExpression {System.out.println("Operator:>>");})
    |additiveExpression (LEFT_SHIFT shiftExpression {System.out.println("Operator:<<");})
    ;

shiftOperator
    : RIGHT_SHIFT
    | LEFT_SHIFT
    ;

relationalExpression
    :
    LPAR relationalExpression RPAR
    |shiftExpression
    |shiftExpression ((LT  ) relationalExpression {System.out.println("Operator:<");})
    |shiftExpression ((GT ) relationalExpression {System.out.println("Operator:>");})
    ;

equalityExpression
    :
    LPAR equalityExpression RPAR
    |relationalExpression
    |relationalExpression ((EQ) equalityExpression {System.out.println("Operator:==");})
    |relationalExpression ((NEQ) equalityExpression {System.out.println("Operator:!=");})
    ;

bitwiseExpression:
    LPAR bitwiseExpression RPAR
    |equalityExpression
    |equalityExpression (BITWISE_XOR bitwiseExpression {System.out.println("Oprator:^");})
    |equalityExpression (BITWISE_OR bitwiseExpression {System.out.println("Oprator:|");})
    |equalityExpression (BITWISE_AND bitwiseExpression {System.out.println("Oprator:&");})
    ;
logicalAndExpression:
    LPAR logicalAndExpression RPAR
    |bitwiseExpression
    |bitwiseExpression (AND logicalAndExpression {System.out.println("Oprator:&&");})
    ;

logicalOrExpression:
    LPAR  logicalOrExpression RPAR
    |logicalAndExpression
    |logicalAndExpression (OR logicalOrExpression {System.out.println("Oprator:||");})
    ;

conditionalExpression:
    logicalOrExpression
//     ( expression Colon assignmentExpression)?
    ;

assignmentExpression
    : conditionalExpression;

expression
    : assignmentExpression (COMMA assignmentExpression)*
    ;

ifStatement :
    IF {System.out.println("Conditional:if");}
    LPAR conditionalExpression RPAR (statement | LBRACE statement* RBRACE)
    (elseStatment)?
    ;


elseStatment:
    ELSE {System.out.println("Conditional:else");}(statement | LBRACE statement*RBRACE )
    ;





assignSmt:
    variable (PLUS_EQ | PERC_EQ | DIV_EQ | MUL_EQ | MINUS_EQ) expression SEMICOLON
    |variable (ASSIGN ) expression SEMICOLON {System.out.println("Operator:=");}
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
    //| THROW expression SEMICOLON
    ;

varDeclaration:
    pretype? (type | EXCEPTION) ID {System.out.println("VarDec:" + $ID.getText());} (ASSIGN {System.out.println("Operator:=");} expression )?
    SEMICOLON
    ;

arrayDeclaration:
    pretype? type LBRACKET INT_VALUE RBRACKET ID {System.out.println("ArrayDec:" + $ID.getText() + ":"+ $INT_VALUE.getText());}
    (arrayInitialValue )? SEMICOLON
    ;

arrayInitialValue:
    ASSIGN {System.out.println("Operator:=");} arrayList
    | ASSIGN {System.out.println("Operator:=");} postfixExpression // check postfix!!!!!!
    ;

arrayList:
    LBRACKET ( value | ID ) (COMMA ( value | ID ))* RBRACKET
    ;

printSmt:
    PRINT {System.out.println("Built-in:print");} LPAR initializerList? RPAR SEMICOLON
    ;

returnSmt:
    RETURN  (expression)? SEMICOLON
    ;

forLoop:
    FOR {System.out.println("Loop:for");}
    LPAR forLoopStatement conditionalExpression SEMICOLON forLoopStatement RPAR
    LBRACE statement+ RBRACE
    ;

while_Loop:
   WHILE {System.out.println("Loop:while");} LPAR forLoopStatement  RPAR
        ((LBRACE statement* RBRACE) | statement)
       ;

tryStatement:
    TRY LBRACE statement* RBRACE CATCH EXCEPTION ID LBRACE statement* RBRACE
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


type2:
    BOOL
    | INT
    |DOUBLE
    | FLOAT
    | CANDLE
    | TRADE
    | STRING
    | ORDER
    | TRADE

    ;

type:
    type2
    |EXCEPTION
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

bitwiseOperators:
    BITWISE_XOR
    | BITWISE_AND
    | BITWISE_OR
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
DIV_EQ : '=/';
PERC_EQ : '%=';

BlockComment: '/*' .*? '*/' -> skip;
COMMENT : '//' ~[\r\n]* -> skip ;
//PREDICATE_IDENTIFIER : [A-Z][a-zA-Z0-9]* ;
