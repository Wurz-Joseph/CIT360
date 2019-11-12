package appControllerPattern;

//divide class called when operator is '/'
public class Divide implements doMath {
	public void execute(Integer num1, Integer num2) {
		Integer div = num1 / num2;
		System.out.println(div);
	}

}
