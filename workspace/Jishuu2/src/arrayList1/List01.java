package arrayList1;

import java.util.ArrayList;

public class List01 {
	public static void main(String[] args) {
		ArrayList<Integer> points = new ArrayList<Integer>();

		points.add(10);
		points.add(80);
		points.add(75);

		for(int i:points) {
			System.out.println(i);
		}

		for(Integer i:points) {
			System.out.println(i);
		}
		// なんでこのiはクラス型変数で出てこないのか
		/* Integer、Stringなどのラッパークラスでは
		 * 自動的にラッパー型からプリミティブ型に変換
		 */
	}

}
