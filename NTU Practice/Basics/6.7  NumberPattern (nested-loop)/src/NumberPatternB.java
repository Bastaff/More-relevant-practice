import java.util.Scanner;

public class NumberPatternB {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		char space = ' ';
		int num = 1;

		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size; col++) {

				if (row <= col) {
					System.out.printf("%2d", col - (row -1));
					
				} else {
					System.out.printf("%2s", space);
				}
			}
			System.out.println();
			}
		}
	}


