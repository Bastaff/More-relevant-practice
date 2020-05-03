//For pattern (b), if (row + col <= size + 1) print #. Trailing blanks are optional.
import java.util.Scanner;
public class TriangularPatternB {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
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
