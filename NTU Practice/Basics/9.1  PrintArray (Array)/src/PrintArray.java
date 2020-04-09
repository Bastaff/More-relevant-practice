	import java.util.Scanner;
public class PrintArray {
	   public static void main(String[] args) {
		   // Declare variables
		      int numItems;
		      int[] items;  // Declare array name, to be allocated after numItems is known
		      Scanner in = new Scanner(System.in);

		      System.out.println("Enter number of items:");
		      numItems = in.nextInt();


		      // Allocate the array
		      items = new int[numItems];

		      // Prompt and read the items into the "int" array, if array length > 0
		      if (items.length > 0) {
		         System.out.println("Enter " + numItems + " Items");
		         for (int i = 0; i < items.length; ++i) {  // Read all items
		           items[i] = in.nextInt();
		         }
		      }

		      // Print array contents, need to handle first item and subsequent items differently
		      System.out.println("The " +numItems+ " items are:");
		      for (int i = 0; i < items.length; ++i) {
		         if (i == 0) {
		            System.out.print("[" + items[0]);
		         } else {
		            System.out.print(", " + items[i]);

		         }
		      }
		         System.out.print("]");
		}
}