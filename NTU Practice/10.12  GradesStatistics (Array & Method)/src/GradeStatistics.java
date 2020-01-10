/**
 * @author Bastaff
 * Write a program called GradesStatistics, which reads in n grades (of int between 0 and 100, inclusive) and displays 
 * the average, minimum, maximum, median and standard deviation. 
 * Display the floating-point values upto 2 decimal places.
 */
import java.util.Arrays;
import java.util.Scanner;
public class GradeStatistics {
	public static int[] grades;

	public static void main(String[] args) {
		readGrades();
		System.out.println(Arrays.toString(grades));

	}

	public static void readGrades() {
		int students;
		int placeholder;
		boolean isValid;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number of Students");
		students = in.nextInt();
		grades = new int[students];
		System.out.println("Added " + students
				+ " Students - Enter their grades (between 0-100)");

		for (int count = 0; count <= grades.length - 1; ++count) {
			isValid = false; // set to false
			do { // use placeholder to validate input
				placeholder = in.nextInt();
				if (placeholder >= 0 && placeholder <= 100) {
					isValid = true;
				} else {
					System.out.println("Enter a valid digit between 0-100");
				}
			} while (!isValid); // when input is valid THEN add it to the Array
			grades[count] = placeholder;
		}

	}
}
