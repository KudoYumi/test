package zoho20_18;

abstract class Human {
	String name;
	String job;
	int hp;
	int mp;
	double dmg;

	//コンストラクタ
	Human(String name,String job,int hp,int mp,double dmg){
		this.name=name;
		this.job=job;
		this.hp=hp;
		this.mp=mp;
		this.dmg=dmg;
	}



	int actualDmg;

	void attack(Monster m) {
		actualDmg = (int)((new java.util.Random().nextInt(10)+1)*dmg);
		m.hp -= actualDmg;

	}

	abstract void Magic(Monster m);


}
