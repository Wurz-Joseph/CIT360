package appControllerPattern;


import java.util.HashMap;

public class Controller {
	public static HashMap<String, doMath> key = new HashMap <String, doMath>();
	
	public void Controller() {
		
	}
	
	public static void handler(String operator, Integer num1, Integer num2) {
		key.put("+", new Add());
		key.put("-", new Subtract());
		key.put("*", new Multiply());
		key.put("/", new Divide());
	
		doMath handler = key.get(operator);
		handler.execute(num1, num2);
	}
	
}  