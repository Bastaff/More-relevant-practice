
public class CircleandCylinderTest {
	public static void main(String[] args) {

		Cylinder c1 = new Cylinder();
		System.out.println(c1.toString());

		Cylinder c2 = new Cylinder(11.0);
		System.out.println(c2.toString());

		Cylinder c3 = new Cylinder(2.0, 22.0);
		System.out.println(c3.toString());
		
		
		//Cylinder 1
		System.out.println("Cylinder:" + " radius=" + c1.getRadius()
		+ " height=" + c1.getHeight() + " base area=" + c1.getArea()
		+ " volume=" + c1.getVolume());
		
		//Cylinder 2
		System.out.println("Cylinder:" + " radius=" + c2.getRadius()
		+ " height=" + c2.getHeight() + " base area=" + c2.getArea()
		+ " volume=" + c2.getVolume());
		
		//Cylinder 3
		System.out.println("Cylinder:" + " radius=" + c3.getRadius()
		+ " height=" + c3.getHeight() + " base area=" + c3.getArea()
		+ " volume=" + c3.getVolume());

		System.out.println(c1.getArea());
		System.out.println(c2.getArea());
		System.out.println(c1.toString());
		System.out.println(c3.toString());
	}
}
