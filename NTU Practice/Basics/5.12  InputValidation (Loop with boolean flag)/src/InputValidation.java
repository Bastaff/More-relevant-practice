/* Your program often needs to validate the user's inputs, e.g., marks shall be between 0 and 100.
* Write a program that prompts user for an integer between 0-10 or 90-100. 
* The program shall read the input as int; and repeat until the user enters a valid input.
*/

import java.util.Scanner;

public class InputValidation {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int numberIn;
		boolean isValid;

		isValid = false;
		do {
			numberIn = s.nextInt();

			if (numberIn >= 0 && numberIn <= 10) {
				isValid = true;
				System.out.println("You have entered " + numberIn);
				
			} else if (numberIn >= 90 && numberIn <= 100) {
				isValid = true;
				System.out.println("You have entered " + numberIn);
				
			} else {
				System.out.println("Invalid input, try again..."); // Print error message and repeat
			}
		} while (!isValid);
	}
}
