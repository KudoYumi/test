package arrayList1;

import java.util.ArrayList;
import java.util.Iterator;
public class List03 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();

		names.add("おはよう");
		names.add("おはようございます");
		names.add("こんにちは");
		names.add("ハロー");
		names.add("こんばんわ");
		names.add("お疲れ様");

		System.out.println(names.size());
		System.out.println(names.isEmpty());
		System.out.println(names.contains("ハロー"));
		System.out.println(names.indexOf("おはよう"));

		names.remove(3);
	  /*for(String str:names) {
			System.out.println(str);
		}
		System.out.println();*/

		Iterator<String> i = names.iterator();
		while(i.hasNext()) {
			String e = i.next();
			System.out.println(e);
		}


	}

}
