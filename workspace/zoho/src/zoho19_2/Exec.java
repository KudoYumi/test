package zoho19_2;

public class Exec {

	public static void main(String[] args) {
		Member[] members = new Member[3];

		members[0] = new Member(30,"佐藤");
		members[1] = new Student(31,"鈴木","E002");
		members[2] = new Employee(32,"田中","山田工業");

		for(Member m:members) {
			m.show();
		}
	}

}
