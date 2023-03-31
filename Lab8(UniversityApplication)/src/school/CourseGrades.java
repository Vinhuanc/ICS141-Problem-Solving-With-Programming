package school;
// Dominic Messicci
/*
 * Date: 3/29/23
 * Description: Lab 8
 * Due Date: 4/2/23
 * Course: ICS 141-02
 * Name: Cindy Chen
 */
public class CourseGrades {
	private String title;
	private double[] grades;
	
	public CourseGrades(String title, int maxNumStudents) {
		this.title = title;
		grades = new double[maxNumStudents];
		for(int i = 0; i<maxNumStudents; i++) {
			grades[i] = -1;
		}
		 
	}
	
	public int getNumEnrollments() {
		int a=0;
		for(int i = 0; i<grades.length; i++) {
			if(grades[i] != -1) {
				a++;
			}
		}
		return a;
	}
	
	public String toString() {
		return "The course title is: " + this.title + ", the number of enrolled students is: " + this.getNumEnrollments() + ", the maximum of enrolled students is: " + grades.length + "."; 
	}
	
	public void add(int studentNum, double grade) {
		while(studentNum < 0 || studentNum > grades.length) {
			System.err.println("Student number cannot be less than zero or greater than grades length.");
		}
		grades[studentNum] = grade;
	}
	
	public double avgGrade() {
		int b = 0;
		for(int i = 0; i<grades.length; i++) {
			b +=grades[i];
		}
		b /= grades.length;
		return b;
	}
	
	public double maxGrade() {
		double c = grades[0];
		for(int i= 0; i<grades.length; i++) {
			if(grades[i] > c) {
				c = grades[i];
			}
		}
		return c;
	}
	
	public int topScorer() {
		double c = grades[0];
		int x = 0;
		for(int i= 0; i<grades.length; i++) {
			if(grades[i] > c) {
				c = grades[i];
				 x=i;
			}
		}
		return x ;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
	
	
	
	
	
	
}
