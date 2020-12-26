package zoho19_3;

class Nomal extends Member{

	//コンストラクタ
	Nomal(int id,String nm){
		super(id,nm);
	}

	//オーバーライド実装
	public String kind() {
		return "一般会員";
	}

	public int payment() {
		return (int)(monthlyPrice*1.08);
	}
}
