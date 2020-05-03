
public class Rectangle extends Shape {
	private double width;
	private double length;

	public Rectangle() {
		this.width = 1.0;
		this.length = 1.0;
	}

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public Rectangle(double width, double length, String color,
			boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getArea() {
		return getLength() * getWidth();
	}

	public double getPerimeter() {
		return 2 * getLength() + 2 * getWidth();
	}
	@Override
	public String toString() {
		return "Rectangle[" + super.toString() + ", width = " + getWidth()
				+ ", length = " + getLength() + "]";
	}

}
