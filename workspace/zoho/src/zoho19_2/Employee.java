package zoho19_2;

class Employee extends Member{
	private String officeName;

	//コンストラクタ
	Employee(int id,String nm,String officeNm){
		super(id,nm);
		this.officeName=officeNm;
	}


	//インスタンスメソッド
	public String kind() {
		return "法人";
	}

	public int payment() {
		return (int)(super.getMonthly()*1.08*0.5);
	}

	/* getter
	public String getOfficeNm(){return officeName;}
	 */
}
