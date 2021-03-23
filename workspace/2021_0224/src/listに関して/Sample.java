package listに関して;

import java.util.ArrayList;
import java.util.List;

public class Sample {
	public static void main(String[] args) {
		List list = new ArrayList(); //Stringしか扱わないList型
		System.out.println(list.size());

		list.add("A");
		list.add(100);
		list.add("C");
		System.out.println(list.size()); //3つ要素入れた
		showAll(list);
	}

	private static void showAll(List list) {
		for(Object obj : list) {
			String str = (String)obj; //ここで実行時例外
			System.out.print(str);
		}
	/* 12行目でaddしたInteger型の要素をStringにキャストしようとしたため例外
	/*
	 * このようなことを避けるために
	 * ジェネリクスというものがある。
	 *
	 * そうすることで変な型のものを追加されたりするのを防げる。
	 * 
	 */
	}
}
