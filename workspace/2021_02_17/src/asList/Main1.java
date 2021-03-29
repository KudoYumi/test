package asList;

import java.util.Arrays;
import java.util.List;

public class Main1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "b", "c");

		list.removeIf((String s) -> s.equals("b"));
		// 要素を追加

	/*	try{
			list.add(0,"A");
		}catch(UnsupportedOperationException e) {
			System.out.println(e);
		}
		System.out.println(list); */
	}
}
