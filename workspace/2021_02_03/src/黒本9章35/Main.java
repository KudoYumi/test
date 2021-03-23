package 黒本9章35;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Item> list = new ArrayList<>();

		list.add(new Item("A",100));
		list.add(new Item("B",200));
		list.add(new Item("C",300));
		list.add(new Item("A",200));

		list.remove(new Item("A",200));
		for(Item i:list) {
			System.out.println(i.getName());
		}
	}
}
