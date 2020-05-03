
public class MyTriangleTest {

	public static void main(String[] args) {
		 MyTriangle t1 = new MyTriangle(1,1,  3,5,  6,2);
		 MyTriangle t2 = new MyTriangle(1,2,  2,9,  5,18);
		 System.out.println(t1.getPerimeter());
		 System.out.println(t1.getType());
		 System.out.println(t1.toString());
		 
		 System.out.println();
		 
		 System.out.println(t2.getPerimeter());
		 System.out.println(t2.getType());
		 System.out.println(t2.toString());
		
	}

}
