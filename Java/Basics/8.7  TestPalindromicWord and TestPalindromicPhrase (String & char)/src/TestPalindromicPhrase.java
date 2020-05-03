import java.util.Scanner;
/*
 * A word that reads the same backward as forward is called a palindrome, e.g., "mom", "dad", "racecar", "madam", and "Radar" (case-insensitive). 
 * Write a program called TestPalindromicWord, that prompts user for a word and prints ""xxx" is|is not a palindrome".
 * 
 * A phrase that reads the same backward as forward is also called a palindrome, e.g., "Madam, I'm Adam", "A man, a plan, a canal - Panama!" (ignoring punctuation and capitalization).
 * Modify your program (called TestPalindromicPhrase) to check for palindromic phrase. Use in.nextLine() to read a line of input.
 */
public class TestPalindromicPhrase {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String word = in.nextLine().toLowerCase();
		String noletter = word.replaceAll("[\\W]", "");
		int length = noletter.length();
		String holder = ""; 			// We'll hold the output from charAt(count) here to heve the reversed string

		for (int count = length - 1; count >= 0; count--) {
			holder += noletter.charAt(count); 				// collecting charAt(count) output
		}
		
		if (noletter.equals(holder)) { 				// comparing if two strings match
			System.out.println(word + " is a palindrome");
		} else {
			System.out.println(word + " is not a palindrome");
		}
	}
}
