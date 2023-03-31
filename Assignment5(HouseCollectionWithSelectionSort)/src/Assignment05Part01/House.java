package Assignment05Part01;
/*
 * Date: 3/30/23
 * Description: Assignment 05, implementation of a collection of class Houses. Creates classes and practice collection of objects
 * Due Date: 4/12/23
 * Course: ICS 141-02
 * Name: Cindy Chen
 */
public class House implements Comparable<House>{
	private int price;
	private String color;
	private int size;
	
	
	public House(int price, String color, int size) { // constructor not listed in assignment personally adding it in
		this.price = price;
		this.color = color;
		this.size = size;
	}
	
	// getters and setters
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String toString() {
		return "The price of the house is: " + price + ", the color is: " + color + ", the total square feet is: " + size + ".";
	}
	
	// checks whether a house object compares with the instance
	public boolean equals(House a) {
		if(this.toString().equalsIgnoreCase(a.toString())) {
			return true;
		} else {
			return false;
		}
	}
	
	// compares this instance with a parameter house, returns an int depending on the boolean
	@Override
	public int compareTo(House house) {
		int output = 0;
		if(this.size == house.getSize()) {
			output = 0;
		} else if(this.price > house.getPrice()) {
			output = 1;
		} else {
			output = -1;
		}
		return output;
	}

}
