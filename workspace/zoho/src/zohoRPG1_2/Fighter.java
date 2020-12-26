package zohoRPG1_2;

class Fighter {
	protected String name;
	protected String job;
	protected int hp;
	protected int dmg;

	Fighter(String name,String job){
		this.name = name;
		this.job = job;
		this.hp = 400;
	}

	void attack(Monster m) {
		dmg = new java.util.Random().nextInt(10)+1;
		System.out.println(name+"の攻撃");

		System.out.println("モンスターに"+dmg+"ダメージ与えた");
		m.hp -= dmg;

		if(m.hp>0) {
			System.out.println("モンスターのHPが"+m.hp+"に減少");
		}else {
			System.out.println("モンスター倒した");
		}
	}


	void run() {
		System.out.println("モンスターから逃げた");
	}


}
