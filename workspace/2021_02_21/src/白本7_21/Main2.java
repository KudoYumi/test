package 白本7_21;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		List<Item> list = new ArrayList<Item>();

		list.add(new Item(100,"AA"));
		list.add(new Item(200,"BB"));

		boolean b = list.contains(new Item(500,"AA"));
		System.out.println(b);

		char a = 65;
		System.out.println(a);

		int x = 'Z';
		System.out.println(x);
	}
}
