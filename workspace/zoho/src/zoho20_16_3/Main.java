package zoho20_16_3;

public class Main {

	public static void main(String[] args) {
		Fighter[] fighters = {new Fighter("山田",100),
							new Fighter("鈴木",90),new Fighter("田中",120)};


		Monster m = new Monster(50);
		int select;

		System.out.println("モンスター現れた");


		Exit:
		while(m.hp>0) {
			for(Fighter f:fighters) {
				System.out.print
				(f.job+f.name+"はどうする[1:戦う][0:逃げる]");

				select = new java.util.Scanner(System.in).nextInt();

				switch(select) {
				case 0:
					f.run();
					break Exit;

				case 1:
					f.attack(m);
					System.out.println("残り"+m.hp);
					System.out.println();

					if(m.hp<=0) {
						break Exit;
					}
				}
			}
		}


		if(m.hp<=0) {
			System.out.println("モンスター倒した");
		}


	}

}
