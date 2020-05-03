
public class Complex {
	private double real = 0.0;
	private double imag = 0.0;

	public Complex() {
		

	}

	public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImag() {
		return imag;
	}

	public void setImag(double imag) {
		this.imag = imag;
	}

	public void setValue(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	public String toString() {
		return "(" + real + "+" + imag + "i)";
	}

	public boolean isReal() {
		return (imag == 0);
	}

	public boolean isImaginary() {
		return (real == 0);
	}

	public boolean equals(double real, double imag) {
		return (this.real == real && this.imag == imag);
	}

	public boolean equals(Complex another) {
		double epsilon = 10E-8;
        return (real - another.getReal() <= epsilon && imag - another.getImag() <= epsilon);
	}

	public double magnitude() {
		return Math.sqrt(real * real + imag * imag);
	}

	public double argument() {
		return Math.atan2(imag, real);
	}

	public Complex add(Complex another) {
		return new Complex(real + another.getReal(), imag + another.getImag());
	}

	public Complex subtract(Complex another) {
		return new Complex(real - another.getReal(), imag - another.getImag());
	}

	public Complex multiply(Complex another) {
		real = real * another.getReal() - imag * another.getImag();
		imag = real * another.getImag() + imag * another.getReal();
		return this;
	}

	public Complex divide(Complex another) {
		Complex tmp = multiply(another.conjugate());
		double delimiter = another.getReal() * another.getReal()
				+ another.getImag() * another.getImag();
		if (delimiter != 0) {
			real = tmp.getReal() / delimiter;
			imag = tmp.getImag() / delimiter;
		}
		return this;
	}

	public Complex conjugate() {
		return new Complex(real, -imag);
	}

}
