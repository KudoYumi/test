package 質問したいやつ;

public class Main {
	public static void main(String[] args) {
		Object[] objArray = {new B(),new C()};

	//	A[] arrayA = (A[])objArray; //①  ClassCastExcep起きる

		A[] aryA = new A[2];
		aryA[0] = (A)objArray[0];
		aryA[1] = (A)objArray[1];
	/* 要素を一個一個このようにキャストするのと、
	 * ①式は同じ処理をしているように見えるが
	 * 結果的には異なる動きをしてしまってる。
	 *
	 * ①式と何が違うの？
	 * そもそも配列型変数に対して
	 * キャスト式は使ってはいけない。
	 * 
	 * 一度5行目でObject型しか扱わない配列
	 * と宣言してるのに、
	 * ダウンキャストしてるから、本来やってはいけないけど
	 * 文法上は間違ってないからエラー出ないだけ。
	 */
	}
}
