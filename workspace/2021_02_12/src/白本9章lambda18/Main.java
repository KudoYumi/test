package 白本9章lambda18;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		 List<String> list = new ArrayList<String>();
		    list.add("test1");
		    list.add("test2");
		    list.add("answer1");
		    list.add("answer2");

		    list.removeIf(e -> e.startsWith("t"));
		   // test1,test2が削除

		    for(int i = 0;i < list.size();i++) {
		      System.out.println(list.get(i));
		    }
	}
}
