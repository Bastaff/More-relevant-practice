import java.util.Scanner;

public class TriangularPatternA {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		char hash = '#';
		char space = ' ';
		int row = 1;
		int col = 1;

		for (row = 1; row <= x; row++) {
			for (col = 1; col <= x; col++)
				
				if (row >= col) { 
					System.out.printf("%2s", hash);
				} else {
					System.out.printf("%2s", space);
				}
			System.out.println();
			}
		}

	}


