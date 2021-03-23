package 黒本10_27;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("a");
		list.add("b");
		list.add("c");
		list.add("b");

		if(list.remove("b")) {
			list.remove("c");
		}

		System.out.println(list);
	}
}
