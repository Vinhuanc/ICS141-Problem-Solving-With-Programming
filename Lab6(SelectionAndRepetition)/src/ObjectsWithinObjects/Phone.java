package ObjectsWithinObjects;

public class Phone {
	private String color;
	private String brand;
	private int storage;
	
	
	public Phone(String color, String brand, int storage) {
		this.color = color;
		this.brand = brand;
		this.storage = storage;
	}

	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public int getStorage() {
		return storage;
	}
	
	public void setStorage(int storage) {
		this.storage = storage;
	}
	
	@Override
	public String toString() {
		return "Phone color: " + color + ", brand: " + brand + ", storage: " + storage;
	}
	
	public String batteryMessage() {
		return "Battery is 80%";
	}
	
	public int marketPrice() {
		return 1000;
	}
	
	public String sendMessage() {
		return "Hello World";
	}
	
	
	
	
	

}
