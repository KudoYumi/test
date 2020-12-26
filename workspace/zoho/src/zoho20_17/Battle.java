package zoho20_17;

public class Battle {

	public static void main(String[] args) {
		Human[] players = new Human[3];
		Monster m = new Monster("キノコ",200);

		players[0] = new Fighter("佐藤");
		players[1] = new Wizard("鈴木");
		players[2] = new Soryo("田中");

		System.out.println("モンスターだ！");


		Exit:
		while(m.hp>0) {
			for(Human h:players) {
				System.out.print
				(h.job+h.name+"はどうする？1:戦う2:魔法0:逃げる>");

				int select = new java.util.Scanner(System.in).nextInt();

				switch(select) {
				case 0:
					h.run();
					break Exit;

				case 1:
					h.attack(m);
					System.out.println();
					if(m.hp<=0) {
						break Exit;
					}
					break;

				case 2:
					h.magic(m);
					System.out.println();
					if(m.hp<=0) {
						break Exit;
					}
					break;
				}
			}
		}


		if(m.hp<=0) {
			System.out.println("倒した");
		}
	}

}
