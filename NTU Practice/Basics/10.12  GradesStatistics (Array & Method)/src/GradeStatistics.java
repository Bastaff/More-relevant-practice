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
		print(grades);
		System.out.printf("\n%s%.2f", "The average is: ", average(grades));
		System.out.printf("\n%s%.2f", "The median is: ", median(grades));
		System.out.printf("\n%s%d", "The minimum is: ", min(grades));
		System.out.printf("\n%s%d", "The maximum is: ", max(grades));
		System.out.printf("\n%s%.2f", "The standard deviation is: ",
				stdDev(grades));

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

	public static void print(int[] array) { // this could be replaced by
											// Arrays.toString but since it's
											// practice we're doing it the old
											// school way
		System.out.print("The grades are: [");
		for (int count = 0; count <= array.length - 1; ++count) {
			if (count == 0) {
				System.out.print(array[count]);
			} else {
				System.out.print(", " + array[count]);
			}
		}
		System.out.print("]");
	}

	public static double average(int[] array) { 
		double sum = 0;

		for (int count = 0; count <= array.length - 1; ++count) {
			sum += array[count];
		}
		sum = sum / array.length;
		return sum;
	}

	public static double median(int[] array) {
		double median = 0;
		int middle = array.length / 2;
		int valueBase;
		int j;

		for (int count = 0; count <= array.length - 1; ++count) {
			valueBase = array[count];
			for (j = count; j > 0 && array[j - 1] > valueBase; j--) {
				array[j] = array[j - 1];
			}
			array[j] = valueBase;
		}
		for (int count = 0; count <= array.length - 1; ++count) {
			if (array.length % 2 != 0) {
				median = array[middle];
			} else {
				median = (array[middle] + array[middle - 1]) / 2;
			}
		}
		return median;
	}

	public static int max(int[] array) {
		int max = array[0];

		for (int count = 0; count <= array.length - 1; ++count) {
			while (max < array[count]) {
				max = array[count];
			}
		}
		return max;
	}

	public static int min(int[] array) {
		int min = array[0];

		for (int count = 0; count <= array.length - 1; ++count) {
			while (min > array[count]) {
				min = array[count];
			}
		}
		return min;
	}

	public static double stdDev(int[] array) {
		double stdDev;
		int sum = 0;

		for (int count = 0; count <= array.length - 1; ++count) {
			sum += array[count];
		}
		stdDev = sum / array.length;
		return stdDev;
	}
}
