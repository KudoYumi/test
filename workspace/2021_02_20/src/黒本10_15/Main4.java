package 黒本10_15;

import java.util.Arrays;
import java.util.List;

public class Main4 {
	public static void main(String[] args) {
		String[] array = {"tokyo","nagasaki","mie","nara"};

		List<String> list = Arrays.asList(array);

		list.replaceAll(s -> s.toUpperCase());
		System.out.println(list);
	}
}
