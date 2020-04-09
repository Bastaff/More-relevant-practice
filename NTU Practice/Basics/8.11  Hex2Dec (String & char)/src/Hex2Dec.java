import java.util.Scanner;
public class Hex2Dec {
 public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
	 String hex = in.nextLine();
	 int decimal=Integer.parseInt(hex,16);
	 
	 System.out.println(decimal);
 }
}
