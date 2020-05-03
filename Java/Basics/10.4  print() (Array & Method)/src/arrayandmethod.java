import java.util.Scanner;

public class arrayandmethod {
public static void main (String[] args) {
	int items;
	double[] array;
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter the size of the array");
	items = in.nextInt();
	array = new double [items];
	
	System.out.println("Add " + items + " items separated by spaces");
	for (int count = 0; count < items; count++) {
		array[count]= in.nextDouble();
	}
	print(array);
}
public static void print(int[] array) {
	System.out.print("[");
	for (int count = 0; count < array.length; count++)
		System.out.print((count == 0) ? array[count] : "," + array[count] );
	System.out.print("]");
}
public static void print(double[] array) {
	System.out.print("[");
	for (int count = 0; count < array.length; count++)
		System.out.print((count == 0) ? array[count] : "," + array[count] );
	System.out.print("]");
}
}
