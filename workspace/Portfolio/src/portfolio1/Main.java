package portfolio1;

public class Main {

	public static void main(String[] args) {
		Hero h1 = new Hero("石原",9000,9000,150,200);
		Hero h2 = new Hero("大西",9999,9999,200,180);
		Hero h3 = new Hero("貝原",4500,4500,200,100);

		Hero h4 = new Hero("鎌田",7000,7000,100,200);
		Hero h5 = new Hero("北川",6000,6000,150,200);
		Hero h6 = new Hero("工藤",4000,4000,250,255);
		Hero h7 = new Hero("小林",9999,9999,70,150);

		Hero h8 = new Hero("白井",3000,3000,100,200);
		Hero h9 = new Hero("田中",3800,3800,200,250);

		Hero h10 = new Hero("畑中",6500,6500,180,200);
		Hero h11 = new Hero("村田",4000,4000,120,100);

		Monster m1 = new Monster("マタンゴ",3500,3500,10,10);



		h5.attack(m1);
		/* なんで22行目と攻撃力変わってないの！？comSkillの変化が反映されてない。
		 * 原因は、フィールドのactualDamageが初期化された値のまま更新されてないから。
		 * attackメソッドにてその値を更新していなかったから。
		*/


	/*	do {
			h1.attack(m1);

		}while(m1.hp>0);
			/*なんで無限ループ？フィールドのHPが変化してない？
			 * 理由→dieメソッド動いたときにフィールドのhpを0にする記述してなかった。
			 */

/*		do {
			h1.attack(h2);
		}while(h2.hp>0);

		h1.attack(m1);
		h1.talk(h2);

		h1.attack(h9); */


	}

}
