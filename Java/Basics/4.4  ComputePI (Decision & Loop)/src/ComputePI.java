
public class ComputePI {
	public static void main(String[] args) {

		double sum = 0.0;
		int maxDenominator = 10000; // Try 10000, 100000, 1000000

		for (int denominator = 1; denominator <= maxDenominator; denominator += 2) {
			// denominator = 1, 3, 5, 7, ..., maxDenominator
			if (denominator % 4 == 1) {
				sum += (1 / denominator);
				System.out.println(sum);
			} else if (denominator % 4 == 3) {
				sum -= (1 / denominator);
			} else { // remainder of 0 or 2
				System.out.println("Impossible!!!");
			}
			System.out.println();
		}
	}
}
