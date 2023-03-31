package books;

public class bookDriver {
	public static void main(String [] args) {
		Book book1 = new Book("Romance in Minnesota", "Romance", 2013);
		Book book2 = new Book("Java OOP", "Education", 2023);
		
		bookCollection books = new bookCollection("Odd books", 5);
		books.add(book1);
		books.add(book2);
		
		System.out.println(books);
		
		if(book1.compareTo(book2) == 0) {
			
		}
		
	}
}
