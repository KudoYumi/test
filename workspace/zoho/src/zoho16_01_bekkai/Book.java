package zoho16_01_bekkai;

class Book {
	private String book_name;
	private String writer;
	private int price;

	Book(String book_name,String writer,int price){
		this.book_name = book_name;
		this.writer = writer;
		this.price = price;
	}

	void show() {
		System.out.println
			(book_name+"\t:"+writer+"\t:\\"+price);
	//this.省略
	}
}
