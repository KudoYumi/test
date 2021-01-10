package youtube_equals2;

public class Sample {
	public static void main(String[] args) {
		Item a = new Item(100,"apple");
		Item b = new Item(100,"apple");

		System.out.println(a==b); //異なるインスタンスだからfalse
		System.out.println(a.equals(b));

	/* すべてのクラスのスーパークラス、Objectクラスの
	 * 元々のequalsメソッドの内容により、
	 * オーバーライドしてない状態では、
	 * aとbの参照が同じかどうかの比較演算子となってしまってる。
	 * だからこの状態のequalsメソッドでは、
	 * 同一かどうかの比較になってるから
	 * a.equals(b)はfalse。
	 *
	 * そこできちんとItemクラスのequalsメソッド
	 */
	}
}
