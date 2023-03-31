package books;
// 7:38 38%
public class Book implements Comparable<Book>{
	private String bookName;
	private String bookType;
	private int year;
	
	public Book(String bookName, String bookType, int year) {
		this.bookName = bookName;
		this.bookType = bookType;
		this.year = year;
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Book name: " + bookName + ", book type:" + bookType + ", year:" + year + ".";
	}
	
	public boolean equals(Book otherBook) {
		boolean areEqual = false;
		if(this.bookName.equalsIgnoreCase(otherBook.getBookName()) && this.year == otherBook.getYear())
			areEqual = true;
		return areEqual;
	}

	@Override
	public int compareTo(Book otherBook) {
		int output = 0;
		if (this.year == otherBook.getYear()) {
			output = 0;
		} else if (this.bookName.equalsIgnoreCase(otherBook.getBookName())) {
			output = 1;
		} else
			output = -1;

		return output;
	}

}
