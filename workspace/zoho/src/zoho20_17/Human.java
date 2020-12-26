package zoho20_17;

abstract class Human {
	String name;
	String job;
	int hp;
	int mp;
	double dmg;


	Human(String name,String job,int hp,int mp,double dmg){
		this.name = name;
		this.job = job;
		this.hp = hp;
		this.mp = mp;
		this.dmg = dmg;
	}

	public void attack(Monster m) {}

	public abstract void magic(Monster m);

	public void run() {
		System.out.println("モンスターから逃げた");
	}
}