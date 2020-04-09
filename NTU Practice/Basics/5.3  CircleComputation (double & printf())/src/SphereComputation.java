
import java.util.Scanner;

public class SphereComputation {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float radius;
		radius = s.nextFloat();
		double surfaceArea;
		double volume;
		double rad = radius;

		
		surfaceArea = (4 * (Math.pow(rad, rad)));
		volume = (4/3) * (Math.pow(rad, rad)*rad);

	
		
		System.out.printf("Surface Area is: %.3f%n", surfaceArea);
		System.out.printf("Volume is: %.2f%n", volume);
	}

}
