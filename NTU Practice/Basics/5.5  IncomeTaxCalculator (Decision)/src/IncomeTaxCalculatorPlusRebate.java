
public class IncomeTaxCalculatorPlusRebate {
	public static void main(String[] args) {

		final double TAX_RATE_ABOVE_20K = 0.1;
		final double TAX_RATE_ABOVE_40K = 0.2;
		final double TAX_RATE_ABOVE_60K = 0.3;

		int taxableIncome = 85432;
		double taxPayable;
		double taxRebate = 0;

		// $20000*0% + $20000*10% + $20000*20% + $25000*30%.

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
	}
}
