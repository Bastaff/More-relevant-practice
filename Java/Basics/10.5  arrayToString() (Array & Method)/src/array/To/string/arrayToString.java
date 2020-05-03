package array.To.string;
import java.util.Arrays;
import java.util.Scanner;

public class arrayToString {
public static void main(String[] args) {
	int items;
	int[] array;
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter the size of the array");
	items = in.nextInt();
	array = new int [items];
	
	System.out.println("Add " + items + " items separated by spaces");
	for (int count = 0; count < items; count++) {
		array[count]= in.nextInt();
	}
	System.out.println(arrayToStringr(array));
}

public static String arrayToStringr(int[] array) {
	return Arrays.toString(array);

}
}
