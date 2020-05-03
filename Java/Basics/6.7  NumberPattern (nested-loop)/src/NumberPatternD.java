import java.util.Scanner;
public class NumberPatternD {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		int number = size + 1;
		
		for (int row = 1; row <= size; row++) {
			number--;
			for (int col = number; col >= 1; col--) {
				
				System.out.printf("%2d", col);

			}
			System.out.println();
		}
	}
}
