package zoho16_01;

public class Main {

	public static void main(String[] args) {
		Book b[] = new Book[3];

		b[0] = new Book("三四郎","夏目漱石",400);
		b[1] = new Book("舞姫","森鴎外",450);
		b[2] = new Book("小春","芥川龍之介",500);

	// b[i].getBkNm()+"\t"+	b[i].getName()+"\t"+b[i].getPrice()

		for(Book i:b) {
			System.out.println
			 (i.getBkNm()+"\t"+i.getName()+"\t"+i.getPrice());
		}
	}

}
