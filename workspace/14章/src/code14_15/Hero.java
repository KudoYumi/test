package code14_15;

public class Hero {
	static String name = "みなと";
	int hp;
	static int money;


	static void setRandomMoney() {
		Hero.money = (int)(Math.random()*1000);
		System.out.println
			(name + "たちの所持金を初期化しました");
	}
}
