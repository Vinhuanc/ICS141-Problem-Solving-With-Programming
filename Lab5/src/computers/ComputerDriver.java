package computers;

public class ComputerDriver {

	public static void main(String[] args) {
		Computer a = new Computer("Mac", 8, 1200);
		Computer b = new Computer("Dell", 16, 1000);

		System.out.println(a.toString());
		System.out.println(b.toString());

//		1. What are the similarities between a Class, Object and Method?
//			share same instance variables, behaviors, belongs to the same template
//		2. What are the differences between a Class, Object and Method?
//			class is the template, object is the instance of the class, methods are the actions
//		3. What is the importance of using a UML?
//			allows developers to visualize the project, gives method descriptions to developers without knowing the specific language
//		4. What happens when we add static to a method?
//			it will belong to the class, not the instance of the class
//		5. Can we instantiate an object if our class doesn’t have a constructor? What does adding a constructor to a class do?
//			cannot instantiate object without constructor, adding a constructor allows the class to be instantiated.
//		6. How is a constructor different from a class?
//			a class is the template for instantiating the object, the constructor is the method to instantiate the object with parameters/characteristics.
		
		a.getPriceWithQuantity(2);
		a.sendMsg();
		System.out.println("The new ram is: " + a.addRam(5));
		a.describe();
		
		System.out.println("\n");
		
		b.getPriceWithQuantity(2);
		b.sendMsg();
		System.out.println("The new ram is: " + b.addRam(15));
		b.describe();
	}

}
