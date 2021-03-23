package removeAll;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
	/*	Item a = new Item("AA",100);
		Item b = new Item("AA",200);

		System.out.println(a.equals(b)); //true
	*/

		ArrayList<Item> list = new ArrayList<>();
		list.add(new Item("AA"));
		list.add(new Item("BB",200));
		list.add(new Item("CC",300));
		list.add(new Item("AA",260));
		list.add(new Item("AA"));

		list.remove(new Item("AA",20));
	// nameが等しいもので一番最初の要素削除

		for(Item items:list) {
			System.out.println(items.getName()+":"+items.getPrice());
		}
	}

}
