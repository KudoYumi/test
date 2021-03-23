package Listについて;

import java.util.ArrayList;

public class Sample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("X");
		list.add(null);
		list.add("Z");

		System.out.println(list.get(1));

		System.out.println(list.contains("Z"));
		System.out.println(list.contains(null));
	}
}
