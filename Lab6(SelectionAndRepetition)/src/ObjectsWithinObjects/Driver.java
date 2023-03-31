package ObjectsWithinObjects;

public class Driver {

	public static void main(String[] args) {
		Phone phone1 = new Phone("red", "Apple", 64);
		System.out.println(phone1.getColor());
		phone1.setColor("black");
		System.out.println(phone1.getBrand());
		phone1.setBrand("Samsung");
		System.out.println(phone1.getStorage());
		phone1.setStorage(100);
		System.out.println(phone1.toString());
		System.out.println(phone1.batteryMessage());
		System.out.println(phone1.marketPrice());
		System.out.println(phone1.sendMessage());
		
		System.out.println("\n\n");
		
		Buyer buyer1 = new Buyer("Emma", 2000, phone1);
		
		System.out.println(buyer1.buyPhone());
		System.out.println(buyer1.colorPreference());
		System.out.println(buyer1.toString());
	}
	
}
