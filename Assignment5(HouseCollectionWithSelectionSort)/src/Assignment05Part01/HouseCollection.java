package Assignment05Part01;

public class HouseCollection {
	private String name;
	private int numItems;
	private House[] items;

	public HouseCollection(String name, int maxNum) {
		this.name = name;
		items = new House[maxNum];
		numItems = 0;
	}

	// adds House object into the array
	public void add(House house) {
		items[numItems++] = house;
	}

	// instantiate a House instance and add into items array
	public void add(int price, String color, int size) { // Part B add #2 method, supposed to take the three parameters
		// from the House constructor? If that's the case, I would need to add a
		// constructor method in House?(Don't see it there)
		items[numItems++] = new House(price, color, size);
	}

	// checks the amount of non-null House objects inside the array
	public int size() {
		int size = 0;
		for (int i = 0; i < items.length; i++) {
			if (items[i] != null) {
				size++;
			}
		}
		return size;
	}

	public String toString() {
		String output = "";
		System.out.println("Price: \t\t\t\t" + "Color: \t\t\t\t" + "Size: \t\t");
		System.out.println("--------------------------------------------------------------------------------");
		for (int i = 0; i < numItems; i++) {
			output += "$" + items[i].getPrice() + "\t\t\t\t" + items[i].getColor() + "\t\t\t" + items[i].getSize()
					+ "\n";
		}
		return output;
	}

	// finds the total sum of the house prices
	public int total() {
		int total = 0;
		for (int i = 0; i < numItems; i++) {
			total += items[i].getPrice();
		}
		return total;
	}

	// returns the house details of the most expensive house
	public House greatest() {
		int a = items[0].getPrice();
		House house = items[0];
		for (int i = 0; i < numItems; i++) {
			if (items[i].getPrice() > a) {
				a = items[i].getPrice();
				house = items[i];
			}
		}
		return house;
	}

	// returns the amount of objects that fits within the House object color
	// instance variable
	public int countCategory(String color) {
		int a = 0;
		for (int i = 0; i < numItems; i++) {
			if (items[i].getColor().equalsIgnoreCase(color)) {
				a++;
			}
		}
		return a;
	}

	// compares with this instance of object with a passed House object
	public boolean contains(House house) {
		boolean a = false;
		for (int i = 0; i < numItems; i++) {
			if (items[i].toString().equalsIgnoreCase(house.toString())) {
				a = true;
			} else {
				a = false;
			}
		}
		return a;
	}

	// returns the amount of times the parameter house has appeared in the items
	// array
	public int countOccurances(House house) {
		int a = 0;
		for (int i = 0; i < numItems; i++) {
			if (items[i].toString().equalsIgnoreCase(house.toString())) {
				a++;
			}
		}
		return a;
	}

	// sort the House objects by price
	public void selectionSort() {
		for ( int j=0; j < numItems-1; j++ ){
		int min = j;
		for ( int k=j+1; k < numItems; k++ )
		if ( items[k].compareTo( items[min] ) < 0 ) min = k;
		House temp = items[j];
		items[j] = items[min];
		items[min] = temp;
		}
	}
	
}


