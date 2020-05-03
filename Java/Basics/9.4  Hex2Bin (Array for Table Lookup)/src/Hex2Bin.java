import java.util.Scanner;
public class Hex2Bin {
	public static void main(String[]args0) {
		Scanner in = new Scanner(System.in);
		String hex = in.nextLine();
		
		int hexlength = hex.length();
		int hexint = Integer.parseInt(hex,16);
		int[] turn = new int[hexint];
		
		System.out.println(hexint);
		
		for (int count = 0; count < hexlength; count++) {
			System.out.println(turn[count]);
		}
	}
}
