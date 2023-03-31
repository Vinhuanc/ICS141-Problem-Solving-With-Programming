package forloops;

public class DriverForLoops {

	public static void main(String[] args) {
		// running below for loop displays 1 2 3 previously
		for (int i=1; i<=10; i++){ 
			System.out.print(i + "\t");
		} 
		System.out.println();
		System.out.println("All done");
		
		// running below for loop displays 1 2 3 1 
		// 2
		// 3
		// All done previously
		for (int i=1; i<4; i++){
			System.out.print(i + "\t");
			System.out.println();
		}
		for (int i=1; i<4; i++){
			System.out.print(i + "\t"); 
			System.out.println();
		}
		System.out.println("All done");

		// running the below for loop displays 
		// 1 2 3
		// 1 2 3
		// 1 2 3
		// 
		// All done previously
		for (int i=1; i<=10; i++){ 
			for (int j=1; j<=8; j++){
				System.out.print(j + "\t");
			}
			 System.out.println();
			} 
			System.out.println();
			System.out.println("All done");
	}

}
