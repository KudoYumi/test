package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Sample {
	public static void main(String[] args) {
		Collection<String> list = new ArrayList<String>();

		list.add("A");
		list.add("B");
		list.add("C");

		for(Object obj:list) {
			System.out.println(obj);
		}

		Iterator<String> ite = list.iterator();
		for(Object ob:ite) {
			System.out.println(ob);
		}

		String msg = "str";
		for(Object o:msg) {

		}

		Object o2 = ite; //Iterator型変数はObject型変数に代入可能
		System.out.println(o2);

		Iterable<String> iterable = list;
		Object o = iterable;


		for(Object object:iterable) {
			System.out.println(object);
		}

	/*	while(ite.hasNext()) {
			System.out.print(ite.next());
		}
	*/
		System.out.println("ラムダ式");
		iterable.forEach(s-> { s = s.replace("A","B");
								System.out.println(s); });
	}
}
