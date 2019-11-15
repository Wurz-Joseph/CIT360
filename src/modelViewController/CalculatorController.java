package modelViewController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*The controller is the code or logic of the program. 
It communicates with model and the view so that our program will actually do something.*/
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


			int firstNumber = 0;
			int secondNumber = 0;
			
			try {
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();
				
				theModel.addNumbers(firstNumber, secondNumber);
				
				theView.setCalcSolution(theModel.getCalculationValue());
					
			}
			//runs if the user doesn't enter 2 integers
			catch(NumberFormatException e) {
				theView.displayErrorMessage("Enter 2 Integers");
			}
			
		}
		
	}

}
