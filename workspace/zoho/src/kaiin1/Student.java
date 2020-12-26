package kaiin1;

public class Student extends Member{
	protected String studentId;

	public Student(int id,String name,String stId) {
		super(id,name);
		this.studentId = stId;
	}

	public int payment() {
		return (int)(this.monthlyPrice*1.08*0.8);
	}

	public String getStId() {
		return this.studentId;
	}
}
