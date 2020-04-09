import java.util.Arrays;
import java.util.Scanner;
public class Equals {
	public static void main(String[] args) {
		int arr1items;
		int arr2items;
		int[] arr1;
		int[] arr2;
		int count = 0;
		int count2 = 0;
		boolean result;
		Scanner in = new Scanner(System.in);

		System.out.println("Number of items - Array 1:  ");
		arr1items = in.nextInt();
		arr1 = new int[arr1items];
		System.out.println("Number of items - Array 2:  ");
		arr2items = in.nextInt();
		arr2 = new int[arr2items];

		System.out.println("Add " + arr1items + " items to Array 1:  ");
		while (count < arr1items) {
			arr1[count] = in.nextInt();
			count++;
		}
		System.out.println("Add " + arr2items + " items to Array 2:  ");
		while (count2 < arr2items) {
			arr2[count2] = in.nextInt();
			count2++;
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		result = equals(arr1, arr2);
		System.out.println(result);
	}

	public static boolean equals(int[] array1, int[] array2) {
		int count = 0;
		boolean identical = false;

		while (count < array1.length) {
			if (array1[count] == array2[count]) {
				return true;
			}
			count++;
		}
		return identical;
	}

}
