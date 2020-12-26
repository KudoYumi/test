package zoho19_2;

class Student extends Member{
	private String studentId;

	//コンストラクタ
	Student(int id,String nm,String stId){
		super(id,nm);
		this.studentId=stId;
	}

	//オーバーライド
	public String kind() {
		return "学生";
	}

	public int payment() {
		return (int)(super.getMonthly()*1.08*0.8);
	}

	/* getter
	public String getStId(){return studentId;}
	 */
}
