
/*
 * Date: 2/1/23
 * Description: Lab 4
 * Due Date: 2/5/23
 * Course: ICS 141-02
 * Name: Cindy Chen
 
 */
import java.util.Scanner;

public class Method {
	private static int count;
	
	// data type of method output is string
	// method name: multiConcat
	// data type of first parameter: String
	// data type of second parameter: int
	public static String multiConcat(String string , int a) {
		String newStr = string;
		for(int i=0; i<=a; i++) {
			 newStr = string.concat(string);
			 newStr += newStr;
			 
		}
		System.out.println(newStr);
		return newStr;
	}
	
	public static void main(String [] args) {
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("What string would you like to repeat?");
		String a = userInput.nextLine();
		System.out.println("How many times would you like to repeated it?");
		int b = userInput.nextInt();
		multiConcat(a, b);
	}
}
