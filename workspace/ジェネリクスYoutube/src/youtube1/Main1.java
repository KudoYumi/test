package youtube1;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
	public static void main(String[] args) {

		List list = new ArrayList();
	//これで「コレクション(集合を扱うクラス)」ができた。
	/* これはObject型の参照の集合を扱える。
	 *
	 * すべてのクラスはObjectクラスを継承しているので、
	 * すべてのクラスの参照はObject型で扱える。
	 * つまり上記のコレクションには、なんでも放り込める。
	 *
	 * そこでなんでも放り込める上での問題点を議論。
	 */

		list.add("A");
		list.add("B");
		list.add("C");

		Sample sample = new Sample();
		sample.test(list);
	}
}
