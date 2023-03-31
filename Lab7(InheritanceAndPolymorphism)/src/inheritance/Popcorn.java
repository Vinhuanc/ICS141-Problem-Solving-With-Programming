package inheritance;

public class Popcorn extends Snack {
	private String type;
	
	public Popcorn(double price,  String brand, double weight, String type) {
		super(price, brand, weight);
		this.type = type;
	}

	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return super.toString() + " The popcorn type is: " + type + ".";
	}
	
	
}
