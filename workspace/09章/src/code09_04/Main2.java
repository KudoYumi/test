package code09_04;
// 9-6
public class Main2 {

	public static void main(String[] args) {
		Hero h1 = new Hero();
		h1.name = "みなと";
		h1.hp = 100;

		Hero h2 = new Hero();
		h2.name = "あさか";
		h2.hp = 105;

		Wizard w = new Wizard();
		w.name = "すがわら";
		w.hp = 50;


		w.heal(h1); //h1を回復させる
		w.heal(h2); //h2を回復させる
		w.heal(h2); //h2を回復させる


		System.out.println(h1.name + "は回復してHPが" + h1.hp + "になった");
		System.out.println(h2.name + "は回復してHPが" + h2.hp + "になった");

		/* 予想
		 * これらの実行はw.hp > 0のもとだから、
		 * もしもw.hp==0なら実行されない、とかそんな流れになりそう。
		 */
	}

}
