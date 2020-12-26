package zoho20_16_1;


class Hero {
	String name;
	int hp;
	int dmg;

	//コンストラクタで初期値設定
	Hero(String name){
		this.name = name;
		this.hp = 1000;
		this.dmg = new java.util.Random().nextInt(10)+1;
	}

	void attack(Monster m) {
		System.out.println("[たたかう]>");

		this.dmg = new java.util.Random().nextInt(10)+1;
			//dmgの値を更新
		System.out.println
			(name+"はモンスターに"+dmg+"ポイントのダメージ与えた");
		m.hp -= dmg;


		if(m.hp<=0) {
			System.out.println("モンスター倒した");
		}else {
			System.out.println("モンスターのHPが"+m.hp+"になった");
		}
	}
}
