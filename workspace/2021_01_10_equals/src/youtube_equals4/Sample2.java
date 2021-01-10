package youtube_equals4;

public class Sample2 {
	public static void main(String[] args) {

		Integer a = Integer.valueOf(10);
		Integer b = Integer.valueOf(10);

		System.out.println(a==b);
	/* これもコンスタントプールに10が生成され、
	 * そこへの参照がaにもbにも代入されてる。
	 * だからa==bはtrueだが、
	 * Integer型の場合、-128～127までしかコンスタントプールが
	 * きくけど、
	 * それ以外はコンスタントプールきかなくなってくる。
	 */

		Integer x = Integer.valueOf(-129);
		Integer y = Integer.valueOf(-129);
		System.out.println(x==y);
	// 数値が大きすぎてコンスタントプールがきかないためにfalse

		Integer s = Integer.valueOf(128);
		Integer t = Integer.valueOf(128);
		System.out.println(s==t);


	/* ラッパークラスには
	 * できるだけ同じデータを使いまわそうとする
	 * コンスタントプールという機能が
	 * あらかじめコンパイラに備わっている。
	 */
	}
}
