package コレクション;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main2 {
	static Collection get() {
		List<String> list = new ArrayList<String>();
		list.add("B");
		list.add("C");
		list.add("A");

		return list;
	}

	public static void main(String[] args) {
		for(Object obj : get()) {
			System.out.println(obj);
		}
	}
}
