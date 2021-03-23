package 黒本9章;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("A");
		list.add(1,null);
		list.add("C");
		list.add("D");

		for(String s:list) {
			System.out.println(s);
		}
	}
}
