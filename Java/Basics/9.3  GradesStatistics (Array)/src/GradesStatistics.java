import java.util.Scanner;
public class GradesStatistics {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of Students");
		int numStudents = in.nextInt();
		int[] grades = new int[numStudents];
		double sum = 0;

		System.out.println("Enter " + numStudents + " grades");
		for (int count = 0; count < numStudents; count++) {
			grades[count] = in.nextInt();

			if (grades[count] <= 100 && grades[count] >= 1) {
				sum += (double) grades[count];
			}
		}

		int min = grades[0];
		for (int count = 0; count < numStudents; count++) {
			if (min > grades[count]) {
				min = grades[count];
			}
		}

		int max = grades[0];
		for (int count = 0; count < numStudents; count++) {
			if (max < grades[count]) {
				max = grades[count];
			}
		}
		System.out.printf("The average of the grades: %.2f", (double) (sum / numStudents));
		System.out.printf("\nThe maximum is: %d", min);
		System.out.printf("\nThe maximum is: %d", max);
	}
}
