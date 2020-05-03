/*Write a program that prompts user for a positive integer. 
 * The program shall read the input as int; and print the "reverse" of the input integer. 
 * For examples,
Enter a positive integer: 12345
The reverse is: 54321
*/

import java.util.Scanner;

public class ReverseInt {
 public static void main (String[] args){

	 Scanner s = new Scanner(System.in);
	 int inNumber = s.nextInt();
	 int inDigit;
	 
	 while (inNumber > 0) {
		 inDigit = inNumber % 10;
		 
		 System.out.print(inDigit);
		 
		 inNumber /= 10;
		 
	 }
	 
 }
}
