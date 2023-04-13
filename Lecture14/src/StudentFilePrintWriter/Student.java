package StudentFilePrintWriter;

public class Student {
	private int studentId;
	private String firstName;
	private String lastName;
	
	public Student(int studentId, String firstName, String lastName) {
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Student studentId:" + studentId + ", firstName:" + firstName + ", lastName:" + lastName + ".";
	}
	
	

}
