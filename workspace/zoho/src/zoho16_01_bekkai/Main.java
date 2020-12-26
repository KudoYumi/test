package zoho16_01_bekkai;

public class Main {

	public static void main(String[] args) {
		Book[] books = new Book[3];

		books[0] = new Book("三四郎","夏目",400);
		books[1] = new Book("舞姫","森鴎外",450);
		books[2] = new Book("小春","芥川",500);


		for(Book b:books) {
			b.show();
		}

		for(int i=0; i<books.length; i++) {
			books[i].show();
		}
	}

}
