package appControllerPattern;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Boolean invalid = false;
		do {
			try {
				Scanner input = new Scanner(System.in);

				Controller calculate = new Controller();

				Integer num1;
				Integer num2;
				String operator = "";

				// prompt for num1
				System.out.print("Number 1: ");
				num1 = Integer.parseInt(input.nextLine());

				// prompt for operator
				System.out.print("Enter an operation (+, -, *, /): ");
				operator = input.nextLine();

				// prompt for num2
				System.out.print("Number 2: ");
				num2 = Integer.parseInt(input.nextLine());

				// display result
				System.out.println("\nResult\n" + "==========");
				calculate.handler(operator, num1, num2);

				// close scanner
				input.close();

			} catch (NumberFormatException e) {
				System.err.println("\ninvalid input");
				invalid = true;
			}
		} while (invalid == true);

	}

}
