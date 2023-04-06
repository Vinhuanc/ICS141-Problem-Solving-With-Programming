package lecture;

public class PetDriver {

	public static void main(String[] args) {
		Pet cat1 = new Pet("Flurry", 200, 15, "cat");
		Pet cat2 = new Pet("Meow", 200, 15, "cat");
		Pet cat3 = new Pet("Quiet", 200, 15, "cat");
		
		PetCollection farmAnimals = new PetCollection("Farm Animal", 10);
		farmAnimals.add(cat1);
		farmAnimals.add(cat2);
		farmAnimals.add(cat3);

		System.out.println(farmAnimals.toString());
		
		PetInterface pt = new Pet("Dog", 210, 12, "Dog");
		PetAbstract pa = new Pet("Rainbow", 45, 12, "Dog");
		
	}

}
