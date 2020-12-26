package zoho18;

class Kakeibo {
	private String date;
	private String name;
	private String kind;
	private String shop_name;
	private int price;


	Kakeibo(String date,String name,String kind,String shop_name,int price){
		this.date = date;
		this.name = name;
		this.kind = kind;
		this.shop_name = shop_name;
		this.price = price;
	}

	public String getDate() {return date;}
	public int getPrice() {return price;}
}
