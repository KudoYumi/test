package code10_Ex;

public class PoisonMatango extends Matango{
	int poisonCnt;

	public PoisonMatango(char nm) {
		super(nm);
		this.poisonCnt = 5;
	}

	public void attack(Hero h) {
		super.attack(h); //①

		if(this.poisonCnt>0) { //②
			System.out.println("さらに毒胞子ばらまいた"); //③

			int damage = (h.hp)/5;
			h.hp -= damage;
			System.out.println
				(h.name +"に"+ damage +"ポイントのダメージ"); //④

			System.out.println
				(h.name +"のHPが" +h.hp+ "になった");

			this.poisonCnt--;  //⑤
		}
	}
}
