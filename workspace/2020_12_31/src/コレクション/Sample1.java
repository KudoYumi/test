package コレクション;

import java.util.ArrayList;
import java.util.Iterator;
public class Sample1 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();

		names.add("たなか");
		names.add("すずき");
		names.add("さいとう");

		for(String str:names) {
			System.out.println(str);
		}

		System.out.println(names.size());

	/*	for(int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		} */

		Iterator<String> it = names.iterator();

		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
