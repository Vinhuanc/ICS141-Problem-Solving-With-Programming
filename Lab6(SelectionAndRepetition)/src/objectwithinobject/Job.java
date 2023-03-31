package objectwithinobject;

import java.text.DecimalFormat;

public class Job {
	private String jobDescription;
	private double salary;
	private static int jobID;	// two jobs cannot have the same ID
	DecimalFormat df = new DecimalFormat();
	
	public Job(String jobDescription, double salary) {
		this.jobDescription = jobDescription;
		this.salary = salary;
		jobID++;
	}
	
	public static int getJobID() {
		return jobID;
	}
	
	public char openNewPositions(int totalPositionCurrentOpen) {
		char open = 'n';
		if(jobID < totalPositionCurrentOpen) {
			open = 'y';
		}
		return open;
	}

	@Override
	public String toString() {
		return "Job Description: " + jobDescription + ", salary: " + salary ;
	}

	public double getSalary() {
			return salary;
	}
	
	
}
