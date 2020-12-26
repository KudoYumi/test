package zoho17_01;

public class Main {

	public static void main(String[] args) {
		Book[] books = new Book[3];

		books[0] = new Book("三四郎","夏目漱石",400,10);
		books[1] = new Book("舞姫","森鴎外",450,25);
		books[2] = new Book("小春","芥川",500,30);


		for(Book b:books) {
			b.show();
		}
	}

}
