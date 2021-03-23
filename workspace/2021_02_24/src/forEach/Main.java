package forEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<Item> list = new ArrayList<Item>();

		list.add(new Item(100,"AA"));
		list.add(new Item(200,"BB"));
		list.add(new Item(250,"CC"));

		list.forEach(System.out::println);

	/*	String[] array = {"AAA","BBB","CCC","DDD"};
		Arrays.stream(array).forEach(System.out::println);
	*/

		String[] array = {"AAA","BBB","CCC","DDD"};
		Arrays.stream(array).forEach(s -> System.out.println("hello"+s));

		Integer[] aryI = {100,200,300};
		Arrays.stream(aryI).forEach(System.out::println);
	}
}
