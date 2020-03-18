
public class LineTest {

	public static void main(String[] args) {
		 Line l1 = new Line(0, 0, 3, 4);
	      System.out.println(l1);
	   
	      Point p1 = new Point(7,9);
	      Point p2 = new Point(5,4);
	      Line l2 = new Line(p1, p2);
	      System.out.println(l2);

	}

}
