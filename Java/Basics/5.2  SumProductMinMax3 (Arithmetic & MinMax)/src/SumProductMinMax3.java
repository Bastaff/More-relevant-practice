import java.util.Scanner;
public class SumProductMinMax3 {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st Integer: ");
		System.out.println("Enter 2nd Integer: ");
		System.out.println("Enter 3rd Integer: ");
		int num1, num2, num3;
		int min, max, sum, product;
		
		num1 = s.nextInt();
		num2 = s.nextInt();
		num3 = s.nextInt();
		sum = num1 + num2 + num3;
		product = num1 * num2 * num3;
		min = num1;
		max = num1;
		
		System.out.println("The sum is: " + sum);
		System.out.println("The product is: " + product);
		
		
		if (num2 < num1) {
			min = num2;
		}
		if (num3 < num2){
			min = num3;
		}
			System.out.println("The min is: " + min);
			
			if (num2 > num1) {
				max = num2;
			}
			if (num3 > num2){
				max = num3;
			}
			System.out.println("The max is: " + max);
	}
}
