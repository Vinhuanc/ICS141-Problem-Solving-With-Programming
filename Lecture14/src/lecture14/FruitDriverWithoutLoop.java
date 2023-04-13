package lecture14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FruitDriverWithoutLoop {

	public static void main(String[] args) {
		// create a File object
		File aFileReference = new File("Fruits");
		
		// create a Scanner object
		Scanner scan = null;
		try {
			 scan = new Scanner(aFileReference);
		} catch (FileNotFoundException e) {
			System.out.println("No such file");
			e.printStackTrace();
		}
		
		// Fruit attribute
		String fruitName = scan.next();
		double fruitWeight = scan.nextDouble();
		double fruitPrice = scan.nextDouble();
		
		Fruit myFruit = new Fruit(fruitName, fruitWeight, fruitPrice);
		
		System.out.println(myFruit.toString());
		
		System.out.println("Exists? "+aFileReference.exists());
		System.out.println("length? "+aFileReference.length());
		System.out.println("is Directory? "+aFileReference.isDirectory());
		System.out.println("Absoulte Path? "+aFileReference.getAbsolutePath());
		System.out.println("Last modified on? "+aFileReference.lastModified());

		scan.close();
	}

}
