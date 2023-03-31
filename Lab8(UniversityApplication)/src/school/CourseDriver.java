package school;

public class CourseDriver {

	public static void main(String[] args) {
		CourseGrades databaseCourse = new CourseGrades(" Database Course", 5);
		CourseGrades programmingCourse = new CourseGrades(" Programming Course", 7);

		System.out.println(databaseCourse.toString());
		System.out.println(programmingCourse.toString());

		databaseCourse.add(1, 967);
		databaseCourse.add(3, 457);
		databaseCourse.add(2, 67);
		
		programmingCourse.add(1, 84);
		programmingCourse.add(2, 53);
		programmingCourse.add(3, 335);
		programmingCourse.add(4, 53);

		System.out.println(databaseCourse.toString());
		System.out.println(programmingCourse.toString());
		
		System.out.println("Average grade of database course: " + databaseCourse.avgGrade());
		System.out.println("Average grade of programming course: " + programmingCourse.avgGrade());

		System.out.println("Top grade of database course: " + databaseCourse.maxGrade());
		System.out.println("Top grade of programming course: " + programmingCourse.maxGrade());
		
		System.out.println("Position of top score of database course: " + databaseCourse.topScorer());
		System.out.println("Position of top programming course: " + programmingCourse.topScorer());
		
		CourseGradesAndNames systemsCourse = new CourseGradesAndNames("Systems Course", 5);
		systemsCourse.add("Cindy", 1, 90);
		systemsCourse.add("Emily", 4, 89);
		systemsCourse.add("John", 3, 50);
		System.out.println("The number of enrollments in the Systems Course is: " + systemsCourse.getNumEnrollments());
		System.out.println(systemsCourse.toString());

		systemsCourse.printClassList();
		System.out.println("The top scorer name is: " + systemsCourse.topScorerName());
	}

}
