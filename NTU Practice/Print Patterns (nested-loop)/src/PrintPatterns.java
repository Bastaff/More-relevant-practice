import java.util.Scanner;
public class PrintPatterns {
	public static void main(String[] args) {
		int size = 8;
		printPattern_a(size);
		printPattern_b(size);
	}

	public static void printPattern_a(int size) {
		char hash = '#';
		char space = ' ';

		for (int col = 1; col <= size; col++) {
			for (int row = 1; row <= size; row++) {
				if (row >= col) {
					System.out.printf("%2s", hash);
				} else {
					System.out.printf("%2s", space);
				}
			}
			System.out.println();
		}
	}
	
	public static void printPattern_b(int size) {
		char hash = '#';
		
		
		for (int row = 1; row <= size; row++) {

			for (int col = 1; col <= size; col++) {

				if (row + col <= size + 1)

					System.out.printf("%2s", hash);

			}
			System.out.println();
		}
	} 
}
