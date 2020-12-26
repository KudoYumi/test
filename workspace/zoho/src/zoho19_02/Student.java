package zoho19_02;

class Student extends Member{
	private String studentId;


	Student(int id,String name,String studentId){
		super(id,name);
		this.studentId = studentId;
	}

	@Override
	public String kind() {
		return "学生";
	}

	@Override
	public int payment() {
		return (int)(super.getMonthlyPrice()*1.08*0.8);
	}

	public String getStudentId() {
		return studentId;
	}
}
