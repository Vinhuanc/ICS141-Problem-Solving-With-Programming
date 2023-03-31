/*
 * Date: 3/1/23
 * Description: Lab 8
 * Due Date: 3/1/23
 * Course: ICS 141-02
 * Name: Cindy Chen
 */
package inheritance;

public class Snack {
	private double price;
	private String brand;
	private double weight;

	public Snack(double price, String brand, double weight) {
		this.price = price;
		this.brand = brand;
		this.weight = weight;
	}

	public Snack() {

	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "The snack price is: $" + price + ", brand is: " + brand + ", the weight is: "+ weight + ".";
	}

}
