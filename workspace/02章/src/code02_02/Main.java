package code02_02;

public class Main {

	public static void main(String[] args) {
		//エスケープシーケンスについて

		//対処法①　エスケープシーケンスを使用
		System.out.println("私の好きな記号は二重引用符(\")です");
		//この\は出力の文字
		//このようにプログラミングで使用する文字を使用したい場合、\をつけて使用。



		//対処法②　または全角の”を使用してもよい。
		System.out.println("私の好きな記号は二重引用符(”)です");
		//これなら\がいらない。

		System.out.println("私が好きな記号は￥です");

		System.out.println("\\1000ちょうだい");
		System.out.println("1000ちょうだい");


		//自分なりの応用例
		System.out.println("好きな記号は\"\"です");



		//注.世界的には\ではなく、バックスラッシュを標準
		//プログラム上は同じ文字コードだけど、違いは意識しておく。




	}

}
