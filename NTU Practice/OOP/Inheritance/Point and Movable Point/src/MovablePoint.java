import java.util.Arrays;

public class MovablePoint extends Point {
	private float xSpeed;
	private float ySpeed;

	public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public MovablePoint(float xSpeed, float ySpeed) {
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public MovablePoint() {
	}

	public float getXSpeed() {
		return xSpeed;
	}

	public float getYSpeed() {
		return ySpeed;
	}

	public void setXSpeed(float xSpeed) {
		this.xSpeed = xSpeed;
	}

	public void setYSpeed(float ySpeed) {
		this.ySpeed = ySpeed;
	}

	public void setSpeed(float xSpeed, float ySpeed) {
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public float[] getSpeed() {
		float[] speed = {getXSpeed(), getYSpeed()};
		return speed;
	}
	@Override
	public String toString() {
		return super.toString() + ", speed=(" + Arrays.toString(getSpeed()) + ")";
	}

	public MovablePoint move() {
		float x = super.getX();
		float y = super.getY();

		x += this.xSpeed;
		y += this.ySpeed;
		return this;
	}

}
