import java.util.Scanner;

public class AverageWithInputValidation {
	public static void main(String[] args) {
		// Declare constant
		final int NUM_STUDENTS = 3;

		// Declare variables
		Scanner s = new Scanner(System.in);
		int numberIn;
		boolean isValid; // boolean flag to control the input validation loop
		int sum = 0;
		double average;
		
		for (int studentNo = 1; studentNo <= NUM_STUDENTS; ++studentNo) {
        	
        	
        do { 
        	System.out.println("Enter student num " + studentNo + "'s grade");
			numberIn = s.nextInt();
			isValid = false;
			
        	if (numberIn >=0 && numberIn <=100) {
        		isValid = true;
        		sum += numberIn;
        	
        		
        	}
        	else {
    			System.out.println("Invalid Number"); // Says invalid need to return to first
    			
    		}
        } while (!isValid);

		}
        System.out.println("The average is: " + sum / NUM_STUDENTS); // this is just sum not average
	}
}
