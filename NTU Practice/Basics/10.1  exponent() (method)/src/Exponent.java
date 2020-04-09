import java.util.Scanner;
public class Exponent {
	public static void main (String[] args) {
	Scanner in = new Scanner(System.in);
	int exp;
	int base;
	System.out.println("Enter Base: ");
	base = in.nextInt();
	System.out.println("Enter Exponent: ");
	exp = in.nextInt();
	
	System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));
	}
	
	public static int exponent(int base, int exp) {
		int product = 1;
		
		for(int count = 0; count <= exp - 1; count++) {
			product *= base;
		}	
		return product;
	}
}
