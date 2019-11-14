package modelViewController;
// The data we'll goes in the model
public class CalculatorModel {
	
	private int calculationValue;
	
	public void addNumbers(int firstNumber, int secondNumber) {
		calculationValue = firstNumber + secondNumber;
	}
	

	public int getCalculationValue() {
		return calculationValue;
	}

}
