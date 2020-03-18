
public class Cylinder {
	private Circle base;
	private double height;

	public Cylinder() {
		base = new Circle();
		height = 1.0;
	}

	public Cylinder(double height) {
		base = new Circle();
		this.height = height;
	}

	public Cylinder(double radius, double height) {
		base = new Circle(radius);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getVolume() {
		return Math.PI * Math.pow(base.getRadius(), 2) * height;
	}

	public double getArea() {
		return 2 * Math.PI * base.getRadius() * height + 2 * base.getArea();
	}

	public double getRadius() {
		return base.getRadius();
	}

	@Override
	public String toString() {
		return "Cylinder:" + "DEFAULT VALUES: |RADIUS = " + base.getRadius()
				+ "| HEIGHT = " + height;
	}

}
