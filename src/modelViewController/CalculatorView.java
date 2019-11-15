package modelViewController;
import java.awt.event.ActionListener;
import javax.swing.*;

/*The view is the user interface. Without the model and controller it would still be displayed
but it wouldn't know what to do with user input.*/
public class CalculatorView extends JFrame {
	private JTextField firstNumber = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
	private JTextField secondNumber = new JTextField(10);
	private JButton calculateButton = new JButton("Calculate");
	private JTextField calcSolution = new JTextField(10);
	
	
	CalculatorView(){
		
		JPanel calcPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 300);
		
		calcPanel.add(firstNumber);
		calcPanel.add(additionLabel);
		calcPanel.add(secondNumber);
		calcPanel.add(calculateButton);
		calcPanel.add(calcSolution);
		
		this.add(calcPanel);
		
	}
	
	public int getFirstNumber() {
		return Integer.parseInt(firstNumber.getText());
	}
	
	public int getSecondNumber() {
		return Integer.parseInt(secondNumber.getText());
	}
	
	public int getCalcSolution() {
		return Integer.parseInt(calcSolution.getText());
	}
	
	public void setCalcSolution(int solution) {
		calcSolution.setText(Integer.toString(solution));
	}
	
	void addCalculationListener(ActionListener listenerForCalcButton) {
		calculateButton.addActionListener(listenerForCalcButton);
	}
	
	void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}

}
