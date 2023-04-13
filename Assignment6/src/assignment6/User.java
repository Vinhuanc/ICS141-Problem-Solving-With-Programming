package assignment6;
/*
 * Date: 4/13/23
 * Description:  Assignment 6
 * Due Date: 4/19/23
 * Course: ICS 141-02
 * Name: Cindy Chen
 */
public class User {
	private int userID;
	private int age;
	private String sex;
	private String occupation;
	private String zipCode;
	
	// constructor to instantite User object
	public User(int userID, int age, String sex, String occupation, String zipCode) {
		this.userID = userID;
		this.age = age;
		this.sex = sex;
		this.occupation = occupation;
		this.zipCode = zipCode;
	}
	
	// getters and setters
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "UserID: " + userID + "\t age: " + age + "\t sex: " + sex + "\t occupation: " + occupation + "\t\t zipCode: "
				+ zipCode + ".";
	}
}
