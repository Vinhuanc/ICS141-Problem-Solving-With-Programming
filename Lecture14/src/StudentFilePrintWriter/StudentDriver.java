package StudentFilePrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StudentDriver {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner consoleScan = new Scanner(System.in);
		System.out.print("Type in a file name: ");
		String fileName = consoleScan.nextLine().trim();
		
		File studentFile = new File(fileName); // the reference to the file
		Scanner studentFileScan = new Scanner(studentFile);
		
		Student[] students = new Student[10];
		int numStudents = 0;
		
		File outputFile = new File("copyOfStudentData.txt"); // writes data 
		PrintWriter writeData = new PrintWriter(outputFile); // writes data into the file
		
		while(studentFileScan.hasNextLine()) {
			int id = studentFileScan.nextInt();
			String fn = studentFileScan.next();
			String ln = studentFileScan.next();
			
			Student aStudent = new Student(id, fn, ln);
			students[numStudents++] = aStudent;
		}
		
		for(int i = 0; i<numStudents; i++) {
			writeData.println(students[i]);
		}
		writeData.flush();
		studentFileScan.close();
		writeData.close();
	}

}
