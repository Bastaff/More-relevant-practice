import java.util.Scanner;

public class HillPatternD {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		char hash = '#';
		char space = ' ';

		for (int row = 0; row <= size; row++) {
			for (int col = 0; col <= (2 * size); col++) {
				if ((row + col >= size + 1) && (row >= col - size + 1)) {
					System.out.printf("%2s", space);
				} else {
					System.out.printf("%2s", hash);
				}
			}
			System.out.println();
		}

		for (int row = 2; row <= size + 1; row++) {
			for (int col = 0; col <= (2 * size); col++) {
				if (row + col <= (2 * size) && row <= col) {

					System.out.printf("%2s", space);
				} else {
					System.out.printf("%2s", hash);
				}
			}
			System.out.println();
		}
	}
}