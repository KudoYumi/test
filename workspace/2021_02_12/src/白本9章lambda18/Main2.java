package 白本9章lambda18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		String[] array = {"apple","banana","orange"};
		List<String> list = new ArrayList<String>(Arrays.asList(array));

		if(list.removeIf(s -> s.length()==4)) {
			System.out.println("条件に合うものを削除できました");
			System.out.println(list);
		}else {
			System.out.println("合致するものはないです");
			System.out.println(list);
		}
	}
}
