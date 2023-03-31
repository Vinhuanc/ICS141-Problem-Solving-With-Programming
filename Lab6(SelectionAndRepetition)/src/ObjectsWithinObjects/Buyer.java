package ObjectsWithinObjects;

public class Buyer {
	private String name;
	private double money=1500;
	private Phone phone;
	
	
	public Buyer(String name, double money, Phone phone) {
		this.name = name;
		this.money = money;
		this.phone = phone;
	}

	public boolean buyPhone() {
		boolean buyable;
		if(this.money > phone.marketPrice()) {
			buyable = true;
		} else{
			buyable = false;
		}
		return buyable;
	}
	
	public String colorPreference() { 
		String wantColor = "red";
		if(wantColor == phone.getColor()) {
			return "The phone's color is red.";
		} else {
			return "They don't have the right color.";
		}
		
	}

	@Override
	public String toString() {
		return "Buyer name: " + name + ", money: " + money + ", phone: " + phone ;
	}
	
	
}
