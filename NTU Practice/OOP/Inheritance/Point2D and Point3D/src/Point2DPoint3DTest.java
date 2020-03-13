
public class Point2DPoint3DTest {

	public static void main(String[] args) {
		Point2D point = new Point2D();
		System.out.println(point.toString());

		point.setXY(4.6f, 2.9f);
		System.out.println(point.toString());

		System.out.println("Creating a Point3D");
		Point3D p3d = new Point3D();
		System.out.println(p3d.toString());

		p3d.setXYZ(5.8f, 6.6f, 8.8f);
		System.out.println(p3d.toString());

		System.out.println(point.toString());
	}

}
