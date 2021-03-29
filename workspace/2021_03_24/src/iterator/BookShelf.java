package iterator;

public class BookShelf implements Aggregate{
	private Book[] books;
	private int last = 0;

	public BookShelf(int size) {
		this.books = new Book[size];
	}

	public Book getBook(int index) {
		return books[index];
	}

	public void appendBook(Book book) {
		this.books[last] = book;
		last++;
	}

	public int getLength() { return this.last; }

	public Iterator iterator() {
		
	}
}
