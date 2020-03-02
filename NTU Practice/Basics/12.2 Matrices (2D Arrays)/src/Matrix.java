
public class Matrix {
	public static void main(String[] args) {
		int matrix[][] = {{1, 3, 5, 7}, {3, 4, 5, 6}, {8, 9, 3, 1}};
		double matrixd[][] = {{1, 3, 5, 7}, {3, 4, 5, 6}, {8, 9, 3, 1}};
		int matrix2[][] = {{6, 6, 6, 6}, {6, 6, 6, 6}, {6, 6, 6, 6}};
		double matrixd2[][] = {{6, 6, 6, 6}, {6, 6, 6, 6}, {6, 6, 6, 6}};
		print(matrix);
		print(matrixd);
		System.out.println(haveSameDimension(matrix, matrix2));
		
	}

	public static void print(int[][] m) {
		for (int[] row : m)
			for (int x : row)
				System.out.print(x + " ");
	}

	public static void print(double[][] m) {
		for (double[] row : m)
			for (double x : row)
				System.out.print(x + " ");
	}
	
	public static boolean haveSameDimension(int[][] m, int[][] m2) {
		boolean haveSame = false;
		for(int[] row : m) {
			for (int[] row2 : m2) {
				if(row == row2) {
					haveSame = true;
				}
			}
		}
		return haveSame;
	}
	
	public static boolean haveSameDimension(double[][] m, double[][] m2) {
		boolean haveSame = false;
		for(double[] row : m) {
			for (double[] row2 : m2) {
				if(row == row2) {
					haveSame = true;
				}
			}
		}
		return haveSame;
	}
}
