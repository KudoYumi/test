package kaiin;

public class Nomal implements Member{
	private int id;
	private String name;
	private int monthlyPrice;

	//コンストラクタ
	public Nomal(int id,String nm) {
		this.id = id;
		this.name = nm;
		this.monthlyPrice = 5000;
	}

	//インスタンスメソッド
	public String kind() {
		return "一般会員";
	}

	public int payment() {
		int totalPrice = (int)(this.monthlyPrice*(1+0.08));
		return totalPrice;
	}


	//Getterメソッド
	public int getId() {return this.id;}

	public String getName() {return this.name;}

	public int getMonthPrice() {return this.monthlyPrice;}

}
