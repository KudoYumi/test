package code09_EX;
// text 練習9-2
public class Main {

	public static void heal(int hp) {
		hp += 10;
	}

	public static void heal(Thief thief) {
		thief.hp += 10;
	}



	public static void main(String[] args) {
		int baseHp = 25;
		Thief t = new Thief("あさか",baseHp);
		System.out.println(baseHp + ":" + t.hp);

		heal(baseHp);
		heal(t);
		System.out.println(baseHp + ":" + t.hp);

	}

	//実行結果はなぜか上は25のまま変化してない。
	/* クラス型は参照型なので、heal(Thief thief)では、
	 * 参照先の値をダイレクトに10加えてる。
	 * だから、下のSysoutでは25→35に。
	 *
	 * 一方、heal(int hp)では、基本型のため、
	 * 5~7行目のスコープでhpの値は消滅してる。
	 * もしその値をmainメソッドでも使いたいなら、returnとかする必要あり。
	 */

}
