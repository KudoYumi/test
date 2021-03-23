package ポリモ01;

import com.sample.A;
import com.sample.Factory;

public class Sample {
	public static void main(String[] args) {
		A a = Factory.create();
		a.hello();

	// 使われてる側のコードの定義が一切ない。
	/* 仕様変更出てもこの使ってる側は一切変更なくて済む。
	 * どのクラスのインスタンスが動いてるか
	 * 隠すためにポリモ使ってる。
	 */
		Display d = new Display();
		d.show(a);
	}
}
