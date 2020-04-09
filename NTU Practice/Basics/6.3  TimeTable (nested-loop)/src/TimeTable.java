
/*
 * Write a program called TimeTable that prompts user for the size (a positive integer in int); 
 * and prints the multiplication table as shown:

Enter the size: 10
 * |   1   2   3   4   5   6   7   8   9  10
--------------------------------------------
 1 |   1   2   3   4   5   6   7   8   9  10
 2 |   2   4   6   8  10  12  14  16  18  20
 3 |   3   6   9  12  15  18  21  24  27  30
 4 |   4   8  12  16  20  24  28  32  36  40
 5 |   5  10  15  20  25  30  35  40  45  50
 6 |   6  12  18  24  30  36  42  48  54  60
 7 |   7  14  21  28  35  42  49  56  63  70
 8 |   8  16  24  32  40  48  56  64  72  80
 9 |   9  18  27  36  45  54  63  72  81  90
10 |  10  20  30  40  50  60  70  80  90 100
 */
import java.util.Scanner;

public class TimeTable {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int col;
		int row;
		char star = '*';
		char line = '|';
		int num = 1;

		System.out.printf("%2s %s", star, line);
		for (num = 1; num <= size; num++) {
			System.out.printf("%4d", num);

		}
		System.out.println();
		for (num = 1; num <= size; num++) {
			System.out.print("----");

		}

		for (col = 1; col <= size; col++) {
			System.out.printf("%n%2d%2s", col, line);

			for (row = 1; row <= size; row++) {
				System.out.printf("%4d", (row * col));

			}
		}

	}
}