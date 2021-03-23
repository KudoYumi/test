package 白本9_14;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<A> list = new ArrayList<A>();

		list.add(new B());
		list.add(new C());

		for(int i=0; i<list.size(); i++) {
			B b = (B)list.get(i); //中の要素をBに変換
			b.foo();
			b.bar();
			System.out.println();
		}


		
	}
}
