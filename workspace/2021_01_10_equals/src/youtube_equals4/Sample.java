package youtube_equals4;

public class Sample {
	public static void main(String[] args) {

		String a = "hello";

	// 変数aにはStringクラスのインスタンスへの参照が代入されてる。

		String b = "hello";

	//a1とb1は異なるインスタンスへの参照が入ってるのに、、、
		System.out.println(a==b); //なぜかtrueと出る
		System.out.println(a.equals(b));


	// new演算子で生成して比較すると、、、
		String x = new String("Hello");
		String y = new String("Hello");

		System.out.println(x==y);
		System.out.println(x.equals(y));


	/* ""で囲って定義したaとbの場合は、
	 * メインメソッドが実行するタイミングで生成されてるわけではない。
	 *
	 * 「コンスタントプール」にhelloという文字列を生成した。
	 * つまり定数として認識されてる。
	 * aとbは異なるインスタンスに見えるが、
	 * コンスタントプールに生成されたhelloへの参照が
	 * 両方ともに入ってる。
	 * つまり、中身の参照先が等しいため、a==bはtrue。
	 */


	/* 対して、
	 * newでわざわざ定義した場合は
	 * メインメソッドが実行するタイミングで
	 * Stringクラスのインスタンスxとyをヒープ領域に生成し、
	 * 参照先もxとyとで、
	 * 異なる参照先が代入されてる。
	 * そのため、x==yはfalse。
	 */
	}
}
