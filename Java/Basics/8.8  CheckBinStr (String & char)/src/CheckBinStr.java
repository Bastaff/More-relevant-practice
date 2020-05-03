import java.util.Scanner;
public class CheckBinStr {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input = in.nextLine();
		int inputLength = input.length();
		boolean isValid;

		isValid = true;
		for(int count = 0; count <= inputLength - 1; count++) {
			if(! (input.charAt(count) == '0' || input.charAt(count) == '1')) {
			isValid = false;
			break;
		}
		}
		if(isValid) {
			System.out.println("This is binary");
		} else {
			System.out.println("This is NOT binary");
		}
	}
}
