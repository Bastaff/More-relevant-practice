
public class MovableTest {

	public static void main(String[] args) {

		Point point = new Point(1.1f,2.2f);
		System.out.println(point.toString());
		point.setXY(3.3f, 4.4f);
		System.out.println(point.toString());
		
		MovablePoint mpoint = new MovablePoint(5.5f,6.6f,7.7f,8.8f);
		System.out.println(mpoint.toString());
		
		MovablePoint mmpoint = new MovablePoint(mpoint.getX(),mpoint.getY(),9.0f,10.1f);
		System.out.println(mmpoint.toString());
	}

}
