package lab9;
public class ObjectSortingDriver {
	public static void selectionSort(Employee[] employee) {
		for ( int j=0; j < employee.length-1; j++ ){
		int min = j;
		for ( int k=j+1; k < employee.length; k++ )
		if ( employee[k].compareTo( employee[min] ) < 0 ) min = k;
		Employee temp = employee[j];
		employee[j] = employee[min];
		employee[min] = temp;
		}
	}
	public static void main(String[] args) {
		Employee employee1 = new Employee("cindy1",25, 40);
		Employee employee2 = new Employee("cindy2",34, 78);
		Employee employee3 = new Employee("cindy3",23, 45);
		Employee employee4 = new Employee("cindy4",45, 34);
		Employee employee5 = new Employee("cindy5",23, 34);
		Employee employee6 = new Employee("cindy6",45, 23);
		
		Employee[] myEmployees = {employee1, employee2, employee3, employee4, employee5, employee6};
		for(int i = 0; i <myEmployees.length; i++) {
			System.out.println(myEmployees[i].toString());
		}
		System.out.println("");
		System.out.println("Employees are sorted by hourly rate:");
		selectionSort(myEmployees);
		for(int i = 0; i <myEmployees.length; i++) {
			System.out.println(myEmployees[i].toString());
		}
	}

}
