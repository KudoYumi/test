package splitについて;

import java.util.Arrays;
import java.util.List;

public class Main3 {
	public static void main(String[] args) {
		List<String> colors = Arrays.asList("red","blue","green");

		System.out.println(colors);

		for(int i=0; i<colors.size(); i++) {
			System.out.println(colors.get(i).toUpperCase());
		}
	}
}
