package objectwithinobject;

public class Student {
	private String name;
	private double askingSalary;
	private String currentRole;
	private Job job;
	
	public Student() {
		name = "Anna";
		askingSalary = 12000;
		currentRole = "Student";
		job = new Job(currentRole, askingSalary);
	}
	
	public Student(String studentName, Job studentJob) {
		name = studentName;
		job = studentJob;
	}
	
	public boolean negotiateMinSalary() {
		boolean isFantastic = false;
		if(job.getSalary() > askingSalary) {
			isFantastic = true;
		}
		return isFantastic;
	}

	@Override
	public String toString() {
		return "Student name: " + name + ", asking salary: " + askingSalary + ", current role: " + currentRole + ", job: "
				+ job ;
	}

	public void setJob(Job job) {
		this.job = job;
		
	}
	
	
}
