package コレクション;

import java.util.Set;
import java.util.TreeSet;
public class Sample4 {

	public static void main(String[] args) {
		Set<String> words = new TreeSet<>();
		words.add("dog");
		words.add("panda");
		words.add("cat");

		for(String str:words) {
			System.out.println(str);
		}
	}

}
