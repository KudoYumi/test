package rPG_portfolioSimple1;

class Monster implements Creature{
	String name;
	int hp,mp,maxHp,maxMp; //maxMpはこいつ自身の魔力に比例してる
	Magic magic; //魔法使わない敵はここをnullとすればよい
	int Dmg; //こいつの攻撃力

	Monster(String name,int hp,int maxHp,int mp,int maxMp,Magic magic,int Dmg){
		this.name = name;
		this.hp = hp;
		this.maxHp = maxHp;
		this.mp = mp;
		this.maxMp = maxMp;
		this.magic = magic;
		this.Dmg = Dmg;
	}


	void run() {
		System.out.println(name+"が逃げた");
		System.out.println("勝利！！");
	}

	void heal(Monster m) { //どのモンスターを回復するか。1体しか回復できない仕様
		int healPoint = maxMp*recovery; //魔力補正ありの回復量
		int actualRecovery = Math.min(m.maxHp-m.hp, healPoint);//実際の回復量

		m.hp += actualRecovery;
		System.out.println("ケアル"); //魔法の名前表示
		System.out.println(m.name+"のHPが"+actualRecovery+"回復");
	}


	void attack(Player[] players) {
		System.out.println();
	}

}