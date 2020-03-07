
public class Polynomial {
private double[] coeffs;

 	public Polynomial(double...coeffs) {
 		this.coeffs = coeffs;
 	}
 	
 	public int getDegree() {
 		return coeffs.length - 1;
 	}
 	
 	
 
 
}
