
public abstract class Shape {
protected String color;
protected Boolean filled;



public Shape() {
	color = "RED";
	filled = true;
}

public Shape(String color, boolean filled) {
	this.color = color;
	this.filled = filled;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public boolean isFilled() {
	return filled;
}

public void setFilled(boolean filled) {
	this.filled = filled;
}

abstract public double getArea();
abstract public double getPerimeter();

public String toString() {
	return "Shape = " + "[color = " + color + ", filled = " + filled + "]";
}


}
