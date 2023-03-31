package inheritance;

public class Driver {

	public static void main(String[] args) {
		// implementing all methods of the Snack class
		Snack chip = new Snack(1.50, "Lays", 368.5);
		System.out.println(chip.getPrice());
		chip.setPrice(5.40);
		System.out.println(chip.getBrand());
		chip.setBrand("Doritos");
		System.out.println(chip.getWeight());
		chip.setWeight(420.25);
		System.out.println(chip.toString());

		System.out.println("-------------------");

		// implementing all methods of the popcorn class
		Popcorn caramelPopcorn = new Popcorn(5.00, "Garette Popcorn Corp", 50.9, "caramel drizzled popcorn");
		System.out.println(caramelPopcorn.getPrice());
		caramelPopcorn.setPrice(10.50);
		System.out.println(caramelPopcorn.getBrand());
		caramelPopcorn.setBrand("Thrives Market Popcorn");
		System.out.println(caramelPopcorn.getWeight());
		caramelPopcorn.setWeight(385.25);
		System.out.println(caramelPopcorn.getType());
		caramelPopcorn.setType("salty");
		System.out.println(caramelPopcorn.toString());
		
		// child class can call the methods from the parent class, but not vice versa.
		// when a parent class calls instance variables or methods from a child a class, it returns an error.
		// The reasoning being that the child class inherits from the super class(can see it), but the parent class cannot
		// "see" the child class. Inheritance only benefits the child classes, with super classes being the template.

//		2. What is your understanding of inheritance in Java? Briefly describe or provide an example
		// inheritance can be seen as the "gene" passer of humans. Classes/methods(genes) can be passed from the parent to the child, but not vice versa.
		// Super and child class have their own hierarchy of structure, just like in humans its grandparents/parents/individuals
		// inheritance in Java provides great flexibility and reduces repeated codes. When the project has many similar ideas, with a little difference in functions, 
		//	inheritance is the best support

//		3. Why do we use inheritance? Can you recall a time that we use inheritance for any of the labs or
//			assignments? Provide an example.
		// use inheritance to prevent repeated codes, to have greater productivity without relying on building the foundations. Once the foundations(base class) is 
		// structured correctly, the instances(child classes) only needs to be added/adjusted for specifications.
		// Only lab #8 have we done inheritances

//		4. What are the two types of class relationships in Java discussed in the reading?
		// is-a and has-a relationship

//		5. Which class is the root class of all the classes in Java? What is another name for this class?
		// root class is the superclass, the class above all class structures. Another name is Object.
		
//		6. Describe Polymorphism? If possible, give an example that relates to the real-world.
		// Polymorphism is the "many forms" of the method, it provides classes the ability to have the same method, with different functions. In other words, 
		//		the different implementations of a method. Real world example is how individuals of a family says Hello to other people, person #1 may say "Good morning",
		//		person #2 may say "Hi", person #3 may say "How are you". Different family members says hello differently, but still the same idea of "greeting".
		
//		7. What’s the difference between methods overloading vs. overriding? Provide more than just the
//		definition.
		// overloading methods is the same method name, with different parameters and function statements. Overriding methods is rejecting the original method,
		//		and replace with the current/new method. In inheritance, its about the child and parent class having the same method, and the child class
		//		overriding the parent class's method with its current/new method.
	}
	

}
