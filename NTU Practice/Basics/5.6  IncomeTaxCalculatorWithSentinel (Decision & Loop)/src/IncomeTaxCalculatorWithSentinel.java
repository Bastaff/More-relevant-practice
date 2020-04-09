import java.util.Scanner;
public class IncomeTaxCalculatorWithSentinel {
	public static void main(String [] args) {

		final double TAX_RATE_ABOVE_20K = 0.1;
		final double TAX_RATE_ABOVE_40K = 0.2;
		final double TAX_RATE_ABOVE_60K = 0.3;
	    final int SENTINEL = -1;   						 // Terminating value for input


	      // Declare variables
	      int taxableIncome;
	      double taxPayable;
	      double taxRebate;
	      Scanner in = new Scanner(System.in);

	      // Read the first input to "seed" the while loop
	      System.out.print("Enter the taxable income (or -1 to end): $");
	      taxableIncome = in.nextInt();

	      while (taxableIncome != SENTINEL) {
	    	  if (taxableIncome <= 20000) {
	  			taxPayable = taxableIncome * 0; // [0, 20000]
	  		} else if (taxableIncome <= 40000) {
	  			taxPayable = (20000 * 0) - ((taxableIncome - 20000) * TAX_RATE_ABOVE_20K); // [20001, 40000]
	  		} else if (taxableIncome <= 60000) {
	  			taxPayable = (20000 * 0) + (20000 * 0.1) + ((taxableIncome - 40000) * TAX_RATE_ABOVE_40K); // [40001, 60000]
	  		} else {
	  			taxPayable = (((taxableIncome - 60000) * TAX_RATE_ABOVE_60K) + (20000 * 0) + (20000 * 0.1) + (20000 * 0.2)); // [60001,																											// ]
	  		}
	  		
	  		if(taxPayable <= 10000) {
	  			taxRebate = taxPayable * 0.1;
	  		}
	  		else {
	  			taxRebate = 1000;
	  		}
	  		System.out.printf("The income tax payable is: $%.2f%n", taxPayable);
	  		System.out.println("Tax Rebate Is: " + taxRebate);
	  		
	         System.out.print("Enter the taxable income (or -1 to end): $");
	         taxableIncome = in.nextInt();
	            // Repeat the loop body, only if the input is not the SENTINEL value.
	            // Take note that you need to repeat these two statements inside/outside the loop!
	      }
	      System.out.println("bye!");
		
	}
}

