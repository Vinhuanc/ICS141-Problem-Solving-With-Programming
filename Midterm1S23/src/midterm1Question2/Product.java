/*
 * Date: 2/8/23
 * Description: Midterm1Question2
 * Due Date: 2/8/23
 * Course: ICS 141-02
 * Name: Cindy Chen
 */
// package is named midterm1Question2, class is named Product
package midterm1Question2;

// responds to Question #2
public class Product {
	// instance variables
	// responds to Question #3
	private int prodID;
	private String prodName;
	private int prodPrice;
	
	// parameterized constructor that takes in 3 arguments to instantiating new object
	// responds to Question #4
	public Product(int prodID, String prodName, int prodPrice) {
		this.prodID = prodID;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
	}

	// to string method to introduce product's details
	// responds to Question #5
	@Override
	public String toString() {
		return "The product's ID is: " + this.prodID + ", the product's name is: " + this.prodName + ", the product's price is: $" + this.prodPrice;
	}
	
	
	
	
	
	
	
	
}
