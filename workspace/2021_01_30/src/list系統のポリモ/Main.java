package list系統のポリモ;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		ArrayList<S> list = new ArrayList<>();

		A a = new A();
		B b = new B();
		C c = new C();

		list.add(c);
		list.add(b);
		list.add(a);

		for(S s:list) {
			s.run("仁平");
		}
	}
}
