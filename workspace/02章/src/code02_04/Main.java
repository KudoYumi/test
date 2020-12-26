package code02_04;

public class Main {

	public static void main(String[] args) {
		System.out.println("おは"+"よう");

		double a = 10.0;
		double b = 300.0;

		double c = 10;
		double d = 300;

		double s = 10.0;
		int t = 100;

		System.out.println(a/b);
		System.out.println(c/d);
		System.out.println(s/t);


		//毎回上記のように代入してんのダルいから以下でもよい。
		System.out.println(9.0/2);
		//このようにどちらかをdouble型にしておけば出力は少数で出てくる。

		System.out.println(0.1+0.2);
		//この答えが出力のように.00000000004みたいになるのはコンピュータが
		//10進数から2進数に一回直して計算してまた10進数に戻して計算してるから。


		//余りを評価　%演算子
		//数値データのパターン化をしたいときに使用
		//例. 奇数偶数の判定、じゃんけんの勝敗判定など





		int e = 10;
		int f = 300;
		System.out.println(e/f);
		//このように商だけ表示される。


		int g = 2;
		System.out.println(g);
		System.out.println(g+=3);


	}

}
