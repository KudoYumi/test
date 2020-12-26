package zoho20_16_3;

class Fighter { //ざっくり言って全員戦士
	String job;
	String name;
	int Dmg;

	Fighter(String name,int Dmg){
		this.job = "戦士";
		this.name = name;
		this.Dmg = Dmg;
	}


	void attack(Monster m) {
		System.out.println(job+name+"の攻撃");
		Dmg = new java.util.Random().nextInt(10)+1;

		System.out.println("モンスターに"+Dmg+"与えた");
		m.hp -= Dmg;
	}

	void run() {
		System.out.println("モンスターから逃げた");
	}


}
