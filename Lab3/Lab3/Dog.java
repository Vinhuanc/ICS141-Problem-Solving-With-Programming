/*
 * Date: 1/21/23
 * Description: Lab 2
 * Due Date: 1/22/23
 * Course: ICS 141-02
 * Name: Cindy Chen
 * resubmitting, forgot the comment section. LOLL
 */
public class Dog {
	private String name;
	private int age;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "The dog's name is " + name + " with the age of " + age + " years old.";
	}
	
	

}
