package books;

public class bookCollection{
	private String name;
	private int numItems;
	private Book[] allMyBooks;
	
	public bookCollection(String name, int maxSizeOfTheCollection) {
		name = name;
		allMyBooks = new Book[maxSizeOfTheCollection];
		numItems = 0;
	}
	
	public void add(Book book) {
		allMyBooks[numItems++] = book;
	}
	
	public String toString() {
		String output = "";
		output += "Book name: \t Book type \t Book year \n";
		output += "********************************************* \n";
		for(int i = 0; i<numItems; i++) {
			output += allMyBooks[i].getBookName() + "\t";
			output += allMyBooks[i].getBookType() + "\t";
			output += allMyBooks[i].getYear() + "\n";
		}
		return output;
	}
	
	
}
