package 白本9_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List list = new ArrayList<>();

		list.add(new Item(100,"A"));
		list.add(1,new Item(200,"B"));
		list.add(new Item(300,"C"));

		System.out.println(list);

		for(Object obj:change(list)) {
			System.out.println(obj+",");
		}
	}

	static List change(List list) {
		Collections.reverse(list);
		return list;
	}
}
