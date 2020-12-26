package code16_02;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<String>names = new ArrayList<String>();
		names.add("みなと");
		names.add("あさか");
		names.add("すがわら");

		Iterator<String> it = names.iterator();

		while(it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}



/*		List<String> list1 = new ArrayList<String>();
 * 		はListがArrayListの親クラスだから可能だが、
 * 		HeroがCharavtorを継承してるとき
 * 		List<Charactor> list2 = new LinkedList<Hero>();
 * 		のように　<>内もListのとこも二重多態性関係にするのはエラー。
 */
	}

}
