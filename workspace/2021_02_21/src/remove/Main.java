package remove;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");

	/*	for(int i=0; i<list.size(); i++) {
			if("C".equals(list.get(i))) {
				list.remove(i);
			}
		}
		System.out.println(list);  */

		for(String s:list) {
			if(s.equals("D")) {
				list.add("V");
			}
		}
		System.out.println(list);
	}
}
