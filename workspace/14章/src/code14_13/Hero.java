package code14_13;

public class Hero {
	String name;
	int hp;

	public static int money;


	public static void setRandomMoney() {
		Hero.money = (int)(Math.random()*1000);
	}
}
