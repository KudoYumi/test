package ラッパークラス;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Boolean> list1 = new ArrayList<>();

		list1.add(new Boolean(true));
		boolean b = list1.get(0).booleanValue();


		//同様に
		List<Integer> list2 = new ArrayList<>();
		list2.add(new Integer(123));
		int x = list2.get(0).intValue();
		System.out.println(x);


		//自動変換を利用
		List<Integer> num = new ArrayList<>();
		num.add(100); //ボクシング

		int y = num.get(0); //アンボクシング

		//nullが格納されてるときは注意
		//このときはアンボクシングするとNullPo
		num.add(null);
		int z = num.get(1);
	}
}
