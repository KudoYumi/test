package arrayList1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List05 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		List<Hero> lisT = new LinkedList<Hero>();

		list.add("ハロー");
		list.add("どーも");
		list.add("ざいます");
		for(String str:list) {
			System.out.println(str);
		}//なぜなんも表示されない
		printList(list);

	}

	public static void printList(List<String> list) {
		for(String str:list) {
			System.out.println(str);
		}//なぜなんも表示されない
	}

}
