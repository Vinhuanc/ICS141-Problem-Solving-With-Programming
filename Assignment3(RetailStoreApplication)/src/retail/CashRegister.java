package retail;

public class CashRegister {
	private String clerk;
	private RetailItem item;
	private int quantity;
	
	public CashRegister(String clerk, RetailItem item, int quantity) {
		int onHand = item.getUnitsOnHand();
		this.clerk = clerk;
		this.item = item;
		this.quantity = quantity;
		onHand -= quantity;
	}

	public String getClerk() {
		return clerk;
	}

	public RetailItem getItem() {
		return item;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public double getSubTotal() {
		return quantity * item.getPrice();
	}

	public int getItemAvailabilty() { 
		return item.getUnitsOnHand();
				
	}
	
	public void modifyQuantity(int x) {
		if (x>0) {
			int onHand = item.getUnitsOnHand();
			quantity += x;
			onHand -= x;
		} else {
			int onHand = item.getUnitsOnHand();
			quantity -= x;
			onHand += x;
		}
	}
	
	public double getTax(double tax) {
		return item.getPrice() * quantity * tax;
	}
	
	public double getTotal(double tax) {
		return (item.getPrice() * quantity) + getTax(tax);
	}
	
	public String toString() {
		return "The cash register's clerk name is: " + clerk + ". Details of the item is: " + item.getDescription() + " . Quantity to be sold is: " + quantity
				+ ". The subtotal is: $" + getSubTotal();				
	}
	
	
	
}

