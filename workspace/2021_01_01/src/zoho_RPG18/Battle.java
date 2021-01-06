package zoho_RPG18;

import java.util.Scanner;
public class Battle {

	public static void main(String[] args) {
		Human[] players = {new Fighter("鑑三"),
								new Wizard("由美ちゃん"),new Soryo("こじ")};
		Monster m = new Monster(500);
		int select;

		System.out.println("モンスターが現れた！");

		Exit:
		while(m.hp>0) {
			for(Human h:players) {
				System.out.print
				(h.job+h.name+"はどうする？【1:たたかう】【2:まほう】【0:にげる】]>");

				select = new Scanner(System.in).nextInt();

				switch(select) {
				case 0:
					h.run();
					break Exit; //逃げたら戦闘終了

				case 1:
					h.attack(m);
					if(m.hp<=0) {
						System.out.println(h.name+"がモンスターにとどめ刺した");
						break Exit;
					}
					break;

				case 2:
					h.magic(m);
					if(m.hp<=0) {
						System.out.println(h.name+"がモンスターにとどめ刺した");
						break Exit;
					}
					break;
				}
			}
		}

	}

}
