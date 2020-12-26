package code10_EX;

public class PoisonMatango extends Matango{
	int poisonCount = 5;

	public PoisonMatango(char suffix) {
		super(suffix);
		//すでにMatangoクラスで引数ありのコンストラクタ作ってるからsuper()だとエラー。
	}
	 /*この6~9行目丸ごと削除しちゃうとsuper()引数なしのものが自動生成されちゃうから、
	  *Matangoクラスには引数なしのものはないためにエラー。
	  */


	public void attack(Hero h) {
		super.attack(h);
		int poisonCount = 5;

		if(poisonCount>0) {
			System.out.println("さらに毒胞子ばらまいた");

			int dmg = h.hp/5;
			h.hp -= dmg;
			System.out.println(dmg + "ポイントダメージ");

			this.poisonCount--; //フィールド4行目のpoisonCountが１マイナス。
			// thisは「このクラスのフィールドです」だから、ローカルに入れtらダメ。
		}

	}
}
