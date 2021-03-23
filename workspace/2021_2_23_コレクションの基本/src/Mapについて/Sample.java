package Mapについて;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Sample {
	public static void main(String[] args) {
	//都道府県別の人口を管理　キー:都道府県、値:人口
		Map<String,Integer> map = new HashMap<>();

		map.put("東京",14000000);
		map.put("大阪",8800000);
		map.put("福岡",500000);

		map.put("東京",100); // 上書きされてしまう
		System.out.println(map.get("東京")); //100に変更されてる

		System.out.println(map.get("茨城"));//存在しないからnull

		Set<String> prefectures = map.keySet();
		Iterator<String> it = prefectures.iterator();

		while(it.hasNext()) {
			System.out.println(it.next()
					);
		}

	/*	for(String s:prefectures) {
			System.out.println(s);
		} */
	}
}
