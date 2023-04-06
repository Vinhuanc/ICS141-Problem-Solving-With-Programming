package lecture;

public class PetCollection {
	private String name;
	private int numPets;
	private Pet[] animals;
	
	public PetCollection(String name, int maxSize) {
		this.name = name;
		this.animals = new Pet[maxSize];
		numPets = 0;
	}
	
	public void add(Pet pet) {
		animals[numPets++] = pet;
	}
	
	public void add(String name, double petPrice, int petWeight,  String petType) {
		Pet newPet = new Pet(name, petPrice,petWeight, petType);
		animals[numPets++] = newPet;
	}
	
	public String toString() {
		String output = "Home: \t\t" + " Price: \t" + "weight: \t" + "Type: \t\n";
		for(int i = 0; i<numPets; i++) {
			output += animals[i].toString() + "\n";
		}
		return output;
	}
}
