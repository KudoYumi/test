package コレクション;

import java.util.Set;
import java.util.TreeSet;

public class Sample3 {
	public static void main(String[] args) {
		Set<String> colors = new TreeSet<>();

		colors.add("赤");
		colors.add("黄");
		colors.add("青");
		colors.add("赤");

		System.out.println(colors.size());

		for(String s:colors) {
			System.out.println(s);
		}
	}
}
