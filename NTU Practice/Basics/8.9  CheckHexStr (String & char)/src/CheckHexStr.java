import java.util.Scanner;
public class CheckHexStr {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		String input = in.nextLine();
		int length = input.length();
		boolean isValid;
		
		isValid = true;
		for(int count = 0; count < length; count++) {
			System.out.println(input.charAt(count));
			if (!((input.charAt(count) >= '0' && input.charAt(count) <= '9')
				      || (input.charAt(count) >= 'A' && input.charAt(count) <= 'F')
				      || (input.charAt(count) >= 'a' && input.charAt(count) <= 'f'))) {
				isValid = false;
				break;
			}
		}
		if (isValid) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
