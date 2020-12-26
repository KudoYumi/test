package zoho17_01;

class Book {
	private String book_name;
	private String writer;
	private int price;
	private int zaiko;

	//コンストラクタの引数からフィールド変数を初期化
	Book(String book_nm,String writer,int price,int zaiko){
		this.book_name = book_nm;
		this.writer = writer;
		this.price = price;
		this.zaiko = zaiko;
	}


	public void show() {
		System.out.println
		(book_name+"\t:"+writer+"\t:\\"
				+price+"\t:"+zaiko+"\t:\\"+(price*zaiko));
	}

	//これでデータ隠ぺいされたまま値段とかを表示できる

}
