package lecture14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FruitDriverWithLoop {
											// throw exception at class level
	public static void main(String[] args) throws FileNotFoundException {
		// create varibles to hold fruit values
		String name = null;
		double weight = 0;
		double price = 0;
		Fruit myFruit = null;
		
		// Step 1
		File myFile = new File("Fruits");
		
		// Step 1.2
		File myOutputFile = new File("myOutput.txt");
		PrintWriter output = new PrintWriter(myOutputFile);
		
		// Step 2
		Scanner fileScan = new Scanner(myFile);
		
		// Step 3
		while(fileScan.hasNext()) {
			if(fileScan.hasNextLine()) {
				name = fileScan.next();
				weight = fileScan.nextDouble();
				price = fileScan.nextDouble();
			}
			
			// Step 4
			myFruit = new Fruit(name, weight, price);
			
			// Step 5
			System.out.println(myFruit.toString());
			
			// Step 6
			output.write(myFruit.toString() + "\n");
		}
		
		// Step 7: process all data and send to the file named "myOUtput.txt"
		output.flush();
		fileScan.close();
		output.close();
	}

}
