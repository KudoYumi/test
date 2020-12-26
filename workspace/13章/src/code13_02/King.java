package code13_02;

public class King {
	public void talk(Hero h) {
		System.out.println
			("王様:ようこそ勇者" + h.getName() + "よ。");
		/* h.nameだとHeroクラスのnameフィールドがprivate制限かかってるから
		 * アクセスできずエラー。
		 * Heroクラスに制限のかかったnameフィールドへのアクセスが可能なメソッドを作れば、
		 * 制限かかったnameフィールドへのアクセスが可能。
		 *
		 * つまり、他のクラスからでもアクセス可能なgetNameメソッドを仲介に挟めば
		 * nameフィールドへのアクセスが可能。
		 *
		 * 逆に言うと、getNameメソッドもprivate制限つけたら
		 * nameフィールドへのアクセスは不可能。
		 */

		System.out.println
			("王様:長旅疲れただろう");
		System.out.println
			("王様:ではまた会おう");

		/* h.die();
		 * Heroクラスのdieメソッドにprivate制限つけると、
		 * ここで h.die()呼び出してもエラー
		 */

		h.bye();

	}

}
