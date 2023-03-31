package Assignment1;
/*
 * Date: 01/11/2023
 * Description: Assignment #1, a program that calculates the pre tax, taxed amount, post tax for each employee by calculating each employee's hourly rate, hours worked, and tax rate. In addition, it provides the company the total amount
 * of tax withheld for all employees.
 * Due Date: 01/25/2023
 * Course: ICS 141-02
 * Name: Cindy Chen
 */
import java.util.Scanner;

public class pay {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		// information for first employee
		System.out.print("Enter name of first employee: ");
		String fEmpName = userInput.next();
		System.out.print("Enter pay rate of first employee: ");
		Double fEmpPay = userInput.nextDouble();
		System.out.print("Enter hours worked of first employee: ");
		Double fEmpHours = userInput.nextDouble();
		
		// information for second employee
		System.out.print("Enter name of second employee: ");
		String sEmpName = userInput.next();
		System.out.print("Enter pay rate of second employee: ");
		Double sEmpPay = userInput.nextDouble();
		System.out.print("Enter hours worked of second employee: ");
		Double sEmpHours = userInput.nextDouble();
		
		// information for third employee
		System.out.print("Enter name of third employee: ");
		String tEmpName = userInput.next();
		System.out.print("Enter pay rate of third employee: ");
		Double tEmpPay = userInput.nextDouble();
		System.out.print("Enter hours worked of third employee: ");
		Double tEmpHours = userInput.nextDouble();
		
		// get tax rate information
		System.out.print("Enter tax rate from 0.0 to 1.0: ");
		Double tax_rate = userInput.nextDouble();
		System.out.print("\n");
		
		// calculate and display pre tax pay before taxes for each employee
		Double fEmpPreTax = fEmpPay * fEmpHours;
		System.out.println("The pre tax pay for the first employee is: " + fEmpPreTax);
		Double sEmpPreTax = sEmpPay * sEmpHours;
		System.out.println("The pre tax pay for the second employee is: " + sEmpPreTax);
		Double tEmpPreTax = tEmpPay * tEmpHours;
		System.out.println("The pre tax pay for the third employee is: " + tEmpPreTax + "\n");
		
		// calculate and display the taxed amount for each employee
		Double fEmpTaxAmt = fEmpPreTax *  tax_rate;
		System.out.println("The amount taxed for the first employee is: " + fEmpTaxAmt);
		Double sEmpTaxAmt = sEmpPreTax * tax_rate;
		System.out.println("The amount taxed for the second employee is: " + sEmpTaxAmt);
		Double tEmpTaxAmt = tEmpPreTax * tax_rate;
		System.out.println("The amount taxed for the third employee is: " + tEmpTaxAmt + "\n");
		
		// calculate and display post tax for each employee
		Double fEmpPostTax = fEmpPreTax - fEmpTaxAmt;
		System.out.println("The post tax pay for the first employee is: " + fEmpPostTax);
		Double sEmpPostTax = sEmpPreTax - sEmpTaxAmt;
		System.out.println("The post tax pay for the second employee is: " + sEmpPostTax);
		Double tEmpPostTax = tEmpPreTax - tEmpTaxAmt;
		System.out.println("The post tax pay for the third employee is: " + tEmpPostTax + "\n");
		
		// calculate and display the total amount of taxes the company has withholded
		Double corp_withheld = fEmpTaxAmt + sEmpTaxAmt + tEmpTaxAmt;
		System.out.println("The total amount of taxes withhold by the company is: " + corp_withheld + "\n");
		
		userInput.close();
		System.out.println("Program done by: Cindy Chen");
	}

}







