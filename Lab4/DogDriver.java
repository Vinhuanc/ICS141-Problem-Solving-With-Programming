/*
 * Date: 2/1/23
 * Description: Lab 4
 * Due Date: 2/5/23
 * Course: ICS 141-02
 * Name: Cindy Chen
 
 */
import java.util.Scanner;
public class DogDriver {
	public static void main(String[] args) {
		
		// practicing the counting loop
		// part 1 of Lab3
//		Scanner userInput = new Scanner(System.in);
//		int a = 1;
//		System.out.println("How many dog objects do you want to create? ");
//		int i = userInput.nextInt();
//		while(a <= i) {
//		System.out.println("What is the dog's name?");
//		String name = userInput.next();
//		System.out.println("What is the dog's age?");
//		int age = userInput.nextInt();
//		
//		Dog newDog = new Dog(name, age);
//		System.out.print(newDog.toString() + '\n');
//		a++;
		
		/* I was confused on how to instanciate a new object within a loop. But I saw the example code given 
		 in D2L and followed that example. It works!
		*/
//		}

		
		
		// practicing the sentinel loop
		// part 2 of Lab3
//		String b;
//		System.out.println("Would you like to enter more dogs?");
//		b = userInput.next();		
//		while(b.equalsIgnoreCase("y")) {
//		System.out.println("What is the dog's name?");
//		String name = userInput.next();
//		System.out.println("What is the dog's age?");
//		int age = userInput.nextInt();
//		
//		Dog newDog = new Dog(name, age);
//		System.out.print(newDog.toString() + '\n');
//
//		System.out.println("Would you like to enter more dogs?");
//		b = userInput.next();
//		}
//		
//		System.out.print("You said no more dogs, goodbye.");
//		userInput.close();
		
	/*	 I can now tell the different between counter and sentinel loops. Counters are by fixed number of iteration, 
		 sentinal loops dependes on user input. I am more comfortable with counter. Probably not from memory, would
		 need to view the syntax.
	*/
	
		Dog myDog = new Dog("lucky", 13);
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("What string would you like to repeat?");
		String a = userInput.nextLine();
		System.out.println("How many times would you like to repeated it?");
		int b = userInput.nextInt();
		Method.multiConcat(a, b);
		
		myDog.price(10,5);
		myDog.greetings("Hello World");
		myDog.makeSound();
		myDog.eat("Macdonals");
}
}
