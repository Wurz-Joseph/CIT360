package modelViewController;

/* The data we're working with goes in the model. In this case its the two numbers 
 which are added together to create calculation value*/

public class CalculatorModel {
	
	private int calculationValue;
	
	
	public void addNumbers(int firstNumber, int secondNumber) {
		calculationValue = firstNumber + secondNumber;
	}
	

	public int getCalculationValue() {
		return calculationValue;
	}

}
