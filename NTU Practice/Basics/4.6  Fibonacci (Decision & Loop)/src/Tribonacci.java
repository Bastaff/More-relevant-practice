
public class Tribonacci {
	public static void main(String[] args) {
		int n = 3; 
		int tn; 
		int tnMinus1 = 1; 
		int tnMinus2 = 1;
		int tnMinus3 = 1;
		int nMax = 20;
		int sum = tnMinus1 + tnMinus2 + tnMinus3; 
		double average;

		System.out.print("The first " + nMax + " Fibonacci numbers are:");
		System.out.print(tnMinus1 + " ");
		System.out.print(tnMinus2 + " ");
		System.out.println(tnMinus3 + " ");
		
// T(n)=T(n-1)+T(n-2)+T(n-3), T(1)=T(2)=1, and T(3)=2.
		
		while (n <= nMax) { 
			tn = tnMinus1 + tnMinus2 + tnMinus3;
			System.out.print(tn + " "); 
			sum += tn; 
			++n;
			
			tnMinus3 = tnMinus2;
			tnMinus2 = tnMinus1;
			tnMinus1 = tn;
		}
		average = (double) sum / (double) nMax; // Compute and display the average (=sum/nMax).
		System.out.println();
		System.out.println("The average is " + average);
	}

}
