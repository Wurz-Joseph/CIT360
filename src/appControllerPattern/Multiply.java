package appControllerPattern;

//multiply class called when operator is '*'
public class Multiply implements doMath {
	public void execute(Integer num1, Integer num2) {
		Integer product = num1 * num2;
		System.out.println(product);
	}

}
