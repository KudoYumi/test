package コレクション;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("C");
		list.add("B");

		for(Object obj : rev(list)) {
			System.out.println(obj);
		}
	}

	static List rev(List list) {
		Collections.reverse(list);
		return list;
	}
}
