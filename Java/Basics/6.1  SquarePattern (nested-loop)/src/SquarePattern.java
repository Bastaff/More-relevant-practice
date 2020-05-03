import java.util.Scanner;

public class SquarePattern {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		char hash = '#';
		
		
		
		
		for (int row = 1; row <= size; row++) {
			// Inner loop to print each of the columns of a particular row
			for (int col = 1; col <= size; col++) { 
				System.out.print(hash + " "); // Use print() without newline inside the inner loop

			}
			System.out.println();
		}
	}
}
