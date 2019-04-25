
grammar MyGrammar;

// rules
myStart: line* EOF;
//Expressions

///
line        :input+ eol
         ;

input : expression|declaration|assignment|print|ifStatement|whileStatement;

expression  :expression multiplication expression #multiplicationExpression
           | expression addition expression #additionExpression
           | expression subtraction expression  #subtractionExpression
           |expression division expression        #divisionExpression
           |expression power expression           #powerExpression
           |integer                               #onInteger
           |variable                              #onVariable
           |bool                                  #onBoolean
            ;
myBoolean: expression EQUALS expression #equalsBoolean
        |  expression LESSERTHAN expression #lesserThanBoolean
        | expression GREATERTHAN expression #greaterThanBoolean
        ;


ifStatement :IF myBoolean DO input*;
whileStatement :WHILE myBoolean DO line* END;
assignment  : VARIABLE ASSIGNMENT expression ;
declaration  :newVariable;
value       :integer|variable;
newVariable : DECLARATION VARIABLE;
bool        : TRUE|FALSE;
integer     : NUMBER;
print       :PRINT expression*;
variable    : VARIABLE;
multiplication:MULTIPLICATION;
power       : POWER;
division    : DIVISION;
addition    : ADDITION;
subtraction :SUBTRACTION;
equals      : EQUALS;
whitespace  :WS;
eol        :EOL;



// tokens
POWER       :'to the power of';
GREATERTHAN :'is greater than';
LESSERTHAN  :'is lesser than';
WHILE       :'while';
DO          :'do';
IF          :'if';
END         :'end';
TRUE        :'true';
FALSE       :'false';
PRINT       :'print';
EOL        : '.';
GOODBYE		: 'Bye';
HELLO		: 'Hello';
NUMBER		: [0-9]+ ;
MULTIPLICATION:'times';
DIVISION:'divided by';
ADDITION:'plus';
ASSIGNMENT:'is';
DECLARATION:'new';
SUBTRACTION:'minus';
EQUALS: 'equals';
VARIABLE:[a-zA-Z]+;
ID 			: [_A-Za-z][A-Za-z_!0-9.]* ;
WS 			: [ \n\t\r]+ -> skip ; // skip spaces, tabs, newlines
