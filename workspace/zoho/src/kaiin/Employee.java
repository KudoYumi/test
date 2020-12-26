package kaiin;

public class Employee extends Nomal{
	String officeName;


	//コンストラクタ
	public Employee(int id,String nm,String ofcnm) {
		super(id,nm);
		this.officeName = ofcnm;
	}

	//インスタンスメソッド
	public String kind() {
		return "法人会員";
	}

	public int payment() {
		int totalPrice = (int)(super.getMonthPrice()*(1+0.08)*0.5);
		return totalPrice;
	}

	public String getOfcNm() {
		return this.officeName;
	}
}
