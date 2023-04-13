package assignment6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserDataProcessingDriver {
	
	// calculates the average age for all users
	public static double avgAge(User[] users) {
		double totalAge = 0;
		for(int i = 0; i<users.length; i++) {
			totalAge += users[i].getAge();
		}
		double avgAge = totalAge/users.length;
		return avgAge;
	}
	
	// counts the total number of users of a specific occupation
	public static int countOccupation(User[] users, String occupation) {
		int count = 0;
		for(int i=0; i<users.length; i++) {
			if(users[i].getOccupation().equalsIgnoreCase(occupation)) {
				count++;
			}
		}
		return count;
	}
	
	// calculates the average age of a specifc occupation from all users
	public static double avgOccupationAge(User[] users, String occupation) {
		double totalAge = 0, totalUsers = 0;
		for(int i = 0; i<users.length; i++) {
			if(users[i].getOccupation().equalsIgnoreCase(occupation)) {
				totalAge += users[i].getAge();
				totalUsers++;
			}
		}
		return totalAge/totalUsers;
	}
	
	
	// counts the total number of males under and including specific age
	public static int countMaleBelowAgeIncludingAge(User[] users, int age) { 
		int count = 0;
		for(int i = 0; i<users.length; i++) {
			if(users[i].getSex().equalsIgnoreCase("M") && users[i].getAge()<=age) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		User[] usersArr = new User[200];
		
		// file set up and read
		File file = new File("Assignment-06-user-data.txt");
		Scanner fileReader = new Scanner(file);
		int count = 0;
		
		// read from file and instantiate user object
		while(fileReader.hasNext()) {
			int id = fileReader.nextInt();
			int age = fileReader.nextInt();
			String sex = fileReader.next();
			String occupation = fileReader.next();
			String zipCode = fileReader.nextLine();
			
			User user = new User(id, age, sex, occupation, zipCode);
			usersArr[count++] = user;
		}
		
		// displaying file information into console
		for(int i = 0; i<count; i++) {
			System.out.println(usersArr[i].toString());
		}
		
		// testing all methods
		System.out.println("The average age of all users is: " + avgAge(usersArr));
		System.out.println("The count of educators is: " + countOccupation(usersArr, "artist"));
		System.out.println("The average age of specifc occupation is: " + avgOccupationAge(usersArr, "artist"));
		System.out.println("The count for males below this age is: " + countMaleBelowAgeIncludingAge(usersArr, 40));
		
		fileReader.close();
		System.out.println("Program done by: Cindy Chen");
	}

}
