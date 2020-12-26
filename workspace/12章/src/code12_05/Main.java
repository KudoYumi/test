package code12_05;

public class Main {

	public static void main(String[] args) {
		Slime s = new Slime();
		Monster m = s;

		s.run();
		m.run();

		s.fireball();
	//	m.fireball();

		/*親クラスと子クラス、どちらにもrunメソッドがあるから、
		 *子クラスのrunメソッドが優先されて表示されたが、
		 *fireballメソッドは子クラスにしかない。
		 *その場合は、親クラス.fireball()　はMonsterクラスにfireballメソッドないからエラー。
		 */

	}

}
