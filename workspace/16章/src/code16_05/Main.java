package code16_05;
import java.util.Set;
import java.util.TreeSet;


public class Main {

	public static void main(String[] args) {
		Set<String> words = new TreeSet<String>();
		words.add("いぬ");
		words.add("あかちゃん");
		words.add("貝原");
		words.add("工藤");
		words.add("石原");
		words.add("大西");
		words.add("北側");
		words.add("パンごろ");
		words.add("!uj");
		words.add("&ui");
		words.add("**");
		words.add("Ahua");
		words.add("cat");
		words.add("132");

/* TreeSetは決められた順番で表示されるよう定義されたものだが、
 * 自分で作ったクラスでどのような順番で名前とかを表示するとかの定義は、
 * 自身で好きなようにカスタマイズできる。
 */

		for(String s:words) {
			System.out.print(s+"⇒");
		}

	}

}
