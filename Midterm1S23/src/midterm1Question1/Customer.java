package midterm1Question1;
/*
 * Date: 2/8/23
 * Description: Midterm #1
 * Due Date: 2/8/23
 * Course: ICS 141-02
 * Name: Cindy Chen
 */
// java project is named Midterm1S23, class & package is named to Customer and midterm1Question1
public class Customer {
	// instance variables
	private int id;
	private String name;
	private String address;
	private String phone;

	// default constructor, setting the default value to id is 1, name is emma,
	// address is 1042 Anderson Drive, St.Paul, MN 55110 USA, phone is 651-111-2341
	// responds to Question #2
	public Customer() {
		id = 00;
		name = "Emma Thompson";
		address = "1042 Anderson Drive, St.Paul, MN 55110 USA";
		phone = "651-000-0000";
	}

	// Instantiating new object constructor
	public Customer(int custID, String custName, String custAddress, String custPhone) {
		this.id = custID;
		this.name = custName;
		this.address = custAddress;
		this.phone = custPhone;
	}

	// instance variable getters
	public int getInt() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	// instance variable setters
	public void setInt(int customerID) {
		this.id = customerID;
	}

	public void setName(String customerName) {
		this.name = customerName;
	}

	public void setAddress(String customerAddress) {
		this.address = customerAddress;
	}

	public void setPhone(String customerPhone) {
		this.phone = customerPhone;
	}

	// to string method, introduces the customer's information
	@Override
	public String toString() {
		return "The customer's ID is: " + this.id + ", the customer's name is: " + this.name
				+ ", the customer's address is: " + this.address + ", the customer's phone is: " + this.phone;
	}

}
