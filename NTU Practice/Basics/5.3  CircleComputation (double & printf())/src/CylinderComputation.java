import java.util.Scanner;

public class CylinderComputation {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float radius, height;
		
		
		radius = s.nextFloat();
		height = s.nextFloat();
		
		double baseArea;
		double hei = height;
		double rad = radius;
		double surfaceArea;
		double volume;
		
		baseArea = Math.PI * radius * radius;
		surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
		volume = baseArea * height;

	
		
		System.out.printf("Surface Area is: %.3f%n", surfaceArea);
		System.out.printf("Volume is: %.2f%n", volume);
	}

}

