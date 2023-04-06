package $JavaCollection;
import java.util.*;

public class example {

	public static void main(String[] args) {
		// LinkedList ordered collection
//		LinkedList<String> col = new LinkedList<String>();
//		col.add("January");
//		col.add("February");
//		col.addFirst("March");
//		col.addLast("August");
//		col.removeLast();
//		
//		for(int i = 0; i<col.size(); i++) {
//			System.out.println(col.get(i));
//		}
	
	
		// Hashmap key/value pairs
//		HashMap<String, String> student = new HashMap<String, String>();
//		student.put("Andy", "Anderson");
//		student.put("Brett", "Benson");
//		student.put("Carson", "Peterson");
//
//		for(String i : student.keySet()) {
//			System.out.println("The person's first name is: " + i + ", last name is: " + student.get(i));
//		}
		
		// HashSet unique items in every collection
		HashSet <String> days = new HashSet<String>();
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");

		for(String i : days) {
			System.out.println("Today is: " + i);
		}
}
}