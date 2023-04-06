package lab9;
/*
 * Date: 4/5/23
 * Description: Lab #9 
 * Due Date:  4/9/23
 * Course: ICS 141-02
 * Name: Cindy Chen with Katie
 */
public class SortingDriver {
	public static void selectionSort(int[] array) { // sort array by ascending
		for ( int j=0; j<array.length-1; j++ ){
			int min = j;
			for ( int k=j+1; k<array.length; k++ )
			if ( array[k] < array[min] )
			min = k;
			int temp = array[j];
			array[j] = array[min];
			array[min] = temp;
			}
	}
	public static void selectionSortDescending(int[] array) {  // sort array by descending
		for ( int j=0; j<array.length-1; j++ ){
			int min = j;
			for ( int k=j+1; k<array.length; k++ )
			if ( array[k] > array[min] )
			min = k;
			int temp = array[j];
			array[j] = array[min];
			array[min] = temp;
			}
	}
	
	public static void main(String[] args) {
			int[] myNumbers = {53,135,657,57,233,46,325,23,45,45623};
			System.out.print("Original: \t");
			for(int i = 0 ; i<myNumbers.length; i++) {
				System.out.print(myNumbers[i] + "\t");
			}
			selectionSort(myNumbers);
			System.out.println("");
			System.out.print("Ascending: \t");
			for(int i = 0 ; i<myNumbers.length; i++) {
				System.out.print(myNumbers[i] + "\t");
			}
			selectionSortDescending(myNumbers);
			System.out.println("");
			System.out.print("Descending: \t");
			for(int i = 0 ; i<myNumbers.length; i++) {
				System.out.print(myNumbers[i] + "\t");
			}
	}

}
