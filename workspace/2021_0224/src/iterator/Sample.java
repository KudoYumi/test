package iterator;

import java.util.Iterator;
import java.util.List;

public class Sample {
	public static void main(String[] args) {

		List<String> list = List.of("A","B","C");

		Iterator<String> ite = list.iterator();

		while(ite.hasNext()) {
			System.out.println(ite.next());
		}

	}
}
