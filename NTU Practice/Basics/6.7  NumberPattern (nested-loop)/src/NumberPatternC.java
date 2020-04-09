import java.util.Scanner;
public class NumberPatternC {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		char space = ' ';
		
		
		for (int row = 1; row <= size; row++) {
			for (int col = size; col >= 1; col--) {
				
				if (row >= col) {
				System.out.printf("%2d", col);
				
				} else {
					System.out.printf("%2s", space);
				}
			}
			System.out.println();
		}

	}
}
