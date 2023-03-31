package school;
//Dominic Messicci
	/*
	 * Date: 3/29/23
	 * Description: Lab 8
	 * Due Date: 3/29/23
	 * Course: ICS 141-02
	 * Name: Cindy Chen
	 */
public class CourseGradesAndNames {
		private String title;
		private double[] grades;
		private String[] names ;
		
		public CourseGradesAndNames(String title, int maxNumStudents) {
			this.title = title;
			grades = new double[maxNumStudents];
			for(int i = 0; i<maxNumStudents; i++) {
				grades[i] = -1;
			}
			names = new String[maxNumStudents];
			 
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
		
		public void add( String name, int studentNum, double grade) {
			while(studentNum < 0 || studentNum > grades.length) {
				System.err.println("Student number cannot be less than zero or greater than grades length.");
			}
			grades[studentNum] = grade;
			names[studentNum] = name;
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
		
		public void printClassList() {
			for(int i =0; i<grades.length; i++) {
				if(grades[i] != -1.0) {
					System.out.println("Student number: \t Student name: \t Student grade: ");
					System.out.println(i + "\t\t\t\t" + names[i] + "\t\t"+ grades[i]);
				}
			}
		}
		
		public String topScorerName() {
			String top = names[0];
			double a = grades[0];
			for(int i = 0 ; i< grades.length; i++) {
				if(grades[i] > a) {
					a = grades[i];
					top = names[i];
				}
			}
			return top;
		}
		
		
		
		
		
		
		
	
}
