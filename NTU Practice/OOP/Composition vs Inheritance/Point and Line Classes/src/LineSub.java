// re-design the Line class (called LineSub) as a subclass of class Point

public class LineSub extends Point {
	Point end;

	public LineSub(int beginX, int beginY, int endX, int endY) {
		super(beginX, beginY);
		this.end = new Point(endX, endY);
	}

	public Point getBegin() {
		return this;
	}

	public Point getEnd() {
		return end;
	}

	public void setBegin(Point begin) {
		setX(begin.getX());
		setY(begin.getY());
	}

	public void setEnd(Point end) {
		this.end = end;
	}

	public int getBeginX() {
		return getX();
	}

	public int getBeginY() {
		return getY();
	}

	public int getEndX() {
		return end.getX();
	}

	public int getEndY() {
		return end.getY();
	}

	public void setBeginX(int beginX) {
		setX(beginX);
	}

	public void setBeginY(int beginY) {
		setY(beginY);
	}

	public void setBeginXY(int beginX, int beginY) {
		setXY(beginX, beginY);
	}

	public void setEndX(int endX) {
		end.setX(endX);
	}

	public void setEndY(int endY) {
		end.setY(endY);
	}

	public void setEndXY(int endX, int endY) {
		end.setXY(endX, endY);
	}

	public int getLength() {
		return (int) Math.sqrt(getX() * end.getX() + getY() * end.getY());
	}

	public double getGradient() {
		return Math.atan2(getX(), getY());
	}

	@Override
	public String toString() {
		return "Begin = " + getBegin() + "End = " + getEnd() + " Begin X,Y = "
				+ getBeginX() + "," + getBeginY() + " End X,Y = " + getEndX()
				+ "," + getEndY();
	}

}
