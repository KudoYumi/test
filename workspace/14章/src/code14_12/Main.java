package code14_12;

public class Main {

	public static void main(String[] args) {
		// 一人もHero生成してない状態で
		Hero.money = 100;

		System.out.println(Hero.money); //Heroクラスのmoneyフィールドがstaticだから

	}

}
