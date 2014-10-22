package pajama.js;
import java.io.*;
import java.util.*;
public class JSObject implements JSAst{
	List<JSAst> pairs;
	public JSObject(List<JSAst> pairs){
		this.pairs = pairs;
	}
	@Override
	public void genCode(PrintStream out){
		out.print("{");
		genCode(out, pairs);
		out.print("}");
	}
}