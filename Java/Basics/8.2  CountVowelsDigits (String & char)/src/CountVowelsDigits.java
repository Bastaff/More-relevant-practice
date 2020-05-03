import java.util.Scanner;
public class CountVowelsDigits {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String: ");
		char a = 'a';
		char e = 'e';
		char i = 'i';
		char o = 'o';
		char u = 'u';
		String word = in.next().toLowerCase();
		int strLenght = word.length();
		int vowels = 0;
		int digits = 0;

		for (int count = strLenght - 1; count >= 0; --count) {
			if (word.charAt(count) == a || word.charAt(count) == e || word.charAt(count) 
				== i || word.charAt(count) == o || word.charAt(count) == u) {
				vowels++;
			}
			if(Character.isDigit(word.charAt(count))) {
				digits++;
			}
		}
		double vowelspr = (((double)vowels / (double)strLenght) * 100);
		double digitspr = (((double)digits / (double)strLenght) * 100);
		System.out.printf("Number of vowels:   %d (%.2f %%) \n", vowels, vowelspr);
		System.out.printf("Number of digits:   %d (%.2f %%) \n", digits, digitspr);
	}
}
