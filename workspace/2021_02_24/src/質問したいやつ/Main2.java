package 質問したいやつ;

import java.util.Arrays;

public class Main2 {
	public static void main(String[] args) {
	/* すべての配列型変数はObject[]型変数に代入可能とあるが、
	 * 以下はなんでエラーになるのか。
	 */

		X[] aryX = {new B(),new C()};
		Object[] objAry = aryX; //これは代入可能なのに

	//	A[] aryA = aryX; これがエラーのなるのはAとXに関連性ないからわかる

	//  でも以下が例外起きるのは？
	// 	A[] aryA = (A[])aryX; //ClassCast発生

	  	A[] arrayA = new A[2];
	  	arrayA[0] = (A)aryX[0];
	  	arrayA[1] = (A)aryX[1];

	  	for(A a : arrayA) {
	  		a.hoge();
	  	}

	  	Arrays.stream(arrayA).forEach(s -> s.hoge());
	}
}
