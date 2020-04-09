import java.util.Scanner;
public class OddEvenTest {

	public static boolean isOdd(int number) {
			return !(number % 2 == 0);
		}
	public static boolean isEven(int number ) {
			return (number % 2 == 0);
	}

	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number to check: ");
		int number = in.nextInt();
		
		if (isOdd(number) == true) {
			System.out.println(number + " is an Odd number");
		} else if (isEven(number) == true){
			System.out.println(number + " is an Even number");
		}
	}
}
