import java.util.Scanner;
public class NumberPatternA {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		int number = 0;
		
		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size; col++) {
				
				if (row >= col) {
				System.out.printf("%2d", col);
				}
			}
			System.out.println();
		}
	}
}
