package portfolio1;

public class Monster extends TopiaStudent {
	//カプセルフィールド	
	final int maxHp;
	int comSkill; //コミュ力(攻撃力に影響あり)
	int damage;   //攻撃力
	int actualDamage; 

	
	//コンストラクタ(初期値セット用)
	public Monster(String nm,int hp,int maxHp,int cS,int dm) {
		super(hp,nm);
		this.maxHp = maxHp;
		this.comSkill = cS;
		this.damage = dm;
		this.actualDamage = this.damage+(this.comSkill*5);//実際の攻撃力はコミュ力*5の補正。
	}

	
	//実装メソッド
	public int eat() {
		int recover1 = 100; //食事したら100回復
		int recovActual = Math.min(this.maxHp - this.hp, recover1);

		this.hp += recovActual;
		System.out.println(this.name + "は食事して" + recovActual + "回復した。");

		return recovActual;
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
		if(x.hp>0) {
			int realDamage = Math.min(x.getMaxHp(), this.actualDamage);
			x.hp -= realDamage;
			
			System.out.println
				(this.name+"は"+x.name+"に"+realDamage+"与えた");
			
			if(x.hp<=0) {
				System.out.println(x.name+"を倒した");
				x.die();
				System.out.println(this.name+"の勝利");
			}else {
				System.out.println(x.name+"のHPは"+x.hp+"になった"); 
			}
			
		}else {
			x.die();
		}
	}
	
	public void talk(Hero y) { //話しかけた方も話しかけられた方もコミュ力上がるとする。
		if(this.hp>0) { //hp正でないと死んでるから話せない。
			this.comSkill += 10; //コミュ力に上限ないとする。
			System.out.println
				(this.name+"のコミュ力が10上昇して"+this.comSkill+"になった。");
			
		}
	}
		
}
