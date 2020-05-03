
public class CustomerAndInvoiceMain {

	public static void main(String[] args) {

		Customer jane = new Customer(1, "Jane", 20);
		Customer bob = new Customer(2, "Bob", 10);
		
		System.out.println(jane.getID());
		System.out.println(jane.getName());
		System.out.println(jane.getDiscount());
		
		jane.setDiscount(30);
		
		System.out.println(jane.getDiscount());
		System.out.println("Jane toString " + jane.toString());

		Invoice invoice = new Invoice(2, jane, 543);
		
		System.out.println(invoice.getID());
		System.out.println(invoice.getCustomer());
		invoice.setCustomer(bob);
		System.out.println("Changed customer to " + invoice.getCustomer());
		System.out.println(invoice.getAmount());
		invoice.setAmount(444);
		System.out.println("Set Amount " + invoice.getAmount());
		System.out.println(invoice.getCustomerName());
		System.out.println(invoice.getAmountAfterDiscount());
	}

}
