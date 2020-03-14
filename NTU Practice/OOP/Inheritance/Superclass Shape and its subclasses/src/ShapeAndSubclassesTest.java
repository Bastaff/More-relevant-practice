
public class ShapeAndSubclassesTest {

	public static void main(String[] args) {
		// Creating green shape,true to test 
		Shape red = new Shape("Green", true);
		System.out.println(red.toString());
		
		// Changing shape color to blue,false
		red.setColor("blue"); red.setFilled(false);
		System.out.println(red.toString() + " - Changed Shape");
		
		// Creating a circle 4.4 that gets color and fill from Shape(red)
		Circle circ = new Circle(4.4, red.getColor(), red.isFilled());
		System.out.println(circ.toString());
		
		// Creating a rectangle w=7.0, h=4.0, color and fill taken from Shape(red)
		Rectangle rec = new Rectangle(7.0, 4.0, red.getColor(),
				red.isFilled());
		System.out.println(rec.toString());
		
		
	}

}
