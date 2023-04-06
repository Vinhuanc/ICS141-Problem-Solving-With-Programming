package lecture;

/**
 * @author cindy
 *
 */
public class Pet extends PetAbstract implements PetInterface, Comparable<Pet>{
	private String name;
	private double price;
	private int weight;
	private String type;
	
	public Pet(String name, double price, int weight, String type) {
		this.name = name;
		this.price = price;
		this.weight = weight;
		this.type = type;
	}
	
	public boolean isBreed(Pet pet) {
		boolean isType = false;
		if(pet.getType().equalsIgnoreCase(PetEnum.BEAGLE.toString())) {
			
		}
		return isType;
	}
	
	
	@Override // on paper exam
	public int compareTo(Pet pet) {
		int output = 0;
		if(this.name.compareTo(pet.name) == 0 ) {
			output = 0; // same object
		} else if(this.weight > pet.weight) {
			output = 1; // this object is bigger than arguement object
		} else {
			output = -1; 
		}
		return output;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return  name + "\t\t" + price + "\t\t" + weight + "\t\t" + type ;
	}

	@Override
	public String healthCheck() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double purchasePet() {
		// TODO Auto-generated method stub
		return 0;
	}

 
	/**
	 *
	 */

	@Override
	public String getFavBrand(String brand) {
		String likes = brand;
		String speak = "";
		switch(likes) {
		case "Pedigree" : {
			speak += "I love ....." + brand;
			break;
		}
		case "Blue Buffalo" : {
			speak += "I love ....." + brand;
			break;
		}
		default:
			speak = "Very cheap, I'll eat now because I am hungry";
			break;
		}
		return speak;
	}

	@Override
	public void changePrice(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int petAge(int year) {
		return 2023 - year;
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		
	}


	
	
}
