package portfolio1;

public class Hero extends TopiaStudent {
	//カプセルフィールド
	private final int maxHp;
	private int comSkill; //コミュ力(攻撃力に影響あり)
	private int damage;   //攻撃力
	private int actualDamage;


	//コンストラクタ(初期値セット用)
	public Hero(String nm,int hp,int maxHp,int cS,int dm) {
		super(hp,nm);
		this.maxHp = maxHp;
		this.comSkill = cS;
		this.damage = dm;
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


	//そもそもこの変数xやtalkメソッドのyが自分自身でない前提。
	public void attack(Hero x) {
	// xのhp>0が必要。
		if(x.hp>0) {
			this.actualDamage = this.damage+(this.comSkill*5);
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
			System.out.println(x.name+"はすでに戦闘不能");
		}
	}


	public void attack(Monster x) {
		if(x.hp>0) {
	//		this.actualDamage = this.damage+(this.comSkill*5);//実際の攻撃力はコミュ力*5の補正。

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
		if(this.hp>0 && y.hp>0) { //hpともに正でないと死んでるから話せない。
			this.comSkill += 10; //コミュ力に上限ないとする。
			System.out.println
				(this.name+"のコミュ力が10上昇して"+this.comSkill+"になった。");
			y.comSkill += 10;
			System.out.println
				(y.name+"のコミュ力も10上昇して"+y.comSkill+"になった。");

		}else if(y.hp<=0) {
			System.out.println(y.name +"は戦闘不能のため話しかけれない");
		}
	}


	//getter setter
	public int getMaxHp() {return this.maxHp;}
//	public void setMaxHp(int maxhp) {this.maxHp = maxhp;}

	public int getCS() {return this.comSkill;}
	public void setCS(int cs) {this.comSkill = cs;}


	public void setDm(int dm) {this.damage = dm;}

	public int getActualDm() {return this.actualDamage;}
}
