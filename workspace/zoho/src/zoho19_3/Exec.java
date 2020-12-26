package zoho19_3;

public class Exec {

	public static void main(String[] args) {
		//Memberは抽象クラス
		Member[] members = new Member[3];

		members[0] = new Nomal(30,"佐藤");
		members[1] = new Student(31,"鈴木","E002");
		members[2] = new Employee(32,"田中","山田工業");

		for(Member m:members) {
			System.out.println
			(m.id+"\t|"+m.name+"\t|"+m.kind()+"\t|"+
					m.monthlyPrice+"\t|"+m.payment());
		}
	}

}
