package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDriver {
	final static double tax = 0.25;

	public static double getlAllTax(List<Employee> empList) {
		double corpTax = 0;
		for (int i = 0; i < empList.size(); i++) {
			corpTax += empList.get(i).calcCorpTax();
		}
		return corpTax;
	}

	public static void main(String[] args) {
		Employee myEmployee = new Employee();
		String moreEmployees = "y";
		System.out.print("How many employees would you like to enter?");
		Scanner userInput = new Scanner(System.in);
		int totalEmployees = userInput.nextInt();
		List<Employee> empList = new ArrayList<Employee>();

		// sentinel loop, asking for specific amount of employees to be added
		for (int i = 0; i < totalEmployees; i++) {
			System.out.print("What is the employee's name? ");
			String name = userInput.next();
			System.out.print("What is the employee's rate? ");
			Double rate = userInput.nextDouble();
			if (rate < 0) {
				System.err.print("Value cannot be zero. please reenter: ");
				rate = userInput.nextDouble();
			}
			System.out.print("How many hours did the employee work? ");
			int hours = userInput.nextInt();
			if (hours < 0) {
				System.err.print("Value cannot be zero. please reenter: ");
				hours = userInput.nextInt();
			}

			empList.add(new Employee(name, rate, hours));
			System.out.println("");
		}

		
		System.out.print("Would you like to enter more employees? y/n ");
		moreEmployees = userInput.next();

		// for more employees to be added
		while (moreEmployees.equalsIgnoreCase("y")) {
			System.out.print("What is the employee's name? ");
			String name = userInput.next();
			System.out.print("What is the employee's rate? ");
			Double rate = userInput.nextDouble();
			if (rate < 0) {
				System.err.print("Value cannot be zero. please reenter: ");
				rate = userInput.nextDouble();
			}
			System.out.print("How many hours did the employee work? ");
			int hours = userInput.nextInt();
			if (rate < 0) {
				System.err.print("Value cannot be zero. please reenter: ");
				hours = userInput.nextInt();
			}

			empList.add(new Employee(name, rate, hours));

			System.out.print("Would you like to enter more employees? y/n ");
			moreEmployees = userInput.next();
		}
		System.out.print("\n*** Information about all employees: ***\n");

		for (int i = 0; i < empList.size(); i++) {
			System.out.println(empList.get(i).toString());
			System.out.println("The total income pre taxed is: " + empList.get(i).preTax());
			System.out.println("The total taxed amount is: " + empList.get(i).taxedAmt());
			System.out.println("The post taxed amount is: " + empList.get(i).postTax());
			System.out.println("");
		}
		System.out.println("The total amount of tax the company has to pay is: $" + getlAllTax(empList));

	}
}
