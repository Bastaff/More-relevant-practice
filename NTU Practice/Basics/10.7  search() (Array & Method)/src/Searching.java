import java.util.Scanner;

public class Searching {
	public static void main(String[] args) {
		int contains;
		int items;
		int[] array;
		int result;
		Scanner in = new Scanner(System.in);

		System.out.print("Number to look for; ");
		contains = in.nextInt();

		System.out.print("Amount of items in array; ");
		items = in.nextInt();
		array = new int[items];

		System.out.print("Enter " + items + " items into array");
		for (int count = 0; count < items; count++) {
			array[count] = in.nextInt();
		}
		result = search(array, contains);
		System.out.println(result);
	}

	public static int search(int[] somearray, int key) {

		if (somearray == null) {
			return -1;
		}

		int i = 0;

		while (i < somearray.length) {
			if (somearray[i] == key) {
				return i;
			} else {
				i = i + 1;
			}
		}
		return -1;
	}
}
