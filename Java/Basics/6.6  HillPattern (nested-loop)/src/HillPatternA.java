import java.util.Scanner;
public class HillPatternA {

	public static void main(String[] args) {
		//(row + col >= size + 1) && (row <= col - size + 1))
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		char hash = '#';
		char space = '|';
		
		
		for (int row = 1; row <= size; row++) {
	         for (int col = 1; col <= (2* size); col++) {
	        	 
	        	 
	            if ((row + col >= size + 1) && (row >= col - size + 1)){

	               System.out.printf("%2s", hash);
	            } else {
	               System.out.printf("%2s", col);
	            }
	         }
	         System.out.println();
	      }

	}

}
