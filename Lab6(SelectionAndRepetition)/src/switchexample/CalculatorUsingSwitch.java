/*
 * Date: 2/22/23
 * Description: Lab 6
 * Due Date: 2/22/23
 * Course: ICS 141-02
 * Name: Cindy Chen & Dominic Messicci
 */
package switchexample;

import java.util.Scanner;

public class CalculatorUsingSwitch {
	public static void main(String [] args) {
		char operator;
		Double num1, num2, result;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Choose an operator: +, -, *, / ");
		operator = input.next().charAt(0);
		
		System.out.print("Enter your first number: ");
		num1 = input.nextDouble();
		
		System.out.print("Enter your second number: ");
		num2 = input.nextDouble();
		
		switch(operator) {
		case '+':
			result = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + result);
			break;	
		case '*':
			result = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + result);
			break;
		case '/':
			result = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + result);
			break;
		default :
			System.err.println("Error. Invalid operator.");
		}
	}
}
