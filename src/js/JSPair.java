package pajama.js;
import java.io.*;
import java.util.*;
public class JSPair extends  JSOperation{
	public JSPair(JSAst left,JSAst right){
		super(new JSId(":"),left,right);
	}
	@Override
	public void genCode(PrintStream out){
		left.genCode(out);
		oper.genCode(out);
		right.genCode(out);
	}
}