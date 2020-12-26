package zoho19_1;

class Employee extends Nomal{
	private String officeName;

	public Employee(int id,String nm,String officeNm) {
		super(id,nm);
		this.officeName = officeNm;
	}

	public String kind() {
		return "法人会員";
	}

	public int payment() {
		return (int)(monthlyPrice*1.08*0.5);
	}


}
