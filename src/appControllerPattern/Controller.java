package appControllerPattern;

import java.util.HashMap;

public class Controller {
	public static HashMap<String, doMath> key = new HashMap<String, doMath>();

	public void Controller() {

	}

	// add classes or views to the controller here
	public void handler(String operator, Integer num1, Integer num2) {
		key.put("+", new Add());
		key.put("-", new Subtract());
		key.put("*", new Multiply());
		key.put("/", new Divide());

		// get operator from hashmap
		doMath handler = key.get(operator);

		handler.execute(num1, num2);
	}

}