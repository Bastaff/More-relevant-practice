
public class Circle extends Shape {
	protected double radius;

	public Circle() {
		radius = 1.0;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		super.color = color;
		super.filled = filled;
	}
	
	public double getRadius() {
		return radius;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	@Override
	public String toString() {
		return "Circle [" + super.toString() + "radius = " + radius + "]";
	}
	
}
