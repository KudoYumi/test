package コレクション;

import java.util.Iterator;
import java.util.LinkedList;

public class Sample5 {
	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<>();

		names.add("aさん");
		names.add("bさん");
		names.add("cさん");
		names.add("dさん");

		for(int i=0; i<names.size(); i++) {
			System.out.print(names.get(i)+" ");
		}
		System.out.println();

		for(String st:names) {
			System.out.print(st+" ");
		}
		System.out.println();

		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}
	}
}
