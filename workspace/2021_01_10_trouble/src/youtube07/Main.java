package youtube07;

public class Main {
	public static void main(String[] args) {

		Sam sample = new Sam();
		sample.test(null);

	/* Samクラスの定義により、
	 * testメソッドにnullを引数として渡すと、
	 * 例外クラスのインスタンス、報告書が生成されて、
	 * そのインスタンスへの参照がthrowされてくる。
	 * これできちんと実行すると例外がthrowされてくることがわかる。
	 *
	 * ここでさらにtry-catch文を記述する。→Main2へ
	 */
	}
}
