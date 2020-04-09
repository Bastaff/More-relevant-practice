import java.util.Scanner;
public class MagicSum {

	public static boolean hasEight(int number) {
		if (number == 8)
			return true;

		while (number > 0) {
			if (number % 10 == 8)
				return true;

		}
		return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		final int SENTINEL = -1;
		int number;
		int sum = 0;

		System.out.print("Enter a positive integer (or -1 to end): ");
		number = in.nextInt();

		while (number != SENTINEL) {

			if (hasEight(number) == true) {
				sum += number;
			}
			System.out.print("Enter a positive integer (or -1 to end): ");
			number = in.nextInt();
			
		}

		System.out.println("Numbers are summed up to " + sum);
	}
}
