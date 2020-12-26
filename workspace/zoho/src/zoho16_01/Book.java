package zoho16_01;

public class Book {
	private String bkName;
	private String name;
	private int price;

	public Book(String bkName,String name,int price) {
		this.bkName = bkName;
		this.name = name;
		this.price = price;
	} //コンストラクタ定義

	public String getBkNm() {
		return this.bkName;
	}
	

	public String getName() {
		return this.name;
	}
	

	public int getPrice() {
		return this.price;
	}
	
}
