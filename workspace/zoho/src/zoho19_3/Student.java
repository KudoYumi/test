package zoho19_3;

class Student extends Member{
	private String studentId;

	//コンストラクタ
	Student(int id,String nm,String stId){
		super(id,nm);
		this.studentId=stId;
	}

	//インスタンスメソッド
	public String kind() {
		return "学生会員";
	}

	public int payment() {
		return (int)(monthlyPrice*1.08*0.8);
	}

}
