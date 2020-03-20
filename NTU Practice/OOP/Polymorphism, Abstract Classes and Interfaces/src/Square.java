
public class Square extends Rectangle {

	Square(){}
	
	Square(double side){
		super(side,side);
	}
	
	Square(double side, String color, boolean filled){
		super(side,side);
		setColor(color);
		setFilled(filled);
	}
	
	public double getSide() {
		return getLength();
	}
	
	public void setSide(double side) {
		setLength(side);
	}
	
	public void setWidth(double side) {
		setWidth(side);
	}
	
	public void setLength(double side) {
		setLength(side);
	}
	
	
	
}
