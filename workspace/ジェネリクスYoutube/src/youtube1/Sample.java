package youtube1;

import java.util.List;

public class Sample {
	public void test(List list) { //このListの中にはStringしかないとすると...
		for(Object obj:list) {
			String str = (String)obj; //Object型からString型へダウンキャスト
			System.out.println(str);
		}
	}
	/* このStringへダウンキャストしてることがバグの温床。
	 * 6行目の引数listは List型だから、すべての型を扱えるコレクション。
	 * だからこの中身がStringかどうかは、
	 * 取り決めた人にしかわからない。
	 */
}
