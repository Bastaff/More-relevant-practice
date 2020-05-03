//Enter a String: abcdef
//The reverse of the String "abcdef" is "fedcba".
import java.util.Scanner;
public class ReverseString {
	public static void main(String[] args) {
		// Define variables
		String inStr; // input String
		int inStrLen; // length of the input String
		Scanner in = new Scanner(System.in);

		// Prompt and read input as "String"
		System.out.print("Enter a String: ");
		inStr = in.next(); // use next() to read a String
		inStrLen = inStr.length();

		// Use inStr.charAt(index) in a loop to extract each character
		// The String's index begins at 0 from the left.
		// Process the String from the right
		System.out.print("The reverse of " + inStr + " is ");
		for (int charIdx = inStrLen - 1; charIdx >= 0; --charIdx) {
			System.out.print(inStr.charAt(charIdx));

		}
	}
}
