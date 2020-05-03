import java.util.Arrays;
import java.util.Scanner;
public class printArrayInStars {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter amount of items array should hold");
		int numItems = in.nextInt();
		int[] items = new int[numItems];

		System.out.println("Enter the values for " + numItems + " Items");

		for (int count = 0; count < numItems; count++) {
			items[count] = in.nextInt();
		}

		for (int row = 0; row < items.length; ++row) { // row
			System.out.print(row + ": ");

			for (int stars = 1; stars <= items[row]; ++stars) { // column
				System.out.print("*");
			}
			System.out.print("(" + items[row] + ")");
			System.out.println();
		}
	}
}
