package removeAll;

import java.util.ArrayList;

public class Main2 {
	public static void main(String[] args) {
		ArrayList<Item> list = new ArrayList<>();
		list.add(new Item("AA"));
		list.add(new Item("BB",200));
		list.add(new Item("CC",300));
		list.add(new Item("AA",260));
		list.add(new Item("AA"));

		ArrayList<Item> list2 = new ArrayList<>();
		list2.add(new Item("AA"));

		list.removeAll(list2);
	// listの中からlist2と同じ値を持つものを削除
	// つまり名前がAAのものがすべて削除される。

		for(Item items:list) {
			System.out.println(items.getName()+":"+items.getPrice());
		}
	}
}
