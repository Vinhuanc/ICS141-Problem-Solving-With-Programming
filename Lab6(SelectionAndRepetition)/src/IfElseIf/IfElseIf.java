package IfElseIf;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		char operator;
		Double num1, num2;
		
		Scanner input = new Scanner(System.in);

		System.out.print("Choose an operator: +, -, *, / ");
		operator = input.next().charAt(0);
		
		System.out.print("Enter your first number: ");
		num1 = input.nextDouble();
		
		System.out.print("Enter your second number: ");
		num2 = input.nextDouble();
		
		solve(num1, num2, operator);
	}
	
	public static double solve(double first, double second, char op) {
		double ans = 0;
		
		if(op == '+') {
			ans = first + second;
			System.out.println(first + " + " + second + " + " + " = " + ans);
		} else if(op == '-') {
			ans = first - second;
			System.out.println(first + " - " + second + " + " + " = " + ans);
		} else if(op == '*') {
			ans = first * second;
			System.out.println(first + " * " + second + " + " + " = " + ans);
		} else if(op == '/') {
			ans = first / second;
			System.out.println(first + " / " + second + " + " + " = " + ans);
		}
		return ans;
	}

}
