package ex.j8.javascript.on.java;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class RunJavaScriptFromJAVAMain {

	public static void main(String args[]) throws FileNotFoundException {
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");

		String name = "Nashorn awesome :)";
		Integer result = null;

		try {
			nashorn.eval("print('" + name + "')");
			result = (Integer) nashorn.eval("10 * 10");
			nashorn.eval("print('" + result + " %')");
			//nashorn.eval(new FileReader("C:\\Projects\\GIT\\Learnings\\Java8-TheUpgrade\\Java8-Exs\\src\\ex\\j8\\javascript\\on\\java\\use_java_in_java_script.js"));

		} catch (ScriptException e) {
			System.out.println("Error executing script: " + e.getMessage());
		}
	}

}
