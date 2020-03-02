import java.util.Arrays;

public class MyPoint {
private int x;
private int y;


	public MyPoint() {
		
	}
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int[] getXY() {
		int[] xy = new int[2];
		xy[0] = this.x;
		xy[1] = this.y;
		return xy;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "[" + x + "," + y + "]";
	}
	
	public double distance(int x, int y) { // this looks very bad but I had to do it this way
		double distance = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y,2));
		return distance;
	}
	
	public double distance(MyPoint another) {
		double p2pdist = Math.sqrt(Math.pow(another.x - this.x, 2) + Math.pow(another.y - this.y, 2));
		
		return p2pdist;
	}
	public double distance() {
		double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y,2));
		
		
		return distance;
	}
	
	
	

}
