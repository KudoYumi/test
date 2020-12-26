package zoho19_2;

class Member {
	private int id;
	private String name;
	private int monthlyPrice;

	//コンストラクタ
	Member(int id,String nm){
		this.id=id;
		this.name=nm;
		this.monthlyPrice=5000;
	}


	//インスタンスメソッド
	public String kind() {
		return "一般";
	}

	public int payment() {
		return (int)(monthlyPrice*1.08);
	}


	void show() {
		System.out.println
		(id+"\t|"+name+"\t|"+kind()+
				"\t|"+monthlyPrice+"\t|"+payment());
	}
	//kindもpaymentメソッドもオーバーライドされてる


	int getMonthly() {
		return monthlyPrice;
	}
}
