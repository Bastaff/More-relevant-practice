import java.util.Arrays;

/**
 * @author Bastaff
 *
 */
public class reverseArray {
	public static void main(String[] args) {
		int[] array = {1,2,3,4};

		System.out.println(Arrays.toString(array));		 // Print array to check original state
		reverse(array); 													// Reverse array after printing original
		System.out.println(Arrays.toString(array)); 	// Check result after reversing
	}
	
	public static void reverse(int[] array) {
		int temp;
		int fcount; // Forward count
		int bcount; // Backwards count
		
		for (fcount = 0, bcount = array.length - 1; fcount < bcount ;++fcount, --bcount) {
			temp = array[fcount];
			array[fcount] = array[bcount];
			array[bcount] = temp;
		}
	}
}
