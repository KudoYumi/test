package 黒本10_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		String[] array = {"apple","banana","orange"};

		List<String> list = new ArrayList<String>(Arrays.asList(array));
		//配列オブジェクトarrayをリストのように見てる

		if(list.removeIf(s -> {return s.length()==5;})){
			System.out.println(list);
		}
		
	}
}
