import java.util.Scanner;
public class CaesarCode {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String word;
		int lenght;
		word = in.next().toUpperCase();
		lenght = word.length();
		
		char a = 'A'; char b = 'B'; char c = 'C';char d = 'D'; char e = 'E'; char f = 'F';
		char g = 'G'; char h = 'H'; char i = 'I';char j = 'J'; char k = 'K'; char l = 'L';
		char m = 'M'; char n = 'N'; char o = 'O';char p = 'P'; char q = 'Q'; char r = 'R';
		char s = 'S'; char t = 'T'; char u = 'U';char v = 'V'; char w = 'W'; char x = 'X';
		char y = 'Y'; char z = 'Z';
		

		for (int count = 0; count < lenght; count++) {
			if (word.charAt(count) == 'A') {
				a = (char) ('A' + 3);
				System.out.printf("%s", a);
			} else if (word.charAt(count) == 'B') {
				b = (char) ('B' + 3);
				System.out.printf("%s", b);
			} else if (word.charAt(count) == 'C') {
				c = (char) ('C' + 3);
				System.out.printf("%s", c);
			} else if (word.charAt(count) == 'D') {
				d = (char) ('D' + 3);
				System.out.printf("%s", d);
			} else if (word.charAt(count) == 'E') {
				e = (char) ('E' + 3);
				System.out.printf("%s", e);
			} else if (word.charAt(count) == 'F') {
				f = (char) ('F' + 3);
				System.out.printf("%s", f);
			} else if (word.charAt(count) == 'G') {
				g = (char) ('G' + 3);
				System.out.printf("%s", g);
			} else if (word.charAt(count) == 'H') {
				h = (char) ('H' + 3);
				System.out.printf("%s", h);
			} else if (word.charAt(count) == 'I') {
				i = (char) ('I' + 3);
				System.out.printf("%s", i);
			} else if (word.charAt(count) == 'J') {
				j = (char) ('J' + 3);
				System.out.printf("%s", j);
			} else if (word.charAt(count) == 'K') {
				k = (char) ('K' + 3);
				System.out.printf("%s", k);
			} else if (word.charAt(count) == 'L') {
				l = (char) ('L' + 3);
				System.out.printf("%s", l);
			} else if (word.charAt(count) == 'M') {
				m = (char) ('M' + 3);
				System.out.printf("%s", m);
			} else if (word.charAt(count) == 'N') {
				n = (char) ('N' + 3);
				System.out.printf("%s", n);
			} else if (word.charAt(count) == 'O') {
				o = (char) ('O' + 3);
				System.out.printf("%s", o);
			} else if (word.charAt(count) == 'P') {
				p = (char) ('P' + 3);
				System.out.printf("%s", p);
			} else if (word.charAt(count) == 'Q') {
				q = (char) ('Q' + 3);
				System.out.printf("%s", q);
			} else if (word.charAt(count) == 'R') {
				r = (char) ('R' + 3);
				System.out.printf("%s", r);
			} else if (word.charAt(count) == 'S') {
				s = (char) ('S' + 3);
				System.out.printf("%s", s);
			} else if (word.charAt(count) == 'T') {
				t = (char) ('T' + 3);
				System.out.printf("%s", t);
			} else if (word.charAt(count) == 'U') {
				u = (char) ('U' + 3);
				System.out.printf("%s", u);
			} else if (word.charAt(count) == 'V') {
				v = (char) ('V' + 3);
				System.out.printf("%s", v);
			} else if (word.charAt(count) == 'W') {
				w = (char) ('W' + 3);
				System.out.printf("%s", w);
			} else if (word.charAt(count) == 'X') {
				x = (char) ('X' - 23);
				System.out.printf("%s", x);
			} else if (word.charAt(count) == 'Y') {
				y = (char) ('Y' - 23);
				System.out.printf("%s", y);
			} else if (word.charAt(count) == 'Z') {
				z = (char) ('Z' - 23);
				System.out.printf("%s", z);
			}
		}
	}
}
