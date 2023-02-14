package retail;

public class RetailStoreDriver {

	public static void main(String[] args) {
		RetailItem skirt = new RetailItem("White skirt", 25.00);
		RetailItem boots = new RetailItem("Black Boots", 40.00);

		System.out.print(skirt.toString());
		System.out.print(boots.toString());

		System.out.print("The Description is: "+ skirt.getDescription() + "\n");
		System.out.print("The units on hand is: " + skirt.getUnitsOnHand() + "\n");
		System.out.print("The price is: " + skirt.getPrice() + "\n");
		System.out.print(skirt.toString() + "\n");

		skirt.addUnits(100);
		System.out.print(skirt.toString());
		skirt.getUnits(50);
		System.out.print(skirt.toString());

		skirt.changePrice(-10.0);
		System.out.print(skirt.toString());
		
		skirt.changePrice(10.0);
		System.out.print(skirt.toString());
		
		skirt.changePrice(-225.0);
		System.out.print(skirt.toString());
		
		System.out.print(skirt.equals(boots) + "\n");
		
		System.out.print(skirt.totalValue() + "\n");
		
		System.out.print("Program done by Cindy Chen.");
		
		// need the CashRegister & Part 2 & submit to D2L
		// unsure when
	}

}
