import java.util.Scanner;
public class CircleComputation {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double radius, diameter, circumference, area;
		
		radius = s.nextDouble();
		
		diameter = 2.0 * radius;
		area = Math.PI * radius * radius;
		circumference = 2.0 * Math.PI * radius;
		
		System.out.printf("Diameter is: %.3f%n", diameter);
		System.out.printf("Area is: %.2f%n", area);
		System.out.printf("Circumference is: %.2f%n", circumference);
	}

}
