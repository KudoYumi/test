package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Sample2 {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");

		Iterable<String> iterable = arrayList;

		for(Object obj:iterable) {
			System.out.print(obj);
		}

		Collection<String> collection = (Collection<String>)iterable;

		for(Object obj:collection) {
			
		}
	}
}
