package zohoRPG1_2;

public class Main {

	public static void main(String[] args) {
		Fighter f = new Fighter("山田","戦士");
		Monster m = new Monster(40);
		int select;

		System.out.println("モンスターがあらわれた");

		Exit:
		while(m.hp>0) {
			System.out.print
				(f.job+f.name+"はどうする？[1:たたかう][0:にげる]>");
			select = new java.util.Scanner(System.in).nextInt();

			switch(select) {
				case 1:
					f.attack(m);
					System.out.println();
					break;

				case 0:
					f.run();
					break Exit;
			}
		}
	}

}
