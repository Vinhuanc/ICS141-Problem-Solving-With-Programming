package lab10;
/*
 * Date: 4/12/23
 * Description: Lab 10, File Input and Output
 * Due Date: 4/16/23
 * Course: ICS 141-02
 * Name: Cindy Chen, worked with Samuel Goergen
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Please enter the file name: ");
		Scanner userInput = new Scanner(System.in); 
		File file = new File(userInput.next());
		
		Scanner fileReader = new Scanner(file);
		int total = 0;
		
		File file2 = new File("copyOfStates.txt");

		PrintWriter fileWriter = new PrintWriter(file2);

		while(fileReader.hasNextLine()) {
			String msg = fileReader.nextLine();
			System.out.println(msg);
			total++;
			fileWriter.println(msg);
		}
		System.out.println("Total number of lines is: " + total);
		fileReader.close();
		fileWriter.flush();
		fileWriter.close();
		
	}

}
