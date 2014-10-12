/*Este código ha sido generado como fork del proyecto JSBeautify
 que se puede encontrar en https://github.com/belgampaul/JsBeautifier
 bajo la siguiente licencia: "you are free to use, modify the code as you like. 
 There's a lot of options to extend the functionality based on the input params of beautify.js.
 At the moment I don't need them so everything as simple as it could be."
 */
package pajama.compile;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class JsBeautify {

    /*BEAUTIFY.JS DEBE DE ESTAR EN "lib/pajama/compile" PARA QUE FUNCIONE*/
    public static final String BEAUTIFY_JS = "beautify.js";

    public static String jsBeautify(String jsCode, int indentSize) {
        Context cx = Context.enter();
        Scriptable scope = cx.initStandardObjects();
        InputStream resourceAsStream = JsBeautify.class.getResourceAsStream(BEAUTIFY_JS);
        try {
            Reader reader = new InputStreamReader(resourceAsStream);
            cx.evaluateReader(scope, reader, "__beautify.js", 1, null);
            reader.close();
        } catch (IOException e) {
            throw new Error("Error reading " + "beautify.js");
        }
        scope.put("jsCode", scope, jsCode);
        return (String) cx.evaluateString(scope, "js_beautify(jsCode, {indent_size:" + indentSize + "})",
                "inline", 1, null);
    }
}
