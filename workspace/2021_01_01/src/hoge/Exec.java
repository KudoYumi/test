package hoge;

public class Exec {

	public static void main(String[] args) {
		Hero.money = 1000;
		Hero.check(100);

		System.out.println(new Hero("みなと",100).money);
	}

}
