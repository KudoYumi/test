package zoho19_1;

public class Exec {

	public static void main(String[] args) {
		Nomal[] members = new Nomal[3];

		members[0] = new Nomal(30,"佐藤");
		members[1] = new Student(31,"鈴木","E002");
		members[2] = new Employee(32,"田中","山田工業");

		for(int i=0; i<members.length; i++) {
			System.out.println
			(members[i].id+"\t|"+members[i].name+"\t|"+
					members[i].kind()+"\t"+members[i].monthlyPrice+
						"\t|"+members[i].payment());
		}

		System.out.println();
		for(Nomal m:members) {
			System.out.println
			(m.id+"\t"+m.name+"\t"+m.kind()+m.monthlyPrice+"\t"+m.payment());
		}
	}

}
