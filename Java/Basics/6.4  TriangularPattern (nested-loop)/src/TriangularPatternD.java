//For pattern (d), if (row + col >= size + 1) print #; else print blank. Need to print the leading blanks.
import java.util.Scanner;
public class TriangularPatternD {
 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 int size = input.nextInt();
	 char hash = '#';
	 char space = ' ';
	 
	 for (int col = 1; col <= size; col++) {
		 for (int row = 1; row <= size; row++) {
			 if (row + col >= size + 1) {
				 System.out.printf("%2s", hash);
				 
			 } else {
				 System.out.printf("%2s", space);

			 }
		 }
		 System.out.println();
	 }

 }
}
