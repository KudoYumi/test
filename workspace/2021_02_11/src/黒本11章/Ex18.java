package 黒本11章;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex18 {
	public static void main(String[] args) {
		String[] array = {"apple","banana","orange"};

		List<String> list = new ArrayList<>(Arrays.asList(array));

		if(list.removeIf((String s) -> s.length()==5)) {
			System.out.println(list);
		}

		char a = 97;
		char b = (char)123;
		System.out.println(a+",");
		System.out.println(b);
	}
}
