package 白本9章14;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<A> list = new ArrayList<>();

		list.add(new B());
		list.add(new C());

		for(A a : list) {
			a.foo();
		}
		//bar表示したいならlistは使えない。
		new B().bar();
	}
}
