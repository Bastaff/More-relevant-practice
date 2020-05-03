
public class MyTimeTest {
	public static void main(String[]args) {
		
		MyTime time = new MyTime(9,40,59);
		
		System.out.println(time.toString());
		
		time.setTime(7, 59, 59);
		
		System.out.println(time.toString());
		System.out.println(time.nextSecond());
		System.out.println(time.previousSecond());
		
		
	}
}
