package 黒本9章;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>
								(Arrays.asList(new String[]{"A","B","C"}));

	//	try {
			for(String str:list) {
				list.removeIf(s -> s.equals("B"));
			}
	//	}catch(RuntimeException e) {
			System.out.println(list);
	//	}
  	}
}
