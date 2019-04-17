
grammar MyGrammar;

// rules
myStart: line* EOF;
//Expressions

///
line        :input+ eol
             ;

input : expression|declaration|assignment|print;

expression  :expression multiplication expression #multiplicationExpression
           | expression addition expression #additionExpression
           | expression subtraction expression  #subtractionExpression
           |expression division expression        #divisionExpression
           |integer                               #onInteger
           |variable                              #onVariable
           |bool                                  #onBoolean
            ;


assignment  : VARIABLE ASSIGNMENT expression;
declaration  :newVariable;
value       :integer|variable;


newVariable : DECLARATION VARIABLE;
bool        : TRUE|FALSE;
integer     : NUMBER;
print       :PRINT expression*;
variable    : VARIABLE;
multiplication:MULTIPLICATION;
division    : DIVISION;
addition    : ADDITION;
subtraction :SUBTRACTION;
equals      : EQUALS;
newline     : '\n';
whitespace  :WS;
eol        :EOL;

// tokens
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
NEWLINE:[\r\n]+;
VARIABLE:[a-zA-Z]+;
ID 			: [_A-Za-z][A-Za-z_!0-9.]* ;
WS 			: [ \n\t\r]+ -> skip ; // skip spaces, tabs, newlines
