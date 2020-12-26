package portfolio1;

public class Monster extends TopiaStudent { //Monsterと話すとHeroのコミュ力が減る
	//カプセルフィールド
	final int maxHp;
	int comSkill; //コミュ力(攻撃力に影響あり)
	int damage;   //攻撃力
	int actualDamage = this.damage+(this.comSkill*5);


	//コンストラクタ(初期値セット用)
	public Monster(String nm,int hp,int maxHp,int cS,int dm) {
		super(hp,nm);
		this.maxHp = maxHp;
		this.comSkill = cS;
		this.damage = dm;
		//実際の攻撃力はコミュ力*5の補正。
	}


	//実装メソッド
	public void eat() {
		int recover1 = 100; //食事したら100回復
		int recovActual = Math.min(this.maxHp - this.hp, recover1);

		this.hp += recovActual;
		System.out.println(this.name + "は食事して" + recovActual + "回復した。");

	}

	//実装メソッド
	public int sleep(int hours) {
		int recover = 300 * hours; //1時間で300回復
		int recovActual = Math.min(this.maxHp - this.hp, recover);
		this.hp += recovActual;

		System.out.println(hours + "時間寝て" + recovActual + "回復した。");
		return recovActual;
	}


	public void attack(Hero x) {
	// xのhp>0が必要。
		if(x.hp>0) {
			System.out.println
			(this.name+"が"+x.name+"に攻撃"+"\n"+this.actualDamage+"与えた");

			if(x.hp>this.actualDamage) {
				x.hp -= this.actualDamage;
				System.out.println(x.name +"のHPが"+ x.hp +"に下がった");
			}else {
				System.out.println(x.name+"を倒した");
				x.die();
				System.out.println(this.name+"の勝利");
			}
		}else { //x.hp<=0のとき
			System.out.println(x.name+"はすでに戦闘不能です");
		}
	}


	public void talk(Hero y) { //話しかけた方も話しかけられた方もコミュ力上がるとする。
		if(this.hp>0) { //hp正でないと死んでるから話せない。
			this.comSkill += 5; //コミュ力に上限ないとする。
			System.out.println
			(this.name+"のコミュ力が10上昇して"+this.comSkill+"になった。");

			int c = y.getCS()-20; // yのコミュ力が20減る
			y.setCS(c);
			System.out.println(y.name+"のコミュ力が20失われた");

			System.out.println(y.name+"のコミュ力は"+y.getCS()+"になった");
		}
	}

}
