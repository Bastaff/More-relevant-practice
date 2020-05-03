package testingContains;
import java.util.Scanner;

public class TestingContains {

	public static void main(String[] args) {
		int key;
		int items;
		int[] array;
		Scanner in = new Scanner(System.in);

		System.out.print("What number are we looking for?");
		key = in.nextInt();

		System.out.print("Enter amount of items to have in the array: ");
		items = in.nextInt();
		array = new int[items];

		System.out.print("Enter " + items + " items into array");
		for (int count = 0; count < items; count++) {
			array[count] = in.nextInt();
		}
		contains(array, key);
	}

	public static boolean contains(int[] array, int key) {
		boolean isTrue = false;

		for (int count = 0; count < array.length; count++) {
			if (array[count] == key) {
				System.out.println("Array contains " + key);
				isTrue = true;
			} else if (isTrue == false) {
				System.out.println(
						"Array item  " + count + " DOES NOT contain " + key);
			}
		}
		return isTrue;

	}

}
