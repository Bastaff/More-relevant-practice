
public class TestPersonaAndSubClasses {

	public static void main(String[] args) {
		Person john = new Person("John", "20 Terror Lane");
		System.out.println(john.toString());

		System.out.println();
		System.out.println("Testing Student:");

		Student sjohn = new Student(john.getName(), john.getAddress(), 
				"Math",1987, 230.50);
		System.out.println(sjohn.toString());

		System.out.println();
		System.out.println("Testing Staff:");

		Staff johns = new Staff(john.getName(), john.getAddress(),
				"Math School for the Mathematically Gifted", 600.95);
		System.out.println(johns.toString());
	}

}
