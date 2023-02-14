package midterm1Question2;

import java.util.Scanner;

public class CustomerDriver {

	public static void main(String[] args) {
		// instantiating scanner object
		// responds to Question #6
		Scanner userInput = new Scanner(System.in);
		String response = "y";
		
		while(response.equalsIgnoreCase("y")) {
		// Prompt the user to enter a product ID, a product name and a prodPrice. Line 18-25
		// responds to Question #7a
		System.out.println("Please enter a product ID: ");
		int id = userInput.nextInt();
		userInput.nextLine();
		System.out.println("Please enter a product name: ");
		String name = userInput.nextLine();
		System.out.println("Please enter a product price: ");
		int price = userInput.nextInt();
		userInput.nextLine();
		
		// Using while loop check whether the prodPrice is <= 0
		// responds to Question #7b
		while(price <= 0) {
			// prints a message if price is lower or equal to 0, then ask user to reenter.
			// responds to Question #7c
			System.err.println("Price cannot be equal or less than zero. Reenter.");
			price = userInput.nextInt();
			userInput.nextLine();
		}
		
		// Instantiate a new Product object call myProduct, using the inputs captured from the user
		// responds to Question #8
		Product myProduct = new Product(id, name, price);
		
		// calling the myProduct instance's toString method, displaying product's values
		// responds to Question #9
		System.out.println(myProduct.toString() + "\n");
		
		// ask the user if they want to enter more products
		// responds to Question #10
		System.out.println("Would you like to enter more product? (y/n): ");
		response = userInput.nextLine();
		}
		// print goodbye message
		// responds to Question #11
		System.out.println("You've selected exit. Goodbye!");
		
		// close the scanner obeject
		// responds to Question #12
		userInput.close();
	}

}
