import java.util.Scanner;
public class Pension {
	public static void main(String[] args) {

		final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
		final double EMPLOYEE_RATE_55_TO_60 = 0.13;
		final double EMPLOYEE_RATE_60_TO_65 = 0.075;
		final double EMPLOYEE_RATE_65_ABOVE = 0.05;

		final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
		final double EMPLOYER_RATE_55_TO_60 = 0.13;
		final double EMPLOYER_RATE_60_TO_65 = 0.09;
		final double EMPLOYER_RATE_65_ABOVE = 0.075;
		
		char d = '°';
		
		final int SALARY_CEILING = 6000;
		Scanner s = new Scanner(System.in);
		
		// Declare variables

		int contributableSalary;
		double employeeContribution = 0;
		double employerContribution = 0;
		double totalContribution = 0;
		
		System.out.print("Enter the monthly salary:");
		int salary = s.nextInt();
		System.out.print("Enter the age:");
		int age = s.nextInt();


		if (age <= 55) { // 
			employeeContribution = (double) (salary * EMPLOYEE_RATE_55_AND_BELOW);
			employerContribution = (double) (salary * EMPLOYER_RATE_55_AND_BELOW);
			totalContribution = (double) (employeeContribution + employerContribution);

		} else if (age <= 60) {
			employeeContribution = (double) (salary * EMPLOYEE_RATE_55_TO_60);
			employerContribution = (double) (salary * EMPLOYER_RATE_55_TO_60);
			totalContribution = (double) (employeeContribution + employerContribution);

		} else if (age <= 65) { 
			employeeContribution = (double) (salary * EMPLOYEE_RATE_60_TO_65);
			employerContribution = (double) (salary * EMPLOYER_RATE_60_TO_65);
			totalContribution = (double) (employeeContribution + employerContribution);

		} else {
			employeeContribution = (double) (salary * EMPLOYEE_RATE_65_ABOVE);
			employerContribution = (double) (salary * EMPLOYER_RATE_65_ABOVE);
			totalContribution = (double) (employeeContribution + employerContribution);
			
		}
		if (salary >= SALARY_CEILING) {
			 employeeContribution = 1200.00;
			 employerContribution = 1020.00;
			 totalContribution = 2220.00;
		}
		
		System.out.println("The employee's contribution is:" + employeeContribution);
		System.out.println("The employer's contribution is:" + employerContribution);
		System.out.println("The total contribution is:" + totalContribution);
		System.out.println(d);
	}
	
}
