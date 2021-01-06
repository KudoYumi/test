package zoho_RPG18;

abstract class Human {
	String name;
	String job;
	int hp;
	int mp;
	double dmg;

	public Human(String name,String job,int hp,int mp,double dmg) {
		this.name = name;
		this.job = job;
		this.hp = hp;
		this.mp = mp;
		this.dmg = dmg;
	}

	abstract void attack(Monster m);

	abstract void magic(Monster m);

	void run() {
		System.out.println("モンスターから逃げ出した");
	}
}
