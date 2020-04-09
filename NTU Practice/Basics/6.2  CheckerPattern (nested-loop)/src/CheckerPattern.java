import java.util.Scanner;

public class CheckerPattern {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		char hash = '#';

		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size; col++) {
				if ((row % 2) == 0) {
					System.out.print(" " + hash);

				} else
					System.out.print(hash + " ");

			}
			System.out.println();
		}
	}
}
