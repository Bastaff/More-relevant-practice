import java.util.Arrays;

public class Point3D extends Point2D {
	private float z;

	public Point3D(float x, float y, float z) {
		super(x, y);
		this.z = z;
	}

	public Point3D() {
		super();
		this.z = 0.0f;
	}

	public float getZ() {
		return this.z;
	}

	public void setZ(float z) {
		this.z = z;
	}

	public void setXYZ(float x, float y, float z) {
		super.setX(x);
		super.setY(y);
		this.z = z;
	}

	public float[] getXYZ() {
		float[] xyz = {super.getX(), super.getY(), z};
		return xyz;
	}

	@Override
	public String toString() {
		return Arrays.toString(getXYZ());
	}

}
