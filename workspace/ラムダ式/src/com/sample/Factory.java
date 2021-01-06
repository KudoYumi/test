package com.sample;

public class Factory {
	public static Sample create() {
		return new SampleImpl();
	}
	/* こういうメソッドを定義することで
	 * SampleImplのインスタンスへの参照が
	 * Sample型で戻ってくる。
	 *
	 * こうすることで使う側のMainクラスのコードから
	 * 実際に動作するSampleImplの内容を消すことができる。
	 * (情報隠ぺいの原則の一つ)
	 */


}
