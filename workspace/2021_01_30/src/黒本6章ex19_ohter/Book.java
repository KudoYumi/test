package 黒本6章ex19_ohter;

public class Book {
	String isbn;

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	protected void printInfo() {
		System.out.println(isbn);
	}
}
