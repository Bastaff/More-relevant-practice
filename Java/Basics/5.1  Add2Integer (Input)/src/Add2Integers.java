import java.util.Scanner;

public class Add2Integers {
	public static void main(String[] args) {
		
		int num1, num2, sum;
		Scanner n = new Scanner(System.in);
				
		num1 = n.nextInt();
		num2 = n.nextInt();
		sum = num1 + num2;
		
		System.out.println("The sum is " + sum);
		n.close();
	}
}
