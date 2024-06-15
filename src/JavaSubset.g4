grammar JavaSubset;

program : (statement)+ ;

statement
    : varDecl
    | assignment
    | printStatement
    | inputStatement
    | loop
    ;

varDecl : type ID '=' expr ';' ;
assignment : ID '=' expr ';' ;
printStatement : 'System.out.println' '(' expr ')' ';' ;
inputStatement : 'Scanner' '.' 'next' '(' ')' '=' ID ';' ;


loop
    : 'for' '(' varDecl comparison ';' assignment ';' ')' block
    | 'while' '(' comparison ')' block
    | 'do' block 'while' '(' comparison ')' ';'
    ;

block : '{' (statement)* '}' ;

type : 'int' | 'float' | 'double' | 'char' | 'boolean' ;

expr : expr ('+'|'-'|'*'|'/') expr
     | expr ('=='|'!='|'<'|'>'|'<='|'>=') expr
     | INT
     | ID
     | '(' expr ')'
     ;

comparison : expr ('=='|'!='|'<'|'>'|'<='|'>=') expr ;


ID : [a-zA-Z_][a-zA-Z_0-9]* ;
INT : [0-9]+ ;
WS : [ \t\r\n]+ -> skip ;
