package zoho20_18;

public class Main {

	public static void main(String[] args) {
	//ざっくり言えばみんなHuman
		Human[] heros = new Human[3];

		heros[0] = new Fighter("佐藤");
		heros[1] = new Wizard("鈴木");
		heros[2] = new Soryo("田中");
		Monster m = new Monster(500);

		int select;

		System.out.println("モンスター現る");

		//mp>=10でないとコマンド2を選べない。


		Exit:

		while(m.hp>0) {
			for(Human h:heros) {
				if(h.mp>=10) {
					System.out.println
					(h.job+h.name+"はどうする[1:戦う][2:魔法][0:逃げる]＞");
				}else {
					System.out.println
					(h.job+h.name+"はどうする[1:戦う][0:逃げる]＞");
				}
			}
		}
	}

}
