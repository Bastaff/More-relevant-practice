import java.util.Scanner;
public class Bin2Dec {
	public static void main (String[]args) {
		 String input;  // The input binary string
	      int length;  // The length of binStr
	      int container = 0;    // The decimal equivalent, to accumulate from 0
	      char eachChar;   // Each individual char of the binStr
	      Scanner in = new Scanner(System.in);

	      // Prompt and read input as "String"
	      System.out.print("Enter a binary string: ");
	      input = in.next();
	      length = input.length();

	      // Process char by char from the right (i.e. Least-significant bit)
	      // using exponent as loop index.
	      for (int count = 0; count < length ; ++count) {
	         eachChar = input.charAt(length - 1 - count);
	         // 3 cases: '1' (add to dec), '0' (valid but do nothing), other (error)
	         if (eachChar == '1') {
	            container += (int)Math.pow(2, count);  // cast the double result back to int
	         } else if (eachChar == '0') {
	         } else {
	            System.out.println("error: invalid binary string \"" + input + "\"");
	            return;           // or System.exit(1);
	         }
	      }

	      // Print result
	      System.out.println("The equivalent decimal for \"" + input + "\" is " + container);
	      in.close();
	   }
	}
