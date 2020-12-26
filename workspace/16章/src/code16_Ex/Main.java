package code16_Ex;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");

/*		ArrayList<String>names = new ArrayList<String>();
		names.add(h1);
		names.add(h2);
		10~12行目はすべてエラー。
		<>の中がStringになってる。
		7,8行目でh1もh2もHero型変数といってるから、<Hero>にしないといけない。


		ArrayList<String>names = new ArrayList<String>();
		names.add("斎藤");
		names.add("鈴木");
		ならエラー出ない。
*/

		ArrayList<Hero>names = new ArrayList<Hero>();
		names.add(h1);
		names.add(h2);

		for(Hero i:names) {
			System.out.println(i.getName());
		/* System.out.println(i);だけだと、番地しか出力されない。
		 * Heroクラスには、コンストラクタメソッドとgetNameメソッドしかない。
		 * コンストラクタメソッドは自分じゃ呼び出せないのと、
		 * Heroクラスのフィールドがprivate宣言されてるから、
		 * getNameメソッド使うしかない。
		 */

		}
	}

}
