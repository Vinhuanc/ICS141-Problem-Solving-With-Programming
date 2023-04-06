package lab9;
public class Employee implements Comparable<Employee>{
	private final double tax = 0.25;
	private String name;
	private double hourlyRate;
	private int hours;

	public Employee() {
	}

	public Employee(String name, double hourlyRate, int hours) {
		this.name = name;
		this.hourlyRate = hourlyRate;
		this.hours = hours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	@Override
	public String toString() {
		return "The employee's name is " + this.name +", employee's rate is " + this.hourlyRate + ", employee's hours are " + this.hours + ".";
	}
	
	public double preTax() {
		double preTaxAmt = hourlyRate * hours;
		return preTaxAmt;
	}
	
	public double taxedAmt() {
		double preTaxAmt = hourlyRate * hours;
		double taxedAmt = preTaxAmt * tax;
		return taxedAmt;
	}
	
	public double postTax() {
		double preTaxAmt = hourlyRate * hours;
		double postTax = preTaxAmt * (1-(tax));
		return postTax;
	}
	
	public double calcCorpTax() {
		double taxed = (hourlyRate * hours) - ((hourlyRate * hours)* (1-(tax)));
		return taxed ;
	}

	@Override //name and hourlyrate
	public int compareTo(Employee employee) {
		int output = 0;
		if(this.name.compareTo(employee.name) == 0) {
			output = 0;
		} else if(this.hourlyRate > employee.hourlyRate) {
			output = 1;
		} else {
			output = -1;
		}
		return output;
	}
}

