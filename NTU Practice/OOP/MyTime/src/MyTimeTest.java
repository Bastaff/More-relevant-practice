
public class MyTimeTest {
	public static void main(String[]args) {
		
		MyTime time = new MyTime(3,4,1);
		
		time.toString();
		time.setTime(12, 59, 59);
		
		System.out.println(time.toString());
		time.nextSecond();
		System.out.println(time.toString());
		
	}
}
