package modelViewController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//The controller is the code or logic of the program
public class CalculatorController {
	
	private CalculatorView theView;
	private CalculatorModel theModel;
	
	public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
		
		this.theView = theView;
		this.theModel = theModel;
		
		this.theView.addCalculationListener(new CalculateListener());
		
	}
	class CalculateListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {


			int firstNumber, secondNumber = 0;
			
			try {
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();
				
				theModel.addNumbers(firstNumber, secondNumber);
				
				theView.setCalcSolution(theModel.getCalculationValue());
					
			}
			
			catch(NumberFormatException e) {
				theView.displayErrorMessage("Enter 2 Integers");
			}
			
		}
		
	}

}
