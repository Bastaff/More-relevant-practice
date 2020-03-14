
public class Square extends Rectangle{
	public Square() {
		
	}
	
	public Square(double side) {
		super(side,side);
	}
	
	public Square(double side, String color, boolean filled) {
		super(side,side,color,filled);
	}
	
	public double getSide() {
		return super.getLength();
	}
	
	public void setSide(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	@Override
	public void setWidth(double side) {
		super.setWidth(side);
	}
	@Override
	public void setLength(double side) {
		super.setLength(side);
	}
	@Override
	public double getArea() {
		return Math.pow(super.getLength(), 2);
	}
	@Override
	public double getPerimeter() {
		return super.getLength()*4;
	}
	
	
	@Override
	public String toString() {
			return "Square[" + super.toString() + ", width = " + getWidth() + ", length = " + getLength() + "]";
		} 
	}
