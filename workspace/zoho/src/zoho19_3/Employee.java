package zoho19_3;

class Employee extends Member{
	private String officeName;

	//コンストラクタ
	Employee(int id,String nm,String officeNm){
		super(id,nm);
		this.officeName=officeNm;
	}

	//インスタンスメソッド
	public String kind() {
		return "法人会員";
	}

	public int payment() {
		return (int)(monthlyPrice*1.08*0.5);
	}
}
