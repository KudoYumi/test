package exe06;

public class Student extends Member {
	private String studentNumber;

	public Student(int id, String name,String studentNumber) {
		super(id, name);
		this.studentNumber=studentNumber;
	}

	/**
	 * @return studentNumber
	 */
	public String getStudentNumber() {
		return studentNumber;
	}

	/**
	 * @param studentNumber セットする studentNumber
	 */
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

}
