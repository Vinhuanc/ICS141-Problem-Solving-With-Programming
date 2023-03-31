package objectwithinobject;

public class StudentJobDriver {

	public static void main(String[] args) {
		Student aStudent = new Student();
		
		System.out.println("Current role:");
		System.out.println(aStudent);
		System.out.println("Is the salary competitive? " + aStudent.negotiateMinSalary());
		
		System.out.println();
		System.out.println("*******************");

		System.out.println("Job search - CS role");
		Job newJobApp = new Job("ML Engineer", 145000);
		
		aStudent.setJob(newJobApp);
		

	}

}
