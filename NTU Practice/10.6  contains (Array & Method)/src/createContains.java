/**
 * @author Bastaff
 *
 */
import java.util.Arrays;
import java.util.Scanner;

public class createContains {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int items;
		int[] array;
		int key;

		System.out.println("What number are we looking for");
		key = in.nextInt();

		System.out.println("Amount of items");
		items = in.nextInt();
		array = new int[items];

		System.out.println("Enter " + items + " items in array");
		for (int count = 0; count < array.length; ++count) {
			array[count] = in.nextInt();
		}
		System.out.println("Created Array: " + Arrays.toString(array));
		System.out.println(contains(array, key));
	}
	public static boolean contains(int[] array, int key) {
		boolean contains = false;
		int count = 0;
		int position = 0;

		for (count = 0; count < array.length; ++count) {
			if (array[count] == key) {
			position = array[count];
				contains = true;
			}
		}
		if (contains == true) {
			System.out.println("Number " + key + " found at position " + position);
		} else {
			System.out.println("Number " + key + "was not found in array");
		}
		return contains;
	}
}
