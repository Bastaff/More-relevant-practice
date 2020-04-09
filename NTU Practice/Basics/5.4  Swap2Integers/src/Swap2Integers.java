import java.util.Scanner;

public class Swap2Integers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int number1 = s.nextInt();
		int number2 = s.nextInt();
		int temp1 = number1;
		int temp2 = number2;

		System.out.println("After the swap, first integer is:  " + temp2 + "  ," + "second integer is:  " + temp1);
		
	}
}
