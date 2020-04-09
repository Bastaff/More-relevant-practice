import java.util.Scanner;

public class Product1Ton {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Add 2 ints");
		long product = 1; // The accumulated product, init to 1
		long lowerbound = s.nextInt(); // Switched everything to long to cover up to Factorial of 20
		long upperbound = s.nextInt();

		for (long num = lowerbound; num <= upperbound; num++) {
			product *= num; // we use multiplication here instead of addition 10! = 1x2x3x4... not
							// 1+2+3+4...

			System.out.println("Factorial of low x up = " + product);
		}
	}
}
