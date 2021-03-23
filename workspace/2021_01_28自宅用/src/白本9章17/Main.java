package 白本9章17;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>(10);

		al.add("a");
		al.add(1,"b");
		al.add("c");
		for(String s:al) {
			System.out.println(s);
		}
	}
}
