package appControllerPattern;

//subtract class called when operator is '-'
public class Subtract implements doMath {
	public void execute(Integer num1, Integer num2) {
		Integer dif = num1 - num2;
		System.out.println(dif);
	}

}
