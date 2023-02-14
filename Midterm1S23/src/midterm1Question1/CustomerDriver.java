package midterm1Question1;

public class CustomerDriver {

	public static void main(String[] args) {
		// Instantiating two new objects, naming it cust1 & cust2, with non-default values
		// responds to Question #3
		Customer cust1 = new Customer(01, "Eli Anderson", "35423 Hoffman Drive, Lakeville MN 55109 USA", "651-111-1111");
		Customer cust2 = new Customer(02, "Kennedy Peterson", "54975 Ashley Drive, Minneatonka MN 55110 USA", "651-222-2222" + "\n");
	
		// calling the toString method on cust1 and cust2, printing the values for each customer
		// responds to Question #4
		System.out.println(cust1.toString());
		System.out.println(cust2.toString());

		// Instantiating a new Customer object using the No-args constructor naming it cust3. Calling the toString method
		// and printing cust3's values
		// responds to Question #5
		Customer cust3 = new Customer();
		System.out.println(cust3.toString() + "\n");

		// Using the setters, update all the initial values for cust3. 
		// responds to Question #6
		cust3.setInt(100);
		cust3.setName("Emma Marie");
		cust3.setAddress("82642 Anderson Road, Mahtomedi MN 55110 USA");
		cust3.setPhone("651-384-3461");
	
		// printing cust3's values after updating information with the setters
		System.out.println("Customer's info after updating initial values: "+ cust3.toString()  + "\n");

		// Using the getters, print cust3 name, address and phone number.
		// responds to Question #7
		System.out.println("Customer 3's name is: " + cust3.getName());
		System.out.println("Customer 3's address is: " + cust3.getAddress());
		System.out.println("Customer 3's phone is: " + cust3.getPhone());
	}

}
