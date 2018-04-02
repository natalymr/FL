lexer grammar my_lexer;

/*
 * Lexer Rules
 */


/* numbers */
INT :   '0' | '-'? [1-9] [0-9]* ; // no leading zeros
EXP :   [Ee] [+\-]? INT ;
FLOAT
    :   '-'? INT '.' INT EXP?   // 1.35, 1.35E-9, 0.3, -4.5
    |   '-'? INT EXP            // 1e10 -3e4
    ;

/* quotes */
STRING : '"' (~'"'|'\\"')* '"'  ;

/* key words */
READ  :  'read';
WRITE : 'write';
IF    :    'if';
THEN  :  'then';
ELSE  :  'else';
WHILE : 'while';
DO    :    'do';

/* operators */
ASSIGN : '=';
PLUS   : '+';
MINUS  : '-';
MULT   : '*';
DIV    : '/';
LE     : '<';
LT     : '<=';
GE     : '>';
GT     : '>=';
EQ     : '==';
NE     : '!=';
OR     : '||';
AND    : '&&';

/* limiters */
SCOLON   : ';';
COMA     : ',';
LBRACKET : '(';
RBRACKET : ')';

BOOL : 'true' | 'false';
LINE_COMMENT : '//' ~'\n'* '\n' -> channel(HIDDEN) ;
WS : [ \r\t\n] -> skip;

/* identificators */
ID : [a-z_]+ [a-z0-9_]* ;