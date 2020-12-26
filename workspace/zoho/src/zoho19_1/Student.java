package zoho19_1;

class Student extends Nomal{
	private String studentId;

	public Student(int id,String nm,String stId) {
		super(id,nm);
		this.studentId = stId;
	}

	public String kind() {
		return "学生会員";
	}

	public int payment() {  //オーバーライド
		return (int)(monthlyPrice*1.08*0.8);
		/* super.monthlyPriceとしなくていいのは継承のせい？→イエス
		   this.monthlyPriceとしてもここのクラスにないから結果的にsuper.monthlyPrice
		   をみてくれる。*/
	}

	//getter
	public String getStId() {return this.studentId;}
}
