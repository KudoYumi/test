package Setについて;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

		set.add("C");
		set.add("B");
		set.add("A");

		set.add("A"); //無効
		set.add("B"); //無効


	//要素を取得するには
		Iterator<String> it = set.iterator();

		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
