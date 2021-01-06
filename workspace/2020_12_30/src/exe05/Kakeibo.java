package exe05;

class Kakeibo {
	private String date;
	private String name;
	private String kind;
	private String shop_name;
	private int price;


	public Kakeibo(String date,String name,String kind,String shop_name,int price) {
		this.date = date;
		this.name = name;
		this.kind = kind;
		this.shop_name = shop_name;
		this.price = price;
	}

	//インスタンスメソッド
	public void show() {
		System.out.println
			(date+"\t:"+name+"\t:"+kind+"\t:"+shop_name+"\t:"+price);
	}

	public String getDate() {return date;}
	public String getName() {return name;}
	public String getKind() {return kind;}
	public String getShopName() {return shop_name;}
	public int getPrice() {return price;}
}
