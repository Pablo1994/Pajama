package pajama.js;
import java.io.*;
import java.util.*;

public abstract class JSPrintable implements JAst{
	public String toString(){
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		genCode(new PrintStream(bos));
		return bos.toString();
	}
}
