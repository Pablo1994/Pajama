grammar Pajama;
// loriacarlos@gmail.com EIF400 II-2014
// START
rules : ruleStatement+ ;

// RULE
ruleStatement : 'rule' ID formal '{' ruleBody  '}'
;

formal            : '(' ID ')'
;
ruleBody          : caseRule ('|' caseRule)*;
caseRule          : 'case' pattern '->' expr  ;

// PATTERN
pattern  :   pattInit(pattRest)? 
           | '(' pattern ')'
;
pattInit :            ID  #PId
                    | pattArray  #PArray
					| pattObject #PObject
					| pattConstant  #PCte
;					
pattRest :            '@' ID 
                    | 'when' expr
					;
pattArray         :  '[' pattListOrEmpty ']';
pattObject        :  '{' pattPair '}'
;

pattListOrEmpty : pattEmpty | pattList
;
pattList : pattern (',' pattern)* ( '|' pattRestArray)?
;
pattEmpty :
;

pattRestArray : pattArray | ID
;

pattPair : key ':' pattern
;

pattConstant       : NUMBER  #PatNum
                   | STRING  #PatString
				   | 'true'  #PatTrue
				   | 'false' #PatFalse
				   | 'null'  #NullPat
				   ;

params   : '[' args ']';
object   : '{' pairs? '}';
pairs    : pair (';' pair)*;
pair     : key ':' expr;
key      : STRING | ID;

// EXPRESSION
expr      : relMonom ('||' relMonom)*;
relMonom  : relOperation ('&&' relOperation)*;

relOperation :      arithOperation ( relOperator arithOperation)*
                 | '!'  relOperation
;
relOperator :	('>' | '<' | '==' | '<=' | '>=' | '!=');
			
arithOperation : arithMonom (operAddPlus arithMonom)*;
arithMonom     : arithSingle (operTimesDiv arithSingle)*;
arithSingle    :     '-' arithOperation			#DecExpr
                   | '(' expr ')'				#ParExpr
                   | arithSingle '(' args? ')' 	#FunCallExpr
		           | arithSingle ('.' ID)+ 		#ObjectAccess
				   | idSingle 					#idExpr
				   | object						#ObjectExpr
		           | constant 					#ConstantExpr
		         
				   ;
idSingle : ID
;
operAddPlus : op=('+' | '-')
;
operTimesDiv: op=('*' | '/')
;
constant        :    NUMBER  #ExprNum 
                   | STRING  #ExprString 
				   | 'true'  #ExprTrue
				   | 'false' #ExprFalse
				   | 'null'  #ExprNull
				   ;
args   :  expr (',' expr)*;

// LEXER

NUMBER : INTEGER ('.' INTEGER)? ;
fragment INTEGER : [0-9]+ ;
STRING : ('"' (~'"')* '"' );

ID : [a-zA-Z][a-zA-Z_0-9]* ;
ADD: '+';
MINUS: '-';
TIMES: '*';
DIV: '/';
// IGNORE
CS : '//' .*? '\r'?'\n' -> skip;
WS : [ \t\r\n]+ -> skip ;


