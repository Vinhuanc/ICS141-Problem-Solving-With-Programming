/*
 * Date: 
 * Description: 
 * Due Date: 
 * Course: ICS 141-02
 * Name: Cindy Chen, Ibrahim, Blake
 */
package computers;

public class Computer {
	String OS;
	int ram;
	double price;
	
	public Computer(String oS, int ram, double price) {
		OS = oS;
		this.ram = ram;
		this.price = price;
	}

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "The Computer OS is: " + OS + ", Ram is: " + ram + ", price is: $" + price;
	}
	
	// one method of type string
	public String getPriceWithQuantity(int quantity) {
		String msg = "The total price of the computer with the quantity of: " + quantity + " is: $" + (quantity * price);
		return msg;
	}

	// one method of type void
	public void sendMsg() {
		System.out.println("Please buy me!");
	}
	
	// one method of type int
	public int addRam(int ram) {
		int newRam = this.ram + ram;
		//System.out.println("The new ram is: " + newRam);
		return newRam;
	}
	
	// one static method
	public static void describe() {
		System.out.println("Hello World");
	}


	
	
	
	
	
	
	
	
	
	
	
}
