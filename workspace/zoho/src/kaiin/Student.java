package kaiin;

public class Student extends Nomal{
	String studentId;

	public Student(int id,String nm,String stId) {
		super(id,nm);
		this.studentId = stId;
	}

	public String kind() {
		return "学生会員";
	}

	public int payment() {
		int totalPrice = (int)(super.getMonthPrice()*(1+0.08)*0.8);
		return totalPrice;
	}

	public String getStId() {
		return this.studentId;
	}
}
