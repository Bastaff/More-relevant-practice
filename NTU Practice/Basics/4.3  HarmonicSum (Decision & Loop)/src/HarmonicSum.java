
public class HarmonicSum {
	public static void main(String[] args) {

		int maxDenominator = 20; // Use a more meaningful name instead of n
		double sumL2R = 0.0; // Sum from left-to-right
		double sumR2L = 0.0; // Sum from right-to-left
		double absDiff; // Absolute difference between the two sums

		for (int denominator = 1; denominator <= maxDenominator; ++denominator) {

			sumL2R += (double) 1.0 / denominator;
		}

		for (int denominator = maxDenominator; denominator >= 1; denominator--) {
			sumR2L += (double) 1.0 / denominator;
		}
		
		if (sumL2R > sumR2L)
			System.out.println(absDiff = sumL2R - sumR2L);
		else 
			System.out.println(absDiff = sumR2L - sumL2R);
			
		
		
		System.out.println(sumL2R);
		System.out.println(sumR2L);
		System.out.println(absDiff);
	}
}
