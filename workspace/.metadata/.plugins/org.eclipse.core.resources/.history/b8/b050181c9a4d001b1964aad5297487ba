module Lib {
	exports sample.Lib; //使われる側の設定

	// Lib2は設定してないから非公開

	/* (補足)
	 * パッケージLib2を公開にしてみる。*/
	//  exports sample.Lib2;

	/* 8行目のコードを書けば、
	 * Lib2パッケージは公開となるので、
	 * import sample.Lib2.*;はエラー出ないし、
	 * Helloクラスにもアクセスできるから、
	 * new Hello().say() なども実行できる。
	 */
}