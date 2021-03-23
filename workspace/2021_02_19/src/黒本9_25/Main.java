package 黒本9_25;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		Sample[] arry = {new Sample(10,"AA"),new Sample(20,"BB"),
							new Sample(30,"CC"),new Sample(10,"DD")};

		List<Sample> list = Arrays.asList(arry);

		Predicate<Sample> x = s -> list.contains(s);

		if(x.test(new Sample(20,"BB7"
				+ ""))) {
			System.out.println("ok");
		}else {
			System.out.println("no");
		}
	}
}
