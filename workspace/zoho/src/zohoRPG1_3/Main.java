package zohoRPG1_3;

public class Main {

	public static void main(String[] args) {
		int num;

		Fighter[] fight =
			{new Fighter("山田",250),
					new Fighter("鈴木",200),
						new Fighter("田中",280)};

		Monster m = new Monster(50);


		System.out.println("モンスター現れた");


		exit:
		while(m.hp>0){
			for(Fighter f:fight) {
				System.out.print(f.job+f.name+"はどうする？[1:戦う][0:逃げる]>");
				num = new java.util.Scanner(System.in).nextInt();

				switch(num) {
				case 1:
					f.attack(m);
					break;

				case 0:
					f.run();
					break exit;
				}
			}

		}

	}

}
