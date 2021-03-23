package 白本9_14;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<A> list = new ArrayList<>();
		list.add(new C());
		list.add(new B());

		for(A a : list) {
			a.foo();

			((B)a).bar();
		}
	}
}
