/**
 * @author Bastaff
 *	Write a boolean method called copyOf(), which takes an int Array and returns a copy of the given array. 
 */
import java.util.Arrays;
import java.util.Scanner;
public class CopyOf {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int items;
		int[] array;

		System.out.println("Enter size of array");
		items = in.nextInt();
		array = new int[items];

		System.out.println("Enter " + items + " items in array");
		for (int count = 0; count < array.length; ++count) {
			array[count] = in.nextInt();
		}
		System.out.println("Original Array" + Arrays.toString(array));
		System.out.println("Copy of Array" + Arrays.toString(copyOf(array)));
	}

	public static int[] copyOf(int[] array) {
		int[] copy = new int[array.length];

		for (int count = 0; count < array.length; ++count) {
			copy[count] = array[count];
		}
		//incrementing by 1 to prove the copy is independent from the original array
		copy[0]++;
		
		return copy;
	}
}
