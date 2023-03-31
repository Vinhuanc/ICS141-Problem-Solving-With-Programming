package retail;

public class RetailStoreDriver {

	public static void main(String[] args) {
		RetailItem skirt = new RetailItem("White skirt", 25.00);
		RetailItem boot = new RetailItem("Black Boot", 40.00);
		
		// Testing RetailItem class methods as required by part 1
		System.out.println(skirt.toString());
		System.out.println(boot.toString());

		System.out.println("The Description is: " + skirt.getDescription());
		System.out.println("The units on hand is: " + skirt.getUnitsOnHand());
		System.out.println("The price is: " + skirt.getPrice());
		System.out.println(skirt.toString());

		skirt.addUnits(100);
		System.out.println(skirt.toString());
		skirt.getUnits(50);
		System.out.println(skirt.toString());

		skirt.changePrice(-10.0);
		System.out.println(skirt.toString());

		skirt.changePrice(10.0);
		System.out.println(skirt.toString());

		skirt.changePrice(-225.0);
		System.out.println(skirt.toString());

		skirt.equals(boot);
		System.out.print(skirt.totalValue());
		// end of testing RetailItem methods

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		// Testing requirements from part 2
		skirt.addUnits(1000);
		boot.addUnits(2000);
		
		// testing the RetailItem class methods on both items
		System.out.println(skirt.getDescription());
		System.out.println(skirt.getUnitsOnHand());
		System.out.println(skirt.getPrice());
		System.out.println(skirt.toString());
		System.out.println(skirt.getUnits(10));
		skirt.changePrice(30);
		System.out.println(skirt.toString());
		skirt.equals(boot);
		System.out.println("$" + skirt.totalValue());
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println(boot.getDescription());
		System.out.println(boot.getUnitsOnHand());
		System.out.println(boot.getPrice());
		System.out.println(boot.toString());
		System.out.println(boot.getUnits(10));
		boot.changePrice(30);
		System.out.println(boot.toString());
		boot.equals(skirt);
		System.out.println("$" + boot.totalValue());

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		// creating two cash registers
		CashRegister a = new CashRegister("Andy", skirt, 1);
		CashRegister b = new CashRegister("Justine", boot, 5);
		
		// testing the RetailItem class methods on CashRegister items
		System.out.println(a.getClerk());
		System.out.println(a.getItem());
		System.out.println(a.getQuantity());
		System.out.println(a.getSubTotal());
		System.out.println(a.getItemAvailabilty()); // unsure
	    a.modifyQuantity(2);
		System.out.println(a.getTax(0.03));
		System.out.println(a.getTotal(0.03)); 
		System.out.println(a.toString());

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println(b.getClerk());
		System.out.println(b.getItem());
		System.out.println(b.getQuantity());
		System.out.println(b.getSubTotal());
		System.out.println(b.getItemAvailabilty()); // unsure
	    b.modifyQuantity(2);
		System.out.println(b.getTax(0.03));
		System.out.println(b.getTotal(0.03)); 
		System.out.println(b.toString());

		System.out.println();
		System.out.print("Program done by Cindy Chen.");

	}

}
