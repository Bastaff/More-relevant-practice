import java.util.Arrays;

/**
 * @author Bastaff
 * 		   Write a method called swap(), which takes two arrays of int and
 *         swap their contents if they have the same length. It shall return
 *         true if the contents are successfully swapped.
 */
public class SwapArrays {
	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 5};
		int[] array2 = {4, 3, 2, 1};

		// Checking for result
		System.out.println(swap(array1, array2));
		//Printing both arrays to confirm that they are swapped
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
	}
	public static boolean swap(int[] array1, int[] array2) {
		int temp;
		boolean swapped = false;

		if (array1.length == array2.length) {
			for (int count = 0; count < array1.length; ++count) {
				temp = array1[count];
				array1[count] = array2[count];
				array2[count] = temp;
			}
			swapped = true;
		}
		return swapped;
	}
}
