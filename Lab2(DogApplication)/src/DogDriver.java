
public class DogDriver {

	public static void main(String[] args) {
		Dog myDog = new Dog("Bella", 5);
		Dog yourDog = new Dog("Charlie", 7);
		
		
		System.out.println(myDog.toString());
		
		yourDog.getName();
	System.out.println(myDog.getName());
	System.out.println(yourDog.getName());
	
	myDog.setAge(8);
	yourDog.setAge(10);
	System.out.println(myDog.toString());
	System.out.println(yourDog.toString());
	}

}
