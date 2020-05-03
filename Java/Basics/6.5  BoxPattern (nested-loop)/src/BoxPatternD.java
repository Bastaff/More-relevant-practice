import java.util.Scanner;

public class BoxPatternD {
 public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		char hash = '#';
		char space = ' ';
		
		for(int row = 1; row < size; row++) {
			for (int col = 1; col < size; col++) {
				
				if (row == 1 || row == size || row == col || row == size - 1 || col == size - row) {
					System.out.printf("%2s", hash);
					
				
				} else {
					System.out.printf("%2s", space);
				}
			}
			System.out.println();
		}
	}
}
