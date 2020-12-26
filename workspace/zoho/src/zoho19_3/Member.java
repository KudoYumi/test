package zoho19_3;

abstract class Member {
	protected int id;
	protected String name;
	protected final int monthlyPrice;

	//コンストラクタ
	Member(int id,String nm){
		this.id=id;
		this.name=nm;
		this.monthlyPrice=5000;
	}

	//抽象メソッド
	abstract String kind();

	abstract int payment();
}
