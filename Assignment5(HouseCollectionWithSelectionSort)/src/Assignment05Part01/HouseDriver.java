package Assignment05Part01;

public class HouseDriver {

	public static void main(String[] args) {
		// create an instance of house collection 
		HouseCollection hc = new HouseCollection("Minneapolis", 10);
		// add 5 items into the house collection
		hc.add(230000, "White and Black", 1200);
		hc.add(400, "Blue and Pink", 3000);
		hc.add(50000, "Pink and White", 500);
		hc.add(500000, "Black and Brown", 3120);
		hc.add(300000, "Red and Green",	2100);
		
		// testing all methods from 3 - 9
		System.out.println("The number of House obejcts in the collection is: " + hc.size());
		System.out.println(hc.toString());
		System.out.println("The total price of the collection is: $" + hc.total());
		System.out.println("The object with the maximum price is: " + hc.greatest());
		System.out.println("The amount of houses that fills this category is: " + hc.countCategory("Blue and Pink"));
		
		House a = new House(10000, "Red", 1020);
		System.out.println("Does this house belong in the house collection? " + hc.contains(a));
		System.out.println("The amount of copies the house appears in house collection? " + hc.countOccurances(a));

		hc.add(870000, "White and Black", 1200);
		hc.add(4700, "Blue and Pink", 3000);
		hc.add(57000, "Pink and White", 500);
		hc.add(543600, "Black and Brown", 3120);
		hc.add(398700, "Red and Green",	2100);
		
		hc.selectionSort();
		System.out.println(hc.toString());
		System.out.println("Program done by Cindy Chen");

		
	}

}
