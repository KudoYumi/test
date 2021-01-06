package hoge;

class Hero {
	static int money;
	String name;
	int hp;

	public Hero(String name,int hp) {
		this.name = name;
		this.hp = hp;
	}

	public static void check(int x) {
		System.out.println("この数字は"+x);
	}
}
