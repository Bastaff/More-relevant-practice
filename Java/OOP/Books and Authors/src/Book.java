import java.util.Arrays;

public class Book {
private String name;
private Author authors[];
private double price;
private int qty;


	public Book(String name, Author authors[], double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
	}
	
	public Book(String name, Author authors[], double price, int qty) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}
	
	public String getName() {
		return name;
	}
	
	public Author[] getAuthors() {
		return authors;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}

	public String toString() {
		return "Book Name - " + name + " Author - " +
	Arrays.toString(authors) + " Book Price - " + price +
	"Quantity - " + qty + "]";
	}
	
	public String getAuthorNames() {
		   return Arrays.toString(authors);  // cannot use author.name as name is private in Author class
		}
	
}
