/*
 * Date: 2/14/2023
 * Description: Assignment 3, an application that can be used in retail stores 
 * Due Date: 3/1/2023
 * Course: ICS 141-02
 * Name: Cindy Chen
 */
package retail;

import java.util.Objects;

public class RetailItem {
	private String description;
	private int unitsOnHand;
	private double price;

	public RetailItem(String description, double price) {
		this.description = description;
		this.price = price;
		this.unitsOnHand = 0;
	}

	public String getDescription() {
		return description;
	}

	public int getUnitsOnHand() {
		return unitsOnHand;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return description + "\t" + unitsOnHand + "\t" + price ;
	}

	public int addUnits(int unit) {
		unitsOnHand += unit;
		return unitsOnHand;
	}

	public boolean getUnits(int unit) {
		if (unit < unitsOnHand) {
			unitsOnHand -= unit;
			return true;
		} else {
			return false;
		}
	}

	public void changePrice(double p) {
		double x = -0.0;
		double y = price + p;
		if (p < x && y != 0 && y > 0) {
			price += p;
		} else if (y <= 0) {
			System.err.print(
					"The price passed in will cause the new price to be less or equal to zero. Price will not be changed. \n");
		} else if (p > 0) {
			price += p;
		}
	}

	public void equals(RetailItem item) {
		if (this.toString().equals(item.toString())) {
			System.out.print("Both of these items are equal." + "\n");
		} else {
			System.out.print("These items are different." + "\n");
		}
	}

	public double totalValue() {
		return unitsOnHand * price;
	}

}
