package 白本9_14;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<B> list = new ArrayList<>();

		list.add(new B());
		list.add(new C());

		for(A a : list) {
			a.foo();
		}
	}
}
