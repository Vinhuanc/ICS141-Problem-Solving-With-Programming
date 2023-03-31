package test;
import java.util.Scanner;
import test.Product;
public class Driver {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String response = "y";
		response = response.toUpperCase();
		while(response.equalsIgnoreCase("y")) {
			System.out.println("Enter new product ID: ");
			int newID = userInput.nextInt();
			userInput.nextLine();
			System.out.println("Enter new product name: ");
			String newName = userInput.nextLine();
			System.out.println("Enter new product price: ");
			int newPrice = userInput.nextInt();
			userInput.nextLine();
			while(newPrice <=0) {
				System.err.print("Price cannot be zero or less than zero.");
				System.out.println("Please enter.");
				newPrice=userInput.nextInt();
				userInput.nextLine();
			}
			Product myProduct = new Product(newID, newName, newPrice);
			System.out.println(myProduct.toString());
			System.out.println("Would you like to enter more products? Y/N ");
			response = userInput.nextLine();


		}
		System.out.println("You've choose to end the loop. Goodbye ");



	}

}
