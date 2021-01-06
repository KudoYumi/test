package youtubeラムダの話7main;

import youtubeラムダの話7.Test;

public class Main2 { //Main1でラムダ式を用いたver

	public static void main(String[] args) {
		Test test = new Test();
		test.process(() -> {
			System.out.println("hello with Lambda");
		});
	}
	/* 関数型インタフェースSample型のsampleに対して
	 * 上記のようにラムダ式を渡す。
	 */

}
