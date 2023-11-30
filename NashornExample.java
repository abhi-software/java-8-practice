import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornExample {
    public static void main(String[] args) {
        // Create a Nashorn script engine
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");

        try {
            // Define a simple JavaScript code
            String jsCode = "var result = 2 + 3; result;";

            // Execute the JavaScript code using Nashorn
            Object result = nashorn.eval(jsCode);

            // Print the result
            System.out.println("Result of JavaScript code: " + result);
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}
