package code9_EX1;

public class Main {
	public static int heal(int hp) {
		hp += 10;
		System.out.println(hp);
		return hp;
	}

	public static void heal(Thief th) {
		th.hp += 10;
	}


	public static void main(String[] args) {
		int baseHp = 25; //初期値
		Thief t = new Thief("浅香",baseHp);
	 /* Thiefの２個目のコンストラクタ起動、
	  * これにより、mp=5で初期化、が25で初期化。
	  */
		System.out.println(baseHp + ":" + t.hp);
		int x = heal(baseHp);
		//4行目のメソッド起動。変数baseHpが10加算され35に。→なぜならん！？

		heal(t);//8行目のメソッド起動。t.hpが10加算された。

		System.out.println(x +":"+ t.hp);
	}

}
