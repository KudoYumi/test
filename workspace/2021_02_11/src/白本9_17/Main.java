package 白本9_17;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>(1);

		al.add("a"); al.add(-1,"b"); al.add("c");
		al.add("d");
		System.out.println(al);
	}
}
