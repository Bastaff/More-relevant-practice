
public class Test {

	public static void main(String[] args) {
		Author[] authors = new Author[2];
		authors[0] = new Author("Dan", "dan@abv.bg", 'm');
		authors[1] = new Author("Jan", "jan@abv.bg", 'f');
		
		
		Book bk = new Book("Beginner's guide to beginners",
				authors, 43.90, 114);
		
		System.out.println(bk);
		
		for (Author author : authors)
		System.out.println(author);
		
	}

}
