package exe06;

public class ExMember {
	public static void main(String[] args) {
		Student stmen = new Student(100,"田中","E01");

		Member men = stmen;

	//	System.out.println(men.getStudentNumber());エラー
	}
}
